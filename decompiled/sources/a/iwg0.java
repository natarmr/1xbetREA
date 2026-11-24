package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iwg0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15488a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;

    public /* synthetic */ iwg0(double d, double d2, byte b) {
        this.f15488a = b;
        this.b = d;
        this.c = d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dxu0 dxu0Var;
        dxu0 bxu0Var;
        switch (this.f15488a) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                svg0 svg0Var = (svg0) obj2;
                oyg0Var.getClass();
                svg0Var.getClass();
                double d = this.b;
                q7x.F(oyg0Var, Double.valueOf(d), "KEY_STAKE_VALUE");
                double d2 = this.c;
                q7x.F(oyg0Var, Double.valueOf(d2), "KEY_PAYMENT_VALUE");
                return svg0.a(svg0Var, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, d, d2, 0.0d, 0.0d, 0.0d, false, false, null, null, null, null, null, null, 8388511);
            default:
                txu0 txu0Var = (txu0) obj2;
                ((oyg0) obj).getClass();
                txu0Var.getClass();
                fwu0 fwu0Var = new fwu0(txu0Var.h ? gwu0.b : gwu0.c, hwu0.b, true);
                double d3 = this.b;
                double d4 = this.c;
                if (d3 < d4) {
                    if (d3 < d4) {
                        bxu0Var = new bxu0(txu0Var.d.c, d4);
                    } else {
                        dxu0Var = txu0Var.f;
                    }
                    return txu0.a(txu0Var, null, false, null, fwu0Var, bxu0Var, false, false, 0.0d, 463);
                }
                dxu0Var = cxu0.f5142a;
                bxu0Var = dxu0Var;
                return txu0.a(txu0Var, null, false, null, fwu0Var, bxu0Var, false, false, 0.0d, 463);
        }
    }
}
