package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class am20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nn20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am20(nn20 nn20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nn20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nn20 nn20Var = this.k;
        switch (b) {
            case 0:
                am20 am20Var = new am20(nn20Var, yjeVar, (byte) 0);
                am20Var.j = obj;
                return am20Var;
            case 1:
                am20 am20Var2 = new am20(nn20Var, yjeVar, (byte) 1);
                am20Var2.j = obj;
                return am20Var2;
            case 2:
                am20 am20Var3 = new am20(nn20Var, yjeVar, (byte) 2);
                am20Var3.j = obj;
                return am20Var3;
            case 3:
                am20 am20Var4 = new am20(nn20Var, yjeVar, (byte) 3);
                am20Var4.j = obj;
                return am20Var4;
            default:
                am20 am20Var5 = new am20(nn20Var, yjeVar, (byte) 4);
                am20Var5.j = obj;
                return am20Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((am20) create((cit0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((am20) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((am20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((am20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((am20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        b820 b820Var;
        an5 an5Var;
        byte b = this.i;
        byte b2 = 9;
        byte b3 = 0;
        nn20 nn20Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                cit0 cit0Var = (cit0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = cit0Var.V;
                int i = nn20.c1;
                if (str.length() > 0) {
                    nn20Var.G(new qc20(new xdk0(pek0.f26859a, str, null, null, jdk0.f16332a, Integer.valueOf(R.drawable.ic_glyph_info_circle_filled), 76)));
                }
                nn20Var.H(new zl20(cit0Var, (byte) 0));
                break;
            case 1:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = nn20Var.f;
                mne mneVar = nn20Var.T;
                int i2 = nn20.c1;
                ocj ocjVar = nn20Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, b820.a((b820) value, null, null, null, null, null, null, null, sw00Var.f32897a, false, false, false, false, 8063)));
                c4m0 c4m0Var = nn20Var.a1;
                byte b4 = 1;
                int i3 = 2;
                yje yjeVar = null;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    nn20Var.a1 = sac.T(new fnq(nn20Var.P.b(), new a220(nn20Var, yjeVar, b4), (byte) 4), d5c.S(jiu0.a(nn20Var), mneVar.f22085a), new sax(i3, yjeVar, (byte) 25));
                }
                if (sw00Var.f32897a) {
                    c4m0 c4m0Var2 = nn20Var.Z0;
                    byte b5 = 3;
                    if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                        if (nn20Var.z.a().f32117a.f12063a.b) {
                            e40 e40Var = e40.e;
                            p7m0 p7m0Var2 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var2.getValue();
                                value2.getClass();
                                b820Var = (b820) value2;
                                oyg0Var.getClass();
                                an5Var = b820Var.c;
                            } while (!p7m0Var2.m(value2, b820.a(b820Var, null, null, an5.a(an5Var, new g40(an5Var.d.f10638a, e40Var)), null, null, null, null, false, false, false, false, false, 8187)));
                        }
                        fnq fnqVar = new fnq(nn20Var.U.a(bm5.b), new mt00((Object) nn20Var, yjeVar, (byte) 14));
                        fd20 fd20Var = new fd20((byte) 20);
                        eoh0 eoh0Var = i120.f;
                        zys0.e(2, fd20Var);
                        nn20Var.Z0 = sac.T(new fnq(i120.X(fnqVar, eoh0Var, fd20Var), new mq10(nn20Var, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(nn20Var), mneVar.b), new am20(nn20Var, yjeVar, b5));
                    }
                    sac.T(new fnq(nn20Var.I0.a(), new gk20(nn20Var, yjeVar, b5), (byte) 4), d5c.S(jiu0.a(nn20Var), mneVar.b), new am20(nn20Var, yjeVar, (byte) 4));
                    i3t0.K(nn20Var, null, new rh20(nn20Var, (byte) 0), new mj20(nn20Var, yjeVar, b5), 1);
                    nn20Var.H(new hh20(nn20Var.y.c().f24244a, nn20Var, b3));
                } else {
                    nn20Var.J0();
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nn20Var.R.b((Throwable) obj2, new ei20((byte) 7));
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i4 = nn20.c1;
                nn20Var.z0();
                nn20Var.R.b((Throwable) obj2, new ei20(b2));
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                nn20Var.R.b((Throwable) obj2, new ei20((byte) 10));
                break;
        }
        return Unit.f46060a;
    }
}
