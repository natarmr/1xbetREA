package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class kmi0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ lmi0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmi0(lmi0 lmi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = lmi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lmi0 lmi0Var = this.j;
        switch (b) {
            case 0:
                return new kmi0(lmi0Var, yjeVar, (byte) 0);
            default:
                return new kmi0(lmi0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kmi0) create((smi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kmi0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        p7m0 p7m0Var;
        Object value;
        long j;
        byte b = this.i;
        lmi0 lmi0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((smi0) ((p7m0) lmi0Var.a()).getValue()).f32448a == umi0.c && ((smi0) ((p7m0) lmi0Var.a()).getValue()).b) {
                    lmi0Var.c();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (lmi0Var.d == 0) {
                    lmi0Var.d = System.currentTimeMillis() / 1000;
                }
                qz40 qz40Var = (qz40) lmi0Var.c.getValue();
                do {
                    p7m0Var = (p7m0) qz40Var;
                    value = p7m0Var.getValue();
                    long jLongValue = ((Number) value).longValue();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    long j2 = jCurrentTimeMillis - lmi0Var.d;
                    lmi0Var.d = jCurrentTimeMillis;
                    j = jLongValue + j2;
                    if (j / 3600 >= 100) {
                        j = 0;
                    }
                } while (!p7m0Var.m(value, new Long(j)));
                break;
        }
        return Unit.f46060a;
    }
}
