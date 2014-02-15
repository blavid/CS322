/* Generated By:JavaCC: Do not edit this line. ast1ParserTokenManager.java */
package ast1;
import java.util.*;
import java.io.*;

/** Token Manager. */
public class ast1ParserTokenManager implements ast1ParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ffff80L) != 0L)
         {
            jjmatchedKind = 31;
            return 18;
         }
         return -1;
      case 1:
         if ((active0 & 0x20000L) != 0L)
            return 18;
         if ((active0 & 0x3fdff80L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 18;
         }
         return -1;
      case 2:
         if ((active0 & 0x3fdff80L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 18;
         }
         return -1;
      case 3:
         if ((active0 & 0x1417000L) != 0L)
            return 18;
         if ((active0 & 0x2bc8f80L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 3;
            }
            return 18;
         }
         return -1;
      case 4:
         if ((active0 & 0x2100400L) != 0L)
            return 18;
         if ((active0 & 0xacab80L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
            return 18;
         }
         return -1;
      case 5:
         if ((active0 & 0x8c2980L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 5;
            return 18;
         }
         if ((active0 & 0x208200L) != 0L)
            return 18;
         return -1;
      case 6:
         if ((active0 & 0x840000L) != 0L)
            return 18;
         if ((active0 & 0x82980L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
            return 18;
         }
         return -1;
      case 7:
         if ((active0 & 0x82880L) != 0L)
            return 18;
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 7;
            return 18;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 48;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 40:
         return jjStopAtPos(0, 32);
      case 41:
         return jjStopAtPos(0, 33);
      case 42:
         return jjStopAtPos(0, 38);
      case 43:
         return jjStopAtPos(0, 36);
      case 45:
         return jjStopAtPos(0, 37);
      case 47:
         return jjStopAtPos(0, 39);
      case 60:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 62:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x380L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0xc00L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x3000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x18000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x60000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 123:
         return jjStopAtPos(0, 34);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 125:
         return jjStopAtPos(0, 35);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 61:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x803000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x280000L);
      case 102:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 18);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x440000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1008800L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100180L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 124:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x3100000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x400800L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x808180L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4200L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x240000L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x180L);
      case 99:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 18);
         break;
      case 100:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 18);
         break;
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 18);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 108:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x2002800L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 112:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 18);
         break;
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 18);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 112:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 18);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x280000L);
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 18);
         break;
      case 121:
         return jjMoveStringLiteralDfa5_0(active0, 0x40180L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 108:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 18);
         break;
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 18);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 18);
         break;
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 121:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(6, 18, 18);
         break;
      case 108:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 18);
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      case 121:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(7, 11, 18);
         break;
      case 109:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(7, 7, 18);
         break;
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(7, 13, 18);
         break;
      case 121:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(7, 19, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(8, 8, 18);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 19;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAdd(5);
                  }
                  else if (curChar == 34)
                     jjCheckNAdd(15);
                  else if (curChar == 35)
                     jjCheckNAddStates(0, 2);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(5);
                  break;
               case 14:
                  if (curChar == 34)
                     jjCheckNAdd(15);
                  break;
               case 15:
                  if ((0xfffffffbfffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if (curChar == 34 && kind > 30)
                     kind = 30;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjstateSet[jjnewStateCnt++] = 18;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(18);
                  }
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 1:
                  jjAddStates(0, 2);
                  break;
               case 6:
                  if (curChar == 101 && kind > 29)
                     kind = 29;
                  break;
               case 7:
                  if (curChar == 117)
                     jjCheckNAdd(6);
                  break;
               case 8:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 115)
                     jjCheckNAdd(6);
                  break;
               case 11:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  jjAddStates(3, 4);
                  break;
               case 17:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(18);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 19 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 4, 15, 16, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\101\162\162\141\171\105\154\155", 
"\101\162\162\141\171\124\171\160\145", "\101\163\163\151\147\156", "\102\151\156\157\160", 
"\102\157\157\154\124\171\160\145", "\103\141\154\154", "\103\141\154\154\123\164\155\164", "\105\154\163\145", 
"\106\157\162\155\141\154", "\106\165\156\143", "\111\146", "\111\156\164\124\171\160\145", 
"\116\145\167\101\162\162\141\171", "\120\162\151\156\164", "\122\145\164\165\162\156", "\125\156\157\160", 
"\126\141\162\104\145\143\154", "\166\157\151\144", "\127\150\151\154\145", null, null, null, null, null, null, 
"\50", "\51", "\173", "\175", "\53", "\55", "\52", "\57", "\46\46", "\174\174", 
"\75\75", "\41\75", "\74", "\74\75", "\76", "\76\75", "\41", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffff3ffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[19];
static private final int[] jjstateSet = new int[38];
static protected char curChar;
/** Constructor. */
public ast1ParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ast1ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 19; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
