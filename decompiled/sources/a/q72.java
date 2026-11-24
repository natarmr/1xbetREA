package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class q72 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ s72 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q72(s72 s72Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = s72Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        s72 s72Var = this.k;
        switch (b) {
            case 0:
                return new q72(s72Var, yjeVar, (byte) 0);
            case 1:
                return new q72(s72Var, yjeVar, (byte) 1);
            case 2:
                return new q72(s72Var, yjeVar, (byte) 2);
            default:
                return new q72(s72Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                return ((q72) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((q72) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 2:
                ((q72) create(yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                return ((q72) create(yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        s72 s72Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    a1t a1tVarA = s72Var.A.a();
                    p72 p72Var = new p72(s72Var, (byte) 0);
                    this.j = true;
                    if (a1tVarA.c(p72Var, this) == wneVar) {
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
                    xae0 xae0VarN = vtb.N(((sx40) s72Var.C.f40810a).f32956a.f31247a);
                    p72 p72Var2 = new p72(s72Var, b2);
                    this.j = true;
                    if (xae0VarN.f40549a.c(p72Var2, this) == wneVar2) {
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
                    xae0 xae0VarB = s72Var.p.b(s72Var.o.d);
                    p72 p72Var3 = new p72(s72Var, (byte) 2);
                    this.j = true;
                    if (xae0VarB.f40549a.c(p72Var3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                csj.b();
                return null;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    gmq gmqVarB = s72Var.t.b();
                    p72 p72Var4 = new p72(s72Var, (byte) 3);
                    this.j = true;
                    if (gmqVarB.c(p72Var4, this) == wneVar4) {
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
