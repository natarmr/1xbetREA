package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fmb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9772a;
    public final /* synthetic */ pmb0 b;

    public /* synthetic */ fmb0(pmb0 pmb0Var, byte b) {
        this.f9772a = b;
        this.b = pmb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f9772a;
        byte b2 = 12;
        pmb0 pmb0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                if (th instanceof j7t0) {
                    p7m0 p7m0Var = pmb0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        pmb0Var.f.getClass();
                    } while (!p7m0Var.m(value, olb0.a((olb0) value, null, null, null, false, false, null, 0L, 0L, false, null, null, null, 8167)));
                }
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                pmb0Var.w.b(th2, new j3b0((byte) 12));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                pmb0Var.w.b(th3, new j3b0((byte) 11));
                break;
            case 3:
                ((Throwable) obj).getClass();
                pmb0Var.N();
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                pmb0Var.w.b(th4, new lma0(pmb0Var, b2));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                eke0 eke0Var = pmb0Var.Q;
                bhh0 bhh0Var = bhh0.f2606a;
                eke0Var.getClass();
                k0w0Var.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                break;
        }
        return Unit.f46060a;
    }
}
