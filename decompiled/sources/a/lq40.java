package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lq40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq40(xcz xczVar, pz40 pz40Var, pz40 pz40Var2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xczVar;
        this.l = pz40Var;
        this.m = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lq40 lq40Var = new lq40(this.k, this.l, this.m, yjeVar, (byte) 0);
                lq40Var.j = obj;
                return lq40Var;
            default:
                lq40 lq40Var2 = new lq40(this.k, this.l, this.m, yjeVar, (byte) 1);
                lq40Var2.j = obj;
                return lq40Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((lq40) create(num, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.m;
        pz40 pz40Var2 = this.l;
        xcz xczVar = this.k;
        Integer num = (Integer) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = (int) (xczVar.j().o * 0.75f);
                if (num != null && num.intValue() >= i && !((x77) pz40Var2.getValue()).j) {
                    ((Function1) pz40Var.getValue()).invoke(l37.f19345a);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = (int) (xczVar.j().o * 0.75f);
                if (num != null && num.intValue() >= i2) {
                    ((ll7) pz40Var2.getValue()).getClass();
                    ((Function1) pz40Var.getValue()).invoke(wi7.f39200a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
