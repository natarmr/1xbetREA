package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v920 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y920 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v920(y920 y920Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = y920Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        y920 y920Var = this.k;
        switch (b) {
            case 0:
                v920 v920Var = new v920(y920Var, yjeVar, (byte) 0);
                v920Var.j = obj;
                return v920Var;
            default:
                v920 v920Var2 = new v920(y920Var, yjeVar, (byte) 1);
                v920Var2.j = obj;
                return v920Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((v920) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((v920) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        y920 y920Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                y920Var.o.n((jg7) obj2);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                y920Var.f.b((Throwable) obj2, new j920(y920Var, (byte) 2));
                break;
        }
        return Unit.f46060a;
    }
}
