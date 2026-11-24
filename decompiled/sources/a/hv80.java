package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hv80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13715a;
    public final /* synthetic */ rv80 b;

    public /* synthetic */ hv80(rv80 rv80Var, byte b) {
        this.f13715a = b;
        this.b = rv80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f13715a;
        rv80 rv80Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                boolean z = th instanceof jfp;
                ctf0 ctf0Var = rv80Var.x;
                if (z) {
                    rv80Var.G(new wu80(ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0))));
                } else {
                    rv80Var.G(new vu80(jwb.G(th, ctf0Var)));
                }
                break;
            case 1:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = rv80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    rv80Var.f.getClass();
                } while (!p7m0Var.m(value, yu80.a((yu80) value, false, false, false, false, false, null, null, eu80.f8408a, null, 114687)));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                rv80Var.B.b(th2, new ht80((byte) 2));
                break;
            case 3:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var2 = rv80Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    rv80Var.f.getClass();
                } while (!p7m0Var2.m(value2, yu80.a((yu80) value2, false, false, false, false, false, null, null, null, pb0Var.f26680a, 98303)));
                break;
            default:
                int i = rv80.V;
                rv80Var.G(uu80.f36288a);
                break;
        }
        return Unit.f46060a;
    }
}
