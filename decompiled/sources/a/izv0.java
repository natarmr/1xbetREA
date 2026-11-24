package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class izv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15651a;
    public final /* synthetic */ rzv0 b;

    public /* synthetic */ izv0(rzv0 rzv0Var, byte b) {
        this.f15651a = b;
        this.b = rzv0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f15651a;
        rzv0 rzv0Var = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = rzv0Var.f;
                ocj ocjVar = rzv0Var.i;
                Throwable th = (Throwable) obj;
                th.getClass();
                if (th instanceof sq60) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, bzv0.a((bzv0) value2, null, null, ndt.f23351a, false, null, false, 59)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, bzv0.a((bzv0) value, null, null, fdt.f9373a, false, null, false, 59)));
                }
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                h9p h9pVar = th2 instanceof j7t0 ? g9p.f10926a : d9p.f5712a;
                p7m0 p7m0Var3 = rzv0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    rzv0Var.f.getClass();
                } while (!p7m0Var3.m(value3, bzv0.a((bzv0) value3, null, h9pVar, null, false, null, false, 61)));
                break;
        }
        return Unit.f46060a;
    }
}
