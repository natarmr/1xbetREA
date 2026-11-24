package kotlin.text;

import a.c99;
import a.l1e0;
import a.n6k;
import a.r3d;
import a.rx3;
import a.twn;
import a.tx3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends c {
    public static final int A(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? B(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int B(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.a aVarI;
        if (z2) {
            int iT = StringsKt.T(charSequence);
            if (i > iT) {
                i = iT;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVarI = l1e0.i(i, i2);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVarI = new IntRange(i, i2, 1);
        }
        int i3 = aVarI.c;
        int i4 = aVarI.b;
        int i5 = aVarI.f46068a;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            boolean z3 = z;
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                boolean z4 = z3;
                z3 = z4;
                if (D(charSequence4, 0, charSequence3, i5, charSequence2.length(), z4)) {
                    return i5;
                }
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        } else {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z5 = z;
                if (c.p(0, i6, str.length(), str, (String) charSequence, z5)) {
                    return i6;
                }
                if (i6 == i4) {
                    return -1;
                }
                i6 += i3;
                z = z5;
            }
        }
    }

    public static final int C(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(tx3.V(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a.b(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static final boolean D(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void E(int i) {
        if (i >= 0) {
            return;
        }
        c99.s(twn.m(i, "Limit must be non-negative, but was "));
    }

    public static final List F(int i, CharSequence charSequence, String str, boolean z) {
        E(i);
        int length = 0;
        int iA = A(0, charSequence, str, z);
        if (iA == -1 || i == 1) {
            return kotlin.collections.a.c(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iA).toString());
            length = str.length() + iA;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iA = A(length, charSequence, str, z);
        } while (iA != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, final boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return F(i, charSequence, str, z);
            }
        }
        E(i);
        final List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        n6k<IntRange> n6kVar = new n6k(charSequence, i, new Function2() { // from class: kotlin.text.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                Pair pair;
                String str2;
                Pair pair2;
                boolean z2;
                Object next2;
                CharSequence charSequence2 = (CharSequence) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                charSequence2.getClass();
                List list = listAsList;
                boolean z3 = z;
                if (z3 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = intRange.c;
                    int i4 = intRange.b;
                    if (z4) {
                        if ((i3 > 0 && iIntValue <= i4) || (i3 < 0 && i4 <= iIntValue)) {
                            int i5 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = z3;
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    String str3 = (String) next2;
                                    z2 = z3;
                                    if (c.p(0, i5, str3.length(), str3, (String) charSequence2, z2)) {
                                        break;
                                    }
                                    z3 = z2;
                                }
                                String str4 = (String) next2;
                                if (str4 != null) {
                                    pair = new Pair(Integer.valueOf(i5), str4);
                                    pair2 = pair;
                                } else if (i5 != i4) {
                                    i5 += i3;
                                    z3 = z2;
                                }
                            }
                        }
                    } else {
                        if ((i3 > 0 && iIntValue <= i4) || (i3 < 0 && i4 <= iIntValue)) {
                            int i6 = iIntValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    str2 = (String) next;
                                } while (!StringsKt__StringsKt.D(str2, 0, charSequence2, i6, str2.length(), z3));
                                String str5 = (String) next;
                                if (str5 != null) {
                                    pair = new Pair(Integer.valueOf(i6), str5);
                                    pair2 = pair;
                                } else if (i6 != i4) {
                                    i6 += i3;
                                }
                            }
                        }
                    }
                } else {
                    String str6 = (String) CollectionsKt.u0(list);
                    int iV = StringsKt.V(charSequence2, str6, iIntValue, false, 4);
                    pair2 = iV < 0 ? null : new Pair(Integer.valueOf(iV), str6);
                }
                if (pair2 != null) {
                    return new Pair(pair2.f46059a, Integer.valueOf(((String) pair2.b).length()));
                }
                return null;
            }
        });
        ArrayList arrayList = new ArrayList(r3d.q(new rx3(n6kVar, (byte) 3), 10));
        for (IntRange intRange : n6kVar) {
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.f46068a, intRange.b + 1).toString());
        }
        return arrayList;
    }

    public static final boolean z(int i, CharSequence charSequence) {
        charSequence.getClass();
        return i >= 0 && i <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }
}
