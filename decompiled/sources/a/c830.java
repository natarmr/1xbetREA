package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c830 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3894a;
    public final /* synthetic */ l830 b;

    public /* synthetic */ c830(l830 l830Var, byte b) {
        this.f3894a = b;
        this.b = l830Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f3894a;
        l830 l830Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = l830Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    l830Var.f.getClass();
                } while (!p7m0Var.m(value, m730.a((m730) value, null, null, null, 0L, null, null, 191)));
                return Unit.f46060a;
            default:
                y130 y130Var = (y130) obj;
                y130Var.getClass();
                l9s l9sVar = ((m730) l830Var.D()).c;
                return new g730(y130Var, l9sVar != null ? l9sVar.b() : -1L);
        }
    }
}
