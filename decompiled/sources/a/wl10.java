package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wl10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39334a;
    public final /* synthetic */ zl10 b;

    public /* synthetic */ wl10(zl10 zl10Var, byte b) {
        this.f39334a = b;
        this.b = zl10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39334a;
        zl10 zl10Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = zl10.U1;
                zl10Var.H0().x(dl10.f6258a);
                return Unit.f46060a;
            case 1:
                oki okiVar = zl10Var.K1;
                if (okiVar != null) {
                    return new q0h0(okiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                wsz wszVar2 = zl10.U1;
                zl10Var.H0().x(el10.f7978a);
                return Unit.f46060a;
            case 3:
                wsz wszVar3 = zl10.U1;
                zl10Var.H0().x(gl10.f11470a);
                return Unit.f46060a;
            case 4:
                wsz wszVar4 = zl10.U1;
                zl10Var.H0().x(tl10.f34124a);
                return Unit.f46060a;
            default:
                wsz wszVar5 = zl10.U1;
                zl10Var.H0().x(il10.f14955a);
                return Unit.f46060a;
        }
    }
}
