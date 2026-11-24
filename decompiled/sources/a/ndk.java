package a;

/* JADX INFO: loaded from: classes2.dex */
public class ndk extends rdk implements giy {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndk(ihy ihyVar, d0d0 d0d0Var, rgy rgyVar) {
        super(ihyVar, d0d0Var, rgyVar);
        ihyVar.getClass();
        d0d0Var.getClass();
        rgyVar.getClass();
        wez wezVar = wez.f39042a;
        this.q = maz.a(wezVar, new ldk(this, (byte) 0));
        maz.a(wezVar, new ldk(this, (byte) 1));
    }

    @Override // a.rdk
    public final fdk C() {
        return (mdk) this.q.getValue();
    }

    @Override // a.dre0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public ndk H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new ndk(ihyVar, z(), rgyVar);
    }

    @Override // a.iiy
    public final ciy d() {
        return (mdk) this.q.getValue();
    }

    @Override // a.giy
    public final Object get(Object obj) {
        return ((mdk) this.q.getValue()).call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // a.iiy
    public final fiy d() {
        return (mdk) this.q.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndk(ihy ihyVar, String str, String str2, Object obj) {
        super(ihyVar, str, str2, obj);
        str.getClass();
        str2.getClass();
        wez wezVar = wez.f39042a;
        this.q = maz.a(wezVar, new ldk(this, (byte) 0));
        maz.a(wezVar, new ldk(this, (byte) 1));
    }
}
