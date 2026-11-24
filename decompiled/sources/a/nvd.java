package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nvd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ svd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nvd(svd svdVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = svdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        svd svdVar = this.j;
        switch (b) {
            case 0:
                return new nvd(svdVar, yjeVar, (byte) 0);
            default:
                return new nvd(svdVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((nvd) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        svd svdVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                svdVar.F();
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = svdVar.B;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    svdVar.B = sac.T(new fnq(svdVar.i.b(), new pvd(svdVar, null, (byte) 3), (byte) 4), d5c.S(jiu0.a(svdVar), svdVar.h.f22085a), new pd(2, null, (byte) 28));
                }
                break;
        }
        return Unit.f46060a;
    }
}
