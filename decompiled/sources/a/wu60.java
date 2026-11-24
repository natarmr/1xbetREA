package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$CashbackChoosingFragmentScreen;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$CashbackChoosingFragmentScreenOld;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wu60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39775a;
    public final /* synthetic */ hv60 b;

    public /* synthetic */ wu60(hv60 hv60Var, byte b) {
        this.f39775a = b;
        this.b = hv60Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String message;
        byte b = this.f39775a;
        hv60 hv60Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                hv60Var.N.a(th);
                if ((th instanceof qct) || (th instanceof zhi0)) {
                    message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    if (message.length() == 0) {
                        message = null;
                    }
                } else {
                    message = null;
                }
                if (!(th instanceof CancellationException)) {
                    if (message == null || !((ru60) hv60Var.D()).d) {
                        hv60Var.N(th);
                    } else {
                        hv60Var.G(new pu60(message));
                    }
                }
                hv60Var.O(false);
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                uf3 uf3Var = hv60Var.I;
                long j = ((ru60) hv60Var.D()).f;
                r9u r9uVar = uf3Var.f35560a.b;
                ygp ygpVar = ygp.y1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                k0w0Var.h(j1q0Var.f15748a.d(ygpVar) ? new GamesSectionScreens$CashbackChoosingFragmentScreen(j) : new GamesSectionScreens$CashbackChoosingFragmentScreenOld(j));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                hv60Var.N(th2);
                break;
        }
        return Unit.f46060a;
    }
}
