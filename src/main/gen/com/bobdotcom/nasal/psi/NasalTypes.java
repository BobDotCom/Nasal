// This is a generated file. Not intended for manual editing.
package com.bobdotcom.nasal.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.bobdotcom.nasal.psi.impl.*;

public interface NasalTypes {

  IElementType ASSIGN_VAR = new NasalElementType("ASSIGN_VAR");
  IElementType EXPRESSION = new NasalElementType("EXPRESSION");
  IElementType EXPRESSION_0 = new NasalElementType("EXPRESSION_0");
  IElementType EXPRESSION_1 = new NasalElementType("EXPRESSION_1");
  IElementType EXPRESSION_10 = new NasalElementType("EXPRESSION_10");
  IElementType EXPRESSION_11 = new NasalElementType("EXPRESSION_11");
  IElementType EXPRESSION_12 = new NasalElementType("EXPRESSION_12");
  IElementType EXPRESSION_13 = new NasalElementType("EXPRESSION_13");
  IElementType EXPRESSION_14 = new NasalElementType("EXPRESSION_14");
  IElementType EXPRESSION_15 = new NasalElementType("EXPRESSION_15");
  IElementType EXPRESSION_16 = new NasalElementType("EXPRESSION_16");
  IElementType EXPRESSION_17 = new NasalElementType("EXPRESSION_17");
  IElementType EXPRESSION_2 = new NasalElementType("EXPRESSION_2");
  IElementType EXPRESSION_3 = new NasalElementType("EXPRESSION_3");
  IElementType EXPRESSION_4 = new NasalElementType("EXPRESSION_4");
  IElementType EXPRESSION_5 = new NasalElementType("EXPRESSION_5");
  IElementType EXPRESSION_6 = new NasalElementType("EXPRESSION_6");
  IElementType EXPRESSION_7 = new NasalElementType("EXPRESSION_7");
  IElementType EXPRESSION_8 = new NasalElementType("EXPRESSION_8");
  IElementType EXPRESSION_9 = new NasalElementType("EXPRESSION_9");
  IElementType EXPRESSION_NO_SEMI = new NasalElementType("EXPRESSION_NO_SEMI");
  IElementType FOREACH_EXPR = new NasalElementType("FOREACH_EXPR");
  IElementType FORINDEX_EXPR = new NasalElementType("FORINDEX_EXPR");
  IElementType FOR_EXPR = new NasalElementType("FOR_EXPR");
  IElementType FULL_EXPRESSION = new NasalElementType("FULL_EXPRESSION");
  IElementType FUNCTION = new NasalElementType("FUNCTION");
  IElementType FUNCTION_VAR = new NasalElementType("FUNCTION_VAR");
  IElementType IF_EXPR = new NasalElementType("IF_EXPR");
  IElementType NEW_LAYER = new NasalElementType("NEW_LAYER");
  IElementType WHILE_EXPR = new NasalElementType("WHILE_EXPR");

