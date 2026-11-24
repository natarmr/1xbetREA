package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.auth_history.impl.navigation.AuthHistoryScreenFactoryImpl$getScreen$1;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrScannerScreen$1;
import org.xplatform.mailing.impl.navigation.MailingScreenFactoryImpl$getMailingManagementFragment$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kej0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18157a;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a b;

    public /* synthetic */ kej0(org.xplatform.settings.impl.presentation.a aVar, byte b) {
        this.f18157a = b;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strF;
        byte b = this.f18157a;
        byte b2 = 2;
        org.xplatform.settings.impl.presentation.a aVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                aVar.C.b(th, new r3j0((byte) 29));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                aVar.C.b(th2, new uph0(aVar, (byte) 22));
                break;
            case 2:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.c(null);
                mi70 mi70Var = aVar.G0;
                i38 i38Var = new i38(0);
                mi70Var.getClass();
                k0w0Var.h(new BindPhoneNumberScreen(i38Var));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                aVar.C.b(th3, new mej0((byte) 0));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (th4 instanceof zed0) {
                    aVar.I(!aVar.b0.a());
                } else {
                    aVar.I(false);
                    if (th4 instanceof zhi0) {
                        strF = th4.getMessage();
                        if (strF == null) {
                            strF = "";
                        }
                    } else {
                        strF = aVar.q.f(R.string.connection_error, new Object[0]);
                    }
                    aVar.G(new i1j0(strF), null);
                    aVar.C.b(th4, new mej0((byte) 7));
                }
                break;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                aVar.C.b(th5, new mej0((byte) 6));
                break;
            case 6:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ((c8d) k0w0Var2.b(new a1w0(new lej0(aVar, b2))).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 7:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                aVar.C.b(th6, new mej0((byte) 10));
                break;
            case 8:
                ((igc) obj).getClass();
                aVar.G(d1j0.f5311a, null);
                break;
            case 9:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                aVar.C.b(th7, new mej0((byte) 8));
                break;
            case 10:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                aVar.p.getClass();
                ((c8d) k0w0Var3.h(new MailingScreenFactoryImpl$getMailingManagementFragment$1()).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 11:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                aVar.C.b(th8, new mej0((byte) 5));
                break;
            case 12:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                aVar.G.getClass();
                k0w0Var4.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("SETTINGS_QR_SCANNER_REQUEST_KEY", "SETTINGS_QR_SCANNER_BUNDLE_KEY"));
                break;
            case 13:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                aVar.C.b(th9, new mej0((byte) 11));
                break;
            case 14:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                aVar.C.b(th10, new mej0((byte) 3));
                break;
            case 15:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                aVar.C.b(th11, new mej0((byte) 1));
                i1w0 i1w0Var = aVar.k;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                aVar.p.getClass();
                k0w0VarI.h(new MailingScreenFactoryImpl$getMailingManagementFragment$1());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 16:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                ((c8d) k0w0Var5.h(y3j0.a(aVar.I)).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 17:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                aVar.y0.getClass();
                ((c8d) k0w0Var6.h(new AuthHistoryScreenFactoryImpl$getScreen$1()).f14945a).f3908a = new v7d(true, cfx0.o, new bjk(null, false, false, true));
                break;
            case 18:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                aVar.C.b(th12, new mej0((byte) 2));
                break;
            default:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                aVar.C.b(th13, new mej0((byte) 4));
                break;
        }
        return Unit.f46060a;
    }
}
