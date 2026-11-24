package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wi1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi1(yje yjeVar, Function0 function0) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.j = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function0 function0 = this.j;
        switch (b) {
            case 0:
                return new wi1(function0, yjeVar, (byte) 0);
            case 1:
                return new wi1(function0, yjeVar, (byte) 1);
            case 2:
                return new wi1(function0, yjeVar, (byte) 2);
            case 3:
                return new wi1(function0, yjeVar, (byte) 3);
            case 4:
                return new wi1(yjeVar, function0);
            case 5:
                return new wi1(function0, yjeVar, (byte) 5);
            case 6:
                return new wi1(function0, yjeVar, (byte) 6);
            default:
                return new wi1(function0, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wi1) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wi1) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wi1) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wi1) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wi1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wi1) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wi1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wi1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function0 function0 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                function0.invoke();
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi1(Function0 function0, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = function0;
    }
}
