package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l840 extends bnn0 implements Function2 {
    public pzu i;
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pzu m;
    public final /* synthetic */ double n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l840(pzu pzuVar, double d, yje yjeVar) {
        super(2, yjeVar);
        this.m = pzuVar;
        this.n = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        l840 l840Var = new l840(this.m, this.n, yjeVar);
        l840Var.l = obj;
        return l840Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l840) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        pzu pzuVar;
        wne wneVar = wne.f39444a;
        boolean z = this.k;
        pzu pzuVar2 = this.m;
        boolean z2 = true;
        try {
            if (!z) {
                z1x.P(obj);
                double d = this.n;
                e0g0 e0g0Var = j0g0.b;
                gsj gsjVar = (gsj) pzuVar2.b;
                String strA = ((btt0) pzuVar2.e).a();
                this.l = null;
                this.i = pzuVar2;
                this.j = true;
                this.k = true;
                obj = gsjVar.a().b(strA, d, "application/vnd.xenvelop+json", this);
                if (obj == wneVar) {
                    return wneVar;
                }
                pzuVar = pzuVar2;
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = this.j;
                pzuVar = this.i;
                z1x.P(obj);
            }
            Integer num = ((c840) ((dx5) obj).a()).f3896a;
            int iIntValue = num != null ? num.intValue() : 0;
            if (z2) {
                ((h840) pzuVar.f27863a).b = System.currentTimeMillis();
            }
            ((h840) pzuVar.f27863a).a(iIntValue);
            g0g0Var = new Integer(iIntValue);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        if (thA instanceof oqt0) {
            throw thA;
        }
        return new Integer(((h840) pzuVar2.f27863a).f12609a);
    }
}
