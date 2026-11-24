package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugg0 f36935a;
    public static final mm40 b;
    public static final mm40 c;
    public static final mm40 d;

    static {
        zcl zclVar = qmk.f28987a;
        f36935a = vgg0.a(6.0f);
        jm40 jm40Var = jm40.b;
        b = o7k0.q(jm40Var, 20.0f, 18.0f, 28.0f, 18.0f);
        c = o7k0.p(jm40Var, 28.0f, 18.0f);
        d = s5x0.L(jm40Var, 2.0f, 0.0f, 2);
    }

    public static final void a(mm40 mm40Var, w7n w7nVar, boolean z, Function0 function0, fet fetVar, int i) {
        egk0 egk0Var;
        y9q0 y9q0Var;
        long j;
        fet fetVar2 = fetVar;
        b8n b8nVar = w7nVar.f38682a;
        fetVar2.g0(1337493961);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(w7nVar) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            y9q0 y9q0Var2 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            long jY = ibc.Y(b8nVar.b(), fetVar2);
            long jY2 = ibc.Y(b8nVar.a(), fetVar2);
            long j2 = w7nVar.b;
            Long l = w7nVar.f;
            boolean z2 = w7nVar.c;
            int i3 = w7nVar.d;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.c(f(l, j2));
                fetVar2.o0(objP);
            }
            egk0 egk0Var2 = (egk0) objP;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            long jLongValue = l != null ? l.longValue() : j2;
            Long lValueOf = Long.valueOf(jLongValue);
            boolean zF = fetVar2.f(j2) | fetVar2.g(l);
            Object objP2 = fetVar2.P();
            if (zF || objP2 == cl5Var) {
                objP2 = new zg0((Object) egk0Var2, j2, (Object) l, (yje) null, (byte) 3);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, lValueOf, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Integer numValueOf = Integer.valueOf(i3);
            Long lValueOf2 = Long.valueOf(jLongValue);
            boolean zH = fetVar2.h(z2) | fetVar2.g(pz40VarF) | fetVar2.e(i3) | fetVar2.g(l) | fetVar2.f(j2);
            Object objP3 = fetVar2.P();
            if (zH || objP3 == cl5Var) {
                objP3 = new u7n(z2, i3, egk0Var2, l, j2, pz40VarF, null);
                egk0Var = egk0Var2;
                fetVar2.o0(objP3);
            } else {
                egk0Var = egk0Var2;
            }
            m0x0.u(boolValueOf, numValueOf, lValueOf2, (Function2) objP3, fetVar2);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new e2m(egk0Var, (byte) 2));
                fetVar2.o0(objP4);
            }
            l7m0 l7m0Var = (l7m0) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new e2m(egk0Var, (byte) 3));
                fetVar2.o0(objP5);
            }
            l7m0 l7m0Var2 = (l7m0) objP5;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = jgk0.b(new e2m(egk0Var, (byte) 4));
                fetVar2.o0(objP6);
            }
            l7m0 l7m0Var3 = (l7m0) objP6;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (z) {
                fetVar2.e0(-1517869667);
                j = jY2;
                d(null, l7m0Var, false, y9q0Var2, jY, j, false, fetVar2, 432, 65);
                e(null, y9q0Var2, jY, fetVar, 0);
                fetVar2 = fetVar;
                jY = jY;
                y9q0Var = y9q0Var2;
                fetVar2.r(false);
            } else {
                y9q0Var = y9q0Var2;
                j = jY2;
                fetVar2.e0(-1517508331);
                fetVar2.r(false);
            }
            d(null, l7m0Var2, false, y9q0Var, jY, j, false, fetVar2, 432, 65);
            y9q0 y9q0Var3 = y9q0Var;
            long j3 = jY;
            e(null, y9q0Var3, j3, fetVar, 0);
            fetVar2 = fetVar;
            d(null, l7m0Var3, false, y9q0Var3, j3, j, false, fetVar2, 432, 65);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t7n(mm40Var, w7nVar, z, function0, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, w7n w7nVar, boolean z, Function0 function0, fet fetVar, int i) {
        egk0 egk0Var;
        fet fetVar2 = fetVar;
        b8n b8nVar = w7nVar.f38682a;
        fetVar2.g0(465251237);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(w7nVar) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            long jY = ibc.Y(b8nVar.b(), fetVar2);
            long jY2 = ibc.Y(b8nVar.a(), fetVar2);
            long j = w7nVar.b;
            boolean z2 = w7nVar.c;
            int i3 = w7nVar.d;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.c(j);
                fetVar2.o0(objP);
            }
            egk0 egk0Var2 = (egk0) objP;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            Long lValueOf = Long.valueOf(j);
            boolean zF = fetVar2.f(j);
            Object objP2 = fetVar2.P();
            if (zF || objP2 == cl5Var) {
                objP2 = new yg1(egk0Var2, j, null, (byte) 11);
                fetVar2.o0(objP2);
            }
            m0x0.v(lValueOf, 59999000L, (Function2) objP2, fetVar2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zH = fetVar2.h(z2) | fetVar2.e(i3) | fetVar2.g(pz40VarF);
            Object objP3 = fetVar2.P();
            if (zH || objP3 == cl5Var) {
                objP3 = new gr6(z2, i3, egk0Var2, pz40VarF, null);
                egk0Var = egk0Var2;
                fetVar2.o0(objP3);
            } else {
                egk0Var = egk0Var2;
            }
            m0x0.u(boolValueOf, numValueOf, 59999000L, (Function2) objP3, fetVar2);
            boolean z3 = (i2 & 896) == 256;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = jgk0.b(new rd7(z, (Object) egk0Var, (byte) 7));
                fetVar2.o0(objP4);
            }
            l7m0 l7m0Var = (l7m0) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new gnm(egk0Var, l7m0Var, (byte) 22));
                fetVar2.o0(objP5);
            }
            l7m0 l7m0Var2 = (l7m0) objP5;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = jgk0.b(new e2m(egk0Var, (byte) 5));
                fetVar2.o0(objP6);
            }
            l7m0 l7m0Var3 = (l7m0) objP6;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            d(null, l7m0Var2, ((Boolean) l7m0Var.getValue()).booleanValue(), y9q0Var, jY, jY2, ((Boolean) l7m0Var.getValue()).booleanValue(), fetVar2, 48, 1);
            e(null, y9q0Var, jY, fetVar, 0);
            fetVar2 = fetVar;
            d(null, l7m0Var3, ((Boolean) l7m0Var.getValue()).booleanValue(), y9q0Var, jY, jY2, false, fetVar2, 48, 65);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t7n(mm40Var, w7nVar, z, function0, i, (byte) 1);
        }
    }

    public static final void c(mm40 mm40Var, c8n c8nVar, Function0 function0, fet fetVar, int i) {
        c8nVar.getClass();
        if ((i & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i & 4) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ndm((byte) 28);
                fetVar.o0(objP);
            }
            function0 = (Function0) objP;
        }
        obc.d(bmd.n.a(k6z.f17794a), u1c.M(1336885672, new d8m((Object) c8nVar, (Object) mm40Var, (Object) function0, (byte) 22), fetVar), fetVar, 56);
    }

    public static final void d(mm40 mm40Var, final l7m0 l7m0Var, final boolean z, final y9q0 y9q0Var, final long j, final long j2, boolean z2, fet fetVar, final int i, final int i2) {
        boolean z3;
        int i3;
        fet fetVar2;
        mm40 mm40Var2;
        final boolean z4;
        String strValueOf;
        fetVar.g0(-1097910624);
        int i4 = i | 6;
        if ((i & 384) == 0) {
            i4 |= fetVar.h(z) ? 256 : 128;
        }
        int i5 = i4 | (fetVar.g(y9q0Var) ? 2048 : 1024) | (fetVar.f(j) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536);
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 = i5 | 1572864;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i5 | (fetVar.h(z3) ? 1048576 : 524288);
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            boolean z5 = i6 != 0 ? false : z3;
            boolean z6 = ((i3 & 896) == 256) | ((458752 & i3) == 131072);
            Object objP = fetVar.P();
            if (z6 || objP == ukd.f35823a) {
                mm40 mm40Var3 = d;
                ugg0 ugg0Var = f36935a;
                objP = z ? i120.Q(c, j2, ugg0Var).e(mm40Var3) : i120.Q(b, j2, ugg0Var).e(mm40Var3);
                fetVar.o0(objP);
            }
            mm40Var2 = jm40.b;
            mm40 mm40VarE = ((mm40) objP).e(mm40Var2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            long jLongValue = ((Number) l7m0Var.getValue()).longValue();
            if (z5) {
                int i7 = (int) jLongValue;
                if (i7 < 0 || i7 >= 10) {
                    strValueOf = (10 > i7 || i7 >= 100) ? String.valueOf(i7) : twn.m(i7, "0");
                } else {
                    strValueOf = twn.m(i7, "00");
                }
            } else {
                int i8 = (int) jLongValue;
                strValueOf = (i8 < 0 || i8 >= 10) ? String.valueOf(i8) : twn.m(i8, "0");
            }
            v8q0.a(strValueOf, o2e.e0(mm40Var2, "DsTimerCellTextTag"), j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0Var, fetVar, ((i3 >> 6) & 896) | 48, ((i3 << 12) & 29360128) | 24576, 114680);
            fetVar2 = fetVar;
            fetVar2.r(true);
            z4 = z5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
            z4 = z3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var4 = mm40Var2;
            yfe0VarU.d = new Function2() { // from class: a.s7n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v7n.d(mm40Var4, l7m0Var, z, y9q0Var, j, j2, z4, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, y9q0 y9q0Var, long j, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2082841321);
        int i2 = i | 6 | (fetVar2.g(y9q0Var) ? 32 : 16) | (fetVar2.f(j) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40Var3 = d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = mm40Var3.e(jm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            v8q0.a(Separators.COLON, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i2 & 896) | 6, (i2 << 18) & 29360128, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nol(mm40Var2, y9q0Var, j, i, (byte) 2);
        }
    }

    public static final long f(Long l, long j) {
        if (l == null) {
            return j;
        }
        long jLongValue = l.longValue() - System.currentTimeMillis();
        if (jLongValue < 0) {
            return 0L;
        }
        return jLongValue;
    }
}
