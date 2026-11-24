package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x79 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40403a;
    public final /* synthetic */ z79 b;

    public /* synthetic */ x79(z79 z79Var, byte b) {
        this.f40403a = b;
        this.b = z79Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40403a;
        z79 z79Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = z79Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                bj5 bj5Var = z79.O1;
                z79Var.H0().w();
                return Unit.f46060a;
        }
    }
}
