package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z0b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f1b0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0b0(f1b0 f1b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = f1b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f1b0 f1b0Var = this.l;
        switch (b) {
            case 0:
                z0b0 z0b0Var = new z0b0(f1b0Var, yjeVar, (byte) 0);
                z0b0Var.k = obj;
                return z0b0Var;
            default:
                z0b0 z0b0Var2 = new z0b0(f1b0Var, yjeVar, (byte) 1);
                z0b0Var2.k = obj;
                return z0b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sw00 sw00Var = (sw00) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((z0b0) create(sw00Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objE;
        Object value;
        Object value2;
        byte b = this.i;
        f1b0 f1b0Var = this.l;
        switch (b) {
            case 0:
                ocj ocjVar = f1b0Var.i;
                sw00 sw00Var = (sw00) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ouu ouuVar = f1b0Var.S;
                    this.k = sw00Var;
                    this.j = true;
                    objE = ouuVar.E(this);
                    if (objE == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                boolean zBooleanValue = ((Boolean) objE).booleanValue();
                int i = f1b0.w0;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d0b0.a((d0b0) value, null, null, null, null, null, false, false, zBooleanValue, false, null, false, 3839)));
                if (((d0b0) f1b0Var.D()).g != sw00Var.f32897a) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, d0b0.a((d0b0) value2, null, null, null, null, null, sw00Var.f32897a, false, false, false, null, false, 4031)));
                    f1b0Var.R(true);
                }
                return Unit.f46060a;
            default:
                sw00 sw00Var2 = (sw00) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (!sw00Var2.b && sw00Var2.f32897a) {
                        wsf0 wsf0Var = f1b0Var.Q;
                        this.k = null;
                        this.j = true;
                        if (wsf0Var.o(this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i2 = f1b0.w0;
                f1b0Var.Y();
                return Unit.f46060a;
        }
    }
}
