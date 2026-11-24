package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jo0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qo0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo0(qo0 qo0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qo0 qo0Var = this.k;
        switch (b) {
            case 0:
                jo0 jo0Var = new jo0(qo0Var, yjeVar, (byte) 0);
                jo0Var.j = obj;
                return jo0Var;
            case 1:
                jo0 jo0Var2 = new jo0(qo0Var, yjeVar, (byte) 1);
                jo0Var2.j = obj;
                return jo0Var2;
            case 2:
                jo0 jo0Var3 = new jo0(qo0Var, yjeVar, (byte) 2);
                jo0Var3.j = obj;
                return jo0Var3;
            default:
                jo0 jo0Var4 = new jo0(qo0Var, yjeVar, (byte) 3);
                jo0Var4.j = obj;
                return jo0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((jo0) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        qn0 qn0Var = qn0.f29010a;
        qo0 qo0Var = this.k;
        Throwable th = (Throwable) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                yk0 yk0Var = yk0.VIEWED;
                int i = qo0.V;
                qo0Var.X(yk0Var, qn0Var);
                qo0Var.u.b(th, new g20((byte) 19));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                yk0 yk0Var2 = yk0.FAVORITES;
                int i2 = qo0.V;
                qo0Var.X(yk0Var2, qn0Var);
                qo0Var.u.b(th, new g20((byte) 20));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                yk0 yk0Var3 = yk0.FAVORITES;
                int i3 = qo0.V;
                qo0Var.X(yk0Var3, qn0Var);
                qo0Var.X(yk0.VIEWED, qn0Var);
                qo0Var.u.b(th, new g20((byte) 21));
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                yk0 yk0Var4 = yk0.VIEWED;
                int i4 = qo0.V;
                qo0Var.X(yk0Var4, qn0Var);
                qo0Var.u.b(th, new g20((byte) 22));
                break;
        }
        return Unit.f46060a;
    }
}
