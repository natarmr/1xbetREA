package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w0q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ x0q0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0q0(x0q0 x0q0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x0q0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        x0q0 x0q0Var = this.k;
        switch (b) {
            case 0:
                w0q0 w0q0Var = new w0q0(x0q0Var, yjeVar, (byte) 0);
                w0q0Var.j = ((Boolean) obj).booleanValue();
                return w0q0Var;
            default:
                return new w0q0(x0q0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((w0q0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w0q0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        p0q0 p0q0Var;
        Object value2;
        byte b = this.i;
        x0q0 x0q0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && (((p0q0) x0q0Var.D()).f26166a || ((p0q0) x0q0Var.D()).b)) {
                    x0q0Var.M(false);
                } else {
                    int i = x0q0.B;
                    p7m0 p7m0Var = x0q0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        p0q0Var = (p0q0) value;
                        x0q0Var.f.getClass();
                    } while (!p7m0Var.m(value, p0q0.a(p0q0Var, false, Intrinsics.d(p0q0Var.e, rgv0.g), 28)));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = x0q0.B;
                p7m0 p7m0Var2 = x0q0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, p0q0.a((p0q0) value2, true, false, 30)));
                return Unit.f46060a;
        }
    }
}
