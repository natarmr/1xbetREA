package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.info.impl.navigation.InfoScreenFactoryImpl$getInfoScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class rqt {
    public static InfoScreenFactoryImpl$getInfoScreen$1 b(rqt rqtVar) {
        rqtVar.getClass();
        return new InfoScreenFactoryImpl$getInfoScreen$1("");
    }

    public static lrz c(String str) {
        str.getClass();
        lrz lrzVar = lrz.b;
        if (str.equals("ACTIVE")) {
            return lrzVar;
        }
        lrz lrzVar2 = lrz.c;
        if (str.equals("PENDING")) {
            return lrzVar2;
        }
        lrz lrzVar3 = lrz.d;
        str.equals("INACTIVE");
        return lrzVar3;
    }

    public static long d(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            qu6 qu6Var = (qu6) next;
            if (qu6Var.x == 707 && qu6Var.r != 0) {
                break;
            }
        }
        qu6 qu6Var2 = (qu6) next;
        if (qu6Var2 != null) {
            return qu6Var2.r;
        }
        return 0L;
    }

    public static tg20 e(xuf xufVar) {
        xufVar.getClass();
        double d = xufVar.m;
        if (d == 0.0d) {
            d = xufVar.i;
        }
        double d2 = xufVar.n;
        return new tg20(d, d2, !(d2 == 0.0d), !(d == 0.0d));
    }

    public static Integer f(f3c0 f3c0Var) {
        lc00 lc00VarB = kotlin.collections.a.b();
        if (f3c0Var.p) {
            lc00VarB.add(13);
        }
        if (f3c0Var.q) {
            lc00VarB.add(31);
        }
        if (f3c0Var.m) {
            lc00VarB.add(7);
        }
        if (f3c0Var.o) {
            lc00VarB.add(19);
        }
        if (f3c0Var.k) {
            lc00VarB.add(5);
        }
        if (f3c0Var.l) {
            lc00VarB.add(9);
        }
        if (f3c0Var.n) {
            lc00VarB.add(17);
        }
        if (f3c0Var.i) {
            lc00VarB.add(1);
        }
        if (f3c0Var.j) {
            lc00VarB.add(11);
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        if (lc00VarA.b() > 1) {
            return null;
        }
        return (Integer) CollectionsKt.firstOrNull(lc00VarA);
    }

    public static LinkedHashMap g(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xqr0) it.next()).f);
        }
        ArrayList arrayListR = r3d.r(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayListR) {
            Long lValueOf = Long.valueOf(((crr0) obj).d);
            Object arrayList2 = linkedHashMap.get(lValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        return linkedHashMap;
    }

    public static t3z h(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return t3z.e;
        }
        if (z2) {
            return t3z.d;
        }
        return z ? t3z.c : t3z.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r7 == r9) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.dgq] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.dgq r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.six
            if (r0 == 0) goto L13
            r0 = r9
            a.six r0 = (a.six) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.six r0 = new a.six
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.j
            a.wne r9 = a.wne.f39444a
            int r1 = r0.l
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            if (r1 == 0) goto L46
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L35
            java.lang.Object r8 = r0.i
            java.lang.String r8 = (java.lang.String) r8
            a.z1x.P(r7)     // Catch: java.lang.Exception -> L32
            goto L8b
        L32:
            r7 = move-exception
            goto L92
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L3c:
            java.lang.Object r8 = r0.i
            a.dgq r8 = (a.dgq) r8
            a.z1x.P(r7)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r7 = move-exception
            goto L70
        L46:
            a.z1x.P(r7)
            r7 = r8
            a.cgq r7 = (a.cgq) r7     // Catch: java.lang.Exception -> L44
            com.google.android.gms.tasks.Task r8 = r7.d()     // Catch: java.lang.Exception -> L44
            r8.getClass()     // Catch: java.lang.Exception -> L6c
            r0.i = r7     // Catch: java.lang.Exception -> L6c
            r0.l = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r8 = a.msm0.h(r8, r0)     // Catch: java.lang.Exception -> L6c
            if (r8 != r9) goto L5e
            goto L8a
        L5e:
            r6 = r8
            r8 = r7
            r7 = r6
        L61:
            a.d45 r7 = (a.d45) r7     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = r7.f5438a     // Catch: java.lang.Exception -> L44
            r7.getClass()     // Catch: java.lang.Exception -> L44
            r6 = r8
            r8 = r7
            r7 = r6
            goto L77
        L6c:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L70:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r2, r1, r7)
            r7 = r8
            r8 = r5
        L77:
            a.cgq r7 = (a.cgq) r7     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.Task r7 = r7.c()     // Catch: java.lang.Exception -> L32
            r7.getClass()     // Catch: java.lang.Exception -> L32
            r0.i = r8     // Catch: java.lang.Exception -> L32
            r0.l = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = a.msm0.h(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r9) goto L8b
        L8a:
            return r9
        L8b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            if (r7 != 0) goto L90
            goto L97
        L90:
            r5 = r7
            goto L97
        L92:
            java.lang.String r9 = "Error getting Firebase installation id ."
            android.util.Log.w(r2, r9, r7)
        L97:
            a.tix r7 = new a.tix
            r7.<init>(r5, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rqt.a(a.dgq, a.zje):java.lang.Object");
    }
}
