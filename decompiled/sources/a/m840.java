package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class m840 extends bnn0 implements Function2 {
    public pzu i;
    public boolean j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pzu n;
    public final /* synthetic */ double o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Integer q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m840(pzu pzuVar, double d, long j, Integer num, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.n = pzuVar;
        this.o = d;
        this.p = (int) j;
        this.q = num;
        this.r = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        m840 m840Var = new m840(this.n, this.o, this.p, this.q, this.r, yjeVar);
        m840Var.m = obj;
        return m840Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m840) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object g0g0Var;
        boolean z;
        pzu pzuVar;
        wne wneVar = wne.f39444a;
        boolean z2 = this.l;
        pzu pzuVar2 = this.n;
        boolean z3 = true;
        try {
            if (!z2) {
                z1x.P(obj);
                double d = this.o;
                long j = this.p;
                Integer num = this.q;
                boolean z4 = this.r;
                e0g0 e0g0Var = j0g0.b;
                gsj gsjVar = (gsj) pzuVar2.b;
                String strA = ((btt0) pzuVar2.e).a();
                this.m = null;
                this.i = pzuVar2;
                this.j = z4;
                this.k = true;
                this.l = true;
                Object objE = gsjVar.a().e(strA, d, j, num, "application/vnd.xenvelop+json", this);
                if (objE == wneVar) {
                    return wneVar;
                }
                z = z4;
                obj = objE;
                pzuVar = pzuVar2;
            } else {
                if (!z2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = this.k;
                z = this.j;
                pzuVar = this.i;
                z1x.P(obj);
            }
            Integer num2 = ((c840) ((dx5) obj).a()).f3896a;
            int iIntValue = num2 != null ? num2.intValue() : 0;
            if (z) {
                if (z3) {
                    ((h840) pzuVar.f27863a).b = System.currentTimeMillis();
                }
                ((h840) pzuVar.f27863a).a(iIntValue);
            }
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
