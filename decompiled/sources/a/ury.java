package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ury extends ksy implements rhy {
    public final a8z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ury(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, dqyVar, rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        this.n = maz.a(wez.f39042a, new aaw(this, (byte) 18));
    }

    @Override // a.ksy, a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new ury(ihyVar, this.d, op9.NO_RECEIVER, this.f, rgyVar);
    }

    @Override // a.uhy
    public final phy e() {
        return (Ctry) this.n.getValue();
    }

    @Override // a.rhy
    public final void set(Object obj) throws c44 {
        ((Ctry) this.n.getValue()).call(obj);
    }

    @Override // a.rhy, a.uhy
    public final qhy e() {
        return (Ctry) this.n.getValue();
    }
}
