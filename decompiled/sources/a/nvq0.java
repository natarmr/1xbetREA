package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nvq0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ ovq0 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvq0(ovq0 ovq0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = ovq0Var;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new nvq0(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nvq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        hse0 hse0Var = this.j.f25936a;
        this.i = true;
        Object objA = hse0.a(hse0Var, this.k, true, this, 4);
        return objA == wneVar ? wneVar : objA;
    }
}
