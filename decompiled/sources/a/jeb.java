package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jeb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void A(eym eymVar, fet fetVar, int i) {
        int i2;
        eym eymVar2;
        fet fetVar2;
        fet fetVar3;
        ?? r0;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(789997183);
        if ((i & 6) == 0) {
            i2 = i | (fetVar5.g(eymVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar5.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar5, 48);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, jm40.b);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            String str = eymVar.d;
            wxm wxmVar = eymVar.c;
            int length = str.length();
            oro0 oro0Var = oro0.f25744a;
            if (length > 0) {
                fetVar5.e0(28914880);
                j6n.h(eymVar.d, oro0Var, null, 0, 0, fetVar5, 48, 28);
                fetVar5.r(false);
            } else {
                fetVar5.e0(29067679);
                fetVar5.r(false);
            }
            if (wxmVar instanceof txm) {
                fetVar5.e0(940903);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else if (wxmVar instanceof uxm) {
                fetVar5.e0(29253524);
                rcb.x(null, acb.W((uxm) wxmVar), h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                if (!(wxmVar instanceof vxm)) {
                    throw b1j.f(938739, fetVar5, false);
                }
                fetVar5.e0(29676240);
                j6n.h("VAR", oro0Var, null, 0, 0, fetVar5, 54, 28);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            if (eymVar.b.length() > 0) {
                fetVar3.e0(29920365);
                r0 = 0;
                v8q0.a(eymVar.b, new x7z(1.0f, false), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110584);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                fetVar4 = fetVar7;
            } else {
                r0 = 0;
                fetVar3.e0(30224351);
                fetVar3.r(false);
                fetVar4 = fetVar3;
            }
            eymVar2 = eymVar;
            f2i f2iVar = eymVar2.e;
            if (f2iVar == null) {
                fetVar4.e0(30267378);
                fetVar4.r(r0);
            } else {
                fetVar4.e0(30267379);
                n4c.d(null, f2iVar, fetVar4, r0);
                fetVar4.r(r0);
            }
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            eymVar2 = eymVar;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(eymVar2, i, (byte) 20);
        }
    }

    public static final void B(mm40 mm40Var, l7m0 l7m0Var, float f, float f2, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(1662589922);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.d(f) ? 256 : 128) | 1024;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                i2 = i3 & (-7169);
                f2 = 24.0f;
            } else {
                fetVar.X();
                i2 = i3 & (-7169);
            }
            fetVar.s();
            atv atvVar = (atv) l7m0Var.getValue();
            if (Intrinsics.d(atvVar, wsv.f39710a)) {
                fetVar.e0(21088011);
                bfb.w(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                if (!(atvVar instanceof xsv)) {
                    throw b1j.f(21086297, fetVar, false);
                }
                fetVar.e0(653809563);
                mm40 mm40VarN = epv0.N(mm40Var, f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                ieb.B(null, (atv) l7m0Var.getValue(), f2, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        float f3 = f2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ibd(mm40Var, l7m0Var, f, f3, i);
        }
    }

    public static final void C(final mm40 mm40Var, final l7m0 l7m0Var, final l7m0 l7m0Var2, final float f, float f2, fet fetVar, final int i, final int i2) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        fetVar.g0(293565181);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(l7m0Var2) ? 256 : 128) | (fetVar.d(f) ? 2048 : 1024) | (((i2 & 16) == 0 && fetVar.d(f2)) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                zcl zclVar = qmk.f28987a;
                i3 &= -57345;
                f2 = 24.0f;
            }
            fetVar.s();
            kje kjeVar = (kje) l7m0Var.getValue();
            if (kjeVar instanceof zie) {
                fetVar.e0(1047142563);
                fetVar.r(false);
            } else if (Intrinsics.d(kjeVar, dje.f6181a)) {
                fetVar.e0(-1351693306);
                bfb.w(i3 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(kjeVar, fje.f9636a)) {
                    throw b1j.f(-1351696045, fetVar, false);
                }
                fetVar.e0(1047259712);
                mm40 mm40VarN = epv0.N(mm40Var, f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                ieb.B(null, (atv) l7m0Var2.getValue(), f2, fetVar, (i3 >> 6) & 896);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        final float f3 = f2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(l7m0Var, l7m0Var2, f, f3, i, i2) { // from class: a.u2w
                public final /* synthetic */ l7m0 b;
                public final /* synthetic */ l7m0 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ byte f;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    jeb.C(this.f34966a, this.b, this.c, this.d, this.e, (fet) obj, iL, this.f);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void D(c4m c4mVar, fet fetVar, int i) {
        mm40 mm40VarN;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1656563211);
        int i2 = i | (fetVar2.g(c4mVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarC, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), vgg0.a(12.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int iOrdinal = c4mVar.c.ordinal();
            if (iOrdinal == 0) {
                mm40VarN = o7k0.n(jm40Var, 18.0f);
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                mm40VarN = lgb.J(o7k0.n(jm40Var, 18.0f), vgg0.f37379a);
            }
            rq8.b(mm40VarN, o7k0.n(jm40Var, 18.0f), c4mVar.f3732a, R.drawable.ic_glyph_cyber_gamepad, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, null, gqw0.A, null, fetVar2, 12582912, 352);
            String str = c4mVar.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(c4mVar, i, (byte) 5);
        }
    }

    public static final void E(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(775926807);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(null) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), yx7Var, fetVar2, 48);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1699607413, false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            nrq nrqVar = g1t0.m().f42262a.f;
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            f1t0.a(null, str, textPrimary, new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, nrqVar, 0L, new f2q0(3), 0L, 2, false, 3, 0, y9q0VarM, 0L, fetVar, i2 & 112, 437105);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str, i, (byte) 26);
        }
    }

    public static final void F(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-440397549);
        byte b = 4;
        int i2 = (i & 6) == 0 ? (fetVar2.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
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
            jm40 jm40Var = jm40.b;
            mbc.o(zfi0.f44303a, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), false, fetVar2, 6, 4);
            fet fetVar3 = fetVar2;
            fetVar3.e0(502154610);
            int i3 = 0;
            for (Object obj : a4xVar) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                iem iemVar = (iem) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(iemVar);
                sb.append(i3);
                fetVar3.b0(-1189533693, sb.toString());
                String string = StringsKt.v0(iemVar.f14640a).toString();
                String string2 = StringsKt.v0(iemVar.b).toString();
                zfn zfnVar = zaq0.b;
                smk0 smk0Var = new smk0(((ThemeColors) fetVar3.k(zfnVar)).getTextPrimary(), g1t0.d().f42262a.b, null, null, null, g1t0.d().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                smk0 smk0Var2 = new smk0(((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), g1t0.g().f42262a.b, null, null, null, g1t0.g().f42262a.f, null, 0L, null, null, null, 0L, null, null, null, 65500);
                zcl zclVar2 = qmk.f28987a;
                s5x0.a(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), string, string2, smk0Var, smk0Var2, fetVar, 0);
                fetVar.r(false);
                fetVar3 = fetVar;
                i3 = i4;
            }
            fetVar2 = fetVar3;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, b);
        }
    }

    public static final void G(mm40 mm40Var, hh80 hh80Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1656968148);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new xjl((byte) 17);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var, null, hh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | 817889280 | ((i2 << 3) & 896), 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, hh80Var, i, b);
        }
    }

    public static final void H(String str, fet fetVar, int i) {
        fetVar.g0(1715134197);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.M(mm40VarD, 12.0f, 12.0f, 12.0f, 12.0f), "HEADER_BLOCK_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (str == null || StringsKt.W(str)) {
                fetVar.e0(833114935);
                fetVar.r(false);
            } else {
                fetVar.e0(831856025);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.a(0.0f);
                    fetVar.o0(objP);
                }
                agk0 agk0Var = (agk0) objP;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP2);
                }
                cgk0 cgk0Var = (cgk0) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var = (pz40) objP3;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarA = y9q0.a(g1t0.v(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678);
                n05 n05Var = new n05(qmk.s, qmk.t, qmk.n);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 8);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarE1 = o2e.e0(pai0.a(jm40Var, false, (Function1) objP4), "HEADER_TOURNAMENT_TITLE");
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 9);
                    fetVar.o0(objP5);
                }
                aad.e(str, mm40VarE1, y9q0VarA, (Function1) objP5, 2, false, 2, 0, null, n05Var, fetVar, (i2 & 14) | 1600512, Response.UNSUPPORTED_URI_SCHEME);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 2, i, str);
        }
    }

    public static final void I(mm40 mm40Var, float f, fet fetVar, int i) {
        float f2;
        fetVar.g0(814155096);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 48;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            zfn zfnVar = m8m0.f21378a;
            long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m75getBlack600d7_KjU();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU();
            f2 = 0.8f;
            zq8.a(0, fetVar, i120.P(mm40Var, yk5.h(new Pair[]{new Pair(Float.valueOf(0.0f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(z ? 0.0f : 0.19999999f), new y3d(jM75getBlack600d7_KjU)), new Pair(Float.valueOf(z ? 0.8f : 1.0f), new y3d(jM121getTransparent0d7_KjU)), new Pair(Float.valueOf(1.0f), new y3d(jM121getTransparent0d7_KjU))}, 0.0f, 0.0f, 14), null, 6));
        } else {
            fetVar.X();
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esl(mm40Var, f2, i, b);
        }
    }

    public static final void J(d4m d4mVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(459202223);
        int i2 = i | (fetVar2.g(d4mVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarC = o7k0.c(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarC, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), vgg0.a(12.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = d4mVar.f5462a;
            long secondary80 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, secondary80, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            String str2 = d4mVar.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(d4mVar, i, (byte) 4);
        }
    }

    public static final ank0 K(int i, long j, List list, String str, String str2, boolean z, String str3) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        if (z && !StringsKt.W(str2)) {
            sb.append(". ".concat(str2));
        }
        if ((list.contains(Integer.valueOf(i)) || j == 10 || j == 4 || j == 40) && !StringsKt.W(str3)) {
            sb.append(". ".concat(str3));
        }
        String string = sb.toString();
        int iY = StringsKt.Y(0, string, 6, Separators.SP);
        List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.u0(string).toString(), new String[]{Separators.SP}, false, 0, 6, null);
        if (iY != -1 && ((String) CollectionsKt.d0(listSplit$default)).length() <= 2) {
            string = new StringBuilder(string).replace(iY, iY + 1, " ").toString();
        }
        arrayList.add(new zmk0(string, -1, -1.0f, -1, -1, -1));
        return new ank0(arrayList);
    }

    public static final void L(f7m0 f7m0Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pj30 pj30Var = (pj30) list.get(i);
            Object objI0 = mrv.i0(pj30Var);
            if (objI0 == null) {
                pj30Var.n();
                objI0 = new std();
            }
            k3e k3eVarC = f7m0Var.c(objI0.toString());
            if (k3eVarC != null) {
                k3eVarC.f0 = pj30Var;
                k4e k4eVar = k3eVarC.g0;
                if (k4eVar != null) {
                    k4eVar.h0 = pj30Var;
                }
            }
            pj30Var.n();
        }
    }

    public static final String M(String str, String str2) {
        return ua80.i(str, str2.length() > 0 ? Separators.DOT : "", Separators.SP, str2);
    }

    public static per N(ier ierVar, boolean z) {
        String lowerCase;
        ierVar.getClass();
        List list = ierVar.k;
        per perVar = new per(ierVar, null, 1, z);
        c8z c8zVarF0 = ierVar.f0();
        iun iunVar = iun.f15405a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((hzs0) obj).t() != t3u0.d) {
                break;
            }
            arrayList.add(obj);
        }
        rx3 rx3VarS0 = CollectionsKt.S0(arrayList);
        ArrayList arrayList2 = new ArrayList(r3d.q(rx3VarS0, 10));
        Iterator it = rx3VarS0.iterator();
        while (true) {
            iil iilVar = (iil) it;
            if (!iilVar.b.hasNext()) {
                perVar.t1(null, c8zVarF0, iunVar, iunVar, arrayList2, ((hzs0) CollectionsKt.d0(list)).I(), gm40.e, uek.e);
                per perVar2 = perVar;
                perVar2.x = true;
                return perVar2;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            int i = indexedValue.f46061a;
            hzs0 hzs0Var = (hzs0) indexedValue.b;
            String strB = hzs0Var.getName().b();
            strB.getClass();
            if (strB.equals(TokenNames.T)) {
                lowerCase = "instance";
            } else if (strB.equals(TokenNames.E)) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            per perVar3 = perVar;
            String str = lowerCase;
            f93 f93Var = ujn.c;
            g950 g950VarE = g950.e(str);
            kzj0 kzj0VarI = hzs0Var.I();
            kzj0VarI.getClass();
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new k3u0(perVar3, null, i, f93Var, g950VarE, kzj0VarI, false, false, false, null, gmk0.x0));
            perVar = perVar3;
            arrayList2 = arrayList3;
        }
    }

    public static final TreeMap O(int i, Integer num, int i2, String str, boolean z, long j, String str2) {
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(i));
        if (num != null) {
            jo20Var.put("country", num);
        }
        jo20Var.put("fcountry", Integer.valueOf(i2));
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", str);
        jo20Var.put("ref", 1);
        if (z) {
            jo20Var.put("userId", Long.valueOf(j));
        }
        jo20Var.put("whence", 22);
        if (str2 != null) {
            jo20Var.put("favoriteId", str2);
        }
        return new TreeMap(jo20Var.b());
    }

    public static final String P(d0t d0tVar, dmr dmrVar) {
        Object next;
        String str;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        return (cmrVar == null || (str = cmrVar.b) == null) ? "" : str;
    }

    public static final n0x Q(sba0 sba0Var, huo0 huo0Var, suo0 suo0Var) {
        if (sba0Var == null && huo0Var == null && suo0Var == null) {
            StringBuilder sb = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp", "https://", false)) {
                sb.setLength(0);
                sb.append("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp");
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp", '/'));
            }
            return new n0x(sb.toString());
        }
        sba0 sba0Var2 = sba0.GAMING;
        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
            StringBuilder sb2 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/onboarding/onboard_type_1.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/onboarding/onboard_type_1.webp", "https://", false)) {
                sb2.setLength(0);
                sb2.append("/static/img/android/casino/daily_challenge/onboarding/onboard_type_1.webp");
            } else {
                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0("/static/img/android/casino/daily_challenge/onboarding/onboard_type_1.webp", '/'));
            }
            return new n0x(sb2.toString());
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
            StringBuilder sb3 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/onboarding/onboard_type_2.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/onboarding/onboard_type_2.webp", "https://", false)) {
                sb3.setLength(0);
                sb3.append("/static/img/android/casino/daily_challenge/onboarding/onboard_type_2.webp");
            } else {
                if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                    sb3.append('/');
                }
                sb3.append(StringsKt.y0("/static/img/android/casino/daily_challenge/onboarding/onboard_type_2.webp", '/'));
            }
            return new n0x(sb3.toString());
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
            StringBuilder sb4 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/onboarding/onboard_type_5.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/onboarding/onboard_type_5.webp", "https://", false)) {
                sb4.setLength(0);
                sb4.append("/static/img/android/casino/daily_challenge/onboarding/onboard_type_5.webp");
            } else {
                if (sb4.length() > 0 && !StringsKt.S(sb4, Separators.SLASH)) {
                    sb4.append('/');
                }
                sb4.append(StringsKt.y0("/static/img/android/casino/daily_challenge/onboarding/onboard_type_5.webp", '/'));
            }
            return new n0x(sb4.toString());
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof zdt) && (suo0Var instanceof puo0)) {
            StringBuilder sb5 = new StringBuilder(ujn.h);
            if (StringsKt.O("/static/img/android/casino/daily_challenge/onboarding/onboard_type_6.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/onboarding/onboard_type_6.webp", "https://", false)) {
                sb5.setLength(0);
                sb5.append("/static/img/android/casino/daily_challenge/onboarding/onboard_type_6.webp");
            } else {
                if (sb5.length() > 0 && !StringsKt.S(sb5, Separators.SLASH)) {
                    sb5.append('/');
                }
                sb5.append(StringsKt.y0("/static/img/android/casino/daily_challenge/onboarding/onboard_type_6.webp", '/'));
            }
            return new n0x(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder(ujn.h);
        if (StringsKt.O("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp", "https://", false)) {
            sb6.setLength(0);
            sb6.append("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp");
        } else {
            if (sb6.length() > 0 && !StringsKt.S(sb6, Separators.SLASH)) {
                sb6.append('/');
            }
            sb6.append(StringsKt.y0("/static/img/android/casino/daily_challenge/onboarding/onboard_type_4.webp", '/'));
        }
        return new n0x(sb6.toString());
    }

    public static ed40 R(guo guoVar, boolean z, boolean z2) {
        ohq ohqVar;
        if (z) {
            ohqVar = z2 ? exw.d : null;
        } else {
            ohqVar = exw.c;
        }
        ed40 ed40VarN = new hru((byte) 18).n(guoVar, ohqVar, 0);
        if (ed40VarN == null || ed40VarN.f7600a.length == 0) {
            return null;
        }
        return ed40VarN;
    }

    public static jtj S(fq80 fq80Var) {
        fq80Var.N(1);
        int iC = fq80Var.C();
        long j = ((long) fq80Var.b) + ((long) iC);
        int i = iC / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jT = fq80Var.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jT;
            jArrCopyOf2[i2] = fq80Var.t();
            fq80Var.N(2);
        }
        fq80Var.N((int) (j - ((long) fq80Var.b)));
        return new jtj((Object) jArrCopyOf, (Object) jArrCopyOf2, (byte) 12);
    }

    public static final otc T(mk50 mk50Var, long j) {
        u0m0 u0m0Var = (u0m0) CollectionsKt.firstOrNull(mk50Var.l);
        return new otc(u0m0Var != null ? u0m0Var.k : 0L, u0m0Var != null ? u0m0Var.f34860a : "", u0m0Var != null ? u0m0Var.i : lho.UNKNOWN, u0m0Var != null ? u0m0Var.h : 0L, u0m0Var != null ? w6x.n(u0m0Var.d, u0m0Var.e, " : ") : "", b0(mk50Var, true), b0(mk50Var, false), "", j);
    }

    public static final e4f U(i0w i0wVar) {
        switch (i0wVar.ordinal()) {
            case 0:
                return e4f.b;
            case 1:
                return e4f.c;
            case 2:
                return e4f.d;
            case 3:
                return e4f.e;
            case 4:
                return e4f.f;
            case 5:
                return e4f.g;
            case 6:
                return e4f.h;
            case 7:
                return e4f.i;
            case 8:
                return e4f.j;
            default:
                t9f.b();
                return null;
        }
    }

    public static final xah V(abh abhVar) {
        String str;
        Long l;
        Long l2;
        Long l3;
        abhVar.getClass();
        l26 l26Var = abhVar.c;
        e2g e2gVar = abhVar.f579a;
        Integer num = abhVar.f;
        l26 l26Var2 = abhVar.d;
        long jLongValue = 0;
        long jLongValue2 = (l26Var == null || (l3 = l26Var.f19293a) == null) ? 0L : l3.longValue();
        long jLongValue3 = (l26Var2 == null || (l2 = l26Var2.f19293a) == null) ? 0L : l2.longValue();
        Integer num2 = abhVar.b;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = abhVar.e;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        int iIntValue3 = num != null ? num.intValue() : 0;
        String strY = f7k.Y(l26Var2 != null ? l26Var2.b : null, e2gVar != null ? e2gVar.b : null);
        if (e2gVar != null && (l = e2gVar.f7083a) != null) {
            jLongValue = l.longValue();
        }
        long j = jLongValue;
        Integer num4 = abhVar.g;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        if (l26Var2 == null || (str = l26Var2.b) == null) {
            String str2 = l26Var != null ? l26Var.b : null;
            if (str2 == null) {
                String str3 = "";
                str = str3;
            } else {
                str = str2;
            }
        } else {
            str = str3;
        }
        return new xah(iIntValue, iIntValue3, iIntValue2, iIntValue4, j, jLongValue2, jLongValue3, "", "", strY, str, "", false, (num != null ? num.intValue() : 0) > 0);
    }

    public static final ArrayList W(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            String strValueOf = "-";
            if (!it.hasNext()) {
                break;
            }
            hlk hlkVar = (hlk) it.next();
            hlkVar.getClass();
            int i = hlkVar.f13265a;
            String strValueOf2 = i == 0 ? "-" : String.valueOf(i);
            int i2 = hlkVar.b;
            String strValueOf3 = i2 == 0 ? "-" : String.valueOf(i2);
            int i3 = hlkVar.c;
            if (i3 != 0) {
                strValueOf = String.valueOf(i3);
            }
            arrayList.add(new zlg(strValueOf2, strValueOf3, strValueOf));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = 1 - arrayList2.size();
        if (size >= 0) {
            int i4 = 0;
            while (true) {
                arrayList2.add(new zlg("-", "-", "-"));
                if (i4 == size) {
                    break;
                }
                i4++;
            }
        }
        return arrayList2;
    }

    public static final mpm X(p5h0 p5h0Var) {
        boolean z = p5h0Var instanceof n5h0;
        opm opmVar = opm.f25648a;
        if (z) {
            n5h0 n5h0Var = (n5h0) p5h0Var;
            return new kpm(opmVar, new gpm(), d5c.O(n5h0Var.f22944a, n5h0Var.b, n5h0Var.c, n5h0Var.d, new gpm()));
        }
        if (p5h0Var.equals(o5h0.f24687a)) {
            return new lpm(opmVar, new gpm());
        }
        t9f.b();
        return null;
    }

    public static final mlr Y(kic0 kic0Var) {
        return new mlr(kic0Var.d, kic0Var.g, kic0Var.f, 0L, "", kic0Var.e, kic0Var.c, (String) null, false, false, false, kic0Var.h, kic0Var.j, kic0Var.i, false, (List) iun.f15405a, false, 131200);
    }

    public static evr Z(d0t d0tVar, ctf0 ctf0Var, boolean z, boolean z2, String str, boolean z3, y78 y78Var, ArrayList arrayList, boolean z4, boolean z5, String str2) {
        Object next;
        Object next2;
        int i;
        int i2;
        int i3;
        int i4;
        d0tVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        y78Var.getClass();
        long j = d0tVar.f5282a;
        rqs rqsVar = d0tVar.p;
        dur durVarY = xbc.Y(d0tVar, str, str2, arrayList, z, z2, true, z4, z5);
        qtr qtrVarF0 = vbc.f0(d0tVar, false, z3, false);
        String string = y78.n(y78Var, d0tVar, false, false, 6).toString();
        long j2 = d0tVar.s;
        avr avrVar = new avr(string, TimeUnit.SECONDS.toMillis(j2), d0tVar.z && j2 != 0);
        f0t f0tVar = d0tVar.q;
        List list = f0tVar.d;
        long j3 = f0tVar.f8731a;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((String) next).length() <= 0);
        String str3 = (String) next;
        if (str3 == null) {
            str3 = "";
        }
        bvr bvrVar = new bvr(j3, qzb.c0(d0tVar), vsm0.s(j3, str3));
        f0t f0tVar2 = d0tVar.r;
        List list2 = f0tVar2.d;
        long j4 = f0tVar2.f8731a;
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((String) next2).length() <= 0);
        String str4 = (String) next2;
        if (str4 == null) {
            str4 = "";
        }
        cvr cvrVar = new cvr(j4, qzb.r0(d0tVar), vsm0.s(j4, str4));
        List listI0 = StringsKt.i0(rqsVar.c, new char[]{'-'}, 6);
        boolean z6 = rqsVar.t;
        boolean z7 = rqsVar.u;
        String strP = P(d0tVar, dmr.e);
        if (strP.length() == 0 && (strP = (String) CollectionsKt.firstOrNull(listI0)) == null) {
            strP = "";
        }
        String strP2 = P(d0tVar, dmr.f);
        if (strP2.length() == 0) {
            String str5 = (String) CollectionsKt.f0(listI0);
            strP2 = str5 == null ? "" : str5;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(P(d0tVar, dmr.t), new String[]{Separators.SEMICOLON}, false, 0, 6, null);
        String str6 = (String) CollectionsKt.firstOrNull(listSplit$default);
        Integer intOrNull = str6 != null ? StringsKt.toIntOrNull(str6) : null;
        String str7 = (String) CollectionsKt.f0(listSplit$default);
        Pair pair = (intOrNull == null || str7 == null) ? new Pair(0, "") : new Pair(intOrNull, Separators.SP.concat(ctf0Var.f(R.string.cricket_current_over, str7)));
        int iIntValue = ((Number) pair.f46059a).intValue();
        String str8 = (String) pair.b;
        if (iIntValue == 1) {
            strP = kng0.k(strP, str8);
        } else if (iIntValue == 2) {
            strP2 = kng0.k(strP2, str8);
        }
        String str9 = strP;
        if (z6) {
            i2 = R.color.static_green;
            i = -1;
        } else {
            i = R.attr.uikitTextPrimary;
            i2 = -1;
        }
        zmk0 zmk0Var = new zmk0(str9, -1, -1.0f, i2, -1, i);
        if (z7) {
            i4 = R.color.static_green;
            i3 = -1;
        } else {
            i3 = R.attr.uikitTextPrimary;
            i4 = -1;
        }
        return new evr(j, durVarY, qtrVarF0, avrVar, bvrVar, cvrVar, new zur(zmk0Var, new zmk0(strP2, -1, -1.0f, i4, -1, i3)));
    }

    public static final void a(py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        Function0 function3;
        int i3;
        fetVar.g0(-1627417860);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            String str = py1Var.g;
            kdm kdmVar = py1Var.l;
            H(str, fetVar, 0);
            if (kdmVar.b != null) {
                fetVar.e0(471408169);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 0.0f, 10);
                int i4 = i2;
                String str2 = py1Var.e;
                String str3 = py1Var.h;
                String str4 = py1Var.i;
                String str5 = kdmVar.f18113a;
                long j = kdmVar.c;
                qol qolVar = new qol(null, 15);
                tol tolVar = tol.f34290a;
                i3 = i4;
                lmc.n(mm40VarN, str2, str3, str4, str5, j, kdmVar.b, qolVar, null, function2, fetVar, 0, ((i4 >> 3) & 896) | 6);
                fetVar.r(false);
            } else {
                i3 = i2;
                fetVar.e0(472285872);
                fetVar.r(false);
            }
            function3 = function0;
            o050.b(py1Var.q, function3, function1, fetVar, i3 & 1008);
            fetVar.r(true);
        } else {
            function3 = function0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dsl(py1Var, function3, function1, function2, i, (byte) 4);
        }
    }

    public static final rkt a0(qkt qktVar, String str) {
        qktVar.getClass();
        str.getClass();
        int i = qktVar.f28902a;
        String str2 = qktVar.b;
        String str3 = str2 == null ? "" : str2;
        String str4 = qktVar.d;
        String str5 = qktVar.c;
        return new rkt(i, qktVar.e, qktVar.h, str3, str5, str4, kng0.k(str, qktVar.f), str2 == null ? "" : str2, qktVar.g);
    }

    public static final void b(py1 py1Var, fet fetVar, int i) {
        int i2;
        py1 py1Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-459197564);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(py1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            boolean z = fetVar2.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.d(jm40Var, 1.0f), 136.0f), ugg0Var2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarJ2 = lgb.J(jr8Var.a(jm40Var), ugg0Var2);
            boolean zH = fetVar2.h(z);
            Object objP = fetVar2.P();
            if (zH || objP == ukd.f35823a) {
                objP = new z((byte) 17, z);
                fetVar2.o0(objP);
            }
            k7x.b(py1Var.c, null, o2e.e0(i4w0.T(mm40VarJ2, (Function1) objP), "TOURNAMENT_IMAGE"), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), a8k0.F(R.drawable.ic_tournament_banner, 0, fetVar2), null, null, null, null, gqw0.A, null, fetVar2, 299056, 6, 31680);
            I(lgb.J(jr8Var.a(jm40Var), ugg0Var2), 0.0f, fetVar2, 0);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 12.0f, 12.0f, 0.0f, 8);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            py1Var2 = py1Var;
            dtb.q(null, py1Var2.r, fetVar2, 0);
            fetVar2.r(true);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jr8Var.b(jm40Var, gqw0.g), 12.0f, 0.0f, 12.0f, 16.0f, 2), "PRIZE_AMOUNT");
            String str = py1Var2.f;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            aad.e(str, mm40VarE0, y9q0.a(g1t0.p(), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.u, qmk.w, qmk.n), fetVar, 1794048, 392);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            py1Var2 = py1Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new csl(py1Var2, i, (byte) 2);
        }
    }

    public static final ufp0 b0(mk50 mk50Var, boolean z) {
        return z ? new ufp0(0, mk50Var.c, mk50Var.f21928a, mk50Var.f, mk50Var.n) : new ufp0(0, mk50Var.d, mk50Var.b, mk50Var.g, mk50Var.o);
    }

    public static final void c(py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1033069760);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(py1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.i;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar2, zclVar2, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            a(py1Var, function0, function1, function2, fetVar, i2 & 8190);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dsl(py1Var, function0, function1, function2, i, (byte) 3);
        }
    }

    public static final String c0(String str) {
        return ttm0.M(2, str).equals(".0") ? kotlin.text.c.r(str, ".0", "", false) : str;
    }

    public static final void d(mm40 mm40Var, rad radVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fetVar.g0(1869201561);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(radVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = mm40Var;
            kr00.a(u1c.M(850674620, new gf9((Object) mm40Var2, (Object) androidx.compose.runtime.e.f(radVar.c, fetVar), (Object) androidx.compose.runtime.e.f(radVar.f30129a, fetVar), (Object) androidx.compose.runtime.e.f(radVar.b, fetVar), (byte) 11), fetVar), fetVar, 6);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var2, radVar, i, (byte) 5);
        }
    }

    public static final void e(mm40 mm40Var, hh80 hh80Var, g4m g4mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-31567135);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(hh80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(g4mVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            yx7 yx7Var = gqw0.k;
            boolean z = false;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new edl(g4mVar, (byte) 15);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, xczVarA, hh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, ((i2 << 3) & 896) | 196608, 456);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var, hh80Var, g4mVar, i, (byte) 8);
        }
    }

    public static final void f(mm40 mm40Var, wqh wqhVar, boolean z, boolean z2, fet fetVar, int i) {
        wqhVar.getClass();
        fetVar.g0(-273033771);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wqhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (wqhVar instanceof sqh) {
                fetVar.e0(719216382);
                g((sqh) wqhVar, z, fetVar, i2 & 1022);
                fetVar.r(false);
            } else {
                if (!(wqhVar instanceof vqh)) {
                    throw b1j.f(-392443395, fetVar, false);
                }
                fetVar.e0(719442837);
                h((vqh) wqhVar, z, z2, fetVar, i2 & 8190);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5((Object) mm40Var2, (Object) wqhVar, z, z2, i, (byte) 1);
        }
    }

    public static final void g(sqh sqhVar, boolean z, fet fetVar, int i) {
        int i2;
        sqh sqhVar2;
        fet fetVar2 = fetVar;
        sqhVar.getClass();
        fetVar2.g0(-513794190);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar2.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(sqhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(o7k0.e(mm40VarD, 140.0f), 8.0f, 4.0f, 8.0f, 6.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarM);
            ((ijg) fetVar2.k(jjg.f16616a)).getClass();
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, ijg.l, jd8.n), 0.0f, 4.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            mm40 mm40VarL2 = s5x0.L(o7k0.e(jm40Var, 36.0f), 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str = sqhVar.f32629a;
            r0n r0nVar = sqhVar.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            int i4 = i2;
            v8q0.a(str, null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (r0nVar instanceof p0n) {
                fetVar2.e0(1987163423);
                p0n p0nVar = (p0n) r0nVar;
                fgm fgmVar = p0nVar.b;
                boolean zF = fetVar2.f(p0nVar.f26160a) | fetVar2.e(fgmVar.ordinal());
                Object objP = fetVar2.P();
                if (zF || objP == ukd.f35823a) {
                    objP = new c8n(fgmVar == fgm.b ? r7n.c : r7n.f29985a, new w7n(new z7n(), u1c.O(p0nVar), true, 0, !z, null, 40));
                    fetVar2.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar2, 5);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1987988922);
                fetVar2.r(false);
            }
            sqhVar2 = sqhVar;
            vdb.o(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), sqhVar2, fetVar2, i4 & 112);
            fetVar2.r(true);
        } else {
            sqhVar2 = sqhVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(sqhVar2, z, i);
        }
    }

    public static final void h(final vqh vqhVar, final boolean z, final boolean z2, fet fetVar, final int i) {
        int i2;
        k6z k6zVar;
        vqhVar.getClass();
        fetVar.g0(1566413133);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vqhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (z2) {
                fetVar.e0(2084474644);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(2084475568);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-406592371, new jv1(vqhVar, z), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    jeb.h(vqhVar, z, z2, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void i(String str, Function0 function0, fet fetVar, int i) {
        str.getClass();
        function0.getClass();
        fetVar.g0(-484977887);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = yfk.f42546a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = k7n0.H(bww.U(o7k0.g(mm40VarD, 0.0f, 56.0f, 1), 2.0f, null, 0L, ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU(), 14), 8.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new xfk(str, function0, b);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, mm40VarH, (Function1) objP2, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new txf(str, function0, i, b2);
        }
    }

    public static final void j(mm40 mm40Var, b1l b1lVar, fet fetVar, int i) {
        fetVar.g0(-725811273);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(b1lVar) ? 32 : 16);
        int i3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a4x a4xVar = b1lVar.f1811a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : a4xVar) {
                if (((vt90) obj).f37995a != 0) {
                    arrayList.add(obj);
                }
            }
            float f = 0.0f;
            float f2 = arrayList.size() == 1 ? 0.0f : 15.0f;
            float size = 360.0f - (a4xVar.size() * f2);
            Iterator<E> it = a4xVar.iterator();
            double d = 0.0d;
            while (it.hasNext()) {
                d += (double) ((vt90) it.next()).f37995a;
            }
            float f3 = ((float) d) / size;
            ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
            for (Iterator it2 = a4xVar.iterator(); it2.hasNext(); it2 = it2) {
                Object next = it2.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                vt90 vt90Var = (vt90) next;
                float f4 = (i3 * f2) + f;
                float f5 = vt90Var.f37995a / f3;
                f += f5;
                arrayList2.add(new bw3(f5, (-65.0f) + f4, vt90Var.b));
                i2 = i2;
                i3 = i4;
            }
            int i5 = i2;
            float fW0 = ((w6k) fetVar.k(bmd.h)).w0(6.0f);
            boolean zD = fetVar.d(fW0) | fetVar.i(arrayList2);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new a1l(fW0, arrayList2);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i5 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var, b1lVar, i, (byte) 12);
        }
    }

    public static final void k(mm40 mm40Var, akl aklVar, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(1368828550);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aklVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (aklVar instanceof yjl) {
            fetVar.e0(-1942861329);
            l(mm40Var, (yjl) aklVar, function1, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!(aklVar instanceof zjl)) {
                throw b1j.f(1184250911, fetVar, false);
            }
            fetVar.e0(-1942601828);
            n(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ljl(mm40Var, aklVar, function1, i, (byte) 0);
        }
    }

    public static final void l(mm40 mm40Var, yjl yjlVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        a4x a4xVar = yjlVar.f42744a;
        function1.getClass();
        fetVar2.g0(-126379377);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(yjlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            bkl bklVar = (bkl) CollectionsKt.firstOrNull(a4xVar);
            String str = bklVar != null ? bklVar.e : null;
            if (str == null) {
                str = "";
            }
            boolean zG = fetVar2.g(str);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190);
                fetVar2.o0(objP);
            }
            hjm hjmVar = (hjm) objP;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 16.0f, 8.0f, 16.0f, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            byte b = 0;
            x5d x5dVarA2 = w5d.a(uc9.c, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarG = o7k0.g(o7k0.d(jm40Var, 1.0f), 40.0f, 0.0f, 2);
            kjm kjmVar = kjm.f18392a;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new xal((byte) 16);
                fetVar2.o0(objP2);
            }
            nkb.h(mm40VarG, hjmVar, kjmVar, (Function0) objP2, null, null, fetVar, 3456, 48);
            mm40 mm40VarE0 = o2e.e0(o7k0.g(o7k0.d(jm40Var, 1.0f), 14.0f, 0.0f, 2), "BANNER_BACKGROUND_COMPACT_CONTENT_TEXT");
            bkl bklVar2 = (bkl) CollectionsKt.firstOrNull(a4xVar);
            String str2 = bklVar2 != null ? bklVar2.f : null;
            String str3 = str2 == null ? "" : str2;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str3, mm40VarE0, secondary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            o(null, 0, 0.0f, 0.0f, u1c.M(-1265552895, new mjl(yjlVar, function1, b), fetVar2), fetVar2, 24576, 15);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new njl(mm40Var, yjlVar, function1, i, (byte) 0);
        }
    }

    public static final void m(mm40 mm40Var, bkl bklVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1939140562);
        int i2 = i | 6 | (fetVar2.g(bklVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ojl(function1, bklVar, (byte) 0);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarE2, null, null, false, null, (Function0) objP, 28);
            zfn zfnVar = zaq0.b;
            long secondary20 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary20();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarW, secondary20, ljcVar), "DS_BANNER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_sand_clock_banner, 0, fetVar2);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = ju70.T(pm80VarF, null, new j2l((byte) 8), 6);
                fetVar2.o0(objP2);
            }
            pm80 pm80Var = (pm80) objP2;
            k7x.b(bklVar.b.a(), null, o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 64.0f)), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary20(), ljcVar), "DS_BANNER_IMAGE"), pm80Var, pm80Var, null, null, null, null, null, gqw0.A, null, fetVar2, 36912, 6, 31712);
            y(6, StaticColors.INSTANCE.m78getBlack800d7_KjU(), fetVar2, null);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jr8.f16991a.b(jm40Var, gqw0.g), 8.0f, 0.0f, 8.0f, 8.0f, 2), "DS_BANNER_TITLE");
            String str = bklVar.c;
            n05 n05Var = new n05(qmk.q, qmk.r, qmk.n);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE1, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.l(), fetVar2, 0, 24960, 110576);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pjl(mm40Var2, bklVar, function1, i, (byte) 0);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-2046516079);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 224.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vev0(mm40Var, i, b);
        }
    }

    public static final void o(mm40 mm40Var, int i, float f, float f2, ugd ugdVar, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        final ugd ugdVar2;
        final int i5;
        final float f3;
        final float f4;
        final mm40 mm40Var3;
        mm40 mm40Var4;
        float f5;
        float f6;
        fetVar.g0(-535178042);
        int i6 = i3 & 1;
        int i7 = 2;
        if (i6 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i8 = i4 | 1200;
        if (fetVar.U(i8 & 1, (i8 & 9363) != 9362)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                mm40Var4 = i6 != 0 ? jm40.b : mm40Var2;
                zcl zclVar = qmk.f28987a;
                f5 = 8.0f;
                f6 = 8.0f;
            } else {
                fetVar.X();
                i7 = i;
                f6 = f2;
                mm40Var4 = mm40Var2;
                f5 = f;
            }
            fetVar.s();
            boolean zD = fetVar.d(f5) | fetVar.d(f6);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new sjl(f5, f6, i7);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var4);
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
            ugdVar2 = ugdVar;
            twn.v(6, ugdVar2, fetVar, true);
            mm40Var3 = mm40Var4;
            i5 = i7;
            f3 = f5;
            f4 = f6;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            i5 = i;
            f3 = f;
            f4 = f2;
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(i5, f3, f4, ugdVar2, i2, i3) { // from class: a.qjl
                public final /* synthetic */ byte b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ ugd e;
                public final /* synthetic */ byte f;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(24577);
                    jeb.o(this.f28845a, this.b, this.c, this.d, this.e, (fet) obj, iL, this.f);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void p(mm40 mm40Var, py1 py1Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        Function0 function3;
        Function0 function4;
        py1Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-510119852);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(py1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            int i3 = i2 >> 3;
            b(py1Var, fetVar, i3 & 14);
            c(py1Var, function0, function3, function4, fetVar, i3 & 8190);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bsl(mm40Var, py1Var, function0, function1, function2, i, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, i4m i4mVar, lh80 lh80Var, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 4) != 0) {
            zcl zclVar = qmk.f28987a;
            lh80Var = s5x0.t(12.0f, 0.0f, 2);
        }
        if (i4mVar instanceof g4m) {
            fetVar.e0(335385851);
            e(mm40Var, lh80Var, (g4m) i4mVar, fetVar, i & 14);
            fetVar.r(false);
        } else {
            if (!(i4mVar instanceof h4m)) {
                throw b1j.f(703553910, fetVar, false);
            }
            fetVar.e0(335593055);
            G(mm40Var, lh80Var, fetVar, i & 14);
            fetVar.r(false);
        }
    }

    public static final void r(mm40 mm40Var, bhm bhmVar, fet fetVar, int i) {
        long secondary;
        fetVar.g0(811229998);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.e(bhmVar.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 4.0f);
            int iOrdinal = bhmVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1305740306);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(1305738144, fetVar, false);
                }
                fetVar.e0(1305742668);
                secondary = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                fetVar.r(false);
            }
            zq8.a(0, fetVar, i120.Q(mm40VarS, secondary, vgg0.a(2.0f)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, bhmVar, i, (byte) 3);
        }
    }

    public static final void s(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(869680796);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            F(i2 & 126, fetVar, a4xVar, mm40Var);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 3);
        }
    }

    public static final void t(mm40 mm40Var, eym eymVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2008037008);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 84.0f);
            x5d x5dVarA = w5d.a(new qw3(6.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (!(eymVar.c instanceof txm) || eymVar.b.length() > 0 || eymVar.d.length() > 0 || eymVar.e != null) {
                fetVar.e0(1691626068);
                A(eymVar, fetVar, (i2 >> 3) & 14);
                fetVar.r(false);
            } else {
                fetVar.e0(1691676040);
                fetVar.r(false);
            }
            E(0, fetVar, null, eymVar.f8633a);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 17, i, mm40Var, eymVar);
        }
    }

    public static final void u(mm40 mm40Var, rqp0 rqp0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        rqp0Var.getClass();
        fetVar2.g0(-580324487);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(rqp0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(mm40Var, qmk.a(fetVar2).c, 0.0f, 2), 1.0f), 56.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, o7k0.n(jm40.b, 24.0f), s6t0.b().f33626a.getSecondary(), fetVar2, 56, 0);
            v8q0.a(rqp0Var.f30943a, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, rqp0Var, i, (byte) 0);
        }
    }

    public static final void v(s8o0 s8o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1977181);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(s8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = s6o.f31714a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(s8o0Var, context, (byte) 16);
                fetVar.o0(objP2);
            }
            y860.f(xdrVar, null, (Function1) objP2, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(s8o0Var, i, b);
        }
    }

    public static final void w(mm40 mm40Var, ehm0 ehm0Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-934830816);
        byte b = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ehm0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ehm0Var.f7815a;
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new s8o(function1, b);
                fetVar.o0(objP);
            }
            tfx.p(R.string.statistic_table_title, R.drawable.ic_glyph_versus, z, (Function0) objP, o7k0.y(mm40Var, null, 3), u1c.M(-393204978, new ymo(ehm0Var, b2), fetVar), fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, ehm0Var, function1, i, (byte) 6);
        }
    }

    public static final void x(b4m b4mVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(27387663);
        int i2 = i | (fetVar2.g(b4mVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarC, 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), vgg0.a(12.0f)), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 20.0f);
            long separator30 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator30();
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, separator30, ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            rq8.b(lgb.J(o7k0.n(jm40Var, 18.0f), ugg0Var), o7k0.n(jm40Var, 18.0f), null, R.drawable.ic_glyph_circle_globe, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary60()), null, null, gqw0.A, null, fetVar2, 12582912, 352);
            fetVar2.r(true);
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a("Title", null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(b4mVar, i);
        }
    }

    public static final void y(int i, long j, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(371092253);
        int i2 = i | 48 | (fetVar.d(12.0f) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, jr8.f16991a.b(i120.P(o7k0.e(mm40VarD, 52.0f), yk5.n(q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(j)), 0.0f, Float.POSITIVE_INFINITY, 8), vgg0.c(0.0f, 0.0f, 12.0f, 12.0f, 3), 4), gqw0.h));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var2, j, i, (byte) 5);
        }
    }

    public static final void z(mm40 mm40Var, vrp vrpVar, fet fetVar, int i) {
        pcy pcyVar;
        fet fetVar2 = fetVar;
        vrpVar.getClass();
        boolean z = vrpVar.d;
        fetVar2.g0(-682685773);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(vrpVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            long j = kkg.A;
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "HALF_STATISTICS");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            wrp wrpVar = vrpVar.c;
            wrp wrpVar2 = vrpVar.b;
            jm40 jm40Var = jm40.b;
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarE1 = o2e.e0(s5x0.N(z ? zhg0Var.a(1.0f, jm40Var, true) : o7k0.s(jm40Var, 100.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14), "HALF_NAME");
            String str = vrpVar.f37911a;
            long j2 = qmk.u;
            v8q0.a(str, mm40VarE1, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, j2, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 109544);
            fetVar2 = fetVar;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            jtm0.g(wrpVar2.f39655a, wrpVar2.b, fetVar2, 0);
            jtm0.g(wrpVar.f39655a, wrpVar.b, fetVar2, 0);
            fetVar2.r(true);
            fetVar2.r(true);
            xdx.o(0, fetVar2, s5x0.N(z ? zhg0Var.a(1.0f, jm40Var, true) : o7k0.s(jm40Var, 70.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11), wrpVar2.c, wrpVar.c);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var, vrpVar, i, (byte) 8);
        }
    }
}
