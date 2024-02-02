// This is a generated file. Not intended for manual editing.
package com.bobdotcom.nasal.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NasalExpressionNoSemi extends PsiElement {

  @Nullable
  NasalForExpr getForExpr();

  @Nullable
  NasalForeachExpr getForeachExpr();

  @Nullable
  NasalForindexExpr getForindexExpr();

  @Nullable
  NasalIfExpr getIfExpr();

  @Nullable
  NasalWhileExpr getWhileExpr();

}
