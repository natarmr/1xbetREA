package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yts0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43235a = 0;
    public final /* synthetic */ zts0 b;

    public /* synthetic */ yts0(zts0 zts0Var) {
        this.b = zts0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43235a;
        zts0 zts0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mym0.a(o2e.e0(o7k0.e(jm40.b, 46.0f).e(new wkw(gqw0.n)), "TWENTY_ONE_CARD_LIST_" + zts0Var.f44978a), zts0Var.c, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                mym0.f(zts0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yts0(zts0 zts0Var, int i) {
        this.b = zts0Var;
    }
}
