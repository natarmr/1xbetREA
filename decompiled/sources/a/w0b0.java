package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w0b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ f1b0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0b0(f1b0 f1b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = f1b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f1b0 f1b0Var = this.j;
        switch (b) {
            case 0:
                return new w0b0(f1b0Var, yjeVar, (byte) 0);
            case 1:
                return new w0b0(f1b0Var, yjeVar, (byte) 1);
            default:
                return new w0b0(f1b0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((w0b0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((w0b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((w0b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        f1b0 f1b0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                jfa0 jfa0Var = new jfa0((byte) 19);
                int i = f1b0.w0;
                f1b0Var.H(jfa0Var);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = f1b0.w0;
                p7m0 p7m0Var = f1b0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d0b0.a((d0b0) value, null, null, null, null, null, false, false, false, false, null, false, 2047)));
                if (((d0b0) f1b0Var.D()).g) {
                    f1b0Var.U();
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (f1b0Var.T.r(fk60.POPULAR_AGGREGATOR)) {
                    f1b0Var.G(uza0.f36528a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
