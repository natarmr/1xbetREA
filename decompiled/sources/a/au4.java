package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class au4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ku4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au4(ku4 ku4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ku4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ku4 ku4Var = this.k;
        switch (b) {
            case 0:
                return new au4(ku4Var, yjeVar, (byte) 0);
            case 1:
                return new au4(ku4Var, yjeVar, (byte) 1);
            default:
                return new au4(ku4Var, yjeVar, (byte) 2);
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
        }
        return ((au4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        ku4 ku4Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    qq4 qq4Var = ku4.J;
                    ku4Var.G(vt4.f37984a);
                    cu cuVar = ku4Var.g;
                    this.j = true;
                    if (cuVar.l(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                qq4 qq4Var2 = ku4.J;
                ku4Var.v.f(st4.f32756a);
                ku4Var.w();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0Var = ku4Var.c.f32825a.e.f37746a;
                bm3 bm3Var = new bm3(ku4Var, (byte) 29);
                this.j = true;
                qoj0Var.c(bm3Var, this);
                return wneVar2;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    rou rouVar = ku4Var.l;
                    this.j = true;
                    if (rouVar.a(true, this) == wneVar3) {
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
}
