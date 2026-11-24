package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3551a;
    public final /* synthetic */ e11 b;

    public /* synthetic */ c11(e11 e11Var, byte b) {
        this.f3551a = b;
        this.b = e11Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3551a;
        e11 e11Var = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = e11.W1;
                e11Var.G0().x(f01.f8696a);
                return Unit.f46060a;
            default:
                qek0 qek0Var2 = e11.W1;
                fiu0 fiu0Var = e11Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
