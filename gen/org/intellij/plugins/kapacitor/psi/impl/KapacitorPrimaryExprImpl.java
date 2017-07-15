// This is a generated file. Not intended for manual editing.
package org.intellij.plugins.kapacitor.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.plugins.kapacitor.KapacitorElementTypes.*;
import org.intellij.plugins.kapacitor.psi.*;

public class KapacitorPrimaryExprImpl extends KapacitorExpressionImpl implements KapacitorPrimaryExpr {

  public KapacitorPrimaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KapacitorElementVisitor visitor) {
    visitor.visitPrimaryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KapacitorElementVisitor) accept((KapacitorElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KapacitorPrimaryFunc> getPrimaryFuncList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KapacitorPrimaryFunc.class);
  }

  @Override
  @NotNull
  public List<KapacitorIdentifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KapacitorIdentifier.class);
  }

  @Override
  @NotNull
  public List<KapacitorPrimaryExpr> getPrimaryExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KapacitorPrimaryExpr.class);
  }

  @Override
  @NotNull
  public List<KapacitorPrimaryUnaryExpr> getPrimaryUnaryExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KapacitorPrimaryUnaryExpr.class);
  }

}