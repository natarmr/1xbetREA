package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public class tx3 extends qx3 {
    public static Object A(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        v4i0.o("Array is empty.");
        return null;
    }

    public static Object B(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange C(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int D(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Character E(int i, char[] cArr) {
        cArr.getClass();
        if (i < 0 || i >= cArr.length) {
            return null;
        }
        return Character.valueOf(cArr[i]);
    }

    public static Integer F(int[] iArr, int i) {
        iArr.getClass();
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object G(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int H(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int I(int[] iArr, int i) {
        iArr.getClass();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int J(long[] jArr, long j) {
        jArr.getClass();
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final void K(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            mtm0.a(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static String L(byte[] bArr, String str, Function1 function1, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            function1 = null;
        }
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String M(int[] iArr, String str, prc0 prc0Var, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            prc0Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (prc0Var != null) {
                sb.append((CharSequence) prc0Var.invoke(Integer.valueOf(i3)));
            } else {
                sb.append((CharSequence) String.valueOf(i3));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String N(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        K(objArr, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static Object O(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        v4i0.o("Array is empty.");
        return null;
    }

    public static int P(Object obj, Object[] objArr) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Character Q(char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static Integer R(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static int S(int[] iArr) {
        if (iArr.length == 0) {
            itt0.a();
            return 0;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static Integer T(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static int[] U(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int length = iArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                iArr2[length - i] = iArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iArr2;
    }

    public static char V(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            v4i0.o("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        jf4.o("Array has more than one element.");
        return (char) 0;
    }

    public static Object W(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            v4i0.o("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        jf4.o("Array has more than one element.");
        return null;
    }

    public static Object X(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static List Y(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final void Z(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List a0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List b0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    public static List c0(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List d0(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List e0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        int iC = 0;
        if (length == 1) {
            return kotlin.collections.a.c(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length2 = iArr.length;
        while (iC < length2) {
            iC = w6x.c(iArr[iC], iC, 1, arrayList);
        }
        return arrayList;
    }

    public static List f0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List g0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static List h0(short[] sArr) {
        int length = sArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static List i0(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList j0(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new tw3(objArr, false));
    }

    public static Set k0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return xun.f41520a;
        }
        if (length == 1) {
            return cui0.b(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wp20.a(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    public static Set l0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return xun.f41520a;
        }
        if (length == 1) {
            return cui0.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wp20.a(objArr.length));
        Z(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList m0(Object[] objArr, List list) {
        objArr.getClass();
        list.getClass();
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(r3d.q(list, 10), length));
        int i = 0;
        for (Object obj : list) {
            if (i >= length) {
                break;
            }
            arrayList.add(new Pair(objArr[i], obj));
            i++;
        }
        return arrayList;
    }

    public static ArrayList n0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static Iterable s(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? iun.f15405a : new rx3(objArr, (byte) 0);
    }

    public static Sequence t(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? wun.f39799a : new sx3(objArr, (byte) 0);
    }

    public static boolean u(Object obj, Object[] objArr) {
        objArr.getClass();
        return H(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean v(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static boolean w(int[] iArr, int i) {
        iArr.getClass();
        return I(iArr, i) >= 0;
    }

    public static boolean x(long[] jArr, long j) {
        jArr.getClass();
        return J(jArr, j) >= 0;
    }

    public static List y(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            c99.s(ua80.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            c99.s(ua80.e(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return iun.f15405a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return g0(objArr);
        }
        return length == 1 ? kotlin.collections.a.c(objArr[length2 - 1]) : qx3.c(qx3.k(objArr, length2 - length, length2));
    }

    public static List z(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
