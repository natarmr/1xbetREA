package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yry extends qsy implements uhy {
    public final a8z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yry(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, dqyVar, rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        this.n = maz.a(wez.f39042a, new aaw(this, (byte) 20));
    }

    @Override // a.qsy, a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new yry(ihyVar, this.d, op9.NO_RECEIVER, this.f, rgyVar);
    }

    @Override // a.uhy
    public final phy e() {
        return (xry) this.n.getValue();
    }
}
