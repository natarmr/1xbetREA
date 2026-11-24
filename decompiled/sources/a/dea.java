package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5939a;
    public static final float b;

    static {
        zcl zclVar = qmk.f28987a;
        f5939a = 22.0f;
        b = 400.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    public static final void a(final mm40 mm40Var, final int i, final boolean z, final boolean z2, final float f, final float f2, final float f3, final float f4, final float f5, fet fetVar, final int i2) {
        fet fetVar2;
        ?? r0;
        boolean z3;
        fet fetVar3;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(-1520446065);
        int i3 = i2 | (fetVar5.g(mm40Var) ? 4 : 2) | (fetVar5.e(i) ? 32 : 16) | (fetVar5.h(z) ? 256 : 128) | (fetVar5.h(z2) ? 2048 : 1024) | (fetVar5.d(f) ? 16384 : 8192) | (fetVar5.d(f2) ? 131072 : 65536) | (fetVar5.d(f3) ? 1048576 : 524288) | (fetVar5.d(f4) ? 8388608 : 4194304) | (fetVar5.d(f5) ? 67108864 : 33554432);
        if (fetVar5.U(i3 & 1, (38347923 & i3) != 38347922)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40Var);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            if (z2) {
                fet fetVar6 = fetVar5;
                r0 = 0;
                z3 = true;
                fetVar6.e0(1548040301);
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                fetVar5.e0(1547638293);
                zcl zclVar = qmk.f28987a;
                fet fetVar7 = fetVar;
                r0 = 0;
                z3 = true;
                j0x.b(a8k0.F(R.drawable.card_cricket_game_empty_card_ic, 0, fetVar5), null, i4w0.U(o7k0.s(o7k0.e(jm40.b, 48.0f), 36.0f), 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571), null, null, 0.0f, new m78(StaticColors.INSTANCE.m123getWhite0d7_KjU(), 5), fetVar7, 56, 56);
                fetVar7.r(false);
                fetVar3 = fetVar7;
            }
            if (z) {
                fetVar3.e0(1548107416);
                fet fetVar8 = fetVar;
                jwb.e(Integer.valueOf(i), null, ro4.m0(Response.BAD_REQUEST, r0, null, 6), null, u1c.M(-70409107, new xdr() { // from class: a.uda
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj).intValue();
                        fet fetVar9 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar9.e(iIntValue) ? 4 : 2;
                        }
                        int i4 = iIntValue2;
                        if (fetVar9.U(i4 & 1, (i4 & 19) != 18)) {
                            int i5 = i;
                            l7m0 l7m0VarB = d43.b(i5 == iIntValue ? 1.0f : 0.27f, ro4.m0(Response.BAD_REQUEST, 0, null, 6), null, null, fetVar9, 48, 28);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 48.0f), 36.0f);
                            float fFloatValue = ((Number) l7m0VarB.getValue()).floatValue();
                            float fFloatValue2 = ((Number) l7m0VarB.getValue()).floatValue();
                            float f6 = i5 == iIntValue ? f : 0.0f;
                            float f7 = i5 == iIntValue ? f2 : 0.0f;
                            float f8 = i5 == iIntValue ? f3 : 0.0f;
                            j0x.b(a8k0.F(iIntValue, i4 & 14, fetVar9), null, i4w0.U(mm40VarS, fFloatValue, fFloatValue2, f4, f6, f7, 0.0f, 0.0f, f8, ils0.b, null, false, 0L, 0L, 0, null, 1047264), null, gqw0.A, 0.0f, null, fetVar9, 24632, 104);
                        } else {
                            fetVar9.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), fetVar8, ((i3 >> 3) & 14) | 24960, 10);
                fetVar8.r(r0);
                fetVar4 = fetVar8;
            } else {
                fet fetVar9 = fetVar3;
                fetVar9.e0(1549326925);
                fetVar9.r(r0);
                fetVar4 = fetVar9;
            }
            fetVar4.r(z3);
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(i, z, z2, f, f2, f3, f4, f5, i2) { // from class: a.vda
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float g;
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    dea.a(this.f37222a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(mm40 mm40Var, iea ieaVar, l7m0 l7m0Var, fet fetVar, int i) {
        iea ieaVar2;
        fet fetVar2;
        Object wdaVar;
        t33 t33Var;
        t33 t33Var2;
        t33 t33Var3;
        Object[] objArr;
        t33 t33Var4;
        t33 t33Var5;
        t33 t33Var6;
        t33 t33Var7;
        t33 t33Var8;
        boolean z = ieaVar.d;
        boolean z2 = ieaVar.c;
        l7m0Var.getClass();
        fetVar.g0(-1778853433);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ieaVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var9 = (t33) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = xf0.c(0.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var10 = (t33) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var11 = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = z2 ? xf0.c(0.0f) : xf0.c(1.0f);
                fetVar.o0(objP4);
            }
            t33 t33Var12 = (t33) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = xf0.c(0.0f);
                fetVar.o0(objP5);
            }
            t33 t33Var13 = (t33) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = xf0.c(0.0f);
                fetVar.o0(objP6);
            }
            t33 t33Var14 = (t33) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = xf0.c(0.0f);
                fetVar.o0(objP7);
            }
            t33 t33Var15 = (t33) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = z ? xf0.c(0.0f) : xf0.c(1.0f);
                fetVar.o0(objP8);
            }
            t33 t33Var16 = (t33) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = androidx.compose.runtime.e.a(1.0f);
                fetVar.o0(objP9);
            }
            agk0 agk0Var = (agk0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = androidx.compose.runtime.e.a(1.0f);
                fetVar.o0(objP10);
            }
            agk0 agk0Var2 = (agk0) objP10;
            float fB = pkd.b(f5939a, fetVar);
            Object objP11 = fetVar.P();
            if (objP11 == cl5Var) {
                objP11 = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP11);
            }
            pz40 pz40Var = (pz40) objP11;
            Object value = l7m0Var.getValue();
            Object objP12 = fetVar.P();
            if (objP12 == cl5Var) {
                objP12 = new ee0(l7m0Var, agk0Var2, agk0Var, null, (byte) 21);
                fetVar.o0(objP12);
            }
            m0x0.t(fetVar, value, (Function2) objP12);
            Object[] objArr2 = {Integer.valueOf(ieaVar.f14622a), Integer.valueOf(ieaVar.b), Boolean.valueOf(z2), Boolean.valueOf(z)};
            boolean zI = fetVar.i(t33Var9) | fetVar.i(t33Var10) | fetVar.i(t33Var11) | fetVar.i(t33Var13) | fetVar.i(t33Var14) | fetVar.i(t33Var15) | ((i2 & 112) == 32) | fetVar.i(t33Var12) | fetVar.d(fB) | fetVar.i(t33Var16);
            Object objP13 = fetVar.P();
            if (zI || objP13 == cl5Var) {
                t33Var = t33Var9;
                t33Var2 = t33Var11;
                t33Var3 = t33Var12;
                objArr = objArr2;
                t33Var4 = t33Var10;
                wdaVar = new wda(t33Var, t33Var4, t33Var2, t33Var13, t33Var14, t33Var15, ieaVar, t33Var3, fB, t33Var16, pz40Var, null);
                t33Var5 = t33Var13;
                t33Var6 = t33Var14;
                t33Var7 = t33Var15;
                ieaVar2 = ieaVar;
                t33Var8 = t33Var16;
                fetVar.o0(wdaVar);
            } else {
                t33Var = t33Var9;
                t33Var6 = t33Var14;
                t33Var2 = t33Var11;
                t33Var3 = t33Var12;
                t33Var7 = t33Var15;
                t33Var8 = t33Var16;
                ieaVar2 = ieaVar;
                objArr = objArr2;
                wdaVar = objP13;
                t33Var5 = t33Var13;
                t33Var4 = t33Var10;
            }
            m0x0.w(objArr, (Function2) wdaVar, fetVar);
            mm40 mm40VarK = lgb.K(mm40Var);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            t33 t33Var17 = t33Var;
            int i3 = ieaVar2.f14622a;
            t33 t33Var18 = t33Var4;
            boolean z3 = ieaVar2.c;
            float fFloatValue = ((Number) t33Var17.d()).floatValue();
            float fFloatValue2 = ((Number) t33Var18.d()).floatValue();
            float fFloatValue3 = ((Number) t33Var2.d()).floatValue();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            a(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 82.0f, 3), i3, z3, ieaVar2.e, fFloatValue, fFloatValue2, fFloatValue3, agk0Var2.l(), ((Number) t33Var3.d()).floatValue(), fetVar, 0);
            fetVar2 = fetVar;
            a(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 82.0f, 6), ieaVar2.b, ieaVar2.d, ieaVar2.e, ((Number) t33Var5.d()).floatValue(), ((Number) t33Var6.d()).floatValue(), ((Number) t33Var7.d()).floatValue(), agk0Var.l(), ((Number) t33Var8.d()).floatValue(), fetVar2, 0);
            fetVar2.r(true);
        } else {
            ieaVar2 = ieaVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, ieaVar2, l7m0Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object c(t33 t33Var, zje zjeVar) {
        xda xdaVar;
        if (zjeVar instanceof xda) {
            xdaVar = (xda) zjeVar;
            int i = xdaVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xdaVar.j = i - Integer.MIN_VALUE;
            } else {
                xdaVar = new xda(zjeVar);
            }
        } else {
            xdaVar = new xda(zjeVar);
        }
        xda xdaVar2 = xdaVar;
        Object obj = xdaVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = xdaVar2.j;
        if (i2 == 0) {
            z1x.P(obj);
            Float f = new Float(0.0f);
            uts0 uts0VarM0 = ro4.m0(Response.BUSY_EVERYWHERE, 0, new zsf(0.0f, 1.0f, 1.0f, 1.0f), 2);
            xdaVar2.j = 1;
            if (t33.a(t33Var, f, uts0VarM0, null, null, xdaVar2, 12) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, zje zjeVar) {
        yda ydaVar;
        if (zjeVar instanceof yda) {
            ydaVar = (yda) zjeVar;
            int i = ydaVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ydaVar.j = i - Integer.MIN_VALUE;
            } else {
                ydaVar = new yda(zjeVar);
            }
        } else {
            ydaVar = new yda(zjeVar);
        }
        Object obj = ydaVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ydaVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            zda zdaVar = new zda(t33Var, t33Var2, t33Var3, t33Var4, null, (byte) 0);
            ydaVar.j = 1;
            if (d5c.J(ydaVar, zdaVar) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7 A[PHI: r5 r6 r7
  0x00b7: PHI (r5v8 a.t33) = (r5v6 a.t33), (r5v9 a.t33) binds: [B:26:0x00b4, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r6v6 a.t33) = (r6v4 a.t33), (r6v7 a.t33) binds: [B:26:0x00b4, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r7v6 a.t33) = (r7v4 a.t33), (r7v8 a.t33) binds: [B:26:0x00b4, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0 A[PHI: r5 r6
  0x00d0: PHI (r5v10 a.t33) = (r5v8 a.t33), (r5v11 a.t33) binds: [B:29:0x00cd, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r6v8 a.t33) = (r6v6 a.t33), (r6v10 a.t33) binds: [B:29:0x00cd, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9 A[PHI: r5
  0x00e9: PHI (r5v12 a.t33) = (r5v10 a.t33), (r5v14 a.t33) binds: [B:32:0x00e6, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
    
        if (r5.f(r0, r6) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(a.t33 r5, a.t33 r6, a.t33 r7, a.t33 r8, a.t33 r9, a.t33 r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dea.e(a.t33, a.t33, a.t33, a.t33, a.t33, a.t33, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[PHI: r8 r9
  0x00a1: PHI (r8v6 float) = (r8v5 float), (r8v10 float) binds: [B:28:0x009e, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r9v4 a.t33) = (r9v3 a.t33), (r9v7 a.t33) binds: [B:28:0x009e, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r9.f(r0, r10) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(a.t33 r8, a.t33 r9, a.t33 r10, a.t33 r11, float r12, a.zje r13) {
        /*
            boolean r0 = r13 instanceof a.bea
            if (r0 == 0) goto L13
            r0 = r13
            a.bea r0 = (a.bea) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.bea r0 = new a.bea
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L56
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            a.z1x.P(r13)
            goto Lb9
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r7
        L38:
            float r8 = r0.l
            a.t33 r9 = r0.k
            a.z1x.P(r13)
            goto La1
        L40:
            float r8 = r0.l
            a.t33 r9 = r0.k
            a.t33 r10 = r0.j
            a.z1x.P(r13)
            goto L89
        L4a:
            float r12 = r0.l
            a.t33 r11 = r0.k
            a.t33 r10 = r0.j
            a.t33 r9 = r0.i
            a.z1x.P(r13)
            goto L6f
        L56:
            a.z1x.P(r13)
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r12)
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.n = r6
            java.lang.Object r8 = r8.f(r0, r13)
            if (r8 != r1) goto L6f
            goto Lb8
        L6f:
            java.lang.Float r8 = new java.lang.Float
            float r13 = a.dea.b
            r8.<init>(r13)
            r0.i = r7
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.n = r5
            java.lang.Object r8 = r9.f(r0, r8)
            if (r8 != r1) goto L87
            goto Lb8
        L87:
            r9 = r11
            r8 = r12
        L89:
            java.lang.Float r11 = new java.lang.Float
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r11.<init>(r12)
            r0.i = r7
            r0.j = r7
            r0.k = r9
            r0.l = r8
            r0.n = r4
            java.lang.Object r10 = r10.f(r0, r11)
            if (r10 != r1) goto La1
            goto Lb8
        La1:
            java.lang.Float r10 = new java.lang.Float
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r11)
            r0.i = r7
            r0.j = r7
            r0.k = r7
            r0.l = r8
            r0.n = r3
            java.lang.Object r8 = r9.f(r0, r10)
            if (r8 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dea.f(a.t33, a.t33, a.t33, a.t33, float, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, zje zjeVar) {
        cea ceaVar;
        if (zjeVar instanceof cea) {
            ceaVar = (cea) zjeVar;
            int i = ceaVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ceaVar.j = i - Integer.MIN_VALUE;
            } else {
                ceaVar = new cea(zjeVar);
            }
        } else {
            ceaVar = new cea(zjeVar);
        }
        Object obj = ceaVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ceaVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            zda zdaVar = new zda(t33Var, t33Var2, t33Var3, t33Var4, null, (byte) 1);
            ceaVar.j = 1;
            if (d5c.J(ceaVar, zdaVar) == wneVar) {
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
