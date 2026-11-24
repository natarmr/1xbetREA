package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qw8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29423a;
    public final /* synthetic */ uw8 b;

    public /* synthetic */ qw8(uw8 uw8Var, byte b) {
        this.f29423a = b;
        this.b = uw8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29423a;
        uw8 uw8Var = this.b;
        switch (b) {
            case 0:
                oai oaiVar = uw8Var.K1;
                if (oaiVar != null) {
                    return new q0h0(oaiVar);
                }
                Intrinsics.h("brandsGamesViewModelFactory");
                throw null;
            default:
                cl5 cl5Var = uw8.S1;
                uw8Var.G0().x(zt8.f44944a);
                return Unit.f46060a;
        }
    }
}
