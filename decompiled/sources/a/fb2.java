package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class fb2 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hb2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb2(hb2 hb2Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = hb2Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        hb2 hb2Var = this.k;
        switch (b) {
            case 0:
                return new fb2(hb2Var, yjeVar, (byte) 0);
            case 1:
                return new fb2(hb2Var, yjeVar, (byte) 1);
            case 2:
                return new fb2(hb2Var, yjeVar, (byte) 2);
            default:
                return new fb2(hb2Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                return ((fb2) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fb2) create(yjeVar)).invokeSuspend(Unit.f46060a);
            case 2:
                ((fb2) create(yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                return ((fb2) create(yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        byte b = this.i;
        hb2 hb2Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    i89 i89VarC = hb2Var.y.c();
                    eb2 eb2Var = new eb2(hb2Var, (byte) 0);
                    this.j = true;
                    if (i89VarC.c(eb2Var, this) == wneVar) {
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
                    j3c j3cVar = hb2Var.u;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wcb wcbVar = (wcb) objC;
                int i = hb2.E;
                p7m0 p7m0Var = hb2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ab2.a((ab2) value, null, null, false, null, false, false, false, null, wcbVar, null, 61439)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    xae0 xae0VarB = hb2Var.r.b(hb2Var.A);
                    eb2 eb2Var2 = new eb2(hb2Var, b2);
                    this.j = true;
                    if (xae0VarB.f40549a.c(eb2Var2, this) == wneVar3) {
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
                    gmq gmqVarB = hb2Var.v.b();
                    eb2 eb2Var3 = new eb2(hb2Var, (byte) 2);
                    this.j = true;
                    if (gmqVarB.c(eb2Var3, this) == wneVar4) {
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
