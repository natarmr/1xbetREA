package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uaq implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35344a;
    public final /* synthetic */ ebq b;

    public /* synthetic */ uaq(ebq ebqVar, byte b) {
        this.f35344a = b;
        this.b = ebqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35344a;
        byte b2 = 1;
        ebq ebqVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new taq(ebqVar, (byte) 0))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                ebqVar.Q.b(th, new vaq(ebqVar, b2));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ebqVar.Q.b(th2, new jbp((byte) 23));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ebqVar.Q.b(th3, new jbp((byte) 22));
                break;
        }
        return Unit.f46060a;
    }
}
