package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ys6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dt6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys6(dt6 dt6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dt6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dt6 dt6Var = this.k;
        switch (b) {
            case 0:
                ys6 ys6Var = new ys6(dt6Var, yjeVar, (byte) 0);
                ys6Var.j = ((Boolean) obj).booleanValue();
                return ys6Var;
            default:
                return new ys6(dt6Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ys6) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ys6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        dt6 dt6Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = dt6.e0;
                p7m0 p7m0Var = dt6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, c820.a((c820) value, null, null, null, null, null, null, false, z, false, false, null, 7935)));
                if (z) {
                    dt6Var.c0();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                go7 go7Var = ((c820) dt6Var.D()).b;
                if (go7Var.equals(do7.f6402a)) {
                    this.j = true;
                    if (dt6Var.Q(this) == wneVar2) {
                        return wneVar2;
                    }
                    return Unit.f46060a;
                }
                if (go7Var.equals(ao7.f1188a)) {
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
