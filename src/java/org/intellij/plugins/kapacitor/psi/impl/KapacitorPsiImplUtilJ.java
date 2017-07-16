/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.plugins.kapacitor.psi.impl;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.plugins.kapacitor.psi.KapacitorBinaryExpression;
import org.intellij.plugins.kapacitor.psi.KapacitorDeclaration;
import org.intellij.plugins.kapacitor.psi.KapacitorIdentifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class KapacitorPsiImplUtilJ {

  @NotNull
  public static KapacitorIdentifier getVariable(KapacitorDeclaration declaration) {
    List<KapacitorIdentifier> p1 = PsiTreeUtil.getChildrenOfTypeAsList(declaration, KapacitorIdentifier.class);
    return p1.get(0);
  }

  @NotNull
  public static IElementType getOperationSign(KapacitorBinaryExpression expression) {
    return expression.getNode().getFirstChildNode().getTreeNext().getElementType();
  }
}
