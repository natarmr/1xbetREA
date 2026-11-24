package a;

/* JADX INFO: loaded from: classes2.dex */
public class kdk extends rdk implements eiy {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        super(ihyVar, d0d0Var, rgyVar);
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.q = maz.a(wezVar, new idk(this, (byte) 0));
        maz.a(wezVar, new idk(this, (byte) 1));
    }

    @Override // a.rdk
    public final fdk C() {
        return (jdk) this.q.getValue();
    }

    @Override // a.dre0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public kdk H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new kdk(ihyVar, z(), rgyVar);
    }

    @Override // a.iiy
    public final ciy d() {
        return (jdk) this.q.getValue();
    }

    @Override // a.eiy
    public final Object get() {
        return ((jdk) this.q.getValue()).call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // a.iiy
    public final diy d() {
        return (jdk) this.q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(ihy ihyVar, String str, String str2, Object obj) {
        super(ihyVar, str, str2, obj);
        str.getClass();
        str2.getClass();
        wez wezVar = wez.f39042a;
        this.q = maz.a(wezVar, new idk(this, (byte) 0));
        maz.a(wezVar, new idk(this, (byte) 1));
    }
}
