package a;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yc7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42372a;
    public final /* synthetic */ kd7 b;

    public /* synthetic */ yc7(kd7 kd7Var, byte b) {
        this.f42372a = b;
        this.b = kd7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        byte b = this.f42372a;
        byte b2 = 5;
        byte b3 = 3;
        final byte b4 = 0;
        final byte b5 = 1;
        final kd7 kd7Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                kd7Var.f0.b(th, new zc7(kd7Var, (byte) 2));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = kd7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kd7Var.f.getClass();
                } while (!p7m0Var.m(value, rc7.a((rc7) value, null, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 267911167)));
                kd7Var.N(th2);
                break;
            case 2:
                final Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (th3 instanceof zhi0) {
                    kd7Var.O.b(((zhi0) th3).c.getErrorCode());
                }
                p7m0 p7m0Var2 = kd7Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    kd7Var.f.getClass();
                } while (!p7m0Var2.m(value2, rc7.a((rc7) value2, null, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 267911167)));
                kd7Var.f0.b(th3, new Function2() { // from class: a.ad7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b6 = b5;
                        kd7 kd7Var2 = kd7Var;
                        Throwable th4 = th3;
                        switch (b6) {
                            case 0:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                if ((th4 instanceof zhi0) && ((zhi0) th4).c == i2o.SelfExclusionChangesProhibited) {
                                    kd7Var2.G(dc7.f5837a);
                                }
                                break;
                            default:
                                ctf0 ctf0Var = kd7Var2.s;
                                String str = (String) obj3;
                                rek0 rek0Var = rek0.b;
                                ((Throwable) obj2).getClass();
                                str.getClass();
                                if ((th4 instanceof SocketTimeoutException) || (th4 instanceof UnknownHostException) || (th4 instanceof SSLHandshakeException) || (th4 instanceof ConnectException) || (th4 instanceof IllegalStateException)) {
                                    kd7Var2.G(new kc7(new xdk0(rek0Var, ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
                                } else {
                                    kd7Var2.G(new kc7(new xdk0(rek0Var, ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), str, null, null, null, 120)));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 3:
                final Throwable th4 = (Throwable) obj;
                th4.getClass();
                kd7Var.f0.b(th4, new Function2() { // from class: a.ad7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b6 = b4;
                        kd7 kd7Var2 = kd7Var;
                        Throwable th5 = th4;
                        switch (b6) {
                            case 0:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                if ((th5 instanceof zhi0) && ((zhi0) th5).c == i2o.SelfExclusionChangesProhibited) {
                                    kd7Var2.G(dc7.f5837a);
                                }
                                break;
                            default:
                                ctf0 ctf0Var = kd7Var2.s;
                                String str = (String) obj3;
                                rek0 rek0Var = rek0.b;
                                ((Throwable) obj2).getClass();
                                str.getClass();
                                if ((th5 instanceof SocketTimeoutException) || (th5 instanceof UnknownHostException) || (th5 instanceof SSLHandshakeException) || (th5 instanceof ConnectException) || (th5 instanceof IllegalStateException)) {
                                    kd7Var2.G(new kc7(new xdk0(rek0Var, ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
                                } else {
                                    kd7Var2.G(new kc7(new xdk0(rek0Var, ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), str, null, null, null, 120)));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                kd7Var.f0.b(th5, new zc7(kd7Var, b3));
                break;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                kd7Var.f0.b(th6, new zc7(kd7Var, b2));
                break;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                kd7Var.f0.b(th7, new zc7(kd7Var, b4));
                p7m0 p7m0Var3 = kd7Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    kd7Var.f.getClass();
                } while (!p7m0Var3.m(value3, rc7.a((rc7) value3, null, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 267911167)));
                break;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                kd7Var.f0.b(th8, new i87((byte) 5));
                break;
            case 8:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                p7m0 p7m0Var4 = kd7Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    kd7Var.f.getClass();
                } while (!p7m0Var4.m(value4, rc7.a((rc7) value4, p9x.f26629a, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 268435454)));
                kd7Var.N(th9);
                break;
            case 9:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var5 = kd7Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    kd7Var.f.getClass();
                } while (!p7m0Var5.m(value5, rc7.a((rc7) value5, null, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 267911167)));
                rek0 rek0Var = rek0.b;
                ctf0 ctf0Var = kd7Var.s;
                kd7Var.G(new kc7(new xdk0(rek0Var, ctf0Var.b.a(R.string.selected_bid_hidden_with_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{kd7Var.o}, 1)), null, null, null, 120)));
                break;
            case 10:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                kd7Var.f0.b(th10, new zc7(kd7Var, b5));
                break;
            case 11:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                kd7Var.f0.b(th11, new zc7(kd7Var, b3));
                break;
            case 12:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                kd7Var.f0.b(th12, new zc7(kd7Var, (byte) 4));
                break;
            default:
                Throwable th13 = (Throwable) obj;
                List list = kd7.m0;
                p7m0 p7m0Var6 = kd7Var.i.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, rc7.a((rc7) value6, p9x.f26629a, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 268435454)));
                kd7Var.N(th13);
                break;
        }
        return Unit.f46060a;
    }
}
