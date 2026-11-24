package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class snb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32485a;
    public final /* synthetic */ xnb b;

    public /* synthetic */ snb(xnb xnbVar, byte b) {
        this.f32485a = b;
        this.b = xnbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32485a;
        xnb xnbVar = this.b;
        switch (b) {
            case 0:
                kj5 kj5Var = xnb.w2;
                vcc.f0(i120.V(new Pair("RESULT_ON_PAYMENT_OPENED_KEY", Boolean.TRUE)), xnbVar, xnbVar.R0());
                return Unit.f46060a;
            case 1:
                kj5 kj5Var2 = xnb.w2;
                vcc.f0(i120.V(new Pair("RESULT_ON_ADD_ACCOUNT_OPENED_KEY", Boolean.TRUE)), xnbVar, xnbVar.R0());
                return Unit.f46060a;
            case 2:
                kj5 kj5Var3 = xnb.w2;
                xnbVar.S0().y();
                return Unit.f46060a;
            case 3:
                fiu0 fiu0Var = xnbVar.t2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                return xnbVar.o();
        }
    }
}
