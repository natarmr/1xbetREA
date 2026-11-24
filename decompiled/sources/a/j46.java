package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j46 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15869a;
    public final /* synthetic */ l46 b;

    public /* synthetic */ j46(l46 l46Var, byte b) {
        this.f15869a = b;
        this.b = l46Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15869a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                r9i r9iVar = l46Var.L1;
                if (r9iVar != null) {
                    return new q0h0(r9iVar);
                }
                Intrinsics.h("baseVerificationViewModelFactory");
                throw null;
            default:
                kl5 kl5Var = l46.O1;
                ((k3t0) l46Var.N1.getValue()).x(i46.f14131a);
                return Unit.f46060a;
        }
    }
}
