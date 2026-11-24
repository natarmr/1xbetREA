package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pi9 implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y99 f27033a = wtn.f39750a;
    public psc b;
    public g7z c;
    public vb8 d;

    public final psc a(Function1 function1) {
        return b(new xz8(function1, (byte) 9));
    }

    public final psc b(Function1 function1) {
        psc pscVar = new psc((byte) 28);
        pscVar.b = function1;
        this.b = pscVar;
        return pscVar;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f27033a.getDensity().getDensity();
    }

    @Override // a.w6k
    public final float v0() {
        return this.f27033a.getDensity().v0();
    }
}
