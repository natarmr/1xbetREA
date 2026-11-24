package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class efd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gfd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efd(gfd gfdVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gfdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gfd gfdVar = this.k;
        switch (b) {
            case 0:
                efd efdVar = new efd(gfdVar, yjeVar, (byte) 0);
                efdVar.j = ((Boolean) obj).booleanValue();
                return efdVar;
            default:
                return new efd(gfdVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((efd) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((efd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        gfd gfdVar = this.k;
        boolean z = true;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((cfd) gfdVar.D()).b;
                if (!z2 || (!((cfd) gfdVar.D()).c && !((cfd) gfdVar.D()).d)) {
                    z = false;
                }
                if (z3 || z) {
                    int i = gfd.u;
                    gfdVar.M();
                }
                return Unit.f46060a;
            default:
                oyg0 oyg0Var = gfdVar.f;
                ocj ocjVar = gfdVar.i;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    lsn lsnVar = gfdVar.p;
                    String str = gfdVar.s;
                    this.j = true;
                    y3v y3vVar = (y3v) lsnVar.f20589a;
                    obj = qjj.d0(((mne) y3vVar.b).b, new oed(y3vVar, str, null, (byte) 27), this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                t6p0 t6p0Var = (t6p0) obj;
                int i2 = gfd.u;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, cfd.a((cfd) value, t6p0Var.f33430a, false, false, false, null, 30)));
                List list = t6p0Var.b;
                if (list.isEmpty()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, cfd.a((cfd) value2, 0L, false, false, true, null, 17)));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value3, cfd.a((cfd) value3, 0L, false, false, false, list, 1)));
                }
                return Unit.f46060a;
        }
    }
}
