package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ep8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(uz40 uz40Var, d39 d39Var, float f, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = uz40Var;
        this.m = d39Var;
        this.k = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                ep8 ep8Var = new ep8((rv2) this.l, (afk0) obj2, yjeVar);
                ep8Var.k = ((Number) obj).floatValue();
                return ep8Var;
            case 1:
                ep8 ep8Var2 = new ep8((h5m) obj2, this.k, yjeVar);
                ep8Var2.l = obj;
                return ep8Var2;
            case 2:
                return new ep8((uz40) this.l, (d39) obj2, this.k, yjeVar);
            case 3:
                return new ep8((byte) 3, this.k, yjeVar, (pvh0) this.l, (y1h0) obj2);
            case 4:
                return new ep8((byte) 4, this.k, yjeVar, (xcz) this.l, (Function1) obj2);
            case 5:
                return new ep8((byte) 5, this.k, yjeVar, (t33) this.l, (cfq) obj2);
            case 6:
                return new ep8((byte) 6, this.k, yjeVar, (td9) this.l, (j73) obj2);
            default:
                ep8 ep8Var3 = new ep8((oms0) obj2, yjeVar);
                ep8Var3.l = obj;
                return ep8Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ep8) create(Float.valueOf(((Number) obj).floatValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ep8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Unit] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar;
        float fV;
        byte b = this.i;
        byte b2 = 6;
        Object obj2 = this.m;
        ?? r6 = 0;
        switch (b) {
            case 0:
                float f = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rv2 rv2Var = (rv2) this.l;
                    gv2 gv2Var = new gv2((byte) 1, f, null, (afk0) obj2, rv2Var);
                    this.k = f;
                    this.j = true;
                    if (rv2.b(rv2Var, gv2Var, this) == wneVar) {
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
                h5m h5mVar = (h5m) obj2;
                vne vneVar2 = (vne) this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        h5mVar.d = (bby) vneVar2.getCoroutineContext().get(gqw0.o1);
                        float fL = h5mVar.b.l();
                        float f2 = this.k;
                        uts0 uts0VarZ = lgb.Z();
                        i3l i3lVar = new i3l(h5mVar, b2);
                        this.l = null;
                        this.j = true;
                        if (hhm0.n(fL, f2, uts0VarZ, i3lVar, this, 4) == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (!z2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    h5mVar.d = null;
                    r6 = Unit.f46060a;
                    return r6;
                } catch (Throwable th) {
                    h5mVar.d = r6;
                    throw th;
                }
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    ak9 ak9Var = new ak9(ydx.V(null, new ca40((uz40) this.l, (byte) 2)), b2);
                    fa40 fa40Var = new fa40((d39) obj2, this.k);
                    this.j = true;
                    if (ak9Var.c(fa40Var, this) == wneVar3) {
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
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    if (((pvh0) this.l).s1(this.k, (y1h0) obj2, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new a7s((xcz) this.l, (byte) 20));
                    fa40 fa40Var2 = new fa40(this.k, (Function1) obj2);
                    this.j = true;
                    if (vsg0VarV.c(fa40Var2, this) == wneVar5) {
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
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    if (t33.a((t33) this.l, new Float(this.k), (cfq) obj2, null, null, this, 12) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    this.j = true;
                    if (t33.a((t33) ((td9) this.l).c, new Float(this.k), (j73) obj2, null, null, this, 12) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    vne vneVar3 = (vne) this.l;
                    vneVar = vneVar3;
                    fV = hhm0.v(vneVar3.getCoroutineContext());
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fV = this.k;
                    vneVar = (vne) this.l;
                    z1x.P(obj);
                }
                while (d5c.R(vneVar)) {
                    cel celVar = new cel(obj2, fV, (byte) 8);
                    this.l = vneVar;
                    this.k = fV;
                    this.j = true;
                    if (s0x.P(getContext()).e(celVar, this) == wneVar8) {
                        return wneVar8;
                    }
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(rv2 rv2Var, afk0 afk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = rv2Var;
        this.m = afk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(h5m h5mVar, float f, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.m = h5mVar;
        this.k = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep8(byte b, float f, yje yjeVar, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = f;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(oms0 oms0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.m = oms0Var;
    }
}
