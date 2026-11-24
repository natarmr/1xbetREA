package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class gll extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ l7m0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gll(byte b, yje yjeVar, l7m0 l7m0Var, Function1 function1) {
        super(2, yjeVar);
        this.i = b;
        this.j = function1;
        this.k = l7m0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        l7m0 l7m0Var = this.k;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                return new gll((byte) 0, yjeVar, l7m0Var, function1);
            case 1:
                return new gll((byte) 1, yjeVar, l7m0Var, function1);
            default:
                return new gll((byte) 2, yjeVar, l7m0Var, function1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((gll) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        l7m0 l7m0Var = this.k;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (function1 != null) {
                    function1.invoke(new Integer(((Number) l7m0Var.getValue()).intValue()));
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new Integer(((Number) l7m0Var.getValue()).intValue()));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new Integer(((Number) l7m0Var.getValue()).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
