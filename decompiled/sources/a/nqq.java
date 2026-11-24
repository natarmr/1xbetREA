package a;

import android.os.Trace;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nqq extends lm40 implements vld, fe60, rm40, yzj {
    public final boolean o;
    public final Function2 p;
    public boolean q;
    public boolean r;
    public final int s;
    public ezg0 t;

    public nqq(int i, Function2 function2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        function2 = (i2 & 4) != 0 ? null : function2;
        this.o = z;
        this.p = function2;
        this.s = i;
    }

    public static boolean i1(nqq nqqVar) {
        return nqqVar.h1(7);
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.fe60
    public final void R() {
        f1();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // a.lm40
    public final void S0() {
        ypq ypqVar;
        int iOrdinal = e1().ordinal();
        if (iOrdinal == 0) {
            ypqVar = (ypq) vcc.a0(this).getFocusOwner();
            ypqVar.d(8, true, false);
            if (this.o) {
                ypqVar.f43042a.E();
            }
            ypqVar.d.a();
        } else if (iOrdinal == 1) {
            wpq focusOwner = vcc.a0(this).getFocusOwner();
            nqq nqqVarZ = uzb.Z(this);
            if (nqqVarZ != null && nqqVarZ.o) {
                ypq ypqVar2 = (ypq) focusOwner;
                ypqVar2.f43042a.E();
                ypqVar2.d.a();
            }
        } else if (iOrdinal == 2) {
            ypqVar = (ypq) vcc.a0(this).getFocusOwner();
            ypqVar.d(8, true, false);
            if (this.o) {
                ypqVar.f43042a.E();
            }
            ypqVar.d.a();
        } else if (iOrdinal != 3) {
            t9f.b();
            return;
        }
        ezg0 ezg0Var = this.t;
        if (ezg0Var != null) {
            ((nvu) ezg0Var).W();
        }
        this.t = null;
    }

    @Override // a.lm40
    public final void T0() {
        if (e1().b()) {
            ((ypq) vcc.a0(this).getFocusOwner()).d(8, true, true);
        }
    }

    public final boolean Z0(int i) {
        int iOrdinal = qzb.L0(this, i).ordinal();
        if (iOrdinal == 0) {
            return qzb.M0(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        t9f.b();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void a1(iqq iqqVar, iqq iqqVar2) {
        tzi tziVar;
        Function2 function2;
        ypq ypqVar = (ypq) vcc.a0(this).getFocusOwner();
        nqq nqqVarH = ypqVar.h();
        if (!iqqVar.equals(iqqVar2) && (function2 = this.p) != null) {
            function2.invoke(iqqVar, iqqVar2);
        }
        lm40 lm40Var = this.f20279a;
        if (!lm40Var.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var2 = this.f20279a;
        e7z e7zVarZ = vcc.Z(this);
        while (e7zVarZ != null) {
            if ((((lm40) e7zVarZ.h1.g).d & 5120) != 0) {
                while (lm40Var2 != null) {
                    int i = lm40Var2.c;
                    if ((i & 5120) != 0) {
                        if (lm40Var2 != lm40Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? V = lm40Var2;
                            ?? xz40Var = 0;
                            while (V != 0) {
                                if (V instanceof lpq) {
                                    lpq lpqVar = (lpq) V;
                                    if (nqqVarH == ypqVar.h()) {
                                        lpqVar.L(iqqVar2);
                                    }
                                } else if ((V.c & 4096) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var3 = ((f3k) V).p;
                                    int i2 = 0;
                                    V = V;
                                    xz40Var = xz40Var;
                                    while (lm40Var3 != null) {
                                        if ((lm40Var3.c & 4096) != 0) {
                                            i2++;
                                            xz40Var = xz40Var;
                                            if (i2 == 1) {
                                                V = lm40Var3;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var3);
                                            }
                                        }
                                        lm40Var3 = lm40Var3.f;
                                        V = V;
                                        xz40Var = xz40Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                    }
                    lm40Var2 = lm40Var2.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var2 = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final aqq b1() {
        boolean z;
        tzi tziVar;
        aqq aqqVar = new aqq();
        aqqVar.f1309a = true;
        cqq cqqVar = cqq.b;
        aqqVar.b = cqqVar;
        aqqVar.c = cqqVar;
        aqqVar.d = cqqVar;
        aqqVar.e = cqqVar;
        aqqVar.f = cqqVar;
        aqqVar.g = cqqVar;
        aqqVar.h = cqqVar;
        aqqVar.i = cqqVar;
        aqqVar.j = new rnp((byte) 15);
        aqqVar.k = new rnp((byte) 16);
        aqqVar.l = jtv.j;
        int i = this.s;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((zex) ((hgk0) ((bfx) ((afx) mbc.R(this, bmd.m))).f2526a).getValue()).f44275a == 1);
        } else {
            if (i != 2) {
                jf4.n("Unknown Focusability");
                return null;
            }
            z = false;
        }
        aqqVar.f1309a = z;
        lm40 lm40Var = this.f20279a;
        if (!lm40Var.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var2 = this.f20279a;
        e7z e7zVarZ = vcc.Z(this);
        loop0: while (e7zVarZ != null) {
            if ((((lm40) e7zVarZ.h1.g).d & 3072) != 0) {
                while (lm40Var2 != null) {
                    int i2 = lm40Var2.c;
                    if ((i2 & 3072) != 0) {
                        if (lm40Var2 != lm40Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? xz40Var = 0;
                            ?? V = lm40Var2;
                            while (V != 0) {
                                if (V instanceof bqq) {
                                    ((bqq) V).n(aqqVar);
                                } else if ((V.c & 2048) != 0 && (V instanceof f3k)) {
                                    lm40 lm40Var3 = ((f3k) V).p;
                                    int i3 = 0;
                                    V = V;
                                    xz40Var = xz40Var;
                                    while (lm40Var3 != null) {
                                        if ((lm40Var3.c & 2048) != 0) {
                                            i3++;
                                            xz40Var = xz40Var;
                                            if (i3 == 1) {
                                                V = lm40Var3;
                                            } else {
                                                if (xz40Var == 0) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (V != 0) {
                                                    xz40Var.b(V);
                                                    V = 0;
                                                }
                                                xz40Var.b(lm40Var3);
                                            }
                                        }
                                        lm40Var3 = lm40Var3.f;
                                        V = V;
                                        xz40Var = xz40Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                V = vcc.V(xz40Var);
                            }
                        }
                    }
                    lm40Var2 = lm40Var2.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var2 = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
        return aqqVar;
    }

    public final jge0 c1(j6z j6zVar) {
        jge0 jge0Var = b1().l;
        if (jge0Var != jtv.j) {
            return j6zVar == null ? jge0Var : jge0Var.m(j6zVar.F(vcc.Y(this), 0L));
        }
        return j6zVar != null ? j6zVar.w(vcc.Y(this), false) : k9x.r(0L, n2x.Q(vcc.Y(this).c));
    }

    public final taz d1() {
        tzi tziVar;
        Object obj;
        if (!this.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var = this.f20279a.e;
        e7z e7zVarZ = vcc.Z(this);
        loop0: while (e7zVarZ != null) {
            if ((((lm40) e7zVarZ.h1.g).d & 8388640) != 0) {
                while (lm40Var != null) {
                    int i = lm40Var.c;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(lm40Var instanceof taz)) {
                                if (lm40Var instanceof f3k) {
                                    lm40Var = null;
                                    for (lm40 lm40Var2 = ((f3k) lm40Var).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                        if (lm40Var2 instanceof taz) {
                                            lm40Var = lm40Var2;
                                        }
                                    }
                                } else {
                                    lm40Var = null;
                                }
                            }
                            taz tazVar = (taz) lm40Var;
                            if (tazVar != null) {
                                return tazVar;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (lm40Var instanceof rm40) {
                                obj = lm40Var;
                            } else if (lm40Var instanceof f3k) {
                                obj = null;
                                for (lm40 lm40Var3 = ((f3k) lm40Var).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                    if (lm40Var3 instanceof rm40) {
                                        obj = lm40Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            rm40 rm40Var = (rm40) obj;
                            if (rm40Var != null && rm40Var.I().D(x4d0.f40260a)) {
                                return (taz) rm40Var.I().E();
                            }
                        }
                    }
                    lm40Var = lm40Var.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
        return null;
    }

    public final iqq e1() {
        tzi tziVar;
        if (!this.n) {
            return iqq.c;
        }
        nqq nqqVarH = ((ypq) vcc.a0(this).getFocusOwner()).h();
        if (nqqVarH == null) {
            return iqq.c;
        }
        if (this == nqqVarH) {
            return iqq.f15221a;
        }
        if (nqqVarH.n) {
            if (!nqqVarH.f20279a.n) {
                xcx.b("visitAncestors called on an unattached node");
            }
            lm40 lm40Var = nqqVarH.f20279a.e;
            e7z e7zVarZ = vcc.Z(nqqVarH);
            while (e7zVarZ != null) {
                if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                    while (lm40Var != null) {
                        if ((lm40Var.c & 1024) != 0) {
                            lm40 lm40VarV = lm40Var;
                            xz40 xz40Var = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof nqq) {
                                    if (this == ((nqq) lm40VarV)) {
                                        return iqq.b;
                                    }
                                } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                    int i = 0;
                                    for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                        if ((lm40Var2.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lm40VarV = lm40Var2;
                                            } else {
                                                if (xz40Var == null) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var.b(lm40Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var);
                            }
                        }
                        lm40Var = lm40Var.e;
                    }
                }
                e7zVarZ = e7zVarZ.v();
                lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
            }
        }
        return iqq.c;
    }

    public final void f1() {
        int iOrdinal = e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                t9f.b();
                return;
            }
        }
        mie0 mie0Var = new mie0();
        c9x.B(this, new gmo(mie0Var, this, (byte) 14));
        Object obj = mie0Var.f21842a;
        if (obj == null) {
            Intrinsics.h("focusProperties");
            throw null;
        }
        if (((zpq) obj).d()) {
            return;
        }
        ((ypq) vcc.a0(this).getFocusOwner()).b(true);
    }

    public final boolean h1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return b1().f1309a ? Z0(i) : k7n0.t(this, i, new dx2(i, (byte) 16));
        } finally {
            Trace.endSection();
        }
    }

    @Override // a.lm40
    public final void R0() {
    }

    public final void g1() {
    }
}
