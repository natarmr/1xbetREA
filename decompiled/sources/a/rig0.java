package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rig0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30542a;
    public final /* synthetic */ mig0 b;
    public final /* synthetic */ nkg0 c;

    public /* synthetic */ rig0(mig0 mig0Var, nkg0 nkg0Var, byte b) {
        this.f30542a = b;
        this.b = mig0Var;
        this.c = nkg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30542a;
        nkg0 nkg0Var = this.c;
        mig0 mig0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ljg0.a(mig0Var.f21845a, nkg0Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ljg0.a(mig0Var.b, nkg0Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ljg0.a(mig0Var.c, nkg0Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                num.getClass();
                gfx.n(mig0Var, nkg0Var, fetVar, x8x.L(1));
                break;
            default:
                num.getClass();
                pkg0.a(mig0Var, nkg0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rig0(mig0 mig0Var, nkg0 nkg0Var, int i, byte b) {
        this.f30542a = b;
        this.b = mig0Var;
        this.c = nkg0Var;
    }
}
