package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class v9d {
    public static final v9d e = new v9d(new int[0], new char[0], new boolean[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f37030a;
    public final char[] b;
    public final boolean[] c;
    public final int d;

    public v9d(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        this.f37030a = iArr;
        this.b = cArr;
        this.c = zArr;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0123 A[EDGE_INSN: B:138:0x0123->B:80:0x0123 BREAK  A[LOOP:4: B:72:0x0109->B:79:0x0120], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:74:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x011a  */
    /* JADX WARN: Code duplicated, block: B:84:0x012c  */
    /* JADX WARN: Code duplicated, block: B:86:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    public final v9d a(k810 k810Var, boolean z) {
        v9d v9dVar;
        t9d t9dVar;
        int i;
        int i2;
        int i3;
        v9d v9dVarK;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int i4;
        if (k810Var != null) {
            CharSequence charSequence = k810Var.d;
            int i5 = k810Var.b;
            if (i5 != -1 && !fbc.O(i5, charSequence)) {
                int iE = (i5 <= 0 || charSequence.charAt(i5 + (-1)) != '\t') ? 0 : (4 - (e() % 4)) % 4;
                int i6 = i5;
                while (i6 < charSequence.length() && charSequence.charAt(i6) == ' ' && iE < 3) {
                    iE++;
                    i6++;
                }
                if (i6 == charSequence.length()) {
                    v9dVarK = null;
                    v9dVar = null;
                } else {
                    k810 k810VarE = k810Var.e(i6 - i5);
                    k810VarE.getClass();
                    gxu gxuVar = k810VarE.e;
                    int i7 = k810VarE.b;
                    char cCharAt4 = ((CharSequence) gxuVar.f12096a).charAt(k810VarE.c);
                    v9dVar = null;
                    if (cCharAt4 == '*' || cCharAt4 == '-' || cCharAt4 == '+') {
                        t9dVar = new t9d(cCharAt4, 1, 1);
                    } else {
                        CharSequence charSequence2 = k810VarE.d;
                        int iMin = Math.min(charSequence2.length(), i7 + 10);
                        int i8 = i7;
                        while (i8 < iMin) {
                            char cCharAt5 = charSequence2.charAt(i8);
                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                break;
                            }
                            i8++;
                        }
                        if (i8 <= i7 || i8 - i7 > 9 || i8 >= charSequence2.length() || !(charSequence2.charAt(i8) == '.' || charSequence2.charAt(i8) == ')')) {
                            t9dVar = null;
                        } else {
                            int i9 = (i8 + 1) - i7;
                            t9dVar = new t9d(charSequence2.charAt(i8), i9, i9);
                        }
                    }
                    if (t9dVar == null) {
                        v9dVarK = null;
                    } else {
                        char c = t9dVar.b;
                        int i10 = t9dVar.c;
                        if (!z || '0' > (cCharAt2 = charSequence.charAt(i6)) || cCharAt2 >= ':') {
                            i = i6 + t9dVar.f33555a;
                            i2 = i;
                            i3 = 0;
                            while (i2 < charSequence.length()) {
                                cCharAt = charSequence.charAt(i2);
                                if (cCharAt == ' ') {
                                    if (cCharAt == '\t') {
                                        break;
                                    }
                                    i3 = (4 - (i3 % 4)) + i3;
                                } else {
                                    i3++;
                                }
                                i2++;
                            }
                            if (!z && i2 == charSequence.length()) {
                                v9dVarK = null;
                            } else if (1 > i3 && i3 < 5 && i2 < charSequence.length()) {
                                v9dVarK = obb.K(this, iE + i10 + i3, c, i2);
                            } else if ((i3 >= 5 || i2 >= charSequence.length()) && i2 != charSequence.length()) {
                                v9dVarK = null;
                            } else {
                                v9dVarK = obb.K(this, iE + i10 + 1, c, Math.min(i2, i + 1));
                            }
                        } else {
                            int i11 = i6;
                            while (i11 < charSequence.length() && '0' <= (cCharAt3 = charSequence.charAt(i11)) && cCharAt3 < ':') {
                                i11++;
                            }
                            Integer intOrNull = StringsKt.toIntOrNull(charSequence.subSequence(i6, i11).toString());
                            if (intOrNull != null && intOrNull.intValue() == 1) {
                                i = i6 + t9dVar.f33555a;
                                i2 = i;
                                i3 = 0;
                                while (i2 < charSequence.length()) {
                                    cCharAt = charSequence.charAt(i2);
                                    if (cCharAt == ' ') {
                                        if (cCharAt == '\t') {
                                            break;
                                            break;
                                        }
                                        i3 = (4 - (i3 % 4)) + i3;
                                    } else {
                                        i3++;
                                    }
                                    i2++;
                                }
                                if (!z) {
                                    if (1 > i3) {
                                        if (i3 >= 5) {
                                            v9dVarK = null;
                                        } else {
                                            v9dVarK = null;
                                        }
                                        v9dVarK = obb.K(this, iE + i10 + 1, c, Math.min(i2, i + 1));
                                    } else {
                                        if (i3 >= 5) {
                                            v9dVarK = null;
                                        } else {
                                            v9dVarK = null;
                                        }
                                        v9dVarK = obb.K(this, iE + i10 + 1, c, Math.min(i2, i + 1));
                                    }
                                } else if (1 > i3) {
                                    if (i3 >= 5) {
                                        v9dVarK = null;
                                    } else {
                                        v9dVarK = null;
                                    }
                                    v9dVarK = obb.K(this, iE + i10 + 1, c, Math.min(i2, i + 1));
                                } else {
                                    if (i3 >= 5) {
                                        v9dVarK = null;
                                    } else {
                                        v9dVarK = null;
                                    }
                                    v9dVarK = obb.K(this, iE + i10 + 1, c, Math.min(i2, i + 1));
                                }
                            } else {
                                v9dVarK = null;
                            }
                        }
                    }
                }
                if (v9dVarK != null) {
                    return v9dVarK;
                }
                int i12 = 0;
                while (i5 < charSequence.length() && charSequence.charAt(i5) == ' ' && i12 < 3) {
                    i12++;
                    i5++;
                }
                if (i5 == charSequence.length() || charSequence.charAt(i5) != '>') {
                    return v9dVar;
                }
                int i13 = i5 + 1;
                if (i13 >= charSequence.length() || charSequence.charAt(i13) == ' ' || charSequence.charAt(i13) == '\t') {
                    if (i13 < charSequence.length()) {
                        i13 = i5 + 2;
                    }
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                return obb.K(this, i12 + 1 + i4, '>', i13);
            }
        }
        return null;
    }

    public final v9d b(k810 k810Var) {
        if (k810Var == null) {
            return e;
        }
        if (k810Var.b == -1) {
            return d(k810Var.d, null);
        }
        throw new byw("given " + k810Var);
    }

    public final boolean c(int i) {
        Iterable iterableO = l1e0.o(0, i);
        if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
            Iterator it = iterableO.iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                if (this.b[iNextInt] != '>' && this.c[iNextInt]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v9d d(CharSequence charSequence, bt40 bt40Var) {
        int i;
        v9d v9dVar = this;
        CharSequence charSequence2 = charSequence;
        int[] iArr = v9dVar.f37030a;
        int length = iArr.length;
        if (length != 0) {
            int[] iArr2 = new int[length];
            char[] cArr = new char[length];
            boolean[] zArr = new boolean[length];
            kie0 kie0Var = new kie0();
            kie0 kie0Var2 = new kie0();
            kie0 kie0Var3 = new kie0();
            u9d u9dVar = new u9d(kie0Var3, kie0Var, charSequence2, kie0Var2);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int iIntValue = 0;
            while (i3 < length) {
                kie0Var2.f18333a = i2;
                kie0Var3.f18333a = i2;
                boolean z = i2;
                int i5 = kie0Var.f18333a;
                int[] iArr3 = iArr;
                char[] cArr2 = v9dVar.b;
                Integer numValueOf = null;
                if (cArr2[i3] == '>') {
                    int i6 = i5;
                    int i7 = z ? 1 : 0;
                    while (true) {
                        if (i7 < 3 && i6 < charSequence2.length()) {
                            i = i7;
                            if (charSequence2.charAt(i6) != ' ') {
                                break;
                            }
                            i7 = (i == true ? 1 : 0) + 1;
                            i6++;
                        } else {
                            i = i7;
                            break;
                        }
                    }
                    if (i6 < charSequence2.length() && charSequence2.charAt(i6) == '>') {
                        numValueOf = Integer.valueOf(i + 1);
                    }
                    if (numValueOf == null) {
                        break;
                    }
                    kie0Var.f18333a = numValueOf.intValue() + kie0Var.f18333a;
                    i3++;
                }
                int i8 = i3;
                while (i8 < length && cArr2[i8] != '>') {
                    if (!((Boolean) u9dVar.invoke(Integer.valueOf(iArr3[i8] - (i8 == 0 ? z ? 1 : 0 : iArr3[i8 - 1])))).booleanValue()) {
                        break;
                    }
                    i8++;
                }
                if (numValueOf == null && i3 == i8) {
                    break;
                }
                if (numValueOf != null) {
                    boolean zBooleanValue = ((Boolean) u9dVar.invoke(1)).booleanValue();
                    if (bt40Var != null) {
                        int iIntValue2 = numValueOf.intValue() + i5;
                        Integer numValueOf2 = Integer.valueOf(i5);
                        if (kie0Var.f18333a > iIntValue2) {
                            iIntValue2++;
                        }
                        bt40Var.invoke(numValueOf2, Integer.valueOf(iIntValue2));
                    }
                    iIntValue += numValueOf.intValue() + (zBooleanValue ? 1 : 0);
                    iArr2[i4] = iIntValue;
                    cArr[i4] = '>';
                    zArr[i4] = 1;
                    i4++;
                }
                while (i3 < i8) {
                    iIntValue += iArr3[i3] - (i3 == 0 ? z ? 1 : 0 : iArr3[i3 - 1]);
                    iArr2[i4] = iIntValue;
                    cArr[i4] = cArr2[i3];
                    zArr[i4] = z;
                    i4++;
                    i3++;
                }
                charSequence2 = charSequence;
                i3 = i8;
                i2 = z ? 1 : 0;
                iArr = iArr3;
                kie0Var2 = kie0Var2;
                v9dVar = this;
            }
            if (i4 != 0) {
                return i4 == length ? new v9d(iArr2, cArr, zArr, kie0Var.f18333a) : new v9d(Arrays.copyOf(iArr2, i4), Arrays.copyOf(cArr, i4), Arrays.copyOf(zArr, i4), kie0Var.f18333a);
            }
        }
        return e;
    }

    public final int e() {
        int[] iArr = this.f37030a;
        Integer numValueOf = iArr.length == 0 ? null : Integer.valueOf(iArr[iArr.length - 1]);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final boolean f(v9d v9dVar) {
        v9dVar.getClass();
        int length = this.f37030a.length;
        int length2 = v9dVar.f37030a.length;
        if (length >= length2) {
            Iterable iterableO = l1e0.o(0, length2);
            if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
                return true;
            }
            Iterator it = iterableO.iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                if (this.b[iNextInt] != v9dVar.b[iNextInt]) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return "MdConstraints: " + new String(this.b) + '(' + e() + ')';
    }
}
