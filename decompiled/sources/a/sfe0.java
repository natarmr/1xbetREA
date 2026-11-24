package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sfe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wfe0 k;
    public final /* synthetic */ mlr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfe0(wfe0 wfe0Var, mlr mlrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wfe0Var;
        this.l = mlrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mlr mlrVar = this.l;
        wfe0 wfe0Var = this.k;
        switch (b) {
            case 0:
                return new sfe0(wfe0Var, mlrVar, yjeVar, (byte) 0);
            default:
                return new sfe0(wfe0Var, mlrVar, yjeVar, (byte) 1);
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
        return ((sfe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        byte b = this.i;
        wfe0 wfe0Var = this.k;
        Integer numE = null;
        switch (b) {
            case 0:
                mlr mlrVar = this.l;
                long j = mlrVar.f22006a;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    wfe0Var.y.h((int) j, new Integer(5111), null, null, !((nfe0) wfe0Var.D()).h.contains(new Long(j)));
                    wfe0Var.x.j(mlrVar.f22006a, !((nfe0) wfe0Var.D()).h.contains(new Long(j)), new Integer(5111), null, null);
                    xr xrVar = wfe0Var.B;
                    boolean z2 = !((nfe0) wfe0Var.D()).h.contains(new Long(j));
                    String strM = wfe0Var.M(mlrVar);
                    this.j = true;
                    if (xrVar.m(mlrVar, z2, 5111, strM, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                mlr mlrVar2 = this.l;
                long j2 = mlrVar2.f22006a;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    String str = wfe0.L;
                    aie aieVar = ((nfe0) wfe0Var.D()).f23433a;
                    uge ugeVar = aieVar instanceof uge ? (uge) aieVar : null;
                    if (ugeVar != null && (list = ugeVar.f35621a) != null) {
                        Iterator it = list.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (((mlr) it.next()).f22006a != j2) {
                                i++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i);
                        if (i < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            numE = kng0.e(1, numValueOf);
                        }
                    }
                    Integer num = numE;
                    wfe0Var.y.a((int) j2, 5111, num, "aggregator_recommended", null);
                    u58 u58Var = wfe0Var.x;
                    u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, mlrVar2.f22006a, "aggregator_recommended", 5111, null, num, null, 40));
                    pw70 pw70Var = wfe0Var.q;
                    String strM2 = wfe0Var.M(mlrVar2);
                    this.j = true;
                    if (pw70.b(pw70Var, mlrVar2, strM2, 5111, false, false, this, 114) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
