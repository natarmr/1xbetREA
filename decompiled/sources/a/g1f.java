package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g1f extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ List j;
    public final /* synthetic */ Integer k;
    public final /* synthetic */ g45 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1f(List list, Integer num, g45 g45Var, long j, long j2, int i, int i2, int i3, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.j = list;
        this.k = num;
        this.l = g45Var;
        this.m = j;
        this.n = j2;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new g1f(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        Object objD;
        g45 g45Var = this.l;
        knf0 knf0Var = (knf0) g45Var.h;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            List list = this.j;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wha0.Y((qu6) it.next()));
            }
            iun iunVar = iun.f15405a;
            Integer num = this.k;
            int iIntValue = num != null ? num.intValue() : knf0Var.b();
            iunVar.getClass();
            String strA = knf0Var.a();
            String strC = knf0Var.c();
            knf0Var.getClass();
            knf0Var.getClass();
            strA.getClass();
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                j = this.m;
                j2 = this.n;
                if (!zHasNext) {
                    break;
                }
                arrayList2.add(new iit0(j, j2, strA, this.o, 0L, strC, kotlin.collections.a.c(ro4.i0((ru6) it2.next())), this.p, "0", "", false, false, iun.f15405a, false, false, false, iIntValue, this.q));
            }
            fit0 fit0Var = new fit0(j, j2, arrayList2);
            ehf0 ehf0Var = (ehf0) g45Var.d;
            this.i = true;
            objD = ((vre) ((jwd) ehf0Var.c).invoke()).d(fit0Var, this);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = obj;
        }
        List list2 = (List) ((q16) objD).a();
        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(xnm0.m((oit0) it3.next(), this.r, ((ave) g45Var.c).f1521a));
        }
        return arrayList3;
    }
}
