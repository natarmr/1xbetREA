package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hby extends eby {
    public final pby e;
    public final iby f;
    public final gac g;
    public final Object h;

    public hby(pby pbyVar, iby ibyVar, gac gacVar, Object obj) {
        this.e = pbyVar;
        this.f = ibyVar;
        this.g = gacVar;
        this.h = obj;
    }

    @Override // a.eby
    public final boolean l() {
        return false;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        gac gacVar = this.g;
        gac gacVarQ = pby.Q(gacVar);
        pby pbyVar = this.e;
        iby ibyVar = this.f;
        Object obj = this.h;
        if (gacVarQ == null || !pbyVar.a0(ibyVar, gacVarQ, obj)) {
            ibyVar.f14512a.d(new wc00(2), 2);
            gac gacVarQ2 = pby.Q(gacVar);
            if (gacVarQ2 == null || !pbyVar.a0(ibyVar, gacVarQ2, obj)) {
                pbyVar.o(pbyVar.A(ibyVar, obj));
            }
        }
    }
}
