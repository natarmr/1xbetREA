package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.media.ImageReader;
import android.text.format.DateFormat;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g1x {
    /* JADX WARN: Code duplicated, block: B:48:0x0169  */
    public static final e1z A(List list, ctf0 ctf0Var, String str, String str2) {
        String strA;
        gkv0 gkv0Var;
        list.getClass();
        ctf0Var.getClass();
        str.getClass();
        List<aq30> listA0 = CollectionsKt.A0(list, new wpv((byte) 7));
        ArrayList arrayList = new ArrayList(r3d.q(listA0, 10));
        for (aq30 aq30Var : listA0) {
            zp30 zp30Var = aq30Var.c;
            fe30 fe30Var = aq30Var.e;
            mdp0 mdp0Var = new mdp0(new g5a0(new c280(zp30Var.b, R.drawable.ic_glyph_placeholder_player), null), aq30Var.c.c);
            zp30 zp30Var2 = aq30Var.d;
            mdp0 mdp0Var2 = new mdp0(new g5a0(new c280(zp30Var2.b, R.drawable.ic_glyph_placeholder_player), null), zp30Var2.c);
            rdj rdjVar = rdj.f30294a;
            String strF = rdj.f(new znq0(aq30Var.b), sdj.UNIVERSAL, null, 60);
            if (str2 != null) {
                if (fe30Var instanceof ee30) {
                    ee30 ee30Var = (ee30) fe30Var;
                    strA = ctf0Var.b.a(R.string.placeholder_score_two_teams, Arrays.copyOf(new Object[]{Integer.valueOf(ee30Var.f7650a), Integer.valueOf(ee30Var.b)}, 2));
                } else {
                    if (!(fe30Var instanceof de30)) {
                        t9f.b();
                        return null;
                    }
                    zg30 zg30Var = ((de30) fe30Var).f5928a;
                    if (zg30Var.equals(vg30.f37363a)) {
                        strA = ctf0Var.b.a(R.string.draw_game, Arrays.copyOf(new Object[0], 0));
                    } else {
                        boolean z = zg30Var instanceof wg30;
                        int i = R.string.lose;
                        if (z) {
                            if (((wg30) zg30Var).f39094a.equals(str2)) {
                                i = R.string.dt_prizes;
                            }
                            strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
                        } else if (zg30Var instanceof xg30) {
                            if (((xg30) zg30Var).f40821a.equals(str2)) {
                                i = R.string.dt_prizes;
                            }
                            strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!zg30Var.equals(yg30.f42568a)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        }
                    }
                }
            } else if (fe30Var instanceof ee30) {
                ee30 ee30Var2 = (ee30) fe30Var;
                strA = ctf0Var.b.a(R.string.placeholder_score_two_teams, Arrays.copyOf(new Object[]{Integer.valueOf(ee30Var2.f7650a), Integer.valueOf(ee30Var2.b)}, 2));
            } else {
                strA = ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
            }
            String str3 = aq30Var.f1279a;
            zg30 zg30VarA = fe30Var.a();
            if (zg30VarA == null) {
                gkv0Var = gkv0.c;
            } else if (zg30VarA instanceof wg30) {
                gkv0Var = gkv0.f11463a;
            } else if (zg30VarA instanceof xg30) {
                gkv0Var = gkv0.b;
            } else {
                gkv0Var = gkv0.c;
            }
            arrayList.add(new ezy(mdp0Var, mdp0Var2, strF, strA, str3, gkv0Var));
        }
        return new e1z(dyb.o0(arrayList), str);
    }

    public static final th10 B(wh10 wh10Var) {
        wh10Var.getClass();
        String str = wh10Var.f39144a;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = wh10Var.b;
        if (str2 != null) {
            return new th10(str, str2);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    public static final mk50 C(lk50 lk50Var, boolean z) {
        String strL;
        String strL2;
        boolean z2;
        k1m0 k1m0Var;
        boolean z3;
        ArrayList arrayList;
        String str;
        String str2;
        lk50Var.getClass();
        String str3 = lk50Var.b;
        List list = lk50Var.i;
        List list2 = lk50Var.l;
        String str4 = lk50Var.c;
        String str5 = lk50Var.d;
        String str6 = lk50Var.e;
        String str7 = lk50Var.f;
        String str8 = lk50Var.g;
        String str9 = lk50Var.h;
        List list3 = lk50Var.k;
        y3n0 y3n0Var = (y3n0) CollectionsKt.f0(list3);
        String str10 = y3n0Var != null ? y3n0Var.b : null;
        if (str10 == null) {
            str10 = "";
        }
        String strT = vsm0.t(str10);
        y3n0 y3n0Var2 = (y3n0) CollectionsKt.f0(list2);
        String str11 = y3n0Var2 != null ? y3n0Var2.b : null;
        if (str11 == null) {
            str11 = "";
        }
        String strT2 = vsm0.t(str11);
        y3n0 y3n0Var3 = (y3n0) CollectionsKt.firstOrNull(list3);
        String str12 = y3n0Var3 != null ? y3n0Var3.f41961a : null;
        if (str12 == null || str12.length() == 0) {
            strL = "";
        } else {
            y3n0 y3n0Var4 = (y3n0) CollectionsKt.f0(list3);
            String str13 = y3n0Var4 != null ? y3n0Var4.f41961a : null;
            if (str13 == null || str13.length() == 0) {
                strL = "";
            } else {
                y3n0 y3n0Var5 = (y3n0) CollectionsKt.firstOrNull(list3);
                String str14 = y3n0Var5 != null ? y3n0Var5.f41961a : null;
                if (str14 == null) {
                    str14 = "";
                }
                y3n0 y3n0Var6 = (y3n0) CollectionsKt.f0(list3);
                String str15 = y3n0Var6 != null ? y3n0Var6.f41961a : null;
                if (str15 == null) {
                    str15 = "";
                }
                strL = kng0.l(str14, Separators.SLASH, str15);
            }
        }
        y3n0 y3n0Var7 = (y3n0) CollectionsKt.firstOrNull(list2);
        String str16 = y3n0Var7 != null ? y3n0Var7.f41961a : null;
        if (str16 == null || str16.length() == 0) {
            strL2 = "";
        } else {
            y3n0 y3n0Var8 = (y3n0) CollectionsKt.f0(list2);
            String str17 = y3n0Var8 != null ? y3n0Var8.f41961a : null;
            if (str17 == null || str17.length() == 0) {
                strL2 = "";
            } else {
                y3n0 y3n0Var9 = (y3n0) CollectionsKt.firstOrNull(list2);
                String str18 = y3n0Var9 != null ? y3n0Var9.f41961a : null;
                if (str18 == null) {
                    str18 = "";
                }
                y3n0 y3n0Var10 = (y3n0) CollectionsKt.f0(list2);
                String str19 = y3n0Var10 != null ? y3n0Var10.f41961a : null;
                strL2 = kng0.l(str18, Separators.SLASH, str19 == null ? "" : str19);
            }
        }
        List list4 = lk50Var.i;
        cys0 cys0Var = lk50Var.j;
        String str20 = strL2;
        List list5 = lk50Var.k;
        List list6 = lk50Var.l;
        k1m0 k1m0Var2 = lk50Var.m;
        k1m0 k1m0Var3 = new k1m0(k1m0Var2.f17533a, k1m0Var2.b);
        if (list != null && list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((u0m0) it.next()).i == lho.GAME_STATUS_LIVE) {
                z2 = true;
                break;
            }
        }
        if (lk50Var.f20183a == 66) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                k1m0 k1m0Var4 = k1m0Var3;
                u0m0 u0m0Var = (u0m0) obj;
                boolean z4 = z2;
                if (!u0m0Var.f.equals("") && !u0m0Var.g.equals("")) {
                    arrayList2.add(obj);
                }
                k1m0Var3 = k1m0Var4;
                z2 = z4;
            }
            k1m0Var = k1m0Var3;
            z3 = z2;
            arrayList = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                u0m0 u0m0Var2 = (u0m0) it2.next();
                String str21 = u0m0Var2.b;
                String str22 = u0m0Var2.g;
                Iterator it3 = it2;
                String str23 = u0m0Var2.f;
                if (str21.equals(str5)) {
                    str2 = str23;
                    str = str2;
                } else {
                    str = str23;
                    str2 = str22;
                }
                if (!u0m0Var2.c.equals(str6)) {
                    str22 = str;
                }
                boolean zEquals = u0m0Var2.b.equals(str5);
                int i = u0m0Var2.j;
                if (!zEquals) {
                    if (i == 1) {
                        i = 2;
                    } else if (i == 2) {
                        i = 1;
                    }
                }
                arrayList.add(new u5h0(i, str2, str22));
                it2 = it3;
            }
        } else {
            k1m0Var = k1m0Var3;
            z3 = z2;
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                u0m0 u0m0Var3 = (u0m0) next;
                Iterator it5 = it4;
                if (u0m0Var3.d != -1 && u0m0Var3.e != -1) {
                    arrayList3.add(next);
                }
                it4 = it5;
            }
            arrayList = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                u0m0 u0m0Var4 = (u0m0) it6.next();
                String str24 = u0m0Var4.b;
                int i2 = u0m0Var4.e;
                Iterator it7 = it6;
                int i3 = u0m0Var4.d;
                String strValueOf = str24.equals(str5) ? String.valueOf(i3) : String.valueOf(i2);
                String strValueOf2 = u0m0Var4.c.equals(str6) ? String.valueOf(i2) : String.valueOf(i3);
                boolean zEquals2 = u0m0Var4.b.equals(str5);
                int i4 = u0m0Var4.j;
                if (!zEquals2) {
                    if (i4 == 1) {
                        i4 = 2;
                    } else if (i4 == 2) {
                        i4 = 1;
                    }
                }
                arrayList.add(new u5h0(i4, strValueOf, strValueOf2));
                it6 = it7;
            }
        }
        return new mk50(str3, str4, str5, str6, str7, str8, str9, strT, strT2, strL, str20, list4, cys0Var, list5, list6, k1m0Var, z3, arrayList, z);
    }

    public static final ae90 D(te90 te90Var) {
        te90Var.getClass();
        return new vd90(wzb.f0(te90Var), wzb.j0(te90Var));
    }

    public static final gtc0 E(soc0 soc0Var) {
        switch (soc0Var.ordinal()) {
            case 0:
            case 8:
                return gtc0.DEFAULT;
            case 1:
                return gtc0.PROMO_CODE_CHECK;
            case 2:
                return gtc0.CHAMPIONS_CLUB;
            case 3:
                return gtc0.CASHBACK;
            case 4:
                return gtc0.VIP_CASHBACK;
            case 5:
                return gtc0.REGISTRATION_BONUS_PARTICIPATION;
            case 6:
                return gtc0.PROMO_PARTICIPATION;
            case 7:
                return gtc0.BONUSES;
            case 9:
                return gtc0.REFERRAL_PROGRAM;
            case 10:
                return gtc0.BONUS_GAMES;
            case 11:
                return gtc0.SPORT_CASHBACK_CP;
            default:
                t9f.b();
                return null;
        }
    }

    public static final m0k0 F(m9s m9sVar, long j) {
        long j2 = m9sVar.o;
        List list = m9sVar.n;
        List list2 = m9sVar.d;
        List list3 = m9sVar.m;
        String str = m9sVar.z;
        List list4 = m9sVar.c;
        Long l = (Long) CollectionsKt.firstOrNull(list4);
        long jLongValue = l != null ? l.longValue() : 0L;
        String str2 = m9sVar.i;
        String str3 = (String) CollectionsKt.firstOrNull(list3);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.W(1, list3);
        if (str4 == null) {
            str4 = "";
        }
        Long l2 = (Long) CollectionsKt.firstOrNull(list2);
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        String str5 = str4;
        long j3 = jLongValue;
        String str6 = m9sVar.j;
        String str7 = (String) CollectionsKt.firstOrNull(list);
        if (str7 == null) {
            str7 = "";
        }
        String str8 = (String) CollectionsKt.W(1, list);
        String str9 = str8 != null ? str8 : "";
        int iMax = Math.max(list4.size(), list2.size());
        qqs qqsVar = m9sVar.h;
        String str10 = qqsVar.b;
        String str11 = m9sVar.f;
        String str12 = m9sVar.e;
        String str13 = m9sVar.t;
        boolean z = m9sVar.x;
        long j4 = m9sVar.v;
        long j5 = m9sVar.A;
        long j6 = m9sVar.p;
        boolean z2 = m9sVar.r;
        String str14 = m9sVar.G;
        return new m0k0(j2, str, j3, str2, str3, str5, jLongValue2, str6, str7, str9, iMax, str10, qqsVar.d, qqsVar.e, "", "", 0, 0, str11, str12, "", str13, j, z, j4, j5, z2, j6, m9sVar.f21426a, str14, false, false, m9sVar.L != boh.UNKNOWN);
    }

    public static final kvl0 G(wwl0 wwl0Var, int i, String str, ctf0 ctf0Var) {
        wwl0Var.getClass();
        str.getClass();
        ctf0Var.getClass();
        long j = wwl0Var.f39890a;
        String str2 = wwl0Var.e;
        String str3 = wwl0Var.d;
        String str4 = wwl0Var.b;
        String str5 = wwl0Var.c;
        return new kvl0(str4, q5x.G(str, i, wwl0Var.f39890a), str5.length() > 0 ? ctf0Var.b.a(R.string.stadium_capacity_title_v2, Arrays.copyOf(new Object[]{str5}, 1)) : null, str3.length() > 0 ? ctf0Var.b.a(R.string.stadium_open_title_v2, Arrays.copyOf(new Object[]{str3}, 1)) : null, str2.length() > 0 ? ctf0Var.b.a(R.string.stadium_architector_title_v2, Arrays.copyOf(new Object[]{str2}, 1)) : null, j);
    }

    public static final void a(o2a0 o2a0Var, long j, long j2, fet fetVar, int i) {
        fetVar.g0(-1387643761);
        int i2 = i | (fetVar.g(o2a0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.L(o7k0.e(x7zVar, 4.0f), 6.0f, 0.0f, 2), 1.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qp7((Object) o2a0Var, j, j2, (byte) 5);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, rq8.L(mm40VarD, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ena0(o2a0Var, j, j2, i);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1677962655);
        byte b = 4;
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, qmk.a(fetVar).c, 0.0f, 2);
            ch80 ch80VarF = h97.f(0.0f, 0.0f, 0.0f, 0.0f, fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new w800(b);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 817889280, 378);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, b2);
        }
    }

    public static final void c(mm40 mm40Var, uv20 uv20Var, xdr xdrVar, xdr xdrVar2, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        xdrVar.getClass();
        xdrVar2.getClass();
        function1.getClass();
        fetVar.g0(1116137974);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.K(mm40VarQ, 8.0f, 4.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            int i3 = i2 & 112;
            boolean z = ((i2 & 896) == 256) | (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(uv20Var)));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eu20((byte) 6, xdrVar, uv20Var);
                fetVar.o0(objP);
            }
            byte b = 3;
            x0x.i(mm40VarN, uv20Var, (Function0) objP, u1c.M(-1032193780, new fu20(uv20Var, b), fetVar), u1c.M(-877383124, new gu20(uv20Var, (byte) 9), fetVar), u1c.M(-926477247, new hu20(uv20Var, function1, b), fetVar), u1c.M(-2011207190, new iu20(b, xdrVar2, uv20Var), fetVar), u1c.M(1716848073, new gu20(uv20Var, (byte) 10), fetVar), u1c.M(1149936040, new gu20(uv20Var, (byte) 11), fetVar), fetVar, 115043392 | i3);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ju20(mm40Var2, uv20Var, xdrVar, xdrVar2, function1, i, (byte) 3);
        }
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        ugd ugdVar5;
        ugd ugdVar6;
        ugd ugdVar7;
        fetVar.g0(-1928002314);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, false);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ua80.p(54, ugdVar, jr8.f16991a, fetVar, true);
            ugdVar5 = ugdVar2;
            ugdVar6 = ugdVar3;
            ugdVar7 = ugdVar4;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1440700320, new gg30(ugdVar5, ugdVar6, ugdVar7, b), fetVar), fetVar, 56);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ugdVar5 = ugdVar2;
            ugdVar6 = ugdVar3;
            ugdVar7 = ugdVar4;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bka(mm40Var, ugdVar, ugdVar5, ugdVar6, ugdVar7, i, (byte) 2);
        }
    }

    public static final void e(ia40 ia40Var, d39 d39Var, Function1 function1, fet fetVar, int i) {
        jm40 jm40Var;
        float f;
        d39Var.getClass();
        function1.getClass();
        fetVar.g0(-1784417376);
        int i2 = i | (fetVar.g(ia40Var) ? 4 : 2) | (fetVar.g(d39Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ba40 ba40Var = ia40Var.b;
            a4x a4xVar = ba40Var.i;
            c3x.f(ba40Var, fetVar, 0);
            int size = a4xVar.size();
            Object obj = ukd.f35823a;
            if (size == 1) {
                fetVar.e0(-1731916615);
                qa40 qa40Var = (qa40) CollectionsKt.U(a4xVar);
                mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var2, 1.0f), 12.0f, 0.0f, 2);
                boolean zG = ((i2 & 896) == 256) | fetVar.g(qa40Var);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new a540((byte) 2, (Object) qa40Var, function1);
                    fetVar.o0(objP);
                }
                b5x.g(mm40VarL, qa40Var, (Function0) objP, fetVar, 0, 0);
                fetVar.r(false);
                jm40Var = jm40Var2;
                f = 1.0f;
            } else {
                fetVar.e0(-1731554349);
                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                lh80 lh80VarT = s5x0.t(12.0f, 0.0f, 2);
                qw3 qw3Var = new qw3(10.0f, true, new jf4((byte) 14));
                boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object objP2 = fetVar.P();
                if (z || objP2 == obj) {
                    objP2 = new bw20((Object) ia40Var, (Object) function1, (byte) 22);
                    fetVar.o0(objP2);
                }
                jm40Var = jm40Var2;
                b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, 490);
                fetVar.r(false);
                f = 1.0f;
            }
            qxw.o(fetVar, cfx0.B(o7k0.e(o7k0.d(jm40Var, f), f), d39Var));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(ia40Var, d39Var, function1, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0222  */
    /* JADX WARN: Code duplicated, block: B:133:0x023a  */
    /* JADX WARN: Code duplicated, block: B:135:0x023e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0241  */
    /* JADX WARN: Code duplicated, block: B:142:0x0255  */
    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0272  */
    /* JADX WARN: Code duplicated, block: B:150:0x0274  */
    /* JADX WARN: Code duplicated, block: B:154:0x027d  */
    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0291  */
    /* JADX WARN: Code duplicated, block: B:162:0x029a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0335  */
    /* JADX WARN: Code duplicated, block: B:170:0x0339  */
    /* JADX WARN: Code duplicated, block: B:173:0x038f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0393  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:181:0x0418  */
    public static final void f(final mm40 mm40Var, final int i, final int i2, final Locale locale, final yq40 yq40Var, final boolean z, final boolean z2, gy40 gy40Var, br8 br8Var, final Function0 function0, final Function0 function1, final Function0 function2, fet fetVar, final int i3) {
        int i4;
        fet fetVar2;
        final gy40 gy40Var2;
        final br8 br8Var2;
        gy40 gy40Var3;
        int i5;
        br8 br8Var3;
        long j;
        float f;
        cl5 cl5Var;
        boolean z3;
        k6z k6zVar;
        boolean zE;
        Object objP;
        float f2;
        boolean z4;
        boolean z5;
        pz40 pz40VarF;
        pz40 pz40VarF2;
        boolean z6;
        Object objP2;
        boolean z7;
        Object objP3;
        boolean z8;
        pcy pcyVar;
        cl5 cl5Var2;
        jm40 jm40Var;
        boolean z9;
        Object objP4;
        yq40Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1967988818);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.g(locale) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= fetVar.e(yq40Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        int i6 = 12582912 | i4;
        if ((i3 & 100663296) == 0) {
            i6 = 46137344 | i4;
        }
        if ((805306368 & i3) == 0) {
            i6 |= fetVar.i(function0) ? 536870912 : 268435456;
        }
        int i7 = (fetVar.i(function1) ? (char) 4 : (char) 2) | (fetVar.i(function2) ? ' ' : (char) 16);
        if (fetVar.U(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            fetVar.Z();
            int i8 = i3 & 1;
            cl5 cl5Var3 = ukd.f35823a;
            if (i8 == 0 || fetVar.B()) {
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var3) {
                    objP5 = dw9.j(fetVar);
                }
                gy40Var3 = (gy40) objP5;
                float f3 = tq40.f34364a;
                zfn zfnVar = zaq0.b;
                br8 br8Var4 = new br8((byte) 1, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary());
                i5 = i6 & (-234881025);
                br8Var3 = br8Var4;
            } else {
                fetVar.X();
                int i9 = i6 & (-234881025);
                br8Var3 = br8Var;
                i5 = i9;
                gy40Var3 = gy40Var;
            }
            fetVar.s();
            br8Var3.getClass();
            fetVar.e0(-316078633);
            int iOrdinal = yq40Var.ordinal();
            if (iOrdinal == 0) {
                j = br8Var3.c;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                j = br8Var3.b;
            }
            zsf zsfVar = ihn.f14788a;
            int i10 = i5;
            br8 br8Var5 = br8Var3;
            l7m0 l7m0VarB = m5k0.b(j, ro4.m0(Response.OK, 0, zsfVar, 2), fetVar, 0, 12);
            fetVar.r(false);
            zfn zfnVar2 = bmd.n;
            k6z k6zVar2 = (k6z) fetVar.k(zfnVar2);
            yq40 yq40Var2 = yq40.b;
            if (yq40Var == yq40Var2) {
                f = k6zVar2 == k6z.f17794a ? 90.0f : -90.0f;
            } else {
                f = 0.0f;
            }
            l7m0 l7m0VarB2 = d43.b(f, ro4.m0(Response.OK, 0, zsfVar, 2), null, null, fetVar, 0, 28);
            boolean z10 = ((i10 & 896) == 256) | ((i10 & 112) == 32) | ((i10 & 7168) == 2048);
            Object objP6 = fetVar.P();
            if (z10) {
                cl5Var = cl5Var3;
            } else {
                cl5Var = cl5Var3;
                if (objP6 == cl5Var) {
                }
                String str = (String) objP6;
                if (yq40Var != yq40Var2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k6zVar = (k6z) fetVar.k(zfnVar2);
                zE = fetVar.e(k6zVar.ordinal());
                objP = fetVar.P();
                if (zE || objP == cl5Var) {
                    if (k6zVar == k6z.b) {
                        f2 = 180.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    objP = Float.valueOf(f2);
                    fetVar.o0(objP);
                }
                final float fFloatValue = ((Number) objP).floatValue();
                if (z3 || !z) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3 || !z2) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z4), fetVar);
                pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z5), fetVar);
                if ((i7 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP2 = fetVar.P();
                if (z6 || objP2 == cl5Var) {
                    objP2 = new tmm((byte) 3, pz40VarF, function1);
                    fetVar.o0(objP2);
                }
                final Function0 function3 = (Function0) objP2;
                if ((i7 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objP3 = fetVar.P();
                if (z7 || objP3 == cl5Var) {
                    objP3 = new tmm((byte) 4, pz40VarF2, function2);
                    fetVar.o0(objP3);
                }
                final Function0 function4 = (Function0) objP3;
                yx7 yx7Var = gqw0.k;
                mm40 mm40VarE0 = o2e.e0(s5x0.I(o7k0.e(mm40Var, tq40.f34364a), tq40.b), "MONTH_SELECTOR");
                thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                mkd.c0.getClass();
                fetVar.i0();
                z8 = fetVar.S;
                pcyVar = e7z.u1;
                if (z8) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar, thg0VarA, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar, numValueOf, shdVar3);
                jpm0.n(fetVar);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar, mm40VarC0, shdVar4);
                x7z x7zVar = new x7z(1.0f, true);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(x7zVar, 32.0f);
                zx7 zx7Var = gqw0.f11754a;
                tj30 tj30VarC = zq8.c(zx7Var, false);
                cl5Var2 = cl5Var;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                gy40 gy40Var4 = gy40Var3;
                w9x.l(40.0f, 0.0f, u1c.M(-1277377426, new ajw((Object) gy40Var4, (Object) function0, (Object) str, l7m0VarB, l7m0VarB2, (byte) 10), fetVar), fetVar, 384, 2);
                fetVar.r(true);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                jm40Var = jm40.b;
                mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                z9 = z3;
                b34.h(z9, null, kzn.d(ro4.m0(150, 0, zsfVar, 2), 0.0f, 2), kzn.e(ro4.m0(150, 0, zsfVar, 2), 2), null, u1c.M(2079795669, new xdr() { // from class: a.uq40
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((u63) obj).getClass();
                        byte b = 0;
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            thg0 thg0VarA2 = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
                            int iHashCode4 = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM4 = fetVar3.m();
                            jm40 jm40Var2 = jm40.b;
                            mm40 mm40VarC3 = kbc.c0(fetVar3, jm40Var2);
                            mkd.c0.getClass();
                            fetVar3.i0();
                            if (fetVar3.S) {
                                fetVar3.l(e7z.u1);
                            } else {
                                fetVar3.r0();
                            }
                            jpm0.o(fetVar3, thg0VarA2, gqw0.x);
                            jpm0.o(fetVar3, bh90VarM4, gqw0.w);
                            jpm0.o(fetVar3, Integer.valueOf(iHashCode4), gqw0.y);
                            jpm0.n(fetVar3);
                            jpm0.o(fetVar3, mm40VarC3, gqw0.v);
                            zcl zclVar2 = qmk.f28987a;
                            w9x.m(u1c.M(-144151590, new xq40(fFloatValue, z, function3, b), fetVar3), fetVar3, 48);
                            qxw.o(fetVar3, o7k0.s(jm40Var2, 8.0f));
                            w9x.m(u1c.M(2003913987, new a0(z2, function4, (byte) 3), fetVar3), fetVar3, 48);
                            fetVar3.r(true);
                        } else {
                            fetVar3.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 196608, 18);
                fetVar2 = fetVar;
                if (z9) {
                    fetVar2.e0(-310514315);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-310842016);
                    mm40 mm40VarA = jr8.f16991a.a(jm40Var);
                    objP4 = fetVar2.P();
                    if (objP4 == cl5Var2) {
                        objP4 = new ec40((byte) 16);
                        fetVar2.o0(objP4);
                    }
                    zq8.a(0, fetVar2, y860.W(mm40VarA, null, null, false, null, (Function0) objP4, 28));
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                fetVar2.r(true);
                gy40Var2 = gy40Var4;
                br8Var2 = br8Var5;
            }
            Calendar calendar = Calendar.getInstance(locale);
            calendar.clear();
            calendar.set(1, i);
            calendar.set(2, i2);
            calendar.set(5, 1);
            objP6 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "LLLL yyyy"), locale).format(calendar.getTime());
            objP6.getClass();
            fetVar.o0(objP6);
            String str2 = (String) objP6;
            if (yq40Var != yq40Var2) {
                z3 = true;
            } else {
                z3 = false;
            }
            k6zVar = (k6z) fetVar.k(zfnVar2);
            zE = fetVar.e(k6zVar.ordinal());
            objP = fetVar.P();
            if (zE) {
                if (k6zVar == k6z.b) {
                    f2 = 180.0f;
                } else {
                    f2 = 0.0f;
                }
                objP = Float.valueOf(f2);
                fetVar.o0(objP);
            } else {
                if (k6zVar == k6z.b) {
                    f2 = 180.0f;
                } else {
                    f2 = 0.0f;
                }
                objP = Float.valueOf(f2);
                fetVar.o0(objP);
            }
            final float fFloatValue2 = ((Number) objP).floatValue();
            if (z3) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z3) {
                z5 = false;
            } else {
                z5 = false;
            }
            pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z4), fetVar);
            pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z5), fetVar);
            if ((i7 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objP2 = fetVar.P();
            if (z6) {
                objP2 = new tmm((byte) 3, pz40VarF, function1);
                fetVar.o0(objP2);
            } else {
                objP2 = new tmm((byte) 3, pz40VarF, function1);
                fetVar.o0(objP2);
            }
            final Function0 function5 = (Function0) objP2;
            if ((i7 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            objP3 = fetVar.P();
            if (z7) {
                objP3 = new tmm((byte) 4, pz40VarF2, function2);
                fetVar.o0(objP3);
            } else {
                objP3 = new tmm((byte) 4, pz40VarF2, function2);
                fetVar.o0(objP3);
            }
            final Function0 function6 = (Function0) objP3;
            yx7 yx7Var2 = gqw0.k;
            mm40 mm40VarE1 = o2e.e0(s5x0.I(o7k0.e(mm40Var, tq40.f34364a), tq40.b), "MONTH_SELECTOR");
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var2, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE1);
            mkd.c0.getClass();
            fetVar.i0();
            z8 = fetVar.S;
            pcyVar = e7z.u1;
            if (z8) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, thg0VarA2, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM4, shdVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf2, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC3, shdVar8);
            x7z x7zVar2 = new x7z(1.0f, true);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(x7zVar2, 32.0f);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC3 = zq8.c(zx7Var2, false);
            cl5Var2 = cl5Var;
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar5);
            jpm0.o(fetVar, bh90VarM5, shdVar6);
            vqd.u(iHashCode5, fetVar, shdVar7, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar8);
            gy40 gy40Var5 = gy40Var3;
            w9x.l(40.0f, 0.0f, u1c.M(-1277377426, new ajw((Object) gy40Var5, (Object) function0, (Object) str2, l7m0VarB, l7m0VarB2, (byte) 10), fetVar), fetVar, 384, 2);
            fetVar.r(true);
            tj30 tj30VarC4 = zq8.c(zx7Var2, false);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            jm40Var = jm40.b;
            mm40 mm40VarC5 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar5);
            jpm0.o(fetVar, bh90VarM6, shdVar6);
            vqd.u(iHashCode6, fetVar, shdVar7, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar8);
            z9 = z3;
            b34.h(z9, null, kzn.d(ro4.m0(150, 0, zsfVar, 2), 0.0f, 2), kzn.e(ro4.m0(150, 0, zsfVar, 2), 2), null, u1c.M(2079795669, new xdr() { // from class: a.uq40
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    fet fetVar3 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((u63) obj).getClass();
                    byte b = 0;
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                        thg0 thg0VarA3 = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
                        int iHashCode7 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM7 = fetVar3.m();
                        jm40 jm40Var2 = jm40.b;
                        mm40 mm40VarC6 = kbc.c0(fetVar3, jm40Var2);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(e7z.u1);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, thg0VarA3, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM7, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode7), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC6, gqw0.v);
                        zcl zclVar3 = qmk.f28987a;
                        w9x.m(u1c.M(-144151590, new xq40(fFloatValue2, z, function5, b), fetVar3), fetVar3, 48);
                        qxw.o(fetVar3, o7k0.s(jm40Var2, 8.0f));
                        w9x.m(u1c.M(2003913987, new a0(z2, function6, (byte) 3), fetVar3), fetVar3, 48);
                        fetVar3.r(true);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 196608, 18);
            fetVar2 = fetVar;
            if (z9) {
                fetVar2.e0(-310842016);
                mm40 mm40VarA2 = jr8.f16991a.a(jm40Var);
                objP4 = fetVar2.P();
                if (objP4 == cl5Var2) {
                    objP4 = new ec40((byte) 16);
                    fetVar2.o0(objP4);
                }
                zq8.a(0, fetVar2, y860.W(mm40VarA2, null, null, false, null, (Function0) objP4, 28));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-310514315);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            gy40Var2 = gy40Var5;
            br8Var2 = br8Var5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            gy40Var2 = gy40Var;
            br8Var2 = br8Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.vq40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i3 | 1);
                    g1x.f(mm40Var, i, i2, locale, yq40Var, z, z2, gy40Var2, br8Var2, function0, function1, function2, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void g(mm40 mm40Var, v370 v370Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        boolean z;
        v370Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(993901412);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(v370Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            byte b = 14;
            if (v370Var instanceof u370) {
                fetVar.e0(1656524939);
                i4w0.d(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                boolean z2 = v370Var instanceof t370;
                cl5 cl5Var = ukd.f35823a;
                if (z2) {
                    fetVar.e0(1656529528);
                    r370 r370Var = ((t370) v370Var).f33252a;
                    z = (i2 & 7168) == 2048;
                    Object objP = fetVar.P();
                    if (z || objP == cl5Var) {
                        objP = new x6s(function1, (byte) 24);
                        fetVar.o0(objP);
                    }
                    j0x.m(mm40Var, r370Var, (Function2) objP, fetVar, i2 & 14);
                    fetVar.r(false);
                } else {
                    if (!(v370Var instanceof s370)) {
                        throw b1j.f(1656524526, fetVar, false);
                    }
                    fetVar.e0(-186540190);
                    a4x a4xVar = ((s370) v370Var).f31542a;
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
                    qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
                    z = (i2 & 7168) == 2048;
                    Object objP2 = fetVar.P();
                    if (z || objP2 == cl5Var) {
                        objP2 = new x6s(function1, (byte) 25);
                        fetVar.o0(objP2);
                    }
                    q7x.f(i2 & 910, qw3Var, fetVar, a4xVar, xczVar, mm40Var, lh80VarT, (Function2) objP2);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 12, i, (Object) mm40Var, (Object) v370Var, (Object) xczVar, (Object) function1);
        }
    }

    public static final void h(mm40 mm40Var, xcz xczVar, a4x a4xVar, Function2 function2, Function2 function3, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        xcz xczVar2;
        a4xVar.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(1776066916);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            xczVar2 = xczVar;
            i2 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            float f = xfn.a(fetVar).d;
            float f2 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f, 0.0f, f2, 76.0f, 2);
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new je80(a4xVar, function2, function3, (byte) 0);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var2, xczVar2, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, i2 & 126, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ke80(mm40Var, xczVar, a4xVar, function2, function3, i, (byte) 0);
        }
    }

    public static final void i(ia00 ia00Var, boolean z, Function1 function1, fet fetVar, int i) {
        k6z k6zVar;
        ia00Var.getClass();
        function1.getClass();
        fetVar.g0(-1258872171);
        int i2 = (fetVar.g(ia00Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar2 = (k6z) fetVar.k(zfnVar);
            if (z) {
                fetVar.e0(1404628860);
                k6zVar = (k6z) fetVar.k(zfnVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1404629784);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(1237182293, new i4a0((Object) ia00Var, (Object) function1, (Object) k6zVar2, z, (byte) 0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) ia00Var, z, (Object) function1, i, (byte) 16);
        }
    }

    public static final void j(mm40 mm40Var, o2a0 o2a0Var, long j, long j2, fet fetVar, int i) {
        fetVar.g0(233007437);
        int i2 = i | 6 | (fetVar.g(o2a0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-830128627, new ena0(o2a0Var, j, j2), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jf7(mm40Var2, o2a0Var, j, j2, i);
        }
    }

    public static final void k(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-1480212708);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            mm40 mm40VarE = o7k0.d(jm40Var, 1.0f).e(new wkw(gqw0.n));
            zcl zclVar = qmk.f28987a;
            wwb.i(s5x0.N(mm40VarE, 16.0f, 0.0f, 16.0f, 0.0f, 10), str, 0L, 0, 0L, fetVar2, i2 & 112, 28);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 4.0f, 16.0f, 0.0f, 8);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, (i2 >> 6) & 14, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 17);
        }
    }

    public static final void l(mm40 mm40Var, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-1428303252);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new kqj0(ugdVar, b);
                fetVar.o0(objP);
            }
            x4n0.a(mm40Var2, (Function2) objP, fetVar, i3 & 14, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gu60(mm40Var2, ugdVar, i, i2, (byte) 1);
        }
    }

    public static final void m(x9l0 x9l0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.e;
        fetVar2.g0(1699593631);
        int i2 = i | (fetVar2.g(x9l0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = x9l0Var instanceof v9l0;
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.e0(-775410040);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 80.0f), 28.0f);
                tj30 tj30VarC = zq8.c(zx7Var, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                String str = ((v9l0) x9l0Var).f37041a;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.p(), fetVar, 0, 24576, 113658);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                if (!(x9l0Var instanceof w9l0)) {
                    throw b1j.f(1221911508, fetVar2, false);
                }
                fetVar2.e0(-774858085);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 80.0f), 28.0f);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                j83 j83Var = ((w9l0) x9l0Var).f38786a;
                long jT = idm0.t(12);
                long jT2 = idm0.t(24);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                kc5.O(j83Var, null, 0L, null, null, 0L, jT, jT2, null, null, 0L, zx7Var, 0, false, 1, 0, null, null, y9q0.a(g1t0.p(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), false, 0.0f, fetVar, 14155776, 1575936, 0, 7266110);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new edk0(x9l0Var, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(lc00 lc00Var, List list, boolean z, y78 y78Var, boolean z2, boolean z3, ctf0 ctf0Var, wcb wcbVar, dhh0 dhh0Var, v5l0 v5l0Var, List list2, boolean z4, boolean z5) {
        List<d0t> listSubList;
        ofh0 ofh0Var;
        boolean z6;
        Object zfh0Var;
        Object next;
        boolean z7;
        boolean z8;
        lc00 lc00Var2 = lc00Var;
        ctf0 ctf0Var2 = ctf0Var;
        if (list.isEmpty()) {
            return;
        }
        boolean z9 = false;
        if (z) {
            int iOrdinal = dhh0Var.ordinal();
            if (iOrdinal == 0) {
                listSubList = list;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        listSubList = list;
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                }
                listSubList = list.subList(0, Math.min(2, list.size()));
            }
        } else {
            int iOrdinal2 = dhh0Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    listSubList = list;
                } else if (iOrdinal2 != 3) {
                    t9f.b();
                    return;
                }
            }
            listSubList = list.subList(0, Math.min(2, list.size()));
        }
        if (z) {
            hjm hjmVar = new hjm(ctf0Var2.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126);
            int iOrdinal3 = dhh0Var.ordinal();
            if (iOrdinal3 == 0) {
                z8 = false;
            } else if (iOrdinal3 == 1) {
                if (list.size() > 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else if (iOrdinal3 == 2) {
                z8 = false;
            } else {
                if (iOrdinal3 != 3) {
                    t9f.b();
                    return;
                }
                if (list.size() > 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            ofh0Var = new ofh0("LIVE_TAG", hjmVar, true, z8);
        } else {
            hjm hjmVar2 = new hjm(ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126);
            int iOrdinal4 = dhh0Var.ordinal();
            if (iOrdinal4 == 0) {
                z6 = list.size() > 2;
            } else if (iOrdinal4 != 1 && iOrdinal4 != 2) {
                if (iOrdinal4 != 3) {
                    t9f.b();
                    return;
                }
                if (list.size() > 2) {
                }
            }
            ofh0Var = new ofh0("LINE_TAG", hjmVar2, false, z6);
        }
        lc00Var2.add(ofh0Var);
        ArrayList arrayList = new ArrayList();
        for (d0t d0tVar : listSubList) {
            Iterator it = list2.iterator();
            do {
                zfh0Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            if (d0tVar.f5282a == -117) {
                z7 = z9;
            } else {
                String strA = wcbVar.a(d0tVar.v, d0tVar.u);
                boolean z10 = z9;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                }
                boolean z11 = lok0Var != null ? lok0Var.n : z10;
                boolean z12 = lok0Var != null ? lok0Var.p : z10;
                m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
                zfh0Var = lok0Var != null ? lok0Var.u : null;
                if (zfh0Var == null) {
                    zfh0Var = "";
                }
                z7 = z10;
                zfh0Var = new zfh0(wwb.V(d0tVar, ctf0Var2, y78Var, z2, z3, strA, false, arrayList2, z11, z12, false, v5l0Var, m5l0Var, zfh0Var, z5), z4);
            }
            if (zfh0Var != null) {
                arrayList.add(zfh0Var);
            }
            ctf0Var2 = ctf0Var;
            arrayList = arrayList;
            z9 = z7;
            lc00Var2 = lc00Var;
        }
        lc00Var2.addAll(arrayList);
    }

    public static final jlo0 p(k0e0 k0e0Var, List list, List list2, amo0 amo0Var, boolean z, ctf0 ctf0Var) {
        long j;
        String str = k0e0Var.c;
        list.getClass();
        list2.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            zzd0 zzd0Var = (zzd0) obj;
            if (zzd0Var.f45249a != -1 && zzd0Var.b.length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 5 || str.length() == 0) {
            return null;
        }
        String strK = kng0.k("STATISTIC_TABLE", amo0Var.name());
        int i = 0;
        boolean z2 = amo0Var == amo0.f1119a;
        lc00 lc00VarB = kotlin.collections.a.b();
        int iOrdinal = amo0Var.ordinal();
        if (iOrdinal == 0) {
            j = kkg.r;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            j = kkg.q;
        }
        long j2 = j;
        eko0 eko0Var = new eko0(j2);
        sjo0 sjo0Var = sjo0.f32312a;
        StringBuilder sb = new StringBuilder(ujn.h);
        String strL = g7x.L(k0e0Var, list);
        if (strL.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
            sb.setLength(0);
            sb.append(strL);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strL, '/'));
            i = 0;
        }
        vlo0 vlo0Var = new vlo0(sjo0Var, str, sb.toString(), z ? ctf0Var.b.a(R.string.cyber_win, Arrays.copyOf(new Object[i], i)) : "", j2);
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.rainbow_six_EPS, Arrays.copyOf(new Object[i], i));
        rlo0 rlo0Var = rlo0.f30708a;
        mlo0 mlo0Var = new mlo0(strA, eko0Var, rlo0Var);
        String strA2 = lsm0Var.a(R.string.rainbow_six_kd, Arrays.copyOf(new Object[i], i));
        plo0 plo0Var = plo0.f27195a;
        lc00VarB.add(new tlo0(vlo0Var, dyb.g0(mlo0Var, new mlo0(strA2, eko0Var, plo0Var), new mlo0(lsm0Var.a(R.string.rainbow_six_kost, Arrays.copyOf(new Object[i], i)), eko0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.rainbow_six_kpr, Arrays.copyOf(new Object[i], i)), eko0Var, rlo0Var), new mlo0(lsm0Var.a(R.string.rainbow_six_hs, Arrays.copyOf(new Object[i], i)), eko0Var, rlo0Var))));
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            zzd0 zzd0Var2 = (zzd0) it.next();
            zzd0Var2.getClass();
            xlo0 xlo0Var = new xlo0(zzd0Var2.b);
            String strValueOf = String.valueOf(zzd0Var2.f);
            qek0 qek0Var = qek0.c;
            arrayList2.add(new tlo0(xlo0Var, dyb.g0(new mlo0(strValueOf, qek0Var, rlo0Var), new mlo0(w6x.n(zzd0Var2.c, zzd0Var2.d, "-"), qek0Var, plo0Var), new mlo0(f140.i(si30.b(zzd0Var2.e * 100.0f), Separators.PERCENT), qek0Var, rlo0Var), new mlo0(String.valueOf(zzd0Var2.g), qek0Var, rlo0Var), new mlo0(f140.i(si30.b(zzd0Var2.h * 100.0f), Separators.PERCENT), qek0Var, rlo0Var))));
        }
        return new jlo0(strK, cs0.f(lc00VarB, lc00VarB, arrayList2), ulo0.f35883a, z2);
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hny.u(str);
    }

    public static cgx0 r(int i, int i2, int i3, int i4) {
        return new cgx0(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static int s(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (fkx.f9715a[roundingMode.ordinal()]) {
            case 1:
                n7x.z(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static final int t(xpg0 xpg0Var, String str) {
        xpg0Var.getClass();
        int iA = z1x.A(xpg0Var, str);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = xpg0Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(xpg0Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + CollectionsKt.b0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final tkz u(clz clzVar) {
        clzVar.getClass();
        return x0x.Q(clzVar.x());
    }

    public static String v(ds2 ds2Var) {
        ds2Var.getClass();
        if (ds2Var instanceof ur2) {
            return "sport_champ_mymatch";
        }
        if (ds2Var instanceof xr2) {
            return "sport_champ_schedule";
        }
        if (ds2Var instanceof sr2) {
            return "sport_champ_allmatches";
        }
        if (ds2Var instanceof vr2) {
            return "sport_champ_team";
        }
        if (ds2Var instanceof zr2) {
            return "sport_champ_stadium";
        }
        if (ds2Var instanceof as2) {
            return "sport_champ_statistics";
        }
        if (ds2Var instanceof yr2) {
            return "sport_champ_search";
        }
        if (ds2Var instanceof bs2) {
            return "sport_champ_tournament";
        }
        if (ds2Var instanceof cs2) {
            return "sport_champ_who_win";
        }
        if (ds2Var instanceof tr2) {
            return "top_champ_main";
        }
        if (ds2Var instanceof wr2) {
            return "results_top_champ";
        }
        t9f.b();
        return null;
    }

    public static final gel0 w(long j, long j2, int i, List list, wcb wcbVar) {
        Object next;
        del0 zdl0Var;
        list.getClass();
        wcbVar.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != i);
        lok0 lok0Var = (lok0) next;
        String strA = wcbVar.a(j, j2);
        if (lok0Var != null) {
            int i2 = lok0Var.f20396a;
            String strValueOf = lok0Var.u;
            strValueOf.getClass();
            bzu bzuVar = new bzu((byte) 23);
            bzuVar.g("static");
            bzuVar.g("img");
            bzuVar.g("android");
            bzuVar.g("TopChamps");
            if (strValueOf.length() == 0) {
                strValueOf = String.valueOf(i2);
            }
            axq.u(bzuVar, strValueOf, "backgrounds", "icon.svg");
            zdl0Var = new bel0(strA, ((StringBuilder) bzuVar.b).toString(), lok0Var.n, lok0Var.p);
        } else {
            zdl0Var = new zdl0(strA);
        }
        return new gel0(zdl0Var);
    }

    public static final boolean x(tai0 tai0Var) {
        nai0 nai0VarK = tai0Var.k();
        return nai0VarK.f23193a.c(xai0.B);
    }

    public static int y(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            jf4.o(ua80.e(i, "x (", ") must be > 0"));
            return 0;
        }
        switch (fkx.f9715a[roundingMode.ordinal()]) {
            case 1:
                n7x.z((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final String z(m9s m9sVar, long j, String str) {
        Object next;
        String str2;
        m9sVar.getClass();
        str.getClass();
        Iterator it = m9sVar.H.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xum0) next).b != j);
        xum0 xum0Var = (xum0) next;
        if (xum0Var != null && (str2 = xum0Var.f41519a) != null) {
            String str3 = StringsKt.W(str2) ? null : str2;
            if (str3 != null) {
                return str3;
            }
        }
        return str;
    }

    public abstract String o();
}
