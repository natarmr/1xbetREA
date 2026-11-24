package a;

import android.gov.nist.core.Separators;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fem0 {
    public static final void a(mm40 mm40Var, gem0 gem0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        k6z k6zVar;
        gem0Var.getClass();
        fetVar.g0(1977117385);
        int i2 = i | 6 | (fetVar.g(gem0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var2, f, 0.0f, 2), 1.0f);
            int iOrdinal = gem0Var.b.ordinal();
            if (iOrdinal == 0) {
                mm40 mm40VarN2 = s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                pz40 pz40Var = s6t0.f31722a;
                mm40VarN = s5x0.N(i120.Q(mm40VarN2, s6t0.b().f33626a.getBackgroundContent(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 12.0f, 12.0f, 12.0f, 0.0f, 8);
            } else if (iOrdinal == 1) {
                pz40 pz40Var2 = s6t0.f31722a;
                mm40VarN = s5x0.N(i120.Q(mm40Var2, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 16.0f, 12.0f, 0.0f, 8);
            } else if (iOrdinal == 2) {
                pz40 pz40Var3 = s6t0.f31722a;
                mm40VarN = s5x0.M(i120.Q(mm40Var2, s6t0.b().f33626a.getBackgroundContent(), vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3)), 12.0f, 16.0f, 12.0f, 12.0f);
            } else if (iOrdinal != 3) {
                t9f.b();
                return;
            } else {
                pz40 pz40Var4 = s6t0.f31722a;
                mm40VarN = s5x0.J(i120.Q(mm40Var2, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(16.0f)), 12.0f);
            }
            mm40 mm40VarE = mm40VarD.e(mm40VarN);
            if (((Boolean) fetVar.k(kr00.f18743a)).booleanValue()) {
                fetVar.e0(-875397235);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-875347914);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1879838217, new eem0(mm40VarE, gem0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eem0(mm40Var2, gem0Var, i);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1308647446);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_circle_check, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            long commerce = s6t0.b().f33626a.getCommerce();
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(pm80VarF, null, o7k0.n(jm40.b, 40.0f), commerce, fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 3);
        }
    }

    public static final void c(mm40 mm40Var, wdp0 wdp0Var, ugd ugdVar, fet fetVar, int i) {
        zcl zclVar = qmk.f28987a;
        int i2 = i >> 3;
        x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, ((((i & 14) | (i2 & 112)) | (i2 & 896)) >> 3) & 126);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
        ugdVar.j(y5d.f42040a, wdp0Var, fetVar, Integer.valueOf((i & 112) | 6 | ((i >> 6) & 896)));
        fetVar.r(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(mm40 mm40Var, final h4r0 h4r0Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        final byte b;
        boolean z;
        fet fetVar2 = fetVar;
        h4r0Var.getClass();
        function1.getClass();
        fetVar2.g0(1404791439);
        int i2 = i | 6 | (fetVar2.g(h4r0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarN2 = s5x0.N(jm40Var, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10);
            mm40Var2 = jm40Var;
            hjm hjmVar = h4r0Var.d;
            kjm kjmVar = kjm.f18392a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new yip0((Object) function1, (Object) h4r0Var, (byte) 18);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarN2, hjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zll zllVar = h4r0Var.e;
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 0.0f, 10);
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                b = 0;
                objP2 = new Function1() { // from class: a.g4r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b2 = b;
                        h4r0 h4r0Var2 = h4r0Var;
                        Function1 function2 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b2) {
                            case 0:
                                st0Var.getClass();
                                long j = st0Var.f32750a;
                                long j2 = h4r0Var2.f12448a;
                                mtr mtrVar = st0Var.d;
                                function2.invoke(new r01(j, mtrVar != null ? mtrVar.b : false, j2));
                                break;
                            default:
                                st0Var.getClass();
                                function2.invoke(new t01(st0Var.f32750a, h4r0Var2.f12448a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            } else {
                b = 0;
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = (i3 == 256 ? (byte) 1 : b) | (i4 != 32 ? b : (byte) 1);
            Object objP3 = fetVar2.P();
            if (z4 != 0 || objP3 == cl5Var) {
                z = true;
                final char c = 1 == true ? 1 : 0;
                objP3 = new Function1() { // from class: a.g4r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b2 = c;
                        h4r0 h4r0Var2 = h4r0Var;
                        Function1 function3 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b2) {
                            case 0:
                                st0Var.getClass();
                                long j = st0Var.f32750a;
                                long j2 = h4r0Var2.f12448a;
                                mtr mtrVar = st0Var.d;
                                function3.invoke(new r01(j, mtrVar != null ? mtrVar.b : false, j2));
                                break;
                            default:
                                st0Var.getClass();
                                function3.invoke(new t01(st0Var.f32750a, h4r0Var2.f12448a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            } else {
                z = true;
            }
            ckb.f(mm40VarD, zllVar, null, lh80VarU, null, null, function2, (Function1) objP3, fetVar2, 6, 52);
            fetVar2.r(z);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, h4r0Var, function1, i, (byte) 21);
        }
    }

    public static final void e(zat0 zat0Var, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        qdzVar.getClass();
        function1.getClass();
        zcl zclVar = qmk.f28987a;
        boolean z = true;
        mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 8.0f, 1);
        vb90 vb90Var = zat0Var.b;
        xcz xczVarB = qdzVar.b(zat0Var.f44084a, new i9t0((byte) 3), fetVar, i & 896);
        lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
        if ((((i & 7168) ^ 3072) <= 2048 || !fetVar.g(function1)) && (i & 3072) != 2048) {
            z = false;
        }
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new xar0(function1, (byte) 28);
            fetVar.o0(objP);
        }
        zvw.k(mm40VarL, vb90Var, false, xczVarB, lh80VarT, (Function1) objP, fetVar, 384, 0);
    }

    public static final void f(tnb0 tnb0Var, fet fetVar, int i) {
        tnb0Var.getClass();
        fetVar.g0(-850211764);
        byte b = 2;
        int i2 = (fetVar.g(tnb0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarW, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 4.0f, 0.0f, 4.0f, 4.0f, 2);
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
            zvw.l(tnb0Var, fetVar, i2 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snb0(tnb0Var, i, b);
        }
    }

    public static final ArrayList g(fqu0 fqu0Var) {
        List list = null;
        if (fqu0Var != null) {
            Object obj = fqu0Var.c.f15681a;
            list = (List) (obj instanceof g0g0 ? null : obj);
        }
        if (list == null) {
            list = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((eih) it.next()).e);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x042b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0439  */
    /* JADX WARN: Code duplicated, block: B:104:0x044b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0450  */
    /* JADX WARN: Code duplicated, block: B:108:0x0467  */
    /* JADX WARN: Code duplicated, block: B:110:0x0471  */
    /* JADX WARN: Code duplicated, block: B:112:0x0477  */
    /* JADX WARN: Code duplicated, block: B:113:0x047b  */
    /* JADX WARN: Code duplicated, block: B:117:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:124:0x0520  */
    /* JADX WARN: Code duplicated, block: B:125:0x052a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x02da  */
    /* JADX WARN: Code duplicated, block: B:50:0x02de  */
    /* JADX WARN: Code duplicated, block: B:51:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0341  */
    /* JADX WARN: Code duplicated, block: B:68:0x034b  */
    /* JADX WARN: Code duplicated, block: B:70:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0350 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0352 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0354 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0356  */
    /* JADX WARN: Code duplicated, block: B:78:0x036d  */
    /* JADX WARN: Code duplicated, block: B:79:0x037d  */
    /* JADX WARN: Code duplicated, block: B:80:0x038d  */
    /* JADX WARN: Code duplicated, block: B:81:0x039d  */
    /* JADX WARN: Code duplicated, block: B:82:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:83:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:85:0x03be  */
    /* JADX WARN: Code duplicated, block: B:87:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x03cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x03cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x03d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x0409  */
    /* JADX WARN: Code duplicated, block: B:99:0x041a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final List h(List list, long j, ctf0 ctf0Var, boolean z) {
        List list2;
        long j2;
        lc00 lc00VarA;
        boolean z2;
        Iterable iterable;
        ArrayList arrayList;
        String strA;
        int iOrdinal;
        i4m g4mVar;
        int i;
        ArrayList arrayList2;
        Iterator it;
        lam jamVar;
        ut90 ut90Var;
        String strR;
        String strConcat;
        int iOrdinal2;
        p8p0 p8p0Var;
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((v9p0) obj).c().length() > 0) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            v9p0 v9p0Var = (v9p0) it2.next();
            v9p0Var.getClass();
            if (v9p0Var instanceof q9p0) {
                q9p0 q9p0Var = (q9p0) v9p0Var;
                lc00 lc00VarB = kotlin.collections.a.b();
                list2 = null;
                ofm0.l(lc00VarB, q9p0Var.e, q9p0Var.f, ctf0Var);
                float f = q9p0Var.g;
                lsm0 lsm0Var = ctf0Var.b;
                ofm0.j(lc00VarB, 2L, f, lsm0Var.a(R.string.cs2_rating_three_zero, Arrays.copyOf(new Object[0], 0)));
                ofm0.k(lc00VarB, 3L, q9p0Var.h, lsm0Var.a(R.string.age, Arrays.copyOf(new Object[0], 0)));
                ofm0.j(lc00VarB, 4L, q9p0Var.i, lsm0Var.a(R.string.cs2_adr, Arrays.copyOf(new Object[0], 0)));
                ofm0.j(lc00VarB, 5L, q9p0Var.j, lsm0Var.a(R.string.cs2_kills_per_round, Arrays.copyOf(new Object[0], 0)));
                ofm0.j(lc00VarB, 6L, q9p0Var.k, lsm0Var.a(R.string.cs2_death_per_round, Arrays.copyOf(new Object[0], 0)));
                int i2 = q9p0Var.l;
                if (i2 > 0) {
                    String str = z ? "$%,d" : "%,d$";
                    String strA2 = lsm0Var.a(R.string.prizes_money_statistic, Arrays.copyOf(new Object[0], 0));
                    String strReplace = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)).replace(',', '.');
                    strReplace.getClass();
                    lc00VarB.add(new a4m(7L, new d4m(strA2, strReplace)));
                }
                lc00VarA = kotlin.collections.a.a(lc00VarB);
            } else {
                list2 = null;
                if (v9p0Var instanceof r9p0) {
                    r9p0 r9p0Var = (r9p0) v9p0Var;
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    ofm0.l(lc00VarB2, r9p0Var.e, r9p0Var.f, ctf0Var);
                    float f2 = r9p0Var.h;
                    lsm0 lsm0Var2 = ctf0Var.b;
                    ofm0.j(lc00VarB2, 8L, f2, lsm0Var2.a(R.string.dota_kda, Arrays.copyOf(new Object[0], 0)));
                    ofm0.k(lc00VarB2, 9L, r9p0Var.i, lsm0Var2.a(R.string.dota_gpm, Arrays.copyOf(new Object[0], 0)));
                    ofm0.k(lc00VarB2, 10L, r9p0Var.j, lsm0Var2.a(R.string.dota_xpm, Arrays.copyOf(new Object[0], 0)));
                    lc00VarA = kotlin.collections.a.a(lc00VarB2);
                } else {
                    if (v9p0Var instanceof s9p0) {
                        s9p0 s9p0Var = (s9p0) v9p0Var;
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        ofm0.l(lc00VarB3, s9p0Var.e, s9p0Var.f, ctf0Var);
                        float f3 = s9p0Var.h;
                        lsm0 lsm0Var3 = ctf0Var.b;
                        ofm0.j(lc00VarB3, 8L, f3, lsm0Var3.a(R.string.dota_kda, Arrays.copyOf(new Object[0], 0)));
                        ofm0.k(lc00VarB3, 11L, s9p0Var.i, lsm0Var3.a(R.string.victories, Arrays.copyOf(new Object[0], 0)));
                        ofm0.k(lc00VarB3, 12L, s9p0Var.j, lsm0Var3.a(R.string.fifa_loses_title, Arrays.copyOf(new Object[0], 0)));
                        lc00VarA = kotlin.collections.a.a(lc00VarB3);
                    } else {
                        j2 = 2;
                        if (v9p0Var instanceof u9p0) {
                            u9p0 u9p0Var = (u9p0) v9p0Var;
                            lc00 lc00VarB4 = kotlin.collections.a.b();
                            ofm0.l(lc00VarB4, u9p0Var.e, u9p0Var.f, ctf0Var);
                            long j3 = u9p0Var.g;
                            if (j3 > 0) {
                                String strA3 = ctf0Var.b.a(R.string.age, Arrays.copyOf(new Object[0], 0));
                                Calendar calendar = Calendar.getInstance();
                                Calendar calendar2 = Calendar.getInstance();
                                calendar.setTimeInMillis(j3 * 1000);
                                int i3 = calendar2.get(1) - calendar.get(1);
                                if (calendar2.get(6) < calendar.get(6)) {
                                    i3--;
                                }
                                lc00VarB4.add(new a4m(3L, new d4m(strA3, String.valueOf(i3))));
                            }
                            float f4 = u9p0Var.h;
                            lsm0 lsm0Var4 = ctf0Var.b;
                            ofm0.j(lc00VarB4, 13L, f4, lsm0Var4.a(R.string.valorant_combat_score, Arrays.copyOf(new Object[0], 0)));
                            ofm0.j(lc00VarB4, 14L, u9p0Var.i, lsm0Var4.a(R.string.valorant_avg_kills, Arrays.copyOf(new Object[0], 0)));
                            ofm0.j(lc00VarB4, 15L, u9p0Var.j, lsm0Var4.a(R.string.valorant_avg_deaths, Arrays.copyOf(new Object[0], 0)));
                            lc00VarA = kotlin.collections.a.a(lc00VarB4);
                        } else {
                            if (!(v9p0Var instanceof t9p0)) {
                                t9f.b();
                                return null;
                            }
                            t9p0 t9p0Var = (t9p0) v9p0Var;
                            lc00 lc00VarB5 = kotlin.collections.a.b();
                            ofm0.l(lc00VarB5, t9p0Var.e, t9p0Var.f, ctf0Var);
                            int i4 = t9p0Var.g;
                            lsm0 lsm0Var5 = ctf0Var.b;
                            ofm0.k(lc00VarB5, 14L, i4, lsm0Var5.a(R.string.lol_statistic_kills, Arrays.copyOf(new Object[0], 0)));
                            ofm0.k(lc00VarB5, 15L, t9p0Var.h, lsm0Var5.a(R.string.lol_death, Arrays.copyOf(new Object[0], 0)));
                            ofm0.k(lc00VarB5, 16L, t9p0Var.i, lsm0Var5.a(R.string.maps, Arrays.copyOf(new Object[0], 0)));
                            ofm0.k(lc00VarB5, 17L, t9p0Var.j, lsm0Var5.a(R.string.rainbow_six_EPS, Arrays.copyOf(new Object[0], 0)));
                            lc00VarA = kotlin.collections.a.a(lc00VarB5);
                        }
                    }
                    z2 = v9p0Var instanceof r9p0;
                    if (z2) {
                        iterable = ((r9p0) v9p0Var).k;
                    } else if (v9p0Var instanceof s9p0) {
                        iterable = ((s9p0) v9p0Var).k;
                    } else {
                        iterable = iun.f15405a;
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        p8p0Var = (p8p0) obj2;
                        if (p8p0Var.b.length() <= 0 && p8p0Var.c >= 0) {
                            float f5 = p8p0Var.d;
                            if (0.0f <= f5 && f5 <= 100.0f) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    String strH = h97.h(v9p0Var.getId(), "LINEUP");
                    n0x n0xVar = new n0x(v9p0Var.b());
                    String strC = v9p0Var.c();
                    String strA4 = v9p0Var.a();
                    if (z2) {
                        iOrdinal2 = ((r9p0) v9p0Var).g.ordinal();
                        if (iOrdinal2 != 0) {
                            strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal2 != 1) {
                            strA = ctf0Var.b.a(R.string.dota_easy_position, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal2 != 2) {
                            strA = ctf0Var.b.a(R.string.dota_middle_position, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal2 != 3) {
                            strA = ctf0Var.b.a(R.string.dota_hard_position, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal2 != 4) {
                            strA = ctf0Var.b.a(R.string.dota_support_position, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (iOrdinal2 == 5) {
                                t9f.b();
                                return list2;
                            }
                            strA = ctf0Var.b.a(R.string.dota_full_support_position, Arrays.copyOf(new Object[0], 0));
                        }
                    } else if (v9p0Var instanceof s9p0) {
                        iOrdinal = ((s9p0) v9p0Var).g.ordinal();
                        if (iOrdinal != 0) {
                            strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal != 1) {
                            strA = ctf0Var.b.a(R.string.lol_support, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal != 2) {
                            strA = ctf0Var.b.a(R.string.lol_mid_lane, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal != 3) {
                            strA = ctf0Var.b.a(R.string.lol_top_lane, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal != 4) {
                            strA = ctf0Var.b.a(R.string.lol_jungle, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (iOrdinal == 5) {
                                t9f.b();
                                return list2;
                            }
                            strA = ctf0Var.b.a(R.string.lol_bot_lane, Arrays.copyOf(new Object[0], 0));
                        }
                    } else {
                        strA = "";
                    }
                    String str2 = strA;
                    boolean z3 = !lc00VarA.isEmpty();
                    if (lc00VarA.isEmpty()) {
                        g4mVar = h4m.f12440a;
                    } else {
                        g4mVar = new g4m(dyb.o0(lc00VarA));
                    }
                    boolean z4 = !arrayList.isEmpty();
                    if (arrayList.isEmpty()) {
                        it = it2;
                        jamVar = kam.f17971a;
                    } else {
                        if (j == j2) {
                            i = R.string.champions;
                        } else {
                            i = R.string.cyber_best_heroes;
                        }
                        lsm0 lsm0Var6 = ctf0Var.b;
                        r9m r9mVar = new r9m(dyb.g0(lsm0Var6.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var6.a(i, Arrays.copyOf(new Object[0], 0)));
                        List<p8p0> listD0 = CollectionsKt.D0(arrayList, 3);
                        arrayList2 = new ArrayList(r3d.q(listD0, 10));
                        for (p8p0 p8p0Var2 : listD0) {
                            n0x n0xVar2 = new n0x(p8p0Var2.e);
                            if (j == 1) {
                                ut90Var = ut90.Rectangle;
                            } else {
                                ut90Var = ut90.Medium;
                            }
                            ut90 ut90Var2 = ut90Var;
                            String str3 = p8p0Var2.b;
                            ham hamVar = new ham(String.valueOf(p8p0Var2.c));
                            Iterator it3 = it2;
                            strR = kotlin.text.c.r(String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(p8p0Var2.d)}, 1)), Separators.DOT, Separators.COMMA, false);
                            if (kotlin.text.c.n(strR, ",0", false)) {
                                strConcat = ttm0.H(2, strR).concat(Separators.PERCENT);
                            } else {
                                strConcat = strR.concat(Separators.PERCENT);
                            }
                            arrayList2.add(new fam("", n0xVar2, ut90Var2, qt90.f29289a, str3, dyb.g0(hamVar, new ham(strConcat))));
                            it2 = it3;
                        }
                        it = it2;
                        jamVar = new jam(r9mVar, dyb.o0(arrayList2), list2, 12);
                    }
                    arrayList4.add(new n9p0(strH, new dhh(n0xVar, strC, strA4, str2, z3, g4mVar, z4, jamVar)));
                    it2 = it;
                }
            }
            j2 = 2;
            z2 = v9p0Var instanceof r9p0;
            if (z2) {
                iterable = ((r9p0) v9p0Var).k;
            } else if (v9p0Var instanceof s9p0) {
                iterable = ((s9p0) v9p0Var).k;
            } else {
                iterable = iun.f15405a;
            }
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                p8p0Var = (p8p0) obj2;
                if (p8p0Var.b.length() <= 0) {
                }
            }
            String strH2 = h97.h(v9p0Var.getId(), "LINEUP");
            n0x n0xVar3 = new n0x(v9p0Var.b());
            String strC2 = v9p0Var.c();
            String strA5 = v9p0Var.a();
            if (z2) {
                iOrdinal2 = ((r9p0) v9p0Var).g.ordinal();
                if (iOrdinal2 != 0) {
                    strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 != 1) {
                    strA = ctf0Var.b.a(R.string.dota_easy_position, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 != 2) {
                    strA = ctf0Var.b.a(R.string.dota_middle_position, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 != 3) {
                    strA = ctf0Var.b.a(R.string.dota_hard_position, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 != 4) {
                    strA = ctf0Var.b.a(R.string.dota_support_position, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal2 == 5) {
                        t9f.b();
                        return list2;
                    }
                    strA = ctf0Var.b.a(R.string.dota_full_support_position, Arrays.copyOf(new Object[0], 0));
                }
            } else if (v9p0Var instanceof s9p0) {
                iOrdinal = ((s9p0) v9p0Var).g.ordinal();
                if (iOrdinal != 0) {
                    strA = ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal != 1) {
                    strA = ctf0Var.b.a(R.string.lol_support, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal != 2) {
                    strA = ctf0Var.b.a(R.string.lol_mid_lane, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal != 3) {
                    strA = ctf0Var.b.a(R.string.lol_top_lane, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal != 4) {
                    strA = ctf0Var.b.a(R.string.lol_jungle, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal == 5) {
                        t9f.b();
                        return list2;
                    }
                    strA = ctf0Var.b.a(R.string.lol_bot_lane, Arrays.copyOf(new Object[0], 0));
                }
            } else {
                strA = "";
            }
            String str4 = strA;
            boolean z5 = !lc00VarA.isEmpty();
            if (lc00VarA.isEmpty()) {
                g4mVar = h4m.f12440a;
            } else {
                g4mVar = new g4m(dyb.o0(lc00VarA));
            }
            boolean z6 = !arrayList.isEmpty();
            if (arrayList.isEmpty()) {
                it = it2;
                jamVar = kam.f17971a;
            } else {
                if (j == j2) {
                    i = R.string.champions;
                } else {
                    i = R.string.cyber_best_heroes;
                }
                lsm0 lsm0Var7 = ctf0Var.b;
                r9m r9mVar2 = new r9m(dyb.g0(lsm0Var7.a(R.string.maps, Arrays.copyOf(new Object[0], 0)), lsm0Var7.a(R.string.cyber_wr, Arrays.copyOf(new Object[0], 0))), lsm0Var7.a(i, Arrays.copyOf(new Object[0], 0)));
                List<p8p0> listD1 = CollectionsKt.D0(arrayList, 3);
                arrayList2 = new ArrayList(r3d.q(listD1, 10));
                while (r4.hasNext()) {
                    n0x n0xVar4 = new n0x(p8p0Var2.e);
                    if (j == 1) {
                        ut90Var = ut90.Rectangle;
                    } else {
                        ut90Var = ut90.Medium;
                    }
                    ut90 ut90Var3 = ut90Var;
                    String str5 = p8p0Var2.b;
                    ham hamVar2 = new ham(String.valueOf(p8p0Var2.c));
                    Iterator it4 = it2;
                    strR = kotlin.text.c.r(String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(p8p0Var2.d)}, 1)), Separators.DOT, Separators.COMMA, false);
                    if (kotlin.text.c.n(strR, ",0", false)) {
                        strConcat = ttm0.H(2, strR).concat(Separators.PERCENT);
                    } else {
                        strConcat = strR.concat(Separators.PERCENT);
                    }
                    arrayList2.add(new fam("", n0xVar4, ut90Var3, qt90.f29289a, str5, dyb.g0(hamVar2, new ham(strConcat))));
                    it2 = it4;
                }
                it = it2;
                jamVar = new jam(r9mVar2, dyb.o0(arrayList2), list2, 12);
            }
            arrayList4.add(new n9p0(strH2, new dhh(n0xVar3, strC2, strA5, str4, z5, g4mVar, z6, jamVar)));
            it2 = it;
        }
        lc00 lc00VarB6 = kotlin.collections.a.b();
        lc00VarB6.add(new m9p0("HEADER_LINEUP", new hjm(ctf0Var.b.a(R.string.cyber_line_up, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
        lc00VarB6.addAll(arrayList4);
        return kotlin.collections.a.a(lc00VarB6);
    }

    public static final ujv0 i(Set set, float f, float f2) {
        int i;
        set.getClass();
        int i2 = (int) f;
        int i3 = (int) f2;
        Set<ujv0> set2 = set;
        Iterator it = set2.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = ((ujv0) it.next()).f35801a;
            if (i5 <= i2 && i5 > i4) {
                i4 = i5;
            }
        }
        ujv0 ujv0Var = new ujv0(0, 0);
        for (ujv0 ujv0Var2 : set2) {
            if (ujv0Var2.f35801a == i4 && (i = ujv0Var2.b) <= i3 && ujv0Var.b <= i) {
                ujv0Var = ujv0Var2;
            }
        }
        return ujv0Var;
    }

    public static uvr0 j() {
        return new uvr0(new vvr0("", new mtr0("", "", true, false), crq0.f4858a), nlr0.f23742a, false, 0, 0L, "", "", "");
    }

    public static final yjj0 k(xds0 xds0Var, fet fetVar, int i) {
        Object objA;
        boolean z = (((i & 14) ^ 6) > 4 && fetVar.e(xds0Var.ordinal())) || (i & 6) == 4;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            int iOrdinal = xds0Var.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                objA = vgg0.a(16.0f);
            } else if (iOrdinal == 1) {
                zcl zclVar2 = qmk.f28987a;
                objA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            } else if (iOrdinal == 2) {
                objA = jd8.n;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                zcl zclVar3 = qmk.f28987a;
                objA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            }
            objP = objA;
            fetVar.o0(objP);
        }
        return (yjj0) objP;
    }

    public static final aoo0 l(aeo0 aeo0Var) {
        int iOrdinal = aeo0Var.ordinal();
        if (iOrdinal == 0) {
            return aoo0.b;
        }
        if (iOrdinal == 1) {
            return aoo0.c;
        }
        if (iOrdinal == 2) {
            return aoo0.d;
        }
        t9f.b();
        return null;
    }

    public static final czm m(d0t d0tVar) {
        f0t f0tVar = d0tVar.q;
        long j = f0tVar.f8731a;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, f0tVar.d);
        return new czm(qzb.s0(d0tVar), new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(j, str2 != null ? str2 : ""), R.drawable.ic_glyph_placeholder_player));
    }

    public static final czm n(d0t d0tVar) {
        f0t f0tVar = d0tVar.r;
        long j = f0tVar.f8731a;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, f0tVar.d);
        return new czm(qzb.t0(d0tVar), new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(j, str2 != null ? str2 : ""), R.drawable.ic_glyph_placeholder_player));
    }

    public static final int o(uaq0 uaq0Var) {
        switch (uaq0Var.ordinal()) {
            case 0:
                return R.style.AppTheme_Light;
            case 1:
                return R.style.AppTheme_Dark;
            case 2:
                return R.style.AppTheme_Night;
            case 3:
                return R.style.AppTheme_Light_Yellow;
            case 4:
                return R.style.AppTheme_Dark_Yellow;
            case 5:
                return R.style.AppTheme_Light_Green;
            case 6:
                return R.style.AppTheme_Dark_Green;
            case 7:
                return R.style.AppTheme_Light_Red;
            case 8:
                return R.style.AppTheme_Dark_Red;
            case 9:
                return R.style.AppTheme_Light_Blue;
            case 10:
                return R.style.AppTheme_Dark_Blue;
            default:
                t9f.b();
                return 0;
        }
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hny.u(str.concat(" must not be null"));
    }

    public static void q(icx0 icx0Var) {
        if (s(icx0Var) || icx0Var.f14557a == null) {
            Trace.beginSection(icx0Var.c);
            t(icx0Var);
        } else {
            q(icx0Var.f14557a);
            t(icx0Var);
        }
    }

    public static void r(icx0 icx0Var) {
        if (s(icx0Var) || icx0Var.f14557a == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            r(icx0Var.f14557a);
        }
    }

    public static boolean s(icx0 icx0Var) {
        return icx0Var.e != Thread.currentThread();
    }

    public static void t(icx0 icx0Var) {
        String strSubstring = icx0Var.d;
        AtomicReference atomicReference = wcx0.f38946a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }
}
