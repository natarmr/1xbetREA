package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sck extends kdk implements rhy {
    public final a8z r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sck(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        super(ihyVar, d0d0Var, rgyVar);
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        this.r = maz.a(wez.f39042a, new v9k(this, (byte) 4));
    }

    @Override // a.kdk
    /* JADX INFO: renamed from: D */
    public final kdk H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new sck(ihyVar, z(), rgyVar);
    }

    @Override // a.kdk, a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new sck(ihyVar, z(), rgyVar);
    }

    @Override // a.uhy
    public final phy e() {
        return (rck) this.r.getValue();
    }

    @Override // a.rhy
    public final void set(Object obj) {
        ((rck) this.r.getValue()).call(obj);
    }

    @Override // a.rhy, a.uhy
    public final qhy e() {
        return (rck) this.r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sck(ihy ihyVar, String str, String str2, Object obj) {
        super(ihyVar, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.r = maz.a(wez.f39042a, new v9k(this, (byte) 4));
    }
}
