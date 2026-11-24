package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44831a;
    public final /* synthetic */ gs0 b;

    public /* synthetic */ zr0(gs0 gs0Var, byte b) {
        this.f44831a = b;
        this.b = gs0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f44831a;
        gs0 gs0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                gs0Var.p.b(th, new yr0(th, (byte) 1));
                p7m0 p7m0Var = gs0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    gs0Var.f.getClass();
                } while (!p7m0Var.m(value, ur0.a((ur0) value, null, null, w5d0.f38578a, null, 247)));
                break;
            case 1:
                th.getClass();
                gs0Var.p.b(th, new yr0(th, (byte) 2));
                p7m0 p7m0Var2 = gs0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    gs0Var.f.getClass();
                } while (!p7m0Var2.m(value2, ur0.a((ur0) value2, t5q.f33380a, null, null, null, 253)));
                break;
            default:
                th.getClass();
                gs0Var.p.b(th, new yr0(th, (byte) 0));
                p7m0 p7m0Var3 = gs0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    gs0Var.f.getClass();
                } while (!p7m0Var3.m(value3, ur0.a((ur0) value3, null, plk0.f27187a, null, null, 251)));
                break;
        }
        return Unit.f46060a;
    }
}
