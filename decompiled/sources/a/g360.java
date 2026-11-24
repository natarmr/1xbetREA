package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g360 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v360 l;
    public final /* synthetic */ rz50 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g360(v360 v360Var, rz50 rz50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = v360Var;
        this.m = rz50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                g360 g360Var = new g360(this.l, this.m, yjeVar, (byte) 0);
                g360Var.k = obj;
                return g360Var;
            case 1:
                g360 g360Var2 = new g360(this.l, this.m, yjeVar, (byte) 1);
                g360Var2.k = obj;
                return g360Var2;
            default:
                g360 g360Var3 = new g360(this.l, this.m, yjeVar, (byte) 2);
                g360Var3.k = obj;
                return g360Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((g360) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mz50 mz50Var = mz50.f22637a;
        rz50 rz50Var = this.m;
        v360 v360Var = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!(((c260) v360Var.D()).j instanceof sz50)) {
                        rz50 rz50VarA = rz50.a(rz50Var, null, mz50Var, 127);
                        this.k = null;
                        this.j = true;
                        if (kmqVar.a(rz50VarA, this) == wneVar) {
                            return wneVar;
                        }
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
                    if (!(((c260) v360Var.D()).j instanceof sz50)) {
                        rz50 rz50VarA2 = rz50.a(rz50Var, null, mz50Var, 127);
                        this.k = null;
                        this.j = true;
                        if (kmqVar2.a(rz50VarA2, this) == wneVar2) {
                            return wneVar2;
                        }
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
                kmq kmqVar3 = (kmq) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (!(((c260) v360Var.D()).j instanceof sz50)) {
                        rz50 rz50VarA3 = rz50.a(rz50Var, null, mz50Var, 127);
                        this.k = null;
                        this.j = true;
                        if (kmqVar3.a(rz50VarA3, this) == wneVar3) {
                            return wneVar3;
                        }
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
}
