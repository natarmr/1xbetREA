package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f940 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9137a;
    public final /* synthetic */ m940 b;

    public /* synthetic */ f940(m940 m940Var, byte b) {
        this.f9137a = b;
        this.b = m940Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f9137a;
        m940 m940Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                m940Var.C.b(th, new b120(m940Var, (byte) 25));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(m940Var.y.b(j700.f16016a, y8h0.f42195a, xun.f41520a, -1L, ""));
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(m940Var.y.b(j700.b, y8h0.f42195a, xun.f41520a, -1L, ""));
                break;
            case 3:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(m940Var.u.q(new fr1(null, q91.d, 1)));
                break;
            case 4:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(m940Var.u.q(new fr1(new fs80(m940Var.z.b.a(R.string.tv_bet_casino_title, Arrays.copyOf(new Object[0], 0)), nw80.i.getId(), null, null, 0L, false, 124), q91.d)));
                break;
            case 5:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(m940Var.u.q(new jr1(new cvc0(d7v.b))));
                break;
            case 6:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = m940Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    m940Var.f.getClass();
                } while (!p7m0Var.m(value, n940.a((n940) value, new b940(th2), false, null, null, 12)));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                m940Var.C.b(th3, new b120(m940Var, (byte) 25));
                break;
        }
        return Unit.f46060a;
    }
}
