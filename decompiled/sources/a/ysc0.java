package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ysc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43161a;
    public final /* synthetic */ dtc0 b;

    public /* synthetic */ ysc0(dtc0 dtc0Var, byte b) {
        this.f43161a = b;
        this.b = dtc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f43161a;
        boolean z = false;
        byte b2 = 17;
        boolean z2 = true;
        dtc0 dtc0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    c4m0 c4m0Var = dtc0Var.B;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        yje yjeVar = null;
                        dtc0Var.B = sac.T(new fnq(dtb.U(new wk30(dtc0Var.q.b(), (byte) 25), 1), new d7a0(dtc0Var, yjeVar, (byte) 7), (byte) 4), jiu0.a(dtc0Var), new s9c0(dtc0Var, yjeVar, (byte) 5));
                    }
                } else {
                    dtc0Var.y.b(th, new xh20(dtc0Var, z, b2));
                }
                p7m0 p7m0Var = dtc0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dtc0Var.f.getClass();
                } while (!p7m0Var.m(value, rrc0.a((rrc0) value, null, 0, false, false, null, false, false, true, 64895)));
                break;
            case 1:
                th.getClass();
                dtc0Var.y.b(th, new xh20(dtc0Var, z2, b2));
                break;
            default:
                th.getClass();
                dtc0Var.v.t("promo_shop");
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.l1) {
                    String strA = dtc0Var.p.b.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    dtc0Var.G(new msc0(strA, message));
                } else {
                    dtc0Var.y.b(th, new xh20(dtc0Var, z2, b2));
                }
                dtc0Var.u.n("promo_shop");
                break;
        }
        return Unit.f46060a;
    }
}
