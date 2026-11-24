package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w1y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38424a;
    public final /* synthetic */ a8q0 b;

    public /* synthetic */ w1y(a8q0 a8q0Var, byte b) {
        this.f38424a = b;
        this.b = a8q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38424a;
        a8q0 a8q0Var = this.b;
        switch (b) {
            case 0:
                s1y s1yVar = (s1y) obj2;
                ((oyg0) obj).getClass();
                s1yVar.getClass();
                ax6 ax6Var = s1yVar.d;
                Double dI = kotlin.text.b.i(a8q0Var.f440a.b);
                return s1y.a(s1yVar, null, ax6.a(ax6Var, null, dI != null ? dI.doubleValue() : -1.0d, 0.0d, 0.0d, 13), false, false, 119);
            case 1:
                x3y x3yVar = (x3y) obj2;
                ((oyg0) obj).getClass();
                x3yVar.getClass();
                xw6 xw6Var = x3yVar.c;
                dpm0 dpm0Var = xw6Var.b;
                Double dI2 = kotlin.text.b.i(a8q0Var.f440a.b);
                return x3y.a(x3yVar, null, new xw6(xw6Var.f41594a, dpm0.a(dpm0Var, dI2 != null ? dI2.doubleValue() : -1.0d, 62)), false, 27);
            case 2:
                zzx zzxVar = (zzx) obj2;
                ((oyg0) obj).getClass();
                zzxVar.getClass();
                yw6 yw6Var = zzxVar.c;
                epm0 epm0Var = yw6Var.b;
                Double dI3 = kotlin.text.b.i(a8q0Var.f440a.b);
                return zzx.a(zzxVar, null, new yw6(yw6Var.f43355a, epm0.a(epm0Var, dI3 != null ? dI3.doubleValue() : -1.0d, 62)), false, 27);
            case 3:
                x5y x5yVar = (x5y) obj2;
                ((oyg0) obj).getClass();
                x5yVar.getClass();
                zw6 zw6Var = x5yVar.c;
                Double dI4 = kotlin.text.b.i(a8q0Var.f440a.b);
                return x5y.a(x5yVar, null, zw6.a(zw6Var, null, dI4 != null ? dI4.doubleValue() : -1.0d, 0.0d, 0.0d, 13), false, false, 59);
            case 4:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                return b820.a(b820Var, null, null, null, rvj0.a(rvj0Var, dx6.a(rvj0Var.f31171a, a8q0Var, null, 2), null, null, null, null, 30), null, null, null, false, false, false, false, false, 8183);
            default:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                return a820.a(a820Var, null, null, null, null, null, hx4.a(a820Var.g, this.b, null, null, null, null, false, 62), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
        }
    }
}
