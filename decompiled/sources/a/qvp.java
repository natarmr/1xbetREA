package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qvp extends bnn0 implements Function1 {
    public List i;
    public byte j;
    public final /* synthetic */ pmi k;
    public final /* synthetic */ sip l;
    public final /* synthetic */ jo20 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvp(pmi pmiVar, sip sipVar, jo20 jo20Var, long j, yje yjeVar) {
        super(1, yjeVar);
        this.k = pmiVar;
        this.l = sipVar;
        this.m = jo20Var;
        this.n = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new qvp(this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qvp) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d6 A[LOOP:0: B:44:0x00d0->B:46:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0115 A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        a280 a280Var;
        List list3;
        a280 a280Var2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        Long l;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        sip sipVar = this.l;
        pmi pmiVar = this.k;
        if (b == 0) {
            z1x.P(obj);
            iqi iqiVar = (iqi) pmiVar.c;
            this.j = (byte) 1;
            yip yipVar = (yip) iqiVar.b;
            int iOrdinal = sipVar.ordinal();
            jo20 jo20Var = this.m;
            if (iOrdinal == 0) {
                obj = ((ovp) yipVar.invoke()).a(jo20Var, this);
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                obj = ((ovp) yipVar.invoke()).b(jo20Var, this);
            }
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.i;
            z1x.P(obj);
        }
        List list4 = (List) obj;
        arrayList = new ArrayList(r3d.q(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(g7x.a0((su10) it.next(), sipVar, this.n));
        }
        arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.d(((su10) obj2).P, Boolean.TRUE)) {
                arrayList2.add(obj2);
            }
        }
        arrayList3 = new ArrayList();
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            l = ((su10) it2.next()).f32800a;
            if (l != null) {
                arrayList3.add(l);
            }
        }
        return new pvp(arrayList, list4, CollectionsKt.P0(arrayList3));
        List<su10> list5 = (List) ((dx5) obj).a();
        jtj jtjVar = (jtj) pmiVar.e;
        ArrayList arrayList4 = new ArrayList();
        for (su10 su10Var : list5) {
            h06 h06Var = su10Var.A;
            Long l2 = (h06Var == null || (list3 = h06Var.c) == null || (a280Var2 = (a280) CollectionsKt.firstOrNull(list3)) == null) ? null : a280Var2.f113a;
            h06 h06Var2 = su10Var.B;
            w3d.u(arrayList4, tx3.z(new Long[]{l2, (h06Var2 == null || (list2 = h06Var2.c) == null || (a280Var = (a280) CollectionsKt.firstOrNull(list2)) == null) ? null : a280Var.f113a}));
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList4));
        this.i = list5;
        this.j = (byte) 2;
        Object objD = jtjVar.d(listL0, this);
        if (objD != wneVar) {
            list = list5;
            obj = objD;
            List list6 = (List) obj;
            arrayList = new ArrayList(r3d.q(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g7x.a0((su10) it.next(), sipVar, this.n));
            }
            arrayList2 = new ArrayList();
            while (r0.hasNext()) {
                if (Intrinsics.d(((su10) obj2).P, Boolean.TRUE)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList3 = new ArrayList();
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                l = ((su10) it2.next()).f32800a;
                if (l != null) {
                    arrayList3.add(l);
                }
            }
            return new pvp(arrayList, list6, CollectionsKt.P0(arrayList3));
        }
        return wneVar;
    }
}
