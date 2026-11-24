package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iv1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15421a;
    public final /* synthetic */ uv1 b;

    public /* synthetic */ iv1(uv1 uv1Var, byte b) {
        this.f15421a = b;
        this.b = uv1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f15421a;
        uv1 uv1Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = uv1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uv1Var.f.getClass();
                } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, null, null, bt1.f3159a, null, null, false, false, false, null, null, null, null, null, 33553407)));
                uv1Var.r.b(th, new xg1((byte) 11));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new nc(uv1Var, (byte) 26))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                boolean z = th2 instanceof jfp;
                ctf0 ctf0Var = uv1Var.A;
                if (z) {
                    String strA = ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                    String strA2 = ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0));
                    String strA3 = ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0));
                    n12 n12Var = n12.f22727a;
                    uv1Var.G(new uu1(strA, strA2, strA3));
                } else {
                    uv1Var.G(new vu1(jwb.G(th2, ctf0Var)));
                }
                break;
            case 3:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var2 = uv1Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    uv1Var.f.getClass();
                } while (!p7m0Var2.m(value2, yu1.a((yu1) value2, null, false, pb0Var.f26680a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33554399)));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                p7m0 p7m0Var3 = uv1Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    uv1Var.f.getClass();
                } while (!p7m0Var3.m(value3, yu1.a((yu1) value3, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 33030143)));
                uv1Var.T(th3);
                break;
        }
        return Unit.f46060a;
    }
}
