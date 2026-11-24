package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tn6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34220a;
    public final /* synthetic */ wn6 b;

    public /* synthetic */ tn6(wn6 wn6Var, byte b) {
        this.f34220a = b;
        this.b = wn6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34220a;
        wn6 wn6Var = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = wn6.V1;
                fiu0 fiu0Var = wn6Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                bj5 bj5Var2 = wn6.V1;
                wn6Var.G0().x(kn6.f18568a);
                return Unit.f46060a;
            default:
                bj5 bj5Var3 = wn6.V1;
                wn6Var.G0().x(in6.f15058a);
                return Unit.f46060a;
        }
    }
}
