package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ij10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14852a;
    public final /* synthetic */ lj10 b;

    public /* synthetic */ ij10(lj10 lj10Var, byte b) {
        this.f14852a = b;
        this.b = lj10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14852a;
        yje yjeVar = null;
        lj10 lj10Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = lj10.O1;
                fiu0 fiu0Var = lj10Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("luckyCardViewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = lj10.O1;
                uj10 uj10Var = (uj10) lj10Var.M1.getValue();
                sac.V(jiu0.a(uj10Var), new pf10(1, uj10Var, uj10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, uj10Var.c.b, new juy(uj10Var, yjeVar, (byte) 22), 10);
                return Unit.f46060a;
        }
    }
}
