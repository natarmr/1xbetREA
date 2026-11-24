package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.make_bet_settings.impl.navigation.SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rh20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30468a;
    public final /* synthetic */ nn20 b;

    public /* synthetic */ rh20(nn20 nn20Var, byte b) {
        this.f30468a = b;
        this.b = nn20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30468a;
        nn20 nn20Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                nn20Var.R.b(th, new fd20((byte) 3));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                y3j0 y3j0Var = nn20Var.w0;
                bm5 bm5Var = bm5.b;
                y3j0Var.getClass();
                k0w0Var.h(new SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1(bm5Var));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                nn20Var.R.b(th2, new uh20(nn20Var, (byte) 3));
                break;
            default:
                duj dujVar = nn20Var.R;
                Throwable th3 = (Throwable) obj;
                bby bbyVar = nn20Var.Y0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                dujVar.b(th3, new uh20(nn20Var, (byte) 5));
                dujVar.b(th3, new uh20(nn20Var, (byte) 4));
                break;
        }
        return Unit.f46060a;
    }
}
