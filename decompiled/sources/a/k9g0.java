package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class k9g0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ o9g0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9g0(o9g0 o9g0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = o9g0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        o9g0 o9g0Var = this.k;
        switch (b) {
            case 0:
                return new k9g0(o9g0Var, yjeVar, (byte) 0);
            default:
                return new k9g0(o9g0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((k9g0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        Object value2;
        e9g0 e9g0Var;
        iun iunVar;
        xun xunVar;
        q5g0 q5g0Var;
        Set set;
        byte b = this.i;
        o9g0 o9g0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    j3c j3cVar = o9g0Var.H;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wcb wcbVar = (wcb) objC;
                int i = o9g0.M;
                p7m0 p7m0Var = o9g0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, e9g0.a((e9g0) value, null, null, null, 0L, null, wcbVar, null, 14335)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jV0 = ibc.v0(2, bfn.MINUTES);
                    this.j = true;
                    if (qcc.P(jV0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((b6t) o9g0Var.w.b).c.f33385a.n(null);
                p7m0 p7m0Var2 = o9g0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    e9g0Var = (e9g0) value2;
                    o9g0Var.f.getClass();
                    iunVar = iun.f15405a;
                    xunVar = xun.f41520a;
                    q5g0Var = q5g0.b;
                    set = e9g0Var.m.f42829a;
                    set.getClass();
                } while (!p7m0Var2.m(value2, e9g0.a(e9g0Var, xunVar, iunVar, q5g0Var, -321L, null, null, new yl9(set, null), 11835)));
                o9g0Var.B.k(xunVar);
                o9g0Var.C.f(iunVar);
                return Unit.f46060a;
        }
    }
}
