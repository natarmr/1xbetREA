package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.wallet.impl.navigation.WalletsScreen$WalletsScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fj5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9620a;
    public final /* synthetic */ dk5 b;

    public /* synthetic */ fj5(dk5 dk5Var, byte b) {
        this.f9620a = b;
        this.b = dk5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9620a;
        dk5 dk5Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                qgd qgdVar = dk5Var.i;
                kj5 kj5Var = lj5.f20134a;
                qgdVar.getClass();
                k0w0Var.h(new WalletsScreen$WalletsScreen("addbalance"));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                dk5Var.n.b(th, new gj5(dk5Var, (byte) 1));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                dk5Var.n.b(th2, new gj5(dk5Var, (byte) 2));
                break;
            default:
                List list = (List) obj;
                list.getClass();
                dk5Var.F(list);
                break;
        }
        return Unit.f46060a;
    }
}
