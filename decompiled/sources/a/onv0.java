package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class onv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qnv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onv0(qnv0 qnv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qnv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qnv0 qnv0Var = this.k;
        switch (b) {
            case 0:
                return new onv0(qnv0Var, yjeVar, (byte) 0);
            default:
                onv0 onv0Var = new onv0(qnv0Var, yjeVar, (byte) 1);
                onv0Var.j = ((Boolean) obj).booleanValue();
                return onv0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((onv0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((onv0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        qnv0 qnv0Var = this.k;
        boolean z = true;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    g2v g2vVar = qnv0Var.o;
                    String str = qnv0Var.s;
                    this.j = true;
                    klv0 klv0Var = (klv0) g2vVar.f10580a;
                    obj = qjj.d0(klv0Var.c.b, new j0q0(klv0Var, str, null, (byte) 2), this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = (List) obj;
                int i = qnv0.x;
                p7m0 p7m0Var = qnv0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, jnv0.a((jnv0) value, false, false, list.isEmpty(), list, 16)));
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = !z3 && ((jnv0) qnv0Var.D()).f16830a;
                if (!z3 || (!((jnv0) qnv0Var.D()).b && !((jnv0) qnv0Var.D()).c)) {
                    z = false;
                }
                if (z4 || z) {
                    int i2 = qnv0.x;
                    qnv0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
