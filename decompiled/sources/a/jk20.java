package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jk20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16645a;
    public final /* synthetic */ nn20 b;
    public final /* synthetic */ m97 c;

    public /* synthetic */ jk20(nn20 nn20Var, m97 m97Var, byte b) {
        this.f16645a = b;
        this.b = nn20Var;
        this.c = m97Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        m97 m97Var = (m97) obj;
        switch (this.f16645a) {
            case 0:
                pek0 pek0Var = pek0.f26859a;
                nn20 nn20Var = this.b;
                nn20Var.G(new qc20(new xdk0(pek0Var, nn20Var.S.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0)), null, null, jdk0.f16332a, Integer.valueOf(R.drawable.ic_snack_lock), 76)));
                i3t0.K(nn20Var, null, null, new xg0(nn20Var, m97Var, this.c, null, (byte) 17), 3);
                nn20Var.M0();
                break;
            default:
                int i = nn20.c1;
                nn20 nn20Var2 = this.b;
                i3t0.K(nn20Var2, null, null, new ni2(nn20Var2, m97Var, null), 3);
                i3t0.K(nn20Var2, null, null, new hnp(nn20Var2, m97Var, this.c, nn20Var2.x.t(), (yje) null), 3);
                sac.V(jiu0.a(nn20Var2), xk20.f41012a, null, nn20Var2.T.f22085a, new xn2(nn20Var2, (yje) null, (byte) 3), 10);
                p7m0 p7m0Var = nn20Var2.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    nn20Var2.f.getClass();
                } while (!p7m0Var.m(value, b820.a((b820) value, null, null, null, null, null, null, null, false, false, false, false, false, 6143)));
                break;
        }
        return Unit.f46060a;
    }
}
