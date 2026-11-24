package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tbg0 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33662a;
    public final /* synthetic */ ubg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbg0(ubg0 ubg0Var, byte b) {
        super(1);
        this.f33662a = b;
        this.b = ubg0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33662a;
        ubg0 ubg0Var = this.b;
        switch (b) {
            case 0:
                return Double.valueOf(ubg0Var.n.e(l1e0.b(((Number) obj).doubleValue(), ubg0Var.e, ubg0Var.f)));
            default:
                return Double.valueOf(l1e0.b(ubg0Var.k.e(((Number) obj).doubleValue()), ubg0Var.e, ubg0Var.f));
        }
    }
}
