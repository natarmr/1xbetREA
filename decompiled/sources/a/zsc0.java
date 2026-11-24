package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class zsc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dtc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsc0(dtc0 dtc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dtc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dtc0 dtc0Var = this.k;
        switch (b) {
            case 0:
                return new zsc0(dtc0Var, yjeVar, (byte) 0);
            default:
                return new zsc0(dtc0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zsc0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objQ;
        Object value2;
        byte b = this.i;
        dtc0 dtc0Var = this.k;
        switch (b) {
            case 0:
                ctf0 ctf0Var = dtc0Var.p;
                ocj ocjVar = dtc0Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = dtc0.D;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, rrc0.a((rrc0) value, null, 0, true, false, null, false, false, false, 65531)));
                    j910 j910Var = dtc0Var.t;
                    this.j = true;
                    objQ = j910Var.q(this);
                    if (objQ == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ = obj;
                }
                o7c0 o7c0Var = (o7c0) objQ;
                i8i.D("screen", "promo_shop", dtc0Var.u.f1961a, "promo_shop_get_points_call");
                int i2 = o7c0Var.d;
                ctf0Var.getClass();
                String strF = ctf0Var.f(R.string.promo_bouns_pts_v2, String.valueOf(i2));
                dtc0Var.G(new psc0(!((rrc0) dtc0Var.D()).f ? strF : ""));
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, rrc0.a((rrc0) value2, null, i2, false, false, strF, false, false, false, 65469)));
                dtc0Var.G(new osc0(zvw.V(o7c0Var, ctf0Var).b));
                dtc0Var.v.f40143a.a(cui0.b(new j1p("promo_shop", (byte) 1)), 3309L);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (((rrc0) dtc0Var.D()).d) {
                        this.j = true;
                        if (dtc0Var.N(this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
