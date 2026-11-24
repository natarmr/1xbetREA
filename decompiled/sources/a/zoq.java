package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zoq extends hvv {
    public byte A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public hmq o0;
    public HashMap p0;
    public HashMap q0;
    public HashMap r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public byte z0;

    public zoq(f7m0 f7m0Var, int i) {
        super(f7m0Var, i);
        this.s0 = 0;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = (byte) 2;
        this.A0 = (byte) 2;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = -1;
        this.I0 = false;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        this.M0 = 0.5f;
        if (i == 8) {
            this.I0 = true;
        }
    }

    @Override // a.hvv, a.k3e, a.vme0, a.vuo
    public final void apply() {
        s();
        b(this.o0);
        hmq hmqVar = this.o0;
        hmqVar.Z0 = this.I0 ? 1 : 0;
        hmqVar.X0 = this.s0;
        int i = this.H0;
        if (i != -1) {
            hmqVar.Y0 = i;
        }
        int i2 = this.D0;
        if (i2 != 0) {
            hmqVar.A0 = i2;
        }
        int i3 = this.F0;
        if (i3 != 0) {
            hmqVar.w0 = i3;
        }
        int i4 = this.E0;
        if (i4 != 0) {
            hmqVar.B0 = i4;
        }
        int i5 = this.G0;
        if (i5 != 0) {
            hmqVar.x0 = i5;
        }
        int i6 = this.C0;
        if (i6 != 0) {
            hmqVar.T0 = i6;
        }
        int i7 = this.B0;
        if (i7 != 0) {
            hmqVar.U0 = i7;
        }
        float f = this.h;
        if (f != 0.5f) {
            hmqVar.N0 = f;
        }
        float f2 = this.L0;
        if (f2 != 0.5f) {
            hmqVar.P0 = f2;
        }
        float f3 = this.M0;
        if (f3 != 0.5f) {
            hmqVar.R0 = f3;
        }
        float f4 = this.i;
        if (f4 != 0.5f) {
            hmqVar.O0 = f4;
        }
        float f5 = this.J0;
        if (f5 != 0.5f) {
            hmqVar.Q0 = f5;
        }
        float f6 = this.K0;
        if (f6 != 0.5f) {
            hmqVar.S0 = f6;
        }
        byte b = this.A0;
        if (b != 2) {
            hmqVar.V0 = b;
        }
        byte b2 = this.z0;
        if (b2 != 2) {
            hmqVar.W0 = b2;
        }
        int i8 = this.t0;
        if (i8 != -1) {
            hmqVar.I0 = i8;
        }
        int i9 = this.u0;
        if (i9 != -1) {
            hmqVar.K0 = i9;
        }
        int i10 = this.v0;
        if (i10 != -1) {
            hmqVar.M0 = i10;
        }
        int i11 = this.w0;
        if (i11 != -1) {
            hmqVar.H0 = i11;
        }
        int i12 = this.x0;
        if (i12 != -1) {
            hmqVar.J0 = i12;
        }
        int i13 = this.y0;
        if (i13 != -1) {
            hmqVar.L0 = i13;
        }
        r();
    }

    @Override // a.hvv
    public final jvv s() {
        hmq hmqVar = this.o0;
        if (hmqVar != null) {
            return hmqVar;
        }
        hmq hmqVar2 = new hmq();
        this.o0 = hmqVar2;
        return hmqVar2;
    }
}
