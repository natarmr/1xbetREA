package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gp90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11672a;
    public final /* synthetic */ kp90 b;

    public /* synthetic */ gp90(kp90 kp90Var, byte b) {
        this.f11672a = b;
        this.b = kp90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        br90 br90Var;
        String str;
        byte b = this.f11672a;
        t0w0 t0w0Var = t0w0.f33140a;
        kp90 kp90Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((c8d) k0w0Var.b(t0w0Var).f14945a).f3908a = new v7d(false, new bjk(kp90Var.w, false, false, false), cfx0.o);
                break;
            case 1:
                ((Throwable) obj).getClass();
                kp90Var.x.y(((br90) kp90Var.D()).b.f44816a);
                p7m0 p7m0Var = kp90Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    br90Var = (br90) value;
                    kp90Var.f.getClass();
                    str = br90Var.b.f44816a;
                    str.getClass();
                } while (!p7m0Var.m(value, br90.a(br90Var, new zqp(str, true), null, null, false, 61)));
                break;
            case 2:
                ((c8d) ((k0w0) obj).b(t0w0Var).f14945a).f3908a = new v7d(false, new bjk(kp90Var.w, false, false, false), cfx0.o);
                break;
            default:
                ((c8d) ((k0w0) obj).b(t0w0Var).f14945a).f3908a = new v7d(false, new bjk(kp90Var.w, false, false, false), cfx0.o);
                break;
        }
        return Unit.f46060a;
    }
}
