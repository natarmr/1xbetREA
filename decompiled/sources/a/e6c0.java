package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e6c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7276a;
    public final /* synthetic */ h6c0 b;

    public /* synthetic */ e6c0(h6c0 h6c0Var, byte b) {
        this.f7276a = b;
        this.b = h6c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7276a;
        yje yjeVar = null;
        h6c0 h6c0Var = this.b;
        switch (b) {
            case 0:
                nh70 nh70Var = h6c0.W1;
                g7c0 g7c0VarI0 = h6c0Var.I0();
                sac.V(jiu0.a(g7c0VarI0), new wyb0((byte) 13), null, g7c0VarI0.h.b, new o690((w46) g7c0VarI0, yjeVar, (byte) 17), 10);
                return Unit.f46060a;
            case 1:
                nh70 nh70Var2 = h6c0.W1;
                h6c0Var.I0().y(String.valueOf(h6c0Var.H0().c.getText()), kpb.v0((ms2) h6c0Var.Q1.n(h6c0Var, h6c0.X1[0])), true);
                return Unit.f46060a;
            case 2:
                fiu0 fiu0Var = h6c0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                nh70 nh70Var3 = h6c0.W1;
                return new jt6(h6c0Var, (byte) 13);
        }
    }
}
