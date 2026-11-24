package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class mih0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sih0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mih0(sih0 sih0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = sih0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        sih0 sih0Var = this.k;
        switch (b) {
            case 0:
                return new mih0(sih0Var, yjeVar, (byte) 0);
            default:
                return new mih0(sih0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((mih0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        byte b = this.i;
        sih0 sih0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    j3c j3cVar = sih0Var.u;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wcb wcbVar = (wcb) objC;
                int i = sih0.N;
                p7m0 p7m0Var = sih0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, uhh0.a((uhh0) value, null, null, null, null, null, null, null, null, 0L, wcbVar, null, null, false, null, 67106815)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    yhi yhiVar = sih0Var.r;
                    int i2 = sih0Var.p;
                    bvc bvcVarA = jiu0.a(sih0Var);
                    n0w n0wVar = ((uhh0) sih0Var.D()).w;
                    boolean z3 = ((uhh0) sih0Var.D()).s;
                    this.j = true;
                    if (yhiVar.e(i2, bvcVarA, n0wVar, z3, this) == wneVar2) {
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
        }
    }
}
