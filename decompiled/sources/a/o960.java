package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class o960 extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ IntRange[] k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ ArrayList p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o960(IntRange[] intRangeArr, int i, int i2, String str, String str2, ArrayList arrayList, yje yjeVar) {
        super(2, yjeVar);
        this.k = intRangeArr;
        this.l = i;
        this.m = i2;
        this.n = str;
        this.o = str2;
        this.p = arrayList;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        o960 o960Var = new o960(this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
        o960Var.j = obj;
        return o960Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o960) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.j;
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
        IntRange[] intRangeArr = this.k;
        ArrayList arrayList = new ArrayList(intRangeArr.length);
        for (IntRange intRange : intRangeArr) {
            arrayList.add(qjj.M(vneVar, null, new sjf0(intRange, this.l, this.m, this.n, this.o, this.p, null), 3));
        }
        rv00 rv00Var = rv00.u;
        this.j = null;
        this.i = true;
        Object objI = rv00Var.i(arrayList, this);
        return objI == wneVar ? wneVar : objI;
    }
}
