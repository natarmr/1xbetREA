package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nlu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uau f23745a;
    public final nau b;
    public final lau c;
    public final lau d;
    public final uii e;
    public final a6u f;
    public final yuu g;
    public final pau h;
    public final pau i;
    public final pwi j;
    public final qv2 k;
    public final tsu l;
    public final ieu m;
    public final jqc n;
    public final jcl o;
    public boolean p;

    public nlu(uau uauVar, nau nauVar, lau lauVar, lau lauVar2, uii uiiVar, a6u a6uVar, yuu yuuVar, pau pauVar, pau pauVar2, pwi pwiVar, qv2 qv2Var, tsu tsuVar, ieu ieuVar, jqc jqcVar, jcl jclVar) {
        this.f23745a = uauVar;
        this.b = nauVar;
        this.c = lauVar;
        this.d = lauVar2;
        this.e = uiiVar;
        this.f = a6uVar;
        this.g = yuuVar;
        this.h = pauVar;
        this.i = pauVar2;
        this.j = pwiVar;
        this.k = qv2Var;
        this.l = tsuVar;
        this.m = ieuVar;
        this.n = jqcVar;
        this.o = jclVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:29:0x0123  */
    /* JADX WARN: Code duplicated, block: B:33:0x0152  */
    /* JADX WARN: Code duplicated, block: B:37:0x017e  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, zje zjeVar) {
        hlu hluVar;
        Map jo20Var;
        r040 r040Var;
        Object objA;
        List list2;
        Map map;
        Map map2;
        r040 r040Var2;
        Object objA2;
        r040 r040Var3;
        Object obj;
        Map map3;
        r040 r040Var4;
        Object objZ;
        r040 r040Var5;
        Object obj2;
        Map map4;
        r040 r040Var6;
        Object objR;
        Map map5;
        List list3;
        r040 r040Var7;
        Object obj3;
        Map map6;
        r040 r040Var8;
        Object objJ;
        r040 r040Var9;
        Map map7;
        Object obj4;
        Map map8;
        r040 r040Var10;
        Object objJ2;
        Map map9;
        Map map10;
        if (zjeVar instanceof hlu) {
            hluVar = (hlu) zjeVar;
            int i = hluVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                hluVar.p = i - Integer.MIN_VALUE;
            } else {
                hluVar = new hlu(this, zjeVar);
            }
        } else {
            hluVar = new hlu(this, zjeVar);
        }
        Object obj5 = hluVar.n;
        wne wneVar = wne.f39444a;
        byte b = 2;
        byte b2 = 1;
        yje yjeVar = null;
        switch (hluVar.p) {
            case 0:
                z1x.P(obj5);
                jo20Var = new jo20();
                r040Var = r040.SPORTS;
                hluVar.i = list;
                hluVar.j = jo20Var;
                hluVar.k = jo20Var;
                hluVar.l = r040Var;
                hluVar.m = jo20Var;
                hluVar.p = 1;
                objA = this.c.a(hluVar);
                if (objA != wneVar) {
                    list2 = list;
                    map = jo20Var;
                    map2 = map;
                    map.put(r040Var, objA);
                    r040Var2 = r040.SINGLE_SPORTS;
                    hluVar.i = list2;
                    hluVar.j = map2;
                    Map map11 = jo20Var;
                    hluVar.k = map11;
                    hluVar.l = r040Var2;
                    hluVar.m = map11;
                    hluVar.p = 2;
                    objA2 = this.d.a(hluVar);
                    if (objA2 != wneVar) {
                        r040Var3 = r040Var2;
                        obj = objA2;
                        map3 = jo20Var;
                        map3.put(r040Var3, obj);
                        r040Var4 = r040.AGGREGATOR;
                        hluVar.i = list2;
                        hluVar.j = map2;
                        Map map12 = jo20Var;
                        hluVar.k = map12;
                        hluVar.l = r040Var4;
                        hluVar.m = map12;
                        hluVar.p = 3;
                        objZ = this.e.z(hluVar);
                        if (objZ != wneVar) {
                            r040Var5 = r040Var4;
                            obj2 = objZ;
                            map4 = jo20Var;
                            map4.put(r040Var5, obj2);
                            jo20Var.put(r040.SINGLE_AGGREGATOR, this.f.F());
                            r040Var6 = r040.VIRTUAL;
                            hluVar.i = list2;
                            hluVar.j = map2;
                            Map map13 = jo20Var;
                            hluVar.k = map13;
                            hluVar.l = r040Var6;
                            hluVar.m = map13;
                            hluVar.p = 4;
                            objR = this.g.r(hluVar);
                            if (objR != wneVar) {
                                List list4 = list2;
                                map5 = map2;
                                list3 = list4;
                                r040Var7 = r040Var6;
                                obj3 = objR;
                                map6 = jo20Var;
                                map6.put(r040Var7, obj3);
                                r040Var8 = r040.GAMES;
                                hluVar.i = list3;
                                hluVar.j = map5;
                                Map map14 = jo20Var;
                                hluVar.k = map14;
                                hluVar.l = r040Var8;
                                hluVar.m = map14;
                                hluVar.p = 5;
                                objJ = d5c.J(hluVar, new u5u(this.h, list3, yjeVar, b));
                                if (objJ != wneVar) {
                                    r040Var9 = r040Var8;
                                    map7 = map5;
                                    obj4 = objJ;
                                    map8 = jo20Var;
                                    map8.put(r040Var9, obj4);
                                    r040Var10 = r040.SINGLE_GAMES;
                                    hluVar.i = null;
                                    hluVar.j = map7;
                                    hluVar.k = null;
                                    hluVar.l = r040Var10;
                                    hluVar.m = jo20Var;
                                    hluVar.p = 6;
                                    objJ2 = d5c.J(hluVar, new u5u(this.i, list3, yjeVar, b2));
                                    if (objJ2 != wneVar) {
                                        Map map15 = jo20Var;
                                        obj5 = objJ2;
                                        map9 = map15;
                                        map10 = map7;
                                        map9.put(r040Var10, obj5);
                                        map10.getClass();
                                        return ((jo20) map10).b();
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 1:
                map = hluVar.m;
                r040Var = hluVar.l;
                Map map16 = hluVar.k;
                map2 = hluVar.j;
                list2 = hluVar.i;
                z1x.P(obj5);
                objA = obj5;
                jo20Var = map16;
                map.put(r040Var, objA);
                r040Var2 = r040.SINGLE_SPORTS;
                hluVar.i = list2;
                hluVar.j = map2;
                Map map17 = jo20Var;
                hluVar.k = map17;
                hluVar.l = r040Var2;
                hluVar.m = map17;
                hluVar.p = 2;
                objA2 = this.d.a(hluVar);
                if (objA2 != wneVar) {
                    r040Var3 = r040Var2;
                    obj = objA2;
                    map3 = jo20Var;
                    map3.put(r040Var3, obj);
                    r040Var4 = r040.AGGREGATOR;
                    hluVar.i = list2;
                    hluVar.j = map2;
                    Map map18 = jo20Var;
                    hluVar.k = map18;
                    hluVar.l = r040Var4;
                    hluVar.m = map18;
                    hluVar.p = 3;
                    objZ = this.e.z(hluVar);
                    if (objZ != wneVar) {
                        r040Var5 = r040Var4;
                        obj2 = objZ;
                        map4 = jo20Var;
                        map4.put(r040Var5, obj2);
                        jo20Var.put(r040.SINGLE_AGGREGATOR, this.f.F());
                        r040Var6 = r040.VIRTUAL;
                        hluVar.i = list2;
                        hluVar.j = map2;
                        Map map19 = jo20Var;
                        hluVar.k = map19;
                        hluVar.l = r040Var6;
                        hluVar.m = map19;
                        hluVar.p = 4;
                        objR = this.g.r(hluVar);
                        if (objR != wneVar) {
                            List list5 = list2;
                            map5 = map2;
                            list3 = list5;
                            r040Var7 = r040Var6;
                            obj3 = objR;
                            map6 = jo20Var;
                            map6.put(r040Var7, obj3);
                            r040Var8 = r040.GAMES;
                            hluVar.i = list3;
                            hluVar.j = map5;
                            Map map110 = jo20Var;
                            hluVar.k = map110;
                            hluVar.l = r040Var8;
                            hluVar.m = map110;
                            hluVar.p = 5;
                            objJ = d5c.J(hluVar, new u5u(this.h, list3, yjeVar, b));
                            if (objJ != wneVar) {
                                r040Var9 = r040Var8;
                                map7 = map5;
                                obj4 = objJ;
                                map8 = jo20Var;
                                map8.put(r040Var9, obj4);
                                r040Var10 = r040.SINGLE_GAMES;
                                hluVar.i = null;
                                hluVar.j = map7;
                                hluVar.k = null;
                                hluVar.l = r040Var10;
                                hluVar.m = jo20Var;
                                hluVar.p = 6;
                                objJ2 = d5c.J(hluVar, new u5u(this.i, list3, yjeVar, b2));
                                if (objJ2 != wneVar) {
                                    Map map111 = jo20Var;
                                    obj5 = objJ2;
                                    map9 = map111;
                                    map10 = map7;
                                    map9.put(r040Var10, obj5);
                                    map10.getClass();
                                    return ((jo20) map10).b();
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 2:
                map3 = hluVar.m;
                r040 r040Var11 = hluVar.l;
                Map map20 = hluVar.k;
                map2 = hluVar.j;
                list2 = hluVar.i;
                z1x.P(obj5);
                obj = obj5;
                jo20Var = map20;
                r040Var3 = r040Var11;
                map3.put(r040Var3, obj);
                r040Var4 = r040.AGGREGATOR;
                hluVar.i = list2;
                hluVar.j = map2;
                Map map112 = jo20Var;
                hluVar.k = map112;
                hluVar.l = r040Var4;
                hluVar.m = map112;
                hluVar.p = 3;
                objZ = this.e.z(hluVar);
                if (objZ != wneVar) {
                    r040Var5 = r040Var4;
                    obj2 = objZ;
                    map4 = jo20Var;
                    map4.put(r040Var5, obj2);
                    jo20Var.put(r040.SINGLE_AGGREGATOR, this.f.F());
                    r040Var6 = r040.VIRTUAL;
                    hluVar.i = list2;
                    hluVar.j = map2;
                    Map map113 = jo20Var;
                    hluVar.k = map113;
                    hluVar.l = r040Var6;
                    hluVar.m = map113;
                    hluVar.p = 4;
                    objR = this.g.r(hluVar);
                    if (objR != wneVar) {
                        List list6 = list2;
                        map5 = map2;
                        list3 = list6;
                        r040Var7 = r040Var6;
                        obj3 = objR;
                        map6 = jo20Var;
                        map6.put(r040Var7, obj3);
                        r040Var8 = r040.GAMES;
                        hluVar.i = list3;
                        hluVar.j = map5;
                        Map map114 = jo20Var;
                        hluVar.k = map114;
                        hluVar.l = r040Var8;
                        hluVar.m = map114;
                        hluVar.p = 5;
                        objJ = d5c.J(hluVar, new u5u(this.h, list3, yjeVar, b));
                        if (objJ != wneVar) {
                            r040Var9 = r040Var8;
                            map7 = map5;
                            obj4 = objJ;
                            map8 = jo20Var;
                            map8.put(r040Var9, obj4);
                            r040Var10 = r040.SINGLE_GAMES;
                            hluVar.i = null;
                            hluVar.j = map7;
                            hluVar.k = null;
                            hluVar.l = r040Var10;
                            hluVar.m = jo20Var;
                            hluVar.p = 6;
                            objJ2 = d5c.J(hluVar, new u5u(this.i, list3, yjeVar, b2));
                            if (objJ2 != wneVar) {
                                Map map115 = jo20Var;
                                obj5 = objJ2;
                                map9 = map115;
                                map10 = map7;
                                map9.put(r040Var10, obj5);
                                map10.getClass();
                                return ((jo20) map10).b();
                            }
                        }
                    }
                }
                return wneVar;
            case 3:
                map4 = hluVar.m;
                r040 r040Var12 = hluVar.l;
                Map map21 = hluVar.k;
                map2 = hluVar.j;
                list2 = hluVar.i;
                z1x.P(obj5);
                obj2 = obj5;
                jo20Var = map21;
                r040Var5 = r040Var12;
                map4.put(r040Var5, obj2);
                jo20Var.put(r040.SINGLE_AGGREGATOR, this.f.F());
                r040Var6 = r040.VIRTUAL;
                hluVar.i = list2;
                hluVar.j = map2;
                Map map116 = jo20Var;
                hluVar.k = map116;
                hluVar.l = r040Var6;
                hluVar.m = map116;
                hluVar.p = 4;
                objR = this.g.r(hluVar);
                if (objR != wneVar) {
                    List list7 = list2;
                    map5 = map2;
                    list3 = list7;
                    r040Var7 = r040Var6;
                    obj3 = objR;
                    map6 = jo20Var;
                    map6.put(r040Var7, obj3);
                    r040Var8 = r040.GAMES;
                    hluVar.i = list3;
                    hluVar.j = map5;
                    Map map117 = jo20Var;
                    hluVar.k = map117;
                    hluVar.l = r040Var8;
                    hluVar.m = map117;
                    hluVar.p = 5;
                    objJ = d5c.J(hluVar, new u5u(this.h, list3, yjeVar, b));
                    if (objJ != wneVar) {
                        r040Var9 = r040Var8;
                        map7 = map5;
                        obj4 = objJ;
                        map8 = jo20Var;
                        map8.put(r040Var9, obj4);
                        r040Var10 = r040.SINGLE_GAMES;
                        hluVar.i = null;
                        hluVar.j = map7;
                        hluVar.k = null;
                        hluVar.l = r040Var10;
                        hluVar.m = jo20Var;
                        hluVar.p = 6;
                        objJ2 = d5c.J(hluVar, new u5u(this.i, list3, yjeVar, b2));
                        if (objJ2 != wneVar) {
                            Map map118 = jo20Var;
                            obj5 = objJ2;
                            map9 = map118;
                            map10 = map7;
                            map9.put(r040Var10, obj5);
                            map10.getClass();
                            return ((jo20) map10).b();
                        }
                    }
                }
                return wneVar;
            case 4:
                map6 = hluVar.m;
                r040 r040Var13 = hluVar.l;
                Map map22 = hluVar.k;
                Map map23 = hluVar.j;
                List list8 = hluVar.i;
                z1x.P(obj5);
                obj3 = obj5;
                jo20Var = map22;
                r040Var7 = r040Var13;
                map5 = map23;
                list3 = list8;
                map6.put(r040Var7, obj3);
                r040Var8 = r040.GAMES;
                hluVar.i = list3;
                hluVar.j = map5;
                Map map119 = jo20Var;
                hluVar.k = map119;
                hluVar.l = r040Var8;
                hluVar.m = map119;
                hluVar.p = 5;
                objJ = d5c.J(hluVar, new u5u(this.h, list3, yjeVar, b));
                if (objJ != wneVar) {
                    r040Var9 = r040Var8;
                    map7 = map5;
                    obj4 = objJ;
                    map8 = jo20Var;
                    map8.put(r040Var9, obj4);
                    r040Var10 = r040.SINGLE_GAMES;
                    hluVar.i = null;
                    hluVar.j = map7;
                    hluVar.k = null;
                    hluVar.l = r040Var10;
                    hluVar.m = jo20Var;
                    hluVar.p = 6;
                    objJ2 = d5c.J(hluVar, new u5u(this.i, list3, yjeVar, b2));
                    if (objJ2 != wneVar) {
                        Map map1110 = jo20Var;
                        obj5 = objJ2;
                        map9 = map1110;
                        map10 = map7;
                        map9.put(r040Var10, obj5);
                        map10.getClass();
                        return ((jo20) map10).b();
                    }
                }
                return wneVar;
            case 5:
                map8 = hluVar.m;
                r040 r040Var14 = hluVar.l;
                Map map24 = hluVar.k;
                map7 = hluVar.j;
                list3 = hluVar.i;
                z1x.P(obj5);
                obj4 = obj5;
                jo20Var = map24;
                r040Var9 = r040Var14;
                map8.put(r040Var9, obj4);
                r040Var10 = r040.SINGLE_GAMES;
                hluVar.i = null;
                hluVar.j = map7;
                hluVar.k = null;
                hluVar.l = r040Var10;
                hluVar.m = jo20Var;
                hluVar.p = 6;
                objJ2 = d5c.J(hluVar, new u5u(this.i, list3, yjeVar, b2));
                if (objJ2 != wneVar) {
                    Map map1111 = jo20Var;
                    obj5 = objJ2;
                    map9 = map1111;
                    map10 = map7;
                    map9.put(r040Var10, obj5);
                    map10.getClass();
                    return ((jo20) map10).b();
                }
                return wneVar;
            case 6:
                map9 = hluVar.m;
                r040Var10 = hluVar.l;
                Map map25 = hluVar.k;
                map10 = hluVar.j;
                z1x.P(obj5);
                map9.put(r040Var10, obj5);
                map10.getClass();
                return ((jo20) map10).b();
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:29:0x010f A[PHI: r2 r6 r7 r12
  0x010f: PHI (r2v11 java.util.Map) = (r2v8 java.util.Map), (r2v14 java.util.Map) binds: [B:27:0x010b, B:15:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r6v9 java.util.List) = (r6v5 java.util.List), (r6v10 java.util.List) binds: [B:27:0x010b, B:15:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r7v10 java.util.Map) = (r7v7 java.util.Map), (r7v12 java.util.Map) binds: [B:27:0x010b, B:15:0x006f] A[DONT_GENERATE, DONT_INLINE]
  0x010f: PHI (r12v11 java.lang.Object) = (r12v10 java.lang.Object), (r12v1 java.lang.Object) binds: [B:27:0x010b, B:15:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x013e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(List list, zje zjeVar) {
        ilu iluVar;
        Map map;
        Map map2;
        Collection collection;
        Object objA;
        List list2;
        Collection collection2;
        Map map3;
        r040 r040Var;
        Map map4;
        Map map5;
        List list3;
        Map map6;
        Map map7;
        Collection collection3;
        Object objJ;
        Collection collection4;
        Map map8;
        if (zjeVar instanceof ilu) {
            iluVar = (ilu) zjeVar;
            int i = iluVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                iluVar.p = i - Integer.MIN_VALUE;
            } else {
                iluVar = new ilu(this, zjeVar);
            }
        } else {
            iluVar = new ilu(this, zjeVar);
        }
        Object objZ = iluVar.n;
        wne wneVar = wne.f39444a;
        byte b = 2;
        byte b2 = 1;
        yje yjeVar = null;
        switch (iluVar.p) {
            case 0:
                z1x.P(objZ);
                jo20 jo20Var = new jo20();
                iluVar.i = list;
                iluVar.j = jo20Var;
                iluVar.k = jo20Var;
                iluVar.p = 1;
                Object objA2 = this.c.a(iluVar);
                if (objA2 != wneVar) {
                    map = jo20Var;
                    objZ = objA2;
                    map2 = map;
                    collection = (Collection) objZ;
                    iluVar.i = list;
                    iluVar.j = map;
                    iluVar.k = map2;
                    iluVar.l = collection;
                    iluVar.p = 2;
                    objA = this.d.a(iluVar);
                    if (objA != wneVar) {
                        Map map9 = map;
                        list2 = list;
                        collection2 = collection;
                        objZ = objA;
                        map3 = map9;
                        map2.put(r040.SPORTS, CollectionsKt.q0(collection2, (Iterable) objZ));
                        iluVar.i = list2;
                        iluVar.j = map3;
                        iluVar.k = map2;
                        iluVar.l = null;
                        iluVar.p = 3;
                        objZ = this.e.z(iluVar);
                        if (objZ != wneVar) {
                            map2.put(r040.AGGREGATOR, CollectionsKt.q0((Collection) objZ, this.f.F()));
                            r040Var = r040.VIRTUAL;
                            iluVar.i = list2;
                            iluVar.j = map3;
                            iluVar.k = map2;
                            iluVar.l = map2;
                            iluVar.m = r040Var;
                            iluVar.p = 4;
                            objZ = this.g.r(iluVar);
                            if (objZ != wneVar) {
                                map4 = map3;
                                map5 = map2;
                                map2.put(r040Var, objZ);
                                iluVar.i = list2;
                                iluVar.j = map4;
                                iluVar.k = map5;
                                iluVar.l = null;
                                iluVar.m = null;
                                iluVar.p = 5;
                                objZ = d5c.J(iluVar, new u5u(this.h, list2, yjeVar, b));
                                if (objZ != wneVar) {
                                    list3 = list2;
                                    map6 = map5;
                                    map7 = map4;
                                    collection3 = (Collection) objZ;
                                    iluVar.i = null;
                                    iluVar.j = map7;
                                    iluVar.k = map6;
                                    iluVar.l = collection3;
                                    iluVar.m = null;
                                    iluVar.p = 6;
                                    objJ = d5c.J(iluVar, new u5u(this.i, list3, yjeVar, b2));
                                    if (objJ != wneVar) {
                                        objZ = objJ;
                                        collection4 = collection3;
                                        map8 = map7;
                                        map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                                        map8.getClass();
                                        return ((jo20) map8).b();
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 1:
                Map map10 = iluVar.k;
                Map map11 = iluVar.j;
                List list4 = iluVar.i;
                z1x.P(objZ);
                map2 = map10;
                list = list4;
                map = map11;
                collection = (Collection) objZ;
                iluVar.i = list;
                iluVar.j = map;
                iluVar.k = map2;
                iluVar.l = collection;
                iluVar.p = 2;
                objA = this.d.a(iluVar);
                if (objA != wneVar) {
                    Map map12 = map;
                    list2 = list;
                    collection2 = collection;
                    objZ = objA;
                    map3 = map12;
                    map2.put(r040.SPORTS, CollectionsKt.q0(collection2, (Iterable) objZ));
                    iluVar.i = list2;
                    iluVar.j = map3;
                    iluVar.k = map2;
                    iluVar.l = null;
                    iluVar.p = 3;
                    objZ = this.e.z(iluVar);
                    if (objZ != wneVar) {
                        map2.put(r040.AGGREGATOR, CollectionsKt.q0((Collection) objZ, this.f.F()));
                        r040Var = r040.VIRTUAL;
                        iluVar.i = list2;
                        iluVar.j = map3;
                        iluVar.k = map2;
                        iluVar.l = map2;
                        iluVar.m = r040Var;
                        iluVar.p = 4;
                        objZ = this.g.r(iluVar);
                        if (objZ != wneVar) {
                            map4 = map3;
                            map5 = map2;
                            map2.put(r040Var, objZ);
                            iluVar.i = list2;
                            iluVar.j = map4;
                            iluVar.k = map5;
                            iluVar.l = null;
                            iluVar.m = null;
                            iluVar.p = 5;
                            objZ = d5c.J(iluVar, new u5u(this.h, list2, yjeVar, b));
                            if (objZ != wneVar) {
                                list3 = list2;
                                map6 = map5;
                                map7 = map4;
                                collection3 = (Collection) objZ;
                                iluVar.i = null;
                                iluVar.j = map7;
                                iluVar.k = map6;
                                iluVar.l = collection3;
                                iluVar.m = null;
                                iluVar.p = 6;
                                objJ = d5c.J(iluVar, new u5u(this.i, list3, yjeVar, b2));
                                if (objJ != wneVar) {
                                    objZ = objJ;
                                    collection4 = collection3;
                                    map8 = map7;
                                    map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                                    map8.getClass();
                                    return ((jo20) map8).b();
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 2:
                collection2 = (Collection) iluVar.l;
                map2 = iluVar.k;
                Map map13 = iluVar.j;
                List list5 = iluVar.i;
                z1x.P(objZ);
                map3 = map13;
                list2 = list5;
                map2.put(r040.SPORTS, CollectionsKt.q0(collection2, (Iterable) objZ));
                iluVar.i = list2;
                iluVar.j = map3;
                iluVar.k = map2;
                iluVar.l = null;
                iluVar.p = 3;
                objZ = this.e.z(iluVar);
                if (objZ != wneVar) {
                    map2.put(r040.AGGREGATOR, CollectionsKt.q0((Collection) objZ, this.f.F()));
                    r040Var = r040.VIRTUAL;
                    iluVar.i = list2;
                    iluVar.j = map3;
                    iluVar.k = map2;
                    iluVar.l = map2;
                    iluVar.m = r040Var;
                    iluVar.p = 4;
                    objZ = this.g.r(iluVar);
                    if (objZ != wneVar) {
                        map4 = map3;
                        map5 = map2;
                        map2.put(r040Var, objZ);
                        iluVar.i = list2;
                        iluVar.j = map4;
                        iluVar.k = map5;
                        iluVar.l = null;
                        iluVar.m = null;
                        iluVar.p = 5;
                        objZ = d5c.J(iluVar, new u5u(this.h, list2, yjeVar, b));
                        if (objZ != wneVar) {
                            list3 = list2;
                            map6 = map5;
                            map7 = map4;
                            collection3 = (Collection) objZ;
                            iluVar.i = null;
                            iluVar.j = map7;
                            iluVar.k = map6;
                            iluVar.l = collection3;
                            iluVar.m = null;
                            iluVar.p = 6;
                            objJ = d5c.J(iluVar, new u5u(this.i, list3, yjeVar, b2));
                            if (objJ != wneVar) {
                                objZ = objJ;
                                collection4 = collection3;
                                map8 = map7;
                                map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                                map8.getClass();
                                return ((jo20) map8).b();
                            }
                        }
                    }
                }
                return wneVar;
            case 3:
                Map map14 = iluVar.k;
                Map map15 = iluVar.j;
                list2 = iluVar.i;
                z1x.P(objZ);
                map3 = map15;
                map2 = map14;
                map2.put(r040.AGGREGATOR, CollectionsKt.q0((Collection) objZ, this.f.F()));
                r040Var = r040.VIRTUAL;
                iluVar.i = list2;
                iluVar.j = map3;
                iluVar.k = map2;
                iluVar.l = map2;
                iluVar.m = r040Var;
                iluVar.p = 4;
                objZ = this.g.r(iluVar);
                if (objZ != wneVar) {
                    map4 = map3;
                    map5 = map2;
                    map2.put(r040Var, objZ);
                    iluVar.i = list2;
                    iluVar.j = map4;
                    iluVar.k = map5;
                    iluVar.l = null;
                    iluVar.m = null;
                    iluVar.p = 5;
                    objZ = d5c.J(iluVar, new u5u(this.h, list2, yjeVar, b));
                    if (objZ != wneVar) {
                        list3 = list2;
                        map6 = map5;
                        map7 = map4;
                        collection3 = (Collection) objZ;
                        iluVar.i = null;
                        iluVar.j = map7;
                        iluVar.k = map6;
                        iluVar.l = collection3;
                        iluVar.m = null;
                        iluVar.p = 6;
                        objJ = d5c.J(iluVar, new u5u(this.i, list3, yjeVar, b2));
                        if (objJ != wneVar) {
                            objZ = objJ;
                            collection4 = collection3;
                            map8 = map7;
                            map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                            map8.getClass();
                            return ((jo20) map8).b();
                        }
                    }
                }
                return wneVar;
            case 4:
                r040Var = iluVar.m;
                map2 = (Map) iluVar.l;
                Map map16 = iluVar.k;
                Map map17 = iluVar.j;
                List list6 = iluVar.i;
                z1x.P(objZ);
                map5 = map16;
                list2 = list6;
                map4 = map17;
                map2.put(r040Var, objZ);
                iluVar.i = list2;
                iluVar.j = map4;
                iluVar.k = map5;
                iluVar.l = null;
                iluVar.m = null;
                iluVar.p = 5;
                objZ = d5c.J(iluVar, new u5u(this.h, list2, yjeVar, b));
                if (objZ != wneVar) {
                    list3 = list2;
                    map6 = map5;
                    map7 = map4;
                    collection3 = (Collection) objZ;
                    iluVar.i = null;
                    iluVar.j = map7;
                    iluVar.k = map6;
                    iluVar.l = collection3;
                    iluVar.m = null;
                    iluVar.p = 6;
                    objJ = d5c.J(iluVar, new u5u(this.i, list3, yjeVar, b2));
                    if (objJ != wneVar) {
                        objZ = objJ;
                        collection4 = collection3;
                        map8 = map7;
                        map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                        map8.getClass();
                        return ((jo20) map8).b();
                    }
                }
                return wneVar;
            case 5:
                map6 = iluVar.k;
                map7 = iluVar.j;
                list3 = iluVar.i;
                z1x.P(objZ);
                collection3 = (Collection) objZ;
                iluVar.i = null;
                iluVar.j = map7;
                iluVar.k = map6;
                iluVar.l = collection3;
                iluVar.m = null;
                iluVar.p = 6;
                objJ = d5c.J(iluVar, new u5u(this.i, list3, yjeVar, b2));
                if (objJ != wneVar) {
                    objZ = objJ;
                    collection4 = collection3;
                    map8 = map7;
                    map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                    map8.getClass();
                    return ((jo20) map8).b();
                }
                return wneVar;
            case 6:
                collection4 = (Collection) iluVar.l;
                map6 = iluVar.k;
                map8 = iluVar.j;
                z1x.P(objZ);
                map6.put(r040.GAMES, CollectionsKt.q0(collection4, (Iterable) objZ));
                map8.getClass();
                return ((jo20) map8).b();
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(zje zjeVar) {
        jlu jluVar;
        Serializable g0g0Var;
        if (zjeVar instanceof jlu) {
            jluVar = (jlu) zjeVar;
            int i = jluVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jluVar.k = i - Integer.MIN_VALUE;
            } else {
                jluVar = new jlu(this, zjeVar);
            }
        } else {
            jluVar = new jlu(this, zjeVar);
        }
        Object objE = jluVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jluVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objE);
                e0g0 e0g0Var = j0g0.b;
                ieu ieuVar = this.m;
                jluVar.k = 1;
                objE = ieuVar.e(jluVar);
                if (objE == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objE);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objE) {
                mz60 mz60Var = (mz60) obj;
                if (x1x.D(mz60Var.b) != s470.LUCKY_WHEEL.a() && mz60Var.f) {
                    arrayList.add(obj);
                }
            }
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = arrayList;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x016f  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r0 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r0 == r3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nlu.d(boolean, a.zje):java.lang.Object");
    }
}
