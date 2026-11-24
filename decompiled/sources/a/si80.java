package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class si80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ti80 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si80(ti80 ti80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ti80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ti80 ti80Var = this.j;
        switch (b) {
            case 0:
                return new si80(ti80Var, yjeVar, (byte) 0);
            default:
                return new si80(ti80Var, yjeVar, (byte) 1);
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
        return ((si80) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ti80 ti80Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ti80Var.g.f(new Integer(0));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ti80Var.f.f(new Integer(0));
                break;
        }
        return Unit.f46060a;
    }
}
