package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrScannerScreen$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vcj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37190a;
    public final /* synthetic */ odj0 b;

    public /* synthetic */ vcj0(odj0 odj0Var, byte b) {
        this.f37190a = b;
        this.b = odj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        byte b = this.f37190a;
        odj0 odj0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                odj0Var.Q.b(th, new r3j0((byte) 8));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                odj0Var.Q.b(th2, new r3j0((byte) 12));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                odj0Var.Q.b(th3, new r3j0((byte) 9));
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                odj0Var.Q.b(th4, new r3j0((byte) 13));
                break;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                odj0Var.Q.b(th5, new uph0(odj0Var, (byte) 21));
                break;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                odj0Var.Q.b(th6, new r3j0((byte) 21));
                break;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                odj0Var.Q.b(th7, new r3j0((byte) 16));
                break;
            case 7:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                odj0Var.Q.b(th8, new r3j0((byte) 6));
                break;
            case 8:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                odj0Var.Q.b(th9, new r3j0((byte) 18));
                break;
            case 9:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                if (th10 instanceof zed0) {
                    odj0Var.T(!odj0Var.m0.a());
                } else {
                    odj0Var.T(false);
                    if (th10 instanceof zhi0) {
                        strA = th10.getMessage();
                        if (strA == null) {
                            strA = "";
                        }
                    } else {
                        strA = odj0Var.E.b.a(R.string.connection_error, Arrays.copyOf(new Object[0], 0));
                    }
                    odj0Var.G(new mcj0(strA));
                    odj0Var.Q.b(th10, new r3j0((byte) 20));
                }
                break;
            case 10:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                odj0Var.Q.b(th11, new r3j0((byte) 26));
                break;
            case 11:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                odj0Var.Q.b(th12, new r3j0((byte) 19));
                break;
            case 12:
                ((igc) obj).getClass();
                odj0Var.G(hcj0.f12827a);
                break;
            case 13:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                odj0Var.Q.b(th13, new r3j0((byte) 25));
                break;
            case 14:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                odj0Var.Q.b(th14, new r3j0((byte) 5));
                break;
            case 15:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                mi70 mi70Var = odj0Var.q;
                i38 i38Var = new i38(0);
                mi70Var.getClass();
                k0w0Var.h(new BindPhoneNumberScreen(i38Var));
                break;
            case 16:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                odj0Var.U.getClass();
                k0w0Var2.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("SETTINGS_QR_SCANNER_REQUEST_KEY", "SETTINGS_QR_SCANNER_BUNDLE_KEY"));
                break;
            default:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                odj0Var.Q.b(th15, new r3j0((byte) 7));
                break;
        }
        return Unit.f46060a;
    }
}
