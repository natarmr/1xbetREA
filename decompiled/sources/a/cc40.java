package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class cc40 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ z220 j;
    public final /* synthetic */ jvn k;
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ c3c0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc40(z220 z220Var, jvn jvnVar, int i, String str, long j, boolean z, c3c0 c3c0Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = z220Var;
        this.k = jvnVar;
        this.l = i;
        this.m = str;
        this.n = j;
        this.o = z;
        this.p = c3c0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new cc40(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((cc40) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        ?? arrayList;
        ?? arrayList2;
        Integer num;
        Integer num2;
        List list;
        bf90 bf90Var;
        Integer num3;
        List list2;
        List list3;
        c680 c680Var;
        Long l;
        Integer num4;
        List list4;
        bf90 bf90Var2;
        Integer num5;
        List list5;
        List list6;
        c680 c680Var2;
        Long l2;
        tdo tdoVar;
        List list7;
        List list8;
        ygo ygoVar;
        tdo tdoVar2;
        List list9;
        List list10;
        ygo ygoVar2;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            z220 z220Var = this.j;
            lnf0 lnf0VarD = ((knf0) z220Var.e).d();
            c3c0 c3c0Var = this.p;
            c3c0Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            qbt.a(linkedHashMap, this.k);
            qbt.d(linkedHashMap, this.l, this.o);
            qbt.g(lnf0VarD.b, linkedHashMap);
            qbt.h(linkedHashMap);
            linkedHashMap.put("heroIds", this.m);
            qbt.j(lnf0VarD.f20342a, linkedHashMap);
            qbt.l(linkedHashMap);
            qbt.n(this.n, linkedHashMap);
            qbt.o(linkedHashMap, c3c0Var.b, c3c0Var.c);
            qbt.p(linkedHashMap);
            pyu pyuVar = (pyu) z220Var.b;
            this.i = true;
            objB = ((cb40) ((tpv) pyuVar.f27815a).invoke()).b(linkedHashMap, this);
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
        List<pb40> list11 = (List) ((dx5) objB).a();
        ArrayList arrayList3 = new ArrayList(r3d.q(list11, 10));
        for (pb40 pb40Var : list11) {
            pb40Var.getClass();
            List list12 = pb40Var.G;
            j380 j380Var = pb40Var.E;
            j380 j380Var2 = pb40Var.D;
            h6h0 h6h0Var = pb40Var.K;
            String str = (list12 == null || (tdoVar2 = (tdo) CollectionsKt.firstOrNull(list12)) == null || (list9 = tdoVar2.c) == null || (list10 = (List) CollectionsKt.firstOrNull(list9)) == null || (ygoVar2 = (ygo) CollectionsKt.firstOrNull(list10)) == null) ? null : ygoVar2.f;
            String str2 = str == null ? "" : str;
            String str3 = (list12 == null || (tdoVar = (tdo) CollectionsKt.firstOrNull(list12)) == null || (list7 = tdoVar.c) == null || (list8 = (List) CollectionsKt.f0(list7)) == null || (ygoVar = (ygo) CollectionsKt.firstOrNull(list8)) == null) ? null : ygoVar.f;
            String str4 = str3 == null ? "" : str3;
            List list13 = pb40Var.f26688a;
            if (list13 == null) {
                list13 = iun.f15405a;
            }
            List list14 = list13;
            Long l3 = pb40Var.b;
            long jLongValue = l3 != null ? l3.longValue() : -1L;
            hmz hmzVar = pb40Var.B;
            String str5 = hmzVar != null ? hmzVar.b : null;
            String str6 = str5 == null ? "" : str5;
            long jLongValue2 = 0;
            long jLongValue3 = (j380Var2 == null || (list6 = j380Var2.c) == null || (c680Var2 = (c680) CollectionsKt.firstOrNull(list6)) == null || (l2 = c680Var2.f3806a) == null) ? 0L : l2.longValue();
            if (j380Var2 == null || (list5 = j380Var2.c) == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList(r3d.q(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    String str7 = ((c680) it.next()).c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    arrayList.add(str7);
                }
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            int iIntValue = 0;
            hb40 hb40Var = new hb40((h6h0Var == null || (list4 = h6h0Var.b) == null || (bf90Var2 = (bf90) CollectionsKt.f0(list4)) == null || (num5 = bf90Var2.b) == null) ? 0 : num5.intValue(), (h6h0Var == null || (num4 = h6h0Var.f) == null) ? 0 : num4.intValue(), jLongValue3, str2, arrayList);
            if (j380Var != null && (list3 = j380Var.c) != null && (c680Var = (c680) CollectionsKt.firstOrNull(list3)) != null && (l = c680Var.f3806a) != null) {
                jLongValue2 = l.longValue();
            }
            long j = jLongValue2;
            if (j380Var == null || (list2 = j380Var.c) == null) {
                arrayList2 = 0;
            } else {
                arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str8 = ((c680) it2.next()).c;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList2.add(str8);
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            hb40 hb40Var2 = new hb40((h6h0Var == null || (list = h6h0Var.b) == null || (bf90Var = (bf90) CollectionsKt.f0(list)) == null || (num3 = bf90Var.c) == null) ? 0 : num3.intValue(), (h6h0Var == null || (num2 = h6h0Var.g) == null) ? 0 : num2.intValue(), j, str4, arrayList2);
            if (h6h0Var != null && (num = h6h0Var.r) != null) {
                iIntValue = num.intValue();
            }
            arrayList3.add(new gb40(list14, jLongValue, str6, hb40Var, hb40Var2, iIntValue));
        }
        return arrayList3;
    }
}
