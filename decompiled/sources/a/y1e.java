package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y1e extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ mie0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1e(Function2 function2, mie0 mie0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = function2;
        this.l = mie0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mie0 mie0Var = this.l;
        Function2 function2 = this.k;
        switch (b) {
            case 0:
                return new y1e(function2, mie0Var, yjeVar, (byte) 0);
            default:
                return new y1e(function2, mie0Var, yjeVar, (byte) 1);
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
        return ((y1e) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mie0 mie0Var = this.l;
        Function2 function2 = this.k;
        switch (b) {
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
                Object obj2 = mie0Var.f21842a;
                this.j = true;
                Object objInvoke = function2.invoke(obj2, this);
                return objInvoke == wneVar ? wneVar : objInvoke;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                Object obj3 = mie0Var.f21842a;
                this.j = true;
                Object objInvoke2 = function2.invoke(obj3, this);
                return objInvoke2 == wneVar2 ? wneVar2 : objInvoke2;
        }
    }
}
