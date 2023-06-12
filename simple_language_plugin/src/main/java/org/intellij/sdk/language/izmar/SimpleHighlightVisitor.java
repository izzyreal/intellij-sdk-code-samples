package org.intellij.sdk.language.izmar;

import com.intellij.codeInsight.daemon.impl.HighlightVisitor;
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class SimpleHighlightVisitor implements HighlightVisitor {

    private Integer analyzeCounter = 0;

    @Override
    public boolean suitableForFile(@NotNull PsiFile file) {
        return file.getFileType().getName().equalsIgnoreCase("Simple File");
    }

    @Override
    public void visit(@NotNull PsiElement element) {
        System.out.println("HighlightVisitor#visit");
    }

    @Override
    public boolean analyze(@NotNull PsiFile file, boolean updateWholeFile, @NotNull HighlightInfoHolder holder, @NotNull Runnable action) {
        System.out.println("HighlightVisitor#analyze " + analyzeCounter.toString());
        analyzeCounter++;
        return true;
    }

    @Override
    public @NotNull HighlightVisitor clone() {
        return new SimpleHighlightVisitor();
    }
}
