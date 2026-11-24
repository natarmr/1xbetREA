package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f3k extends lm40 {
    public final int o = t460.e(this);
    public lm40 p;

    @Override // a.lm40
    public final void P0() {
        super.P0();
        for (lm40 lm40Var = this.p; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.Y0(this.h);
            if (!lm40Var.n) {
                lm40Var.P0();
            }
        }
    }

    @Override // a.lm40
    public final void Q0() {
        for (lm40 lm40Var = this.p; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.Q0();
        }
        super.Q0();
    }

    @Override // a.lm40
    public final void U0() {
        super.U0();
        for (lm40 lm40Var = this.p; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.U0();
        }
    }

    @Override // a.lm40
    public final void V0() {
        for (lm40 lm40Var = this.p; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.V0();
        }
        super.V0();
    }

    @Override // a.lm40
    public final void W0() {
        super.W0();
        for (lm40 lm40Var = this.p; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.W0();
        }
    }

    @Override // a.lm40
    public final void X0(lm40 lm40Var) {
        this.f20279a = lm40Var;
        for (lm40 lm40Var2 = this.p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
            lm40Var2.X0(lm40Var);
        }
    }

    @Override // a.lm40
    public final void Y0(s460 s460Var) {
        this.h = s460Var;
        for (lm40 lm40Var = this.p; lm40Var != null; lm40Var = lm40Var.f) {
            lm40Var.Y0(s460Var);
        }
    }

    public final yzj Z0(yzj yzjVar) {
        lm40 lm40Var = ((lm40) yzjVar).f20279a;
        if (lm40Var != yzjVar) {
            lm40 lm40Var2 = yzjVar instanceof lm40 ? (lm40) yzjVar : null;
            lm40 lm40Var3 = lm40Var2 != null ? lm40Var2.e : null;
            if (lm40Var != this.f20279a || !Intrinsics.d(lm40Var3, this)) {
                jf4.n("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (lm40Var.n) {
                xcx.b("Cannot delegate to an already attached node");
            }
            lm40Var.X0(this.f20279a);
            int i = this.c;
            int iF = t460.f(lm40Var);
            lm40Var.c = iF;
            int i2 = this.c;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof v6z)) {
                xcx.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + lm40Var);
            }
            lm40Var.f = this.p;
            this.p = lm40Var;
            lm40Var.e = this;
            b1(iF | this.c, false);
            if (this.n) {
                if (i3 == 0 || (i & 2) != 0) {
                    Y0(this.h);
                } else {
                    tzi tziVar = vcc.Z(this).h1;
                    this.f20279a.Y0(null);
                    tziVar.y();
                }
                lm40Var.P0();
                lm40Var.V0();
                if (!lm40Var.n) {
                    xcx.b("autoInvalidateInsertedNode called on unattached node");
                }
                t460.a(lm40Var, -1, 1);
            }
        }
        return yzjVar;
    }

    public final void a1(yzj yzjVar) {
        lm40 lm40Var = null;
        for (lm40 lm40Var2 = this.p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
            if (lm40Var2 == yzjVar) {
                boolean z = lm40Var2.n;
                if (z) {
                    ry40 ry40Var = t460.f33304a;
                    if (!z) {
                        xcx.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    t460.a(lm40Var2, -1, 2);
                    lm40Var2.W0();
                    lm40Var2.Q0();
                }
                lm40Var2.X0(lm40Var2);
                lm40Var2.d = 0;
                lm40 lm40Var3 = lm40Var2.f;
                if (lm40Var == null) {
                    this.p = lm40Var3;
                } else {
                    lm40Var.f = lm40Var3;
                }
                lm40Var2.f = null;
                lm40Var2.e = null;
                int i = this.c;
                int iF = t460.f(this);
                b1(iF, true);
                if (this.n && (i & 2) != 0 && (iF & 2) == 0) {
                    tzi tziVar = vcc.Z(this).h1;
                    this.f20279a.Y0(null);
                    tziVar.y();
                    return;
                }
                return;
            }
            lm40Var = lm40Var2;
        }
        udk.e(yzjVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void b1(int i, boolean z) {
        lm40 lm40Var;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            lm40 lm40Var2 = this.f20279a;
            if (lm40Var2 == this) {
                this.d = i;
            }
            boolean z2 = this.n;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == lm40Var2) {
                        break;
                    } else {
                        r2 = r2.e;
                    }
                }
                if (z && r2 == lm40Var2) {
                    i = t460.f(lm40Var2);
                    lm40Var2.c = i;
                }
                int i3 = i | ((r2 == 0 || (lm40Var = r2.f) == null) ? 0 : lm40Var.d);
                for (?? r3 = r2; r3 != 0; r3 = r3.e) {
                    i3 |= r3.c;
                    r3.d = i3;
                }
            }
        }
    }
}
