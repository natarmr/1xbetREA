package a;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nhq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nhq f23546a = new nhq();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static lhq a(jki0 jki0Var) {
        Map map = b;
        map.getClass();
        Object obj = map.get(jki0Var);
        if (obj != null) {
            return (lhq) obj;
        }
        udk.d(jki0Var, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:21:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(a.zje r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof a.mhq
            if (r0 == 0) goto L13
            r0 = r11
            a.mhq r0 = (a.mhq) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            a.mhq r0 = new a.mhq
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r10 = r0.n
            a.wne r11 = a.wne.f39444a
            int r1 = r0.p
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L36
            java.lang.Object r1 = r0.m
            java.util.Map r4 = r0.l
            java.util.Map r4 = (java.util.Map) r4
            a.jki0 r5 = r0.k
            java.util.Iterator r6 = r0.j
            java.util.Map r7 = r0.i
            java.util.Map r7 = (java.util.Map) r7
            a.z1x.P(r10)
            goto La0
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r2
        L3c:
            a.z1x.P(r10)
            java.util.Map r10 = a.nhq.b
            r10.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r10.size()
            int r4 = a.wp20.a(r4)
            r1.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r10
            r4 = r1
        L5d:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lb8
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r5 = r10.getKey()
            a.jki0 r5 = (a.jki0) r5
            java.lang.Object r10 = r10.getValue()
            a.lhq r10 = (a.lhq) r10
            a.yip r7 = new a.yip
            r8 = 11
            r7.<init>(r10, r8)
            r10 = r4
            java.util.Map r10 = (java.util.Map) r10
            r0.i = r10
            r0.j = r6
            r0.k = r5
            r0.l = r10
            r0.m = r1
            r0.p = r3
            kotlin.coroutines.g r10 = kotlin.coroutines.g.f46065a
            a.kaw r8 = new a.kaw
            r9 = 9
            r8.<init>(r7, r2, r9)
            java.lang.Object r10 = a.qjj.d0(r10, r8, r0)
            if (r10 != r11) goto L9f
            return r11
        L9f:
            r7 = r4
        La0:
            r5.getClass()
            a.lhq r10 = a(r5)
            a.a8f r10 = r10.b
            if (r10 == 0) goto Lb0
            r4.put(r1, r10)
            r4 = r7
            goto L5d
        Lb0:
            java.lang.String r10 = "Subscriber "
            java.lang.String r11 = " has not been registered."
            a.udk.d(r5, r11, r10)
            return r2
        Lb8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nhq.b(a.zje):java.lang.Object");
    }
}
