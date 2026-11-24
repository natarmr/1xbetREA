package a;

/* JADX INFO: loaded from: classes4.dex */
public final class hb3 extends pm80 {
    public final /* synthetic */ byte f = 1;
    public final Object g;

    public hb3(dyw dywVar) {
        this.g = dywVar;
    }

    @Override // a.pm80
    public final long i() {
        switch (this.f) {
            case 0:
                return 9205357640488583168L;
            default:
                dyw dywVar = (dyw) this.g;
                int iJ = dywVar.j();
                float f = iJ > 0 ? iJ : Float.NaN;
                int iF = dywVar.f();
                return (((long) Float.floatToRawIntBits(iF > 0 ? iF : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
        }
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        byte b = this.f;
        Object obj = this.g;
        switch (b) {
            case 0:
                fhlVar.getClass();
                fhl.r(fhlVar, (t89) obj, 0L, 0L, 0.0f, null, null, 0, 126);
                return;
            default:
                dyw dywVar = (dyw) obj;
                int iJ = dywVar.j();
                float fIntBitsToFloat = iJ > 0 ? Float.intBitsToFloat((int) (fhlVar.d() >> 32)) / iJ : 1.0f;
                int iF = dywVar.f();
                float fIntBitsToFloat2 = iF > 0 ? Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / iF : 1.0f;
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).z(fIntBitsToFloat, fIntBitsToFloat2, 0L);
                    dywVar.k(vw2.b(fhlVar.A0().i()));
                    return;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
        }
    }

    public hb3(t89 t89Var) {
        this.g = t89Var;
    }
}
