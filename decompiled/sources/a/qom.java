package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qom extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ tom k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qom(tom tomVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tomVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tom tomVar = this.k;
        switch (b) {
            case 0:
                return new qom(tomVar, yjeVar, (byte) 0);
            default:
                return new qom(tomVar, yjeVar, (byte) 1);
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
        return ((qom) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tom tomVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    wom womVar = tomVar.t;
                    float f = tomVar.q ? 1.0f : 0.0f;
                    this.j = true;
                    Object objF = womVar.f39505a.f(this, new Float(f));
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
                    if (!tomVar.t.f39505a.e()) {
                        wom womVar2 = tomVar.t;
                        float fL = tomVar.w.l() / tomVar.g1();
                        this.j = true;
                        Object objF2 = womVar2.f39505a.f(this, new Float(fL));
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
