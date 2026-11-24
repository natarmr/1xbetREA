package a;

/* JADX INFO: loaded from: classes2.dex */
public final class uck extends ndk implements thy {
    public final a8z r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uck(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        super(ihyVar, d0d0Var, rgyVar);
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        this.r = maz.a(wez.f39042a, new v9k(this, (byte) 5));
    }

    @Override // a.ndk
    /* JADX INFO: renamed from: D */
    public final ndk H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new uck(ihyVar, z(), rgyVar);
    }

    @Override // a.ndk, a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new uck(ihyVar, z(), rgyVar);
    }

    @Override // a.uhy
    public final phy e() {
        return (tck) this.r.getValue();
    }

    @Override // a.thy
    public final void k(Object obj, Object obj2) {
        ((tck) this.r.getValue()).call(obj, obj2);
    }

    @Override // a.thy, a.uhy
    public final shy e() {
        return (tck) this.r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uck(ihy ihyVar, String str, String str2, Object obj) {
        super(ihyVar, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.r = maz.a(wez.f39042a, new v9k(this, (byte) 5));
    }
}
