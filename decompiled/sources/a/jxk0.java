package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f17310a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final fxk0 g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Set setL0 = tx3.l0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(r3d.q(setL0, 10));
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            arrayList.add(eke0.b("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", mfy.BOOLEAN.c));
        }
        f17310a = arrayList;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((fxk0) it2.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = f17310a;
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((fxk0) it3.next()).b.b());
        }
        mfy mfyVar = mfy.BOOLEAN;
        String str = mfyVar.c;
        String str2 = mfyVar.c;
        fxk0 fxk0VarB = eke0.b("java/util/Collection", "contains", "Ljava/lang/Object;", str);
        ixk0 ixk0Var = ixk0.d;
        Pair pair = new Pair(fxk0VarB, ixk0Var);
        Pair pair2 = new Pair(eke0.b("java/util/Collection", "remove", "Ljava/lang/Object;", str2), ixk0Var);
        Pair pair3 = new Pair(eke0.b("java/util/Map", "containsKey", "Ljava/lang/Object;", str2), ixk0Var);
        Pair pair4 = new Pair(eke0.b("java/util/Map", "containsValue", "Ljava/lang/Object;", str2), ixk0Var);
        Pair pair5 = new Pair(eke0.b("java/util/Map", "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), ixk0Var);
        Pair pair6 = new Pair(eke0.b("java/util/Map", "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), ixk0.e);
        fxk0 fxk0VarB2 = eke0.b("java/util/Map", "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        ixk0 ixk0Var2 = ixk0.b;
        Pair pair7 = new Pair(fxk0VarB2, ixk0Var2);
        Pair pair8 = new Pair(eke0.b("java/util/Map", "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), ixk0Var2);
        mfy mfyVar2 = mfy.INT;
        fxk0 fxk0VarB3 = eke0.b("java/util/List", "indexOf", "Ljava/lang/Object;", mfyVar2.c);
        ixk0 ixk0Var3 = ixk0.c;
        Map mapF = xp20.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(fxk0VarB3, ixk0Var3), new Pair(eke0.b("java/util/List", "lastIndexOf", "Ljava/lang/Object;", mfyVar2.c), ixk0Var3));
        c = mapF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(mapF.size()));
        for (Map.Entry entry : mapF.entrySet()) {
            linkedHashMap.put(((fxk0) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetG = eui0.g(c.keySet(), f17310a);
        ArrayList arrayList5 = new ArrayList(r3d.q(linkedHashSetG, 10));
        Iterator it4 = linkedHashSetG.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((fxk0) it4.next()).b);
        }
        e = CollectionsKt.P0(arrayList5);
        ArrayList arrayList6 = new ArrayList(r3d.q(linkedHashSetG, 10));
        Iterator it5 = linkedHashSetG.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((fxk0) it5.next()).e);
        }
        f = CollectionsKt.P0(arrayList6);
        mfy mfyVar3 = mfy.INT;
        String str3 = mfyVar3.c;
        String str4 = mfyVar3.c;
        fxk0 fxk0VarB4 = eke0.b("java/util/List", "removeAt", str3, "Ljava/lang/Object;");
        g = fxk0VarB4;
        Map mapF2 = xp20.f(new Pair(new fxk0("java/lang/Number", d180.w, "", mfy.BYTE.c), g950.e("byteValue")), new Pair(new fxk0("java/lang/Number", d180.v, "", mfy.SHORT.c), g950.e("shortValue")), new Pair(new fxk0("java/lang/Number", d180.u, "", str4), g950.e("intValue")), new Pair(new fxk0("java/lang/Number", d180.t, "", mfy.LONG.c), g950.e("longValue")), new Pair(new fxk0("java/lang/Number", d180.s, "", mfy.FLOAT.c), g950.e("floatValue")), new Pair(new fxk0("java/lang/Number", d180.r, "", mfy.DOUBLE.c), g950.e("doubleValue")), new Pair(fxk0VarB4, g950.e("remove")), new Pair(eke0.b("java/lang/CharSequence", "get", str4, mfy.CHAR.c), g950.e("charAt")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicInteger", "load", "", TokenNames.I), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicInteger", Payload.TYPE_STORE, TokenNames.I, TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicInteger", "exchange", TokenNames.I, TokenNames.I), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicInteger", "fetchAndAdd", TokenNames.I, TokenNames.I), g950.e("getAndAdd")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicInteger", "addAndFetch", TokenNames.I, TokenNames.I), g950.e("addAndGet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLong", "load", "", "J"), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLong", Payload.TYPE_STORE, "J", TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLong", "exchange", "J", "J"), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLong", "fetchAndAdd", "J", "J"), g950.e("getAndAdd")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLong", "addAndFetch", "J", "J"), g950.e("addAndGet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicBoolean", "load", "", "Z"), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicBoolean", Payload.TYPE_STORE, "Z", TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicBoolean", "exchange", "Z", "Z"), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReference", "load", "", "Ljava/lang/Object;"), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReference", Payload.TYPE_STORE, "Ljava/lang/Object;", TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReference", "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicIntegerArray", "loadAt", TokenNames.I, TokenNames.I), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicIntegerArray", "storeAt", "II", TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicIntegerArray", "exchangeAt", "II", TokenNames.I), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicIntegerArray", "compareAndSetAt", "III", "Z"), g950.e("compareAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicIntegerArray", "fetchAndAddAt", "II", TokenNames.I), g950.e("getAndAdd")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicIntegerArray", "addAndFetchAt", "II", TokenNames.I), g950.e("addAndGet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLongArray", "loadAt", TokenNames.I, "J"), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLongArray", "storeAt", "IJ", TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLongArray", "exchangeAt", "IJ", "J"), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLongArray", "compareAndSetAt", "IJJ", "Z"), g950.e("compareAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLongArray", "fetchAndAddAt", "IJ", "J"), g950.e("getAndAdd")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicLongArray", "addAndFetchAt", "IJ", "J"), g950.e("addAndGet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReferenceArray", "loadAt", TokenNames.I, "Ljava/lang/Object;"), g950.e("get")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReferenceArray", "storeAt", "ILjava/lang/Object;", TokenNames.V), g950.e("set")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReferenceArray", "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), g950.e("getAndSet")), new Pair(eke0.b("java/util/concurrent/atomic/AtomicReferenceArray", "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), g950.e("compareAndSet")));
        h = mapF2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(mapF2.size()));
        for (Map.Entry entry2 : mapF2.entrySet()) {
            linkedHashMap2.put(((fxk0) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            fxk0 fxk0Var = (fxk0) entry3.getKey();
            g950 g950Var = (g950) entry3.getValue();
            String str5 = fxk0Var.f10315a;
            String str6 = fxk0Var.c;
            String str7 = fxk0Var.d;
            g950Var.getClass();
            str6.getClass();
            str7.getClass();
            linkedHashSet.add(str5 + '.' + (g950Var + '(' + str6 + ')' + str7));
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((fxk0) it6.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(r3d.q(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((fxk0) entry4.getKey()).b, entry4.getValue()));
        }
        int iA = wp20.a(r3d.q(arrayList7, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (Pair pair9 : arrayList7) {
            linkedHashMap3.put((g950) pair9.b, (g950) pair9.f46059a);
        }
        k = linkedHashMap3;
    }
}
