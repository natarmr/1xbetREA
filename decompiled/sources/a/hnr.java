package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hnr extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnr(pz40 pz40Var, agk0 agk0Var, float f, t33 t33Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.m = pz40Var;
        this.o = agk0Var;
        this.l = f;
        this.p = t33Var;
        this.n = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                pz40 pz40Var = (pz40) this.n;
                hnr hnrVar = new hnr((pz40) this.m, (agk0) obj3, this.l, (t33) obj2, pz40Var, yjeVar);
                hnrVar.k = obj;
                return hnrVar;
            default:
                float f = this.l;
                hnr hnrVar2 = new hnr(this.m, this.n, (pvh0) obj3, (oms0) obj2, f, yjeVar);
                hnrVar2.k = obj;
                return hnrVar2;
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
        return ((hnr) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.p;
        Object obj4 = this.n;
        Object obj5 = this.o;
        yje yjeVar = null;
        switch (b) {
            case 0:
                vne vneVar = (vne) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new gu7((pz40) obj2, (agk0) obj5, (byte) 1));
                    gnr gnrVar = new gnr(this.l, vneVar, (t33) obj3, (pz40) obj4, (agk0) obj5);
                    this.k = null;
                    this.j = true;
                    if (vsg0VarV.c(gnrVar, this) == wneVar) {
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
                oms0 oms0Var = (oms0) obj3;
                pvh0 pvh0Var = (pvh0) obj5;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vne vneVar2 = (vne) this.k;
                    if (Intrinsics.d(obj2, obj4)) {
                        pvh0Var.p = null;
                        if (Intrinsics.d(((hgk0) pvh0Var.d).getValue(), obj2)) {
                            return Unit.f46060a;
                        }
                    } else {
                        pvh0Var.p1();
                    }
                    boolean zD = Intrinsics.d(obj2, obj4);
                    float f = this.l;
                    if (!zD) {
                        oms0Var.r(obj2);
                        oms0Var.o(0L);
                        ((hgk0) pvh0Var.c).setValue(obj2);
                        oms0Var.k(f);
                    }
                    pvh0Var.u1(f);
                    if (pvh0Var.o.j()) {
                        qjj.W(vneVar2, null, null, new yng0(pvh0Var, yjeVar, (byte) 7), 3);
                    } else {
                        pvh0Var.n = Long.MIN_VALUE;
                    }
                    this.j = true;
                    if (pvh0Var.x1(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                pvh0Var.t1();
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnr(Object obj, Object obj2, pvh0 pvh0Var, oms0 oms0Var, float f, yje yjeVar) {
        super(2, yjeVar);
        this.m = obj;
        this.n = obj2;
        this.o = pvh0Var;
        this.p = oms0Var;
        this.l = f;
    }
}
