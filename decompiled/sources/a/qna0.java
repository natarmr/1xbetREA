package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qna0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f29022a;
    public static final uts0 b;

    static {
        zsf zsfVar = new zsf(0.0f, 1.0f, 1.0f, 1.0f);
        f29022a = ro4.m0(Response.BUSY_EVERYWHERE, 0, zsfVar, 2);
        b = ro4.m0(300, 0, zsfVar, 2);
    }

    public static final void a(final eba ebaVar, final float f, final float f2, final String str, final float f3, final boolean z, final boolean z2, fet fetVar, final int i) {
        int i2;
        Object ina0Var;
        t33 t33Var;
        t33 t33Var2;
        t33 t33Var3;
        fetVar.g0(1721010155);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(ebaVar) : fetVar.i(ebaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (i2 & 599187) != 599186)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(dba.f5793a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = xf0.c(1.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var4 = (t33) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = xf0.c(1.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var5 = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = xf0.c(1.0f);
                fetVar.o0(objP4);
            }
            t33 t33Var6 = (t33) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = xf0.c(0.0f);
                fetVar.o0(objP5);
            }
            t33 t33Var7 = (t33) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = xf0.c(0.0f);
                fetVar.o0(objP6);
            }
            t33 t33Var8 = (t33) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = xf0.c(0.0f);
                fetVar.o0(objP7);
            }
            t33 t33Var9 = (t33) objP7;
            boolean zI = ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(ebaVar))) | ((i2 & 3670016) == 1048576) | fetVar.i(t33Var8) | fetVar.i(t33Var9) | fetVar.i(t33Var7) | fetVar.i(t33Var4) | fetVar.i(t33Var5) | fetVar.i(t33Var6) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objP8 = fetVar.P();
            if (zI || objP8 == obj) {
                t33Var = t33Var5;
                t33Var2 = t33Var6;
                ina0Var = new ina0(z2, t33Var8, t33Var9, t33Var7, t33Var4, t33Var, t33Var2, ebaVar, f, f2, f3, z, pz40Var, null);
                t33Var7 = t33Var7;
                t33Var3 = t33Var4;
                fetVar.o0(ina0Var);
            } else {
                t33Var2 = t33Var6;
                t33Var3 = t33Var4;
                ina0Var = objP8;
                t33Var = t33Var5;
            }
            m0x0.t(fetVar, ebaVar, (Function2) ina0Var);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CARD_BASKETBALL_FIELD_CARD");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40VarE0, 28.0f), 38.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            n0q n0qVar = o7k0.c;
            k7x.a(str, null, epv0.N(aac.R(o2e.e0(n0qVar, z ? "CARD_BASKETBALL_FIRST_PLAYER_FIELD_CARD" : "CARD_BASKETBALL_SECOND_PLAYER_FIELD_CARD"), StaticColors.INSTANCE.m73getBlack400d7_KjU(), ((Number) t33Var2.d()).floatValue()), ((Number) t33Var.d()).floatValue()), null, null, fetVar, ((i2 >> 9) & 14) | 48, 2040);
            eba ebaVar2 = (eba) pz40Var.getValue();
            cba cbaVar = ebaVar2 instanceof cba ? (cba) ebaVar2 : null;
            Integer numValueOf = cbaVar != null ? Integer.valueOf(cbaVar.f4052a) : null;
            if (numValueOf == null) {
                fetVar.e0(-274130684);
                fetVar.r(false);
            } else {
                fetVar.e0(-274130683);
                j0x.a(jpm0.t(numValueOf.intValue(), 6, fetVar), i4w0.U(n0qVar, 0.0f, 0.0f, ((Number) t33Var3.d()).floatValue(), ((Number) t33Var8.d()).floatValue(), ((Number) t33Var9.d()).floatValue(), 0.0f, 0.0f, ((Number) t33Var7.d()).floatValue(), 0L, null, false, 0L, 0L, 0, null, 1048291), 0.0f, fetVar, 120);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.hna0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    qna0.a(ebaVar, f, f2, str, f3, z, z2, (fet) obj2, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(t33 t33Var, t33 t33Var2, t33 t33Var3, zje zjeVar) {
        jna0 jna0Var;
        if (zjeVar instanceof jna0) {
            jna0Var = (jna0) zjeVar;
            int i = jna0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                jna0Var.j = i - Integer.MIN_VALUE;
            } else {
                jna0Var = new jna0(zjeVar);
            }
        } else {
            jna0Var = new jna0(zjeVar);
        }
        Object obj = jna0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jna0Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            py7 py7Var = new py7(t33Var, t33Var2, t33Var3, null, (byte) 1);
            jna0Var.j = 1;
            if (d5c.J(jna0Var, py7Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[DONT_INVERT, PHI: r0
  0x00a3: PHI (r0v3 boolean) = (r0v1 boolean), (r0v8 boolean) binds: [B:27:0x00a0, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        if (a.qcc.O(600, r2) == r3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(a.t33 r20, a.t33 r21, a.t33 r22, a.t33 r23, boolean r24, a.zje r25) {
        /*
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof a.kna0
            if (r2 == 0) goto L17
            r2 = r1
            a.kna0 r2 = (a.kna0) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.o = r3
            goto L1c
        L17:
            a.kna0 r2 = new a.kna0
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.n
            a.wne r3 = a.wne.f39444a
            int r4 = r2.o
            r5 = 600(0x258, double:2.964E-321)
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L50
            if (r4 == r9) goto L42
            if (r4 == r8) goto L3b
            if (r4 != r7) goto L35
            a.z1x.P(r1)
            goto Lb8
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r10
        L3b:
            boolean r0 = r2.m
            a.z1x.P(r1)
            goto La3
        L42:
            boolean r0 = r2.m
            a.t33 r4 = r2.l
            a.t33 r9 = r2.k
            a.t33 r11 = r2.j
            a.t33 r12 = r2.i
            a.z1x.P(r1)
            goto L74
        L50:
            a.z1x.P(r1)
            r1 = r20
            if (r0 != 0) goto L7b
            r2.i = r1
            r4 = r21
            r2.j = r4
            r11 = r22
            r2.k = r11
            r12 = r23
            r2.l = r12
            r2.m = r0
            r2.o = r9
            java.lang.Object r9 = a.qcc.O(r5, r2)
            if (r9 != r3) goto L70
            goto Lb7
        L70:
            r9 = r11
            r11 = r4
            r4 = r12
            r12 = r1
        L74:
            r17 = r4
            r16 = r9
            r15 = r11
            r14 = r12
            goto L87
        L7b:
            r4 = r21
            r11 = r22
            r12 = r23
            r14 = r1
            r15 = r4
            r16 = r11
            r17 = r12
        L87:
            a.zda r13 = new a.zda
            r18 = 0
            r19 = 2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2.i = r10
            r2.j = r10
            r2.k = r10
            r2.l = r10
            r2.m = r0
            r2.o = r8
            java.lang.Object r1 = a.d5c.J(r2, r13)
            if (r1 != r3) goto La3
            goto Lb7
        La3:
            if (r0 == 0) goto Lbb
            r2.i = r10
            r2.j = r10
            r2.k = r10
            r2.l = r10
            r2.m = r0
            r2.o = r7
            java.lang.Object r0 = a.qcc.O(r5, r2)
            if (r0 != r3) goto Lb8
        Lb7:
            return r3
        Lb8:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qna0.c(a.t33, a.t33, a.t33, a.t33, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d2 A[PHI: r2 r3 r4 r5
  0x00d2: PHI (r2v6 float) = (r2v5 float), (r2v9 float) binds: [B:30:0x00cf, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r3v5 float) = (r3v4 float), (r3v8 float) binds: [B:30:0x00cf, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r4v4 float) = (r4v3 float), (r4v7 float) binds: [B:30:0x00cf, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r5v4 a.t33) = (r5v3 a.t33), (r5v7 a.t33) binds: [B:30:0x00cf, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        if (r5.f(r8, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(a.t33 r16, a.t33 r17, a.t33 r18, a.t33 r19, a.t33 r20, a.t33 r21, float r22, float r23, float r24, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qna0.d(a.t33, a.t33, a.t33, a.t33, a.t33, a.t33, float, float, float, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r10.f(r0, r11) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(a.t33 r7, a.t33 r8, a.t33 r9, float r10, float r11, float r12, a.zje r13) {
        /*
            boolean r0 = r13 instanceof a.mna0
            if (r0 == 0) goto L13
            r0 = r13
            a.mna0 r0 = (a.mna0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.mna0 r0 = new a.mna0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.n
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r13)
            goto L9f
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L35:
            float r7 = r0.m
            float r8 = r0.l
            float r9 = r0.k
            a.t33 r10 = r0.j
            a.z1x.P(r13)
            goto L87
        L41:
            float r12 = r0.m
            float r11 = r0.l
            float r10 = r0.k
            a.t33 r9 = r0.j
            a.t33 r8 = r0.i
            a.z1x.P(r13)
            goto L6a
        L4f:
            a.z1x.P(r13)
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r10)
            r0.i = r8
            r0.j = r9
            r0.k = r10
            r0.l = r11
            r0.m = r12
            r0.o = r5
            java.lang.Object r7 = r7.f(r0, r13)
            if (r7 != r1) goto L6a
            goto L9e
        L6a:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r11)
            r0.i = r6
            r0.j = r9
            r0.k = r10
            r0.l = r11
            r0.m = r12
            r0.o = r4
            java.lang.Object r7 = r8.f(r0, r7)
            if (r7 != r1) goto L82
            goto L9e
        L82:
            r7 = r10
            r10 = r9
            r9 = r7
            r8 = r11
            r7 = r12
        L87:
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r7)
            r0.i = r6
            r0.j = r6
            r0.k = r9
            r0.l = r8
            r0.m = r7
            r0.o = r3
            java.lang.Object r7 = r10.f(r0, r11)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qna0.e(a.t33, a.t33, a.t33, float, float, float, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[PHI: r8 r9 r10 r11
  0x0062: PHI (r8v8 a.eba) = (r8v6 a.eba), (r8v20 a.eba) binds: [B:30:0x00dd, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r9v6 a.t33) = (r9v4 a.t33), (r9v8 a.t33) binds: [B:30:0x00dd, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r10v6 a.t33) = (r10v4 a.t33), (r10v8 a.t33) binds: [B:30:0x00dd, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r11v5 a.t33) = (r11v3 a.t33), (r11v6 a.t33) binds: [B:30:0x00dd, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133 A[PHI: r8
  0x0133: PHI (r8v23 a.t33) = (r8v21 a.t33), (r8v25 a.t33) binds: [B:46:0x012f, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189 A[PHI: r8
  0x0189: PHI (r8v29 a.t33) = (r8v27 a.t33), (r8v31 a.t33) binds: [B:58:0x0186, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if (r8.f(r0, r9) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a2, code lost:
    
        if (r8.f(r0, r9) == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(a.t33 r8, a.t33 r9, a.t33 r10, a.t33 r11, a.t33 r12, a.t33 r13, a.eba r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qna0.f(a.t33, a.t33, a.t33, a.t33, a.t33, a.t33, a.eba, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(t33 t33Var, t33 t33Var2, t33 t33Var3, zje zjeVar) {
        ona0 ona0Var;
        if (zjeVar instanceof ona0) {
            ona0Var = (ona0) zjeVar;
            int i = ona0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ona0Var.j = i - Integer.MIN_VALUE;
            } else {
                ona0Var = new ona0(zjeVar);
            }
        } else {
            ona0Var = new ona0(zjeVar);
        }
        Object obj = ona0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ona0Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            py7 py7Var = new py7(t33Var, t33Var2, t33Var3, null, (byte) 2);
            ona0Var.j = 1;
            if (d5c.J(ona0Var, py7Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
