package a;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u0 {
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cgx0 f34829a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (x83 x83Var : x83.values()) {
            String str = x83Var.f40444a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, x83Var);
            }
        }
        c = linkedHashMap;
    }

    public u0(cgx0 cgx0Var) {
        this.f34829a = cgx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:72:0x0137  */
    public static jay b(u0 u0Var, jay jayVar, Iterable iterable) {
        boolean z;
        boolean z2;
        t8y t8yVar;
        zlf0 zlf0VarK;
        t8y t8yVar2;
        Object objC;
        Object next;
        Pair pair;
        lov0 lov0VarJ;
        u0Var.getClass();
        iterable.getClass();
        cgx0 cgx0Var = u0Var.f34829a;
        boolean z3 = cgx0Var.b;
        if (!z3) {
            ArrayList<t8y> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                z = false;
                t8y t8yVar3 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (z3 || (t8yVar = (t8y) u8y.e.get(u0Var.d(next2))) == null) {
                    t8yVar2 = null;
                } else {
                    swq swqVarD = u0Var.d(next2);
                    if (swqVarD == null || !u8y.c.containsKey(swqVarD)) {
                        zlf0VarK = u0Var.k(next2);
                        if (zlf0VarK == null) {
                            zlf0VarK = ((ydy) cgx0Var.c).f42462a;
                        }
                    } else {
                        zlf0VarK = (zlf0) ((w0) cgx0Var.d).invoke(swqVarD);
                    }
                    if (zlf0VarK == zlf0.IGNORE) {
                        zlf0VarK = null;
                    }
                    if (zlf0VarK == null) {
                        t8yVar2 = null;
                    } else {
                        lov0 lov0VarA = lov0.a(t8yVar.f33535a, null, zlf0VarK.a(), 1);
                        Collection collection = t8yVar.b;
                        boolean z4 = t8yVar.c;
                        boolean z5 = t8yVar.d;
                        boolean z6 = t8yVar.e;
                        collection.getClass();
                        t8yVar2 = new t8y(lov0VarA, collection, z4, z5, z6);
                    }
                }
                if (t8yVar2 != null) {
                    t8yVar3 = t8yVar2;
                } else {
                    if (((ydy) cgx0Var.c).d || (objC = u0Var.c(next2, cey.f)) == null) {
                        pair = null;
                    } else {
                        Iterator it2 = u0Var.f(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (u0Var.l(next) == null);
                        if (next == null) {
                            pair = null;
                        } else {
                            Iterable iterableA = u0Var.a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = iterableA.iterator();
                            while (it3.hasNext()) {
                                x83 x83Var = (x83) c.get((String) it3.next());
                                if (x83Var != null) {
                                    linkedHashSet.add(x83Var);
                                }
                            }
                            if (linkedHashSet.contains(x83.TYPE_USE)) {
                                linkedHashSet = eui0.g(eui0.e(tx3.l0(x83.values()), x83.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            pair = new Pair(next, linkedHashSet);
                        }
                    }
                    if (pair != null) {
                        Object obj = pair.f46059a;
                        Set set = (Set) pair.b;
                        zlf0 zlf0VarK2 = u0Var.k(next2);
                        if (zlf0VarK2 == null && (zlf0VarK2 = u0Var.k(obj)) == null) {
                            zlf0VarK2 = ((ydy) cgx0Var.c).f42462a;
                        }
                        zlf0 zlf0Var = zlf0.IGNORE;
                        if (zlf0VarK2 != zlf0Var) {
                            obj.getClass();
                            lov0 lov0VarJ2 = u0Var.j(obj, false);
                            if (lov0VarJ2 == null) {
                                Object objL = u0Var.l(obj);
                                if (objL != null) {
                                    zlf0 zlf0VarK3 = u0Var.k(obj);
                                    if (zlf0VarK3 == null) {
                                        zlf0VarK3 = ((ydy) cgx0Var.c).f42462a;
                                    }
                                    if (zlf0VarK3 == zlf0Var || (lov0VarJ = u0Var.j(objL, false)) == null) {
                                        lov0VarJ2 = null;
                                    } else {
                                        lov0VarJ2 = lov0.a(lov0VarJ, null, zlf0VarK3.a(), 1);
                                    }
                                } else {
                                    lov0VarJ2 = null;
                                }
                            }
                            if (lov0VarJ2 != null) {
                                t8yVar3 = new t8y(lov0.a(lov0VarJ2, null, zlf0VarK2.a(), 1), set, 28);
                            }
                        }
                    }
                }
                if (t8yVar3 != null) {
                    arrayList.add(t8yVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(x83.class);
                for (t8y t8yVar4 : arrayList) {
                    for (x83 x83Var2 : t8yVar4.b) {
                        if (enumMap.containsKey(x83Var2) && u0Var.h()) {
                            t8y t8yVar5 = (t8y) enumMap.get(x83Var2);
                            if (t8yVar5 != null) {
                                lov0 lov0Var = t8yVar5.f33535a;
                                lov0 lov0Var2 = t8yVar4.f33535a;
                                if (!Intrinsics.d(lov0Var2, lov0Var) && (!(z2 = lov0Var2.b) || lov0Var.b)) {
                                    t8yVar5 = (z2 || !lov0Var.b) ? null : t8yVar4;
                                }
                                enumMap.put(x83Var2, t8yVar5);
                            }
                        } else {
                            enumMap.put(x83Var2, t8yVar4);
                        }
                    }
                }
                EnumMap enumMap2 = jayVar != null ? new EnumMap(jayVar.f16212a) : new EnumMap(x83.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    x83 x83Var3 = (x83) entry.getKey();
                    t8y t8yVar6 = (t8y) entry.getValue();
                    if (t8yVar6 != null) {
                        enumMap2.put(x83Var3, t8yVar6);
                        z = true;
                    }
                }
                if (z) {
                    return new jay(enumMap2);
                }
            }
        }
        return jayVar;
    }

    public Iterable a(Object obj, boolean z) {
        ((Annotation) obj).getClass();
        throw new poe("Should not be called because kotlin-reflect doesn't support JSR-305 annotations.");
    }

    public final Object c(Object obj, swq swqVar) {
        for (Object obj2 : f(obj)) {
            if (Intrinsics.d(d(obj2), swqVar)) {
                return obj2;
            }
        }
        return null;
    }

    public swq d(Object obj) {
        t83 t83Var = (t83) obj;
        t83Var.getClass();
        return t83Var.d();
    }

    public Object e(Object obj) {
        t83 t83Var = (t83) obj;
        t83Var.getClass();
        wm40 wm40VarD = rek.d(t83Var);
        wm40VarD.getClass();
        return wm40VarD;
    }

    public Iterable f(Object obj) {
        g93 annotations;
        t83 t83Var = (t83) obj;
        t83Var.getClass();
        wm40 wm40VarD = rek.d(t83Var);
        return (wm40VarD == null || (annotations = wm40VarD.getAnnotations()) == null) ? iun.f15405a : annotations;
    }

    public final boolean g(Object obj, swq swqVar) {
        Iterable iterableF = f(obj);
        if ((iterableF instanceof Collection) && ((Collection) iterableF).isEmpty()) {
            return false;
        }
        Iterator it = iterableF.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(d(it.next()), swqVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return false;
    }

    public final boolean i(Object obj) {
        obj.getClass();
        Object objC = c(obj, i4m0.t);
        if (objC != null) {
            Iterable iterableA = a(objC, false);
            if (!(iterableA instanceof Collection) || !((Collection) iterableA).isEmpty()) {
                Iterator it = iterableA.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d((String) it.next(), "TYPE")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r5.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r5.equals("NEVER") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r5.equals("MAYBE") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r5 = a.p860.b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.lov0 j(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            a.swq r0 = r5.d(r6)
            r1 = 0
            if (r0 != 0) goto L9
            goto L96
        L9:
            a.cgx0 r2 = r5.f34829a
            java.lang.Object r2 = r2.d
            a.w0 r2 = (a.w0) r2
            java.lang.Object r2 = r2.invoke(r0)
            a.zlf0 r2 = (a.zlf0) r2
            r2.getClass()
            a.zlf0 r3 = a.zlf0.IGNORE
            if (r2 != r3) goto L1d
            return r1
        L1d:
            java.util.Set r3 = a.cey.k
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            a.p860 r5 = a.p860.c
            goto L87
        L29:
            java.util.Set r3 = a.cey.l
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L34
            a.p860 r5 = a.p860.b
            goto L87
        L34:
            java.util.Set r3 = a.cey.m
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L3f
            a.p860 r5 = a.p860.f26540a
            goto L87
        L3f:
            a.swq r3 = a.cey.g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L96
            java.lang.Iterable r5 = r5.a(r6, r4)
            java.lang.Object r5 = kotlin.collections.CollectionsKt.V(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L85
            int r6 = r5.hashCode()
            switch(r6) {
                case 73135176: goto L79;
                case 74175084: goto L70;
                case 433141802: goto L64;
                case 1933739535: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L96
        L5b:
            java.lang.String r6 = "ALWAYS"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L96
            goto L85
        L64:
            java.lang.String r6 = "UNKNOWN"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L6d
            goto L96
        L6d:
            a.p860 r5 = a.p860.f26540a
            goto L87
        L70:
            java.lang.String r6 = "NEVER"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L82
            goto L96
        L79:
            java.lang.String r6 = "MAYBE"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L82
            goto L96
        L82:
            a.p860 r5 = a.p860.b
            goto L87
        L85:
            a.p860 r5 = a.p860.c
        L87:
            a.lov0 r6 = new a.lov0
            boolean r0 = r2.a()
            if (r0 != 0) goto L91
            if (r7 == 0) goto L92
        L91:
            r4 = 1
        L92:
            r6.<init>(r5, r4)
            return r6
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u0.j(java.lang.Object, boolean):a.lov0");
    }

    public final zlf0 k(Object obj) {
        Iterable iterableA;
        String str;
        ydy ydyVar = (ydy) this.f34829a.c;
        zlf0 zlf0Var = (zlf0) ydyVar.c.get(d(obj));
        if (zlf0Var != null) {
            return zlf0Var;
        }
        Object objC = c(obj, cey.q);
        if (objC == null || (iterableA = a(objC, false)) == null || (str = (String) CollectionsKt.V(iterableA)) == null) {
            return null;
        }
        zlf0 zlf0Var2 = ydyVar.b;
        if (zlf0Var2 != null) {
            return zlf0Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return zlf0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return zlf0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return zlf0.WARN;
        }
        return null;
    }

    public final Object l(Object obj) {
        Object objL;
        obj.getClass();
        if (!((ydy) this.f34829a.c).d) {
            if (CollectionsKt.L(cey.j, d(obj)) || g(obj, cey.d)) {
                return obj;
            }
            if (g(obj, cey.e)) {
                Object objE = e(obj);
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj2 = concurrentHashMap.get(objE);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = f(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objL = null;
                        break;
                    }
                    objL = l(it.next());
                } while (objL == null);
                if (objL != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objE, objL);
                    return objPutIfAbsent == null ? objL : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
