package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class dz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ez k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz(ez ezVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ezVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ez ezVar = this.k;
        switch (b) {
            case 0:
                return new dz(ezVar, yjeVar, (byte) 0);
            default:
                dz dzVar = new dz(ezVar, yjeVar, (byte) 1);
                dzVar.j = ((Boolean) obj).booleanValue();
                return dzVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((dz) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object value;
        Object value2;
        byte b = this.i;
        ez ezVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ivn ivnVar = ezVar.p;
                    long j = ezVar.o;
                    this.j = true;
                    obj = ((nhf0) ivnVar.f15453a).h(j, this);
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
                List list = (List) obj;
                int i = ez.x;
                p7m0 p7m0Var = ezVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, my.a((my) value, list, false, 8)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!ezVar.w && !z2 && ((my) ezVar.D()).b.isEmpty()) {
                    p7m0 p7m0Var2 = ezVar.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, my.a((my) value2, null, true, 10)));
                } else if (!ezVar.w && z2 && ((my) ezVar.D()).b.isEmpty()) {
                    ezVar.M();
                }
                ezVar.w = z2;
                return Unit.f46060a;
        }
    }
}
