package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h6w extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ rrd j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6w(rrd rrdVar, long j, long j2, long j3, int i, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = rrdVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = i;
        this.o = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new h6w(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h6w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        rrd rrdVar = this.j;
        knf0 knf0Var = (knf0) rrdVar.h;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            dpi0 dpi0Var = (dpi0) rrdVar.e;
            String strA = ((btt0) rrdVar.i).a();
            knf0Var.getClass();
            knf0Var.getClass();
            String strValueOf = String.valueOf(this.n);
            String strC = knf0Var.c();
            this.i = true;
            objB = ((tor0) ((lkr0) dpi0Var.f6468a).invoke()).b(strA, 1, 22, this.k, this.l, this.m, strValueOf, strC, 0, "application/vnd.xenvelop+json", this);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objB = obj;
        }
        List list = ((ror0) ((dx5) objB).a()).f30852a;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(s7n0.B((kor0) it.next(), this.o));
        }
        return arrayList;
    }
}
