package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class jt70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rt70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt70(rt70 rt70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rt70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rt70 rt70Var = this.k;
        switch (b) {
            case 0:
                return new jt70(rt70Var, yjeVar, (byte) 0);
            case 1:
                jt70 jt70Var = new jt70(rt70Var, yjeVar, (byte) 1);
                jt70Var.j = ((Boolean) obj).booleanValue();
                return jt70Var;
            case 2:
                return new jt70(rt70Var, yjeVar, (byte) 2);
            case 3:
                jt70 jt70Var2 = new jt70(rt70Var, yjeVar, (byte) 3);
                jt70Var2.j = ((Boolean) obj).booleanValue();
                return jt70Var2;
            default:
                return new jt70(rt70Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jt70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jt70) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jt70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((jt70) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jt70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 2;
        rt70 rt70Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                uq70 uq70Var = rt70Var.r;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(9000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (!uq70Var.g() && !uq70Var.f()) {
                    rt70Var.N();
                }
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    int i = rt70.z;
                    mne mneVar = rt70Var.o;
                    c4m0 c4m0Var = rt70Var.x;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        sac.V(jiu0.a(rt70Var), lt70.f20618a, null, mneVar.f22085a, new jt70(rt70Var, yjeVar, b3), 10);
                        rt70Var.x = sac.T(new fnq(rt70Var.q.a(), new jt70(rt70Var, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(rt70Var), mneVar.f22085a), mt70.h);
                    }
                } else {
                    int i2 = rt70.z;
                    rt70Var.N();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i3 = rt70.z;
                    sac.V(jiu0.a(rt70Var), it70.f15343a, null, rt70Var.o.f22085a, new jt70(rt70Var, yjeVar, b2), 10);
                    gmq gmqVarH = rt70Var.r.h();
                    lh70 lh70Var = new lh70(rt70Var, (byte) 23);
                    this.j = true;
                    if (gmqVarH.c(lh70Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (z4) {
                    int i4 = rt70.z;
                    c4m0 c4m0Var2 = rt70Var.w;
                    if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                        rt70Var.w = sac.T(new dnq(new fnq(new vsg0(new coe(2, (yje) null)), new wn10((diu0) rt70Var, yjeVar, (byte) 5), (byte) 4), new y0g(rt70Var, (yje) null, (byte) 7), (byte) 0), d5c.S(jiu0.a(rt70Var), rt70Var.o.f22085a), qt70.h);
                    }
                } else {
                    int i5 = rt70.z;
                    e3c.n(rt70Var.w);
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    wk30 wk30Var = new wk30(i120.W(rt70Var.r.h()), (byte) 9);
                    e3p e3pVar = new e3p(rt70Var, null, (byte) 26);
                    this.j = true;
                    if (slb.O(wk30Var, e3pVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
