package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z2a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43661a;
    public final /* synthetic */ b3a0 b;

    public /* synthetic */ z2a0(b3a0 b3a0Var, byte b) {
        this.f43661a = b;
        this.b = b3a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f43661a;
        b3a0 b3a0Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = b3a0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    b3a0Var.f.getClass();
                } while (!p7m0Var.m(value, p2a0.a((p2a0) value, false, null, null, true, 31)));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new pl70(b3a0Var, (byte) 28))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
        }
        return Unit.f46060a;
    }
}
