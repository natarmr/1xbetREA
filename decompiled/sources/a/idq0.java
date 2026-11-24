package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class idq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ jdq0 k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ idq0(jdq0 jdq0Var, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jdq0Var;
        this.l = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        float f = this.l;
        jdq0 jdq0Var = this.k;
        switch (b) {
            case 0:
                return new idq0(jdq0Var, f, yjeVar, (byte) 0);
            default:
                return new idq0(jdq0Var, f, yjeVar, (byte) 1);
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
        return ((idq0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        float f = this.l;
        jdq0 jdq0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    t33 t33Var = jdq0Var.t;
                    if (t33Var != null) {
                        Float f2 = new Float(f);
                        j73 j73Var = jdq0Var.r ? fzn0.f : jdq0Var.q;
                        this.j = true;
                        obj = t33.a(t33Var, f2, j73Var, null, null, this, 12);
                        if (obj == wneVar) {
                            return wneVar;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    t33 t33Var2 = jdq0Var.s;
                    if (t33Var2 != null) {
                        Float f3 = new Float(f);
                        j73 j73Var2 = jdq0Var.r ? fzn0.f : jdq0Var.q;
                        this.j = true;
                        obj = t33.a(t33Var2, f3, j73Var2, null, null, this, 12);
                        if (obj == wneVar2) {
                            return wneVar2;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
        }
    }
}
