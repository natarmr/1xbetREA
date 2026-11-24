package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gee implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11151a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ gee(l7m0 l7m0Var, Function1 function1) {
        this.c = l7m0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11151a;
        l7m0 l7m0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fee.h.getClass();
                l7m0Var.getClass();
                fee feeVar = new fee(function1, l7m0Var.getValue());
                feeVar.b = l7m0Var;
                return feeVar;
            default:
                function1.invoke(p1b0.f26193a);
                x2b0 x2b0Var = (x2b0) l7m0Var.getValue();
                if (x2b0Var != null) {
                    if (x2b0Var instanceof v2b0) {
                        function1.invoke(q1b0.f27945a);
                    } else if (x2b0Var instanceof w2b0) {
                        function1.invoke(r1b0.f29671a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }

    public /* synthetic */ gee(Function1 function1, l7m0 l7m0Var) {
        this.b = function1;
        this.c = l7m0Var;
    }
}
