package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wgt0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xgt0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wgt0(xgt0 xgt0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xgt0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xgt0 xgt0Var = this.k;
        switch (b) {
            case 0:
                wgt0 wgt0Var = new wgt0(xgt0Var, yjeVar, (byte) 0);
                wgt0Var.j = ((Boolean) obj).booleanValue();
                return wgt0Var;
            default:
                return new wgt0(xgt0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wgt0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wgt0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        byte b = this.i;
        boolean z = false;
        xgt0 xgt0Var = this.k;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((sgt0) xgt0Var.D()).f32179a;
                if (z2 && ((sgt0) xgt0Var.D()).b) {
                    z = true;
                }
                if (z3 || z) {
                    int i = xgt0.w;
                    xgt0Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    xsu xsuVar = xgt0Var.q;
                    String str = xgt0Var.p;
                    this.j = true;
                    obj = xsuVar.b(str, this);
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
                int i2 = xgt0.w;
                p7m0 p7m0Var = xgt0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    list.getClass();
                } while (!p7m0Var.m(value, new sgt0(list, false, false)));
                return Unit.f46060a;
        }
    }
}
