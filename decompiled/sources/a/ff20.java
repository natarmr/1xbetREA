package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ff20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qg20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff20(qg20 qg20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qg20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qg20 qg20Var = this.k;
        switch (b) {
            case 0:
                return new ff20(qg20Var, yjeVar, (byte) 0);
            case 1:
                return new ff20(qg20Var, yjeVar, (byte) 1);
            case 2:
                return new ff20(qg20Var, yjeVar, (byte) 2);
            case 3:
                return new ff20(qg20Var, yjeVar, (byte) 3);
            case 4:
                return new ff20(qg20Var, yjeVar, (byte) 4);
            case 5:
                ff20 ff20Var = new ff20(qg20Var, yjeVar, (byte) 5);
                ff20Var.j = ((Boolean) obj).booleanValue();
                return ff20Var;
            default:
                return new ff20(qg20Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ff20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ff20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ff20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ff20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ff20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ff20) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ff20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        qg20 qg20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tqc tqcVar = qg20Var.j0;
                    this.j = true;
                    if (tqcVar.b(true, this) == wneVar) {
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
                    tqc tqcVar2 = qg20Var.j0;
                    this.j = true;
                    if (tqcVar2.b(true, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    tqc tqcVar3 = qg20Var.j0;
                    this.j = true;
                    if (tqcVar3.b(true, this) == wneVar3) {
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
                    qoj0 qoj0Var = qg20Var.i1;
                    q4f q4fVarA = qg20Var.i.a();
                    this.j = true;
                    if (qoj0Var.a(q4fVarA, this) == wneVar4) {
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
                    tqc tqcVar4 = qg20Var.j0;
                    this.j = true;
                    if (tqcVar4.b(false, this) == wneVar5) {
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
                boolean z6 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (z6) {
                    qg20Var.S();
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(vtb.N(qg20Var.D0.f41366a.r));
                    kf20 kf20Var = new kf20(qg20Var, yjeVar, (byte) 3);
                    this.j = true;
                    if (slb.O(gmqVarW, kf20Var, this) == wneVar7) {
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
        }
    }
}
