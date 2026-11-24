package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.Drawable;
import com.huawei.hms.framework.common.BundleUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tlb {
    public static final void A(hr90 hr90Var, SimpleDate simpleDate, SimpleDate simpleDate2, Locale locale, Object obj, Function1 function1, fet fetVar, int i) {
        fetVar.g0(834058094);
        int i2 = i | (fetVar.i(hr90Var) ? 4 : 2) | (fetVar.i(simpleDate) ? 32 : 16) | (fetVar.i(simpleDate2) ? 256 : 128) | (fetVar.g(locale) ? 2048 : 1024) | (fetVar.i(obj) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.b0(-1629048649, obj);
            boolean z = (458752 & i2) == 131072;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new olh(function1, (byte) 13);
                fetVar.o0(objP);
            }
            up90.a(null, hr90Var, locale, new tcj(simpleDate, simpleDate2, (Function1) objP, 12), null, null, fetVar, ((i2 >> 3) & 896) | ((i2 << 3) & 112) | 4096, 49);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(hr90Var, simpleDate, simpleDate2, locale, obj, function1, i, (byte) 14);
        }
    }

    public static final void B(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(2032889461);
        if (fetVar.U(i & 1, i != 0)) {
            fetVar2 = fetVar;
            nnw0.g(o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3), null, false, bsr0.b, fetVar2, 3078, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 18);
        }
    }

    public static final void C(final mm40 mm40Var, final o0x o0xVar, final o0x o0xVar2, final boolean z, final boolean z2, final long j, fet fetVar, final int i) {
        boolean z3;
        pm80 pm80VarT;
        boolean z4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1689240400);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o0xVar) ? 32 : 16) | (fetVar2.g(o0xVar2) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.h(z2) ? 16384 : 8192) | (fetVar2.f(j) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 16.0f);
            long j2 = z ? j : y3d.g;
            long j3 = z2 ? j : y3d.g;
            if (o0xVar == null) {
                z3 = false;
            } else if (o0xVar instanceof m0x) {
                fetVar2.e0(-28487886);
                dww.c(a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar2), null, mm40VarN, j2, fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                z3 = false;
                if (o0xVar instanceof l0x) {
                    fetVar2.e0(-28219302);
                    Drawable drawable = ((l0x) o0xVar).f19222a;
                    if (drawable == null) {
                        fetVar2.e0(-28219303);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-28219302);
                        dww.c(u7x.v(drawable), null, mm40VarN, j2, fetVar2, 56, 0);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else if (o0xVar instanceof n0x) {
                    fetVar2.e0(-27896685);
                    if (o0xVar2 == null) {
                        fetVar2.e0(-26925363);
                        fetVar2.r(z3);
                        pm80VarT = null;
                    } else if (o0xVar2 instanceof l0x) {
                        fetVar2.e0(-27824548);
                        fetVar2.r(false);
                        Drawable drawable2 = ((l0x) o0xVar2).f19222a;
                        pm80VarT = drawable2 != null ? u7x.v(drawable2) : null;
                        if (z2 && pm80VarT != null) {
                            pm80VarT = ju70.T(pm80VarT, new m78(j3, 5), null, 10);
                        }
                    } else if (o0xVar2 instanceof m0x) {
                        fetVar2.e0(-27353906);
                        pm80 pm80VarF = a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar2);
                        if (z2) {
                            pm80VarT = ju70.T(pm80VarF, new m78(j3, 5), null, 10);
                            z4 = false;
                        } else {
                            pm80VarT = pm80VarF;
                            z4 = false;
                        }
                        fetVar2.r(z4);
                    } else {
                        z3 = false;
                        fetVar2.e0(-26925363);
                        fetVar2.r(z3);
                        pm80VarT = null;
                    }
                    pm80 pm80Var = pm80VarT;
                    k7x.b(((n0x) o0xVar).f22722a, null, mm40VarN, pm80Var, pm80Var, null, null, null, null, null, null, z ? new m78(j, 5) : null, fetVar, 36912, 0, 28640);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(137628473, fetVar2, z3);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(o0xVar, o0xVar2, z, z2, j, i) { // from class: a.g5n
                public final /* synthetic */ o0x b;
                public final /* synthetic */ o0x c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    tlb.C(this.f10727a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void D(mm40 mm40Var, h5n h5nVar, Function0 function0, fet fetVar, int i) {
        int i2;
        k5n k5nVar;
        boolean z;
        fet fetVar2 = fetVar;
        CharSequence charSequence = h5nVar.b;
        fetVar2.g0(-936108716);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(h5nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            k5n k5nVar2 = h5nVar.f12488a;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "TAG_DS_SUBHEADER" + ((Object) charSequence));
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
            o0x o0xVar = h5nVar.c;
            jm40 jm40Var = jm40.b;
            if (o0xVar == null) {
                fetVar2.e0(1031568104);
                fetVar2.r(false);
                k5nVar = k5nVar2;
                z = true;
            } else {
                fetVar2.e0(1031568105);
                zcl zclVar = qmk.f28987a;
                k5nVar = k5nVar2;
                z = true;
                C(o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), "TAG_SUBHEADER_ICON"), o0xVar, h5nVar.d, h5nVar.e, h5nVar.f, ibc.Y(k5nVar2.a(), fetVar2), fetVar2, 0);
                fetVar2.r(false);
            }
            x7z x7zVar = new x7z(1.0f, z);
            String string = charSequence.toString();
            fetVar2.e0(-1490725057);
            long jY = ibc.Y(k5nVar.c(), fetVar2);
            fetVar2.r(false);
            v8q0.a(string, x7zVar, jY, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            if (h5nVar.g == null || function0 == null) {
                fetVar2.e0(1032946954);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1032380925);
                qxw.o(fetVar2, o7k0.s(jm40Var, 16.0f));
                qzb.n(yyw.U(jm40Var, 0.4f), new wul(k5nVar.b(), k5nVar.d(), h5nVar.g, true, false, false), function0, fetVar2, i3 & 896, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) h5nVar, (Object) function0, i, (byte) 24);
        }
    }

    public static final void E(e8n e8nVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        fetVar.g0(-806931332);
        int i2 = (fetVar.g(e8nVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = e8nVar.f7382a;
            lgb.r(str, str != null, cy2.q, fetVar, 384);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            o0x o0xVar = e8nVar.b;
            f6m f6mVar = e8nVar.c;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new knl((byte) 26);
                fetVar.o0(objP);
            }
            int i3 = i2 << 9;
            ahb.a(mm40VarD, o0xVar, f6mVar, null, function0, function1, (Function0) objP, fetVar, (57344 & i3) | 1575942 | (i3 & 458752));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(e8nVar, function0, function1, i);
        }
    }

    public static final qgm0 F(byt0 byt0Var) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        byt0Var.getClass();
        int i = byt0Var.m;
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        String strE = iIntValue > 0 ? ua80.e(iIntValue, "+", Separators.PERCENT) : f140.i(iIntValue, Separators.PERCENT);
        String str = byt0Var.f3436a;
        String upperCase = byt0Var.c.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        ogm0 ogm0Var = new ogm0(str, upperCase, byt0Var.d, "");
        int i2 = byt0Var.j;
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i2 == -1) {
            numValueOf2 = null;
        }
        String str2 = "-";
        if (numValueOf2 == null || (strValueOf = String.valueOf(numValueOf2.intValue())) == null) {
            strValueOf = "-";
        }
        qek0 qek0Var = qek0.c;
        vem0 vem0Var = new vem0(strValueOf, qek0Var);
        int i3 = byt0Var.k;
        Integer numValueOf3 = Integer.valueOf(i3);
        if (i3 == -1) {
            numValueOf3 = null;
        }
        if (numValueOf3 == null || (strValueOf2 = String.valueOf(numValueOf3.intValue())) == null) {
            strValueOf2 = "-";
        }
        vem0 vem0Var2 = new vem0(strValueOf2, qek0Var);
        int i4 = byt0Var.l;
        Integer numValueOf4 = i4 != -1 ? Integer.valueOf(i4) : null;
        if (numValueOf4 != null && (strValueOf3 = String.valueOf(numValueOf4.intValue())) != null) {
            str2 = strValueOf3;
        }
        return new qgm0(ogm0Var, dyb.g0(vem0Var, vem0Var2, new vem0(str2, qek0Var), new uem0(strE, qek0Var)));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static final u4l G(dal dalVar, long j, j6l j6lVar, y9l y9lVar) {
        String str;
        String str2;
        int i;
        int i2;
        List<z4l> list = y9lVar.b;
        if (dalVar.e == j6lVar) {
            str = dalVar.f5753a;
            str2 = dalVar.b;
            i = dalVar.c;
            i2 = dalVar.d;
        } else {
            str = dalVar.f;
            str2 = dalVar.g;
            i = dalVar.h;
            i2 = dalVar.i;
        }
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        xnp0 xnp0Var = new xnp0(str2, str, j6lVar == j6l.f15993a, false);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (z4l z4lVar : list) {
            int i3 = z4lVar.f43775a;
            StringBuilder sb = new StringBuilder(ujn.h);
            String strE = ua80.e(i3, "/sfiles/dota2/128/", ".jpg");
            if (strE.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                sb.setLength(0);
                sb.append(strE);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strE, '/'));
            }
            String string = sb.toString();
            String str3 = z4lVar.d;
            String upperCase = z4lVar.b.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            arrayList.add(new l4l(string, str3, upperCase));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new g7l(twn.m(((z4l) it.next()).c, "LVL\n")));
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        if (i2 > 0) {
            lc00VarB.add(new h00(R.drawable.dota_tormentor_active_ic, "x".concat(ttm0.L(2, String.valueOf(i2)))));
        }
        if (i > 0) {
            lc00VarB.add(new h00(R.drawable.dota_roshan_ic, "x".concat(ttm0.L(2, String.valueOf(i)))));
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List list3 = ((z4l) it2.next()).k;
            boolean zIsEmpty = list3.isEmpty();
            ?? arrayList4 = list3;
            if (zIsEmpty) {
                arrayList4 = 0;
            }
            if (arrayList4 == 0) {
                arrayList4 = new ArrayList(5);
                for (int i4 = 0; i4 < 5; i4++) {
                    arrayList4.add(new z3l(0, 0, i4, "", "", iun.f15405a));
                }
            }
            ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
            for (z3l z3lVar : arrayList4) {
                int i5 = z3lVar.c;
                if (i5 == 0) {
                    i5 = 1;
                } else if (i5 < 0 || i5 >= 11) {
                    i5 = 10;
                }
                int i6 = z3lVar.b;
                if (i6 <= 0) {
                    i6 = 0;
                } else if (i6 > i5) {
                    i6 = i5;
                }
                arrayList5.add(new n4l(z3lVar.f, i5, i6));
            }
            arrayList3.add(arrayList5);
        }
        String str4 = "HERO_SKILLS" + j;
        lc00VarA.getClass();
        return new u4l(str4, j, xnp0Var, arrayList, arrayList2, lc00VarA, arrayList3);
    }

    public static final void H(TreeMap treeMap, Set set) {
        if (set.isEmpty()) {
            return;
        }
        treeMap.put("countryIds", CollectionsKt.b0(CollectionsKt.z0(set), Separators.COMMA, null, null, null, 62));
    }

    public static final void I(AbstractMap abstractMap, int i) {
        abstractMap.put("fcountry", Integer.valueOf(i));
    }

    public static final b6l0 J(ygs ygsVar, ctf0 ctf0Var) {
        long j = ygsVar.f42600a;
        String str = ygsVar.n;
        String str2 = ygsVar.o;
        return new b6l0(j, ffb0.O(ygsVar, ctf0Var), str, t9x.G(ygsVar), t9x.I(ygsVar), str2, c9x.w(ygsVar, ctf0Var));
    }

    public static final i6l0 K(ygs ygsVar, ctf0 ctf0Var) {
        vas vasVar;
        vas vasVar2;
        ygsVar.getClass();
        ctf0Var.getClass();
        ehs ehsVar = ygsVar.i;
        boolean z = false;
        int i = ehsVar != null ? ehsVar.C.f35394a : 0;
        int i2 = ehsVar != null ? ehsVar.C.b : 0;
        String strR = R(ygsVar, dmr.e);
        if (strR.length() == 0 && (ehsVar == null || (vasVar2 = ehsVar.h) == null || (strR = vasVar2.f37106a) == null)) {
            strR = String.valueOf(i);
        }
        String strR2 = R(ygsVar, dmr.f);
        if (strR2.length() == 0 && (ehsVar == null || (vasVar = ehsVar.h) == null || (strR2 = vasVar.b) == null)) {
            strR2 = String.valueOf(i2);
        }
        List listSplit$default = StringsKt__StringsKt.split$default(R(ygsVar, dmr.t), new String[]{Separators.SEMICOLON}, false, 0, 6, null);
        String str = (String) CollectionsKt.firstOrNull(listSplit$default);
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        String str2 = (String) CollectionsKt.f0(listSplit$default);
        Pair pair = (intOrNull == null || str2 == null) ? new Pair(0, "") : new Pair(intOrNull, Separators.SP.concat(ctf0Var.b.a(R.string.cricket_current_over, Arrays.copyOf(new Object[]{str2}, 1))));
        int iIntValue = ((Number) pair.f46059a).intValue();
        String str3 = (String) pair.b;
        if (iIntValue == 1) {
            strR = ohs0.n(strR, str3);
        } else if (iIntValue == 2) {
            strR2 = ohs0.n(strR2, str3);
        }
        strR.getClass();
        strR2.getClass();
        boolean z2 = ehsVar != null && ehsVar.u;
        if (ehsVar != null && ehsVar.v) {
            z = true;
        }
        return new i6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), ygsVar.n, t9x.G(ygsVar), t9x.I(ygsVar), ygsVar.o, c9x.x(ygsVar, ctf0Var), S(ygsVar, strR, z2), S(ygsVar, strR2, z));
    }

    public static final h6l0 L(ygs ygsVar, ctf0 ctf0Var) {
        gad gadVar;
        int i = gql0.f11739a;
        ehs ehsVar = ygsVar.i;
        boolean z = false;
        boolean z2 = (ehsVar != null ? ehsVar.c : 0) > 0;
        boolean z3 = ehsVar != null && ehsVar.c == 1;
        boolean z4 = z2 && z3;
        if (z2 && !z3) {
            z = true;
        }
        if (ygsVar.w) {
            gadVar = gad.c;
        } else if (z4) {
            gadVar = gad.f10960a;
        } else {
            gadVar = z ? gad.b : gad.c;
        }
        gad gadVar2 = gadVar;
        return new h6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), ygsVar.n, t9x.G(ygsVar), t9x.I(ygsVar), ygsVar.o, c9x.x(ygsVar, ctf0Var), x8x.I(ygsVar, gadVar2), x8x.H(ygsVar, ctf0Var, gadVar2), x8x.J(ygsVar, ctf0Var), gadVar2);
    }

    public static final i6l0 M(ygs ygsVar, ctf0 ctf0Var) {
        ygsVar.getClass();
        ctf0Var.getClass();
        ehs ehsVar = ygsVar.i;
        boolean z = false;
        int i = ehsVar != null ? ehsVar.C.f35394a : 0;
        int i2 = ehsVar != null ? ehsVar.C.b : 0;
        boolean z2 = ehsVar != null && ehsVar.u;
        if (ehsVar != null && ehsVar.v) {
            z = true;
        }
        return new i6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), ygsVar.n, t9x.G(ygsVar), t9x.I(ygsVar), ygsVar.o, c9x.x(ygsVar, ctf0Var), S(ygsVar, String.valueOf(i), z2), S(ygsVar, String.valueOf(i2), z));
    }

    public static final j6l0 N(ygs ygsVar, ctf0 ctf0Var) {
        gad gadVar;
        int i = gql0.f11739a;
        ehs ehsVar = ygsVar.i;
        boolean z = false;
        boolean z2 = (ehsVar != null ? ehsVar.c : 0) > 0;
        boolean z3 = ehsVar != null && ehsVar.c == 1;
        boolean z4 = z2 && z3;
        if (z2 && !z3) {
            z = true;
        }
        if (ygsVar.w) {
            gadVar = gad.c;
        } else if (z4) {
            gadVar = gad.f10960a;
        } else {
            gadVar = z ? gad.b : gad.c;
        }
        gad gadVar2 = gadVar;
        return new j6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), hhm0.z(ygsVar), hhm0.C(ygsVar), x8x.I(ygsVar, gadVar2), x8x.H(ygsVar, ctf0Var, gadVar2), x8x.J(ygsVar, ctf0Var), gadVar2, c9x.x(ygsVar, ctf0Var));
    }

    public static final m6l0 O(ygs ygsVar, ctf0 ctf0Var) {
        String strL = ygsVar.p;
        String str = ygsVar.s;
        if (strL.length() == 0) {
            strL = ygsVar.n;
        }
        if (str.length() > 0) {
            strL = kng0.l(StringsKt.e0(strL, Separators.DOT), ". ", str);
        }
        String str2 = strL;
        boolean z = ygsVar.c;
        long j = ygsVar.f42600a;
        if (z) {
            return new g6l0(j, ffb0.O(ygsVar, ctf0Var), str2, c9x.x(ygsVar, ctf0Var));
        }
        return new a6l0(j, ffb0.O(ygsVar, ctf0Var), str2, c9x.w(ygsVar, ctf0Var));
    }

    public static final zjk P(Integer num) {
        if (num != null && num.intValue() == 1) {
            return zjk.f44484a;
        }
        if (num != null && num.intValue() == 2) {
            return zjk.b;
        }
        if (num != null && num.intValue() == 3) {
            return zjk.c;
        }
        if (num != null && num.intValue() == 4) {
            return zjk.d;
        }
        if (num != null && num.intValue() == 5) {
            return zjk.e;
        }
        return (num != null && num.intValue() == 6) ? zjk.f : zjk.g;
    }

    public static final void Q(lc00 lc00Var, String str, String str2, dj90 dj90Var, ej90 ej90Var) {
        if (str2.length() > 0) {
            lc00Var.add(new lje(str, str2, true, dj90Var, ej90Var));
        }
    }

    public static final String R(ygs ygsVar, dmr dmrVar) {
        List list;
        Object objPrevious;
        ehs ehsVar = ygsVar.i;
        String str = null;
        if (ehsVar != null && (list = ehsVar.o) != null) {
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (((cmr) objPrevious).f4620a != dmrVar);
            cmr cmrVar = (cmr) objPrevious;
            if (cmrVar != null) {
                str = cmrVar.b;
            }
        }
        return str == null ? "" : str;
    }

    public static final j83 S(ygs ygsVar, String str, boolean z) {
        long textPrimary;
        ygsVar.getClass();
        str.getClass();
        h83 h83Var = new h83();
        if (ygsVar.w) {
            h83Var.c("");
        } else {
            if (z) {
                pz40 pz40Var = s6t0.f31722a;
                textPrimary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                textPrimary = s6t0.b().f33626a.getTextPrimary();
            }
            int iG = h83Var.g(new smk0(textPrimary, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
            try {
                h83Var.c(str);
            } finally {
                h83Var.d(iG);
            }
        }
        return h83Var.h();
    }

    public static final xrz T(int i) {
        Object next;
        Iterator it = CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(lf7.f, xh7.f), m810.f), q8k.g), h8i0.g), pki0.f), q6i0.c), qmq0.c), tbe0.c), zdy.c).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xrz) next).getId() != i);
        xrz xrzVar = (xrz) next;
        return xrzVar == null ? uvj.f36351a : xrzVar;
    }

    public static final List U(yxk0 yxk0Var) {
        yxk0Var.getClass();
        switch (yxk0Var.ordinal()) {
            case 0:
                return q3d.j(2, 5, 7, 9, 11, 14, 16, 19);
            case 1:
                return q3d.j(3, 6, 12, 15, 18);
            case 2:
                return q3d.j(4, 8, 17);
            case 3:
                return q3d.j(0, 13);
            case 4:
                return kotlin.collections.a.c(10);
            case 5:
                return kotlin.collections.a.c(1);
            case 6:
                return iun.f15405a;
            default:
                t9f.b();
                return null;
        }
    }

    public static final Pair V(ygs ygsVar) {
        String strValueOf;
        tf90 tf90Var;
        String strValueOf2;
        tf90 tf90Var2;
        ehs ehsVar = ygsVar.i;
        List list = ehsVar != null ? ehsVar.e : null;
        if (list == null) {
            list = iun.f15405a;
        }
        df90 df90Var = (df90) CollectionsKt.f0(list);
        String str = "0";
        if (df90Var == null || (tf90Var2 = df90Var.b) == null || (strValueOf = String.valueOf(tf90Var2.b)) == null) {
            strValueOf = "0";
        }
        df90 df90Var2 = (df90) CollectionsKt.f0(list);
        if (df90Var2 != null && (tf90Var = df90Var2.b) != null && (strValueOf2 = String.valueOf(tf90Var.c)) != null) {
            str = strValueOf2;
        }
        return new Pair(strValueOf, str);
    }

    public static final hlk W(int i, int i2, List list) {
        Object next;
        Integer num;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            glk glkVar = (glk) next;
            Integer num2 = glkVar.b;
            if (num2 != null && num2.intValue() == i && (num = glkVar.f11495a) != null && num.intValue() == i2) {
                break;
            }
        }
        glk glkVar2 = (glk) next;
        klk klkVar = glkVar2 != null ? glkVar2.c : null;
        if (klkVar == null) {
            return null;
        }
        Integer num3 = klkVar.b;
        Integer num4 = klkVar.f18493a;
        return new hlk(num4 != null ? num4.intValue() : 0, num3 != null ? num3.intValue() : 0, (num4 != null ? num4.intValue() : 0) + (num3 != null ? num3.intValue() : 0));
    }

    public static final boolean X(n4t0 n4t0Var) {
        return n4t0Var.f.length() > 0 && n4t0Var.c.c.length() > 0 && n4t0Var.d.c.length() > 0;
    }

    public static final boolean Y(n4t0 n4t0Var) {
        n4t0Var.getClass();
        return n4t0Var.f.length() > 0 && n4t0Var.c.c.length() > 0 && n4t0Var.d.c.length() > 0;
    }

    public static final boolean Z(Long l, Long l2) {
        if (l.longValue() == 4 || l.longValue() == 10) {
            return true;
        }
        if (l.longValue() == ixg.d.b || l.longValue() == 6 || l.longValue() == 29 || l.longValue() == 5 || l.longValue() == 32 || l.longValue() == 239 || l.longValue() == 16 || l.longValue() == 30 || l.longValue() == 200) {
            return true;
        }
        return (l.longValue() == 40 && l2.longValue() == 1) || l.longValue() == 282 || l.longValue() == 21 || l.longValue() == 286 || l.longValue() == 315;
    }

    public static final void a(e8n e8nVar, fet fetVar, int i) {
        fetVar.g0(-483522090);
        int i2 = (fetVar.g(e8nVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            a4x a4xVar = e8nVar.g;
            lgb.r(a4xVar, !a4xVar.isEmpty(), cy2.r, fetVar, 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(e8nVar, i, (byte) 7);
        }
    }

    public static final void a0(LinkedHashMap linkedHashMap) {
        linkedHashMap.put("ref", 1);
    }

    public static final void b(int i, y1m y1mVar, fet fetVar, mm40 mm40Var, String str, boolean z) {
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1272175422);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(y1mVar) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            int i3 = i2 >> 3;
            obb.q(null, y1mVar, z, fetVar2, i3 & 1008, 1);
            if (str.length() > 0) {
                fetVar2.e0(469085657);
                mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), 28.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i3 & 14, 24960, 109562);
                fetVar2 = fetVar;
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(469667062);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new otm(mm40Var, str, y1mVar, z, i, (byte) 1);
        }
    }

    public static final hdj b0(SimpleDate simpleDate, SimpleDate simpleDate2, SimpleDate simpleDate3, fet fetVar) {
        simpleDate.getClass();
        simpleDate2.getClass();
        Locale localeS = a8k0.s();
        boolean zG = fetVar.g(localeS);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            objP = Calendar.getInstance(localeS);
            fetVar.o0(objP);
        }
        Calendar calendar = (Calendar) objP;
        boolean zG2 = fetVar.g(localeS);
        Object objP2 = fetVar.P();
        byte b = 1;
        byte b2 = 0;
        if (zG2 || objP2 == obj) {
            calendar.getClass();
            Object v0h0Var = new v0h0(new zcj(calendar, b2), new n72(calendar, b));
            fetVar.o0(v0h0Var);
            objP2 = v0h0Var;
        }
        u0h0 u0h0Var = (u0h0) objP2;
        Object[] objArr = new Object[0];
        boolean zI = fetVar.i(simpleDate3);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            objP3 = new wcj(simpleDate3, b);
            fetVar.o0(objP3);
        }
        pz40 pz40VarO = e9x.O(objArr, u0h0Var, (Function0) objP3, fetVar, 0);
        boolean zG3 = fetVar.g(localeS) | fetVar.g(simpleDate) | fetVar.g(simpleDate2);
        Object objP4 = fetVar.P();
        if (zG3 || objP4 == obj) {
            objP4 = new hdj(localeS, simpleDate, simpleDate2, pz40VarO);
            fetVar.o0(objP4);
        }
        return (hdj) objP4;
    }

    public static final void c(mm40 mm40Var, o3w o3wVar, fet fetVar, int i) {
        o3w o3wVar2;
        byte b;
        fet fetVar2 = fetVar;
        o3wVar.getClass();
        String str = o3wVar.f24605a;
        fetVar2.g0(-1173028289);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o3wVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = fetVar2.g(str + "ROTATE_REMEMBER_ID");
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = xf0.c(0.0f);
                fetVar2.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Object[] objArr = {ohs0.n(str, "TURN_OVER_REMEMBER_ID")};
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new a7d((byte) 6);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar2, 48);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zI = fetVar2.i(t33Var) | fetVar2.g(pz40Var);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new lcd(t33Var, pz40Var, null, b2);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, bool, (Function2) objP3);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zD = fetVar2.d(8.0f) | fetVar2.f(separator60);
            Object objP4 = fetVar2.P();
            if (zD || objP4 == cl5Var) {
                objP4 = new bx((byte) 27, separator60);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarK = s5x0.K(rq8.K(mm40VarD, (Function1) objP4), 8.0f, 6.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            boolean zG2 = fetVar2.g(pz40Var);
            Object objP5 = fetVar2.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new xx(pz40Var, (byte) 23);
                fetVar2.o0(objP5);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, (Function0) objP5, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            b = 0;
            v8q0.a(o3wVar.b, ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.l(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, 0, 0, 131068);
            dww.c(a8k0.F(R.drawable.accordion_drawable_down, 0, fetVar), null, a8k0.I(o7k0.n(jm40Var, 16.0f), ((Number) t33Var.d()).floatValue()), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
            o3wVar2 = o3wVar;
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, u1c.M(1495431821, new jcd(o3wVar2, b), fetVar), fetVar, 1572870, 30);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            o3wVar2 = o3wVar;
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kcd(mm40Var, o3wVar2, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c0(gmq gmqVar, ArrayList arrayList, zje zjeVar) {
        vmq vmqVar;
        if (zjeVar instanceof vmq) {
            vmqVar = (vmq) zjeVar;
            int i = vmqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmqVar.k = i - Integer.MIN_VALUE;
            } else {
                vmqVar = new vmq(zjeVar);
            }
        } else {
            vmqVar = new vmq(zjeVar);
        }
        Object obj = vmqVar.j;
        Object obj2 = wne.f39444a;
        int i2 = vmqVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            kmq l4pVar = new l4p(arrayList, (byte) 20);
            vmqVar.i = arrayList;
            vmqVar.k = 1;
            return gmqVar.c(l4pVar, vmqVar) == obj2 ? obj2 : arrayList;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList2 = vmqVar.i;
        z1x.P(obj);
        return arrayList2;
    }

    public static final void d(mm40 mm40Var, o180 o180Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-227339570);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(o180Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            e(o7k0.d(jm40Var, 1.0f), o180Var.f24468a, o180Var.b, o180Var.e, fetVar, 6);
            e(o7k0.d(jm40Var, 1.0f), o180Var.c, o180Var.d, o180Var.f, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, o180Var, i, (byte) 12);
        }
    }

    public static final String d0(ql5 ql5Var) {
        ql5Var.getClass();
        String lowerCase = ql5Var.g.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return "ic_currency_" + lowerCase + BundleUtil.UNDERLINE_TAG + ql5Var.e;
    }

    public static final void e(mm40 mm40Var, String str, c280 c280Var, String str2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(2145872637);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 4.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new ddf(c280Var, b);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            v8q0.a(str, new x7z(1.0f, true), 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar2, (i2 >> 3) & 14, 24960, 110580);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            v8q0.a(str2, o7k0.s(jm40Var, 144.0f), 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar2, (i2 >> 9) & 14, 24960, 109556);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 15, i, (Object) mm40Var, (Object) str, (Object) c280Var, (Object) str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    public static final yyg e0(tyg tygVar) {
        ?? arrayList;
        Integer num;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        List list = tygVar.b;
        Boolean bool = tygVar.d;
        long jLongValue = 0;
        if (list != null) {
            ArrayList<yzg> arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((yzg) next).d;
                if ((str != null ? str : "").length() > 0) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(r3d.q(arrayList2, 10));
            for (yzg yzgVar : arrayList2) {
                yzgVar.getClass();
                Long l5 = yzgVar.f43512a;
                long jLongValue2 = l5 != null ? l5.longValue() : 0L;
                Integer num2 = yzgVar.b;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                Integer num3 = yzgVar.c;
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                String str2 = yzgVar.d;
                String str3 = str2 == null ? "" : str2;
                String strE = lmc.E(yzgVar.e);
                Long l6 = yzgVar.f;
                long jLongValue3 = l6 != null ? l6.longValue() : 0L;
                Boolean bool2 = yzgVar.g;
                arrayList.add(new vzg(iIntValue, iIntValue2, jLongValue2, jLongValue3, str3, strE, bool2 != null ? bool2.booleanValue() : false));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List listA0 = CollectionsKt.A0(arrayList, new vt5((byte) 21));
        List list2 = tygVar.f34753a;
        e0h e0hVar = list2 != null ? (e0h) CollectionsKt.firstOrNull(list2) : null;
        Boolean bool3 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool, bool3);
        long jLongValue4 = (e0hVar == null || (l4 = e0hVar.f6988a) == null) ? 0L : l4.longValue();
        long jLongValue5 = (e0hVar == null || (l3 = e0hVar.b) == null) ? 0L : l3.longValue();
        long jLongValue6 = (e0hVar == null || (l2 = e0hVar.c) == null) ? 0L : l2.longValue();
        if (e0hVar != null && (l = e0hVar.d) != null) {
            jLongValue = l.longValue();
        }
        b0h b0hVar = new b0h(jLongValue4, jLongValue5, jLongValue6, jLongValue, (e0hVar == null || (num = e0hVar.e) == null) ? 0 : num.intValue(), zD);
        byg bygVar = tygVar.c;
        List list3 = bygVar != null ? bygVar.b : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        list3.getClass();
        vag0 vag0Var = vag0.f37086a;
        vag0Var.getClass();
        return new yyg(listA0, b0hVar, CollectionsKt.A0(list3, vag0Var), Intrinsics.d(bool, bool3));
    }

    public static final void f(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(55320601);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            fetVar.e0(493997970);
            for (int i5 = 0; i5 < 3; i5++) {
                B(0, fetVar);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p9d(mm40Var, i, i2, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    public static final zwh f0(dxh dxhVar) {
        ?? arrayList;
        g4a0 g4a0Var;
        g9a0 g9a0Var;
        c6u0 c6u0Var;
        f6u0 f6u0Var;
        Object next;
        Integer num = dxhVar.f6845a;
        int iIntValue = num != null ? num.intValue() : 0;
        List<qcm0> list = dxhVar.c;
        List list2 = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (qcm0 qcm0Var : list) {
                String str = qcm0Var.f28490a;
                if (str == null) {
                    str = "";
                }
                List<yaa0> list3 = qcm0Var.b;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    for (yaa0 yaa0Var : list3) {
                        List list4 = dxhVar.b;
                        if (list4 != null) {
                            Iterator it = list4.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.d(((g4a0) next).f10656a, yaa0Var.d));
                            g4a0Var = (g4a0) next;
                        } else {
                            g4a0Var = null;
                        }
                        if (g4a0Var != null) {
                            String str2 = g4a0Var.b;
                            String str3 = str2 == null ? "" : str2;
                            lre lreVar = g4a0Var.c;
                            String str4 = lreVar != null ? lreVar.b : null;
                            String str5 = str4 == null ? "" : str4;
                            String str6 = yaa0Var.f42285a;
                            String str7 = str6 == null ? "" : str6;
                            String str8 = yaa0Var.b;
                            String str9 = str8 == null ? "" : str8;
                            String str10 = yaa0Var.c;
                            String str11 = str10 == null ? "" : str10;
                            String str12 = yaa0Var.d;
                            String str13 = str12 == null ? "" : str12;
                            String str14 = yaa0Var.e;
                            String str15 = str14 == null ? "" : str14;
                            List list5 = yaa0Var.f;
                            if (list5 == null || (f6u0Var = (f6u0) CollectionsKt.firstOrNull(list5)) == null) {
                                c6u0Var = new c6u0("", 0);
                            } else {
                                String str16 = f6u0Var.f9031a;
                                if (str16 == null) {
                                    str16 = "";
                                }
                                Integer num2 = f6u0Var.b;
                                c6u0Var = new c6u0(str16, num2 != null ? num2.intValue() : 0);
                            }
                            g9a0Var = new g9a0(str3, str5, str7, str9, str11, str13, str15, c6u0Var);
                        } else {
                            g9a0Var = null;
                        }
                        arrayList.add(g9a0Var);
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList2.add(new lsd0(str, CollectionsKt.S(arrayList)));
            }
            list2 = arrayList2;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new zwh(iIntValue, list2);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:149:0x0200  */
    /* JADX WARN: Code duplicated, block: B:158:0x022b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0239  */
    /* JADX WARN: Code duplicated, block: B:174:0x026a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0279  */
    /* JADX WARN: Code duplicated, block: B:183:0x029a  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:192:0x02da  */
    /* JADX WARN: Code duplicated, block: B:193:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:203:0x02fc A[PHI: r38
  0x02fc: PHI (r38v2 a.pz40) = (r38v0 a.pz40), (r38v3 a.pz40) binds: [B:202:0x02fa, B:200:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x0301  */
    /* JADX WARN: Code duplicated, block: B:207:0x0305  */
    /* JADX WARN: Code duplicated, block: B:213:0x0312  */
    /* JADX WARN: Code duplicated, block: B:216:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x031d  */
    /* JADX WARN: Code duplicated, block: B:220:0x032a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0330  */
    /* JADX WARN: Code duplicated, block: B:226:0x033a A[PHI: r28
  0x033a: PHI (r28v9 java.util.Calendar) = (r28v0 java.util.Calendar), (r28v10 java.util.Calendar) binds: [B:225:0x0338, B:223:0x0333] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:228:0x033f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0343  */
    /* JADX WARN: Code duplicated, block: B:236:0x0350  */
    /* JADX WARN: Code duplicated, block: B:239:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x035b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0368  */
    /* JADX WARN: Code duplicated, block: B:249:0x0375  */
    /* JADX WARN: Code duplicated, block: B:252:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x037f  */
    /* JADX WARN: Code duplicated, block: B:256:0x038c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0399  */
    /* JADX WARN: Code duplicated, block: B:265:0x03a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:269:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:275:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:278:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:282:0x03da  */
    /* JADX WARN: Code duplicated, block: B:283:0x03df  */
    /* JADX WARN: Code duplicated, block: B:286:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:292:0x0415  */
    /* JADX WARN: Code duplicated, block: B:295:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x043f  */
    /* JADX WARN: Code duplicated, block: B:299:0x045b  */
    /* JADX WARN: Code duplicated, block: B:301:0x0461  */
    /* JADX WARN: Code duplicated, block: B:307:0x046f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x0471  */
    /* JADX WARN: Code duplicated, block: B:311:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:317:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x04da  */
    /* JADX WARN: Code duplicated, block: B:321:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:323:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:329:0x0507 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:330:0x0509  */
    /* JADX WARN: Code duplicated, block: B:333:0x0518  */
    /* JADX WARN: Code duplicated, block: B:336:0x0527  */
    /* JADX WARN: Code duplicated, block: B:338:0x052d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0537 A[PHI: r22
  0x0537: PHI (r22v8 java.lang.Object) = (r22v2 java.lang.Object), (r22v9 java.lang.Object) binds: [B:341:0x0535, B:339:0x0530] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:343:0x0539  */
    /* JADX WARN: Code duplicated, block: B:346:0x0546 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:349:0x054c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0567  */
    /* JADX WARN: Code duplicated, block: B:354:0x0581  */
    /* JADX WARN: Code duplicated, block: B:355:0x0584  */
    /* JADX WARN: Code duplicated, block: B:360:0x05bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:363:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:366:0x0614 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:367:0x0616  */
    /* JADX WARN: Code duplicated, block: B:372:0x0697  */
    /* JADX WARN: Code duplicated, block: B:373:0x069d  */
    /* JADX WARN: Code duplicated, block: B:376:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:377:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:380:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:384:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:385:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:388:0x070a  */
    /* JADX WARN: Code duplicated, block: B:389:0x070c  */
    /* JADX WARN: Code duplicated, block: B:392:0x0712  */
    /* JADX WARN: Code duplicated, block: B:394:0x0718  */
    /* JADX WARN: Code duplicated, block: B:400:0x0730 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:403:0x0739  */
    /* JADX WARN: Code duplicated, block: B:406:0x0764  */
    /* JADX WARN: Code duplicated, block: B:407:0x0766  */
    /* JADX WARN: Code duplicated, block: B:410:0x077d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:411:0x077f  */
    /* JADX WARN: Code duplicated, block: B:416:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:417:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:420:0x07d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:423:0x07db  */
    /* JADX WARN: Code duplicated, block: B:426:0x0821  */
    public static final void g(mm40 mm40Var, final SimpleDate simpleDate, final SimpleDate simpleDate2, final Long l, final boolean z, final Calendar calendar, final Locale locale, SimpleDate simpleDate3, Object obj, final Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        Object obj2;
        Object obj3;
        fet fetVar2;
        Object obj4;
        byte b;
        boolean z2;
        Object objP;
        cl5 cl5Var;
        SimpleDate simpleDate4;
        int i4;
        int i5;
        boolean z3;
        boolean zG;
        Object objP2;
        final SimpleDate simpleDate5;
        int i6;
        boolean z4;
        boolean z5;
        Object objP3;
        int i7;
        boolean z6;
        boolean z7;
        Object objP4;
        boolean zG2;
        Object objP5;
        Calendar calendar2;
        Object objP6;
        final pz40 pz40Var;
        boolean zI;
        Object objP7;
        byte b2;
        final cgk0 cgk0Var;
        Object objP8;
        final pz40 pz40Var2;
        boolean zE;
        Object objP9;
        yq40 yq40Var;
        pz40 pz40Var3;
        pz40 pz40Var4;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objP10;
        Calendar calendar3;
        Calendar calendar4;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objP11;
        Calendar calendar5;
        boolean z14;
        Object objP12;
        boolean z15;
        Object objP13;
        boolean z16;
        Object objP14;
        int iM0;
        int iM1;
        int i8;
        int i9;
        boolean zE2;
        Object objP15;
        kwj kwjVarB;
        Object objP16;
        l7m0 l7m0Var;
        boolean zE3;
        Object objP17;
        pz40 pz40Var5;
        boolean z17;
        Object objP18;
        boolean zE4;
        Object objP19;
        boolean z18;
        pz40 pz40Var6;
        boolean zG3;
        Object objP20;
        boolean z19;
        Object objP21;
        Set set;
        Object objP22;
        vne vneVar;
        Object obj5;
        boolean z20;
        boolean zG4;
        ArrayList arrayList;
        Iterator it;
        boolean zContains;
        e6v0 e6v0Var;
        Object obj6;
        boolean zG5;
        Object objP23;
        boolean zI2;
        Object pwcVar;
        final int i10;
        final kwj kwjVar;
        pz40 pz40Var7;
        boolean z21;
        boolean z22;
        int i11;
        boolean z23;
        int i12;
        boolean z24;
        boolean zI3;
        Object objP24;
        boolean z25;
        boolean zE5;
        Object obj7;
        int i13;
        int i14;
        final vne vneVar2;
        boolean z26;
        pz40 pz40Var8;
        boolean z27;
        boolean zE6;
        Object objP25;
        final int i15;
        final pz40 pz40Var9;
        fet fetVar3;
        fet fetVar4;
        Object objP26;
        simpleDate.getClass();
        simpleDate2.getClass();
        calendar.getClass();
        function1.getClass();
        fetVar.g0(-321632855);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(simpleDate) : fetVar.i(simpleDate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(simpleDate2) : fetVar.i(simpleDate2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.i(calendar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= fetVar.g(locale) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= (i & 16777216) == 0 ? fetVar.g(simpleDate3) : fetVar.i(simpleDate3) ? 8388608 : 4194304;
        }
        int i16 = i2 & 256;
        if (i16 != 0) {
            i3 |= 100663296;
            obj2 = obj;
        } else {
            obj2 = obj;
            if ((i & 100663296) == 0) {
                i3 |= fetVar.i(obj2) ? 67108864 : 33554432;
            }
        }
        if ((i & 805306368) == 0) {
            i3 |= fetVar.i(function1) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            fetVar.Z();
            yje yjeVar = null;
            if ((i & 1) == 0 || fetVar.B()) {
                if (i16 != 0) {
                    obj4 = null;
                }
                fetVar.s();
                int i17 = i3 >> 18;
                b = 6;
                z2 = (((i17 & 14) ^ 6) <= 4 && fetVar.g(locale)) || (i17 & 6) == 4;
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (z2 || objP == cl5Var) {
                    Calendar calendar6 = Calendar.getInstance(locale);
                    calendar6.getClass();
                    bsr0.U(calendar6);
                    objP = androidx.compose.runtime.e.e(calendar6);
                    fetVar.o0(objP);
                }
                pz40 pz40Var10 = (pz40) objP;
                simpleDate4 = new SimpleDate(((Calendar) pz40Var10.getValue()).get(1), ((Calendar) pz40Var10.getValue()).get(2) + 1, ((Calendar) pz40Var10.getValue()).get(5));
                i4 = (3670016 & i3) ^ 1572864;
                boolean z28 = (i4 <= 1048576 && fetVar.g(locale)) || (i3 & 1572864) == 1048576;
                i5 = 29360128 & i3;
                if (i5 != 8388608 || ((i3 & 16777216) != 0 && fetVar.g(simpleDate3))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z28 | z3 | fetVar.g(simpleDate4);
                objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    if (simpleDate3 != null) {
                        simpleDate4 = simpleDate3;
                    }
                    fetVar.o0(simpleDate4);
                    objP2 = simpleDate4;
                }
                simpleDate5 = (SimpleDate) objP2;
                boolean zG6 = fetVar.g(calendar);
                i6 = i3 & 112;
                if (i6 != 32 || ((i3 & 64) != 0 && fetVar.g(simpleDate))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zG6 | z4;
                objP3 = fetVar.P();
                if (z5 || objP3 == cl5Var) {
                    wdx.J(simpleDate, calendar);
                    objP3 = androidx.compose.runtime.e.c(calendar.getTimeInMillis());
                    fetVar.o0(objP3);
                }
                final egk0 egk0Var = (egk0) objP3;
                boolean zG7 = fetVar.g(calendar);
                i7 = i3 & 896;
                if (i7 != 256 || ((i3 & 512) != 0 && fetVar.g(simpleDate2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zG7 | z6;
                objP4 = fetVar.P();
                if (z7 || objP4 == cl5Var) {
                    wdx.J(simpleDate2, calendar);
                    objP4 = androidx.compose.runtime.e.c(calendar.getTimeInMillis());
                    fetVar.o0(objP4);
                }
                final egk0 egk0Var2 = (egk0) objP4;
                zG2 = ((i4 <= 1048576 && fetVar.g(locale)) || (i3 & 1572864) == 1048576) | fetVar.g(simpleDate5);
                objP5 = fetVar.P();
                if (zG2 || objP5 == cl5Var) {
                    objP5 = wdx.d0(simpleDate5, locale);
                    fetVar.o0(objP5);
                }
                calendar2 = (Calendar) objP5;
                objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    objP6 = androidx.compose.runtime.e.e(gdj.f11106a);
                    fetVar.o0(objP6);
                }
                pz40Var = (pz40) objP6;
                Object[] objArr = new Object[0];
                zI = fetVar.i(simpleDate5);
                objP7 = fetVar.P();
                if (!zI || objP7 == cl5Var) {
                    b2 = 0;
                    objP7 = new wcj(simpleDate5, b2);
                    fetVar.o0(objP7);
                } else {
                    b2 = 0;
                }
                cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP7, fetVar, b2);
                objP8 = fetVar.P();
                if (objP8 == cl5Var) {
                    objP8 = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP8);
                }
                pz40Var2 = (pz40) objP8;
                zE = fetVar.e(((gdj) pz40Var.getValue()).ordinal());
                objP9 = fetVar.P();
                if (zE || objP9 == cl5Var) {
                    if (pz40Var.getValue() == gdj.f11106a) {
                        yq40Var = yq40.f43059a;
                    } else {
                        yq40Var = yq40.b;
                    }
                    objP9 = androidx.compose.runtime.e.e(yq40Var);
                    fetVar.o0(objP9);
                }
                pz40Var3 = (pz40) objP9;
                if (i4 > 1048576 || !fetVar.g(locale)) {
                    pz40Var4 = pz40Var3;
                    if ((i3 & 1572864) != 1048576) {
                        z8 = false;
                    }
                    if (i6 != 32 || ((i3 & 64) != 0 && fetVar.g(simpleDate))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z8 | z9;
                    objP10 = fetVar.P();
                    if (z10 || objP10 == cl5Var) {
                        objP10 = wdx.d0(simpleDate, locale);
                        fetVar.o0(objP10);
                    }
                    calendar3 = (Calendar) objP10;
                    if (i4 > 1048576 || !fetVar.g(locale)) {
                        calendar4 = calendar3;
                        if ((i3 & 1572864) != 1048576) {
                            z11 = false;
                        }
                        if (i7 != 256 || ((i3 & 512) != 0 && fetVar.g(simpleDate2))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objP11 = fetVar.P();
                        if (z13 || objP11 == cl5Var) {
                            objP11 = wdx.d0(simpleDate2, locale);
                            fetVar.o0(objP11);
                        }
                        calendar5 = (Calendar) objP11;
                        if (i6 != 32 || ((i3 & 64) != 0 && fetVar.g(simpleDate))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objP12 = fetVar.P();
                        if (z14 || objP12 == cl5Var) {
                            objP12 = wdx.j0(calendar4);
                            fetVar.o0(objP12);
                        }
                        w2w0 w2w0Var = (w2w0) objP12;
                        if (i7 != 256 || ((i3 & 512) != 0 && fetVar.g(simpleDate2))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objP13 = fetVar.P();
                        if (z15 || objP13 == cl5Var) {
                            objP13 = wdx.j0(calendar5);
                            fetVar.o0(objP13);
                        }
                        w2w0 w2w0Var2 = (w2w0) objP13;
                        if (i5 != 8388608 || ((i3 & 16777216) != 0 && fetVar.g(simpleDate3))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objP14 = fetVar.P();
                        if (z16 || objP14 == cl5Var) {
                            objP14 = wdx.j0(calendar2);
                            fetVar.o0(objP14);
                        }
                        w2w0 w2w0Var3 = (w2w0) objP14;
                        iM0 = bsr0.m0(w2w0Var);
                        iM1 = bsr0.m0(w2w0Var2);
                        if (z) {
                            i8 = (iM1 - iM0) + 1;
                        } else {
                            i8 = 1;
                        }
                        i9 = i8 - 1;
                        int iD = l1e0.d(bsr0.m0(w2w0Var3) - iM0, 0, i9);
                        zE2 = fetVar.e(i8);
                        objP15 = fetVar.P();
                        if (zE2 || objP15 == cl5Var) {
                            objP15 = new y02(i8, b);
                            fetVar.o0(objP15);
                        }
                        kwjVarB = zk80.b(iD, (Function0) objP15, fetVar, 0, 2);
                        objP16 = fetVar.P();
                        if (objP16 == cl5Var) {
                            objP16 = jgk0.b(new s39(kwjVarB, (byte) 4));
                            fetVar.o0(objP16);
                        }
                        l7m0Var = (l7m0) objP16;
                        zE3 = fetVar.e(((Number) l7m0Var.getValue()).intValue()) | fetVar.e(iM0);
                        objP17 = fetVar.P();
                        if (zE3 || objP17 == cl5Var) {
                            objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                            fetVar.o0(objP17);
                        }
                        pz40Var5 = (pz40) objP17;
                        z17 = (i4 <= 1048576 && fetVar.g(locale)) || (i3 & 1572864) == 1048576;
                        objP18 = fetVar.P();
                        if (z17 || objP18 == cl5Var) {
                            Calendar calendar7 = Calendar.getInstance(locale);
                            calendar7.getClass();
                            bsr0.U(calendar7);
                            objP18 = androidx.compose.runtime.e.c(calendar7.getTimeInMillis());
                            fetVar.o0(objP18);
                        }
                        final egk0 egk0Var3 = (egk0) objP18;
                        zE4 = fetVar.e(((gdj) pz40Var.getValue()).ordinal()) | fetVar.g(obj4);
                        objP19 = fetVar.P();
                        if (!zE4 || objP19 == cl5Var) {
                            z18 = true;
                            objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                            fetVar.o0(objP19);
                        } else {
                            z18 = true;
                        }
                        pz40Var6 = (pz40) objP19;
                        zG3 = fetVar.g((SimpleDate) pz40Var6.getValue()) | fetVar.g(obj4);
                        objP20 = fetVar.P();
                        if (zG3 || objP20 == cl5Var) {
                            nfj nfjVar = nfj.f23439a;
                            objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                            fetVar.o0(objP20);
                        }
                        final pz40 pz40Var11 = (pz40) objP20;
                        z19 = ((i4 > 1048576 || !fetVar.g(locale)) && (i3 & 1572864) != 1048576) ? false : z18;
                        objP21 = fetVar.P();
                        if (z19 || objP21 == cl5Var) {
                            objP21 = bsr0.o0(locale);
                            fetVar.o0(objP21);
                        }
                        set = (Set) objP21;
                        objP22 = fetVar.P();
                        if (objP22 == cl5Var) {
                            objP22 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                            fetVar.o0(objP22);
                        }
                        vneVar = (vne) objP22;
                        if (i4 > 1048576 || !fetVar.g(locale)) {
                            obj5 = obj4;
                            if ((i3 & 1572864) != 1048576) {
                                z20 = false;
                            }
                            zG4 = z20 | fetVar.g(set);
                            Object objP27 = fetVar.P();
                            if (!zG4 || objP27 == cl5Var) {
                                ArrayList arrayListN0 = bsr0.n0(locale);
                                arrayList = new ArrayList(r3d.q(arrayListN0, 10));
                                it = arrayListN0.iterator();
                                while (it.hasNext()) {
                                    b6v0 b6v0Var = (b6v0) it.next();
                                    Iterator it2 = it;
                                    zContains = set.contains(Integer.valueOf(b6v0Var.f2076a));
                                    Set set2 = set;
                                    String str = b6v0Var.b;
                                    if (zContains) {
                                        e6v0Var = e6v0.b;
                                    } else {
                                        e6v0Var = e6v0.f7306a;
                                    }
                                    arrayList.add(new d6v0(str, e6v0Var));
                                    it = it2;
                                    set = set2;
                                }
                                fetVar.o0(arrayList);
                                obj6 = arrayList;
                            } else {
                                obj6 = objP27;
                            }
                            final List list = (List) obj6;
                            Integer numValueOf = Integer.valueOf(kwjVarB.k());
                            Float fValueOf = Float.valueOf(kwjVarB.l());
                            zG5 = fetVar.g(kwjVarB) | fetVar.e(iM0) | fetVar.g(pz40Var5);
                            objP23 = fetVar.P();
                            if (zG5 || objP23 == cl5Var) {
                                objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                                fetVar.o0(objP23);
                            }
                            m0x0.v(numValueOf, fValueOf, (Function2) objP23, fetVar);
                            Object[] objArr2 = {simpleDate5, Integer.valueOf(iM0), Integer.valueOf(i8), locale};
                            zI2 = fetVar.i(simpleDate5) | fetVar.i(calendar) | fetVar.e(iM0) | fetVar.e(i8) | fetVar.g(r28) | fetVar.g(pz40Var5);
                            Object objP28 = fetVar.P();
                            if (!zI2 || objP28 == cl5Var) {
                                int i18 = i8;
                                pwcVar = new pwc(simpleDate5, calendar, iM0, i18, r28, pz40Var5, (yje) null);
                                i10 = iM0;
                                i8 = i18;
                                kwjVar = r28;
                                pz40Var7 = pz40Var5;
                                fetVar.o0(pwcVar);
                            } else {
                                kwjVar = kwjVarB;
                                i10 = iM0;
                                pz40Var7 = pz40Var5;
                                pwcVar = objP28;
                            }
                            m0x0.w(objArr2, (Function2) pwcVar, fetVar);
                            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.e(mm40Var, zk9.f44519a), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "DATE_CALENDAR_COLUMN");
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
                            int i19 = ((w2w0) pz40Var7.getValue()).f38472a;
                            int i20 = ((w2w0) pz40Var7.getValue()).b;
                            yq40 yq40Var2 = (yq40) pz40Var4.getValue();
                            if (kwjVar.k() > 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (kwjVar.k() < i9) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                            i11 = i3 & 57344;
                            if (i11 == 16384) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            boolean zG8 = z23 | fetVar.g(cgk0Var);
                            i12 = i3;
                            if ((i12 & 7168) == 2048) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zI3 = zG8 | z24 | ((i4 <= 1048576 && fetVar.g(locale)) || (i12 & 1572864) == 1048576) | fetVar.i(simpleDate5) | fetVar.g(pz40Var7);
                            objP24 = fetVar.P();
                            if (zI3 || objP24 == cl5Var) {
                                final pz40 pz40Var12 = pz40Var7;
                                Function0 function0 = new Function0() { // from class: a.adj
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i21;
                                        if (!z) {
                                            return Unit.f46060a;
                                        }
                                        pz40 pz40Var13 = pz40Var;
                                        Object value = pz40Var13.getValue();
                                        gdj gdjVar = gdj.f11106a;
                                        if (value == gdjVar) {
                                            Long l2 = l;
                                            if (l2 != null) {
                                                long jLongValue = l2.longValue();
                                                Calendar calendar8 = Calendar.getInstance(locale);
                                                calendar8.getClass();
                                                i21 = bsr0.g0(jLongValue, calendar8).c;
                                            } else {
                                                i21 = simpleDate5.c;
                                            }
                                            cgk0Var.m(i21);
                                            pz40Var2.setValue((w2w0) pz40Var12.getValue());
                                            pz40Var13.setValue(gdj.b);
                                        } else {
                                            pz40Var13.setValue(gdjVar);
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                pz40Var7 = pz40Var12;
                                fetVar.o0(function0);
                                objP24 = function0;
                            }
                            Function0 function2 = (Function0) objP24;
                            boolean zG9 = fetVar.g(kwjVar);
                            if (i11 == 16384) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            zE5 = zG9 | z25 | fetVar.e(i10) | fetVar.g(pz40Var7) | fetVar.i(vneVar);
                            Object objP29 = fetVar.P();
                            if (!zE5 || objP29 == cl5Var) {
                                i13 = i11;
                                final int i21 = i10;
                                final pz40 pz40Var13 = pz40Var7;
                                i14 = 16384;
                                vneVar2 = vneVar;
                                z26 = false;
                                obj7 = new Function0() { // from class: a.bdj
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        kwj kwjVar2 = kwjVar;
                                        if (kwjVar2.k() > 0 && z) {
                                            pz40Var13.setValue(bsr0.d0((kwjVar2.k() - 1) + i21));
                                            qjj.W(vneVar2, null, null, new p1j(kwjVar2, null, (byte) 1), 3);
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                pz40Var8 = pz40Var13;
                                i10 = i21;
                                fetVar.o0(obj7);
                            } else {
                                i13 = i11;
                                obj7 = objP29;
                                pz40Var8 = pz40Var7;
                                i14 = 16384;
                                vneVar2 = vneVar;
                                z26 = false;
                            }
                            Function0 function3 = (Function0) obj7;
                            boolean zG10 = fetVar.g(kwjVar) | fetVar.e(i8);
                            if (i13 == i14) {
                                z27 = true;
                            } else {
                                z27 = z26;
                            }
                            zE6 = zG10 | z27 | fetVar.e(i10) | fetVar.g(pz40Var8) | fetVar.i(vneVar2);
                            objP25 = fetVar.P();
                            if (!zE6 || objP25 == cl5Var) {
                                pz40 pz40Var14 = pz40Var8;
                                i15 = i8;
                                fet fetVar5 = fetVar;
                                pz40Var9 = pz40Var14;
                                final int i22 = i10;
                                final vne vneVar3 = vneVar2;
                                objP25 = new Function0() { // from class: a.cdj
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        kwj kwjVar2 = kwjVar;
                                        if (kwjVar2.k() < i15 - 1 && z) {
                                            pz40Var9.setValue(bsr0.d0(kwjVar2.k() + 1 + i22));
                                            qjj.W(vneVar3, null, null, new p1j(kwjVar2, null, (byte) 2), 3);
                                        }
                                        return Unit.f46060a;
                                    }
                                };
                                i10 = i22;
                                vneVar2 = vneVar3;
                                fetVar5.o0(objP25);
                                fetVar3 = fetVar5;
                            } else {
                                pz40 pz40Var15 = pz40Var8;
                                i15 = i8;
                                fetVar3 = fetVar;
                                pz40Var9 = pz40Var15;
                            }
                            fetVar4 = fetVar3;
                            g1x.f(mm40VarD, i19, i20, locale, yq40Var2, z21, z22, null, null, function2, function3, (Function0) objP25, fetVar4, ((i12 >> 9) & 7168) | 6);
                            Object value = pz40Var.getValue();
                            objP26 = fetVar4.P();
                            if (objP26 == cl5Var) {
                                objP26 = new x2i((byte) 14);
                                fetVar4.o0(objP26);
                            }
                            final int i23 = i15;
                            final vne vneVar4 = vneVar2;
                            final pz40 pz40Var16 = pz40Var9;
                            final Object obj8 = obj5;
                            final kwj kwjVar2 = kwjVar;
                            obj3 = obj8;
                            ugd ugdVarM = u1c.M(-2032900281, new ydr() { // from class: a.ddj
                                @Override // a.ydr
                                public final Object j(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    final SimpleDate simpleDate6;
                                    gdj gdjVar = (gdj) obj10;
                                    fet fetVar6 = (fet) obj11;
                                    int iIntValue = ((Integer) obj12).intValue();
                                    ((b53) obj9).getClass();
                                    gdjVar.getClass();
                                    if ((iIntValue & 48) == 0) {
                                        iIntValue |= fetVar6.e(gdjVar.ordinal()) ? 32 : 16;
                                    }
                                    if (fetVar6.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                                        int iOrdinal = gdjVar.ordinal();
                                        final Locale locale2 = locale;
                                        final kwj kwjVar3 = kwjVar2;
                                        final int i24 = i10;
                                        final Function1 function4 = function1;
                                        if (iOrdinal == 0) {
                                            fetVar6.e0(1201717621);
                                            tlb.z(locale2, calendar, egk0Var3.l(), egk0Var.l(), egk0Var2.l(), l, list, z, kwjVar3, i24, function4, fetVar6, 0);
                                            fetVar6.r(false);
                                        } else {
                                            if (iOrdinal != 1) {
                                                throw b1j.f(592953165, fetVar6, false);
                                            }
                                            fetVar6.e0(1202443858);
                                            fr90 fr90Var = (fr90) pz40Var11.getValue();
                                            final cgk0 cgk0Var2 = cgk0Var;
                                            boolean zG11 = fetVar6.g(cgk0Var2);
                                            final SimpleDate simpleDate7 = simpleDate;
                                            boolean zI4 = zG11 | fetVar6.i(simpleDate7);
                                            SimpleDate simpleDate8 = simpleDate2;
                                            boolean zI5 = zI4 | fetVar6.i(simpleDate8) | fetVar6.g(locale2) | fetVar6.e(i24);
                                            final int i25 = i23;
                                            boolean zE7 = zI5 | fetVar6.e(i25);
                                            final pz40 pz40Var17 = pz40Var16;
                                            boolean zG12 = zE7 | fetVar6.g(pz40Var17) | fetVar6.g(function4);
                                            final vne vneVar5 = vneVar4;
                                            boolean zI6 = zG12 | fetVar6.i(vneVar5) | fetVar6.g(kwjVar3);
                                            Object objP30 = fetVar6.P();
                                            if (zI6 || objP30 == ukd.f35823a) {
                                                final pz40 pz40Var18 = pz40Var2;
                                                simpleDate6 = simpleDate8;
                                                objP30 = new Function1() { // from class: a.edj
                                                    /* JADX WARN: Code duplicated, block: B:11:0x0074  */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj13) {
                                                        w2w0 w2w0Var4 = (w2w0) obj13;
                                                        w2w0Var4.getClass();
                                                        int i26 = w2w0Var4.f38472a;
                                                        pz40 pz40Var19 = pz40Var18;
                                                        if (w2w0Var4.equals((w2w0) pz40Var19.getValue())) {
                                                            return Unit.f46060a;
                                                        }
                                                        pz40Var19.setValue(w2w0Var4);
                                                        int iL = cgk0Var2.l();
                                                        int i27 = w2w0Var4.b;
                                                        Locale locale3 = locale2;
                                                        Calendar calendar8 = Calendar.getInstance(locale3);
                                                        calendar8.clear();
                                                        calendar8.set(1, i26);
                                                        calendar8.set(2, i27);
                                                        calendar8.set(5, 1);
                                                        SimpleDate simpleDate9 = new SimpleDate(i26, i27 + 1, l1e0.d(iL, 1, calendar8.getActualMaximum(5)));
                                                        SimpleDate simpleDate10 = simpleDate7;
                                                        Calendar calendarD0 = wdx.d0(simpleDate10, locale3);
                                                        bsr0.U(calendarD0);
                                                        long timeInMillis = calendarD0.getTimeInMillis();
                                                        SimpleDate simpleDate11 = simpleDate6;
                                                        Calendar calendarD1 = wdx.d0(simpleDate11, locale3);
                                                        bsr0.U(calendarD1);
                                                        long timeInMillis2 = calendarD1.getTimeInMillis();
                                                        if (timeInMillis > timeInMillis2) {
                                                            simpleDate9 = simpleDate10;
                                                        } else {
                                                            Calendar calendarD2 = wdx.d0(simpleDate9, locale3);
                                                            bsr0.U(calendarD2);
                                                            long timeInMillis3 = calendarD2.getTimeInMillis();
                                                            if (timeInMillis3 < timeInMillis) {
                                                                simpleDate9 = simpleDate10;
                                                            } else if (timeInMillis3 > timeInMillis2) {
                                                                simpleDate9 = simpleDate11;
                                                            }
                                                        }
                                                        w2w0 w2w0VarJ0 = wdx.j0(wdx.d0(simpleDate9, locale3));
                                                        int iD2 = l1e0.d(bsr0.m0(w2w0VarJ0) - i24, 0, i25 - 1);
                                                        pz40Var17.setValue(w2w0VarJ0);
                                                        Calendar calendarD3 = wdx.d0(simpleDate9, locale3);
                                                        bsr0.U(calendarD3);
                                                        function4.invoke(Long.valueOf(calendarD3.getTimeInMillis()));
                                                        qjj.W(vneVar5, null, null, new gjg(kwjVar3, iD2, null, (byte) 1), 3);
                                                        return Unit.f46060a;
                                                    }
                                                };
                                                fetVar6.o0(objP30);
                                            } else {
                                                simpleDate6 = simpleDate8;
                                            }
                                            tlb.A(fr90Var, simpleDate7, simpleDate6, locale2, obj8, (Function1) objP30, fetVar6, 584);
                                            fetVar6.r(false);
                                        }
                                    } else {
                                        fetVar6.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar);
                            fet fetVar6 = fetVar;
                            ay3.f(value, null, (Function1) objP26, null, null, null, ugdVarM, fetVar6, 1573248, 58);
                            fetVar6.r(true);
                            fetVar2 = fetVar6;
                        } else {
                            obj5 = obj4;
                        }
                        z20 = true;
                        zG4 = z20 | fetVar.g(set);
                        Object objP210 = fetVar.P();
                        if (zG4) {
                            ArrayList arrayListN1 = bsr0.n0(locale);
                            arrayList = new ArrayList(r3d.q(arrayListN1, 10));
                            it = arrayListN1.iterator();
                            while (it.hasNext()) {
                                b6v0 b6v0Var2 = (b6v0) it.next();
                                Iterator it3 = it;
                                zContains = set.contains(Integer.valueOf(b6v0Var2.f2076a));
                                Set set3 = set;
                                String str2 = b6v0Var2.b;
                                if (zContains) {
                                    e6v0Var = e6v0.b;
                                } else {
                                    e6v0Var = e6v0.f7306a;
                                }
                                arrayList.add(new d6v0(str2, e6v0Var));
                                it = it3;
                                set = set3;
                            }
                            fetVar.o0(arrayList);
                            obj6 = arrayList;
                        } else {
                            ArrayList arrayListN2 = bsr0.n0(locale);
                            arrayList = new ArrayList(r3d.q(arrayListN2, 10));
                            it = arrayListN2.iterator();
                            while (it.hasNext()) {
                                b6v0 b6v0Var3 = (b6v0) it.next();
                                Iterator it4 = it;
                                zContains = set.contains(Integer.valueOf(b6v0Var3.f2076a));
                                Set set4 = set;
                                String str3 = b6v0Var3.b;
                                if (zContains) {
                                    e6v0Var = e6v0.b;
                                } else {
                                    e6v0Var = e6v0.f7306a;
                                }
                                arrayList.add(new d6v0(str3, e6v0Var));
                                it = it4;
                                set = set4;
                            }
                            fetVar.o0(arrayList);
                            obj6 = arrayList;
                        }
                        final List list2 = (List) obj6;
                        Integer numValueOf2 = Integer.valueOf(kwjVarB.k());
                        Float fValueOf2 = Float.valueOf(kwjVarB.l());
                        zG5 = fetVar.g(kwjVarB) | fetVar.e(iM0) | fetVar.g(pz40Var5);
                        objP23 = fetVar.P();
                        if (zG5) {
                            objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                            fetVar.o0(objP23);
                        } else {
                            objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                            fetVar.o0(objP23);
                        }
                        m0x0.v(numValueOf2, fValueOf2, (Function2) objP23, fetVar);
                        Object[] objArr3 = {simpleDate5, Integer.valueOf(iM0), Integer.valueOf(i8), locale};
                        zI2 = fetVar.i(simpleDate5) | fetVar.i(calendar) | fetVar.e(iM0) | fetVar.e(i8) | fetVar.g(r28) | fetVar.g(pz40Var5);
                        Object objP211 = fetVar.P();
                        if (zI2) {
                            int i110 = i8;
                            pwcVar = new pwc(simpleDate5, calendar, iM0, i110, r28, pz40Var5, (yje) null);
                            i10 = iM0;
                            i8 = i110;
                            kwjVar = r28;
                            pz40Var7 = pz40Var5;
                            fetVar.o0(pwcVar);
                        } else {
                            int i111 = i8;
                            pwcVar = new pwc(simpleDate5, calendar, iM0, i111, r28, pz40Var5, (yje) null);
                            i10 = iM0;
                            i8 = i111;
                            kwjVar = r28;
                            pz40Var7 = pz40Var5;
                            fetVar.o0(pwcVar);
                        }
                        m0x0.w(objArr3, (Function2) pwcVar, fetVar);
                        mm40 mm40VarE1 = o2e.e0(i120.Q(o7k0.e(mm40Var, zk9.f44519a), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "DATE_CALENDAR_COLUMN");
                        x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, x5dVarA2, gqw0.x);
                        jpm0.o(fetVar, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC1, gqw0.v);
                        int i112 = ((w2w0) pz40Var7.getValue()).f38472a;
                        int i24 = ((w2w0) pz40Var7.getValue()).b;
                        yq40 yq40Var3 = (yq40) pz40Var4.getValue();
                        if (kwjVar.k() > 0) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (kwjVar.k() < i9) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                        i11 = i3 & 57344;
                        if (i11 == 16384) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        boolean zG11 = z23 | fetVar.g(cgk0Var);
                        i12 = i3;
                        if ((i12 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zI3 = zG11 | z24 | ((i4 <= 1048576 && fetVar.g(locale)) || (i12 & 1572864) == 1048576) | fetVar.i(simpleDate5) | fetVar.g(pz40Var7);
                        objP24 = fetVar.P();
                        if (zI3) {
                            final pz40 pz40Var17 = pz40Var7;
                            Function0 function4 = new Function0() { // from class: a.adj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i25;
                                    if (!z) {
                                        return Unit.f46060a;
                                    }
                                    pz40 pz40Var18 = pz40Var;
                                    Object value2 = pz40Var18.getValue();
                                    gdj gdjVar = gdj.f11106a;
                                    if (value2 == gdjVar) {
                                        Long l2 = l;
                                        if (l2 != null) {
                                            long jLongValue = l2.longValue();
                                            Calendar calendar8 = Calendar.getInstance(locale);
                                            calendar8.getClass();
                                            i25 = bsr0.g0(jLongValue, calendar8).c;
                                        } else {
                                            i25 = simpleDate5.c;
                                        }
                                        cgk0Var.m(i25);
                                        pz40Var2.setValue((w2w0) pz40Var17.getValue());
                                        pz40Var18.setValue(gdj.b);
                                    } else {
                                        pz40Var18.setValue(gdjVar);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            pz40Var7 = pz40Var17;
                            fetVar.o0(function4);
                            objP24 = function4;
                        } else {
                            final pz40 pz40Var18 = pz40Var7;
                            Function0 function5 = new Function0() { // from class: a.adj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i25;
                                    if (!z) {
                                        return Unit.f46060a;
                                    }
                                    pz40 pz40Var19 = pz40Var;
                                    Object value2 = pz40Var19.getValue();
                                    gdj gdjVar = gdj.f11106a;
                                    if (value2 == gdjVar) {
                                        Long l2 = l;
                                        if (l2 != null) {
                                            long jLongValue = l2.longValue();
                                            Calendar calendar8 = Calendar.getInstance(locale);
                                            calendar8.getClass();
                                            i25 = bsr0.g0(jLongValue, calendar8).c;
                                        } else {
                                            i25 = simpleDate5.c;
                                        }
                                        cgk0Var.m(i25);
                                        pz40Var2.setValue((w2w0) pz40Var18.getValue());
                                        pz40Var19.setValue(gdj.b);
                                    } else {
                                        pz40Var19.setValue(gdjVar);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            pz40Var7 = pz40Var18;
                            fetVar.o0(function5);
                            objP24 = function5;
                        }
                        Function0 function6 = (Function0) objP24;
                        boolean zG12 = fetVar.g(kwjVar);
                        if (i11 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zE5 = zG12 | z25 | fetVar.e(i10) | fetVar.g(pz40Var7) | fetVar.i(vneVar);
                        Object objP212 = fetVar.P();
                        if (zE5) {
                            i13 = i11;
                            final int i25 = i10;
                            final pz40 pz40Var19 = pz40Var7;
                            i14 = 16384;
                            vneVar2 = vneVar;
                            z26 = false;
                            obj7 = new Function0() { // from class: a.bdj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    kwj kwjVar3 = kwjVar;
                                    if (kwjVar3.k() > 0 && z) {
                                        pz40Var19.setValue(bsr0.d0((kwjVar3.k() - 1) + i25));
                                        qjj.W(vneVar2, null, null, new p1j(kwjVar3, null, (byte) 1), 3);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            pz40Var8 = pz40Var19;
                            i10 = i25;
                            fetVar.o0(obj7);
                        } else {
                            i13 = i11;
                            final int i26 = i10;
                            final pz40 pz40Var110 = pz40Var7;
                            i14 = 16384;
                            vneVar2 = vneVar;
                            z26 = false;
                            obj7 = new Function0() { // from class: a.bdj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    kwj kwjVar3 = kwjVar;
                                    if (kwjVar3.k() > 0 && z) {
                                        pz40Var110.setValue(bsr0.d0((kwjVar3.k() - 1) + i26));
                                        qjj.W(vneVar2, null, null, new p1j(kwjVar3, null, (byte) 1), 3);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            pz40Var8 = pz40Var110;
                            i10 = i26;
                            fetVar.o0(obj7);
                        }
                        Function0 function7 = (Function0) obj7;
                        boolean zG13 = fetVar.g(kwjVar) | fetVar.e(i8);
                        if (i13 == i14) {
                            z27 = true;
                        } else {
                            z27 = z26;
                        }
                        zE6 = zG13 | z27 | fetVar.e(i10) | fetVar.g(pz40Var8) | fetVar.i(vneVar2);
                        objP25 = fetVar.P();
                        if (zE6) {
                            pz40 pz40Var111 = pz40Var8;
                            i15 = i8;
                            fet fetVar7 = fetVar;
                            pz40Var9 = pz40Var111;
                            final int i27 = i10;
                            final vne vneVar5 = vneVar2;
                            objP25 = new Function0() { // from class: a.cdj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    kwj kwjVar3 = kwjVar;
                                    if (kwjVar3.k() < i15 - 1 && z) {
                                        pz40Var9.setValue(bsr0.d0(kwjVar3.k() + 1 + i27));
                                        qjj.W(vneVar5, null, null, new p1j(kwjVar3, null, (byte) 2), 3);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            i10 = i27;
                            vneVar2 = vneVar5;
                            fetVar7.o0(objP25);
                            fetVar3 = fetVar7;
                        } else {
                            pz40 pz40Var112 = pz40Var8;
                            i15 = i8;
                            fet fetVar8 = fetVar;
                            pz40Var9 = pz40Var112;
                            final int i28 = i10;
                            final vne vneVar6 = vneVar2;
                            objP25 = new Function0() { // from class: a.cdj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    kwj kwjVar3 = kwjVar;
                                    if (kwjVar3.k() < i15 - 1 && z) {
                                        pz40Var9.setValue(bsr0.d0(kwjVar3.k() + 1 + i28));
                                        qjj.W(vneVar6, null, null, new p1j(kwjVar3, null, (byte) 2), 3);
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            i10 = i28;
                            vneVar2 = vneVar6;
                            fetVar8.o0(objP25);
                            fetVar3 = fetVar8;
                        }
                        fetVar4 = fetVar3;
                        g1x.f(mm40VarD2, i112, i24, locale, yq40Var3, z21, z22, null, null, function6, function7, (Function0) objP25, fetVar4, ((i12 >> 9) & 7168) | 6);
                        Object value2 = pz40Var.getValue();
                        objP26 = fetVar4.P();
                        if (objP26 == cl5Var) {
                            objP26 = new x2i((byte) 14);
                            fetVar4.o0(objP26);
                        }
                        final int i29 = i15;
                        final vne vneVar7 = vneVar2;
                        final pz40 pz40Var113 = pz40Var9;
                        final Object obj9 = obj5;
                        final kwj kwjVar3 = kwjVar;
                        obj3 = obj9;
                        ugd ugdVarM2 = u1c.M(-2032900281, new ydr() { // from class: a.ddj
                            @Override // a.ydr
                            public final Object j(Object obj10, Object obj11, Object obj12, Object obj13) {
                                final SimpleDate simpleDate6;
                                gdj gdjVar = (gdj) obj11;
                                fet fetVar9 = (fet) obj12;
                                int iIntValue = ((Integer) obj13).intValue();
                                ((b53) obj10).getClass();
                                gdjVar.getClass();
                                if ((iIntValue & 48) == 0) {
                                    iIntValue |= fetVar9.e(gdjVar.ordinal()) ? 32 : 16;
                                }
                                if (fetVar9.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                                    int iOrdinal = gdjVar.ordinal();
                                    final Locale locale2 = locale;
                                    final kwj kwjVar4 = kwjVar3;
                                    final int i210 = i10;
                                    final Function1 function8 = function1;
                                    if (iOrdinal == 0) {
                                        fetVar9.e0(1201717621);
                                        tlb.z(locale2, calendar, egk0Var3.l(), egk0Var.l(), egk0Var2.l(), l, list2, z, kwjVar4, i210, function8, fetVar9, 0);
                                        fetVar9.r(false);
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw b1j.f(592953165, fetVar9, false);
                                        }
                                        fetVar9.e0(1202443858);
                                        fr90 fr90Var = (fr90) pz40Var11.getValue();
                                        final cgk0 cgk0Var2 = cgk0Var;
                                        boolean zG14 = fetVar9.g(cgk0Var2);
                                        final SimpleDate simpleDate7 = simpleDate;
                                        boolean zI4 = zG14 | fetVar9.i(simpleDate7);
                                        SimpleDate simpleDate8 = simpleDate2;
                                        boolean zI5 = zI4 | fetVar9.i(simpleDate8) | fetVar9.g(locale2) | fetVar9.e(i210);
                                        final int i211 = i29;
                                        boolean zE7 = zI5 | fetVar9.e(i211);
                                        final pz40 pz40Var114 = pz40Var113;
                                        boolean zG15 = zE7 | fetVar9.g(pz40Var114) | fetVar9.g(function8);
                                        final vne vneVar8 = vneVar7;
                                        boolean zI6 = zG15 | fetVar9.i(vneVar8) | fetVar9.g(kwjVar4);
                                        Object objP30 = fetVar9.P();
                                        if (zI6 || objP30 == ukd.f35823a) {
                                            final pz40 pz40Var115 = pz40Var2;
                                            simpleDate6 = simpleDate8;
                                            objP30 = new Function1() { // from class: a.edj
                                                /* JADX WARN: Code duplicated, block: B:11:0x0074  */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj14) {
                                                    w2w0 w2w0Var4 = (w2w0) obj14;
                                                    w2w0Var4.getClass();
                                                    int i212 = w2w0Var4.f38472a;
                                                    pz40 pz40Var116 = pz40Var115;
                                                    if (w2w0Var4.equals((w2w0) pz40Var116.getValue())) {
                                                        return Unit.f46060a;
                                                    }
                                                    pz40Var116.setValue(w2w0Var4);
                                                    int iL = cgk0Var2.l();
                                                    int i213 = w2w0Var4.b;
                                                    Locale locale3 = locale2;
                                                    Calendar calendar8 = Calendar.getInstance(locale3);
                                                    calendar8.clear();
                                                    calendar8.set(1, i212);
                                                    calendar8.set(2, i213);
                                                    calendar8.set(5, 1);
                                                    SimpleDate simpleDate9 = new SimpleDate(i212, i213 + 1, l1e0.d(iL, 1, calendar8.getActualMaximum(5)));
                                                    SimpleDate simpleDate10 = simpleDate7;
                                                    Calendar calendarD0 = wdx.d0(simpleDate10, locale3);
                                                    bsr0.U(calendarD0);
                                                    long timeInMillis = calendarD0.getTimeInMillis();
                                                    SimpleDate simpleDate11 = simpleDate6;
                                                    Calendar calendarD1 = wdx.d0(simpleDate11, locale3);
                                                    bsr0.U(calendarD1);
                                                    long timeInMillis2 = calendarD1.getTimeInMillis();
                                                    if (timeInMillis > timeInMillis2) {
                                                        simpleDate9 = simpleDate10;
                                                    } else {
                                                        Calendar calendarD2 = wdx.d0(simpleDate9, locale3);
                                                        bsr0.U(calendarD2);
                                                        long timeInMillis3 = calendarD2.getTimeInMillis();
                                                        if (timeInMillis3 < timeInMillis) {
                                                            simpleDate9 = simpleDate10;
                                                        } else if (timeInMillis3 > timeInMillis2) {
                                                            simpleDate9 = simpleDate11;
                                                        }
                                                    }
                                                    w2w0 w2w0VarJ0 = wdx.j0(wdx.d0(simpleDate9, locale3));
                                                    int iD2 = l1e0.d(bsr0.m0(w2w0VarJ0) - i210, 0, i211 - 1);
                                                    pz40Var114.setValue(w2w0VarJ0);
                                                    Calendar calendarD3 = wdx.d0(simpleDate9, locale3);
                                                    bsr0.U(calendarD3);
                                                    function8.invoke(Long.valueOf(calendarD3.getTimeInMillis()));
                                                    qjj.W(vneVar8, null, null, new gjg(kwjVar4, iD2, null, (byte) 1), 3);
                                                    return Unit.f46060a;
                                                }
                                            };
                                            fetVar9.o0(objP30);
                                        } else {
                                            simpleDate6 = simpleDate8;
                                        }
                                        tlb.A(fr90Var, simpleDate7, simpleDate6, locale2, obj9, (Function1) objP30, fetVar9, 584);
                                        fetVar9.r(false);
                                    }
                                } else {
                                    fetVar9.X();
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar);
                        fet fetVar9 = fetVar;
                        ay3.f(value2, null, (Function1) objP26, null, null, null, ugdVarM2, fetVar9, 1573248, 58);
                        fetVar9.r(true);
                        fetVar2 = fetVar9;
                    } else {
                        calendar4 = calendar3;
                    }
                    z11 = true;
                    if (i7 != 256) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    z13 = z11 | z12;
                    objP11 = fetVar.P();
                    if (z13) {
                        objP11 = wdx.d0(simpleDate2, locale);
                        fetVar.o0(objP11);
                    } else {
                        objP11 = wdx.d0(simpleDate2, locale);
                        fetVar.o0(objP11);
                    }
                    calendar5 = (Calendar) objP11;
                    if (i6 != 32) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    objP12 = fetVar.P();
                    if (z14) {
                        objP12 = wdx.j0(calendar4);
                        fetVar.o0(objP12);
                    } else {
                        objP12 = wdx.j0(calendar4);
                        fetVar.o0(objP12);
                    }
                    w2w0 w2w0Var4 = (w2w0) objP12;
                    if (i7 != 256) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    objP13 = fetVar.P();
                    if (z15) {
                        objP13 = wdx.j0(calendar5);
                        fetVar.o0(objP13);
                    } else {
                        objP13 = wdx.j0(calendar5);
                        fetVar.o0(objP13);
                    }
                    w2w0 w2w0Var5 = (w2w0) objP13;
                    if (i5 != 8388608) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objP14 = fetVar.P();
                    if (z16) {
                        objP14 = wdx.j0(calendar2);
                        fetVar.o0(objP14);
                    } else {
                        objP14 = wdx.j0(calendar2);
                        fetVar.o0(objP14);
                    }
                    w2w0 w2w0Var6 = (w2w0) objP14;
                    iM0 = bsr0.m0(w2w0Var4);
                    iM1 = bsr0.m0(w2w0Var5);
                    if (z) {
                        i8 = (iM1 - iM0) + 1;
                    } else {
                        i8 = 1;
                    }
                    i9 = i8 - 1;
                    int iD2 = l1e0.d(bsr0.m0(w2w0Var6) - iM0, 0, i9);
                    zE2 = fetVar.e(i8);
                    objP15 = fetVar.P();
                    if (zE2) {
                        objP15 = new y02(i8, b);
                        fetVar.o0(objP15);
                    } else {
                        objP15 = new y02(i8, b);
                        fetVar.o0(objP15);
                    }
                    kwjVarB = zk80.b(iD2, (Function0) objP15, fetVar, 0, 2);
                    objP16 = fetVar.P();
                    if (objP16 == cl5Var) {
                        objP16 = jgk0.b(new s39(kwjVarB, (byte) 4));
                        fetVar.o0(objP16);
                    }
                    l7m0Var = (l7m0) objP16;
                    zE3 = fetVar.e(((Number) l7m0Var.getValue()).intValue()) | fetVar.e(iM0);
                    objP17 = fetVar.P();
                    if (zE3) {
                        objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                        fetVar.o0(objP17);
                    } else {
                        objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                        fetVar.o0(objP17);
                    }
                    pz40Var5 = (pz40) objP17;
                    if (i4 <= 1048576) {
                    }
                    objP18 = fetVar.P();
                    if (z17) {
                        Calendar calendar8 = Calendar.getInstance(locale);
                        calendar8.getClass();
                        bsr0.U(calendar8);
                        objP18 = androidx.compose.runtime.e.c(calendar8.getTimeInMillis());
                        fetVar.o0(objP18);
                    } else {
                        Calendar calendar9 = Calendar.getInstance(locale);
                        calendar9.getClass();
                        bsr0.U(calendar9);
                        objP18 = androidx.compose.runtime.e.c(calendar9.getTimeInMillis());
                        fetVar.o0(objP18);
                    }
                    final egk0 egk0Var4 = (egk0) objP18;
                    zE4 = fetVar.e(((gdj) pz40Var.getValue()).ordinal()) | fetVar.g(obj4);
                    objP19 = fetVar.P();
                    if (zE4) {
                        z18 = true;
                        objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                        fetVar.o0(objP19);
                    } else {
                        z18 = true;
                        objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                        fetVar.o0(objP19);
                    }
                    pz40Var6 = (pz40) objP19;
                    zG3 = fetVar.g((SimpleDate) pz40Var6.getValue()) | fetVar.g(obj4);
                    objP20 = fetVar.P();
                    if (zG3) {
                        nfj nfjVar2 = nfj.f23439a;
                        objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                        fetVar.o0(objP20);
                    } else {
                        nfj nfjVar3 = nfj.f23439a;
                        objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                        fetVar.o0(objP20);
                    }
                    final pz40 pz40Var114 = (pz40) objP20;
                    if (i4 > 1048576) {
                    }
                    objP21 = fetVar.P();
                    if (z19) {
                        objP21 = bsr0.o0(locale);
                        fetVar.o0(objP21);
                    } else {
                        objP21 = bsr0.o0(locale);
                        fetVar.o0(objP21);
                    }
                    set = (Set) objP21;
                    objP22 = fetVar.P();
                    if (objP22 == cl5Var) {
                        objP22 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(objP22);
                    }
                    vneVar = (vne) objP22;
                    if (i4 > 1048576) {
                        obj5 = obj4;
                        if ((i3 & 1572864) != 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    } else {
                        obj5 = obj4;
                        if ((i3 & 1572864) != 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                    }
                    zG4 = z20 | fetVar.g(set);
                    Object objP213 = fetVar.P();
                    if (zG4) {
                        ArrayList arrayListN3 = bsr0.n0(locale);
                        arrayList = new ArrayList(r3d.q(arrayListN3, 10));
                        it = arrayListN3.iterator();
                        while (it.hasNext()) {
                            b6v0 b6v0Var4 = (b6v0) it.next();
                            Iterator it5 = it;
                            zContains = set.contains(Integer.valueOf(b6v0Var4.f2076a));
                            Set set5 = set;
                            String str4 = b6v0Var4.b;
                            if (zContains) {
                                e6v0Var = e6v0.b;
                            } else {
                                e6v0Var = e6v0.f7306a;
                            }
                            arrayList.add(new d6v0(str4, e6v0Var));
                            it = it5;
                            set = set5;
                        }
                        fetVar.o0(arrayList);
                        obj6 = arrayList;
                    } else {
                        ArrayList arrayListN4 = bsr0.n0(locale);
                        arrayList = new ArrayList(r3d.q(arrayListN4, 10));
                        it = arrayListN4.iterator();
                        while (it.hasNext()) {
                            b6v0 b6v0Var5 = (b6v0) it.next();
                            Iterator it6 = it;
                            zContains = set.contains(Integer.valueOf(b6v0Var5.f2076a));
                            Set set6 = set;
                            String str5 = b6v0Var5.b;
                            if (zContains) {
                                e6v0Var = e6v0.b;
                            } else {
                                e6v0Var = e6v0.f7306a;
                            }
                            arrayList.add(new d6v0(str5, e6v0Var));
                            it = it6;
                            set = set6;
                        }
                        fetVar.o0(arrayList);
                        obj6 = arrayList;
                    }
                    final List list3 = (List) obj6;
                    Integer numValueOf3 = Integer.valueOf(kwjVarB.k());
                    Float fValueOf3 = Float.valueOf(kwjVarB.l());
                    zG5 = fetVar.g(kwjVarB) | fetVar.e(iM0) | fetVar.g(pz40Var5);
                    objP23 = fetVar.P();
                    if (zG5) {
                        objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                        fetVar.o0(objP23);
                    } else {
                        objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                        fetVar.o0(objP23);
                    }
                    m0x0.v(numValueOf3, fValueOf3, (Function2) objP23, fetVar);
                    Object[] objArr4 = {simpleDate5, Integer.valueOf(iM0), Integer.valueOf(i8), locale};
                    zI2 = fetVar.i(simpleDate5) | fetVar.i(calendar) | fetVar.e(iM0) | fetVar.e(i8) | fetVar.g(r28) | fetVar.g(pz40Var5);
                    Object objP214 = fetVar.P();
                    if (zI2) {
                        int i113 = i8;
                        pwcVar = new pwc(simpleDate5, calendar, iM0, i113, r28, pz40Var5, (yje) null);
                        i10 = iM0;
                        i8 = i113;
                        kwjVar = r28;
                        pz40Var7 = pz40Var5;
                        fetVar.o0(pwcVar);
                    } else {
                        int i114 = i8;
                        pwcVar = new pwc(simpleDate5, calendar, iM0, i114, r28, pz40Var5, (yje) null);
                        i10 = iM0;
                        i8 = i114;
                        kwjVar = r28;
                        pz40Var7 = pz40Var5;
                        fetVar.o0(pwcVar);
                    }
                    m0x0.w(objArr4, (Function2) pwcVar, fetVar);
                    mm40 mm40VarE2 = o2e.e0(i120.Q(o7k0.e(mm40Var, zk9.f44519a), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "DATE_CALENDAR_COLUMN");
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC2, gqw0.v);
                    int i115 = ((w2w0) pz40Var7.getValue()).f38472a;
                    int i210 = ((w2w0) pz40Var7.getValue()).b;
                    yq40 yq40Var4 = (yq40) pz40Var4.getValue();
                    if (kwjVar.k() > 0) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (kwjVar.k() < i9) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    mm40 mm40VarD3 = o7k0.d(jm40.b, 1.0f);
                    i11 = i3 & 57344;
                    if (i11 == 16384) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean zG14 = z23 | fetVar.g(cgk0Var);
                    i12 = i3;
                    if ((i12 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zI3 = zG14 | z24 | ((i4 <= 1048576 && fetVar.g(locale)) || (i12 & 1572864) == 1048576) | fetVar.i(simpleDate5) | fetVar.g(pz40Var7);
                    objP24 = fetVar.P();
                    if (zI3) {
                        final pz40 pz40Var115 = pz40Var7;
                        Function0 function8 = new Function0() { // from class: a.adj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i211;
                                if (!z) {
                                    return Unit.f46060a;
                                }
                                pz40 pz40Var116 = pz40Var;
                                Object value3 = pz40Var116.getValue();
                                gdj gdjVar = gdj.f11106a;
                                if (value3 == gdjVar) {
                                    Long l2 = l;
                                    if (l2 != null) {
                                        long jLongValue = l2.longValue();
                                        Calendar calendar10 = Calendar.getInstance(locale);
                                        calendar10.getClass();
                                        i211 = bsr0.g0(jLongValue, calendar10).c;
                                    } else {
                                        i211 = simpleDate5.c;
                                    }
                                    cgk0Var.m(i211);
                                    pz40Var2.setValue((w2w0) pz40Var115.getValue());
                                    pz40Var116.setValue(gdj.b);
                                } else {
                                    pz40Var116.setValue(gdjVar);
                                }
                                return Unit.f46060a;
                            }
                        };
                        pz40Var7 = pz40Var115;
                        fetVar.o0(function8);
                        objP24 = function8;
                    } else {
                        final pz40 pz40Var116 = pz40Var7;
                        Function0 function9 = new Function0() { // from class: a.adj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i211;
                                if (!z) {
                                    return Unit.f46060a;
                                }
                                pz40 pz40Var117 = pz40Var;
                                Object value3 = pz40Var117.getValue();
                                gdj gdjVar = gdj.f11106a;
                                if (value3 == gdjVar) {
                                    Long l2 = l;
                                    if (l2 != null) {
                                        long jLongValue = l2.longValue();
                                        Calendar calendar10 = Calendar.getInstance(locale);
                                        calendar10.getClass();
                                        i211 = bsr0.g0(jLongValue, calendar10).c;
                                    } else {
                                        i211 = simpleDate5.c;
                                    }
                                    cgk0Var.m(i211);
                                    pz40Var2.setValue((w2w0) pz40Var116.getValue());
                                    pz40Var117.setValue(gdj.b);
                                } else {
                                    pz40Var117.setValue(gdjVar);
                                }
                                return Unit.f46060a;
                            }
                        };
                        pz40Var7 = pz40Var116;
                        fetVar.o0(function9);
                        objP24 = function9;
                    }
                    Function0 function10 = (Function0) objP24;
                    boolean zG15 = fetVar.g(kwjVar);
                    if (i11 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zE5 = zG15 | z25 | fetVar.e(i10) | fetVar.g(pz40Var7) | fetVar.i(vneVar);
                    Object objP215 = fetVar.P();
                    if (zE5) {
                        i13 = i11;
                        final int i211 = i10;
                        final pz40 pz40Var117 = pz40Var7;
                        i14 = 16384;
                        vneVar2 = vneVar;
                        z26 = false;
                        obj7 = new Function0() { // from class: a.bdj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                kwj kwjVar4 = kwjVar;
                                if (kwjVar4.k() > 0 && z) {
                                    pz40Var117.setValue(bsr0.d0((kwjVar4.k() - 1) + i211));
                                    qjj.W(vneVar2, null, null, new p1j(kwjVar4, null, (byte) 1), 3);
                                }
                                return Unit.f46060a;
                            }
                        };
                        pz40Var8 = pz40Var117;
                        i10 = i211;
                        fetVar.o0(obj7);
                    } else {
                        i13 = i11;
                        final int i212 = i10;
                        final pz40 pz40Var118 = pz40Var7;
                        i14 = 16384;
                        vneVar2 = vneVar;
                        z26 = false;
                        obj7 = new Function0() { // from class: a.bdj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                kwj kwjVar4 = kwjVar;
                                if (kwjVar4.k() > 0 && z) {
                                    pz40Var118.setValue(bsr0.d0((kwjVar4.k() - 1) + i212));
                                    qjj.W(vneVar2, null, null, new p1j(kwjVar4, null, (byte) 1), 3);
                                }
                                return Unit.f46060a;
                            }
                        };
                        pz40Var8 = pz40Var118;
                        i10 = i212;
                        fetVar.o0(obj7);
                    }
                    Function0 function11 = (Function0) obj7;
                    boolean zG16 = fetVar.g(kwjVar) | fetVar.e(i8);
                    if (i13 == i14) {
                        z27 = true;
                    } else {
                        z27 = z26;
                    }
                    zE6 = zG16 | z27 | fetVar.e(i10) | fetVar.g(pz40Var8) | fetVar.i(vneVar2);
                    objP25 = fetVar.P();
                    if (zE6) {
                        pz40 pz40Var119 = pz40Var8;
                        i15 = i8;
                        fet fetVar10 = fetVar;
                        pz40Var9 = pz40Var119;
                        final int i213 = i10;
                        final vne vneVar8 = vneVar2;
                        objP25 = new Function0() { // from class: a.cdj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                kwj kwjVar4 = kwjVar;
                                if (kwjVar4.k() < i15 - 1 && z) {
                                    pz40Var9.setValue(bsr0.d0(kwjVar4.k() + 1 + i213));
                                    qjj.W(vneVar8, null, null, new p1j(kwjVar4, null, (byte) 2), 3);
                                }
                                return Unit.f46060a;
                            }
                        };
                        i10 = i213;
                        vneVar2 = vneVar8;
                        fetVar10.o0(objP25);
                        fetVar3 = fetVar10;
                    } else {
                        pz40 pz40Var1110 = pz40Var8;
                        i15 = i8;
                        fet fetVar11 = fetVar;
                        pz40Var9 = pz40Var1110;
                        final int i214 = i10;
                        final vne vneVar9 = vneVar2;
                        objP25 = new Function0() { // from class: a.cdj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                kwj kwjVar4 = kwjVar;
                                if (kwjVar4.k() < i15 - 1 && z) {
                                    pz40Var9.setValue(bsr0.d0(kwjVar4.k() + 1 + i214));
                                    qjj.W(vneVar9, null, null, new p1j(kwjVar4, null, (byte) 2), 3);
                                }
                                return Unit.f46060a;
                            }
                        };
                        i10 = i214;
                        vneVar2 = vneVar9;
                        fetVar11.o0(objP25);
                        fetVar3 = fetVar11;
                    }
                    fetVar4 = fetVar3;
                    g1x.f(mm40VarD3, i115, i210, locale, yq40Var4, z21, z22, null, null, function10, function11, (Function0) objP25, fetVar4, ((i12 >> 9) & 7168) | 6);
                    Object value3 = pz40Var.getValue();
                    objP26 = fetVar4.P();
                    if (objP26 == cl5Var) {
                        objP26 = new x2i((byte) 14);
                        fetVar4.o0(objP26);
                    }
                    final int i215 = i15;
                    final vne vneVar10 = vneVar2;
                    final pz40 pz40Var1111 = pz40Var9;
                    final Object obj10 = obj5;
                    final kwj kwjVar4 = kwjVar;
                    obj3 = obj10;
                    ugd ugdVarM3 = u1c.M(-2032900281, new ydr() { // from class: a.ddj
                        @Override // a.ydr
                        public final Object j(Object obj11, Object obj12, Object obj13, Object obj14) {
                            final SimpleDate simpleDate6;
                            gdj gdjVar = (gdj) obj12;
                            fet fetVar12 = (fet) obj13;
                            int iIntValue = ((Integer) obj14).intValue();
                            ((b53) obj11).getClass();
                            gdjVar.getClass();
                            if ((iIntValue & 48) == 0) {
                                iIntValue |= fetVar12.e(gdjVar.ordinal()) ? 32 : 16;
                            }
                            if (fetVar12.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                                int iOrdinal = gdjVar.ordinal();
                                final Locale locale2 = locale;
                                final kwj kwjVar5 = kwjVar4;
                                final int i216 = i10;
                                final Function1 function12 = function1;
                                if (iOrdinal == 0) {
                                    fetVar12.e0(1201717621);
                                    tlb.z(locale2, calendar, egk0Var4.l(), egk0Var.l(), egk0Var2.l(), l, list3, z, kwjVar5, i216, function12, fetVar12, 0);
                                    fetVar12.r(false);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw b1j.f(592953165, fetVar12, false);
                                    }
                                    fetVar12.e0(1202443858);
                                    fr90 fr90Var = (fr90) pz40Var114.getValue();
                                    final cgk0 cgk0Var2 = cgk0Var;
                                    boolean zG17 = fetVar12.g(cgk0Var2);
                                    final SimpleDate simpleDate7 = simpleDate;
                                    boolean zI4 = zG17 | fetVar12.i(simpleDate7);
                                    SimpleDate simpleDate8 = simpleDate2;
                                    boolean zI5 = zI4 | fetVar12.i(simpleDate8) | fetVar12.g(locale2) | fetVar12.e(i216);
                                    final int i217 = i215;
                                    boolean zE7 = zI5 | fetVar12.e(i217);
                                    final pz40 pz40Var1112 = pz40Var1111;
                                    boolean zG18 = zE7 | fetVar12.g(pz40Var1112) | fetVar12.g(function12);
                                    final vne vneVar11 = vneVar10;
                                    boolean zI6 = zG18 | fetVar12.i(vneVar11) | fetVar12.g(kwjVar5);
                                    Object objP30 = fetVar12.P();
                                    if (zI6 || objP30 == ukd.f35823a) {
                                        final pz40 pz40Var1113 = pz40Var2;
                                        simpleDate6 = simpleDate8;
                                        objP30 = new Function1() { // from class: a.edj
                                            /* JADX WARN: Code duplicated, block: B:11:0x0074  */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj15) {
                                                w2w0 w2w0Var7 = (w2w0) obj15;
                                                w2w0Var7.getClass();
                                                int i218 = w2w0Var7.f38472a;
                                                pz40 pz40Var1114 = pz40Var1113;
                                                if (w2w0Var7.equals((w2w0) pz40Var1114.getValue())) {
                                                    return Unit.f46060a;
                                                }
                                                pz40Var1114.setValue(w2w0Var7);
                                                int iL = cgk0Var2.l();
                                                int i219 = w2w0Var7.b;
                                                Locale locale3 = locale2;
                                                Calendar calendar10 = Calendar.getInstance(locale3);
                                                calendar10.clear();
                                                calendar10.set(1, i218);
                                                calendar10.set(2, i219);
                                                calendar10.set(5, 1);
                                                SimpleDate simpleDate9 = new SimpleDate(i218, i219 + 1, l1e0.d(iL, 1, calendar10.getActualMaximum(5)));
                                                SimpleDate simpleDate10 = simpleDate7;
                                                Calendar calendarD0 = wdx.d0(simpleDate10, locale3);
                                                bsr0.U(calendarD0);
                                                long timeInMillis = calendarD0.getTimeInMillis();
                                                SimpleDate simpleDate11 = simpleDate6;
                                                Calendar calendarD1 = wdx.d0(simpleDate11, locale3);
                                                bsr0.U(calendarD1);
                                                long timeInMillis2 = calendarD1.getTimeInMillis();
                                                if (timeInMillis > timeInMillis2) {
                                                    simpleDate9 = simpleDate10;
                                                } else {
                                                    Calendar calendarD2 = wdx.d0(simpleDate9, locale3);
                                                    bsr0.U(calendarD2);
                                                    long timeInMillis3 = calendarD2.getTimeInMillis();
                                                    if (timeInMillis3 < timeInMillis) {
                                                        simpleDate9 = simpleDate10;
                                                    } else if (timeInMillis3 > timeInMillis2) {
                                                        simpleDate9 = simpleDate11;
                                                    }
                                                }
                                                w2w0 w2w0VarJ0 = wdx.j0(wdx.d0(simpleDate9, locale3));
                                                int iD3 = l1e0.d(bsr0.m0(w2w0VarJ0) - i216, 0, i217 - 1);
                                                pz40Var1112.setValue(w2w0VarJ0);
                                                Calendar calendarD3 = wdx.d0(simpleDate9, locale3);
                                                bsr0.U(calendarD3);
                                                function12.invoke(Long.valueOf(calendarD3.getTimeInMillis()));
                                                qjj.W(vneVar11, null, null, new gjg(kwjVar5, iD3, null, (byte) 1), 3);
                                                return Unit.f46060a;
                                            }
                                        };
                                        fetVar12.o0(objP30);
                                    } else {
                                        simpleDate6 = simpleDate8;
                                    }
                                    tlb.A(fr90Var, simpleDate7, simpleDate6, locale2, obj10, (Function1) objP30, fetVar12, 584);
                                    fetVar12.r(false);
                                }
                            } else {
                                fetVar12.X();
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar);
                    fet fetVar12 = fetVar;
                    ay3.f(value3, null, (Function1) objP26, null, null, null, ugdVarM3, fetVar12, 1573248, 58);
                    fetVar12.r(true);
                    fetVar2 = fetVar12;
                } else {
                    pz40Var4 = pz40Var3;
                }
                z8 = true;
                if (i6 != 32) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                z10 = z8 | z9;
                objP10 = fetVar.P();
                if (z10) {
                    objP10 = wdx.d0(simpleDate, locale);
                    fetVar.o0(objP10);
                } else {
                    objP10 = wdx.d0(simpleDate, locale);
                    fetVar.o0(objP10);
                }
                calendar3 = (Calendar) objP10;
                if (i4 > 1048576) {
                    calendar4 = calendar3;
                    if ((i3 & 1572864) != 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    calendar4 = calendar3;
                    if ((i3 & 1572864) != 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (i7 != 256) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                z13 = z11 | z12;
                objP11 = fetVar.P();
                if (z13) {
                    objP11 = wdx.d0(simpleDate2, locale);
                    fetVar.o0(objP11);
                } else {
                    objP11 = wdx.d0(simpleDate2, locale);
                    fetVar.o0(objP11);
                }
                calendar5 = (Calendar) objP11;
                if (i6 != 32) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                objP12 = fetVar.P();
                if (z14) {
                    objP12 = wdx.j0(calendar4);
                    fetVar.o0(objP12);
                } else {
                    objP12 = wdx.j0(calendar4);
                    fetVar.o0(objP12);
                }
                w2w0 w2w0Var7 = (w2w0) objP12;
                if (i7 != 256) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                objP13 = fetVar.P();
                if (z15) {
                    objP13 = wdx.j0(calendar5);
                    fetVar.o0(objP13);
                } else {
                    objP13 = wdx.j0(calendar5);
                    fetVar.o0(objP13);
                }
                w2w0 w2w0Var8 = (w2w0) objP13;
                if (i5 != 8388608) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objP14 = fetVar.P();
                if (z16) {
                    objP14 = wdx.j0(calendar2);
                    fetVar.o0(objP14);
                } else {
                    objP14 = wdx.j0(calendar2);
                    fetVar.o0(objP14);
                }
                w2w0 w2w0Var9 = (w2w0) objP14;
                iM0 = bsr0.m0(w2w0Var7);
                iM1 = bsr0.m0(w2w0Var8);
                if (z) {
                    i8 = (iM1 - iM0) + 1;
                } else {
                    i8 = 1;
                }
                i9 = i8 - 1;
                int iD3 = l1e0.d(bsr0.m0(w2w0Var9) - iM0, 0, i9);
                zE2 = fetVar.e(i8);
                objP15 = fetVar.P();
                if (zE2) {
                    objP15 = new y02(i8, b);
                    fetVar.o0(objP15);
                } else {
                    objP15 = new y02(i8, b);
                    fetVar.o0(objP15);
                }
                kwjVarB = zk80.b(iD3, (Function0) objP15, fetVar, 0, 2);
                objP16 = fetVar.P();
                if (objP16 == cl5Var) {
                    objP16 = jgk0.b(new s39(kwjVarB, (byte) 4));
                    fetVar.o0(objP16);
                }
                l7m0Var = (l7m0) objP16;
                zE3 = fetVar.e(((Number) l7m0Var.getValue()).intValue()) | fetVar.e(iM0);
                objP17 = fetVar.P();
                if (zE3) {
                    objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                    fetVar.o0(objP17);
                } else {
                    objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                    fetVar.o0(objP17);
                }
                pz40Var5 = (pz40) objP17;
                if (i4 <= 1048576) {
                }
                objP18 = fetVar.P();
                if (z17) {
                    Calendar calendar10 = Calendar.getInstance(locale);
                    calendar10.getClass();
                    bsr0.U(calendar10);
                    objP18 = androidx.compose.runtime.e.c(calendar10.getTimeInMillis());
                    fetVar.o0(objP18);
                } else {
                    Calendar calendar11 = Calendar.getInstance(locale);
                    calendar11.getClass();
                    bsr0.U(calendar11);
                    objP18 = androidx.compose.runtime.e.c(calendar11.getTimeInMillis());
                    fetVar.o0(objP18);
                }
                final egk0 egk0Var5 = (egk0) objP18;
                zE4 = fetVar.e(((gdj) pz40Var.getValue()).ordinal()) | fetVar.g(obj4);
                objP19 = fetVar.P();
                if (zE4) {
                    z18 = true;
                    objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                    fetVar.o0(objP19);
                } else {
                    z18 = true;
                    objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                    fetVar.o0(objP19);
                }
                pz40Var6 = (pz40) objP19;
                zG3 = fetVar.g((SimpleDate) pz40Var6.getValue()) | fetVar.g(obj4);
                objP20 = fetVar.P();
                if (zG3) {
                    nfj nfjVar4 = nfj.f23439a;
                    objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                    fetVar.o0(objP20);
                } else {
                    nfj nfjVar5 = nfj.f23439a;
                    objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                    fetVar.o0(objP20);
                }
                final pz40 pz40Var1112 = (pz40) objP20;
                if (i4 > 1048576) {
                }
                objP21 = fetVar.P();
                if (z19) {
                    objP21 = bsr0.o0(locale);
                    fetVar.o0(objP21);
                } else {
                    objP21 = bsr0.o0(locale);
                    fetVar.o0(objP21);
                }
                set = (Set) objP21;
                objP22 = fetVar.P();
                if (objP22 == cl5Var) {
                    objP22 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP22);
                }
                vneVar = (vne) objP22;
                if (i4 > 1048576) {
                    obj5 = obj4;
                    if ((i3 & 1572864) != 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                } else {
                    obj5 = obj4;
                    if ((i3 & 1572864) != 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                }
                zG4 = z20 | fetVar.g(set);
                Object objP216 = fetVar.P();
                if (zG4) {
                    ArrayList arrayListN5 = bsr0.n0(locale);
                    arrayList = new ArrayList(r3d.q(arrayListN5, 10));
                    it = arrayListN5.iterator();
                    while (it.hasNext()) {
                        b6v0 b6v0Var6 = (b6v0) it.next();
                        Iterator it7 = it;
                        zContains = set.contains(Integer.valueOf(b6v0Var6.f2076a));
                        Set set7 = set;
                        String str6 = b6v0Var6.b;
                        if (zContains) {
                            e6v0Var = e6v0.b;
                        } else {
                            e6v0Var = e6v0.f7306a;
                        }
                        arrayList.add(new d6v0(str6, e6v0Var));
                        it = it7;
                        set = set7;
                    }
                    fetVar.o0(arrayList);
                    obj6 = arrayList;
                } else {
                    ArrayList arrayListN6 = bsr0.n0(locale);
                    arrayList = new ArrayList(r3d.q(arrayListN6, 10));
                    it = arrayListN6.iterator();
                    while (it.hasNext()) {
                        b6v0 b6v0Var7 = (b6v0) it.next();
                        Iterator it8 = it;
                        zContains = set.contains(Integer.valueOf(b6v0Var7.f2076a));
                        Set set8 = set;
                        String str7 = b6v0Var7.b;
                        if (zContains) {
                            e6v0Var = e6v0.b;
                        } else {
                            e6v0Var = e6v0.f7306a;
                        }
                        arrayList.add(new d6v0(str7, e6v0Var));
                        it = it8;
                        set = set8;
                    }
                    fetVar.o0(arrayList);
                    obj6 = arrayList;
                }
                final List list4 = (List) obj6;
                Integer numValueOf4 = Integer.valueOf(kwjVarB.k());
                Float fValueOf4 = Float.valueOf(kwjVarB.l());
                zG5 = fetVar.g(kwjVarB) | fetVar.e(iM0) | fetVar.g(pz40Var5);
                objP23 = fetVar.P();
                if (zG5) {
                    objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                    fetVar.o0(objP23);
                } else {
                    objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                    fetVar.o0(objP23);
                }
                m0x0.v(numValueOf4, fValueOf4, (Function2) objP23, fetVar);
                Object[] objArr5 = {simpleDate5, Integer.valueOf(iM0), Integer.valueOf(i8), locale};
                zI2 = fetVar.i(simpleDate5) | fetVar.i(calendar) | fetVar.e(iM0) | fetVar.e(i8) | fetVar.g(r28) | fetVar.g(pz40Var5);
                Object objP217 = fetVar.P();
                if (zI2) {
                    int i116 = i8;
                    pwcVar = new pwc(simpleDate5, calendar, iM0, i116, r28, pz40Var5, (yje) null);
                    i10 = iM0;
                    i8 = i116;
                    kwjVar = r28;
                    pz40Var7 = pz40Var5;
                    fetVar.o0(pwcVar);
                } else {
                    int i117 = i8;
                    pwcVar = new pwc(simpleDate5, calendar, iM0, i117, r28, pz40Var5, (yje) null);
                    i10 = iM0;
                    i8 = i117;
                    kwjVar = r28;
                    pz40Var7 = pz40Var5;
                    fetVar.o0(pwcVar);
                }
                m0x0.w(objArr5, (Function2) pwcVar, fetVar);
                mm40 mm40VarE3 = o2e.e0(i120.Q(o7k0.e(mm40Var, zk9.f44519a), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "DATE_CALENDAR_COLUMN");
                x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE3);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA4, gqw0.x);
                jpm0.o(fetVar, bh90VarM4, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC3, gqw0.v);
                int i118 = ((w2w0) pz40Var7.getValue()).f38472a;
                int i216 = ((w2w0) pz40Var7.getValue()).b;
                yq40 yq40Var5 = (yq40) pz40Var4.getValue();
                if (kwjVar.k() > 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (kwjVar.k() < i9) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                mm40 mm40VarD4 = o7k0.d(jm40.b, 1.0f);
                i11 = i3 & 57344;
                if (i11 == 16384) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean zG17 = z23 | fetVar.g(cgk0Var);
                i12 = i3;
                if ((i12 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zI3 = zG17 | z24 | ((i4 <= 1048576 && fetVar.g(locale)) || (i12 & 1572864) == 1048576) | fetVar.i(simpleDate5) | fetVar.g(pz40Var7);
                objP24 = fetVar.P();
                if (zI3) {
                    final pz40 pz40Var1113 = pz40Var7;
                    Function0 function12 = new Function0() { // from class: a.adj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i217;
                            if (!z) {
                                return Unit.f46060a;
                            }
                            pz40 pz40Var1114 = pz40Var;
                            Object value4 = pz40Var1114.getValue();
                            gdj gdjVar = gdj.f11106a;
                            if (value4 == gdjVar) {
                                Long l2 = l;
                                if (l2 != null) {
                                    long jLongValue = l2.longValue();
                                    Calendar calendar12 = Calendar.getInstance(locale);
                                    calendar12.getClass();
                                    i217 = bsr0.g0(jLongValue, calendar12).c;
                                } else {
                                    i217 = simpleDate5.c;
                                }
                                cgk0Var.m(i217);
                                pz40Var2.setValue((w2w0) pz40Var1113.getValue());
                                pz40Var1114.setValue(gdj.b);
                            } else {
                                pz40Var1114.setValue(gdjVar);
                            }
                            return Unit.f46060a;
                        }
                    };
                    pz40Var7 = pz40Var1113;
                    fetVar.o0(function12);
                    objP24 = function12;
                } else {
                    final pz40 pz40Var1114 = pz40Var7;
                    Function0 function13 = new Function0() { // from class: a.adj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i217;
                            if (!z) {
                                return Unit.f46060a;
                            }
                            pz40 pz40Var1115 = pz40Var;
                            Object value4 = pz40Var1115.getValue();
                            gdj gdjVar = gdj.f11106a;
                            if (value4 == gdjVar) {
                                Long l2 = l;
                                if (l2 != null) {
                                    long jLongValue = l2.longValue();
                                    Calendar calendar12 = Calendar.getInstance(locale);
                                    calendar12.getClass();
                                    i217 = bsr0.g0(jLongValue, calendar12).c;
                                } else {
                                    i217 = simpleDate5.c;
                                }
                                cgk0Var.m(i217);
                                pz40Var2.setValue((w2w0) pz40Var1114.getValue());
                                pz40Var1115.setValue(gdj.b);
                            } else {
                                pz40Var1115.setValue(gdjVar);
                            }
                            return Unit.f46060a;
                        }
                    };
                    pz40Var7 = pz40Var1114;
                    fetVar.o0(function13);
                    objP24 = function13;
                }
                Function0 function14 = (Function0) objP24;
                boolean zG18 = fetVar.g(kwjVar);
                if (i11 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zE5 = zG18 | z25 | fetVar.e(i10) | fetVar.g(pz40Var7) | fetVar.i(vneVar);
                Object objP218 = fetVar.P();
                if (zE5) {
                    i13 = i11;
                    final int i217 = i10;
                    final pz40 pz40Var1115 = pz40Var7;
                    i14 = 16384;
                    vneVar2 = vneVar;
                    z26 = false;
                    obj7 = new Function0() { // from class: a.bdj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            kwj kwjVar5 = kwjVar;
                            if (kwjVar5.k() > 0 && z) {
                                pz40Var1115.setValue(bsr0.d0((kwjVar5.k() - 1) + i217));
                                qjj.W(vneVar2, null, null, new p1j(kwjVar5, null, (byte) 1), 3);
                            }
                            return Unit.f46060a;
                        }
                    };
                    pz40Var8 = pz40Var1115;
                    i10 = i217;
                    fetVar.o0(obj7);
                } else {
                    i13 = i11;
                    final int i218 = i10;
                    final pz40 pz40Var1116 = pz40Var7;
                    i14 = 16384;
                    vneVar2 = vneVar;
                    z26 = false;
                    obj7 = new Function0() { // from class: a.bdj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            kwj kwjVar5 = kwjVar;
                            if (kwjVar5.k() > 0 && z) {
                                pz40Var1116.setValue(bsr0.d0((kwjVar5.k() - 1) + i218));
                                qjj.W(vneVar2, null, null, new p1j(kwjVar5, null, (byte) 1), 3);
                            }
                            return Unit.f46060a;
                        }
                    };
                    pz40Var8 = pz40Var1116;
                    i10 = i218;
                    fetVar.o0(obj7);
                }
                Function0 function15 = (Function0) obj7;
                boolean zG19 = fetVar.g(kwjVar) | fetVar.e(i8);
                if (i13 == i14) {
                    z27 = true;
                } else {
                    z27 = z26;
                }
                zE6 = zG19 | z27 | fetVar.e(i10) | fetVar.g(pz40Var8) | fetVar.i(vneVar2);
                objP25 = fetVar.P();
                if (zE6) {
                    pz40 pz40Var1117 = pz40Var8;
                    i15 = i8;
                    fet fetVar13 = fetVar;
                    pz40Var9 = pz40Var1117;
                    final int i219 = i10;
                    final vne vneVar11 = vneVar2;
                    objP25 = new Function0() { // from class: a.cdj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            kwj kwjVar5 = kwjVar;
                            if (kwjVar5.k() < i15 - 1 && z) {
                                pz40Var9.setValue(bsr0.d0(kwjVar5.k() + 1 + i219));
                                qjj.W(vneVar11, null, null, new p1j(kwjVar5, null, (byte) 2), 3);
                            }
                            return Unit.f46060a;
                        }
                    };
                    i10 = i219;
                    vneVar2 = vneVar11;
                    fetVar13.o0(objP25);
                    fetVar3 = fetVar13;
                } else {
                    pz40 pz40Var1118 = pz40Var8;
                    i15 = i8;
                    fet fetVar14 = fetVar;
                    pz40Var9 = pz40Var1118;
                    final int i2110 = i10;
                    final vne vneVar12 = vneVar2;
                    objP25 = new Function0() { // from class: a.cdj
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            kwj kwjVar5 = kwjVar;
                            if (kwjVar5.k() < i15 - 1 && z) {
                                pz40Var9.setValue(bsr0.d0(kwjVar5.k() + 1 + i2110));
                                qjj.W(vneVar12, null, null, new p1j(kwjVar5, null, (byte) 2), 3);
                            }
                            return Unit.f46060a;
                        }
                    };
                    i10 = i2110;
                    vneVar2 = vneVar12;
                    fetVar14.o0(objP25);
                    fetVar3 = fetVar14;
                }
                fetVar4 = fetVar3;
                g1x.f(mm40VarD4, i118, i216, locale, yq40Var5, z21, z22, null, null, function14, function15, (Function0) objP25, fetVar4, ((i12 >> 9) & 7168) | 6);
                Object value4 = pz40Var.getValue();
                objP26 = fetVar4.P();
                if (objP26 == cl5Var) {
                    objP26 = new x2i((byte) 14);
                    fetVar4.o0(objP26);
                }
                final int i2111 = i15;
                final vne vneVar13 = vneVar2;
                final pz40 pz40Var1119 = pz40Var9;
                final Object obj11 = obj5;
                final kwj kwjVar5 = kwjVar;
                obj3 = obj11;
                ugd ugdVarM4 = u1c.M(-2032900281, new ydr() { // from class: a.ddj
                    @Override // a.ydr
                    public final Object j(Object obj12, Object obj13, Object obj14, Object obj15) {
                        final SimpleDate simpleDate6;
                        gdj gdjVar = (gdj) obj13;
                        fet fetVar15 = (fet) obj14;
                        int iIntValue = ((Integer) obj15).intValue();
                        ((b53) obj12).getClass();
                        gdjVar.getClass();
                        if ((iIntValue & 48) == 0) {
                            iIntValue |= fetVar15.e(gdjVar.ordinal()) ? 32 : 16;
                        }
                        if (fetVar15.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                            int iOrdinal = gdjVar.ordinal();
                            final Locale locale2 = locale;
                            final kwj kwjVar6 = kwjVar5;
                            final int i2112 = i10;
                            final Function1 function16 = function1;
                            if (iOrdinal == 0) {
                                fetVar15.e0(1201717621);
                                tlb.z(locale2, calendar, egk0Var5.l(), egk0Var.l(), egk0Var2.l(), l, list4, z, kwjVar6, i2112, function16, fetVar15, 0);
                                fetVar15.r(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw b1j.f(592953165, fetVar15, false);
                                }
                                fetVar15.e0(1202443858);
                                fr90 fr90Var = (fr90) pz40Var1112.getValue();
                                final cgk0 cgk0Var2 = cgk0Var;
                                boolean zG110 = fetVar15.g(cgk0Var2);
                                final SimpleDate simpleDate7 = simpleDate;
                                boolean zI4 = zG110 | fetVar15.i(simpleDate7);
                                SimpleDate simpleDate8 = simpleDate2;
                                boolean zI5 = zI4 | fetVar15.i(simpleDate8) | fetVar15.g(locale2) | fetVar15.e(i2112);
                                final int i2113 = i2111;
                                boolean zE7 = zI5 | fetVar15.e(i2113);
                                final pz40 pz40Var11110 = pz40Var1119;
                                boolean zG111 = zE7 | fetVar15.g(pz40Var11110) | fetVar15.g(function16);
                                final vne vneVar14 = vneVar13;
                                boolean zI6 = zG111 | fetVar15.i(vneVar14) | fetVar15.g(kwjVar6);
                                Object objP30 = fetVar15.P();
                                if (zI6 || objP30 == ukd.f35823a) {
                                    final pz40 pz40Var11111 = pz40Var2;
                                    simpleDate6 = simpleDate8;
                                    objP30 = new Function1() { // from class: a.edj
                                        /* JADX WARN: Code duplicated, block: B:11:0x0074  */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj16) {
                                            w2w0 w2w0Var10 = (w2w0) obj16;
                                            w2w0Var10.getClass();
                                            int i2114 = w2w0Var10.f38472a;
                                            pz40 pz40Var11112 = pz40Var11111;
                                            if (w2w0Var10.equals((w2w0) pz40Var11112.getValue())) {
                                                return Unit.f46060a;
                                            }
                                            pz40Var11112.setValue(w2w0Var10);
                                            int iL = cgk0Var2.l();
                                            int i2115 = w2w0Var10.b;
                                            Locale locale3 = locale2;
                                            Calendar calendar12 = Calendar.getInstance(locale3);
                                            calendar12.clear();
                                            calendar12.set(1, i2114);
                                            calendar12.set(2, i2115);
                                            calendar12.set(5, 1);
                                            SimpleDate simpleDate9 = new SimpleDate(i2114, i2115 + 1, l1e0.d(iL, 1, calendar12.getActualMaximum(5)));
                                            SimpleDate simpleDate10 = simpleDate7;
                                            Calendar calendarD0 = wdx.d0(simpleDate10, locale3);
                                            bsr0.U(calendarD0);
                                            long timeInMillis = calendarD0.getTimeInMillis();
                                            SimpleDate simpleDate11 = simpleDate6;
                                            Calendar calendarD1 = wdx.d0(simpleDate11, locale3);
                                            bsr0.U(calendarD1);
                                            long timeInMillis2 = calendarD1.getTimeInMillis();
                                            if (timeInMillis > timeInMillis2) {
                                                simpleDate9 = simpleDate10;
                                            } else {
                                                Calendar calendarD2 = wdx.d0(simpleDate9, locale3);
                                                bsr0.U(calendarD2);
                                                long timeInMillis3 = calendarD2.getTimeInMillis();
                                                if (timeInMillis3 < timeInMillis) {
                                                    simpleDate9 = simpleDate10;
                                                } else if (timeInMillis3 > timeInMillis2) {
                                                    simpleDate9 = simpleDate11;
                                                }
                                            }
                                            w2w0 w2w0VarJ0 = wdx.j0(wdx.d0(simpleDate9, locale3));
                                            int iD4 = l1e0.d(bsr0.m0(w2w0VarJ0) - i2112, 0, i2113 - 1);
                                            pz40Var11110.setValue(w2w0VarJ0);
                                            Calendar calendarD3 = wdx.d0(simpleDate9, locale3);
                                            bsr0.U(calendarD3);
                                            function16.invoke(Long.valueOf(calendarD3.getTimeInMillis()));
                                            qjj.W(vneVar14, null, null, new gjg(kwjVar6, iD4, null, (byte) 1), 3);
                                            return Unit.f46060a;
                                        }
                                    };
                                    fetVar15.o0(objP30);
                                } else {
                                    simpleDate6 = simpleDate8;
                                }
                                tlb.A(fr90Var, simpleDate7, simpleDate6, locale2, obj11, (Function1) objP30, fetVar15, 584);
                                fetVar15.r(false);
                            }
                        } else {
                            fetVar15.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fet fetVar15 = fetVar;
                ay3.f(value4, null, (Function1) objP26, null, null, null, ugdVarM4, fetVar15, 1573248, 58);
                fetVar15.r(true);
                fetVar2 = fetVar15;
            } else {
                fetVar.X();
            }
            obj4 = obj2;
            fetVar.s();
            int i119 = i3 >> 18;
            b = 6;
            if (((i119 & 14) ^ 6) <= 4) {
            }
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (z2) {
                Calendar calendar12 = Calendar.getInstance(locale);
                calendar12.getClass();
                bsr0.U(calendar12);
                objP = androidx.compose.runtime.e.e(calendar12);
                fetVar.o0(objP);
            } else {
                Calendar calendar13 = Calendar.getInstance(locale);
                calendar13.getClass();
                bsr0.U(calendar13);
                objP = androidx.compose.runtime.e.e(calendar13);
                fetVar.o0(objP);
            }
            pz40 pz40Var120 = (pz40) objP;
            simpleDate4 = new SimpleDate(((Calendar) pz40Var120.getValue()).get(1), ((Calendar) pz40Var120.getValue()).get(2) + 1, ((Calendar) pz40Var120.getValue()).get(5));
            i4 = (3670016 & i3) ^ 1572864;
            if (i4 <= 1048576) {
            }
            i5 = 29360128 & i3;
            if (i5 != 8388608) {
                z3 = true;
            } else {
                z3 = true;
            }
            zG = z28 | z3 | fetVar.g(simpleDate4);
            objP2 = fetVar.P();
            if (zG) {
                if (simpleDate3 != null) {
                    simpleDate4 = simpleDate3;
                }
                fetVar.o0(simpleDate4);
                objP2 = simpleDate4;
            } else {
                if (simpleDate3 != null) {
                    simpleDate4 = simpleDate3;
                }
                fetVar.o0(simpleDate4);
                objP2 = simpleDate4;
            }
            simpleDate5 = (SimpleDate) objP2;
            boolean zG20 = fetVar.g(calendar);
            i6 = i3 & 112;
            if (i6 != 32) {
                z4 = true;
            } else {
                z4 = true;
            }
            z5 = zG20 | z4;
            objP3 = fetVar.P();
            if (z5) {
                wdx.J(simpleDate, calendar);
                objP3 = androidx.compose.runtime.e.c(calendar.getTimeInMillis());
                fetVar.o0(objP3);
            } else {
                wdx.J(simpleDate, calendar);
                objP3 = androidx.compose.runtime.e.c(calendar.getTimeInMillis());
                fetVar.o0(objP3);
            }
            final egk0 egk0Var6 = (egk0) objP3;
            boolean zG21 = fetVar.g(calendar);
            i7 = i3 & 896;
            if (i7 != 256) {
                z6 = true;
            } else {
                z6 = true;
            }
            z7 = zG21 | z6;
            objP4 = fetVar.P();
            if (z7) {
                wdx.J(simpleDate2, calendar);
                objP4 = androidx.compose.runtime.e.c(calendar.getTimeInMillis());
                fetVar.o0(objP4);
            } else {
                wdx.J(simpleDate2, calendar);
                objP4 = androidx.compose.runtime.e.c(calendar.getTimeInMillis());
                fetVar.o0(objP4);
            }
            final egk0 egk0Var7 = (egk0) objP4;
            zG2 = ((i4 <= 1048576 && fetVar.g(locale)) || (i3 & 1572864) == 1048576) | fetVar.g(simpleDate5);
            objP5 = fetVar.P();
            if (zG2) {
                objP5 = wdx.d0(simpleDate5, locale);
                fetVar.o0(objP5);
            } else {
                objP5 = wdx.d0(simpleDate5, locale);
                fetVar.o0(objP5);
            }
            calendar2 = (Calendar) objP5;
            objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = androidx.compose.runtime.e.e(gdj.f11106a);
                fetVar.o0(objP6);
            }
            pz40Var = (pz40) objP6;
            Object[] objArr6 = new Object[0];
            zI = fetVar.i(simpleDate5);
            objP7 = fetVar.P();
            if (zI) {
                b2 = 0;
                objP7 = new wcj(simpleDate5, b2);
                fetVar.o0(objP7);
            } else {
                b2 = 0;
                objP7 = new wcj(simpleDate5, b2);
                fetVar.o0(objP7);
            }
            cgk0Var = (cgk0) e9x.Q(objArr6, (Function0) objP7, fetVar, b2);
            objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP8);
            }
            pz40Var2 = (pz40) objP8;
            zE = fetVar.e(((gdj) pz40Var.getValue()).ordinal());
            objP9 = fetVar.P();
            if (zE) {
                if (pz40Var.getValue() == gdj.f11106a) {
                    yq40Var = yq40.f43059a;
                } else {
                    yq40Var = yq40.b;
                }
                objP9 = androidx.compose.runtime.e.e(yq40Var);
                fetVar.o0(objP9);
            } else {
                if (pz40Var.getValue() == gdj.f11106a) {
                    yq40Var = yq40.f43059a;
                } else {
                    yq40Var = yq40.b;
                }
                objP9 = androidx.compose.runtime.e.e(yq40Var);
                fetVar.o0(objP9);
            }
            pz40Var3 = (pz40) objP9;
            if (i4 > 1048576) {
                pz40Var4 = pz40Var3;
                if ((i3 & 1572864) != 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                pz40Var4 = pz40Var3;
                if ((i3 & 1572864) != 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if (i6 != 32) {
                z9 = true;
            } else {
                z9 = true;
            }
            z10 = z8 | z9;
            objP10 = fetVar.P();
            if (z10) {
                objP10 = wdx.d0(simpleDate, locale);
                fetVar.o0(objP10);
            } else {
                objP10 = wdx.d0(simpleDate, locale);
                fetVar.o0(objP10);
            }
            calendar3 = (Calendar) objP10;
            if (i4 > 1048576) {
                calendar4 = calendar3;
                if ((i3 & 1572864) != 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                calendar4 = calendar3;
                if ((i3 & 1572864) != 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (i7 != 256) {
                z12 = true;
            } else {
                z12 = true;
            }
            z13 = z11 | z12;
            objP11 = fetVar.P();
            if (z13) {
                objP11 = wdx.d0(simpleDate2, locale);
                fetVar.o0(objP11);
            } else {
                objP11 = wdx.d0(simpleDate2, locale);
                fetVar.o0(objP11);
            }
            calendar5 = (Calendar) objP11;
            if (i6 != 32) {
                z14 = true;
            } else {
                z14 = true;
            }
            objP12 = fetVar.P();
            if (z14) {
                objP12 = wdx.j0(calendar4);
                fetVar.o0(objP12);
            } else {
                objP12 = wdx.j0(calendar4);
                fetVar.o0(objP12);
            }
            w2w0 w2w0Var10 = (w2w0) objP12;
            if (i7 != 256) {
                z15 = true;
            } else {
                z15 = true;
            }
            objP13 = fetVar.P();
            if (z15) {
                objP13 = wdx.j0(calendar5);
                fetVar.o0(objP13);
            } else {
                objP13 = wdx.j0(calendar5);
                fetVar.o0(objP13);
            }
            w2w0 w2w0Var11 = (w2w0) objP13;
            if (i5 != 8388608) {
                z16 = true;
            } else {
                z16 = true;
            }
            objP14 = fetVar.P();
            if (z16) {
                objP14 = wdx.j0(calendar2);
                fetVar.o0(objP14);
            } else {
                objP14 = wdx.j0(calendar2);
                fetVar.o0(objP14);
            }
            w2w0 w2w0Var12 = (w2w0) objP14;
            iM0 = bsr0.m0(w2w0Var10);
            iM1 = bsr0.m0(w2w0Var11);
            if (z) {
                i8 = (iM1 - iM0) + 1;
            } else {
                i8 = 1;
            }
            i9 = i8 - 1;
            int iD4 = l1e0.d(bsr0.m0(w2w0Var12) - iM0, 0, i9);
            zE2 = fetVar.e(i8);
            objP15 = fetVar.P();
            if (zE2) {
                objP15 = new y02(i8, b);
                fetVar.o0(objP15);
            } else {
                objP15 = new y02(i8, b);
                fetVar.o0(objP15);
            }
            kwjVarB = zk80.b(iD4, (Function0) objP15, fetVar, 0, 2);
            objP16 = fetVar.P();
            if (objP16 == cl5Var) {
                objP16 = jgk0.b(new s39(kwjVarB, (byte) 4));
                fetVar.o0(objP16);
            }
            l7m0Var = (l7m0) objP16;
            zE3 = fetVar.e(((Number) l7m0Var.getValue()).intValue()) | fetVar.e(iM0);
            objP17 = fetVar.P();
            if (zE3) {
                objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                fetVar.o0(objP17);
            } else {
                objP17 = androidx.compose.runtime.e.e(bsr0.d0(((Number) l7m0Var.getValue()).intValue() + iM0));
                fetVar.o0(objP17);
            }
            pz40Var5 = (pz40) objP17;
            if (i4 <= 1048576) {
            }
            objP18 = fetVar.P();
            if (z17) {
                Calendar calendar14 = Calendar.getInstance(locale);
                calendar14.getClass();
                bsr0.U(calendar14);
                objP18 = androidx.compose.runtime.e.c(calendar14.getTimeInMillis());
                fetVar.o0(objP18);
            } else {
                Calendar calendar15 = Calendar.getInstance(locale);
                calendar15.getClass();
                bsr0.U(calendar15);
                objP18 = androidx.compose.runtime.e.c(calendar15.getTimeInMillis());
                fetVar.o0(objP18);
            }
            final egk0 egk0Var8 = (egk0) objP18;
            zE4 = fetVar.e(((gdj) pz40Var.getValue()).ordinal()) | fetVar.g(obj4);
            objP19 = fetVar.P();
            if (zE4) {
                z18 = true;
                objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                fetVar.o0(objP19);
            } else {
                z18 = true;
                objP19 = androidx.compose.runtime.e.e(new SimpleDate(simpleDate5.f47286a, simpleDate5.b, 1));
                fetVar.o0(objP19);
            }
            pz40Var6 = (pz40) objP19;
            zG3 = fetVar.g((SimpleDate) pz40Var6.getValue()) | fetVar.g(obj4);
            objP20 = fetVar.P();
            if (zG3) {
                nfj nfjVar6 = nfj.f23439a;
                objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                fetVar.o0(objP20);
            } else {
                nfj nfjVar7 = nfj.f23439a;
                objP20 = androidx.compose.runtime.e.e(new fr90((SimpleDate) pz40Var6.getValue()));
                fetVar.o0(objP20);
            }
            final pz40 pz40Var11110 = (pz40) objP20;
            if (i4 > 1048576) {
            }
            objP21 = fetVar.P();
            if (z19) {
                objP21 = bsr0.o0(locale);
                fetVar.o0(objP21);
            } else {
                objP21 = bsr0.o0(locale);
                fetVar.o0(objP21);
            }
            set = (Set) objP21;
            objP22 = fetVar.P();
            if (objP22 == cl5Var) {
                objP22 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP22);
            }
            vneVar = (vne) objP22;
            if (i4 > 1048576) {
                obj5 = obj4;
                if ((i3 & 1572864) != 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
            } else {
                obj5 = obj4;
                if ((i3 & 1572864) != 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
            }
            zG4 = z20 | fetVar.g(set);
            Object objP219 = fetVar.P();
            if (zG4) {
                ArrayList arrayListN7 = bsr0.n0(locale);
                arrayList = new ArrayList(r3d.q(arrayListN7, 10));
                it = arrayListN7.iterator();
                while (it.hasNext()) {
                    b6v0 b6v0Var8 = (b6v0) it.next();
                    Iterator it9 = it;
                    zContains = set.contains(Integer.valueOf(b6v0Var8.f2076a));
                    Set set9 = set;
                    String str8 = b6v0Var8.b;
                    if (zContains) {
                        e6v0Var = e6v0.b;
                    } else {
                        e6v0Var = e6v0.f7306a;
                    }
                    arrayList.add(new d6v0(str8, e6v0Var));
                    it = it9;
                    set = set9;
                }
                fetVar.o0(arrayList);
                obj6 = arrayList;
            } else {
                ArrayList arrayListN8 = bsr0.n0(locale);
                arrayList = new ArrayList(r3d.q(arrayListN8, 10));
                it = arrayListN8.iterator();
                while (it.hasNext()) {
                    b6v0 b6v0Var9 = (b6v0) it.next();
                    Iterator it10 = it;
                    zContains = set.contains(Integer.valueOf(b6v0Var9.f2076a));
                    Set set10 = set;
                    String str9 = b6v0Var9.b;
                    if (zContains) {
                        e6v0Var = e6v0.b;
                    } else {
                        e6v0Var = e6v0.f7306a;
                    }
                    arrayList.add(new d6v0(str9, e6v0Var));
                    it = it10;
                    set = set10;
                }
                fetVar.o0(arrayList);
                obj6 = arrayList;
            }
            final List list5 = (List) obj6;
            Integer numValueOf5 = Integer.valueOf(kwjVarB.k());
            Float fValueOf5 = Float.valueOf(kwjVarB.l());
            zG5 = fetVar.g(kwjVarB) | fetVar.e(iM0) | fetVar.g(pz40Var5);
            objP23 = fetVar.P();
            if (zG5) {
                objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                fetVar.o0(objP23);
            } else {
                objP23 = new mc0((Object) kwjVarB, iM0, (Object) pz40Var5, yjeVar, (byte) 5);
                fetVar.o0(objP23);
            }
            m0x0.v(numValueOf5, fValueOf5, (Function2) objP23, fetVar);
            Object[] objArr7 = {simpleDate5, Integer.valueOf(iM0), Integer.valueOf(i8), locale};
            zI2 = fetVar.i(simpleDate5) | fetVar.i(calendar) | fetVar.e(iM0) | fetVar.e(i8) | fetVar.g(r28) | fetVar.g(pz40Var5);
            Object objP2110 = fetVar.P();
            if (zI2) {
                int i1110 = i8;
                pwcVar = new pwc(simpleDate5, calendar, iM0, i1110, r28, pz40Var5, (yje) null);
                i10 = iM0;
                i8 = i1110;
                kwjVar = r28;
                pz40Var7 = pz40Var5;
                fetVar.o0(pwcVar);
            } else {
                int i1111 = i8;
                pwcVar = new pwc(simpleDate5, calendar, iM0, i1111, r28, pz40Var5, (yje) null);
                i10 = iM0;
                i8 = i1111;
                kwjVar = r28;
                pz40Var7 = pz40Var5;
                fetVar.o0(pwcVar);
            }
            m0x0.w(objArr7, (Function2) pwcVar, fetVar);
            mm40 mm40VarE4 = o2e.e0(i120.Q(o7k0.e(mm40Var, zk9.f44519a), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "DATE_CALENDAR_COLUMN");
            x5d x5dVarA5 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE4);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA5, gqw0.x);
            jpm0.o(fetVar, bh90VarM5, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode5), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC4, gqw0.v);
            int i1112 = ((w2w0) pz40Var7.getValue()).f38472a;
            int i2112 = ((w2w0) pz40Var7.getValue()).b;
            yq40 yq40Var6 = (yq40) pz40Var4.getValue();
            if (kwjVar.k() > 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (kwjVar.k() < i9) {
                z22 = true;
            } else {
                z22 = false;
            }
            mm40 mm40VarD5 = o7k0.d(jm40.b, 1.0f);
            i11 = i3 & 57344;
            if (i11 == 16384) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean zG110 = z23 | fetVar.g(cgk0Var);
            i12 = i3;
            if ((i12 & 7168) == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            zI3 = zG110 | z24 | ((i4 <= 1048576 && fetVar.g(locale)) || (i12 & 1572864) == 1048576) | fetVar.i(simpleDate5) | fetVar.g(pz40Var7);
            objP24 = fetVar.P();
            if (zI3) {
                final pz40 pz40Var11111 = pz40Var7;
                Function0 function16 = new Function0() { // from class: a.adj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2113;
                        if (!z) {
                            return Unit.f46060a;
                        }
                        pz40 pz40Var11112 = pz40Var;
                        Object value5 = pz40Var11112.getValue();
                        gdj gdjVar = gdj.f11106a;
                        if (value5 == gdjVar) {
                            Long l2 = l;
                            if (l2 != null) {
                                long jLongValue = l2.longValue();
                                Calendar calendar16 = Calendar.getInstance(locale);
                                calendar16.getClass();
                                i2113 = bsr0.g0(jLongValue, calendar16).c;
                            } else {
                                i2113 = simpleDate5.c;
                            }
                            cgk0Var.m(i2113);
                            pz40Var2.setValue((w2w0) pz40Var11111.getValue());
                            pz40Var11112.setValue(gdj.b);
                        } else {
                            pz40Var11112.setValue(gdjVar);
                        }
                        return Unit.f46060a;
                    }
                };
                pz40Var7 = pz40Var11111;
                fetVar.o0(function16);
                objP24 = function16;
            } else {
                final pz40 pz40Var11112 = pz40Var7;
                Function0 function17 = new Function0() { // from class: a.adj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2113;
                        if (!z) {
                            return Unit.f46060a;
                        }
                        pz40 pz40Var11113 = pz40Var;
                        Object value5 = pz40Var11113.getValue();
                        gdj gdjVar = gdj.f11106a;
                        if (value5 == gdjVar) {
                            Long l2 = l;
                            if (l2 != null) {
                                long jLongValue = l2.longValue();
                                Calendar calendar16 = Calendar.getInstance(locale);
                                calendar16.getClass();
                                i2113 = bsr0.g0(jLongValue, calendar16).c;
                            } else {
                                i2113 = simpleDate5.c;
                            }
                            cgk0Var.m(i2113);
                            pz40Var2.setValue((w2w0) pz40Var11112.getValue());
                            pz40Var11113.setValue(gdj.b);
                        } else {
                            pz40Var11113.setValue(gdjVar);
                        }
                        return Unit.f46060a;
                    }
                };
                pz40Var7 = pz40Var11112;
                fetVar.o0(function17);
                objP24 = function17;
            }
            Function0 function18 = (Function0) objP24;
            boolean zG111 = fetVar.g(kwjVar);
            if (i11 == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            zE5 = zG111 | z25 | fetVar.e(i10) | fetVar.g(pz40Var7) | fetVar.i(vneVar);
            Object objP2111 = fetVar.P();
            if (zE5) {
                i13 = i11;
                final int i2113 = i10;
                final pz40 pz40Var11113 = pz40Var7;
                i14 = 16384;
                vneVar2 = vneVar;
                z26 = false;
                obj7 = new Function0() { // from class: a.bdj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kwj kwjVar6 = kwjVar;
                        if (kwjVar6.k() > 0 && z) {
                            pz40Var11113.setValue(bsr0.d0((kwjVar6.k() - 1) + i2113));
                            qjj.W(vneVar2, null, null, new p1j(kwjVar6, null, (byte) 1), 3);
                        }
                        return Unit.f46060a;
                    }
                };
                pz40Var8 = pz40Var11113;
                i10 = i2113;
                fetVar.o0(obj7);
            } else {
                i13 = i11;
                final int i2114 = i10;
                final pz40 pz40Var11114 = pz40Var7;
                i14 = 16384;
                vneVar2 = vneVar;
                z26 = false;
                obj7 = new Function0() { // from class: a.bdj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kwj kwjVar6 = kwjVar;
                        if (kwjVar6.k() > 0 && z) {
                            pz40Var11114.setValue(bsr0.d0((kwjVar6.k() - 1) + i2114));
                            qjj.W(vneVar2, null, null, new p1j(kwjVar6, null, (byte) 1), 3);
                        }
                        return Unit.f46060a;
                    }
                };
                pz40Var8 = pz40Var11114;
                i10 = i2114;
                fetVar.o0(obj7);
            }
            Function0 function19 = (Function0) obj7;
            boolean zG112 = fetVar.g(kwjVar) | fetVar.e(i8);
            if (i13 == i14) {
                z27 = true;
            } else {
                z27 = z26;
            }
            zE6 = zG112 | z27 | fetVar.e(i10) | fetVar.g(pz40Var8) | fetVar.i(vneVar2);
            objP25 = fetVar.P();
            if (zE6) {
                pz40 pz40Var11115 = pz40Var8;
                i15 = i8;
                fet fetVar16 = fetVar;
                pz40Var9 = pz40Var11115;
                final int i2115 = i10;
                final vne vneVar14 = vneVar2;
                objP25 = new Function0() { // from class: a.cdj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kwj kwjVar6 = kwjVar;
                        if (kwjVar6.k() < i15 - 1 && z) {
                            pz40Var9.setValue(bsr0.d0(kwjVar6.k() + 1 + i2115));
                            qjj.W(vneVar14, null, null, new p1j(kwjVar6, null, (byte) 2), 3);
                        }
                        return Unit.f46060a;
                    }
                };
                i10 = i2115;
                vneVar2 = vneVar14;
                fetVar16.o0(objP25);
                fetVar3 = fetVar16;
            } else {
                pz40 pz40Var11116 = pz40Var8;
                i15 = i8;
                fet fetVar17 = fetVar;
                pz40Var9 = pz40Var11116;
                final int i2116 = i10;
                final vne vneVar15 = vneVar2;
                objP25 = new Function0() { // from class: a.cdj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kwj kwjVar6 = kwjVar;
                        if (kwjVar6.k() < i15 - 1 && z) {
                            pz40Var9.setValue(bsr0.d0(kwjVar6.k() + 1 + i2116));
                            qjj.W(vneVar15, null, null, new p1j(kwjVar6, null, (byte) 2), 3);
                        }
                        return Unit.f46060a;
                    }
                };
                i10 = i2116;
                vneVar2 = vneVar15;
                fetVar17.o0(objP25);
                fetVar3 = fetVar17;
            }
            fetVar4 = fetVar3;
            g1x.f(mm40VarD5, i1112, i2112, locale, yq40Var6, z21, z22, null, null, function18, function19, (Function0) objP25, fetVar4, ((i12 >> 9) & 7168) | 6);
            Object value5 = pz40Var.getValue();
            objP26 = fetVar4.P();
            if (objP26 == cl5Var) {
                objP26 = new x2i((byte) 14);
                fetVar4.o0(objP26);
            }
            final int i2117 = i15;
            final vne vneVar16 = vneVar2;
            final pz40 pz40Var11117 = pz40Var9;
            final Object obj12 = obj5;
            final kwj kwjVar6 = kwjVar;
            obj3 = obj12;
            ugd ugdVarM5 = u1c.M(-2032900281, new ydr() { // from class: a.ddj
                @Override // a.ydr
                public final Object j(Object obj13, Object obj14, Object obj15, Object obj16) {
                    final SimpleDate simpleDate6;
                    gdj gdjVar = (gdj) obj14;
                    fet fetVar18 = (fet) obj15;
                    int iIntValue = ((Integer) obj16).intValue();
                    ((b53) obj13).getClass();
                    gdjVar.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= fetVar18.e(gdjVar.ordinal()) ? 32 : 16;
                    }
                    if (fetVar18.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                        int iOrdinal = gdjVar.ordinal();
                        final Locale locale2 = locale;
                        final kwj kwjVar7 = kwjVar6;
                        final int i2118 = i10;
                        final Function1 function110 = function1;
                        if (iOrdinal == 0) {
                            fetVar18.e0(1201717621);
                            tlb.z(locale2, calendar, egk0Var8.l(), egk0Var6.l(), egk0Var7.l(), l, list5, z, kwjVar7, i2118, function110, fetVar18, 0);
                            fetVar18.r(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw b1j.f(592953165, fetVar18, false);
                            }
                            fetVar18.e0(1202443858);
                            fr90 fr90Var = (fr90) pz40Var11110.getValue();
                            final cgk0 cgk0Var2 = cgk0Var;
                            boolean zG113 = fetVar18.g(cgk0Var2);
                            final SimpleDate simpleDate7 = simpleDate;
                            boolean zI4 = zG113 | fetVar18.i(simpleDate7);
                            SimpleDate simpleDate8 = simpleDate2;
                            boolean zI5 = zI4 | fetVar18.i(simpleDate8) | fetVar18.g(locale2) | fetVar18.e(i2118);
                            final int i2119 = i2117;
                            boolean zE7 = zI5 | fetVar18.e(i2119);
                            final pz40 pz40Var11118 = pz40Var11117;
                            boolean zG114 = zE7 | fetVar18.g(pz40Var11118) | fetVar18.g(function110);
                            final vne vneVar17 = vneVar16;
                            boolean zI6 = zG114 | fetVar18.i(vneVar17) | fetVar18.g(kwjVar7);
                            Object objP30 = fetVar18.P();
                            if (zI6 || objP30 == ukd.f35823a) {
                                final pz40 pz40Var11119 = pz40Var2;
                                simpleDate6 = simpleDate8;
                                objP30 = new Function1() { // from class: a.edj
                                    /* JADX WARN: Code duplicated, block: B:11:0x0074  */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj17) {
                                        w2w0 w2w0Var13 = (w2w0) obj17;
                                        w2w0Var13.getClass();
                                        int i21110 = w2w0Var13.f38472a;
                                        pz40 pz40Var111110 = pz40Var11119;
                                        if (w2w0Var13.equals((w2w0) pz40Var111110.getValue())) {
                                            return Unit.f46060a;
                                        }
                                        pz40Var111110.setValue(w2w0Var13);
                                        int iL = cgk0Var2.l();
                                        int i21111 = w2w0Var13.b;
                                        Locale locale3 = locale2;
                                        Calendar calendar16 = Calendar.getInstance(locale3);
                                        calendar16.clear();
                                        calendar16.set(1, i21110);
                                        calendar16.set(2, i21111);
                                        calendar16.set(5, 1);
                                        SimpleDate simpleDate9 = new SimpleDate(i21110, i21111 + 1, l1e0.d(iL, 1, calendar16.getActualMaximum(5)));
                                        SimpleDate simpleDate10 = simpleDate7;
                                        Calendar calendarD0 = wdx.d0(simpleDate10, locale3);
                                        bsr0.U(calendarD0);
                                        long timeInMillis = calendarD0.getTimeInMillis();
                                        SimpleDate simpleDate11 = simpleDate6;
                                        Calendar calendarD1 = wdx.d0(simpleDate11, locale3);
                                        bsr0.U(calendarD1);
                                        long timeInMillis2 = calendarD1.getTimeInMillis();
                                        if (timeInMillis > timeInMillis2) {
                                            simpleDate9 = simpleDate10;
                                        } else {
                                            Calendar calendarD2 = wdx.d0(simpleDate9, locale3);
                                            bsr0.U(calendarD2);
                                            long timeInMillis3 = calendarD2.getTimeInMillis();
                                            if (timeInMillis3 < timeInMillis) {
                                                simpleDate9 = simpleDate10;
                                            } else if (timeInMillis3 > timeInMillis2) {
                                                simpleDate9 = simpleDate11;
                                            }
                                        }
                                        w2w0 w2w0VarJ0 = wdx.j0(wdx.d0(simpleDate9, locale3));
                                        int iD5 = l1e0.d(bsr0.m0(w2w0VarJ0) - i2118, 0, i2119 - 1);
                                        pz40Var11118.setValue(w2w0VarJ0);
                                        Calendar calendarD3 = wdx.d0(simpleDate9, locale3);
                                        bsr0.U(calendarD3);
                                        function110.invoke(Long.valueOf(calendarD3.getTimeInMillis()));
                                        qjj.W(vneVar17, null, null, new gjg(kwjVar7, iD5, null, (byte) 1), 3);
                                        return Unit.f46060a;
                                    }
                                };
                                fetVar18.o0(objP30);
                            } else {
                                simpleDate6 = simpleDate8;
                            }
                            tlb.A(fr90Var, simpleDate7, simpleDate6, locale2, obj12, (Function1) objP30, fetVar18, 584);
                            fetVar18.r(false);
                        }
                    } else {
                        fetVar18.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            fet fetVar18 = fetVar;
            ay3.f(value5, null, (Function1) objP26, null, null, null, ugdVarM5, fetVar18, 1573248, 58);
            fetVar18.r(true);
            fetVar2 = fetVar18;
        } else {
            fet fetVar19 = fetVar;
            fetVar19.X();
            obj3 = obj2;
            fetVar2 = fetVar19;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zbc(mm40Var, simpleDate, simpleDate2, l, z, calendar, locale, simpleDate3, obj3, function1, i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    public static final ckk g0(clk clkVar) {
        bkk bkkVar;
        clkVar.getClass();
        String str = clkVar.b;
        List list = clkVar.c;
        List list2 = clkVar.d;
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = clkVar.f4564a;
        String str3 = str2 != null ? str2 : "";
        if (!lowerCase.equals("noresult")) {
            switch (lowerCase) {
                case "draw":
                    bkkVar = bkk.e;
                    break;
                case "win1":
                    bkkVar = bkk.c;
                    break;
                case "win2":
                    bkkVar = bkk.d;
                    break;
                default:
                    bkkVar = bkk.f;
                    break;
            }
        } else if (str3.equals("1")) {
            bkkVar = bkk.f2752a;
        } else {
            bkkVar = str3.equals("2") ? bkk.b : bkk.f;
        }
        return new ckk(bkkVar, P(list != null ? (Integer) CollectionsKt.firstOrNull(list) : null), P(list != null ? (Integer) CollectionsKt.f0(list) : null), tx3.z(new hlk[]{list2 != null ? W(1, 0, list2) : null, list2 != null ? W(1, 1, list2) : null}), tx3.z(new hlk[]{list2 != null ? W(2, 0, list2) : null, list2 != null ? W(2, 1, list2) : null}));
    }

    public static final void h(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(1029447411);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pnlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(1456491192);
            i(mm40Var, pnlVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 0);
        }
    }

    public static final hao h0(vr20 vr20Var, boolean z, boolean z2, uyc uycVar) {
        vr20Var.getClass();
        return new hao(vr20Var.f37878a, vr20Var.b, vr20Var.c, vr20Var.d, vr20Var.e, vr20Var.f, vr20Var.g, vr20Var.h, vr20Var.i, vr20Var.j, vr20Var.k, vr20Var.l, vr20Var.m, vr20Var.n, z, z2, vr20Var.o, vr20Var.p, vr20Var.q, yfa0.INSTANCE, vr20Var.s, vr20Var.t, uycVar);
    }

    public static final void i(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        pnl pnlVar2 = pnlVar;
        Function0 function1 = function0;
        fet fetVar2 = fetVar;
        fetVar2.g0(1525366600);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pnlVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            long secondaryButtonBackground = ((ThemeColors) fetVar2.k(zfnVar)).getSecondaryButtonBackground();
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i3 = i2;
            nkb.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2), new hjm(pnlVar2.f27294a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new nme((byte) 16, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarJ = s5x0.J(rq8.K(jm40Var, (Function1) objP), 16.0f);
            x5d x5dVarA2 = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str = pnlVar.c;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 56.0f);
            boolean zF2 = fetVar.f(secondaryButtonBackground);
            Object objP2 = fetVar.P();
            if (zF2 || objP2 == cl5Var) {
                objP2 = new nme((byte) 17, secondaryButtonBackground);
                fetVar.o0(objP2);
            }
            mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP2);
            boolean z2 = (i3 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                function1 = function0;
                objP3 = new b1i(function1, (byte) 22);
                fetVar.o0(objP3);
            } else {
                function1 = function0;
            }
            mm40 mm40VarL = s5x0.L(phu0.F(mm40VarK, null, null, false, null, (Function0) objP3, fetVar, 0, 15), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_circle_promocode, 0, fetVar), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            pnlVar2 = pnlVar;
            String str2 = pnlVar2.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), new n05(qmk.o, qmk.s, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar2, function1, i, (byte) 1);
        }
    }

    public static final vhp i0(ygs ygsVar, String str, long j, long j2, ctf0 ctf0Var, boolean z) {
        long j3;
        long j4;
        Object next;
        long j5;
        int i;
        boolean z2;
        m6l0 m6l0VarO;
        m6l0 z5l0Var;
        c6l0 c6l0Var;
        byte b;
        int i2;
        int i3;
        ygsVar.getClass();
        long j6 = ygsVar.k;
        String str2 = ygsVar.n;
        String str3 = ygsVar.o;
        str.getClass();
        ctf0Var.getClass();
        long j7 = ygsVar.f42600a;
        long j8 = ygsVar.d;
        long j9 = ygsVar.B;
        int i4 = (int) j9;
        boolean z3 = ygsVar.c;
        Iterator it = xkb.P().iterator();
        while (true) {
            if (!it.hasNext()) {
                j3 = j6;
                j4 = j7;
                next = null;
                break;
            }
            next = it.next();
            j3 = j6;
            yxg yxgVar = (yxg) next;
            j4 = j7;
            if (j8 == yxgVar.b && (j9 == yxgVar.f43419a || j9 == 0)) {
                break;
            }
            j6 = j3;
            j7 = j4;
        }
        yxg yxgVar2 = (yxg) next;
        if (yxgVar2 == null) {
            yxgVar2 = vtg.d;
        }
        ehs ehsVar = ygsVar.i;
        boolean z4 = ygsVar.c;
        if (j8 == 40) {
            boolean z5 = str3.length() == 0 || j3 <= 0;
            boolean z6 = ygsVar.w;
            if (z5) {
                m6l0VarO = O(ygsVar, ctf0Var);
            } else if (yxgVar2 instanceof csg) {
                m6l0VarO = (!z4 || z6) ? J(ygsVar, ctf0Var) : K(ygsVar, ctf0Var);
            } else if (z4 && yxgVar2.c == 1) {
                if (z6) {
                    b = 0;
                } else {
                    yk5 yk5Var = mc6.b;
                    Integer numValueOf = ehsVar != null ? Integer.valueOf(ehsVar.m) : null;
                    yk5Var.getClass();
                    b = yk5.d(numValueOf).f21536a;
                }
                boolean z7 = ehsVar != null && ehsVar.s;
                boolean z8 = ehsVar != null && ehsVar.t;
                long j10 = ygsVar.f42600a;
                d280 d280VarG = t9x.G(ygsVar);
                d280 d280VarI = t9x.I(ygsVar);
                String strX = c9x.x(ygsVar, ctf0Var);
                int i5 = ehsVar != null ? ehsVar.C.f35394a : 0;
                byte b2 = b;
                j83 j83VarS = S(ygsVar, (String) V(ygsVar).f46059a, z7);
                if (ehsVar != null) {
                    i3 = ehsVar.C.b;
                    i2 = i4;
                } else {
                    i2 = i4;
                    i3 = 0;
                }
                j5 = j8;
                i = i2;
                z2 = z3;
                z5l0Var = new e6l0(j10, ffb0.O(ygsVar, ctf0Var), str2, d280VarG, d280VarI, str3, strX, b2, i5, j83VarS, b2, i3, S(ygsVar, (String) V(ygsVar).b, z8));
                m6l0VarO = z5l0Var;
            } else {
                j5 = j8;
                i = i4;
                z2 = z3;
                if (j5 != ixg.d.b && j5 != ltg.d.b) {
                    m6l0VarO = z4 ? M(ygsVar, ctf0Var) : J(ygsVar, ctf0Var);
                } else if (!t9x.M(ygsVar)) {
                    m6l0VarO = z6 ? J(ygsVar, ctf0Var) : L(ygsVar, ctf0Var);
                } else if (z4) {
                    m6l0VarO = N(ygsVar, ctf0Var);
                } else {
                    c6l0Var = new c6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), hhm0.z(ygsVar), hhm0.C(ygsVar), c9x.w(ygsVar, ctf0Var));
                    m6l0VarO = c6l0Var;
                }
            }
            j5 = j8;
            i = i4;
            z2 = z3;
        } else {
            j5 = j8;
            i = i4;
            z2 = z3;
            if (str3.length() == 0 || j3 <= 0) {
                m6l0VarO = O(ygsVar, ctf0Var);
            } else if (Z(Long.valueOf(j5), Long.valueOf(j9)) && t9x.M(ygsVar)) {
                if (z4) {
                    m6l0VarO = N(ygsVar, ctf0Var);
                } else {
                    c6l0Var = new c6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), hhm0.z(ygsVar), hhm0.C(ygsVar), c9x.w(ygsVar, ctf0Var));
                    m6l0VarO = c6l0Var;
                }
            } else if (Z(Long.valueOf(j5), Long.valueOf(j9)) && !t9x.N(ygsVar)) {
                m6l0VarO = z4 ? L(ygsVar, ctf0Var) : J(ygsVar, ctf0Var);
            } else if (t9x.N(ygsVar)) {
                if (z4) {
                    z5l0Var = new f6l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), str2, S(ygsVar, String.valueOf(ehsVar != null ? ehsVar.C.f35394a : 0), ehsVar != null && ehsVar.u), str3, S(ygsVar, String.valueOf(ehsVar != null ? ehsVar.C.b : 0), ehsVar != null && ehsVar.v), c9x.x(ygsVar, ctf0Var));
                } else {
                    z5l0Var = new z5l0(ygsVar.f42600a, ffb0.O(ygsVar, ctf0Var), str2, str3, c9x.x(ygsVar, ctf0Var));
                }
                m6l0VarO = z5l0Var;
            } else if (j5 == 99 || j9 == 99 || j5 == 66 || j9 == 66) {
                m6l0VarO = z4 ? K(ygsVar, ctf0Var) : J(ygsVar, ctf0Var);
            } else {
                m6l0VarO = z4 ? M(ygsVar, ctf0Var) : J(ygsVar, ctf0Var);
            }
        }
        return new vhp(j4, str, j5, i, z2, str, j, j2, m6l0VarO, z);
    }

    public static final void j(ywv0 ywv0Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        ywv0Var.getClass();
        function1.getClass();
        fetVar.g0(-1010832015);
        final byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ywv0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? fetVar.g(function1) : fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new qwv0(ywv0Var);
                fetVar.o0(objP);
            }
            final qwv0 qwv0Var = (qwv0) objP;
            qwv0Var.getClass();
            pz40 pz40Var = qwv0Var.d;
            pz40 pz40Var2 = qwv0Var.b;
            ((hgk0) pz40Var2).setValue(null);
            ((hgk0) qwv0Var.c).setValue(null);
            ((hgk0) pz40Var).setValue(null);
            ugdVar.F(qwv0Var, fetVar, Integer.valueOf((i3 >> 9) & 112));
            boolean zG = fetVar.g(qwv0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new nu40(l7x.R(new ugd(-279870238, true, new xdr() { // from class: a.l3d
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b4 = b2;
                        qwv0 qwv0Var2 = qwv0Var;
                        qwv0 qwv0Var3 = (qwv0) obj2;
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        qwv0Var3.getClass();
                        switch (b4) {
                            case 0:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar = (xdr) ((hgk0) qwv0Var2.b).getValue();
                                    if (xdrVar == null) {
                                        fetVar2.e0(-1082721485);
                                    } else {
                                        fetVar2.e0(1627641486);
                                        xdrVar.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            case 1:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar2 = (xdr) ((hgk0) qwv0Var2.d).getValue();
                                    if (xdrVar2 == null) {
                                        fetVar2.e0(1827079964);
                                    } else {
                                        fetVar2.e0(1860053381);
                                        xdrVar2.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar3 = (xdr) ((hgk0) qwv0Var2.c).getValue();
                                    if (xdrVar3 == null) {
                                        fetVar2.e0(-401941275);
                                    } else {
                                        fetVar2.e0(-428607844);
                                        xdrVar3.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                })), l7x.R(new ugd(2013106489, true, new xdr() { // from class: a.l3d
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b4 = b3;
                        qwv0 qwv0Var2 = qwv0Var;
                        qwv0 qwv0Var3 = (qwv0) obj2;
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        qwv0Var3.getClass();
                        switch (b4) {
                            case 0:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar = (xdr) ((hgk0) qwv0Var2.b).getValue();
                                    if (xdrVar == null) {
                                        fetVar2.e0(-1082721485);
                                    } else {
                                        fetVar2.e0(1627641486);
                                        xdrVar.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            case 1:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar2 = (xdr) ((hgk0) qwv0Var2.d).getValue();
                                    if (xdrVar2 == null) {
                                        fetVar2.e0(1827079964);
                                    } else {
                                        fetVar2.e0(1860053381);
                                        xdrVar2.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar3 = (xdr) ((hgk0) qwv0Var2.c).getValue();
                                    if (xdrVar3 == null) {
                                        fetVar2.e0(-401941275);
                                    } else {
                                        fetVar2.e0(-428607844);
                                        xdrVar3.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                })), l7x.R(new ugd(-536758256, true, new xdr() { // from class: a.l3d
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b4 = b;
                        qwv0 qwv0Var2 = qwv0Var;
                        qwv0 qwv0Var3 = (qwv0) obj2;
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        qwv0Var3.getClass();
                        switch (b4) {
                            case 0:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar = (xdr) ((hgk0) qwv0Var2.b).getValue();
                                    if (xdrVar == null) {
                                        fetVar2.e0(-1082721485);
                                    } else {
                                        fetVar2.e0(1627641486);
                                        xdrVar.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            case 1:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar2 = (xdr) ((hgk0) qwv0Var2.d).getValue();
                                    if (xdrVar2 == null) {
                                        fetVar2.e0(1827079964);
                                    } else {
                                        fetVar2.e0(1860053381);
                                        xdrVar2.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar2.g(qwv0Var3) ? 4 : 2;
                                }
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    xdr xdrVar3 = (xdr) ((hgk0) qwv0Var2.c).getValue();
                                    if (xdrVar3 == null) {
                                        fetVar2.e0(-401941275);
                                    } else {
                                        fetVar2.e0(-428607844);
                                        xdrVar3.F(qwv0Var3, fetVar2, Integer.valueOf(iIntValue & 14));
                                    }
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                })));
                fetVar.o0(objP2);
            }
            nu40 nu40Var = (nu40) objP2;
            ugd ugdVar2 = nu40Var.f24132a;
            if (((xdr) ((hgk0) pz40Var2).getValue()) == null) {
                ugdVar2 = null;
            }
            ugd ugdVar3 = nu40Var.b;
            if (((xdr) ((hgk0) pz40Var).getValue()) == null) {
                ugdVar3 = null;
            }
            int i4 = i3 & 126;
            int i5 = i3 << 3;
            nia0.a0(ywv0Var, qwv0Var, function1, ugdVar2, ugdVar3, nu40Var.c, fetVar, (i5 & 57344) | i4 | (i5 & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl(ywv0Var, function1, ugdVar, i);
        }
    }

    public static final l9n j0(pbv pbvVar, ctf0 ctf0Var, Set set, boolean z, boolean z2) {
        y9n y9nVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
        pbvVar.getClass();
        ctf0Var.getClass();
        set.getClass();
        String str = pbvVar.f;
        long j = pbvVar.f26728a;
        String str2 = pbvVar.c;
        hds hdsVar = pbvVar.n;
        if (wvb.O(str) > 1.0d) {
            String strA = ctf0Var.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var = pn40.f27267a;
            y9nVar = new y9n(strA, TokenNames.X.concat(pn40.c(wvb.O(str), p3u0.c)));
        } else {
            y9nVar = null;
        }
        y9n y9nVar2 = y9nVar;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (pbvVar.o && (pbvVar.e instanceof z470)) {
            lc00VarB.add(p9n.DEMO);
        }
        int iOrdinal = pbvVar.d.ordinal();
        if (iOrdinal == 1) {
            lc00VarB.add(p9n.NEW);
        } else if (iOrdinal == 2) {
            lc00VarB.add(p9n.FREE);
        } else if (iOrdinal == 3) {
            lc00VarB.add(p9n.BEST);
        } else if (iOrdinal == 5) {
            lc00VarB.add(p9n.SPECIAL);
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        p9n p9nVar = (p9n) CollectionsKt.W(0, lc00VarA);
        p9n p9nVar2 = (p9n) CollectionsKt.W(1, lc00VarA);
        return new l9n(j, pbvVar.p ? new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, p9nVar, p9nVar2) : new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, p9nVar, p9nVar2, y9nVar2), (z && z2) ? new g9n(str2, set.contains(Long.valueOf(j))) : new h9n(str2));
    }

    public static final void k(e8n e8nVar, Function1 function1, Function1 function2, Function0 function0, Function0 function3, fet fetVar, int i) {
        int i2;
        Function0 function4;
        Function0 function5;
        Function1 function6;
        Function1 function7;
        e8n e8nVar2;
        k6z k6zVar;
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        fetVar.g0(-1947583331);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(e8nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (e8nVar.h) {
                fetVar.e0(978168932);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(978169856);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            l5d0 l5d0VarA = bmd.n.a(k6zVar);
            function4 = function3;
            cqk cqkVar = new cqk(e8nVar, function0, function4, function1, function2);
            e8nVar2 = e8nVar;
            function5 = function0;
            function7 = function1;
            function6 = function2;
            obc.d(l5d0VarA, u1c.M(717971805, cqkVar, fetVar), fetVar, 56);
        } else {
            function4 = function3;
            function5 = function0;
            function6 = function2;
            function7 = function1;
            e8nVar2 = e8nVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(e8nVar2, function7, function6, function5, function4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    public static final z6w k0(c7w c7wVar) {
        Date date;
        huo0 huo0Var;
        suo0 suo0Var;
        Object next;
        c7wVar.getClass();
        String str = c7wVar.f3883a;
        Integer num = c7wVar.f;
        if (str == null) {
            str = "";
        }
        dfj dfjVar = dfj.UNIQUE_4;
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        timeZone.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        Object obj = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
            simpleDateFormat.setTimeZone(timeZone);
            Date date2 = simpleDateFormat.parse(str);
            Objects.requireNonNull(date2);
            date = date2;
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        if (date == null) {
            jf4.k(null);
            return null;
        }
        String str2 = c7wVar.b;
        String str3 = str2 == null ? "" : str2;
        Long l = c7wVar.c;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str4 = c7wVar.d;
        String str5 = str4 == null ? "" : str4;
        s9m0 s9m0Var = wuo0.f39800a;
        Integer num2 = c7wVar.e;
        s9m0Var.getClass();
        wuo0 wuo0VarE = s9m0.e(num2);
        sba0.b.getClass();
        sba0 sba0VarF = jh70.f(num);
        nh70 nh70Var = tba0.f33654a;
        Integer num3 = c7wVar.g;
        nh70Var.getClass();
        tba0 tba0Var = (num3 != null && num3.intValue() == 1) ? tba0.b : (num3 != null && num3.intValue() == 2) ? tba0.c : tba0.d;
        Double d = c7wVar.h;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        List<luo0> list = c7wVar.i;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (luo0 luo0Var : list) {
                sba0.b.getClass();
                arrayList.add(qim0.q(luo0Var, jh70.f(num)));
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((huo0) next) instanceof guo0);
            huo0Var = (huo0) next;
            if (huo0Var == null) {
                huo0Var = guo0.f11940a;
            }
        } else {
            huo0Var = guo0.f11940a;
        }
        huo0 huo0Var2 = huo0Var;
        List list2 = c7wVar.j;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(l7x.g0((vuo0) it2.next()));
            }
            for (Object obj2 : arrayList2) {
                if (!(((suo0) obj2) instanceof quo0)) {
                    obj = obj2;
                    break;
                }
            }
            suo0Var = (suo0) obj;
            if (suo0Var == null) {
                suo0Var = quo0.f29355a;
            }
        } else {
            suo0Var = quo0.f29355a;
        }
        return new z6w(sba0VarF, huo0Var2, suo0Var, date, str3, jLongValue, str5, wuo0VarE, tba0Var, dDoubleValue);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    public static final void l(mm40 mm40Var, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, long j, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        long j2;
        int i4;
        long j3;
        mm40 mm40Var4;
        boolean z;
        boolean z2;
        boolean z3;
        fetVar.g0(-1074853365);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(jwmVar) ? 32 : 16;
        }
        long secondary = j;
        int i6 = i3 | (fetVar.g(jwmVar2) ? 256 : 128) | (fetVar.g(jwmVar3) ? 2048 : 1024) | (((i2 & 16) == 0 && fetVar.f(secondary)) ? 16384 : 8192);
        if (fetVar.U(i6 & 1, (i6 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                mm40 mm40Var5 = i5 != 0 ? jm40.b : mm40Var2;
                if ((i2 & 16) != 0) {
                    secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    i6 &= -57345;
                }
                i4 = i6;
                j3 = secondary;
                mm40Var4 = mm40Var5;
            } else {
                fetVar.X();
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                }
                mm40Var4 = mm40Var2;
                i4 = i6;
                j3 = secondary;
            }
            fetVar.s();
            boolean z4 = fetVar.k(bmd.n) == k6z.f17794a;
            String str = jwmVar != null ? jwmVar.f17257a : null;
            boolean z5 = str == null || str.length() == 0;
            if (z4) {
                String str2 = jwmVar2 != null ? jwmVar2.f17257a : null;
                if (str2 == null || str2.length() == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z4) {
                String str3 = jwmVar3 != null ? jwmVar3.f17257a : null;
                if (str3 == null || str3.length() == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (!z5 || z || z2) {
                fetVar.e0(-1974748825);
                mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 6.0f, 1);
                x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
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
                jpm0.o(fetVar, x5dVarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                if (z5) {
                    fetVar.e0(1426297832);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1426207498);
                    u(null, jwmVar, j3, fetVar, (i4 & 112) | ((i4 >> 6) & 896));
                    fetVar.r(false);
                }
                if (z) {
                    fetVar.e0(1426331498);
                    u(null, jwmVar2, j3, fetVar, ((i4 >> 3) & 112) | ((i4 >> 6) & 896));
                    z3 = false;
                    fetVar.r(false);
                } else {
                    z3 = false;
                    fetVar.e0(1426421832);
                    fetVar.r(false);
                }
                if (z2) {
                    fetVar.e0(1426457544);
                    u(null, jwmVar3, j3, fetVar, (i4 >> 6) & 1008);
                    fetVar.r(z3);
                } else {
                    fetVar.e0(1426549800);
                    fetVar.r(z3);
                }
                fetVar.r(true);
                fetVar.r(z3);
            } else {
                fetVar.e0(-1974020201);
                fetVar.r(false);
            }
            j2 = j3;
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            j2 = secondary;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rtl(mm40Var3, jwmVar, jwmVar2, jwmVar3, j2, i, i2);
        }
    }

    public static final int l0(yxk0 yxk0Var) {
        yxk0Var.getClass();
        switch (yxk0Var.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 7;
            case 4:
                return 10;
            case 5:
                return 20;
            case 6:
                return -1;
            default:
                t9f.b();
                return 0;
        }
    }

    public static final void m(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, y1m y1mVar, String str5, boolean z, fet fetVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        k6z k6zVar;
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        fetVar.g0(-1963564791);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = str2;
            i2 |= fetVar.g(obj) ? 256 : 128;
        } else {
            obj = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj2 = a4xVar2;
            i2 |= fetVar.g(obj2) ? 16384 : 8192;
        } else {
            obj2 = a4xVar2;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(str4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            obj3 = y1mVar;
            i2 |= fetVar.g(obj3) ? 8388608 : 4194304;
        } else {
            obj3 = y1mVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.g(str5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.h(z) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            if (z) {
                fetVar.e0(-1495107504);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1495106580);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            if (str4.length() <= 0 && str5.length() <= 0) {
                fetVar.e0(207149219);
                fetVar.r(false);
            } else {
                fetVar.e0(207028133);
                s(((i3 >> 15) & 112) | ((i3 >> 18) & 896), fetVar, null, str4, str5);
                fetVar.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1072689089, new ecc((Object) str, (Object) a4xVar, (Object) str3, obj3, z, obj, obj2, (byte) 4), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bcc(mm40Var, str, str2, a4xVar, a4xVar2, str3, str4, (Object) y1mVar, str5, z, i, (byte) 3);
        }
    }

    public static final void m0(int i, Map map) {
        if (i > 0) {
            map.put("whence", Integer.valueOf(i));
        }
    }

    public static final void n(mm40 mm40Var, hzm hzmVar, fet fetVar, int i) {
        boolean z;
        p6x p6xVar = hzmVar.f;
        fetVar.g0(-1564277979);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(hzmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "EVENT_CARD_TENNIS_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            t(null, hzmVar.g, fetVar, 0);
            w(null, hzmVar.f13913a, fetVar, 0);
            w(null, hzmVar.b, fetVar, 0);
            fetVar.r(true);
            r(s5x0.N(jm40Var, 0.0f, 26.0f, 0.0f, 0.0f, 13), p6xVar, fetVar, 0);
            tym tymVar = hzmVar.c;
            if (tymVar == null) {
                fetVar.e0(880167895);
                fetVar.r(false);
                z = false;
            } else {
                fetVar.e0(880167896);
                y(o2e.e0(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), "ROUND_ONE_SCORE_COLUMN"), tymVar, p6xVar, false, fetVar, 3072);
                z = false;
                fetVar.r(false);
            }
            tym tymVar2 = hzmVar.d;
            if (tymVar2 == null) {
                fetVar.e0(880549815);
                fetVar.r(z);
            } else {
                fetVar.e0(880549816);
                y(o2e.e0(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), "ROUND_TWO_SCORE_COLUMN"), tymVar2, p6xVar, false, fetVar, 3072);
                fetVar.r(false);
            }
            y(o2e.e0(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), "RESULT_SCORE_COLUMN"), hzmVar.e, p6xVar, true, fetVar, 3072);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, hzmVar, i, (byte) 22);
        }
    }

    public static final void o(mm40 mm40Var, h5n h5nVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        Function0 function1;
        fetVar.g0(-1539970468);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(h5nVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Function0 function2 = i4 != 0 ? null : function0;
            fetVar.e0(1580630926);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            D(o7k0.e(mm40VarD, 32.0f), h5nVar, function2, fetVar, i3 & 1008);
            fetVar.r(false);
            function1 = function2;
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var, (Object) h5nVar, (Object) function1, i, i2, (byte) 9);
        }
    }

    public static final void p(mm40 mm40Var, pr90 pr90Var, Function1 function1, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        function0.getClass();
        fetVar.g0(898912386);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pr90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new cqq();
                fetVar.o0(objP);
            }
            cqq cqqVar = (cqq) objP;
            Unit unit = Unit.f46060a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new cin(cqqVar, null, b);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarM = s5x0.M(jm40Var, 16.0f, 8.0f, 4.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_circle_keyboard, 0, fetVar);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = m6m.c;
                fetVar.o0(objP3);
            }
            dww.a(pm80VarF, (n4d) objP3, null, fetVar, 392, 8);
            obc.d(h36.f12370a.a(cqqVar), u1c.M(710036446, new fun(pr90Var, function1, b), fetVar), fetVar, 56);
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            wul wulVar = pr90Var.b;
            boolean z = (i2 & 7168) == 2048;
            Object objP4 = fetVar.P();
            if (z || objP4 == cl5Var) {
                objP4 = new dbn(function0, (byte) 3);
                fetVar.o0(objP4);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP4, fetVar, 0, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(mm40Var2, (Object) pr90Var, function1, (wdr) function0, i, (byte) 29);
        }
    }

    public static final sso q(Function1 function1) {
        sso ssoVar = new sso();
        function1.invoke(ssoVar);
        return new sso(ssoVar);
    }

    public static final void r(mm40 mm40Var, p6x p6xVar, fet fetVar, int i) {
        Object objN;
        fetVar.g0(-1161998348);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(p6xVar.ordinal()) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.s(mm40Var, 28.0f), 8.0f, 0.0f, 6.0f, 0.0f, 10);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                int iOrdinal = p6xVar.ordinal();
                jm40 jm40Var = jm40.b;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        objN = s5x0.N(jm40Var, 0.0f, 32.0f, 0.0f, 0.0f, 13);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        objN = null;
                    }
                    objP = objN;
                } else {
                    objP = jm40Var;
                }
                fetVar.o0(objP);
            }
            mm40 mm40Var2 = (mm40) objP;
            if (mm40Var2 == null) {
                fetVar.e0(-1599130469);
                fetVar.r(false);
            } else {
                fetVar.e0(-1599130468);
                srm.a(0, fetVar, o7k0.e(mm40Var2, 24.0f));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qym(mm40Var, p6xVar, i, b);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(660839961);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (str2.length() > 0) {
                fetVar2.e0(-2065121736);
                j6n.h(str2, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2064978547);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 4);
        }
    }

    public static final void t(mm40 mm40Var, rym rymVar, fet fetVar, int i) {
        Object obj;
        fet fetVar2 = fetVar;
        fetVar2.g0(1647718496);
        int i2 = i | 6 | (fetVar2.g(rymVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 22.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            gzm gzmVar = rymVar.b;
            fetVar2.e0(-588452484);
            if (gzmVar.equals(dzm.f6947a)) {
                fetVar2.e0(1312554542);
                fetVar2.r(false);
            } else {
                if (gzmVar instanceof ezm) {
                    fetVar2.e0(1312639916);
                    ezm ezmVar = (ezm) gzmVar;
                    boolean zG = fetVar2.g(ezmVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new c8n(nsm0.y(ezmVar.e), new w7n(new a8n(), dtb.S(ezmVar), true, 0, false, null, 56));
                        fetVar2.o0(objP);
                    }
                    c8n c8nVar = (c8n) objP;
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
                    v7n.c(null, c8nVar, null, fetVar2, 5);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    if (!gzmVar.equals(fzm.f10414a)) {
                        throw b1j.f(-1066039718, fetVar2, false);
                    }
                    fetVar2.e0(1313435407);
                    j6n.h("VAR", oro0.f25744a, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0, 0, fetVar2, 54, 24);
                    fetVar2.r(false);
                }
                String str = rymVar.f31319a;
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109562);
                fetVar2 = fetVar;
                fetVar2.r(false);
                fetVar2.r(true);
                obj = jm40Var;
            }
            String str2 = rymVar.f31319a;
            long secondary2 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, null, secondary2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
            obj = jm40Var;
        } else {
            fetVar2.X();
            obj = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(obj, rymVar, i, (byte) 24);
        }
    }

    public static final void u(mm40 mm40Var, jwm jwmVar, long j, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1163530843);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(jwmVar) : fetVar.i(jwmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = jwmVar.f17257a;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            int i3 = jwmVar.b;
            mm40Var2 = jm40.b;
            v8q0.a(str, mm40Var2, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, i3, 0, null, y9q0VarG, fetVar, ((i2 << 3) & 112) | (i2 & 896), 384, 109560);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((Object) mm40Var2, (Object) jwmVar, j, i, (byte) 4);
        }
    }

    public static final void v(mm40 mm40Var, e8n e8nVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        fetVar.g0(-267479005);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(e8nVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            jm40 jm40Var = jm40.b;
            int i3 = i2 << 6;
            int i4 = (57344 & i3) | 384 | (i3 & 458752);
            slb.m(zhg0Var.a(1.0f, jm40Var, true), e8nVar.d, false, ijg.c0, function1, function2, fetVar, i4);
            ulb.j(zhg0Var.a(1.0f, jm40Var, true), e8nVar.f, fetVar, 0);
            slb.m(zhg0Var.a(1.0f, jm40Var, true), e8nVar.e, true, StaticColors.INSTANCE.m83getDarkBlue200d7_KjU(), function1, function2, fetVar, i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((Object) mm40Var, (Object) e8nVar, function1, (wdr) function2, i, (byte) 17);
        }
    }

    public static final void w(mm40 mm40Var, czm czmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-363384892);
        int i2 = i | 6 | (fetVar2.g(czmVar) ? 32 : 16);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 32.0f), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            d280 d280Var = czmVar.b;
            d280 d280Var2 = czmVar.c;
            cl5 cl5Var = ukd.f35823a;
            if (d280Var != null) {
                fetVar2.e0(1133683643);
                boolean zG = fetVar2.g(d280Var);
                Object objP = fetVar2.P();
                if (zG || objP == cl5Var) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                    fetVar2.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar2.g(u6nVar);
                Object objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new d1n(u6nVar, b);
                    fetVar2.o0(objP2);
                }
                kkb.p(1, fetVar2, null, (Function0) objP2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1134078614);
                fetVar2.r(false);
            }
            if (d280Var2 != null) {
                fetVar2.e0(1134130043);
                boolean zG3 = fetVar2.g(d280Var2);
                Object objP3 = fetVar2.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new u6n(d4d.SECONDARY60, w6n.j, d280Var2);
                    fetVar2.o0(objP3);
                }
                u6n u6nVar2 = (u6n) objP3;
                boolean zG4 = fetVar2.g(u6nVar2);
                Object objP4 = fetVar2.P();
                if (zG4 || objP4 == cl5Var) {
                    objP4 = new d1n(u6nVar2, b);
                    fetVar2.o0(objP4);
                }
                kkb.p(1, fetVar2, null, (Function0) objP4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1134525014);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = czmVar.f5231a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.E, 2, false, 2, 0, null, y9q0VarM, fetVar, 0, 24960, 108528);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var2, czmVar, i, (byte) 23);
        }
    }

    public static final void x(mm40 mm40Var, String str, a4x a4xVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        float f;
        fetVar.g0(1494858723);
        byte b = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            if (a4xVar.size() <= 3) {
                zcl zclVar = qmk.f28987a;
                f = 2.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = -8.0f;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(661994393, new etm(f, xx7Var, a4xVar, b), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ftm(mm40Var, str, a4xVar, z, i, (byte) 3);
        }
    }

    public static final void y(mm40 mm40Var, tym tymVar, p6x p6xVar, boolean z, fet fetVar, int i) {
        y3d y3dVarF;
        y3d y3dVarF2;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-274646643);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(tymVar) ? 32 : 16) | (fetVar2.e(p6xVar.ordinal()) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 32.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 12.0f), 1.0f);
            String str = tymVar.f34762a;
            String str2 = tymVar.c;
            String str3 = tymVar.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
            if (tymVar.d) {
                fetVar.e0(-1723147126);
                y3dVarF = dw9.f(fetVar, false, ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU());
            } else {
                fetVar.e0(-1723089373);
                fetVar.r(false);
                y3dVarF = null;
            }
            if (tymVar.e) {
                fetVar.e0(-1723000310);
                y3dVarF2 = dw9.f(fetVar, false, ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU());
            } else {
                fetVar.e0(-1722942557);
                fetVar.r(false);
                y3dVarF2 = null;
            }
            if (z || p6xVar == p6x.f26478a) {
                fetVar.e0(-1722841063);
                fetVar2 = fetVar;
                qzb.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), ulb.Z(str3, fetVar), y3dVarF, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar.e0(-1722604006);
                ebc.s(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), new dqm(ulb.Z(str3, fetVar), y3dVarF), fetVar, 0, 0);
                fetVar.r(false);
                fetVar2 = fetVar;
            }
            if (z || p6xVar == p6x.b) {
                z2 = true;
                fetVar2.e0(-1722218211);
                qzb.p(null, ulb.Z(str2, fetVar2), y3dVarF2, fetVar2, 0, 1);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1722048610);
                z2 = true;
                ebc.s(null, new dqm(ulb.Z(str2, fetVar2), y3dVarF2), fetVar2, 0, 1);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0((byte) 28, i, (Object) mm40Var, (Object) tymVar, (Object) p6xVar, z);
        }
    }

    public static final void z(final Locale locale, final Calendar calendar, final long j, final long j2, final long j3, final Long l, final List list, final boolean z, final kwj kwjVar, final int i, final Function1 function1, fet fetVar, final int i2) {
        fetVar.g0(-2031323677);
        int i3 = i2 | (fetVar.g(locale) ? 4 : 2) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024) | (fetVar.f(j3) ? 16384 : 8192) | (fetVar.g(l) ? 131072 : 65536) | (fetVar.g(list) ? 1048576 : 524288) | (fetVar.h(z) ? 8388608 : 4194304) | (fetVar.g(kwjVar) ? 67108864 : 33554432) | (fetVar.e(i) ? 536870912 : 268435456);
        if (fetVar.U(i3 & 1, ((i3 & 306783363) == 306783362 && ((fetVar.i(function1) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final omv omvVar = (omv) fetVar.k(bmd.l);
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
            rsm0.m(o7k0.d(jm40Var, 1.0f), list, fetVar, ((i3 >> 15) & 112) | 6);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            q5x.e(kwjVar, s5x0.L(o7k0.e(mm40VarD, 260.0f), 8.0f, 0.0f, 2), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-661808052, new ydr() { // from class: a.fdj
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean z2;
                    int iIntValue = ((Integer) obj2).intValue();
                    fet fetVar2 = (fet) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((rk80) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= fetVar2.e(iIntValue) ? 32 : 16;
                    }
                    boolean z3 = false;
                    boolean z4 = true;
                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        w2w0 w2w0VarD0 = bsr0.d0(i + iIntValue);
                        boolean zG = fetVar2.g(w2w0VarD0);
                        Locale locale2 = locale;
                        boolean zG2 = zG | fetVar2.g(locale2);
                        Object objP = fetVar2.P();
                        if (zG2 || objP == ukd.f35823a) {
                            objP = bsr0.S(w2w0VarD0.f38472a, w2w0VarD0.b, locale2);
                            fetVar2.o0(objP);
                        }
                        il9 il9Var = (il9) objP;
                        jm40 jm40Var2 = jm40.b;
                        float f = 1.0f;
                        mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                        x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                        fetVar2.e0(-373722268);
                        Iterator it = il9Var.c.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            final List list2 = (List) next;
                            int size = list2.size();
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                            mm40 mm40VarD3 = o7k0.d(jm40Var2, f);
                            final long j4 = j2;
                            Iterator it2 = it;
                            final long j5 = j3;
                            final boolean z5 = z;
                            final Long l2 = l;
                            boolean z6 = z4;
                            final long j6 = j;
                            final omv omvVar2 = omvVar;
                            final Function1 function2 = function1;
                            cwr0.b(mm40VarD3, size, 32.0f, 40.0f, lh80VarT, u1c.M(-1172087147, new ydr() { // from class: a.ycj
                                @Override // a.ydr
                                public final Object j(Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int i6;
                                    vk9 vk9Var;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    mm40 mm40Var = (mm40) obj6;
                                    fet fetVar3 = (fet) obj7;
                                    int iIntValue4 = ((Integer) obj8).intValue();
                                    mm40Var.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        i6 = (fetVar3.e(iIntValue3) ? 4 : 2) | iIntValue4;
                                    } else {
                                        i6 = iIntValue4;
                                    }
                                    if ((iIntValue4 & 48) == 0) {
                                        i6 |= fetVar3.g(mm40Var) ? 32 : 16;
                                    }
                                    if (fetVar3.U(i6 & 1, (i6 & 147) != 146)) {
                                        yk9 yk9Var = (yk9) list2.get(iIntValue3);
                                        long j7 = yk9Var.f42776a;
                                        boolean z7 = yk9Var.c;
                                        boolean z8 = j4 <= j7 && j7 <= j5;
                                        String strValueOf = z7 ? String.valueOf(yk9Var.b) : "";
                                        boolean z9 = z7 && z8;
                                        if (z5 && z7 && z8) {
                                            Long l3 = l2;
                                            if (l3 == null || !bsr0.e0(l3.longValue(), j7)) {
                                                vk9Var = bsr0.e0(j6, j7) ? rk9.f30638a : sk9.f32335a;
                                            } else {
                                                vk9Var = uk9.f35816a;
                                            }
                                        } else {
                                            vk9Var = tk9.f34083a;
                                        }
                                        if (z7) {
                                            fetVar3.e0(437271557);
                                            qk9 qk9Var = new qk9(strValueOf, vk9Var);
                                            boolean zH = fetVar3.h(z9);
                                            omv omvVar3 = omvVar2;
                                            boolean zI = zH | fetVar3.i(omvVar3);
                                            Function1 function3 = function2;
                                            boolean zG3 = fetVar3.g(function3) | zI | fetVar3.i(yk9Var);
                                            Object objP2 = fetVar3.P();
                                            if (zG3 || objP2 == ukd.f35823a) {
                                                t13 t13Var = new t13(z9, (Object) omvVar3, (Object) function3, (Object) yk9Var, (byte) 6);
                                                fetVar3.o0(t13Var);
                                                objP2 = t13Var;
                                            }
                                            x4d0.l(mm40Var, qk9Var, null, (Function1) objP2, fetVar3, ((i6 >> 3) & 14) | 64);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(437928385);
                                            qxw.o(fetVar3, mm40Var);
                                            fetVar3.r(false);
                                        }
                                    } else {
                                        fetVar3.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar2), fetVar2, 196614);
                            if (il9Var.c.size() - 1 != i4) {
                                fetVar2.e0(1366156334);
                                qxw.o(fetVar2, o7k0.e(jm40Var2, 4.0f));
                                z2 = false;
                                fetVar2.r(false);
                            } else {
                                z2 = false;
                                fetVar2.e0(1366301445);
                                fetVar2.r(false);
                            }
                            it = it2;
                            z4 = z6;
                            z3 = z2;
                            i4 = i5;
                            f = 1.0f;
                        }
                        fetVar2.r(z3);
                        fetVar2.r(z4);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i3 >> 24) & 14, 24576, 16380);
            rz4.t(jm40Var, 12.0f, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(locale, calendar, j, j2, j3, l, list, z, kwjVar, i, function1, i2) { // from class: a.xcj

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Locale f40648a;
                public final /* synthetic */ Calendar b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ Long f;
                public final /* synthetic */ List g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ kwj i;
                public final /* synthetic */ int j;
                public final /* synthetic */ Function1 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    tlb.z(this.f40648a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }
}
