package a;

/* JADX INFO: loaded from: classes3.dex */
public final class evt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr00 f8489a;

    public oc5 a(ed5 ed5Var) {
        dd5 dd5VarQ = this.f8489a.q(ed5Var);
        if (dd5VarQ != null) {
            return new oc5(y860.i0(dd5VarQ.c), y860.i0(dd5VarQ.f), y860.i0(dd5VarQ.i), y860.i0(dd5VarQ.j), y860.i0(dd5VarQ.k));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r9 == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.ed5 r10, java.lang.String r11, a.zje r12) {
        /*
            r9 = this;
            a.gr00 r1 = r9.f8489a
            java.lang.Object r0 = r1.d
            r6 = r0
            a.mne r6 = (a.mne) r6
            boolean r0 = r12 instanceof a.zk00
            if (r0 == 0) goto L1b
            r0 = r12
            a.zk00 r0 = (a.zk00) r0
            int r2 = r0.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1b
            int r2 = r2 - r3
            r0.l = r2
        L19:
            r9 = r0
            goto L21
        L1b:
            a.zk00 r0 = new a.zk00
            r0.<init>(r9, r12)
            goto L19
        L21:
            java.lang.Object r12 = r9.j
            a.wne r7 = a.wne.f39444a
            int r0 = r9.l
            r8 = 2
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L42
            if (r0 == r2) goto L3b
            if (r0 != r8) goto L34
            a.z1x.P(r12)
            goto L77
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L3b:
            a.ed5 r10 = r9.i
            a.z1x.P(r12)
            r2 = r10
            goto L5b
        L42:
            a.z1x.P(r12)
            r9.i = r10
            r9.l = r2
            a.dvj r12 = r6.b
            a.ac4 r0 = new a.ac4
            r5 = 29
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r12 = a.qjj.d0(r12, r0, r9)
            if (r12 != r7) goto L5b
            goto L76
        L5b:
            r3 = r12
            a.dd5 r3 = (a.dd5) r3
            r9.i = r4
            r9.l = r8
            a.dvj r10 = r6.b
            a.ee0 r0 = new a.ee0
            r5 = 13
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r9 = a.qjj.d0(r10, r0, r9)
            if (r9 != r7) goto L72
            goto L74
        L72:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L74:
            if (r9 != r7) goto L77
        L76:
            return r7
        L77:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.evt.b(a.ed5, java.lang.String, a.zje):java.lang.Object");
    }
}
