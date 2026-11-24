package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class du2 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rv2 k;
    public final /* synthetic */ agk0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du2(rv2 rv2Var, agk0 agk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rv2Var;
        this.l = agk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        agk0 agk0Var = this.l;
        rv2 rv2Var = this.k;
        switch (b) {
            case 0:
                return new du2(rv2Var, agk0Var, yjeVar, (byte) 0);
            case 1:
                return new du2(rv2Var, agk0Var, yjeVar, (byte) 1);
            case 2:
                return new du2(rv2Var, agk0Var, yjeVar, (byte) 2);
            default:
                return new du2(rv2Var, agk0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((du2) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        agk0 agk0Var = this.l;
        rv2 rv2Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    cu2 cu2Var = new cu2(agk0Var, null, (byte) 0);
                    this.j = true;
                    if (rv2.b(rv2Var, cu2Var, this) == wneVar) {
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
                    cu2 cu2Var2 = new cu2(agk0Var, null, (byte) 1);
                    this.j = true;
                    if (rv2.b(rv2Var, cu2Var2, this) == wneVar2) {
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
                    cu2 cu2Var3 = new cu2(agk0Var, null, (byte) 2);
                    this.j = true;
                    if (rv2.b(rv2Var, cu2Var3, this) == wneVar3) {
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
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    cu2 cu2Var4 = new cu2(agk0Var, null, (byte) 3);
                    this.j = true;
                    if (rv2.b(rv2Var, cu2Var4, this) == wneVar4) {
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
        }
    }
}
