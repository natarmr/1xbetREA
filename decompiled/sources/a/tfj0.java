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
public final /* synthetic */ class tfj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33869a;
    public final /* synthetic */ ngj0 b;

    public /* synthetic */ tfj0(ngj0 ngj0Var, byte b) {
        this.f33869a = b;
        this.b = ngj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        byte b = this.f33869a;
        final byte b2 = 1;
        final byte b3 = 0;
        final ngj0 ngj0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ngj0Var.W.getClass();
                k0w0Var.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("SETTINGS_QR_SCANNER_REQUEST_KEY", "SETTINGS_QR_SCANNER_BUNDLE_KEY"));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ngj0Var.L0.getClass();
                ((c8d) k0w0Var2.h(new AuthHistoryScreenFactoryImpl$getScreen$1()).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((c8d) k0w0Var3.b(new a1w0(new ufj0(ngj0Var, (byte) 1))).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                ngj0Var.S.b(th, new Function2() { // from class: a.vfj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        kuw kuwVar;
                        byte b4 = b2;
                        ngj0 ngj0Var2 = ngj0Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                ngj0Var2.G(new k1j0(str));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                zhi0 zhi0Var = th2 instanceof zhi0 ? (zhi0) th2 : null;
                                if (zhi0Var != null && ((kuwVar = zhi0Var.c) == i2o.WrongQrCode || kuwVar == i2o.AllowQrCode || kuwVar == i2o.WrongToken)) {
                                    String message = zhi0Var.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    ngj0Var2.G(new i1j0(message));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 4:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                ((c8d) k0w0Var4.h(y3j0.a(ngj0Var.Y)).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ngj0Var.S.b(th2, new mej0((byte) 17));
                break;
            case 6:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ngj0Var.S.b(th3, new mej0((byte) 21));
                break;
            case 7:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ngj0Var.S.b(th4, new mej0((byte) 22));
                break;
            case 8:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ngj0Var.S.b(th5, new mej0((byte) 18));
                break;
            case 9:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                if (th6 instanceof zed0) {
                    ngj0Var.U(!ngj0Var.q0.a());
                } else {
                    ngj0Var.U(false);
                    if (th6 instanceof zhi0) {
                        strA = th6.getMessage();
                        if (strA == null) {
                            strA = "";
                        }
                    } else {
                        strA = ngj0Var.G.b.a(R.string.connection_error, Arrays.copyOf(new Object[0], 0));
                    }
                    ngj0Var.G(new i1j0(strA));
                    ngj0Var.S.b(th6, new mej0((byte) 24));
                }
                break;
            case 10:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.c(null);
                mi70 mi70Var = ngj0Var.q;
                i38 i38Var = new i38(0);
                mi70Var.getClass();
                k0w0Var5.h(new BindPhoneNumberScreen(i38Var));
                break;
            case 11:
                ((igc) obj).getClass();
                ngj0Var.G(d1j0.f5311a);
                break;
            case 12:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ngj0Var.S.b(th7, new mej0((byte) 15));
                break;
            case 13:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ngj0Var.S.b(th8, new mej0((byte) 28));
                break;
            case 14:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ngj0Var.S.b(th9, new mej0((byte) 13));
                break;
            case 15:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                ngj0Var.F.getClass();
                ((c8d) k0w0Var6.h(new MailingScreenFactoryImpl$getMailingManagementFragment$1()).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 16:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ngj0Var.S.b(th10, new mej0((byte) 12));
                break;
            default:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ngj0Var.S.b(th11, new Function2() { // from class: a.vfj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        kuw kuwVar;
                        byte b4 = b3;
                        ngj0 ngj0Var2 = ngj0Var;
                        Throwable th12 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th12.getClass();
                                str.getClass();
                                ngj0Var2.G(new k1j0(str));
                                break;
                            default:
                                th12.getClass();
                                str.getClass();
                                zhi0 zhi0Var = th12 instanceof zhi0 ? (zhi0) th12 : null;
                                if (zhi0Var != null && ((kuwVar = zhi0Var.c) == i2o.WrongQrCode || kuwVar == i2o.AllowQrCode || kuwVar == i2o.WrongToken)) {
                                    String message = zhi0Var.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    ngj0Var2.G(new i1j0(message));
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
}
