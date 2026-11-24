package a;

/* JADX INFO: loaded from: classes4.dex */
public final class otj extends lm40 implements ehl {
    public final gy40 o;
    public boolean p;
    public boolean q;
    public boolean r;

    public otj(gy40 gy40Var) {
        this.o = gy40Var;
    }

    @Override // a.lm40
    public final void R0() {
        qjj.W(N0(), null, null, new hij(this, null, (byte) 1), 3);
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        g7zVar.a();
        a6a a6aVar = g7zVar.f10839a;
        if (this.p) {
            fhl.u(g7zVar, y3d.c(0.3f, y3d.b), 0L, a6aVar.d(), 0.0f, null, null, 0, 122);
        } else if (this.q || this.r) {
            fhl.u(g7zVar, y3d.c(0.1f, y3d.b), 0L, a6aVar.d(), 0.0f, null, null, 0, 122);
        }
    }
}
