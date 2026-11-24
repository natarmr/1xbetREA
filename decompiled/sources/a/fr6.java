package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fr6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr6(mii0 mii0Var, String str, long j, int i, Integer num, yje yjeVar) {
        super(2, yjeVar);
        this.m = mii0Var;
        this.n = str;
        this.k = j;
        this.l = i;
        this.o = num;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new fr6((mii0) this.m, (String) obj3, this.k, this.l, (Integer) obj2, yjeVar);
            default:
                fr6 fr6Var = new fr6(this.k, (ouu) obj3, this.l, (Set) obj2, yjeVar);
                fr6Var.m = obj;
                return fr6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fr6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fr6) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Object objD0;
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        long j = this.k;
        switch (b) {
            case 0:
                String str = (String) obj3;
                mii0 mii0Var = (mii0) this.m;
                knf0 knf0Var = (knf0) mii0Var.e;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    c5k c5kVar = (c5k) mii0Var.b;
                    if (str.equals("en")) {
                        str = null;
                    }
                    Long l = j == -1 ? null : new Long(j);
                    Integer num5 = new Integer(1357);
                    knf0Var.getClass();
                    int iB = knf0Var.b();
                    this.j = true;
                    objA = ((tq6) ((zo4) c5kVar.b).invoke()).a(this.l, (Integer) obj2, iB, num5, str, 1, l, 22, this);
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
                Iterable<gq6> iterable = (Iterable) ((dx5) objA).a();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (gq6 gq6Var : iterable) {
                    gq6Var.getClass();
                    String str2 = gq6Var.f11716a;
                    List list = gq6Var.q;
                    List list2 = gq6Var.o;
                    List list3 = gq6Var.p;
                    List list4 = gq6Var.n;
                    Integer num6 = gq6Var.j;
                    Integer num7 = gq6Var.b;
                    String str3 = str2 == null ? "" : str2;
                    int iIntValue = num7 != null ? num7.intValue() : 0;
                    Long l2 = gq6Var.h;
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    String str4 = gq6Var.i;
                    String str5 = str4 == null ? "" : str4;
                    int iIntValue2 = num6 != null ? num6.intValue() : 0;
                    String str6 = gq6Var.k;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = gq6Var.l;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = gq6Var.m;
                    String str10 = str9 == null ? "" : str9;
                    int iIntValue3 = num7 != null ? num7.intValue() : 0;
                    int iIntValue4 = (list4 == null || (num4 = (Integer) CollectionsKt.firstOrNull(list4)) == null) ? 0 : num4.intValue();
                    String str11 = gq6Var.c;
                    String str12 = str11 == null ? "" : str11;
                    String str13 = list3 != null ? (String) CollectionsKt.firstOrNull(list3) : null;
                    if (str13 == null) {
                        str13 = "";
                    }
                    String strS = vsm0.s((list4 == null || (num3 = (Integer) CollectionsKt.firstOrNull(list4)) == null) ? 0L : num3.intValue(), str13);
                    m6m0 m6m0Var = bop0.b;
                    d9a0 d9a0Var = new d9a0(iIntValue3, iIntValue4, 0, str12, "1", strS);
                    int iIntValue5 = num7 != null ? num7.intValue() : 0;
                    int iIntValue6 = (list2 == null || (num2 = (Integer) CollectionsKt.firstOrNull(list2)) == null) ? 0 : num2.intValue();
                    String str14 = gq6Var.d;
                    String str15 = str14 == null ? "" : str14;
                    String str16 = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                    d9a0 d9a0Var2 = new d9a0(iIntValue5, iIntValue6, 0, str15, "2", vsm0.s((list2 == null || (num = (Integer) CollectionsKt.firstOrNull(list2)) == null) ? 0L : num.intValue(), str16 != null ? str16 : ""));
                    long jIntValue = num6 != null ? num6.intValue() : 0L;
                    if (list3 == null) {
                        list3 = iun.f15405a;
                    }
                    List list5 = list3;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    arrayList.add(new mms(iIntValue, jLongValue, str5, str3, iIntValue2, str6, str8, str10, d9a0Var, d9a0Var2, jIntValue, list5, list));
                }
                return arrayList;
            default:
                Pair pair = (Pair) this.m;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ygq0 ygq0Var = (ygq0) pair.f46059a;
                    xgq0 xgq0Var = (xgq0) pair.b;
                    long j2 = xgq0Var.f40852a;
                    long j3 = j < j2 ? j2 : -1L;
                    long j4 = xgq0Var.b;
                    if (ygq0Var == ygq0.CUSTOM_DATE && j > j4) {
                        return iun.f15405a;
                    }
                    w5z w5zVar = (w5z) ((ouu) obj3).d;
                    Pair pair2 = new Pair(new Long(j3), new Long(j4));
                    this.m = null;
                    this.j = true;
                    objD0 = qjj.d0(((mne) w5zVar.e).b, new gb2(w5zVar, ygq0Var, pair2, this.l, (Set) obj2, null), this);
                    if (objD0 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                return (List) objD0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr6(long j, ouu ouuVar, int i, Set set, yje yjeVar) {
        super(2, yjeVar);
        this.k = j;
        this.n = ouuVar;
        this.l = i;
        this.o = set;
    }
}
