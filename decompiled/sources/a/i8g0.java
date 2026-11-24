package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i8g0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ m8g0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8g0(m8g0 m8g0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = m8g0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        m8g0 m8g0Var = this.k;
        switch (b) {
            case 0:
                return new i8g0(m8g0Var, yjeVar, (byte) 0);
            default:
                i8g0 i8g0Var = new i8g0(m8g0Var, yjeVar, (byte) 1);
                i8g0Var.j = ((Boolean) obj).booleanValue();
                return i8g0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i8g0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((i8g0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        m8g0 m8g0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p4u p4uVar = m8g0Var.t;
                    String str = m8g0Var.o;
                    this.j = true;
                    z220 z220Var = (z220) p4uVar.f26374a;
                    obj = qjj.d0(((mne) z220Var.e).b, new oed(z220Var, str, null, (byte) 20), this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                l7g0 l7g0Var = (l7g0) obj;
                int i = m8g0.x;
                p7m0 p7m0Var = m8g0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, w7g0.a((w7g0) value, false, false, false, l7g0Var, null, null, 48)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((w7g0) m8g0Var.D()).f38671a;
                if ((z2 && (((w7g0) m8g0Var.D()).f38671a || ((w7g0) m8g0Var.D()).b)) || z3) {
                    int i2 = m8g0.x;
                    m8g0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
