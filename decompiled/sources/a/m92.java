package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class m92 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m92(fga0 fga0Var, boolean z, long j, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 4;
        this.m = fga0Var;
        this.l = z;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.m;
        switch (b) {
            case 0:
                boolean z = this.l;
                return new m92((byte) 0, this.k, yjeVar, (n92) obj, z);
            case 1:
                boolean z2 = this.l;
                return new m92((byte) 1, this.k, yjeVar, (vqg) obj, z2);
            case 2:
                boolean z3 = this.l;
                return new m92((byte) 2, this.k, yjeVar, (b310) obj, z3);
            case 3:
                boolean z4 = this.l;
                return new m92((byte) 3, this.k, yjeVar, (wk40) obj, z4);
            case 4:
                return new m92((fga0) obj, this.l, this.k, yjeVar);
            case 5:
                boolean z5 = this.l;
                return new m92((byte) 5, this.k, yjeVar, (hxd0) obj, z5);
            default:
                boolean z6 = this.l;
                return new m92((byte) 6, this.k, yjeVar, (tzt0) obj, z6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((m92) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        uf50 uf50Var;
        xh50 xh50VarG;
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                n92 n92Var = (n92) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                try {
                    if (!z) {
                        z1x.P(obj);
                        hcp0 hcp0Var = n92Var.S;
                        yi50 yi50Var = ((d92) n92Var.D()).f;
                        xi50 xi50Var = yi50Var instanceof xi50 ? (xi50) yi50Var : null;
                        long j = (xi50Var == null || (uf50Var = xi50Var.f40928a) == null || (xh50VarG = uf50Var.g()) == null) ? 0L : xh50VarG.e;
                        long j2 = this.k;
                        boolean z2 = this.l;
                        this.j = true;
                        if (hcp0Var.p(j2, z2, j, 0L, this) == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (!z) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                } catch (Exception e) {
                    IntRange intRange = n92.h0;
                    n92Var.T.f(e, new g92(n92Var, (byte) 0));
                }
                return Unit.f46060a;
            case 1:
                vqg vqgVar = (vqg) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                try {
                    if (!z3) {
                        z1x.P(obj);
                        hcp0 hcp0Var2 = vqgVar.z;
                        long j3 = vqgVar.b.b;
                        long j4 = this.k;
                        boolean z4 = this.l;
                        this.j = true;
                        if (hcp0Var2.p(j4, z4, 40L, j3, this) == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (!z3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e2) {
                    vqgVar.A.f(e2, new mqg(vqgVar, (byte) 1));
                }
                return Unit.f46060a;
            case 2:
                b310 b310Var = (b310) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                try {
                    if (!z5) {
                        z1x.P(obj);
                        hcp0 hcp0Var3 = b310Var.x;
                        long j5 = this.k;
                        boolean z6 = this.l;
                        this.j = true;
                        if (hcp0Var3.p(j5, z6, 40L, 2L, this) == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        if (!z5) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e3) {
                    b310Var.y.f(e3, new v210(b310Var, (byte) 1));
                }
                return Unit.f46060a;
            case 3:
                wk40 wk40Var = (wk40) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                try {
                    if (!z7) {
                        z1x.P(obj);
                        hcp0 hcp0Var4 = wk40Var.r;
                        long j6 = this.k;
                        boolean z8 = this.l;
                        this.j = true;
                        if (hcp0Var4.p(j6, z8, 40L, 36L, this) == wneVar4) {
                            return wneVar4;
                        }
                    } else {
                        if (!z7) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e4) {
                    wk40Var.s.f(e4, new sk40(wk40Var, (byte) 1));
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.j = true;
                    Serializable serializableA = ((fga0) obj2).a(this.k, this, this.l);
                    return serializableA == wneVar5 ? wneVar5 : serializableA;
                }
                if (z9) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                hxd0 hxd0Var = (hxd0) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z10 = this.j;
                try {
                    if (!z10) {
                        z1x.P(obj);
                        hcp0 hcp0Var5 = hxd0Var.x;
                        long j7 = this.k;
                        boolean z11 = this.l;
                        this.j = true;
                        if (hcp0Var5.p(j7, z11, 40L, 15L, this) == wneVar6) {
                            return wneVar6;
                        }
                    } else {
                        if (!z10) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e5) {
                    hxd0Var.y.f(e5, new exd0(hxd0Var, (byte) 1));
                }
                return Unit.f46060a;
            default:
                tzt0 tzt0Var = (tzt0) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z12 = this.j;
                try {
                    if (!z12) {
                        z1x.P(obj);
                        hcp0 hcp0Var6 = tzt0Var.x;
                        long j8 = this.k;
                        boolean z13 = this.l;
                        this.j = true;
                        if (hcp0Var6.p(j8, z13, 40L, 27L, this) == wneVar7) {
                            return wneVar7;
                        }
                    } else {
                        if (!z12) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e6) {
                    tzt0Var.y.f(e6, new pzt0(tzt0Var, (byte) 1));
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m92(byte b, long j, yje yjeVar, diu0 diu0Var, boolean z) {
        super(1, yjeVar);
        this.i = b;
        this.m = diu0Var;
        this.k = j;
        this.l = z;
    }
}
