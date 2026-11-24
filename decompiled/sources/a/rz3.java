package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class rz3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ mz3 j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz3(mz3 mz3Var, l7m0 l7m0Var, pz40 pz40Var, pz40 pz40Var2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = mz3Var;
        this.k = l7m0Var;
        this.l = pz40Var;
        this.m = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new rz3(this.j, this.k, this.l, this.m, yjeVar, (byte) 0);
            default:
                return new rz3(this.j, this.k, this.l, this.m, yjeVar, (byte) 1);
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
        return ((rz3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mz3 mz3Var = this.j;
        pz40 pz40Var = this.m;
        boolean z = true;
        l7m0 l7m0Var = this.k;
        pz40 pz40Var2 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!(((lz3) l7m0Var.getValue()) instanceof kz3) && !(((lz3) l7m0Var.getValue()) instanceof jz3)) {
                    z = false;
                }
                pz40Var2.setValue(Boolean.valueOf(z));
                if (((Boolean) pz40Var.getValue()).booleanValue() && !((Boolean) pz40Var2.getValue()).booleanValue()) {
                    mz3Var.m();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!(((lz3) l7m0Var.getValue()) instanceof kz3) && !(((lz3) l7m0Var.getValue()) instanceof jz3)) {
                    z = false;
                }
                pz40Var2.setValue(Boolean.valueOf(z));
                if (((Boolean) pz40Var.getValue()).booleanValue() && !((Boolean) pz40Var2.getValue()).booleanValue()) {
                    mz3Var.m();
                }
                break;
        }
        return Unit.f46060a;
    }
}
