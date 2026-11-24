package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jje0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kje0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jje0(kje0 kje0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kje0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kje0 kje0Var = this.k;
        switch (b) {
            case 0:
                jje0 jje0Var = new jje0(kje0Var, yjeVar, (byte) 0);
                jje0Var.j = ((Boolean) obj).booleanValue();
                return jje0Var;
            default:
                return new jje0(kje0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jje0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jje0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        boolean z = false;
        kje0 kje0Var = this.k;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((dje0) kje0Var.D()).f6182a;
                if (z2 && ((dje0) kje0Var.D()).b) {
                    z = true;
                }
                if (z3 || z) {
                    int i = kje0.u;
                    kje0Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    reu reuVar = kje0Var.p;
                    String str = kje0Var.r;
                    this.j = true;
                    yuu yuuVar = (yuu) reuVar.b;
                    obj = qjj.d0(((mne) yuuVar.b).b, new oed(yuuVar, str, null, (byte) 17), this);
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
                List list = (List) obj;
                int i2 = kje0.u;
                p7m0 p7m0Var = kje0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    list.getClass();
                } while (!p7m0Var.m(value, new dje0(list, false, false)));
                return Unit.f46060a;
        }
    }
}
