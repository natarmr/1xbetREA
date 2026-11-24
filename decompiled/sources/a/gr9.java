package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gr9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ mr9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr9(mr9 mr9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mr9Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mr9 mr9Var = this.k;
        switch (b) {
            case 0:
                return new gr9(mr9Var, yjeVar, (byte) 0);
            default:
                return new gr9(mr9Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gr9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        mr9 mr9Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    a7q a7qVar = mr9Var.b;
                    this.j = true;
                    obj = a7qVar.c(this);
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
                p7m0 p7m0Var = mr9Var.l;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, es9.a((es9) value, list, list.isEmpty() ? ds9.d : ds9.e, false, null, 12)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    long jW0 = ibc.w0(3L, bfn.SECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                v3c.N(mr9Var.k);
                p7m0 p7m0Var2 = mr9Var.m;
                Boolean bool = Boolean.TRUE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool);
                return Unit.f46060a;
        }
    }
}
