package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fvs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f3j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvs(f3j f3jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f3jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f3j f3jVar = this.k;
        switch (b) {
            case 0:
                fvs fvsVar = new fvs(f3jVar, yjeVar, (byte) 0);
                fvsVar.j = obj;
                return fvsVar;
            default:
                fvs fvsVar2 = new fvs(f3jVar, yjeVar, (byte) 1);
                fvsVar2.j = obj;
                return fvsVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fvs) create((xvm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fvs) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        f3j f3jVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                xvm0 xvm0Var = (xvm0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = (p7m0) f3jVar.q;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, yus.a((yus) value, 0L, null, 0L, false, 0L, null, null, null, false, false, false, false, false, false, false, xvm0Var.getId(), null, false, 458751)));
                break;
            default:
                px7 px7Var = (px7) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = (p7m0) f3jVar.q;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, yus.a((yus) value2, 0L, null, 0L, false, 0L, null, null, null, false, false, false, false, false, false, false, 0L, px7Var, false, 393215)));
                break;
        }
        return Unit.f46060a;
    }
}
