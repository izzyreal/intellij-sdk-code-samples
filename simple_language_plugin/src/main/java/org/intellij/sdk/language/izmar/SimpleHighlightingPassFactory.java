package org.intellij.sdk.language.izmar;

import com.intellij.codeHighlighting.*;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class SimpleHighlightingPassFactory implements TextEditorHighlightingPassFactory, TextEditorHighlightingPassFactoryRegistrar {
    @Override
    public @Nullable TextEditorHighlightingPass createHighlightingPass(@NotNull PsiFile file, @NotNull Editor editor) {
        return new SimpleHighlightingPass(Objects.requireNonNull(editor.getProject()), editor.getDocument());
    }

    @Override
    public void registerHighlightingPassFactory(@NotNull TextEditorHighlightingPassRegistrar registrar, @NotNull Project project) {
        registrar.registerTextEditorHighlightingPass(this, new int[]{Pass.UPDATE_ALL}, null, false, -1);
    }
}
