package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hk7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13195a;
    public final /* synthetic */ ik7 b;

    public /* synthetic */ hk7(ik7 ik7Var, byte b) {
        this.f13195a = b;
        this.b = ik7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13195a;
        ik7 ik7Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jwb.p(s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), new qw3(4.0f, true, new jf4((byte) 14)), new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, 0, 0, u1c.M(1708027498, new un6(ik7Var, (byte) 27), fetVar), fetVar, 1575936, 48);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(ik7Var.b, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 110586);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
