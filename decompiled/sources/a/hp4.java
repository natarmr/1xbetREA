package a;

import android.javax.sip.message.Response;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hp4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f13425a = new ugd(2131381458, false, new i5b(12));
    public static final ugd b = new ugd(-1625285576, false, new chd(10));
    public static final ugd c = new ugd(1699791222, false, new chd(11));
    public static final ugd d = new ugd(-1078222103, false, new ehd(29));
    public static final ugd e = new ugd(-745137168, false, new ihd(0));
    public static final ugd f = new ugd(-550546213, false, new ihd(1));
    public static final ugd g = new ugd(-1669280136, false, new ihd(2));
    public static final ugd h = new ugd(-2061611451, false, new fhd(23));
    public static final ugd i = new ugd(1222866908, false, new mhd(20));
    public static final lxs0 j = new lxs0(new qzs0((byte) 15), new d4u0(2));
    public static final lxs0 k = new lxs0(new qzs0((byte) 16), new qzs0((byte) 17));
    public static final lxs0 l = new lxs0(new qzs0((byte) 18), new qzs0((byte) 19));
    public static final lxs0 m = new lxs0(new qzs0((byte) 20), new qzs0((byte) 21));
    public static final lxs0 n = new lxs0(new qzs0((byte) 22), new qzs0((byte) 23));
    public static final lxs0 o = new lxs0(new qzs0((byte) 24), new qzs0((byte) 25));
    public static final lxs0 p = new lxs0(new qzs0((byte) 26), new qzs0((byte) 27));
    public static final lxs0 q = new lxs0(new qzs0((byte) 28), new qzs0((byte) 29));
    public static final lxs0 r = new lxs0(new d4u0(0), new d4u0(1));

    public static final void A(int i2, fet fetVar) {
        fetVar.g0(-1092502321);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            mm40 mm40VarN = s5x0.N(o7k0.c, xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jm40 jm40Var = jm40.b;
            l(jm40Var, fqj0VarD0, fetVar, 6);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, false, fetVar, 48);
            m(fqj0VarD0, false, fetVar, 48);
            m(fqj0VarD0, false, fetVar, 48);
            zcl zclVar = qmk.f28987a;
            l(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), fqj0VarD0, fetVar, 0);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, false, fetVar, 48);
            l(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), fqj0VarD0, fetVar, 0);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            l(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), fqj0VarD0, fetVar, 0);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            m(fqj0VarD0, true, fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i2, (byte) 20);
        }
    }

    public static mm40 B(mm40 mm40Var) {
        Map map = quu0.f29360a;
        return lgb.K(mm40Var).e(new i7k0(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), gqw0.f11754a));
    }

    public static mm40 C(mm40 mm40Var) {
        zx7 zx7Var = gqw0.e;
        Map map = quu0.f29360a;
        return lgb.K(mm40Var).e(new i7k0(ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1), zx7Var));
    }

    public static final mm40 D(x7a x7aVar) {
        x7aVar.getClass();
        return new r7a(x7aVar);
    }

    public static final ArrayList E(List list, List list2) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            String str = (String) obj;
            String str2 = (String) CollectionsKt.W(i2, list2);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (kotlin.text.c.x(str2, ujn.h, false)) {
                str3 = str2;
            } else if (str2.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str2)) {
                    str3 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
            arrayList.add(new mdp0(new g5a0(new c280(str3, R.drawable.ic_glyph_placeholder_player), null), str));
            i2 = i3;
        }
        return arrayList;
    }

    public static final er30 F(p3d0 p3d0Var, h950 h950Var, roi0 roi0Var, boolean z, boolean z2, boolean z3) {
        p3d0Var.getClass();
        h950Var.getClass();
        ijt ijtVar = dgy.d;
        ijtVar.getClass();
        xfy xfyVar = (xfy) h8x.L(p3d0Var, ijtVar);
        if (xfyVar != null) {
            if (z) {
                sso ssoVar = egy.f7784a;
                cfy cfyVarB = egy.b(p3d0Var, h950Var, roi0Var, z3);
                if (cfyVarB != null) {
                    return ydx.I(cfyVarB);
                }
            } else if (z2 && (xfyVar.b & 2) == 2) {
                vfy vfyVar = xfyVar.d;
                vfyVar.getClass();
                String string = h950Var.getString(vfyVar.c);
                String string2 = h950Var.getString(vfyVar.d);
                string.getClass();
                string2.getClass();
                return new er30(string.concat(string2));
            }
        }
        return null;
    }

    public static int H(int i2, int i3, boolean z) {
        int i4 = z ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360;
        if (l8x.i0(2, l8x.C0("CameraOrientationUtil"))) {
            StringBuilder sbT = dw9.t("getRelativeImageRotation: destRotationDegrees=", i2, ", sourceRotationDegrees=", ", isOppositeFacing=", i3);
            sbT.append(z);
            sbT.append(", result=");
            sbT.append(i4);
            l8x.U("CameraOrientationUtil", sbT.toString());
        }
        return i4;
    }

    public static final mm40 I(mm40 mm40Var, gy40 gy40Var, boolean z) {
        return mm40Var.e(z ? new tsw(gy40Var) : jm40.b);
    }

    public static final y2 J(Object[] objArr) {
        objArr.getClass();
        return new y2(objArr);
    }

    public static int K(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        jf4.o(twn.m(i2, "Unsupported surface rotation: "));
        return 0;
    }

    public static final List L(List list) {
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rp1 rp1Var = (rp1) it.next();
                String str = rp1Var.f30864a;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                String str2 = rp1Var.b;
                if (str2 == null) {
                    jf4.k(null);
                    return null;
                }
                String str3 = rp1Var.c;
                if (str3 == null) {
                    jf4.k(null);
                    return null;
                }
                String str4 = rp1Var.d;
                if (str4 == null) {
                    jf4.k(null);
                    return null;
                }
                arrayList2.add(new AggregatorSortingOptionModel(str, str2, str3, str4));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final s77 M(HistoryTypeModel historyTypeModel) {
        switch (historyTypeModel.ordinal()) {
            case 0:
                return s77.EVENTS;
            case 1:
                return s77.TOTO;
            case 2:
                return s77.AUTO;
            case 3:
                return s77.UNSETTLED;
            case 4:
                return s77.SALE;
            case 5:
                return s77.AGGREGATOR;
            case 6:
                return s77.JACKPOT;
            case 7:
                return s77.LOTTO;
            default:
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public static final w88 N(z88 z88Var, int i2, int i3) {
        List list;
        ?? arrayList;
        List list2;
        Integer num;
        int iIntValue = 0;
        boolean z = z88Var == null;
        if (z88Var != null && (num = z88Var.c) != null) {
            iIntValue = num.intValue();
        }
        xxb0 xxb0Var = iIntValue == 1 ? xxb0.f41650a : xxb0.b;
        if (i2 == 1) {
            if (z88Var == null || (list2 = z88Var.e) == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(k7x.W((sxb0) it.next(), i3));
                }
            }
        } else if (z88Var == null || (list = z88Var.g) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(k7x.W((sxb0) it2.next(), i3));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r5 = arrayList;
        String str = z88Var != null ? z88Var.f : null;
        String str2 = str == null ? "" : str;
        String str3 = z88Var != null ? z88Var.h : null;
        return new w88(z, xxb0Var, r5, str2, str3 == null ? "" : str3);
    }

    public static final void a(mm40 mm40Var, rno0 rno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        Function1 function2;
        function1.getClass();
        fetVar.g0(521014084);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(rno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            d9z d9zVarA = f9z.a(fetVar);
            Boolean boolValueOf = Boolean.valueOf(rno0Var.f30798a);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zG = (i5 == 256) | (i4 == 32) | fetVar.g(d9zVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                Object m1Var = new m1((Object) rno0Var, (Object) d9zVarA, (Object) function1, (yje) null, (byte) 1);
                function2 = function1;
                fetVar.o0(m1Var);
                objP = m1Var;
            } else {
                function2 = function1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "MENU_ACCORDION_GRID");
            ngv ngvVar = new ngv(2);
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 20.0f, fetVar);
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new k1(rno0Var, function2, (byte) 1);
                fetVar.o0(objP2);
            }
            g8x.i(ngvVar, mm40VarE0, d9zVarA, ch80VarF, null, null, null, false, null, (Function1) objP2, fetVar, 0, 1008);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) rno0Var, (Object) function1, i2, (byte) 1);
        }
    }

    public static final void b(int i2, int i3, fet fetVar, mm40 mm40Var) {
        int i4;
        fetVar.g0(-226492404);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        byte b2 = 0;
        if (fetVar.U(i4 & 1, (i4 & 3) != 2)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var2 = mm40Var;
            zcl zclVar = qmk.f28987a;
            g1x.l(s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), ccq0.b, fetVar, 48, 0);
            mm40Var = mm40Var2;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i2, i3, b2);
        }
    }

    public static final void c(mm40 mm40Var, f3w f3wVar, fet fetVar, int i2) {
        long textPrimary;
        f3wVar.getClass();
        fetVar.g0(-269916602);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(f3wVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ThemeColors themeColors = (ThemeColors) fetVar.k(zaq0.b);
            StaticColors staticColors = (StaticColors) fetVar.k(m8m0.f21378a);
            boolean zG = fetVar.g(f3wVar.f8883a);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                int iOrdinal = f3wVar.e.ordinal();
                if (iOrdinal == 0) {
                    textPrimary = themeColors.getTextPrimary();
                } else if (iOrdinal == 1) {
                    textPrimary = staticColors.m98getGreen0d7_KjU();
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    textPrimary = staticColors.m113getRed0d7_KjU();
                }
                objP = dw9.e(textPrimary, fetVar);
            }
            hmw0.j(mm40Var, u1c.M(885923414, new op2(f3wVar, b2), fetVar), u1c.M(-1593556393, new pp2(f3wVar, ((y3d) objP).f41946a, b2), fetVar), fetVar, (i3 & 14) | 432);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(mm40Var, f3wVar, i2, (byte) 6);
        }
    }

    public static final void d(xcz xczVar, vne vneVar, a4x a4xVar, boolean z, boolean z2, fet fetVar, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        xczVar.getClass();
        vneVar.getClass();
        a4xVar.getClass();
        fetVar.g0(-2077466481);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xczVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(vneVar) : fetVar.i(vneVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z3 = z;
            i3 |= fetVar.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i2 & 24576) == 0) {
            z4 = z2;
            i3 |= fetVar.h(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(iun.f15405a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            boolean zE = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(vneVar))) | fetVar.e(iB) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (zE || objP2 == cl5Var) {
                e05 e05Var = new e05(a4xVar, z4, z3, xczVar, vneVar, iB, pz40Var, null);
                fetVar.o0(e05Var);
                objP2 = e05Var;
            }
            m0x0.t(fetVar, a4xVar, (Function2) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(xczVar, vneVar, a4xVar, z, z2, i2);
        }
    }

    public static final void e(int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-905621441);
        if (fetVar2.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarD, 4.0f, 8.0f, 0.0f, 4.0f, 4), "BEST_HEROES_HEADER_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String strW = rsm0.w(R.string.the_international_hero, 0, fetVar2);
            mm40 mm40VarI = hne.i(1.0f, true, "BEST_HEROES_HEADER_HEROES");
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(strW, mm40VarI, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            v8q0.a(rsm0.w(R.string.maps, 0, fetVar), o2e.e0(o7k0.s(s5x0.L(jm40Var, 6.0f, 0.0f, 2), 44.0f), "BEST_HEROES_HEADER_MAPS"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            v8q0.a(rsm0.w(R.string.win_rate, 0, fetVar), o2e.e0(o7k0.s(jm40Var, 44.0f), "BEST_HEROES_HEADER_WIN_RATE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gh5(i2, (byte) 8);
        }
    }

    public static final void f(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1150833702);
        int i3 = i2 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new tq(function0, (byte) 29);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarN, false, null, null, (Function0) objP, 15);
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_glyph_play, 6, fetVar2), fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            dww.c(s4u0VarR, null, mm40VarY, staticColors.m123getWhite0d7_KjU(), fetVar2, 56, 0);
            mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.d(), fetVar, (i3 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i2, (byte) 0);
        }
    }

    public static final void g(mm40 mm40Var, vnd vndVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        vndVar.getClass();
        fetVar2.g0(2079438206);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(vndVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            String str = vndVar.f37714a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, vndVar, i2, (byte) 28);
        }
    }

    public static final void h(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var3;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-939827289);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i3 |= fetVar.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(qdzVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            float f2 = xfn.a(fetVar).c;
            mm40 mm40VarE0 = o2e.e0(i120.Q(vtb.U(o7k0.c, ((Boolean) l7m0Var2.getValue()).booleanValue()), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "DISCIPLINE_DETAILS_HEADER_FOCUS_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f2, 28.0f, fetVar);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                tpk tpkVar = new tpk(l7m0Var3, qdzVar, function1, function2, (byte) 2);
                fetVar.o0(tpkVar);
                objP = tpkVar;
            }
            b8k0.e(mm40VarE0, xczVar, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 >> 6) & 112, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(l7m0Var, l7m0Var2, xczVar, qdzVar, function1, function2, i2);
        }
    }

    public static final void i(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-203807048);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 17);
        }
    }

    public static final void j(mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        mdm mdmVar2;
        Function0 function1;
        fet fetVar2;
        fetVar.g0(1306400780);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            mdmVar2 = mdmVar;
            function1 = function0;
            fetVar2 = fetVar;
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar2, false, function1, fetVar2, ((i3 << 3) & 112) | ((i3 << 6) & 7168), 4);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eu60(mdmVar2, function1, i2, (byte) 3);
        }
    }

    public static final void k(final pz40 pz40Var, l7m0 l7m0Var, xcz xczVar, final qdz qdzVar, final boolean z, final boolean z2, Function1 function1, final Function1 function2, fet fetVar, int i2) {
        int i3;
        Function1 function3;
        fet fetVar2;
        int i4;
        l7m0Var.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1630112692);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(pz40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        int i5 = i3 | (fetVar.h(z) ? 16384 : 8192);
        if ((196608 & i2) == 0) {
            i5 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function3 = function1;
            i5 |= fetVar.i(function3) ? 1048576 : 524288;
        } else {
            function3 = function1;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i5 & 1, (i5 & 4793491) != 4793490)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zG = fetVar.g(vneVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ve60(vneVar);
                fetVar.o0(objP2);
            }
            ve60 ve60Var = (ve60) objP2;
            Object[] objArr = new Object[0];
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new urn((byte) 13);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP3, fetVar, 48);
            Object[] objArr2 = new Object[0];
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new urn((byte) 14);
                fetVar.o0(objP4);
            }
            agk0 agk0Var = (agk0) e9x.Q(objArr2, (Function0) objP4, fetVar, 48);
            int i6 = 458752 & i5;
            boolean z3 = i6 == 131072;
            Object objP5 = fetVar.P();
            if (z3 || objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP5);
            }
            final pz40 pz40Var2 = (pz40) objP5;
            bk50 bk50VarA0 = x0x.a0(fetVar);
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = jgk0.b(new zb1(xczVar, agk0Var, z, ve60Var));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var2 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = jgk0.b(new plh(l7m0Var2, (byte) 23));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var3 = (l7m0) objP7;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(n0qVar, ((IndividualColors) fetVar.k(j7x.f16059a)).getSplashBackground(), jd8.n);
            boolean zG2 = fetVar.g(cgk0Var);
            Object objP8 = fetVar.P();
            if (zG2 || objP8 == cl5Var) {
                objP8 = new nw6(cgk0Var, (byte) 16);
                fetVar.o0(objP8);
            }
            mm40 mm40VarD0 = ro4.d0(mm40VarQ, (Function1) objP8);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD0);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean zG3 = fetVar.g(cgk0Var);
            Object objP9 = fetVar.P();
            if (zG3 || objP9 == cl5Var) {
                objP9 = new eyn(cgk0Var, l7m0Var3, l7m0Var2, (byte) 2);
                fetVar.o0(objP9);
            }
            mm40 mm40VarC = o7k0.c(knx.Q(mm40VarD, (xdr) objP9), 1.0f);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.l;
            zcl zclVar2 = qmk.f28987a;
            zq8.a(0, fetVar, jr8.f16991a.b(i120.Q(mm40VarC, background, new ugg0(zclVar, zclVar, zclVar2, zclVar2)), gqw0.h));
            mm40 mm40VarV = cjx.V(vtb.U(n0qVar, ((Boolean) l7m0Var.getValue()).booleanValue()), bk50VarA0, null);
            zcl zclVar3 = z ? zclVar : zclVar2;
            if (!z) {
                zclVar = zclVar2;
            }
            mm40 mm40VarE = h97.e(zclVar3, zclVar, zclVar2, zclVar2, mm40VarV);
            ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 28.0f, 2), fetVar);
            boolean zG4 = fetVar.g(pz40Var2) | (i6 == 131072) | ((i5 & 7168) == 2048) | ((i5 & 14) == 4) | ((57344 & i5) == 16384) | ((29360128 & i5) == 8388608) | ((3670016 & i5) == 1048576);
            Object objP10 = fetVar.P();
            if (zG4 || objP10 == cl5Var) {
                i4 = i5;
                final Function1 function4 = function3;
                Function1 function5 = new Function1() { // from class: a.aco
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        hcz hczVar = (hcz) obj;
                        hczVar.getClass();
                        boolean z4 = z2;
                        pz40 pz40Var3 = pz40Var2;
                        boolean z5 = z4 && ((Boolean) pz40Var3.getValue()).booleanValue();
                        cml cmlVar = new cml(pz40Var3, (byte) 26);
                        a4x a4xVar = (a4x) pz40Var.getValue();
                        hczVar.f(a4xVar.size(), new ctl(new x6o((byte) 7), a4xVar, (byte) 27), new ubn(a4xVar, (byte) 1), new ugd(2039820996, true, new cco(a4xVar, z, z5, cmlVar, function2, qdzVar, function4)));
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(function5);
                objP10 = function5;
            } else {
                i4 = i5;
            }
            fetVar2 = fetVar;
            b8k0.e(mm40VarE, xczVar, ch80VarG, null, null, null, false, ve60Var, (Function1) objP10, fetVar2, (i4 >> 3) & 112, 248);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bco(pz40Var, l7m0Var, xczVar, qdzVar, z, z2, function1, function2, i2);
        }
    }

    public static final void l(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-870361130);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(mm40Var2, 0.0f, 16.0f, 0.0f, 12.0f, 5), 150.0f), 12.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxh(mm40Var2, fqj0Var, i2, (byte) 3);
        }
    }

    public static final void m(fqj0 fqj0Var, boolean z, fet fetVar, int i2) {
        fetVar.g0(-791239715);
        int i3 = (fetVar.g(fqj0Var) ? 4 : 2) | i2;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), z ? 46.0f : 0.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            zq8.a(0, fetVar, xbc.c0(mm40VarE2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), fqj0Var));
            mm40 mm40VarE3 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 46.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            zq8.a(0, fetVar, xbc.c0(mm40VarE3.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), fqj0Var));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gd30(fqj0Var, z, i2, b2);
        }
    }

    public static final void n(mm40 mm40Var, p6w p6wVar, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-590515834);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(p6wVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            if (p6wVar instanceof m6w) {
                fetVar.e0(129186783);
                i(mm40Var, ((m6w) p6wVar).f21291a, function1, fetVar, (i4 & 14) | ((i4 >> 9) & 896));
                fetVar.r(false);
            } else if (p6wVar instanceof n6w) {
                fetVar.e0(-550017642);
                u(mm40Var, (n6w) p6wVar, fetVar, i4 & 126);
                fetVar.r(false);
            } else {
                if (!(p6wVar instanceof o6w)) {
                    throw b1j.f(-550023650, fetVar, false);
                }
                fetVar.e0(129424150);
                fetVar2 = fetVar;
                q(null, z, function1, u1c.M(1548942999, new iwy(p6wVar, mm40Var, qdzVar, e2dVar, function1, (byte) 1), fetVar), fetVar2, ((i4 >> 3) & 112) | 3072 | ((i4 >> 9) & 896));
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mwy(mm40Var, p6wVar, z, qdzVar, e2dVar, function1, i2, (byte) 1);
        }
    }

    public static final void o(mm40 mm40Var, my30 my30Var, m8 m8Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40Var3;
        mm40 mm40VarQ;
        mm40 mm40VarN;
        mm40 mm40Var4;
        fet fetVar2 = fetVar;
        fetVar2.g0(2026487311);
        int i3 = i2 | 6 | (fetVar2.g(my30Var) ? 32 : 16) | (fetVar2.e(m8Var.ordinal()) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zY0 = my30Var.y0();
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (zY0) {
                fetVar2.e0(1023351149);
                zcl zclVar = qmk.f28987a;
                mm40Var4 = jm40Var;
                mm40 mm40VarN2 = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                b3 = (i3 & 7168) != 2048 ? (byte) 0 : (byte) 1;
                Object objP = fetVar2.P();
                if (b3 != 0 || objP == cl5Var) {
                    objP = new y7(function1, b2);
                    fetVar2.o0(objP);
                }
                zvw.i(mm40VarN2, my30Var, (Function1) objP, fetVar2, i3 & 112, 0);
                fetVar2.r(false);
            } else {
                mm40 mm40VarN3 = jm40Var;
                fetVar2.e0(1023638767);
                if (m8Var == m8.c || m8Var == m8.d) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40Var3 = mm40VarN3;
                    mm40VarN3 = s5x0.N(mm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                } else {
                    mm40Var3 = mm40VarN3;
                }
                int iOrdinal = m8Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    fetVar2.e0(1834149757);
                    mm40VarQ = i120.Q(mm40Var3, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    fetVar2.r(false);
                } else if (iOrdinal == 2) {
                    fetVar2.e0(1834155745);
                    long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                    zcl zclVar3 = qmk.f28987a;
                    mm40VarQ = i120.Q(mm40Var3, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, qmk.i));
                    fetVar2.r(false);
                } else {
                    if (iOrdinal != 3) {
                        throw b1j.f(1834146876, fetVar2, false);
                    }
                    fetVar2.e0(1834171809);
                    long backgroundContent2 = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                    zcl zclVar4 = qmk.f28987a;
                    mm40VarQ = i120.Q(mm40Var3, backgroundContent2, new ugg0(zclVar4, zclVar4, qmk.i, zclVar4));
                    fetVar2.r(false);
                }
                mm40 mm40VarE = mm40VarN3.e(mm40VarQ);
                int iOrdinal2 = m8Var.ordinal();
                if (iOrdinal2 == 0) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40Var3, 12.0f, 0.0f, 4.0f, 8.0f, 2);
                } else if (iOrdinal2 == 1) {
                    zcl zclVar6 = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40Var3, 4.0f, 0.0f, 12.0f, 8.0f, 2);
                } else if (iOrdinal2 == 2) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40Var3, 12.0f, 0.0f, 4.0f, 12.0f, 2);
                } else if (iOrdinal2 != 3) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar8 = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40Var3, 4.0f, 0.0f, 12.0f, 12.0f, 2);
                }
                mm40Var4 = mm40Var3;
                mm40 mm40VarE2 = mm40VarE.e(mm40VarN);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE2);
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
                boolean z = (i3 & 7168) == 2048;
                Object objP2 = fetVar2.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new y7(function1, b3);
                    fetVar2.o0(objP2);
                }
                fetVar2 = fetVar2;
                zvw.i(null, my30Var, (Function1) objP2, fetVar2, i3 & 112, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            mm40Var2 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 3, i2, mm40Var2, my30Var, m8Var, function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0393  */
    /* JADX WARN: Code duplicated, block: B:102:0x0448  */
    /* JADX WARN: Code duplicated, block: B:104:0x0462  */
    /* JADX WARN: Code duplicated, block: B:106:0x046e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0483  */
    /* JADX WARN: Code duplicated, block: B:110:0x0485  */
    /* JADX WARN: Code duplicated, block: B:113:0x0491  */
    /* JADX WARN: Code duplicated, block: B:114:0x0493  */
    /* JADX WARN: Code duplicated, block: B:117:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:121:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:125:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:126:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:129:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x050d  */
    /* JADX WARN: Code duplicated, block: B:140:0x050f  */
    /* JADX WARN: Code duplicated, block: B:145:0x051a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0544  */
    /* JADX WARN: Code duplicated, block: B:157:0x0583  */
    /* JADX WARN: Code duplicated, block: B:158:0x0589  */
    /* JADX WARN: Code duplicated, block: B:161:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0219  */
    /* JADX WARN: Code duplicated, block: B:72:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0224  */
    /* JADX WARN: Code duplicated, block: B:79:0x0272  */
    /* JADX WARN: Code duplicated, block: B:80:0x029a  */
    /* JADX WARN: Code duplicated, block: B:82:0x029f  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:88:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0345  */
    /* JADX WARN: Code duplicated, block: B:97:0x0358  */
    /* JADX WARN: Code duplicated, block: B:99:0x038d  */
    public static final void p(mm40 mm40Var, ta90 ta90Var, ctf0 ctf0Var, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, fet fetVar, int i2) {
        mm40 mm40Var2;
        cl5 cl5Var;
        boolean z;
        Object objP;
        fet fetVar2;
        boolean z2;
        jm40 jm40Var;
        shd shdVar;
        n0q n0qVar;
        ljc ljcVar;
        shd shdVar2;
        zx7 zx7Var;
        jm40 jm40Var2;
        pcy pcyVar;
        dkm dkmVar;
        shd shdVar3;
        boolean z3;
        Object objP2;
        pz40 pz40Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object tg4Var;
        pz40 pz40Var2;
        cl5 cl5Var2;
        int i3;
        boolean z11;
        Object objP3;
        boolean z12;
        pcy pcyVar2;
        boolean z13;
        Object objP4;
        jm40 jm40Var3;
        boolean z14;
        fet fetVar3 = fetVar;
        zx7 zx7Var2 = gqw0.e;
        ta90Var.getClass();
        ctf0Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        fetVar3.g0(330820290);
        int i4 = i2 | 6 | (fetVar3.g(ta90Var) ? 32 : 16) | (fetVar3.g(ctf0Var) ? 256 : 128) | (fetVar3.i(function1) ? 2048 : 1024) | (fetVar3.i(function2) ? 16384 : 8192) | (fetVar3.i(function3) ? 131072 : 65536) | (fetVar3.i(function4) ? 1048576 : 524288) | (fetVar3.i(function5) ? 8388608 : 4194304) | (fetVar3.i(function6) ? 67108864 : 33554432);
        if (fetVar3.U(i4 & 1, (i4 & 38347923) != 38347922)) {
            int i5 = ta90Var.c() ? R.string.payments_pay_in : R.string.payments_pay_out;
            boolean zH = fetVar3.h(ta90Var.a()) | fetVar3.d(ta90Var.b()) | fetVar3.e(i5);
            Object objP5 = fetVar3.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (zH || objP5 == cl5Var3) {
                pz40 pz40Var3 = s6t0.f31722a;
                fetVar3 = fetVar;
                objP5 = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(i5, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_payments_refresh, ta90Var.a(), ra50.f30118a, y3d.c(ta90Var.b(), s6t0.b().f33626a.getSecondary())))), s6t0.b().f33626a.getBackgroundContent(), true, null);
                fetVar3.o0(objP5);
            }
            imm immVar = (imm) objP5;
            n0q n0qVar2 = o7k0.c;
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar2);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z15 = fetVar3.S;
            pcy pcyVar3 = e7z.u1;
            if (z15) {
                fetVar3.l(pcyVar3);
            } else {
                fetVar3.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar6);
            jpm0.n(fetVar3);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar7);
            long background = ((ThemeColors) fetVar3.k(zaq0.b)).getBackground();
            ljc ljcVar2 = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar2, background, ljcVar2);
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarQ);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar3);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar3, shdVar6, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar7);
            int i6 = i4 & 7168;
            boolean z16 = i6 == 2048;
            Object objP6 = fetVar3.P();
            if (z16) {
                cl5Var = cl5Var3;
            } else {
                cl5Var = cl5Var3;
                if (objP6 == cl5Var) {
                }
                Function0 function0 = (Function0) objP6;
                if (i6 == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar3.P();
                if (z || objP == cl5Var) {
                    objP = new hs80(function1, (byte) 8);
                    fetVar3.o0(objP);
                }
                fetVar2 = fetVar3;
                hlm.c(null, immVar, null, function0, null, (Function1) objP, null, null, null, null, null, null, fetVar2, 0, 0, 4053);
                z2 = ta90Var instanceof sa90;
                jm40Var = jm40.b;
                if (z2) {
                    fetVar2.e0(1105639802);
                    fetVar2.r(false);
                    ljcVar = ljcVar2;
                    jm40Var2 = jm40Var;
                    ta90Var = ta90Var;
                    shdVar2 = shdVar4;
                    shdVar7 = shdVar7;
                    shdVar3 = shdVar6;
                    shdVar = shdVar5;
                    pcyVar = pcyVar3;
                    fetVar3 = fetVar2;
                    z3 = z2;
                    zx7Var = zx7Var3;
                    n0qVar = n0qVar2;
                    z12 = true;
                    dkmVar = null;
                } else if (ta90Var instanceof qa90) {
                    fetVar2.e0(1105701864);
                    mm40 mm40VarQ2 = i120.Q(n0qVar2, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), ljcVar2);
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar3);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM3, shdVar5);
                    vqd.u(iHashCode3, fetVar2, shdVar6, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar7);
                    mdm mdmVar = ((qa90) ta90Var).e;
                    if (i6 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP4 = fetVar2.P();
                    if (z13 || objP4 == cl5Var) {
                        objP4 = new qu80(function1, (byte) 20);
                        fetVar2.o0(objP4);
                    }
                    n0qVar = n0qVar2;
                    jcb.l(null, mdmVar, false, (Function0) objP4, fetVar2, 0, 5);
                    fetVar3 = fetVar2;
                    fetVar3.r(true);
                    fetVar3.r(false);
                    ljcVar = ljcVar2;
                    shdVar7 = shdVar7;
                    z12 = true;
                    shdVar = shdVar5;
                    zx7Var = zx7Var3;
                    jm40Var2 = jm40Var;
                    pcyVar = pcyVar3;
                    dkmVar = null;
                    ta90Var = ta90Var;
                    shdVar3 = shdVar6;
                    z3 = z2;
                    shdVar2 = shdVar4;
                } else {
                    shdVar = shdVar5;
                    n0qVar = n0qVar2;
                    if (ta90Var instanceof ra90) {
                        fetVar2.e0(1106291980);
                        String strA = ctf0Var.b.a(R.string.data_retrieval_error, Arrays.copyOf(new Object[0], 0));
                        x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar2, 48);
                        int iHashCode4 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM4 = fetVar2.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar2, n0qVar);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            pcyVar2 = pcyVar3;
                            fetVar2.l(pcyVar2);
                        } else {
                            pcyVar2 = pcyVar3;
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA2, shdVar4);
                        jpm0.o(fetVar2, bh90VarM4, shdVar);
                        vqd.u(iHashCode4, fetVar2, shdVar6, fetVar2);
                        jpm0.o(fetVar2, mm40VarC3, shdVar7);
                        qxw.o(fetVar2, o7k0.e(jm40Var, 100.0f));
                        ljcVar = ljcVar2;
                        pcyVar = pcyVar2;
                        dkmVar = null;
                        shdVar3 = shdVar6;
                        z3 = z2;
                        j0x.b(a8k0.F(R.drawable.ic_get_data_error, 0, fetVar2), null, o7k0.n(jm40Var, 160.0f), null, gqw0.B, 0.0f, null, fetVar2, 25016, 104);
                        mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
                        pz40 pz40Var4 = s6t0.f31722a;
                        v8q0.a(strA, mm40VarL, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 261112);
                        fetVar.r(true);
                        fetVar.r(false);
                        fetVar3 = fetVar;
                        z12 = true;
                        zx7Var = zx7Var3;
                        shdVar = shdVar;
                        ta90Var = ta90Var;
                        shdVar7 = shdVar7;
                        shdVar2 = shdVar4;
                        jm40Var2 = jm40Var;
                    } else {
                        ljcVar = ljcVar2;
                        shdVar2 = shdVar4;
                        zx7Var = zx7Var3;
                        jm40Var2 = jm40Var;
                        pcyVar = pcyVar3;
                        dkmVar = null;
                        shdVar3 = shdVar6;
                        z3 = z2;
                        if (ta90Var instanceof pa90) {
                            throw b1j.f(35668620, fetVar2, false);
                        }
                        fetVar2.e0(1107400850);
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = androidx.compose.runtime.e.e(null);
                            fetVar2.o0(objP2);
                        }
                        pz40Var = (pz40) objP2;
                        mm40 mm40VarS = o050.S(n0qVar);
                        if ((i4 & 234881024) == 67108864) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z17 = z4;
                        if ((i4 & 57344) == 16384) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z18 = z17 | z5;
                        if ((i4 & 458752) == 131072) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z19 = z18 | z6;
                        if (i6 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean z20 = z7 | z19;
                        if ((i4 & 3670016) == 1048576) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z21 = z20 | z8;
                        if ((i4 & 29360128) == 8388608) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z21 | z9;
                        Object objP7 = fetVar2.P();
                        if (!z10 || objP7 == cl5Var) {
                            pz40Var2 = pz40Var;
                            cl5Var2 = cl5Var;
                            i3 = 32;
                            tg4Var = new tg4((Object) pz40Var2, (Object) function6, (Object) function2, (Object) function3, (Object) function4, (Object) function5, (Object) function1, (byte) 10);
                            fetVar2.o0(tg4Var);
                        } else {
                            cl5Var2 = cl5Var;
                            tg4Var = objP7;
                            pz40Var2 = pz40Var;
                            i3 = 32;
                        }
                        Function1 function7 = (Function1) tg4Var;
                        if ((i4 & 112) != i3) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        objP3 = fetVar2.P();
                        if (z11 || objP3 == cl5Var2) {
                            objP3 = new ka70(ta90Var, pz40Var2, (byte) 13);
                            fetVar2.o0(objP3);
                        }
                        Function1 function8 = (Function1) objP3;
                        fetVar3 = fetVar2;
                        dwi0.b(function7, mm40VarS, function8, fetVar3, 0, 0);
                        fetVar3.r(false);
                        z12 = true;
                    }
                }
                fetVar3.r(z12);
                if (!z3 || ((ta90Var instanceof pa90) && ((pa90) ta90Var).f)) {
                    fetVar3.e0(-1276295694);
                    mm40 mm40VarQ3 = i120.Q(n0qVar, ((StaticColors) fetVar3.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), ljcVar);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode5 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM5 = fetVar3.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar3, mm40VarQ3);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC3, shdVar2);
                    jpm0.o(fetVar3, bh90VarM5, shdVar);
                    vqd.u(iHashCode5, fetVar3, shdVar3, fetVar3);
                    jpm0.o(fetVar3, mm40VarC4, shdVar7);
                    jm40Var3 = jm40Var2;
                    kpb.j(jr8.f16991a.b(jm40Var3, zx7Var2), dkmVar, fetVar3, 0, 2);
                    z14 = true;
                    fetVar3.r(true);
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(-1276030458);
                    fetVar3.r(false);
                    jm40Var3 = jm40Var2;
                    z14 = true;
                }
                fetVar3.r(z14);
                mm40Var2 = jm40Var3;
            }
            objP6 = new qu80(function1, (byte) 18);
            fetVar3.o0(objP6);
            Function0 function9 = (Function0) objP6;
            if (i6 == 2048) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar3.P();
            if (z) {
                objP = new hs80(function1, (byte) 8);
                fetVar3.o0(objP);
            } else {
                objP = new hs80(function1, (byte) 8);
                fetVar3.o0(objP);
            }
            fetVar2 = fetVar3;
            hlm.c(null, immVar, null, function9, null, (Function1) objP, null, null, null, null, null, null, fetVar2, 0, 0, 4053);
            z2 = ta90Var instanceof sa90;
            jm40Var = jm40.b;
            if (z2) {
                fetVar2.e0(1105639802);
                fetVar2.r(false);
                ljcVar = ljcVar2;
                jm40Var2 = jm40Var;
                ta90Var = ta90Var;
                shdVar2 = shdVar4;
                shdVar7 = shdVar7;
                shdVar3 = shdVar6;
                shdVar = shdVar5;
                pcyVar = pcyVar3;
                fetVar3 = fetVar2;
                z3 = z2;
                zx7Var = zx7Var3;
                n0qVar = n0qVar2;
                z12 = true;
                dkmVar = null;
            } else if (ta90Var instanceof qa90) {
                fetVar2.e0(1105701864);
                mm40 mm40VarQ4 = i120.Q(n0qVar2, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), ljcVar2);
                tj30 tj30VarC4 = zq8.c(zx7Var2, false);
                int iHashCode6 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM6 = fetVar2.m();
                mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarQ4);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC4, shdVar4);
                jpm0.o(fetVar2, bh90VarM6, shdVar5);
                vqd.u(iHashCode6, fetVar2, shdVar6, fetVar2);
                jpm0.o(fetVar2, mm40VarC5, shdVar7);
                mdm mdmVar2 = ((qa90) ta90Var).e;
                if (i6 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP4 = fetVar2.P();
                if (z13) {
                    objP4 = new qu80(function1, (byte) 20);
                    fetVar2.o0(objP4);
                } else {
                    objP4 = new qu80(function1, (byte) 20);
                    fetVar2.o0(objP4);
                }
                n0qVar = n0qVar2;
                jcb.l(null, mdmVar2, false, (Function0) objP4, fetVar2, 0, 5);
                fetVar3 = fetVar2;
                fetVar3.r(true);
                fetVar3.r(false);
                ljcVar = ljcVar2;
                shdVar7 = shdVar7;
                z12 = true;
                shdVar = shdVar5;
                zx7Var = zx7Var3;
                jm40Var2 = jm40Var;
                pcyVar = pcyVar3;
                dkmVar = null;
                ta90Var = ta90Var;
                shdVar3 = shdVar6;
                z3 = z2;
                shdVar2 = shdVar4;
            } else {
                shdVar = shdVar5;
                n0qVar = n0qVar2;
                if (ta90Var instanceof ra90) {
                    fetVar2.e0(1106291980);
                    String strA2 = ctf0Var.b.a(R.string.data_retrieval_error, Arrays.copyOf(new Object[0], 0));
                    x5d x5dVarA3 = w5d.a(mw3Var, gqw0.n, fetVar2, 48);
                    int iHashCode7 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM7 = fetVar2.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar2, n0qVar);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        pcyVar2 = pcyVar3;
                        fetVar2.l(pcyVar2);
                    } else {
                        pcyVar2 = pcyVar3;
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA3, shdVar4);
                    jpm0.o(fetVar2, bh90VarM7, shdVar);
                    vqd.u(iHashCode7, fetVar2, shdVar6, fetVar2);
                    jpm0.o(fetVar2, mm40VarC6, shdVar7);
                    qxw.o(fetVar2, o7k0.e(jm40Var, 100.0f));
                    ljcVar = ljcVar2;
                    pcyVar = pcyVar2;
                    dkmVar = null;
                    shdVar3 = shdVar6;
                    z3 = z2;
                    j0x.b(a8k0.F(R.drawable.ic_get_data_error, 0, fetVar2), null, o7k0.n(jm40Var, 160.0f), null, gqw0.B, 0.0f, null, fetVar2, 25016, 104);
                    mm40 mm40VarL2 = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
                    pz40 pz40Var5 = s6t0.f31722a;
                    v8q0.a(strA2, mm40VarL2, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 261112);
                    fetVar.r(true);
                    fetVar.r(false);
                    fetVar3 = fetVar;
                    z12 = true;
                    zx7Var = zx7Var3;
                    shdVar = shdVar;
                    ta90Var = ta90Var;
                    shdVar7 = shdVar7;
                    shdVar2 = shdVar4;
                    jm40Var2 = jm40Var;
                } else {
                    ljcVar = ljcVar2;
                    shdVar2 = shdVar4;
                    zx7Var = zx7Var3;
                    jm40Var2 = jm40Var;
                    pcyVar = pcyVar3;
                    dkmVar = null;
                    shdVar3 = shdVar6;
                    z3 = z2;
                    if (ta90Var instanceof pa90) {
                        throw b1j.f(35668620, fetVar2, false);
                    }
                    fetVar2.e0(1107400850);
                    objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(null);
                        fetVar2.o0(objP2);
                    }
                    pz40Var = (pz40) objP2;
                    mm40 mm40VarS2 = o050.S(n0qVar);
                    if ((i4 & 234881024) == 67108864) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z110 = z4;
                    if ((i4 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z111 = z110 | z5;
                    if ((i4 & 458752) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z112 = z111 | z6;
                    if (i6 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z22 = z7 | z112;
                    if ((i4 & 3670016) == 1048576) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z23 = z22 | z8;
                    if ((i4 & 29360128) == 8388608) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z23 | z9;
                    Object objP8 = fetVar2.P();
                    if (z10) {
                        pz40Var2 = pz40Var;
                        cl5Var2 = cl5Var;
                        i3 = 32;
                        tg4Var = new tg4((Object) pz40Var2, (Object) function6, (Object) function2, (Object) function3, (Object) function4, (Object) function5, (Object) function1, (byte) 10);
                        fetVar2.o0(tg4Var);
                    } else {
                        pz40Var2 = pz40Var;
                        cl5Var2 = cl5Var;
                        i3 = 32;
                        tg4Var = new tg4((Object) pz40Var2, (Object) function6, (Object) function2, (Object) function3, (Object) function4, (Object) function5, (Object) function1, (byte) 10);
                        fetVar2.o0(tg4Var);
                    }
                    Function1 function10 = (Function1) tg4Var;
                    if ((i4 & 112) != i3) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    objP3 = fetVar2.P();
                    if (z11) {
                        objP3 = new ka70(ta90Var, pz40Var2, (byte) 13);
                        fetVar2.o0(objP3);
                    } else {
                        objP3 = new ka70(ta90Var, pz40Var2, (byte) 13);
                        fetVar2.o0(objP3);
                    }
                    Function1 function11 = (Function1) objP3;
                    fetVar3 = fetVar2;
                    dwi0.b(function10, mm40VarS2, function11, fetVar3, 0, 0);
                    fetVar3.r(false);
                    z12 = true;
                }
            }
            fetVar3.r(z12);
            if (z3) {
                fetVar3.e0(-1276295694);
                mm40 mm40VarQ5 = i120.Q(n0qVar, ((StaticColors) fetVar3.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), ljcVar);
                tj30 tj30VarC5 = zq8.c(zx7Var, false);
                int iHashCode8 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM8 = fetVar3.m();
                mm40 mm40VarC7 = kbc.c0(fetVar3, mm40VarQ5);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, tj30VarC5, shdVar2);
                jpm0.o(fetVar3, bh90VarM8, shdVar);
                vqd.u(iHashCode8, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC7, shdVar7);
                jm40Var3 = jm40Var2;
                kpb.j(jr8.f16991a.b(jm40Var3, zx7Var2), dkmVar, fetVar3, 0, 2);
                z14 = true;
                fetVar3.r(true);
                fetVar3.r(false);
            } else {
                fetVar3.e0(-1276295694);
                mm40 mm40VarQ6 = i120.Q(n0qVar, ((StaticColors) fetVar3.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), ljcVar);
                tj30 tj30VarC6 = zq8.c(zx7Var, false);
                int iHashCode9 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM9 = fetVar3.m();
                mm40 mm40VarC8 = kbc.c0(fetVar3, mm40VarQ6);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, tj30VarC6, shdVar2);
                jpm0.o(fetVar3, bh90VarM9, shdVar);
                vqd.u(iHashCode9, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC8, shdVar7);
                jm40Var3 = jm40Var2;
                kpb.j(jr8.f16991a.b(jm40Var3, zx7Var2), dkmVar, fetVar3, 0, 2);
                z14 = true;
                fetVar3.r(true);
                fetVar3.r(false);
            }
            fetVar3.r(z14);
            mm40Var2 = jm40Var3;
        } else {
            ta90Var = ta90Var;
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0a0(mm40Var2, ta90Var, ctf0Var, function1, function2, function3, function4, function5, function6, i2, (byte) 6);
        }
    }

    public static final void q(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(-116879943);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 21);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i3 & 112) | ((i3 << 15) & 234881024), 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i2, (byte) 4);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-2079970826);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            f9m0 f9m0VarC = ((t8e0) l7m0Var.getValue()).c();
            zdm0 zdm0Var = ((t8e0) l7m0Var.getValue()).b().f10860a;
            j9m0 j9m0Var = ((t8e0) l7m0Var.getValue()).b().b;
            boolean zA = ((t8e0) l7m0Var.getValue()).a();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new evd0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dvd0(function1, (byte) 14);
                fetVar.o0(objP2);
            }
            ffb0.D(null, f9m0VarC, zdm0Var, j9m0Var, zA, function0, (Function1) objP2, null, u1c.M(-1022872792, new dqz(l7m0Var, function1, (byte) 10), fetVar), fetVar, 100663296, 129);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, (byte) 3);
        }
    }

    public static final void s(int i2, int i3, fet fetVar, Function0 function0) {
        int i4;
        fetVar.g0(1942139158);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            long jM73getBlack400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            float f2 = 1.0f / i2;
            l7m0 l7m0VarB = d43.b(((Number) function0.invoke()).intValue() * f2, ro4.m0(160, 0, ihn.d, 2), null, null, fetVar, 0, 28);
            boolean zG = fetVar.g(l7m0VarB);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new tft(l7m0VarB, (byte) 21);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, i120.Q(o7k0.d(o7k0.e(knx.Q(jm40.b, (xdr) objP), 40.0f), f2), jM73getBlack400d7_KjU, ugg0Var2));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v49(i2, function0, i3, (byte) 3);
        }
    }

    public static final void t(long j2, fet fetVar, int i2) {
        fetVar.g0(2123154994);
        int i3 = (fetVar.f(j2) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 52.0f), j2, jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), 16.0f), vgg0.f37379a), fqj0VarD0));
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 72.0f), 16.0f);
            zcl zclVar2 = qmk.i;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, s5x0.N(o7k0.e(new x7z(1.0f, true), 16.0f), 16.0f, 0.0f, 8.0f, 0.0f, 10)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3b0(j2, i2, (byte) 5);
        }
    }

    public static final void u(mm40 mm40Var, n6w n6wVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1438116557);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40Var, f2, 12.0f, f3, 32.0f);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarM.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarE2 = mm40Var.e(n0qVar);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwy(mm40Var, n6wVar, i2, b2);
        }
    }

    public static final void v(int i2, fet fetVar) {
        fet fetVar2;
        long backgroundContent;
        fetVar.g0(943341625);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, i2 != 0)) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            pz40 pz40Var = s6t0.f31722a;
            zq8.a(0, fetVar, o7k0.d(i120.Q(mm40VarE, s6t0.b().f33626a.getBackground(), jd8.n), 1.0f));
            fetVar2 = fetVar;
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            fetVar2.e0(-358878213);
            for (int i3 = 0; i3 < 10; i3++) {
                if (i3 % 2 == 0) {
                    fetVar2.e0(-2052608055);
                    backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                } else {
                    fetVar2.e0(-2052606960);
                    backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                }
                fetVar2.r(false);
                t(backgroundContent, fetVar2, 0);
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k8e0(i2, b2);
        }
    }

    public static final void w(mm40 mm40Var, a4x a4xVar, Function0 function0, Function1 function1, fet fetVar, int i2) {
        int i3;
        a4xVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1329066299);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 56.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            int i4 = i3 >> 3;
            s(a4xVar.size(), i4 & 112, fetVar, function0);
            z((i3 & 112) | (i4 & 896), fetVar, a4xVar, null, function1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gwy(mm40Var, a4xVar, function0, function1, i2, (byte) 3);
        }
    }

    public static final void x(mm40 mm40Var, o6w o6wVar, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        byte b2;
        mtl mtlVar = o6wVar.c;
        fetVar.g0(-92473444);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o6wVar) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b("ALT_HISTORY_RESULTS_SCREEN", new ei20((byte) 23), fetVar, (i3 & 896) | 6);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i4 < 0) {
                i4 = 0;
            }
            float fR0 = w6kVar.r0(i4);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            mm40 mm40VarV = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (e2dVar != null) {
                fetVar.e0(-1801624434);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1801533170);
                fetVar.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40Var.e(o7k0.c), 0.0f, 0.0f, 0.0f, fMax, 7), "TAG_RESULTS_SPORTS_ROOT");
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
            mm40 mm40VarE = mm40VarV.e(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z = ((57344 & i3) == 16384) | ((i3 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                b2 = 1;
                objP2 = new twy(o6wVar, function1, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 1;
            }
            b8k0.e(mm40VarE, xczVarB, ch80VarF, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
            if (mtlVar != null) {
                fetVar.e0(-674422392);
                cfx0.b(null, mtlVar, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-674280164);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwy(mm40Var, o6wVar, qdzVar, e2dVar, function1, i2, (byte) 1);
        }
    }

    public static final void y(p8e0 p8e0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-891712559);
        int i3 = (fetVar.i(p8e0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1015078767, new rwc0(function1, p8e0Var, (pz40) objP), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(p8e0Var, function1, i2, (byte) 9);
        }
    }

    public static final void z(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        Function1 function2 = function1;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        nw3 nw3Var = uc9.e;
        yx7 yx7Var = gqw0.k;
        fetVar2.g0(-1126883468);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -850332868, a4xVar);
            int i4 = 0;
            while (true) {
                boolean zHasNext = itO.hasNext();
                jm40 jm40Var = jm40.b;
                if (!zHasNext) {
                    fetVar2.r(false);
                    fetVar2.r(true);
                    mm40Var2 = jm40Var;
                    break;
                }
                Object next = itO.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                pim pimVar = (pim) next;
                ucg0 ucg0Var = new ucg0(4);
                boolean zE = ((i3 & 896) == 256) | fetVar2.e(i4);
                Object objP = fetVar2.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new re1(function2, i4, (byte) 15);
                    fetVar2.o0(objP);
                }
                mm40 mm40VarL = twn.l(yx7Var, dw9.h(1.0f, y860.W(jm40Var, null, null, false, ucg0Var, (Function0) objP, 12), true));
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(mm40VarL, 0.0f, 8.0f, 1);
                thg0 thg0VarA2 = shg0.a(nw3Var, yx7Var, fetVar2, 54);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f);
                zfn zfnVar = m8m0.f21378a;
                int i6 = i3;
                dww.c(a8k0.F(pimVar.f27049a, 0, fetVar2), null, mm40VarN, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 6.0f, 0.0f, 10);
                String str = pimVar.b;
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                kc5.N(str, mm40VarN2, jM123getWhite0d7_KjU, null, null, 0L, idm0.t(10), idm0.t(14), null, null, 0L, null, 2, false, 2, 0, false, null, g1t0.m(), 0.0f, fetVar, 14155776, 1597440, 0, 3063608);
                fetVar2 = fetVar;
                fetVar2.r(true);
                shdVar4 = shdVar4;
                nw3Var = nw3Var;
                i3 = i6;
                i4 = i5;
                shdVar = shdVar;
                pcyVar = pcyVar;
                shdVar2 = shdVar2;
                yx7Var = yx7Var;
                function2 = function1;
            }
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i2, (byte) 15);
        }
    }
}
