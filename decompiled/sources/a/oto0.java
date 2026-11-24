package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oto0 extends zzf0 implements Function2 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vne l;
    public final /* synthetic */ hub0 m;
    public final /* synthetic */ xdr n;
    public final /* synthetic */ Function1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oto0(vne vneVar, hub0 hub0Var, xdr xdrVar, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.l = vneVar;
        this.m = hub0Var;
        this.n = xdrVar;
        this.o = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        oto0 oto0Var = new oto0(this.l, this.m, this.n, this.o, yjeVar);
        oto0Var.k = obj;
        return oto0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oto0) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            inn0 inn0Var = (inn0) this.k;
            this.j = true;
            if (tto0.g(inn0Var, this.l, this.m, this.n, this.o, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
