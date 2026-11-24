package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z8d0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ c9d0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8d0(c9d0 c9d0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = c9d0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c9d0 c9d0Var = this.k;
        switch (b) {
            case 0:
                return new z8d0(c9d0Var, yjeVar, (byte) 0);
            default:
                return new z8d0(c9d0Var, yjeVar, (byte) 1);
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
        return ((z8d0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        c9d0 c9d0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    d9d0 d9d0Var = c9d0Var.t;
                    float f = c9d0Var.q ? 1.0f : 0.0f;
                    this.j = true;
                    Object objF = d9d0Var.f5695a.f(this, new Float(f));
                    if (objF != wneVar) {
                        objF = Unit.f46060a;
                    }
                    if (objF == wneVar) {
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
                    if (!c9d0Var.t.f5695a.e()) {
                        d9d0 d9d0Var2 = c9d0Var.t;
                        float fL = c9d0Var.w.l() / c9d0Var.f1();
                        this.j = true;
                        Object objF2 = d9d0Var2.f5695a.f(this, new Float(fL));
                        if (objF2 != wneVar2) {
                            objF2 = Unit.f46060a;
                        }
                        if (objF2 == wneVar2) {
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
        }
    }
}
