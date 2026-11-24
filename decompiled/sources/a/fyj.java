package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fyj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ vne j;
    public final /* synthetic */ xk80 k;
    public final /* synthetic */ l7m0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyj(l7m0 l7m0Var, xk80 xk80Var, vne vneVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = l7m0Var;
        this.k = xk80Var;
        this.j = vneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new fyj(this.l, this.k, this.j, yjeVar);
            case 1:
                return new fyj(this.j, this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new fyj(this.j, this.k, this.l, yjeVar, (byte) 2);
            case 3:
                return new fyj(this.j, this.k, this.l, yjeVar, (byte) 3);
            case 4:
                return new fyj(this.j, this.k, this.l, yjeVar, (byte) 4);
            case 5:
                return new fyj(this.j, this.k, this.l, yjeVar, (byte) 5);
            default:
                return new fyj(this.j, this.k, this.l, yjeVar, (byte) 6);
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
        return ((fyj) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        a4x a4xVar;
        byte b = this.i;
        l7m0 l7m0Var = this.l;
        xk80 xk80Var = this.k;
        yje yjeVar = null;
        vne vneVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gkw gkwVar = (gkw) l7m0Var.getValue();
                ekw ekwVar = (gkwVar == null || (a4xVar = gkwVar.b) == null) ? null : (ekw) a4xVar.get(xk80Var.k());
                gkw gkwVar2 = (gkw) l7m0Var.getValue();
                if (!Intrinsics.d(ekwVar, gkwVar2 != null ? gkwVar2.c : null)) {
                    qjj.W(vneVar, null, null, new eyj((byte) 0, yjeVar, xk80Var, l7m0Var), 3);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new eyj((byte) 4, yjeVar, xk80Var, l7m0Var), 3);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new eyj((byte) 5, yjeVar, xk80Var, l7m0Var), 3);
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new eyj((byte) 6, yjeVar, xk80Var, l7m0Var), 3);
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new eyj((byte) 7, yjeVar, xk80Var, l7m0Var), 3);
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new eyj((byte) 8, yjeVar, xk80Var, l7m0Var), 3);
                break;
            default:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                qjj.W(vneVar, null, null, new eyj((byte) 9, yjeVar, xk80Var, l7m0Var), 3);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyj(vne vneVar, xk80 xk80Var, l7m0 l7m0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = vneVar;
        this.k = xk80Var;
        this.l = l7m0Var;
    }
}
