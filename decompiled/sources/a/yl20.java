package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class yl20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ln20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl20(ln20 ln20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ln20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ln20 ln20Var = this.k;
        switch (b) {
            case 0:
                yl20 yl20Var = new yl20(ln20Var, yjeVar, (byte) 0);
                yl20Var.j = obj;
                return yl20Var;
            case 1:
                yl20 yl20Var2 = new yl20(ln20Var, yjeVar, (byte) 1);
                yl20Var2.j = obj;
                return yl20Var2;
            default:
                yl20 yl20Var3 = new yl20(ln20Var, yjeVar, (byte) 2);
                yl20Var3.j = obj;
                return yl20Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yl20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yl20) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yl20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        byte b2 = 8;
        ln20 ln20Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ln20Var.n0.a((Throwable) obj2);
                break;
            case 1:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = ln20.o0;
                p7m0 p7m0Var = ln20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, sg20.a((sg20) value, null, null, null, null, null, false, false, sw00Var.f32897a, 0, 1535)));
                if (sw00Var.f32897a) {
                    bvc bvcVarA = jiu0.a(ln20Var);
                    dvj dvjVar = ln20Var.X.b;
                    yje yjeVar = null;
                    sac.V(bvcVarA, new mh20(ln20Var, (byte) 0), null, dvjVar, new tk20(ln20Var, yjeVar, (byte) 1), 10);
                    sac.T(new fnq(ln20Var.R.a(ln20Var.i0), new mq10(ln20Var, yjeVar, b2), (byte) 4), jiu0.a(ln20Var), sl20.h);
                    sac.T(new fnq(ln20Var.Q.b(), new tk20(ln20Var, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(ln20Var), ln20Var.E.f22085a), new sax(2, yjeVar, (byte) 26));
                    sac.T(new fnq(new l0f(ln20Var.P.a(), (byte) 1), new tk20(ln20Var, yjeVar, (byte) 4), (byte) 4), jiu0.a(ln20Var), em20.h);
                    if (ln20Var.o == ua20.FULLSCREEN_SLIDER) {
                        ln20Var.H(new jv1(ln20Var.M.c().f24244a, (Object) ln20Var, (byte) 29));
                    }
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ln20Var.V.b((Throwable) obj2, new ei20(b2));
                break;
        }
        return Unit.f46060a;
    }
}
