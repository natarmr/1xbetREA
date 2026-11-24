package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final class s4e0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ t4e0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4e0(t4e0 t4e0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = t4e0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        t4e0 t4e0Var = this.k;
        switch (b) {
            case 0:
                return new s4e0(t4e0Var, yjeVar, (byte) 0);
            case 1:
                return new s4e0(t4e0Var, yjeVar, (byte) 1);
            default:
                s4e0 s4e0Var = new s4e0(t4e0Var, yjeVar, (byte) 2);
                s4e0Var.j = ((Boolean) obj).booleanValue();
                return s4e0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s4e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((s4e0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        byte b = this.i;
        t4e0 t4e0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    j6i0 j6i0Var = ((n4e0) t4e0Var.D()).f22894a;
                    if (j6i0Var != null) {
                        eyg0 eyg0Var = t4e0Var.w;
                        this.j = true;
                        r7e0 r7e0Var = (r7e0) ((z220) eyg0Var.b).c;
                        r7e0Var.getClass();
                        r7e0Var.c.g(j6i0Var);
                        if (Unit.f46060a == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                ocj ocjVar = t4e0Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = t4e0.x;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, n4e0.a((n4e0) value, null, true, false, 13)));
                    b8u b8uVar = t4e0Var.r;
                    RatingStatisticScreenParams ratingStatisticScreenParams = t4e0Var.o;
                    this.j = true;
                    obj = b8uVar.f(ratingStatisticScreenParams, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                j6i0 j6i0Var2 = (j6i0) obj;
                int i2 = t4e0.x;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, n4e0.a((n4e0) value2, j6i0Var2, false, false, 8)));
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3 && (((n4e0) t4e0Var.D()).b || ((n4e0) t4e0Var.D()).c)) {
                    t4e0Var.N();
                }
                return Unit.f46060a;
        }
    }
}
