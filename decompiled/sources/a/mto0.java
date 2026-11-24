package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mto0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ hub0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mto0(hub0 hub0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = hub0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hub0 hub0Var = this.j;
        switch (b) {
            case 0:
                return new mto0(hub0Var, yjeVar, (byte) 0);
            case 1:
                return new mto0(hub0Var, yjeVar, (byte) 1);
            case 2:
                return new mto0(hub0Var, yjeVar, (byte) 2);
            case 3:
                return new mto0(hub0Var, yjeVar, (byte) 3);
            case 4:
                return new mto0(hub0Var, yjeVar, (byte) 4);
            case 5:
                return new mto0(hub0Var, yjeVar, (byte) 5);
            case 6:
                return new mto0(hub0Var, yjeVar, (byte) 6);
            default:
                return new mto0(hub0Var, yjeVar, (byte) 7);
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
            case 6:
                break;
        }
        return ((mto0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hub0 hub0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                hub0Var.a();
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hub0Var.b();
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                hub0Var.b();
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                hub0Var.a();
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                hub0Var.b();
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                hub0Var.b();
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                hub0Var.a();
                break;
            default:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                hub0Var.b();
                break;
        }
        return Unit.f46060a;
    }
}
