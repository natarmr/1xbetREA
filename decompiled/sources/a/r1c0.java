package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r1c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29672a;
    public final /* synthetic */ b2c0 b;

    public /* synthetic */ r1c0(b2c0 b2c0Var, byte b) {
        this.f29672a = b;
        this.b = b2c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29672a;
        final b2c0 b2c0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                mi70 mi70Var = b2c0Var.w;
                i38 i38Var = new i38(25);
                mi70Var.getClass();
                k0w0Var.h(new BindPhoneNumberScreen(i38Var));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                b2c0Var.r.b(th, new j3b0((byte) 24));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                b2c0Var.r.b(th2, new j3b0((byte) 23));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                b2c0Var.r.b(th3, new j3b0((byte) 22));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                final byte b2 = 1;
                b2c0Var.r.b(th4, new Function2() { // from class: a.s1c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        b2c0 b2c0Var2 = b2c0Var;
                        Throwable th5 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th5.getClass();
                                str.getClass();
                                b2c0Var2.P(str, th5);
                                break;
                            default:
                                th5.getClass();
                                str.getClass();
                                b2c0Var2.P(str, th5);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                final byte b3 = 0;
                b2c0Var.r.b(th5, new Function2() { // from class: a.s1c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        b2c0 b2c0Var2 = b2c0Var;
                        Throwable th6 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b4) {
                            case 0:
                                th6.getClass();
                                str.getClass();
                                b2c0Var2.P(str, th6);
                                break;
                            default:
                                th6.getClass();
                                str.getClass();
                                b2c0Var2.P(str, th6);
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
