package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrScannerScreen$1;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wj4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39245a;
    public final /* synthetic */ hk4 b;

    public /* synthetic */ wj4(hk4 hk4Var, byte b) {
        this.f39245a = b;
        this.b = hk4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39245a;
        hk4 hk4Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                hk4Var.z.getClass();
                k0w0Var.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("KEY_LOGIN_QR_SCANNER_REQUEST", "KEY_LOGIN_QR_SCANNER_BUNDLE"));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                mi70 mi70Var = hk4Var.U;
                i38 i38Var = new i38(17);
                mi70Var.getClass();
                k0w0Var2.h(new BindPhoneNumberScreen(i38Var));
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                hk4Var.N();
                break;
            case 3:
                d7a d7aVar = (d7a) obj;
                d7aVar.getClass();
                hk4Var.G(new oj4(d7aVar));
                break;
            default:
                nh70 nh70Var = hk4Var.P;
                PickerDialogParams pickerDialogParams = new PickerDialogParams(new PickerDialogParams.PickerType.Phone(Integer.valueOf(((tj4) hk4Var.D()).h), false, true), AnalyticsEntryPoint.b);
                nh70Var.getClass();
                ((k0w0) obj).h(nh70.h(pickerDialogParams));
                break;
        }
        return Unit.f46060a;
    }
}
