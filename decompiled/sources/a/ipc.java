package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ipc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oif0 f15155a;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r14.G(r2) == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(double r15, int r17, a.zje r18) {
        /*
            r14 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof a.rni0
            if (r2 == 0) goto L17
            r2 = r1
            a.rni0 r2 = (a.rni0) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.m = r3
            goto L1c
        L17:
            a.rni0 r2 = new a.rni0
            r2.<init>(r14, r1)
        L1c:
            java.lang.Object r1 = r2.k
            a.wne r3 = a.wne.f39444a
            int r4 = r2.m
            r5 = 2
            r6 = 1
            a.oif0 r14 = r14.f15155a
            if (r4 == 0) goto L40
            if (r4 == r6) goto L37
            if (r4 != r5) goto L30
            a.z1x.P(r1)
            goto L82
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            r14 = 0
            return r14
        L37:
            double r6 = r2.j
            int r0 = r2.i
            a.z1x.P(r1)
            r11 = r6
            goto L75
        L40:
            a.z1x.P(r1)
            java.util.List r1 = r14.n()
            java.lang.Object r4 = kotlin.collections.CollectionsKt.W(r0, r1)
            r7 = r4
            a.hf6 r7 = (a.hf6) r7
            if (r7 == 0) goto L82
            r10 = 0
            r13 = 23
            r8 = 0
            r9 = 0
            r11 = r15
            a.hf6 r4 = a.hf6.a(r7, r8, r9, r10, r11, r13)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.addAll(r1)
            r7.set(r0, r4)
            r14.I(r7)
            r2.i = r0
            r2.j = r11
            r2.m = r6
            java.lang.Object r1 = r14.F(r4, r2)
            if (r1 != r3) goto L75
            goto L81
        L75:
            r2.i = r0
            r2.j = r11
            r2.m = r5
            java.lang.Object r14 = r14.G(r2)
            if (r14 != r3) goto L82
        L81:
            return r3
        L82:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ipc.a(double, int, a.zje):java.lang.Object");
    }

    public Object b(zje zjeVar) {
        Object objE = this.f15155a.e(zjeVar);
        return objE == wne.f39444a ? objE : Unit.f46060a;
    }
}
