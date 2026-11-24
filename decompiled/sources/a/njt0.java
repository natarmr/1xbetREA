package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class njt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f23653a;
    public final lhf0 b;
    public final pru c;
    public final k9u d;
    public final rvt e;
    public final vpt f;
    public final z8u g;
    public final zoc h;
    public final m1e i;

    public njt0(xr xrVar, lhf0 lhf0Var, pru pruVar, k9u k9uVar, rvt rvtVar, vpt vptVar, z8u z8uVar, zoc zocVar, m1e m1eVar) {
        m1eVar.getClass();
        this.f23653a = xrVar;
        this.b = lhf0Var;
        this.c = pruVar;
        this.d = k9uVar;
        this.e = rvtVar;
        this.f = vptVar;
        this.g = z8uVar;
        this.h = zocVar;
        this.i = m1eVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:108:0x0246 A[Catch: all -> 0x004f, PHI: r2 r3 r4 r6 r7 r8 r10 r12
  0x0246: PHI (r2v20 int) = (r2v23 int), (r2v24 int) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r3v19 int) = (r3v21 int), (r3v22 int) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r4v16 a.mjt0) = (r4v14 a.mjt0), (r4v2 a.mjt0) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r6v27 boolean) = (r6v29 boolean), (r6v30 boolean) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r7v23 ??) = (r7v27 ??), (r7v28 ??) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r8v19 boolean) = (r8v16 boolean), (r8v20 boolean) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r10v25 long) = (r10v22 long), (r10v26 long) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0246: PHI (r12v26 long) = (r12v23 long), (r12v27 long) binds: [B:106:0x0243, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x004f, blocks: (B:14:0x004a, B:108:0x0246, B:109:0x0248, B:19:0x0064, B:105:0x0227, B:81:0x01c3, B:85:0x01ca, B:76:0x018c), top: B:134:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0260  */
    /* JADX WARN: Code duplicated, block: B:119:0x027f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e A[Catch: all -> 0x0148, TRY_ENTER, TryCatch #2 {all -> 0x0148, blocks: (B:59:0x0138, B:62:0x013e, B:64:0x0142, B:68:0x0155), top: B:127:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0142 A[Catch: all -> 0x0148, TryCatch #2 {all -> 0x0148, blocks: (B:59:0x0138, B:62:0x013e, B:64:0x0142, B:68:0x0155), top: B:127:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #6 {all -> 0x004f, blocks: (B:14:0x004a, B:108:0x0246, B:109:0x0248, B:19:0x0064, B:105:0x0227, B:81:0x01c3, B:85:0x01ca, B:76:0x018c), top: B:134:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[Catch: all -> 0x004f, PHI: r2 r3 r4 r6 r7 r8 r10 r12
  0x01c3: PHI (r2v14 ??) = (r2v12 ??), (r2v15 ??) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r3v13 ??) = (r3v11 ??), (r3v14 ??) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r4v12 a.mjt0) = (r4v11 a.mjt0), (r4v13 a.mjt0) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r6v21 ??) = (r6v19 ??), (r6v22 ??) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r7v15 ??) = (r7v13 ??), (r7v16 ??) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r8v13 boolean) = (r8v10 boolean), (r8v14 boolean) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r10v17 long) = (r10v12 long), (r10v19 long) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r12v18 long) = (r12v14 long), (r12v20 long) binds: [B:75:0x018a, B:80:0x01bf] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x004f, blocks: (B:14:0x004a, B:108:0x0246, B:109:0x0248, B:19:0x0064, B:105:0x0227, B:81:0x01c3, B:85:0x01ca, B:76:0x018c), top: B:134:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f0 A[Catch: all -> 0x01e9, TryCatch #3 {all -> 0x01e9, blocks: (B:92:0x01e1, B:95:0x01ec, B:97:0x01f0, B:98:0x01f6), top: B:129:0x01dd }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object a(long j, long j2, zje zjeVar, boolean z, boolean z2, boolean z3) {
        mjt0 mjt0Var;
        ?? r7;
        long j3;
        long j4;
        Object g0g0Var;
        ?? r8;
        ?? r6;
        ?? r3;
        ?? r2;
        Object obj;
        xvs xvsVar;
        long j5;
        long j6;
        int i;
        boolean z4;
        boolean z5;
        ?? r4;
        List list;
        int i2;
        h9n0 f9n0Var;
        mjt0 mjt0Var2;
        Object objW;
        njt0 njt0Var;
        ?? r9;
        int i3;
        boolean z6;
        int i4;
        Object ojt0Var;
        xr xrVar;
        mjt0 mjt0Var3;
        long j7;
        long j8;
        ?? r10;
        ?? r5;
        ?? r11;
        ?? r12;
        njt0 njt0Var2;
        rvt rvtVar;
        long j9;
        long j10;
        boolean z7;
        boolean z8;
        boolean z9;
        zoc zocVar;
        ?? r13;
        boolean z10;
        int i5;
        int i6;
        int i7;
        ?? r14 = z;
        ?? r15 = z2;
        if (!(zjeVar instanceof mjt0) || (r7 = (i7 = (mjt0Var = (mjt0) zjeVar).t) & Integer.MIN_VALUE) == 0) {
            mjt0Var = new mjt0(this, zjeVar);
        } else {
            mjt0Var.t = i7 - Integer.MIN_VALUE;
        }
        Object obj2 = mjt0Var.r;
        wne wneVar = wne.f39444a;
        ?? r16 = mjt0Var.t;
        boolean z11 = true;
        try {
            switch (r16) {
                case 0:
                    z1x.P(obj2);
                    if (!this.i.c()) {
                        return pjt0.f27107a;
                    }
                    int i8 = (this.f.a() && r15 != 0 && this.d.b() && this.c.a().C0) ? 1 : 0;
                    xvsVar = r14 != 0 ? xvs.LIVE : xvs.LINE;
                    gmq gmqVarD = this.g.f43985a.d();
                    mjt0Var.p = xvsVar;
                    j5 = j;
                    mjt0Var.i = j5;
                    j6 = j2;
                    mjt0Var.j = j6;
                    mjt0Var.k = r14;
                    mjt0Var.l = r15;
                    mjt0Var.m = z3;
                    mjt0Var.n = i8;
                    mjt0Var.t = 1;
                    Object objM = ntb.M(gmqVarD, mjt0Var);
                    if (objM != wneVar) {
                        i = i8;
                        obj2 = objM;
                        z4 = r14 == true ? 1 : 0;
                        z5 = z3;
                        r4 = r15;
                        list = (List) obj2;
                        if (list == null && axq.y(j5, list)) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        try {
                            e0g0 e0g0Var = j0g0.b;
                            f9n0Var = g9n0.f10923a;
                            if (i2 == 0) {
                                xrVar = this.f23653a;
                                if (i != 0) {
                                    f9n0Var = new e9n0();
                                }
                                mjt0Var.p = null;
                                mjt0Var.q = this;
                                mjt0Var.i = j5;
                                mjt0Var.j = j6;
                                mjt0Var.k = z4;
                                mjt0Var.l = r4;
                                mjt0Var.m = z5;
                                mjt0Var.n = i;
                                mjt0Var.o = i2;
                                mjt0Var.t = 2;
                                mjt0Var3 = mjt0Var;
                                j7 = j5;
                                j8 = j6;
                                try {
                                    j3 = j7;
                                    j4 = j8;
                                    mjt0Var = mjt0Var3;
                                    if (xrVar.l(j7, j8, xvsVar, f9n0Var, mjt0Var3) != wneVar) {
                                        z11 = z4;
                                        r10 = r4;
                                        r5 = i;
                                        r11 = z5;
                                        r12 = i2;
                                        njt0Var2 = this;
                                        if (r5 == 0) {
                                            if (r5 != 0) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            ojt0Var = new ojt0(z9);
                                            r14 = r12;
                                            r15 = r5;
                                            r16 = r11;
                                            r7 = r10;
                                            e0g0 e0g0Var2 = j0g0.b;
                                            g0g0Var = ojt0Var;
                                            r2 = r14;
                                            r3 = r15;
                                            r6 = r16;
                                            r8 = r7;
                                            if (j0g0.a(g0g0Var) != null) {
                                                mjt0Var.p = null;
                                                mjt0Var.q = g0g0Var;
                                                mjt0Var.i = j3;
                                                mjt0Var.j = j4;
                                                mjt0Var.k = z11;
                                                mjt0Var.l = r8;
                                                mjt0Var.m = r6;
                                                mjt0Var.n = r3;
                                                mjt0Var.o = r2;
                                                mjt0Var.t = 6;
                                                if (this.h.a(mjt0Var) != wneVar) {
                                                    obj = g0g0Var;
                                                    g0g0Var = obj;
                                                }
                                            }
                                            z1x.P(g0g0Var);
                                            return g0g0Var;
                                        }
                                        rvtVar = njt0Var2.e;
                                        mjt0Var.p = null;
                                        mjt0Var.q = null;
                                        mjt0Var.i = j3;
                                        mjt0Var.j = j4;
                                        mjt0Var.k = z11;
                                        mjt0Var.l = r10;
                                        mjt0Var.m = r11;
                                        mjt0Var.n = r5;
                                        mjt0Var.o = r12;
                                        mjt0Var.t = 3;
                                        if (Boolean.valueOf(((g8n0) rvtVar.f31187a.b).a(new ots(z11, j3))) != wneVar) {
                                            j9 = j3;
                                            j10 = j4;
                                            z7 = r10 == true ? 1 : 0;
                                            z8 = z11 ? 1 : 0;
                                            r12 = r12;
                                            r5 = r5;
                                            r11 = r11;
                                            r10 = z7;
                                            z11 = z8;
                                            j4 = j10;
                                            j3 = j9;
                                            if (r5 != 0) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            ojt0Var = new ojt0(z9);
                                            r14 = r12;
                                            r15 = r5;
                                            r16 = r11;
                                            r7 = r10;
                                            e0g0 e0g0Var3 = j0g0.b;
                                            g0g0Var = ojt0Var;
                                            r2 = r14;
                                            r3 = r15;
                                            r6 = r16;
                                            r8 = r7;
                                            if (j0g0.a(g0g0Var) != null) {
                                                mjt0Var.p = null;
                                                mjt0Var.q = g0g0Var;
                                                mjt0Var.i = j3;
                                                mjt0Var.j = j4;
                                                mjt0Var.k = z11;
                                                mjt0Var.l = r8;
                                                mjt0Var.m = r6;
                                                mjt0Var.n = r3;
                                                mjt0Var.o = r2;
                                                mjt0Var.t = 6;
                                                if (this.h.a(mjt0Var) != wneVar) {
                                                    obj = g0g0Var;
                                                    g0g0Var = obj;
                                                }
                                            }
                                            z1x.P(g0g0Var);
                                            return g0g0Var;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    j3 = j7;
                                    j4 = j8;
                                    mjt0Var = mjt0Var3;
                                    z11 = z4;
                                    r7 = r4;
                                    r15 = i;
                                    r16 = z5;
                                    r14 = i2;
                                    e0g0 e0g0Var4 = j0g0.b;
                                    g0g0Var = new g0g0(th);
                                    r2 = r14;
                                    r3 = r15;
                                    r6 = r16;
                                    r8 = r7;
                                }
                            } else {
                                long j11 = j6;
                                j3 = j5;
                                j4 = j11;
                                try {
                                    if (!z5 && i2 != 0) {
                                        ojt0Var = qjt0.f28857a;
                                        z11 = z4;
                                        r7 = r4;
                                        r15 = i;
                                        r16 = z5;
                                        r14 = i2;
                                        e0g0 e0g0Var5 = j0g0.b;
                                        g0g0Var = ojt0Var;
                                        r2 = r14;
                                        r3 = r15;
                                        r6 = r16;
                                        r8 = r7;
                                        if (j0g0.a(g0g0Var) != null) {
                                            mjt0Var.p = null;
                                            mjt0Var.q = g0g0Var;
                                            mjt0Var.i = j3;
                                            mjt0Var.j = j4;
                                            mjt0Var.k = z11;
                                            mjt0Var.l = r8;
                                            mjt0Var.m = r6;
                                            mjt0Var.n = r3;
                                            mjt0Var.o = r2;
                                            mjt0Var.t = 6;
                                            if (this.h.a(mjt0Var) != wneVar) {
                                                obj = g0g0Var;
                                                g0g0Var = obj;
                                            }
                                        }
                                        z1x.P(g0g0Var);
                                        return g0g0Var;
                                    }
                                    lhf0 lhf0Var = this.b;
                                    if (i != 0) {
                                        f9n0Var = new f9n0(true);
                                    }
                                    mjt0Var.p = null;
                                    mjt0Var.q = this;
                                    mjt0Var.i = j3;
                                    mjt0Var.j = j4;
                                    mjt0Var.k = z4;
                                    mjt0Var.l = r4;
                                    mjt0Var.m = z5;
                                    mjt0Var.n = i;
                                    mjt0Var.o = i2;
                                    mjt0Var.t = 4;
                                    mjt0Var2 = mjt0Var;
                                    try {
                                        objW = lhf0Var.w(j3, xvsVar, f9n0Var, mjt0Var2);
                                        j3 = j3;
                                        mjt0Var = mjt0Var2;
                                        if (objW != wneVar) {
                                            njt0Var = this;
                                            z11 = z4;
                                            r9 = r4;
                                            i3 = i;
                                            z6 = z5;
                                            i4 = i2;
                                            zocVar = njt0Var.h;
                                            mjt0Var.p = null;
                                            mjt0Var.q = null;
                                            mjt0Var.i = j3;
                                            mjt0Var.j = j4;
                                            mjt0Var.k = z11;
                                            mjt0Var.l = r9;
                                            mjt0Var.m = z6;
                                            mjt0Var.n = i3;
                                            mjt0Var.o = i4;
                                            mjt0Var.t = 5;
                                            i6 = i4;
                                            i5 = i3;
                                            z10 = z6;
                                            r13 = r9;
                                            if (zocVar.a(mjt0Var) != wneVar) {
                                                ojt0Var = rjt0.f30613a;
                                                r14 = i6;
                                                r15 = i5;
                                                r16 = z10;
                                                r7 = r13;
                                                e0g0 e0g0Var6 = j0g0.b;
                                                g0g0Var = ojt0Var;
                                                r2 = r14;
                                                r3 = r15;
                                                r6 = r16;
                                                r8 = r7;
                                                if (j0g0.a(g0g0Var) != null) {
                                                    mjt0Var.p = null;
                                                    mjt0Var.q = g0g0Var;
                                                    mjt0Var.i = j3;
                                                    mjt0Var.j = j4;
                                                    mjt0Var.k = z11;
                                                    mjt0Var.l = r8;
                                                    mjt0Var.m = r6;
                                                    mjt0Var.n = r3;
                                                    mjt0Var.o = r2;
                                                    mjt0Var.t = 6;
                                                    if (this.h.a(mjt0Var) != wneVar) {
                                                        obj = g0g0Var;
                                                        g0g0Var = obj;
                                                    }
                                                }
                                                z1x.P(g0g0Var);
                                                return g0g0Var;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j3 = j3;
                                        mjt0Var = mjt0Var2;
                                        z11 = z4;
                                        r7 = r4;
                                        r15 = i;
                                        r16 = z5;
                                        r14 = i2;
                                        e0g0 e0g0Var7 = j0g0.b;
                                        g0g0Var = new g0g0(th);
                                        r2 = r14;
                                        r3 = r15;
                                        r6 = r16;
                                        r8 = r7;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            long j12 = j6;
                            j3 = j5;
                            j4 = j12;
                        }
                    }
                    return wneVar;
                case 1:
                    int i9 = mjt0Var.n;
                    boolean z12 = mjt0Var.m;
                    boolean z13 = mjt0Var.l;
                    z4 = mjt0Var.k;
                    long j13 = mjt0Var.j;
                    long j14 = mjt0Var.i;
                    xvsVar = mjt0Var.p;
                    z1x.P(obj2);
                    i = i9;
                    z5 = z12;
                    r4 = z13;
                    j6 = j13;
                    j5 = j14;
                    list = (List) obj2;
                    if (list == null) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                    e0g0 e0g0Var8 = j0g0.b;
                    f9n0Var = g9n0.f10923a;
                    if (i2 == 0) {
                        xrVar = this.f23653a;
                        if (i != 0) {
                            f9n0Var = new e9n0();
                        }
                        mjt0Var.p = null;
                        mjt0Var.q = this;
                        mjt0Var.i = j5;
                        mjt0Var.j = j6;
                        mjt0Var.k = z4;
                        mjt0Var.l = r4;
                        mjt0Var.m = z5;
                        mjt0Var.n = i;
                        mjt0Var.o = i2;
                        mjt0Var.t = 2;
                        mjt0Var3 = mjt0Var;
                        j7 = j5;
                        j8 = j6;
                        j3 = j7;
                        j4 = j8;
                        mjt0Var = mjt0Var3;
                        if (xrVar.l(j7, j8, xvsVar, f9n0Var, mjt0Var3) != wneVar) {
                            z11 = z4;
                            r10 = r4;
                            r5 = i;
                            r11 = z5;
                            r12 = i2;
                            njt0Var2 = this;
                            if (r5 == 0) {
                                if (r5 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                ojt0Var = new ojt0(z9);
                                r14 = r12;
                                r15 = r5;
                                r16 = r11;
                                r7 = r10;
                                e0g0 e0g0Var9 = j0g0.b;
                                g0g0Var = ojt0Var;
                                r2 = r14;
                                r3 = r15;
                                r6 = r16;
                                r8 = r7;
                                if (j0g0.a(g0g0Var) != null) {
                                    mjt0Var.p = null;
                                    mjt0Var.q = g0g0Var;
                                    mjt0Var.i = j3;
                                    mjt0Var.j = j4;
                                    mjt0Var.k = z11;
                                    mjt0Var.l = r8;
                                    mjt0Var.m = r6;
                                    mjt0Var.n = r3;
                                    mjt0Var.o = r2;
                                    mjt0Var.t = 6;
                                    if (this.h.a(mjt0Var) != wneVar) {
                                        obj = g0g0Var;
                                        g0g0Var = obj;
                                    }
                                }
                                z1x.P(g0g0Var);
                                return g0g0Var;
                            }
                            rvtVar = njt0Var2.e;
                            mjt0Var.p = null;
                            mjt0Var.q = null;
                            mjt0Var.i = j3;
                            mjt0Var.j = j4;
                            mjt0Var.k = z11;
                            mjt0Var.l = r10;
                            mjt0Var.m = r11;
                            mjt0Var.n = r5;
                            mjt0Var.o = r12;
                            mjt0Var.t = 3;
                            if (Boolean.valueOf(((g8n0) rvtVar.f31187a.b).a(new ots(z11, j3))) != wneVar) {
                                j9 = j3;
                                j10 = j4;
                                z7 = r10 == true ? 1 : 0;
                                z8 = z11 ? 1 : 0;
                                r12 = r12;
                                r5 = r5;
                                r11 = r11;
                                r10 = z7;
                                z11 = z8;
                                j4 = j10;
                                j3 = j9;
                                if (r5 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                ojt0Var = new ojt0(z9);
                                r14 = r12;
                                r15 = r5;
                                r16 = r11;
                                r7 = r10;
                                e0g0 e0g0Var10 = j0g0.b;
                                g0g0Var = ojt0Var;
                                r2 = r14;
                                r3 = r15;
                                r6 = r16;
                                r8 = r7;
                                if (j0g0.a(g0g0Var) != null) {
                                    mjt0Var.p = null;
                                    mjt0Var.q = g0g0Var;
                                    mjt0Var.i = j3;
                                    mjt0Var.j = j4;
                                    mjt0Var.k = z11;
                                    mjt0Var.l = r8;
                                    mjt0Var.m = r6;
                                    mjt0Var.n = r3;
                                    mjt0Var.o = r2;
                                    mjt0Var.t = 6;
                                    if (this.h.a(mjt0Var) != wneVar) {
                                        obj = g0g0Var;
                                        g0g0Var = obj;
                                    }
                                }
                                z1x.P(g0g0Var);
                                return g0g0Var;
                            }
                        }
                    } else {
                        long j15 = j6;
                        j3 = j5;
                        j4 = j15;
                        if (!z5) {
                        }
                        lhf0 lhf0Var2 = this.b;
                        if (i != 0) {
                            f9n0Var = new f9n0(true);
                        }
                        mjt0Var.p = null;
                        mjt0Var.q = this;
                        mjt0Var.i = j3;
                        mjt0Var.j = j4;
                        mjt0Var.k = z4;
                        mjt0Var.l = r4;
                        mjt0Var.m = z5;
                        mjt0Var.n = i;
                        mjt0Var.o = i2;
                        mjt0Var.t = 4;
                        mjt0Var2 = mjt0Var;
                        objW = lhf0Var2.w(j3, xvsVar, f9n0Var, mjt0Var2);
                        j3 = j3;
                        mjt0Var = mjt0Var2;
                        if (objW != wneVar) {
                            njt0Var = this;
                            z11 = z4;
                            r9 = r4;
                            i3 = i;
                            z6 = z5;
                            i4 = i2;
                            zocVar = njt0Var.h;
                            mjt0Var.p = null;
                            mjt0Var.q = null;
                            mjt0Var.i = j3;
                            mjt0Var.j = j4;
                            mjt0Var.k = z11;
                            mjt0Var.l = r9;
                            mjt0Var.m = z6;
                            mjt0Var.n = i3;
                            mjt0Var.o = i4;
                            mjt0Var.t = 5;
                            i6 = i4;
                            i5 = i3;
                            z10 = z6;
                            r13 = r9;
                            if (zocVar.a(mjt0Var) != wneVar) {
                                ojt0Var = rjt0.f30613a;
                                r14 = i6;
                                r15 = i5;
                                r16 = z10;
                                r7 = r13;
                                e0g0 e0g0Var11 = j0g0.b;
                                g0g0Var = ojt0Var;
                                r2 = r14;
                                r3 = r15;
                                r6 = r16;
                                r8 = r7;
                                if (j0g0.a(g0g0Var) != null) {
                                    mjt0Var.p = null;
                                    mjt0Var.q = g0g0Var;
                                    mjt0Var.i = j3;
                                    mjt0Var.j = j4;
                                    mjt0Var.k = z11;
                                    mjt0Var.l = r8;
                                    mjt0Var.m = r6;
                                    mjt0Var.n = r3;
                                    mjt0Var.o = r2;
                                    mjt0Var.t = 6;
                                    if (this.h.a(mjt0Var) != wneVar) {
                                        obj = g0g0Var;
                                        g0g0Var = obj;
                                    }
                                }
                                z1x.P(g0g0Var);
                                return g0g0Var;
                            }
                        }
                    }
                    return wneVar;
                case 2:
                    r14 = mjt0Var.o;
                    r15 = mjt0Var.n;
                    r16 = mjt0Var.m;
                    r7 = mjt0Var.l;
                    boolean z14 = mjt0Var.k;
                    long j16 = mjt0Var.j;
                    long j17 = mjt0Var.i;
                    njt0Var2 = (njt0) mjt0Var.q;
                    try {
                        z1x.P(obj2);
                        z11 = z14;
                        j4 = j16;
                        j3 = j17;
                        r12 = r14;
                        r5 = r15;
                        r11 = r16;
                        r10 = r7;
                        if (r5 == 0) {
                            if (r5 != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ojt0Var = new ojt0(z9);
                            r14 = r12;
                            r15 = r5;
                            r16 = r11;
                            r7 = r10;
                            e0g0 e0g0Var12 = j0g0.b;
                            g0g0Var = ojt0Var;
                            r2 = r14;
                            r3 = r15;
                            r6 = r16;
                            r8 = r7;
                            if (j0g0.a(g0g0Var) != null) {
                                mjt0Var.p = null;
                                mjt0Var.q = g0g0Var;
                                mjt0Var.i = j3;
                                mjt0Var.j = j4;
                                mjt0Var.k = z11;
                                mjt0Var.l = r8;
                                mjt0Var.m = r6;
                                mjt0Var.n = r3;
                                mjt0Var.o = r2;
                                mjt0Var.t = 6;
                                if (this.h.a(mjt0Var) != wneVar) {
                                    obj = g0g0Var;
                                    g0g0Var = obj;
                                }
                            }
                            z1x.P(g0g0Var);
                            return g0g0Var;
                        }
                        rvtVar = njt0Var2.e;
                        mjt0Var.p = null;
                        mjt0Var.q = null;
                        mjt0Var.i = j3;
                        mjt0Var.j = j4;
                        mjt0Var.k = z11;
                        mjt0Var.l = r10;
                        mjt0Var.m = r11;
                        mjt0Var.n = r5;
                        mjt0Var.o = r12;
                        mjt0Var.t = 3;
                        if (Boolean.valueOf(((g8n0) rvtVar.f31187a.b).a(new ots(z11, j3))) != wneVar) {
                            j9 = j3;
                            j10 = j4;
                            z7 = r10 == true ? 1 : 0;
                            z8 = z11 ? 1 : 0;
                            r12 = r12;
                            r5 = r5;
                            r11 = r11;
                            r10 = z7;
                            z11 = z8;
                            j4 = j10;
                            j3 = j9;
                            if (r5 != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ojt0Var = new ojt0(z9);
                            r14 = r12;
                            r15 = r5;
                            r16 = r11;
                            r7 = r10;
                            e0g0 e0g0Var13 = j0g0.b;
                            g0g0Var = ojt0Var;
                            r2 = r14;
                            r3 = r15;
                            r6 = r16;
                            r8 = r7;
                            if (j0g0.a(g0g0Var) != null) {
                                mjt0Var.p = null;
                                mjt0Var.q = g0g0Var;
                                mjt0Var.i = j3;
                                mjt0Var.j = j4;
                                mjt0Var.k = z11;
                                mjt0Var.l = r8;
                                mjt0Var.m = r6;
                                mjt0Var.n = r3;
                                mjt0Var.o = r2;
                                mjt0Var.t = 6;
                                if (this.h.a(mjt0Var) != wneVar) {
                                    obj = g0g0Var;
                                    g0g0Var = obj;
                                }
                            }
                            z1x.P(g0g0Var);
                            return g0g0Var;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z11 = z14;
                        j4 = j16;
                        j3 = j17;
                        e0g0 e0g0Var14 = j0g0.b;
                        g0g0Var = new g0g0(th);
                        r2 = r14;
                        r3 = r15;
                        r6 = r16;
                        r8 = r7;
                    }
                    return wneVar;
                case 3:
                    r14 = mjt0Var.o;
                    r15 = mjt0Var.n;
                    r16 = mjt0Var.m;
                    z7 = mjt0Var.l;
                    z8 = mjt0Var.k;
                    j10 = mjt0Var.j;
                    j9 = mjt0Var.i;
                    try {
                        z1x.P(obj2);
                        r12 = r14;
                        r5 = r15;
                        r11 = r16;
                        r10 = z7;
                        z11 = z8;
                        j4 = j10;
                        j3 = j9;
                        if (r5 != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        ojt0Var = new ojt0(z9);
                        r14 = r12;
                        r15 = r5;
                        r16 = r11;
                        r7 = r10;
                        e0g0 e0g0Var15 = j0g0.b;
                        g0g0Var = ojt0Var;
                        r2 = r14;
                        r3 = r15;
                        r6 = r16;
                        r8 = r7;
                    } catch (Throwable th6) {
                        th = th6;
                        r7 = z7 ? 1 : 0;
                        z11 = z8 ? 1 : 0;
                        j4 = j10;
                        j3 = j9;
                        e0g0 e0g0Var16 = j0g0.b;
                        g0g0Var = new g0g0(th);
                        r2 = r14;
                        r3 = r15;
                        r6 = r16;
                        r8 = r7;
                    }
                    if (j0g0.a(g0g0Var) != null) {
                        mjt0Var.p = null;
                        mjt0Var.q = g0g0Var;
                        mjt0Var.i = j3;
                        mjt0Var.j = j4;
                        mjt0Var.k = z11;
                        mjt0Var.l = r8;
                        mjt0Var.m = r6;
                        mjt0Var.n = r3;
                        mjt0Var.o = r2;
                        mjt0Var.t = 6;
                        if (this.h.a(mjt0Var) != wneVar) {
                            obj = g0g0Var;
                            g0g0Var = obj;
                        }
                        return wneVar;
                    }
                    z1x.P(g0g0Var);
                    return g0g0Var;
                case 4:
                    int i10 = mjt0Var.o;
                    int i11 = mjt0Var.n;
                    boolean z15 = mjt0Var.m;
                    boolean z16 = mjt0Var.l;
                    z11 = mjt0Var.k;
                    j4 = mjt0Var.j;
                    j3 = mjt0Var.i;
                    njt0Var = (njt0) mjt0Var.q;
                    z1x.P(obj2);
                    i4 = i10;
                    i3 = i11;
                    z6 = z15;
                    r9 = z16;
                    zocVar = njt0Var.h;
                    mjt0Var.p = null;
                    mjt0Var.q = null;
                    mjt0Var.i = j3;
                    mjt0Var.j = j4;
                    mjt0Var.k = z11;
                    mjt0Var.l = r9;
                    mjt0Var.m = z6;
                    mjt0Var.n = i3;
                    mjt0Var.o = i4;
                    mjt0Var.t = 5;
                    i6 = i4;
                    i5 = i3;
                    z10 = z6;
                    r13 = r9;
                    if (zocVar.a(mjt0Var) != wneVar) {
                        ojt0Var = rjt0.f30613a;
                        r14 = i6;
                        r15 = i5;
                        r16 = z10;
                        r7 = r13;
                        e0g0 e0g0Var17 = j0g0.b;
                        g0g0Var = ojt0Var;
                        r2 = r14;
                        r3 = r15;
                        r6 = r16;
                        r8 = r7;
                        if (j0g0.a(g0g0Var) != null) {
                            mjt0Var.p = null;
                            mjt0Var.q = g0g0Var;
                            mjt0Var.i = j3;
                            mjt0Var.j = j4;
                            mjt0Var.k = z11;
                            mjt0Var.l = r8;
                            mjt0Var.m = r6;
                            mjt0Var.n = r3;
                            mjt0Var.o = r2;
                            mjt0Var.t = 6;
                            if (this.h.a(mjt0Var) != wneVar) {
                                obj = g0g0Var;
                                g0g0Var = obj;
                            }
                        }
                        z1x.P(g0g0Var);
                        return g0g0Var;
                    }
                    return wneVar;
                case 5:
                    int i12 = mjt0Var.o;
                    int i13 = mjt0Var.n;
                    boolean z17 = mjt0Var.m;
                    boolean z18 = mjt0Var.l;
                    z11 = mjt0Var.k;
                    j4 = mjt0Var.j;
                    j3 = mjt0Var.i;
                    z1x.P(obj2);
                    i6 = i12;
                    i5 = i13;
                    z10 = z17;
                    r13 = z18;
                    ojt0Var = rjt0.f30613a;
                    r14 = i6;
                    r15 = i5;
                    r16 = z10;
                    r7 = r13;
                    e0g0 e0g0Var18 = j0g0.b;
                    g0g0Var = ojt0Var;
                    r2 = r14;
                    r3 = r15;
                    r6 = r16;
                    r8 = r7;
                    if (j0g0.a(g0g0Var) != null) {
                        mjt0Var.p = null;
                        mjt0Var.q = g0g0Var;
                        mjt0Var.i = j3;
                        mjt0Var.j = j4;
                        mjt0Var.k = z11;
                        mjt0Var.l = r8;
                        mjt0Var.m = r6;
                        mjt0Var.n = r3;
                        mjt0Var.o = r2;
                        mjt0Var.t = 6;
                        if (this.h.a(mjt0Var) != wneVar) {
                            obj = g0g0Var;
                            g0g0Var = obj;
                        }
                        return wneVar;
                    }
                    z1x.P(g0g0Var);
                    return g0g0Var;
                case 6:
                    obj = mjt0Var.q;
                    z1x.P(obj2);
                    g0g0Var = obj;
                    z1x.P(g0g0Var);
                    return g0g0Var;
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
