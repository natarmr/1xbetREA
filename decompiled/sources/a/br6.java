package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class br6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3062a;
    public final /* synthetic */ er6 b;

    public /* synthetic */ br6(er6 er6Var, byte b) {
        this.f3062a = b;
        this.b = er6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3062a;
        er6 er6Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = er6Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kl5 kl5Var = er6.S1;
                er6Var.H0().B();
                return Unit.f46060a;
        }
    }
}
