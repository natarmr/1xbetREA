package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.main_menu.impl.navigation.MainMenuFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o0v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24449a;
    public final /* synthetic */ u0v0 b;

    public /* synthetic */ o0v0(u0v0 u0v0Var, byte b) {
        this.f24449a = b;
        this.b = u0v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24449a;
        u0v0 u0v0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                boolean z = th instanceof zhi0;
                zg zgVar = u0v0Var.s;
                if (z) {
                    int i = ((zhi0) th).f44396a;
                    b1j.w("error_code", Integer.valueOf(i), zgVar.f44322a, "delete_bill_error");
                    b1j.r(i, u0v0Var.t.f16351a, 3280L);
                } else {
                    zgVar.f44322a.c("delete_bill_error");
                }
                u0v0Var.M(th);
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                zx10 zx10Var = u0v0Var.r;
                zx10Var.getClass();
                MainMenuFragmentScreen mainMenuFragmentScreenK = zx10.k(zx10Var, r040.GAMES, false, 2);
                k0w0Var.getClass();
                k0w0Var.b(new y0w0(mainMenuFragmentScreenK));
                break;
            default:
                k0w0 k0w0Var2 = (k0w0) obj;
                zx10 zx10Var2 = u0v0Var.r;
                zx10Var2.getClass();
                MainMenuFragmentScreen mainMenuFragmentScreenK2 = zx10.k(zx10Var2, r040.AGGREGATOR, false, 2);
                k0w0Var2.getClass();
                k0w0Var2.b(new y0w0(mainMenuFragmentScreenK2));
                break;
        }
        return Unit.f46060a;
    }
}
