package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vah0 extends f3k implements vld, fe60 {
    public yzj A;
    public bz2 B;
    public az2 Y;
    public boolean Z;
    public bch0 q;
    public ma80 r;
    public boolean s;
    public boolean t;
    public qkq u;
    public gy40 v;
    public j39 w;
    public boolean x;
    public vf80 y;
    public lbh0 z;

    @Override // a.yzj
    public final void H() {
        boolean zD1 = d1();
        if (this.Z != zD1) {
            this.Z = zD1;
            bch0 bch0Var = this.q;
            ma80 ma80Var = this.r;
            boolean z = this.x;
            vf80 vf80Var = z ? this.Y : this.y;
            e1(this.w, this.u, this.v, ma80Var, vf80Var, bch0Var, z, this.s, this.t);
        }
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.fe60
    public final void R() {
        bz2 bz2Var = (bz2) mbc.R(this, xf80.f40779a);
        if (Intrinsics.d(bz2Var, this.B)) {
            return;
        }
        this.B = bz2Var;
        this.Y = null;
        yzj yzjVar = this.A;
        if (yzjVar != null) {
            a1(yzjVar);
        }
        this.A = null;
        c1();
        lbh0 lbh0Var = this.z;
        if (lbh0Var != null) {
            bch0 bch0Var = this.q;
            ma80 ma80Var = this.r;
            vf80 vf80Var = this.x ? this.Y : this.y;
            lbh0Var.u1(this.w, this.u, this.v, ma80Var, vf80Var, bch0Var, this.s, this.Z);
        }
    }

    @Override // a.lm40
    public final void R0() {
        this.Z = d1();
        c1();
        if (this.z == null) {
            bch0 bch0Var = this.q;
            vf80 vf80Var = this.x ? this.Y : this.y;
            lbh0 lbh0Var = new lbh0(this.w, this.u, this.v, this.r, vf80Var, bch0Var, this.s, this.Z);
            Z0(lbh0Var);
            this.z = lbh0Var;
        }
    }

    @Override // a.lm40
    public final void S0() {
        yzj yzjVar = this.A;
        if (yzjVar != null) {
            a1(yzjVar);
        }
    }

    public final void c1() {
        yzj yzjVar = this.A;
        if (yzjVar != null) {
            if (((lm40) yzjVar).f20279a.n) {
                return;
            }
            Z0(yzjVar);
            return;
        }
        if (this.x) {
            c9x.B(this, new a7g0(this, (byte) 17));
        }
        vf80 vf80Var = this.x ? this.Y : this.y;
        if (vf80Var != null) {
            yzj yzjVarA = vf80Var.a();
            if (((lm40) yzjVarA).f20279a.n) {
                return;
            }
            Z0(yzjVarA);
            this.A = yzjVarA;
        }
    }

    public final boolean d1() {
        k6z k6zVar = k6z.f17794a;
        if (this.n) {
            k6zVar = vcc.Z(this).A;
        }
        ma80 ma80Var = this.r;
        boolean z = this.t;
        return (k6zVar != k6z.b || ma80Var == ma80.f21447a) ? !z : z;
    }

    public final void e1(j39 j39Var, qkq qkqVar, gy40 gy40Var, ma80 ma80Var, vf80 vf80Var, bch0 bch0Var, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.q = bch0Var;
        this.r = ma80Var;
        boolean z5 = true;
        if (this.x != z) {
            this.x = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (Intrinsics.d(this.y, vf80Var)) {
            z5 = false;
        } else {
            this.y = vf80Var;
        }
        if (z4 || (z5 && !z)) {
            yzj yzjVar = this.A;
            if (yzjVar != null) {
                a1(yzjVar);
            }
            this.A = null;
            c1();
        }
        this.s = z2;
        this.t = z3;
        this.u = qkqVar;
        this.v = gy40Var;
        this.w = j39Var;
        boolean zD1 = d1();
        this.Z = zD1;
        lbh0 lbh0Var = this.z;
        if (lbh0Var != null) {
            lbh0Var.u1(j39Var, qkqVar, gy40Var, ma80Var, this.x ? this.Y : this.y, bch0Var, z2, zD1);
        }
    }
}
