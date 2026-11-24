package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l470 extends x2t0 {
    public final uf3 h;
    public final hs60 i;
    public final gw60 j;
    public final ix0 k;
    public final ls l;
    public final xcc m;
    public final p4u n;
    public final oeg0 o;
    public final z4u p;
    public final iqt q;
    public final lbu r;
    public final dcu s;
    public final uxs0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l470(uf3 uf3Var, hs60 hs60Var, gw60 gw60Var, ix0 ix0Var, ls lsVar, xcc xccVar, p4u p4uVar, oeg0 oeg0Var, z4u z4uVar, iqt iqtVar, lbu lbuVar, dcu dcuVar, uxs0 uxs0Var) {
        super(new fq60((byte) 21));
        oeg0Var.getClass();
        this.h = uf3Var;
        this.i = hs60Var;
        this.j = gw60Var;
        this.k = ix0Var;
        this.l = lsVar;
        this.m = xccVar;
        this.n = p4uVar;
        this.o = oeg0Var;
        this.p = z4uVar;
        this.q = iqtVar;
        this.r = lbuVar;
        this.s = dcuVar;
        this.t = uxs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (j((a.c470) r7, r0) == r1) goto L23;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.e470 r7, a.zje r8) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l470.a(a.e470, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        if (k(r1, r9, r14, r5) == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        if (i(a.b470.f1946a, r5) == r6) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(a.c470 r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l470.j(a.c470, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (l(r11, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        if (r8.m.a(r11, r0) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r9, a.pbv r11, java.lang.String r12, a.zje r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof a.h470
            if (r0 == 0) goto L13
            r0 = r13
            a.h470 r0 = (a.h470) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.h470 r0 = new a.h470
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L41
            if (r2 == r5) goto L38
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            a.z1x.P(r13)
            goto Lad
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r7
        L38:
            long r9 = r0.i
            a.z1x.P(r13)     // Catch: java.lang.Exception -> L3f
            goto Lad
        L3f:
            r11 = move-exception
            goto L9c
        L41:
            long r9 = r0.i
            java.lang.String r12 = r0.k
            a.pbv r11 = r0.j
            a.z1x.P(r13)     // Catch: java.lang.Exception -> L3f
            goto L5f
        L4b:
            a.z1x.P(r13)
            a.ls r13 = r8.l     // Catch: java.lang.Exception -> L3f
            r0.j = r11     // Catch: java.lang.Exception -> L3f
            r0.k = r12     // Catch: java.lang.Exception -> L3f
            r0.i = r9     // Catch: java.lang.Exception -> L3f
            r0.n = r6     // Catch: java.lang.Exception -> L3f
            java.lang.Object r13 = r13.b(r9, r0)     // Catch: java.lang.Exception -> L3f
            if (r13 != r1) goto L5f
            goto Lac
        L5f:
            a.a570 r13 = r11.e     // Catch: java.lang.Exception -> L3f
            if (r13 != 0) goto L65
            r2 = -1
            goto L72
        L65:
            boolean r2 = r13 instanceof a.w470     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L6b
            r2 = 0
            goto L72
        L6b:
            boolean r2 = r13 instanceof a.z470     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L71
            r2 = r6
            goto L72
        L71:
            r2 = -2
        L72:
            if (r2 == 0) goto L8d
            if (r2 != r6) goto L87
            a.z470 r13 = (a.z470) r13     // Catch: java.lang.Exception -> L3f
            r0.j = r7     // Catch: java.lang.Exception -> L3f
            r0.k = r7     // Catch: java.lang.Exception -> L3f
            r0.i = r9     // Catch: java.lang.Exception -> L3f
            r0.n = r4     // Catch: java.lang.Exception -> L3f
            java.lang.Object r8 = r8.m(r13, r12, r0)     // Catch: java.lang.Exception -> L3f
            if (r8 != r1) goto Lad
            goto Lac
        L87:
            a.m460 r11 = new a.m460     // Catch: java.lang.Exception -> L3f
            r11.<init>()     // Catch: java.lang.Exception -> L3f
            throw r11     // Catch: java.lang.Exception -> L3f
        L8d:
            r0.j = r7     // Catch: java.lang.Exception -> L3f
            r0.k = r7     // Catch: java.lang.Exception -> L3f
            r0.i = r9     // Catch: java.lang.Exception -> L3f
            r0.n = r5     // Catch: java.lang.Exception -> L3f
            java.lang.Object r8 = r8.l(r11, r0)     // Catch: java.lang.Exception -> L3f
            if (r8 != r1) goto Lad
            goto Lac
        L9c:
            r0.j = r7
            r0.k = r7
            r0.i = r9
            r0.n = r3
            a.xcc r8 = r8.m
            java.lang.Object r8 = r8.a(r11, r0)
            if (r8 != r1) goto Lad
        Lac:
            return r1
        Lad:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l470.k(long, a.pbv, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(pbv pbvVar, zje zjeVar) {
        i470 i470Var;
        long j;
        if (zjeVar instanceof i470) {
            i470Var = (i470) zjeVar;
            int i = i470Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i470Var.l = i - Integer.MIN_VALUE;
            } else {
                i470Var = new i470(this, zjeVar);
            }
        } else {
            i470Var = new i470(this, zjeVar);
        }
        Object obj = i470Var.j;
        wne wneVar = wne.f39444a;
        int i2 = i470Var.l;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            long jD = x1x.D(pbvVar.e);
            i470Var.i = jD;
            i470Var.l = 1;
            Object objA = this.p.a(jD, i470Var);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            j = jD;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = i470Var.i;
            z1x.P(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        FragmentScreen fragmentScreenM0 = jtv.M0(6, j, null);
        if (fragmentScreenM0 == null) {
            return Unit.f46060a;
        }
        this.o.c().d(new qm60(fragmentScreenM0, zBooleanValue, b));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x0120  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
    
        if (r0 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013b, code lost:
    
        if (n(r13, r3, r12, r1) == r6) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(a.z470 r19, java.lang.String r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l470.m(a.z470, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(long j, zje zjeVar, String str, boolean z) {
        k470 k470Var;
        if (zjeVar instanceof k470) {
            k470Var = (k470) zjeVar;
            int i = k470Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                k470Var.n = i - Integer.MIN_VALUE;
            } else {
                k470Var = new k470(this, zjeVar);
            }
        } else {
            k470Var = new k470(this, zjeVar);
        }
        Object objA = k470Var.l;
        wne wneVar = wne.f39444a;
        int i2 = k470Var.n;
        if (i2 == 0) {
            z1x.P(objA);
            k470Var.k = str;
            k470Var.i = j;
            k470Var.j = z;
            k470Var.n = 1;
            objA = this.p.a(j, k470Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = k470Var.j;
            j = k470Var.i;
            str = k470Var.k;
            z1x.P(objA);
        }
        long j2 = j;
        String str2 = str;
        boolean z2 = z;
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        this.o.c().d(new x9((Object) uxs0.c(this.t, j2, null, z2, str2, 6), zBooleanValue, (byte) 29));
        return Unit.f46060a;
    }
}
