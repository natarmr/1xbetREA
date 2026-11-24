package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yma0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dna0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yma0(dna0 dna0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dna0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dna0 dna0Var = this.k;
        switch (b) {
            case 0:
                return new yma0(dna0Var, yjeVar, (byte) 0);
            case 1:
                return new yma0(dna0Var, yjeVar, (byte) 1);
            case 2:
                yma0 yma0Var = new yma0(dna0Var, yjeVar, (byte) 2);
                yma0Var.j = ((Boolean) obj).booleanValue();
                return yma0Var;
            default:
                return new yma0(dna0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yma0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yma0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yma0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yma0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dna0 dna0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jwu jwuVar = dna0Var.s;
                    String str = dna0Var.o;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar) {
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
                    jwu jwuVar2 = dna0Var.s;
                    String str2 = dna0Var.o;
                    this.j = true;
                    if (jwuVar2.b(str2, this) == wneVar2) {
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
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = !z3 && ((pma0) dna0Var.D()).h;
                boolean z5 = z3 && ((pma0) dna0Var.D()).i;
                if (z4 || z5) {
                    int i = dna0.E;
                    dna0Var.N();
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bby bbyVar = dna0Var.A;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                dna0Var.A = null;
                return Unit.f46060a;
        }
    }
}
