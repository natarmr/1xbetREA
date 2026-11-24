package a;

import android.gov.nist.core.Separators;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w7n0 {
    public static final m3w A(for0 for0Var, ctf0 ctf0Var) {
        int i;
        long primary;
        ctf0Var.getClass();
        i0w i0wVar = for0Var.g;
        int iOrdinal = i0wVar.ordinal();
        if (iOrdinal == 1) {
            i = R.string.accepted;
        } else if (iOrdinal == 2) {
            i = R.string.loosed;
        } else if (iOrdinal == 3) {
            i = R.string.won;
        } else {
            if (iOrdinal != 4) {
                return null;
            }
            i = R.string.paid;
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(i, Arrays.copyOf(new Object[0], 0));
        int iOrdinal2 = i0wVar.ordinal();
        if (iOrdinal2 == 1) {
            pz40 pz40Var = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
        } else if (iOrdinal2 == 2) {
            pz40 pz40Var2 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                t9f.b();
                return null;
            }
            pz40 pz40Var3 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        return new m3w(lsm0Var.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0)), strA, primary);
    }

    public static final p9n B(hcs hcsVar) {
        int iOrdinal = hcsVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return p9n.NEW;
        }
        if (iOrdinal == 2) {
            return p9n.FREE;
        }
        if (iOrdinal == 3) {
            return p9n.BEST;
        }
        if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                return p9n.SPECIAL;
            }
            t9f.b();
        }
        return null;
    }

    public static final String C(float f) {
        if (f == -1.0f || f == 0.0f) {
            return null;
        }
        return f % 1.0f == 0.0f ? String.valueOf((long) f) : String.valueOf(f);
    }

    public static final jo20 D(v7n0 v7n0Var) {
        jo20 jo20Var = new jo20();
        jo20Var.put("cfView", Integer.valueOf(v7n0Var.f36936a));
        int i = v7n0Var.c;
        if (i > 0) {
            jo20Var.put("country", Integer.valueOf(i));
        }
        jo20Var.put("fcountry", Integer.valueOf(v7n0Var.b));
        jo20Var.put("gr", 1357);
        jo20Var.put("lng", v7n0Var.d);
        jo20Var.put("ref", 1);
        jo20Var.put("subId", v7n0Var.e);
        if (v7n0Var.f) {
            jo20Var.put("userId", Long.valueOf(v7n0Var.g));
        }
        return w6x.j(22, jo20Var, "whence");
    }

    public static final dlp0 E(clp0 clp0Var) {
        clp0Var.getClass();
        Integer num = clp0Var.f4572a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = clp0Var.b;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = clp0Var.c;
        return new dlp0(iIntValue, iIntValue2, num3 != null ? num3.intValue() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final t8s0 F(w8s0 w8s0Var) {
        ?? arrayList;
        w8s0Var.getClass();
        Long l = w8s0Var.f38739a;
        long jLongValue = l != null ? l.longValue() : 0L;
        List<s8s0> list = w8s0Var.b;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (s8s0 s8s0Var : list) {
                s8s0Var.getClass();
                String str = s8s0Var.f31818a;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                String strE = lmc.E(s8s0Var.b);
                Integer num = s8s0Var.c;
                int iIntValue = 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                Integer num2 = s8s0Var.d;
                int iIntValue3 = num2 != null ? num2.intValue() : 0;
                Integer num3 = s8s0Var.e;
                int iIntValue4 = num3 != null ? num3.intValue() : 0;
                Integer num4 = s8s0Var.f;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                }
                arrayList.add(new p8s0(iIntValue2, iIntValue3, iIntValue4, iIntValue, str2, strE));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new t8s0(jLongValue, arrayList);
    }

    public static final q56 G(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        q56 l56Var;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal != 0) {
            boolean z5 = true;
            if (iOrdinal != 1) {
                d2i d2iVar = null;
                if (iOrdinal != 2) {
                    c2m c2mVar = c2m.f3631a;
                    if (iOrdinal == 3) {
                        long j = d0tVar.f5282a;
                        n0x n0xVar = new n0x(dtb.F(str));
                        if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
                            z5 = false;
                        }
                        l56Var = new n56(j, s7n0.p(d0tVar, str, kpb.G(d0tVar, ctf0Var), list, z2, z3, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new u66(new sws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new sws0(qzb.r0(d0tVar), kpb.U(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        l56Var = new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new m66(new z1m(c2mVar), dyb.a0(d0tVar), new tws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new tws0(qzb.r0(d0tVar), kpb.U(d0tVar)), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                    }
                } else {
                    long j2 = d0tVar.f5282a;
                    k4i k4iVarQ = s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    rws0 rws0Var = new rws0(qzb.c0(d0tVar), kpb.D(d0tVar));
                    rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kpb.U(d0tVar));
                    p0n p0nVarA0 = dyb.a0(d0tVar);
                    String strG = kpb.G(d0tVar, ctf0Var);
                    if (d0tVar.S && z4) {
                        d2iVar = new d2i();
                    }
                    l56Var = new o56(j2, k4iVarQ, new c76(d2iVar, p0nVarA0, rws0Var, rws0Var2, strG), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new k76(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            l56Var = new l56(d0tVar.f5282a, s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new e66(new pws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new pws0(qzb.r0(d0tVar), kpb.U(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return l56Var;
    }

    public static final d0t H(d0t d0tVar, boolean z, boolean z2, boolean z3) {
        d0tVar.getClass();
        boolean z4 = d0tVar.G || d0tVar.e.length() != 0;
        List list = d0tVar.k;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(H((d0t) it.next(), z, z2, z3));
        }
        return d0t.a(d0tVar, arrayList, z3, z2, z, z4, null, 536869887, 16382);
    }

    public static final String I(mxp mxpVar) {
        List list;
        List listJ = q3d.j(Integer.valueOf(mxpVar.p), Integer.valueOf(mxpVar.q), Integer.valueOf(mxpVar.r));
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() == -1) {
                    list = null;
                }
            }
            list = listJ;
        } else {
            list = listJ;
        }
        if (list != null) {
            return CollectionsKt.b0(list, "-", null, null, null, 62);
        }
        return null;
    }

    public static h70 J(c0x0 c0x0Var) {
        if (c0x0Var == c0x0.c) {
            return new h70("HmacSha256", (byte) 6);
        }
        if (c0x0Var == c0x0.d) {
            return new h70("HmacSha384", (byte) 6);
        }
        if (c0x0Var == c0x0.e) {
            return new h70("HmacSha512", (byte) 6);
        }
        jf4.o("Unrecognized HPKE KDF identifier");
        return null;
    }

    public static k2x0 K(b0x0 b0x0Var) {
        if (b0x0Var == b0x0.c) {
            return new wv00(16, (byte) 2);
        }
        if (b0x0Var == b0x0.d) {
            return new wv00(32, (byte) 2);
        }
        if (b0x0Var == b0x0.e) {
            return new cpw0((byte) 27);
        }
        jf4.o("Unrecognized HPKE AEAD identifier");
        return null;
    }

    public static r2x0 L(d0x0 d0x0Var) {
        if (d0x0Var == d0x0.f) {
            return new trm0(new h70("HmacSha256", (byte) 6));
        }
        if (d0x0Var == d0x0.c) {
            return hcp0.w(fix0.f9611a);
        }
        if (d0x0Var == d0x0.d) {
            return hcp0.w(fix0.b);
        }
        if (d0x0Var == d0x0.e) {
            return hcp0.w(fix0.c);
        }
        jf4.o("Unrecognized HPKE KEM identifier");
        return null;
    }

    public static final void a(nvv nvvVar, fet fetVar, int i) {
        fetVar.g0(-642207742);
        int i2 = (fetVar.g(nvvVar) ? 32 : 16) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = nvvVar.f24205a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            mm40 mm40VarO = ny9.O(1.0f, new x7z(1.0f, true), false);
            zcl zclVar = qmk.b;
            ugg0 ugg0Var = vgg0.f37379a;
            lgb.v(o2e.e0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarO), "ADDITIONAL_HERO_LOGO"), o2e.e0(s5x0.J(i120.Q(i120.Q(ny9.O(1.0f, new x7z(1.0f, true), false), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar, zclVar, zclVar, zclVar)), kkg.f, new ugg0(zclVar, zclVar, zclVar, zclVar)), 2.0f), "ADDITIONAL_HERO_LOGO"), str, R.drawable.ic_sport_league_of_legends_106, jM126getWhite200d7_KjU, gqw0.A, fetVar, 196608, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ilo0(nvvVar, i, b);
        }
    }

    public static final void b(a4x a4xVar, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-665406857);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                fetVar.e0(494142782);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(494143706);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-375826633, new eup(a4xVar, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gos(a4xVar, z, i, b);
        }
    }

    public static final void c(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(287374869);
        byte b = 2;
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, b);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, (byte) 29);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-257559346);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "HERO_INFO_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE1 = o2e.e0(jm40Var, "HERO_INFO_TEXT_PLAYER_NAME");
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE1, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, ((i2 >> 3) & 14) | 48, 24960, 109560);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str2, o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), "HERO_INFO_TEXT_HERO_NAME"), staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.f(), fetVar, (i2 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 22);
        }
    }

    public static final void e(nvv nvvVar, fet fetVar, int i) {
        fetVar.g0(-2096504167);
        int i2 = (fetVar.g(nvvVar) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            String str = nvvVar.f24205a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            lgb.v(o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), "STATISTIC_HERO_PARAMS_FULL_HERO_LOGO"), o2e.e0(s5x0.J(i120.Q(i120.Q(o7k0.n(jm40Var, 24.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), kkg.f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), "STATISTIC_HERO_PARAMS_FULL_HERO_LOGO"), str, R.drawable.ic_sport_league_of_legends_106, jM126getWhite200d7_KjU, gqw0.A, fetVar, 196608, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ilo0(nvvVar, i, b);
        }
    }

    public static final void f(int i, fet fetVar) {
        fetVar.g0(74219212);
        if (fetVar.U(i & 1, i != 0)) {
            hp4.A(0, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i, (byte) 19);
        }
    }

    public static final void g(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(-1731608481);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 24.0f), "STATISTIC_HERO_PARAMS_FULL_ADDITIONAL_IMAGES_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -129200577, a4xVar);
            while (itO.hasNext()) {
                a((nvv) itO.next(), fetVar, 6);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 22);
        }
    }

    public static final void h(ylo0 ylo0Var, fet fetVar, int i) {
        fetVar.g0(-907044253);
        int i2 = (fetVar.g(ylo0Var) ? 4 : 2) | i;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (ylo0Var instanceof wlo0) {
            fetVar.e0(208839011);
            i((wlo0) ylo0Var, fetVar, i2 & 14);
            fetVar.r(false);
        } else {
            if (!(ylo0Var instanceof xlo0)) {
                throw b1j.f(208836845, fetVar, false);
            }
            fetVar.e0(208841892);
            j((xlo0) ylo0Var, fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(ylo0Var, i, (byte) 18);
        }
    }

    public static final void i(wlo0 wlo0Var, fet fetVar, int i) {
        fetVar.g0(1781304657);
        int i2 = (fetVar.g(wlo0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 8.0f, 0.0f, 10), "STATISTIC_HERO_PARAMS_FULL_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            e(wlo0Var.c, fetVar, 0);
            g(0, fetVar, wlo0Var.d, s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14));
            d(0, fetVar, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), wlo0Var.f39365a, wlo0Var.b);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(wlo0Var, i, (byte) 19);
        }
    }

    public static final void j(xlo0 xlo0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1231208137);
        int i2 = i | (fetVar2.g(xlo0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 8.0f, 0.0f, 10), "STATISTIC_HERO_PARAMS_SHORT_BOX");
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            v8q0.a(xlo0Var.f41085a, o2e.e0(jm40Var, "STATISTIC_HERO_PARAM_TEXT"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(xlo0Var, i, (byte) 20);
        }
    }

    public static final void k(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1437911586);
        byte b = 16;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_info_shield, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((h6p0) l7m0Var.getValue()).b().f35107a;
            j9m0 j9m0Var = ((h6p0) l7m0Var.getValue()).b().b;
            boolean zA = ((h6p0) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, b2);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(-1655628496, new dqz(l7m0Var, function1, b), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, (byte) 20);
        }
    }

    public static final void l(int i, long j, fet fetVar, mm40 mm40Var, y9q0 y9q0Var, String str) {
        int i2;
        fetVar.g0(1383861061);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(y9q0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.g(mm40Var) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            v8q0.a(str, mm40Var, j, new n05(qmk.p, qmk.t, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i3 & 14) | ((i3 >> 6) & 112) | (i3 & 896), ((i3 << 18) & 29360128) | 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fqh(str, y9q0Var, j, mm40Var, i);
        }
    }

    public static final String m(List list) {
        String str;
        list.getClass();
        xut0 xut0Var = (xut0) CollectionsKt.firstOrNull(list);
        return (xut0Var == null || (str = xut0Var.f41528a) == null) ? "" : str;
    }

    public static final void n(lc00 lc00Var, String str, float f, float f2) {
        if (f > 0.0f || f2 > 0.0f) {
            String strC = C(f);
            String strC2 = C(f2);
            if (strC == null) {
                strC = "–";
            }
            if (strC2 == null) {
                strC2 = "–";
            }
            lc00Var.add(new j8n(strC, str, strC2));
        }
    }

    public static final a4x o(mxp mxpVar, mxp mxpVar2, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (mxpVar == null || mxpVar2 == null) {
            return lak0.c;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        String strI = I(mxpVar);
        String strI2 = I(mxpVar2);
        if (strI != null && !StringsKt.W(strI) && strI2 != null && !StringsKt.W(strI2)) {
            lc00VarB.add(new j8n(strI, "W-L-D", strI2));
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.country_title, Arrays.copyOf(new Object[0], 0));
        String str = mxpVar.l;
        String str2 = mxpVar2.l;
        if (!StringsKt.W(str) && !StringsKt.W(str2)) {
            lc00VarB.add(new j8n(str, strA, str2));
        }
        n(lc00VarB, lsm0Var.a(R.string.ufc_fighter_height_cm, Arrays.copyOf(new Object[0], 0)), mxpVar.h, mxpVar2.h);
        n(lc00VarB, lsm0Var.a(R.string.ufc_fighter_weight_kg, Arrays.copyOf(new Object[0], 0)), mxpVar.i, mxpVar2.i);
        n(lc00VarB, lsm0Var.a(R.string.ufc_fighter_arm_reach_cm, Arrays.copyOf(new Object[0], 0)), mxpVar.j, mxpVar2.j);
        n(lc00VarB, lsm0Var.a(R.string.ufc_fighter_leg_reach_cm, Arrays.copyOf(new Object[0], 0)), mxpVar.C, mxpVar2.C);
        return dyb.o0(kotlin.collections.a.a(lc00VarB));
    }

    public static final i0h0 p(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            i0h0 i0h0Var = tag instanceof i0h0 ? (i0h0) tag : null;
            if (i0h0Var != null) {
                return i0h0Var;
            }
            Object objV = k7n0.v(view);
            view = objV instanceof View ? (View) objV : null;
        }
        return null;
    }

    public static final i4i q(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z5 || z6) {
            v3iVar = new v3i(z5 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new i4i(false, c4iVar, null, v3iVar, z3iVar, x3iVar, null, 68);
    }

    public static k4i r(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z5 || z6) {
            v3iVar = new v3i(z5 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new k4i(c4iVar, null, v3iVar, z3iVar, x3iVar, t3i.f33268a, 4);
    }

    public static l4i s(e4i e4iVar, d0t d0tVar, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str4, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        h4i h4iVar = e4iVar;
        if (e4iVar == null) {
            h4iVar = z3 ? g4i.f10668a : f4i.f8914a;
        }
        b4i b4iVar = new b4i(str2, h4iVar);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z6 || z7) {
            v3iVar = new v3i(z6 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new l4i(str3, c4iVar, b4iVar, v3iVar, z3iVar, x3iVar, t3i.f33268a);
    }

    public static k4i t(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new k4i(c4iVar, null, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static j4i u(y3d y3dVar, d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        y3d y3dVar2;
        y3d y3dVar3;
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        boolean z5 = list.contains(Integer.valueOf(i)) && z;
        String strA = jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a();
        boolean z6 = z2 && list.contains(Integer.valueOf(i));
        n0x n0xVar = new n0x(dtb.L(i, str, str2, list, z));
        m0x m0xVar = new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6);
        if (z5) {
            y3dVar3 = y3dVar;
            y3dVar2 = new y3d(y3d.g);
        } else {
            y3dVar2 = y3dVar;
            y3dVar3 = y3dVar2;
        }
        c4i c4iVar = new c4i(strA, z6, n0xVar, m0xVar, y3dVar2, y3dVar3);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new j4i(c4iVar, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static final f3w v(for0 for0Var, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(for0Var.f, p3u0.c), str, e3w.f7156a);
    }

    public static final f3w w(for0 for0Var, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        str.getClass();
        hxu hxuVar = for0Var.l;
        if (hxuVar.f.b != 0.0d) {
            String strA = ctf0Var.b.a(R.string.history_your_win_new, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var = pn40.f27267a;
            return new f3w("", strA, pn40.c(hxuVar.f.b, p3u0.c), str, e3w.b);
        }
        i0w i0wVar = for0Var.g;
        if (i0wVar != i0w.d && i0wVar != i0w.e) {
            return null;
        }
        String strA2 = ctf0Var.b.a(R.string.history_your_win_new, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var2 = pn40.f27267a;
        return new f3w("", strA2, pn40.c(for0Var.c, p3u0.c), str, e3w.b);
    }

    public static final j3w x(for0 for0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        int iOrdinal = for0Var.g.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            return new j3w(ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0)), "\u200e".concat(for0Var.h));
        }
        return null;
    }

    public static final m3w y(for0 for0Var, ctf0 ctf0Var) {
        String strZ;
        long primary;
        ctf0Var.getClass();
        i0w i0wVar = for0Var.g;
        boolean z = for0Var.j;
        int iOrdinal = i0wVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            strZ = z(ctf0Var, ctf0Var.b.a(R.string.accepted, Arrays.copyOf(new Object[0], 0)), z);
        } else if (iOrdinal == 2) {
            strZ = z(ctf0Var, ctf0Var.b.a(R.string.loosed, Arrays.copyOf(new Object[0], 0)), z);
        } else if (iOrdinal == 3) {
            strZ = z(ctf0Var, ctf0Var.b.a(R.string.won, Arrays.copyOf(new Object[0], 0)), z);
        } else {
            if (iOrdinal != 4) {
                return null;
            }
            strZ = z(ctf0Var, ctf0Var.b.a(R.string.paid, Arrays.copyOf(new Object[0], 0)), z);
        }
        int iOrdinal2 = i0wVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            pz40 pz40Var = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
        } else if (iOrdinal2 == 2) {
            pz40 pz40Var2 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                t9f.b();
                return null;
            }
            pz40 pz40Var3 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        return new m3w(ctf0Var.b.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0)), strZ, primary);
    }

    public static final String z(ctf0 ctf0Var, String str, boolean z) {
        return kng0.m(str, " (", z ? ctf0Var.b.a(R.string.confirmed, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.not_confirmed, Arrays.copyOf(new Object[0], 0)), Separators.RPAREN);
    }
}
