package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class t9b extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Function0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9b(boolean z, boolean z2, pz40 pz40Var, long j, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = z2;
        this.l = pz40Var;
        this.m = j;
        this.n = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new t9b(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t9b) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        Function0 function0 = this.n;
        pz40 pz40Var = this.l;
        if (!z) {
            z1x.P(obj);
            boolean z2 = this.j;
            boolean z3 = this.k;
            if (z2 && z3) {
                pz40Var.setValue(Boolean.FALSE);
                this.i = true;
                if (qcc.O(this.m, this) == wneVar) {
                    return wneVar;
                }
            } else {
                pz40Var.setValue(Boolean.TRUE);
                if (z3) {
                    function0.invoke();
                }
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        pz40Var.setValue(Boolean.TRUE);
        function0.invoke();
        return Unit.f46060a;
    }
}
