package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gy40 k;
    public final /* synthetic */ jub0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(jub0 jub0Var, gy40 gy40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = jub0Var;
        this.k = gy40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jub0 jub0Var = this.l;
        gy40 gy40Var = this.k;
        switch (b) {
            case 0:
                return new o1(jub0Var, gy40Var, yjeVar);
            case 1:
                return new o1(gy40Var, jub0Var, yjeVar, (byte) 1);
            default:
                return new o1(gy40Var, jub0Var, yjeVar, (byte) 2);
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
        return ((o1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jub0 jub0Var = this.l;
        gy40 gy40Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kub0 kub0Var = new kub0(jub0Var);
                    this.j = true;
                    if (gy40Var.a(kub0Var, this) == wneVar) {
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
                    this.j = true;
                    if (gy40Var.a(jub0Var, this) == wneVar2) {
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
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (gy40Var.a(jub0Var, this) == wneVar3) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(gy40 gy40Var, jub0 jub0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gy40Var;
        this.l = jub0Var;
    }
}
