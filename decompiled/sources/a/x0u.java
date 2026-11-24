package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class x0u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmi f40089a;
    public final j1q0 b;
    public final b3c0 c;
    public final gst0 d;

    public x0u(pmi pmiVar, j1q0 j1q0Var, b3c0 b3c0Var, gst0 gst0Var, byte b) {
        j1q0Var.getClass();
        b3c0Var.getClass();
        gst0Var.getClass();
        switch (b) {
            case 1:
                this.f40089a = pmiVar;
                this.b = j1q0Var;
                this.c = b3c0Var;
                this.d = gst0Var;
                break;
            default:
                this.f40089a = pmiVar;
                this.b = j1q0Var;
                this.c = b3c0Var;
                this.d = gst0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable a(zje zjeVar) {
        a1u a1uVar;
        Serializable g0g0Var;
        j1q0 j1q0Var = this.b;
        if (zjeVar instanceof a1u) {
            a1uVar = (a1u) zjeVar;
            int i = a1uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1uVar.k = i - Integer.MIN_VALUE;
            } else {
                a1uVar = new a1u(this, zjeVar);
            }
        } else {
            a1uVar = new a1u(this, zjeVar);
        }
        Object objR = a1uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = a1uVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objR);
                e0g0 e0g0Var = j0g0.b;
                pmi pmiVar = this.f40089a;
                boolean zC = j1q0Var.f15748a.c();
                cre creVarJ = j1q0Var.j();
                a1uVar.k = 1;
                objR = pmiVar.r(zC, creVarJ, a1uVar);
                if (objR == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objR);
            }
            g0g0Var = new Integer(((elt) objR).e);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? new Integer(225) : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        v0u v0uVar;
        if (zjeVar instanceof v0u) {
            v0uVar = (v0u) zjeVar;
            int i = v0uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0uVar.k = i - Integer.MIN_VALUE;
            } else {
                v0uVar = new v0u(this, zjeVar);
            }
        } else {
            v0uVar = new v0u(this, zjeVar);
        }
        Object objR = v0uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = v0uVar.k;
        if (i2 == 0) {
            z1x.P(objR);
            j1q0 j1q0Var = this.b;
            boolean zC = j1q0Var.f15748a.c();
            cre creVarJ = j1q0Var.j();
            v0uVar.k = 1;
            objR = this.f40089a.r(zC, creVarJ, v0uVar);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objR);
        }
        return ((elt) objR).f8017a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (r8 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        if (r8 == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a.yje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.b1u
            if (r0 == 0) goto L13
            r0 = r8
            a.b1u r0 = (a.b1u) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.b1u r0 = new a.b1u
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            a.z1x.P(r8)
            goto Lad
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L38:
            a.z1x.P(r8)
            goto L94
        L3c:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L40
            goto L69
        L40:
            r8 = move-exception
            goto L74
        L42:
            a.z1x.P(r8)
            return r8
        L46:
            a.z1x.P(r8)
            a.gst0 r8 = r7.d
            boolean r8 = r8.a()
            if (r8 != 0) goto L5b
            r0.k = r6
            java.io.Serializable r7 = r7.a(r0)
            if (r7 != r1) goto L5a
            goto Lac
        L5a:
            return r7
        L5b:
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> L40
            a.b3c0 r8 = r7.c     // Catch: java.lang.Throwable -> L40
            r0.k = r5     // Catch: java.lang.Throwable -> L40
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r8 != r1) goto L69
            goto Lac
        L69:
            a.m2c0 r8 = (a.m2c0) r8     // Catch: java.lang.Throwable -> L40
            java.lang.String r8 = r8.c     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r8 = kotlin.text.StringsKt.toIntOrNull(r8)     // Catch: java.lang.Throwable -> L40
            a.e0g0 r2 = a.j0g0.b     // Catch: java.lang.Throwable -> L40
            goto L7c
        L74:
            a.e0g0 r2 = a.j0g0.b
            a.g0g0 r2 = new a.g0g0
            r2.<init>(r8)
            r8 = r2
        L7c:
            java.lang.Throwable r2 = a.j0g0.a(r8)
            if (r2 != 0) goto La0
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L8b
            int r7 = r8.intValue()
            goto L9a
        L8b:
            r0.k = r4
            java.io.Serializable r8 = r7.a(r0)
            if (r8 != r1) goto L94
            goto Lac
        L94:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
        L9a:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            goto Lb8
        La0:
            boolean r8 = r2 instanceof a.oqt0
            if (r8 != 0) goto Lb9
            r0.k = r3
            java.io.Serializable r8 = r7.a(r0)
            if (r8 != r1) goto Lad
        Lac:
            return r1
        Lad:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
        Lb8:
            return r8
        Lb9:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x0u.c(a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r7 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.w0u
            if (r0 == 0) goto L13
            r0 = r7
            a.w0u r0 = (a.w0u) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.w0u r0 = new a.w0u
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            a.z1x.P(r7)
            return r7
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L34:
            a.z1x.P(r7)
            goto L66
        L38:
            a.z1x.P(r7)
            goto L53
        L3c:
            a.z1x.P(r7)
            a.gst0 r7 = r6.d
            boolean r7 = r7.a()
            if (r7 == 0) goto L69
            r0.k = r5
            a.b3c0 r7 = r6.c
            r2 = 0
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L53
            goto L71
        L53:
            a.m2c0 r7 = (a.m2c0) r7
            java.lang.String r7 = r7.C
            int r2 = r7.length()
            if (r2 != 0) goto L68
            r0.k = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            java.lang.String r7 = (java.lang.String) r7
        L68:
            return r7
        L69:
            r0.k = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L72
        L71:
            return r1
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x0u.d(a.zje):java.lang.Object");
    }
}
