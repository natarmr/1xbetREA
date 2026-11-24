package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f53 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8940a;
    public final /* synthetic */ h53 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f53(h53 h53Var, byte b) {
        super(1);
        this.f8940a = b;
        this.b = h53Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8940a;
        h53 h53Var = this.b;
        switch (b) {
            case 0:
                pu90 pu90Var = h53Var.t;
                pu90Var.getClass();
                long j = h53Var.v;
                ou90.j((ou90) obj, pu90Var, h53Var.r.b.a((((long) pu90Var.f27604a) << 32) | (4294967295L & ((long) pu90Var.b)), j, k6z.f17794a));
                break;
            default:
                pu90 pu90Var2 = h53Var.s;
                pu90Var2.getClass();
                long j2 = h53Var.u;
                ou90.j((ou90) obj, pu90Var2, h53Var.r.b.a((((long) pu90Var2.f27604a) << 32) | (4294967295L & ((long) pu90Var2.b)), j2, k6z.f17794a));
                break;
        }
        return Unit.f46060a;
    }
}
