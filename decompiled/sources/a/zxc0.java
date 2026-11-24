package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zxc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ayc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxc0(ayc0 ayc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ayc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ayc0 ayc0Var = this.k;
        switch (b) {
            case 0:
                return new zxc0(ayc0Var, yjeVar, (byte) 0);
            case 1:
                zxc0 zxc0Var = new zxc0(ayc0Var, yjeVar, (byte) 1);
                zxc0Var.j = ((Boolean) obj).booleanValue();
                return zxc0Var;
            default:
                zxc0 zxc0Var2 = new zxc0(ayc0Var, yjeVar, (byte) 2);
                zxc0Var2.j = ((Boolean) obj).booleanValue();
                return zxc0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zxc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zxc0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((zxc0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        ayc0 ayc0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hse0 hse0Var = ayc0Var.p;
                    this.j = true;
                    if (hse0.a(hse0Var, null, true, this, 5) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ayc0Var.Q(ayc0Var.o);
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = ((qxc0) ayc0Var.D()).e != z2;
                p7m0 p7m0Var = ayc0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, qxc0.a((qxc0) value, false, false, false, z2, 15)));
                if (z3) {
                    ayc0Var.Q(ayc0Var.o);
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = ayc0Var.f;
                ocj ocjVar = ayc0Var.i;
                if (z4) {
                    int i = ayc0.O;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, qxc0.a((qxc0) value3, false, true, false, false, 25)));
                    if (!((qxc0) ayc0Var.D()).d) {
                        ayc0Var.Q(ayc0Var.o);
                    }
                } else {
                    int i2 = ayc0.O;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, qxc0.a((qxc0) value2, false, false, false, false, 24)));
                }
                return Unit.f46060a;
        }
    }
}
