package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ie7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14618a;
    public final /* synthetic */ ke7 b;

    public /* synthetic */ ie7(ke7 ke7Var, byte b) {
        this.f14618a = b;
        this.b = ke7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14618a;
        ke7 ke7Var = this.b;
        switch (b) {
            case 0:
                z9i z9iVar = ke7Var.K1;
                if (z9iVar != null) {
                    return new q0h0(z9iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                yk5 yk5Var = ke7.R1;
                return new isz(new ur6(1, ke7Var.H0(), uf7.class, "onLimitChosen", "onLimitChosen$impl(Lorg/xplatform/responsible_game/impl/presentation/limits/adapter/LimitUiModel;)V", 0, (byte) 29));
            default:
                yk5 yk5Var2 = ke7.R1;
                uf7 uf7VarH0 = ke7Var.H0();
                sac.V(jiu0.a(uf7VarH0), new ye7(1, uf7VarH0, uf7.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), new of7(uf7VarH0, (byte) 1), null, new tf7(uf7VarH0, null, (byte) 1), 12);
                return Unit.f46060a;
        }
    }
}
