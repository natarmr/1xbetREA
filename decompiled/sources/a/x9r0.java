package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x9r0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40521a;
    public final /* synthetic */ y9r0 b;

    public /* synthetic */ x9r0(y9r0 y9r0Var, byte b) {
        this.f40521a = b;
        this.b = y9r0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40521a;
        y9r0 y9r0Var = this.b;
        switch (b) {
            case 0:
                String str = y9r0.m2;
                fiu0 fiu0Var = y9r0Var.k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                String str2 = y9r0.m2;
                ((k3t0) y9r0Var.l2.getValue()).x(w9r0.f38795a);
                return Unit.f46060a;
        }
    }
}
