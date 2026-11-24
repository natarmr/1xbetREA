package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationFailScreen$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yk60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42773a;
    public final /* synthetic */ hl60 b;

    public /* synthetic */ yk60(hl60 hl60Var, byte b) {
        this.f42773a = b;
        this.b = hl60Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42773a;
        hl60 hl60Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                hl60Var.t.a(th);
                hl60Var.z(true);
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rek0 rek0Var = hl60Var.c;
                String strA = hl60Var.o.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                rek0Var.getClass();
                k0w0Var.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(strA, false));
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                mi70 mi70Var = hl60Var.p;
                i38 i38Var = new i38(12);
                mi70Var.getClass();
                k0w0Var2.k(new BindPhoneNumberScreen(i38Var));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                an4 an4Var = th2 instanceof an4 ? (an4) th2 : null;
                if (an4Var != null) {
                    hl60Var.n.d(new rw40(hl60Var, an4Var, (byte) 23));
                } else {
                    hl60Var.z(true);
                    hl60Var.v.f(zk60.f44514a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
