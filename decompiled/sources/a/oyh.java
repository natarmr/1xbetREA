package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class oyh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public final /* synthetic */ aeg0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyh(yje yjeVar, aeg0 aeg0Var, boolean z, boolean z2, Function1 function1) {
        super(2, yjeVar);
        this.k = aeg0Var;
        this.l = z;
        this.m = z2;
        this.n = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new oyh(this.k, this.l, this.m, this.n, yjeVar);
            default:
                return new oyh(yjeVar, this.k, this.l, this.m, this.n);
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
        return ((oyh) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                boolean z2 = this.m;
                boolean z3 = this.l;
                aeg0 aeg0Var = this.k;
                nyh nyhVar = new nyh(z2, z3, aeg0Var, null, this.n, (byte) 0);
                this.j = true;
                Object objR = aeg0Var.r(z3, nyhVar, this);
                return objR == wneVar ? wneVar : objR;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                boolean z5 = this.m;
                boolean z6 = this.l;
                aeg0 aeg0Var2 = this.k;
                nyh nyhVar2 = new nyh(z5, z6, aeg0Var2, null, this.n, (byte) 1);
                this.j = true;
                Object objR2 = aeg0Var2.r(z6, nyhVar2, this);
                return objR2 == wneVar2 ? wneVar2 : objR2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyh(aeg0 aeg0Var, boolean z, boolean z2, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.k = aeg0Var;
        this.l = z;
        this.m = z2;
        this.n = function1;
    }
}
