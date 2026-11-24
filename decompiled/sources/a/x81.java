package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x81 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40441a;
    public final /* synthetic */ n91 b;

    public /* synthetic */ x81(n91 n91Var, byte b) {
        this.f40441a = b;
        this.b = n91Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f40441a;
        n91 n91Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                n91Var.R(gq80.k0(th));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                n91Var.V();
                break;
            case 2:
                ((Throwable) obj).getClass();
                v88.b(n91Var.M, n91Var.r, 0L, 4);
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (th3 instanceof jfp) {
                    n91Var.G(d81.f5621a);
                } else {
                    n91Var.G(new c81(jwb.G(th3, n91Var.o)));
                }
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                n91Var.V();
                break;
            default:
                ax0 ax0Var = (ax0) obj;
                int i = n91.f0;
                p7m0 p7m0Var = n91Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u81.a((u81) value, null, false, false, false, null, null, 0L, false, false, null, false, false, false, 0, ax0Var, 1572863)));
                break;
        }
        return Unit.f46060a;
    }
}
