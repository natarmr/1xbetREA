package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kvh0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pvh0 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ oms0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kvh0(pvh0 pvh0Var, Object obj, oms0 oms0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = pvh0Var;
        this.l = obj;
        this.m = oms0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new kvh0(this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new kvh0(this.k, this.l, this.m, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((kvh0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        float f;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kv kvVar = new kv(this.k, this.l, this.m, null, (byte) 18);
                    this.j = true;
                    if (d5c.J(this, kvVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                oms0 oms0Var = this.m;
                if (!z2) {
                    z1x.P(obj);
                    pvh0 pvh0Var = this.k;
                    pvh0Var.o1();
                    pz40 pz40Var = pvh0Var.c;
                    pvh0Var.n = Long.MIN_VALUE;
                    pvh0Var.u1(0.0f);
                    Object value = ((hgk0) pvh0Var.d).getValue();
                    Object obj2 = this.l;
                    if (Intrinsics.d(obj2, value)) {
                        f = -4.0f;
                    } else {
                        f = Intrinsics.d(obj2, ((hgk0) pz40Var).getValue()) ? -5.0f : -3.0f;
                    }
                    oms0Var.r(obj2);
                    oms0Var.o(0L);
                    ((hgk0) pz40Var).setValue(obj2);
                    pvh0Var.u1(0.0f);
                    pvh0Var.I0(obj2);
                    oms0Var.k(f);
                    if (f == -3.0f) {
                        this.j = true;
                        if (pvh0Var.x1(this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                oms0Var.j();
                return Unit.f46060a;
        }
    }
}
