package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.make_bet_settings.impl.navigation.SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14761a;
    public final /* synthetic */ on20 b;

    public /* synthetic */ ih20(on20 on20Var, byte b) {
        this.f14761a = b;
        this.b = on20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14761a;
        on20 on20Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                y3j0 y3j0Var = on20Var.f0;
                bm5 bm5Var = bm5.i;
                y3j0Var.getClass();
                k0w0Var.h(new SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1(bm5Var));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                on20Var.C.b(th, new lh20(on20Var, (byte) 3));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                on20Var.C.b(th2, new lh20(on20Var, (byte) 5));
                break;
            default:
                duj dujVar = on20Var.C;
                Throwable th3 = (Throwable) obj;
                bby bbyVar = on20Var.j1;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                dujVar.b(th3, new lh20(on20Var, (byte) 4));
                dujVar.b(th3, new lh20(on20Var, (byte) 9));
                break;
        }
        return Unit.f46060a;
    }
}
