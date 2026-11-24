package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y2p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41917a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p6t0 c;

    public y2p0(p6t0 p6t0Var, Function1 function1) {
        this.c = p6t0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41917a;
        p6t0 p6t0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                if (((u2p0) p6t0Var).f34958a.equals("TEAM_BET_COMPLETED_MATCHES_HEADER")) {
                    function1.invoke(i2p0.f14062a);
                }
                break;
            default:
                function1.invoke(new k2p0(((o2p0) p6t0Var).c));
                break;
        }
        return Unit.f46060a;
    }

    public y2p0(Function1 function1, p6t0 p6t0Var) {
        this.b = function1;
        this.c = p6t0Var;
    }
}
