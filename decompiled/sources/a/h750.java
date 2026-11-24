package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class h750 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ p850 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h750(p850 p850Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = p850Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p850 p850Var = this.j;
        switch (b) {
            case 0:
                return new h750(p850Var, yjeVar, (byte) 0);
            case 1:
                return new h750(p850Var, yjeVar, (byte) 1);
            case 2:
                return new h750(p850Var, yjeVar, (byte) 2);
            case 3:
                return new h750(p850Var, yjeVar, (byte) 3);
            case 4:
                return new h750(p850Var, yjeVar, (byte) 4);
            case 5:
                return new h750(p850Var, yjeVar, (byte) 5);
            case 6:
                return new h750(p850Var, yjeVar, (byte) 6);
            case 7:
                return new h750(p850Var, yjeVar, (byte) 7);
            case 8:
                return new h750(p850Var, yjeVar, (byte) 8);
            default:
                return new h750(p850Var, yjeVar, (byte) 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((h750) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((h750) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((h750) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h750) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        p850 p850Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p850 p850Var2 = this.j;
                i3t0.A(p850Var2, p850Var2.r, new cb0("my_aggregator", "my_aggregator"), null, null, 6);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC = p850Var.o.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p850Var.c0.d("my_aggregator");
                p850Var.d0.l(y1p.MY_AGGREGATOR);
                s91.d(p850Var.W, new jr1(new dvc0(0)), false, false, 12);
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p850Var.c0.e("my_aggregator");
                p850Var.d0.j(y1p.MY_AGGREGATOR);
                s91.d(p850Var.W, new jr1(new cvc0(d7v.b)), false, false, 12);
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                s91 s91Var = p850Var.W;
                wgh0 wgh0Var = wgh0.AGGREGATOR_PROMO;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                p850Var.i0.g(wgh0Var);
                p850Var.j0.C("aggregator_promo");
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p850 p850Var3 = this.j;
                i3t0.A(p850Var3, p850Var3.r, new db0("my_aggregator", k7k.AggregatorBrands, p850Var3.m0.g()), p850Var3.p.b, null, 4);
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (p850Var.R.r(fk60.MY_AGGREGATOR_INTERNAL)) {
                    p850Var.G(new n650());
                }
                break;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                f650 f650Var = f650.d;
                int i = p850.p0;
                p850Var.a0(f650Var);
                break;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                p850Var.D.b();
                break;
            default:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                f650 f650Var2 = f650.c;
                int i2 = p850.p0;
                p850Var.a0(f650Var2);
                break;
        }
        return Unit.f46060a;
    }
}
