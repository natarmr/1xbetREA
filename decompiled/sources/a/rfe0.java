package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class rfe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ wfe0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfe0(wfe0 wfe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = wfe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wfe0 wfe0Var = this.j;
        switch (b) {
            case 0:
                return new rfe0(wfe0Var, yjeVar, (byte) 0);
            case 1:
                return new rfe0(wfe0Var, yjeVar, (byte) 1);
            case 2:
                return new rfe0(wfe0Var, yjeVar, (byte) 2);
            default:
                return new rfe0(wfe0Var, yjeVar, (byte) 3);
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
        return ((rfe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wfe0 wfe0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                wfe0 wfe0Var2 = this.j;
                i3t0.A(wfe0Var2, wfe0Var2.w, new cb0(wfe0.L, "aggregator_recommended"), null, null, 6);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC = wfe0Var.z.c();
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
                wfe0Var.A.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0.UNKNOWN, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                wfe0 wfe0Var3 = this.j;
                i3t0.A(wfe0Var3, wfe0Var3.w, new db0(wfe0.L, k7k.UNKNOWN, wfe0Var3.C.g()), wfe0Var3.u.b, null, 4);
                break;
        }
        return Unit.f46060a;
    }
}
