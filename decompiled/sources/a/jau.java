package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class jau extends bnn0 implements ydr {
    public /* synthetic */ int i;
    public /* synthetic */ long j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ pwi l;
    public final /* synthetic */ sff0 m;
    public final /* synthetic */ c5q n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jau(pwi pwiVar, sff0 sff0Var, c5q c5qVar, boolean z, boolean z2, yje yjeVar) {
        super(4, yjeVar);
        this.l = pwiVar;
        this.m = sff0Var;
        this.n = c5qVar;
        this.o = z;
        this.p = z2;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i = this.i;
        long j = this.j;
        boolean z = this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        Map mapB = wp20.b(new Pair(iz30.k, this.m.f32117a.f));
        mapB.getClass();
        return pgi0.t(pgi0.q(this.n, new sc80(this.p, this.o, z, j, mapB, i)));
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean z = this.o;
        boolean z2 = this.p;
        jau jauVar = new jau(this.l, this.m, this.n, z, z2, (yje) obj4);
        jauVar.i = iIntValue;
        jauVar.j = jLongValue;
        jauVar.k = zBooleanValue;
        return jauVar.invokeSuspend(Unit.f46060a);
    }
}