  IElementType AND = new NasalTokenType("AND");
  IElementType ASSIGN = new NasalTokenType("ASSIGN");
  IElementType BIT_AND = new NasalTokenType("BIT_AND");
  IElementType BIT_ANDEQ = new NasalTokenType("BIT_ANDEQ");
  IElementType BIT_NEG = new NasalTokenType("BIT_NEG");
  IElementType BIT_OR = new NasalTokenType("BIT_OR");
  IElementType BIT_OREQ = new NasalTokenType("BIT_OREQ");
  IElementType BIT_XOR = new NasalTokenType("BIT_XOR");
  IElementType BIT_XOREQ = new NasalTokenType("BIT_XOREQ");
  IElementType BREAK = new NasalTokenType("BREAK");
  IElementType CAT = new NasalTokenType("CAT");
  IElementType CATEQ = new NasalTokenType("CATEQ");
  IElementType CHAR_CONST = new NasalTokenType("CHAR_CONST");
  IElementType COLON = new NasalTokenType("COLON");
  IElementType COMMA = new NasalTokenType("COMMA");
  IElementType COMMENT = new NasalTokenType("COMMENT");
  IElementType CONTINUE = new NasalTokenType("CONTINUE");
  IElementType DIV = new NasalTokenType("DIV");
  IElementType DIVEQ = new NasalTokenType("DIVEQ");
  IElementType DOT = new NasalTokenType("DOT");
  IElementType ELLIPSIS = new NasalTokenType("ELLIPSIS");
  IElementType ELSE = new NasalTokenType("ELSE");
  IElementType ELSIF = new NasalTokenType("ELSIF");
  IElementType EQ = new NasalTokenType("EQ");
  IElementType FOR = new NasalTokenType("FOR");
  IElementType FOREACH = new NasalTokenType("FOREACH");
  IElementType FORINDEX = new NasalTokenType("FORINDEX");
  IElementType FUNC = new NasalTokenType("FUNC");
  IElementType GT = new NasalTokenType("GT");
  IElementType GTE = new NasalTokenType("GTE");
  IElementType IDENTIFIER = new NasalTokenType("IDENTIFIER");
  IElementType IF = new NasalTokenType("IF");
  IElementType LBRA = new NasalTokenType("LBRA");
  IElementType LBRACE = new NasalTokenType("LBRACE");
  IElementType LPAR = new NasalTokenType("LPAR");
  IElementType LT = new NasalTokenType("LT");
  IElementType LTE = new NasalTokenType("LTE");
  IElementType MINUS = new NasalTokenType("MINUS");
  IElementType MINUSEQ = new NasalTokenType("MINUSEQ");
  IElementType MUL = new NasalTokenType("MUL");
  IElementType MULEQ = new NasalTokenType("MULEQ");
  IElementType NEG = new NasalTokenType("NEG");
  IElementType NEQ = new NasalTokenType("NEQ");
  IElementType NIL = new NasalTokenType("NIL");
  IElementType NOT = new NasalTokenType("NOT");
  IElementType NULL_ACCESS = new NasalTokenType("NULL_ACCESS");
  IElementType NULL_CHAIN = new NasalTokenType("NULL_CHAIN");
  IElementType NUMBER = new NasalTokenType("NUMBER");
  IElementType OR = new NasalTokenType("OR");
  IElementType PLUS = new NasalTokenType("PLUS");
  IElementType PLUSEQ = new NasalTokenType("PLUSEQ");
  IElementType QUESTION = new NasalTokenType("QUESTION");
  IElementType RBRA = new NasalTokenType("RBRA");
  IElementType RBRACE = new NasalTokenType("RBRACE");
  IElementType RETURN = new NasalTokenType("RETURN");
  IElementType RPAR = new NasalTokenType("RPAR");
  IElementType SEMI = new NasalTokenType("SEMI");
  IElementType SPECIAL = new NasalTokenType("SPECIAL");
  IElementType STRING = new NasalTokenType("STRING");
  IElementType TYPE = new NasalTokenType("TYPE");
  IElementType VAR = new NasalTokenType("VAR");
  IElementType WHILE = new NasalTokenType("WHILE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGN_VAR) {
        return new NasalAssignVarImpl(node);
      }
      else if (type == EXPRESSION) {
        return new NasalExpressionImpl(node);
      }
      else if (type == EXPRESSION_0) {
        return new NasalExpression0Impl(node);
      }
      else if (type == EXPRESSION_1) {
        return new NasalExpression1Impl(node);
      }
      else if (type == EXPRESSION_10) {
        return new NasalExpression10Impl(node);
      }
      else if (type == EXPRESSION_11) {
        return new NasalExpression11Impl(node);
      }
      else if (type == EXPRESSION_12) {
        return new NasalExpression12Impl(node);
      }
      else if (type == EXPRESSION_13) {
        return new NasalExpression13Impl(node);
      }
      else if (type == EXPRESSION_14) {
        return new NasalExpression14Impl(node);
      }
      else if (type == EXPRESSION_15) {
        return new NasalExpression15Impl(node);
      }
      else if (type == EXPRESSION_16) {
        return new NasalExpression16Impl(node);
      }
      else if (type == EXPRESSION_17) {
        return new NasalExpression17Impl(node);
      }
      else if (type == EXPRESSION_2) {
        return new NasalExpression2Impl(node);
      }
      else if (type == EXPRESSION_3) {
        return new NasalExpression3Impl(node);
      }
      else if (type == EXPRESSION_4) {
        return new NasalExpression4Impl(node);
      }
      else if (type == EXPRESSION_5) {
        return new NasalExpression5Impl(node);
      }
      else if (type == EXPRESSION_6) {
        return new NasalExpression6Impl(node);
      }
      else if (type == EXPRESSION_7) {
        return new NasalExpression7Impl(node);
      }
      else if (type == EXPRESSION_8) {
        return new NasalExpression8Impl(node);
      }
      else if (type == EXPRESSION_9) {
        return new NasalExpression9Impl(node);
      }
      else if (type == EXPRESSION_NO_SEMI) {
        return new NasalExpressionNoSemiImpl(node);
      }
      else if (type == FOREACH_EXPR) {
        return new NasalForeachExprImpl(node);
      }
      else if (type == FORINDEX_EXPR) {
        return new NasalForindexExprImpl(node);
      }
      else if (type == FOR_EXPR) {
        return new NasalForExprImpl(node);
      }
      else if (type == FULL_EXPRESSION) {
        return new NasalFullExpressionImpl(node);
      }
      else if (type == FUNCTION) {
        return new NasalFunctionImpl(node);
      }
      else if (type == FUNCTION_VAR) {
        return new NasalFunctionVarImpl(node);
      }
      else if (type == IF_EXPR) {
        return new NasalIfExprImpl(node);
      }
      else if (type == NEW_LAYER) {
        return new NasalNewLayerImpl(node);
      }
      else if (type == WHILE_EXPR) {
        return new NasalWhileExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
