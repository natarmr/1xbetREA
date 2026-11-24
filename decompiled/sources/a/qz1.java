package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class qz1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ wz1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz1(wz1 wz1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = wz1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wz1 wz1Var = this.j;
        switch (b) {
            case 0:
                return new qz1(wz1Var, yjeVar, (byte) 0);
            case 1:
                return new qz1(wz1Var, yjeVar, (byte) 1);
            case 2:
                return new qz1(wz1Var, yjeVar, (byte) 2);
            default:
                return new qz1(wz1Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qz1) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        wz1 wz1Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = wz1.T;
                p7m0 p7m0Var = wz1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wz1Var.f.getClass();
                } while (!p7m0Var.m(value, dz1.a((dz1) value, false, false, false, null, false, null, null, false, ghe.f11293a, 2047)));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC = wz1Var.t.c();
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
                String str2 = wz1.T;
                s91 s91Var = wz1Var.q;
                wgh0 wgh0Var = wgh0.AGGREGATOR_TOURNAMENTS;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                wz1Var.v.g(wgh0Var);
                wz1Var.H.C("aggregator_tournaments");
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (wz1Var.C.r(fk60.AGGREGATOR_TOURNAMENTS)) {
                    wz1Var.G(zy1.f45183a);
                }
                wz1Var.B.i(false);
                break;
        }
        return Unit.f46060a;
    }
}
