// This is a generated file. Not intended for manual editing.
package com.bobdotcom.nasal.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.bobdotcom.nasal.psi.NasalTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NasalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return nasalFile(b, l + 1);
  }

  /* ********************************************************** */
  // expression4 ASSIGN expression0
  public static boolean assign_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_VAR, "<assign var>");
    r = expression4(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression0?
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    expression0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // (
  // //    (expression1 (SEMI|COMMA))* expression1
  //     expression1
  // )
  public static boolean expression0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_0, "<expression 0>");
    r = expression1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (
  // //    expression2 (ELLIPSIS expression0?)*
  //     expression2
  // )
  public static boolean expression1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_1, "<expression 1>");
    r = expression2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression11 (OR expression11)*
  public static boolean expression10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression10")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_10, "<expression 10>");
    r = expression11(b, l + 1);
    r = r && expression10_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OR expression11)*
  private static boolean expression10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression10_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression10_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression10_1", c)) break;
    }
    return true;
  }

  // OR expression11
  private static boolean expression10_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression10_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && expression11(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression12 (AND expression12)*
  public static boolean expression11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression11")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_11, "<expression 11>");
    r = expression12(b, l + 1);
    r = r && expression11_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (AND expression12)*
  private static boolean expression11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression11_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression11_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression11_1", c)) break;
    }
    return true;
  }

  // AND expression12
  private static boolean expression11_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression11_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && expression12(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression13 ((EQ|NEQ) expression13)*
  public static boolean expression12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression12")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_12, "<expression 12>");
    r = expression13(b, l + 1);
    r = r && expression12_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((EQ|NEQ) expression13)*
  private static boolean expression12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression12_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression12_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression12_1", c)) break;
    }
    return true;
  }

  // (EQ|NEQ) expression13
  private static boolean expression12_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression12_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression12_1_0_0(b, l + 1);
    r = r && expression13(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQ|NEQ
  private static boolean expression12_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression12_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NEQ);
    return r;
  }

  /* ********************************************************** */
  // expression14 ((LT|LTE|GT|GTE) expression14)*
  public static boolean expression13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression13")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_13, "<expression 13>");
    r = expression14(b, l + 1);
    r = r && expression13_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((LT|LTE|GT|GTE) expression14)*
  private static boolean expression13_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression13_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression13_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression13_1", c)) break;
    }
    return true;
  }

  // (LT|LTE|GT|GTE) expression14
  private static boolean expression13_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression13_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression13_1_0_0(b, l + 1);
    r = r && expression14(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LT|LTE|GT|GTE
  private static boolean expression13_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression13_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, LTE);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, GTE);
    return r;
  }

  /* ********************************************************** */
  // expression15 ((PLUS|MINUS|CAT) expression15)*
  public static boolean expression14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression14")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_14, "<expression 14>");
    r = expression15(b, l + 1);
    r = r && expression14_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((PLUS|MINUS|CAT) expression15)*
  private static boolean expression14_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression14_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression14_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression14_1", c)) break;
    }
    return true;
  }

  // (PLUS|MINUS|CAT) expression15
  private static boolean expression14_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression14_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression14_1_0_0(b, l + 1);
    r = r && expression15(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS|MINUS|CAT
  private static boolean expression14_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression14_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, CAT);
    return r;
  }

  /* ********************************************************** */
  // expression16 ((MUL|DIV) expression16)*
  public static boolean expression15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression15")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_15, "<expression 15>");
    r = expression16(b, l + 1);
    r = r && expression15_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((MUL|DIV) expression16)*
  private static boolean expression15_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression15_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression15_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression15_1", c)) break;
    }
    return true;
  }

  // (MUL|DIV) expression16
  private static boolean expression15_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression15_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression15_1_0_0(b, l + 1);
    r = r && expression16(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MUL|DIV
  private static boolean expression15_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression15_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    return r;
  }

  /* ********************************************************** */
  // (MINUS|NEG|NOT|CAT|BIT_NEG)* expression17
  public static boolean expression16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression16")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_16, "<expression 16>");
    r = expression16_0(b, l + 1);
    r = r && expression17(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (MINUS|NEG|NOT|CAT|BIT_NEG)*
  private static boolean expression16_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression16_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression16_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression16_0", c)) break;
    }
    return true;
  }

  // MINUS|NEG|NOT|CAT|BIT_NEG
  private static boolean expression16_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression16_0_0")) return false;
    boolean r;
    r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, NEG);
    if (!r) r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, CAT);
    if (!r) r = consumeToken(b, BIT_NEG);
    return r;
  }

  /* ********************************************************** */
  // expression_base (
  //         LPAR (expression0 COMMA)* expression0? RPAR |  // Function call
  //         LBRA (expression0 COMMA)* expression0? RBRA |  // Lookup
  //         (DOT|NULL_ACCESS) expression_base
  //         )*
  public static boolean expression17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_17, "<expression 17>");
    r = expression_base(b, l + 1);
    r = r && expression17_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //         LPAR (expression0 COMMA)* expression0? RPAR |  // Function call
  //         LBRA (expression0 COMMA)* expression0? RBRA |  // Lookup
  //         (DOT|NULL_ACCESS) expression_base
  //         )*
  private static boolean expression17_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression17_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression17_1", c)) break;
    }
    return true;
  }

  // LPAR (expression0 COMMA)* expression0? RPAR |  // Function call
  //         LBRA (expression0 COMMA)* expression0? RBRA |  // Lookup
  //         (DOT|NULL_ACCESS) expression_base
  private static boolean expression17_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression17_1_0_0(b, l + 1);
    if (!r) r = expression17_1_0_1(b, l + 1);
    if (!r) r = expression17_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAR (expression0 COMMA)* expression0? RPAR
  private static boolean expression17_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAR);
    r = r && expression17_1_0_0_1(b, l + 1);
    r = r && expression17_1_0_0_2(b, l + 1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression0 COMMA)*
  private static boolean expression17_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression17_1_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression17_1_0_0_1", c)) break;
    }
    return true;
  }

  // expression0 COMMA
  private static boolean expression17_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression0?
  private static boolean expression17_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_0_2")) return false;
    expression0(b, l + 1);
    return true;
  }

  // LBRA (expression0 COMMA)* expression0? RBRA
  private static boolean expression17_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRA);
    r = r && expression17_1_0_1_1(b, l + 1);
    r = r && expression17_1_0_1_2(b, l + 1);
    r = r && consumeToken(b, RBRA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression0 COMMA)*
  private static boolean expression17_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression17_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression17_1_0_1_1", c)) break;
    }
    return true;
  }

  // expression0 COMMA
  private static boolean expression17_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression0?
  private static boolean expression17_1_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_1_2")) return false;
    expression0(b, l + 1);
    return true;
  }

  // (DOT|NULL_ACCESS) expression_base
  private static boolean expression17_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression17_1_0_2_0(b, l + 1);
    r = r && expression_base(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT|NULL_ACCESS
  private static boolean expression17_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression17_1_0_2_0")) return false;
    boolean r;
    r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, NULL_ACCESS);
    return r;
  }

  /* ********************************************************** */
  // (RETURN|BREAK|CONTINUE)* expression3 |
  //     (RETURN|BREAK|CONTINUE)+
  public static boolean expression2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_2, "<expression 2>");
    r = expression2_0(b, l + 1);
    if (!r) r = expression2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (RETURN|BREAK|CONTINUE)* expression3
  private static boolean expression2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression2_0_0(b, l + 1);
    r = r && expression3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (RETURN|BREAK|CONTINUE)*
  private static boolean expression2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression2_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression2_0_0", c)) break;
    }
    return true;
  }

  // RETURN|BREAK|CONTINUE
  private static boolean expression2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression2_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CONTINUE);
    return r;
  }

  // (RETURN|BREAK|CONTINUE)+
  private static boolean expression2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression2_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!expression2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression2_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN|BREAK|CONTINUE
  private static boolean expression2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression2_1_0")) return false;
    boolean r;
    r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CONTINUE);
    return r;
  }

  /* ********************************************************** */
  // (expression4 ((ASSIGN)|PLUSEQ|MINUSEQ|MULEQ|DIVEQ|CATEQ|BIT_ANDEQ|BIT_OREQ|BIT_XOREQ))* expression4
  public static boolean expression3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_3, "<expression 3>");
    r = expression3_0(b, l + 1);
    r = r && expression4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expression4 ((ASSIGN)|PLUSEQ|MINUSEQ|MULEQ|DIVEQ|CATEQ|BIT_ANDEQ|BIT_OREQ|BIT_XOREQ))*
  private static boolean expression3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression3_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression3_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression3_0", c)) break;
    }
    return true;
  }

  // expression4 ((ASSIGN)|PLUSEQ|MINUSEQ|MULEQ|DIVEQ|CATEQ|BIT_ANDEQ|BIT_OREQ|BIT_XOREQ)
  private static boolean expression3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression4(b, l + 1);
    r = r && expression3_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ASSIGN)|PLUSEQ|MINUSEQ|MULEQ|DIVEQ|CATEQ|BIT_ANDEQ|BIT_OREQ|BIT_XOREQ
  private static boolean expression3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression3_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, PLUSEQ);
    if (!r) r = consumeToken(b, MINUSEQ);
    if (!r) r = consumeToken(b, MULEQ);
    if (!r) r = consumeToken(b, DIVEQ);
    if (!r) r = consumeToken(b, CATEQ);
    if (!r) r = consumeToken(b, BIT_ANDEQ);
    if (!r) r = consumeToken(b, BIT_OREQ);
    if (!r) r = consumeToken(b, BIT_XOREQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (expression5 (COLON|QUESTION))* expression5
  public static boolean expression4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_4, "<expression 4>");
    r = expression4_0(b, l + 1);
    r = r && expression5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expression5 (COLON|QUESTION))*
  private static boolean expression4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression4_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression4_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression4_0", c)) break;
    }
    return true;
  }

  // expression5 (COLON|QUESTION)
  private static boolean expression4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression5(b, l + 1);
    r = r && expression4_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON|QUESTION
  private static boolean expression4_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression4_0_0_1")) return false;
    boolean r;
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, QUESTION);
    return r;
  }

  /* ********************************************************** */
  // expression6 (NULL_CHAIN expression6)*
  public static boolean expression5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression5")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_5, "<expression 5>");
    r = expression6(b, l + 1);
    r = r && expression5_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NULL_CHAIN expression6)*
  private static boolean expression5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression5_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression5_1", c)) break;
    }
    return true;
  }

  // NULL_CHAIN expression6
  private static boolean expression5_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression5_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL_CHAIN);
    r = r && expression6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VAR* expression7
  public static boolean expression6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression6")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_6, "<expression 6>");
    r = expression6_0(b, l + 1);
    r = r && expression7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VAR*
  private static boolean expression6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression6_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, VAR)) break;
      if (!empty_element_parsed_guard_(b, "expression6_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expression8 (BIT_OR expression8)*
  public static boolean expression7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression7")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_7, "<expression 7>");
    r = expression8(b, l + 1);
    r = r && expression7_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BIT_OR expression8)*
  private static boolean expression7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression7_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression7_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression7_1", c)) break;
    }
    return true;
  }

  // BIT_OR expression8
  private static boolean expression7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression7_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIT_OR);
    r = r && expression8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression9 (BIT_XOR expression9)*
  public static boolean expression8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression8")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_8, "<expression 8>");
    r = expression9(b, l + 1);
    r = r && expression8_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BIT_XOR expression9)*
  private static boolean expression8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression8_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression8_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression8_1", c)) break;
    }
    return true;
  }

  // BIT_XOR expression9
  private static boolean expression8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIT_XOR);
    r = r && expression9(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression10 (BIT_AND expression10)*
  public static boolean expression9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression9")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_9, "<expression 9>");
    r = expression10(b, l + 1);
    r = r && expression9_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BIT_AND expression10)*
  private static boolean expression9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression9_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression9_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression9_1", c)) break;
    }
    return true;
  }

  // BIT_AND expression10
  private static boolean expression9_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression9_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIT_AND);
    r = r && expression10(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression_no_semi |
  // //    assign_var |
  // //    create_var |
  // //    lookup |
  //     NUMBER |
  //     STRING+ |
  //     TYPE | // TODO: Probably remove this
  //     NIL |
  //     IDENTIFIER |
  //     SPECIAL |
  //     CHAR_CONST |
  //     (LPAR expression0? RPAR) |
  //     LBRA (expression0 COMMA)* expression0? RBRA |  // List
  //     LPAR (expression0 COMMA)* expression0? RPAR &ASSIGN |  // group assignment
  //     LBRACE ((IDENTIFIER|SPECIAL|STRING) COLON expression0 COMMA)* ((IDENTIFIER|SPECIAL|STRING) COLON expression0)? RBRACE |  // Hash
  //     !ASSIGN function
  static boolean expression_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_no_semi(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = expression_base_2(b, l + 1);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SPECIAL);
    if (!r) r = consumeToken(b, CHAR_CONST);
    if (!r) r = expression_base_8(b, l + 1);
    if (!r) r = expression_base_9(b, l + 1);
    if (!r) r = expression_base_10(b, l + 1);
    if (!r) r = expression_base_11(b, l + 1);
    if (!r) r = expression_base_12(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING+
  private static boolean expression_base_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "expression_base_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAR expression0? RPAR
  private static boolean expression_base_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAR);
    r = r && expression_base_8_1(b, l + 1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression0?
  private static boolean expression_base_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_8_1")) return false;
    expression0(b, l + 1);
    return true;
  }

  // LBRA (expression0 COMMA)* expression0? RBRA
  private static boolean expression_base_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRA);
    r = r && expression_base_9_1(b, l + 1);
    r = r && expression_base_9_2(b, l + 1);
    r = r && consumeToken(b, RBRA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression0 COMMA)*
  private static boolean expression_base_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_9_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_base_9_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_base_9_1", c)) break;
    }
    return true;
  }

  // expression0 COMMA
  private static boolean expression_base_9_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_9_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression0?
  private static boolean expression_base_9_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_9_2")) return false;
    expression0(b, l + 1);
    return true;
  }

  // LPAR (expression0 COMMA)* expression0? RPAR &ASSIGN
  private static boolean expression_base_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAR);
    r = r && expression_base_10_1(b, l + 1);
    r = r && expression_base_10_2(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && expression_base_10_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression0 COMMA)*
  private static boolean expression_base_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_10_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_base_10_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_base_10_1", c)) break;
    }
    return true;
  }

  // expression0 COMMA
  private static boolean expression_base_10_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_10_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression0?
  private static boolean expression_base_10_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_10_2")) return false;
    expression0(b, l + 1);
    return true;
  }

  // &ASSIGN
  private static boolean expression_base_10_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_10_4")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE ((IDENTIFIER|SPECIAL|STRING) COLON expression0 COMMA)* ((IDENTIFIER|SPECIAL|STRING) COLON expression0)? RBRACE
  private static boolean expression_base_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && expression_base_11_1(b, l + 1);
    r = r && expression_base_11_2(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((IDENTIFIER|SPECIAL|STRING) COLON expression0 COMMA)*
  private static boolean expression_base_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_base_11_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_base_11_1", c)) break;
    }
    return true;
  }

  // (IDENTIFIER|SPECIAL|STRING) COLON expression0 COMMA
  private static boolean expression_base_11_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_base_11_1_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|SPECIAL|STRING
  private static boolean expression_base_11_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SPECIAL);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  // ((IDENTIFIER|SPECIAL|STRING) COLON expression0)?
  private static boolean expression_base_11_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11_2")) return false;
    expression_base_11_2_0(b, l + 1);
    return true;
  }

  // (IDENTIFIER|SPECIAL|STRING) COLON expression0
  private static boolean expression_base_11_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_base_11_2_0_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression0(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|SPECIAL|STRING
  private static boolean expression_base_11_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_11_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SPECIAL);
    if (!r) r = consumeToken(b, STRING);
    return r;
  }

  // !ASSIGN function
  private static boolean expression_base_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_base_12_0(b, l + 1);
    r = r && function(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !ASSIGN
  private static boolean expression_base_12_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_base_12_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if_expr |
  //     for_expr |
  //     while_expr |
  //     foreach_expr |
  //     forindex_expr
  public static boolean expression_no_semi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_no_semi")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_NO_SEMI, "<expression no semi>");
    r = if_expr(b, l + 1);
    if (!r) r = for_expr(b, l + 1);
    if (!r) r = while_expr(b, l + 1);
    if (!r) r = foreach_expr(b, l + 1);
    if (!r) r = forindex_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR LPAR expression SEMI expression SEMI expression (SEMI expression)? RPAR new_layer
  public static boolean for_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_expr")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LPAR);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    r = r && for_expr_7(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, FOR_EXPR, r);
    return r;
  }

  // (SEMI expression)?
  private static boolean for_expr_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_expr_7")) return false;
    for_expr_7_0(b, l + 1);
    return true;
  }

  // SEMI expression
  private static boolean for_expr_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_expr_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOREACH LPAR expression SEMI expression (SEMI expression)? RPAR new_layer
  public static boolean foreach_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_expr")) return false;
    if (!nextTokenIs(b, FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOREACH, LPAR);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    r = r && foreach_expr_5(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, FOREACH_EXPR, r);
    return r;
  }

  // (SEMI expression)?
  private static boolean foreach_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_expr_5")) return false;
    foreach_expr_5_0(b, l + 1);
    return true;
  }

  // SEMI expression
  private static boolean foreach_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FORINDEX LPAR expression SEMI expression (SEMI expression)? RPAR new_layer
  public static boolean forindex_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forindex_expr")) return false;
    if (!nextTokenIs(b, FORINDEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FORINDEX, LPAR);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    r = r && forindex_expr_5(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, FORINDEX_EXPR, r);
    return r;
  }

  // (SEMI expression)?
  private static boolean forindex_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forindex_expr_5")) return false;
    forindex_expr_5_0(b, l + 1);
    return true;
  }

  // SEMI expression
  private static boolean forindex_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forindex_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression_no_semi SEMI? |
  //     function_var SEMI? |
  //     expression SEMI
  public static boolean full_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FULL_EXPRESSION, "<full expression>");
    r = full_expression_0(b, l + 1);
    if (!r) r = full_expression_1(b, l + 1);
    if (!r) r = full_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression_no_semi SEMI?
  private static boolean full_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_no_semi(b, l + 1);
    r = r && full_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMI?
  private static boolean full_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_expression_0_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  // function_var SEMI?
  private static boolean full_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_var(b, l + 1);
    r = r && full_expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMI?
  private static boolean full_expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_expression_1_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  // expression SEMI
  private static boolean full_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNC (
  //         LPAR
  //         // TODO: document
  //         ((IDENTIFIER|SPECIAL) COMMA)*
  //         (((assign_var COMMA)+ assign_var?) | assign_var | ((IDENTIFIER|SPECIAL) ELLIPSIS?)?)
  //         RPAR
  //         )? new_layer
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNC);
    r = r && function_1(b, l + 1);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, FUNCTION, r);
    return r;
  }

  // (
  //         LPAR
  //         // TODO: document
  //         ((IDENTIFIER|SPECIAL) COMMA)*
  //         (((assign_var COMMA)+ assign_var?) | assign_var | ((IDENTIFIER|SPECIAL) ELLIPSIS?)?)
  //         RPAR
  //         )?
  private static boolean function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1")) return false;
    function_1_0(b, l + 1);
    return true;
  }

  // LPAR
  //         // TODO: document
  //         ((IDENTIFIER|SPECIAL) COMMA)*
  //         (((assign_var COMMA)+ assign_var?) | assign_var | ((IDENTIFIER|SPECIAL) ELLIPSIS?)?)
  //         RPAR
  private static boolean function_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAR);
    r = r && function_1_0_1(b, l + 1);
    r = r && function_1_0_2(b, l + 1);
    r = r && consumeToken(b, RPAR);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((IDENTIFIER|SPECIAL) COMMA)*
  private static boolean function_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!function_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_1_0_1", c)) break;
    }
    return true;
  }

  // (IDENTIFIER|SPECIAL) COMMA
  private static boolean function_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_1_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|SPECIAL
  private static boolean function_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SPECIAL);
    return r;
  }

  // ((assign_var COMMA)+ assign_var?) | assign_var | ((IDENTIFIER|SPECIAL) ELLIPSIS?)?
  private static boolean function_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_1_0_2_0(b, l + 1);
    if (!r) r = assign_var(b, l + 1);
    if (!r) r = function_1_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (assign_var COMMA)+ assign_var?
  private static boolean function_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_1_0_2_0_0(b, l + 1);
    r = r && function_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (assign_var COMMA)+
  private static boolean function_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_1_0_2_0_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!function_1_0_2_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_1_0_2_0_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // assign_var COMMA
  private static boolean function_1_0_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign_var(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // assign_var?
  private static boolean function_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_0_1")) return false;
    assign_var(b, l + 1);
    return true;
  }

  // ((IDENTIFIER|SPECIAL) ELLIPSIS?)?
  private static boolean function_1_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_2")) return false;
    function_1_0_2_2_0(b, l + 1);
    return true;
  }

  // (IDENTIFIER|SPECIAL) ELLIPSIS?
  private static boolean function_1_0_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_1_0_2_2_0_0(b, l + 1);
    r = r && function_1_0_2_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER|SPECIAL
  private static boolean function_1_0_2_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_2_0_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SPECIAL);
    return r;
  }

  // ELLIPSIS?
  private static boolean function_1_0_2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_2_2_0_1")) return false;
    consumeToken(b, ELLIPSIS);
    return true;
  }

  /* ********************************************************** */
  // expression4 ASSIGN function
  public static boolean function_var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_VAR, "<function var>");
    r = expression4(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && function(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF LPAR expression RPAR new_layer
  //     (ELSIF LPAR expression RPAR new_layer)*
  //     (ELSE new_layer)?
  public static boolean if_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAR);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && new_layer(b, l + 1);
    r = r && if_expr_5(b, l + 1);
    r = r && if_expr_6(b, l + 1);
    exit_section_(b, m, IF_EXPR, r);
    return r;
  }

  // (ELSIF LPAR expression RPAR new_layer)*
  private static boolean if_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!if_expr_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_expr_5", c)) break;
    }
    return true;
  }

  // ELSIF LPAR expression RPAR new_layer
  private static boolean if_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSIF, LPAR);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ELSE new_layer)?
  private static boolean if_expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_6")) return false;
    if_expr_6_0(b, l + 1);
    return true;
  }

  // ELSE new_layer
  private static boolean if_expr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_expr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMMENT|full_expression)* expression?
  static boolean layer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layer")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = layer_0(b, l + 1);
    r = r && layer_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMENT|full_expression)*
  private static boolean layer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layer_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!layer_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "layer_0", c)) break;
    }
    return true;
  }

  // COMMENT|full_expression
  private static boolean layer_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layer_0_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = full_expression(b, l + 1);
    return r;
  }

  // expression?
  private static boolean layer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layer_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // layer
  static boolean nasalFile(PsiBuilder b, int l) {
    return layer(b, l + 1);
  }

  /* ********************************************************** */
  // (LBRACE layer RBRACE) | expression SEMI?
  public static boolean new_layer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_layer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_LAYER, "<new layer>");
    r = new_layer_0(b, l + 1);
    if (!r) r = new_layer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LBRACE layer RBRACE
  private static boolean new_layer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_layer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && layer(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression SEMI?
  private static boolean new_layer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_layer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && new_layer_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMI?
  private static boolean new_layer_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_layer_1_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // WHILE LPAR expression RPAR new_layer
  public static boolean while_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_expr")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAR);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RPAR);
    r = r && new_layer(b, l + 1);
    exit_section_(b, m, WHILE_EXPR, r);
    return r;
  }

}
