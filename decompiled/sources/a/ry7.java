package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ry7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f31300a = new zsf(1.0f, 0.0f, 0.0f, 1.5f);
    public static final n0o0 b = maz.b(new os7((byte) 4));
    public static final n0o0 c = maz.b(new os7((byte) 5));
    public static final n0o0 d = maz.b(new os7((byte) 6));
    public static final n0o0 e = maz.b(new os7((byte) 7));

    public static final void a(mm40 mm40Var, e960 e960Var, g960 g960Var, nrq nrqVar, fet fetVar, int i) {
        t33 t33Var;
        t33 t33Var2;
        t33 t33Var3;
        t33 t33Var4;
        Object hy7Var;
        t33 t33Var5;
        pz40 pz40Var;
        e960 e960Var2 = e960Var;
        nrqVar.getClass();
        fetVar.g0(-1361667917);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(e960Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(g960Var) : fetVar.i(g960Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(e960Var2);
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = xf0.c(0.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var6 = (t33) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = xf0.c(0.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var7 = (t33) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = xf0.c(72.0f);
                fetVar.o0(objP4);
            }
            t33 t33Var8 = (t33) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = xf0.c(0.0f);
                fetVar.o0(objP5);
            }
            t33 t33Var9 = (t33) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = xf0.c(1.0f);
                fetVar.o0(objP6);
            }
            t33 t33Var10 = (t33) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = xf0.c(1.0f);
                fetVar.o0(objP7);
            }
            t33 t33Var11 = (t33) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = xf0.c(0.0f);
                fetVar.o0(objP8);
            }
            t33 t33Var12 = (t33) objP8;
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(64.0f, fetVar);
            float f = -pkd.b(6.0f, fetVar);
            boolean zI = ((i2 & 112) == 32 || fetVar.i(e960Var2)) | fetVar.i(t33Var6) | fetVar.i(t33Var7) | fetVar.i(t33Var8) | fetVar.i(t33Var9) | fetVar.i(t33Var10) | fetVar.i(t33Var11) | fetVar.d(fB) | fetVar.i(t33Var12) | fetVar.d(f);
            Object objP9 = fetVar.P();
            if (zI || objP9 == obj) {
                t33Var = t33Var6;
                t33Var2 = t33Var7;
                t33Var3 = t33Var12;
                t33Var4 = t33Var8;
                t33Var5 = t33Var9;
                pz40Var = pz40Var2;
                hy7Var = new hy7(e960Var2, t33Var, t33Var2, t33Var4, t33Var5, t33Var10, t33Var11, fB, t33Var3, f, pz40Var, null);
                fetVar.o0(hy7Var);
            } else {
                t33Var = t33Var6;
                t33Var2 = t33Var7;
                t33Var4 = t33Var8;
                hy7Var = objP9;
                t33Var5 = t33Var9;
                pz40Var = pz40Var2;
                t33Var3 = t33Var12;
            }
            m0x0.t(fetVar, e960Var2, (Function2) hy7Var);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1228454899, new ey7(mm40Var, t33Var, t33Var2, t33Var5, g960Var, t33Var10, t33Var11, t33Var4, nrqVar, t33Var3, pz40Var), fetVar), fetVar, 56);
        } else {
            e960Var2 = e960Var2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fy7((byte) 0, i, mm40Var, e960Var2, g960Var, nrqVar);
        }
    }

    public static final void b(mm40 mm40Var, t33 t33Var, t33 t33Var2, t33 t33Var3, g960 g960Var, fet fetVar, int i) {
        fetVar.g0(-99972124);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(t33Var) ? 32 : 16) | (fetVar.i(t33Var2) ? 256 : 128) | (fetVar.i(t33Var3) ? 2048 : 1024) | (fetVar.g(g960Var) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 72.0f), 100.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            String str = g960Var.c;
            n0q n0qVar = o7k0.c;
            boolean z = ((i2 & 7168) == 2048 || fetVar.i(t33Var3)) | ((i2 & 112) == 32 || fetVar.i(t33Var)) | ((i2 & 896) == 256 || fetVar.i(t33Var2));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gy7(t33Var, t33Var2, t33Var3, (byte) 0);
                fetVar.o0(objP);
            }
            k7x.a(str, null, i4w0.T(n0qVar, (Function1) objP), null, null, fetVar, 48, 2040);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var, (Object) t33Var, (Object) t33Var2, (Object) t33Var3, (Object) g960Var, i, (byte) 14);
        }
    }

    public static final void c(mm40 mm40Var, t33 t33Var, t33 t33Var2, t33 t33Var3, g960 g960Var, String str, nrq nrqVar, t33 t33Var4, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1734112125);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.i(t33Var) ? 32 : 16) | (fetVar2.i(t33Var2) ? 256 : 128) | (fetVar2.i(t33Var3) ? 2048 : 1024) | (fetVar2.g(g960Var) ? 16384 : 8192) | (fetVar2.g(str) ? 131072 : 65536) | (fetVar2.g(nrqVar) ? 1048576 : 524288) | (fetVar2.i(t33Var4) ? 8388608 : 4194304);
        if (fetVar2.U(i2 & 1, (4793491 & i2) != 4793490)) {
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 234.0f), 72.0f);
            boolean z = (i2 & 112) == 32 || fetVar2.i(t33Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new m53(t33Var, (byte) 8);
                fetVar2.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarE, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str2 = g960Var.f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 72.0f), 100.0f);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256 || fetVar2.i(t33Var2);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new m53(t33Var2, (byte) 9);
                fetVar2.o0(objP2);
            }
            k7x.a(str2, null, i4w0.T(mm40VarS, (Function1) objP2), null, null, fetVar2, 48, 2040);
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), 1.0f);
            boolean z3 = i3 == 256 || fetVar2.i(t33Var2);
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new m53(t33Var2, (byte) 7);
                fetVar2.o0(objP3);
            }
            v8q0.a(str, i4w0.T(mm40VarD, (Function1) objP3), ijg.x1, null, qmk.x, null, null, nrqVar, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, fetVar, ((i2 >> 15) & 14) | ((i2 << 3) & 29360128), 24960, 240488);
            fetVar2 = fetVar;
            String str3 = g960Var.d;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 72.0f), 100.0f);
            int i4 = i2 & 7168;
            boolean zG = fetVar2.g(w6kVar) | (i4 == 2048 || fetVar2.i(t33Var3));
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new op7(w6kVar, t33Var3, (byte) 4);
                fetVar2.o0(objP4);
            }
            k7x.a(str3, null, i4w0.T(mm40VarS2, (Function1) objP4), null, null, fetVar2, 48, 2040);
            String str4 = g960Var.e;
            mm40 mm40VarS3 = o7k0.s(o7k0.e(jm40Var, 72.0f), 100.0f);
            boolean zG2 = fetVar2.g(w6kVar) | ((i2 & 29360128) == 8388608 || fetVar2.i(t33Var4)) | (i4 == 2048 || fetVar2.i(t33Var3));
            Object objP5 = fetVar2.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new on((Object) t33Var4, (Object) w6kVar, (Object) t33Var3, (byte) 28);
                fetVar2.o0(objP5);
            }
            k7x.a(str4, null, i4w0.T(mm40VarS3, (Function1) objP5), null, null, fetVar2, 48, 2040);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6(mm40Var, (Object) t33Var, (Object) t33Var2, (Object) t33Var3, (Object) g960Var, str, (Object) nrqVar, (Object) t33Var4, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(t33 t33Var, float f, zje zjeVar) {
        iy7 iy7Var;
        if (zjeVar instanceof iy7) {
            iy7Var = (iy7) zjeVar;
            int i = iy7Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                iy7Var.j = i - Integer.MIN_VALUE;
            } else {
                iy7Var = new iy7(zjeVar);
            }
        } else {
            iy7Var = new iy7(zjeVar);
        }
        Object obj = iy7Var.i;
        wne wneVar = wne.f39444a;
        int i2 = iy7Var.j;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            jy7 jy7Var = new jy7(t33Var, f, yjeVar, (byte) 0);
            iy7Var.j = 1;
            if (d5c.J(iy7Var, jy7Var) == wneVar) {
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
    public static final Object e(t33 t33Var, t33 t33Var2, t33 t33Var3, float f, zje zjeVar) {
        ky7 ky7Var;
        if (zjeVar instanceof ky7) {
            ky7Var = (ky7) zjeVar;
            int i = ky7Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ky7Var.j = i - Integer.MIN_VALUE;
            } else {
                ky7Var = new ky7(zjeVar);
            }
        } else {
            ky7Var = new ky7(zjeVar);
        }
        Object obj = ky7Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ky7Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            ny7 ny7Var = new ny7(t33Var3, f, t33Var, t33Var2, null);
            ky7Var.j = 1;
            if (d5c.J(ky7Var, ny7Var) == wneVar) {
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
    public static final Object f(t33 t33Var, t33 t33Var2, t33 t33Var3, zje zjeVar) {
        oy7 oy7Var;
        if (zjeVar instanceof oy7) {
            oy7Var = (oy7) zjeVar;
            int i = oy7Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy7Var.j = i - Integer.MIN_VALUE;
            } else {
                oy7Var = new oy7(zjeVar);
            }
        } else {
            oy7Var = new oy7(zjeVar);
        }
        Object obj = oy7Var.i;
        wne wneVar = wne.f39444a;
        int i2 = oy7Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            py7 py7Var = new py7(t33Var, t33Var2, t33Var3, null, (byte) 0);
            oy7Var.j = 1;
            if (d5c.J(oy7Var, py7Var) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9 A[PHI: r5 r6 r7 r8 r9
  0x00e9: PHI (r5v9 float) = (r5v7 float), (r5v10 float) binds: [B:27:0x00e5, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r6v6 a.t33) = (r6v4 a.t33), (r6v7 a.t33) binds: [B:27:0x00e5, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r7v6 a.t33) = (r7v4 a.t33), (r7v7 a.t33) binds: [B:27:0x00e5, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r8v6 a.t33) = (r8v4 a.t33), (r8v7 a.t33) binds: [B:27:0x00e5, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r9v6 a.t33) = (r9v4 a.t33), (r9v8 a.t33) binds: [B:27:0x00e5, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0106 A[PHI: r5 r6 r7 r8
  0x0106: PHI (r5v11 float) = (r5v9 float), (r5v12 float) binds: [B:30:0x0103, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r6v8 a.t33) = (r6v6 a.t33), (r6v9 a.t33) binds: [B:30:0x0103, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r7v8 a.t33) = (r7v6 a.t33), (r7v9 a.t33) binds: [B:30:0x0103, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r8v8 a.t33) = (r8v6 a.t33), (r8v10 a.t33) binds: [B:30:0x0103, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0125 A[PHI: r5 r6 r7
  0x0125: PHI (r5v13 float) = (r5v11 float), (r5v14 float) binds: [B:33:0x0122, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0125: PHI (r6v10 a.t33) = (r6v8 a.t33), (r6v11 a.t33) binds: [B:33:0x0122, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0125: PHI (r7v10 a.t33) = (r7v8 a.t33), (r7v12 a.t33) binds: [B:33:0x0122, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0142 A[PHI: r5 r6
  0x0142: PHI (r5v15 float) = (r5v13 float), (r5v18 float) binds: [B:36:0x013f, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0142: PHI (r6v12 a.t33) = (r6v10 a.t33), (r6v13 a.t33) binds: [B:36:0x013f, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015e, code lost:
    
        if (r6.f(r0, r7) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(a.t33 r5, a.t33 r6, a.t33 r7, a.t33 r8, a.t33 r9, a.t33 r10, float r11, a.t33 r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ry7.g(a.t33, a.t33, a.t33, a.t33, a.t33, a.t33, float, a.t33, a.zje):java.lang.Object");
    }
}
