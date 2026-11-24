package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class x550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d650 k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x550(d650 d650Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d650Var;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                return new x550(d650Var, z, yjeVar, (byte) 0);
            default:
                return new x550(d650Var, z, yjeVar, (byte) 1);
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
        return ((x550) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.l;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    rou rouVar = d650Var.g0;
                    this.j = true;
                    obj = rouVar.a(false, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean z3 = ((m2c0) obj).o0;
                boolean z4 = d650Var.b1.l.n;
                if (z3 && z4) {
                    if (!z) {
                        d650Var.K.f11237a.a(xun.f41520a, 3313L);
                        d650Var.J.f35083a.c("my_aggregator_VIP_cashback_call");
                    }
                    d650Var.H.c(new AggregatorScreenModel(null, null, 0L, em1.f8026a, null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ytt yttVar = d650Var.s0;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC = d650Var.I.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new rd7((Object) d650Var, z, (byte) 10))), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
