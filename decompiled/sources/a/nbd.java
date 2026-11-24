package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class nbd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ pz40 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbd(pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.j;
        switch (b) {
            case 0:
                return new nbd(pz40Var, yjeVar, (byte) 0);
            case 1:
                return new nbd(pz40Var, yjeVar, (byte) 1);
            case 2:
                return new nbd(pz40Var, yjeVar, (byte) 2);
            case 3:
                return new nbd(pz40Var, yjeVar, (byte) 3);
            case 4:
                return new nbd(pz40Var, yjeVar, (byte) 4);
            case 5:
                return new nbd(pz40Var, yjeVar, (byte) 5);
            default:
                return new nbd(pz40Var, yjeVar, (byte) 6);
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
        return ((nbd) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.TRUE);
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.TRUE);
                break;
            default:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f46060a;
    }
}
