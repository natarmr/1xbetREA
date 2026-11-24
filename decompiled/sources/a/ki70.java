package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ki70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18324a;
    public final /* synthetic */ oi70 b;

    public /* synthetic */ ki70(oi70 oi70Var, byte b) {
        this.f18324a = b;
        this.b = oi70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18324a;
        oi70 oi70Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = oi70.P1;
                i1w0 i1w0VarF = a4n0.f(oi70Var);
                p6i p6iVar = oi70Var.L1;
                if (p6iVar != null) {
                    return new ry3(i1w0VarF, p6iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                mi70 mi70Var2 = oi70.P1;
                vi70 vi70Var = (vi70) oi70Var.N1.getValue();
                if (!vi70Var.g.a() || vi70Var.h.a()) {
                    sac.V(jiu0.a(vi70Var), ti70.f33996a, null, vi70Var.c.f22085a, new ku60(vi70Var, gle.f11486a, null, (byte) 23), 10);
                }
                return Unit.f46060a;
        }
    }
}
