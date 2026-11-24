package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv2(e2d e2dVar, sjj sjjVar, nul0 nul0Var, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 2;
        this.l = e2dVar;
        this.m = sjjVar;
        this.n = nul0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                byte b2 = 0;
                gv2 gv2Var = new gv2(b2, this.k, (yje) obj3, (hv2) obj5, (jie0) obj4);
                gv2Var.l = (nv2) obj;
                return gv2Var.invokeSuspend(Unit.f46060a);
            case 1:
                byte b3 = 1;
                gv2 gv2Var2 = new gv2(b3, this.k, (yje) obj3, (afk0) obj5, (rv2) obj4);
                gv2Var2.l = (nv2) obj;
                return gv2Var2.invokeSuspend(Unit.f46060a);
            default:
                float fFloatValue = ((Number) obj2).floatValue();
                gv2 gv2Var3 = new gv2((e2d) this.l, (sjj) obj5, (nul0) obj4, (yje) obj3);
                gv2Var3.k = fFloatValue;
                return gv2Var3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        jie0 jie0Var;
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hv2 hv2Var = (hv2) obj3;
                    fv2 fv2Var = new fv2(hv2Var, (nv2) this.l, (byte) 0);
                    qkq qkqVar = hv2Var.n1;
                    if (qkqVar == null) {
                        Intrinsics.h("resolvedFlingBehavior");
                        throw null;
                    }
                    jie0 jie0Var2 = (jie0) obj2;
                    float f = this.k;
                    this.l = jie0Var2;
                    this.j = true;
                    obj = qkqVar.a(fv2Var, f, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                    jie0Var = jie0Var2;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jie0Var = (jie0) this.l;
                    z1x.P(obj);
                }
                jie0Var.f16571a = ((Number) obj).floatValue();
                return Unit.f46060a;
            case 1:
                nv2 nv2Var = (nv2) this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fv2 fv2Var2 = new fv2(nv2Var, (rv2) obj2);
                    float f2 = this.k;
                    this.l = null;
                    this.j = true;
                    if (((afk0) obj3).a(fv2Var2, f2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                float f3 = this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.k = f3;
                    this.j = true;
                    if (nip.e(((e2d) this.l).f7077a, f3, (sjj) obj3, (nul0) obj2, this) == wneVar3) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv2(byte b, float f, yje yjeVar, Object obj, Object obj2) {
        super(3, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.k = f;
    }
}
