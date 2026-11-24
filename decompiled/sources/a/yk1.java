package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yk1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42765a;
    public final /* synthetic */ cl1 b;

    public /* synthetic */ yk1(cl1 cl1Var, byte b) {
        this.f42765a = b;
        this.b = cl1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42765a;
        cl1 cl1Var = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = cl1.o2;
                fiu0 fiu0Var = cl1Var.m2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gfk0 gfk0Var2 = cl1.o2;
                cl1Var.n0().r().t0(i120.V(new Pair("RESULT_TOURNAMENT_PAGE", s9s0.b)), "REQUEST_KEY_TOURNAMENT_ACTION");
                cl1Var.x0();
                return Unit.f46060a;
            default:
                gfk0 gfk0Var3 = cl1.o2;
                cl1Var.n0().r().t0(i120.V(new Pair("RESULT_TOURNAMENT_PAGE", s9s0.d)), "REQUEST_KEY_TOURNAMENT_ACTION");
                cl1Var.x0();
                return Unit.f46060a;
        }
    }
}
