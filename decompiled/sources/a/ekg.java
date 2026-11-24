package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ekg extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ float l;
    public final /* synthetic */ xk80 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ekg(xcz xczVar, float f, xk80 xk80Var, int i, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = f;
        this.m = xk80Var;
        this.n = i;
        this.o = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ekg((xcz) this.k, this.l, this.m, this.n, (Function1) this.o, yjeVar, (byte) 0);
            case 1:
                return new ekg((xcz) this.k, this.l, this.m, this.n, (Function1) this.o, yjeVar, (byte) 1);
            default:
                ekg ekgVar = new ekg(this.m, this.n, this.l, (j73) this.o, yjeVar);
                ekgVar.k = obj;
                return ekgVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ekg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ekg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ekg) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        byte b = this.i;
        Object obj2 = this.o;
        float f = this.l;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new ckg((xcz) this.k, f, (byte) 0));
                    dkg dkgVar = new dkg(this.m, this.n, (Function1) obj2, null, (byte) 0);
                    this.j = true;
                    if (slb.O(vsg0VarV, dkgVar, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vsg0 vsg0VarV2 = ydx.V(null, new ckg((xcz) this.k, f, (byte) 1));
                    dkg dkgVar2 = new dkg(this.m, this.n, (Function1) obj2, null, (byte) 1);
                    this.j = true;
                    if (slb.O(vsg0VarV2, dkgVar2, this) == wneVar2) {
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
                Object obj3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    xk80 xk80Var = this.m;
                    u8z u8zVar = new u8z((qah0) this.k, xk80Var, (byte) 2);
                    j73 j73Var = (j73) obj2;
                    this.j = true;
                    yk80 yk80Var = zk80.f44518a;
                    int i2 = this.n;
                    xk80Var.q.m(xk80Var.j(new Integer(i2).intValue()));
                    boolean z4 = i2 > xk80Var.e;
                    int iE = (u8zVar.e() - xk80Var.e) + 1;
                    if (((z4 && i2 > u8zVar.e()) || (!z4 && i2 < xk80Var.e)) && Math.abs(i2 - xk80Var.e) >= 3) {
                        if (z4) {
                            i = i2 - iE;
                            int i3 = xk80Var.e;
                            if (i < i3) {
                                i = i3;
                            }
                        } else {
                            int i4 = iE + i2;
                            i = xk80Var.e;
                            if (i4 <= i) {
                                i = i4;
                            }
                        }
                        u8zVar.f(i, 0);
                    }
                    Object objN = hhm0.n(0.0f, u8zVar.b(i2) + f, j73Var, new xd80(new jie0(), u8zVar, b2), this, 4);
                    if (objN != obj3) {
                        objN = Unit.f46060a;
                    }
                    if (objN == obj3) {
                        return obj3;
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
    public ekg(xk80 xk80Var, int i, float f, j73 j73Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.m = xk80Var;
        this.n = i;
        this.l = f;
        this.o = j73Var;
    }
}
