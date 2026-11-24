package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ul40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ vl40 k;
    public final /* synthetic */ pb5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul40(vl40 vl40Var, pb5 pb5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vl40Var;
        this.l = pb5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pb5 pb5Var = this.l;
        vl40 vl40Var = this.k;
        switch (b) {
            case 0:
                return new ul40(vl40Var, pb5Var, yjeVar, (byte) 0);
            default:
                return new ul40(vl40Var, pb5Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ul40) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pb5 pb5Var = this.l;
        vl40 vl40Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = vl40Var.e;
                    Float f = new Float(vb5.f37124a.a(pb5Var.c));
                    this.j = true;
                    if (t33Var.f(this, f) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    t33 t33Var2 = vl40Var.e;
                    Float f2 = new Float(vb5.f37124a.a(pb5Var.c));
                    this.j = true;
                    if (t33Var2.f(this, f2) == wneVar2) {
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
