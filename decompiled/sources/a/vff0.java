package a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f37328a;
    public final a1d b;
    public final q7d0 c;
    public final asd d;
    public final wti e;
    public final us3 f;
    public final nrd g;
    public final vby h;
    public final Map i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final ReentrantLock l;
    public final Map m;
    public final n0o0 n;
    public volatile List o;
    public volatile String p;
    public volatile LinkedHashMap q;

    public vff0(mne mneVar, a1d a1dVar, q7d0 q7d0Var, asd asdVar, wti wtiVar, knf0 knf0Var, us3 us3Var, kwd kwdVar, nrd nrdVar, vby vbyVar, vdf vdfVar) throws l52 {
        this.f37328a = mneVar;
        this.b = a1dVar;
        this.c = q7d0Var;
        this.d = asdVar;
        this.e = wtiVar;
        this.f = us3Var;
        this.g = nrdVar;
        this.h = vbyVar;
        try {
            this.i = (Map) vdfVar.f37228a.b(new inv(ysm0.f43175a, sm8.f32432a, (byte) 1), vdfVar.b);
            this.j = new ConcurrentHashMap();
            this.k = new ConcurrentHashMap();
            this.l = new ReentrantLock();
            this.m = Collections.synchronizedMap(new IdentityHashMap());
            this.n = maz.b(new b4f0(this));
            qjj.W(d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b)), null, null, new tye0(this, null, (byte) 7), 3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new l52();
        }
    }

    public static ArrayList i(yff0 yff0Var) {
        wrd wrdVar = yff0Var.f42540a;
        List list = wrdVar != null ? wrdVar.m.f24033a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((puy) obj).c;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(zdx.J((puy) it.next()));
        }
        return arrayList2;
    }

    public static void j(Class cls, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
        if (linkedHashSet.contains(cls)) {
            return;
        }
        if (kotlin.text.c.x(cls.getName(), "java.", false) || kotlin.text.c.x(cls.getName(), "android.", false)) {
            return;
        }
        linkedHashSet.add(cls);
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            Class<?> type = field.getType();
            if (!type.isEnum()) {
                j(type, linkedHashMap, linkedHashSet);
            } else if (sgf0.class.isAssignableFrom(type)) {
                Object[] enumConstants = type.getEnumConstants();
                Object objB = enumConstants != null ? tx3.B(enumConstants) : null;
                sgf0 sgf0Var = objB instanceof sgf0 ? (sgf0) objB : null;
                linkedHashMap.put(sgf0Var != null ? sgf0Var.a() : field.getName(), type);
            }
        }
    }

    public final sff0 a(rhi0 rhi0Var, boolean z) throws Exception {
        tff0 tff0Var = new tff0(rhi0Var, z);
        ConcurrentHashMap concurrentHashMap = this.k;
        sff0 sff0Var = (sff0) concurrentHashMap.get(tff0Var);
        if (sff0Var != null) {
            return sff0Var;
        }
        try {
            sff0 sff0VarC = c(b(rhi0Var), z);
            concurrentHashMap.put(tff0Var, sff0VarC);
            return sff0VarC;
        } catch (Exception e) {
            if (!(e instanceof FileNotFoundException) && !(e instanceof roe)) {
                throw e;
            }
            sff0 sff0VarC2 = c(f(rhi0.f30492a, z), z);
            concurrentHashMap.put(tff0Var, sff0VarC2);
            return sff0VarC2;
        }
    }

    public final yff0 b(rhi0 rhi0Var) {
        ConcurrentHashMap concurrentHashMap = this.j;
        yff0 yff0Var = (yff0) concurrentHashMap.get(rhi0Var);
        if (yff0Var != null) {
            return yff0Var;
        }
        ReentrantLock reentrantLock = this.l;
        reentrantLock.lock();
        try {
            yff0 yff0VarA = (yff0) concurrentHashMap.get(rhi0Var);
            if (yff0VarA == null) {
                go3 go3VarC = this.f.c();
                asd asdVar = this.d;
                String string = go3VarC.toString();
                rhi0Var.getClass();
                String strA = asd.a(string, rhi0Var);
                ConcurrentHashMap concurrentHashMap2 = asdVar.c;
                mwn mwnVar = (mwn) concurrentHashMap2.get(strA);
                if (mwnVar == null) {
                    ReentrantLock reentrantLock2 = asdVar.e;
                    reentrantLock2.lock();
                    try {
                        mwn mwnVarD = asdVar.d(string, rhi0Var);
                        reentrantLock2.unlock();
                        concurrentHashMap2.put(strA, mwnVarD);
                        mwnVar = mwnVarD;
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                yff0VarA = this.g.a(mwnVar, rhi0Var, this.h);
                concurrentHashMap.put(rhi0Var, yff0VarA);
            }
            reentrantLock.unlock();
            return yff0VarA;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final sff0 c(yff0 yff0Var, boolean z) throws roe {
        mcy mcyVar;
        List listD;
        wrd wrdVar = yff0Var.f42540a;
        if (wrdVar == null) {
            throw new roe(null);
        }
        Collection collectionValues = this.i.values();
        boolean z2 = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    z2 = true;
                    break;
                }
            }
        }
        boolean zContainsKey = this.m.containsKey(yff0Var);
        if (!z2 && !z && zContainsKey) {
            return x9x.b0(wrdVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(lmc.Y(wrdVar, this.h));
        for (Map.Entry entry : this.i.entrySet()) {
            String str = (String) entry.getKey();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(str, ncy.a(Boolean.FALSE));
            }
        }
        if (!zContainsKey) {
            Map mapN = xp20.n(linkedHashMap);
            try {
                Map mapE = e();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(mapN.size()));
                for (Object obj : mapN.entrySet()) {
                    Object key = ((Map.Entry) obj).getKey();
                    Map.Entry entry2 = (Map.Entry) obj;
                    String str2 = (String) entry2.getKey();
                    mcy mcyVar2 = (mcy) entry2.getValue();
                    ssd ssdVar = (ssd) mapE.get(str2);
                    if (ssdVar == null || (listD = ssdVar.c) == null) {
                        listD = d(mcyVar2, str2);
                    }
                    linkedHashMap2.put(key, new ssd(mcyVar2, (ssdVar == null || Intrinsics.d(ssdVar.f32720a, ssdVar.b)) ? mcyVar2 : ssdVar.b, listD));
                }
                if (!linkedHashMap2.equals(mapE)) {
                    this.c.g("TEST_SECTION_CONFIG_KEY", this.h.d(new inv(ysm0.f43175a, ssd.Companion.serializer(), (byte) 1), linkedHashMap2));
                    this.q = linkedHashMap2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Map map = this.m;
            map.getClass();
            map.put(yff0Var, Boolean.TRUE);
        }
        if (z) {
            for (Map.Entry entry3 : e().entrySet()) {
                String str3 = (String) entry3.getKey();
                ssd ssdVar2 = (ssd) entry3.getValue();
                if (!Intrinsics.d(str3, "languages") && (mcyVar = ssdVar2.b) != null) {
                    linkedHashMap.put(str3, mcyVar);
                }
            }
        }
        return x9x.b0(lmc.X(linkedHashMap, this.h));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r6.equals("false") != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(a.mcy r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.jdy
            if (r0 == 0) goto L49
            a.jdy r6 = (a.jdy) r6
            boolean r0 = r6.c()
            if (r0 != 0) goto L49
            java.lang.String r0 = r6.b()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r2 = "true"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L34
            java.lang.String r6 = r6.b()
            java.lang.String r6 = r6.toLowerCase(r1)
            r6.getClass()
            java.lang.String r0 = "false"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L49
        L34:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            a.jdy r5 = a.ncy.a(r5)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            a.jdy r6 = a.ncy.a(r6)
            a.jdy[] r5 = new a.jdy[]{r5, r6}
            java.util.List r5 = a.q3d.j(r5)
            return r5
        L49:
            a.n0o0 r5 = r5.n
            java.lang.Object r5 = r5.getValue()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r5.get(r7)
            java.lang.Class r5 = (java.lang.Class) r5
            r6 = 0
            r7 = 10
            if (r5 == 0) goto L9d
            java.lang.Object[] r5 = r5.getEnumConstants()
            java.lang.Enum[] r5 = (java.lang.Enum[]) r5
            if (r5 != 0) goto L67
            a.iun r5 = a.iun.f15405a
            goto L9e
        L67:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L6e:
            if (r2 >= r1) goto L7c
            r3 = r5[r2]
            boolean r4 = r3 instanceof a.sgf0
            if (r4 == 0) goto L79
            r0.add(r3)
        L79:
            int r2 = r2 + 1
            goto L6e
        L7c:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = a.r3d.q(r0, r7)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r0.next()
            a.sgf0 r1 = (a.sgf0) r1
            java.lang.String r1 = r1.getValue()
            r5.add(r1)
            goto L89
        L9d:
            r5 = r6
        L9e:
            if (r5 == 0) goto Lc1
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = a.r3d.q(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        Lad:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lc1
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            a.jdy r7 = a.ncy.c(r7)
            r6.add(r7)
            goto Lad
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vff0.d(a.mcy, java.lang.String):java.util.List");
    }

    public final Map e() {
        Map map;
        LinkedHashMap linkedHashMap = this.q;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap2 = this.q;
                if (linkedHashMap2 != null) {
                    return linkedHashMap2;
                }
                try {
                    String string = this.c.a().getString("TEST_SECTION_CONFIG_KEY", "");
                    if (string == null) {
                        string = "";
                    }
                    if (string.length() == 0) {
                        lun lunVar = lun.f20680a;
                        lunVar.getClass();
                        return lunVar;
                    }
                    Map map2 = (Map) this.h.b(new inv(ysm0.f43175a, mrv.j0(ssd.Companion.serializer()), (byte) 1), string);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (((ssd) entry.getValue()) != null) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(wp20.a(linkedHashMap3.size()));
                    for (Object obj : linkedHashMap3.entrySet()) {
                        Object key = ((Map.Entry) obj).getKey();
                        Object value = ((Map.Entry) obj).getValue();
                        value.getClass();
                        linkedHashMap4.put(key, (ssd) value);
                    }
                    this.q = linkedHashMap4;
                    map = linkedHashMap4;
                    return map;
                } catch (Exception e) {
                    e.printStackTrace();
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    map = lunVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yff0 f(rhi0 rhi0Var, boolean z) throws IOException {
        mwn mwnVarS = this.e.s();
        yff0 yff0VarA = this.g.a(mwnVarS, rhi0Var, this.h);
        this.j.put(rhi0Var, yff0VarA);
        this.o = i(yff0VarA);
        c(yff0VarA, z);
        this.d.e(mwnVarS, this.f.c().toString(), rhi0Var);
        return yff0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(rhi0 rhi0Var, boolean z, zje zjeVar) {
        uff0 uff0Var;
        if (zjeVar instanceof uff0) {
            uff0Var = (uff0) zjeVar;
            int i = uff0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uff0Var.k = i - Integer.MIN_VALUE;
            } else {
                uff0Var = new uff0(this, zjeVar);
            }
        } else {
            uff0Var = new uff0(this, zjeVar);
        }
        Object obj = uff0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = uff0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            dvj dvjVar = this.f37328a.b;
            k6d0 k6d0Var = new k6d0(this, rhi0Var, z, (yje) null);
            uff0Var.k = 1;
            if (qjj.d0(dvjVar, k6d0Var, uff0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public final void h() throws IOException {
        yff0 yff0VarF;
        String string = this.f.c().toString();
        c0o c0oVar = rhi0.d;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            rhi0 rhi0Var = (rhi0) y2VarH.next();
            if (this.d.c(string, rhi0Var)) {
                try {
                    yff0VarF = b(rhi0Var);
                } catch (Exception unused) {
                    yff0VarF = f(rhi0Var, false);
                }
            } else {
                yff0VarF = rhi0Var == rhi0.f30492a ? f(rhi0Var, false) : null;
            }
            if (yff0VarF != null) {
                sff0 sff0VarC = c(yff0VarF, false);
                this.k.put(new tff0(rhi0Var, false), sff0VarC);
                if (this.o == null) {
                    this.o = i(yff0VarF);
                }
                if (this.p == null) {
                    this.p = sff0VarC.S;
                }
                this.k.put(new tff0(rhi0Var, true), c(yff0VarF, true));
            }
        }
    }
}
