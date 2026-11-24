package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class y7a0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ z7a0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7a0(z7a0 z7a0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z7a0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        z7a0 z7a0Var = this.k;
        switch (b) {
            case 0:
                return new y7a0(z7a0Var, yjeVar, (byte) 0);
            default:
                y7a0 y7a0Var = new y7a0(z7a0Var, yjeVar, (byte) 1);
                y7a0Var.j = ((Boolean) obj).booleanValue();
                return y7a0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((y7a0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        z7a0 z7a0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    b8u b8uVar = z7a0Var.o;
                    String str = z7a0Var.s;
                    this.j = true;
                    nvu nvuVar = (nvu) b8uVar.f2175a;
                    obj = qjj.d0(((mne) nvuVar.b).b, new oed(nvuVar, str, null, (byte) 12, false), this);
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
                int i = z7a0.v;
                p7m0 p7m0Var = z7a0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    list.getClass();
                } while (!p7m0Var.m(value, new s7a0(list, false, false)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((s7a0) z7a0Var.D()).f31741a;
                boolean z4 = z2 && ((s7a0) z7a0Var.D()).b;
                if (z3 || z4) {
                    int i2 = z7a0.v;
                    z7a0Var.M();
                }
                return Unit.f46060a;
        }
    }
}
