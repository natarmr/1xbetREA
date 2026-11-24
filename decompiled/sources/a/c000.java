package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c000 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3500a;
    public final /* synthetic */ f000 b;

    public /* synthetic */ c000(f000 f000Var, byte b) {
        this.f3500a = b;
        this.b = f000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3500a;
        f000 f000Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = f000.O1;
                fiu0 fiu0Var = f000Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                atz atzVar2 = f000.O1;
                f000Var.G0().x(rzz.f31385a);
                return Unit.f46060a;
        }
    }
}
