package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ube0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35377a;
    public final /* synthetic */ xbe0 b;

    public /* synthetic */ ube0(xbe0 xbe0Var, byte b) {
        this.f35377a = b;
        this.b = xbe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35377a;
        yje yjeVar = null;
        xbe0 xbe0Var = this.b;
        switch (b) {
            case 0:
                cri criVar = xbe0Var.K1;
                if (criVar != null) {
                    return new q0h0(criVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr = xbe0.Q1;
                return new isz(new d8e0(1, xbe0Var.H0(), nde0.class, "onLimitChosen", "onLimitChosen$impl(Lorg/xplatform/responsible_game/impl/presentation/limits/adapter/LimitUiModel;)V", 0, (byte) 2));
            default:
                iiy[] iiyVarArr2 = xbe0.Q1;
                nde0 nde0VarH0 = xbe0Var.H0();
                sac.V(jiu0.a(nde0VarH0), new jde0(nde0VarH0, (byte) 0), new p7d0(nde0VarH0, (byte) 28), null, new z8b0(nde0VarH0, yjeVar, (byte) 7), 12);
                return Unit.f46060a;
        }
    }
}
