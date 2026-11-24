package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j8b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16075a;
    public final /* synthetic */ g9b0 b;

    public /* synthetic */ j8b0(g9b0 g9b0Var, byte b) {
        this.f16075a = b;
        this.b = g9b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16075a;
        g9b0 g9b0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = g9b0Var.U;
                n8b0 n8b0Var = new n8b0(th);
                p7m0Var.getClass();
                p7m0Var.o(null, n8b0Var);
                break;
            case 1:
                ((List) obj).getClass();
                g9b0Var.A(s8b0.b);
                break;
            case 2:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(g9b0Var.j.f35560a.e()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 3:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(g9b0Var.j.f35560a.d()).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
            case 4:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = g9b0Var.T;
                p7m0Var2.getClass();
                p7m0Var2.o(null, m8b0.f21362a);
                break;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var3 = g9b0Var.R;
                n8b0 n8b0Var2 = new n8b0(th2);
                p7m0Var3.getClass();
                p7m0Var3.o(null, n8b0Var2);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                p7m0 p7m0Var4 = g9b0Var.S;
                n8b0 n8b0Var3 = new n8b0(th3);
                p7m0Var4.getClass();
                p7m0Var4.o(null, n8b0Var3);
                break;
        }
        return Unit.f46060a;
    }
}
