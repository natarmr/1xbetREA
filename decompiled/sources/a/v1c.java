package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class v1c extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ehf0 k;
    public final /* synthetic */ mlr l;
    public final /* synthetic */ String m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1c(ehf0 ehf0Var, mlr mlrVar, String str, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.k = ehf0Var;
        this.l = mlrVar;
        this.m = str;
        this.n = z;
        this.o = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        v1c v1cVar = new v1c(this.k, this.l, this.m, this.n, this.o, yjeVar);
        v1cVar.j = obj;
        return v1cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1c) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        try {
            if (!z) {
                z1x.P(obj);
                ehf0 ehf0Var = this.k;
                mlr mlrVar = this.l;
                String str = this.m;
                boolean z2 = this.n;
                boolean z3 = this.o;
                e0g0 e0g0Var = j0g0.b;
                dn0 dn0Var = (dn0) ehf0Var.b;
                this.j = null;
                this.i = true;
                obj = dn0Var.p(mlrVar, str, z2, z3, this);
                if (obj == wneVar) {
                    return wneVar;
                }
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = (Boolean) obj;
            g0g0Var.getClass();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return j0g0.a(g0g0Var) == null ? g0g0Var : Boolean.FALSE;
    }
}
