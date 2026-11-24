package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class cna extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ int j;
    public final /* synthetic */ cgk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cna(cgk0 cgk0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.k = cgk0Var;
        this.j = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new cna(this.j, this.k, yjeVar, (byte) 0);
            case 1:
                return new cna(this.j, this.k, yjeVar, (byte) 1);
            case 2:
                return new cna(this.j, this.k, yjeVar, (byte) 2);
            default:
                return new cna(this.k, this.j, yjeVar);
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
        }
        return ((cna) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        int i = this.j;
        cgk0 cgk0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (i > 0 && cgk0Var.l() == 0) {
                    cgk0Var.m(i);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (i > 0 && cgk0Var.l() == 0) {
                    cgk0Var.m(i);
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (i > 0 && cgk0Var.l() == 0) {
                    cgk0Var.m(i);
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                cgk0Var.m(i);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cna(int i, cgk0 cgk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = i;
        this.k = cgk0Var;
    }
}
