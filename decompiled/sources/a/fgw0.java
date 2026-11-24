package a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fgw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek0 f9515a;

    static {
        int i = ldw0.f19874a;
        f9515a = new pek0();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        mew0 mew0Var = (mew0) obj;
        mgw0 mgw0Var = mew0Var.zzc;
        mgw0 mgw0Var2 = ((mew0) obj2).zzc;
        mgw0 mgw0Var3 = mgw0.f;
        if (!mgw0Var3.equals(mgw0Var2)) {
            if (mgw0Var3.equals(mgw0Var)) {
                int i = mgw0Var.f21761a + mgw0Var2.f21761a;
                int[] iArrCopyOf = Arrays.copyOf(mgw0Var.b, i);
                System.arraycopy(mgw0Var2.b, 0, iArrCopyOf, mgw0Var.f21761a, mgw0Var2.f21761a);
                Object[] objArrCopyOf = Arrays.copyOf(mgw0Var.c, i);
                System.arraycopy(mgw0Var2.c, 0, objArrCopyOf, mgw0Var.f21761a, mgw0Var2.f21761a);
                mgw0Var = new mgw0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                mgw0Var.getClass();
                if (!mgw0Var2.equals(mgw0Var3)) {
                    if (!mgw0Var.e) {
                        e9d0.b();
                        return;
                    }
                    int i2 = mgw0Var.f21761a + mgw0Var2.f21761a;
                    mgw0Var.e(i2);
                    System.arraycopy(mgw0Var2.b, 0, mgw0Var.b, mgw0Var.f21761a, mgw0Var2.f21761a);
                    System.arraycopy(mgw0Var2.c, 0, mgw0Var.c, mgw0Var.f21761a, mgw0Var2.f21761a);
                    mgw0Var.f21761a = i2;
                }
            }
        }
        mew0Var.zzc = mgw0Var;
    }

    public static Object c(Object obj, int i, xew0 xew0Var, edw0 edw0Var, Object obj2, pek0 pek0Var) {
        if (edw0Var == null) {
            return obj2;
        }
        if (xew0Var == null) {
            Iterator it = xew0Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!edw0Var.a(iIntValue)) {
                    if (obj2 == null) {
                        pek0Var.getClass();
                        obj2 = pek0.o(obj);
                    }
                    pek0Var.getClass();
                    ((mgw0) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = xew0Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) xew0Var.get(i3);
            int iIntValue2 = num.intValue();
            if (edw0Var.a(iIntValue2)) {
                if (i3 != i2) {
                    xew0Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    pek0Var.getClass();
                    obj2 = pek0.o(obj);
                }
                pek0Var.getClass();
                ((mgw0) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            xew0Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aew0Var.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        aew0Var.r(i3);
        while (i2 < list.size()) {
            aew0Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aew0Var.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        aew0Var.r(i3);
        while (i2 < list.size()) {
            aew0Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void f(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof dfw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += aew0.b(((Long) list.get(i3)).longValue());
            }
            aew0Var.r(iB);
            while (i2 < list.size()) {
                aew0Var.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dfw0 dfw0Var = (dfw0) list;
        if (!z) {
            while (i2 < dfw0Var.c) {
                aew0Var.h(i, dfw0Var.c(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < dfw0Var.c; i4++) {
            iB2 += aew0.b(dfw0Var.c(i4));
        }
        aew0Var.r(iB2);
        while (i2 < dfw0Var.c) {
            aew0Var.t(dfw0Var.c(i2));
            i2++;
        }
    }

    public static void g(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof dfw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += aew0.b(((Long) list.get(i3)).longValue());
            }
            aew0Var.r(iB);
            while (i2 < list.size()) {
                aew0Var.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dfw0 dfw0Var = (dfw0) list;
        if (!z) {
            while (i2 < dfw0Var.c) {
                aew0Var.h(i, dfw0Var.c(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < dfw0Var.c; i4++) {
            iB2 += aew0.b(dfw0Var.c(i4));
        }
        aew0Var.r(iB2);
        while (i2 < dfw0Var.c) {
            aew0Var.t(dfw0Var.c(i2));
            i2++;
        }
    }

    public static void h(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof dfw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    aew0Var.h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iB += aew0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            aew0Var.r(iB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                aew0Var.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        dfw0 dfw0Var = (dfw0) list;
        if (!z) {
            while (i2 < dfw0Var.c) {
                long jC = dfw0Var.c(i2);
                aew0Var.h(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < dfw0Var.c; i4++) {
            long jC2 = dfw0Var.c(i4);
            iB2 += aew0.b((jC2 >> 63) ^ (jC2 + jC2));
        }
        aew0Var.r(iB2);
        while (i2 < dfw0Var.c) {
            long jC3 = dfw0Var.c(i2);
            aew0Var.t((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void i(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof dfw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            aew0Var.r(i3);
            while (i2 < list.size()) {
                aew0Var.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dfw0 dfw0Var = (dfw0) list;
        if (!z) {
            while (i2 < dfw0Var.c) {
                aew0Var.i(i, dfw0Var.c(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dfw0Var.c; i6++) {
            dfw0Var.c(i6);
            i5 += 8;
        }
        aew0Var.r(i5);
        while (i2 < dfw0Var.c) {
            aew0Var.u(dfw0Var.c(i2));
            i2++;
        }
    }

    public static void j(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof dfw0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            aew0Var.r(i3);
            while (i2 < list.size()) {
                aew0Var.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dfw0 dfw0Var = (dfw0) list;
        if (!z) {
            while (i2 < dfw0Var.c) {
                aew0Var.i(i, dfw0Var.c(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dfw0Var.c; i6++) {
            dfw0Var.c(i6);
            i5 += 8;
        }
        aew0Var.r(i5);
        while (i2 < dfw0Var.c) {
            aew0Var.u(dfw0Var.c(i2));
            i2++;
        }
    }

    public static void k(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof oew0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += aew0.b(((Integer) list.get(i3)).intValue());
            }
            aew0Var.r(iB);
            while (i2 < list.size()) {
                aew0Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oew0 oew0Var = (oew0) list;
        if (!z) {
            while (i2 < oew0Var.c) {
                aew0Var.e(i, oew0Var.e(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < oew0Var.c; i4++) {
            iB2 += aew0.b(oew0Var.e(i4));
        }
        aew0Var.r(iB2);
        while (i2 < oew0Var.c) {
            aew0Var.q(oew0Var.e(i2));
            i2++;
        }
    }

    public static void l(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof oew0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += aew0.a(((Integer) list.get(i3)).intValue());
            }
            aew0Var.r(iA);
            while (i2 < list.size()) {
                aew0Var.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oew0 oew0Var = (oew0) list;
        if (!z) {
            while (i2 < oew0Var.c) {
                aew0Var.f(i, oew0Var.e(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < oew0Var.c; i4++) {
            iA2 += aew0.a(oew0Var.e(i4));
        }
        aew0Var.r(iA2);
        while (i2 < oew0Var.c) {
            aew0Var.r(oew0Var.e(i2));
            i2++;
        }
    }

    public static void m(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof oew0)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    aew0Var.f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += aew0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            aew0Var.r(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                aew0Var.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        oew0 oew0Var = (oew0) list;
        if (!z) {
            while (i2 < oew0Var.c) {
                int iE = oew0Var.e(i2);
                aew0Var.f(i, (iE >> 31) ^ (iE + iE));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < oew0Var.c; i4++) {
            int iE2 = oew0Var.e(i4);
            iA2 += aew0.a((iE2 >> 31) ^ (iE2 + iE2));
        }
        aew0Var.r(iA2);
        while (i2 < oew0Var.c) {
            int iE3 = oew0Var.e(i2);
            aew0Var.r((iE3 >> 31) ^ (iE3 + iE3));
            i2++;
        }
    }

    public static void n(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof oew0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            aew0Var.r(i3);
            while (i2 < list.size()) {
                aew0Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oew0 oew0Var = (oew0) list;
        if (!z) {
            while (i2 < oew0Var.c) {
                aew0Var.g(i, oew0Var.e(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oew0Var.c; i6++) {
            oew0Var.e(i6);
            i5 += 4;
        }
        aew0Var.r(i5);
        while (i2 < oew0Var.c) {
            aew0Var.s(oew0Var.e(i2));
            i2++;
        }
    }

    public static void o(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof oew0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            aew0Var.r(i3);
            while (i2 < list.size()) {
                aew0Var.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oew0 oew0Var = (oew0) list;
        if (!z) {
            while (i2 < oew0Var.c) {
                aew0Var.g(i, oew0Var.e(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oew0Var.c; i6++) {
            oew0Var.e(i6);
            i5 += 4;
        }
        aew0Var.r(i5);
        while (i2 < oew0Var.c) {
            aew0Var.s(oew0Var.e(i2));
            i2++;
        }
    }

    public static void p(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!(list instanceof oew0)) {
            if (!z) {
                while (i2 < list.size()) {
                    aew0Var.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            aew0Var.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += aew0.b(((Integer) list.get(i3)).intValue());
            }
            aew0Var.r(iB);
            while (i2 < list.size()) {
                aew0Var.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oew0 oew0Var = (oew0) list;
        if (!z) {
            while (i2 < oew0Var.c) {
                aew0Var.e(i, oew0Var.e(i2));
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < oew0Var.c; i4++) {
            iB2 += aew0.b(oew0Var.e(i4));
        }
        aew0Var.r(iB2);
        while (i2 < oew0Var.c) {
            aew0Var.q(oew0Var.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, owp0 owp0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aew0 aew0Var = (aew0) owp0Var.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aew0Var.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        aew0Var.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        aew0Var.r(i3);
        while (i2 < list.size()) {
            aew0Var.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dfw0)) {
            int iB = 0;
            while (i < size) {
                iB += aew0.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        dfw0 dfw0Var = (dfw0) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += aew0.b(dfw0Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dfw0)) {
            int iB = 0;
            while (i < size) {
                iB += aew0.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        dfw0 dfw0Var = (dfw0) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += aew0.b(dfw0Var.c(i));
            i++;
        }
        return iB2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dfw0)) {
            int iB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iB += aew0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iB;
        }
        dfw0 dfw0Var = (dfw0) list;
        int iB2 = 0;
        while (i < size) {
            long jC = dfw0Var.c(i);
            iB2 += aew0.b((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oew0)) {
            int iB = 0;
            while (i < size) {
                iB += aew0.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        oew0 oew0Var = (oew0) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += aew0.b(oew0Var.e(i));
            i++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oew0)) {
            int iB = 0;
            while (i < size) {
                iB += aew0.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        oew0 oew0Var = (oew0) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += aew0.b(oew0Var.e(i));
            i++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oew0)) {
            int iA = 0;
            while (i < size) {
                iA += aew0.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        oew0 oew0Var = (oew0) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += aew0.a(oew0Var.e(i));
            i++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oew0)) {
            int iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += aew0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iA;
        }
        oew0 oew0Var = (oew0) list;
        int iA2 = 0;
        while (i < size) {
            int iE = oew0Var.e(i);
            iA2 += aew0.a((iE >> 31) ^ (iE + iE));
            i++;
        }
        return iA2;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (aew0.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (aew0.a(i << 3) + 8) * size;
    }
}
