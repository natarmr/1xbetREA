package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bgb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2547a;
    public final /* synthetic */ kgb0 b;

    public /* synthetic */ bgb0(kgb0 kgb0Var, byte b) {
        this.f2547a = b;
        this.b = kgb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f2547a;
        kgb0 kgb0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = kgb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kgb0Var.f.getClass();
                } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, null, false, null, null, null, new xee(th), null, null, 3583)));
                kgb0Var.Q(th);
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(kgb0Var.T.f35560a.e()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(kgb0Var.T.f35560a.d()).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                break;
            case 3:
                ((List) obj).getClass();
                kgb0Var.R();
                break;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var2 = kgb0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    kgb0Var.f.getClass();
                } while (!p7m0Var2.m(value2, ufb0.a((ufb0) value2, null, false, false, null, false, null, null, new xee(th2), null, null, null, 3839)));
                break;
            default:
                oyg0 oyg0Var = kgb0Var.f;
                Throwable th3 = (Throwable) obj;
                int i = kgb0.k0;
                ocj ocjVar = kgb0Var.i;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value3, ufb0.a((ufb0) value3, null, false, false, null, false, null, null, null, new xee(th3), null, null, 3583)));
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value4, ufb0.a((ufb0) value4, null, false, false, null, false, null, null, null, null, null, new xee(th3), 2047)));
                break;
        }
        return Unit.f46060a;
    }
}
