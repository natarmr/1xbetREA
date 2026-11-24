package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.onboarding.impl.navigation.OnBoardingScreens$TipsDialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lz1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20887a;
    public final /* synthetic */ wz1 b;

    public /* synthetic */ lz1(wz1 wz1Var, byte b) {
        this.f20887a = b;
        this.b = wz1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f20887a;
        wz1 wz1Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                roq0 roq0Var = wz1Var.D;
                uuz uuzVar = fk60.b;
                String str = wz1.T;
                roq0Var.getClass();
                k0w0Var.h(new OnBoardingScreens$TipsDialogScreen(18, str));
                break;
            case 1:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = wz1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wz1Var.f.getClass();
                } while (!p7m0Var.m(value, dz1.a((dz1) value, false, false, false, null, false, null, null, false, ghe.f11293a, 2047)));
                break;
            case 2:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = wz1Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    wz1Var.f.getClass();
                } while (!p7m0Var2.m(value2, dz1.a((dz1) value2, false, false, false, null, false, null, null, false, ghe.f11293a, 2047)));
                break;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                wz1Var.p.b(th, new xg1((byte) 17));
                break;
            case 4:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = wz1Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    wz1Var.f.getClass();
                } while (!p7m0Var3.m(value3, dz1.a((dz1) value3, false, false, false, null, false, null, null, false, ghe.f11293a, 2047)));
                break;
            default:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var4 = wz1Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    wz1Var.f.getClass();
                } while (!p7m0Var4.m(value4, dz1.a((dz1) value4, false, false, false, pb0Var.f26680a, false, null, null, false, null, 4063)));
                break;
        }
        return Unit.f46060a;
    }
}
