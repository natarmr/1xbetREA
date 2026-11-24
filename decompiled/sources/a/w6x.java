package a;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w6x {
    public static void A(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static void a(int i, y78 y78Var, ar20 ar20Var) {
        if (i == 1) {
            ar20Var.getClass();
            y78 y78Var2 = (y78) y78Var.c;
            ((ArrayList) y78Var2.c).add(new sgi0(new IntRange(y78Var.b, y78Var2.b, 1), ar20Var));
        } else {
            if (i == 2) {
                ar20Var.getClass();
                return;
            }
            ar20Var.getClass();
            if (i == 3) {
                throw new UnsupportedOperationException("Should not be invoked");
            }
        }
    }

    public static /* synthetic */ boolean b(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static int c(int i, int i2, int i3, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    public static int d(o0x o0xVar, int i, int i2) {
        return (o0xVar.hashCode() + i) * i2;
    }

    public static int e(pj30 pj30Var, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(pj30Var.S(j));
        return i + i2;
    }

    public static int f(r040 r040Var, int i, int i2) {
        return (r040Var.hashCode() + i) * i2;
    }

    public static int g(i8m0 i8m0Var, int i, int i2) {
        return (i8m0Var.hashCode() + i) * i2;
    }

    public static int h(j9m0 j9m0Var, int i, int i2) {
        return (j9m0Var.hashCode() + i) * i2;
    }

    public static rsy i(String str) {
        adx.b(str);
        return new rsy();
    }

    public static jo20 j(int i, jo20 jo20Var, String str) {
        jo20Var.put(str, Integer.valueOf(i));
        return jo20Var.b();
    }

    public static jfk0 k(ams0 ams0Var, fet fetVar, int i, boolean z) {
        ams0Var.getClass();
        fetVar.e0(i);
        jfk0 jfk0Var = new jfk0();
        fetVar.r(z);
        return jfk0Var;
    }

    public static ank0 l(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        arrayList.addAll(arrayList2);
        return new ank0(arrayList3);
    }

    public static Object m(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        return animatedValue;
    }

    public static String n(int i, int i2, String str) {
        return i + str + i2;
    }

    public static String o(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String p(String str, ank0 ank0Var, String str2) {
        return str + ank0Var + str2;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(Object[] objArr, int i, lsm0 lsm0Var, int i2, String str) {
        return lsm0Var.a(i2, Arrays.copyOf(objArr, i)).concat(str);
    }

    public static StringBuilder s(String str, iz30 iz30Var, String str2, boolean z, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(iz30Var);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, String str2, List list, String str3, List list2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(list2);
        sb.append(str3);
        return sb;
    }

    public static void u(int i, int i2, int i3, int i4, int i5) {
        u7x.c(i);
        u7x.c(i2);
        u7x.c(i3);
        u7x.c(i4);
        u7x.c(i5);
    }

    public static void v(int i, xdr xdrVar, mm40 mm40Var, fet fetVar, boolean z) {
        xdrVar.F(mm40Var, fetVar, Integer.valueOf(i));
        fetVar.r(z);
    }

    public static void w(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(a4x a4xVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
    }

    public static void y(r040 r040Var, String str, String str2) {
        r040Var.getClass();
        str.getClass();
        str2.getClass();
    }

    public static void z(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
    }
}
