package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wry extends nsy implements thy {
    public final a8z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wry(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, dqyVar, rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        this.n = maz.a(wez.f39042a, new aaw(this, (byte) 19));
    }

    @Override // a.nsy, a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new wry(ihyVar, this.d, op9.NO_RECEIVER, this.f, rgyVar);
    }

    @Override // a.uhy
    public final phy e() {
        return (vry) this.n.getValue();
    }

    @Override // a.thy
    public final void k(Object obj, Object obj2) {
        ((vry) this.n.getValue()).call(obj, obj2);
    }

    @Override // a.thy, a.uhy
    public final shy e() {
        return (vry) this.n.getValue();
    }
}
