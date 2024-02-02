// This is a generated file. Not intended for manual editing.
package com.bobdotcom.nasal.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.bobdotcom.nasal.psi.NasalTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.bobdotcom.nasal.psi.*;

public class NasalExpression3Impl extends ASTWrapperPsiElement implements NasalExpression3 {

  public NasalExpression3Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NasalVisitor visitor) {
    visitor.visitExpression3(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NasalVisitor) accept((NasalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NasalExpression4> getExpression4List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NasalExpression4.class);
  }

}
