package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ihm0 {
    public static final void a(wxn0 wxn0Var, Function1 function1, fet fetVar, int i) {
        wxn0Var.getClass();
        function1.getClass();
        fetVar.g0(-243387073);
        int i2 = i | (fetVar.g(wxn0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            imm immVar = wxn0Var.i;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new vkm(2);
                fetVar.o0(objP);
            }
            vkm vkmVar = (vkm) objP;
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new opm0(function1, (byte) 17);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, vkmVar, (Function0) objP2, null, null, null, null, null, null, null, u1c.M(-615313652, new apn0(wxn0Var, function1), fetVar), fetVar, 384, 48, 2033);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new apn0(wxn0Var, function1, i);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(1027764772);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            obc.q(o7k0.d(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 1.0f), new rqm((vui0) new tui0(rsm0.w(R.string.select_all, 0, fetVar), null), (pui0) null, (pvi0) new lvi0(tc00.f33696a, z), (d4d) null, (tvi0) null, wui0.b, false, (e900) null, 442), false, null, function0, null, function0, null, fetVar, (57344 & (i2 << 6)) | 384 | ((i2 << 12) & 3670016), 168);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5a(mm40Var2, z, function0, i, (byte) 5);
        }
    }

    public static final void c(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1725346001);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pz40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zhl0(pz40Var, (byte) 18);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z2 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zhl0(pz40Var, (byte) 19);
                fetVar2.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar2);
            Object[] objArr3 = new Object[0];
            boolean z3 = i3 == 32;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new zhl0(pz40Var, (byte) 20);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar2);
            Object[] objArr4 = new Object[0];
            boolean z4 = i3 == 32;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new zhl0(pz40Var, (byte) 21);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP4, fetVar2);
            Object[] objArr5 = new Object[0];
            boolean z5 = i3 == 32;
            Object objP5 = fetVar2.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new zhl0(pz40Var, (byte) 22);
                fetVar2.o0(objP5);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP5, fetVar2);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "PLAYER_CELL_ROW_TAG");
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z6 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 28.0f), "PLAYER_POSITION_TAG");
            String str = (String) l7m0VarY.getValue();
            y9q0 y9q0VarP = g1t0.p();
            pz40 pz40Var2 = s6t0.f31722a;
            v8q0.a(str, mm40VarE1, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarP, fetVar, 0, 24576, 113656);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player, 0, fetVar);
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = ju70.T(pm80VarF, null, new shq0((byte) 16), 6);
                fetVar.o0(objP6);
            }
            pm80 pm80Var = (pm80) objP6;
            long separator = s6t0.b().f33626a.getSeparator();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b((String) l7m0VarY2.getValue(), null, o2e.e0(o7k0.n(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.S(jm40Var, 1.0f, separator, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2))), 40.0f), "PLAYER_IMAGE_TAG"), pm80Var, pm80Var, null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
            mm40 mm40VarI = hne.i(1.0f, true, "PLAYER_INFO_CELL_TAG");
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a((String) l7m0VarY3.getValue(), o2e.e0(jm40Var, "PLAYER_NAME_TAG"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 48, 24960, 110584);
            v8q0.a((String) l7m0VarY4.getValue(), o2e.e0(jm40Var, "PLAYER_COUNTRY_TAG"), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40 mm40VarE2 = o2e.e0(s5x0.J(i120.Q(jm40Var, s6t0.b().f33626a.getBackground(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f), "PLAYER_STATISTICS_LAZY_ROW");
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zG = fetVar2.g(l7m0VarY5);
            Object objP7 = fetVar2.P();
            if (zG || objP7 == cl5Var) {
                objP7 = new ufp(l7m0VarY5, (byte) 29);
                fetVar2.o0(objP7);
            }
            b8k0.f(mm40VarE2, null, null, false, qw3Var, null, null, false, null, (Function1) objP7, fetVar2, 0, 494);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, (byte) 8);
        }
    }

    public static final void d(de80 de80Var, Function2 function2, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2 = mm40Var;
        fet fetVar2 = fetVar;
        function2.getClass();
        fetVar2.g0(-768507511);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(de80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(mm40Var2) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new det0(function2, de80Var, b);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            if (de80Var.b) {
                fetVar2.e0(1863853701);
                x0x.l(de80Var.f5937a, true, function0, true, mm40Var, fetVar, ((i2 << 6) & 57344) | 3120);
                fetVar2 = fetVar;
                fetVar2.r(false);
                mm40Var2 = mm40Var;
            } else {
                fetVar2.e0(1864084713);
                mm40Var2 = mm40Var;
                qzb.n(mm40Var2, new wul(nul.e, oe9.f25112a, new ue9(de80Var.f5937a), true, false, false), function0, fetVar2, (i2 >> 6) & 14, 0);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(de80Var, function2, mm40Var2, i);
        }
    }

    public static final void e(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(69940508);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 20;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarC = ((zlv0) l7m0Var.getValue()).c();
            j9m0 j9m0VarB = ((zlv0) l7m0Var.getValue()).b();
            boolean zA = ((zlv0) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 18);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0VarC, j9m0VarB, zA, (Function0) objP, null, null, u1c.M(1937231786, new dqz(l7m0Var, function1, b), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i, b);
        }
    }

    public static final void f(ArrayList arrayList, String str, ArrayList arrayList2, long j, float f) {
        ArrayList arrayListU = ohs0.u(str);
        arrayListU.add(new l4m0(str, kkg.E, qmk.q, 36.0f, 3, 0.0f, 12.0f));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            long j2 = kkg.D;
            zcl zclVar = qmk.f28987a;
            arrayListU.add(new l4m0(str2, j2, j, 36.0f, 3, 0.0f, f));
        }
        arrayList.add(dyb.r0(arrayListU));
    }

    public static final r8p0 g(List list, Locale locale, Integer num) {
        list.getClass();
        zz2 zz2VarK = k(list, locale, num);
        int i = zz2VarK.f45232a;
        List list2 = (List) zz2VarK.b;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            q8p0 q8p0Var = (q8p0) obj;
            arrayList.add(new cdg0(q8p0Var.f28311a, q8p0Var.b, q8p0Var.c, q8p0Var.d, i == i2));
            i2 = i3;
        }
        return new r8p0("CALENDAR_RESULTS", new apm(dyb.o0(arrayList), vcg0.f37186a, i, false));
    }

    public static final dap0 h(List list, ctf0 ctf0Var, Locale locale, Integer num, q0s q0sVar, v5l0 v5l0Var, boolean z) {
        v0g0 q0g0Var;
        m1g0 l1g0Var;
        j1g0 i1g0Var;
        list.getClass();
        ctf0Var.getClass();
        zz2 zz2VarK = k(list, locale, num);
        q8p0 q8p0Var = (q8p0) CollectionsKt.W(zz2VarK.f45232a, (List) zz2VarK.b);
        List list2 = (List) zz2VarK.c;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            k9p0 k9p0Var = (k9p0) it.next();
            k9p0Var.getClass();
            String str = k9p0Var.i;
            long j = k9p0Var.b;
            l9p0 l9p0Var = k9p0Var.g;
            List list3 = l9p0Var.b;
            String str2 = l9p0Var.f19667a;
            l9p0 l9p0Var2 = k9p0Var.h;
            List list4 = l9p0Var2.b;
            String str3 = l9p0Var2.f19667a;
            long j2 = k9p0Var.f17926a;
            Iterator it2 = it;
            int iOrdinal = v5l0Var.ordinal();
            if (iOrdinal == 0) {
                jwm jwmVarI = xww.I(k9p0Var, q0sVar, ctf0Var);
                jwm jwmVarL = xww.L(k9p0Var, q0sVar, ctf0Var);
                q0g0Var = new q0g0(j2, str3.length() == 0 ? new y0g0(str2, jwmVarI, jwmVarL) : new z0g0(qxw.D(str2, list3), qxw.D(str3, list4), o1g0.b(j, str), jwmVarI, jwmVarL, null));
            } else if (iOrdinal == 1) {
                jwm jwmVarI2 = xww.I(k9p0Var, q0sVar, ctf0Var);
                jwm jwmVarL2 = xww.L(k9p0Var, q0sVar, ctf0Var);
                if (str3.length() == 0) {
                    l1g0Var = new k1g0(str2, jwmVarI2, jwmVarL2);
                } else {
                    Pair pairC = o1g0.c(j, str);
                    l1g0Var = new l1g0(new vzm(str2, (String) pairC.f46059a), new vzm(str3, (String) pairC.b), jwmVarI2, jwmVarL2, null);
                }
                q0g0Var = new u0g0(j2, l1g0Var);
            } else if (iOrdinal == 2) {
                jwm jwmVarI3 = xww.I(k9p0Var, q0sVar, ctf0Var);
                jwm jwmVarL3 = xww.L(k9p0Var, q0sVar, ctf0Var);
                if (str3.length() == 0) {
                    i1g0Var = new h1g0(str2, jwmVarI3.f17257a, jwmVarL3);
                } else {
                    Pair pairC2 = o1g0.c(j, str);
                    i1g0Var = new i1g0(azw.N(list3, str2, (String) pairC2.f46059a), azw.N(list4, str3, (String) pairC2.b), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), jwmVarI3, jwmVarL3, null);
                }
                q0g0Var = new t0g0(j2, i1g0Var);
            } else if (iOrdinal == 3) {
                jwm jwmVarI4 = xww.I(k9p0Var, q0sVar, ctf0Var);
                jwm jwmVarL4 = xww.L(k9p0Var, q0sVar, ctf0Var);
                q0g0Var = new s0g0(j2, str3.length() == 0 ? new e1g0(str2, jwmVarI4, jwmVarL4) : new f1g0(yyw.I(str2, list3), yyw.I(str3, list4), o1g0.a(j, str), jwmVarI4, jwmVarL4, null));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                jwm jwmVarI5 = xww.I(k9p0Var, q0sVar, ctf0Var);
                jwm jwmVarL5 = xww.L(k9p0Var, q0sVar, ctf0Var);
                q0g0Var = new r0g0(j2, str3.length() == 0 ? new b1g0(str2, jwmVarI5.f17257a, jwmVarL5) : new c1g0(piz.E(str2, list3), piz.E(str3, list4), o1g0.a(j, str), jwmVarI5.f17257a, jwmVarL5, null));
            }
            arrayList.add(q0g0Var);
            it = it2;
        }
        return new dap0("RESULTS" + q8p0Var, new vb90(q0sVar, dyb.o0(arrayList), true, z));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:41:0x0065  */
    public static final qt8 i(String str, zjh zjhVar, String str2, String str3, int i, int i2, LinkedHashMap linkedHashMap) {
        boolean z;
        boolean z2;
        String str4;
        boolean z3 = str != null && ipm0.g(zjhVar, str);
        zjh zjhVar2 = (zjh) linkedHashMap.get(str2);
        String str5 = null;
        if (zjhVar2 == null) {
            z = false;
        } else {
            mkh mkhVar = zjhVar2.d;
            if (mkhVar.e) {
                str4 = mkhVar.b;
            } else {
                mkh mkhVar2 = zjhVar2.e;
                str4 = mkhVar2.e ? mkhVar2.b : null;
            }
            if (Intrinsics.d(str4, str) || (str4 == null && ipm0.g(zjhVar2, str))) {
                z = true;
            } else {
                z = false;
            }
        }
        zjh zjhVar3 = (zjh) linkedHashMap.get(str3);
        if (zjhVar3 == null) {
            z2 = false;
        } else {
            mkh mkhVar3 = zjhVar3.d;
            if (mkhVar3.e) {
                str5 = mkhVar3.b;
            } else {
                mkh mkhVar4 = zjhVar3.e;
                if (mkhVar4.e) {
                    str5 = mkhVar4.b;
                }
            }
            if (Intrinsics.d(str5, str) || (str5 == null && ipm0.g(zjhVar3, str))) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z3 || (!z && !z2)) {
            return qt8.f29287a;
        }
        boolean z4 = i <= i2;
        if (z && z2) {
            return qt8.b;
        }
        if (z) {
            return z4 ? qt8.b : qt8.c;
        }
        return z4 ? qt8.c : qt8.b;
    }

    public static final ArrayList j(List list) {
        ArrayList arrayListU = twn.u(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int i3 = 0;
            for (Object obj2 : (List) obj) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayListU.add(new xdq0(gnm0.x(((Number) obj2).intValue()), i, i3));
                i3 = i4;
            }
            i = i2;
        }
        return arrayListU;
    }

    public static final zz2 k(List list, Locale locale, Integer num) {
        Integer num2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMMM", locale);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy", locale);
        List listA0 = CollectionsKt.A0(list, new tgo0((byte) 11));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = listA0.iterator();
        while (true) {
            num2 = null;
            num2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            rdj rdjVar = rdj.f30294a;
            Date dateK = rdj.k(((k9p0) next).k);
            String str = simpleDateFormat.format(dateK);
            str.getClass();
            String str2 = simpleDateFormat2.format(dateK);
            str2.getClass();
            q8p0 q8p0Var = new q8p0(str, str2, ntb.U(dateK) ? null : simpleDateFormat3.format(dateK), ntb.W(dateK));
            Object arrayList = linkedHashMap.get(q8p0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(q8p0Var, arrayList);
            }
            ((List) arrayList).add(next);
        }
        List listL0 = CollectionsKt.L0(linkedHashMap.keySet());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : list) {
            rdj rdjVar2 = rdj.f30294a;
            Date dateK2 = rdj.k(((k9p0) obj).k);
            String str3 = simpleDateFormat.format(dateK2);
            str3.getClass();
            String str4 = simpleDateFormat2.format(dateK2);
            str4.getClass();
            q8p0 q8p0Var2 = new q8p0(str3, str4, ntb.U(dateK2) ? null : simpleDateFormat3.format(dateK2), ntb.W(dateK2));
            Object arrayList2 = linkedHashMap2.get(q8p0Var2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(q8p0Var2, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        int iIntValue = num != null ? num.intValue() : q3d.i(listL0);
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (iIntValue > -1 && q3d.i(listL0) >= iIntValue) {
            num2 = numValueOf;
        }
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Object obj2 = (List) CollectionsKt.W(CollectionsKt.X(linkedHashMap2.keySet(), (q8p0) CollectionsKt.W(iIntValue2, listL0)), CollectionsKt.L0(linkedHashMap2.values()));
        if (obj2 == null) {
            obj2 = iun.f15405a;
        }
        obj2.getClass();
        zz2 zz2Var = new zz2();
        zz2Var.b = listL0;
        zz2Var.c = obj2;
        zz2Var.f45232a = iIntValue2;
        return zz2Var;
    }

    public static final rpp0 l(l9s l9sVar) {
        Object obj = 0L;
        l9sVar.getClass();
        Pair pairW = ozb.W(l9sVar);
        String str = (String) pairW.f46059a;
        String str2 = (String) pairW.b;
        if (l9sVar.getType() != s9s.b) {
            Long l = (Long) CollectionsKt.firstOrNull(l9sVar.p());
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = (Long) CollectionsKt.firstOrNull(l9sVar.m());
            return new qpp0(jLongValue, l2 != null ? l2.longValue() : 0L, str, str2);
        }
        List listP = l9sVar.p();
        Object obj2 = listP.size() > 0 ? listP.get(0) : obj;
        List listP2 = l9sVar.p();
        Pair pair = new Pair(obj2, 1 < listP2.size() ? listP2.get(1) : obj);
        List listM = l9sVar.m();
        Object obj3 = listM.size() > 0 ? listM.get(0) : obj;
        List listM2 = l9sVar.m();
        return new ppp0(pair, new Pair(obj3, 1 < listM2.size() ? listM2.get(1) : 0L), str, str2);
    }

    public static final gbn m(Function1 function1) {
        return new gbn(new b4u0((byte) 22), new d8q0(3, (byte) 25), new sbt0(function1, (byte) 27), mnu0.d);
    }

    public static final czm n(d0t d0tVar) {
        f0t f0tVar = d0tVar.q;
        long j = f0tVar.f8731a;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, f0tVar.d);
        return new czm(qzb.s0(d0tVar), new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(j, str2 != null ? str2 : ""), R.drawable.ic_glyph_placeholder_player));
    }

    public static final czm o(d0t d0tVar) {
        f0t f0tVar = d0tVar.r;
        long j = f0tVar.f8731a;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, f0tVar.d);
        return new czm(qzb.t0(d0tVar), new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(j, str2 != null ? str2 : ""), R.drawable.ic_glyph_placeholder_player));
    }

    public static final ags0 p(ggs0 ggs0Var, Map map) {
        ggs0Var.getClass();
        map.getClass();
        Long l = ggs0Var.f11266a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = ggs0Var.b;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Integer num = ggs0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        Double d = ggs0Var.d;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str = ggs0Var.f;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get(ggs0Var.g);
        return new ags0(dDoubleValue, iIntValue, jLongValue, jLongValue2, str, str2 != null ? str2 : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final g2u0 q(r1u0 r1u0Var) {
        Map map;
        u1u0 u1u0Var;
        ?? arrayList;
        List list;
        char c;
        boolean z;
        String string;
        char c2;
        Integer num;
        Integer num2;
        int iIntValue = (r1u0Var == null || (num2 = r1u0Var.f29701a) == null) ? 0 : num2.intValue();
        if (r1u0Var == null || (map = r1u0Var.b) == null) {
            map = lun.f20680a;
            map.getClass();
        }
        if (r1u0Var == null || (num = r1u0Var.c) == null) {
            u1u0Var = u1u0.c;
        } else {
            int iIntValue2 = num.intValue();
            if (iIntValue2 != 1) {
                u1u0Var = iIntValue2 != 2 ? u1u0.c : u1u0.b;
            } else {
                u1u0Var = u1u0.f34918a;
            }
        }
        if (r1u0Var == null || (list = r1u0Var.d) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eyt0 eyt0Var = (eyt0) it.next();
                eyt0Var.getClass();
                String str = eyt0Var.c;
                StringBuilder sb = new StringBuilder(ujn.h);
                String str2 = eyt0Var.g;
                String strL = kng0.l("/sfiles/sppic1/cyber/vlrt/agents/", str == null ? "" : str, ".png");
                Iterator it2 = it;
                if (strL.length() == 0) {
                    sb.setLength(0);
                    c = '/';
                } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                    c = '/';
                    sb.setLength(0);
                    sb.append(strL);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    c = '/';
                    sb.append(StringsKt.y0(strL, '/'));
                }
                String string2 = sb.toString();
                if (str2 == null || str2.length() <= 0) {
                    z = true;
                    string = "";
                } else {
                    StringBuilder sb2 = new StringBuilder(ujn.h);
                    String strL2 = kng0.l("/sfiles/sppic1/cyber/vlrt/weapons/", str2, ".png");
                    if (strL2.length() == 0) {
                        sb2.setLength(0);
                        z = true;
                    } else if (StringsKt.O(strL2, ujn.h, false) || kotlin.text.c.x(strL2, "https://", false)) {
                        z = true;
                        sb2.setLength(0);
                        sb2.append(strL2);
                    } else {
                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                            c2 = c;
                        } else {
                            c2 = c;
                            sb2.append(c2);
                        }
                        z = true;
                        sb2.append(StringsKt.y0(strL2, c2));
                    }
                    string = sb2.toString();
                }
                String str3 = eyt0Var.f8643a;
                String str4 = str3 == null ? "" : str3;
                boolean zD = Intrinsics.d(eyt0Var.b, Boolean.TRUE);
                String str5 = str == null ? "" : str;
                Integer num3 = eyt0Var.d;
                int iIntValue3 = -1;
                int iIntValue4 = num3 != null ? num3.intValue() : -1;
                Integer num4 = eyt0Var.e;
                int iIntValue5 = num4 != null ? num4.intValue() : -1;
                Integer num5 = eyt0Var.f;
                int iIntValue6 = num5 != null ? num5.intValue() : -1;
                String str6 = str2 == null ? "" : str2;
                Integer num6 = eyt0Var.h;
                int iIntValue7 = num6 != null ? num6.intValue() : -1;
                Integer num7 = eyt0Var.i;
                int iIntValue8 = num7 != null ? num7.intValue() : -1;
                Integer num8 = eyt0Var.j;
                int iIntValue9 = num8 != null ? num8.intValue() : -1;
                Integer num9 = eyt0Var.k;
                if (num9 != null) {
                    iIntValue3 = num9.intValue();
                }
                arrayList.add(new byt0(str4, zD, str5, string2, iIntValue4, iIntValue5, iIntValue6, str6, string, iIntValue7, iIntValue8, iIntValue9, iIntValue3));
                it = it2;
            }
        }
        return new g2u0(iIntValue, map, u1u0Var, arrayList);
    }

    public static lsj r(PhoneAuthCredential phoneAuthCredential) {
        if (TextUtils.isEmpty(phoneAuthCredential.e)) {
            String str = phoneAuthCredential.f45647a;
            String str2 = phoneAuthCredential.b;
            boolean z = phoneAuthCredential.d;
            lsj lsjVar = new lsj();
            s0x.E(str);
            lsjVar.c = str;
            s0x.E(str2);
            lsjVar.d = str2;
            lsjVar.f20581a = z;
            return lsjVar;
        }
        String str3 = phoneAuthCredential.c;
        String str4 = phoneAuthCredential.e;
        boolean z2 = phoneAuthCredential.d;
        lsj lsjVar2 = new lsj();
        s0x.E(str3);
        lsjVar2.b = str3;
        s0x.E(str4);
        lsjVar2.e = str4;
        lsjVar2.f20581a = z2;
        return lsjVar2;
    }
}
