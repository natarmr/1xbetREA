package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zru0 extends jvv {
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final q96 F0 = new q96();
    public r96 G0 = null;

    @Override // a.jvv
    public final void Y() {
        for (int i = 0; i < this.v0; i++) {
            k4e k4eVar = this.u0[i];
            if (k4eVar != null) {
                k4eVar.G = true;
            }
        }
    }

    public void Z(int i, int i2, int i3, int i4) {
        int iS = this.A0 + this.B0;
        int iM = this.w0 + this.x0;
        if (this.v0 > 0) {
            iS += this.u0[0].s();
            iM += this.u0[0].m();
        }
        int iMax = Math.max(this.d0, iS);
        int iMax2 = Math.max(this.e0, iM);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.D0 = i2;
        this.E0 = i4;
        T(i2);
        O(i4);
        this.C0 = this.v0 > 0;
    }

    public final void a0(k4e k4eVar, j4e j4eVar, int i, j4e j4eVar2, int i2) {
        r96 r96Var;
        k4e k4eVar2;
        while (true) {
            r96Var = this.G0;
            if (r96Var != null || (k4eVar2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((l4e) k4eVar2).y0;
            }
        }
        q96 q96Var = this.F0;
        q96Var.f28332a = j4eVar;
        q96Var.b = j4eVar2;
        q96Var.c = i;
        q96Var.d = i2;
        r96Var.b(k4eVar, q96Var);
        k4eVar.T(q96Var.e);
        k4eVar.O(q96Var.f);
        k4eVar.F = q96Var.h;
        k4eVar.K(q96Var.g);
    }
}
