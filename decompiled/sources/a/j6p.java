package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j6p extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k6p k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6p(k6p k6pVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k6pVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k6p k6pVar = this.k;
        switch (b) {
            case 0:
                j6p j6pVar = new j6p(k6pVar, yjeVar, (byte) 0);
                j6pVar.j = ((Boolean) obj).booleanValue();
                return j6pVar;
            case 1:
                return new j6p(k6pVar, yjeVar, (byte) 1);
            default:
                return new j6p(k6pVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((j6p) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j6p) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j6p) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        bby bbyVar;
        Object value2;
        byte b = this.i;
        k6p k6pVar = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                p7m0 p7m0Var = k6pVar.u;
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && !(p7m0Var.getValue() instanceof c6p)) {
                    do {
                        value2 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value2, new e6p(kotlin.collections.a.c(y5p.f42059a))));
                    k6pVar.x();
                } else if (z && ((bbyVar = k6pVar.p) == null || !bbyVar.isActive())) {
                    k6pVar.x();
                } else if (!z && (p7m0Var.getValue() instanceof e6p)) {
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, new d6p(k6pVar.w())));
                }
                k6pVar.s = z;
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    yzn0 yzn0Var = k6pVar.e;
                    this.j = true;
                    if (yzn0Var.l(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vsg0 vsg0VarH0 = bkb.h0(30L, TimeUnit.SECONDS, new j6p(k6pVar, yjeVar, b2));
                    h3p h3pVar = h3p.c;
                    this.j = true;
                    if (vsg0VarH0.c(h3pVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
