package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.authqr.impl.qr.navigation.QrAuthScreenFactoryImpl$qrScannerScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sb4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31914a;
    public final /* synthetic */ kc4 b;

    public /* synthetic */ sb4(kc4 kc4Var, byte b) {
        this.f31914a = b;
        this.b = kc4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31914a;
        kc4 kc4Var = this.b;
        switch (b) {
            case 0:
                d7a d7aVar = (d7a) obj;
                d7aVar.getClass();
                kc4Var.G(new ib4(d7aVar));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                kc4Var.A.getClass();
                k0w0Var.h(new QrAuthScreenFactoryImpl$qrScannerScreen$1("KEY_LOGIN_QR_SCANNER_REQUEST", "KEY_LOGIN_QR_SCANNER_BUNDLE"));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                kc4Var.J.a();
                break;
        }
        return Unit.f46060a;
    }
}
