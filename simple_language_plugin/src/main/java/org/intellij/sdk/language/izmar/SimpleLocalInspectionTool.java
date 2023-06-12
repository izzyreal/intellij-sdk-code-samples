package org.intellij.sdk.language.izmar;

import com.intellij.codeInspection.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SimpleLocalInspectionTool extends LocalInspectionTool {

    @Override
    public boolean runForWholeFile() {
        System.out.println("LocalInspectionTool#runForWholeFile");
        return true;
    }

    @Override
    public ProblemDescriptor @Nullable [] checkFile(@NotNull PsiFile file, @NotNull InspectionManager manager, boolean isOnTheFly) {
        System.out.println("LocalInspectionTool#collectInformation");
        return super.checkFile(file, manager, isOnTheFly);
    }

    @Override
    public @NotNull PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly, @NotNull LocalInspectionToolSession session) {
        System.out.println("LocalInspectionTool#buildVisitor(holder, onTheFly, session)");
        return super.buildVisitor(holder, isOnTheFly, session);
    }

    @Override
    public @NotNull PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) {
        System.out.println("LocalInspectionTool#buildVisitor(holder, onTheFly)");
        return super.buildVisitor(holder, isOnTheFly);
    }

    @Override
    public @Nullable PsiNamedElement getProblemElement(@NotNull PsiElement psiElement) {
        System.out.println("LocalInspectionTool#getProblemElement");
        return super.getProblemElement(psiElement);
    }

    @Override
    public void inspectionStarted(@NotNull LocalInspectionToolSession session, boolean isOnTheFly) {
        System.out.println("LocalInspectionTool#inspectionStarted");
        super.inspectionStarted(session, isOnTheFly);
    }

    @Override
    public void inspectionFinished(@NotNull LocalInspectionToolSession session, @NotNull ProblemsHolder problemsHolder) {
        System.out.println("LocalInspectionTool#inspectionFinished");
        super.inspectionFinished(session, problemsHolder);
    }

    @Override
    public @NotNull List<ProblemDescriptor> processFile(@NotNull PsiFile file, @NotNull InspectionManager manager) {
        System.out.println("LocalInspectionTool#processFile");
        return super.processFile(file, manager);
    }
}
