package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sb90 implements emk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u99 f31921a;
    public final f99 b;
    public uvh0 c;
    public int d;
    public boolean e;
    public long f;

    public sb90(u99 u99Var) {
        this.f31921a = u99Var;
        f99 f99VarG = u99Var.g();
        this.b = f99VarG;
        uvh0 uvh0Var = f99VarG.f9145a;
        this.c = uvh0Var;
        this.d = uvh0Var != null ? uvh0Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // a.emk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Y(a.f99 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.e
            if (r3 != 0) goto L5f
            a.uvh0 r3 = r8.c
            a.f99 r4 = r8.b
            if (r3 == 0) goto L27
            a.uvh0 r5 = r4.f9145a
            if (r3 != r5) goto L21
            int r3 = r8.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            a.jf4.n(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            a.u99 r2 = r8.f31921a
            boolean r0 = r2.G(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            a.uvh0 r0 = r8.c
            if (r0 != 0) goto L48
            a.uvh0 r0 = r4.f9145a
            if (r0 == 0) goto L48
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L48:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            a.f99 r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r2.e(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            a.jf4.n(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = a.h97.h(r10, r8)
            a.c99.s(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sb90.Y(a.f99, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // a.emk0
    public final fmq0 h() {
        return this.f31921a.h();
    }
}
