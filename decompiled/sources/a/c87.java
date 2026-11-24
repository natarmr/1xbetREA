package a;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.lotto.impl.navigation.LottoScreenFactoryImpl$getLottoScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c87 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3899a;
    public final /* synthetic */ f97 b;

    public /* synthetic */ c87(f97 f97Var, String str) {
        this.f3899a = (byte) 6;
        this.b = f97Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String message;
        byte b = this.f3899a;
        final byte b2 = 0;
        final byte b3 = 1;
        final f97 f97Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                f97Var.F.b(th, new os6((byte) 20));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                f97Var.F.b(th2, new os6((byte) 22));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                f97Var.F.b(th3, new g87(f97Var, (byte) 1));
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                f97Var.F.b(th4, new g87(f97Var, (byte) 3));
                break;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                f97Var.F.b(th5, new os6((byte) 25));
                break;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                f97Var.F.b(th6, new g87(f97Var, (byte) 1));
                break;
            case 6:
                final Throwable th7 = (Throwable) obj;
                th7.getClass();
                if (th7 instanceof zhi0) {
                    f97Var.A0.b(((zhi0) th7).c.getErrorCode());
                }
                f97Var.H(new os6((byte) 24));
                f97Var.F.b(th7, new Function2() { // from class: a.h87
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        f97 f97Var2 = f97Var;
                        Throwable th8 = th7;
                        switch (b4) {
                            case 0:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                if ((th8 instanceof zhi0) && ((zhi0) th8).c == i2o.SelfExclusionChangesProhibited) {
                                    f97Var2.G(j67.f15970a);
                                }
                                break;
                            default:
                                ctf0 ctf0Var = f97Var2.r;
                                String str = (String) obj3;
                                ((Throwable) obj2).getClass();
                                str.getClass();
                                if ((th8 instanceof SocketTimeoutException) || (th8 instanceof UnknownHostException) || (th8 instanceof SSLHandshakeException) || (th8 instanceof ConnectException) || (th8 instanceof IllegalStateException)) {
                                    f97Var2.G(new y67(ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0))));
                                } else {
                                    f97Var2.G(new x67(str));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                f97Var.F.b(th8, new os6((byte) 21));
                break;
            case 8:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                f97Var.F.b(th9, new g87(f97Var, (byte) 2));
                break;
            case 9:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                f97Var.F.b(th10, new os6((byte) 28));
                break;
            case 10:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                f97Var.F.b(th11, new g87(f97Var, (byte) 4));
                break;
            case 11:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                if ((th12 instanceof zhi0) && ((zhi0) th12).c == i2o.BadRequest && (message = th12.getMessage()) != null) {
                    f97Var.G(new g77(message));
                }
                break;
            case 12:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                f97Var.H(new os6((byte) 19));
                f97Var.F.b(th13, new g87(f97Var, (byte) 0));
                break;
            case 13:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                f97Var.F.b(th14, new os6((byte) 11));
                break;
            case 14:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                f97Var.F.b(th15, new os6((byte) 18));
                break;
            case 15:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                f97Var.F.b(th16, new os6((byte) 29));
                break;
            case 16:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                f97Var.F.b(th17, new g87(f97Var, (byte) 5));
                break;
            case 17:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                f97Var.H0.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10.c)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 18:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                f97Var.F.b(th18, new os6((byte) 27));
                break;
            default:
                final Throwable th19 = (Throwable) obj;
                th19.getClass();
                f97Var.F.b(th19, new Function2() { // from class: a.h87
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b2;
                        f97 f97Var2 = f97Var;
                        Throwable th20 = th19;
                        switch (b4) {
                            case 0:
                                ((Throwable) obj2).getClass();
                                ((String) obj3).getClass();
                                if ((th20 instanceof zhi0) && ((zhi0) th20).c == i2o.SelfExclusionChangesProhibited) {
                                    f97Var2.G(j67.f15970a);
                                }
                                break;
                            default:
                                ctf0 ctf0Var = f97Var2.r;
                                String str = (String) obj3;
                                ((Throwable) obj2).getClass();
                                str.getClass();
                                if ((th20 instanceof SocketTimeoutException) || (th20 instanceof UnknownHostException) || (th20 instanceof SSLHandshakeException) || (th20 instanceof ConnectException) || (th20 instanceof IllegalStateException)) {
                                    f97Var2.G(new y67(ctf0Var.b.a(R.string.sale_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.request_error, Arrays.copyOf(new Object[0], 0))));
                                } else {
                                    f97Var2.G(new x67(str));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ c87(f97 f97Var, byte b) {
        this.f3899a = b;
        this.b = f97Var;
    }
}
