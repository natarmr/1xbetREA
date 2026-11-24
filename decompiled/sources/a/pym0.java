package a;

import android.gov.nist.core.Separators;
import android.javax.sip.header.WarningHeader;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pym0 {
    public static final void a(mm40 mm40Var, k1p0 k1p0Var, fet fetVar, int i) {
        pcy pcyVar;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar2.g0(-1486418408);
        int i2 = (i & 6) == 0 ? i | (fetVar2.g(mm40Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(k1p0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, backgroundContent, vgg0.a(16.0f)), 16.0f, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar, 1.0f, true);
            String str = k1p0Var.f17539a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, x7zVarI, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.l(), fetVar, 0, 24960, 110576);
            fetVar2 = fetVar;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            shd shdVar5 = shdVar4;
            jpm0.o(fetVar2, thg0VarA2, shdVar5);
            shd shdVar6 = shdVar3;
            jpm0.o(fetVar2, bh90VarM2, shdVar6);
            shd shdVar7 = shdVar2;
            vqd.u(iHashCode2, fetVar2, shdVar7, fetVar2);
            shd shdVar8 = shdVar;
            jpm0.o(fetVar2, mm40VarC1, shdVar8);
            fetVar2.e0(-980572532);
            int i3 = 0;
            for (Object obj : k1p0Var.b) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                n1p0 n1p0Var = (n1p0) obj;
                fetVar2.b0(102042060, fetVar2.G(Integer.valueOf(i3), n1p0Var.f22762a));
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 24.0f), n1p0Var.b, vgg0.a(6.0f));
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar5);
                jpm0.o(fetVar2, bh90VarM3, shdVar6);
                vqd.u(iHashCode3, fetVar2, shdVar7, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar8);
                String str2 = n1p0Var.f22762a;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str2, null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.i(), fetVar, 0, 24576, 114682);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
                i3 = i4;
                shdVar6 = shdVar6;
                shdVar8 = shdVar8;
                jm40Var = jm40Var;
                shdVar7 = shdVar7;
                shdVar5 = shdVar5;
                pcyVar = pcyVar;
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) k1p0Var, i, (byte) 23);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-1897758822);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 48.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 24);
        }
    }

    public static final void c(mm40 mm40Var, long j, final lh80 lh80Var, fet fetVar, final int i, final int i2) {
        final mm40 mm40Var2;
        int i3;
        long jM121getTransparent0d7_KjU;
        final long j2;
        mm40 mm40Var3;
        fetVar.g0(-347001732);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jM121getTransparent0d7_KjU = j;
                int i5 = fetVar.f(jM121getTransparent0d7_KjU) ? 32 : 16;
                i3 |= i5;
            } else {
                jM121getTransparent0d7_KjU = j;
            }
            i3 |= i5;
        } else {
            jM121getTransparent0d7_KjU = j;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(lh80Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
                if ((i2 & 2) != 0) {
                    jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                    i3 &= -113;
                }
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                mm40Var3 = mm40Var2;
            }
            long j3 = jM121getTransparent0d7_KjU;
            fetVar.s();
            mm40 mm40VarQ = i120.Q(mm40Var3, j3, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarQ, 40.0f);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new f8l0((byte) 19);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, null, lh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, (i3 & 896) | 818085888, WarningHeader.MULTICAST_NOT_AVAILABLE);
            mm40Var2 = mm40Var3;
            j2 = j3;
        } else {
            fetVar.X();
            j2 = jM121getTransparent0d7_KjU;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.oym0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pym0.c(mm40Var2, j2, lh80Var, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, m1p0 m1p0Var, fet fetVar, int i) {
        fetVar.g0(729444074);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(m1p0Var) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (m1p0Var instanceof l1p0) {
            fetVar.e0(916091335);
            b(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (!(m1p0Var instanceof k1p0)) {
                throw b1j.f(916089453, fetVar, false);
            }
            fetVar.e0(916093756);
            a(mm40Var, (k1p0) m1p0Var, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, m1p0Var, i, (byte) 25);
        }
    }

    public static final void e(vy6 vy6Var, fet fetVar, int i) {
        int i2;
        vy6Var.getClass();
        fetVar.g0(-688562428);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vy6Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hew0.b((i2 & 14) | 3504, u1c.M(-1060742926, new vmr0(vy6Var, b), fetVar), null, null, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(vy6Var, i);
        }
    }

    public static final void f(mm40 mm40Var, y7s0 y7s0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        y7s0Var.getClass();
        function1.getClass();
        fetVar.g0(740105537);
        int i2 = i | 6 | (fetVar.g(y7s0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            cem0.g(null, y7s0Var.f42168a, function1, fetVar, i2 & 896, 1);
            mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            v2n0.h(0, fetVar, y7s0Var.b, ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true));
            v2n0.h(6, fetVar, y7s0Var.c, o7k0.A(mm40Var2, null, 3));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var2, y7s0Var, function1, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0270  */
    /* JADX WARN: Code duplicated, block: B:122:0x0272  */
    /* JADX WARN: Code duplicated, block: B:128:0x0285  */
    /* JADX WARN: Code duplicated, block: B:130:0x0295 A[PHI: r9
  0x0295: PHI (r9v42 ??) = (r9v50 ??), (r9v44 ??) binds: [B:118:0x0268, B:121:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v42, types: [int] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v50 */
    public static final void g(lc00 lc00Var, m9s m9sVar, jus0 jus0Var, ctf0 ctf0Var, String str, boolean z) {
        ?? arrayList;
        List list;
        String strA;
        char c;
        m6m0 m6m0Var;
        long j;
        int i;
        char c2;
        int i2;
        int i3;
        char c3;
        int i4;
        boolean z2;
        boolean z3;
        ?? sb;
        boolean zO;
        ?? r9;
        float f;
        char c4;
        char c5;
        List list2 = jus0Var.f;
        List list3 = jus0Var.e;
        ius0 ius0Var = jus0Var.b;
        m9sVar.getClass();
        List list4 = m9sVar.d;
        List list5 = m9sVar.c;
        ctf0Var.getClass();
        str.getClass();
        long j2 = m9sVar.A;
        qqs qqsVar = m9sVar.h;
        oqs oqsVar = qqsVar.o;
        znq0 znq0Var = qqsVar.k;
        long j3 = qqsVar.h;
        if (j2 != 2095742) {
            String str2 = m9sVar.i;
            String strValueOf = String.valueOf(oqsVar.f25704a);
            if (list3.size() > 10) {
                arrayList = iun.f15405a;
            } else {
                arrayList = new ArrayList(r3d.q(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new una0(z1x.F((tna0) it.next())));
                    list3 = list3;
                }
            }
            List list6 = list3;
            int iOrdinal = ius0Var.ordinal();
            zts0 zts0Var = new zts0(str2, strValueOf, arrayList, (iOrdinal == 3 || iOrdinal == 6) ? d4d.STATIC_GREEN : d4d.STATIC_WHITE10);
            String str3 = m9sVar.j;
            String strValueOf2 = String.valueOf(oqsVar.b);
            if (list6.size() > 10) {
                list = iun.f15405a;
            } else {
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new una0(z1x.F((tna0) it2.next())));
                }
                list = arrayList2;
            }
            int iOrdinal2 = ius0Var.ordinal();
            zts0 zts0Var2 = new zts0(str3, strValueOf2, list, (iOrdinal2 == 4 || iOrdinal2 == 7) ? d4d.STATIC_GREEN : d4d.STATIC_WHITE10);
            switch (ius0Var.ordinal()) {
                case 0:
                    strA = ctf0Var.b.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0));
                    break;
                case 1:
                    strA = ctf0Var.b.a(R.string.player_turn, Arrays.copyOf(new Object[0], 0));
                    break;
                case 2:
                    strA = ctf0Var.b.a(R.string.dealer_turn, Arrays.copyOf(new Object[0], 0));
                    break;
                case 3:
                    strA = ctf0Var.b.a(R.string.player_round_win, Arrays.copyOf(new Object[0], 0));
                    break;
                case 4:
                    strA = ctf0Var.b.a(R.string.dealer_round_win, Arrays.copyOf(new Object[0], 0));
                    break;
                case 5:
                    strA = ctf0Var.b.a(R.string.draw_round, Arrays.copyOf(new Object[0], 0));
                    break;
                case 6:
                    strA = ctf0Var.b.a(R.string.player_win, Arrays.copyOf(new Object[0], 0));
                    break;
                case 7:
                    strA = ctf0Var.b.a(R.string.dealer_win, Arrays.copyOf(new Object[0], 0));
                    break;
                case 8:
                    strA = ctf0Var.b.a(R.string.draw_game, Arrays.copyOf(new Object[0], 0));
                    break;
                case 9:
                    strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                    break;
                default:
                    t9f.b();
                    return;
            }
            wts0 wts0Var = new wts0(strA, new wnq0(l(jus0Var, m9sVar), znq0.f(j3), qqsVar.j, 1, znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null));
            StringBuilder sb2 = new StringBuilder(ujn.h);
            int i5 = 0;
            if (StringsKt.O("static/img/ImgDefault/Esports/TwentyOne/Table.png", ujn.h, false)) {
                sb2.setLength(i5);
                sb2.append("static/img/ImgDefault/Esports/TwentyOne/Table.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/TwentyOne/Table.png", "https://", false)) {
                i5 = 0;
                sb2.setLength(i5);
                sb2.append("static/img/ImgDefault/Esports/TwentyOne/Table.png");
            } else {
                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                    c = '/';
                } else {
                    c = '/';
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/TwentyOne/Table.png", c));
            }
            lc00Var.add(new aus0(sb2.toString(), wts0Var, zts0Var2, zts0Var));
            return;
        }
        List list7 = gus0.f11946a;
        StringBuilder sb3 = new StringBuilder(ujn.h);
        m6m0 m6m0Var2 = cus0.d;
        Long l = (Long) CollectionsKt.firstOrNull(list5);
        long jLongValue = l != null ? l.longValue() : 0L;
        m6m0Var2.getClass();
        String strF = m6m0.f(jLongValue);
        if (strF.length() == 0) {
            m6m0Var = m6m0Var2;
            sb3.setLength(0);
            j = j3;
        } else {
            m6m0Var = m6m0Var2;
            j = j3;
            if (StringsKt.O(strF, ujn.h, false)) {
                i = 0;
            } else if (kotlin.text.c.x(strF, "https://", false)) {
                i = 0;
            } else {
                if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                    c2 = '/';
                } else {
                    c2 = '/';
                    sb3.append('/');
                }
                sb3.append(StringsKt.y0(strF, c2));
            }
            sb3.setLength(i);
            sb3.append(strF);
        }
        String string = sb3.toString();
        String str4 = jus0Var.c;
        Long l2 = (Long) CollectionsKt.firstOrNull(list5);
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        m6m0Var.getClass();
        int iG = m6m0.g(jLongValue2);
        lsm0 lsm0Var = ctf0Var.b;
        String strA2 = lsm0Var.a(iG, Arrays.copyOf(new Object[0], 0));
        i4 i4VarA = gus0.a(list3);
        boolean z4 = ius0Var == ius0.g || ius0Var == ius0.i;
        zcl zclVar = qmk.f28987a;
        dus0 dus0Var = new dus0(string, str4, strA2, i4VarA, z4, str, z ? 166.0f : 124.0f, z ? 100.0f : 16.0f);
        StringBuilder sb4 = new StringBuilder(ujn.h);
        Long l3 = (Long) CollectionsKt.firstOrNull(list4);
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        m6m0Var.getClass();
        String strF2 = m6m0.f(jLongValue3);
        if (strF2.length() == 0) {
            sb4.setLength(0);
        } else {
            if (StringsKt.O(strF2, ujn.h, false)) {
                i2 = 0;
            } else if (kotlin.text.c.x(strF2, "https://", false)) {
                i2 = 0;
            } else {
                if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                    i3 = 1;
                    c3 = '/';
                } else {
                    sb4.append('/');
                    c3 = '/';
                    i3 = 1;
                }
                char[] cArr = new char[i3];
                cArr[0] = c3;
                sb4.append(StringsKt.y0(strF2, cArr));
            }
            sb4.setLength(i2);
            sb4.append(strF2);
        }
        String string2 = sb4.toString();
        String str5 = jus0Var.d;
        Long l4 = (Long) CollectionsKt.firstOrNull(list4);
        dus0 dus0Var2 = new dus0(string2, str5, lsm0Var.a(m6m0.g(l4 != null ? l4.longValue() : 0L), Arrays.copyOf(new Object[0], 0)), gus0.a(list2), ius0Var == ius0.h || ius0Var == ius0.i, str, z ? 166.0f : 124.0f, z ? 100.0f : 16.0f);
        switch (ius0Var.ordinal()) {
            case 0:
                i4 = R.string.start_of_the_game;
                break;
            case 1:
                i4 = R.string.player_turn;
                break;
            case 2:
                i4 = R.string.dealer_turn;
                break;
            case 3:
                i4 = R.string.player_round_win;
                break;
            case 4:
                i4 = R.string.dealer_round_win;
                break;
            case 5:
                i4 = R.string.draw_round;
                break;
            case 6:
                i4 = R.string.player_win;
                break;
            case 7:
                i4 = R.string.dealer_win;
                break;
            case 8:
                i4 = R.string.draw_game;
                break;
            case 9:
                i4 = R.string.empty_str;
                break;
            default:
                t9f.b();
                return;
        }
        String strA3 = lsm0Var.a(i4, Arrays.copyOf(new Object[0], 0));
        wnq0 wnq0Var = new wnq0(l(jus0Var, m9sVar), znq0.f(j), qqsVar.j, 1, znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null);
        StringBuilder sb5 = new StringBuilder(ujn.h);
        if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/TimerTable.png", ujn.h, false)) {
            if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/TimerTable.png", "https://", false)) {
                z2 = false;
            } else {
                if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                    c5 = '/';
                } else {
                    c5 = '/';
                    sb5.append('/');
                }
                z3 = false;
                sb5.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/TimerTable.png", c5));
            }
            String string3 = sb5.toString();
            sb = new StringBuilder(ujn.h);
            zO = StringsKt.O("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", ujn.h, z3);
            r9 = z3;
            if (zO) {
                sb.setLength(r9);
                sb.append("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", "https://", z3)) {
                r9 = 0;
                sb.setLength(r9);
                sb.append("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png");
            } else {
                if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                    c4 = '/';
                } else {
                    c4 = '/';
                    sb.append('/');
                }
                sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", c4));
            }
            String string4 = sb.toString();
            if (z) {
                f = 384.0f;
            } else {
                f = 300.0f;
            }
            lc00Var.add(new fus0(dus0Var, dus0Var2, strA3, wnq0Var, string3, string4, f));
        }
        z2 = false;
        sb5.setLength(z2 ? 1 : 0);
        sb5.append("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/TimerTable.png");
        z3 = z2;
        String string5 = sb5.toString();
        sb = new StringBuilder(ujn.h);
        zO = StringsKt.O("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", ujn.h, z3);
        r9 = z3;
        if (zO) {
            sb.setLength(r9);
            sb.append("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png");
        } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", "https://", z3)) {
            r9 = 0;
            sb.setLength(r9);
            sb.append("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png");
        } else {
            if (sb.length() > 0) {
                c4 = '/';
            } else {
                c4 = '/';
            }
            sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", c4));
        }
        String string6 = sb.toString();
        if (z) {
            f = 384.0f;
        } else {
            f = 300.0f;
        }
        lc00Var.add(new fus0(dus0Var, dus0Var2, strA3, wnq0Var, string5, string6, f));
    }

    public static final gbn h(Function1 function1) {
        return new gbn(new ofo0((byte) 0), new asj0(3, (byte) 23), new zbm0(function1, (byte) 25), pfo0.b);
    }

    public static final ihu0 i(ViewGroup viewGroup) {
        viewGroup.getClass();
        return new ihu0(viewGroup);
    }

    public static final sx3 j(ViewGroup viewGroup) {
        viewGroup.getClass();
        return new sx3(viewGroup, (byte) 7);
    }

    public static final gbn k(Function1 function1, Function2 function2) {
        byte b = 3;
        return new gbn(new i9v0((byte) 17), new fyv0(b, (byte) 1), new ulw(function1, function2, b), mnu0.j);
    }

    public static final boolean l(jus0 jus0Var, m9s m9sVar) {
        m9sVar.getClass();
        if (znq0.f(m9sVar.h.h) == 0) {
            return false;
        }
        ius0 ius0Var = jus0Var.b;
        return ius0Var == ius0.f15412a || ius0Var == ius0.b || ius0Var == ius0.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(lmk0 lmk0Var, zje zjeVar) {
        hut0 hut0Var;
        lmk0 lmk0Var2;
        Throwable th;
        f99 f99Var;
        if (zjeVar instanceof hut0) {
            hut0Var = (hut0) zjeVar;
            int i = hut0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hut0Var.l = i - Integer.MIN_VALUE;
            } else {
                hut0Var = new hut0(zjeVar);
            }
        } else {
            hut0Var = new hut0(zjeVar);
        }
        Object obj = hut0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = hut0Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f99Var = hut0Var.j;
            lmk0Var2 = hut0Var.i;
            try {
                z1x.P(obj);
                ay3.L(lmk0Var2, null);
                return f99Var;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ay3.L(lmk0Var2, th);
                    throw th3;
                }
            }
        }
        z1x.P(obj);
        try {
            f99 f99Var2 = new f99();
            hut0Var.i = lmk0Var;
            hut0Var.j = f99Var2;
            hut0Var.l = 1;
            lmk0Var.f20300a.u(f99Var2);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
            lmk0Var2 = lmk0Var;
            f99Var = f99Var2;
            ay3.L(lmk0Var2, null);
            return f99Var;
        } catch (Throwable th4) {
            lmk0Var2 = lmk0Var;
            th = th4;
            throw th;
        }
    }

    public static final g9q0 n(fet fetVar) {
        mrq mrqVar = (mrq) fetVar.k(bmd.k);
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        k6z k6zVar = (k6z) fetVar.k(bmd.n);
        boolean zG = fetVar.g(mrqVar) | fetVar.g(w6kVar) | fetVar.e(k6zVar.ordinal()) | fetVar.e(8);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new g9q0(mrqVar, w6kVar, k6zVar);
            fetVar.o0(objP);
        }
        return (g9q0) objP;
    }

    public static final String o(nev0 nev0Var) {
        nev0Var.getClass();
        int iOrdinal = nev0Var.ordinal();
        if (iOrdinal == 0) {
            return "live";
        }
        if (iOrdinal == 1) {
            return "results";
        }
        if (iOrdinal == 2) {
            return "cyber";
        }
        if (iOrdinal == 3) {
            return "search";
        }
        if (iOrdinal == 4) {
            return "aggregator";
        }
        if (iOrdinal == 5) {
            return "1xgames";
        }
        t9f.b();
        return null;
    }

    public static final igp0 p(ow50 ow50Var, List list) {
        Object objPrevious;
        ow50Var.getClass();
        list.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!Intrinsics.d(((ufp0) objPrevious).f35586a, ow50Var.f25954a));
        ufp0 ufp0Var = (ufp0) objPrevious;
        if (ufp0Var == null) {
            jf4.k(null);
            return null;
        }
        List list2 = ow50Var.b;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new igp0(ufp0Var, list2);
    }

    public static final erh q(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, String str, String str2, String str3, ArrayList arrayList, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        ctf0Var.getClass();
        list.getClass();
        str3.getClass();
        long j = d0tVar.f5282a;
        boolean zB0 = kpb.b0(d0tVar, z);
        boolean zD0 = kpb.d0(d0tVar, z);
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z3 && arrayList.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, arrayList, z2)), new m0x(R.drawable.ic_sport_boxing_champs_228, null, 6), arrayList.contains(Integer.valueOf(i)) && z2 ? new y3d(y3d.g) : null, 32);
        if (zB0) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        u3i u3iVar = x3iVar;
        if (zD0) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        zqh zqhVar = new zqh(new i4i(false, c4iVar, null, (d0tVar.S && z4) ? new v3i(new d2i()) : w3i.f38503a, z3iVar, u3iVar, null, 68), ctf0Var.b.a(R.string.ufc_soon, Arrays.copyOf(new Object[0], 0)));
        f0t f0tVar = d0tVar.r;
        f0t f0tVar2 = d0tVar.q;
        return new erh(j, zqhVar, (f0tVar.b.length() == 0 && f0tVar.c.isEmpty()) ? new sqh(f0tVar2.b, mym0.o(d0tVar), mym0.n(d0tVar, ctf0Var), mym0.m(d0tVar, ctf0Var)) : new tqh(pvm0.q(f0tVar2, list), pvm0.q(f0tVar, list), str3, mym0.o(d0tVar), mym0.n(d0tVar, ctf0Var), mym0.m(d0tVar, ctf0Var)), lvm0.k(d0tVar, ctf0Var, m5l0Var));
    }

    public static long r(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static void s(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] t(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            jf4.o("The key length in bytes must be 32.");
            return null;
        }
        long jR = r(bArr, 0) & 67108863;
        int i = 3;
        long jR2 = (r(bArr, 3) >> 2) & 67108611;
        long jR3 = (r(bArr, 6) >> 4) & 67092735;
        long jR4 = (r(bArr, 9) >> 6) & 66076671;
        long jR5 = (r(bArr, 12) >> 8) & 1048575;
        long j = jR2 * 5;
        long j2 = jR3 * 5;
        long j3 = jR4 * 5;
        long j4 = jR5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jR6 = j9 + (r(bArr3, 0) & 67108863);
            long jR7 = j5 + ((r(bArr3, i) >> 2) & 67108863);
            long jR8 = j6 + ((r(bArr3, 6) >> 4) & 67108863);
            long jR9 = j7 + ((r(bArr3, 9) >> 6) & 67108863);
            long j10 = jR2;
            long jR10 = j8 + (((r(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jR10 * j) + (jR9 * j2) + (jR8 * j3) + (jR7 * j4) + (jR6 * jR);
            long j12 = (jR10 * j2) + (jR9 * j3) + (jR8 * j4) + (jR7 * jR) + (jR6 * j10);
            long j13 = (jR10 * j3) + (jR9 * j4) + (jR8 * jR) + (jR7 * j10) + (jR6 * jR3);
            long j14 = (jR10 * j4) + (jR9 * jR) + (jR8 * j10) + (jR7 * jR3) + (jR6 * jR4);
            long j15 = jR9 * j10;
            long j16 = jR10 * jR;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jR8 * jR3) + (jR7 * jR4) + (jR6 * jR5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jR2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jR11 = r(bArr, 16) + j50;
        long j54 = jR11 & 4294967295L;
        long jR12 = r(bArr, 20) + j51 + (jR11 >> 32);
        long jR13 = r(bArr, 24) + j52 + (jR12 >> 32);
        long jR14 = (r(bArr, 28) + j53 + (jR13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        s(bArr4, j54, 0);
        s(bArr4, jR12 & 4294967295L, 4);
        s(bArr4, jR13 & 4294967295L, 8);
        s(bArr4, jR14, 12);
        return bArr4;
    }
}
