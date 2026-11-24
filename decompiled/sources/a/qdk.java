package a;

/* JADX INFO: loaded from: classes2.dex */
public class qdk extends rdk implements hiy {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdk(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        super(ihyVar, d0d0Var, rgyVar);
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.q = maz.a(wezVar, new odk(this, (byte) 0));
        maz.a(wezVar, new odk(this, (byte) 1));
    }

    @Override // a.rdk
    public final fdk C() {
        return (pdk) this.q.getValue();
    }

    @Override // a.dre0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public qdk H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new qdk(ihyVar, z(), rgyVar);
    }

    @Override // a.iiy
    public final pdk d() {
        return (pdk) this.q.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pdk) this.q.getValue()).call(obj, obj2);
    }

    @Override // a.iiy
    public final ciy d() {
        return (pdk) this.q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdk(ihy ihyVar, String str, String str2) {
        super(ihyVar, str, str2, op9.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        wez wezVar = wez.f39042a;
        this.q = maz.a(wezVar, new odk(this, (byte) 0));
        maz.a(wezVar, new odk(this, (byte) 1));
    }
}
