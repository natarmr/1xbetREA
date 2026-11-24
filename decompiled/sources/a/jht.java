package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jht extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ nr j;
    public final /* synthetic */ xgt k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jht(nr nrVar, xgt xgtVar, long j, int i, long j2, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.j = nrVar;
        this.k = xgtVar;
        this.l = j;
        this.m = i;
        this.n = j2;
        this.o = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new jht(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jht) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        muw mhtVar;
        nr nrVar = this.j;
        knf0 knf0Var = (knf0) nrVar.c;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        a1d a1dVar = (a1d) nrVar.d;
        String strC = knf0Var.c();
        knf0Var.getClass();
        xgt xgtVar = this.k;
        xgtVar.getClass();
        ArrayList arrayList = xgtVar.d;
        ArrayList arrayList2 = xgtVar.c;
        List list = xgtVar.e;
        int i = xgtVar.b;
        boolean zIsEmpty = list.isEmpty();
        long j = this.l;
        int i2 = this.m;
        long j2 = this.n;
        int i3 = this.o;
        if (zIsEmpty) {
            mhtVar = j != 0 ? new mht(xgtVar.f40855a, i2, kotlin.collections.a.c(Integer.valueOf(i)), arrayList2, arrayList, strC, xgtVar.f, xgtVar.g, j, j2, i3) : new sht(Double.valueOf(xgtVar.f40855a), Integer.valueOf(i2), kotlin.collections.a.c(Integer.valueOf(i)), arrayList2, arrayList, strC, 1, Double.valueOf(xgtVar.f), Integer.valueOf(xgtVar.g), Integer.valueOf(i3));
        } else {
            mhtVar = new pht(xgtVar.f40855a, i2, kotlin.collections.a.c(Integer.valueOf(i)), arrayList2, arrayList, xgtVar.e, strC, xgtVar.f, xgtVar.g, j, j2, i3);
        }
        this.i = true;
        Object objB = ((wgt) ((wgn) a1dVar.b).invoke()).b(mhtVar, this);
        return objB == wneVar ? wneVar : objB;
    }
}
