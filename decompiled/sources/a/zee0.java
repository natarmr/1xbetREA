package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zee0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44246a;
    public final /* synthetic */ bfe0 b;

    public /* synthetic */ zee0(bfe0 bfe0Var, byte b) {
        this.f44246a = b;
        this.b = bfe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44246a;
        bfe0 bfe0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = bfe0.R1;
                bfe0Var.G0().x(gee0.f11152a);
                return Unit.f46060a;
            default:
                rl70 rl70Var2 = bfe0.R1;
                fiu0 fiu0Var = bfe0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
