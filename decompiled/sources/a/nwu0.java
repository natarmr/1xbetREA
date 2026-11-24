package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nwu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24253a;
    public final /* synthetic */ pwu0 b;

    public /* synthetic */ nwu0(pwu0 pwu0Var, byte b) {
        this.f24253a = b;
        this.b = pwu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24253a;
        pwu0 pwu0Var = this.b;
        switch (b) {
            case 0:
                svs0 svs0Var = pwu0.q2;
                fiu0 fiu0Var = pwu0Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                vcc.f0(i120.U(), pwu0Var, pwu0Var.n2.n(pwu0Var, pwu0.r2[2]));
                return Unit.f46060a;
            case 2:
                svs0 svs0Var2 = pwu0.q2;
                ((k3t0) pwu0Var.p2.getValue()).x(kwu0.f19020a);
                return Unit.f46060a;
            default:
                svs0 svs0Var3 = pwu0.q2;
                ((k3t0) pwu0Var.p2.getValue()).x(lwu0.f20781a);
                return Unit.f46060a;
        }
    }
}
