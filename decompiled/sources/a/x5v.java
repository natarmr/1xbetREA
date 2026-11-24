package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class x5v extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Throwable l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5v(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                x5v x5vVar = new x5v(3, yjeVar, (byte) 0);
                x5vVar.k = kmqVar;
                x5vVar.l = th;
                return x5vVar.invokeSuspend(Unit.f46060a);
            case 1:
                x5v x5vVar2 = new x5v(3, yjeVar, (byte) 1);
                x5vVar2.k = kmqVar;
                x5vVar2.l = th;
                return x5vVar2.invokeSuspend(Unit.f46060a);
            case 2:
                x5v x5vVar3 = new x5v(3, yjeVar, (byte) 2);
                x5vVar3.k = kmqVar;
                x5vVar3.l = th;
                return x5vVar3.invokeSuspend(Unit.f46060a);
            case 3:
                x5v x5vVar4 = new x5v(3, yjeVar, (byte) 3);
                x5vVar4.k = kmqVar;
                x5vVar4.l = th;
                return x5vVar4.invokeSuspend(Unit.f46060a);
            case 4:
                x5v x5vVar5 = new x5v(3, yjeVar, (byte) 4);
                x5vVar5.k = kmqVar;
                x5vVar5.l = th;
                return x5vVar5.invokeSuspend(Unit.f46060a);
            case 5:
                x5v x5vVar6 = new x5v(3, yjeVar, (byte) 5);
                x5vVar6.k = kmqVar;
                x5vVar6.l = th;
                return x5vVar6.invokeSuspend(Unit.f46060a);
            case 6:
                x5v x5vVar7 = new x5v(3, yjeVar, (byte) 6);
                x5vVar7.k = kmqVar;
                x5vVar7.l = th;
                return x5vVar7.invokeSuspend(Unit.f46060a);
            case 7:
                x5v x5vVar8 = new x5v(3, yjeVar, (byte) 7);
                x5vVar8.k = kmqVar;
                x5vVar8.l = th;
                return x5vVar8.invokeSuspend(Unit.f46060a);
            case 8:
                x5v x5vVar9 = new x5v(3, yjeVar, (byte) 8);
                x5vVar9.k = kmqVar;
                x5vVar9.l = th;
                return x5vVar9.invokeSuspend(Unit.f46060a);
            case 9:
                x5v x5vVar10 = new x5v(3, yjeVar, (byte) 9);
                x5vVar10.k = kmqVar;
                x5vVar10.l = th;
                return x5vVar10.invokeSuspend(Unit.f46060a);
            case 10:
                x5v x5vVar11 = new x5v(3, yjeVar, (byte) 10);
                x5vVar11.k = kmqVar;
                x5vVar11.l = th;
                return x5vVar11.invokeSuspend(Unit.f46060a);
            case 11:
                x5v x5vVar12 = new x5v(3, yjeVar, (byte) 11);
                x5vVar12.k = kmqVar;
                x5vVar12.l = th;
                return x5vVar12.invokeSuspend(Unit.f46060a);
            default:
                x5v x5vVar13 = new x5v(3, yjeVar, (byte) 12);
                x5vVar13.k = kmqVar;
                x5vVar13.l = th;
                return x5vVar13.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.i) {
            case 0:
                kmq kmqVar = this.k;
                Throwable th = this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    e0g0 e0g0Var = j0g0.b;
                    j0g0 j0g0Var = new j0g0(z1x.C(th));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar.a(j0g0Var, this) == wneVar) {
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
                kmq kmqVar2 = this.k;
                Throwable th2 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    e0g0 e0g0Var2 = j0g0.b;
                    j0g0 j0g0Var2 = new j0g0(z1x.C(th2));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar2.a(j0g0Var2, this) == wneVar2) {
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
            case 2:
                kmq kmqVar3 = this.k;
                Throwable th3 = this.l;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (!(th3 instanceof qh6)) {
                        throw th3;
                    }
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar3.a(b3z.f1931a, this) == wneVar3) {
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
                kmq kmqVar4 = this.k;
                Throwable th4 = this.l;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    e0g0 e0g0Var3 = j0g0.b;
                    j0g0 j0g0Var3 = new j0g0(z1x.C(th4));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar4.a(j0g0Var3, this) == wneVar4) {
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
                kmq kmqVar5 = this.k;
                Throwable th5 = this.l;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    e0g0 e0g0Var4 = j0g0.b;
                    j0g0 j0g0Var4 = new j0g0(z1x.C(th5));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar5.a(j0g0Var4, this) == wneVar5) {
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
                kmq kmqVar6 = this.k;
                Throwable th6 = this.l;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    e0g0 e0g0Var5 = j0g0.b;
                    j0g0 j0g0Var5 = new j0g0(z1x.C(th6));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar6.a(j0g0Var5, this) == wneVar6) {
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
                kmq kmqVar7 = this.k;
                Throwable th7 = this.l;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    pb60 pb60Var = new pb60(iun.f15405a, th7);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar7.a(pb60Var, this) == wneVar7) {
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
            case 7:
                kmq kmqVar8 = this.k;
                Throwable th8 = this.l;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    e0g0 e0g0Var6 = j0g0.b;
                    j0g0 j0g0Var6 = new j0g0(z1x.C(th8));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar8.a(j0g0Var6, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                kmq kmqVar9 = this.k;
                Throwable th9 = this.l;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    e0g0 e0g0Var7 = j0g0.b;
                    j0g0 j0g0Var7 = new j0g0(z1x.C(th9));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar9.a(j0g0Var7, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                kmq kmqVar10 = this.k;
                Throwable th10 = this.l;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    e0g0 e0g0Var8 = j0g0.b;
                    j0g0 j0g0Var8 = new j0g0(z1x.C(th10));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar10.a(j0g0Var8, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                kmq kmqVar11 = this.k;
                Throwable th11 = this.l;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    e0g0 e0g0Var9 = j0g0.b;
                    j0g0 j0g0Var9 = new j0g0(z1x.C(th11));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar11.a(j0g0Var9, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                kmq kmqVar12 = this.k;
                Throwable th12 = this.l;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    n8b0 n8b0Var = new n8b0(th12);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar12.a(n8b0Var, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar13 = this.k;
                Throwable th13 = this.l;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    if (!(th13 instanceof u3c)) {
                        throw th13;
                    }
                    Boolean bool = Boolean.FALSE;
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar13.a(bool, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
