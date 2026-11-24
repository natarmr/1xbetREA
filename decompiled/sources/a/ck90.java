package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ck90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kk90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck90(kk90 kk90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kk90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kk90 kk90Var = this.k;
        switch (b) {
            case 0:
                return new ck90(kk90Var, yjeVar, (byte) 0);
            default:
                ck90 ck90Var = new ck90(kk90Var, yjeVar, (byte) 1);
                ck90Var.j = ((Boolean) obj).booleanValue();
                return ck90Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ck90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ck90) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 1;
        kk90 kk90Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ywq0 ywq0Var = kk90Var.u;
                    i8i.D("screen", "acc_personal", ((zg) ywq0Var.b).f44322a, "acc_change_password_call");
                    b1j.v("acc_personal", ((au0) ywq0Var.f).f1455a, 3240L);
                    this.j = true;
                    if (kk90Var.x(false, this) == wneVar) {
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
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    e3c.n(kk90Var.H);
                    kk90Var.H = sac.V(jiu0.a(kk90Var), new hj90(kk90Var, b2), new pl70(kk90Var, (byte) 16), kk90Var.m.b, new mt00((Object) kk90Var, yjeVar, (byte) 29), 8);
                } else if (z2 || !kk90Var.F) {
                    p7m0 p7m0Var = kk90Var.C;
                    p7m0Var.getClass();
                    p7m0Var.o(null, pj90.f27078a);
                } else {
                    kk90Var.H();
                }
                return Unit.f46060a;
        }
    }
}
