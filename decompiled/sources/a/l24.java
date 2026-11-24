package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class l24 implements jr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19289a;

    public /* synthetic */ l24(byte b) {
        this.f19289a = b;
    }

    public static IntRange c(k810 k810Var) {
        int i = k810Var.b;
        if (i == -1) {
            return null;
        }
        CharSequence charSequence = k810Var.d;
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, charSequence.length());
        charSequenceSubSequence.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i2 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i2) == ' ') {
                i2++;
            }
        }
        if (i2 >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(i2) != '#') {
            return null;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < 6; i5++) {
            if (i4 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i4) == '#') {
                i4++;
            }
        }
        if (i4 >= charSequenceSubSequence.length() || q3d.j(' ', '\t').contains(Character.valueOf(charSequenceSubSequence.charAt(i4)))) {
            return new IntRange(i2, i4 - 1, 1);
        }
        return null;
    }

    public static boolean d(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        int i = k810Var.b;
        CharSequence charSequence = k810Var.d;
        if (i == idx.x(v9dVar, charSequence)) {
            return fbc.O(i, charSequence);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0265 A[PHI: r12
  0x0265: PHI (r12v14 char) = (r12v13 char), (r12v16 char), (r12v17 char) binds: [B:174:0x0259, B:177:0x025e, B:180:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x026e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0273  */
    /* JADX WARN: Code duplicated, block: B:190:0x0282 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x0287  */
    /* JADX WARN: Code duplicated, block: B:195:0x028b  */
    /* JADX WARN: Code duplicated, block: B:196:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x0294  */
    /* JADX WARN: Code duplicated, block: B:305:0x00ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x02a9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d  */
    @Override // a.jr20
    public final List a(k810 k810Var, y78 y78Var, mr20 mr20Var) {
        int i;
        IntRange intRange;
        int i2;
        int i3;
        int i4;
        IntRange intRange2;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        boolean z;
        char cCharAt3;
        IntRange intRange3;
        int i8;
        char cCharAt4;
        ArrayList<IntRange> arrayList;
        char cCharAt5;
        int i9;
        ar20 ar20Var;
        int i10;
        int iMin;
        char cCharAt6;
        int i11;
        Character chQ;
        byte b = this.f19289a;
        char c = '\\';
        byte b2 = 2;
        mr20Var.getClass();
        switch (b) {
            case 0:
                IntRange intRangeC = c(k810Var);
                if (intRangeC == null) {
                    return iun.f15405a;
                }
                v9d v9dVar = mr20Var.f22248a;
                int i12 = intRangeC.b;
                CharSequence charSequence = k810Var.d;
                CharSequence charSequenceSubSequence = charSequence.subSequence(k810Var.b, charSequence.length());
                int i13 = k810Var.c;
                int length = charSequenceSubSequence.length() - 1;
                while (length > i12 && CharsKt.d(charSequenceSubSequence.charAt(length))) {
                    length--;
                }
                while (length > i12 && charSequenceSubSequence.charAt(length) == '#' && charSequenceSubSequence.charAt(length - 1) != '\\') {
                    length--;
                }
                int i14 = length + 1;
                return kotlin.collections.a.c(new k24(v9dVar, y78Var, intRangeC, (i14 < charSequenceSubSequence.length() && CharsKt.d(charSequenceSubSequence.charAt(length)) && charSequenceSubSequence.charAt(i14) == '#') ? i13 + length + 1 : i13 + charSequenceSubSequence.length(), k810Var.c()));
            case 1:
                v9d v9dVar2 = mr20Var.b;
                v9d v9dVar3 = mr20Var.f22248a;
                if (idx.x(v9dVar2, k810Var.d) > k810Var.b) {
                    return iun.f15405a;
                }
                Integer numA = k810Var.a();
                if (numA == null) {
                    return iun.f15405a;
                }
                k810 k810VarE = k810Var.e(numA.intValue());
                if (k810VarE == null) {
                    return iun.f15405a;
                }
                CharSequence charSequence2 = k810VarE.d;
                v9dVar3.getClass();
                int iX = idx.x(v9dVar3, charSequence2);
                int i15 = k810VarE.b;
                if (i15 < iX + 4) {
                    if (iX <= i15) {
                        while (charSequence2.charAt(iX) != '\t') {
                            if (iX != i15) {
                                iX++;
                            }
                        }
                    }
                    return iun.f15405a;
                }
                return kotlin.collections.a.c(new wxc(v9dVar3, y78Var, k810Var));
            case 2:
                v9d v9dVar4 = mr20Var.f22248a;
                if (!d(v9dVar4, k810Var)) {
                    return iun.f15405a;
                }
                y78 y78Var2 = new y78(y78Var);
                v9dVar4.getClass();
                return kotlin.collections.a.c(new e98(v9dVar4, y78Var2, (byte) 1));
            case 3:
                v9d v9dVar5 = mr20Var.f22248a;
                int i16 = k810Var.c;
                v9dVar5.getClass();
                if (k810Var.b != idx.x(v9dVar5, k810Var.d)) {
                    return iun.f15405a;
                }
                CharSequence charSequence3 = (CharSequence) k810Var.e.f12096a;
                charSequence3.getClass();
                int i17 = i16;
                for (int i18 = 0; i18 < 3; i18++) {
                    if (i17 < charSequence3.length() && charSequence3.charAt(i17) == ' ') {
                        i17++;
                    }
                }
                if (i17 < charSequence3.length()) {
                    char c2 = '[';
                    if (charSequence3.charAt(i17) != '[') {
                        i = 2;
                    } else {
                        int i19 = i17 + 1;
                        i = 2;
                        int i20 = 1;
                        boolean z2 = false;
                        while (true) {
                            if (i20 < 1000) {
                                if (i19 < charSequence3.length()) {
                                    char cCharAt7 = charSequence3.charAt(i19);
                                    if (cCharAt7 != c2 && cCharAt7 != ']') {
                                        if (cCharAt7 != c) {
                                            if (cCharAt7 != '\n' || (cCharAt7 == '\r' && ((i11 = i19 + 1) >= charSequence3.length() || charSequence3.charAt(i11) != '\n'))) {
                                                i10 = i19 + 1;
                                                iMin = Math.min(charSequence3.length(), (999 - i20) + i10);
                                                while (true) {
                                                    if (i10 < iMin) {
                                                        cCharAt6 = charSequence3.charAt(i10);
                                                        if (cCharAt6 == '\n' && cCharAt6 != '\r') {
                                                            if (cCharAt6 == ' ' || cCharAt6 == '\t') {
                                                                i10++;
                                                            }
                                                        }
                                                    } else if (iMin == charSequence3.length()) {
                                                    }
                                                }
                                            }
                                            if (!CharsKt.d(cCharAt7)) {
                                                z2 = true;
                                            }
                                            i19++;
                                            i20++;
                                            c = '\\';
                                            c2 = '[';
                                        } else {
                                            i19++;
                                            if (i19 < charSequence3.length()) {
                                                cCharAt7 = charSequence3.charAt(i19);
                                                if (cCharAt7 != '\n') {
                                                    i10 = i19 + 1;
                                                    iMin = Math.min(charSequence3.length(), (999 - i20) + i10);
                                                    while (true) {
                                                        if (i10 < iMin) {
                                                            cCharAt6 = charSequence3.charAt(i10);
                                                            if (cCharAt6 == '\n') {
                                                            }
                                                        } else {
                                                            if (iMin == charSequence3.length()) {
                                                            }
                                                            if (!CharsKt.d(cCharAt7)) {
                                                                z2 = true;
                                                            }
                                                            i19++;
                                                            i20++;
                                                            c = '\\';
                                                            c2 = '[';
                                                        }
                                                        i10++;
                                                    }
                                                } else {
                                                    i10 = i19 + 1;
                                                    iMin = Math.min(charSequence3.length(), (999 - i20) + i10);
                                                    while (true) {
                                                        if (i10 < iMin) {
                                                            cCharAt6 = charSequence3.charAt(i10);
                                                            if (cCharAt6 == '\n') {
                                                            }
                                                        } else {
                                                            if (iMin == charSequence3.length()) {
                                                            }
                                                            if (!CharsKt.d(cCharAt7)) {
                                                                z2 = true;
                                                            }
                                                            i19++;
                                                            i20++;
                                                            c = '\\';
                                                            c2 = '[';
                                                        }
                                                        i10++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (z2 && i19 < charSequence3.length() && charSequence3.charAt(i19) == ']') {
                                intRange = new IntRange(i17, i19, 1);
                            }
                        }
                    }
                    intRange = null;
                } else {
                    i = 2;
                    intRange = null;
                }
                if (intRange != null && (i3 = (i2 = intRange.b) + 1) < charSequence3.length() && charSequence3.charAt(i3) == ':') {
                    int iG = tfx.G(i2 + 2, charSequence3);
                    int i21 = 999;
                    if (iG >= charSequence3.length()) {
                        intRange2 = null;
                        i4 = 1;
                    } else if (charSequence3.charAt(iG) == '<') {
                        int i22 = iG + 1;
                        while (true) {
                            if (i22 < charSequence3.length() && i22 - iG <= 999) {
                                char cCharAt8 = charSequence3.charAt(i22);
                                if (cCharAt8 == '>') {
                                    i4 = 1;
                                    intRange2 = new IntRange(iG, i22, 1);
                                } else if (cCharAt8 != '<' && cCharAt8 != '>' && cCharAt8 != ' ' && cCharAt8 != '\t' && cCharAt8 != '\n') {
                                    if (cCharAt8 == '\\' && (i6 = i22 + 1) < charSequence3.length() && (cCharAt2 = charSequence3.charAt(i6)) != ' ' && cCharAt2 != '\t' && cCharAt2 != '\n') {
                                        i22 = i6;
                                    }
                                    i22++;
                                }
                            }
                            intRange2 = null;
                            i4 = 1;
                        }
                    } else {
                        int i23 = iG;
                        boolean z3 = false;
                        while (true) {
                            if (i23 < charSequence3.length()) {
                                if (i23 - iG > 999) {
                                    intRange2 = null;
                                    i4 = 1;
                                } else {
                                    char cCharAt9 = charSequence3.charAt(i23);
                                    if (cCharAt9 != ' ' && cCharAt9 != '\t' && cCharAt9 != '\n' && cCharAt9 > 27) {
                                        if (cCharAt9 != '(') {
                                            if (cCharAt9 == ')') {
                                                if (z3) {
                                                    z3 = false;
                                                }
                                            } else if (cCharAt9 == '\\' && (i5 = i23 + 1) < charSequence3.length() && (cCharAt = charSequence3.charAt(i5)) != ' ' && cCharAt != '\t' && cCharAt != '\n') {
                                                i23 = i5;
                                            }
                                            i23++;
                                        } else if (!z3) {
                                            z3 = true;
                                            i23++;
                                        }
                                    }
                                }
                            }
                            i4 = 1;
                            intRange2 = iG == i23 ? null : new IntRange(iG, i23 - 1, 1);
                        }
                    }
                    if (intRange2 == null) {
                        arrayList = null;
                    } else {
                        int iG2 = tfx.G(intRange2.b + i4, charSequence3);
                        if (iG2 >= charSequence3.length()) {
                            intRange3 = null;
                        } else {
                            char cCharAt10 = charSequence3.charAt(iG2);
                            char c3 = '\'';
                            if (cCharAt10 == '\'') {
                                i7 = iG2 + 1;
                                z = false;
                                while (true) {
                                    if (i7 < charSequence3.length()) {
                                        if (i7 - iG2 <= i21) {
                                            cCharAt3 = charSequence3.charAt(i7);
                                            if (cCharAt3 == c3) {
                                                intRange3 = new IntRange(iG2, i7, 1);
                                            } else {
                                                if (cCharAt3 == '\n') {
                                                    if (!z) {
                                                        z = true;
                                                    }
                                                } else if (cCharAt3 != ' ' && cCharAt3 != '\t') {
                                                    z = false;
                                                }
                                                if (cCharAt3 != '\\' && (i8 = i7 + 1) < charSequence3.length() && (cCharAt4 = charSequence3.charAt(i8)) != ' ' && cCharAt4 != '\t' && cCharAt4 != '\n') {
                                                    i7 = i8;
                                                }
                                                i7++;
                                                i21 = 999;
                                            }
                                        }
                                        intRange3 = null;
                                    } else {
                                        intRange3 = null;
                                    }
                                }
                            } else {
                                c3 = '\"';
                                if (cCharAt10 == '\"') {
                                    i7 = iG2 + 1;
                                    z = false;
                                    while (true) {
                                        if (i7 < charSequence3.length()) {
                                            if (i7 - iG2 <= i21) {
                                                cCharAt3 = charSequence3.charAt(i7);
                                                if (cCharAt3 == c3) {
                                                    intRange3 = new IntRange(iG2, i7, 1);
                                                } else {
                                                    if (cCharAt3 == '\n') {
                                                        if (!z) {
                                                            z = true;
                                                        }
                                                    } else if (cCharAt3 != ' ') {
                                                        z = false;
                                                    }
                                                    if (cCharAt3 != '\\') {
                                                    }
                                                    i7++;
                                                    i21 = 999;
                                                }
                                            }
                                            intRange3 = null;
                                        } else {
                                            intRange3 = null;
                                        }
                                    }
                                } else if (cCharAt10 == '(') {
                                    c3 = ')';
                                    i7 = iG2 + 1;
                                    z = false;
                                    while (true) {
                                        if (i7 < charSequence3.length()) {
                                            if (i7 - iG2 <= i21) {
                                                cCharAt3 = charSequence3.charAt(i7);
                                                if (cCharAt3 == c3) {
                                                    intRange3 = new IntRange(iG2, i7, 1);
                                                } else {
                                                    if (cCharAt3 == '\n') {
                                                        if (!z) {
                                                            z = true;
                                                        }
                                                    } else if (cCharAt3 != ' ') {
                                                        z = false;
                                                    }
                                                    if (cCharAt3 != '\\') {
                                                    }
                                                    i7++;
                                                    i21 = 999;
                                                }
                                            }
                                            intRange3 = null;
                                        } else {
                                            intRange3 = null;
                                        }
                                    }
                                } else {
                                    intRange3 = null;
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add(intRange);
                        arrayList.add(intRange2);
                        if (intRange3 != null) {
                            int i24 = intRange3.b;
                            while (true) {
                                i24++;
                                if (i24 >= charSequence3.length() || ((cCharAt5 = charSequence3.charAt(i24)) != ' ' && cCharAt5 != '\t')) {
                                }
                            }
                            if (i24 >= charSequence3.length() || charSequence3.charAt(i24) == '\n') {
                                arrayList.add(intRange3);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    return iun.f15405a;
                }
                int i25 = (((IntRange) CollectionsKt.d0(arrayList)).b - i16) + 1;
                k810 k810VarE2 = k810Var.e(i25);
                if (k810VarE2 != null && k810VarE2.b != -1 && k810VarE2.a() != null) {
                    return iun.f15405a;
                }
                int i26 = 0;
                for (IntRange intRange4 : arrayList) {
                    int i27 = i26 + 1;
                    intRange4.getClass();
                    IntRange intRange5 = new IntRange(intRange4.f46068a, intRange4.b + 1, 1);
                    if (i26 == 0) {
                        i9 = i;
                        ar20Var = wb.z;
                    } else if (i26 != 1) {
                        i9 = i;
                        if (i26 != i9) {
                            c99.l("There are no more than three groups in this regex");
                            return null;
                        }
                        ar20Var = wb.B;
                    } else {
                        i9 = i;
                        ar20Var = wb.A;
                    }
                    y78Var.b(kotlin.collections.a.c(new sgi0(intRange5, ar20Var)));
                    i26 = i27;
                    i = i9;
                }
                return kotlin.collections.a.c(new sb00(v9dVar5, new y78(y78Var), i16 + i25));
            default:
                v9d v9dVar6 = mr20Var.f22248a;
                v9d v9dVar7 = mr20Var.b;
                v9dVar6.getClass();
                if (k810Var.b != idx.x(v9dVar6, k810Var.d)) {
                    return iun.f15405a;
                }
                if (!Intrinsics.d(v9dVar7, v9dVar6) && ((chQ = tx3.Q(v9dVar7.b)) == null || chQ.charValue() != '>')) {
                    boolean[] zArr = v9dVar7.c;
                    if (Intrinsics.d(zArr.length == 0 ? null : Boolean.valueOf(zArr[zArr.length - 1]), Boolean.TRUE)) {
                        ArrayList arrayList2 = new ArrayList();
                        if (!(((ir20) CollectionsKt.f0(mr20Var.c)) instanceof ff00)) {
                            y78 y78Var3 = new y78(y78Var);
                            Character chQ2 = tx3.Q(v9dVar7.b);
                            chQ2.getClass();
                            arrayList2.add(new ff00(v9dVar7, y78Var3, chQ2.charValue()));
                        }
                        arrayList2.add(new e98(v9dVar7, new y78(y78Var), b2));
                        return arrayList2;
                    }
                }
                return iun.f15405a;
        }
    }

    @Override // a.jr20
    public final boolean b(v9d v9dVar, k810 k810Var) {
        switch (this.f19289a) {
            case 0:
                return c(k810Var) != null;
            case 1:
                return false;
            case 2:
                return d(v9dVar, k810Var);
            case 3:
            default:
                return false;
        }
    }
}
