package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tsa0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34452a;
    public final /* synthetic */ ata0 b;

    public /* synthetic */ tsa0(ata0 ata0Var, byte b) {
        this.f34452a = b;
        this.b = ata0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f34452a;
        ata0 ata0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = ata0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ata0Var.f.getClass();
                } while (!p7m0Var.m(value, nsa0.a((nsa0) value, null, null, new fn00(th), false, null, false, null, 1007)));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (!(((nsa0) ata0Var.D()).b instanceof in00)) {
                    p7m0 p7m0Var2 = ata0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        ata0Var.f.getClass();
                    } while (!p7m0Var2.m(value2, nsa0.a((nsa0) value2, new fn00(th2), null, null, false, null, false, null, 1021)));
                }
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (!(((nsa0) ata0Var.D()).c instanceof in00)) {
                    p7m0 p7m0Var3 = ata0Var.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        ata0Var.f.getClass();
                    } while (!p7m0Var3.m(value3, nsa0.a((nsa0) value3, null, new fn00(th3), null, false, null, false, null, 1019)));
                }
                break;
            case 3:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new ssa0(ata0Var, (byte) 0))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (!(((nsa0) ata0Var.D()).b instanceof in00)) {
                    p7m0 p7m0Var4 = ata0Var.i.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                        ata0Var.f.getClass();
                    } while (!p7m0Var4.m(value4, nsa0.a((nsa0) value4, new fn00(th4), null, null, false, null, false, null, 1021)));
                }
                break;
            default:
                ata0Var.G(new jsa0(ata0Var.D.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                break;
        }
        return Unit.f46060a;
    }
}
