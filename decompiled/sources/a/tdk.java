package a;

/* JADX INFO: loaded from: classes2.dex */
public class tdk extends rdk {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdk(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        super(ihyVar, d0d0Var, rgyVar);
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        this.q = maz.a(wez.f39042a, new v9k(this, (byte) 8));
    }

    @Override // a.rdk
    public final fdk C() {
        return (sdk) this.q.getValue();
    }

    @Override // a.dre0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public tdk H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new tdk(ihyVar, z(), rgyVar);
    }

    @Override // a.iiy
    public final ciy d() {
        return (sdk) this.q.getValue();
    }
}
