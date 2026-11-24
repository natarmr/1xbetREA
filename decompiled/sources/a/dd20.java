package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5875a;
    public final /* synthetic */ qg20 b;

    public /* synthetic */ dd20(qg20 qg20Var, byte b) {
        this.f5875a = b;
        this.b = qg20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5875a;
        yje yjeVar = null;
        qg20 qg20Var = this.b;
        switch (b) {
            case 0:
                sac.V(jiu0.a(qg20Var), new r520((byte) 9), null, qg20Var.d.b, new kf20(qg20Var, yjeVar, (byte) 1), 10);
                break;
            case 1:
                bby bbyVar = qg20Var.M0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                qg20Var.M0 = sac.f0(jiu0.a(qg20Var), 1L, TimeUnit.MINUTES, qg20Var.d.f22085a, qe20.f28562a, new re20(qg20Var, yjeVar, (byte) 0), 32);
                break;
            default:
                p7m0 p7m0Var = qg20Var.X0;
                p7m0Var.getClass();
                p7m0Var.o(null, zq00.f44786a);
                break;
        }
        return Unit.f46060a;
    }
}
