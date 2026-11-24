package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jfd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kfd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jfd(kfd kfdVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kfdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kfd kfdVar = this.k;
        switch (b) {
            case 0:
                jfd jfdVar = new jfd(kfdVar, yjeVar, (byte) 0);
                jfdVar.j = ((Boolean) obj).booleanValue();
                return jfdVar;
            default:
                return new jfd(kfdVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jfd) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jfd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        kfd kfdVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z2 = !z && ((sed) kfdVar.D()).f32072a;
                boolean z3 = z && ((sed) kfdVar.D()).b;
                if (z2 || z3) {
                    int i = kfd.w;
                    kfdVar.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bwl bwlVar = kfdVar.p;
                    String str = kfdVar.s;
                    this.j = true;
                    lhf0 lhf0Var = (lhf0) bwlVar.f3330a;
                    obj = qjj.d0(((mne) lhf0Var.b).b, new oed(lhf0Var, str, null, (byte) 0), this);
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
                int i2 = kfd.w;
                p7m0 p7m0Var = kfdVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    list.getClass();
                } while (!p7m0Var.m(value, new sed(list, false, false)));
                return Unit.f46060a;
        }
    }
}
