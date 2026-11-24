package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7597a;
    public final /* synthetic */ qg20 b;

    public /* synthetic */ ed20(qg20 qg20Var, byte b) {
        this.f7597a = b;
        this.b = qg20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        byte b = this.f7597a;
        qg20 qg20Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                String str = (String) obj2;
                b1j.z(str, th);
                boolean z = th instanceof zhi0;
                if (!z || ((zhi0) th).c != i2o.BetExistsError) {
                    ((lye) qg20Var.g0.f23572a.f10647a).getClass();
                }
                if (z) {
                    sac.V(jiu0.a(qg20Var), gf20.f11186a, null, qg20Var.d.f22085a, new p4z(qg20Var, th, null), 10);
                    qg20Var.O(((zhi0) th).c, str, false);
                } else if (hic.C(th)) {
                    qg20Var.h0();
                } else {
                    qg20Var.c0();
                    qg20Var.W0.f(new uuj0(new xdk0(rek0.b, str, null, null, null, null, 124)));
                }
                break;
            case 1:
                th.getClass();
                ((String) obj2).getClass();
                qg20Var.d0();
                break;
            case 2:
                th.getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = qg20Var.n1;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, rn20.a((rn20) value, false, false, false, 5)));
                break;
            case 3:
                String str2 = (String) obj2;
                b1j.z(str2, th);
                qg20Var.W0.f(new uuj0(new xdk0(rek0.b, str2, null, null, null, null, 124)));
                break;
            default:
                th.printStackTrace();
                p7m0 p7m0Var2 = qg20Var.U0;
                p7m0Var2.getClass();
                p7m0Var2.o(null, gm5.f11525a);
                break;
        }
        return Unit.f46060a;
    }
}
