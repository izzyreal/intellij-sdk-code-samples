package org.intellij.sdk.language.izmar;

import com.intellij.codeHighlighting.TextEditorHighlightingPass;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class SimpleHighlightingPass extends TextEditorHighlightingPass {
    SimpleHighlightingPass(@NotNull Project project, @NotNull Document document, boolean runIntentionPassAfter) {
        super(project, document, runIntentionPassAfter);
    }

    SimpleHighlightingPass(@NotNull Project project, @NotNull Document document) {
        super(project, document);
    }

    @Override
    public void doCollectInformation(@NotNull ProgressIndicator progress) {
        System.out.println("TextEditorHighlightingPass#doCollectInformation");
    }

    @Override
    public void doApplyInformationToEditor() {
        System.out.println("TextEditorHighlightingPass#doApplyInformationToEditor");
    }
}
