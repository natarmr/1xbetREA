package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.javax.sip.message.Response;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.DerWriter;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.core.navigation.authorization.model.AuthType;
import org.xplatform.cyber.section.api.activeteams.CyberActiveTeamsParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class on implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25527a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ on(iqt iqtVar, pru pruVar, ctf0 ctf0Var) {
        this.f25527a = (byte) 21;
        this.c = iqtVar;
        this.d = pruVar;
        this.b = ctf0Var;
    }

    private final Object a(Object obj) {
        m2k0 m2k0Var = (m2k0) this.b;
        Function1 function1 = (Function1) this.c;
        Function0 function0 = (Function0) this.d;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        a4x a4xVar = m2k0Var.f21065a;
        function1.getClass();
        hczVar.f(a4xVar.size(), null, new ap30(a4xVar, (byte) 7), new ugd(2039820996, true, new gic((List) a4xVar, a4xVar, function1, (byte) 1)));
        a4x a4xVar2 = m2k0Var.b;
        a4xVar2.getClass();
        function0.getClass();
        hczVar.f(a4xVar2.size(), new xlr0(new efr0((byte) 20), a4xVar2, (byte) 5), new vdr0(a4xVar2, (byte) 9), new ugd(2039820996, true, new zip0(a4xVar2, function0, a4xVar2, (byte) 6)));
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        l7m0 l7m0Var = (l7m0) this.b;
        l7m0 l7m0Var2 = (l7m0) this.c;
        l7m0 l7m0Var3 = (l7m0) this.d;
        uag0 uag0Var = (uag0) obj;
        uag0Var.getClass();
        uag0Var.I(uag0Var.t.getDensity() * ((ycl) l7m0Var.getValue()).f42389a);
        uag0Var.H(uag0Var.t.getDensity() * ((ycl) l7m0Var2.getValue()).f42389a);
        uag0Var.b(((Number) l7m0Var3.getValue()).floatValue());
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        BasicDerAdapter basicDerAdapter = (BasicDerAdapter) this.b;
        DerWriter derWriter = (DerWriter) this.c;
        ((t99) obj).getClass();
        basicDerAdapter.d.b(derWriter, this.d);
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        String str = (String) this.b;
        gj4 gj4Var = new gj4((vne) this.c, (bxq0) this.d, (byte) 14);
        iiy[] iiyVarArr = yai0.f42300a;
        ((abi0) obj).b(mai0.c, new m6(str, gj4Var));
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj) {
        ArrayList arrayList;
        Iterator it;
        HashMap map;
        Map map2;
        BetHistoryScreenModel betHistoryScreenModel;
        boolean z;
        int i;
        fak0 fak0Var;
        boolean z2;
        Object next;
        i0w i0wVar;
        String str;
        Object next2;
        ArrayList arrayList2;
        List list;
        String str2;
        p3w p3wVar;
        String str3;
        tqo0 tqo0Var;
        Object next3;
        kzv kzvVar;
        xco xcoVar;
        Object obj2;
        char c;
        ctf0 ctf0Var = (ctf0) this.b;
        ocl oclVar = (ocl) this.c;
        BetHistoryScreenModel betHistoryScreenModel2 = (BetHistoryScreenModel) this.d;
        jk7 jk7Var = (jk7) obj;
        jk7Var.getClass();
        ctf0Var.getClass();
        ql5 ql5Var = jk7Var.f;
        List list2 = jk7Var.j;
        on5 on5VarX0 = jiq0.x0(ql5Var, ctf0Var);
        if (jk7Var.f16653a) {
            return new ol7(jk7Var.i, on5VarX0, jk7Var.e, jk7Var.q, jk7Var.t);
        }
        if (jk7Var.b) {
            return new nl7(jk7Var.i, on5VarX0, jk7Var.e, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), jk7Var.q, jk7Var.t);
        }
        if (list2.isEmpty()) {
            return new ml7(jk7Var.i, on5VarX0, jk7Var.e, ocl.b(oclVar, pb10.f, null, 0, 0, R.string.bet_market_empty_bets_do_more_bets, R.string.make_bet, 0L, 0L, 862), jk7Var.q, jk7Var.t);
        }
        List list3 = jk7Var.k;
        List list4 = jk7Var.r;
        List list5 = jk7Var.s;
        HashMap map3 = jk7Var.w;
        Map map4 = jk7Var.u;
        boolean z3 = jk7Var.l;
        List list6 = jk7Var.m;
        boolean z4 = jk7Var.n;
        boolean z5 = jk7Var.x;
        boolean z6 = jk7Var.y;
        int iOrdinal = betHistoryScreenModel2.getC().ordinal();
        int i2 = 6;
        int i3 = 4;
        if (iOrdinal != 2) {
            int i4 = 2;
            String str4 = "\u200e";
            if (iOrdinal != 3) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    kzv kzvVar2 = (kzv) it2.next();
                    String str5 = kzvVar2.f19169a;
                    Iterator it3 = it2;
                    String str6 = kzvVar2.B;
                    String str7 = kzvVar2.f19169a;
                    boolean z7 = z3;
                    String str8 = kzvVar2.i;
                    Long lT0 = StringsKt.t0(str5);
                    boolean zContains = list5.contains(Long.valueOf(lT0 != null ? lT0.longValue() : 0L));
                    String str9 = ql5Var != null ? ql5Var.f : null;
                    if (str9 == null) {
                        str9 = "";
                    }
                    b1j.B(list3, list6, list4);
                    boolean z8 = z5;
                    q4f q4fVar = kzvVar2.b;
                    boolean z9 = kzvVar2.x;
                    boolean z10 = z6;
                    double d = kzvVar2.V;
                    boolean z11 = kzvVar2.G;
                    boolean z12 = kzvVar2.q;
                    long j = kzvVar2.d;
                    List list7 = list4;
                    List list8 = kzvVar2.Y;
                    List list9 = list6;
                    i0w i0wVar2 = kzvVar2.g;
                    ql5 ql5Var2 = ql5Var;
                    int i5 = kzvVar2.t;
                    int iOrdinal2 = q4fVar.ordinal();
                    List list10 = list5;
                    wro0 wro0Var = wro0.f39654a;
                    ArrayList arrayList4 = arrayList3;
                    cpo0 cpo0Var = cpo0.f4759a;
                    BetHistoryScreenModel betHistoryScreenModel3 = betHistoryScreenModel2;
                    String str10 = str4;
                    bro0 bro0Var = bro0.f3088a;
                    Map map5 = map4;
                    tqo0 tqo0Var2 = tqo0.f34390a;
                    String str11 = str9;
                    kro0 kro0Var = kro0.f18776a;
                    switch (iOrdinal2) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            String strJ = jwb.J(kzvVar2, ctf0Var, list3);
                            list = list3;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add(Long.valueOf(((z0w) it4.next()).F));
                            }
                            HashSet hashSetJ0 = CollectionsKt.J0(arrayList5);
                            rdj rdjVar = rdj.f30294a;
                            lsm0 lsm0Var = ctf0Var.b;
                            ctf0 ctf0Var2 = ctf0Var;
                            String strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                            String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1));
                            too0 too0Var = new too0("TagLines.Title".concat(str7), lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1)));
                            joo0 joo0Var = new joo0(twn.m(i5, "Counter"), i5);
                            if (i5 == 1) {
                                joo0Var = null;
                            }
                            ooo0 ooo0Var = new ooo0(lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), "TagLive", kro0Var);
                            if (!z12) {
                                ooo0Var = null;
                            }
                            qoo0 qoo0Var = new qoo0(lsm0Var.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0Var2);
                            if (!z11) {
                                qoo0Var = null;
                            }
                            roo0 roo0Var = new roo0(strJ, "TopChampTag".concat(strJ), bro0Var);
                            if (strJ.length() <= 0) {
                                roo0Var = null;
                            }
                            koo0 koo0Var = new koo0(lsm0Var.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0Var);
                            if (d == 0.0d) {
                                koo0Var = null;
                            }
                            loo0 loo0Var = new loo0(lsm0Var.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0Var);
                            if (!z9) {
                                loo0Var = null;
                            }
                            ioo0 ioo0Var = new ioo0(lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj3 : list7) {
                                ooo0 ooo0Var2 = ooo0Var;
                                if (((xco) obj3).e) {
                                    arrayList6.add(obj3);
                                }
                                ooo0Var = ooo0Var2;
                            }
                            ooo0 ooo0Var3 = ooo0Var;
                            if (arrayList6.isEmpty()) {
                                ioo0Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        ioo0Var = null;
                                    }
                                } while (!hashSetJ0.contains(Long.valueOf(((xco) it5.next()).f40655a)));
                            }
                            uoo0[] uoo0VarArr = new uoo0[8];
                            uoo0VarArr[0] = too0Var;
                            uoo0VarArr[1] = joo0Var;
                            uoo0VarArr[i4] = ooo0Var3;
                            uoo0VarArr[3] = qoo0Var;
                            uoo0VarArr[4] = roo0Var;
                            uoo0VarArr[5] = koo0Var;
                            uoo0VarArr[i2] = loo0Var;
                            uoo0VarArr[7] = ioo0Var;
                            i4 i4VarR0 = dyb.r0(tx3.z(uoo0VarArr));
                            i3w i3wVar = new i3w(lsm0Var.a(R.string.feeds_sport_events_count_new, Arrays.copyOf(new Object[0], 0)), String.valueOf(kzvVar2.u), lsm0Var.a(R.string.finished_bets, Arrays.copyOf(new Object[]{Integer.valueOf(kzvVar2.v), Integer.valueOf(i5)}, i4)));
                            str2 = str10;
                            j3w j3wVar = new j3w(lsm0Var.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0)), kng0.k(str2, str8));
                            if (str8.length() <= 0) {
                                j3wVar = null;
                            }
                            ctf0Var = ctf0Var2;
                            f3w f3wVarF = k7x.F(kzvVar2, ctf0Var, str11);
                            f3w f3wVarE = k7x.E(kzvVar2, ctf0Var, str11);
                            f3w f3wVarK = k7x.K(kzvVar2, ctf0Var, str11);
                            m3w m3wVarM = k7x.M(ctf0Var);
                            h3w[] h3wVarArr = new h3w[i2];
                            h3wVarArr[0] = i3wVar;
                            h3wVarArr[1] = j3wVar;
                            h3wVarArr[2] = f3wVarF;
                            h3wVarArr[3] = f3wVarE;
                            h3wVarArr[4] = f3wVarK;
                            h3wVarArr[5] = m3wVarM;
                            p3wVar = new p3w(str7, str7, strG, str6, strA, i4VarR0, dyb.r0(tx3.z(h3wVarArr)), true, zContains ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new, zContains, lmc.a0(kzvVar2), true, k7x.L(kzvVar2, ctf0Var, str11), false, true, false, vic.K(i0wVar2), String.valueOf(i5), "", "", "", "", false);
                            break;
                        default:
                            String strJ2 = jwb.J(kzvVar2, ctf0Var, list3);
                            Iterator it6 = list7.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    next3 = it6.next();
                                    list = list3;
                                    str3 = strJ2;
                                    tqo0Var = tqo0Var2;
                                    if (((xco) next3).f40655a != kzvVar2.T) {
                                        tqo0Var2 = tqo0Var;
                                        list3 = list;
                                        strJ2 = str3;
                                    }
                                } else {
                                    str3 = strJ2;
                                    tqo0Var = tqo0Var2;
                                    list = list3;
                                    next3 = null;
                                }
                            }
                            xco xcoVar2 = (xco) next3;
                            Iterator it7 = list9.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    Object next4 = it7.next();
                                    Iterator it8 = it7;
                                    ueo ueoVar = (ueo) next4;
                                    z0w z0wVar = (z0w) CollectionsKt.firstOrNull(list8);
                                    if (z0wVar != null) {
                                        kzvVar = kzvVar2;
                                        xcoVar = xcoVar2;
                                        if (ueoVar.f35538a == z0wVar.v) {
                                            obj2 = next4;
                                        }
                                    } else {
                                        kzvVar = kzvVar2;
                                        xcoVar = xcoVar2;
                                    }
                                    it7 = it8;
                                    kzvVar2 = kzvVar;
                                    xcoVar2 = xcoVar;
                                } else {
                                    kzvVar = kzvVar2;
                                    xcoVar = xcoVar2;
                                    obj2 = null;
                                }
                            }
                            ueo ueoVar2 = (ueo) obj2;
                            rdj rdjVar2 = rdj.f30294a;
                            lsm0 lsm0Var2 = ctf0Var.b;
                            String strG2 = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                            String strA2 = lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1));
                            too0 too0Var2 = new too0("TagLines.Title".concat(str7), lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str7}, 1)));
                            joo0 joo0Var2 = new joo0(twn.m(i5, "Counter"), i5);
                            if (i5 == 1) {
                                joo0Var2 = null;
                            }
                            ooo0 ooo0Var4 = new ooo0(lsm0Var2.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), "TagLive", kro0Var);
                            if (!z12) {
                                ooo0Var4 = null;
                            }
                            qoo0 qoo0Var2 = new qoo0(lsm0Var2.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0Var);
                            if (!z11) {
                                qoo0Var2 = null;
                            }
                            String str12 = str3;
                            roo0 roo0Var2 = new roo0(str12, "TopChampTag".concat(str12), bro0Var);
                            if (str12.length() <= 0) {
                                roo0Var2 = null;
                            }
                            koo0 koo0Var2 = new koo0(lsm0Var2.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), "TagAdvance", cpo0Var);
                            if (d == 0.0d) {
                                koo0Var2 = null;
                            }
                            loo0 loo0Var2 = new loo0(lsm0Var2.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), "TagAutoSale", wro0Var);
                            if (!z9) {
                                loo0Var2 = null;
                            }
                            ioo0 ioo0Var2 = new ioo0(lsm0Var2.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                            xco xcoVar3 = xcoVar;
                            if (!(xcoVar != null ? xcoVar3.e : false)) {
                                ioo0Var2 = null;
                            }
                            uoo0[] uoo0VarArr2 = new uoo0[8];
                            uoo0VarArr2[0] = too0Var2;
                            uoo0VarArr2[1] = joo0Var2;
                            uoo0VarArr2[i4] = ooo0Var4;
                            uoo0VarArr2[3] = qoo0Var2;
                            uoo0VarArr2[i3] = roo0Var2;
                            uoo0VarArr2[5] = koo0Var2;
                            uoo0VarArr2[i2] = loo0Var2;
                            uoo0VarArr2[7] = ioo0Var2;
                            i4 i4VarR1 = dyb.r0(tx3.z(uoo0VarArr2));
                            kzv kzvVar3 = kzvVar;
                            f3w f3wVarF2 = k7x.F(kzvVar3, ctf0Var, str11);
                            f3w f3wVarE2 = k7x.E(kzvVar3, ctf0Var, str11);
                            f3w f3wVarK2 = k7x.K(kzvVar3, ctf0Var, str11);
                            m3w m3wVarM2 = k7x.M(ctf0Var);
                            h3w[] h3wVarArr2 = new h3w[i3];
                            h3wVarArr2[0] = f3wVarF2;
                            h3wVarArr2[1] = f3wVarE2;
                            h3wVarArr2[i4] = f3wVarK2;
                            h3wVarArr2[3] = m3wVarM2;
                            i4 i4VarR2 = dyb.r0(tx3.z(h3wVarArr2));
                            boolean z13 = i0wVar2 == i0w.b;
                            int i6 = zContains ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new;
                            tvw tvwVarA0 = lmc.a0(kzvVar3);
                            String strL = k7x.L(kzvVar3, ctf0Var, str11);
                            int iK = vic.K(i0wVar2);
                            String strD = thb.D(kzvVar3, ctf0Var, map5);
                            String strK = kng0.k(str10, str8);
                            String str13 = xcoVar3 != null ? xcoVar3.b : null;
                            String strR = f7k.R(kzvVar3, z7, z4, ueoVar2, str13 == null ? "" : str13, z8, z10);
                            i0w i0wVar3 = i0w.i;
                            if (i0wVar2 == i0wVar3) {
                                strR = null;
                            }
                            if (strR == null) {
                                c = 4700;
                                strR = lsm0Var2.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0));
                            } else {
                                c = 4700;
                            }
                            String strT = wvb.T(kzvVar3, betHistoryScreenModel3);
                            if (i0wVar2 == i0wVar3) {
                                strT = null;
                            }
                            p3wVar = new p3w(str7, str7, strG2, str6, strA2, i4VarR1, i4VarR2, z13, i6, zContains, tvwVarA0, true, strL, false, true, true, iK, "", strD, strK, strR, strT == null ? "" : strT, false);
                            betHistoryScreenModel3 = betHistoryScreenModel3;
                            map5 = map5;
                            str2 = str10;
                            break;
                    }
                    arrayList4.add(p3wVar);
                    arrayList3 = arrayList4;
                    str4 = str2;
                    z3 = z7;
                    z5 = z8;
                    z6 = z10;
                    it2 = it3;
                    list4 = list7;
                    list6 = list9;
                    ql5Var = ql5Var2;
                    list5 = list10;
                    betHistoryScreenModel2 = betHistoryScreenModel3;
                    map4 = map5;
                    list3 = list;
                    i2 = 6;
                    i3 = 4;
                    i4 = 2;
                }
                arrayList2 = arrayList3;
            } else {
                BetHistoryScreenModel betHistoryScreenModel4 = betHistoryScreenModel2;
                ql5 ql5Var3 = ql5Var;
                List list11 = list3;
                List list12 = list5;
                String str14 = "\u200e";
                arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    kzv kzvVar4 = (kzv) it9.next();
                    String str15 = kzvVar4.f19169a;
                    Long lT1 = StringsKt.t0(str15);
                    List list13 = list12;
                    boolean zContains2 = list13.contains(Long.valueOf(lT1 != null ? lT1.longValue() : 0L));
                    ql5 ql5Var4 = ql5Var3;
                    String str16 = ql5Var3 != null ? ql5Var4.f : null;
                    if (str16 == null) {
                        str16 = "";
                    }
                    HistoryTypeModel b = betHistoryScreenModel4.getB();
                    List list14 = (List) map3.get(str15);
                    if (list14 == null) {
                        list14 = iun.f15405a;
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    list14.getClass();
                    b.getClass();
                    list11.getClass();
                    rdj rdjVar3 = rdj.f30294a;
                    lsm0 lsm0Var3 = ctf0Var.b;
                    Iterator it10 = it9;
                    ql5Var3 = ql5Var4;
                    String strG3 = rdj.g(new znq0(kzvVar4.d), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                    String strA3 = lsm0Var3.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str15}, 1));
                    pn40 pn40Var = pn40.f27267a;
                    double d2 = kzvVar4.m;
                    String strConcat = str14.concat(pn40.d(d2, str16, p3u0.c));
                    i0w i0wVar4 = kzvVar4.g;
                    ArrayList arrayListG = hew0.G(b, i0wVar4, list14);
                    ArrayList arrayList7 = new ArrayList(r3d.q(arrayListG, 10));
                    Iterator it11 = arrayListG.iterator();
                    while (it11.hasNext()) {
                        arrayList7.add(d5c.Z((HistoryMenuItem) it11.next(), zContains2));
                    }
                    String str17 = kzvVar4.f19169a;
                    String strQ = w6x.q(strG3, " · \u200e", strA3);
                    String upperCase = lsm0Var3.a(R.string.accepted, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    pz40 pz40Var2 = s6t0.f31722a;
                    String str18 = str16;
                    wm7 wm7Var = new wm7(upperCase, s6t0.b().f33626a.getPrimary());
                    List list15 = list11;
                    ctf0 ctf0Var3 = ctf0Var;
                    ArrayList arrayList8 = arrayList;
                    list12 = list13;
                    BetHistoryScreenModel betHistoryScreenModel5 = betHistoryScreenModel4;
                    HashMap map6 = map3;
                    i4 i4VarS = hhm0.s(kzvVar4.q, kzvVar4.G, kzvVar4.x, false, ctf0Var3, jwb.J(kzvVar4, ctf0Var, list15), kzvVar4.V, false, false);
                    ctf0Var = ctf0Var3;
                    yto ytoVar = (yto) CollectionsKt.W(0, arrayList7);
                    yto ytoVar2 = (yto) CollectionsKt.W(1, arrayList7);
                    wul wulVar = new wul(lul.e, oe9.c, new ue9(cy7.c() ? ua80.i(str14, strConcat, Separators.SP, StringsKt.v0(lsm0Var3.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{""}, 1))).toString()) : lsm0Var3.a(R.string.history_sale_for_v2, Arrays.copyOf(new Object[]{strConcat}, 1))), true, false, false);
                    tvw tvwVarA1 = lmc.a0(kzvVar4);
                    String str19 = kzvVar4.B;
                    int i7 = kzvVar4.t;
                    boolean z14 = i7 > 1;
                    String strN = w6x.n(kzvVar4.v, i7, Separators.SLASH);
                    String strK2 = kng0.k(str14, kzvVar4.i);
                    double d3 = kzvVar4.L;
                    double d4 = kzvVar4.E;
                    double d5 = kzvVar4.f;
                    String strA4 = (d3 >= d5 || i0wVar4 == i0w.i) ? lsm0Var3.a(R.string.history_bet_rate, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.history_bet_rate_partially_sold, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var2 = pn40.f27267a;
                    double d6 = kzvVar4.C;
                    if (d6 <= 0.0d) {
                        d6 = d5 - d4;
                    }
                    String strC = pn40.c(d6, p3u0.c);
                    BigDecimal bigDecimalSubtract = new BigDecimal(String.valueOf(d5)).subtract(new BigDecimal(String.valueOf(d4)));
                    bigDecimalSubtract.getClass();
                    BigDecimal bigDecimalSubtract2 = new BigDecimal(String.valueOf(d2)).subtract(bigDecimalSubtract);
                    bigDecimalSubtract2.getClass();
                    double dDoubleValue = bigDecimalSubtract2.doubleValue();
                    cuo cuoVar = new cuo(str17, str17, strQ, wm7Var, i4VarS, ytoVar, ytoVar2, wulVar, tvwVarA1, str19, z14, strN, strK2, dyb.g0(new x680("BET_SUM_ID", strA4, new wty(strC, str18, s6t0.b().f33626a.getTextPrimary())), new x680("PROFIT_ID", lsm0Var3.a(R.string.history_your_profit_new, Arrays.copyOf(new Object[0], 0)), new wty(ntb.O(str18, dDoubleValue), str18, dDoubleValue > 0.0d ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : dDoubleValue < 0.0d ? StaticColors.INSTANCE.m113getRed0d7_KjU() : s6t0.b().f33626a.getTextPrimary()))), null);
                    arrayList = arrayList8;
                    arrayList.add(cuoVar);
                    it9 = it10;
                    map3 = map6;
                    str14 = str14;
                    betHistoryScreenModel4 = betHistoryScreenModel5;
                    list11 = list15;
                }
            }
            return new ll7(r83.i, on5VarX0, r83.e, arrayList2, r83.q, jk7Var.t);
        }
        BetHistoryScreenModel betHistoryScreenModel6 = betHistoryScreenModel2;
        List list16 = list4;
        Map map7 = map4;
        List list17 = list6;
        ql5 ql5Var5 = ql5Var;
        List list18 = list3;
        List list19 = list5;
        HashMap map8 = map3;
        int i8 = 0;
        char c2 = 4700;
        arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it12 = list2.iterator();
        while (it12.hasNext()) {
            kzv kzvVar5 = (kzv) it12.next();
            ql5Var5 = ql5Var5;
            String str20 = ql5Var5 != null ? ql5Var5.f : null;
            String str21 = str20 == null ? "" : str20;
            String str22 = kzvVar5.f19169a;
            String str23 = kzvVar5.f19169a;
            HashMap map9 = map8;
            List list20 = (List) map9.get(str22);
            if (list20 == null) {
                list20 = iun.f15405a;
            }
            Long lT2 = StringsKt.t0(str23);
            List list21 = list19;
            boolean zContains3 = list21.contains(Long.valueOf(lT2 != null ? lT2.longValue() : 0L));
            i7u i7uVar = i7u.b;
            i7u i7uVar2 = i7u.c;
            int i9 = i8;
            List list22 = list16;
            List list23 = list17;
            List list24 = list18;
            hne.C(list24, list23, list20, list22);
            q4f q4fVar2 = kzvVar5.b;
            List list25 = kzvVar5.Y;
            switch (q4fVar2.ordinal()) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    list16 = list22;
                    it = it12;
                    map = map9;
                    map2 = map7;
                    betHistoryScreenModel = betHistoryScreenModel6;
                    List listR = xkb.R(kzvVar5, HistoryTypeModel.SALE, list20);
                    String str24 = kzvVar5.i;
                    int i10 = kzvVar5.v;
                    ArrayList arrayList9 = new ArrayList(r3d.q(list25, 10));
                    Iterator it13 = list25.iterator();
                    while (it13.hasNext()) {
                        arrayList9.add(Long.valueOf(((z0w) it13.next()).F));
                        listR = listR;
                    }
                    List list26 = listR;
                    boolean zA = i7uVar2.a(list25, list23);
                    boolean zA2 = i7uVar.a(list25, list23);
                    String str25 = kzvVar5.B;
                    lsm0 lsm0Var4 = ctf0Var.b;
                    String strA5 = lsm0Var4.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str23}, 1));
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : list16) {
                        List list27 = list23;
                        if (((xco) obj4).e) {
                            arrayList10.add(obj4);
                        }
                        list23 = list27;
                    }
                    list17 = list23;
                    if (arrayList10.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it14 = arrayList10.iterator();
                        while (true) {
                            if (it14.hasNext()) {
                                Iterator it15 = it14;
                                kzv kzvVar6 = kzvVar5;
                                if (arrayList9.contains(Long.valueOf(((xco) it14.next()).f40655a))) {
                                    kzvVar5 = kzvVar6;
                                    z = true;
                                } else {
                                    kzvVar5 = kzvVar6;
                                    it14 = it15;
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                    i4 i4VarN = jwb.N(kzvVar5, ctf0Var, list24, z, zA, zA2, "");
                    String strA6 = lsm0Var4.a(R.string.events_completed, Arrays.copyOf(new Object[0], 0));
                    Integer numValueOf = Integer.valueOf(i10);
                    int i11 = kzvVar5.t;
                    szv szvVar = new szv(i10 > 0 ? i10 / i11 : 0.0f, strA6, lsm0Var4.a(R.string.search_result, Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(i11)}, 2)));
                    f3w f3wVarT = p7x.t(kzvVar5, ctf0Var, str21);
                    g3w g3wVar = new g3w(lsm0Var4.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0)), str24);
                    if (str24.length() <= 0) {
                        g3wVar = null;
                    }
                    i = 0;
                    fak0Var = new fak0(str23, i4VarN, str23, strA5, str25, true, lmc.a0(kzvVar5), vtb.W(list26, zContains3), vtb.Y(list26, zContains3), dyb.r0(tx3.z(new h3w[]{szvVar, f3wVarT, g3wVar, p7x.s(kzvVar5, ctf0Var, str21), p7x.x(kzvVar5, ctf0Var, str21), p7x.A(kzvVar5, ctf0Var)})), p180.f26188a, "", "", "", "", p7x.y(kzvVar5, ctf0Var, str21), false);
                    break;
                default:
                    Iterator it16 = list22.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            next = it16.next();
                            z2 = zContains3;
                            list16 = list22;
                            it = it12;
                            if (((xco) next).f40655a != kzvVar5.T) {
                                zContains3 = z2;
                                it12 = it;
                                list22 = list16;
                            }
                        } else {
                            z2 = zContains3;
                            list16 = list22;
                            it = it12;
                            next = null;
                        }
                    }
                    xco xcoVar4 = (xco) next;
                    List listR2 = xkb.R(kzvVar5, HistoryTypeModel.SALE, list20);
                    i0w i0wVar5 = kzvVar5.g;
                    Iterator it17 = list23.iterator();
                    while (true) {
                        if (it17.hasNext()) {
                            next2 = it17.next();
                            i0wVar = i0wVar5;
                            ueo ueoVar3 = (ueo) next2;
                            Iterator it18 = it17;
                            z0w z0wVar2 = (z0w) CollectionsKt.firstOrNull(list25);
                            if (z0wVar2 != null) {
                                str = str23;
                                map = map9;
                                if (ueoVar3.f35538a == z0wVar2.v) {
                                }
                            } else {
                                str = str23;
                                map = map9;
                            }
                            i0wVar5 = i0wVar;
                            str23 = str;
                            it17 = it18;
                            map9 = map;
                        } else {
                            i0wVar = i0wVar5;
                            str = str23;
                            map = map9;
                            next2 = null;
                        }
                    }
                    ueo ueoVar4 = (ueo) next2;
                    boolean zA3 = i7uVar2.a(list25, list23);
                    boolean zA4 = i7uVar.a(list25, list23);
                    String str26 = kzvVar5.B;
                    String strA7 = ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str}, 1));
                    i0w i0wVar6 = i0wVar;
                    boolean z15 = z2;
                    i4 i4VarN2 = jwb.N(kzvVar5, ctf0Var, list24, xcoVar4 != null ? xcoVar4.e : i9, zA3, zA4, "");
                    f3w f3wVarT2 = p7x.t(kzvVar5, ctf0Var, str21);
                    f3w f3wVarS = p7x.s(kzvVar5, ctf0Var, str21);
                    f3w f3wVarX = p7x.x(kzvVar5, ctf0Var, str21);
                    bfj bfjVarA = p7x.A(kzvVar5, ctf0Var);
                    h3w[] h3wVarArr3 = new h3w[4];
                    h3wVarArr3[i9] = f3wVarT2;
                    h3wVarArr3[1] = f3wVarS;
                    h3wVarArr3[2] = f3wVarX;
                    h3wVarArr3[3] = bfjVarA;
                    i4 i4VarR3 = dyb.r0(tx3.z(h3wVarArr3));
                    tvw tvwVarA2 = lmc.a0(kzvVar5);
                    String strY = p7x.y(kzvVar5, ctf0Var, str21);
                    map2 = map7;
                    String strD2 = thb.D(kzvVar5, ctf0Var, map2);
                    String str27 = kzvVar5.i;
                    String str28 = xcoVar4 != null ? xcoVar4.b : null;
                    String strR2 = f7k.R(kzvVar5, z3, z4, ueoVar4, str28 == null ? "" : str28, z5, z6);
                    i0w i0wVar7 = i0w.i;
                    if (i0wVar6 == i0wVar7) {
                        strR2 = null;
                    }
                    if (strR2 == null) {
                        strR2 = ctf0Var.b.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[i9], i9));
                    }
                    String str29 = strR2;
                    BetHistoryScreenModel betHistoryScreenModel7 = betHistoryScreenModel6;
                    String strT2 = wvb.T(kzvVar5, betHistoryScreenModel7);
                    if (i0wVar6 == i0wVar7) {
                        strT2 = null;
                    }
                    String str30 = str;
                    fak0Var = new fak0(str30, i4VarN2, str30, strA7, str26, true, tvwVarA2, vtb.W(listR2, z15), vtb.Y(listR2, z15), i4VarR3, kpb.t0(kzvVar5), strD2, str29, strT2 == null ? "" : strT2, str27, strY, true);
                    list17 = list23;
                    betHistoryScreenModel = betHistoryScreenModel7;
                    i = 0;
                    break;
            }
            arrayList.add(fak0Var);
            map7 = map2;
            list19 = list21;
            i8 = i;
            it12 = it;
            map8 = map;
            betHistoryScreenModel6 = betHistoryScreenModel;
            list18 = list24;
            c2 = 4700;
        }
        arrayList2 = arrayList;
        return new ll7(r83.i, on5VarX0, r83.e, arrayList2, r83.q, jk7Var.t);
    }

    private final Object i(Object obj) {
        t33 t33Var = (t33) this.b;
        w6k w6kVar = (w6k) this.c;
        t33 t33Var2 = (t33) this.d;
        uag0 uag0Var = (uag0) obj;
        uag0Var.getClass();
        uag0Var.v(((Number) t33Var.d()).floatValue());
        uag0Var.H(w6kVar.w0(((Number) t33Var2.d()).floatValue()));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:260:0x0794 A[PHI: r6
  0x0794: PHI (r6v27 a.ctf0) = (r6v26 a.ctf0), (r6v29 a.ctf0) binds: [B:219:0x0693, B:258:0x0791] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x088b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v34, types: [a.v1r] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        aao aaoVar;
        ?? r7;
        on1 on1Var;
        List list;
        fie xgeVar;
        Collection collectionO0;
        Iterator it;
        Object next;
        String str;
        String str2;
        boolean z;
        Iterator it2;
        List list2;
        String string;
        String str3;
        int i;
        String string2;
        boolean z2;
        nn2 nn2Var;
        fie sgeVar;
        boolean z3;
        androidx.fragment.app.e eVarC;
        xn4 xn4Var;
        byte b = this.f25527a;
        String str4 = "";
        byte b2 = 8;
        byte b3 = 24;
        byte b4 = 10;
        byte b5 = 3;
        Object objR = 0;
        byte b6 = 0;
        byte b7 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ln lnVar = (ln) obj;
                lnVar.getClass();
                return new kn(lnVar, (ctf0) obj4, (g2v) obj3, ((CyberActiveTeamsParams) obj2).f46546a);
            case 1:
                vq vqVar = (vq) obj4;
                ms2 ms2Var = (ms2) obj3;
                xdr xdrVar = (xdr) obj2;
                nre nreVar = (nre) obj;
                nreVar.getClass();
                hwe hweVar = nreVar.f23998a;
                Object obj5 = nreVar.b;
                Object obj6 = nreVar.c;
                int iOrdinal = hweVar.ordinal();
                if (iOrdinal == 0) {
                    aaoVar = aao.f537a;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    aaoVar = aao.b;
                }
                vqVar.g(ms2Var, aaoVar);
                xdrVar.F(hweVar, obj5, obj6);
                return Unit.f46060a;
            case 2:
                s5d0 s5d0Var = (s5d0) obj3;
                hl1 hl1Var = ((sff0) obj2).b;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                peg0 peg0Var = ((oe0) obj4).r;
                long j = Long.parseLong(s5d0Var.f31650a);
                String str5 = s5d0Var.d;
                List list3 = s5d0Var.f;
                String str6 = s5d0Var.g;
                boolean z4 = s5d0Var.e == gz8.b || hl1Var.f13233a.k;
                vc0 vc0Var = hl1Var.x;
                String str7 = s5d0Var.i;
                k0w0Var.h(peg0Var.j(j, str5, list3, str6, z4, true, vc0Var, str7 == null ? "" : str7));
                return Unit.f46060a;
            case 3:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.b(new a1w0(new kk0((kb0) obj4, (myr0) obj3, (String) obj2, (byte) 0))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 4:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((mn0) ((on0) obj4)).f22067a;
                hczVar.f(a4xVar.size(), new g5(new g20((byte) 17), a4xVar, (byte) 14), new wl0(a4xVar, (byte) 0), new ugd(2039820996, true, new c8((List) a4xVar, obj3, (Function1) obj2, (byte) 4)));
                return Unit.f46060a;
            case 5:
                pp0 pp0Var = (pp0) obj4;
                Function0 function0 = (Function0) obj3;
                Function1 function1 = (Function1) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 72.0f), 56.0f);
                np0 np0Var = (np0) pp0Var;
                if (np0Var.b) {
                    r7 = 1;
                    hcz.e(hczVar2, null, null, new ugd(1547969906, true, new gp0(pp0Var, mm40VarS, function0)), 3);
                } else {
                    r7 = 1;
                }
                a4x a4xVar2 = np0Var.f23889a.f10362a;
                hczVar2.f(a4xVar2.size(), null, new b8(a4xVar2, (byte) 12), new ugd(802480018, r7, new kp0(a4xVar2, mm40VarS, function1, r7)));
                return Unit.f46060a;
            case 6:
                abi0 abi0Var = (abi0) obj;
                jdk0 jdk0Var = z31.n2;
                abi0Var.getClass();
                Boolean bool = (Boolean) ((pz40) obj4).getValue();
                bool.booleanValue();
                zai0 zai0Var = etl.c;
                iiy iiyVar = etl.f8381a[1];
                zai0Var.getClass();
                abi0Var.b(zai0Var, bool);
                etl.g(abi0Var, ((cgk0) obj3).l());
                zai0 zai0Var2 = cbi0.m;
                Object obj7 = (Boolean) ((pz40) obj2).getValue();
                obj7.getClass();
                abi0Var.b(zai0Var2, obj7);
                return Unit.f46060a;
            case 7:
                l7m0 l7m0Var = (l7m0) obj4;
                cl1 cl1Var = (cl1) obj2;
                hcz hczVar3 = (hcz) obj;
                gfk0 gfk0Var = cl1.o2;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, new ugd(1235697784, true, new ri1((y5d) obj3, cl1Var, (byte) 26)), 3);
                hcz.e(hczVar3, null, null, new ugd(-88503953, true, new bl1(cl1Var, l7m0Var, (byte) 1)), 3);
                hcz.e(hczVar3, null, null, new ugd(-487216720, true, new zk1(cl1Var, (byte) 2)), 3);
                if (((el1) l7m0Var.getValue()).b.length() > 0) {
                    hcz.e(hczVar3, null, null, new ugd(1307688083, true, new zk1(cl1Var, (byte) 0)), 3);
                    hcz.e(hczVar3, null, null, new ugd(1265794250, true, new v7i0(l7m0Var, (byte) 6)), 3);
                }
                return Unit.f46060a;
            case 8:
                vne vneVar = (vne) obj4;
                on1 on1Var2 = (on1) obj3;
                d9z d9zVar = (d9z) obj2;
                ao1 ao1Var = (ao1) obj;
                hfk0 hfk0Var = on1.S1;
                ao1Var.getClass();
                if (ao1Var.equals(xn1.f41151a)) {
                    qjj.W(vneVar, null, null, new kn1(d9zVar, null, (byte) 0), 3);
                } else if (ao1Var instanceof un1) {
                    ob0 ob0Var = ((un1) ao1Var).f35940a;
                    if (ob0Var instanceof mb0) {
                        String str8 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = on1Var2.M1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC2 = on1Var2.C();
                        eVarC2.getClass();
                        ynb.b(ynbVar, bm5Var, str8, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var.equals(lb0.f19732a)) {
                        kxq kxqVarB = on1Var2.B();
                        if (kxqVarB != null) {
                            ii iiVar = on1Var2.N1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string3 = kxqVarB.getString(R.string.attention);
                            String string4 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string5 = kxqVarB.getString(R.string.ok);
                            string5.getClass();
                            iiVar.d(new DialogFields((CharSequence) string3, (CharSequence) string4, (CharSequence) string5, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else {
                        if (!ob0Var.equals(nb0.f23215a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = on1Var2.B();
                        if (kxqVarB2 != null) {
                            ii iiVar2 = on1Var2.N1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string6 = kxqVarB2.getString(R.string.attention);
                            String string7 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string8 = kxqVarB2.getString(R.string.ok);
                            string8.getClass();
                            iiVar2.d(new DialogFields((CharSequence) string6, (CharSequence) string7, (CharSequence) string8, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                } else {
                    if (!(ao1Var instanceof vn1)) {
                        if (ao1Var instanceof zn1) {
                            zn1 zn1Var = (zn1) ao1Var;
                            String str9 = zn1Var.f44651a;
                            String str10 = zn1Var.b;
                            String str11 = zn1Var.c;
                            ii iiVar3 = on1Var2.N1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            DialogFields dialogFields = new DialogFields((CharSequence) str9, (CharSequence) str10, (CharSequence) str11, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC3 = on1Var2.C();
                            eVarC3.getClass();
                            iiVar3.d(dialogFields, eVarC3);
                        } else if (ao1Var instanceof yn1) {
                            String str12 = ((yn1) ao1Var).f42917a;
                            wdk0 wdk0Var = on1Var2.L1;
                            if (wdk0Var == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            on1Var = on1Var2;
                            wdk0.k(wdk0Var, new xdk0(rek0.b, str12, null, null, null, null, 124), on1Var, null, null, false, null, 1020);
                        } else {
                            on1Var = on1Var2;
                            if (ao1Var instanceof wn1) {
                                qcc.c0(on1Var);
                            }
                        }
                        on1Var.G0().x(um1.f35898a);
                        return Unit.f46060a;
                    }
                    View viewQ0 = on1Var2.q0();
                    j120.X(viewQ0);
                    viewQ0.requestFocus();
                }
                on1Var = on1Var2;
                on1Var.G0().x(um1.f35898a);
                return Unit.f46060a;
            case 9:
                ax0 ax0Var = (ax0) obj4;
                pz40 pz40Var = (pz40) obj3;
                pz40 pz40Var2 = (pz40) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                WebView webView = ax0Var.f1599a;
                View view = ax0Var.b;
                if (webView == null) {
                    frameLayout.removeAllViews();
                    pz40Var.setValue(null);
                    pz40Var2.setValue(null);
                    return Unit.f46060a;
                }
                if (pz40Var.getValue() != null && !Intrinsics.d(pz40Var.getValue(), webView)) {
                    WebView webView2 = (WebView) pz40Var.getValue();
                    ViewParent parent = webView2 != null ? webView2.getParent() : null;
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView((View) pz40Var.getValue());
                    }
                }
                if (!Intrinsics.d(webView.getParent(), frameLayout)) {
                    ViewParent parent2 = webView.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(webView);
                    }
                    frameLayout.addView(webView);
                }
                if (pz40Var2.getValue() != null && !Intrinsics.d(pz40Var2.getValue(), view)) {
                    View view2 = (View) pz40Var2.getValue();
                    ViewParent parent3 = view2 != null ? view2.getParent() : null;
                    ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                    if (viewGroup3 != null) {
                        viewGroup3.removeView((View) pz40Var2.getValue());
                    }
                }
                if (view != null && !Intrinsics.d(view.getParent(), frameLayout)) {
                    ViewParent parent4 = view.getParent();
                    ViewGroup viewGroup4 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(view);
                    }
                    frameLayout.addView(view);
                }
                pz40Var.setValue(webView);
                pz40Var2.setValue(view);
                return Unit.f46060a;
            case 10:
                hcz hczVar4 = (hcz) obj;
                jdk0 jdk0Var2 = t42.p2;
                hczVar4.getClass();
                a4x a4xVar3 = ((d52) ((pz40) obj4).getValue()).b;
                byte b8 = 5;
                hczVar4.f(a4xVar3.size(), new g5(new dj1((byte) 25), a4xVar3, b3), new wl0(a4xVar3, b8), new ugd(802480018, true, new c8(a4xVar3, (wul) obj3, (t42) obj2, b8)));
                return Unit.f46060a;
            case 11:
                ctf0 ctf0Var = (ctf0) obj4;
                y78 y78Var = (y78) obj3;
                xm2 xm2Var = (xm2) obj;
                xm2Var.getClass();
                sff0 sff0VarA = ((pru) obj2).a();
                ctf0Var.getClass();
                boolean z5 = xm2Var.f41101a;
                mdm mdmVar = xm2Var.h;
                List list4 = xm2Var.e;
                boolean z6 = xm2Var.p;
                ym2 ym2Var = xm2Var.j;
                List list5 = xm2Var.d;
                boolean z7 = xm2Var.m;
                if (!z5) {
                    if (xm2Var.b) {
                        sgeVar = new sge(xm2Var.g);
                    } else if (list5.isEmpty()) {
                        list = list5;
                        if (list4.isEmpty()) {
                            xgeVar = new xge(mdmVar, z6);
                        } else {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            if (xm2Var.c) {
                                mdmVar = xm2Var.i;
                            }
                            lc00VarB.add(new kn2(mdmVar, z7 ? 2 : 1));
                            if (ym2Var != null) {
                                wcb wcbVar = ym2Var.f;
                                boolean z8 = ym2Var.d;
                                boolean z9 = ym2Var.b;
                                v5l0 v5l0Var = ym2Var.f42866a;
                                y78 y78Var2 = ym2Var.e;
                                List list6 = ym2Var.g;
                                boolean z10 = ym2Var.h;
                                ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
                                Iterator it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    d0t d0tVar = (d0t) it3.next();
                                    Iterator it4 = list6.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next = it4.next();
                                            it = it3;
                                            if (((lok0) next).f20396a != d0tVar.O) {
                                                it3 = it;
                                            }
                                        } else {
                                            it = it3;
                                            next = null;
                                        }
                                    }
                                    lok0 lok0Var = (lok0) next;
                                    boolean z11 = z9;
                                    v5l0 v5l0Var2 = v5l0Var;
                                    ctf0 ctf0Var2 = ctf0Var;
                                    y78 y78Var3 = y78Var2;
                                    String strA = wcbVar.a(d0tVar.v, d0tVar.u);
                                    ArrayList arrayList2 = new ArrayList(r3d.q(list6, 10));
                                    Iterator it5 = list6.iterator();
                                    while (it5.hasNext()) {
                                        arrayList2.add(Integer.valueOf(((lok0) it5.next()).f20396a));
                                    }
                                    boolean z12 = lok0Var != null ? lok0Var.n : false;
                                    boolean z13 = lok0Var != null ? lok0Var.p : false;
                                    m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
                                    String str13 = lok0Var != null ? lok0Var.u : null;
                                    ctf0Var = ctf0Var2;
                                    arrayList.add(wwb.V(d0tVar, ctf0Var2, y78Var3, z8, z11, strA, false, arrayList2, z12, z13, false, v5l0Var2, m5l0Var, str13 == null ? "" : str13, z10));
                                    it3 = it;
                                    y78Var2 = y78Var3;
                                    z9 = z11;
                                    v5l0Var = v5l0Var2;
                                }
                                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    arrayList3.add(new mn2((a2n) it6.next()));
                                }
                                collectionO0 = dyb.o0(arrayList3);
                                if (collectionO0 == null) {
                                    collectionO0 = lak0.c;
                                }
                            } else {
                                collectionO0 = lak0.c;
                            }
                            if (!collectionO0.isEmpty()) {
                                String strA2 = ctf0Var.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0));
                                pz40 pz40Var3 = s6t0.f31722a;
                                lc00VarB.add(new ln2(new hjm(strA2, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), z7 ? 2 : 1));
                                lc00VarB.addAll(collectionO0);
                            }
                            xgeVar = new nhe(dyb.o0(kotlin.collections.a.a(lc00VarB)), z7, z6, ym2Var != null ? ym2Var.h : false);
                        }
                    } else {
                        boolean z14 = sff0VarA.b.f13233a.f8987a;
                        String str14 = sff0VarA.d.f27973a.b;
                        boolean z15 = ym2Var != null ? ym2Var.h : false;
                        boolean z16 = true;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                        Iterator it7 = list5.iterator();
                        while (it7.hasNext()) {
                            oxy oxyVar = (oxy) it7.next();
                            if (oxyVar != null) {
                                if (oxyVar instanceof kxy) {
                                    js0 js0Var = ((kxy) oxyVar).b;
                                    it2 = it7;
                                    list2 = list5;
                                    long j2 = js0Var.f17026a;
                                    str = str14;
                                    String str15 = js0Var.b;
                                    str2 = str4;
                                    z = z14;
                                    nn2Var = new nn2(new sdp(j2, str15, str15, ctf0Var.b.a(z14 ? R.string.virtual : R.string.casino, Arrays.copyOf(new Object[0], 0)), z ? R.drawable.ic_nav_virtual : R.drawable.ic_one_x_games, js0Var.c, js0Var.d, z ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder, z ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder, false), new im2(js0Var));
                                } else {
                                    str = str14;
                                    str2 = str4;
                                    z = z14;
                                    it2 = it7;
                                    list2 = list5;
                                    if (oxyVar instanceof lxy) {
                                        nxy nxyVar = ((lxy) oxyVar).b;
                                        long j3 = nxyVar.f24305a;
                                        String str16 = nxyVar.d.b;
                                        nn2Var = new nn2(new sdp(j3, str16, azw.R(str16), str, R.drawable.ic_one_x_games_new, nxyVar.b, "", R.drawable.ic_games_square, R.drawable.ic_games_square, nxyVar.e), new um2(nxyVar, null));
                                    } else if (oxyVar instanceof mxy) {
                                        d0t d0tVar2 = ((mxy) oxyVar).b;
                                        long j4 = d0tVar2.f5282a;
                                        String str17 = d0tVar2.b;
                                        long j5 = d0tVar2.v;
                                        if (j5 != 0) {
                                            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                            rz4.s(j5, ".svg", bzuVarD);
                                            string = ((StringBuilder) bzuVarD.b).toString();
                                        } else {
                                            string = str2;
                                        }
                                        String strB0 = d0tVar2.o;
                                        if (StringsKt.W(str17) || j5 != 146) {
                                            str3 = string;
                                            if (q3d.j(4L, 10L).contains(Long.valueOf(j5))) {
                                                List listJ = q3d.j(strB0, str17, d0tVar2.y.f26920a);
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj8 : listJ) {
                                                    if (!StringsKt.W((String) obj8)) {
                                                        arrayList5.add(obj8);
                                                    }
                                                }
                                                strB0 = CollectionsKt.b0(arrayList5, Separators.DOT, null, null, null, 62);
                                            }
                                        } else {
                                            strB0 = kng0.l(strB0, Separators.DOT, str17);
                                            str3 = string;
                                        }
                                        String str18 = strB0;
                                        boolean z17 = !((d0tVar2.A != boh.UNKNOWN && d0tVar2.z && qzb.E0(d0tVar2)) ? z16 : false);
                                        long j6 = d0tVar2.m;
                                        if (j6 == 0 || d0tVar2.f5282a == j6) {
                                            string2 = y78Var.o(d0tVar2, z17, z16, z15).toString();
                                            i = 0;
                                        } else if (j5 == 66) {
                                            i = 0;
                                            string2 = qzb.d0(d0tVar2, ctf0Var.b.a(R.string.main_tab_title, Arrays.copyOf(new Object[0], 0))) + Separators.SP + ((Object) y78Var.o(d0tVar2, true, (2 & 4) == 0, z15));
                                        } else {
                                            i = 0;
                                            string2 = qzb.d0(d0tVar2, ctf0Var.b.a(R.string.main_tab_title, Arrays.copyOf(new Object[0], 0))) + Separators.SP + ((Object) y78Var.o(d0tVar2, true, (2 & 4) == 0, z15));
                                        }
                                        z2 = z15;
                                        nn2Var = new nn2(new qdp(j4, str3, str18, dwi0.M(d0tVar2), string2, d0tVar2.C, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[i], i)), z2), new tm2(d0tVar2));
                                    }
                                    arrayList4.add(nn2Var);
                                    list5 = list2;
                                    it7 = it2;
                                    z15 = z2;
                                    str14 = str;
                                    z14 = z;
                                    str4 = str2;
                                    z16 = true;
                                }
                                z2 = z15;
                                arrayList4.add(nn2Var);
                                list5 = list2;
                                it7 = it2;
                                z15 = z2;
                                str14 = str;
                                z14 = z;
                                str4 = str2;
                                z16 = true;
                            }
                            t9f.b();
                            return null;
                        }
                        list = list5;
                        xgeVar = new nhe(dyb.o0(arrayList4), z7, z6, ym2Var != null ? ym2Var.h : false);
                    }
                    pz40 pz40Var4 = s6t0.f31722a;
                    imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.viewed_name, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_trash, !list.isEmpty(), ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
                    boolean z18 = xm2Var.n;
                    boolean z19 = xm2Var.o;
                    if (xm2Var.q || list.isEmpty()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    return new pn2(immVar, z18, xgeVar, new zpv(false, z3), z19);
                }
                sgeVar = new whe(z7 ? (byte) 28 : (byte) 10, z7);
                xgeVar = sgeVar;
                list = list5;
                pz40 pz40Var5 = s6t0.f31722a;
                imm immVar2 = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.viewed_name, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_trash, !list.isEmpty(), ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
                boolean z110 = xm2Var.n;
                boolean z111 = xm2Var.o;
                if (xm2Var.q) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                return new pn2(immVar2, z110, xgeVar, new zpv(false, z3), z111);
            case 12:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj4;
                lkz lkzVar = (lkz) obj2;
                Fragment fragmentI = eVar.I(((nzq) obj3).a().getId());
                if (fragmentI != null && !eVar.a0() && lkzVar.compareTo(lkz.c) >= 0) {
                    zb5 zb5Var = new zb5(eVar);
                    zb5Var.p = true;
                    zb5Var.q(fragmentI, lkzVar);
                    zb5Var.h();
                }
                return new mz2((byte) 0);
            case 13:
                Fragment fragment = (Fragment) obj3;
                Context context = (Context) obj2;
                View view3 = (View) obj;
                Object tag = view3.getTag(R.id.binding_reference);
                tag.getClass();
                ((Function1) obj4).invoke((yfu0) tag);
                ViewGroup viewGroup5 = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup5 != null) {
                    if (fragment == null || (eVarC = fragment.C()) == null) {
                        kxq kxqVar = context instanceof kxq ? (kxq) context : null;
                        if (kxqVar != null) {
                            objR = kxqVar.r();
                        }
                    } else {
                        objR = eVarC;
                    }
                    y860.c0(viewGroup5, new b33(objR, b6));
                }
                return Unit.f46060a;
            case 14:
                bhu0 bhu0Var = (bhu0) obj4;
                e7z e7zVar = (e7z) obj3;
                bhu0 bhu0Var2 = (bhu0) obj2;
                x5a x5aVarI = ((fhl) obj).A0().i();
                if (bhu0Var.b.getVisibility() != 8) {
                    bhu0Var.y = true;
                    cg80 cg80Var = e7zVar.o;
                    AndroidComposeView androidComposeView = cg80Var instanceof AndroidComposeView ? (AndroidComposeView) cg80Var : null;
                    if (androidComposeView != null) {
                        Canvas canvasB = vw2.b(x5aVarI);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        bhu0Var2.draw(canvasB);
                    }
                    bhu0Var.y = false;
                }
                return Unit.f46060a;
            case 15:
                gl3 gl3Var = (gl3) obj4;
                ani0 ani0Var = gl3Var.g;
                p7m0 p7m0Var = gl3Var.m;
                String str19 = (String) obj3;
                String str20 = (String) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                rtw rtwVar = th instanceof rtw ? (rtw) th : null;
                if (rtwVar == null || rtwVar.f31096a != 416) {
                    boolean z20 = th instanceof xto;
                    vk3 vk3Var = vk3.f37556a;
                    if (z20) {
                        ani0Var.b(new om3(true));
                        p7m0Var.getClass();
                        p7m0Var.o(null, vk3Var);
                    } else if (th instanceof qoe) {
                        gl3Var.k.o(str19);
                        rk3 rk3Var = new rk3(str19, str20);
                        p7m0Var.getClass();
                        p7m0Var.o(null, rk3Var);
                    } else {
                        ani0Var.b(new om3(false));
                        p7m0Var.getClass();
                        p7m0Var.o(null, vk3Var);
                    }
                } else {
                    ani0Var.b(mm3.f22019a);
                    gl3Var.j.a(str19);
                    p7m0Var.getClass();
                    p7m0Var.o(null, uk3.f35807a);
                }
                return Unit.f46060a;
            case 16:
                pru pruVar = (pru) obj3;
                bzt bztVar = (bzt) obj2;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                int iOrdinal2 = ((AuthType) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    xn4Var = xn4.f41154a;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    xn4Var = xn4.b;
                }
                return new m54((xn4) a8k0.H(vzg0Var, "KEY_AUTH_TYPE", xn4Var), ((Boolean) a8k0.H(vzg0Var, "KEY_ANIMATE_CHANGES", Boolean.FALSE)).booleanValue(), pruVar.a().N.m, bztVar.f3488a.a().A, false, -1L);
            case 17:
                Fragment fragment2 = (Fragment) obj3;
                Function1 function2 = (Function1) obj2;
                ((lwk) obj).getClass();
                v1r v1rVarR = fragment2.n0().r();
                v1rVarR.u0("OTP_CONFIRMATION_RESULT_KEY", fragment2, new sa4(function2, (byte) 0));
                v1rVarR.u0("KEY_LOGIN_QR_SCANNER_REQUEST", fragment2, new sa4(function2, (byte) 1));
                vdb.j0(fragment2, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", new wc2(function2, (byte) 7));
                ccq0.V(fragment2, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_SUPPORT", new zk2(function2, (byte) 22));
                ccq0.T(fragment2, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_SUPPORT", new zk2(function2, (byte) 23));
                fragment2.F().u0("AUTH_LOGIN_DEFAULT_KEY_REQUEST_CAPTCHA_CODE_DIALOG", fragment2, new hi("AUTH_LOGIN_DEFAULT_KEY_REQUEST_CAPTCHA_CODE_DIALOG", new zk2(function2, b3), new wc2(function2, b2)));
                sj3.A0(fragment2, "KEY_AUTH_ENTRY_POINT_REQUEST", new ag0(function2, (byte) 13));
                sj3.A0(fragment2, "KEY_PICKER_MODEL_REQUEST", new ag0(function2, (byte) 14));
                sj3.A0(fragment2, "KEY_PICKER_COUNTRY_ID_REQUEST", new ag0(function2, (byte) 11));
                sj3.A0(fragment2, "PICKER_DIALOG_TAG", new ag0(function2, (byte) 12));
                bcm0.x(fragment2.n0().getWindow(), false);
                return new va4((jdk0) obj4, fragment2);
            case 18:
                pkk0 pkk0Var = (pkk0) obj3;
                ze4 ze4Var = (ze4) obj2;
                qek0 qek0Var = ze4.g2;
                ((me4) obj).getClass();
                ((ypq) ((wpq) obj4)).b(false);
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                ze4Var.K0().x(ce4.f4194a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pkk0 pkk0Var2 = (pkk0) obj3;
                cj4 cj4Var = (cj4) obj2;
                ni4 ni4Var = (ni4) obj;
                gfk0 gfk0Var2 = cj4.U1;
                ni4Var.getClass();
                ((ypq) ((wpq) obj4)).b(false);
                if (pkk0Var2 != null) {
                    ((r3k) pkk0Var2).a();
                }
                cj4Var.G0().x(ni4Var);
                return Unit.f46060a;
            case 20:
                vne vneVar2 = (vne) obj4;
                n75 n75Var = (n75) obj3;
                d9z d9zVar2 = (d9z) obj2;
                r75 r75Var = (r75) obj;
                pek0 pek0Var = n75.S1;
                r75Var.getClass();
                if (r75Var.equals(o75.f24768a)) {
                    qjj.W(vneVar2, null, null, new kn1(d9zVar2, objR, b7), 3);
                } else if (r75Var instanceof p75) {
                    p75 p75Var = (p75) r75Var;
                    String str21 = p75Var.f26490a;
                    String str22 = p75Var.b;
                    String str23 = p75Var.c;
                    ii iiVar4 = n75Var.M1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields2 = new DialogFields((CharSequence) str21, (CharSequence) str22, (CharSequence) str23, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC4 = n75Var.C();
                    eVarC4.getClass();
                    iiVar4.d(dialogFields2, eVarC4);
                } else if (r75Var instanceof q75) {
                    String str24 = ((q75) r75Var).f28233a;
                    wdk0 wdk0Var2 = n75Var.L1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, str24, null, null, null, null, 124), n75Var, null, null, false, null, 1020);
                }
                ((g85) n75Var.O1.getValue()).N(h75.f12561a);
                return Unit.f46060a;
            case 21:
                s75 s75Var = (s75) obj;
                s75Var.getClass();
                return new v75(s75Var, ((pru) obj2).a(), ((iqt) obj3).f15225a.a(), (ctf0) obj4);
            case 22:
                return a(obj);
            case 23:
                View view4 = (View) obj4;
                iiy[] iiyVarArr = iw5.j2;
                ((lwk) obj).getClass();
                vv5 vv5Var = new vv5((ComposeView) obj3, (qz40) obj2, b6);
                view4.addOnLayoutChangeListener(vv5Var);
                return new pr0(view4, vv5Var, b5);
            case 24:
                return b(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return c(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return g(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return i(obj);
            default:
                ArrayList arrayList6 = (ArrayList) obj4;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                fg8 fg8Var = fg8.b;
                hczVar5.f(arrayList6.size(), new j13(arrayList6, (byte) 3), new at7(new nk7((byte) 16), arrayList6, b5), new ugd(802480018, true, new c8((List) arrayList6, obj3, obj2, b4)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ on(vq vqVar, Fragment fragment, ms2 ms2Var, xdr xdrVar) {
        this.f25527a = (byte) 1;
        this.b = vqVar;
        this.c = ms2Var;
        this.d = xdrVar;
    }

    public /* synthetic */ on(jdk0 jdk0Var, Fragment fragment, u8i u8iVar, Function1 function1) {
        this.f25527a = (byte) 17;
        this.b = jdk0Var;
        this.c = fragment;
        this.d = function1;
    }

    public /* synthetic */ on(Object obj, Object obj2, Object obj3, byte b) {
        this.f25527a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
