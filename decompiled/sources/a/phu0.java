package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class phu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f27015a = new ugd(1643096833, false, new wgd(18));
    public static final ugd b = new ugd(179086994, false, new ahd(1));
    public static final ugd c = new ugd(656796406, false, new ahd(2));
    public static final ugd d = new ugd(467890234, false, new ahd(3));
    public static final ugd e = new ugd(372569497, false, new fhd(10));
    public static final ugd f = new ugd(-373237854, false, new ehd(20));
    public static final ugd g = new ugd(1590267926, false, new ihd(24));
    public static final ugd h = new ugd(-375981155, false, new qhd(19));
    public static final jge0 i;
    public static final g4s0 j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;

    static {
        new ugd(-1734693062, false, new shd((byte) 1));
        i = new jge0(0.0f, 0.0f, 10.0f, 10.0f);
        j = new g4s0((byte) 24);
        k = new String[]{"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", RemoteMessageConst.MSGTYPE, "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
        l = new String[]{"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
        m = new String[]{"items"};
        n = new String[]{"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", CommonCode.MapKey.TRANSACTION_ID, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    }

    public static final void A(oms0 oms0Var, cms0 cms0Var, Object obj, Object obj2, cfq cfqVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(oms0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(cms0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(obj) : fetVar.i(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar.g(obj2) : fetVar.i(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? fetVar.g(cfqVar) : fetVar.i(cfqVar) ? 16384 : 8192;
        }
        if (!fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.X();
        } else if (oms0Var.h()) {
            cms0Var.g(obj, obj2, cfqVar);
        } else {
            cms0Var.h(obj2, cfqVar, null, null);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) oms0Var, (Object) cms0Var, obj, obj2, (Object) cfqVar, i2, (byte) 29);
        }
    }

    public static final j83 B(String str, boolean z, smk0 smk0Var) {
        str.getClass();
        if (!z) {
            return new j83(str);
        }
        h83 h83Var = new h83();
        h83Var.c(str);
        h83Var.c(Separators.SP);
        int iG = h83Var.g(smk0Var);
        try {
            h83Var.c("x2");
            return h83Var.h();
        } finally {
            h83Var.d(iG);
        }
    }

    public static edy C(int i2, int i3, List list, String str, List list2, Boolean bool, int i4) {
        if ((i4 & 8) != 0) {
            str = "or";
        }
        if ((i4 & 32) != 0) {
            list2 = null;
        }
        if ((i4 & 2048) != 0) {
            bool = null;
        }
        bzu bzuVar = new bzu((byte) 19);
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jdy jdyVarB = ncy.b(Long.valueOf(((Number) it.next()).longValue()));
                jdyVarB.getClass();
                arrayList.add(jdyVarB);
            }
            jdy jdyVarC = ncy.c(str);
            jdyVarC.getClass();
            bzuVar.h(new edy(linkedHashMap), "categoriesFilter");
        }
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                jdy jdyVarB2 = ncy.b(Long.valueOf(((Number) it2.next()).longValue()));
                jdyVarB2.getClass();
                arrayList2.add(jdyVarB2);
            }
            bzuVar.h(new yby(arrayList2), "partIds");
        }
        if (bool != null) {
            cww.E(bzuVar, "isTest", bool);
        }
        cww.F(bzuVar, "skip", Integer.valueOf(i2));
        cww.F(bzuVar, "limit", Integer.valueOf(i3));
        return bzuVar.a();
    }

    public static final vls0 D(oms0 oms0Var, lxs0 lxs0Var, String str, fet fetVar, int i2, int i3) {
        uls0 uls0Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zG = fetVar.g(oms0Var);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            objP = new vls0(oms0Var, lxs0Var, str);
            fetVar.o0(objP);
        }
        vls0 vls0Var = (vls0) objP;
        boolean zG2 = fetVar.g(oms0Var) | fetVar.i(vls0Var);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == obj) {
            objP2 = new xis0((Object) oms0Var, (Object) vls0Var, (byte) 5);
            fetVar.o0(objP2);
        }
        m0x0.o(vls0Var, (Function1) objP2, fetVar);
        if (oms0Var.h() && (uls0Var = (uls0) ((hgk0) vls0Var.b).getValue()) != null) {
            oms0 oms0Var2 = vls0Var.c;
            uls0Var.f35890a.g(uls0Var.c.invoke(oms0Var2.f().d()), uls0Var.c.invoke(oms0Var2.f().b()), (cfq) uls0Var.b.invoke(oms0Var2.f()));
        }
        return vls0Var;
    }

    public static final cms0 E(oms0 oms0Var, Object obj, Object obj2, cfq cfqVar, lxs0 lxs0Var, fet fetVar, int i2) {
        Object obj3;
        Object obj4;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z = true;
        boolean z2 = (i4 > 4 && fetVar.g(oms0Var)) || (i2 & 6) == 4;
        Object objP = fetVar.P();
        Object obj5 = ukd.f35823a;
        if (z2 || objP == obj5) {
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                obj3 = obj2;
                t73 t73Var = (t73) lxs0Var.f20832a.invoke(obj3);
                t73Var.d();
                obj4 = obj;
                Object cms0Var = new cms0(oms0Var, obj4, t73Var, lxs0Var);
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                fetVar.o0(cms0Var);
                objP = cms0Var;
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        cms0 cms0Var2 = (cms0) objP;
        int i5 = (i2 >> 3) & 8;
        int i6 = i2 << 3;
        A(oms0Var, cms0Var2, obj4, obj3, cfqVar, fetVar, i3 | (i5 << 6) | (i6 & 896) | (i5 << 9) | (i6 & 7168) | (57344 & i6));
        if ((i4 <= 4 || !fetVar.g(oms0Var)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zG = fetVar.g(cms0Var2) | z;
        Object objP2 = fetVar.P();
        if (zG || objP2 == obj5) {
            objP2 = new xis0((Object) oms0Var, (Object) cms0Var2, (byte) 2);
            fetVar.o0(objP2);
        }
        m0x0.o(cms0Var2, (Function1) objP2, fetVar);
        return cms0Var2;
    }

    public static final mm40 F(mm40 mm40Var, ymx ymxVar, d6x d6xVar, boolean z, gy40 gy40Var, Function0 function0, fet fetVar, int i2, int i3) {
        mm40Var.getClass();
        function0.getClass();
        if ((i3 & 1) != 0) {
            ymxVar = ymx.INTERVAL_200;
        }
        if ((i3 & 2) != 0) {
            d6xVar = null;
        }
        boolean z2 = true;
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            gy40Var = null;
        }
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = androidx.compose.runtime.e.c(0L);
            fetVar.o0(objP);
        }
        egk0 egk0Var = (egk0) objP;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && fetVar.e(ymxVar.ordinal())) || (i2 & 48) == 32;
        if ((((458752 & i2) ^ 196608) <= 131072 || !fetVar.g(function0)) && (i2 & 196608) != 131072) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objP2 = fetVar.P();
        if (z4 || objP2 == cl5Var) {
            objP2 = new zij(ymxVar, function0, egk0Var, (byte) 0);
            fetVar.o0(objP2);
        }
        return y860.W(mm40Var, gy40Var, d6xVar, z, null, (Function0) objP2, 24);
    }

    public static final Function0 G(int i2, int i3, fet fetVar, Function0 function0) {
        ymx ymxVar = ymx.INTERVAL_500;
        function0.getClass();
        if ((i3 & 1) != 0) {
            ymxVar = ymx.INTERVAL_200;
        }
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = androidx.compose.runtime.e.c(0L);
            fetVar.o0(objP);
        }
        egk0 egk0Var = (egk0) objP;
        boolean zG = ((((i2 & 14) ^ 6) > 4 && fetVar.e(ymxVar.ordinal())) || (i2 & 6) == 4) | fetVar.g(function0);
        Object objP2 = fetVar.P();
        if (zG || objP2 == cl5Var) {
            objP2 = new zij(ymxVar, function0, egk0Var, (byte) 1);
            fetVar.o0(objP2);
        }
        return (Function0) objP2;
    }

    public static final mm40 H(mm40 mm40Var, ltc ltcVar, int i2) {
        mm40Var.getClass();
        if ((i2 & 1) != 0) {
            ltcVar = new ktc(null, 3);
        }
        mm40 mm40VarE = mm40Var.e(q3q.b);
        mm40VarE.getClass();
        return mm40VarE.e(new yij(ltcVar));
    }

    public static final ey40 I(wai0 wai0Var, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            tai0 tai0VarA = wai0Var.a();
            e7z e7zVar = tai0VarA.c;
            if (e7zVar.J() && e7zVar.I()) {
                jge0 jge0VarG = tai0VarA.g();
                ey40 ey40Var = new ey40(48);
                pv00 pv00Var = new pv00((byte) 29);
                pv00Var.p(m2x.C(jge0VarG));
                L(new pv00((byte) 29), pv00Var, ey40Var, tai0VarA, tai0VarA, function1);
                return ey40Var;
            }
            ey40 ey40Var2 = hkx.f13229a;
            ey40Var2.getClass();
            return ey40Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void J(pv00 pv00Var, pv00 pv00Var2, ey40 ey40Var, tai0 tai0Var, tai0 tai0Var2, Function1 function1) {
        pv00 pv00Var3 = pv00Var;
        Region region = (Region) pv00Var3.f27640a;
        pv00 pv00Var4 = pv00Var2;
        Region region2 = (Region) pv00Var4.f27640a;
        e7z e7zVar = tai0Var2.c;
        e7z e7zVar2 = tai0Var2.c;
        if (!e7zVar.J() || !e7zVar2.I() || region2.isEmpty()) {
            if (tai0Var2.n()) {
                K(ey40Var, tai0Var, tai0Var2);
                return;
            }
            return;
        }
        jge0 jge0VarM = tai0Var2.m();
        if (jge0VarM.j()) {
            yzj yzjVarF = tai0Var2.f();
            if (yzjVarF == null) {
                rdx rdxVar = (rdx) e7zVar2.h1.d;
                jge0VarM = k7x.C(rdxVar).w(rdxVar, false);
            } else {
                lm40 lm40Var = ((lm40) yzjVarF).f20279a;
                Object objG = tai0Var2.d.f23193a.g(mai0.b);
                if (objG == null) {
                    objG = null;
                }
                boolean z = objG != null;
                if (!lm40Var.f20279a.n) {
                    jge0VarM = jge0.e;
                } else if (z) {
                    jge0VarM = vcc.X(lm40Var, 8).D1();
                } else {
                    s460 s460VarX = vcc.X(lm40Var, 8);
                    jge0VarM = k7x.C(s460VarX).w(s460VarX, false);
                }
            }
        }
        mkx mkxVarC = m2x.C(jge0VarM);
        pv00Var3.p(mkxVarC);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = tai0Var2.f;
            tai0 tai0Var3 = tai0Var;
            if (i2 == tai0Var3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            vai0 vai0Var = new vai0(tai0Var2, new mkx(bounds.left, bounds.top, bounds.right, bounds.bottom));
            ey40 ey40Var2 = ey40Var;
            ey40Var2.j(i2, vai0Var);
            List listI = tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0);
            int size = listI.size() - 1;
            while (-1 < size) {
                if (!((Boolean) function1.invoke(listI.get(size))).booleanValue()) {
                    J(pv00Var3, pv00Var4, ey40Var2, tai0Var3, (tai0) listI.get(size), function1);
                }
                size--;
                pv00Var3 = pv00Var;
                pv00Var4 = pv00Var2;
                ey40Var2 = ey40Var;
                tai0Var3 = tai0Var;
            }
            if (S(tai0Var2)) {
                region2.op(mkxVarC.f21964a, mkxVarC.b, mkxVarC.c, mkxVarC.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void K(ey40 ey40Var, tai0 tai0Var, tai0 tai0Var2) {
        e7z e7zVar;
        tai0 tai0VarL = tai0Var2.l();
        jge0 jge0VarG = (tai0VarL == null || (e7zVar = tai0VarL.c) == null || !e7zVar.J()) ? i : tai0VarL.g();
        int i2 = tai0Var2.f;
        if (i2 == tai0Var.f) {
            i2 = -1;
        }
        ey40Var.j(i2, new vai0(tai0Var2, m2x.C(jge0VarG)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:85:0x0182  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    public static final void L(pv00 pv00Var, pv00 pv00Var2, ey40 ey40Var, tai0 tai0Var, tai0 tai0Var2, Function1 function1) {
        int size;
        boolean z;
        jge0 jge0VarD1;
        tai0 tai0Var3 = tai0Var;
        Function1 function2 = function1;
        int i2 = tai0Var3.f;
        Region region = (Region) pv00Var.f27640a;
        pv00 pv00Var3 = pv00Var2;
        Region region2 = (Region) pv00Var3.f27640a;
        e7z e7zVar = tai0Var2.c;
        nai0 nai0Var = tai0Var2.d;
        e7z e7zVar2 = tai0Var2.c;
        int i3 = tai0Var2.f;
        boolean z2 = (e7zVar.J() && e7zVar2.I()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z2 || tai0Var2.n()) {
                mkx mkxVarC = m2x.C(tai0Var2.m());
                pv00Var.p(mkxVarC);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (tai0Var2.n()) {
                        K(ey40Var, tai0Var, tai0Var2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            ey40Var.j(i3, new vai0(tai0Var2, new mkx(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                ey40Var.j(i3, new vai0(tai0Var2, new mkx(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listI = tai0Var2.i((4 & 1) != 0 ? !tai0Var2.b : false, (4 & 2) == 0);
                if (nai0Var.c) {
                    tai0 tai0VarL = tai0Var2.l();
                    while (true) {
                        if (tai0VarL == null) {
                            tai0VarL = null;
                            break;
                        }
                        hz40 hz40Var = tai0VarL.d.f23193a;
                        if (hz40Var.c(xai0.w) || hz40Var.c(xai0.v)) {
                            break;
                        } else {
                            tai0VarL = tai0VarL.l();
                        }
                    }
                    if (tai0VarL == null) {
                        z = false;
                    } else {
                        s460 s460VarD = tai0Var2.d();
                        if (s460VarD == null) {
                            s460VarD = null;
                        } else {
                            if (!s460VarD.g1().n) {
                                s460VarD = null;
                            }
                            if (s460VarD == null) {
                                s460VarD = null;
                            }
                        }
                        s460 s460VarD2 = tai0VarL.d();
                        if (s460VarD2 == null) {
                            s460VarD2 = null;
                        } else {
                            if (!s460VarD2.g1().n) {
                                s460VarD2 = null;
                            }
                            if (s460VarD2 == null) {
                                s460VarD2 = null;
                            }
                        }
                        if (s460VarD == null || s460VarD2 == null) {
                            z = false;
                        } else {
                            jge0 jge0VarW = s460VarD2.w(s460VarD, false);
                            z = !jge0VarW.equals(jge0VarW.i(k9x.r(0L, n2x.Q(s460VarD2.c))));
                        }
                    }
                    if (z) {
                        pv00 pv00Var4 = new pv00((byte) 29);
                        yzj yzjVarF = tai0Var2.f();
                        if (yzjVarF == null) {
                            rdx rdxVar = (rdx) e7zVar2.h1.d;
                            jge0VarD1 = k7x.C(rdxVar).w(rdxVar, false);
                        } else {
                            lm40 lm40Var = ((lm40) yzjVarF).f20279a;
                            Object objG = nai0Var.f23193a.g(mai0.b);
                            boolean z3 = (objG == null ? null : objG) != null;
                            if (!lm40Var.f20279a.n) {
                                jge0VarD1 = jge0.e;
                            } else if (z3) {
                                jge0VarD1 = vcc.X(lm40Var, 8).D1();
                            } else {
                                s460 s460VarX = vcc.X(lm40Var, 8);
                                jge0VarD1 = k7x.C(s460VarX).w(s460VarX, false);
                            }
                        }
                        pv00Var4.p(m2x.C(jge0VarD1));
                        int size2 = listI.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) function2.invoke(listI.get(size2))).booleanValue()) {
                                J(new pv00((byte) 29), pv00Var4, ey40Var, tai0Var3, (tai0) listI.get(size2), function2);
                            }
                            size2--;
                            tai0Var3 = tai0Var;
                        }
                    } else {
                        size = listI.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) function2.invoke(listI.get(size))).booleanValue()) {
                                L(pv00Var, pv00Var3, ey40Var, tai0Var, (tai0) listI.get(size), function2);
                            }
                            size--;
                            pv00Var3 = pv00Var2;
                            function2 = function1;
                        }
                    }
                } else {
                    size = listI.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) function2.invoke(listI.get(size))).booleanValue()) {
                            L(pv00Var, pv00Var3, ey40Var, tai0Var, (tai0) listI.get(size), function2);
                        }
                        size--;
                        pv00Var3 = pv00Var2;
                        function2 = function1;
                    }
                }
                if (S(tai0Var2)) {
                    region2.op(mkxVarC.f21964a, mkxVarC.b, mkxVarC.c, mkxVarC.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final sx3 M(View view) {
        view.getClass();
        return new sx3(new nhu0(view, null), (byte) 3);
    }

    public static final gbn N(Function1 function1) {
        return new gbn(new o33((byte) 24), new lq4(3, (byte) 0), new wc2(function1, (byte) 15), zx3.j);
    }

    public static final boolean O(kr5 kr5Var) {
        kr5Var.getClass();
        boolean z = kr5Var.l;
        String str = kr5Var.v;
        return z && StringsKt.O(str, "casino", true) && Intrinsics.d(Uri.parse(str).getQueryParameter(Payload.TYPE), "game");
    }

    public static final boolean P(lr5 lr5Var) {
        lr5Var.getClass();
        or5 or5Var = lr5Var.l;
        if (or5Var != null) {
            if (or5Var instanceof mr5) {
                or5Var.getClass();
                return Q(((mr5) or5Var).f22252a);
            }
            if (or5Var instanceof nr5) {
                or5Var.getClass();
                return O(((nr5) or5Var).f23986a);
            }
        }
        t9f.b();
        return false;
    }

    public static final boolean Q(uvc uvcVar) {
        uvcVar.getClass();
        String str = uvcVar.l;
        if (!StringsKt.O(str, "casino", true)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        return Intrinsics.d(uri.getQueryParameter(Payload.TYPE), "game");
    }

    public static final boolean R(tai0 tai0Var) {
        s460 s460VarD = tai0Var.d();
        hz40 hz40Var = tai0Var.d.f23193a;
        return (s460VarD != null ? s460VarD.p1() : false) || hz40Var.c(xai0.q) || hz40Var.c(xai0.p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean S(tai0 tai0Var) {
        if (!R(tai0Var)) {
            nai0 nai0Var = tai0Var.d;
            if (nai0Var.c) {
                return true;
            }
            hz40 hz40Var = nai0Var.f23193a;
            Object[] objArr = hz40Var.b;
            Object[] objArr2 = hz40Var.c;
            long[] jArr = hz40Var.f13891a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((zai0) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static void T(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final String U(lr5 lr5Var) {
        String queryParameter;
        lr5Var.getClass();
        or5 or5Var = lr5Var.l;
        if (or5Var != null) {
            if (or5Var instanceof mr5) {
                uvc uvcVar = ((mr5) or5Var).f22252a;
                uvcVar.getClass();
                if (!Q(uvcVar)) {
                    return "";
                }
                Uri uri = Uri.parse(uvcVar.l);
                uri.getClass();
                String queryParameter2 = uri.getQueryParameter(ParameterNames.ID);
                return queryParameter2 == null ? "" : queryParameter2;
            }
            if (or5Var instanceof nr5) {
                kr5 kr5Var = ((nr5) or5Var).f23986a;
                kr5Var.getClass();
                return (!O(kr5Var) || (queryParameter = Uri.parse(kr5Var.v).getQueryParameter(ParameterNames.ID)) == null) ? "" : queryParameter;
            }
        }
        t9f.b();
        return null;
    }

    public static final oms0 V(p4 p4Var, String str, fet fetVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z = true;
        byte b2 = 0;
        boolean z2 = (i4 > 4 && fetVar.g(p4Var)) || (i2 & 6) == 4;
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (z2 || objP == obj) {
            rfk0 rfk0VarJ = vdx.J();
            Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
            rfk0 rfk0VarW = vdx.W(rfk0VarJ);
            try {
                Object oms0Var = new oms0(p4Var, null, str);
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                fetVar.o0(oms0Var);
                objP = oms0Var;
            } catch (Throwable th) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th;
            }
        }
        oms0 oms0Var2 = (oms0) objP;
        if (p4Var instanceof pvh0) {
            fetVar.e0(-1357398105);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            Object obj2 = (vne) objP2;
            boolean zI = fetVar.i(obj2) | ((i4 > 4 && fetVar.g(p4Var)) || (i2 & 6) == 4);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new xis0((Object) p4Var, obj2, (byte) 3);
                fetVar.o0(objP3);
            }
            m0x0.o(obj2, (Function1) objP3, fetVar);
            pvh0 pvh0Var = (pvh0) p4Var;
            Object value = ((hgk0) pvh0Var.d).getValue();
            Object value2 = ((hgk0) pvh0Var.c).getValue();
            if ((i4 <= 4 || !fetVar.g(p4Var)) && (i2 & 6) != 4) {
                z = false;
            }
            Object objP4 = fetVar.P();
            if (z || objP4 == obj) {
                objP4 = new tsr0(p4Var, null);
                fetVar.o0(objP4);
            }
            m0x0.v(value, value2, (Function2) objP4, fetVar);
            fetVar.r(false);
        } else {
            fetVar.e0(-1356407283);
            oms0Var2.a(p4Var.A0(), fetVar, 0);
            fetVar.r(false);
        }
        boolean zG = fetVar.g(oms0Var2);
        Object objP5 = fetVar.P();
        if (zG || objP5 == obj) {
            objP5 = new pms0(oms0Var2, b2);
            fetVar.o0(objP5);
        }
        m0x0.o(oms0Var2, (Function1) objP5, fetVar);
        return oms0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    public static final n52 W(jih jihVar) {
        List list;
        List list2;
        if (jihVar != null) {
            Object obj = jihVar.g;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
            if (list == null) {
                list = iun.f15405a;
            }
        } else {
            list = iun.f15405a;
        }
        if (jihVar != null) {
            Object obj2 = jihVar.f;
            e0g0 e0g0Var2 = j0g0.b;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
            if (list2 == null) {
                list2 = iun.f15405a;
            }
        } else {
            list2 = iun.f15405a;
        }
        return new n52(list2, list);
    }

    public static final v1o0 X(d0t d0tVar, ctf0 ctf0Var, List list, String str, v5l0 v5l0Var, m5l0 m5l0Var, boolean z, boolean z2, boolean z3, boolean z4, String str2, y78 y78Var) {
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        y78Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            return new q1o0(d0tVar.f5282a, afn0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new d2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), f1t0.U(d0tVar), f1t0.X(d0tVar), rqsVar.f30947a, f1t0.V(d0tVar, ctf0Var), kpb.S(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 1) {
            return new u1o0(d0tVar.f5282a, afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new j3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), f1t0.U(d0tVar), f1t0.X(d0tVar), rqsVar.f30947a, f1t0.V(d0tVar, ctf0Var), kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 2) {
            return new t1o0(d0tVar.f5282a, afn0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new b3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), f1t0.U(d0tVar), f1t0.X(d0tVar), rqsVar.f30947a, f1t0.V(d0tVar, ctf0Var), kpb.S(d0tVar), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 3) {
            return new s1o0(d0tVar.f5282a, afn0.s(null, d0tVar, str, rqsVar.f30947a, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, false, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new t2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), f1t0.U(d0tVar), f1t0.X(d0tVar), f1t0.V(d0tVar, ctf0Var), kpb.C(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), new n0x(dtb.F(str)));
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        long j2 = d0tVar.f5282a;
        k4i k4iVarR = afn0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
        String strC0 = qzb.c0(d0tVar);
        String strR0 = qzb.r0(d0tVar);
        return new r1o0(j2, k4iVarR, new l2o0(kpb.C(d0tVar), f1t0.U(d0tVar), f1t0.X(d0tVar), strC0, strR0, f1t0.V(d0tVar, ctf0Var), d0tVar.h ? ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)) : rqsVar.f30947a, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
    }

    public static final gwe Y(ms2 ms2Var) {
        ms2Var.getClass();
        if (ms2Var != null) {
            if ((ms2Var instanceof hs2) || (ms2Var instanceof gs2) || (ms2Var instanceof fs2) || (ms2Var instanceof jq2)) {
                return gwe.CHAMPIONSHIP;
            }
            if ((ms2Var instanceof gq2) || (ms2Var instanceof hq2) || (ms2Var instanceof iq2)) {
                return gwe.EXPRESS_CRICKET;
            }
            if ((ms2Var instanceof rq2) || (ms2Var instanceof lq2) || (ms2Var instanceof tq2) || (ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof uq2)) {
                return gwe.CYBER;
            }
            if ((ms2Var instanceof wq2) || (ms2Var instanceof xq2) || (ms2Var instanceof aq2) || (ms2Var instanceof bq2) || (ms2Var instanceof fq2) || (ms2Var instanceof cq2)) {
                return gwe.FAVORITE;
            }
            if ((ms2Var instanceof jr2) || (ms2Var instanceof kr2) || (ms2Var instanceof lr2)) {
                return gwe.NEW_POPULAR;
            }
            if (ms2Var instanceof br2) {
                return gwe.INSIGHTS;
            }
            if ((ms2Var instanceof zq2) || (ms2Var instanceof eq2) || (ms2Var instanceof vq2)) {
                return gwe.GAME;
            }
            if ((ms2Var instanceof pr2) || (ms2Var instanceof qr2)) {
                return gwe.SEARCH;
            }
            if (ms2Var instanceof is2) {
                return gwe.NOTIFICATIONS;
            }
            if (ms2Var instanceof js2) {
                return gwe.NOTIFICATIONS;
            }
            if ((ms2Var instanceof mr2) || (ms2Var instanceof ir2) || (ms2Var instanceof hr2) || (ms2Var instanceof gr2) || (ms2Var instanceof fr2)) {
                return gwe.OLD_POPULAR;
            }
            if (ms2Var instanceof dq2) {
                return gwe.HISTORY;
            }
            if (ms2Var instanceof nr2) {
                return gwe.RELATED;
            }
            if ((ms2Var instanceof dr2) || (ms2Var instanceof ls2) || (ms2Var instanceof ur2) || (ms2Var instanceof sr2) || (ms2Var instanceof vr2) || (ms2Var instanceof xr2) || (ms2Var instanceof zr2) || (ms2Var instanceof es2) || (ms2Var instanceof yr2) || (ms2Var instanceof as2) || (ms2Var instanceof bs2) || (ms2Var instanceof cs2) || (ms2Var instanceof tr2) || (ms2Var instanceof wr2) || (ms2Var instanceof kq2) || (ms2Var instanceof oq2) || (ms2Var instanceof qq2) || (ms2Var instanceof pq2) || (ms2Var instanceof sq2) || (ms2Var instanceof rr2) || (ms2Var instanceof ar2) || (ms2Var instanceof er2) || (ms2Var instanceof cr2) || (ms2Var instanceof ks2) || (ms2Var instanceof yq2) || (ms2Var instanceof or2)) {
                return gwe.DEFAULT;
            }
        }
        t9f.b();
        return null;
    }

    public static final oms0 Z(Object obj, String str, fet fetVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = new oms0(new uz40(obj), null, str);
            fetVar.o0(objP);
        }
        oms0 oms0Var = (oms0) objP;
        oms0Var.a(obj, fetVar, (i2 & 8) | 48 | (i2 & 14));
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new pms0(oms0Var, (byte) 1);
            fetVar.o0(objP2);
        }
        m0x0.o(oms0Var, (Function1) objP2, fetVar);
        return oms0Var;
    }

    public static final void a(mm40 mm40Var, ldc0 ldc0Var, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(2117646442);
        int i3 = i2 | 6 | (fetVar.g(ldc0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            se seVar = ldc0Var.b;
            mm40Var2 = jm40.b;
            if (seVar == null) {
                fetVar.e0(-1969267570);
                fetVar.r(false);
            } else {
                fetVar.e0(-1969267569);
                mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                float f2 = xfn.b(pkd.d(fetVar)).e;
                float f3 = xfn.b(pkd.d(fetVar)).e;
                zcl zclVar = qmk.f28987a;
                rcb.r(s5x0.M(mm40VarD, f2, 12.0f, f3, 6.0f), seVar, function0, fetVar, i3 & 896, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, ldc0Var, function0, i2, (byte) 25);
        }
    }

    public static final void b(mm40 mm40Var, bdz bdzVar, bzl bzlVar, fi2 fi2Var, float f2, Function1 function1, fet fetVar, int i2) {
        bdz bdzVar2;
        bzl bzlVar2;
        mm40 mm40Var2;
        mm40 mm40Var3;
        mm40 mm40Var4;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-270744735);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            bdzVar2 = bdzVar;
            i3 |= fetVar2.g(bdzVar2) ? 32 : 16;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i2 & 384) == 0) {
            bzlVar2 = bzlVar;
            i3 |= fetVar2.g(bzlVar2) ? 256 : 128;
        } else {
            bzlVar2 = bzlVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(fi2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                mm40Var3 = jm40.b;
            } else {
                fetVar2.X();
                mm40Var3 = mm40Var;
            }
            fetVar2.s();
            int i4 = 458752 & i3;
            boolean z3 = i4 == 131072;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new ja2(function1, (byte) 17);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 131072;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 18);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            mm40 mm40VarE = mm40Var3.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mde mdeVar = fi2Var.b;
            if (mdeVar instanceof wce) {
                fetVar2.e0(2064823557);
                dub.C(null, (wce) mdeVar, function1, fetVar2, (i3 >> 9) & 896, 1);
                fetVar2.r(false);
                z = true;
                mm40Var4 = mm40Var3;
            } else {
                if (mdeVar instanceof bde) {
                    fetVar2.e0(2065031970);
                    bdz bdzVar3 = bdzVar2;
                    mm40Var4 = mm40Var3;
                    z2 = true;
                    q(f2, ((i3 << 3) & 896) | ((i3 >> 9) & 112) | 3072 | (57344 & (i3 << 6)) | ((i3 << 9) & 234881024), bzlVar2, fetVar2, ((bde) mdeVar).f2395a, bdzVar3, null, function1, false, fi2Var.c, fi2Var.d);
                    fetVar2.r(false);
                } else {
                    mm40Var4 = mm40Var3;
                    if (mdeVar instanceof gde) {
                        fetVar2.e0(2065536867);
                        int i5 = ((i3 << 9) & 234881024) | (57344 & (i3 << 6)) | ((i3 >> 9) & 112) | 3072 | ((i3 << 3) & 896);
                        z2 = true;
                        q(f2, i5, bzlVar, fetVar2, ((gde) mdeVar).f11102a, bdzVar, null, function1, true, fi2Var.c, fi2Var.d);
                        fetVar2.r(false);
                    } else {
                        z = true;
                        if (!(mdeVar instanceof sce)) {
                            throw b1j.f(1729174794, fetVar2, false);
                        }
                        fetVar2.e0(2066032712);
                        n(null, bdzVar, bzlVar, fi2Var.c, (sce) mdeVar, function1, fetVar, i3 & 459760);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                z = z2;
            }
            fetVar2.r(z);
            mm40Var2 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zh2(mm40Var2, bdzVar, bzlVar, fi2Var, f2, function1, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:105:0x015d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0160  */
    /* JADX WARN: Code duplicated, block: B:109:0x0166  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:113:0x0176  */
    /* JADX WARN: Code duplicated, block: B:115:0x017c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0189  */
    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0193  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x021a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0254  */
    /* JADX WARN: Code duplicated, block: B:157:0x0267  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    public static final void c(final String str, final zx7 zx7Var, float f2, final float f3, final float f4, final float f5, long j2, qge qgeVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, final int i2, final int i3, final int i4) {
        long jE;
        qge qgeVar2;
        int i5;
        Function0 function4;
        int i6;
        int i7;
        int i8;
        Function0 function5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        float f6;
        final Function0 function6;
        final Function0 function7;
        final long j3;
        final Function0 function8;
        final Function0 function9;
        final qge qgeVar3;
        yfe0 yfe0VarU;
        int i17;
        cl5 cl5Var;
        qge qgeVar4;
        Function0 function10;
        Function0 function11;
        Function0 function12;
        Function0 function13;
        Function0 function14;
        Function0 function15;
        Function0 function16;
        Object objP;
        Object objP2;
        Object objP3;
        Object objP4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objP5;
        long j4;
        str.getClass();
        fetVar.g0(1820537913);
        int i18 = i2 | (fetVar.g(str) ? 32 : 16);
        if ((i2 & 196608) == 0) {
            i18 |= fetVar.d(f4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i18 |= fetVar.d(f5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            jE = j2;
            i18 |= ((i4 & 64) == 0 && fetVar.f(jE)) ? 8388608 : 4194304;
        } else {
            jE = j2;
        }
        int i19 = 100663296 | i18;
        int i20 = i4 & 256;
        if (i20 == 0) {
            if ((i2 & 805306368) == 0) {
                qgeVar2 = qgeVar;
                i19 |= fetVar.g(qgeVar2) ? 536870912 : 268435456;
            }
            i5 = i4 & 512;
            if (i5 != 0) {
                i7 = i3 | 6;
                function4 = function0;
            } else {
                function4 = function0;
                if (fetVar.i(function4)) {
                    i6 = 4;
                } else {
                    i6 = 2;
                }
                i7 = i3 | i6;
            }
            i8 = i4 & 1024;
            if (i8 != 0) {
                i7 |= 48;
                function5 = function1;
            } else {
                function5 = function1;
                if ((i3 & 48) == 0) {
                    if (fetVar.i(function5)) {
                        i9 = 32;
                    } else {
                        i9 = 16;
                    }
                    i7 |= i9;
                }
            }
            i10 = i7;
            i11 = i4 & 2048;
            if (i11 != 0) {
                i13 = i10 | 384;
            } else {
                if (fetVar.i(function2)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i13 = i10 | i12;
            }
            i14 = i4 & 4096;
            if (i14 != 0) {
                i16 = i13 | 3072;
            } else {
                if (fetVar.i(function3)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i16 = i13 | i15;
            }
            if ((i19 & 306783379) == 306783378 || (i16 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i19 & 1, z)) {
                fetVar.Z();
                i17 = i2 & 1;
                cl5Var = ukd.f35823a;
                if (i17 != 0 || fetVar.B()) {
                    if ((i4 & 64) != 0) {
                        jE = osm0.e(0.5f, 1.0f);
                        i19 &= -29360129;
                    }
                    if (i20 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i5 != 0) {
                        objP4 = fetVar.P();
                        if (objP4 == cl5Var) {
                            objP4 = new os7((byte) 8);
                            fetVar.o0(objP4);
                        }
                        function10 = (Function0) objP4;
                    } else {
                        function10 = function4;
                    }
                    if (i8 != 0) {
                        objP3 = fetVar.P();
                        if (objP3 == cl5Var) {
                            objP3 = new os7((byte) 9);
                            fetVar.o0(objP3);
                        }
                        function11 = (Function0) objP3;
                    } else {
                        function11 = function5;
                    }
                    if (i11 != 0) {
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new os7((byte) 10);
                            fetVar.o0(objP2);
                        }
                        function12 = (Function0) objP2;
                    } else {
                        function12 = function2;
                    }
                    if (i14 != 0) {
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new os7((byte) 11);
                            fetVar.o0(objP);
                        }
                        function14 = function10;
                        function15 = function11;
                        function16 = function12;
                        function13 = (Function0) objP;
                    } else {
                        function13 = function3;
                        function14 = function10;
                        function15 = function11;
                        function16 = function12;
                    }
                } else {
                    fetVar.X();
                    if ((i4 & 64) != 0) {
                        i19 &= -29360129;
                    }
                    function16 = function2;
                    function13 = function3;
                    qgeVar4 = qgeVar2;
                    function14 = function4;
                    function15 = function5;
                }
                fetVar.s();
                f6 = f2;
                mm40 mm40VarQ = ffb0.Q(jr8.f16991a.b(o7k0.p(jm40.b, f6, f3), zx7Var), f4, f5);
                if ((i16 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i16 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z2 | z3;
                if ((i16 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z8 = z7 | z4;
                if ((i16 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | z8 | ((((29360128 & i19) ^ 12582912) <= 8388608 && fetVar.f(jE)) || (i19 & 12582912) == 8388608);
                objP5 = fetVar.P();
                if (!z6 || objP5 == cl5Var) {
                    j4 = jE;
                    objP5 = new fj1((byte) 1, j4, (Object) function14, (Object) function15, (Object) function16, (Object) function13);
                    fetVar.o0(objP5);
                } else {
                    j4 = jE;
                }
                qge qgeVar5 = qgeVar4;
                k7x.a(str, null, i4w0.T(mm40VarQ, (Function1) objP5), qgeVar5, null, fetVar, ((i19 >> 3) & 14) | 48 | (3670016 & (i19 >> 9)), 1976);
                qgeVar3 = qgeVar5;
                j3 = j4;
                function8 = function14;
                function9 = function15;
                function6 = function16;
                function7 = function13;
            } else {
                f6 = f2;
                fetVar.X();
                function6 = function2;
                function7 = function3;
                j3 = jE;
                function8 = function4;
                function9 = function5;
                qgeVar3 = qgeVar2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final float f7 = f6;
                yfe0VarU.d = new Function2() { // from class: a.az7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i2 | 1);
                        int iL2 = x8x.L(i3);
                        phu0.c(str, zx7Var, f7, f3, f4, f5, j3, qgeVar3, function8, function9, function6, function7, (fet) obj, iL, iL2, i4);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i19 = 905969664 | i18;
        qgeVar2 = qgeVar;
        i5 = i4 & 512;
        if (i5 != 0) {
            i7 = i3 | 6;
            function4 = function0;
        } else {
            function4 = function0;
            if (fetVar.i(function4)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i7 = i3 | i6;
        }
        i8 = i4 & 1024;
        if (i8 != 0) {
            i7 |= 48;
            function5 = function1;
        } else {
            function5 = function1;
            if ((i3 & 48) == 0) {
                if (fetVar.i(function5)) {
                    i9 = 32;
                } else {
                    i9 = 16;
                }
                i7 |= i9;
            }
        }
        i10 = i7;
        i11 = i4 & 2048;
        if (i11 != 0) {
            i13 = i10 | 384;
        } else {
            if (fetVar.i(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i13 = i10 | i12;
        }
        i14 = i4 & 4096;
        if (i14 != 0) {
            i16 = i13 | 3072;
        } else {
            if (fetVar.i(function3)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i16 = i13 | i15;
        }
        if ((i19 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (fetVar.U(i19 & 1, z)) {
            fetVar.Z();
            i17 = i2 & 1;
            cl5Var = ukd.f35823a;
            if (i17 != 0) {
                if ((i4 & 64) != 0) {
                    jE = osm0.e(0.5f, 1.0f);
                    i19 &= -29360129;
                }
                if (i20 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i5 != 0) {
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = new os7((byte) 8);
                        fetVar.o0(objP4);
                    }
                    function10 = (Function0) objP4;
                } else {
                    function10 = function4;
                }
                if (i8 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new os7((byte) 9);
                        fetVar.o0(objP3);
                    }
                    function11 = (Function0) objP3;
                } else {
                    function11 = function5;
                }
                if (i11 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new os7((byte) 10);
                        fetVar.o0(objP2);
                    }
                    function12 = (Function0) objP2;
                } else {
                    function12 = function2;
                }
                if (i14 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new os7((byte) 11);
                        fetVar.o0(objP);
                    }
                    function14 = function10;
                    function15 = function11;
                    function16 = function12;
                    function13 = (Function0) objP;
                } else {
                    function13 = function3;
                    function14 = function10;
                    function15 = function11;
                    function16 = function12;
                }
            } else {
                if ((i4 & 64) != 0) {
                    jE = osm0.e(0.5f, 1.0f);
                    i19 &= -29360129;
                }
                if (i20 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i5 != 0) {
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = new os7((byte) 8);
                        fetVar.o0(objP4);
                    }
                    function10 = (Function0) objP4;
                } else {
                    function10 = function4;
                }
                if (i8 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new os7((byte) 9);
                        fetVar.o0(objP3);
                    }
                    function11 = (Function0) objP3;
                } else {
                    function11 = function5;
                }
                if (i11 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new os7((byte) 10);
                        fetVar.o0(objP2);
                    }
                    function12 = (Function0) objP2;
                } else {
                    function12 = function2;
                }
                if (i14 != 0) {
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new os7((byte) 11);
                        fetVar.o0(objP);
                    }
                    function14 = function10;
                    function15 = function11;
                    function16 = function12;
                    function13 = (Function0) objP;
                } else {
                    function13 = function3;
                    function14 = function10;
                    function15 = function11;
                    function16 = function12;
                }
            }
            fetVar.s();
            f6 = f2;
            mm40 mm40VarQ2 = ffb0.Q(jr8.f16991a.b(o7k0.p(jm40.b, f6, f3), zx7Var), f4, f5);
            if ((i16 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i16 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z2 | z3;
            if ((i16 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z9 | z4;
            if ((i16 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | z10 | ((((29360128 & i19) ^ 12582912) <= 8388608 && fetVar.f(jE)) || (i19 & 12582912) == 8388608);
            objP5 = fetVar.P();
            if (z6) {
                j4 = jE;
                objP5 = new fj1((byte) 1, j4, (Object) function14, (Object) function15, (Object) function16, (Object) function13);
                fetVar.o0(objP5);
            } else {
                j4 = jE;
                objP5 = new fj1((byte) 1, j4, (Object) function14, (Object) function15, (Object) function16, (Object) function13);
                fetVar.o0(objP5);
            }
            qge qgeVar6 = qgeVar4;
            k7x.a(str, null, i4w0.T(mm40VarQ2, (Function1) objP5), qgeVar6, null, fetVar, ((i19 >> 3) & 14) | 48 | (3670016 & (i19 >> 9)), 1976);
            qgeVar3 = qgeVar6;
            j3 = j4;
            function8 = function14;
            function9 = function15;
            function6 = function16;
            function7 = function13;
        } else {
            f6 = f2;
            fetVar.X();
            function6 = function2;
            function7 = function3;
            j3 = jE;
            function8 = function4;
            function9 = function5;
            qgeVar3 = qgeVar2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final float f8 = f6;
            yfe0VarU.d = new Function2() { // from class: a.az7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    phu0.c(str, zx7Var, f8, f3, f4, f5, j3, qgeVar3, function8, function9, function6, function7, (fet) obj, iL, iL2, i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, tn8 tn8Var, gna0 gna0Var, Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        tn8Var.getClass();
        gna0Var.getClass();
        function1.getClass();
        fetVar.g0(-512933652);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(tn8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(gna0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40Var, background, vgg0.c(12.0f, 12.0f, 0.0f, 0.0f, 12));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            ugdVar.invoke(fetVar, Integer.valueOf((i3 >> 12) & 14));
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, 4.0f, 0.0f, 12.0f, 5);
            if (tn8Var instanceof rn8) {
                fetVar.e0(-1225753529);
                rn8 rn8Var = (rn8) tn8Var;
                bww.h(mm40VarN, rn8Var.f30776a, rn8Var.b, gna0Var, function1, fetVar, 64512 & (i3 << 3));
                fetVar.r(false);
            } else {
                if (!tn8Var.equals(sn8.f32481a)) {
                    throw b1j.f(-1225755304, fetVar, false);
                }
                fetVar.e0(-1225742945);
                cww.h(0, fetVar, mm40VarN);
                fetVar.r(false);
            }
            twn.v((i3 >> 15) & 14, ugdVar2, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) tn8Var, (Object) gna0Var, function1, (wdr) ugdVar, (wdr) ugdVar2, i2, (byte) 3);
        }
    }

    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static final void e(mm40 mm40Var, bee beeVar, l7m0 l7m0Var, Function0 function0, ugd ugdVar, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        Object obj;
        rv2 rv2Var;
        Function0 function1;
        mm40 mm40VarU;
        ?? r15;
        Object obj2;
        beeVar.getClass();
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(1218444283);
        int i3 = i2 | 6 | (fetVar.g(beeVar) ? 32 : 16) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object objP = fetVar.P();
            byte b2 = 26;
            Object obj3 = ukd.f35823a;
            Object obj4 = objP;
            if (z || objP == obj3) {
                Object tqVar = new tq(function0, b2);
                fetVar.o0(tqVar);
                obj4 = tqVar;
            }
            knx.i(false, (Function0) obj4, fetVar, 0, 1);
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).f;
            int iB = ((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L)) - q33Var.e().b;
            Object objU = g8x.U((View) fetVar.k(dy2.f), fetVar, 0);
            Object obj5 = (pkk0) fetVar.k(bmd.q);
            Object objP2 = fetVar.P();
            Object obj6 = objP2;
            if (objP2 == obj3) {
                pt2 pt2Var = pt2.b;
                pel pelVar = new pel();
                float f2 = iB;
                pelVar.a(pt2.f27542a, f2);
                pelVar.a(pt2.b, f2 * 0.25f);
                pelVar.a(pt2.c, 0.0f);
                float[] fArr = pelVar.b;
                ArrayList arrayList = pelVar.f26860a;
                int size = arrayList.size();
                nx3.a(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                Object rv2Var2 = new rv2(new vtj(arrayList, fArrCopyOfRange), pt2Var);
                fetVar.o0(rv2Var2);
                obj6 = rv2Var2;
            }
            rv2 rv2Var3 = (rv2) obj6;
            boolean zG = fetVar.g(objU);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            Object obj7 = objP3;
            if (zG || objP3 == obj3) {
                Object xw5Var = new xw5(objU, rv2Var3, yjeVar, b2);
                fetVar.o0(xw5Var);
                obj7 = xw5Var;
            }
            m0x0.t(fetVar, objU, (Function2) obj7);
            uts0 uts0Var = nu2.f24127a;
            Object objP4 = fetVar.P();
            Object obj8 = objP4;
            if (objP4 == obj3) {
                Object nk7Var = new nk7((byte) 28);
                fetVar.o0(nk7Var);
                obj8 = nk7Var;
            }
            afk0 afk0VarA = nu2.a(rv2Var3, (Function1) obj8, ro4.m0(300, 0, null, 6), fetVar, 3510);
            boolean zG2 = fetVar.g(afk0VarA);
            Object objP5 = fetVar.P();
            Object obj9 = objP5;
            if (zG2 || objP5 == obj3) {
                Object ep8Var = new ep8(rv2Var3, afk0VarA, (yje) null);
                fetVar.o0(ep8Var);
                obj9 = ep8Var;
            }
            Function2 function2 = (Function2) obj9;
            rv2Var3.getClass();
            function2.getClass();
            Object objP6 = fetVar.P();
            if (objP6 == obj3) {
                l7m0Var2 = l7m0Var;
                Object hp8Var = new hp8(rv2Var3, l7m0Var2, function2);
                fetVar.o0(hp8Var);
                obj = hp8Var;
            } else {
                l7m0Var2 = l7m0Var;
                obj = objP6;
            }
            hp8 hp8Var2 = (hp8) obj;
            Object value = ((hgk0) rv2Var3.c).getValue();
            boolean zG3 = (i4 == 2048) | fetVar.g(obj5);
            Object objP7 = fetVar.P();
            if (zG3 || objP7 == obj3) {
                rv2Var = rv2Var3;
                Object ee0Var = new ee0(rv2Var, function0, obj5, yjeVar, (byte) 17);
                function1 = function0;
                fetVar.o0(ee0Var);
                objP7 = ee0Var;
            } else {
                function1 = function0;
                rv2Var = rv2Var3;
            }
            m0x0.t(fetVar, value, (Function2) objP7);
            n0q n0qVar = o7k0.c;
            Object objP8 = fetVar.P();
            Object obj10 = objP8;
            if (objP8 == obj3) {
                Object nk7Var2 = new nk7((byte) 29);
                fetVar.o0(nk7Var2);
                obj10 = nk7Var2;
            }
            mm40 mm40VarE0 = o2e.e0(rq8.K(n0qVar, (Function1) obj10), "BOTTOM_SHEET_LAYOUT_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP9 = fetVar.P();
            Object objJ = objP9;
            if (objP9 == obj3) {
                objJ = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objJ;
            boolean z2 = i4 == 2048;
            Object objP10 = fetVar.P();
            Object obj11 = objP10;
            if (z2 || objP10 == obj3) {
                Object tqVar2 = new tq(function1, (byte) 27);
                fetVar.o0(tqVar2);
                obj11 = tqVar2;
            }
            zq8.a(0, fetVar, y860.W(n0qVar, gy40Var, null, false, null, (Function0) obj11, 28));
            boolean zD = pkd.d(fetVar);
            jm40 jm40Var = jm40.b;
            if (zD) {
                zcl zclVar = qmk.f28987a;
                mm40VarU = o7k0.u(jm40Var, 0.0f, 512.0f, 1);
            } else {
                mm40VarU = jm40Var;
            }
            mm40 mm40VarB = jr8.f16991a.b(mm40VarU, gqw0.h);
            Object objP11 = fetVar.P();
            if (objP11 == obj3) {
                r15 = 0;
                Object cp8Var = new cp8(false ? 1 : 0);
                fetVar.o0(cp8Var);
                obj2 = cp8Var;
            } else {
                r15 = 0;
                obj2 = objP11;
            }
            mm40 mm40VarA = pai0.a(mm40VarB, r15, (Function1) obj2);
            boolean z3 = beeVar.f2445a;
            zsf zsfVar = ihn.f14788a;
            uts0 uts0VarM0 = ro4.m0(300, r15, zsfVar, 2);
            Object objP12 = fetVar.P();
            byte b3 = 19;
            Object obj12 = objP12;
            if (objP12 == obj3) {
                Object or3Var = new or3(b3);
                fetVar.o0(or3Var);
                obj12 = or3Var;
            }
            pzn pznVarJ = kzn.j(uts0VarM0, (Function1) obj12);
            uts0 uts0VarM1 = ro4.m0(300, r15, zsfVar, 2);
            Object objP13 = fetVar.P();
            Object obj13 = objP13;
            if (objP13 == obj3) {
                Object or3Var2 = new or3(b3);
                fetVar.o0(or3Var2);
                obj13 = or3Var2;
            }
            b34.h(z3, mm40VarA, pznVarJ, kzn.l(uts0VarM1, (Function1) obj13), null, u1c.M(-815206823, new hgs0(hp8Var2, beeVar, rv2Var, afk0VarA, ugdVar, (byte) 2), fetVar), fetVar, 196608, 16);
            fetVar.e0(318156289);
            fetVar.r(false);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) beeVar, (Object) l7m0Var2, (Object) function0, (Object) ugdVar, i2, (byte) 15);
        }
    }

    public static final void f(cpm cpmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1143466744);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(cpmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 8.0f, 1);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new zbm0(function1, (byte) 19);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            int i4 = i3 << 3;
            function2.getClass();
            boolean zG = fetVar.g(function2);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new zbm0(function2, b2);
                fetVar.o0(objP2);
            }
            u1c.i(mm40VarL, cpmVar, (Function1) objP2, fetVar, i4 & 112, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgg(cpmVar, function1, i2, b3);
        }
    }

    public static final void g(mm40 mm40Var, rr9 rr9Var, fet fetVar, int i2) {
        fetVar.g0(975324161);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(rr9Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 40.0f);
            long j2 = rr9Var.b;
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(R.drawable.ic_glyph_call_back, 0, fetVar), null, o7k0.n(jm40.b, 24.0f), rr9Var.f30971a, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, rr9Var, i2, (byte) 26);
        }
    }

    public static final void h(mm40 mm40Var, x5b x5bVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        ugd ugdVar3;
        tv20 tv20Var = x5bVar.e;
        yx7 yx7Var = gqw0.k;
        fetVar.g0(-146569414);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(x5bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ugdVar3 = ugdVar;
            i3 |= fetVar.i(ugdVar3) ? 256 : 128;
        } else {
            ugdVar3 = ugdVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            if (tv20Var instanceof qv20) {
                fetVar.e0(-485300596);
                fetVar.r(false);
            } else {
                fetVar.e0(-485436097);
                ugdVar2.j(new ecu0(yx7Var), tv20Var, fetVar, Integer.valueOf((i3 >> 3) & 896));
                fetVar.r(false);
            }
            ugdVar3.O(new ecu0(yx7Var), x5bVar.c, x5bVar.d, fetVar, Integer.valueOf((i3 << 3) & 7168));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 11, i2, (Object) mm40Var, (Object) x5bVar, (Object) ugdVar, (Object) ugdVar2);
        }
    }

    public static final void i(l7m0 l7m0Var, l7m0 l7m0Var2, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, Function0 function0, fet fetVar, int i2) {
        int i3;
        xcz xczVar2;
        qdz qdzVar2;
        Function1 function2;
        fetVar.g0(-1640838417);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(g2vVar) : fetVar.i(g2vVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 2048 : 1024;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 24576) == 0) {
            qdzVar2 = qdzVar;
            i3 |= fetVar.g(qdzVar2) ? 16384 : 8192;
        } else {
            qdzVar2 = qdzVar;
        }
        if ((196608 & i2) == 0) {
            function2 = function1;
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarR = knm0.r(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            int i4 = i3 >> 3;
            j120.H(i4 & 14, fetVar, null, l7m0Var2);
            mm40 mm40VarE = o050.W(jm40.b).e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            int i5 = i3;
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean z2 = (i5 & 3670016) == 1048576;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new a2z(function0, (byte) 3);
                fetVar.o0(objP);
            }
            n4c.b((Function0) objP, fetVar);
            t(l7m0Var, g2vVar, xczVar2, qdzVar2, function2, fetVar, (i5 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o210(l7m0Var, l7m0Var2, g2vVar, xczVar, qdzVar, function1, function0, i2, (byte) 0);
        }
    }

    public static final void j(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fetVar.g0(-1831700942);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new opm0(function1, (byte) 21);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function1, i2, (byte) 10);
        }
    }

    public static final void k(mm40 mm40Var, kec0 kec0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        fetVar.g0(-357979697);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(kec0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.b(pkd.d(fetVar)).f39080a;
            float f3 = xfn.b(pkd.d(fetVar)).e;
            Object obj = kec0Var.f18148a;
            ldc0 ldc0Var = kec0Var.h;
            boolean zG = fetVar.g(obj);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = new fyl(kec0Var.f18148a, null, null, null, null, 30);
                fetVar.o0(objP);
            }
            fyl fylVar = (fyl) objP;
            boolean zG2 = fetVar.g(kec0Var.f);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                objP2 = new hjm(kec0Var.f, new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                fetVar.o0(objP2);
            }
            hjm hjmVar = (hjm) objP2;
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(kec0Var.g);
            boolean zG3 = ((i3 & 112) == 32) | fetVar.g(xczVarA);
            int i4 = i3 & 896;
            boolean z2 = zG3 | (i4 == 256);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj2) {
                objP3 = new p8c0(kec0Var, xczVarA, function1, (yje) null);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n), "PROMO_LIST_COLUMN");
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
            if (ldc0Var.f19845a) {
                fetVar.e0(-1371288106);
                boolean z3 = i4 == 256;
                Object objP4 = fetVar.P();
                if (z3 || objP4 == obj2) {
                    objP4 = new bac0(function1, (byte) 6);
                    fetVar.o0(objP4);
                }
                z = false;
                a(null, ldc0Var, (Function0) objP4, fetVar, 0);
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(-1371096867);
                fetVar.r(false);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            boolean z4 = i4 == 256 ? true : z;
            Object objP5 = fetVar.P();
            if (z4 || objP5 == obj2) {
                objP5 = new rpa0(function1, (byte) 22);
                fetVar.o0(objP5);
            }
            ebc.r(mm40VarN, fylVar, null, (Function1) objP5, null, fetVar, 0, 44);
            boolean z5 = kec0Var.b;
            boolean z6 = i4 == 256;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == obj2) {
                objP6 = new bac0(function1, (byte) 7);
                fetVar.o0(objP6);
            }
            mom.c(n0qVar, z5, womVarF, null, false, null, (Function0) objP6, null, u1c.M(83255696, new eec0(kec0Var, f2, xczVarA, function1, f3, hjmVar), fetVar), fetVar, 100663302, 184);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, kec0Var, function1, i2, (byte) 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r7v18, types: [a.jm40] */
    public static final void l(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, gy40 gy40Var, Function0 function0, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        ?? r4;
        long j2;
        boolean z;
        function0.getClass();
        fetVar.g0(217858466);
        int i3 = i2 | 6 | (fetVar.g(wimVar) ? 32 : 16) | (fetVar.g(w2v0Var) ? 256 : 128) | (fetVar.g(gy40Var) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new unl(function0, (byte) 28);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.o(kca.f18048a, jm40Var).e(y860.W(jm40Var, gy40Var, null, false, null, function2, 28)), "GAME_COLLECTION_CARD_BOX");
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            u(null, wimVar, w2v0Var, function1, fetVar, (i3 & 1008) | ((i3 >> 6) & 7168));
            mm40 mm40VarG = o7k0.g(ua80.d(jm40Var, kca.f, fetVar, jm40Var, 1.0f), kca.g, 0.0f, 2);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarG, zx7Var2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            String str = wimVar.c;
            if (str == null) {
                fetVar.e0(1887442978);
                fetVar.r(false);
                fetVar2 = fetVar;
                z = true;
            } else {
                fetVar.e0(1887442979);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarE = g1t0.e();
                bjm bjmVar = wimVar.b;
                if (bjmVar instanceof zim) {
                    j2 = w2v0Var.f38470a.d;
                } else if (bjmVar instanceof yim) {
                    j2 = w2v0Var.b.c;
                } else {
                    if (!(bjmVar instanceof ajm)) {
                        t9f.b();
                        return;
                    }
                    j2 = w2v0Var.c.f;
                }
                z = true;
                v8q0.a(str, o2e.e0(jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.e), "GAME_COLLECTION_CARD_BOX_TEXT"), j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarE, fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z);
            fetVar2.r(z);
            r4 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            r4 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tan(r4, wimVar, w2v0Var, gy40Var, function0, function1, i2, (byte) 0);
        }
    }

    public static final void m(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-746072709);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ma70(function1, (byte) 11);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 23);
        }
    }

    public static final void n(mm40 mm40Var, bdz bdzVar, bzl bzlVar, boolean z, sce sceVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-423915782);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(sceVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TEAMS", fetVar);
            fetVar.e0(-1670833616);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new j6g0((byte) 17);
                fetVar.o0(objP);
            }
            azl azlVarA = bzlVar.a((Function0) objP);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarA, null);
            fetVar.r(false);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z2 = (458752 & i3) == 131072;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 19);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40Var;
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(1108665861, new qb((Object) mm40VarV, (Object) xczVarB, (Object) sceVar, false, (byte) 2), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var2, (Object) bdzVar, (Object) bzlVar, z, (Object) sceVar, (wdr) function1, i2, (byte) 1);
        }
    }

    public static final void o(mm40 mm40Var, lec0 lec0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(222321224);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(lec0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdm mdmVar = lec0Var.f19896a;
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, lec0Var, function1, i2, (byte) 20);
        }
    }

    public static final void p(th90 th90Var, Function1 function1, l7m0 l7m0Var, String str, w9v w9vVar, l7m0 l7m0Var2, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        fet fetVar2;
        th90Var.getClass();
        function1.getClass();
        l7m0Var.getClass();
        l7m0Var2.getClass();
        fetVar.g0(-2105114671);
        if ((i2 & 48) == 0) {
            i3 = ((i2 & 64) == 0 ? fetVar.g(th90Var) : fetVar.i(th90Var) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(str) ? 16384 : 8192);
        if ((196608 & i2) == 0) {
            i4 |= (262144 & i2) == 0 ? fetVar.g(w9vVar) : fetVar.i(w9vVar) ? 131072 : 65536;
        }
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ngk0();
                fetVar.o0(objP);
            }
            ngk0 ngk0Var = (ngk0) objP;
            Object value = l7m0Var.getValue();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new j0s(l7m0Var, ngk0Var, null, (byte) 19);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, value, (Function2) objP2);
            function2 = function1;
            fetVar2 = fetVar;
            kbc.u(o7k0.c, function2, u1c.M(78267138, new n82(th90Var, dyb.p0(ngk0Var), str, (byte) 2), fetVar), u1c.M(-1070127393, new mz7(l7m0Var2, w9vVar, (byte) 6), fetVar), u1c.M(-947223456, new jar(w9vVar, (byte) 23), fetVar), fetVar2, 28080);
        } else {
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(th90Var, function2, l7m0Var, str, w9vVar, l7m0Var2, i2);
        }
    }

    public static final void q(float f2, int i2, bzl bzlVar, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z, boolean z2, boolean z3) {
        mm40 mm40Var2;
        xcz xczVarB;
        byte b2;
        fetVar.g0(-1777563902);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(bzlVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(a4xVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            if (z) {
                fetVar.e0(1540929401);
                xczVarB = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
            } else {
                fetVar.e0(1540975095);
                xczVarB = bdzVar.b("KEY_LAZY_LIST_TEAMS", fetVar);
                fetVar.r(false);
            }
            xcz xczVar = xczVarB;
            fetVar.e0(1541101420);
            boolean z4 = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new kg2((byte) 1, z);
                fetVar.o0(objP);
            }
            azl azlVarA = bzlVar.a((Function0) objP);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarA, null);
            fetVar.r(false);
            int i4 = i3 >> 15;
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i5 = i3;
            boolean zG = ((i5 & 29360128) == 8388608) | fetVar.g(xczVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                b2 = 1;
                objP2 = new qa2(z3, xczVar, null, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            if (z3) {
                function1.invoke(th2.f33942a);
            }
            n0q n0qVar = o7k0.c;
            byte b3 = (i5 & 234881024) == 67108864 ? b2 : (byte) 0;
            Object objP3 = fetVar.P();
            if (b3 != 0 || objP3 == cl5Var) {
                objP3 = new ja2(function1, (byte) 20);
                fetVar.o0(objP3);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP3, null, u1c.M(1301291287, new ai2(mm40VarV, z, f2, xczVar, pz40VarF, function1, (byte) 0), fetVar), fetVar, (i4 & 112) | 100663296, 184);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lg2(mm40Var2, f2, bdzVar, z, bzlVar, a4xVar, z2, z3, function1, i2, (byte) 1);
        }
    }

    public static final void r(z780 z780Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        z780 z780Var2;
        cqq cqqVar;
        byte b2;
        Function1 function3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-956251763);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar2.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(z780Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i5 = zcm0.i(fetVar2).c.e().d - zcm0.i(fetVar2).e.e().d;
            if (i5 < 0) {
                i5 = 0;
            }
            float fR0 = w6kVar.r0(i5);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new cqq();
                fetVar2.o0(objP);
            }
            cqq cqqVar2 = (cqq) objP;
            n0q n0qVar = o7k0.c;
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarE0 = o2e.e0(s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, fMax, 7), "ORDER_CALL_SCREEN_COLUMN");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            int i6 = i3;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            mm40 mm40VarN = s5x0.N(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), xfn.a(fetVar2).d, 16.0f, xfn.a(fetVar2).d, 0.0f, 8);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarN2 = s5x0.N(wha0.a0(o7k0.d(jm40Var, 1.0f), wha0.T(fetVar2), false, 14), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN2, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            z780Var2 = z780Var;
            v8q0.a(z780Var.b, o7k0.d(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 0, 131068);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 16.0f, 8.0f, 16.0f, 0.0f, 8);
            hnm hnmVar = z780Var2.c;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                cqqVar = cqqVar2;
                b2 = 1;
                objP2 = new eht(cqqVar, b2);
                fetVar.o0(objP2);
            } else {
                cqqVar = cqqVar2;
                b2 = 1;
            }
            kly klyVar = new kly(null, (Function1) objP2, null, 59);
            int i7 = i6 & 896;
            byte b3 = i7 == 256 ? b2 : (byte) 0;
            Object objP3 = fetVar.P();
            if (b3 != 0 || objP3 == cl5Var) {
                function3 = function1;
                objP3 = new ma70(function3, (byte) 10);
                fetVar.o0(objP3);
            } else {
                function3 = function1;
            }
            Function0 function0 = (Function0) objP3;
            byte b4 = i7 == 256 ? b2 : (byte) 0;
            Object objP4 = fetVar.P();
            if (b4 != 0 || objP4 == cl5Var) {
                objP4 = new i160(function3, (byte) 20);
                fetVar.o0(objP4);
            }
            function2 = function1;
            fet fetVar3 = fetVar;
            wwb.k(mm40VarN3, hnmVar, 6, klyVar, function0, (Function1) objP4, fetVar3, 384, 64);
            if (z780Var2.d) {
                fetVar3.e0(1112814810);
                mm40 mm40VarN4 = s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8);
                s6q0 s6q0Var = z780Var2.e;
                boolean z3 = i7 == 256;
                Object objP5 = fetVar3.P();
                if (z3 || objP5 == cl5Var) {
                    objP5 = new i160(function2, (byte) 21);
                    fetVar3.o0(objP5);
                }
                jwb.o(mm40VarN4, s6q0Var, 0, null, (Function1) objP5, fetVar, 0, 12);
                fetVar3 = fetVar;
                rz4.t(jm40Var, 26.0f, fetVar3, false);
            } else {
                fetVar3.e0(1113417357);
                fetVar3.r(false);
            }
            mm40 mm40VarN5 = s5x0.N(o7k0.d(y860.b0(jm40Var, cqqVar), 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            x6q0 x6q0Var = z780Var2.f;
            boolean z4 = i7 == 256;
            Object objP6 = fetVar3.P();
            if (z4 || objP6 == cl5Var) {
                objP6 = new i160(function2, (byte) 22);
                fetVar3.o0(objP6);
            }
            wwb.n(mm40VarN5, x6q0Var, null, (Function1) objP6, fetVar, 0, 4);
            fetVar2 = fetVar;
            qxw.o(fetVar2, o7k0.e(jm40Var, 16.0f));
            fetVar2.r(true);
            fetVar2.r(true);
            mtl mtlVar = z780Var2.g;
            boolean z5 = i7 == 256;
            Object objP7 = fetVar2.P();
            if (z5 || objP7 == cl5Var) {
                objP7 = new i160(function2, (byte) 23);
                fetVar2.o0(objP7);
            }
            bkb.f(jm40Var, mtlVar, null, false, null, (Function1) objP7, fetVar2, 3078, 20);
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, l7x.O(12.0f, 0.0f, l1e0.c((fR0 - 100.0f) / 100.0f, 0.0f, 1.0f))), 1.0f);
            long backgroundContent2 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            zq8.a(0, fetVar2, i120.Q(mm40VarD, backgroundContent2, ljcVar));
            fetVar2.r(true);
            if (z780Var2.f43906a) {
                fetVar2.e0(682230892);
                mm40 mm40VarQ2 = i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zfnVar)).getShadowSoft(), ljcVar);
                tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarQ2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar);
                jpm0.o(fetVar2, bh90VarM5, shdVar2);
                vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar4);
                dkm dkmVar = new dkm((ycl) null, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getPrimary()), 3);
                z = true;
                kpb.j(null, dkmVar, fetVar2, 0, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(682552827);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            function2 = function1;
            z780Var2 = z780Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680(z780Var2, function2, i2);
        }
    }

    public static final void s(g2v g2vVar, qdz qdzVar, b310 b310Var, Function0 function0, fet fetVar, int i2) {
        g2vVar.getClass();
        qdzVar.getClass();
        b310Var.getClass();
        function0.getClass();
        fetVar.g0(-333176500);
        int i3 = i2 | (fetVar.g(g2vVar) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.g(b310Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pz40 pz40VarQ = gkb.Q(b310Var.D, null, fetVar, 0, 7);
            pz40 pz40VarQ2 = gkb.Q((n7m0) b310Var.N.getValue(), null, fetVar, 0, 7);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new svz(1, b310Var, b310.class, "onScreenEvent", "onScreenEvent(Lorg/xplatform/cyber/lol/impl/presentation/screen/post_game/model/LolPostGameStatAction;)V", 0, (byte) 23);
                fetVar.o0(objP);
            }
            int i4 = i3 << 9;
            i(pz40VarQ, pz40VarQ2, g2vVar, xczVarA, qdzVar, (Function1) ((jhy) objP), function0, fetVar, ((i3 << 6) & 896) | (57344 & i4) | (i4 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 18, i2, (Object) g2vVar, (Object) qdzVar, (Object) b310Var, (Object) function0);
        }
    }

    public static final void t(l7m0 l7m0Var, g2v g2vVar, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-412282907);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(g2vVar) : fetVar2.i(g2vVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            t210 t210Var = (t210) l7m0Var.getValue();
            if (t210Var == null) {
                z = false;
            } else if (t210Var instanceof r210) {
                fetVar2.e0(1286724350);
                mdm mdmVar = ((r210) t210Var).f29709a;
                boolean z2 = (i3 & 57344) == 16384;
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new dg00(function1, (byte) 25);
                    fetVar2.o0(objP);
                }
                jcb.l(null, mdmVar, false, (Function0) objP, fetVar2, 0, 5);
                fetVar2.r(false);
            } else if (t210Var instanceof s210) {
                fetVar2.e0(1286961345);
                jcb.l(null, g2v.b(g2vVar, pb10.o, null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), false, null, fetVar, 0, 13);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                z = false;
                if (t210Var instanceof q210) {
                    fetVar2.e0(1287258635);
                    q210 q210Var = (q210) t210Var;
                    xia0.R(q210Var.f27979a, q210Var.b, xczVar, qdzVar, function1, fetVar2, i3 & 65408);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-1066873306, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p210(l7m0Var, g2vVar, xczVar, qdzVar, function1, i2, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        mm40 mm40Var2;
        boolean z;
        float f2;
        w2v0 w2v0Var2 = w2v0Var;
        bjm bjmVar = wimVar.b;
        u2v0 u2v0Var = w2v0Var2.b;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(575109318);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wimVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(w2v0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function2 = function1;
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                float f3 = kca.b;
                if (bjmVar instanceof yim) {
                    zcl zclVar = qmk.f28987a;
                    f2 = 24.0f;
                } else if (bjmVar instanceof ajm) {
                    zcl zclVar2 = qmk.f28987a;
                    f2 = 18.0f;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    f2 = 0.0f;
                }
                objP = twn.j(f2, fetVar);
            }
            float f4 = ((ycl) objP).f42389a;
            float f5 = kca.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, f5), kca.d);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (bjmVar instanceof zim) {
                fetVar.e0(1872092066);
                zim zimVar = (zim) bjmVar;
                ibm0.e(zimVar.f44446a, zimVar.b, function2, dj8.c, u1c.M(2016252086, new uan(bjmVar, w2v0Var2, (byte) 0), fetVar), fetVar, ((i3 >> 3) & 896) | 27648);
                fetVar.r(false);
            } else {
                boolean z3 = bjmVar instanceof yim;
                jr8 jr8Var = jr8.f16991a;
                if (z3) {
                    fetVar.e0(1873386626);
                    mm40 mm40VarP = i120.P(o7k0.c, u2v0Var.f34965a, null, 6);
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarP);
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
                    dww.c(a8k0.F(((yim) bjmVar).f42699a, 0, fetVar), null, o2e.e0(o7k0.n(jr8Var.b(jm40Var, zx7Var), f4), "GAME_COLLECTION_CARD_BOX_IMAGE"), u2v0Var.b, fetVar, 56, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                    w2v0Var2 = w2v0Var;
                } else {
                    if (!(bjmVar instanceof ajm)) {
                        throw b1j.f(1584411113, fetVar, false);
                    }
                    fetVar.e0(1874147986);
                    ajm ajmVar = (ajm) bjmVar;
                    w2v0Var2 = w2v0Var;
                    ibm0.e(ajmVar.f983a, ajmVar.b, function1, dj8.d, u1c.M(1687051390, new uan(bjmVar, w2v0Var2, (byte) 1), fetVar), fetVar, ((i3 >> 3) & 896) | 27648);
                    mm40 mm40VarE = jr8Var.b(jm40Var, zx7Var).e(o7k0.c);
                    g3v0 g3v0Var = w2v0Var2.c;
                    long j2 = g3v0Var.f10631a;
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarQ = i120.Q(mm40VarE, j2, ljcVar);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC3, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    mm40 mm40VarQ2 = i120.Q(lgb.J(o7k0.n(jm40Var, kca.c), vgg0.f37379a), g3v0Var.c, ljcVar);
                    tj30 tj30VarC4 = zq8.c(zx7Var, false);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC4, shdVar);
                    jpm0.o(fetVar, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar4);
                    dww.c(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar), null, o7k0.n(jm40Var, f4), g3v0Var.b, fetVar, 440, 0);
                    z = true;
                    ohs0.x(fetVar, true, true, false);
                }
                fetVar.r(z);
                mm40Var2 = jm40Var;
            }
            z = true;
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new van(mm40Var2, wimVar, w2v0Var2, function1, i2, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, c880 c880Var, Function1 function1, fet fetVar, int i2) {
        c880Var.getClass();
        function1.getClass();
        fetVar.g0(852039112);
        int i3 = i2 | 6 | (fetVar.g(c880Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (c880Var instanceof z780) {
                fetVar.e0(-159328360);
                r((z780) c880Var, function1, fetVar, i3 & 1022);
                fetVar.r(false);
            } else if (c880Var instanceof a880) {
                fetVar.e0(-159188953);
                m(o7k0.c, ((a880) c880Var).f414a, function1, fetVar, i3 & 896);
                fetVar.r(false);
            } else {
                if (!c880Var.equals(b880.f2145a)) {
                    throw b1j.f(-1529161593, fetVar, false);
                }
                fetVar.e0(-159021429);
                n0q n0qVar = o7k0.c;
                zfn zfnVar = zaq0.b;
                mm40 mm40VarQ = i120.Q(n0qVar, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), 3), fetVar, 0, 1);
                fetVar.r(true);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var2, c880Var, function1, i2, (byte) 20);
        }
    }

    public static final void w(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1735907683);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            nec0 nec0Var = (nec0) l7m0Var.getValue();
            if (nec0Var != null) {
                if (nec0Var instanceof mec0) {
                    fetVar.e0(1759978867);
                    y(0, fetVar, null);
                    fetVar.r(false);
                } else if (nec0Var instanceof kec0) {
                    fetVar.e0(1759980820);
                    k(null, (kec0) nec0Var, function1, fetVar, (i3 << 3) & 896);
                    fetVar.r(false);
                } else if (nec0Var instanceof lec0) {
                    fetVar.e0(1759983731);
                    o(null, (lec0) nec0Var, function1, fetVar, (i3 << 3) & 896);
                    fetVar.r(false);
                }
            }
            throw b1j.f(1759976638, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 23);
        }
    }

    public static final void x(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        xcz xczVar2;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        mm40 mm40Var2;
        fetVar.g0(1000229347);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 384) == 0) {
            l7m0Var3 = l7m0Var;
            i3 |= fetVar.g(l7m0Var3) ? 256 : 128;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i2 & 3072) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 2048 : 1024;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar2, l7m0Var3, new qw3(8.0f, true, new jf4((byte) 14)), knm0.g(s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 28.0f, 2), fetVar), z, null, u1c.M(-1268961179, new nc40(function1, (byte) 17), fetVar), fetVar, (i3 & 112) | 100663296 | (i3 & 896), 136);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bgg(mm40Var2, xczVar, l7m0Var, l7m0Var4, function1, i2, (byte) 1);
        }
    }

    public static final void y(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        pcy pcyVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        ljc ljcVar = jd8.n;
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        fetVar.g0(-1011744104);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), ljcVar);
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            shd shdVar5 = shdVar;
            mm40Var2 = jm40Var;
            pcy pcyVar3 = pcyVar2;
            ebc.r(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 8.0f, 5), 1.0f), new gyl(null, null, 3), null, null, null, fetVar, 0, 60);
            fetVar.e0(-983350690);
            int i4 = 0;
            for (int i5 = 3; i4 < i5; i5 = 3) {
                mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarQ2 = i120.Q(lgb.J(o7k0.e(s5x0.N(mm40VarD, xfn.b(pkd.d(fetVar)).d, 8.0f, xfn.b(pkd.d(fetVar)).d, 0.0f, 8), 110.0f), vgg0.a(16.0f)), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int i6 = i4;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    pcyVar = pcyVar3;
                    fetVar.l(pcyVar);
                } else {
                    pcyVar = pcyVar3;
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar5);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40Var2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                shd shdVar6 = shdVar5;
                jpm0.o(fetVar, mm40VarC2, shdVar6);
                mm40 mm40VarN = o7k0.n(s5x0.M(mm40Var2, 12.0f, 8.0f, 12.0f, 16.0f), 32.0f);
                zcl zclVar3 = qmk.i;
                zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
                dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.p(s5x0.M(mm40Var2, 12.0f, 8.0f, 12.0f, 16.0f), 152.0f, 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
                zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.p(s5x0.N(mm40Var2, 12.0f, 0.0f, 0.0f, 0.0f, 14), 146.0f, 16.0f)), vbc.d0(null, fetVar, 0, 1)));
                zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.p(s5x0.M(mm40Var2, 12.0f, 8.0f, 12.0f, 10.0f), 116.0f, 16.0f)), vbc.d0(null, fetVar, 0, 1)));
                fetVar.r(true);
                i4 = i6 + 1;
                pcyVar3 = pcyVar;
                shdVar5 = shdVar6;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var2, i2, (byte) 11);
        }
    }

    public static final void z(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        boolean z;
        a4x a4xVar;
        Function1 function2 = function1;
        l7m0Var.getClass();
        qdzVar.getClass();
        function2.getClass();
        fetVar.g0(-1209428267);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        byte b2 = 1;
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new g7o0(l7m0Var, b3);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z3 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new g7o0(l7m0Var, b2);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            ((y6o0) l7m0VarY.getValue()).getClass();
            xcz xczVarB = qdzVar.b("CALENDAR", new acm0((byte) 24), fetVar, (i3 << 3) & 896);
            int i5 = (xczVarB.j().n - xczVarB.j().r) / 2;
            mm40 mm40VarV = cjx.V(o7k0.c, x0x.a0(fetVar), null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
            b7o0 b7o0Var = (b7o0) l7m0VarY2.getValue();
            if (Intrinsics.d(b7o0Var, z6o0.f43880a)) {
                fetVar.e0(2092362708);
                f(((y6o0) l7m0VarY.getValue()).f42108a, function2, fetVar, (i3 >> 3) & 112);
                Object[] objArr3 = new Object[0];
                boolean z4 = i4 == 4;
                Object objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new g7o0(l7m0Var, (byte) 2);
                    fetVar.o0(objP3);
                }
                l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
                Object[] objArr4 = new Object[0];
                boolean z5 = i4 == 4;
                Object objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new g7o0(l7m0Var, (byte) 3);
                    fetVar.o0(objP4);
                }
                x(null, xczVarB, l7m0VarY3, v3c.Y(objArr4, (Function0) objP4, fetVar), function1, fetVar, (i3 << 6) & 57344);
                function2 = function1;
                fetVar.r(false);
                z = true;
            } else {
                if (!(b7o0Var instanceof a7o0)) {
                    throw b1j.f(-1179432619, fetVar, false);
                }
                fetVar.e0(2092881338);
                cpm cpmVar = ((y6o0) l7m0VarY.getValue()).f42108a;
                apm apmVar = cpmVar instanceof apm ? (apm) cpmVar : null;
                if (apmVar == null || (a4xVar = apmVar.f1259a) == null || !(!a4xVar.isEmpty())) {
                    fetVar.e0(2093092355);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2092924180);
                    f(((y6o0) l7m0VarY.getValue()).f42108a, function2, fetVar, (i3 >> 3) & 112);
                    fetVar.r(false);
                }
                mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, pkd.e(i5, fetVar), 7);
                Object[] objArr5 = new Object[0];
                boolean zI = fetVar.i(b7o0Var);
                Object objP5 = fetVar.P();
                if (zI || objP5 == cl5Var) {
                    objP5 = new jfm0((a7o0) b7o0Var, (byte) 21);
                    fetVar.o0(objP5);
                }
                j(i3 & 896, fetVar, mm40VarN, v3c.Y(objArr5, (Function0) objP5, fetVar), function2);
                fetVar.r(false);
                z = true;
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 6);
        }
    }
}
