package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bp90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2971a;
    public final /* synthetic */ ep90 b;

    public /* synthetic */ bp90(ep90 ep90Var, byte b) {
        this.f2971a = b;
        this.b = ep90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2971a;
        ep90 ep90Var = this.b;
        switch (b) {
            case 0:
                tni tniVar = ep90Var.Y1;
                if (tniVar != null) {
                    return new q0h0(tniVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jh70 jh70Var = ep90.c2;
                ep90Var.K0().x(mn90.f22078a);
                return Unit.f46060a;
            case 2:
                jh70 jh70Var2 = ep90.c2;
                ep90Var.K0().x(nn90.f23811a);
                return Unit.f46060a;
            case 3:
                jh70 jh70Var3 = ep90.c2;
                ep90Var.K0().x(on90.f25537a);
                return Unit.f46060a;
            default:
                jh70 jh70Var4 = ep90.c2;
                ep90Var.K0().x(pn90.f27277a);
                return Unit.f46060a;
        }
    }
}
