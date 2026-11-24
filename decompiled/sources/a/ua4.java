package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ua4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ pz40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua4(Function1 function1, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = function1;
        this.k = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.k;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                return new ua4(function1, pz40Var, yjeVar, (byte) 0);
            case 1:
                return new ua4(function1, pz40Var, yjeVar, (byte) 1);
            case 2:
                return new ua4(function1, pz40Var, yjeVar, (byte) 2);
            case 3:
                return new ua4(function1, pz40Var, yjeVar, (byte) 3);
            case 4:
                return new ua4(function1, pz40Var, yjeVar, (byte) 4);
            case 5:
                return new ua4(function1, pz40Var, yjeVar, (byte) 5);
            default:
                return new ua4(function1, pz40Var, yjeVar, (byte) 6);
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
            case 5:
                break;
        }
        return ((ua4) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.j;
        pz40 pz40Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                function1.invoke(Boolean.valueOf(((ob4) pz40Var.getValue()).f24960a));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    if (function1 != null) {
                        function1.invoke(new a8q0("", 0L, 6));
                    }
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                rw90 rw90Var = sw6.f32905a;
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    if (function1 != null) {
                        function1.invoke(new a8q0("", 0L, 6));
                    }
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    function1.invoke(new a8q0("", 0L, 6));
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    function1.invoke(new a8q0("", 0L, 6));
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    function1.invoke(new a8q0("", 0L, 6));
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
            default:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    function1.invoke(new a8q0("", 0L, 6));
                    pz40Var.setValue(Boolean.FALSE);
                }
                break;
        }
        return Unit.f46060a;
    }
}
