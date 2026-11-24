package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v48 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ kwj j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v48(kwj kwjVar, int i, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.j = kwjVar;
        this.l = i;
        this.k = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.l;
        Function1 function1 = this.k;
        kwj kwjVar = this.j;
        switch (b) {
            case 0:
                return new v48(kwjVar, i, function1, yjeVar);
            default:
                return new v48(kwjVar, function1, i, yjeVar);
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
        return ((v48) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        int i = this.l;
        Function1 function1 = this.k;
        kwj kwjVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (kwjVar.k.a() && kwjVar.k() != i) {
                    function1.invoke(new g48(kwjVar.k()));
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!kwjVar.k.a()) {
                    function1.invoke(new Integer(i == 0 ? 0 : ((kwjVar.k() % i) + i) % i));
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v48(kwj kwjVar, Function1 function1, int i, yje yjeVar) {
        super(2, yjeVar);
        this.j = kwjVar;
        this.k = function1;
        this.l = i;
    }
}
