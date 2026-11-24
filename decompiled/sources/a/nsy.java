package a;

/* JADX INFO: loaded from: classes2.dex */
public class nsy extends osy implements giy {
    public final a8z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsy(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, dqyVar, rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.m = maz.a(wezVar, new lsy(this, (byte) 0));
        maz.a(wezVar, new lsy(this, (byte) 1));
    }

    @Override // a.dre0
    public dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new nsy(ihyVar, this.d, op9.NO_RECEIVER, this.f, rgyVar);
    }

    @Override // a.iiy
    public final ciy d() {
        return (msy) this.m.getValue();
    }

    @Override // a.giy
    public final Object get(Object obj) {
        return ((msy) this.m.getValue()).call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // a.osy
    public final fsy u() {
        return (msy) this.m.getValue();
    }

    @Override // a.iiy
    public final fiy d() {
        return (msy) this.m.getValue();
    }
}
