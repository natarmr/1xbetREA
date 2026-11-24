package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class pi2 extends bnn0 implements Function1 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ qi2 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi2(boolean z, qi2 qi2Var, long j, yje yjeVar) {
        super(1, yjeVar);
        this.i = z;
        this.j = qi2Var;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new pi2(this.i, this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((pi2) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        qi2 qi2Var = this.j;
        i1w0 i1w0Var = qi2Var.p;
        long j = this.k;
        Object obj2 = null;
        if (this.i) {
            fqp0 fqp0Var = ((ei2) qi2Var.D()).c;
            cqp0 cqp0Var = fqp0Var instanceof cqp0 ? (cqp0) fqp0Var : null;
            if (cqp0Var != null && (list2 = cqp0Var.f4807a) != null) {
                for (Object obj3 : list2) {
                    if (((xcp) obj3).f40657a == j) {
                        obj2 = obj3;
                        break;
                    }
                }
                xcp xcpVar = (xcp) obj2;
                if (xcpVar != null) {
                    i1w0Var.d(new mz0((Object) qi2Var, (Object) xcpVar, j, (byte) 3));
                }
            }
        } else {
            fqp0 fqp0Var2 = ((ei2) qi2Var.D()).c;
            eqp0 eqp0Var = fqp0Var2 instanceof eqp0 ? (eqp0) fqp0Var2 : null;
            if (eqp0Var != null && (list = eqp0Var.f8248a) != null) {
                for (Object obj4 : list) {
                    if (((xde0) obj4).f40690a == j) {
                        obj2 = obj4;
                        break;
                    }
                }
                xde0 xde0Var = (xde0) obj2;
                if (xde0Var != null) {
                    i1w0Var.d(new mz0((Object) qi2Var, j, (Object) xde0Var, (byte) 4));
                }
            }
        }
        return Unit.f46060a;
    }
}
