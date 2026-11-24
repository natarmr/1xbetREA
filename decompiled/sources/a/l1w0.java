package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l1w0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ o1w0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1w0(o1w0 o1w0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o1w0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o1w0 o1w0Var = this.k;
        switch (b) {
            case 0:
                l1w0 l1w0Var = new l1w0(o1w0Var, yjeVar, (byte) 0);
                l1w0Var.j = ((Boolean) obj).booleanValue();
                return l1w0Var;
            default:
                return new l1w0(o1w0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((l1w0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l1w0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        o1w0 o1w0Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = o1w0Var.g;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, j1w0.a((j1w0) value, z, null, 2)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    sff0 sff0VarA = o1w0Var.c.a();
                    jru jruVar = o1w0Var.b;
                    boolean z3 = sff0VarA.k.h;
                    List list = sff0VarA.N.r;
                    this.j = true;
                    obj = jruVar.d(this, list, z3);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list2 = (List) obj;
                p7m0 p7m0Var2 = o1w0Var.g;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, j1w0.a((j1w0) value2, false, list2, 1)));
                return Unit.f46060a;
        }
    }
}
