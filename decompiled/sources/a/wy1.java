package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wy1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39956a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ry1 c;

    public /* synthetic */ wy1(Function1 function1, ry1 ry1Var, byte b) {
        this.f39956a = b;
        this.b = function1;
        this.c = ry1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39956a;
        ry1 ry1Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ry1Var.getClass();
                py1 py1Var = (py1) ry1Var;
                long j = py1Var.b;
                oy1 oy1Var = py1Var.q.f10339a;
                function1.invoke(new tx1((oy1Var != null ? oy1Var.b : null) == cy1.c, j));
                break;
            default:
                ry1Var.getClass();
                function1.invoke(new sx1(((py1) ry1Var).b));
                break;
        }
        return Unit.f46060a;
    }
}
