package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.auth_history.impl.navigation.AuthHistoryScreenFactoryImpl$getScreen$1;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrScannerScreen$1;
import org.xplatform.mailing.impl.navigation.MailingScreenFactoryImpl$getMailingManagementFragment$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ywi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43371a;
    public final /* synthetic */ xxi0 b;

    public /* synthetic */ ywi0(xxi0 xxi0Var, byte b) {
        this.f43371a = b;
        this.b = xxi0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        byte b = this.f43371a;
        final byte b2 = 0;
        final byte b3 = 1;
        final xxi0 xxi0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((c8d) k0w0Var.h(y3j0.a(xxi0Var.X)).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                mi70 mi70Var = xxi0Var.q;
                i38 i38Var = new i38(0);
                mi70Var.getClass();
                k0w0Var2.h(new BindPhoneNumberScreen(i38Var));
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((c8d) k0w0Var3.b(new a1w0(new zwi0(xxi0Var, (byte) 1))).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                xxi0Var.R.b(th, new kui0((byte) 9));
                break;
            case 4:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                xxi0Var.V.getClass();
                k0w0Var4.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("SETTINGS_QR_SCANNER_REQUEST_KEY", "SETTINGS_QR_SCANNER_BUNDLE_KEY"));
                break;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                xxi0Var.R.b(th2, new Function2() { // from class: a.bxi0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        kuw kuwVar;
                        byte b4 = b2;
                        xxi0 xxi0Var2 = xxi0Var;
                        Throwable th3 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th3.getClass();
                                str.getClass();
                                zhi0 zhi0Var = th3 instanceof zhi0 ? (zhi0) th3 : null;
                                if (zhi0Var != null && ((kuwVar = zhi0Var.c) == i2o.WrongQrCode || kuwVar == i2o.AllowQrCode || kuwVar == i2o.WrongToken)) {
                                    String message = zhi0Var.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    xxi0Var2.G(new i1j0(message));
                                }
                                break;
                            default:
                                th3.getClass();
                                str.getClass();
                                xxi0Var2.G(new k1j0(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 6:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                xxi0Var.R.b(th3, new kui0((byte) 17));
                break;
            case 7:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (th4 instanceof zed0) {
                    xxi0Var.U(!xxi0Var.p0.a());
                } else {
                    xxi0Var.U(false);
                    if (th4 instanceof zhi0) {
                        strA = th4.getMessage();
                        if (strA == null) {
                            strA = "";
                        }
                    } else {
                        strA = xxi0Var.F.b.a(R.string.connection_error, Arrays.copyOf(new Object[0], 0));
                    }
                    xxi0Var.G(new i1j0(strA));
                    xxi0Var.R.b(th4, new kui0((byte) 16));
                }
                break;
            case 8:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                xxi0Var.R.b(th5, new kui0((byte) 13));
                break;
            case 9:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                xxi0Var.R.b(th6, new kui0((byte) 14));
                break;
            case 10:
                ((igc) obj).getClass();
                xxi0Var.G(d1j0.f5311a);
                break;
            case 11:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                xxi0Var.R.b(th7, new Function2() { // from class: a.bxi0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        kuw kuwVar;
                        byte b4 = b3;
                        xxi0 xxi0Var2 = xxi0Var;
                        Throwable th8 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th8.getClass();
                                str.getClass();
                                zhi0 zhi0Var = th8 instanceof zhi0 ? (zhi0) th8 : null;
                                if (zhi0Var != null && ((kuwVar = zhi0Var.c) == i2o.WrongQrCode || kuwVar == i2o.AllowQrCode || kuwVar == i2o.WrongToken)) {
                                    String message = zhi0Var.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    xxi0Var2.G(new i1j0(message));
                                }
                                break;
                            default:
                                th8.getClass();
                                str.getClass();
                                xxi0Var2.G(new k1j0(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 12:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                xxi0Var.R.b(th8, new kui0((byte) 21));
                break;
            case 13:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                xxi0Var.R.b(th9, new kui0((byte) 8));
                break;
            case 14:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                xxi0Var.R.b(th10, new kui0((byte) 10));
                break;
            case 15:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                xxi0Var.M0.getClass();
                ((c8d) k0w0Var5.h(new AuthHistoryScreenFactoryImpl$getScreen$1()).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 16:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                xxi0Var.E.getClass();
                ((c8d) k0w0Var6.h(new MailingScreenFactoryImpl$getMailingManagementFragment$1()).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            default:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                xxi0Var.R.b(th11, new kui0((byte) 6));
                break;
        }
        return Unit.f46060a;
    }
}
