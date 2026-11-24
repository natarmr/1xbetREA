package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fot extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fot(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                fot fotVar = new fot(2, yjeVar, (byte) 0);
                fotVar.k = obj;
                return fotVar;
            case 1:
                fot fotVar2 = new fot(2, yjeVar, (byte) 1);
                fotVar2.k = obj;
                return fotVar2;
            case 2:
                fot fotVar3 = new fot(2, yjeVar, (byte) 2);
                fotVar3.k = obj;
                return fotVar3;
            case 3:
                fot fotVar4 = new fot(2, yjeVar, (byte) 3);
                fotVar4.k = obj;
                return fotVar4;
            case 4:
                fot fotVar5 = new fot(2, yjeVar, (byte) 4);
                fotVar5.k = obj;
                return fotVar5;
            case 5:
                fot fotVar6 = new fot(2, yjeVar, (byte) 5);
                fotVar6.k = obj;
                return fotVar6;
            case 6:
                fot fotVar7 = new fot(2, yjeVar, (byte) 6);
                fotVar7.k = obj;
                return fotVar7;
            case 7:
                fot fotVar8 = new fot(2, yjeVar, (byte) 7);
                fotVar8.k = obj;
                return fotVar8;
            case 8:
                fot fotVar9 = new fot(2, yjeVar, (byte) 8);
                fotVar9.k = obj;
                return fotVar9;
            case 9:
                fot fotVar10 = new fot(2, yjeVar, (byte) 9);
                fotVar10.k = obj;
                return fotVar10;
            case 10:
                fot fotVar11 = new fot(2, yjeVar, (byte) 10);
                fotVar11.k = obj;
                return fotVar11;
            case 11:
                fot fotVar12 = new fot(2, yjeVar, (byte) 11);
                fotVar12.k = obj;
                return fotVar12;
            case 12:
                fot fotVar13 = new fot(2, yjeVar, (byte) 12);
                fotVar13.k = obj;
                return fotVar13;
            default:
                fot fotVar14 = new fot(2, yjeVar, (byte) 13);
                fotVar14.k = obj;
                return fotVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fot) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fot) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar;
        switch (this.i) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Boolean bool = Boolean.FALSE;
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(bool, this) == wneVar) {
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
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    e0g0 e0g0Var = j0g0.b;
                    j0g0 j0g0Var = new j0g0(iun.f15405a);
                    this.k = null;
                    this.j = true;
                    if (kmqVar2.a(j0g0Var, this) == wneVar2) {
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
                kmq kmqVar3 = (kmq) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (kmqVar3.a(null, this) == wneVar3) {
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
                kmq kmqVar4 = (kmq) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    iun iunVar = iun.f15405a;
                    this.k = null;
                    this.j = true;
                    if (kmqVar4.a(iunVar, this) == wneVar4) {
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
                kmq kmqVar5 = (kmq) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    iun iunVar2 = iun.f15405a;
                    this.k = null;
                    this.j = true;
                    if (kmqVar5.a(iunVar2, this) == wneVar5) {
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
                    vneVar = (vne) this.k;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vneVar = (vne) this.k;
                    z1x.P(obj);
                }
                while (zvw.X(vneVar.getCoroutineContext())) {
                    mb50 mb50Var = new mb50((byte) 25);
                    this.k = vneVar;
                    this.j = true;
                    if (s0x.P(getContext()).e(mb50Var, this) == wneVar6) {
                        return wneVar6;
                    }
                }
                return Unit.f46060a;
            case 6:
                kmq kmqVar6 = (kmq) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    iun iunVar3 = iun.f15405a;
                    Pair pair = new Pair(iunVar3, iunVar3);
                    this.k = null;
                    this.j = true;
                    if (kmqVar6.a(pair, this) == wneVar7) {
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
                kmq kmqVar7 = (kmq) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    iun iunVar4 = iun.f15405a;
                    Pair pair2 = new Pair(iunVar4, iunVar4);
                    this.k = null;
                    this.j = true;
                    if (kmqVar7.a(pair2, this) == wneVar8) {
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
                kmq kmqVar8 = (kmq) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    iun iunVar5 = iun.f15405a;
                    this.k = null;
                    this.j = true;
                    if (kmqVar8.a(iunVar5, this) == wneVar9) {
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
                kmq kmqVar9 = (kmq) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    iun iunVar6 = iun.f15405a;
                    Pair pair3 = new Pair(iunVar6, iunVar6);
                    this.k = null;
                    this.j = true;
                    if (kmqVar9.a(pair3, this) == wneVar10) {
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
                kmq kmqVar10 = (kmq) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    Unit unit = Unit.f46060a;
                    this.k = null;
                    this.j = true;
                    if (kmqVar10.a(unit, this) == wneVar11) {
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
                kmq kmqVar11 = (kmq) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    Unit unit2 = Unit.f46060a;
                    this.k = null;
                    this.j = true;
                    if (kmqVar11.a(unit2, this) == wneVar12) {
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
            case 12:
                kmq kmqVar12 = (kmq) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (kmqVar12.a(yr00.f43100a, this) == wneVar13) {
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
            default:
                kmq kmqVar13 = (kmq) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    Unit unit3 = Unit.f46060a;
                    this.k = null;
                    this.j = true;
                    if (kmqVar13.a(unit3, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
