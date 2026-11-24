package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t6 extends c2 {
    public static t6 d;
    public static final xsf0 e = xsf0.b;
    public static final xsf0 f = xsf0.f41414a;
    public a9q0 c;

    @Override // a.c2
    public final int[] D(int i) {
        int iD;
        if (r().length() > 0 && i > 0) {
            int length = r().length();
            a9q0 a9q0Var = this.c;
            xsf0 xsf0Var = f;
            if (i > length) {
                if (a9q0Var == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                iD = a9q0Var.b.d(r().length());
            } else {
                if (a9q0Var == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                int iD2 = a9q0Var.b.d(i);
                iD = Q(iD2, xsf0Var) + 1 == i ? iD2 : iD2 - 1;
            }
            if (iD >= 0) {
                return n(Q(iD, e), Q(iD, xsf0Var) + 1);
            }
        }
        return null;
    }

    public final int Q(int i, xsf0 xsf0Var) {
        a9q0 a9q0Var = this.c;
        if (a9q0Var == null) {
            Intrinsics.h("layoutResult");
            throw null;
        }
        int i2 = a9q0Var.i(i);
        a9q0 a9q0Var2 = this.c;
        if (a9q0Var2 == null) {
            Intrinsics.h("layoutResult");
            throw null;
        }
        xsf0 xsf0VarJ = a9q0Var2.j(i2);
        a9q0 a9q0Var3 = this.c;
        if (xsf0Var != xsf0VarJ) {
            if (a9q0Var3 != null) {
                return a9q0Var3.i(i);
            }
            Intrinsics.h("layoutResult");
            throw null;
        }
        if (a9q0Var3 != null) {
            return a9q0Var3.b.c(i, false) - 1;
        }
        Intrinsics.h("layoutResult");
        throw null;
    }

    @Override // a.c2
    public final int[] j(int i) {
        int iD;
        if (r().length() > 0 && i < r().length()) {
            a9q0 a9q0Var = this.c;
            xsf0 xsf0Var = e;
            if (i < 0) {
                if (a9q0Var == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                iD = a9q0Var.b.d(0);
            } else {
                if (a9q0Var == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                int iD2 = a9q0Var.b.d(i);
                iD = Q(iD2, xsf0Var) == i ? iD2 : iD2 + 1;
            }
            a9q0 a9q0Var2 = this.c;
            if (a9q0Var2 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            if (iD < a9q0Var2.b.f) {
                return n(Q(iD, xsf0Var), Q(iD, f) + 1);
            }
        }
        return null;
    }
}
