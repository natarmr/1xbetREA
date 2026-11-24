package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ao00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1178a;
    public final /* synthetic */ co00 b;

    public /* synthetic */ ao00(co00 co00Var, byte b) {
        this.f1178a = b;
        this.b = co00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1178a;
        co00 co00Var = this.b;
        switch (b) {
            case 0:
                xuz xuzVar = co00.R1;
                co00Var.G0().x(uk00.f35804a);
                return Unit.f46060a;
            case 1:
                k8i k8iVar = co00Var.M1;
                if (k8iVar != null) {
                    return new q0h0(k8iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                xuz xuzVar2 = co00.R1;
                co00Var.G0().x(nk00.f23659a);
                return Unit.f46060a;
        }
    }
}
