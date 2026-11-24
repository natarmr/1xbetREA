package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f4536a;

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r9 == r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r10, java.lang.String r11, long r12, a.zje r14) throws a.c44 {
        /*
            r9 = this;
            a.mii0 r0 = r9.f4536a
            java.lang.Object r1 = r0.d
            a.mne r1 = (a.mne) r1
            boolean r2 = r14 instanceof a.bl3
            if (r2 == 0) goto L19
            r2 = r14
            a.bl3 r2 = (a.bl3) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.m = r3
            goto L1e
        L19:
            a.bl3 r2 = new a.bl3
            r2.<init>(r9, r14)
        L1e:
            java.lang.Object r9 = r2.k
            a.wne r14 = a.wne.f39444a
            int r3 = r2.m
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L37
            if (r3 != r4) goto L31
            a.z1x.P(r9)
            goto L77
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r6
        L37:
            long r12 = r2.j
            java.lang.String r11 = r2.i
            a.z1x.P(r9)
            goto L56
        L3f:
            a.z1x.P(r9)
            r2.i = r11
            r2.j = r12
            r2.m = r5
            a.dvj r9 = r1.b
            a.tg3 r3 = new a.tg3
            r3.<init>(r0, r10, r11, r6)
            java.lang.Object r9 = a.qjj.d0(r9, r3, r2)
            if (r9 != r14) goto L56
            goto L76
        L56:
            a.yk3 r9 = (a.yk3) r9
            long r7 = r9.b
            int r10 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r10 > 0) goto L7a
            r2.i = r6
            r2.j = r12
            r2.m = r4
            a.dvj r10 = r1.b
            a.ee0 r12 = new a.ee0
            r12.<init>(r0, r11, r9, r6)
            java.lang.Object r9 = a.qjj.d0(r10, r12, r2)
            if (r9 != r14) goto L72
            goto L74
        L72:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L74:
            if (r9 != r14) goto L77
        L76:
            return r14
        L77:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        L7a:
            a.c44 r9 = new a.c44
            r10 = 8
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cl3.a(java.lang.String, java.lang.String, long, a.zje):java.lang.Object");
    }
}
