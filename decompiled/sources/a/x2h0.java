package a;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f40168a;
    public static final aet0 b;
    public static final aet0 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        aet0 aet0Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f40168a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                aet0Var = (aet0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = aet0Var;
        c = new aet0();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sjx)) {
            int iA = 0;
            while (i < size) {
                iA += qyc.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        sjx sjxVar = (sjx) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += qyc.a(sjxVar.f(i));
            i++;
        }
        return iA2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qyc.c(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (qyc.c(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sjx)) {
            int iA = 0;
            while (i < size) {
                iA += qyc.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        sjx sjxVar = (sjx) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += qyc.a(sjxVar.f(i));
            i++;
        }
        return iA2;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i = 0; i < size; i++) {
            iE += qyc.e(((Long) list.get(i)).longValue());
        }
        return iE;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sjx)) {
            int iD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iD += qyc.d((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iD;
        }
        sjx sjxVar = (sjx) list;
        int iD2 = 0;
        while (i < size) {
            int iF = sjxVar.f(i);
            iD2 += qyc.d((iF >> 31) ^ (iF << 1));
            i++;
        }
        return iD2;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iE += qyc.e((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iE;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sjx)) {
            int iD = 0;
            while (i < size) {
                iD += qyc.d(((Integer) list.get(i)).intValue());
                i++;
            }
            return iD;
        }
        sjx sjxVar = (sjx) list;
        int iD2 = 0;
        while (i < size) {
            iD2 += qyc.d(sjxVar.f(i));
            i++;
        }
        return iD2;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i = 0; i < size; i++) {
            iE += qyc.e(((Long) list.get(i)).longValue());
        }
        return iE;
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
    public static void j(aet0 aet0Var, Object obj, Object obj2) {
        aet0Var.getClass();
        kjt kjtVar = (kjt) obj;
        xdt0 xdt0Var = kjtVar.unknownFields;
        xdt0 xdt0Var2 = ((kjt) obj2).unknownFields;
        xdt0 xdt0Var3 = xdt0.f;
        if (!xdt0Var3.equals(xdt0Var2)) {
            if (xdt0Var3.equals(xdt0Var)) {
                int i = xdt0Var.f40713a + xdt0Var2.f40713a;
                int[] iArrCopyOf = Arrays.copyOf(xdt0Var.b, i);
                System.arraycopy(xdt0Var2.b, 0, iArrCopyOf, xdt0Var.f40713a, xdt0Var2.f40713a);
                Object[] objArrCopyOf = Arrays.copyOf(xdt0Var.c, i);
                System.arraycopy(xdt0Var2.c, 0, objArrCopyOf, xdt0Var.f40713a, xdt0Var2.f40713a);
                xdt0Var = new xdt0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                xdt0Var.getClass();
                if (!xdt0Var2.equals(xdt0Var3)) {
                    if (!xdt0Var.e) {
                        e9d0.b();
                        return;
                    }
                    int i2 = xdt0Var.f40713a;
                    int i3 = xdt0Var2.f40713a + i2;
                    int[] iArr = xdt0Var.b;
                    if (i3 > iArr.length) {
                        int i4 = (i2 / 2) + i2;
                        if (i4 < i3) {
                            i4 = i3;
                        }
                        if (i4 < 8) {
                            i4 = 8;
                        }
                        xdt0Var.b = Arrays.copyOf(iArr, i4);
                        xdt0Var.c = Arrays.copyOf(xdt0Var.c, i4);
                    }
                    System.arraycopy(xdt0Var2.b, 0, xdt0Var.b, xdt0Var.f40713a, xdt0Var2.f40713a);
                    System.arraycopy(xdt0Var2.c, 0, xdt0Var.c, xdt0Var.f40713a, xdt0Var2.f40713a);
                    xdt0Var.f40713a = i3;
                }
            }
        }
        kjtVar.unknownFields = xdt0Var;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void l(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                qycVar.m(i, 0);
                qycVar.f(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        qycVar.n(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            qycVar.f(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void m(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                qycVar.m(i, 1);
                qycVar.j(jDoubleToRawLongBits);
                i2++;
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        qycVar.n(i3);
        while (i2 < list.size()) {
            qycVar.j(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void n(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qycVar.m(i, 0);
                qycVar.k(iIntValue);
            }
            return;
        }
        qycVar.m(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += qyc.a(((Integer) list.get(i3)).intValue());
        }
        qycVar.n(iA);
        for (int i4 = 0; i4 < list.size(); i4++) {
            qycVar.k(((Integer) list.get(i4)).intValue());
        }
    }

    public static void o(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qycVar.m(i, 5);
                qycVar.i(iIntValue);
                i2++;
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        qycVar.n(i3);
        while (i2 < list.size()) {
            qycVar.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                qycVar.m(i, 1);
                qycVar.j(jLongValue);
                i2++;
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        qycVar.n(i3);
        while (i2 < list.size()) {
            qycVar.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void q(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                qycVar.m(i, 5);
                qycVar.i(iFloatToRawIntBits);
                i2++;
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        qycVar.n(i3);
        while (i2 < list.size()) {
            qycVar.i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void r(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qycVar.m(i, 0);
                qycVar.k(iIntValue);
            }
            return;
        }
        qycVar.m(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += qyc.a(((Integer) list.get(i3)).intValue());
        }
        qycVar.n(iA);
        for (int i4 = 0; i4 < list.size(); i4++) {
            qycVar.k(((Integer) list.get(i4)).intValue());
        }
    }

    public static void s(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                qycVar.m(i, 0);
                qycVar.o(jLongValue);
            }
            return;
        }
        qycVar.m(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += qyc.e(((Long) list.get(i3)).longValue());
        }
        qycVar.n(iE);
        for (int i4 = 0; i4 < list.size(); i4++) {
            qycVar.o(((Long) list.get(i4)).longValue());
        }
    }

    public static void t(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qycVar.m(i, 5);
                qycVar.i(iIntValue);
                i2++;
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        qycVar.n(i3);
        while (i2 < list.size()) {
            qycVar.i(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void u(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                qycVar.m(i, 1);
                qycVar.j(jLongValue);
                i2++;
            }
            return;
        }
        qycVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        qycVar.n(i3);
        while (i2 < list.size()) {
            qycVar.j(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qycVar.m(i, 0);
                qycVar.n((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        qycVar.m(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iD += qyc.d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        qycVar.n(iD);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            qycVar.n((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void w(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                qycVar.m(i, 0);
                qycVar.o((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        qycVar.m(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iE += qyc.e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        qycVar.n(iE);
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            qycVar.o((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    public static void x(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qycVar.m(i, 0);
                qycVar.n(iIntValue);
            }
            return;
        }
        qycVar.m(i, 2);
        int iD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iD += qyc.d(((Integer) list.get(i3)).intValue());
        }
        qycVar.n(iD);
        for (int i4 = 0; i4 < list.size(); i4++) {
            qycVar.n(((Integer) list.get(i4)).intValue());
        }
    }

    public static void y(int i, List list, prc prcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        qyc qycVar = (qyc) prcVar.b;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                qycVar.m(i, 0);
                qycVar.o(jLongValue);
            }
            return;
        }
        qycVar.m(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += qyc.e(((Long) list.get(i3)).longValue());
        }
        qycVar.n(iE);
        for (int i4 = 0; i4 < list.size(); i4++) {
            qycVar.o(((Long) list.get(i4)).longValue());
        }
    }
}
