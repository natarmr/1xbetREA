package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrScannerScreen$1;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rg4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30414a;
    public final /* synthetic */ fh4 b;

    public /* synthetic */ rg4(fh4 fh4Var, byte b) {
        this.f30414a = b;
        this.b = fh4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30414a;
        fh4 fh4Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                fh4Var.A.getClass();
                k0w0Var.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("KEY_LOGIN_QR_SCANNER_REQUEST", "KEY_LOGIN_QR_SCANNER_BUNDLE"));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                fh4Var.Q.getClass();
                k0w0Var2.h(new TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1());
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(fh4Var.H.G0(we50.c));
                break;
            case 3:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(fh4Var.N.b());
                break;
            case 4:
                d7a d7aVar = (d7a) obj;
                d7aVar.getClass();
                fh4Var.G(new uf4(d7aVar));
                break;
            case 5:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                mi70 mi70Var = fh4Var.R;
                i38 i38Var = new i38(17);
                mi70Var.getClass();
                k0w0Var5.h(new BindPhoneNumberScreen(i38Var));
                break;
            default:
                nh70 nh70Var = fh4Var.S;
                PickerDialogParams pickerDialogParams = new PickerDialogParams(new PickerDialogParams.PickerType.Phone(Integer.valueOf(((zf4) fh4Var.D()).h), false, true), AnalyticsEntryPoint.b);
                nh70Var.getClass();
                ((k0w0) obj).h(nh70.h(pickerDialogParams));
                break;
        }
        return Unit.f46060a;
    }
}
