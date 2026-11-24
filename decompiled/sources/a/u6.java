package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u6 extends c2 {
    public static u6 e;
    public static final xsf0 f = xsf0.b;
    public static final xsf0 g = xsf0.f41414a;
    public a9q0 c;
    public tai0 d;

    @Override // a.c2
    public final int[] D(int i) {
        int iE;
        if (r().length() > 0 && i > 0) {
            try {
                tai0 tai0Var = this.d;
                if (tai0Var == null) {
                    Intrinsics.h("node");
                    throw null;
                }
                jge0 jge0VarG = tai0Var.g();
                int iRound = Math.round(jge0VarG.d - jge0VarG.b);
                int length = r().length();
                if (length <= i) {
                    i = length;
                }
                a9q0 a9q0Var = this.c;
                if (a9q0Var == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                int iD = a9q0Var.b.d(i);
                a9q0 a9q0Var2 = this.c;
                if (a9q0Var2 == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                float f2 = a9q0Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    a9q0 a9q0Var3 = this.c;
                    if (a9q0Var3 == null) {
                        Intrinsics.h("layoutResult");
                        throw null;
                    }
                    iE = a9q0Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == r().length() && iE < iD) {
                    iE++;
                }
                return n(Q(iE, f), i);
            } catch (IllegalStateException unused) {
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
        int iE;
        if (r().length() > 0 && i < r().length()) {
            try {
                tai0 tai0Var = this.d;
                if (tai0Var == null) {
                    Intrinsics.h("node");
                    throw null;
                }
                jge0 jge0VarG = tai0Var.g();
                int iRound = Math.round(jge0VarG.d - jge0VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                a9q0 a9q0Var = this.c;
                if (a9q0Var == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                int iD = a9q0Var.b.d(i);
                a9q0 a9q0Var2 = this.c;
                if (a9q0Var2 == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                float f2 = a9q0Var2.b.f(iD) + iRound;
                a9q0 a9q0Var3 = this.c;
                if (a9q0Var3 == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                bw40 bw40Var = a9q0Var3.b;
                float f3 = bw40Var.f(bw40Var.f - 1);
                a9q0 a9q0Var4 = this.c;
                if (f2 < f3) {
                    if (a9q0Var4 == null) {
                        Intrinsics.h("layoutResult");
                        throw null;
                    }
                    iE = a9q0Var4.b.e(f2);
                } else {
                    if (a9q0Var4 == null) {
                        Intrinsics.h("layoutResult");
                        throw null;
                    }
                    iE = a9q0Var4.b.f;
                }
                return n(i, Q(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
