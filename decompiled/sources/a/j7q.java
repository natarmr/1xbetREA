package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j7q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16054a;
    public final /* synthetic */ r8q b;

    public /* synthetic */ j7q(r8q r8qVar, byte b) {
        this.f16054a = b;
        this.b = r8qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16054a;
        r8q r8qVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                r8qVar.F.b(th, new f5o(r8qVar, (byte) 24));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                r8qVar.F.a(th2);
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new k7q(r8qVar, (byte) 1))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
        }
        return Unit.f46060a;
    }
}
