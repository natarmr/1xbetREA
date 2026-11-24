package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class fc30 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kwj j;
    public final /* synthetic */ Function1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc30(kwj kwjVar, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = kwjVar;
        this.k = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kwj kwjVar = this.j;
        Function1 function1 = this.k;
        switch (b) {
            case 0:
                return new fc30(function1, kwjVar, yjeVar, (byte) 0);
            case 1:
                return new fc30(kwjVar, function1, yjeVar, (byte) 1);
            case 2:
                return new fc30(kwjVar, function1, yjeVar, (byte) 2);
            case 3:
                return new fc30(function1, kwjVar, yjeVar, (byte) 3);
            case 4:
                return new fc30(function1, kwjVar, yjeVar, (byte) 4);
            default:
                return new fc30(function1, kwjVar, yjeVar, (byte) 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((fc30) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        kwj kwjVar = this.j;
        Function1 function1 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new sb30(kwjVar.k()));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!kwjVar.k.a()) {
                    function1.invoke(new Integer(kwjVar.k()));
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!kwjVar.k.a()) {
                    function1.invoke(new Integer(kwjVar.k()));
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new z900(kwjVar.q()));
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new m3s0(kwjVar.k()));
                break;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new z900(kwjVar.q()));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc30(Function1 function1, kwj kwjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = function1;
        this.j = kwjVar;
    }
}
