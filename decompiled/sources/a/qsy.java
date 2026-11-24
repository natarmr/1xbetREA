package a;

/* JADX INFO: loaded from: classes2.dex */
public class qsy extends osy {
    public final a8z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsy(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, dqyVar, rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        this.m = maz.a(wez.f39042a, new aaw(this, (byte) 23));
    }

    @Override // a.dre0
    public dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new qsy(ihyVar, this.d, op9.NO_RECEIVER, this.f, rgyVar);
    }

    @Override // a.iiy
    public final ciy d() {
        return (psy) this.m.getValue();
    }

    @Override // a.osy
    public final fsy u() {
        return (psy) this.m.getValue();
    }
}
