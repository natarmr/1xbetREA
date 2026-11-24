package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21678a;
    public final /* synthetic */ rv2 b;

    public /* synthetic */ mf4(rv2 rv2Var, byte b) {
        this.f21678a = b;
        this.b = rv2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21678a;
        rv2 rv2Var = this.b;
        uag0 uag0Var = (uag0) obj;
        uag0Var.getClass();
        switch (b) {
            case 0:
                uag0Var.I(rv2Var.f());
                break;
            case 1:
                uag0Var.I(rv2Var.f());
                break;
            default:
                float fD = rv2Var.d().d(rv2Var.e.getValue());
                agk0 agk0Var = rv2Var.f;
                float fL = Float.isNaN(agk0Var.l()) ? fD : agk0Var.l();
                if (!Float.isNaN(fD) && !Float.isNaN(fL)) {
                    uag0Var.I(fL - fD);
                }
                break;
        }
        return Unit.f46060a;
    }
}
