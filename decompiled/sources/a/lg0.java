package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19983a;
    public final /* synthetic */ eh0 b;

    public /* synthetic */ lg0(eh0 eh0Var, byte b) {
        this.f19983a = b;
        this.b = eh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f19983a;
        eh0 eh0Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                eh0Var.U();
                break;
            case 1:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = eh0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    eh0Var.f.getClass();
                } while (!p7m0Var.m(value, hg0.a((hg0) value, null, iun.f15405a, null, null, null, false, false, false, false, false, false, null, null, 261117)));
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var2 = eh0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    eh0Var.f.getClass();
                } while (!p7m0Var2.m(value2, hg0.a((hg0) value2, null, null, null, null, lak0.c, false, false, false, false, false, false, null, null, 253935)));
                break;
            case 3:
                ((Throwable) obj).getClass();
                eh0Var.U();
                break;
            case 4:
                ((Throwable) obj).getClass();
                eh0Var.U();
                break;
            case 5:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var3 = eh0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    eh0Var.f.getClass();
                } while (!p7m0Var3.m(value3, hg0.a((hg0) value3, null, null, null, null, null, false, false, false, false, false, false, null, pb0Var.f26680a, 196607)));
                break;
            default:
                String str = eh0.e0;
                eh0Var.G(fg0.f9467a);
                break;
        }
        return Unit.f46060a;
    }
}
