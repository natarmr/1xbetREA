package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gbx extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ibx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbx(ibx ibxVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ibxVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ibx ibxVar = this.j;
        switch (b) {
            case 0:
                return new gbx(ibxVar, yjeVar, (byte) 0);
            default:
                return new gbx(ibxVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gbx) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gbx) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ibx ibxVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = ibxVar.k;
                byte b2 = 1;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    yje yjeVar = null;
                    ibxVar.k = sac.T(new dnq(new fnq(ibxVar.g.b(), new u88(ibxVar, yjeVar, (byte) 21), (byte) 4), new qos((Object) ibxVar, yjeVar, (byte) 9), (byte) 1), d5c.S(jiu0.a(ibxVar), ibxVar.j.f22085a), new sax(2, yjeVar, b2));
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ibxVar.m.f(new abx(ibxVar.h.f15748a.b()));
                break;
        }
        return Unit.f46060a;
    }
}
