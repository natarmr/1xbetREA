package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class zxt extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ int k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxt(cmt cmtVar, ArrayList arrayList, List list, int i, yje yjeVar) {
        super(2, yjeVar);
        this.m = cmtVar;
        this.o = arrayList;
        this.p = list;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (b) {
            case 0:
                zxt zxtVar = new zxt((cmt) this.m, (ArrayList) obj3, (List) obj2, this.k, yjeVar);
                zxtVar.n = obj;
                return zxtVar;
            default:
                return new zxt((aa40) this.n, this.k, (jiy) obj3, (Function1) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zxt) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:341:0x0339 A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        cmt cmtVar;
        Object objN;
        String str;
        odb odbVarJ;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Iterator it2;
        Throwable th;
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        boolean z = true;
        Throwable th2 = null;
        boolean z2 = false;
        switch (b) {
            case 0:
                vne vneVar = (vne) this.n;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    cmtVar = (cmt) this.m;
                    ArrayList<Pair> arrayList = (ArrayList) obj3;
                    List list = (List) obj2;
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (Pair pair : arrayList) {
                        arrayList2.add(qjj.M(vneVar, null, new yxt(cmtVar, list, ((Number) pair.f46059a).longValue(), ((Number) pair.b).longValue(), this.k, null), 3));
                    }
                    this.n = null;
                    this.l = cmtVar;
                    this.j = true;
                    objN = qjj.N(arrayList2, this);
                    if (objN == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cmt cmtVar2 = (cmt) this.l;
                    z1x.P(obj);
                    cmtVar = cmtVar2;
                    objN = obj;
                }
                ArrayList<odb> arrayListR = r3d.r((Iterable) objN);
                cmtVar.getClass();
                if (arrayListR.isEmpty()) {
                    return iun.f15405a;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (odb odbVar : arrayListR) {
                    if (odbVar != null) {
                        if (odbVar instanceof ndb) {
                            ndb ndbVar = (ndb) odbVar;
                            long j = ndbVar.f23331a;
                            if (!linkedHashMap2.containsKey(Long.valueOf(j))) {
                                linkedHashMap2.put(Long.valueOf(j), ndbVar.b);
                            }
                        } else if (odbVar instanceof ldb) {
                            Long lValueOf = Long.valueOf(((ldb) odbVar).c);
                            Object obj4 = linkedHashMap3.get(lValueOf);
                            Object obj5 = obj4;
                            if (obj4 == null) {
                                ArrayList arrayList3 = new ArrayList();
                                linkedHashMap3.put(lValueOf, arrayList3);
                                obj5 = arrayList3;
                            }
                            ((List) obj5).add(odbVar);
                        } else if (odbVar instanceof kdb) {
                            Long lValueOf2 = Long.valueOf(((kdb) odbVar).c);
                            Object obj6 = linkedHashMap3.get(lValueOf2);
                            Object obj7 = obj6;
                            if (obj6 == null) {
                                ArrayList arrayList4 = new ArrayList();
                                linkedHashMap3.put(lValueOf2, arrayList4);
                                obj7 = arrayList4;
                            }
                            ((List) obj7).add(odbVar);
                        } else if (odbVar instanceof mdb) {
                            Long lValueOf3 = Long.valueOf(((mdb) odbVar).c);
                            Object obj8 = linkedHashMap3.get(lValueOf3);
                            Object obj9 = obj8;
                            if (obj8 == null) {
                                ArrayList arrayList5 = new ArrayList();
                                linkedHashMap3.put(lValueOf3, arrayList5);
                                obj9 = arrayList5;
                            }
                            ((List) obj9).add(odbVar);
                        }
                    }
                    t9f.b();
                    return null;
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    List list2 = (List) entry.getValue();
                    String str2 = (String) linkedHashMap2.get(Long.valueOf(jLongValue));
                    if (str2 == null) {
                        str2 = "";
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        odb odbVar2 = (odb) it4.next();
                        Set setEntrySet = linkedHashMap4.entrySet();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj10 : setEntrySet) {
                            Map.Entry entry2 = (Map.Entry) obj10;
                            long jLongValue2 = ((Number) entry2.getKey()).longValue();
                            boolean z4 = z;
                            odb odbVar3 = (odb) entry2.getValue();
                            if (jLongValue2 == odbVar2.a() || odbVar3.a() == odbVar2.a()) {
                                linkedHashMap = linkedHashMap2;
                                it = it3;
                                it2 = it4;
                                th = th2;
                            } else {
                                th = th2;
                                if (!(odbVar2 instanceof kdb)) {
                                    linkedHashMap = linkedHashMap2;
                                    it = it3;
                                    it2 = it4;
                                    if (((odbVar2 instanceof ldb) || (odbVar2 instanceof mdb)) && (odbVar3 instanceof kdb)) {
                                        kdb kdbVar = (kdb) odbVar3;
                                        List list3 = kdbVar.g;
                                        if (!list3.isEmpty()) {
                                            Iterator it5 = list3.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (((mdb) it5.next()).f21587a == odbVar2.a()) {
                                                    }
                                                } else if (kdbVar.f18097a == odbVar2.a()) {
                                                }
                                            }
                                        } else if (kdbVar.f18097a == odbVar2.a()) {
                                        }
                                    }
                                } else if ((odbVar3 instanceof ldb) || (odbVar3 instanceof mdb)) {
                                    List list4 = ((kdb) odbVar2).g;
                                    if (!list4.isEmpty()) {
                                        Iterator it6 = list4.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                odb odbVar4 = odbVar2;
                                                long j2 = ((mdb) it6.next()).f21587a;
                                                if (j2 == jLongValue2 || j2 == odbVar3.a()) {
                                                    odbVar2 = odbVar4;
                                                    linkedHashMap = linkedHashMap2;
                                                    it = it3;
                                                    it2 = it4;
                                                } else {
                                                    odbVar2 = odbVar4;
                                                }
                                            }
                                        }
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    it = it3;
                                    it2 = it4;
                                } else {
                                    odb odbVar5 = odbVar2;
                                    if (odbVar3 instanceof kdb) {
                                        List list5 = ((kdb) odbVar5).g;
                                        if (list5.isEmpty()) {
                                            odbVar2 = odbVar5;
                                            linkedHashMap = linkedHashMap2;
                                            it = it3;
                                            it2 = it4;
                                        } else {
                                            Iterator it7 = list5.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    mdb mdbVar = (mdb) it7.next();
                                                    linkedHashMap = linkedHashMap2;
                                                    kdb kdbVar2 = (kdb) odbVar3;
                                                    it = it3;
                                                    it2 = it4;
                                                    if (mdbVar.f21587a != kdbVar2.f18097a) {
                                                        List list6 = kdbVar2.g;
                                                        if (!list6.isEmpty()) {
                                                            Iterator it8 = list6.iterator();
                                                            while (true) {
                                                                if (!it8.hasNext()) {
                                                                    continue;
                                                                } else if (((mdb) it8.next()).f21587a == mdbVar.f21587a) {
                                                                }
                                                            }
                                                        }
                                                        linkedHashMap2 = linkedHashMap;
                                                        it3 = it;
                                                        it4 = it2;
                                                    }
                                                    odbVar2 = odbVar5;
                                                }
                                            }
                                        }
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    it = it3;
                                    it2 = it4;
                                    odbVar2 = odbVar5;
                                }
                                th2 = th;
                                linkedHashMap2 = linkedHashMap;
                                it3 = it;
                                z = z4;
                                it4 = it2;
                            }
                            arrayList7.add(obj10);
                            th2 = th;
                            linkedHashMap2 = linkedHashMap;
                            it3 = it;
                            z = z4;
                            it4 = it2;
                        }
                        LinkedHashMap linkedHashMap5 = linkedHashMap2;
                        Iterator it9 = it3;
                        Iterator it10 = it4;
                        boolean z5 = z;
                        Throwable th3 = th2;
                        ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                        Iterator it11 = arrayList7.iterator();
                        while (it11.hasNext()) {
                            arrayList8.add(Long.valueOf(((Number) ((Map.Entry) it11.next()).getKey()).longValue()));
                        }
                        Iterator it12 = arrayList8.iterator();
                        while (it12.hasNext()) {
                            odb odbVarJ2 = (odb) linkedHashMap4.remove(Long.valueOf(((Number) it12.next()).longValue()));
                            if (odbVarJ2 != null) {
                                boolean z6 = odbVarJ2 instanceof ldb;
                                long j3 = 0;
                                if (z6 && (odbVar2 instanceof ldb)) {
                                    ldb ldbVar = (ldb) odbVarJ2;
                                    ldb ldbVar2 = (ldb) odbVar2;
                                    Integer intOrNull = StringsKt.toIntOrNull(ldbVar.f);
                                    int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                                    Integer intOrNull2 = StringsKt.toIntOrNull(ldbVar2.f);
                                    String strValueOf = String.valueOf(iIntValue + (intOrNull2 != null ? intOrNull2.intValue() : 0));
                                    long j4 = ldbVar.c;
                                    if (j4 == 0) {
                                        j4 = ldbVar2.c;
                                    }
                                    long j5 = j4;
                                    long j6 = ldbVar.d;
                                    if (j6 == 0) {
                                        j6 = ldbVar2.d;
                                    }
                                    odbVarJ = ldb.c(ldbVar, j5, j6, strValueOf);
                                } else {
                                    boolean z7 = odbVarJ2 instanceof mdb;
                                    if (z7 && (odbVar2 instanceof mdb)) {
                                        mdb mdbVar2 = (mdb) odbVarJ2;
                                        mdb mdbVar3 = (mdb) odbVar2;
                                        Integer intOrNull3 = StringsKt.toIntOrNull(mdbVar2.g);
                                        int iIntValue2 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                                        Integer intOrNull4 = StringsKt.toIntOrNull(mdbVar3.g);
                                        String strValueOf2 = String.valueOf(iIntValue2 + (intOrNull4 != null ? intOrNull4.intValue() : 0));
                                        long j7 = mdbVar2.c;
                                        if (j7 == 0) {
                                            j7 = mdbVar3.c;
                                        }
                                        long j8 = j7;
                                        long j9 = mdbVar2.d;
                                        if (j9 == 0) {
                                            j9 = mdbVar3.d;
                                        }
                                        odbVarJ = mdb.c(mdbVar2, j8, j9, strValueOf2, false, 179);
                                    } else if (z7 && (odbVar2 instanceof ldb)) {
                                        mdb mdbVar4 = (mdb) odbVarJ2;
                                        ldb ldbVar3 = (ldb) odbVar2;
                                        Integer intOrNull5 = StringsKt.toIntOrNull(mdbVar4.g);
                                        int iIntValue3 = intOrNull5 != null ? intOrNull5.intValue() : 0;
                                        Integer intOrNull6 = StringsKt.toIntOrNull(ldbVar3.f);
                                        String strValueOf3 = String.valueOf(iIntValue3 + (intOrNull6 != null ? intOrNull6.intValue() : 0));
                                        long j10 = ldbVar3.c;
                                        if (j10 == 0) {
                                            j10 = mdbVar4.c;
                                        }
                                        long j11 = j10;
                                        long j12 = ldbVar3.d;
                                        if (j12 == 0) {
                                            j12 = mdbVar4.d;
                                        }
                                        odbVarJ = ldb.c(ldbVar3, j11, j12, strValueOf3);
                                    } else if (z6 && (odbVar2 instanceof mdb)) {
                                        ldb ldbVar4 = (ldb) odbVarJ2;
                                        mdb mdbVar5 = (mdb) odbVar2;
                                        Integer intOrNull7 = StringsKt.toIntOrNull(ldbVar4.f);
                                        int iIntValue4 = intOrNull7 != null ? intOrNull7.intValue() : 0;
                                        Integer intOrNull8 = StringsKt.toIntOrNull(mdbVar5.g);
                                        String strValueOf4 = String.valueOf(iIntValue4 + (intOrNull8 != null ? intOrNull8.intValue() : 0));
                                        long j13 = ldbVar4.c;
                                        if (j13 == 0) {
                                            j13 = mdbVar5.c;
                                        }
                                        long j14 = j13;
                                        long j15 = ldbVar4.d;
                                        if (j15 == 0) {
                                            j15 = mdbVar5.d;
                                        }
                                        odbVarJ = ldb.c(ldbVar4, j14, j15, strValueOf4);
                                    } else {
                                        boolean z8 = odbVarJ2 instanceof kdb;
                                        if (z8 && (odbVar2 instanceof kdb)) {
                                            kdb kdbVar3 = (kdb) odbVarJ2;
                                            kdb kdbVar4 = (kdb) odbVar2;
                                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                            for (mdb mdbVar6 : CollectionsKt.q0(kdbVar3.g, kdbVar4.g)) {
                                                long j16 = mdbVar6.f21587a;
                                                mdb mdbVar7 = (mdb) linkedHashMap6.get(Long.valueOf(j16));
                                                if (mdbVar7 == null) {
                                                    linkedHashMap6.put(Long.valueOf(j16), mdb.c(mdbVar6, 0L, 0L, null, false, 127));
                                                } else {
                                                    long j17 = j3;
                                                    Integer intOrNull9 = StringsKt.toIntOrNull(mdbVar7.g);
                                                    int iIntValue5 = intOrNull9 != null ? intOrNull9.intValue() : 0;
                                                    Integer intOrNull10 = StringsKt.toIntOrNull(mdbVar6.g);
                                                    linkedHashMap6.put(Long.valueOf(j16), mdb.c(mdbVar7, 0L, 0L, String.valueOf(iIntValue5 + (intOrNull10 != null ? intOrNull10.intValue() : 0)), false, 63));
                                                    j3 = j17;
                                                }
                                            }
                                            long j18 = j3;
                                            Collection collectionValues = linkedHashMap6.values();
                                            collectionValues.getClass();
                                            List listL0 = CollectionsKt.L0(collectionValues);
                                            ArrayList arrayList9 = new ArrayList(r3d.q(listL0, 10));
                                            int i = 0;
                                            for (Object obj11 : listL0) {
                                                int i2 = i + 1;
                                                if (i < 0) {
                                                    q3d.p();
                                                    throw th3;
                                                }
                                                mdb mdbVar8 = (mdb) obj11;
                                                mdbVar8.getClass();
                                                arrayList9.add(mdb.c(mdbVar8, 0L, 0L, null, i == listL0.size() + (-1) ? z5 : false, 127));
                                                i = i2;
                                            }
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            Iterator it13 = arrayList9.iterator();
                                            while (it13.hasNext()) {
                                                linkedHashSet.add(Long.valueOf(((mdb) it13.next()).f21587a));
                                            }
                                            String strValueOf5 = String.valueOf(linkedHashSet.size());
                                            boolean z9 = (kdbVar3.h || kdbVar4.h) ? z5 : false;
                                            long j19 = kdbVar3.c;
                                            if (j19 == j18) {
                                                j19 = kdbVar4.c;
                                            }
                                            long j20 = j19;
                                            long j21 = kdbVar3.d;
                                            if (j21 == j18) {
                                                j21 = kdbVar4.d;
                                            }
                                            odbVarJ = kdb.c(kdbVar3, j20, j21, strValueOf5, arrayList9, z9, 19);
                                        } else if (z6 && (odbVar2 instanceof kdb)) {
                                            odbVarJ = cmt.j((ldb) odbVarJ2, (kdb) odbVar2);
                                        } else {
                                            if (z8 && (odbVar2 instanceof ldb)) {
                                                odbVarJ = cmt.j((ldb) odbVar2, (kdb) odbVarJ2);
                                            } else {
                                                if (z8 && (odbVar2 instanceof mdb)) {
                                                    mdb mdbVar9 = (mdb) odbVar2;
                                                    str = str2;
                                                    odbVarJ2 = cmt.j(new ldb(mdbVar9.f21587a, mdbVar9.b, mdbVar9.c, mdbVar9.d, mdbVar9.f, mdbVar9.g), (kdb) odbVarJ2);
                                                } else {
                                                    str = str2;
                                                    if (z7 && (odbVar2 instanceof kdb)) {
                                                        mdb mdbVar10 = (mdb) odbVarJ2;
                                                        odbVarJ2 = cmt.j(new ldb(mdbVar10.f21587a, mdbVar10.b, mdbVar10.c, mdbVar10.d, mdbVar10.f, mdbVar10.g), (kdb) odbVar2);
                                                    }
                                                }
                                                odbVar2 = odbVarJ2;
                                            }
                                            str2 = str;
                                        }
                                    }
                                }
                                odbVar2 = odbVarJ;
                                str = str2;
                                str2 = str;
                            }
                        }
                        linkedHashMap4.put(Long.valueOf(odbVar2.a()), odbVar2);
                        th2 = th3;
                        linkedHashMap2 = linkedHashMap5;
                        it3 = it9;
                        z = z5;
                        it4 = it10;
                    }
                    LinkedHashMap linkedHashMap7 = linkedHashMap2;
                    Iterator it14 = it3;
                    boolean z10 = z;
                    Throwable th4 = th2;
                    String str3 = str2;
                    Collection collectionValues2 = linkedHashMap4.values();
                    collectionValues2.getClass();
                    List listL1 = CollectionsKt.L0(collectionValues2);
                    if (!listL1.isEmpty()) {
                        arrayList6.add(new ndb(jLongValue, str3));
                        int i3 = 0;
                        for (Object obj12 : listL1) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw th4;
                            }
                            odb odbVar6 = (odb) obj12;
                            q3d.i(listL1);
                            odbVar6.getClass();
                            arrayList6.add(odbVar6);
                            i3 = i4;
                        }
                    }
                    th2 = th4;
                    linkedHashMap2 = linkedHashMap7;
                    it3 = it14;
                    z = z10;
                }
                return arrayList6;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z11 = this.j;
                if (z11) {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    return obj;
                }
                z1x.P(obj);
                aa40 aa40Var = (aa40) this.n;
                jiy jiyVar = (jiy) obj3;
                Function1 function1 = (Function1) obj2;
                this.l = jiyVar;
                this.m = function1;
                this.j = true;
                n5a n5aVar = new n5a(1, pnx.b(this));
                n5aVar.r();
                int i5 = this.k;
                z940 z940Var = new z940(aa40Var, i5, jiyVar, n5aVar);
                aa40Var.j.put(new Integer(i5), z940Var);
                qjj.W(d5c.a(n5aVar.e), null, null, new j940(function1, z940Var, z2 ? 1 : 0, (byte) 4), 3);
                Object objP = n5aVar.p();
                return objP == wneVar2 ? wneVar2 : objP;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxt(aa40 aa40Var, int i, jiy jiyVar, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.n = aa40Var;
        this.k = i;
        this.o = jiyVar;
        this.p = function1;
    }
}
