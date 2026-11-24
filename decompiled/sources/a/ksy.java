package a;

/* JADX INFO: loaded from: classes2.dex */
public class ksy extends osy implements eiy {
    public final a8z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksy(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, dqyVar, rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.m = maz.a(wezVar, new isy(this, (byte) 0));
        maz.a(wezVar, new isy(this, (byte) 1));
    }

    @Override // a.dre0
    public dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new ksy(ihyVar, this.d, op9.NO_RECEIVER, this.f, rgyVar);
    }

    @Override // a.iiy
    public final ciy d() {
        return (jsy) this.m.getValue();
    }

    @Override // a.eiy
    public final Object get() {
        return ((jsy) this.m.getValue()).call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // a.osy
    public final fsy u() {
        return (jsy) this.m.getValue();
    }

    @Override // a.iiy
    public final diy d() {
        return (jsy) this.m.getValue();
    }
}
