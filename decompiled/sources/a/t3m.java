package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class t3m extends zzf0 implements Function2 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ pz40 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3m(boolean z, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = z;
        this.m = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        t3m t3mVar = new t3m(this.l, this.m, yjeVar);
        t3mVar.k = obj;
        return t3mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t3m) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        inn0 inn0Var = (inn0) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            this.k = null;
            this.j = true;
            if (tto0.b(inn0Var, false, this, 2) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        if (this.l) {
            uts0 uts0Var = w3m.f38508a;
            ((Function0) this.m.getValue()).invoke();
        }
        return Unit.f46060a;
    }
}
