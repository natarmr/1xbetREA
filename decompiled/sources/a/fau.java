package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fau extends bnn0 implements aer {
    public /* synthetic */ int i;
    public /* synthetic */ long j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ String m;
    public final /* synthetic */ qv2 n;
    public final /* synthetic */ sff0 o;
    public final /* synthetic */ c5q p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ n0o0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fau(qv2 qv2Var, sff0 sff0Var, c5q c5qVar, boolean z, boolean z2, n0o0 n0o0Var, yje yjeVar) {
        super(6, yjeVar);
        this.n = qv2Var;
        this.o = sff0Var;
        this.p = c5qVar;
        this.q = z;
        this.r = z2;
        this.s = n0o0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i = this.i;
        long j = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        String str = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        iz30 iz30Var = iz30.k;
        sff0 sff0Var = this.o;
        Map mapB = wp20.b(new Pair(iz30Var, sff0Var.f32117a.f));
        mapB.getClass();
        List listT = pgi0.t(pgi0.q(this.p, new sc80(this.r, this.q, z, j, mapB, i)));
        if (z2) {
            r9u r9uVar = (r9u) this.n.n;
            ygp ygpVar = ygp.f;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar) && ((List) this.s.getValue()).contains(sff0Var.g.f)) {
                htz htzVar = iz30.f15618a;
                return CollectionsKt.q0(kotlin.collections.a.c(new jx10(str)), listT);
            }
        }
        return listT;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean z = this.r;
        n0o0 n0o0Var = this.s;
        fau fauVar = new fau(this.n, this.o, this.p, this.q, z, n0o0Var, (yje) obj6);
        fauVar.i = iIntValue;
        fauVar.j = jLongValue;
        fauVar.k = zBooleanValue;
        fauVar.l = zBooleanValue2;
        fauVar.m = (String) obj5;
        return fauVar.invokeSuspend(Unit.f46060a);
    }
}
