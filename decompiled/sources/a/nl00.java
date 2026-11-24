package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class nl00 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ tzi j;
    public final /* synthetic */ j700 k;
    public final /* synthetic */ zmb l;
    public final /* synthetic */ List m;
    public final /* synthetic */ List n;
    public final /* synthetic */ Set o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Integer q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl00(tzi tziVar, j700 j700Var, zmb zmbVar, List list, List list2, Set set, boolean z, Integer num, yje yjeVar) {
        super(1, yjeVar);
        this.j = tziVar;
        this.k = j700Var;
        this.l = zmbVar;
        this.m = list;
        this.n = list2;
        this.o = set;
        this.p = z;
        this.q = num;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new nl00(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((nl00) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        j700 j700Var = this.k;
        tzi tziVar = this.j;
        if (!z) {
            z1x.P(obj);
            rtu rtuVar = (rtu) tziVar.g;
            boolean zJ = t9x.J(j700Var);
            this.i = true;
            objA = rtuVar.a(zJ, 0, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        c3c0 c3c0Var = (c3c0) objA;
        long jF = ynq0.f(((viu) tziVar.d).a());
        int iOrdinal = this.l.ordinal();
        Set set = this.o;
        List list = this.n;
        List list2 = this.m;
        if (iOrdinal == 0) {
            y3v y3vVar = (y3v) tziVar.b;
            int i = c3c0Var.f3668a;
            boolean z2 = c3c0Var.b;
            long j = c3c0Var.c;
            j700Var.getClass();
            list2.getClass();
            list.getClass();
            set.getClass();
            lef0 lef0Var = (lef0) y3vVar.d;
            boolean zJ2 = t9x.J(j700Var);
            boolean z3 = this.p;
            Integer num = this.q;
            if (zJ2) {
                return aoq.c(((m8l0) lef0Var.f19899a).f21376a, new ll00(null, j700Var, y3vVar, i, list2, CollectionsKt.L0(list), set, z2, j, z3, num, (byte) 1));
            }
            return aoq.c(new p6d(i120.W(lef0Var.f(z3)), new xu3(lef0Var.g(), (byte) 4), new jl00(3, null, (byte) 1), (byte) 1), new kl00(null, jF, y3vVar, i, list2, CollectionsKt.L0(list), set, z2, j, z3, num, (byte) 1));
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        nvu nvuVar = (nvu) tziVar.c;
        int i2 = c3c0Var.f3668a;
        boolean z4 = c3c0Var.b;
        long j2 = c3c0Var.c;
        j700Var.getClass();
        list2.getClass();
        list.getClass();
        set.getClass();
        lef0 lef0Var2 = (lef0) nvuVar.d;
        boolean zJ3 = t9x.J(j700Var);
        boolean z5 = this.p;
        Integer num2 = this.q;
        if (zJ3) {
            return aoq.c(((m8l0) lef0Var2.f19899a).f21376a, new ll00(null, j700Var, nvuVar, i2, list2, CollectionsKt.L0(list), set, z4, j2, z5, num2, (byte) 0));
        }
        return aoq.c(new p6d(i120.W(lef0Var2.f(z5)), new xu3(lef0Var2.g(), (byte) 3), new jl00(3, null, (byte) 0), (byte) 1), new kl00(null, jF, nvuVar, i2, list2, CollectionsKt.L0(list), set, z4, j2, z5, num2, (byte) 0));
    }
}
