package a;

import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class sac {
    public static final void A(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fetVar.g0(1399803156);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar.e(i) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str3) ? 16384 : 8192);
        if (fetVar.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var2, 20.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            int i7 = i6 >> 3;
            pm80 pm80VarF = a8k0.F(i, i7 & 14, fetVar);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, "", mm40VarN, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 56, 0);
            G((i7 & 112) | 384, fetVar, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str, false);
            G(((i6 >> 6) & 112) | 384, fetVar, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str2, false);
            qxw.o(fetVar, i120.Q(o7k0.c(o7k0.s(s5x0.N(jm40Var, 4.0f, 2.0f, 0.0f, 2.0f, 4), 1.0f), 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), jd8.n));
            G(((i6 >> 9) & 112) | 384, fetVar, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), str3, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 4);
        }
    }

    public static final void B(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i) {
        fetVar.g0(525883055);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a2mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 62.0f);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
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
            obb.q(null, a2mVar, z, fetVar, i2 & 1008, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwm(mm40Var, a2mVar, z, i, (byte) 0);
        }
    }

    public static final void C(mm40 mm40Var, k1n k1nVar, boolean z, boolean z2, fet fetVar, int i) {
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        fetVar.g0(-1013729997);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(k1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 72.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z5) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            d280 d280Var = k1nVar.b;
            jm40 jm40Var = jm40.b;
            if (d280Var != null) {
                fetVar.e0(-1181806724);
                boolean zG = fetVar.g(d280Var);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (zG || objP == obj) {
                    objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                    fetVar.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                tj30 tj30VarC = zq8.c(z ? gqw0.i : gqw0.g, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                boolean zG2 = fetVar.g(u6nVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    i3 = 1;
                    objP2 = new d1n(u6nVar, (byte) 1);
                    fetVar.o0(objP2);
                } else {
                    i3 = 1;
                }
                kkb.p(i3, fetVar, null, (Function0) objP2);
                if (z2) {
                    fetVar.e0(-501244995);
                    z4 = false;
                    vic.e(ffb0.Q(jm40Var, z ? 4.0f : -4.0f, 4.0f), y0m.f41813a, fetVar, 48, 0);
                    fetVar.r(false);
                } else {
                    z4 = false;
                    fetVar.e0(-500910970);
                    fetVar.r(false);
                }
                z3 = true;
                fetVar.r(true);
                fetVar.r(z4);
            } else {
                z3 = true;
                z4 = false;
                fetVar.e0(-1180875515);
                fetVar.r(false);
            }
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, z4);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarC);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(k1nVar.f17534a, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109562);
            fetVar.r(z3);
            fetVar.r(z3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5((Object) mm40Var, (Object) k1nVar, z, z2, i, (byte) 6);
        }
    }

    public static final void D(mm40 mm40Var, k1n k1nVar, k1n k1nVar2, a2m a2mVar, fet fetVar, int i) {
        k1n k1nVar3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        x0m x0mVar = x0m.f40076a;
        fetVar2.g0(126556189);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            k1nVar3 = k1nVar;
            i2 |= fetVar2.g(k1nVar3) ? 32 : 16;
        } else {
            k1nVar3 = k1nVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(k1nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(a2mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.e(0) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            x0m x0mVar2 = x0m.f40076a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            C(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), k1nVar3, true, false, fetVar2, (i3 & 112) | 384);
            obb.q(null, a2mVar, true, fetVar, ((i3 >> 6) & 112) | 384, 1);
            x0m x0mVar3 = x0m.f40076a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            C(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), k1nVar2, false, false, fetVar2, ((i3 >> 3) & 112) | 384);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(mm40Var2, k1nVar, k1nVar2, a2mVar, i);
        }
    }

    public static final void E(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(172463414);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(dkkVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.o, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), textPrimary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            F(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            F(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 5);
        }
    }

    public static final void F(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fetVar.g0(191079757);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar.e(i) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str3) ? 16384 : 8192);
        if (fetVar.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var2, 20.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            G(((i6 >> 9) & 112) | 384, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str3, true);
            mm40 mm40VarC = o7k0.c(o7k0.s(s5x0.N(jm40Var, 0.0f, 2.0f, 4.0f, 2.0f, 1), 1.0f), 1.0f);
            zfn zfnVar = zaq0.b;
            qxw.o(fetVar, i120.Q(mm40VarC, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), jd8.n));
            G(((i6 >> 6) & 112) | 384, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str2, false);
            int i7 = i6 >> 3;
            G((i7 & 112) | 384, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), str, false);
            dww.c(a8k0.F(i, i7 & 14, fetVar), "", o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 5);
        }
    }

    public static final void G(int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        int i2;
        long secondary;
        fetVar.g0(-334678656);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 20.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                if (z) {
                    objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                } else {
                    objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                }
                fetVar.o0(objP);
            }
            y9q0 y9q0Var = (y9q0) objP;
            if (z) {
                fetVar.e0(-656806937);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            } else {
                fetVar.e0(-656748471);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            }
            boolean z3 = ((i2 & 112) == 32) | (i3 == 256);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                String strL = null;
                if (z) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    strL = "-";
                }
                objP2 = strL;
                fetVar.o0(objP2);
            }
            v8q0.a((String) objP2, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, 24960, 110586);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(mm40Var, str, z, i, (byte) 4);
        }
    }

    public static final void H(lc00 lc00Var, mrf mrfVar, ctf0 ctf0Var, m9s m9sVar) {
        int i;
        char c;
        Iterator it;
        long j;
        Object ulfVar;
        Object flfVar;
        String str;
        ctf0Var.getClass();
        m9sVar.getClass();
        fof fofVar = mrfVar.f22269a;
        boolean z = fofVar.f9878a.c.length() > 0 && m9sVar.B <= 0;
        fofVar.getClass();
        irf irfVar = fofVar.f9878a;
        if (irfVar.i.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("GAME_LOG_STATISTIC_KEY", R.string.cs2_game_log));
        long j2 = irfVar.f;
        List list = irfVar.i;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            slf slfVar = (slf) it2.next();
            if (slfVar != null) {
                if (slfVar instanceof mlf) {
                    mlf mlfVar = (mlf) slfVar;
                    wpf wpfVar = mlfVar.l;
                    String str2 = mlfVar.k;
                    String str3 = mlfVar.m;
                    String str4 = mlfVar.e;
                    ArrayList arrayList2 = new ArrayList();
                    bnk0 bnk0Var = new bnk0();
                    String str5 = mlfVar.f21987a;
                    it = it2;
                    wpf wpfVar2 = mlfVar.b;
                    wpf wpfVar3 = wpf.b;
                    pzw.E(bnk0Var, str5, 0, wpfVar2 == wpfVar3 ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator, 0, 0, 54);
                    if (str2.length() > 0 || str3.length() > 0) {
                        pzw.E(bnk0Var, "  +  ", 0, R.color.static_white, 0, 0, 54);
                    }
                    ank0 ank0VarL = w6x.l(arrayList2, bnk0Var.f2888a, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    j = j2;
                    ank0 ank0VarD = axq.d(arrayList4, new zmk0(mlfVar.c, -1, -1.0f, mlfVar.d == wpfVar3 ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator, -1, -1), arrayList3, arrayList4, arrayList3);
                    wpf wpfVar4 = mlfVar.n;
                    String strL = n4c.L(str4, str4.length() > 0);
                    String strL2 = n4c.L("headshot", mlfVar.f);
                    String strL3 = n4c.L("penetration", mlfVar.g);
                    String strL4 = n4c.L("through_smoke", mlfVar.h);
                    String strL5 = n4c.L("noscope", mlfVar.i);
                    String strL6 = n4c.L("shooter_blind", mlfVar.j);
                    ArrayList arrayList5 = new ArrayList();
                    if (str3.length() == 0 && str2.length() == 0) {
                        str = str3;
                    } else if (str3.length() > 0 && str2.length() > 0) {
                        boolean zC = cy7.c();
                        int i2 = wpfVar4 == wpfVar3 ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator;
                        int i3 = wpfVar == wpfVar3 ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator;
                        bnk0 bnk0Var2 = new bnk0();
                        pzw.E(bnk0Var2, zC ? str2 : str3, 0, zC ? i3 : i2, 0, 0, 54);
                        pzw.E(bnk0Var2, "  +  ", 0, wpfVar == wpf.b ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator, 0, 0, 54);
                        pzw.E(bnk0Var2, zC ? str3 : str2, 0, zC ? i2 : i3, 0, 0, 54);
                        arrayList5.addAll(bnk0Var2.f2888a);
                        str = str3;
                    } else if (str3.length() > 0) {
                        ArrayList arrayList6 = new ArrayList();
                        int i4 = wpfVar4 == wpfVar3 ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator;
                        str = str3;
                        arrayList6.add(new zmk0(str3, -1, -1.0f, i4, -1, -1));
                        arrayList5.addAll(arrayList6);
                    } else {
                        str = str3;
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(new zmk0(str2, -1, -1.0f, wpfVar == wpfVar3 ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator, -1, -1));
                        arrayList5.addAll(arrayList7);
                    }
                    ulfVar = new glf(ank0VarL, ank0VarD, strL, strL2, strL3, strL4, strL5, strL6, new ank0(arrayList5), n4c.L("flashbang", str.length() > 0));
                } else {
                    it = it2;
                    j = j2;
                    if (slfVar instanceof rlf) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ulfVar = new ulf(axq.d(arrayList9, new zmk0(ctf0Var.b.a(R.string.cs2_round_started, Arrays.copyOf(new Object[0], 0)), -1, -1.0f, R.color.static_white, -1, -1), arrayList8, arrayList9, arrayList8));
                    } else if (slfVar instanceof olf) {
                        olf olfVar = (olf) slfVar;
                        Object[] objArr = {String.valueOf(olfVar.f25451a + olfVar.b)};
                        lsm0 lsm0Var = ctf0Var.b;
                        String strA = lsm0Var.a(R.string.cs2_round_over_v2, Arrays.copyOf(objArr, 1));
                        wpf wpfVar5 = olfVar.c;
                        wpf wpfVar6 = wpf.b;
                        ulfVar = new tlf(wpfVar5 == wpfVar6 ? R.drawable.cs2_log_item_counter_terrorist_bg : R.drawable.cs2_log_item_terrorist_bg, strA, lsm0Var.a(wpfVar5 == wpfVar6 ? R.string.cs2_short_name_ct : R.string.cs2_short_name_terrorist, Arrays.copyOf(new Object[0], 0)));
                    } else if (slfVar instanceof nlf) {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        ulfVar = new ulf(axq.d(arrayList11, new zmk0(ctf0Var.b.a(R.string.cs2_match_started_v2, Arrays.copyOf(new Object[]{((nlf) slfVar).f23723a}, 1)), -1, -1.0f, R.color.static_white, -1, -1), arrayList10, arrayList11, arrayList10));
                    } else {
                        if (slfVar instanceof llf) {
                            llf llfVar = (llf) slfVar;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = new ArrayList();
                            ank0 ank0VarD2 = axq.d(arrayList13, new zmk0(llfVar.f20244a, -1, -1.0f, R.color.cyber_game_cs2_map_terrorist, -1, -1), arrayList12, arrayList13, arrayList12);
                            StringBuilder sb = new StringBuilder(ujn.h);
                            int i5 = 0;
                            if (StringsKt.O("/sfiles/sppic1/cyber/cs/bombplant.png", ujn.h, false)) {
                                sb.setLength(i5);
                                sb.append("/sfiles/sppic1/cyber/cs/bombplant.png");
                            } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/bombplant.png", "https://", false)) {
                                i5 = 0;
                                sb.setLength(i5);
                                sb.append("/sfiles/sppic1/cyber/cs/bombplant.png");
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/bombplant.png", '/'));
                            }
                            String string = sb.toString();
                            ArrayList arrayList14 = new ArrayList();
                            v4f v4fVar = new v4f(llfVar, ctf0Var, (byte) 4);
                            bnk0 bnk0Var3 = new bnk0();
                            v4fVar.invoke(bnk0Var3);
                            flfVar = new flf(ank0VarD2, w6x.l(arrayList14, bnk0Var3.f2888a, arrayList14), string);
                        } else if (slfVar instanceof klf) {
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            ank0 ank0VarD3 = axq.d(arrayList16, new zmk0(((klf) slfVar).f18483a, -1, -1.0f, R.color.cyber_game_cs2_map_ct, -1, -1), arrayList15, arrayList16, arrayList15);
                            StringBuilder sb2 = new StringBuilder(ujn.h);
                            int i6 = 0;
                            if (StringsKt.O("/sfiles/sppic1/cyber/cs/defusekit.png", ujn.h, false)) {
                                sb2.setLength(i6);
                                sb2.append("/sfiles/sppic1/cyber/cs/defusekit.png");
                            } else if (kotlin.text.c.x("/sfiles/sppic1/cyber/cs/defusekit.png", "https://", false)) {
                                i6 = 0;
                                sb2.setLength(i6);
                                sb2.append("/sfiles/sppic1/cyber/cs/defusekit.png");
                            } else {
                                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                    sb2.append('/');
                                }
                                i6 = 0;
                                sb2.append(StringsKt.y0("/sfiles/sppic1/cyber/cs/defusekit.png", '/'));
                            }
                            String string2 = sb2.toString();
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = new ArrayList();
                            flfVar = new flf(ank0VarD3, axq.d(arrayList18, new zmk0(ctf0Var.b.a(R.string.cs2_gamelog_bomb_defused, Arrays.copyOf(new Object[i6], i6)), -1, -1.0f, R.color.static_white, -1, -1), arrayList17, arrayList18, arrayList17), string2);
                        } else if (slfVar instanceof qlf) {
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = new ArrayList();
                            ulfVar = new ulf(axq.d(arrayList20, new zmk0(ctf0Var.b.a(R.string.cs2_match_restarted, Arrays.copyOf(new Object[0], 0)), -1, -1.0f, R.color.static_white, -1, -1), arrayList19, arrayList20, arrayList19));
                        } else if (slfVar instanceof plf) {
                            plf plfVar = (plf) slfVar;
                            ArrayList arrayList21 = new ArrayList();
                            bnk0 bnk0Var4 = new bnk0();
                            pzw.E(bnk0Var4, plfVar.f27179a, 0, plfVar.b == wpf.b ? R.color.cyber_cs2_counter_terrorist_round_stats_indicator : R.color.cyber_cs2_terrorist_round_stats_indicator, 0, 0, 54);
                            pzw.E(bnk0Var4, Separators.SP, 0, R.color.static_white, 0, 0, 54);
                            pzw.E(bnk0Var4, ctf0Var.b.a(R.string.cs2_gamelog_suicide, Arrays.copyOf(new Object[0], 0)), 0, R.color.static_white, 0, 0, 54);
                            ulfVar = new ulf(w6x.l(arrayList21, bnk0Var4.f2888a, arrayList21));
                        }
                        ulfVar = flfVar;
                    }
                }
                arrayList.add(ulfVar);
                it2 = it;
                j2 = j;
            }
            t9f.b();
            return;
        }
        long j3 = j2;
        List listT0 = CollectionsKt.t0(arrayList);
        listT0.getClass();
        kif kifVar = irfVar.e;
        float f = irfVar.j;
        short s = irfVar.l;
        short s2 = irfVar.m;
        List list2 = irfVar.k;
        List<hrf> list3 = irfVar.n;
        list2.getClass();
        list3.getClass();
        StringBuilder sb3 = new StringBuilder(ujn.h);
        String strL7 = kng0.l("static/img/ImgDefault/Esports/CS/Maps_Radar/", irfVar.c, ".png");
        if (strL7.length() == 0) {
            sb3.setLength(0);
        } else {
            if (StringsKt.O(strL7, ujn.h, false)) {
                i = 0;
            } else if (kotlin.text.c.x(strL7, "https://", false)) {
                i = 0;
            } else {
                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb3.append('/');
                }
                sb3.append(StringsKt.y0(strL7, c));
            }
            sb3.setLength(i);
            sb3.append(strL7);
        }
        String string3 = sb3.toString();
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        ArrayList arrayList24 = new ArrayList();
        for (Object obj : list2) {
            short s3 = s;
            if (((vof) obj).e == wpf.b) {
                arrayList24.add(obj);
            }
            s = s3;
        }
        short s4 = s;
        ArrayList arrayList25 = new ArrayList();
        for (Object obj2 : list2) {
            if (((vof) obj2).e == wpf.f39542a) {
                arrayList25.add(obj2);
            }
        }
        arrayList22.addAll(agc.V(arrayList24, arrayList25, mrfVar, true));
        arrayList23.addAll(agc.V(arrayList24, arrayList25, mrfVar, false));
        String str6 = irfVar.c;
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayList23, arrayList22);
        jof jofVar = new jof(kifVar.f18334a, kifVar.b, kifVar.c);
        ArrayList arrayList26 = new ArrayList(r3d.q(list3, 10));
        for (hrf hrfVar : list3) {
            hpf hpfVar = hrfVar.f13527a;
            int i7 = hpfVar.f13439a;
            int i8 = hpfVar.b;
            ipf ipfVar = hrfVar.b;
            arrayList26.add(new xof(ipfVar.f15160a, ipfVar.b, i7, i8));
        }
        lc00Var.add(new amf(listT0, j3, new bpf(str6, string3, arrayListQ0, jofVar, s4, s2, f, arrayList26), z));
    }

    /* JADX WARN: Code duplicated, block: B:215:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0218 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[LOOP:7: B:97:0x021c->B:222:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de A[PHI: r8
  0x01de: PHI (r8v27 ??) = (r8v46 ??), (r8v34 ??) binds: [B:70:0x01b1, B:73:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0209  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x0222  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v11, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v27, types: [int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    public static final void I(lc00 lc00Var, m9s m9sVar, pdq0 pdq0Var, ctf0 ctf0Var, String str) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        char c;
        char c2;
        boolean z4;
        boolean z5;
        ?? sb;
        boolean zO;
        ?? r8;
        Collection collectionValues;
        Iterator it;
        List list;
        Iterator it2;
        boolean z6;
        char c3;
        char c4;
        String str2;
        String str3;
        m9sVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = pdq0Var.f26820a.entrySet().iterator();
        while (true) {
            i = 10;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                int iIntValue2 = ((Number) it4.next()).intValue();
                arrayList.add(iIntValue2 != 1 ? iIntValue2 != 2 ? rab.c : rab.b : rab.f30127a);
            }
            linkedHashMap.put(Integer.valueOf(iIntValue), arrayList);
        }
        boolean z7 = m9sVar.r;
        qqs qqsVar = m9sVar.h;
        String strA = qqsVar.l;
        int i3 = qqsVar.e;
        int i4 = qqsVar.d;
        List list3 = qqsVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (Map map : pdq0Var.b) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                int iIntValue3 = ((Number) entry2.getKey()).intValue();
                List list4 = (List) entry2.getValue();
                ArrayList arrayList3 = new ArrayList(r3d.q(list4, i));
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    int iIntValue4 = ((Number) it5.next()).intValue();
                    arrayList3.add(iIntValue4 != 1 ? iIntValue4 != 2 ? rab.c : rab.b : rab.f30127a);
                }
                linkedHashMap2.put(Integer.valueOf(iIntValue3), arrayList3);
                i = 10;
            }
            arrayList2.add(linkedHashMap2);
            i = 10;
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList2, 10));
        int i5 = 0;
        for (Object obj : arrayList2) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            Map map2 = (Map) obj;
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            ve90 ve90Var = (ve90) CollectionsKt.W(i5, list3);
            String str4 = (ve90Var == null || (str3 = ve90Var.b) == null) ? "0" : str3;
            ve90 ve90Var2 = (ve90) CollectionsKt.W(i5, list3);
            String str5 = (ve90Var2 == null || (str2 = ve90Var2.c) == null) ? "0" : str2;
            th90 th90VarS0 = dyb.s0(map2);
            StringBuilder sb2 = new StringBuilder(ujn.h);
            boolean z8 = z7;
            if (StringsKt.O("/static/img/ImgDefault/Esports/Virtual/OXO/X.png", ujn.h, false)) {
                z4 = false;
            } else {
                if (kotlin.text.c.x("/static/img/ImgDefault/Esports/Virtual/OXO/X.png", "https://", false)) {
                    z4 = false;
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c4 = '/';
                    } else {
                        sb2.append('/');
                        c4 = '/';
                    }
                    z5 = false;
                    sb2.append(StringsKt.y0("/static/img/ImgDefault/Esports/Virtual/OXO/X.png", c4));
                }
                String string = sb2.toString();
                sb = new StringBuilder(ujn.h);
                zO = StringsKt.O("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", ujn.h, z5);
                r8 = z5;
                if (zO) {
                    sb.setLength(r8);
                    sb.append("/static/img/ImgDefault/Esports/Virtual/OXO/O.png");
                } else if (kotlin.text.c.x("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", "https://", z5)) {
                    r8 = 0;
                    sb.setLength(r8);
                    sb.append("/static/img/ImgDefault/Esports/Virtual/OXO/O.png");
                } else {
                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                        c3 = '/';
                    } else {
                        c3 = '/';
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", c3));
                }
                String string2 = sb.toString();
                collectionValues = map2.values();
                if (!(collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z6 = true;
                    break;
                    break;
                }
                it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    list = (List) it.next();
                    if (list != null || !list.isEmpty()) {
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((rab) it2.next()) != rab.c) {
                                z6 = false;
                                break;
                            }
                        }
                    }
                }
                arrayList4.add(new vfg0(th90VarS0, str4, str5, string, string2, !z6));
                i5 = i6;
                z7 = z8;
                linkedHashMap = linkedHashMap3;
            }
            sb2.setLength(z4 ? 1 : 0);
            sb2.append("/static/img/ImgDefault/Esports/Virtual/OXO/X.png");
            z5 = z4;
            String string3 = sb2.toString();
            sb = new StringBuilder(ujn.h);
            zO = StringsKt.O("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", ujn.h, z5);
            r8 = z5;
            if (zO) {
                sb.setLength(r8);
                sb.append("/static/img/ImgDefault/Esports/Virtual/OXO/O.png");
            } else if (kotlin.text.c.x("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", "https://", z5)) {
                r8 = 0;
                sb.setLength(r8);
                sb.append("/static/img/ImgDefault/Esports/Virtual/OXO/O.png");
            } else {
                if (sb.length() > 0) {
                    c3 = '/';
                } else {
                    c3 = '/';
                }
                sb.append(StringsKt.y0("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", c3));
            }
            String string4 = sb.toString();
            collectionValues = map2.values();
            if (!(collectionValues instanceof Collection)) {
                it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                        break;
                    }
                    list = (List) it.next();
                    if (list != null) {
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((rab) it2.next()) != rab.c) {
                            z6 = false;
                            break;
                            break;
                        }
                    }
                }
            } else {
                it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                        break;
                    }
                    list = (List) it.next();
                    if (list != null) {
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((rab) it2.next()) != rab.c) {
                            z6 = false;
                            break;
                            break;
                        }
                    }
                }
            }
            arrayList4.add(new vfg0(th90VarS0, str4, str5, string3, string4, !z6));
            i5 = i6;
            z7 = z8;
            linkedHashMap = linkedHashMap3;
        }
        LinkedHashMap linkedHashMap4 = linkedHashMap;
        boolean z9 = z7;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (((vfg0) obj2).f) {
                arrayList5.add(obj2);
            }
        }
        boolean z10 = arrayList5.size() >= 2;
        Collection collectionValues2 = linkedHashMap4.values();
        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
            z = true;
            break;
        }
        Iterator it6 = collectionValues2.iterator();
        loop11: while (true) {
            if (!it6.hasNext()) {
                z = true;
                break;
            }
            List list5 = (List) it6.next();
            if (list5 == null || !list5.isEmpty()) {
                Iterator it7 = list5.iterator();
                while (it7.hasNext()) {
                    if (((rab) it7.next()) != rab.c) {
                        z = false;
                        break loop11;
                    }
                }
            }
        }
        Map map3 = (z9 && z) ? ((vfg0) CollectionsKt.d0(arrayList4)).f37330a : linkedHashMap4;
        Collection collectionValues3 = map3.values();
        if ((collectionValues3 instanceof Collection) && collectionValues3.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it8 = collectionValues3.iterator();
        loop9: while (true) {
            if (!it8.hasNext()) {
                z2 = false;
                break;
            }
            List list6 = (List) it8.next();
            if (list6 == null || !list6.isEmpty()) {
                Iterator it9 = list6.iterator();
                while (it9.hasNext()) {
                    if (((rab) it9.next()) != rab.c) {
                        z2 = true;
                        break loop9;
                    }
                }
            }
        }
        th90 th90VarS1 = dyb.s0(map3);
        i4 i4VarR0 = dyb.r0(arrayList4);
        StringBuilder sb3 = new StringBuilder(ujn.h);
        boolean z11 = false;
        if (StringsKt.O("/static/img/ImgDefault/Esports/Virtual/OXO/X.png", ujn.h, false)) {
            sb3.setLength(z11 ? 1 : 0);
            sb3.append("/static/img/ImgDefault/Esports/Virtual/OXO/X.png");
            z3 = z11;
        } else if (kotlin.text.c.x("/static/img/ImgDefault/Esports/Virtual/OXO/X.png", "https://", false)) {
            z11 = false;
            sb3.setLength(z11 ? 1 : 0);
            sb3.append("/static/img/ImgDefault/Esports/Virtual/OXO/X.png");
            z3 = z11;
        } else {
            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                c2 = '/';
            } else {
                c2 = '/';
                sb3.append('/');
            }
            z3 = false;
            sb3.append(StringsKt.y0("/static/img/ImgDefault/Esports/Virtual/OXO/X.png", c2));
        }
        String string5 = sb3.toString();
        ?? sb4 = new StringBuilder(ujn.h);
        boolean zO2 = StringsKt.O("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", ujn.h, z3);
        ?? r9 = z3;
        if (zO2) {
            sb4.setLength(r9);
            sb4.append("/static/img/ImgDefault/Esports/Virtual/OXO/O.png");
            i2 = r9;
        } else if (kotlin.text.c.x("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", "https://", z3)) {
            r9 = 0;
            sb4.setLength(r9);
            sb4.append("/static/img/ImgDefault/Esports/Virtual/OXO/O.png");
            i2 = r9;
        } else {
            if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                c = '/';
            } else {
                c = '/';
                sb4.append('/');
            }
            i2 = 0;
            sb4.append(StringsKt.y0("/static/img/ImgDefault/Esports/Virtual/OXO/O.png", c));
        }
        String string6 = sb4.toString();
        String strValueOf = String.valueOf(i4);
        String strValueOf2 = String.valueOf(i3);
        if (z9) {
            strA = i4 > i3 ? ctf0Var.b.a(R.string.win_first, Arrays.copyOf(new Object[i2], (int) i2)) : i3 > i4 ? ctf0Var.b.a(R.string.win_second, Arrays.copyOf(new Object[i2], (int) i2)) : ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[i2], (int) i2));
        } else if (strA.length() == 0) {
            strA = qqsVar.f29180a;
        }
        lc00Var.add(new m2o(th90VarS1, i4VarR0, string5, string6, str, strA, strValueOf, strValueOf2, z2, z10, !z9));
    }

    public static final ArrayList J(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tiw tiwVar = (tiw) it.next();
            List list2 = tiwVar.f34025a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (Q((d0t) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new vbb(tiwVar, (d0t) it2.next()));
            }
            w3d.u(arrayList, arrayList3);
        }
        return arrayList;
    }

    public static final vbb K(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j = ((vbb) next).b.s;
                do {
                    Object next2 = it.next();
                    long j2 = ((vbb) next2).b.s;
                    if (j > j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (vbb) obj;
    }

    public static vsg0 L(int i, long j, long j2) {
        return new vsg0(new pne(j, (i & 2) != 0 ? 0L : 1000L, (i & 4) != 0 ? 1000L : j2, null, (byte) 1));
    }

    public static vsg0 M(long j) {
        return new vsg0(new boe(j, new yld((byte) 18), null, (byte) 0));
    }

    public static final float N(long j, long j2) {
        return (float) Math.sqrt(((float) Math.pow(y3d.h(j) - y3d.h(j2), 2.0d)) + ((float) Math.pow(y3d.g(j) - y3d.g(j2), 2.0d)) + ((float) Math.pow(y3d.e(j) - y3d.e(j2), 2.0d)) + ((float) Math.pow(y3d.d(j) - y3d.d(j2), 2.0d)));
    }

    public static final h5t O(Fragment fragment) {
        fragment.getClass();
        Fragment fragment2 = fragment.y;
        if (fragment2 instanceof bn70) {
            fragment2.getClass();
            return ((bn70) fragment2).L1;
        }
        if (fragment2 != null) {
            return O(fragment2);
        }
        return null;
    }

    public static final long P(boolean z, y3d y3dVar, y3d y3dVar2, bbc bbcVar) {
        bbcVar.getClass();
        if (z) {
            return y3dVar != null ? y3dVar.f41946a : bbcVar.f2301a;
        }
        return y3dVar2 != null ? y3dVar2.f41946a : bbcVar.b;
    }

    public static final boolean Q(d0t d0tVar) {
        f0t f0tVar = d0tVar.q;
        f0t f0tVar2 = d0tVar.r;
        String str = f0tVar2.b;
        if (f0tVar.b.length() == 0) {
            return false;
        }
        return (str.length() == 0 && f0tVar2.c.isEmpty()) || str.length() > 0;
    }

    public static final c4m0 R(bvc bvcVar, Function1 function1, Function0 function0, CoroutineContext coroutineContext, Function2 function2) {
        coroutineContext.getClass();
        return qjj.W(bvcVar, coroutineContext.plus(new ax5(function1)), null, new ic1((Object) function2, (Object) function1, (Object) function0, (yje) null, (byte) 18), 2);
    }

    public static bby S(bvc bvcVar, String str, long j, List list, Function2 function2, CoroutineContext coroutineContext, Function1 function1) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        list.getClass();
        coroutineContext.getClass();
        return e0(bvcVar, j, timeUnit, coroutineContext, function1, new eoe(function2, list, str, null), null);
    }

    public static final c4m0 T(gmq gmqVar, vne vneVar, Function2 function2) {
        gmqVar.getClass();
        vneVar.getClass();
        function2.getClass();
        return slb.U(new dnq(gmqVar, new ko0((Object) function2, (yje) null, (byte) 7), (byte) 1), vneVar);
    }

    public static bby V(vne vneVar, Function1 function1, Function0 function0, CoroutineContext coroutineContext, Function2 function2, int i) {
        if ((i & 1) != 0) {
            function1 = goe.f11627a;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            coroutineContext = tvk.f34603a;
        }
        yne yneVar = yne.f42936a;
        vneVar.getClass();
        function1.getClass();
        coroutineContext.getClass();
        function2.getClass();
        return qjj.V(vneVar, coroutineContext.plus(new ax5(function1)), yneVar, new bv2(function2, function0, null));
    }

    public static bby W(vne vneVar, boolean z, String str, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        vneVar.getClass();
        coroutineContext.getClass();
        return V(vneVar, function1, null, coroutineContext, new hoe(function2, z, str, null), 10);
    }

    public static final bby X(vne vneVar, long j, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        vneVar.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return Z(vneVar, ibc.w0(j, dfn.c(timeUnit)), coroutineContext, function1, function2);
    }

    public static bby Y(vne vneVar, long j, CoroutineContext coroutineContext, Function1 function1, Function2 function2, int i) {
        if ((i & 4) != 0) {
            rwj rwjVar = tvk.f34603a;
            coroutineContext = dvj.c;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i & 8) != 0) {
            function1 = new vzd((byte) 11);
        }
        return X(vneVar, j, coroutineContext2, function1, function2);
    }

    public static final bby Z(vne vneVar, long j, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        vneVar.getClass();
        coroutineContext.getClass();
        function1.getClass();
        return V(vneVar, function1, null, coroutineContext, new ioe(function2, j, (yje) null), 10);
    }

    public static final void a(mm40 mm40Var, l7m0 l7m0Var, String str, float f, t33 t33Var, l7m0 l7m0Var2, String str2, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        fetVar.g0(-1599379277);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i2 |= fetVar.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar.g(t33Var) : fetVar.i(t33Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(str2) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 70.0f);
            CharSequence charSequence = (CharSequence) l7m0Var3.getValue();
            if (charSequence.length() == 0) {
                charSequence = str;
            }
            k7x.a((String) charSequence, null, mm40VarN, gqw0.A, null, fetVar, 1572912, 1976);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 54.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN2);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarJ = s5x0.J(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, jr8.f16991a.b(o7k0.n(jm40Var, 46.0f), zx7Var)), 4.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new f54(f, (byte) 21);
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarJ, (Function1) objP);
            CharSequence charSequence2 = (CharSequence) l7m0Var2.getValue();
            if (charSequence2.length() == 0) {
                charSequence2 = str2;
            }
            kc5.Q((String) charSequence2, ((Number) t33Var.d()).floatValue(), mm40VarT, fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb3(mm40Var, l7m0Var3, str, f, t33Var, l7m0Var2, str2, i);
        }
    }

    public static bby a0(vne vneVar, long j, CoroutineContext coroutineContext, d4u0 d4u0Var, Function2 function2, int i) {
        if ((i & 2) != 0) {
            rwj rwjVar = tvk.f34603a;
            coroutineContext = dvj.c;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        Function1 vzdVar = d4u0Var;
        if ((i & 4) != 0) {
            vzdVar = new vzd((byte) 8);
        }
        return Z(vneVar, j, coroutineContext2, vzdVar, function2);
    }

    public static final void b(mm40 mm40Var, String str, String str2, m0x m0xVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-877451793);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(m0xVar) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(vic.w(o7k0.e(mm40Var, 74.0f)), 8.0f, 10.0f, 8.0f, 8.0f);
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(10.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long j = iph.f;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110586);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(1750955413);
            mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
            Object objA = m0xVar.a();
            pge pgeVar = gqw0.B;
            mz3 mz3VarX = l7x.X(objA, null, pgeVar, fetVar, 3072, 22);
            long j2 = iph.g;
            j0x.b(mz3VarX, null, mm40VarN, null, pgeVar, 0.0f, new m78(j2, 5), fetVar, 24624, 40);
            fetVar.r(false);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, (i2 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 23, i, (Object) mm40Var, (Object) str, (Object) str2, (Object) m0xVar);
        }
    }

    public static final bby b0(bvc bvcVar, long j, TimeUnit timeUnit, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        timeUnit.getClass();
        coroutineContext.getClass();
        return c0(bvcVar, ibc.w0(j, dfn.c(timeUnit)), coroutineContext, function1, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(mm40 mm40Var, c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, Function1 function1, fet fetVar, int i) {
        c4i c4iVar2;
        u3i u3iVar4;
        u3i u3iVar5;
        fet fetVar2;
        boolean z;
        fet fetVar3;
        int i2;
        boolean z2;
        fet fetVar4;
        function1.getClass();
        fetVar.g0(-816987402);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(c4iVar) ? 32 : 16) | (fetVar.g(u3iVar) ? 256 : 128) | (fetVar.g(u3iVar2) ? 2048 : 1024) | (fetVar.g(u3iVar3) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            zcl zclVar = qmk.f28987a;
            int iB = si30.b(pkd.b(12.0f, fetVar));
            int iB2 = si30.b(pkd.b(4.0f, fetVar));
            int iB3 = si30.b(pkd.b(2.0f, fetVar));
            int iB4 = si30.b(pkd.b(34.0f, fetVar));
            int i5 = iB4 / 2;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 34.0f), "EVENT_CARD_TOP_LAYOUT_V1");
            boolean zE = ((i4 & 896) == 256) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | fetVar.e(iB) | fetVar.e(iB3) | fetVar.e(iB2) | fetVar.e(iB4) | fetVar.e(i5);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                t2i t2iVar = new t2i(c4iVar, u3iVar, u3iVar2, u3iVar3, iB, iB3, iB2, iB4, i5);
                c4iVar2 = c4iVar;
                u3iVar4 = u3iVar;
                u3iVar5 = u3iVar2;
                fetVar.o0(t2iVar);
                objP = t2iVar;
            } else {
                c4iVar2 = c4iVar;
                u3iVar4 = u3iVar;
                u3iVar5 = u3iVar2;
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            o0x o0xVar = c4iVar2.c;
            y3d y3dVar = c4iVar2.e;
            if (o0xVar == null || !c4iVar2.b) {
                z = false;
                fetVar.e0(-48666813);
                fetVar.r(false);
            } else {
                fetVar.e0(-48735044);
                z = false;
                i(0, fetVar);
                fetVar.r(false);
            }
            if (o0xVar != null) {
                fetVar.e0(-48572449);
                if (o0xVar instanceof m0x) {
                    fetVar.e0(275529305);
                    k((m0x) o0xVar, y3dVar, fetVar, z ? 1 : 0);
                    fetVar.r(z);
                } else {
                    if (o0xVar instanceof l0x) {
                        fetVar.e0(275536862);
                        j((l0x) o0xVar, y3dVar, fetVar, z ? 1 : 0);
                        fetVar.r(z);
                    } else {
                        if (!(o0xVar instanceof n0x)) {
                            throw b1j.f(275527811, fetVar, false);
                        }
                        fetVar.e0(-48055989);
                        fet fetVar5 = fetVar;
                        u7x.q(null, (n0x) o0xVar, 14.0f, c4iVar2.e, c4iVar2.f, c4iVar2.d, fetVar5, 0, 1);
                        z2 = false;
                        fetVar5.r(false);
                        fetVar4 = fetVar5;
                    }
                    fetVar4.r(z2);
                    i2 = z2;
                    fetVar3 = fetVar4;
                }
                fetVar4 = fetVar;
                z2 = z;
                fetVar4.r(z2);
                i2 = z2;
                fetVar3 = fetVar4;
            } else {
                fet fetVar6 = fetVar;
                u3iVar3 = u3iVar3;
                fetVar6.e0(-47662909);
                fetVar6.r(z);
                i2 = z;
                fetVar3 = fetVar6;
            }
            e(i2, fetVar3, null, c4iVar2.f3727a);
            boolean z3 = u3iVar4 instanceof z3i;
            jm40 jm40Var = jm40.b;
            if (z3) {
                fetVar3.e0(-47446374);
                h(o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 2.0f, 0.0f, 9), "NOTIFICATION_BUTTON_V1"), (z3i) u3iVar4, function1, fetVar3, ((i4 >> 3) & 112) | ((i4 >> 9) & 896));
                fetVar3.r(false);
            } else {
                fetVar3.e0(-47130205);
                fetVar3.r(false);
            }
            if (u3iVar5 instanceof x3i) {
                fetVar3.e0(-47034198);
                g(o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 2.0f, 0.0f, 9), "FAVORITE_BUTTON_V1"), (x3i) u3iVar5, function1, fetVar3, ((i4 >> 6) & 112) | ((i4 >> 9) & 896));
                fetVar3.r(false);
            } else {
                fetVar3.e0(-46733405);
                fetVar3.r(false);
            }
            if (u3iVar3 instanceof s3i) {
                fetVar3.e0(-46636251);
                f(s5x0.N(jm40Var, 0.0f, 2.0f, 2.0f, 0.0f, 9), (s3i) u3iVar3, function1, fetVar3, (i4 >> 9) & 1008);
                fetVar3.r(false);
            } else {
                fetVar3.e0(-46361405);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            c4iVar2 = c4iVar;
            u3iVar4 = u3iVar;
            u3iVar5 = u3iVar2;
            fet fetVar7 = fetVar;
            u3iVar3 = u3iVar3;
            fetVar7.X();
            fetVar2 = fetVar7;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) c4iVar2, (Object) u3iVar4, (Object) u3iVar5, (Object) u3iVar3, (Object) function1, i, (byte) 10);
        }
    }

    public static final bby c0(bvc bvcVar, long j, CoroutineContext coroutineContext, Function1 function1, Function2 function2) {
        coroutineContext.getClass();
        return V(bvcVar, function1, null, coroutineContext, new ioe(j, function2, (yje) null), 10);
    }

    public static final void d(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i3;
        fetVar.g0(-1507012116);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            wul wulVar = new wul(qul.e, oe9.c, new te9(i), true, false, false);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 2);
                fetVar.o0(objP);
            }
            qzb.n(mm40Var, wulVar, (Function0) objP, fetVar, i3 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a18(i, i2, mm40Var, function0);
        }
    }

    public static bby d0(vne vneVar, String str, long j, long j2, CoroutineContext coroutineContext, long j3, List list, Function1 function1, Function2 function2, int i) {
        CoroutineContext coroutineContext2;
        long j4 = (i & 4) != 0 ? 0L : j2;
        if ((i & 8) != 0) {
            rwj rwjVar = tvk.f34603a;
            coroutineContext2 = dvj.c;
        } else {
            coroutineContext2 = coroutineContext;
        }
        int i2 = (i & 16) != 0 ? Integer.MAX_VALUE : 3;
        long j5 = (i & 32) != 0 ? 3L : j3;
        List list2 = (i & 64) != 0 ? iun.f15405a : list;
        Function1 vzdVar = (i & 128) != 0 ? new vzd((byte) 10) : function1;
        vneVar.getClass();
        coroutineContext2.getClass();
        list2.getClass();
        return V(vneVar, vzdVar, null, coroutineContext2, new joe(j4, function2, list2, i2, str, j5, j, null), 10);
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1861445691);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "EVENT_CARD_CHAMP_LABEL_V1");
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarE0, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, (i2 >> 3) & 14, 24960, 110588);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i, (byte) 23);
        }
    }

    public static final bby e0(vne vneVar, long j, TimeUnit timeUnit, CoroutineContext coroutineContext, Function1 function1, Function2 function2, s4f s4fVar) {
        timeUnit.getClass();
        coroutineContext.getClass();
        function1.getClass();
        function2.getClass();
        return V(vneVar, function1, s4fVar, coroutineContext, new n1((Object) timeUnit, j, (Object) function2, (yje) null, (byte) 5), 8);
    }

    public static final void f(mm40 mm40Var, s3i s3iVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1763174076);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(s3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            l7m0 l7m0VarB = d43.b(s3iVar.f31559a == r8.f30001a ? 180.0f : 0.0f, ro4.m0(300, 0, null, 6), "Icon Rotation", null, fetVar2, 3120, 20);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 32.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getBackground0(), vgg0.a(10.0f));
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new p2i(function1, s3iVar, (byte) 0);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new x1d(l7m0VarB, (byte) 9);
                fetVar2.o0(objP2);
            }
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, i4w0.T(jm40.b, (Function1) objP2), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2i(mm40Var, s3iVar, function1, i, (byte) 0);
        }
    }

    public static bby f0(vne vneVar, long j, TimeUnit timeUnit, CoroutineContext coroutineContext, Function1 function1, Function2 function2, int i) {
        if ((i & 4) != 0) {
            rwj rwjVar = tvk.f34603a;
            coroutineContext = dvj.c;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i & 8) != 0) {
            function1 = new vzd((byte) 9);
        }
        return e0(vneVar, j, timeUnit, coroutineContext2, function1, function2, null);
    }

    public static final void g(mm40 mm40Var, x3i x3iVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        fetVar.g0(-1239271571);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(x3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = x3iVar.f40219a.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.ic_glyph_favourite_active;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i3 = R.drawable.ic_glyph_favourite_inactive;
            }
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l2i(function1, x3iVar, (byte) 1);
                fetVar.o0(objP);
            }
            d(i3, i2 & 14, fetVar, mm40Var, (Function0) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g2i(mm40Var, x3iVar, function1, i, (byte) 1);
        }
    }

    public static bby g0(bvc bvcVar, String str, CoroutineContext coroutineContext, Function1 function1, Function2 function2, int i) {
        boolean z = (i & 16) == 0;
        coroutineContext.getClass();
        return V(bvcVar, function1, null, coroutineContext, new koe(function2, z, 3, str, 3L, null), 8);
    }

    public static final void h(mm40 mm40Var, z3i z3iVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        fetVar.g0(1451293244);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(z3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = z3iVar.f43719a.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.ic_glyph_notification_active;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i3 = R.drawable.ic_glyph_notification_inactive;
            }
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new j2i(function1, z3iVar, (byte) 1);
                fetVar.o0(objP);
            }
            d(i3, i2 & 14, fetVar, mm40Var, (Function0) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k2i(mm40Var, z3iVar, function1, i, (byte) 1);
        }
    }

    public static bby h0(bvc bvcVar, String str, int i, Function2 function2, CoroutineContext coroutineContext, Function1 function1, Function0 function0, int i2) {
        if ((i2 & 128) != 0) {
            function0 = null;
        }
        coroutineContext.getClass();
        return V(bvcVar, function1, function0, coroutineContext, new loe(function2, i, str, 3L, null), 8);
    }

    public static final void i(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1628209098);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar), null, o7k0.n(jm40.b, 14.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i, (byte) 5);
        }
    }

    public static bby i0(vne vneVar, String str, int i, long j, List list, List list2, Function2 function2, Function0 function0, CoroutineContext coroutineContext, Function1 function1, Function0 function3, int i2) {
        CoroutineContext coroutineContext2;
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = i;
        long j2 = (i2 & 4) != 0 ? 3L : j;
        List list3 = (i2 & 8) != 0 ? iun.f15405a : list;
        List list4 = (i2 & 16) != 0 ? iun.f15405a : list2;
        Function0 function4 = (i2 & 64) != 0 ? null : function0;
        if ((i2 & 128) != 0) {
            rwj rwjVar = tvk.f34603a;
            coroutineContext2 = dvj.c;
        } else {
            coroutineContext2 = coroutineContext;
        }
        Function1 vzdVar = (i2 & 256) != 0 ? new vzd((byte) 12) : function1;
        Function0 function5 = (i2 & 512) != 0 ? null : function3;
        vneVar.getClass();
        list3.getClass();
        list4.getClass();
        coroutineContext2.getClass();
        return V(vneVar, vzdVar, function5, coroutineContext2, new moe(function2, list3, list4, i3, function4, str, j2, null), 8);
    }

    public static final void j(l0x l0xVar, y3d y3dVar, fet fetVar, int i) {
        long secondary;
        fetVar.g0(220762571);
        int i2 = (fetVar.g(l0xVar) ? 4 : 2) | i | (fetVar.g(y3dVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Drawable drawable = l0xVar.f19222a;
            if (drawable == null) {
                fetVar.e0(1142974324);
                fetVar.r(false);
            } else {
                fetVar.e0(1142974325);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = mym0.j(drawable);
                    fetVar.o0(objP);
                }
                pm80 pm80Var = (pm80) objP;
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(jm40.b, 14.0f);
                if (y3dVar == null) {
                    fetVar.e0(-1017874589);
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1017875674);
                    fetVar.r(false);
                    secondary = y3dVar.f41946a;
                }
                dww.c(pm80Var, null, mm40VarN, secondary, fetVar, 56, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2i(l0xVar, y3dVar, i, b);
        }
    }

    public static final ArrayList j0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tiw tiwVar = (tiw) it.next();
            List list2 = tiwVar.f34025a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (Q((d0t) obj)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (tiwVar.g.contains(Long.valueOf(((d0t) obj2).f5282a))) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new vbb(tiwVar, (d0t) it2.next()));
            }
            w3d.u(arrayList, arrayList4);
        }
        return arrayList;
    }

    public static final void k(m0x m0xVar, y3d y3dVar, fet fetVar, int i) {
        long secondary;
        fetVar.g0(-979132107);
        int i2 = (fetVar.g(m0xVar) ? 4 : 2) | i | (fetVar.g(y3dVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objF = a8k0.F(m0xVar.f20977a, 0, fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                fetVar.o0(objF);
            } else {
                objF = objP;
            }
            pm80 pm80Var = (pm80) objF;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 14.0f);
            if (y3dVar == null) {
                fetVar.e0(-348106562);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(-348107647);
                fetVar.r(false);
                secondary = y3dVar.f41946a;
            }
            dww.c(pm80Var, null, mm40VarN, secondary, fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r2i(m0xVar, y3dVar, i, b);
        }
    }

    public static final l7m0 k0(l7m0 l7m0Var, boolean z, fet fetVar, int i) {
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
        long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU();
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = m5k0.a(z ? primary : jM75getBlack600d7_KjU);
            fetVar.o0(objP);
        }
        t33 t33Var = (t33) objP;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zF = ((((i & 112) ^ 48) > 32 && fetVar.h(z)) || (i & 48) == 32) | fetVar.f(primary) | fetVar.f(jM75getBlack600d7_KjU) | fetVar.i(t33Var);
        Object objP2 = fetVar.P();
        if (zF || objP2 == obj) {
            Object mo0Var = new mo0(z, primary, jM75getBlack600d7_KjU, t33Var, (yje) null);
            fetVar.o0(mo0Var);
            objP2 = mo0Var;
        }
        m0x0.t(fetVar, boolValueOf, (Function2) objP2);
        boolean zI = fetVar.i(t33Var) | ((((i & 14) ^ 6) > 4 && fetVar.g(l7m0Var)) || (i & 6) == 4) | fetVar.f(primary) | fetVar.f(jM75getBlack600d7_KjU);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            l7m0Var2 = l7m0Var;
            Object xw4Var = new xw4((byte) 1, primary, jM75getBlack600d7_KjU, null, l7m0Var2, t33Var);
            t33Var = t33Var;
            fetVar.o0(xw4Var);
            objP3 = xw4Var;
        } else {
            l7m0Var2 = l7m0Var;
        }
        m0x0.t(fetVar, l7m0Var2, (Function2) objP3);
        Object objP4 = fetVar.P();
        if (objP4 == obj) {
            objP4 = jgk0.b(new svc(t33Var, (byte) 3));
            fetVar.o0(objP4);
        }
        return (l7m0) objP4;
    }

    public static final void l(mm40 mm40Var, kuj kujVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        kujVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        zvw.k(mm40Var, kujVar.b, false, qdzVar.b(kujVar.f18913a, new zuh((byte) 22), fetVar, i & 896), s5x0.t(xfn.a(fetVar).c, 0.0f, 2), function1, fetVar, (i & 14) | 384 | ((i << 6) & 458752), 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l0(File file, Function1 function1, zje zjeVar) throws IOException {
        wzp wzpVar;
        if (zjeVar instanceof wzp) {
            wzpVar = (wzp) zjeVar;
            int i = wzpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wzpVar.k = i - Integer.MIN_VALUE;
            } else {
                wzpVar = new wzp(zjeVar);
            }
        } else {
            wzpVar = new wzp(zjeVar);
        }
        Object obj = wzpVar.j;
        Object obj2 = wne.f39444a;
        int i2 = wzpVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                wzpVar.i = file;
                wzpVar.k = 1;
                Object objInvoke = function1.invoke(wzpVar);
                return objInvoke == obj2 ? obj2 : objInvoke;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file2 = wzpVar.i;
            z1x.P(obj);
            return obj;
        } catch (IOException e) {
            if (e instanceof soe) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw d5c.E(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw d5c.E(file, e);
                    }
                    throw d5c.E(file, e);
                }
                if (file.canWrite()) {
                    throw d5c.E(file, e);
                }
                throw d5c.E(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw d5c.E(file, e);
                }
                throw d5c.E(file, e);
            }
            if (file.canWrite()) {
                throw d5c.E(file, e);
            }
            throw d5c.E(file, e);
        }
    }

    public static final void m(mm40 mm40Var, prk prkVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        prkVar.getClass();
        function1.getClass();
        fetVar.g0(-837793884);
        int i2 = i | 6 | (fetVar.g(prkVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, backgroundContent, vgg0.a(24.0f)), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            eoa eoaVar = prkVar.b;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ynk(function1, (byte) 3);
                fetVar.o0(objP);
            }
            ntr.m(null, eoaVar, (Function1) objP, fetVar, 0, 1);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, prkVar, function1, i, (byte) 13);
        }
    }

    public static final v1o0 m0(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        v1o0 q1o0Var;
        Object objValueOf = Integer.valueOf(R.drawable.ic_card_shirt);
        d0tVar.getClass();
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        zum yumVar = xum.f41518a;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            i4i i4iVarQ = afn0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            List listG0 = nia0.g0(aac.X(d0tVar, dmr.A));
            String strX = aac.X(d0tVar, dmr.r);
            String strX2 = aac.X(d0tVar, dmr.w);
            String strX3 = aac.X(d0tVar, dmr.s);
            String strX4 = aac.X(d0tVar, dmr.z);
            String strC0 = qzb.c0(d0tVar);
            List listG1 = nia0.g0(strX);
            ArrayList arrayList = new ArrayList(r3d.q(listG1, 10));
            Iterator it = listG1.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(jwb.P((vua) it.next()).f19696a));
            }
            int iIntValue = ((Number) (arrayList.size() > 0 ? arrayList.get(0) : objValueOf)).intValue();
            List listG2 = nia0.g0(strX);
            ArrayList arrayList2 = new ArrayList(r3d.q(listG2, 10));
            Iterator it2 = listG2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(jwb.P((vua) it2.next()).f19696a));
            }
            gvm gvmVar = new gvm(strC0, iIntValue, ((Number) (1 < arrayList2.size() ? arrayList2.get(1) : objValueOf)).intValue(), aac.S(strX2));
            String strR0 = qzb.r0(d0tVar);
            List listG3 = nia0.g0(strX3);
            ArrayList arrayList3 = new ArrayList(r3d.q(listG3, 10));
            Iterator it3 = listG3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(jwb.P((vua) it3.next()).f19696a));
            }
            int iIntValue2 = ((Number) (arrayList3.size() > 0 ? arrayList3.get(0) : objValueOf)).intValue();
            List listG4 = nia0.g0(strX3);
            ArrayList arrayList4 = new ArrayList(r3d.q(listG4, 10));
            Iterator it4 = listG4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Integer.valueOf(jwb.P((vua) it4.next()).f19696a));
            }
            if (1 < arrayList4.size()) {
                objValueOf = arrayList4.get(1);
            }
            gvm gvmVar2 = new gvm(strR0, iIntValue2, ((Number) objValueOf).intValue(), aac.S(strX4));
            kpm kpmVarS = kpb.S(d0tVar);
            String strA = d0tVar.h ? ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)) : "";
            String strX5 = aac.X(d0tVar, dmr.u);
            a4x a4xVarU = aac.U(listG0);
            if (qzb.H0(d0tVar)) {
                long jR0 = kpb.r0(d0tVar);
                fgm fgmVar = fgm.f9498a;
                yumVar = new yum(jR0);
            }
            q1o0Var = new q1o0(j, i4iVarQ, new e2o0(gvmVar, gvmVar2, kpmVarS, strA, strX5, a4xVarU, yumVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            long j2 = d0tVar.f5282a;
            j4i j4iVarU = afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z2, z3, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            String strX6 = aac.X(d0tVar, dmr.A);
            rqs rqsVar = d0tVar.p;
            List listG5 = nia0.g0(strX6);
            String strX7 = aac.X(d0tVar, dmr.r);
            String strX8 = aac.X(d0tVar, dmr.w);
            String strX9 = aac.X(d0tVar, dmr.s);
            String strX10 = aac.X(d0tVar, dmr.z);
            String strC1 = qzb.c0(d0tVar);
            List listG6 = nia0.g0(strX7);
            ArrayList arrayList5 = new ArrayList(r3d.q(listG6, 10));
            Iterator it5 = listG6.iterator();
            while (it5.hasNext()) {
                arrayList5.add(Integer.valueOf(jwb.P((vua) it5.next()).f19696a));
            }
            int iIntValue3 = ((Number) (arrayList5.size() > 0 ? arrayList5.get(0) : objValueOf)).intValue();
            List listG7 = nia0.g0(strX7);
            ArrayList arrayList6 = new ArrayList(r3d.q(listG7, 10));
            Iterator it6 = listG7.iterator();
            while (it6.hasNext()) {
                arrayList6.add(Integer.valueOf(jwb.P((vua) it6.next()).f19696a));
            }
            hvm hvmVar = new hvm(iIntValue3, ((Number) (1 < arrayList6.size() ? arrayList6.get(1) : objValueOf)).intValue(), strC1, aac.S(strX8), kpb.R(d0tVar).f33307a, rqsVar.t);
            String strR1 = qzb.r0(d0tVar);
            List listG8 = nia0.g0(strX9);
            ArrayList arrayList7 = new ArrayList(r3d.q(listG8, 10));
            Iterator it7 = listG8.iterator();
            while (it7.hasNext()) {
                arrayList7.add(Integer.valueOf(jwb.P((vua) it7.next()).f19696a));
            }
            int iIntValue4 = ((Number) (arrayList7.size() > 0 ? arrayList7.get(0) : objValueOf)).intValue();
            List listG9 = nia0.g0(strX9);
            ArrayList arrayList8 = new ArrayList(r3d.q(listG9, 10));
            Iterator it8 = listG9.iterator();
            while (it8.hasNext()) {
                arrayList8.add(Integer.valueOf(jwb.P((vua) it8.next()).f19696a));
            }
            if (1 < arrayList8.size()) {
                objValueOf = arrayList8.get(1);
            }
            hvm hvmVar2 = new hvm(iIntValue4, ((Number) objValueOf).intValue(), strR1, aac.S(strX10), kpb.R(d0tVar).b, rqsVar.u);
            String strX11 = aac.X(d0tVar, dmr.u);
            a4x a4xVarU2 = aac.U(listG5);
            if (qzb.H0(d0tVar)) {
                long jR1 = kpb.r0(d0tVar);
                fgm fgmVar2 = fgm.f9498a;
                yumVar = new yum(jR1);
            }
            q1o0Var = new u1o0(j2, j4iVarU, new k3o0(hvmVar, hvmVar2, strX11, a4xVarU2, yumVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 2) {
            e4i e4iVar = null;
            if (iOrdinal == 3) {
                long j3 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                String strA2 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                boolean zB0 = kpb.b0(d0tVar, z);
                boolean zD0 = kpb.d0(d0tVar, z);
                boolean zA0 = kpb.a0(d0tVar, z, z4);
                if (qzb.H0(d0tVar)) {
                    long jR2 = kpb.r0(d0tVar);
                    fgm fgmVar3 = fgm.f9498a;
                    e4iVar = new e4i(24, jR2, d0tVar.P.getTime(), false);
                }
                l4i l4iVarS = afn0.s(e4iVar, d0tVar, str, "", strA2, str2, list, z2, z3, true, zB0, zD0, zA0, kpb.f0(d0tVar, z));
                List listG10 = nia0.g0(aac.X(d0tVar, dmr.A));
                String strX12 = aac.X(d0tVar, dmr.r);
                String strX13 = aac.X(d0tVar, dmr.w);
                String strX14 = aac.X(d0tVar, dmr.s);
                String strX15 = aac.X(d0tVar, dmr.z);
                String strC2 = qzb.c0(d0tVar);
                List listG11 = nia0.g0(strX12);
                ArrayList arrayList9 = new ArrayList(r3d.q(listG11, 10));
                Iterator it9 = listG11.iterator();
                while (it9.hasNext()) {
                    arrayList9.add(Integer.valueOf(jwb.P((vua) it9.next()).f19696a));
                }
                int iIntValue5 = ((Number) (arrayList9.size() > 0 ? arrayList9.get(0) : objValueOf)).intValue();
                List listG12 = nia0.g0(strX12);
                ArrayList arrayList10 = new ArrayList(r3d.q(listG12, 10));
                Iterator it10 = listG12.iterator();
                while (it10.hasNext()) {
                    arrayList10.add(Integer.valueOf(jwb.P((vua) it10.next()).f19696a));
                }
                jvm jvmVar = new jvm(strC2, iIntValue5, ((Number) (1 < arrayList10.size() ? arrayList10.get(1) : objValueOf)).intValue(), aac.S(strX13));
                String strR2 = qzb.r0(d0tVar);
                List listG13 = nia0.g0(strX14);
                ArrayList arrayList11 = new ArrayList(r3d.q(listG13, 10));
                Iterator it11 = listG13.iterator();
                while (it11.hasNext()) {
                    arrayList11.add(Integer.valueOf(jwb.P((vua) it11.next()).f19696a));
                }
                int iIntValue6 = ((Number) (arrayList11.size() > 0 ? arrayList11.get(0) : objValueOf)).intValue();
                List listG14 = nia0.g0(strX14);
                ArrayList arrayList12 = new ArrayList(r3d.q(listG14, 10));
                Iterator it12 = listG14.iterator();
                while (it12.hasNext()) {
                    arrayList12.add(Integer.valueOf(jwb.P((vua) it12.next()).f19696a));
                }
                if (1 < arrayList12.size()) {
                    objValueOf = arrayList12.get(1);
                }
                q1o0Var = new s1o0(j3, l4iVarS, new u2o0(jvmVar, new jvm(strR2, iIntValue6, ((Number) objValueOf).intValue(), aac.S(strX15)), kpb.C(d0tVar), aac.X(d0tVar, dmr.u), aac.U(listG10)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                long j4 = d0tVar.f5282a;
                k4i k4iVarR = afn0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
                List listG15 = nia0.g0(aac.X(d0tVar, dmr.A));
                String strX16 = aac.X(d0tVar, dmr.r);
                String strX17 = aac.X(d0tVar, dmr.w);
                String strX18 = aac.X(d0tVar, dmr.s);
                String strX19 = aac.X(d0tVar, dmr.z);
                String strC3 = qzb.c0(d0tVar);
                List listG16 = nia0.g0(strX16);
                ArrayList arrayList13 = new ArrayList(r3d.q(listG16, 10));
                Iterator it13 = listG16.iterator();
                while (it13.hasNext()) {
                    arrayList13.add(Integer.valueOf(jwb.P((vua) it13.next()).f19696a));
                }
                int iIntValue7 = ((Number) (arrayList13.size() > 0 ? arrayList13.get(0) : objValueOf)).intValue();
                List listG17 = nia0.g0(strX16);
                ArrayList arrayList14 = new ArrayList(r3d.q(listG17, 10));
                Iterator it14 = listG17.iterator();
                while (it14.hasNext()) {
                    arrayList14.add(Integer.valueOf(jwb.P((vua) it14.next()).f19696a));
                }
                kvm kvmVar = new kvm(strC3, iIntValue7, ((Number) (1 < arrayList14.size() ? arrayList14.get(1) : objValueOf)).intValue(), aac.S(strX17));
                String strR3 = qzb.r0(d0tVar);
                List listG18 = nia0.g0(strX18);
                ArrayList arrayList15 = new ArrayList(r3d.q(listG18, 10));
                Iterator it15 = listG18.iterator();
                while (it15.hasNext()) {
                    arrayList15.add(Integer.valueOf(jwb.P((vua) it15.next()).f19696a));
                }
                int iIntValue8 = ((Number) (arrayList15.size() > 0 ? arrayList15.get(0) : objValueOf)).intValue();
                List listG19 = nia0.g0(strX18);
                ArrayList arrayList16 = new ArrayList(r3d.q(listG19, 10));
                Iterator it16 = listG19.iterator();
                while (it16.hasNext()) {
                    arrayList16.add(Integer.valueOf(jwb.P((vua) it16.next()).f19696a));
                }
                if (1 < arrayList16.size()) {
                    objValueOf = arrayList16.get(1);
                }
                kvm kvmVar2 = new kvm(strR3, iIntValue8, ((Number) objValueOf).intValue(), aac.S(strX19));
                y1m y1mVarC = kpb.C(d0tVar);
                String strX20 = aac.X(d0tVar, dmr.u);
                a4x a4xVarU3 = aac.U(listG15);
                if (qzb.H0(d0tVar)) {
                    long jR3 = kpb.r0(d0tVar);
                    fgm fgmVar4 = fgm.f9498a;
                    yumVar = new yum(jR3);
                }
                q1o0Var = new r1o0(j4, k4iVarR, new m2o0(kvmVar, kvmVar2, y1mVarC, strX20, a4xVarU3, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), yumVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j5 = d0tVar.f5282a;
            k4i k4iVarT = afn0.t(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            List listG20 = nia0.g0(aac.X(d0tVar, dmr.A));
            String strX21 = aac.X(d0tVar, dmr.r);
            String strX22 = aac.X(d0tVar, dmr.w);
            String strX23 = aac.X(d0tVar, dmr.s);
            String strX24 = aac.X(d0tVar, dmr.z);
            String strC4 = qzb.c0(d0tVar);
            List listG21 = nia0.g0(strX21);
            ArrayList arrayList17 = new ArrayList(r3d.q(listG21, 10));
            Iterator it17 = listG21.iterator();
            while (it17.hasNext()) {
                arrayList17.add(Integer.valueOf(jwb.P((vua) it17.next()).f19696a));
            }
            int iIntValue9 = ((Number) (arrayList17.size() > 0 ? arrayList17.get(0) : objValueOf)).intValue();
            List listG22 = nia0.g0(strX21);
            ArrayList arrayList18 = new ArrayList(r3d.q(listG22, 10));
            Iterator it18 = listG22.iterator();
            while (it18.hasNext()) {
                arrayList18.add(Integer.valueOf(jwb.P((vua) it18.next()).f19696a));
            }
            ivm ivmVar = new ivm(strC4, iIntValue9, ((Number) (1 < arrayList18.size() ? arrayList18.get(1) : objValueOf)).intValue(), aac.S(strX22));
            String strR4 = qzb.r0(d0tVar);
            List listG23 = nia0.g0(strX23);
            ArrayList arrayList19 = new ArrayList(r3d.q(listG23, 10));
            Iterator it19 = listG23.iterator();
            while (it19.hasNext()) {
                arrayList19.add(Integer.valueOf(jwb.P((vua) it19.next()).f19696a));
            }
            int iIntValue10 = ((Number) (arrayList19.size() > 0 ? arrayList19.get(0) : objValueOf)).intValue();
            List listG24 = nia0.g0(strX23);
            ArrayList arrayList20 = new ArrayList(r3d.q(listG24, 10));
            Iterator it20 = listG24.iterator();
            while (it20.hasNext()) {
                arrayList20.add(Integer.valueOf(jwb.P((vua) it20.next()).f19696a));
            }
            if (1 < arrayList20.size()) {
                objValueOf = arrayList20.get(1);
            }
            ivm ivmVar2 = new ivm(strR4, iIntValue10, ((Number) objValueOf).intValue(), aac.S(strX24));
            kpm kpmVarS2 = kpb.S(d0tVar);
            String strX25 = aac.X(d0tVar, dmr.u);
            a4x a4xVarU4 = aac.U(listG20);
            String strA3 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            if (qzb.H0(d0tVar)) {
                long jR4 = kpb.r0(d0tVar);
                fgm fgmVar5 = fgm.f9498a;
                yumVar = new yum(jR4);
            }
            q1o0Var = new t1o0(j5, k4iVarT, new c3o0(ivmVar, ivmVar2, kpmVarS2, strX25, a4xVarU4, strA3, yumVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return q1o0Var;
    }

    public static final void n(mm40 mm40Var, gw1 gw1Var, kw1 kw1Var, hh80 hh80Var, Function0 function0, fet fetVar, int i) {
        hh80 hh80Var2;
        fet fetVar2;
        List listD0;
        jjm ijmVar;
        mm40 mm40Var2;
        mm40 mm40VarN;
        fet fetVar3;
        boolean z;
        fet fetVar4;
        mm40 mm40Var3;
        function0.getClass();
        fetVar.g0(-490431965);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(gw1Var.ordinal()) ? 32 : 16) | (fetVar.g(kw1Var) ? 256 : 128) | 3072 | (fetVar.i(function0) ? 16384 : 8192) | 196608;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            lh80 lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
            boolean z2 = kw1Var instanceof iw1;
            if (z2) {
                listD0 = CollectionsKt.D0(((iw1) kw1Var).c, 5);
            } else {
                if (!(kw1Var instanceof jw1)) {
                    t9f.b();
                    return;
                }
                ArrayList arrayList = new ArrayList(5);
                for (int i3 = 0; i3 < 5; i3++) {
                    arrayList.add(wv1.f39817a);
                }
                listD0 = arrayList;
            }
            mm40 mm40VarD = o7k0.d(s5x0.I(mm40Var, lh80Var), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN2 = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN3 = jm40.b;
            mm40 mm40VarG = o7k0.g(s5x0.L(o7k0.d(mm40VarN3, 1.0f), qmk.a(fetVar).e, 0.0f, 2), 40.0f, 0.0f, 2);
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar.e0(-795101315);
                iw1 iw1Var = (iw1) kw1Var;
                String str = iw1Var.b;
                boolean zG = fetVar.g(str);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = str.length() > 0 ? new ue9(str) : null;
                    fetVar.o0(objP);
                }
                ijmVar = new hjm(iw1Var.f15467a, null, null, null, null, null, false, null, null, false, (ue9) objP, null, 7166);
                fetVar.r(false);
            } else {
                fetVar.e0(-1549650942);
                fetVar.r(false);
                ijmVar = new ijm();
            }
            List list = listD0;
            fet fetVar5 = fetVar;
            boolean z3 = true;
            z3 = true;
            nkb.h(mm40VarG, ijmVar, kjm.f18392a, null, function0, null, fetVar5, (i2 & 57344) | 384, 40);
            int iOrdinal = gw1Var.ordinal();
            if (iOrdinal != 0) {
                byte b = 14;
                if (iOrdinal != 1) {
                    byte b2 = 3;
                    if (iOrdinal == 2) {
                        fetVar5.e0(-792694754);
                        qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
                        lh80 lh80VarT = s5x0.t(qmk.a(fetVar5).c, 0.0f, 2);
                        boolean zI = fetVar5.i(list);
                        Object objP2 = fetVar5.P();
                        Object obj = objP2;
                        if (zI || objP2 == cl5Var) {
                            gg4 gg4Var = new gg4(list, b2);
                            fetVar5.o0(gg4Var);
                            obj = gg4Var;
                        }
                        z = true;
                        b8k0.f(null, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) obj, fetVar, 0, Response.REQUEST_PENDING);
                        fet fetVar6 = fetVar;
                        fetVar6.r(false);
                        fetVar4 = fetVar6;
                    } else {
                        if (iOrdinal != 3) {
                            throw b1j.f(-1549643754, fetVar5, false);
                        }
                        fetVar5.e0(-792085945);
                        int i4 = 0;
                        for (Object obj2 : list) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            xv1 xv1Var = (xv1) obj2;
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarL = s5x0.L(mm40VarN3, qmk.a(fetVar5).c, 0.0f, 2);
                            if (i4 > 0) {
                                mm40 mm40Var4 = mm40VarN3;
                                mm40VarN3 = s5x0.N(mm40Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                                mm40Var3 = mm40Var4;
                            } else {
                                mm40Var3 = mm40VarN3;
                            }
                            knx.d(mm40VarL.e(mm40VarN3), i4, xv1Var, fetVar5, 3072);
                            i4 = i5;
                            mm40VarN3 = mm40Var3;
                        }
                        fetVar5.r(false);
                        fetVar3 = fetVar5;
                    }
                } else {
                    fetVar5.e0(-793557267);
                    mm40 mm40VarE0 = o2e.e0(o7k0.s(o7k0.e(mm40VarN3, 124.0f), 172.0f), "CATEGORY_PRIZE_ICON_L");
                    qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
                    lh80 lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
                    boolean zI2 = fetVar5.i(list) | fetVar5.g(mm40VarE0);
                    Object objP3 = fetVar5.P();
                    Object obj3 = objP3;
                    if (zI2 || objP3 == cl5Var) {
                        dpl dplVar = new dpl(list, mm40VarE0, z3 ? (byte) 1 : (byte) 0);
                        fetVar5.o0(dplVar);
                        obj3 = dplVar;
                    }
                    z = true;
                    b8k0.f(null, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) obj3, fetVar, 0, Response.REQUEST_PENDING);
                    fet fetVar7 = fetVar;
                    fetVar7.r(false);
                    fetVar4 = fetVar7;
                }
                z3 = z;
                fetVar3 = fetVar4;
            } else {
                mm40 mm40Var5 = mm40VarN3;
                fetVar5.e0(-794312365);
                int i6 = 0;
                for (Object obj4 : list) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        q3d.p();
                        throw null;
                    }
                    xv1 xv1Var2 = (xv1) obj4;
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarL2 = s5x0.L(mm40Var5, qmk.a(fetVar5).c, 0.0f, 2);
                    if (i6 > 0) {
                        mm40Var2 = mm40Var5;
                        mm40VarN = s5x0.N(mm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    } else {
                        mm40Var2 = mm40Var5;
                        mm40VarN = mm40Var2;
                    }
                    cjx.c(mm40VarL2.e(mm40VarN), xv1Var2, fetVar5, 384);
                    i6 = i7;
                    mm40Var5 = mm40Var2;
                }
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            fetVar3.r(z3);
            hh80Var2 = lh80Var;
            fetVar2 = fetVar3;
        } else {
            fet fetVar8 = fetVar;
            fetVar8.X();
            hh80Var2 = hh80Var;
            fetVar2 = fetVar8;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) gw1Var, (Object) kw1Var, (Object) hh80Var2, function0, i, (byte) 7);
        }
    }

    public static final dal n0(m9s m9sVar, y9l y9lVar, y9l y9lVar2) {
        String str;
        m9sVar.getClass();
        y9lVar.getClass();
        y9lVar2.getClass();
        String str2 = m9sVar.i;
        String str3 = (String) CollectionsKt.firstOrNull(m9sVar.m);
        if (str3 == null) {
            str3 = "";
            str = str3;
        } else {
            str = "";
        }
        int i = y9lVar.f;
        String str4 = str;
        int i2 = y9lVar.g;
        i6l i6lVar = y9lVar.f42253a;
        int[] iArr = vog.f37764a;
        j6l j6lVar = iArr[i6lVar.ordinal()] == 1 ? j6l.f15993a : j6l.b;
        String str5 = m9sVar.j;
        String str6 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str6 == null) {
            str6 = str4;
        }
        return new dal(str2, str3, i, i2, j6lVar, str5, str6, y9lVar2.f, y9lVar2.g, iArr[y9lVar2.f42253a.ordinal()] == 1 ? j6l.f15993a : j6l.b);
    }

    public static final void o(int i, fet fetVar) {
        fetVar.g0(2083172212);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), 48.0f), 12.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 9);
        }
    }

    public static final ftr o0(List list, ctf0 ctf0Var, List list2, boolean z) {
        y9n y9nVar;
        x9n u9nVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
        list.getClass();
        ctf0Var.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pbv pbvVar = (pbv) it.next();
            String str = pbvVar.f;
            hcs hcsVar = pbvVar.d;
            boolean z2 = pbvVar.o;
            long j = pbvVar.f26728a;
            hds hdsVar = pbvVar.n;
            boolean z3 = false;
            if (wvb.O(str) > 1.0d) {
                String strA = ctf0Var.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var = pn40.f27267a;
                y9nVar = new y9n(strA, "x".concat(pn40.c(wvb.O(pbvVar.f), p3u0.c)));
            } else {
                y9nVar = null;
            }
            if (!list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((i8p) it2.next()).f14350a == j) {
                        z3 = true;
                        break;
                    }
                }
            }
            boolean z4 = z3;
            if (pbvVar.p) {
                u9nVar = new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z2 ? p9n.DEMO : null, cww.K(hcsVar));
            } else {
                u9nVar = new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z2 ? p9n.DEMO : null, cww.K(hcsVar), y9nVar);
            }
            String str2 = pbvVar.c;
            arrayList.add(new l9n(j, u9nVar, z ? new g9n(str2, z4) : new h9n(str2)));
        }
        return new ftr(dyb.o0(arrayList));
    }

    public static final void p(mm40 mm40Var, eqm eqmVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z;
        long secondary;
        fet fetVar2 = fetVar;
        eqmVar.getClass();
        fetVar2.g0(413905996);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(eqmVar) ? 32 : 16);
        if (fetVar2.U(i5 & 1, (i5 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var2, 24.0f), 28.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS2 = i120.S(i120.Q(mm40VarS, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS2);
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
            if (eqmVar instanceof cqm) {
                fetVar2.e0(-386900771);
                cqm cqmVar = (cqm) eqmVar;
                pm80 pm80VarF = a8k0.F(cqmVar.f4801a, 0, fetVar2);
                y3d y3dVar = cqmVar.b;
                fetVar2.e0(-982305888);
                fetVar2.r(false);
                dww.c(pm80VarF, null, o7k0.n(jm40Var, 18.0f), y3dVar.f41946a, fetVar2, 56, 0);
                fetVar2.r(false);
                z = true;
            } else if (eqmVar instanceof dqm) {
                fetVar2.e0(-386506513);
                dqm dqmVar = (dqm) eqmVar;
                String str = dqmVar.f6523a;
                y3d y3dVar2 = dqmVar.b;
                if (y3dVar2 == null) {
                    fetVar2.e0(-982296261);
                    secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-982297408);
                    fetVar2.r(false);
                    secondary = y3dVar2.f41946a;
                }
                z = true;
                v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                if (!eqmVar.equals(bqm.f3038a)) {
                    throw b1j.f(-982313940, fetVar2, false);
                }
                fetVar2.e0(-386209874);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40Var2 = mm40Var2;
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aqm(mm40Var2, eqmVar, i, i2, (byte) 0);
        }
    }

    public static final hkw p0(vbb vbbVar, ikw ikwVar) {
        Object next;
        d0t d0tVar = vbbVar.b;
        List list = vbbVar.f37133a.f;
        List listJ = q3d.j(d0tVar.q, d0tVar.r);
        ArrayList<f0t> arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!((f0t) obj).c.isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (f0t f0tVar : arrayList) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((wvp) next).f39848a != f0tVar.f8731a);
            wvp wvpVar = (wvp) next;
            if (wvpVar != null) {
                arrayList2.add(wvpVar);
            }
        }
        return new hkw(d0tVar, ikwVar, arrayList2);
    }

    public static final void q(mm40 mm40Var, pwm pwmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(1238082646);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pwmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (pwmVar.f) {
                fetVar.e0(91487901);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(91488825);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-831092842, new wvm(mm40Var, pwmVar, (byte) 6), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 8, i, mm40Var, pwmVar);
        }
    }

    public static final uv20 q0(mu20 mu20Var, boolean z, y9q0 y9q0Var) {
        long j = mu20Var.b;
        String str = mu20Var.c;
        if (z) {
            str = "[" + j + "]: " + str;
        }
        String str2 = str;
        boolean z2 = mu20Var.e;
        Iterator it = mu20Var.f22394a.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        return new uv20(j, str2, false, z2, size, mu20Var.d ? sv20.f32848a : qv20.f29369a, false, null, y9q0Var);
    }

    public static final void r(mm40 mm40Var, k1n k1nVar, k1n k1nVar2, a2m a2mVar, String str, String str2, String str3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        x0m x0mVar = x0m.f40076a;
        a2mVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        fetVar2.g0(-82322692);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(k1nVar) ? 32 : 16) | (fetVar2.g(k1nVar2) ? 256 : 128) | (fetVar2.g(a2mVar) ? 2048 : 1024) | (fetVar2.g(str) ? 16384 : 8192) | (fetVar2.g(str2) ? 131072 : 65536) | (fetVar2.g(str3) ? 1048576 : 524288) | (fetVar2.e(0) ? 8388608 : 4194304);
        if (fetVar2.U(i2 & 1, (4793491 & i2) != 4793490)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i3 = i2 & 8176;
            int i4 = i2 >> 9;
            D(null, k1nVar, k1nVar2, a2mVar, fetVar2, (57344 & i4) | i3);
            fetVar2 = fetVar2;
            if (str.length() <= 0 && str2.length() <= 0 && str3.length() <= 0) {
                fetVar2.e0(-1514410128);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1514585030);
                sj3.p(i4 & 8176, 1, fetVar2, null, str, str2, str3);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0(mm40Var, k1nVar, k1nVar2, a2mVar, str, str2, str3, i);
        }
    }

    public static final int r0(wxl wxlVar) {
        wxlVar.getClass();
        switch (wxlVar) {
            case PRIMARY:
            case PRIMARY_VALUE:
                return R.style.DSChip_Primary;
            case SECONDARY:
            case SECONDARY_VALUE:
                return R.style.DSChip_Secondary;
            case TERTIARY:
            case TERTIARY_VALUE:
                return R.style.DSChip_Tertiary;
            case OVERLAY:
            case OVERLAY_VALUE:
                return R.style.DSChip_Overlay;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final void s(v0o0 v0o0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-534225750);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(v0o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = l5o.f19468a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) v0o0Var, (byte) 12);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(v0o0Var, i, (byte) 5);
        }
    }

    public static final wxl s0(wxl wxlVar) {
        wxlVar.getClass();
        switch (wxlVar) {
            case PRIMARY:
                return wxl.PRIMARY_VALUE;
            case PRIMARY_VALUE:
                return wxl.PRIMARY_VALUE;
            case SECONDARY:
                return wxl.SECONDARY_VALUE;
            case SECONDARY_VALUE:
                return wxl.SECONDARY_VALUE;
            case TERTIARY:
                return wxl.TERTIARY_VALUE;
            case TERTIARY_VALUE:
                return wxl.TERTIARY_VALUE;
            case OVERLAY:
                return wxl.OVERLAY_VALUE;
            case OVERLAY_VALUE:
                return wxl.OVERLAY_VALUE;
            default:
                t9f.b();
                return null;
        }
    }

    public static final void t(mm40 mm40Var, ah7 ah7Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        pcy pcyVar;
        ah7 ah7Var2 = ah7Var;
        fet fetVar2 = fetVar;
        ah7Var2.getClass();
        function0.getClass();
        fetVar2.g0(1880080674);
        int i2 = i | 6 | (fetVar2.g(ah7Var2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarQ, 256.0f);
            ymx ymxVar = ymx.INTERVAL_500;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbn(function0, (byte) 4);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarS, ymxVar, null, false, null, (Function0) objP, fetVar2, 25008, 4);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            v8q0.a(ah7Var2.b, s5x0.K(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary20(), vgg0.c(12.0f, 12.0f, 0.0f, 0.0f, 12)), 8.0f, 6.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.g(), fetVar2), fetVar, 0, 24960, 109564);
            mm40 mm40VarJ = s5x0.J(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.c(0.0f, 0.0f, 12.0f, 12.0f, 3)), 8.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pcy pcyVar3 = pcyVar;
            v8q0.a(ah7Var.c, null, 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, 0, 24960, 109566);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            ah7Var2 = ah7Var;
            v8q0.a(ah7Var2.d, ohs0.i(fetVar, mm40VarC2, shdVar4, 1.0f, true), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.a(), fetVar), fetVar, 0, 24960, 109564);
            v8q0.a(ah7Var2.e, s5x0.N(yyw.U(jm40Var, 0.4f), 8.0f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.a(), fetVar), fetVar, 0, 24960, 109564);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var2, ah7Var2, function0, i, (byte) 5);
        }
    }

    public static final boolean t0(Throwable th, Function0 function0) {
        dik dikVar;
        th.getClass();
        List listB = uc9.u.b(th);
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listB.get(i)) instanceof dik) {
                return false;
            }
        }
        try {
            ikd ikdVar = (ikd) function0.invoke();
            if (ikdVar != null) {
                boolean z2 = ikdVar.b;
                List list = ikdVar.f14920a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((kkd) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                ikdVar.getClass();
                dikVar = new dik(ikdVar);
            } else {
                dikVar = null;
            }
        } catch (Throwable th2) {
            dikVar = th2;
        }
        if (dikVar != null) {
            tjo.a(th, dikVar);
        }
        return z;
    }

    public static final void u(final mm40 mm40Var, final l3w l3wVar, final wul wulVar, final Function0 function0, fet fetVar, final int i) {
        mm40 mm40Var2;
        l3w l3wVar2;
        final wul wulVar2;
        final Function0 function1;
        function0.getClass();
        fetVar.g0(-1824730089);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l3wVar) ? 32 : 16) | (fetVar.g(wulVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40Var2 = mm40Var;
            l3wVar2 = l3wVar;
            wulVar2 = wulVar;
            function1 = function0;
            fetVar.X();
        } else {
            if (l3wVar == null && wulVar == null) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b2 = 0;
                    yfe0VarU.d = new Function2(mm40Var, l3wVar, wulVar, function0, i, b2) { // from class: a.zto

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f44970a;
                        public final /* synthetic */ mm40 b;
                        public final /* synthetic */ l3w c;
                        public final /* synthetic */ wul d;
                        public final /* synthetic */ Function0 e;

                        {
                            this.f44970a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f44970a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iL = x8x.L(1);
                                    sac.u(this.b, this.c, this.d, this.e, (fet) obj, iL);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iL2 = x8x.L(1);
                                    sac.u(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            mm40Var2 = mm40Var;
            l3wVar2 = l3wVar;
            function1 = function0;
            wulVar2 = wulVar;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (l3wVar2 != null) {
                fetVar.e0(260556583);
                h8x.f(null, l3wVar2, fetVar, i2 & 112, 1);
                fetVar.r(false);
            } else {
                fetVar.e0(260693045);
                fetVar.r(false);
            }
            if (wulVar2 != null) {
                fetVar.e0(260738367);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(382410271, new auo(wulVar2, function1, b), fetVar), fetVar, 56);
                fetVar.r(false);
            } else {
                fetVar.e0(261036277);
                fetVar.r(false);
            }
            fetVar.r(true);
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            final l3w l3wVar3 = l3wVar2;
            final mm40 mm40Var3 = mm40Var2;
            final byte b3 = 1;
            yfe0VarU2.d = new Function2(mm40Var3, l3wVar3, wulVar2, function1, i, b3) { // from class: a.zto

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f44970a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ l3w c;
                public final /* synthetic */ wul d;
                public final /* synthetic */ Function0 e;

                {
                    this.f44970a = b3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f44970a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            sac.u(this.b, this.c, this.d, this.e, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            sac.u(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static float u0(float f) {
        float f2 = f * v8g.v;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : rw2.a(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f)) * v8g.w;
    }

    public static final void v(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        ugd ugdVar3;
        boolean z2;
        final boolean z3;
        fetVar.g0(495480311);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | 16;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                z3 = fetVar.k(bmd.n) == k6z.b;
            } else {
                fetVar.X();
                z3 = z;
            }
            fetVar.s();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(32.0f, fetVar);
            }
            final float f = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = gqw0.n;
                fetVar.o0(objP2);
            }
            xx7 xx7Var = (xx7) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = uc9.c;
                fetVar.o0(objP3);
            }
            sw3 sw3Var = (sw3) objP3;
            final long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            final pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar2 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(96.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarZ) | fetVar.h(z3) | fetVar.f(separator60);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                Object obj2 = new Function0() { // from class: a.dtq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object value = pz40VarZ.getValue();
                        mm40 mm40VarL = jm40.b;
                        if (value != null) {
                            mm40 mm40VarL2 = rq8.L(mm40VarL, new gbc(z3, separator60, (byte) 3));
                            zcl zclVar3 = qmk.f28987a;
                            mm40VarL = s5x0.L(mm40VarL2, 4.0f, 0.0f, 2);
                        }
                        return mrv.k0(o7k0.s(mm40VarL, f), "TOTAL_CONTENT_ID");
                    }
                };
                fetVar.o0(obj2);
                objP4 = obj2;
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar);
            boolean zG2 = fetVar.g(pz40VarZ) | fetVar.g(pz40VarZ2);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj) {
                objP5 = new gtq(pz40VarZ, pz40VarZ2, b);
                fetVar.o0(objP5);
            }
            tj30 tj30Var = (tj30) objP5;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z4) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            ugdVar.F(s5x0.N(mrv.k0(jm40.b, "PERIOD_CONTENT_ID"), 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar, 48);
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA = w5d.a(sw3Var, xx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ugdVar3 = ugdVar2;
            vqd.t(54, ugdVar3, y5d.f42040a, fetVar, true);
            fetVar.r(true);
            z2 = z3;
        } else {
            ugdVar3 = ugdVar2;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var, z2, ugdVar, ugdVar3, i, (byte) 3);
        }
    }

    public static final void w(Function0 function0, mm40 mm40Var, v9v v9vVar, fet fetVar, int i) {
        int i2;
        agk0 agk0Var;
        int i3;
        Object kvVar;
        v9v v9vVar2 = v9vVar;
        String str = v9vVar2.b;
        String str2 = v9vVar2.f37053a;
        function0.getClass();
        mm40Var.getClass();
        fetVar.g0(242974297);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(v9vVar2) : fetVar.i(v9vVar2) ? 256 : 128;
        }
        int i4 = i2;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var2 = (agk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = xf0.c(0.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var = (t33) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(str);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = androidx.compose.runtime.e.e(str2);
                fetVar.o0(objP4);
            }
            pz40 pz40Var2 = (pz40) objP4;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            if (str2.length() > 0) {
                pz40Var2.setValue(str2);
            }
            if (v9vVar2.c) {
                fetVar.e0(1427988794);
                boolean zI = fetVar.i(t33Var) | ((i4 & 896) == 256 || ((i4 & 512) != 0 && fetVar.i(v9vVar2))) | fetVar.g(pz40VarF);
                Object objP5 = fetVar.P();
                if (zI || objP5 == obj) {
                    agk0Var = agk0Var2;
                    kvVar = new kv((Object) t33Var, (Object) pz40Var, (Object) v9vVar2, (Object) agk0Var, pz40VarF, (yje) null, (byte) 12);
                    t33Var = t33Var;
                    fetVar.o0(kvVar);
                } else {
                    kvVar = objP5;
                    agk0Var = agk0Var2;
                }
                m0x0.v(v9vVar2, str, (Function2) kvVar, fetVar);
                i3 = 0;
                fetVar.r(false);
            } else {
                agk0Var = agk0Var2;
                pz40Var = pz40Var;
                v9vVar2 = v9vVar2;
                pz40Var2 = pz40Var2;
                i3 = 0;
                fetVar.e0(1428679753);
                fetVar.r(false);
            }
            l7m0 l7m0VarB = d43.b(agk0Var.l(), ro4.m0(1500, i3, ihn.d, 2), "", null, fetVar, 3072, 20);
            pz40 pz40Var3 = pz40Var2;
            a(mm40Var, pz40Var3, v9vVar2.e, ((Number) l7m0VarB.getValue()).floatValue(), t33Var, pz40Var, v9vVar2.d, fetVar, ((i4 >> 3) & 14) | 229424);
        } else {
            v9vVar2 = v9vVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o(function0, mm40Var, v9vVar2, i);
        }
    }

    public static final void x(mm40 mm40Var, do8 do8Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        function0.getClass();
        fetVar.g0(1888053178);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(do8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 48.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            y(new x7z(1.0f, true), do8Var, fetVar, i2 & 112);
            mm40 mm40VarN = s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new dbn(function0, (byte) 17);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28);
            String str = do8Var.c;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarW, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(g1t0.d(), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) do8Var, (Object) function0, i, (byte) 14);
        }
    }

    public static final void y(mm40 mm40Var, do8 do8Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1966710590);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(do8Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = do8Var.f6404a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarN = ibm0.n(g1t0.g(), fetVar2);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, jm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarN, fetVar, 48, 24960, 110588);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            String str2 = do8Var.b;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) do8Var, i, (byte) 25);
        }
    }

    public static final void z(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(245433359);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(dkkVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            A(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            A(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 4);
        }
    }
}
