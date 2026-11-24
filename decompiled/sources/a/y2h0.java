package a;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class y2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f41904a;
    public static final bet0 b;
    public static final bet0 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        c5d0 c5d0Var = c5d0.c;
        bet0 bet0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f41904a = cls;
        try {
            c5d0 c5d0Var2 = c5d0.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                bet0Var = (bet0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = bet0Var;
        c = new bet0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += syc.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (syc.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (syc.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += syc.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += syc.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += syc.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += syc.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += syc.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += syc.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(bet0 bet0Var, Object obj, Object obj2) {
        bet0Var.getClass();
        mjt mjtVar = (mjt) obj;
        ydt0 ydt0Var = mjtVar.unknownFields;
        ydt0 ydt0Var2 = ((mjt) obj2).unknownFields;
        ydt0 ydt0Var3 = ydt0.f;
        if (!ydt0Var3.equals(ydt0Var2)) {
            if (ydt0Var3.equals(ydt0Var)) {
                int i = ydt0Var.f42457a + ydt0Var2.f42457a;
                int[] iArrCopyOf = Arrays.copyOf(ydt0Var.b, i);
                System.arraycopy(ydt0Var2.b, 0, iArrCopyOf, ydt0Var.f42457a, ydt0Var2.f42457a);
                Object[] objArrCopyOf = Arrays.copyOf(ydt0Var.c, i);
                System.arraycopy(ydt0Var2.c, 0, objArrCopyOf, ydt0Var.f42457a, ydt0Var2.f42457a);
                ydt0Var = new ydt0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ydt0Var.getClass();
                if (!ydt0Var2.equals(ydt0Var3)) {
                    if (!ydt0Var.e) {
                        e9d0.b();
                        return;
                    }
                    int i2 = ydt0Var.f42457a + ydt0Var2.f42457a;
                    ydt0Var.a(i2);
                    System.arraycopy(ydt0Var2.b, 0, ydt0Var.b, ydt0Var.f42457a, ydt0Var2.f42457a);
                    System.arraycopy(ydt0Var2.c, 0, ydt0Var.c, ydt0Var.f42457a, ydt0Var2.f42457a);
                    ydt0Var.f42457a = i2;
                }
            }
        }
        mjtVar.unknownFields = ydt0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += syc.j(((Integer) list.get(i3)).intValue());
        }
        sycVar.D(iJ);
        while (i2 < list.size()) {
            sycVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += syc.j(((Integer) list.get(i3)).intValue());
        }
        sycVar.D(iJ);
        while (i2 < list.size()) {
            sycVar.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += syc.j(((Long) list.get(i3)).longValue());
        }
        sycVar.D(iJ);
        while (i2 < list.size()) {
            sycVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                sycVar.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += syc.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            sycVar.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                sycVar.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += syc.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        sycVar.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            sycVar.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += syc.i(((Integer) list.get(i4)).intValue());
        }
        sycVar.D(i3);
        while (i2 < list.size()) {
            sycVar.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, yqc yqcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        syc sycVar = (syc) yqcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                sycVar.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        sycVar.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += syc.j(((Long) list.get(i3)).longValue());
        }
        sycVar.D(iJ);
        while (i2 < list.size()) {
            sycVar.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, bmx bmxVar, Object obj2, bet0 bet0Var) {
        return obj2;
    }
}
