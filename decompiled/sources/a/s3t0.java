package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class s3t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f31576a = new LinkedHashMap();
    public final p7m0 b;
    public final p7m0 c;
    public final p7m0 d;
    public final List e;
    public final ol60 f;

    public s3t0() {
        iun iunVar = iun.f15405a;
        this.b = q7m0.a(new o4g(iunVar, iunVar));
        this.c = q7m0.a(b());
        this.d = q7m0.a(iunVar);
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -12);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(2, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (!calendar.after(calendar2)) {
            int i = calendar.get(1);
            int i2 = calendar.get(2) + 1;
            Integer numValueOf = Integer.valueOf(i);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i2));
            calendar.add(2, 1);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new d5g(((Number) entry.getKey()).intValue(), CollectionsKt.z0((List) entry.getValue())));
        }
        this.e = kotlin.collections.a.c(new k4g(189L, 0L, CollectionsKt.A0(arrayList2, new tgo0((byte) 24))));
        this.f = new ol60(3);
    }

    public static c5g b() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(new Date().getTime());
        return new c5g(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(5), yag.f42295a, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.r3t0
            if (r0 == 0) goto L13
            r0 = r7
            a.r3t0 r0 = (a.r3t0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.r3t0 r0 = new a.r3t0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r7)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.z1x.P(r7)
            goto L4b
        L35:
            a.z1x.P(r7)
            java.util.LinkedHashMap r7 = r6.f31576a
            r7.clear()
            a.iun r7 = a.iun.f15405a
            r0.k = r5
            a.p7m0 r2 = r6.d
            r2.n(r7)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            if (r7 != r1) goto L4b
            goto L5d
        L4b:
            a.c5g r7 = b()
            r0.k = r4
            a.p7m0 r0 = r6.c
            r0.getClass()
            r0.o(r3, r7)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            a.ol60 r6 = r6.f
            java.util.concurrent.LinkedBlockingDeque r7 = r6.d
            r7.clear()
            a.n0o0 r6 = r6.e
            java.lang.Object r6 = r6.getValue()
            java.util.concurrent.LinkedBlockingDeque r6 = (java.util.concurrent.LinkedBlockingDeque) r6
            r6.clear()
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s3t0.a(a.zje):java.lang.Object");
    }
}
