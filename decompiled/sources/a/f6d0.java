package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f6d0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9004a;
    public final /* synthetic */ h6d0 b;

    public /* synthetic */ f6d0(h6d0 h6d0Var, byte b) {
        this.f9004a = b;
        this.b = h6d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f9004a;
        h6d0 h6d0Var = this.b;
        switch (b) {
            case 0:
                nh70 nh70Var = h6d0.Q1;
                fiu0 fiu0Var = h6d0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nh70 nh70Var2 = h6d0.Q1;
                h6d0Var.J0().y();
                return Unit.f46060a;
            case 2:
                nh70 nh70Var3 = h6d0.Q1;
                h6d0Var.G0();
                return Unit.f46060a;
            case 3:
                nh70 nh70Var4 = h6d0.Q1;
                h6d0Var.J0().w();
                return Unit.f46060a;
            default:
                nh70 nh70Var5 = h6d0.Q1;
                r6d0 r6d0VarJ0 = h6d0Var.J0();
                p7m0 p7m0Var = r6d0VarJ0.k;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, o6d0.a((o6d0) value, null, false, true, 9)));
                sac.V(jiu0.a(r6d0VarJ0), new n6d0(r6d0VarJ0, (byte) 0), null, r6d0VarJ0.g.b, new q6d0(r6d0VarJ0, null, (byte) 1), 10);
                return Unit.f46060a;
        }
    }
}
