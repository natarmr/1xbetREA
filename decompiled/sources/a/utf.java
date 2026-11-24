package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class utf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ float l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utf(xcz xczVar, float f, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = f;
        this.m = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new utf(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new utf(this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((utf) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        float f = this.l;
        xcz xczVar = this.k;
        pz40 pz40Var = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        uts0 uts0VarM0 = ro4.m0(800, 0, ihn.f14788a, 2);
                        this.j = true;
                        if (bww.x(xczVar, f, uts0VarM0, this) == wneVar) {
                            return wneVar;
                        }
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
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        uts0 uts0VarM1 = ro4.m0(800, 0, ihn.f14788a, 2);
                        this.j = true;
                        if (bww.x(xczVar, f, uts0VarM1, this) == wneVar2) {
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
