package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class da1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5726a;
    public final /* synthetic */ ea1 b;

    public /* synthetic */ da1(ea1 ea1Var, byte b) {
        this.f5726a = b;
        this.b = ea1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5726a;
        ea1 ea1Var = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = ea1.n2;
                fiu0 fiu0Var = ea1Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gfk0 gfk0Var2 = ea1.n2;
                ea1Var.P0().x(y91.f42223a);
                return Unit.f46060a;
            default:
                gfk0 gfk0Var3 = ea1.n2;
                ea1Var.P0().x(z91.f43995a);
                return Unit.f46060a;
        }
    }
}
