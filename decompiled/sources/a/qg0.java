package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class qg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ eh0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg0(eh0 eh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = eh0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eh0 eh0Var = this.j;
        switch (b) {
            case 0:
                return new qg0(eh0Var, yjeVar, (byte) 0);
            case 1:
                return new qg0(eh0Var, yjeVar, (byte) 1);
            case 2:
                return new qg0(eh0Var, yjeVar, (byte) 2);
            default:
                return new qg0(eh0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((qg0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        byte b2 = 0;
        eh0 eh0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                eh0 eh0Var2 = this.j;
                long j = ((hg0) eh0Var2.D()).f12994a.e;
                if (j != Long.MIN_VALUE) {
                    eh0Var2.b0 = bww.R(jiu0.a(eh0Var2), eh0Var2.b0, eh0Var2.N(), eh0Var2.r.f22085a, new lg0(eh0Var2, (byte) 3), null, new ir(eh0Var2, j, eh0Var2.o, (yje) null, (byte) 3), 40);
                    p7m0 p7m0Var = eh0Var2.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, hg0.a((hg0) value, new fs80(null, 0L, null, null, 0L, false, 127), null, null, null, null, false, false, false, false, false, false, null, null, 262142)));
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC = eh0Var.p.c();
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
                String str = eh0.e0;
                s91 s91Var = eh0Var.s;
                wgh0 wgh0Var = wgh0.AGGREGATOR_CATEGORY;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                eh0Var.y.g(wgh0Var);
                eh0Var.A.C("aggregator_category");
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = ((h840) eh0Var.J.f10723a.f27863a).h;
                boolean zBooleanValue = ((Boolean) p7m0Var2.getValue()).booleanValue();
                yje yjeVar = null;
                p7m0Var2.o(null, Boolean.FALSE);
                if (!zBooleanValue) {
                    sac.V(jiu0.a(eh0Var), pg0.f26930a, null, eh0Var.r.b, new qg0(eh0Var, yjeVar, b2), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
