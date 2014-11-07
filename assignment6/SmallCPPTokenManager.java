/* SmallCPPTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. SmallCPPTokenManager.java */
import java.io.*;

/** Token Manager. */
@SuppressWarnings("unused")public class SmallCPPTokenManager implements SmallCPPConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjMoveStringLiteralDfa0_0()
{
   return jjMoveNfa_0(4, 0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 145;
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
               case 4:
                  if ((0xffffffffffffdbffL & l) != 0L)
                  {
                     if (kind > 12)
                        kind = 12;
                  }
                  else if (curChar == 10)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 66;
                  if ((0xfc00ffe600000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                     { jjCheckNAdd(47); }
                  }
                  else if ((0x100002400L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     { jjCheckNAdd(65); }
                  }
                  if (curChar == 47)
                     { jjCheckNAddStates(0, 4); }
                  else if (curChar == 38)
                     { jjCheckNAddTwoStates(59, 83); }
                  else if (curChar == 62)
                     { jjCheckNAddStates(5, 7); }
                  else if (curChar == 60)
                     { jjCheckNAddStates(8, 10); }
                  else if (curChar == 45)
                     { jjCheckNAddTwoStates(73, 59); }
                  else if (curChar == 43)
                     { jjCheckNAddTwoStates(71, 59); }
                  else if (curChar == 33)
                     { jjCheckNAdd(59); }
                  else if (curChar == 37)
                     { jjCheckNAdd(59); }
                  else if (curChar == 61)
                     { jjCheckNAdd(59); }
                  else if (curChar == 42)
                     { jjCheckNAdd(59); }
                  else if (curChar == 39)
                     { jjCheckNAddStates(11, 13); }
                  else if (curChar == 34)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(47); }
                  break;
               case 48:
                  if (curChar == 34)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 49:
                  if ((0xfffffffbfffffbffL & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 51:
                  { jjCheckNAddStates(14, 16); }
                  break;
               case 52:
                  if (curChar == 34 && kind > 4)
                     kind = 4;
                  break;
               case 53:
                  if (curChar == 39)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 54:
                  if ((0xffffff7ffffffbffL & l) != 0L)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 56:
                  { jjCheckNAddStates(11, 13); }
                  break;
               case 57:
                  if (curChar == 39 && kind > 5)
                     kind = 5;
                  break;
               case 58:
                  if ((0xfc00ffe600000000L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 59:
                  if (curChar == 61 && kind > 6)
                     kind = 6;
                  break;
               case 60:
                  if (curChar == 42)
                     { jjCheckNAdd(59); }
                  break;
               case 61:
                  if (curChar == 61)
                     { jjCheckNAdd(59); }
                  break;
               case 62:
                  if (curChar == 37)
                     { jjCheckNAdd(59); }
                  break;
               case 64:
                  if (curChar == 33)
                     { jjCheckNAdd(59); }
                  break;
               case 65:
                  if ((0x100002400L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  { jjCheckNAdd(65); }
                  break;
               case 66:
                  if (curChar == 10 && kind > 11)
                     kind = 11;
                  break;
               case 67:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if (curChar == 10 && kind > 11)
                     kind = 11;
                  break;
               case 69:
                  if ((0xffffffffffffdbffL & l) != 0L && kind > 12)
                     kind = 12;
                  break;
               case 70:
                  if (curChar == 43)
                     { jjCheckNAddTwoStates(71, 59); }
                  break;
               case 71:
                  if (curChar == 43 && kind > 6)
                     kind = 6;
                  break;
               case 72:
                  if (curChar == 45)
                     { jjCheckNAddTwoStates(73, 59); }
                  break;
               case 73:
                  if (curChar == 45 && kind > 6)
                     kind = 6;
                  break;
               case 74:
                  if (curChar == 60)
                     { jjCheckNAddStates(8, 10); }
                  break;
               case 75:
                  if (curChar == 60 && kind > 6)
                     kind = 6;
                  break;
               case 76:
                  if (curChar == 60)
                     { jjCheckNAdd(59); }
                  break;
               case 77:
                  if (curChar == 62)
                     { jjCheckNAddStates(5, 7); }
                  break;
               case 78:
                  if (curChar == 62 && kind > 6)
                     kind = 6;
                  break;
               case 79:
                  if (curChar == 62)
                     { jjCheckNAdd(59); }
                  break;
               case 82:
                  if (curChar == 38)
                     { jjCheckNAddTwoStates(59, 83); }
                  break;
               case 83:
                  if (curChar == 38 && kind > 6)
                     kind = 6;
                  break;
               case 122:
                  if (curChar == 47)
                     { jjCheckNAddStates(0, 4); }
                  break;
               case 123:
                  if (curChar == 47)
                     { jjCheckNAddStates(17, 19); }
                  break;
               case 124:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     { jjCheckNAddStates(17, 19); }
                  break;
               case 125:
               case 127:
                  if (curChar == 10 && kind > 7)
                     kind = 7;
                  break;
               case 126:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 125;
                  break;
               case 128:
                  if (curChar == 42)
                     { jjCheckNAddStates(20, 23); }
                  break;
               case 129:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddStates(20, 23); }
                  break;
               case 130:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(130, 131); }
                  break;
               case 131:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddStates(20, 23); }
                  break;
               case 132:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 133:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 132;
                  break;
               case 134:
                  if (curChar == 47)
                     { jjCheckNAddStates(24, 26); }
                  break;
               case 135:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     { jjCheckNAddStates(24, 26); }
                  break;
               case 136:
               case 138:
                  if (curChar == 10 && kind > 8)
                     kind = 8;
                  break;
               case 137:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 136;
                  break;
               case 139:
                  if (curChar == 42)
                     { jjCheckNAddStates(27, 30); }
                  break;
               case 140:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddStates(27, 30); }
                  break;
               case 141:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(141, 142); }
                  break;
               case 142:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddStates(27, 30); }
                  break;
               case 143:
                  if (curChar == 47 && kind > 10)
                     kind = 10;
                  break;
               case 144:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 143;
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
               case 4:
                  if (kind > 12)
                     kind = 12;
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                     { jjCheckNAdd(46); }
                  }
                  else if ((0x7800000068000001L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  if (curChar == 115)
                     { jjAddStates(31, 34); }
                  else if (curChar == 105)
                     { jjCheckNAddTwoStates(26, 103); }
                  else if (curChar == 100)
                     { jjCheckNAddTwoStates(101, 12); }
                  else if (curChar == 99)
                     { jjAddStates(35, 37); }
                  else if (curChar == 124)
                     { jjCheckNAddTwoStates(59, 81); }
                  else if (curChar == 94)
                     { jjCheckNAdd(59); }
                  else if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 43;
                  else if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 39;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 31;
                  else if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 24;
                  else if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 0:
                  if (curChar == 107 && kind > 1)
                     kind = 1;
                  break;
               case 1:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 5:
                  if (curChar == 101 && kind > 1)
                     kind = 1;
                  break;
               case 6:
               case 85:
                  if (curChar == 115)
                     { jjCheckNAdd(5); }
                  break;
               case 7:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 114 && kind > 1)
                     kind = 1;
                  break;
               case 10:
                  if (curChar == 111)
                     { jjCheckNAdd(9); }
                  break;
               case 11:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 111 && kind > 1)
                     kind = 1;
                  break;
               case 13:
                  if (curChar == 116)
                     { jjCheckNAdd(12); }
                  break;
               case 14:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 103 && kind > 1)
                     kind = 1;
                  break;
               case 17:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 110 && kind > 1)
                     kind = 1;
                  break;
               case 21:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 102 && kind > 1)
                     kind = 1;
                  break;
               case 27:
                  if (curChar == 101)
                     { jjCheckNAdd(26); }
                  break;
               case 28:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 121)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 100 && kind > 1)
                     kind = 1;
                  break;
               case 34:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 108)
                     { jjCheckNAdd(5); }
                  break;
               case 42:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
               case 46:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAdd(46); }
                  break;
               case 49:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 50:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 51:
                  { jjCheckNAddStates(14, 16); }
                  break;
               case 54:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 55:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 56:
                  { jjCheckNAddStates(11, 13); }
                  break;
               case 58:
                  if ((0x7800000068000001L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 63:
                  if (curChar == 94)
                     { jjCheckNAdd(59); }
                  break;
               case 69:
                  if (kind > 12)
                     kind = 12;
                  break;
               case 80:
                  if (curChar == 124)
                     { jjCheckNAddTwoStates(59, 81); }
                  break;
               case 81:
                  if (curChar == 124 && kind > 6)
                     kind = 6;
                  break;
               case 84:
                  if (curChar == 99)
                     { jjAddStates(35, 37); }
                  break;
               case 86:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 87:
                  if (curChar == 97)
                     { jjCheckNAdd(9); }
                  break;
               case 88:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if (curChar == 117)
                     { jjCheckNAdd(5); }
                  break;
               case 90:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 92:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 93:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 92;
                  break;
               case 94:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 93;
                  break;
               case 95:
                  if (curChar == 100)
                     { jjCheckNAddTwoStates(101, 12); }
                  break;
               case 96:
                  if (curChar == 116 && kind > 1)
                     kind = 1;
                  break;
               case 97:
                  if (curChar == 108)
                     { jjCheckNAdd(96); }
                  break;
               case 98:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 100:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 101:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 102:
                  if (curChar == 105)
                     { jjCheckNAddTwoStates(26, 103); }
                  break;
               case 103:
                  if (curChar == 110)
                     { jjCheckNAdd(96); }
                  break;
               case 104:
                  if (curChar == 115)
                     { jjAddStates(31, 34); }
                  break;
               case 105:
                  if (curChar == 114)
                     { jjCheckNAdd(96); }
                  break;
               case 106:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 105;
                  break;
               case 107:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 106;
                  break;
               case 108:
                  if (curChar == 111)
                     { jjCheckNAdd(26); }
                  break;
               case 109:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 110:
                  if (curChar == 122)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 111:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 110;
                  break;
               case 112:
                  if (curChar == 99 && kind > 1)
                     kind = 1;
                  break;
               case 113:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 112;
                  break;
               case 114:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 113;
                  break;
               case 115:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 114;
                  break;
               case 116:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 115;
                  break;
               case 117:
                  if (curChar == 104 && kind > 1)
                     kind = 1;
                  break;
               case 118:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 117;
                  break;
               case 119:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 118;
                  break;
               case 120:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 119;
                  break;
               case 121:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 120;
                  break;
               case 124:
                  { jjAddStates(17, 19); }
                  break;
               case 129:
               case 131:
                  { jjCheckNAddStates(20, 23); }
                  break;
               case 135:
                  { jjAddStates(24, 26); }
                  break;
               case 140:
               case 142:
                  { jjCheckNAddStates(27, 30); }
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
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 12)
                     kind = 12;
                  break;
               case 49:
               case 51:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 54:
               case 56:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 124:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(17, 19); }
                  break;
               case 129:
               case 131:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(20, 23); }
                  break;
               case 135:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(24, 26); }
                  break;
               case 140:
               case 142:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(27, 30); }
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
      if ((i = jjnewStateCnt) == (startsAt = 145 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   59, 123, 128, 134, 139, 78, 59, 79, 75, 59, 76, 54, 55, 57, 49, 50, 
   52, 124, 126, 127, 129, 130, 131, 133, 135, 137, 138, 140, 141, 142, 144, 107, 
   111, 116, 121, 86, 88, 94, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, };
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
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
         matchedToken = jjFillToken();
         return matchedToken;
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

    /** Constructor. */
    public SmallCPPTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public SmallCPPTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
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
    for (i = 145; i-- > 0;)
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

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[145];
    static private final int[] jjstateSet = new int[2 * 145];

    
    static protected char curChar;
}
