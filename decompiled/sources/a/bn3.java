package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bn3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2862a;
    public final /* synthetic */ on3 b;

    public /* synthetic */ bn3(on3 on3Var, byte b) {
        this.f2862a = b;
        this.b = on3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f2862a;
        on3 on3Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = on3Var.r;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, um3.a((um3) value, null, null, null, null, false, false, false, false, false, 98303)));
                th.printStackTrace();
                break;
            case 1:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = on3Var.s;
                p7m0Var2.getClass();
                p7m0Var2.o(null, ul3.f35854a);
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var3 = on3Var.r;
                do {
                    value2 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value2, um3.a((um3) value2, null, null, null, null, false, false, false, false, false, 65535)));
                th2.printStackTrace();
                break;
            default:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var4 = on3Var.r;
                do {
                    value3 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value3, um3.a((um3) value3, null, null, null, null, true, false, false, false, false, 128255)));
                break;
        }
        return Unit.f46060a;
    }
}
