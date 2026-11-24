package a;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Request;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.EventItem;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;

/* JADX INFO: loaded from: classes6.dex */
public abstract class agc {
    public static final void A(EventCardMiddleCricket eventCardMiddleCricket, kxr kxrVar) {
        if (kxrVar.f19070a) {
            eventCardMiddleCricket.setGameText(kxrVar.b);
            eventCardMiddleCricket.z(kxrVar.c, kxrVar.d);
            eventCardMiddleCricket.x(kxrVar.e, kxrVar.f);
        } else {
            eventCardMiddleCricket.setGameText("");
            f5h0 f5h0Var = f5h0.f8962a;
            eventCardMiddleCricket.z("", f5h0Var);
            eventCardMiddleCricket.x("", f5h0Var);
        }
    }

    public static final void B(EventCardMiddleCricket eventCardMiddleCricket, lxr lxrVar) {
        if (lxrVar.f20829a) {
            eventCardMiddleCricket.setSetText(lxrVar.b);
            eventCardMiddleCricket.A(lxrVar.c, lxrVar.d);
            eventCardMiddleCricket.y(lxrVar.e, lxrVar.f);
        } else {
            eventCardMiddleCricket.setSetText("");
            f5h0 f5h0Var = f5h0.f8962a;
            eventCardMiddleCricket.A("", f5h0Var);
            eventCardMiddleCricket.y("", f5h0Var);
        }
    }

    public static final void C(EventCardMiddleCricket eventCardMiddleCricket, nxr nxrVar) {
        eventCardMiddleCricket.setResultText(R.string.total_tennis_column);
        String str = nxrVar.f24295a;
        f5h0 f5h0Var = nxrVar.b;
        dbo dboVar = eventCardMiddleCricket.q;
        TextView textView = dboVar.q;
        textView.setVisibility(str.length() == 0 ? 8 : 0);
        textView.setText(str);
        EventCardMiddleCricket.v(textView, f5h0Var);
        String str2 = nxrVar.c;
        f5h0 f5h0Var2 = nxrVar.d;
        TextView textView2 = dboVar.e;
        textView2.setVisibility(str2.length() != 0 ? 0 : 8);
        textView2.setText(str2);
        EventCardMiddleCricket.v(textView2, f5h0Var2);
    }

    public static final void D(EventCardMiddleCricket eventCardMiddleCricket, pxr pxrVar) {
        eventCardMiddleCricket.setTopTeamName(pxrVar.b);
        Context context = eventCardMiddleCricket.getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(R.drawable.no_photo_new);
        String str = pxrVar.c;
        long j = pxrVar.f27766a;
        String strS = vsm0.s(j, str);
        dbo dboVar = eventCardMiddleCricket.q;
        LoadableShapeableImageView.i(dboVar.n, strS, drawable, 12);
        if (!pxrVar.e) {
            eventCardMiddleCricket.setTopSecondLogo((Drawable) null);
        } else {
            LoadableShapeableImageView.i(dboVar.s, vsm0.s(j, pxrVar.d), drawable, 12);
        }
    }

    public static final void E(EventCardMiddleCricket eventCardMiddleCricket, qxr qxrVar) {
        eventCardMiddleCricket.setBotTeamName(qxrVar.b);
        Context context = eventCardMiddleCricket.getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(R.drawable.no_photo_new);
        String str = qxrVar.c;
        long j = qxrVar.f29500a;
        String strS = vsm0.s(j, str);
        dbo dboVar = eventCardMiddleCricket.q;
        LoadableShapeableImageView.i(dboVar.b, strS, drawable, 12);
        if (!qxrVar.e) {
            eventCardMiddleCricket.setBotSecondLogo((Drawable) null);
        } else {
            LoadableShapeableImageView.i(dboVar.g, vsm0.s(j, qxrVar.d), drawable, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    public static final lc00 F(fcg fcgVar, y78 y78Var, ctf0 ctf0Var, boolean z, sff0 sff0Var, boolean z2, boolean z3, List list, boolean z4) {
        lc00 lc00Var;
        Object next;
        m5l0 m5l0Var;
        fcg fcgVar2 = fcgVar;
        ctf0 ctf0Var2 = ctf0Var;
        sff0 sff0Var2 = sff0Var;
        ctf0Var2.getClass();
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        List<d0t> list2 = fcgVar2.f9311a;
        if (list2.isEmpty()) {
            lc00Var = lc00VarB;
        } else {
            lc00VarB.add(new jeg(z2 ? new hjm(ctf0Var2.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, true, null, null, false, null, null, 8126) : new hjm(ctf0Var2.b.a(R.string.line_new, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8126), z2 ? "HEADER_LIVE_GAMES" : "HEADER_LINE_GAMES"));
            v5l0 v5l0Var = sff0Var2.g.y;
            q0s q0sVar = q0s.f27918a;
            int i = 10;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            for (d0t d0tVar : list2) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((lok0) next).f20396a != d0tVar.O);
                lok0 lok0Var = (lok0) next;
                q0s q0sVar2 = q0sVar;
                boolean z5 = sff0Var2.J;
                ArrayList arrayList2 = arrayList;
                String str = fcgVar2.b;
                ArrayList arrayList3 = new ArrayList(r3d.q(list, i));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                }
                boolean z6 = lok0Var != null ? lok0Var.n : false;
                boolean z7 = lok0Var != null ? lok0Var.p : false;
                if (d0tVar.K.isEmpty()) {
                    List list3 = d0tVar.k;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!((d0t) it3.next()).K.isEmpty()) {
                                    if (z3) {
                                        m5l0Var = k5l0.f17726a;
                                    } else {
                                        m5l0Var = l5l0.f19463a;
                                    }
                                }
                            }
                        }
                    }
                    m5l0Var = i5l0.f14197a;
                } else if (z3) {
                    m5l0Var = k5l0.f17726a;
                } else {
                    m5l0Var = l5l0.f19463a;
                }
                String str2 = lok0Var != null ? lok0Var.u : null;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(wwb.V(d0tVar, ctf0Var2, y78Var, z, z5, str, false, arrayList3, z6, z7, false, v5l0Var, m5l0Var, str2, z4));
                ctf0Var2 = ctf0Var;
                sff0Var2 = sff0Var;
                arrayList = arrayList2;
                lc00VarB = lc00VarB;
                q0sVar = q0sVar2;
                i = 10;
                fcgVar2 = fcgVar;
            }
            lc00 lc00Var2 = lc00VarB;
            lc00Var = lc00Var2;
            lc00Var.add(new ieg(z2 ? "LIVE_GAMES" : "LINE_GAME", new vb90(q0sVar, dyb.o0(arrayList), true, z4)));
        }
        return kotlin.collections.a.a(lc00Var);
    }

    public static final kiu0 G(Fragment fragment, sgy sgyVar, Function0 function0, Function0 function1, Function0 function2) {
        fragment.getClass();
        sgyVar.getClass();
        if (function2 == null) {
            function2 = new ti6(fragment, (byte) 3);
        }
        return new kiu0(sgyVar, function0, function2, function1);
    }

    public static final void H(long j, fet fetVar, int i) {
        fetVar.g0(-897175518);
        int i2 = (fetVar.f(j) ? 4 : 2) | i;
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.s(s5x0.L(jm40.b, 8.0f, 0.0f, 2), 8.0f), 8.0f), "DRAW_CIRCLE");
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dls(b, j);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            boolean z2 = i3 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dls(b2, j);
                fetVar.o0(objP2);
            }
            p8a.k(mm40VarA, (Function1) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a21(j, i, (byte) 15);
        }
    }

    public static final void I(fhl fhlVar, dfv dfvVar) {
        dfvVar.c(fhlVar.A0().i(), (dfv) fhlVar.A0().c);
    }

    public static final String J(EditProfileTjItemEnum editProfileTjItemEnum) {
        editProfileTjItemEnum.getClass();
        switch (editProfileTjItemEnum.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return "";
            case 4:
                return "SURNAME";
            case 5:
                return "NAME";
            case 6:
                return "MIDDLE_NAME";
            case 7:
                return "BIRTHDATE";
            case 8:
                return CommonConstant.RETKEY.GENDER;
            case 9:
                return "RESIDENT_STATUS";
            case 10:
                return "COUNTRY";
            case 11:
                return "REGION";
            case 12:
                return "CITY";
            case 13:
                return "REGISTRATION_ADDRESS";
            case 14:
                return "PASSPORT_NUMBER";
            case 15:
                return "INN";
            default:
                t9f.b();
                return null;
        }
    }

    public static final String K(q7f0 q7f0Var, ctf0 ctf0Var, Integer num) {
        int i;
        ctf0Var.getClass();
        int iOrdinal = q7f0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.visual_registration_by_email, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 2) {
            return ctf0Var.b.a(R.string.visual_registration_by_one_click, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return ctf0Var.b.a(R.string.reg_import_PD, Arrays.copyOf(new Object[0], 0));
            }
            t9f.b();
            return null;
        }
        if (num == null) {
            return ctf0Var.b.a(R.string.visual_registration_by_social_networks, Arrays.copyOf(new Object[0], 0));
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            i = R.string.social_vk;
        } else if (iIntValue == 5) {
            i = R.string.social_ok;
        } else if (iIntValue == 7) {
            i = R.string.social_yandex;
        } else if (iIntValue == 9) {
            i = R.string.social_mailru_label_new;
        } else if (iIntValue == 11) {
            i = R.string.social_google;
        } else if (iIntValue == 13) {
            i = R.string.social_x_com;
        } else if (iIntValue == 17) {
            i = R.string.social_telegram;
        } else if (iIntValue == 19) {
            i = R.string.social_apple_id;
        } else if (iIntValue != 26) {
            i = iIntValue != 31 ? -1 : R.string.social_discord;
        } else {
            i = R.string.social_its_me;
        }
        lsm0 lsm0Var = ctf0Var.b;
        return lsm0Var.a(R.string.registration_networks_one_v2, Arrays.copyOf(new Object[]{lsm0Var.a(i, Arrays.copyOf(new Object[0], 0))}, 1));
    }

    public static final boolean L(Throwable th) {
        th.getClass();
        if (!(th instanceof zhi0)) {
            return false;
        }
        IntRange intRange = pnm0.f27296a;
        IntRange intRange2 = pnm0.c;
        int i = intRange2.f46068a;
        int i2 = intRange2.b;
        int i3 = ((zhi0) th).f44396a;
        return i <= i3 && i3 <= i2;
    }

    public static final boolean M(Throwable th) {
        th.getClass();
        return (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof SSLHandshakeException) || (th instanceof ConnectException);
    }

    public static final boolean N(Throwable th) {
        if (!(th instanceof zhi0)) {
            return false;
        }
        IntRange intRange = pnm0.d;
        int i = intRange.f46068a;
        int i2 = intRange.b;
        int i3 = ((zhi0) th).f44396a;
        return i <= i3 && i3 <= i2;
    }

    public static final void O(u7o0 u7o0Var, float f) {
        Iterator it = q3d.j(u7o0Var.b, u7o0Var.e, u7o0Var.f).iterator();
        while (it.hasNext()) {
            Q((View) it.next(), f);
        }
    }

    public static final void P(u7o0 u7o0Var, float f) {
        Iterator it = q3d.j(u7o0Var.c, u7o0Var.g, u7o0Var.h).iterator();
        while (it.hasNext()) {
            Q((View) it.next(), f);
        }
    }

    public static final void Q(View view, float f) {
        view.animate().alpha(f).setDuration(200L).getClass();
    }

    public static final jwe R(EventItem eventItem) {
        eventItem.getClass();
        long j = eventItem.h;
        String str = eventItem.o;
        List list = eventItem.q;
        List list2 = eventItem.n;
        long j2 = eventItem.g;
        if (j2 == 0) {
            j2 = j;
        }
        long j3 = eventItem.i1;
        long j4 = j2;
        long j5 = eventItem.s;
        long j6 = eventItem.u;
        String str2 = eventItem.j1;
        String strN = ohs0.n(eventItem.l, str.length() > 0 ? kng0.k(" - ", str) : "");
        String str3 = eventItem.l;
        String str4 = eventItem.o;
        int iMax = Math.max(list2.size(), list.size());
        String str5 = (String) CollectionsKt.firstOrNull(list2);
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) (1 < list2.size() ? list2.get(1) : "");
        String str8 = (String) CollectionsKt.firstOrNull(list);
        String str9 = str8 == null ? "" : str8;
        String str10 = (String) (1 < list.size() ? list.get(1) : "");
        double d = eventItem.c;
        double d2 = eventItem.g1;
        String str11 = eventItem.f1;
        String str12 = str11.length() > 0 ? ". " : null;
        String strQ = w6x.q(str11, str12 == null ? "" : str12, eventItem.v);
        String str13 = eventItem.b;
        long j7 = eventItem.e;
        long j8 = eventItem.h1;
        uoy uoyVar = eventItem.k ? uoy.LIVE : uoy.LINE;
        yfa0 yfa0Var = yfa0.INSTANCE;
        String str14 = eventItem.Z;
        EventParams eventParams = eventItem.m1;
        return new jwe(j, j4, j6, j5, j3, str2, strQ, str13, "", j8, d2, strN, str3, str4, iMax, str6, str7, str9, str10, j7, d, uoyVar, yfa0Var, "", str14, new yeo(eventParams.f46427a, eventParams.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v19, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.iun] */
    public static final ieh S(leh lehVar) {
        ?? arrayList;
        List<heh> list;
        ?? arrayList2;
        ?? arrayList3;
        List<ffh> list2 = lehVar.f19901a;
        List list3 = null;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (ffh ffhVar : list2) {
                Long l = ffhVar.f9446a;
                long jLongValue = l != null ? l.longValue() : 0L;
                List<bfh> list4 = ffhVar.b;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                    for (bfh bfhVar : list4) {
                        Integer num = bfhVar.f2502a;
                        int iIntValue = num != null ? num.intValue() : 0;
                        String str = bfhVar.b;
                        if (str == null) {
                            str = "";
                        }
                        arrayList4.add(new yeh(iIntValue, str));
                    }
                    arrayList3 = new ArrayList();
                    for (Object obj : arrayList4) {
                        if (((yeh) obj).f42485a != 10) {
                            arrayList3.add(obj);
                        }
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                arrayList.add(new cfh(jLongValue, arrayList3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List list5 = lehVar.b;
        if (list5 != null && (list = (List) CollectionsKt.firstOrNull(list5)) != null) {
            ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
            for (heh hehVar : list) {
                Integer num2 = hehVar.f12923a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                List<deh> list6 = hehVar.b;
                if (list6 != null) {
                    ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                    for (deh dehVar : list6) {
                        Integer num3 = dehVar.f5950a;
                        int iIntValue3 = num3 != null ? num3.intValue() : 0;
                        Integer num4 = dehVar.b;
                        int iIntValue4 = num4 != null ? num4.intValue() : 0;
                        List list7 = dehVar.c;
                        if (list7 == null) {
                            list7 = iun.f15405a;
                        }
                        String str2 = dehVar.d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList6.add(new aeh(iIntValue3, iIntValue4, str2, list7));
                    }
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList6) {
                        if (((aeh) obj2).f728a != 10) {
                            arrayList2.add(obj2);
                        }
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                arrayList5.add(new eeh(iIntValue2, arrayList2));
            }
            list3 = arrayList5;
        }
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        return new ieh(arrayList, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    public static final ueh T(xeh xehVar) {
        ?? arrayList;
        qeh qehVar;
        ieh iehVar;
        leh lehVar;
        List list;
        ieh iehVar2;
        Integer num = xehVar.f40746a;
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        List<mhh> list2 = xehVar.b;
        ?? arrayList2 = 0;
        arrayList2 = 0;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (mhh mhhVar : list2) {
                String str = mhhVar.f21793a;
                if (str == null) {
                    str = "";
                }
                String str2 = mhhVar.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = mhhVar.d;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new hhh(str, str2, str3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        teh tehVar = xehVar.c;
        if (tehVar != null) {
            ydh ydhVar = tehVar.f33820a;
            if (ydhVar != null && (list = ydhVar.f42437a) != null) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    peh pehVar = (peh) obj;
                    long j = i;
                    String str4 = pehVar.f26852a;
                    if (str4 == null) {
                        str4 = "";
                    }
                    leh lehVar2 = pehVar.b;
                    if (lehVar2 != null) {
                        iehVar2 = S(lehVar2);
                    } else {
                        iun iunVar = iun.f15405a;
                        iehVar2 = new ieh(iunVar, iunVar);
                    }
                    arrayList3.add(new meh(j, str4, iehVar2));
                    i = i2;
                }
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    meh mehVar = (meh) obj2;
                    String str5 = mehVar.b;
                    ieh iehVar3 = mehVar.c;
                    if (str5.length() > 0 && !iehVar3.f14633a.isEmpty() && !iehVar3.b.isEmpty()) {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            if (ydhVar == null || (lehVar = ydhVar.b) == null) {
                iun iunVar2 = iun.f15405a;
                iehVar = new ieh(iunVar2, iunVar2);
            } else {
                iehVar = S(lehVar);
            }
            qehVar = new qeh(arrayList2, iehVar);
        } else {
            iun iunVar3 = iun.f15405a;
            qehVar = new qeh(iunVar3, new ieh(iunVar3, iunVar3));
        }
        return new ueh(iIntValue, arrayList, qehVar);
    }

    public static final GenerateCouponTypeUiModel U(cdq cdqVar, int i) {
        cdqVar.getClass();
        String str = cdqVar.b;
        int i2 = cdqVar.f4173a;
        return new GenerateCouponTypeUiModel(str, i2, i2 == i);
    }

    public static final lc00 V(ArrayList arrayList, ArrayList arrayList2, mrf mrfVar, boolean z) {
        int i;
        wpf wpfVar = z ? wpf.b : wpf.f39542a;
        if (!z) {
            arrayList = arrayList2;
        }
        fof fofVar = mrfVar.f22269a;
        trf trfVar = fofVar.b;
        if (trfVar.c != wpfVar) {
            trfVar = fofVar.c;
        }
        List<pqf> list = trfVar.f34420a;
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        for (pqf pqfVar : list) {
            arrayList3.add(new vof(pqfVar.f27413a, pqfVar.k, pqfVar.l, pqfVar.m, z ? wpf.b : wpf.f39542a, pqfVar.i, pqfVar.j));
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayList, arrayList3);
        HashSet hashSet = new HashSet();
        ArrayList<vof> arrayList4 = new ArrayList();
        for (Object obj : arrayListQ0) {
            if (hashSet.add(((vof) obj).f37763a)) {
                arrayList4.add(obj);
            }
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        for (vof vofVar : arrayList4) {
            int i2 = vofVar.b;
            int i3 = vofVar.c;
            String str = vofVar.f37763a;
            int i4 = vofVar.d;
            boolean z2 = vofVar.f;
            if (!z2 && z) {
                i = R.drawable.cs2_map_ct_dead_player_ic;
            } else if (!z2 && !z) {
                i = R.drawable.cs2_map_t_dead_player_ic;
            } else if (z) {
                i = R.drawable.cs2_map_ct_player_ic;
            } else {
                i = vofVar.g ? R.drawable.cs2_map_t_bomb_player_ic : R.drawable.cs2_map_t_player_ic;
            }
            lc00VarB.add(new wof(str, i2, i3, i4, z2, i));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final boolean W(Throwable th) {
        th.getClass();
        return (th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError;
    }

    public static final void a(mm40 mm40Var, d1m d1mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1141829554);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d1mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (d1mVar != null) {
                if (d1mVar instanceof b1m) {
                    fetVar.e0(-103059965);
                    b1m b1mVar = (b1m) d1mVar;
                    f(mm40Var, R.drawable.ic_glyph_lock, b1mVar.c, b1mVar.f1813a, b1mVar.b, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (d1mVar instanceof c1m) {
                    fetVar.e0(-102715741);
                    c1m c1mVar = (c1m) d1mVar;
                    f(mm40Var, R.drawable.ic_glyph_lock, c1mVar.c, c1mVar.f3579a, c1mVar.b, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (d1mVar instanceof z0m) {
                    fetVar.e0(-102377345);
                    z0m z0mVar = (z0m) d1mVar;
                    long j = z0mVar.b;
                    long j2 = z0mVar.f43574a;
                    zcl zclVar = qmk.f28987a;
                    e(mm40Var, R.drawable.ic_glyph_lock, j, j2, 14.0f, 10.0f, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (d1mVar instanceof a1m) {
                    fetVar.e0(-101989473);
                    a1m a1mVar = (a1m) d1mVar;
                    long j3 = a1mVar.b;
                    long j4 = a1mVar.f76a;
                    zcl zclVar2 = qmk.f28987a;
                    e(mm40Var, R.drawable.ic_glyph_lock, j3, j4, 16.0f, 12.0f, fetVar, i2 & 14);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-2081535919, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) d1mVar, i, (byte) 8);
        }
    }

    public static final void b(mm40 mm40Var, g1m g1mVar, fet fetVar, int i) {
        int i2;
        ljc ljcVar = jd8.n;
        fetVar.g0(-86477678);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(g1mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (g1mVar != null) {
                if (g1mVar instanceof f1m) {
                    fetVar.e0(724069185);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(mm40Var, 10.0f);
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ = i120.Q(lgb.J(mm40VarN, ugg0Var), ((f1m) g1mVar).f8770a, ljcVar);
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
                    zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.n(jm40.b, 6.0f), ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), ljcVar));
                    fetVar.r(true);
                    fetVar.r(false);
                } else if (g1mVar instanceof e1m) {
                    fetVar.e0(724644204);
                    zcl zclVar2 = qmk.f28987a;
                    zq8.a(0, fetVar, i120.Q(lgb.J(o7k0.n(mm40Var, 6.0f), vgg0.f37379a), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), ljcVar));
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1500665612, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) g1mVar, i, (byte) 9);
        }
    }

    public static final void c(mm40 mm40Var, m1m m1mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1080814872);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(m1mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (m1mVar != null) {
                if (m1mVar instanceof i1m) {
                    fetVar.e0(814160143);
                    dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar), null, o7k0.n(mm40Var, ((i1m) m1mVar).f14005a.a()), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar, 56, 0);
                    fetVar.r(false);
                } else if (m1mVar instanceof k1m) {
                    fetVar.e0(814504057);
                    k1m k1mVar = (k1m) m1mVar;
                    f(mm40Var, R.drawable.ic_glyph_popular, ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), k1mVar.f17532a, k1mVar.b, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (m1mVar instanceof l1m) {
                    fetVar.e0(814864153);
                    l1m l1mVar = (l1m) m1mVar;
                    f(mm40Var, R.drawable.ic_glyph_popular, ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), l1mVar.f19260a, l1mVar.b, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (m1mVar instanceof h1m) {
                    fetVar.e0(815218421);
                    long jM113getRed0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                    long j = ((h1m) m1mVar).f12290a;
                    zcl zclVar = qmk.f28987a;
                    e(mm40Var, R.drawable.ic_glyph_popular, jM113getRed0d7_KjU, j, 14.0f, 10.0f, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (m1mVar instanceof j1m) {
                    fetVar.e0(815622165);
                    long jM113getRed0d7_KjU2 = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                    long j2 = ((j1m) m1mVar).f15743a;
                    zcl zclVar2 = qmk.f28987a;
                    e(mm40Var, R.drawable.ic_glyph_popular, jM113getRed0d7_KjU2, j2, 16.0f, 12.0f, fetVar, i2 & 14);
                    fetVar.r(false);
                }
            }
            throw b1j.f(718999040, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) m1mVar, i, (byte) 6);
        }
    }

    public static final void d(mm40 mm40Var, s1m s1mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1240452108);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s1mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (s1mVar != null) {
                if (s1mVar instanceof o1m) {
                    fetVar.e0(410320987);
                    o1m o1mVar = (o1m) s1mVar;
                    dww.c(a8k0.F(R.drawable.ic_glyph_show, 0, fetVar), null, o7k0.n(mm40Var, o1mVar.f24487a.a()), o1mVar.b, fetVar, 56, 0);
                    fetVar.r(false);
                } else if (s1mVar instanceof q1m) {
                    fetVar.e0(410647045);
                    q1m q1mVar = (q1m) s1mVar;
                    f(mm40Var, R.drawable.ic_glyph_show, q1mVar.c, q1mVar.f27961a, q1mVar.b, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (s1mVar instanceof r1m) {
                    fetVar.e0(410989285);
                    r1m r1mVar = (r1m) s1mVar;
                    f(mm40Var, R.drawable.ic_glyph_show, r1mVar.c, r1mVar.f29688a, r1mVar.b, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (s1mVar instanceof n1m) {
                    fetVar.e0(411325697);
                    n1m n1mVar = (n1m) s1mVar;
                    long j = n1mVar.b;
                    long j2 = n1mVar.f22757a;
                    zcl zclVar = qmk.f28987a;
                    e(mm40Var, R.drawable.ic_glyph_show, j, j2, 14.0f, 10.0f, fetVar, i2 & 14);
                    fetVar.r(false);
                } else if (s1mVar instanceof p1m) {
                    fetVar.e0(411711585);
                    p1m p1mVar = (p1m) s1mVar;
                    long j3 = p1mVar.b;
                    long j4 = p1mVar.f26209a;
                    zcl zclVar2 = qmk.f28987a;
                    e(mm40Var, R.drawable.ic_glyph_show, j3, j4, 16.0f, 12.0f, fetVar, i2 & 14);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1926427350, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) s1mVar, i, (byte) 10);
        }
    }

    public static final void e(final mm40 mm40Var, final int i, final long j, final long j2, final float f, final float f2, fet fetVar, final int i2) {
        int i3;
        fetVar.g0(-641709440);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.d(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f2) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.n(mm40Var, f), vgg0.f37379a), j2, jd8.n);
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
            dww.c(a8k0.F(i, (i3 >> 3) & 14, fetVar), null, o7k0.n(jm40.b, f2), j, fetVar, 56 | ((i3 << 3) & 7168), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.v0m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    agc.e(mm40Var, i, j, j2, f, f2, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(final mm40 mm40Var, final int i, final long j, final long j2, final long j3, fet fetVar, final int i2) {
        int i3;
        fetVar.g0(1059758425);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.f(j3) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 16.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(i120.Q(mm40VarN, j3, ugg0Var), 1.0f, j2, ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            dww.c(a8k0.F(i, (i3 >> 3) & 14, fetVar), null, o7k0.n(mm40Var, 12.0f), j, fetVar, 56 | ((i3 << 3) & 7168), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.w0m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    agc.f(mm40Var, i, j, j2, j3, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void g(hwv0 hwv0Var, fet fetVar, int i) {
        int i2;
        i3t0 i3t0Var;
        fetVar.g0(282359399);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hwv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            String name = mji.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new yfc(application, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 0);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP2 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP2);
            }
            Object obj2 = ((kgd) objP2).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.chooselang.di.LanguageFragmentComponent");
                return;
            }
            sgy sgyVarB = sre0.f32672a.b(ygc.class);
            q0h0 q0h0Var = new q0h0((lji) ((mji) obj2).g.get());
            int i3 = ygc.w;
            i3t0 i3t0Var2 = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var2.y(fetVar);
            boolean zI = ((i2 & 14) == 4) | fetVar.i(i3t0Var2);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new h6c(hwv0Var, i3t0Var2, (byte) 7);
                fetVar.o0(objP3);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP3, fetVar);
            boolean zI2 = fetVar.i(i3t0Var2) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                i3t0Var = i3t0Var2;
                Object xfcVar = new xfc(i3t0Var, clzVar, pz40VarF, null, (byte) 0);
                fetVar.o0(xfcVar);
                objP4 = xfcVar;
            } else {
                i3t0Var = i3t0Var2;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP4);
            ugd ugdVarM = u1c.M(-821667098, new wfc(pz40VarY, i3t0Var, b), fetVar);
            pwv0 pwv0Var = hwv0Var.f13784a;
            pwv0Var.e(ugdVarM);
            pwv0Var.a(u1c.M(-1260392240, new wfc(pz40VarY, i3t0Var, b2), fetVar));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(hwv0Var, i, (byte) 16);
        }
    }

    public static final void h(k7q0 k7q0Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        mm40 mm40VarW;
        fetVar.g0(1533506138);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.i(k7q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.e0(-885604480);
            if (k7q0Var.i()) {
                yje yjeVar = null;
                mm40VarW = eeq.W(x8f.c0(new e7q0(k7q0Var, yjeVar, b2)), k7q0Var.y, new bu(k7q0Var, yjeVar, (byte) 22), new f7q0(k7q0Var, yjeVar, b2), new sme(k7q0Var, b));
            } else {
                mm40VarW = jm40.b;
            }
            efx.j(mm40VarW, ugdVar, fetVar, i2 & 112);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w8d(k7q0Var, ugdVar, i, b2);
        }
    }

    public static final void i(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var, boolean z) {
        ugd ugdVar3;
        mm40 mm40Var2;
        boolean z2;
        fetVar.g0(1840579278);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | 16;
        boolean z3 = false;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                z3 = z;
            } else if (fetVar.k(bmd.n) == k6z.b) {
                z3 = true;
            }
            fetVar.s();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new y2d((byte) 20);
                fetVar.o0(objP);
            }
            mm40Var2 = mm40Var;
            mm40 mm40VarK = rq8.K(mm40Var2, (Function1) objP);
            boolean zH = fetVar.h(z3);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                objP2 = new kp2((byte) 3, z3);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            jm40 jm40Var = jm40.b;
            ugdVar3 = ugdVar2;
            ugdVar3.F(mrv.k0(jm40Var, "SCORE"), fetVar, 54);
            ugdVar.F(mrv.k0(jm40Var, Request.INFO), fetVar, 54);
            fetVar.r(true);
            z2 = z3;
        } else {
            ugdVar3 = ugdVar2;
            mm40Var2 = mm40Var;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gka(mm40Var2, z2, ugdVar, ugdVar3, i, (byte) 1);
        }
    }

    public static final void j(mm40 mm40Var, cqh cqhVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        cqhVar.getClass();
        fetVar2.g0(-496733775);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(cqhVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
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
            String str = cqhVar.f4793a;
            long j = iph.g;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.i(), fetVar, 0, 24960, 109562);
            String str2 = cqhVar.b;
            long j2 = iph.f;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, cqhVar, i, (byte) 11);
        }
    }

    public static final void k(f4k f4kVar, Function1 function1, fet fetVar, int i) {
        f4kVar.getClass();
        function1.getClass();
        fetVar.g0(-1943900548);
        byte b = 16;
        int i2 = (fetVar.g(f4kVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            String str = f4kVar.f8917a;
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) new tui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getWarning())), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_trash), null, new m0x(R.drawable.ic_glyph_trash, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getWarning()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getWarningTint())), 0.0f, 210), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, b);
                fetVar.o0(objP);
            }
            obc.q(mm40VarE, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(f4kVar, function1, i, (byte) 3);
        }
    }

    public static final void l(htk htkVar, Function2 function2, fet fetVar, int i) {
        int i2;
        yx7 yx7Var = gqw0.k;
        function2.getClass();
        fetVar.g0(245136383);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(htkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function2) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = htkVar instanceof ftk;
            byte b = 14;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1413831747);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 56.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                int i3 = i2;
                mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
                lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new ngh(htkVar, function2, (byte) 15);
                    fetVar.o0(objP);
                }
                b8k0.f(mm40VarC, xczVarA, lh80VarT, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 196614, 456);
                zfn zfnVar = zaq0.b;
                dwi0.q(xczVarA, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent0(), 24.0f, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                if (!(htkVar instanceof gtk)) {
                    throw b1j.f(-647130350, fetVar, false);
                }
                fetVar.e0(1415020411);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 56.0f), 1.0f);
                qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
                lh80 lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new vbk((byte) 19);
                    fetVar.o0(objP2);
                }
                b8k0.f(mm40VarD2, xczVarA, lh80VarT2, false, qw3Var2, yx7Var, null, false, null, (Function1) objP2, fetVar, 805502976, 456);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(htkVar, function2, i, (byte) 24);
        }
    }

    public static final void m(mm40 mm40Var, krl krlVar, fet fetVar, int i) {
        fetVar.g0(-1696187366);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(krlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(null) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = krlVar instanceof irl;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(2051523404);
                n(jm40Var, (irl) krlVar, fetVar, i2 & 1022);
                fetVar.r(false);
            } else {
                if (!krlVar.equals(jrl.f17007a)) {
                    throw b1j.f(2051521224, fetVar, false);
                }
                fetVar.e0(2051530735);
                o(i2 & 14, fetVar, jm40Var);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new crl(mm40Var, krlVar, i, b);
        }
    }

    public static final void n(mm40 mm40Var, irl irlVar, fet fetVar, int i) {
        int i2;
        ugg0 ugg0Var;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(-983625261);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(irlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(null) ? 256 : 128;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar3.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean zH = fetVar3.h(((Boolean) pz40Var.getValue()).booleanValue());
            Object objP2 = fetVar3.P();
            if (zH || objP2 == cl5Var) {
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    zcl zclVar = qmk.f28987a;
                    ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else {
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    ugg0Var = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
                }
                objP2 = androidx.compose.runtime.e.e(ugg0Var);
                fetVar3.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            mm40 mm40VarH = phu0.H(i120.Q(lgb.J(jm40.b, (yjj0) pz40Var2.getValue()), ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), jd8.n), null, 1);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP3 = fetVar.P();
            byte b = 14;
            if (z2 || objP3 == cl5Var) {
                objP3 = new cml(pz40Var, b);
                fetVar2 = fetVar;
                fetVar2.o0(objP3);
            } else {
                fetVar2 = fetVar;
            }
            mm40 mm40VarY = y860.Y(mm40VarH, false, null, null, (Function0) objP3, 15);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarY, 12.0f, 4.0f, 4.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            kjm kjmVar = kjm.f18392a;
            hjm hjmVar = new hjm(irlVar.f15262a, null, null, null, null, null, false, null, null, false, null, null, 8190);
            boolean z3 = i3 == 256;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new cml(pz40Var, (byte) 15);
                fetVar2.o0(objP4);
            }
            nkb.h(x7zVarI, hjmVar, kjmVar, (Function0) objP4, null, null, fetVar2, 384, 48);
            fet fetVar4 = fetVar2;
            zb zbVar = new zb(null, null, 7);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean z4 = i3 == 256;
            Object objP5 = fetVar4.P();
            if (z4 || objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 16);
                fetVar4.o0(objP5);
            }
            acb.n(zbVar, zBooleanValue, (Function0) objP5, null, fetVar4, 0, 8);
            fetVar4.r(true);
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, u1c.M(1589092769, new drl(irlVar, (byte) 0), fetVar4), fetVar, 1572870, 30);
            fetVar3 = fetVar;
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new erl(mm40Var, irlVar, i, (byte) 0);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1732414869);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 288.0f), 1.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 20);
        }
    }

    public static final void p(mm40 mm40Var, t1m t1mVar, fet fetVar, int i, int i2) {
        t1mVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if (t1mVar instanceof d1m) {
            fetVar.e0(315442008);
            a(o2e.e0(mm40Var, "BADGE_BLOCKED_CONTAINER"), (d1m) t1mVar, fetVar, i & 112);
            fetVar.r(false);
            return;
        }
        if (t1mVar instanceof m1m) {
            fetVar.e0(315642361);
            c(mm40Var, (m1m) t1mVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (t1mVar instanceof s1m) {
            fetVar.e0(315809916);
            d(o2e.e0(mm40Var, "BADGE_TRACK_CONTAINER"), (s1m) t1mVar, fetVar, i & 112);
            fetVar.r(false);
        } else {
            if (!(t1mVar instanceof g1m)) {
                throw b1j.f(1534195007, fetVar, false);
            }
            fetVar.e0(316005402);
            b(mm40Var, (g1m) t1mVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final void q(mm40 mm40Var, edm edmVar, xdr xdrVar, Function1 function1, fet fetVar, int i) {
        xdrVar.getClass();
        if (edmVar instanceof adm) {
            fetVar.e0(-821380843);
            tdc.j(mm40Var, (adm) edmVar, xdrVar, fetVar, i & 1022);
            fetVar.r(false);
        } else {
            if (!(edmVar instanceof ddm)) {
                throw b1j.f(1358975566, fetVar, false);
            }
            fetVar.e0(-821150947);
            hic.l(mm40Var, (ddm) edmVar, xdrVar, function1, fetVar, i & 8190);
            fetVar.r(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01db  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:140:0x0228  */
    /* JADX WARN: Code duplicated, block: B:141:0x022c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0240  */
    /* JADX WARN: Code duplicated, block: B:145:0x0259  */
    /* JADX WARN: Code duplicated, block: B:148:0x0273  */
    /* JADX WARN: Code duplicated, block: B:150:0x0287  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:164:0x0310  */
    /* JADX WARN: Code duplicated, block: B:166:0x0314  */
    /* JADX WARN: Code duplicated, block: B:168:0x0335  */
    /* JADX WARN: Code duplicated, block: B:170:0x033a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0357  */
    /* JADX WARN: Code duplicated, block: B:173:0x035f  */
    /* JADX WARN: Code duplicated, block: B:174:0x037f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0386  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:179:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:180:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03db  */
    /* JADX WARN: Code duplicated, block: B:183:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:185:0x0400  */
    /* JADX WARN: Code duplicated, block: B:186:0x0421  */
    /* JADX WARN: Code duplicated, block: B:188:0x0425  */
    /* JADX WARN: Code duplicated, block: B:189:0x044c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0450  */
    /* JADX WARN: Code duplicated, block: B:192:0x047a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0480  */
    /* JADX WARN: Code duplicated, block: B:195:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:198:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:200:0x04de  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:210:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x0507  */
    /* JADX WARN: Code duplicated, block: B:214:0x0517  */
    /* JADX WARN: Code duplicated, block: B:216:0x051d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x052b  */
    /* JADX WARN: Code duplicated, block: B:227:0x054b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0554  */
    /* JADX WARN: Code duplicated, block: B:232:0x056f  */
    /* JADX WARN: Code duplicated, block: B:234:0x057f  */
    /* JADX WARN: Code duplicated, block: B:236:0x0584  */
    /* JADX WARN: Code duplicated, block: B:239:0x058d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0591  */
    /* JADX WARN: Code duplicated, block: B:242:0x0594  */
    /* JADX WARN: Code duplicated, block: B:244:0x0598  */
    /* JADX WARN: Code duplicated, block: B:245:0x059b  */
    /* JADX WARN: Code duplicated, block: B:250:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:252:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:257:0x05da  */
    /* JADX WARN: Code duplicated, block: B:260:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0100  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static final void r(mm40 mm40Var, zrm zrmVar, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function1 function4, fet fetVar, int i, int i2) {
        int i3;
        Function0 function5;
        int i4;
        int i5;
        int i6;
        Function0 function6;
        int i7;
        int i8;
        Function1 function7;
        int i9;
        int i10;
        Function1 function8;
        int i11;
        boolean z;
        mm40 mm40Var2;
        Function1 function9;
        Function1 function10;
        Function0 function11;
        Function0 function12;
        Function0 function13;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        mm40 mm40Var3;
        Function0 function14;
        Function0 function15;
        Function1 function16;
        u1l0 u1l0Var;
        f2l0 f2l0Var;
        g3l0 g3l0Var;
        n3l0 n3l0Var;
        Function1 function17;
        mm40 mm40VarD;
        Function1 function18;
        yjj0 yjj0VarC;
        boolean z2;
        pcy pcyVar;
        boolean z3;
        boolean z4;
        Object objP;
        boolean z5;
        Object objP2;
        int i12;
        int i13;
        Function1 function19;
        jm40 jm40Var2;
        Function0 function20;
        Function1 function21;
        float f;
        float f2;
        int i14;
        boolean z6;
        Function1 function22;
        Function1 function23;
        boolean z7;
        Object objP3;
        boolean z8;
        Object objP4;
        boolean z9;
        zrm zrmVar2 = zrmVar;
        fet fetVar2 = fetVar;
        ljc ljcVar = jd8.n;
        zrmVar2.getClass();
        fetVar2.g0(680021936);
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(zrmVar2) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                function5 = function0;
                i3 |= fetVar2.i(function5) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (fetVar2.i(function1)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function6 = function2;
                        if (fetVar2.i(function6)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                        function7 = function3;
                    } else {
                        function7 = function3;
                        if ((i & 196608) == 0) {
                            if (fetVar2.i(function7)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function8 = function4;
                    } else {
                        function8 = function4;
                        if ((i & 1572864) == 0) {
                            if (fetVar2.i(function8)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar2.U(i3 & 1, z)) {
                        jm40Var = jm40.b;
                        if (i15 != 0) {
                            mm40Var3 = jm40Var;
                        } else {
                            mm40Var3 = mm40Var;
                        }
                        if (i16 != 0) {
                            function14 = null;
                        } else {
                            function14 = function5;
                        }
                        if (i4 != 0) {
                            function15 = null;
                        } else {
                            function15 = function1;
                        }
                        if (i6 != 0) {
                            function6 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        }
                        if (i10 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        u1l0Var = zrmVar2.b;
                        f2l0Var = zrmVar2.f44861a;
                        g3l0Var = zrmVar2.c;
                        n3l0Var = zrmVar2.e;
                        function17 = function7;
                        mm40VarD = o7k0.d(mm40Var3, 1.0f);
                        if (n3l0Var != null) {
                            mm40 mm40Var4 = mm40Var3;
                            if (n3l0Var instanceof j3l0) {
                                yjj0VarC = ljcVar;
                            } else {
                                if (n3l0Var instanceof l3l0) {
                                    yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                                } else {
                                    function18 = function16;
                                    if (n3l0Var instanceof k3l0) {
                                        yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                    } else if (n3l0Var instanceof m3l0) {
                                        yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                                    }
                                }
                                mm40 mm40VarJ = lgb.J(mm40VarD, yjj0VarC);
                                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                int iHashCode = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM = fetVar2.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
                                mkd.c0.getClass();
                                fetVar2.i0();
                                z2 = fetVar2.S;
                                pcyVar = e7z.u1;
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
                                mm40 mm40VarQ = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                                if (function14 == null || function15 != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((i3 & 7168) == 2048) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objP = fetVar2.P();
                                cl5 cl5Var = ukd.f35823a;
                                if (z4 || objP == cl5Var) {
                                    objP = new unl(function15, (byte) 24);
                                    fetVar2.o0(objP);
                                }
                                Function0 function24 = (Function0) objP;
                                if ((i3 & 896) == 256) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                objP2 = fetVar2.P();
                                if (z5 || objP2 == cl5Var) {
                                    objP2 = new unl(function14, (byte) 25);
                                    fetVar2.o0(objP2);
                                }
                                mm40 mm40VarZ = y860.Z(mm40VarQ, null, z3, function24, (Function0) objP2, 440);
                                zcl zclVar = qmk.f28987a;
                                i12 = i3;
                                mm40 mm40VarL = s5x0.L(mm40VarZ, 4.0f, 0.0f, 2);
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                                int iHashCode2 = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM2 = fetVar2.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
                                if (u1l0Var != null) {
                                    fetVar2.e0(-1355915336);
                                    g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                                    i13 = 0;
                                    fetVar2.r(false);
                                } else {
                                    i13 = 0;
                                    fetVar2.e0(-1355670808);
                                    fetVar2.r(false);
                                }
                                h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                                if (g3l0Var != null) {
                                    fetVar2.e0(-1355381578);
                                    int i17 = i12 >> 9;
                                    i14 = (i17 & 7168) | (i17 & 896) | 6;
                                    if (g3l0Var instanceof v2l0) {
                                        fetVar2.e0(1632507618);
                                        l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        z6 = false;
                                        if (g3l0Var instanceof w2l0) {
                                            fetVar2.e0(1632702267);
                                            w2l0 w2l0Var = (w2l0) g3l0Var;
                                            l8x.i(w2l0Var.b, 384, w2l0Var.f38455a, fetVar2, jm40Var);
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof d3l0) {
                                                fetVar2.e0(1632986661);
                                                d3l0 d3l0Var = (d3l0) g3l0Var;
                                                l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var.f5408a, d3l0Var.b);
                                                jm40Var2 = jm40Var;
                                                function23 = function17;
                                                z6 = false;
                                                fetVar2.r(false);
                                            } else {
                                                jm40Var2 = jm40Var;
                                                if (g3l0Var instanceof q2l0) {
                                                    fetVar2.e0(1633358816);
                                                    q2l0 q2l0Var = (q2l0) g3l0Var;
                                                    l8x.a(jm40Var2, q2l0Var.f28005a, q2l0Var.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                                    function23 = function17;
                                                    z6 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    if (g3l0Var instanceof r2l0) {
                                                        fetVar2.e0(1633673497);
                                                        l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                        function22 = function17;
                                                        z9 = false;
                                                        fetVar2.r(false);
                                                        function19 = function18;
                                                    } else {
                                                        function22 = function17;
                                                        if (g3l0Var instanceof b3l0) {
                                                            fetVar2.e0(1633933897);
                                                            Function1 function25 = function18;
                                                            l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function25, fetVar2, 6 | ((i14 >> 3) & 896));
                                                            function19 = function25;
                                                            z9 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function19 = function18;
                                                            if (g3l0Var instanceof x2l0) {
                                                                fetVar2.e0(1634194483);
                                                                x2l0 x2l0Var = (x2l0) g3l0Var;
                                                                function23 = function22;
                                                                l8x.j(jm40Var2, x2l0Var.f40173a, x2l0Var.b, x2l0Var.c, x2l0Var.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function23 = function22;
                                                                if (g3l0Var instanceof a3l0) {
                                                                    fetVar2.e0(1634665528);
                                                                    a3l0 a3l0Var = (a3l0) g3l0Var;
                                                                    l8x.m(jm40Var2, a3l0Var.f178a, a3l0Var.b, a3l0Var.c, a3l0Var.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    if (g3l0Var instanceof y2l0) {
                                                                        fetVar2.e0(1635210508);
                                                                        y2l0 y2l0Var = (y2l0) g3l0Var;
                                                                        function20 = function15;
                                                                        l8x.k(jm40Var2, y2l0Var.f41910a, y2l0Var.b, y2l0Var.c, y2l0Var.d, y2l0Var.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                        function23 = function23;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function20 = function15;
                                                                        if (g3l0Var instanceof e3l0) {
                                                                            fetVar2.e0(1635875055);
                                                                            e3l0 e3l0Var = (e3l0) g3l0Var;
                                                                            l8x.N(jm40Var2, e3l0Var.d, e3l0Var.b, e3l0Var.f7143a, e3l0Var.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                            function21 = function23;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else {
                                                                            function21 = function23;
                                                                            if (g3l0Var instanceof z2l0) {
                                                                                fetVar2.e0(1636326663);
                                                                                z2l0 z2l0Var = (z2l0) g3l0Var;
                                                                                l8x.l(z2l0Var.f43675a, z2l0Var.b, z2l0Var.c, jm40Var2, fetVar, 3072);
                                                                                jm40Var2 = jm40Var2;
                                                                                fetVar2 = fetVar;
                                                                                z6 = false;
                                                                                fetVar2.r(false);
                                                                            } else if (g3l0Var instanceof c3l0) {
                                                                                fetVar2.e0(1636711032);
                                                                                c3l0 c3l0Var = (c3l0) g3l0Var;
                                                                                l8x.q(jm40Var2, c3l0Var.f3682a, c3l0Var.b, c3l0Var.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                                function21 = function21;
                                                                                fetVar2 = fetVar2;
                                                                                z6 = false;
                                                                                fetVar2.r(false);
                                                                            } else if (g3l0Var instanceof s2l0) {
                                                                                fetVar2.e0(1637227988);
                                                                                s2l0 s2l0Var = (s2l0) g3l0Var;
                                                                                l8x.g(s2l0Var.b, mpe.f22175a, s2l0Var.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                                fetVar2 = fetVar;
                                                                                z6 = false;
                                                                                fetVar2.r(false);
                                                                                jm40Var2 = jm40Var2;
                                                                            } else if (g3l0Var instanceof u2l0) {
                                                                                fetVar2.e0(1637646643);
                                                                                u2l0 u2l0Var = (u2l0) g3l0Var;
                                                                                jm40Var2 = jm40Var2;
                                                                                l8x.f(jm40Var2, u2l0Var.e, u2l0Var.f34951a, u2l0Var.b, u2l0Var.c, u2l0Var.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                                function23 = function21;
                                                                                fetVar2 = fetVar2;
                                                                                z6 = false;
                                                                                fetVar2.r(false);
                                                                            } else if (g3l0Var instanceof t2l0) {
                                                                                fetVar2.e0(1638245966);
                                                                                t2l0 t2l0Var = (t2l0) g3l0Var;
                                                                                l8x.e(t2l0Var.d, t2l0Var.f33222a, t2l0Var.b, t2l0Var.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                                jm40Var2 = jm40Var2;
                                                                                function21 = function21;
                                                                                z6 = false;
                                                                                fetVar2.r(false);
                                                                            } else {
                                                                                function21 = function21;
                                                                                if (g3l0Var instanceof f3l0) {
                                                                                    throw b1j.f(52665976, fetVar2, false);
                                                                                }
                                                                                fetVar2.e0(1638774981);
                                                                                f3l0 f3l0Var = (f3l0) g3l0Var;
                                                                                boolean z10 = f3l0Var.b;
                                                                                boolean z11 = f3l0Var.f8869a;
                                                                                int i18 = (i14 & 896) ^ 384;
                                                                                z7 = (i18 <= 256 && fetVar2.g(function21)) || (i14 & 384) == 256;
                                                                                objP3 = fetVar2.P();
                                                                                if (z7 || objP3 == cl5Var) {
                                                                                    objP3 = new uck0(function21, (byte) 8);
                                                                                    fetVar2.o0(objP3);
                                                                                }
                                                                                Function0 function26 = (Function0) objP3;
                                                                                z8 = (i18 <= 256 && fetVar2.g(function21)) || (i14 & 384) == 256;
                                                                                objP4 = fetVar2.P();
                                                                                if (z8 || objP4 == cl5Var) {
                                                                                    objP4 = new uck0(function21, (byte) 11);
                                                                                    fetVar2.o0(objP4);
                                                                                }
                                                                                l8x.Q(6, fetVar2, jm40Var2, function26, (Function0) objP4, z10, z11);
                                                                                fetVar2 = fetVar2;
                                                                                jm40Var2 = jm40Var2;
                                                                                z6 = false;
                                                                                fetVar2.r(false);
                                                                            }
                                                                        }
                                                                    }
                                                                    function21 = function23;
                                                                }
                                                            }
                                                            function20 = function15;
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function22;
                                                    z6 = z9;
                                                }
                                            }
                                            function19 = function18;
                                            function20 = function15;
                                            function21 = function23;
                                        }
                                        fetVar2.r(z6);
                                    }
                                    function19 = function18;
                                    jm40Var2 = jm40Var;
                                    function20 = function15;
                                    function21 = function17;
                                    fetVar2.r(z6);
                                } else {
                                    function19 = function18;
                                    jm40Var2 = jm40Var;
                                    function20 = function15;
                                    function21 = function17;
                                    fetVar2.e0(-1355135128);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(true);
                                zrmVar2 = zrmVar;
                                if (zrmVar2.f) {
                                    fetVar2.e0(823957877);
                                    mm40 mm40VarB = jr8.f16991a.b(jm40Var2, gqw0.h);
                                    if (u1l0Var == null) {
                                        f = 12.0f;
                                    } else {
                                        if (!(u1l0Var instanceof q1l0)) {
                                            if (u1l0Var instanceof r1l0) {
                                                f = 60.0f;
                                            } else if (u1l0Var instanceof s1l0) {
                                                f = 54.0f;
                                            } else if (!(u1l0Var instanceof t1l0)) {
                                                t9f.b();
                                                return;
                                            }
                                        }
                                        f2 = 46.0f;
                                        mbc.o(agi0.f827a, s5x0.N(mm40VarB, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                        fetVar2.r(false);
                                    }
                                    f2 = f;
                                    mbc.o(agi0.f827a, s5x0.N(mm40VarB, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(824225996);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(true);
                                function9 = function21;
                                function11 = function14;
                                function10 = function19;
                                mm40Var2 = mm40Var4;
                                function12 = function20;
                            }
                            function18 = function16;
                            mm40 mm40VarJ2 = lgb.J(mm40VarD, yjj0VarC);
                            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                            int iHashCode3 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM3 = fetVar2.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ2);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            z2 = fetVar2.S;
                            pcyVar = e7z.u1;
                            if (z2) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            shd shdVar5 = gqw0.x;
                            jpm0.o(fetVar2, tj30VarC2, shdVar5);
                            shd shdVar6 = gqw0.w;
                            jpm0.o(fetVar2, bh90VarM3, shdVar6);
                            Integer numValueOf2 = Integer.valueOf(iHashCode3);
                            shd shdVar7 = gqw0.y;
                            jpm0.o(fetVar2, numValueOf2, shdVar7);
                            jpm0.n(fetVar2);
                            shd shdVar8 = gqw0.v;
                            jpm0.o(fetVar2, mm40VarC2, shdVar8);
                            mm40 mm40VarQ2 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                            if (function14 == null) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if ((i3 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objP = fetVar2.P();
                            cl5 cl5Var2 = ukd.f35823a;
                            if (z4) {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            } else {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            }
                            Function0 function27 = (Function0) objP;
                            if ((i3 & 896) == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objP2 = fetVar2.P();
                            if (z5) {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            } else {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            }
                            mm40 mm40VarZ2 = y860.Z(mm40VarQ2, null, z3, function27, (Function0) objP2, 440);
                            zcl zclVar2 = qmk.f28987a;
                            i12 = i3;
                            mm40 mm40VarL2 = s5x0.L(mm40VarZ2, 4.0f, 0.0f, 2);
                            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                            int iHashCode4 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM4 = fetVar2.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarL2);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, thg0VarA2, shdVar5);
                            jpm0.o(fetVar2, bh90VarM4, shdVar6);
                            vqd.u(iHashCode4, fetVar2, shdVar7, fetVar2);
                            jpm0.o(fetVar2, mm40VarC3, shdVar8);
                            if (u1l0Var != null) {
                                fetVar2.e0(-1355915336);
                                g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                                i13 = 0;
                                fetVar2.r(false);
                            } else {
                                i13 = 0;
                                fetVar2.e0(-1355670808);
                                fetVar2.r(false);
                            }
                            h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                            if (g3l0Var != null) {
                                fetVar2.e0(-1355381578);
                                int i19 = i12 >> 9;
                                i14 = (i19 & 7168) | (i19 & 896) | 6;
                                if (g3l0Var instanceof v2l0) {
                                    fetVar2.e0(1632507618);
                                    l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    z6 = false;
                                    if (g3l0Var instanceof w2l0) {
                                        fetVar2.e0(1632702267);
                                        w2l0 w2l0Var2 = (w2l0) g3l0Var;
                                        l8x.i(w2l0Var2.b, 384, w2l0Var2.f38455a, fetVar2, jm40Var);
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof d3l0) {
                                            fetVar2.e0(1632986661);
                                            d3l0 d3l0Var2 = (d3l0) g3l0Var;
                                            l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var2.f5408a, d3l0Var2.b);
                                            jm40Var2 = jm40Var;
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            jm40Var2 = jm40Var;
                                            if (g3l0Var instanceof q2l0) {
                                                fetVar2.e0(1633358816);
                                                q2l0 q2l0Var2 = (q2l0) g3l0Var;
                                                l8x.a(jm40Var2, q2l0Var2.f28005a, q2l0Var2.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                                function23 = function17;
                                                z6 = false;
                                                fetVar2.r(false);
                                            } else {
                                                if (g3l0Var instanceof r2l0) {
                                                    fetVar2.e0(1633673497);
                                                    l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                    function22 = function17;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                    function19 = function18;
                                                } else {
                                                    function22 = function17;
                                                    if (g3l0Var instanceof b3l0) {
                                                        fetVar2.e0(1633933897);
                                                        Function1 function28 = function18;
                                                        l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function28, fetVar2, 6 | ((i14 >> 3) & 896));
                                                        function19 = function28;
                                                        z9 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function19 = function18;
                                                        if (g3l0Var instanceof x2l0) {
                                                            fetVar2.e0(1634194483);
                                                            x2l0 x2l0Var2 = (x2l0) g3l0Var;
                                                            function23 = function22;
                                                            l8x.j(jm40Var2, x2l0Var2.f40173a, x2l0Var2.b, x2l0Var2.c, x2l0Var2.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function23 = function22;
                                                            if (g3l0Var instanceof a3l0) {
                                                                fetVar2.e0(1634665528);
                                                                a3l0 a3l0Var2 = (a3l0) g3l0Var;
                                                                l8x.m(jm40Var2, a3l0Var2.f178a, a3l0Var2.b, a3l0Var2.c, a3l0Var2.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                if (g3l0Var instanceof y2l0) {
                                                                    fetVar2.e0(1635210508);
                                                                    y2l0 y2l0Var2 = (y2l0) g3l0Var;
                                                                    function20 = function15;
                                                                    l8x.k(jm40Var2, y2l0Var2.f41910a, y2l0Var2.b, y2l0Var2.c, y2l0Var2.d, y2l0Var2.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                    function23 = function23;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function20 = function15;
                                                                    if (g3l0Var instanceof e3l0) {
                                                                        fetVar2.e0(1635875055);
                                                                        e3l0 e3l0Var2 = (e3l0) g3l0Var;
                                                                        l8x.N(jm40Var2, e3l0Var2.d, e3l0Var2.b, e3l0Var2.f7143a, e3l0Var2.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                        function21 = function23;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function23;
                                                                        if (g3l0Var instanceof z2l0) {
                                                                            fetVar2.e0(1636326663);
                                                                            z2l0 z2l0Var2 = (z2l0) g3l0Var;
                                                                            l8x.l(z2l0Var2.f43675a, z2l0Var2.b, z2l0Var2.c, jm40Var2, fetVar, 3072);
                                                                            jm40Var2 = jm40Var2;
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof c3l0) {
                                                                            fetVar2.e0(1636711032);
                                                                            c3l0 c3l0Var2 = (c3l0) g3l0Var;
                                                                            l8x.q(jm40Var2, c3l0Var2.f3682a, c3l0Var2.b, c3l0Var2.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                            function21 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof s2l0) {
                                                                            fetVar2.e0(1637227988);
                                                                            s2l0 s2l0Var2 = (s2l0) g3l0Var;
                                                                            l8x.g(s2l0Var2.b, mpe.f22175a, s2l0Var2.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                            jm40Var2 = jm40Var2;
                                                                        } else if (g3l0Var instanceof u2l0) {
                                                                            fetVar2.e0(1637646643);
                                                                            u2l0 u2l0Var2 = (u2l0) g3l0Var;
                                                                            jm40Var2 = jm40Var2;
                                                                            l8x.f(jm40Var2, u2l0Var2.e, u2l0Var2.f34951a, u2l0Var2.b, u2l0Var2.c, u2l0Var2.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                            function23 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof t2l0) {
                                                                            fetVar2.e0(1638245966);
                                                                            t2l0 t2l0Var2 = (t2l0) g3l0Var;
                                                                            l8x.e(t2l0Var2.d, t2l0Var2.f33222a, t2l0Var2.b, t2l0Var2.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                            jm40Var2 = jm40Var2;
                                                                            function21 = function21;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else {
                                                                            function21 = function21;
                                                                            if (g3l0Var instanceof f3l0) {
                                                                                throw b1j.f(52665976, fetVar2, false);
                                                                            }
                                                                            fetVar2.e0(1638774981);
                                                                            f3l0 f3l0Var2 = (f3l0) g3l0Var;
                                                                            boolean z12 = f3l0Var2.b;
                                                                            boolean z13 = f3l0Var2.f8869a;
                                                                            int i110 = (i14 & 896) ^ 384;
                                                                            if (i110 <= 256) {
                                                                            }
                                                                            objP3 = fetVar2.P();
                                                                            if (z7) {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            } else {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            }
                                                                            Function0 function29 = (Function0) objP3;
                                                                            if (i110 <= 256) {
                                                                            }
                                                                            objP4 = fetVar2.P();
                                                                            if (z8) {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            } else {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            }
                                                                            l8x.Q(6, fetVar2, jm40Var2, function29, (Function0) objP4, z12, z13);
                                                                            fetVar2 = fetVar2;
                                                                            jm40Var2 = jm40Var2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        }
                                                                    }
                                                                }
                                                                function21 = function23;
                                                            }
                                                        }
                                                        function20 = function15;
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function22;
                                                z6 = z9;
                                            }
                                        }
                                        function19 = function18;
                                        function20 = function15;
                                        function21 = function23;
                                    }
                                    fetVar2.r(z6);
                                }
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.r(z6);
                            } else {
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.e0(-1355135128);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            zrmVar2 = zrmVar;
                            if (zrmVar2.f) {
                                fetVar2.e0(823957877);
                                mm40 mm40VarB2 = jr8.f16991a.b(jm40Var2, gqw0.h);
                                if (u1l0Var == null) {
                                    f = 12.0f;
                                } else {
                                    if (!(u1l0Var instanceof q1l0)) {
                                        if (u1l0Var instanceof r1l0) {
                                            f = 60.0f;
                                        } else if (u1l0Var instanceof s1l0) {
                                            f = 54.0f;
                                        } else if (!(u1l0Var instanceof t1l0)) {
                                            t9f.b();
                                            return;
                                        }
                                    }
                                    f2 = 46.0f;
                                    mbc.o(agi0.f827a, s5x0.N(mm40VarB2, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                    fetVar2.r(false);
                                }
                                f2 = f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB2, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(824225996);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            function9 = function21;
                            function11 = function14;
                            function10 = function19;
                            mm40Var2 = mm40Var4;
                            function12 = function20;
                        }
                        t9f.b();
                        return;
                    }
                    fetVar2.X();
                    mm40Var2 = mm40Var;
                    function9 = function7;
                    function10 = function8;
                    function11 = function5;
                    function12 = function1;
                    function13 = function6;
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
                    }
                }
                i3 |= 24576;
                function6 = function2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 196608) == 0) {
                        if (fetVar2.i(function7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i & 1572864) == 0) {
                        if (fetVar2.i(function8)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i15 != 0) {
                        mm40Var3 = jm40Var;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i16 != 0) {
                        function14 = null;
                    } else {
                        function14 = function5;
                    }
                    if (i4 != 0) {
                        function15 = null;
                    } else {
                        function15 = function1;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    u1l0Var = zrmVar2.b;
                    f2l0Var = zrmVar2.f44861a;
                    g3l0Var = zrmVar2.c;
                    n3l0Var = zrmVar2.e;
                    function17 = function7;
                    mm40VarD = o7k0.d(mm40Var3, 1.0f);
                    if (n3l0Var != null) {
                        mm40 mm40Var5 = mm40Var3;
                        if (n3l0Var instanceof j3l0) {
                            yjj0VarC = ljcVar;
                        } else {
                            if (n3l0Var instanceof l3l0) {
                                yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                            } else {
                                function18 = function16;
                                if (n3l0Var instanceof k3l0) {
                                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                } else if (n3l0Var instanceof m3l0) {
                                    yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                                }
                            }
                            mm40 mm40VarJ3 = lgb.J(mm40VarD, yjj0VarC);
                            tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                            int iHashCode5 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM5 = fetVar2.m();
                            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarJ3);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            z2 = fetVar2.S;
                            pcyVar = e7z.u1;
                            if (z2) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            shd shdVar9 = gqw0.x;
                            jpm0.o(fetVar2, tj30VarC3, shdVar9);
                            shd shdVar10 = gqw0.w;
                            jpm0.o(fetVar2, bh90VarM5, shdVar10);
                            Integer numValueOf3 = Integer.valueOf(iHashCode5);
                            shd shdVar11 = gqw0.y;
                            jpm0.o(fetVar2, numValueOf3, shdVar11);
                            jpm0.n(fetVar2);
                            shd shdVar12 = gqw0.v;
                            jpm0.o(fetVar2, mm40VarC4, shdVar12);
                            mm40 mm40VarQ3 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                            if (function14 == null) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if ((i3 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objP = fetVar2.P();
                            cl5 cl5Var3 = ukd.f35823a;
                            if (z4) {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            } else {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            }
                            Function0 function210 = (Function0) objP;
                            if ((i3 & 896) == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objP2 = fetVar2.P();
                            if (z5) {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            } else {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            }
                            mm40 mm40VarZ3 = y860.Z(mm40VarQ3, null, z3, function210, (Function0) objP2, 440);
                            zcl zclVar3 = qmk.f28987a;
                            i12 = i3;
                            mm40 mm40VarL3 = s5x0.L(mm40VarZ3, 4.0f, 0.0f, 2);
                            thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                            int iHashCode6 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM6 = fetVar2.m();
                            mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarL3);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, thg0VarA3, shdVar9);
                            jpm0.o(fetVar2, bh90VarM6, shdVar10);
                            vqd.u(iHashCode6, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC5, shdVar12);
                            if (u1l0Var != null) {
                                fetVar2.e0(-1355915336);
                                g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                                i13 = 0;
                                fetVar2.r(false);
                            } else {
                                i13 = 0;
                                fetVar2.e0(-1355670808);
                                fetVar2.r(false);
                            }
                            h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                            if (g3l0Var != null) {
                                fetVar2.e0(-1355381578);
                                int i111 = i12 >> 9;
                                i14 = (i111 & 7168) | (i111 & 896) | 6;
                                if (g3l0Var instanceof v2l0) {
                                    fetVar2.e0(1632507618);
                                    l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    z6 = false;
                                    if (g3l0Var instanceof w2l0) {
                                        fetVar2.e0(1632702267);
                                        w2l0 w2l0Var3 = (w2l0) g3l0Var;
                                        l8x.i(w2l0Var3.b, 384, w2l0Var3.f38455a, fetVar2, jm40Var);
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof d3l0) {
                                            fetVar2.e0(1632986661);
                                            d3l0 d3l0Var3 = (d3l0) g3l0Var;
                                            l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var3.f5408a, d3l0Var3.b);
                                            jm40Var2 = jm40Var;
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            jm40Var2 = jm40Var;
                                            if (g3l0Var instanceof q2l0) {
                                                fetVar2.e0(1633358816);
                                                q2l0 q2l0Var3 = (q2l0) g3l0Var;
                                                l8x.a(jm40Var2, q2l0Var3.f28005a, q2l0Var3.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                                function23 = function17;
                                                z6 = false;
                                                fetVar2.r(false);
                                            } else {
                                                if (g3l0Var instanceof r2l0) {
                                                    fetVar2.e0(1633673497);
                                                    l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                    function22 = function17;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                    function19 = function18;
                                                } else {
                                                    function22 = function17;
                                                    if (g3l0Var instanceof b3l0) {
                                                        fetVar2.e0(1633933897);
                                                        Function1 function211 = function18;
                                                        l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function211, fetVar2, 6 | ((i14 >> 3) & 896));
                                                        function19 = function211;
                                                        z9 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function19 = function18;
                                                        if (g3l0Var instanceof x2l0) {
                                                            fetVar2.e0(1634194483);
                                                            x2l0 x2l0Var3 = (x2l0) g3l0Var;
                                                            function23 = function22;
                                                            l8x.j(jm40Var2, x2l0Var3.f40173a, x2l0Var3.b, x2l0Var3.c, x2l0Var3.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function23 = function22;
                                                            if (g3l0Var instanceof a3l0) {
                                                                fetVar2.e0(1634665528);
                                                                a3l0 a3l0Var3 = (a3l0) g3l0Var;
                                                                l8x.m(jm40Var2, a3l0Var3.f178a, a3l0Var3.b, a3l0Var3.c, a3l0Var3.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                if (g3l0Var instanceof y2l0) {
                                                                    fetVar2.e0(1635210508);
                                                                    y2l0 y2l0Var3 = (y2l0) g3l0Var;
                                                                    function20 = function15;
                                                                    l8x.k(jm40Var2, y2l0Var3.f41910a, y2l0Var3.b, y2l0Var3.c, y2l0Var3.d, y2l0Var3.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                    function23 = function23;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function20 = function15;
                                                                    if (g3l0Var instanceof e3l0) {
                                                                        fetVar2.e0(1635875055);
                                                                        e3l0 e3l0Var3 = (e3l0) g3l0Var;
                                                                        l8x.N(jm40Var2, e3l0Var3.d, e3l0Var3.b, e3l0Var3.f7143a, e3l0Var3.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                        function21 = function23;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function23;
                                                                        if (g3l0Var instanceof z2l0) {
                                                                            fetVar2.e0(1636326663);
                                                                            z2l0 z2l0Var3 = (z2l0) g3l0Var;
                                                                            l8x.l(z2l0Var3.f43675a, z2l0Var3.b, z2l0Var3.c, jm40Var2, fetVar, 3072);
                                                                            jm40Var2 = jm40Var2;
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof c3l0) {
                                                                            fetVar2.e0(1636711032);
                                                                            c3l0 c3l0Var3 = (c3l0) g3l0Var;
                                                                            l8x.q(jm40Var2, c3l0Var3.f3682a, c3l0Var3.b, c3l0Var3.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                            function21 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof s2l0) {
                                                                            fetVar2.e0(1637227988);
                                                                            s2l0 s2l0Var3 = (s2l0) g3l0Var;
                                                                            l8x.g(s2l0Var3.b, mpe.f22175a, s2l0Var3.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                            jm40Var2 = jm40Var2;
                                                                        } else if (g3l0Var instanceof u2l0) {
                                                                            fetVar2.e0(1637646643);
                                                                            u2l0 u2l0Var3 = (u2l0) g3l0Var;
                                                                            jm40Var2 = jm40Var2;
                                                                            l8x.f(jm40Var2, u2l0Var3.e, u2l0Var3.f34951a, u2l0Var3.b, u2l0Var3.c, u2l0Var3.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                            function23 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof t2l0) {
                                                                            fetVar2.e0(1638245966);
                                                                            t2l0 t2l0Var3 = (t2l0) g3l0Var;
                                                                            l8x.e(t2l0Var3.d, t2l0Var3.f33222a, t2l0Var3.b, t2l0Var3.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                            jm40Var2 = jm40Var2;
                                                                            function21 = function21;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else {
                                                                            function21 = function21;
                                                                            if (g3l0Var instanceof f3l0) {
                                                                                throw b1j.f(52665976, fetVar2, false);
                                                                            }
                                                                            fetVar2.e0(1638774981);
                                                                            f3l0 f3l0Var3 = (f3l0) g3l0Var;
                                                                            boolean z14 = f3l0Var3.b;
                                                                            boolean z15 = f3l0Var3.f8869a;
                                                                            int i112 = (i14 & 896) ^ 384;
                                                                            if (i112 <= 256) {
                                                                            }
                                                                            objP3 = fetVar2.P();
                                                                            if (z7) {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            } else {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            }
                                                                            Function0 function212 = (Function0) objP3;
                                                                            if (i112 <= 256) {
                                                                            }
                                                                            objP4 = fetVar2.P();
                                                                            if (z8) {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            } else {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            }
                                                                            l8x.Q(6, fetVar2, jm40Var2, function212, (Function0) objP4, z14, z15);
                                                                            fetVar2 = fetVar2;
                                                                            jm40Var2 = jm40Var2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        }
                                                                    }
                                                                }
                                                                function21 = function23;
                                                            }
                                                        }
                                                        function20 = function15;
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function22;
                                                z6 = z9;
                                            }
                                        }
                                        function19 = function18;
                                        function20 = function15;
                                        function21 = function23;
                                    }
                                    fetVar2.r(z6);
                                }
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.r(z6);
                            } else {
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.e0(-1355135128);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            zrmVar2 = zrmVar;
                            if (zrmVar2.f) {
                                fetVar2.e0(823957877);
                                mm40 mm40VarB3 = jr8.f16991a.b(jm40Var2, gqw0.h);
                                if (u1l0Var == null) {
                                    f = 12.0f;
                                } else {
                                    if (!(u1l0Var instanceof q1l0)) {
                                        if (u1l0Var instanceof r1l0) {
                                            f = 60.0f;
                                        } else if (u1l0Var instanceof s1l0) {
                                            f = 54.0f;
                                        } else if (!(u1l0Var instanceof t1l0)) {
                                            t9f.b();
                                            return;
                                        }
                                    }
                                    f2 = 46.0f;
                                    mbc.o(agi0.f827a, s5x0.N(mm40VarB3, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                    fetVar2.r(false);
                                }
                                f2 = f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB3, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(824225996);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            function9 = function21;
                            function11 = function14;
                            function10 = function19;
                            mm40Var2 = mm40Var5;
                            function12 = function20;
                        }
                        function18 = function16;
                        mm40 mm40VarJ4 = lgb.J(mm40VarD, yjj0VarC);
                        tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                        int iHashCode7 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM7 = fetVar2.m();
                        mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarJ4);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        z2 = fetVar2.S;
                        pcyVar = e7z.u1;
                        if (z2) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        shd shdVar13 = gqw0.x;
                        jpm0.o(fetVar2, tj30VarC4, shdVar13);
                        shd shdVar14 = gqw0.w;
                        jpm0.o(fetVar2, bh90VarM7, shdVar14);
                        Integer numValueOf4 = Integer.valueOf(iHashCode7);
                        shd shdVar15 = gqw0.y;
                        jpm0.o(fetVar2, numValueOf4, shdVar15);
                        jpm0.n(fetVar2);
                        shd shdVar16 = gqw0.v;
                        jpm0.o(fetVar2, mm40VarC6, shdVar16);
                        mm40 mm40VarQ4 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                        if (function14 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP = fetVar2.P();
                        cl5 cl5Var4 = ukd.f35823a;
                        if (z4) {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        } else {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        }
                        Function0 function213 = (Function0) objP;
                        if ((i3 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z5) {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarZ4 = y860.Z(mm40VarQ4, null, z3, function213, (Function0) objP2, 440);
                        zcl zclVar4 = qmk.f28987a;
                        i12 = i3;
                        mm40 mm40VarL4 = s5x0.L(mm40VarZ4, 4.0f, 0.0f, 2);
                        thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode8 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM8 = fetVar2.m();
                        mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarL4);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA4, shdVar13);
                        jpm0.o(fetVar2, bh90VarM8, shdVar14);
                        vqd.u(iHashCode8, fetVar2, shdVar15, fetVar2);
                        jpm0.o(fetVar2, mm40VarC7, shdVar16);
                        if (u1l0Var != null) {
                            fetVar2.e0(-1355915336);
                            g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                            i13 = 0;
                            fetVar2.r(false);
                        } else {
                            i13 = 0;
                            fetVar2.e0(-1355670808);
                            fetVar2.r(false);
                        }
                        h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                        if (g3l0Var != null) {
                            fetVar2.e0(-1355381578);
                            int i113 = i12 >> 9;
                            i14 = (i113 & 7168) | (i113 & 896) | 6;
                            if (g3l0Var instanceof v2l0) {
                                fetVar2.e0(1632507618);
                                l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                z6 = false;
                                if (g3l0Var instanceof w2l0) {
                                    fetVar2.e0(1632702267);
                                    w2l0 w2l0Var4 = (w2l0) g3l0Var;
                                    l8x.i(w2l0Var4.b, 384, w2l0Var4.f38455a, fetVar2, jm40Var);
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof d3l0) {
                                        fetVar2.e0(1632986661);
                                        d3l0 d3l0Var4 = (d3l0) g3l0Var;
                                        l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var4.f5408a, d3l0Var4.b);
                                        jm40Var2 = jm40Var;
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (g3l0Var instanceof q2l0) {
                                            fetVar2.e0(1633358816);
                                            q2l0 q2l0Var4 = (q2l0) g3l0Var;
                                            l8x.a(jm40Var2, q2l0Var4.f28005a, q2l0Var4.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof r2l0) {
                                                fetVar2.e0(1633673497);
                                                l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                function22 = function17;
                                                z9 = false;
                                                fetVar2.r(false);
                                                function19 = function18;
                                            } else {
                                                function22 = function17;
                                                if (g3l0Var instanceof b3l0) {
                                                    fetVar2.e0(1633933897);
                                                    Function1 function214 = function18;
                                                    l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function214, fetVar2, 6 | ((i14 >> 3) & 896));
                                                    function19 = function214;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function19 = function18;
                                                    if (g3l0Var instanceof x2l0) {
                                                        fetVar2.e0(1634194483);
                                                        x2l0 x2l0Var4 = (x2l0) g3l0Var;
                                                        function23 = function22;
                                                        l8x.j(jm40Var2, x2l0Var4.f40173a, x2l0Var4.b, x2l0Var4.c, x2l0Var4.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function23 = function22;
                                                        if (g3l0Var instanceof a3l0) {
                                                            fetVar2.e0(1634665528);
                                                            a3l0 a3l0Var4 = (a3l0) g3l0Var;
                                                            l8x.m(jm40Var2, a3l0Var4.f178a, a3l0Var4.b, a3l0Var4.c, a3l0Var4.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (g3l0Var instanceof y2l0) {
                                                                fetVar2.e0(1635210508);
                                                                y2l0 y2l0Var4 = (y2l0) g3l0Var;
                                                                function20 = function15;
                                                                l8x.k(jm40Var2, y2l0Var4.f41910a, y2l0Var4.b, y2l0Var4.c, y2l0Var4.d, y2l0Var4.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                function23 = function23;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function20 = function15;
                                                                if (g3l0Var instanceof e3l0) {
                                                                    fetVar2.e0(1635875055);
                                                                    e3l0 e3l0Var4 = (e3l0) g3l0Var;
                                                                    l8x.N(jm40Var2, e3l0Var4.d, e3l0Var4.b, e3l0Var4.f7143a, e3l0Var4.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                    function21 = function23;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function23;
                                                                    if (g3l0Var instanceof z2l0) {
                                                                        fetVar2.e0(1636326663);
                                                                        z2l0 z2l0Var4 = (z2l0) g3l0Var;
                                                                        l8x.l(z2l0Var4.f43675a, z2l0Var4.b, z2l0Var4.c, jm40Var2, fetVar, 3072);
                                                                        jm40Var2 = jm40Var2;
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof c3l0) {
                                                                        fetVar2.e0(1636711032);
                                                                        c3l0 c3l0Var4 = (c3l0) g3l0Var;
                                                                        l8x.q(jm40Var2, c3l0Var4.f3682a, c3l0Var4.b, c3l0Var4.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                        function21 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof s2l0) {
                                                                        fetVar2.e0(1637227988);
                                                                        s2l0 s2l0Var4 = (s2l0) g3l0Var;
                                                                        l8x.g(s2l0Var4.b, mpe.f22175a, s2l0Var4.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                        jm40Var2 = jm40Var2;
                                                                    } else if (g3l0Var instanceof u2l0) {
                                                                        fetVar2.e0(1637646643);
                                                                        u2l0 u2l0Var4 = (u2l0) g3l0Var;
                                                                        jm40Var2 = jm40Var2;
                                                                        l8x.f(jm40Var2, u2l0Var4.e, u2l0Var4.f34951a, u2l0Var4.b, u2l0Var4.c, u2l0Var4.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                        function23 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof t2l0) {
                                                                        fetVar2.e0(1638245966);
                                                                        t2l0 t2l0Var4 = (t2l0) g3l0Var;
                                                                        l8x.e(t2l0Var4.d, t2l0Var4.f33222a, t2l0Var4.b, t2l0Var4.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                        jm40Var2 = jm40Var2;
                                                                        function21 = function21;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function21;
                                                                        if (g3l0Var instanceof f3l0) {
                                                                            throw b1j.f(52665976, fetVar2, false);
                                                                        }
                                                                        fetVar2.e0(1638774981);
                                                                        f3l0 f3l0Var4 = (f3l0) g3l0Var;
                                                                        boolean z16 = f3l0Var4.b;
                                                                        boolean z17 = f3l0Var4.f8869a;
                                                                        int i114 = (i14 & 896) ^ 384;
                                                                        if (i114 <= 256) {
                                                                        }
                                                                        objP3 = fetVar2.P();
                                                                        if (z7) {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        } else {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        }
                                                                        Function0 function215 = (Function0) objP3;
                                                                        if (i114 <= 256) {
                                                                        }
                                                                        objP4 = fetVar2.P();
                                                                        if (z8) {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        } else {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        }
                                                                        l8x.Q(6, fetVar2, jm40Var2, function215, (Function0) objP4, z16, z17);
                                                                        fetVar2 = fetVar2;
                                                                        jm40Var2 = jm40Var2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    }
                                                                }
                                                            }
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function22;
                                            z6 = z9;
                                        }
                                    }
                                    function19 = function18;
                                    function20 = function15;
                                    function21 = function23;
                                }
                                fetVar2.r(z6);
                            }
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.r(z6);
                        } else {
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.e0(-1355135128);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        zrmVar2 = zrmVar;
                        if (zrmVar2.f) {
                            fetVar2.e0(823957877);
                            mm40 mm40VarB4 = jr8.f16991a.b(jm40Var2, gqw0.h);
                            if (u1l0Var == null) {
                                f = 12.0f;
                            } else {
                                if (!(u1l0Var instanceof q1l0)) {
                                    if (u1l0Var instanceof r1l0) {
                                        f = 60.0f;
                                    } else if (u1l0Var instanceof s1l0) {
                                        f = 54.0f;
                                    } else if (!(u1l0Var instanceof t1l0)) {
                                        t9f.b();
                                        return;
                                    }
                                }
                                f2 = 46.0f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB4, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            }
                            f2 = f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB4, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(824225996);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        function9 = function21;
                        function11 = function14;
                        function10 = function19;
                        mm40Var2 = mm40Var5;
                        function12 = function20;
                    }
                    t9f.b();
                    return;
                }
                fetVar2.X();
                mm40Var2 = mm40Var;
                function9 = function7;
                function10 = function8;
                function11 = function5;
                function12 = function1;
                function13 = function6;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
                }
            }
            i3 |= 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function2;
                    if (fetVar2.i(function6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 196608) == 0) {
                        if (fetVar2.i(function7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i & 1572864) == 0) {
                        if (fetVar2.i(function8)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i15 != 0) {
                        mm40Var3 = jm40Var;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i16 != 0) {
                        function14 = null;
                    } else {
                        function14 = function5;
                    }
                    if (i4 != 0) {
                        function15 = null;
                    } else {
                        function15 = function1;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    u1l0Var = zrmVar2.b;
                    f2l0Var = zrmVar2.f44861a;
                    g3l0Var = zrmVar2.c;
                    n3l0Var = zrmVar2.e;
                    function17 = function7;
                    mm40VarD = o7k0.d(mm40Var3, 1.0f);
                    if (n3l0Var != null) {
                        mm40 mm40Var6 = mm40Var3;
                        if (n3l0Var instanceof j3l0) {
                            yjj0VarC = ljcVar;
                        } else {
                            if (n3l0Var instanceof l3l0) {
                                yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                            } else {
                                function18 = function16;
                                if (n3l0Var instanceof k3l0) {
                                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                } else if (n3l0Var instanceof m3l0) {
                                    yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                                }
                            }
                            mm40 mm40VarJ5 = lgb.J(mm40VarD, yjj0VarC);
                            tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                            int iHashCode9 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM9 = fetVar2.m();
                            mm40 mm40VarC8 = kbc.c0(fetVar2, mm40VarJ5);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            z2 = fetVar2.S;
                            pcyVar = e7z.u1;
                            if (z2) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            shd shdVar17 = gqw0.x;
                            jpm0.o(fetVar2, tj30VarC5, shdVar17);
                            shd shdVar18 = gqw0.w;
                            jpm0.o(fetVar2, bh90VarM9, shdVar18);
                            Integer numValueOf5 = Integer.valueOf(iHashCode9);
                            shd shdVar19 = gqw0.y;
                            jpm0.o(fetVar2, numValueOf5, shdVar19);
                            jpm0.n(fetVar2);
                            shd shdVar110 = gqw0.v;
                            jpm0.o(fetVar2, mm40VarC8, shdVar110);
                            mm40 mm40VarQ5 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                            if (function14 == null) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if ((i3 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objP = fetVar2.P();
                            cl5 cl5Var5 = ukd.f35823a;
                            if (z4) {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            } else {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            }
                            Function0 function216 = (Function0) objP;
                            if ((i3 & 896) == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objP2 = fetVar2.P();
                            if (z5) {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            } else {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            }
                            mm40 mm40VarZ5 = y860.Z(mm40VarQ5, null, z3, function216, (Function0) objP2, 440);
                            zcl zclVar5 = qmk.f28987a;
                            i12 = i3;
                            mm40 mm40VarL5 = s5x0.L(mm40VarZ5, 4.0f, 0.0f, 2);
                            thg0 thg0VarA5 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                            int iHashCode10 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM10 = fetVar2.m();
                            mm40 mm40VarC9 = kbc.c0(fetVar2, mm40VarL5);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, thg0VarA5, shdVar17);
                            jpm0.o(fetVar2, bh90VarM10, shdVar18);
                            vqd.u(iHashCode10, fetVar2, shdVar19, fetVar2);
                            jpm0.o(fetVar2, mm40VarC9, shdVar110);
                            if (u1l0Var != null) {
                                fetVar2.e0(-1355915336);
                                g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                                i13 = 0;
                                fetVar2.r(false);
                            } else {
                                i13 = 0;
                                fetVar2.e0(-1355670808);
                                fetVar2.r(false);
                            }
                            h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                            if (g3l0Var != null) {
                                fetVar2.e0(-1355381578);
                                int i115 = i12 >> 9;
                                i14 = (i115 & 7168) | (i115 & 896) | 6;
                                if (g3l0Var instanceof v2l0) {
                                    fetVar2.e0(1632507618);
                                    l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    z6 = false;
                                    if (g3l0Var instanceof w2l0) {
                                        fetVar2.e0(1632702267);
                                        w2l0 w2l0Var5 = (w2l0) g3l0Var;
                                        l8x.i(w2l0Var5.b, 384, w2l0Var5.f38455a, fetVar2, jm40Var);
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof d3l0) {
                                            fetVar2.e0(1632986661);
                                            d3l0 d3l0Var5 = (d3l0) g3l0Var;
                                            l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var5.f5408a, d3l0Var5.b);
                                            jm40Var2 = jm40Var;
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            jm40Var2 = jm40Var;
                                            if (g3l0Var instanceof q2l0) {
                                                fetVar2.e0(1633358816);
                                                q2l0 q2l0Var5 = (q2l0) g3l0Var;
                                                l8x.a(jm40Var2, q2l0Var5.f28005a, q2l0Var5.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                                function23 = function17;
                                                z6 = false;
                                                fetVar2.r(false);
                                            } else {
                                                if (g3l0Var instanceof r2l0) {
                                                    fetVar2.e0(1633673497);
                                                    l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                    function22 = function17;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                    function19 = function18;
                                                } else {
                                                    function22 = function17;
                                                    if (g3l0Var instanceof b3l0) {
                                                        fetVar2.e0(1633933897);
                                                        Function1 function217 = function18;
                                                        l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function217, fetVar2, 6 | ((i14 >> 3) & 896));
                                                        function19 = function217;
                                                        z9 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function19 = function18;
                                                        if (g3l0Var instanceof x2l0) {
                                                            fetVar2.e0(1634194483);
                                                            x2l0 x2l0Var5 = (x2l0) g3l0Var;
                                                            function23 = function22;
                                                            l8x.j(jm40Var2, x2l0Var5.f40173a, x2l0Var5.b, x2l0Var5.c, x2l0Var5.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function23 = function22;
                                                            if (g3l0Var instanceof a3l0) {
                                                                fetVar2.e0(1634665528);
                                                                a3l0 a3l0Var5 = (a3l0) g3l0Var;
                                                                l8x.m(jm40Var2, a3l0Var5.f178a, a3l0Var5.b, a3l0Var5.c, a3l0Var5.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                if (g3l0Var instanceof y2l0) {
                                                                    fetVar2.e0(1635210508);
                                                                    y2l0 y2l0Var5 = (y2l0) g3l0Var;
                                                                    function20 = function15;
                                                                    l8x.k(jm40Var2, y2l0Var5.f41910a, y2l0Var5.b, y2l0Var5.c, y2l0Var5.d, y2l0Var5.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                    function23 = function23;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function20 = function15;
                                                                    if (g3l0Var instanceof e3l0) {
                                                                        fetVar2.e0(1635875055);
                                                                        e3l0 e3l0Var5 = (e3l0) g3l0Var;
                                                                        l8x.N(jm40Var2, e3l0Var5.d, e3l0Var5.b, e3l0Var5.f7143a, e3l0Var5.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                        function21 = function23;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function23;
                                                                        if (g3l0Var instanceof z2l0) {
                                                                            fetVar2.e0(1636326663);
                                                                            z2l0 z2l0Var5 = (z2l0) g3l0Var;
                                                                            l8x.l(z2l0Var5.f43675a, z2l0Var5.b, z2l0Var5.c, jm40Var2, fetVar, 3072);
                                                                            jm40Var2 = jm40Var2;
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof c3l0) {
                                                                            fetVar2.e0(1636711032);
                                                                            c3l0 c3l0Var5 = (c3l0) g3l0Var;
                                                                            l8x.q(jm40Var2, c3l0Var5.f3682a, c3l0Var5.b, c3l0Var5.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                            function21 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof s2l0) {
                                                                            fetVar2.e0(1637227988);
                                                                            s2l0 s2l0Var5 = (s2l0) g3l0Var;
                                                                            l8x.g(s2l0Var5.b, mpe.f22175a, s2l0Var5.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                            jm40Var2 = jm40Var2;
                                                                        } else if (g3l0Var instanceof u2l0) {
                                                                            fetVar2.e0(1637646643);
                                                                            u2l0 u2l0Var5 = (u2l0) g3l0Var;
                                                                            jm40Var2 = jm40Var2;
                                                                            l8x.f(jm40Var2, u2l0Var5.e, u2l0Var5.f34951a, u2l0Var5.b, u2l0Var5.c, u2l0Var5.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                            function23 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof t2l0) {
                                                                            fetVar2.e0(1638245966);
                                                                            t2l0 t2l0Var5 = (t2l0) g3l0Var;
                                                                            l8x.e(t2l0Var5.d, t2l0Var5.f33222a, t2l0Var5.b, t2l0Var5.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                            jm40Var2 = jm40Var2;
                                                                            function21 = function21;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else {
                                                                            function21 = function21;
                                                                            if (g3l0Var instanceof f3l0) {
                                                                                throw b1j.f(52665976, fetVar2, false);
                                                                            }
                                                                            fetVar2.e0(1638774981);
                                                                            f3l0 f3l0Var5 = (f3l0) g3l0Var;
                                                                            boolean z18 = f3l0Var5.b;
                                                                            boolean z19 = f3l0Var5.f8869a;
                                                                            int i116 = (i14 & 896) ^ 384;
                                                                            if (i116 <= 256) {
                                                                            }
                                                                            objP3 = fetVar2.P();
                                                                            if (z7) {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            } else {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            }
                                                                            Function0 function218 = (Function0) objP3;
                                                                            if (i116 <= 256) {
                                                                            }
                                                                            objP4 = fetVar2.P();
                                                                            if (z8) {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            } else {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            }
                                                                            l8x.Q(6, fetVar2, jm40Var2, function218, (Function0) objP4, z18, z19);
                                                                            fetVar2 = fetVar2;
                                                                            jm40Var2 = jm40Var2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        }
                                                                    }
                                                                }
                                                                function21 = function23;
                                                            }
                                                        }
                                                        function20 = function15;
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function22;
                                                z6 = z9;
                                            }
                                        }
                                        function19 = function18;
                                        function20 = function15;
                                        function21 = function23;
                                    }
                                    fetVar2.r(z6);
                                }
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.r(z6);
                            } else {
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.e0(-1355135128);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            zrmVar2 = zrmVar;
                            if (zrmVar2.f) {
                                fetVar2.e0(823957877);
                                mm40 mm40VarB5 = jr8.f16991a.b(jm40Var2, gqw0.h);
                                if (u1l0Var == null) {
                                    f = 12.0f;
                                } else {
                                    if (!(u1l0Var instanceof q1l0)) {
                                        if (u1l0Var instanceof r1l0) {
                                            f = 60.0f;
                                        } else if (u1l0Var instanceof s1l0) {
                                            f = 54.0f;
                                        } else if (!(u1l0Var instanceof t1l0)) {
                                            t9f.b();
                                            return;
                                        }
                                    }
                                    f2 = 46.0f;
                                    mbc.o(agi0.f827a, s5x0.N(mm40VarB5, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                    fetVar2.r(false);
                                }
                                f2 = f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB5, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(824225996);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            function9 = function21;
                            function11 = function14;
                            function10 = function19;
                            mm40Var2 = mm40Var6;
                            function12 = function20;
                        }
                        function18 = function16;
                        mm40 mm40VarJ6 = lgb.J(mm40VarD, yjj0VarC);
                        tj30 tj30VarC6 = zq8.c(gqw0.f11754a, false);
                        int iHashCode11 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM11 = fetVar2.m();
                        mm40 mm40VarC10 = kbc.c0(fetVar2, mm40VarJ6);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        z2 = fetVar2.S;
                        pcyVar = e7z.u1;
                        if (z2) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        shd shdVar111 = gqw0.x;
                        jpm0.o(fetVar2, tj30VarC6, shdVar111);
                        shd shdVar112 = gqw0.w;
                        jpm0.o(fetVar2, bh90VarM11, shdVar112);
                        Integer numValueOf6 = Integer.valueOf(iHashCode11);
                        shd shdVar113 = gqw0.y;
                        jpm0.o(fetVar2, numValueOf6, shdVar113);
                        jpm0.n(fetVar2);
                        shd shdVar114 = gqw0.v;
                        jpm0.o(fetVar2, mm40VarC10, shdVar114);
                        mm40 mm40VarQ6 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                        if (function14 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP = fetVar2.P();
                        cl5 cl5Var6 = ukd.f35823a;
                        if (z4) {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        } else {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        }
                        Function0 function219 = (Function0) objP;
                        if ((i3 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z5) {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarZ6 = y860.Z(mm40VarQ6, null, z3, function219, (Function0) objP2, 440);
                        zcl zclVar6 = qmk.f28987a;
                        i12 = i3;
                        mm40 mm40VarL6 = s5x0.L(mm40VarZ6, 4.0f, 0.0f, 2);
                        thg0 thg0VarA6 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode12 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM12 = fetVar2.m();
                        mm40 mm40VarC11 = kbc.c0(fetVar2, mm40VarL6);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA6, shdVar111);
                        jpm0.o(fetVar2, bh90VarM12, shdVar112);
                        vqd.u(iHashCode12, fetVar2, shdVar113, fetVar2);
                        jpm0.o(fetVar2, mm40VarC11, shdVar114);
                        if (u1l0Var != null) {
                            fetVar2.e0(-1355915336);
                            g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                            i13 = 0;
                            fetVar2.r(false);
                        } else {
                            i13 = 0;
                            fetVar2.e0(-1355670808);
                            fetVar2.r(false);
                        }
                        h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                        if (g3l0Var != null) {
                            fetVar2.e0(-1355381578);
                            int i117 = i12 >> 9;
                            i14 = (i117 & 7168) | (i117 & 896) | 6;
                            if (g3l0Var instanceof v2l0) {
                                fetVar2.e0(1632507618);
                                l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                z6 = false;
                                if (g3l0Var instanceof w2l0) {
                                    fetVar2.e0(1632702267);
                                    w2l0 w2l0Var6 = (w2l0) g3l0Var;
                                    l8x.i(w2l0Var6.b, 384, w2l0Var6.f38455a, fetVar2, jm40Var);
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof d3l0) {
                                        fetVar2.e0(1632986661);
                                        d3l0 d3l0Var6 = (d3l0) g3l0Var;
                                        l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var6.f5408a, d3l0Var6.b);
                                        jm40Var2 = jm40Var;
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (g3l0Var instanceof q2l0) {
                                            fetVar2.e0(1633358816);
                                            q2l0 q2l0Var6 = (q2l0) g3l0Var;
                                            l8x.a(jm40Var2, q2l0Var6.f28005a, q2l0Var6.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof r2l0) {
                                                fetVar2.e0(1633673497);
                                                l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                function22 = function17;
                                                z9 = false;
                                                fetVar2.r(false);
                                                function19 = function18;
                                            } else {
                                                function22 = function17;
                                                if (g3l0Var instanceof b3l0) {
                                                    fetVar2.e0(1633933897);
                                                    Function1 function2110 = function18;
                                                    l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function2110, fetVar2, 6 | ((i14 >> 3) & 896));
                                                    function19 = function2110;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function19 = function18;
                                                    if (g3l0Var instanceof x2l0) {
                                                        fetVar2.e0(1634194483);
                                                        x2l0 x2l0Var6 = (x2l0) g3l0Var;
                                                        function23 = function22;
                                                        l8x.j(jm40Var2, x2l0Var6.f40173a, x2l0Var6.b, x2l0Var6.c, x2l0Var6.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function23 = function22;
                                                        if (g3l0Var instanceof a3l0) {
                                                            fetVar2.e0(1634665528);
                                                            a3l0 a3l0Var6 = (a3l0) g3l0Var;
                                                            l8x.m(jm40Var2, a3l0Var6.f178a, a3l0Var6.b, a3l0Var6.c, a3l0Var6.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (g3l0Var instanceof y2l0) {
                                                                fetVar2.e0(1635210508);
                                                                y2l0 y2l0Var6 = (y2l0) g3l0Var;
                                                                function20 = function15;
                                                                l8x.k(jm40Var2, y2l0Var6.f41910a, y2l0Var6.b, y2l0Var6.c, y2l0Var6.d, y2l0Var6.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                function23 = function23;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function20 = function15;
                                                                if (g3l0Var instanceof e3l0) {
                                                                    fetVar2.e0(1635875055);
                                                                    e3l0 e3l0Var6 = (e3l0) g3l0Var;
                                                                    l8x.N(jm40Var2, e3l0Var6.d, e3l0Var6.b, e3l0Var6.f7143a, e3l0Var6.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                    function21 = function23;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function23;
                                                                    if (g3l0Var instanceof z2l0) {
                                                                        fetVar2.e0(1636326663);
                                                                        z2l0 z2l0Var6 = (z2l0) g3l0Var;
                                                                        l8x.l(z2l0Var6.f43675a, z2l0Var6.b, z2l0Var6.c, jm40Var2, fetVar, 3072);
                                                                        jm40Var2 = jm40Var2;
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof c3l0) {
                                                                        fetVar2.e0(1636711032);
                                                                        c3l0 c3l0Var6 = (c3l0) g3l0Var;
                                                                        l8x.q(jm40Var2, c3l0Var6.f3682a, c3l0Var6.b, c3l0Var6.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                        function21 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof s2l0) {
                                                                        fetVar2.e0(1637227988);
                                                                        s2l0 s2l0Var6 = (s2l0) g3l0Var;
                                                                        l8x.g(s2l0Var6.b, mpe.f22175a, s2l0Var6.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                        jm40Var2 = jm40Var2;
                                                                    } else if (g3l0Var instanceof u2l0) {
                                                                        fetVar2.e0(1637646643);
                                                                        u2l0 u2l0Var6 = (u2l0) g3l0Var;
                                                                        jm40Var2 = jm40Var2;
                                                                        l8x.f(jm40Var2, u2l0Var6.e, u2l0Var6.f34951a, u2l0Var6.b, u2l0Var6.c, u2l0Var6.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                        function23 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof t2l0) {
                                                                        fetVar2.e0(1638245966);
                                                                        t2l0 t2l0Var6 = (t2l0) g3l0Var;
                                                                        l8x.e(t2l0Var6.d, t2l0Var6.f33222a, t2l0Var6.b, t2l0Var6.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                        jm40Var2 = jm40Var2;
                                                                        function21 = function21;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function21;
                                                                        if (g3l0Var instanceof f3l0) {
                                                                            throw b1j.f(52665976, fetVar2, false);
                                                                        }
                                                                        fetVar2.e0(1638774981);
                                                                        f3l0 f3l0Var6 = (f3l0) g3l0Var;
                                                                        boolean z110 = f3l0Var6.b;
                                                                        boolean z111 = f3l0Var6.f8869a;
                                                                        int i118 = (i14 & 896) ^ 384;
                                                                        if (i118 <= 256) {
                                                                        }
                                                                        objP3 = fetVar2.P();
                                                                        if (z7) {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        } else {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        }
                                                                        Function0 function2111 = (Function0) objP3;
                                                                        if (i118 <= 256) {
                                                                        }
                                                                        objP4 = fetVar2.P();
                                                                        if (z8) {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        } else {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        }
                                                                        l8x.Q(6, fetVar2, jm40Var2, function2111, (Function0) objP4, z110, z111);
                                                                        fetVar2 = fetVar2;
                                                                        jm40Var2 = jm40Var2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    }
                                                                }
                                                            }
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function22;
                                            z6 = z9;
                                        }
                                    }
                                    function19 = function18;
                                    function20 = function15;
                                    function21 = function23;
                                }
                                fetVar2.r(z6);
                            }
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.r(z6);
                        } else {
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.e0(-1355135128);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        zrmVar2 = zrmVar;
                        if (zrmVar2.f) {
                            fetVar2.e0(823957877);
                            mm40 mm40VarB6 = jr8.f16991a.b(jm40Var2, gqw0.h);
                            if (u1l0Var == null) {
                                f = 12.0f;
                            } else {
                                if (!(u1l0Var instanceof q1l0)) {
                                    if (u1l0Var instanceof r1l0) {
                                        f = 60.0f;
                                    } else if (u1l0Var instanceof s1l0) {
                                        f = 54.0f;
                                    } else if (!(u1l0Var instanceof t1l0)) {
                                        t9f.b();
                                        return;
                                    }
                                }
                                f2 = 46.0f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB6, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            }
                            f2 = f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB6, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(824225996);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        function9 = function21;
                        function11 = function14;
                        function10 = function19;
                        mm40Var2 = mm40Var6;
                        function12 = function20;
                    }
                    t9f.b();
                    return;
                }
                fetVar2.X();
                mm40Var2 = mm40Var;
                function9 = function7;
                function10 = function8;
                function11 = function5;
                function12 = function1;
                function13 = function6;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
                }
            }
            i3 |= 24576;
            function6 = function2;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 196608) == 0) {
                    if (fetVar2.i(function7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i & 1572864) == 0) {
                    if (fetVar2.i(function8)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                jm40Var = jm40.b;
                if (i15 != 0) {
                    mm40Var3 = jm40Var;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i16 != 0) {
                    function14 = null;
                } else {
                    function14 = function5;
                }
                if (i4 != 0) {
                    function15 = null;
                } else {
                    function15 = function1;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                }
                if (i10 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                u1l0Var = zrmVar2.b;
                f2l0Var = zrmVar2.f44861a;
                g3l0Var = zrmVar2.c;
                n3l0Var = zrmVar2.e;
                function17 = function7;
                mm40VarD = o7k0.d(mm40Var3, 1.0f);
                if (n3l0Var != null) {
                    mm40 mm40Var7 = mm40Var3;
                    if (n3l0Var instanceof j3l0) {
                        yjj0VarC = ljcVar;
                    } else {
                        if (n3l0Var instanceof l3l0) {
                            yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                        } else {
                            function18 = function16;
                            if (n3l0Var instanceof k3l0) {
                                yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                            } else if (n3l0Var instanceof m3l0) {
                                yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                            }
                        }
                        mm40 mm40VarJ7 = lgb.J(mm40VarD, yjj0VarC);
                        tj30 tj30VarC7 = zq8.c(gqw0.f11754a, false);
                        int iHashCode13 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM13 = fetVar2.m();
                        mm40 mm40VarC12 = kbc.c0(fetVar2, mm40VarJ7);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        z2 = fetVar2.S;
                        pcyVar = e7z.u1;
                        if (z2) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        shd shdVar115 = gqw0.x;
                        jpm0.o(fetVar2, tj30VarC7, shdVar115);
                        shd shdVar116 = gqw0.w;
                        jpm0.o(fetVar2, bh90VarM13, shdVar116);
                        Integer numValueOf7 = Integer.valueOf(iHashCode13);
                        shd shdVar117 = gqw0.y;
                        jpm0.o(fetVar2, numValueOf7, shdVar117);
                        jpm0.n(fetVar2);
                        shd shdVar118 = gqw0.v;
                        jpm0.o(fetVar2, mm40VarC12, shdVar118);
                        mm40 mm40VarQ7 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                        if (function14 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP = fetVar2.P();
                        cl5 cl5Var7 = ukd.f35823a;
                        if (z4) {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        } else {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        }
                        Function0 function2112 = (Function0) objP;
                        if ((i3 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z5) {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarZ7 = y860.Z(mm40VarQ7, null, z3, function2112, (Function0) objP2, 440);
                        zcl zclVar7 = qmk.f28987a;
                        i12 = i3;
                        mm40 mm40VarL7 = s5x0.L(mm40VarZ7, 4.0f, 0.0f, 2);
                        thg0 thg0VarA7 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode14 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM14 = fetVar2.m();
                        mm40 mm40VarC13 = kbc.c0(fetVar2, mm40VarL7);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA7, shdVar115);
                        jpm0.o(fetVar2, bh90VarM14, shdVar116);
                        vqd.u(iHashCode14, fetVar2, shdVar117, fetVar2);
                        jpm0.o(fetVar2, mm40VarC13, shdVar118);
                        if (u1l0Var != null) {
                            fetVar2.e0(-1355915336);
                            g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                            i13 = 0;
                            fetVar2.r(false);
                        } else {
                            i13 = 0;
                            fetVar2.e0(-1355670808);
                            fetVar2.r(false);
                        }
                        h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                        if (g3l0Var != null) {
                            fetVar2.e0(-1355381578);
                            int i119 = i12 >> 9;
                            i14 = (i119 & 7168) | (i119 & 896) | 6;
                            if (g3l0Var instanceof v2l0) {
                                fetVar2.e0(1632507618);
                                l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                z6 = false;
                                if (g3l0Var instanceof w2l0) {
                                    fetVar2.e0(1632702267);
                                    w2l0 w2l0Var7 = (w2l0) g3l0Var;
                                    l8x.i(w2l0Var7.b, 384, w2l0Var7.f38455a, fetVar2, jm40Var);
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof d3l0) {
                                        fetVar2.e0(1632986661);
                                        d3l0 d3l0Var7 = (d3l0) g3l0Var;
                                        l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var7.f5408a, d3l0Var7.b);
                                        jm40Var2 = jm40Var;
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (g3l0Var instanceof q2l0) {
                                            fetVar2.e0(1633358816);
                                            q2l0 q2l0Var7 = (q2l0) g3l0Var;
                                            l8x.a(jm40Var2, q2l0Var7.f28005a, q2l0Var7.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof r2l0) {
                                                fetVar2.e0(1633673497);
                                                l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                function22 = function17;
                                                z9 = false;
                                                fetVar2.r(false);
                                                function19 = function18;
                                            } else {
                                                function22 = function17;
                                                if (g3l0Var instanceof b3l0) {
                                                    fetVar2.e0(1633933897);
                                                    Function1 function2113 = function18;
                                                    l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function2113, fetVar2, 6 | ((i14 >> 3) & 896));
                                                    function19 = function2113;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function19 = function18;
                                                    if (g3l0Var instanceof x2l0) {
                                                        fetVar2.e0(1634194483);
                                                        x2l0 x2l0Var7 = (x2l0) g3l0Var;
                                                        function23 = function22;
                                                        l8x.j(jm40Var2, x2l0Var7.f40173a, x2l0Var7.b, x2l0Var7.c, x2l0Var7.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function23 = function22;
                                                        if (g3l0Var instanceof a3l0) {
                                                            fetVar2.e0(1634665528);
                                                            a3l0 a3l0Var7 = (a3l0) g3l0Var;
                                                            l8x.m(jm40Var2, a3l0Var7.f178a, a3l0Var7.b, a3l0Var7.c, a3l0Var7.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (g3l0Var instanceof y2l0) {
                                                                fetVar2.e0(1635210508);
                                                                y2l0 y2l0Var7 = (y2l0) g3l0Var;
                                                                function20 = function15;
                                                                l8x.k(jm40Var2, y2l0Var7.f41910a, y2l0Var7.b, y2l0Var7.c, y2l0Var7.d, y2l0Var7.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                function23 = function23;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function20 = function15;
                                                                if (g3l0Var instanceof e3l0) {
                                                                    fetVar2.e0(1635875055);
                                                                    e3l0 e3l0Var7 = (e3l0) g3l0Var;
                                                                    l8x.N(jm40Var2, e3l0Var7.d, e3l0Var7.b, e3l0Var7.f7143a, e3l0Var7.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                    function21 = function23;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function23;
                                                                    if (g3l0Var instanceof z2l0) {
                                                                        fetVar2.e0(1636326663);
                                                                        z2l0 z2l0Var7 = (z2l0) g3l0Var;
                                                                        l8x.l(z2l0Var7.f43675a, z2l0Var7.b, z2l0Var7.c, jm40Var2, fetVar, 3072);
                                                                        jm40Var2 = jm40Var2;
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof c3l0) {
                                                                        fetVar2.e0(1636711032);
                                                                        c3l0 c3l0Var7 = (c3l0) g3l0Var;
                                                                        l8x.q(jm40Var2, c3l0Var7.f3682a, c3l0Var7.b, c3l0Var7.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                        function21 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof s2l0) {
                                                                        fetVar2.e0(1637227988);
                                                                        s2l0 s2l0Var7 = (s2l0) g3l0Var;
                                                                        l8x.g(s2l0Var7.b, mpe.f22175a, s2l0Var7.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                        jm40Var2 = jm40Var2;
                                                                    } else if (g3l0Var instanceof u2l0) {
                                                                        fetVar2.e0(1637646643);
                                                                        u2l0 u2l0Var7 = (u2l0) g3l0Var;
                                                                        jm40Var2 = jm40Var2;
                                                                        l8x.f(jm40Var2, u2l0Var7.e, u2l0Var7.f34951a, u2l0Var7.b, u2l0Var7.c, u2l0Var7.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                        function23 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof t2l0) {
                                                                        fetVar2.e0(1638245966);
                                                                        t2l0 t2l0Var7 = (t2l0) g3l0Var;
                                                                        l8x.e(t2l0Var7.d, t2l0Var7.f33222a, t2l0Var7.b, t2l0Var7.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                        jm40Var2 = jm40Var2;
                                                                        function21 = function21;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function21;
                                                                        if (g3l0Var instanceof f3l0) {
                                                                            throw b1j.f(52665976, fetVar2, false);
                                                                        }
                                                                        fetVar2.e0(1638774981);
                                                                        f3l0 f3l0Var7 = (f3l0) g3l0Var;
                                                                        boolean z112 = f3l0Var7.b;
                                                                        boolean z113 = f3l0Var7.f8869a;
                                                                        int i1110 = (i14 & 896) ^ 384;
                                                                        if (i1110 <= 256) {
                                                                        }
                                                                        objP3 = fetVar2.P();
                                                                        if (z7) {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        } else {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        }
                                                                        Function0 function2114 = (Function0) objP3;
                                                                        if (i1110 <= 256) {
                                                                        }
                                                                        objP4 = fetVar2.P();
                                                                        if (z8) {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        } else {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        }
                                                                        l8x.Q(6, fetVar2, jm40Var2, function2114, (Function0) objP4, z112, z113);
                                                                        fetVar2 = fetVar2;
                                                                        jm40Var2 = jm40Var2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    }
                                                                }
                                                            }
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function22;
                                            z6 = z9;
                                        }
                                    }
                                    function19 = function18;
                                    function20 = function15;
                                    function21 = function23;
                                }
                                fetVar2.r(z6);
                            }
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.r(z6);
                        } else {
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.e0(-1355135128);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        zrmVar2 = zrmVar;
                        if (zrmVar2.f) {
                            fetVar2.e0(823957877);
                            mm40 mm40VarB7 = jr8.f16991a.b(jm40Var2, gqw0.h);
                            if (u1l0Var == null) {
                                f = 12.0f;
                            } else {
                                if (!(u1l0Var instanceof q1l0)) {
                                    if (u1l0Var instanceof r1l0) {
                                        f = 60.0f;
                                    } else if (u1l0Var instanceof s1l0) {
                                        f = 54.0f;
                                    } else if (!(u1l0Var instanceof t1l0)) {
                                        t9f.b();
                                        return;
                                    }
                                }
                                f2 = 46.0f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB7, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            }
                            f2 = f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB7, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(824225996);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        function9 = function21;
                        function11 = function14;
                        function10 = function19;
                        mm40Var2 = mm40Var7;
                        function12 = function20;
                    }
                    function18 = function16;
                    mm40 mm40VarJ8 = lgb.J(mm40VarD, yjj0VarC);
                    tj30 tj30VarC8 = zq8.c(gqw0.f11754a, false);
                    int iHashCode15 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM15 = fetVar2.m();
                    mm40 mm40VarC14 = kbc.c0(fetVar2, mm40VarJ8);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    z2 = fetVar2.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar119 = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC8, shdVar119);
                    shd shdVar1110 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM15, shdVar1110);
                    Integer numValueOf8 = Integer.valueOf(iHashCode15);
                    shd shdVar1111 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf8, shdVar1111);
                    jpm0.n(fetVar2);
                    shd shdVar1112 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC14, shdVar1112);
                    mm40 mm40VarQ8 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                    if (function14 == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP = fetVar2.P();
                    cl5 cl5Var8 = ukd.f35823a;
                    if (z4) {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    } else {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    }
                    Function0 function2115 = (Function0) objP;
                    if ((i3 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z5) {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    } else {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarZ8 = y860.Z(mm40VarQ8, null, z3, function2115, (Function0) objP2, 440);
                    zcl zclVar8 = qmk.f28987a;
                    i12 = i3;
                    mm40 mm40VarL8 = s5x0.L(mm40VarZ8, 4.0f, 0.0f, 2);
                    thg0 thg0VarA8 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode16 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM16 = fetVar2.m();
                    mm40 mm40VarC15 = kbc.c0(fetVar2, mm40VarL8);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA8, shdVar119);
                    jpm0.o(fetVar2, bh90VarM16, shdVar1110);
                    vqd.u(iHashCode16, fetVar2, shdVar1111, fetVar2);
                    jpm0.o(fetVar2, mm40VarC15, shdVar1112);
                    if (u1l0Var != null) {
                        fetVar2.e0(-1355915336);
                        g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                        i13 = 0;
                        fetVar2.r(false);
                    } else {
                        i13 = 0;
                        fetVar2.e0(-1355670808);
                        fetVar2.r(false);
                    }
                    h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                    if (g3l0Var != null) {
                        fetVar2.e0(-1355381578);
                        int i1111 = i12 >> 9;
                        i14 = (i1111 & 7168) | (i1111 & 896) | 6;
                        if (g3l0Var instanceof v2l0) {
                            fetVar2.e0(1632507618);
                            l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                            z6 = false;
                            fetVar2.r(false);
                        } else {
                            z6 = false;
                            if (g3l0Var instanceof w2l0) {
                                fetVar2.e0(1632702267);
                                w2l0 w2l0Var8 = (w2l0) g3l0Var;
                                l8x.i(w2l0Var8.b, 384, w2l0Var8.f38455a, fetVar2, jm40Var);
                                fetVar2.r(false);
                            } else {
                                if (g3l0Var instanceof d3l0) {
                                    fetVar2.e0(1632986661);
                                    d3l0 d3l0Var8 = (d3l0) g3l0Var;
                                    l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var8.f5408a, d3l0Var8.b);
                                    jm40Var2 = jm40Var;
                                    function23 = function17;
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (g3l0Var instanceof q2l0) {
                                        fetVar2.e0(1633358816);
                                        q2l0 q2l0Var8 = (q2l0) g3l0Var;
                                        l8x.a(jm40Var2, q2l0Var8.f28005a, q2l0Var8.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof r2l0) {
                                            fetVar2.e0(1633673497);
                                            l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                            function22 = function17;
                                            z9 = false;
                                            fetVar2.r(false);
                                            function19 = function18;
                                        } else {
                                            function22 = function17;
                                            if (g3l0Var instanceof b3l0) {
                                                fetVar2.e0(1633933897);
                                                Function1 function2116 = function18;
                                                l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function2116, fetVar2, 6 | ((i14 >> 3) & 896));
                                                function19 = function2116;
                                                z9 = false;
                                                fetVar2.r(false);
                                            } else {
                                                function19 = function18;
                                                if (g3l0Var instanceof x2l0) {
                                                    fetVar2.e0(1634194483);
                                                    x2l0 x2l0Var8 = (x2l0) g3l0Var;
                                                    function23 = function22;
                                                    l8x.j(jm40Var2, x2l0Var8.f40173a, x2l0Var8.b, x2l0Var8.c, x2l0Var8.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                    z6 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function23 = function22;
                                                    if (g3l0Var instanceof a3l0) {
                                                        fetVar2.e0(1634665528);
                                                        a3l0 a3l0Var8 = (a3l0) g3l0Var;
                                                        l8x.m(jm40Var2, a3l0Var8.f178a, a3l0Var8.b, a3l0Var8.c, a3l0Var8.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (g3l0Var instanceof y2l0) {
                                                            fetVar2.e0(1635210508);
                                                            y2l0 y2l0Var8 = (y2l0) g3l0Var;
                                                            function20 = function15;
                                                            l8x.k(jm40Var2, y2l0Var8.f41910a, y2l0Var8.b, y2l0Var8.c, y2l0Var8.d, y2l0Var8.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                            function23 = function23;
                                                            fetVar2 = fetVar2;
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function20 = function15;
                                                            if (g3l0Var instanceof e3l0) {
                                                                fetVar2.e0(1635875055);
                                                                e3l0 e3l0Var8 = (e3l0) g3l0Var;
                                                                l8x.N(jm40Var2, e3l0Var8.d, e3l0Var8.b, e3l0Var8.f7143a, e3l0Var8.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                function21 = function23;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function21 = function23;
                                                                if (g3l0Var instanceof z2l0) {
                                                                    fetVar2.e0(1636326663);
                                                                    z2l0 z2l0Var8 = (z2l0) g3l0Var;
                                                                    l8x.l(z2l0Var8.f43675a, z2l0Var8.b, z2l0Var8.c, jm40Var2, fetVar, 3072);
                                                                    jm40Var2 = jm40Var2;
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof c3l0) {
                                                                    fetVar2.e0(1636711032);
                                                                    c3l0 c3l0Var8 = (c3l0) g3l0Var;
                                                                    l8x.q(jm40Var2, c3l0Var8.f3682a, c3l0Var8.b, c3l0Var8.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                    function21 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof s2l0) {
                                                                    fetVar2.e0(1637227988);
                                                                    s2l0 s2l0Var8 = (s2l0) g3l0Var;
                                                                    l8x.g(s2l0Var8.b, mpe.f22175a, s2l0Var8.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                    jm40Var2 = jm40Var2;
                                                                } else if (g3l0Var instanceof u2l0) {
                                                                    fetVar2.e0(1637646643);
                                                                    u2l0 u2l0Var8 = (u2l0) g3l0Var;
                                                                    jm40Var2 = jm40Var2;
                                                                    l8x.f(jm40Var2, u2l0Var8.e, u2l0Var8.f34951a, u2l0Var8.b, u2l0Var8.c, u2l0Var8.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                    function23 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof t2l0) {
                                                                    fetVar2.e0(1638245966);
                                                                    t2l0 t2l0Var8 = (t2l0) g3l0Var;
                                                                    l8x.e(t2l0Var8.d, t2l0Var8.f33222a, t2l0Var8.b, t2l0Var8.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                    jm40Var2 = jm40Var2;
                                                                    function21 = function21;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function21;
                                                                    if (g3l0Var instanceof f3l0) {
                                                                        throw b1j.f(52665976, fetVar2, false);
                                                                    }
                                                                    fetVar2.e0(1638774981);
                                                                    f3l0 f3l0Var8 = (f3l0) g3l0Var;
                                                                    boolean z114 = f3l0Var8.b;
                                                                    boolean z115 = f3l0Var8.f8869a;
                                                                    int i1112 = (i14 & 896) ^ 384;
                                                                    if (i1112 <= 256) {
                                                                    }
                                                                    objP3 = fetVar2.P();
                                                                    if (z7) {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    } else {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    }
                                                                    Function0 function2117 = (Function0) objP3;
                                                                    if (i1112 <= 256) {
                                                                    }
                                                                    objP4 = fetVar2.P();
                                                                    if (z8) {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    } else {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    }
                                                                    l8x.Q(6, fetVar2, jm40Var2, function2117, (Function0) objP4, z114, z115);
                                                                    fetVar2 = fetVar2;
                                                                    jm40Var2 = jm40Var2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                }
                                                            }
                                                        }
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function23;
                                            }
                                        }
                                        function20 = function15;
                                        function21 = function22;
                                        z6 = z9;
                                    }
                                }
                                function19 = function18;
                                function20 = function15;
                                function21 = function23;
                            }
                            fetVar2.r(z6);
                        }
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.r(z6);
                    } else {
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.e0(-1355135128);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    zrmVar2 = zrmVar;
                    if (zrmVar2.f) {
                        fetVar2.e0(823957877);
                        mm40 mm40VarB8 = jr8.f16991a.b(jm40Var2, gqw0.h);
                        if (u1l0Var == null) {
                            f = 12.0f;
                        } else {
                            if (!(u1l0Var instanceof q1l0)) {
                                if (u1l0Var instanceof r1l0) {
                                    f = 60.0f;
                                } else if (u1l0Var instanceof s1l0) {
                                    f = 54.0f;
                                } else if (!(u1l0Var instanceof t1l0)) {
                                    t9f.b();
                                    return;
                                }
                            }
                            f2 = 46.0f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB8, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        }
                        f2 = f;
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB8, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(824225996);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    function9 = function21;
                    function11 = function14;
                    function10 = function19;
                    mm40Var2 = mm40Var7;
                    function12 = function20;
                }
                t9f.b();
                return;
            }
            fetVar2.X();
            mm40Var2 = mm40Var;
            function9 = function7;
            function10 = function8;
            function11 = function5;
            function12 = function1;
            function13 = function6;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
            }
        }
        i3 |= 384;
        function5 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (fetVar2.i(function1)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function6 = function2;
                    if (fetVar2.i(function6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function7 = function3;
                } else {
                    function7 = function3;
                    if ((i & 196608) == 0) {
                        if (fetVar2.i(function7)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function8 = function4;
                } else {
                    function8 = function4;
                    if ((i & 1572864) == 0) {
                        if (fetVar2.i(function8)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i15 != 0) {
                        mm40Var3 = jm40Var;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i16 != 0) {
                        function14 = null;
                    } else {
                        function14 = function5;
                    }
                    if (i4 != 0) {
                        function15 = null;
                    } else {
                        function15 = function1;
                    }
                    if (i6 != 0) {
                        function6 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    }
                    if (i10 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    u1l0Var = zrmVar2.b;
                    f2l0Var = zrmVar2.f44861a;
                    g3l0Var = zrmVar2.c;
                    n3l0Var = zrmVar2.e;
                    function17 = function7;
                    mm40VarD = o7k0.d(mm40Var3, 1.0f);
                    if (n3l0Var != null) {
                        mm40 mm40Var8 = mm40Var3;
                        if (n3l0Var instanceof j3l0) {
                            yjj0VarC = ljcVar;
                        } else {
                            if (n3l0Var instanceof l3l0) {
                                yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                            } else {
                                function18 = function16;
                                if (n3l0Var instanceof k3l0) {
                                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                                } else if (n3l0Var instanceof m3l0) {
                                    yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                                }
                            }
                            mm40 mm40VarJ9 = lgb.J(mm40VarD, yjj0VarC);
                            tj30 tj30VarC9 = zq8.c(gqw0.f11754a, false);
                            int iHashCode17 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM17 = fetVar2.m();
                            mm40 mm40VarC16 = kbc.c0(fetVar2, mm40VarJ9);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            z2 = fetVar2.S;
                            pcyVar = e7z.u1;
                            if (z2) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            shd shdVar1113 = gqw0.x;
                            jpm0.o(fetVar2, tj30VarC9, shdVar1113);
                            shd shdVar1114 = gqw0.w;
                            jpm0.o(fetVar2, bh90VarM17, shdVar1114);
                            Integer numValueOf9 = Integer.valueOf(iHashCode17);
                            shd shdVar1115 = gqw0.y;
                            jpm0.o(fetVar2, numValueOf9, shdVar1115);
                            jpm0.n(fetVar2);
                            shd shdVar1116 = gqw0.v;
                            jpm0.o(fetVar2, mm40VarC16, shdVar1116);
                            mm40 mm40VarQ9 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                            if (function14 == null) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            if ((i3 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objP = fetVar2.P();
                            cl5 cl5Var9 = ukd.f35823a;
                            if (z4) {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            } else {
                                objP = new unl(function15, (byte) 24);
                                fetVar2.o0(objP);
                            }
                            Function0 function2118 = (Function0) objP;
                            if ((i3 & 896) == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objP2 = fetVar2.P();
                            if (z5) {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            } else {
                                objP2 = new unl(function14, (byte) 25);
                                fetVar2.o0(objP2);
                            }
                            mm40 mm40VarZ9 = y860.Z(mm40VarQ9, null, z3, function2118, (Function0) objP2, 440);
                            zcl zclVar9 = qmk.f28987a;
                            i12 = i3;
                            mm40 mm40VarL9 = s5x0.L(mm40VarZ9, 4.0f, 0.0f, 2);
                            thg0 thg0VarA9 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                            int iHashCode18 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM18 = fetVar2.m();
                            mm40 mm40VarC17 = kbc.c0(fetVar2, mm40VarL9);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, thg0VarA9, shdVar1113);
                            jpm0.o(fetVar2, bh90VarM18, shdVar1114);
                            vqd.u(iHashCode18, fetVar2, shdVar1115, fetVar2);
                            jpm0.o(fetVar2, mm40VarC17, shdVar1116);
                            if (u1l0Var != null) {
                                fetVar2.e0(-1355915336);
                                g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                                i13 = 0;
                                fetVar2.r(false);
                            } else {
                                i13 = 0;
                                fetVar2.e0(-1355670808);
                                fetVar2.r(false);
                            }
                            h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                            if (g3l0Var != null) {
                                fetVar2.e0(-1355381578);
                                int i1113 = i12 >> 9;
                                i14 = (i1113 & 7168) | (i1113 & 896) | 6;
                                if (g3l0Var instanceof v2l0) {
                                    fetVar2.e0(1632507618);
                                    l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    z6 = false;
                                    if (g3l0Var instanceof w2l0) {
                                        fetVar2.e0(1632702267);
                                        w2l0 w2l0Var9 = (w2l0) g3l0Var;
                                        l8x.i(w2l0Var9.b, 384, w2l0Var9.f38455a, fetVar2, jm40Var);
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof d3l0) {
                                            fetVar2.e0(1632986661);
                                            d3l0 d3l0Var9 = (d3l0) g3l0Var;
                                            l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var9.f5408a, d3l0Var9.b);
                                            jm40Var2 = jm40Var;
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            jm40Var2 = jm40Var;
                                            if (g3l0Var instanceof q2l0) {
                                                fetVar2.e0(1633358816);
                                                q2l0 q2l0Var9 = (q2l0) g3l0Var;
                                                l8x.a(jm40Var2, q2l0Var9.f28005a, q2l0Var9.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                                function23 = function17;
                                                z6 = false;
                                                fetVar2.r(false);
                                            } else {
                                                if (g3l0Var instanceof r2l0) {
                                                    fetVar2.e0(1633673497);
                                                    l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                    function22 = function17;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                    function19 = function18;
                                                } else {
                                                    function22 = function17;
                                                    if (g3l0Var instanceof b3l0) {
                                                        fetVar2.e0(1633933897);
                                                        Function1 function2119 = function18;
                                                        l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function2119, fetVar2, 6 | ((i14 >> 3) & 896));
                                                        function19 = function2119;
                                                        z9 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function19 = function18;
                                                        if (g3l0Var instanceof x2l0) {
                                                            fetVar2.e0(1634194483);
                                                            x2l0 x2l0Var9 = (x2l0) g3l0Var;
                                                            function23 = function22;
                                                            l8x.j(jm40Var2, x2l0Var9.f40173a, x2l0Var9.b, x2l0Var9.c, x2l0Var9.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function23 = function22;
                                                            if (g3l0Var instanceof a3l0) {
                                                                fetVar2.e0(1634665528);
                                                                a3l0 a3l0Var9 = (a3l0) g3l0Var;
                                                                l8x.m(jm40Var2, a3l0Var9.f178a, a3l0Var9.b, a3l0Var9.c, a3l0Var9.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                if (g3l0Var instanceof y2l0) {
                                                                    fetVar2.e0(1635210508);
                                                                    y2l0 y2l0Var9 = (y2l0) g3l0Var;
                                                                    function20 = function15;
                                                                    l8x.k(jm40Var2, y2l0Var9.f41910a, y2l0Var9.b, y2l0Var9.c, y2l0Var9.d, y2l0Var9.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                    function23 = function23;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function20 = function15;
                                                                    if (g3l0Var instanceof e3l0) {
                                                                        fetVar2.e0(1635875055);
                                                                        e3l0 e3l0Var9 = (e3l0) g3l0Var;
                                                                        l8x.N(jm40Var2, e3l0Var9.d, e3l0Var9.b, e3l0Var9.f7143a, e3l0Var9.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                        function21 = function23;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function23;
                                                                        if (g3l0Var instanceof z2l0) {
                                                                            fetVar2.e0(1636326663);
                                                                            z2l0 z2l0Var9 = (z2l0) g3l0Var;
                                                                            l8x.l(z2l0Var9.f43675a, z2l0Var9.b, z2l0Var9.c, jm40Var2, fetVar, 3072);
                                                                            jm40Var2 = jm40Var2;
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof c3l0) {
                                                                            fetVar2.e0(1636711032);
                                                                            c3l0 c3l0Var9 = (c3l0) g3l0Var;
                                                                            l8x.q(jm40Var2, c3l0Var9.f3682a, c3l0Var9.b, c3l0Var9.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                            function21 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof s2l0) {
                                                                            fetVar2.e0(1637227988);
                                                                            s2l0 s2l0Var9 = (s2l0) g3l0Var;
                                                                            l8x.g(s2l0Var9.b, mpe.f22175a, s2l0Var9.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                            fetVar2 = fetVar;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                            jm40Var2 = jm40Var2;
                                                                        } else if (g3l0Var instanceof u2l0) {
                                                                            fetVar2.e0(1637646643);
                                                                            u2l0 u2l0Var9 = (u2l0) g3l0Var;
                                                                            jm40Var2 = jm40Var2;
                                                                            l8x.f(jm40Var2, u2l0Var9.e, u2l0Var9.f34951a, u2l0Var9.b, u2l0Var9.c, u2l0Var9.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                            function23 = function21;
                                                                            fetVar2 = fetVar2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else if (g3l0Var instanceof t2l0) {
                                                                            fetVar2.e0(1638245966);
                                                                            t2l0 t2l0Var9 = (t2l0) g3l0Var;
                                                                            l8x.e(t2l0Var9.d, t2l0Var9.f33222a, t2l0Var9.b, t2l0Var9.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                            jm40Var2 = jm40Var2;
                                                                            function21 = function21;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        } else {
                                                                            function21 = function21;
                                                                            if (g3l0Var instanceof f3l0) {
                                                                                throw b1j.f(52665976, fetVar2, false);
                                                                            }
                                                                            fetVar2.e0(1638774981);
                                                                            f3l0 f3l0Var9 = (f3l0) g3l0Var;
                                                                            boolean z116 = f3l0Var9.b;
                                                                            boolean z117 = f3l0Var9.f8869a;
                                                                            int i1114 = (i14 & 896) ^ 384;
                                                                            if (i1114 <= 256) {
                                                                            }
                                                                            objP3 = fetVar2.P();
                                                                            if (z7) {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            } else {
                                                                                objP3 = new uck0(function21, (byte) 8);
                                                                                fetVar2.o0(objP3);
                                                                            }
                                                                            Function0 function21110 = (Function0) objP3;
                                                                            if (i1114 <= 256) {
                                                                            }
                                                                            objP4 = fetVar2.P();
                                                                            if (z8) {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            } else {
                                                                                objP4 = new uck0(function21, (byte) 11);
                                                                                fetVar2.o0(objP4);
                                                                            }
                                                                            l8x.Q(6, fetVar2, jm40Var2, function21110, (Function0) objP4, z116, z117);
                                                                            fetVar2 = fetVar2;
                                                                            jm40Var2 = jm40Var2;
                                                                            z6 = false;
                                                                            fetVar2.r(false);
                                                                        }
                                                                    }
                                                                }
                                                                function21 = function23;
                                                            }
                                                        }
                                                        function20 = function15;
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function22;
                                                z6 = z9;
                                            }
                                        }
                                        function19 = function18;
                                        function20 = function15;
                                        function21 = function23;
                                    }
                                    fetVar2.r(z6);
                                }
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.r(z6);
                            } else {
                                function19 = function18;
                                jm40Var2 = jm40Var;
                                function20 = function15;
                                function21 = function17;
                                fetVar2.e0(-1355135128);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            zrmVar2 = zrmVar;
                            if (zrmVar2.f) {
                                fetVar2.e0(823957877);
                                mm40 mm40VarB9 = jr8.f16991a.b(jm40Var2, gqw0.h);
                                if (u1l0Var == null) {
                                    f = 12.0f;
                                } else {
                                    if (!(u1l0Var instanceof q1l0)) {
                                        if (u1l0Var instanceof r1l0) {
                                            f = 60.0f;
                                        } else if (u1l0Var instanceof s1l0) {
                                            f = 54.0f;
                                        } else if (!(u1l0Var instanceof t1l0)) {
                                            t9f.b();
                                            return;
                                        }
                                    }
                                    f2 = 46.0f;
                                    mbc.o(agi0.f827a, s5x0.N(mm40VarB9, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                    fetVar2.r(false);
                                }
                                f2 = f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB9, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(824225996);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            function9 = function21;
                            function11 = function14;
                            function10 = function19;
                            mm40Var2 = mm40Var8;
                            function12 = function20;
                        }
                        function18 = function16;
                        mm40 mm40VarJ10 = lgb.J(mm40VarD, yjj0VarC);
                        tj30 tj30VarC10 = zq8.c(gqw0.f11754a, false);
                        int iHashCode19 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM19 = fetVar2.m();
                        mm40 mm40VarC18 = kbc.c0(fetVar2, mm40VarJ10);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        z2 = fetVar2.S;
                        pcyVar = e7z.u1;
                        if (z2) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        shd shdVar1117 = gqw0.x;
                        jpm0.o(fetVar2, tj30VarC10, shdVar1117);
                        shd shdVar1118 = gqw0.w;
                        jpm0.o(fetVar2, bh90VarM19, shdVar1118);
                        Integer numValueOf10 = Integer.valueOf(iHashCode19);
                        shd shdVar1119 = gqw0.y;
                        jpm0.o(fetVar2, numValueOf10, shdVar1119);
                        jpm0.n(fetVar2);
                        shd shdVar11110 = gqw0.v;
                        jpm0.o(fetVar2, mm40VarC18, shdVar11110);
                        mm40 mm40VarQ10 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                        if (function14 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP = fetVar2.P();
                        cl5 cl5Var10 = ukd.f35823a;
                        if (z4) {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        } else {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        }
                        Function0 function21111 = (Function0) objP;
                        if ((i3 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z5) {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarZ10 = y860.Z(mm40VarQ10, null, z3, function21111, (Function0) objP2, 440);
                        zcl zclVar10 = qmk.f28987a;
                        i12 = i3;
                        mm40 mm40VarL10 = s5x0.L(mm40VarZ10, 4.0f, 0.0f, 2);
                        thg0 thg0VarA10 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode110 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM110 = fetVar2.m();
                        mm40 mm40VarC19 = kbc.c0(fetVar2, mm40VarL10);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA10, shdVar1117);
                        jpm0.o(fetVar2, bh90VarM110, shdVar1118);
                        vqd.u(iHashCode110, fetVar2, shdVar1119, fetVar2);
                        jpm0.o(fetVar2, mm40VarC19, shdVar11110);
                        if (u1l0Var != null) {
                            fetVar2.e0(-1355915336);
                            g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                            i13 = 0;
                            fetVar2.r(false);
                        } else {
                            i13 = 0;
                            fetVar2.e0(-1355670808);
                            fetVar2.r(false);
                        }
                        h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                        if (g3l0Var != null) {
                            fetVar2.e0(-1355381578);
                            int i1115 = i12 >> 9;
                            i14 = (i1115 & 7168) | (i1115 & 896) | 6;
                            if (g3l0Var instanceof v2l0) {
                                fetVar2.e0(1632507618);
                                l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                z6 = false;
                                if (g3l0Var instanceof w2l0) {
                                    fetVar2.e0(1632702267);
                                    w2l0 w2l0Var10 = (w2l0) g3l0Var;
                                    l8x.i(w2l0Var10.b, 384, w2l0Var10.f38455a, fetVar2, jm40Var);
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof d3l0) {
                                        fetVar2.e0(1632986661);
                                        d3l0 d3l0Var10 = (d3l0) g3l0Var;
                                        l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var10.f5408a, d3l0Var10.b);
                                        jm40Var2 = jm40Var;
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (g3l0Var instanceof q2l0) {
                                            fetVar2.e0(1633358816);
                                            q2l0 q2l0Var10 = (q2l0) g3l0Var;
                                            l8x.a(jm40Var2, q2l0Var10.f28005a, q2l0Var10.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof r2l0) {
                                                fetVar2.e0(1633673497);
                                                l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                function22 = function17;
                                                z9 = false;
                                                fetVar2.r(false);
                                                function19 = function18;
                                            } else {
                                                function22 = function17;
                                                if (g3l0Var instanceof b3l0) {
                                                    fetVar2.e0(1633933897);
                                                    Function1 function21112 = function18;
                                                    l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function21112, fetVar2, 6 | ((i14 >> 3) & 896));
                                                    function19 = function21112;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function19 = function18;
                                                    if (g3l0Var instanceof x2l0) {
                                                        fetVar2.e0(1634194483);
                                                        x2l0 x2l0Var10 = (x2l0) g3l0Var;
                                                        function23 = function22;
                                                        l8x.j(jm40Var2, x2l0Var10.f40173a, x2l0Var10.b, x2l0Var10.c, x2l0Var10.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function23 = function22;
                                                        if (g3l0Var instanceof a3l0) {
                                                            fetVar2.e0(1634665528);
                                                            a3l0 a3l0Var10 = (a3l0) g3l0Var;
                                                            l8x.m(jm40Var2, a3l0Var10.f178a, a3l0Var10.b, a3l0Var10.c, a3l0Var10.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (g3l0Var instanceof y2l0) {
                                                                fetVar2.e0(1635210508);
                                                                y2l0 y2l0Var10 = (y2l0) g3l0Var;
                                                                function20 = function15;
                                                                l8x.k(jm40Var2, y2l0Var10.f41910a, y2l0Var10.b, y2l0Var10.c, y2l0Var10.d, y2l0Var10.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                function23 = function23;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function20 = function15;
                                                                if (g3l0Var instanceof e3l0) {
                                                                    fetVar2.e0(1635875055);
                                                                    e3l0 e3l0Var10 = (e3l0) g3l0Var;
                                                                    l8x.N(jm40Var2, e3l0Var10.d, e3l0Var10.b, e3l0Var10.f7143a, e3l0Var10.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                    function21 = function23;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function23;
                                                                    if (g3l0Var instanceof z2l0) {
                                                                        fetVar2.e0(1636326663);
                                                                        z2l0 z2l0Var10 = (z2l0) g3l0Var;
                                                                        l8x.l(z2l0Var10.f43675a, z2l0Var10.b, z2l0Var10.c, jm40Var2, fetVar, 3072);
                                                                        jm40Var2 = jm40Var2;
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof c3l0) {
                                                                        fetVar2.e0(1636711032);
                                                                        c3l0 c3l0Var10 = (c3l0) g3l0Var;
                                                                        l8x.q(jm40Var2, c3l0Var10.f3682a, c3l0Var10.b, c3l0Var10.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                        function21 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof s2l0) {
                                                                        fetVar2.e0(1637227988);
                                                                        s2l0 s2l0Var10 = (s2l0) g3l0Var;
                                                                        l8x.g(s2l0Var10.b, mpe.f22175a, s2l0Var10.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                        jm40Var2 = jm40Var2;
                                                                    } else if (g3l0Var instanceof u2l0) {
                                                                        fetVar2.e0(1637646643);
                                                                        u2l0 u2l0Var10 = (u2l0) g3l0Var;
                                                                        jm40Var2 = jm40Var2;
                                                                        l8x.f(jm40Var2, u2l0Var10.e, u2l0Var10.f34951a, u2l0Var10.b, u2l0Var10.c, u2l0Var10.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                        function23 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof t2l0) {
                                                                        fetVar2.e0(1638245966);
                                                                        t2l0 t2l0Var10 = (t2l0) g3l0Var;
                                                                        l8x.e(t2l0Var10.d, t2l0Var10.f33222a, t2l0Var10.b, t2l0Var10.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                        jm40Var2 = jm40Var2;
                                                                        function21 = function21;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function21;
                                                                        if (g3l0Var instanceof f3l0) {
                                                                            throw b1j.f(52665976, fetVar2, false);
                                                                        }
                                                                        fetVar2.e0(1638774981);
                                                                        f3l0 f3l0Var10 = (f3l0) g3l0Var;
                                                                        boolean z118 = f3l0Var10.b;
                                                                        boolean z119 = f3l0Var10.f8869a;
                                                                        int i1116 = (i14 & 896) ^ 384;
                                                                        if (i1116 <= 256) {
                                                                        }
                                                                        objP3 = fetVar2.P();
                                                                        if (z7) {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        } else {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        }
                                                                        Function0 function21113 = (Function0) objP3;
                                                                        if (i1116 <= 256) {
                                                                        }
                                                                        objP4 = fetVar2.P();
                                                                        if (z8) {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        } else {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        }
                                                                        l8x.Q(6, fetVar2, jm40Var2, function21113, (Function0) objP4, z118, z119);
                                                                        fetVar2 = fetVar2;
                                                                        jm40Var2 = jm40Var2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    }
                                                                }
                                                            }
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function22;
                                            z6 = z9;
                                        }
                                    }
                                    function19 = function18;
                                    function20 = function15;
                                    function21 = function23;
                                }
                                fetVar2.r(z6);
                            }
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.r(z6);
                        } else {
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.e0(-1355135128);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        zrmVar2 = zrmVar;
                        if (zrmVar2.f) {
                            fetVar2.e0(823957877);
                            mm40 mm40VarB10 = jr8.f16991a.b(jm40Var2, gqw0.h);
                            if (u1l0Var == null) {
                                f = 12.0f;
                            } else {
                                if (!(u1l0Var instanceof q1l0)) {
                                    if (u1l0Var instanceof r1l0) {
                                        f = 60.0f;
                                    } else if (u1l0Var instanceof s1l0) {
                                        f = 54.0f;
                                    } else if (!(u1l0Var instanceof t1l0)) {
                                        t9f.b();
                                        return;
                                    }
                                }
                                f2 = 46.0f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB10, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            }
                            f2 = f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB10, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(824225996);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        function9 = function21;
                        function11 = function14;
                        function10 = function19;
                        mm40Var2 = mm40Var8;
                        function12 = function20;
                    }
                    t9f.b();
                    return;
                }
                fetVar2.X();
                mm40Var2 = mm40Var;
                function9 = function7;
                function10 = function8;
                function11 = function5;
                function12 = function1;
                function13 = function6;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
                }
            }
            i3 |= 24576;
            function6 = function2;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 196608) == 0) {
                    if (fetVar2.i(function7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i & 1572864) == 0) {
                    if (fetVar2.i(function8)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                jm40Var = jm40.b;
                if (i15 != 0) {
                    mm40Var3 = jm40Var;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i16 != 0) {
                    function14 = null;
                } else {
                    function14 = function5;
                }
                if (i4 != 0) {
                    function15 = null;
                } else {
                    function15 = function1;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                }
                if (i10 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                u1l0Var = zrmVar2.b;
                f2l0Var = zrmVar2.f44861a;
                g3l0Var = zrmVar2.c;
                n3l0Var = zrmVar2.e;
                function17 = function7;
                mm40VarD = o7k0.d(mm40Var3, 1.0f);
                if (n3l0Var != null) {
                    mm40 mm40Var9 = mm40Var3;
                    if (n3l0Var instanceof j3l0) {
                        yjj0VarC = ljcVar;
                    } else {
                        if (n3l0Var instanceof l3l0) {
                            yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                        } else {
                            function18 = function16;
                            if (n3l0Var instanceof k3l0) {
                                yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                            } else if (n3l0Var instanceof m3l0) {
                                yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                            }
                        }
                        mm40 mm40VarJ11 = lgb.J(mm40VarD, yjj0VarC);
                        tj30 tj30VarC11 = zq8.c(gqw0.f11754a, false);
                        int iHashCode111 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM111 = fetVar2.m();
                        mm40 mm40VarC110 = kbc.c0(fetVar2, mm40VarJ11);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        z2 = fetVar2.S;
                        pcyVar = e7z.u1;
                        if (z2) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        shd shdVar11111 = gqw0.x;
                        jpm0.o(fetVar2, tj30VarC11, shdVar11111);
                        shd shdVar11112 = gqw0.w;
                        jpm0.o(fetVar2, bh90VarM111, shdVar11112);
                        Integer numValueOf11 = Integer.valueOf(iHashCode111);
                        shd shdVar11113 = gqw0.y;
                        jpm0.o(fetVar2, numValueOf11, shdVar11113);
                        jpm0.n(fetVar2);
                        shd shdVar11114 = gqw0.v;
                        jpm0.o(fetVar2, mm40VarC110, shdVar11114);
                        mm40 mm40VarQ11 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                        if (function14 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP = fetVar2.P();
                        cl5 cl5Var11 = ukd.f35823a;
                        if (z4) {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        } else {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        }
                        Function0 function21114 = (Function0) objP;
                        if ((i3 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z5) {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarZ11 = y860.Z(mm40VarQ11, null, z3, function21114, (Function0) objP2, 440);
                        zcl zclVar11 = qmk.f28987a;
                        i12 = i3;
                        mm40 mm40VarL11 = s5x0.L(mm40VarZ11, 4.0f, 0.0f, 2);
                        thg0 thg0VarA11 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode112 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM112 = fetVar2.m();
                        mm40 mm40VarC111 = kbc.c0(fetVar2, mm40VarL11);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA11, shdVar11111);
                        jpm0.o(fetVar2, bh90VarM112, shdVar11112);
                        vqd.u(iHashCode112, fetVar2, shdVar11113, fetVar2);
                        jpm0.o(fetVar2, mm40VarC111, shdVar11114);
                        if (u1l0Var != null) {
                            fetVar2.e0(-1355915336);
                            g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                            i13 = 0;
                            fetVar2.r(false);
                        } else {
                            i13 = 0;
                            fetVar2.e0(-1355670808);
                            fetVar2.r(false);
                        }
                        h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                        if (g3l0Var != null) {
                            fetVar2.e0(-1355381578);
                            int i1117 = i12 >> 9;
                            i14 = (i1117 & 7168) | (i1117 & 896) | 6;
                            if (g3l0Var instanceof v2l0) {
                                fetVar2.e0(1632507618);
                                l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                z6 = false;
                                if (g3l0Var instanceof w2l0) {
                                    fetVar2.e0(1632702267);
                                    w2l0 w2l0Var11 = (w2l0) g3l0Var;
                                    l8x.i(w2l0Var11.b, 384, w2l0Var11.f38455a, fetVar2, jm40Var);
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof d3l0) {
                                        fetVar2.e0(1632986661);
                                        d3l0 d3l0Var11 = (d3l0) g3l0Var;
                                        l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var11.f5408a, d3l0Var11.b);
                                        jm40Var2 = jm40Var;
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (g3l0Var instanceof q2l0) {
                                            fetVar2.e0(1633358816);
                                            q2l0 q2l0Var11 = (q2l0) g3l0Var;
                                            l8x.a(jm40Var2, q2l0Var11.f28005a, q2l0Var11.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof r2l0) {
                                                fetVar2.e0(1633673497);
                                                l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                function22 = function17;
                                                z9 = false;
                                                fetVar2.r(false);
                                                function19 = function18;
                                            } else {
                                                function22 = function17;
                                                if (g3l0Var instanceof b3l0) {
                                                    fetVar2.e0(1633933897);
                                                    Function1 function21115 = function18;
                                                    l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function21115, fetVar2, 6 | ((i14 >> 3) & 896));
                                                    function19 = function21115;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function19 = function18;
                                                    if (g3l0Var instanceof x2l0) {
                                                        fetVar2.e0(1634194483);
                                                        x2l0 x2l0Var11 = (x2l0) g3l0Var;
                                                        function23 = function22;
                                                        l8x.j(jm40Var2, x2l0Var11.f40173a, x2l0Var11.b, x2l0Var11.c, x2l0Var11.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function23 = function22;
                                                        if (g3l0Var instanceof a3l0) {
                                                            fetVar2.e0(1634665528);
                                                            a3l0 a3l0Var11 = (a3l0) g3l0Var;
                                                            l8x.m(jm40Var2, a3l0Var11.f178a, a3l0Var11.b, a3l0Var11.c, a3l0Var11.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (g3l0Var instanceof y2l0) {
                                                                fetVar2.e0(1635210508);
                                                                y2l0 y2l0Var11 = (y2l0) g3l0Var;
                                                                function20 = function15;
                                                                l8x.k(jm40Var2, y2l0Var11.f41910a, y2l0Var11.b, y2l0Var11.c, y2l0Var11.d, y2l0Var11.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                function23 = function23;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function20 = function15;
                                                                if (g3l0Var instanceof e3l0) {
                                                                    fetVar2.e0(1635875055);
                                                                    e3l0 e3l0Var11 = (e3l0) g3l0Var;
                                                                    l8x.N(jm40Var2, e3l0Var11.d, e3l0Var11.b, e3l0Var11.f7143a, e3l0Var11.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                    function21 = function23;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function23;
                                                                    if (g3l0Var instanceof z2l0) {
                                                                        fetVar2.e0(1636326663);
                                                                        z2l0 z2l0Var11 = (z2l0) g3l0Var;
                                                                        l8x.l(z2l0Var11.f43675a, z2l0Var11.b, z2l0Var11.c, jm40Var2, fetVar, 3072);
                                                                        jm40Var2 = jm40Var2;
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof c3l0) {
                                                                        fetVar2.e0(1636711032);
                                                                        c3l0 c3l0Var11 = (c3l0) g3l0Var;
                                                                        l8x.q(jm40Var2, c3l0Var11.f3682a, c3l0Var11.b, c3l0Var11.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                        function21 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof s2l0) {
                                                                        fetVar2.e0(1637227988);
                                                                        s2l0 s2l0Var11 = (s2l0) g3l0Var;
                                                                        l8x.g(s2l0Var11.b, mpe.f22175a, s2l0Var11.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                        jm40Var2 = jm40Var2;
                                                                    } else if (g3l0Var instanceof u2l0) {
                                                                        fetVar2.e0(1637646643);
                                                                        u2l0 u2l0Var11 = (u2l0) g3l0Var;
                                                                        jm40Var2 = jm40Var2;
                                                                        l8x.f(jm40Var2, u2l0Var11.e, u2l0Var11.f34951a, u2l0Var11.b, u2l0Var11.c, u2l0Var11.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                        function23 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof t2l0) {
                                                                        fetVar2.e0(1638245966);
                                                                        t2l0 t2l0Var11 = (t2l0) g3l0Var;
                                                                        l8x.e(t2l0Var11.d, t2l0Var11.f33222a, t2l0Var11.b, t2l0Var11.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                        jm40Var2 = jm40Var2;
                                                                        function21 = function21;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function21;
                                                                        if (g3l0Var instanceof f3l0) {
                                                                            throw b1j.f(52665976, fetVar2, false);
                                                                        }
                                                                        fetVar2.e0(1638774981);
                                                                        f3l0 f3l0Var11 = (f3l0) g3l0Var;
                                                                        boolean z1110 = f3l0Var11.b;
                                                                        boolean z1111 = f3l0Var11.f8869a;
                                                                        int i1118 = (i14 & 896) ^ 384;
                                                                        if (i1118 <= 256) {
                                                                        }
                                                                        objP3 = fetVar2.P();
                                                                        if (z7) {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        } else {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        }
                                                                        Function0 function21116 = (Function0) objP3;
                                                                        if (i1118 <= 256) {
                                                                        }
                                                                        objP4 = fetVar2.P();
                                                                        if (z8) {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        } else {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        }
                                                                        l8x.Q(6, fetVar2, jm40Var2, function21116, (Function0) objP4, z1110, z1111);
                                                                        fetVar2 = fetVar2;
                                                                        jm40Var2 = jm40Var2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    }
                                                                }
                                                            }
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function22;
                                            z6 = z9;
                                        }
                                    }
                                    function19 = function18;
                                    function20 = function15;
                                    function21 = function23;
                                }
                                fetVar2.r(z6);
                            }
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.r(z6);
                        } else {
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.e0(-1355135128);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        zrmVar2 = zrmVar;
                        if (zrmVar2.f) {
                            fetVar2.e0(823957877);
                            mm40 mm40VarB11 = jr8.f16991a.b(jm40Var2, gqw0.h);
                            if (u1l0Var == null) {
                                f = 12.0f;
                            } else {
                                if (!(u1l0Var instanceof q1l0)) {
                                    if (u1l0Var instanceof r1l0) {
                                        f = 60.0f;
                                    } else if (u1l0Var instanceof s1l0) {
                                        f = 54.0f;
                                    } else if (!(u1l0Var instanceof t1l0)) {
                                        t9f.b();
                                        return;
                                    }
                                }
                                f2 = 46.0f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB11, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            }
                            f2 = f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB11, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(824225996);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        function9 = function21;
                        function11 = function14;
                        function10 = function19;
                        mm40Var2 = mm40Var9;
                        function12 = function20;
                    }
                    function18 = function16;
                    mm40 mm40VarJ12 = lgb.J(mm40VarD, yjj0VarC);
                    tj30 tj30VarC12 = zq8.c(gqw0.f11754a, false);
                    int iHashCode113 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM113 = fetVar2.m();
                    mm40 mm40VarC112 = kbc.c0(fetVar2, mm40VarJ12);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    z2 = fetVar2.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar11115 = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC12, shdVar11115);
                    shd shdVar11116 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM113, shdVar11116);
                    Integer numValueOf12 = Integer.valueOf(iHashCode113);
                    shd shdVar11117 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf12, shdVar11117);
                    jpm0.n(fetVar2);
                    shd shdVar11118 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC112, shdVar11118);
                    mm40 mm40VarQ12 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                    if (function14 == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP = fetVar2.P();
                    cl5 cl5Var12 = ukd.f35823a;
                    if (z4) {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    } else {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    }
                    Function0 function21117 = (Function0) objP;
                    if ((i3 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z5) {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    } else {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarZ12 = y860.Z(mm40VarQ12, null, z3, function21117, (Function0) objP2, 440);
                    zcl zclVar12 = qmk.f28987a;
                    i12 = i3;
                    mm40 mm40VarL12 = s5x0.L(mm40VarZ12, 4.0f, 0.0f, 2);
                    thg0 thg0VarA12 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode114 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM114 = fetVar2.m();
                    mm40 mm40VarC113 = kbc.c0(fetVar2, mm40VarL12);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA12, shdVar11115);
                    jpm0.o(fetVar2, bh90VarM114, shdVar11116);
                    vqd.u(iHashCode114, fetVar2, shdVar11117, fetVar2);
                    jpm0.o(fetVar2, mm40VarC113, shdVar11118);
                    if (u1l0Var != null) {
                        fetVar2.e0(-1355915336);
                        g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                        i13 = 0;
                        fetVar2.r(false);
                    } else {
                        i13 = 0;
                        fetVar2.e0(-1355670808);
                        fetVar2.r(false);
                    }
                    h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                    if (g3l0Var != null) {
                        fetVar2.e0(-1355381578);
                        int i1119 = i12 >> 9;
                        i14 = (i1119 & 7168) | (i1119 & 896) | 6;
                        if (g3l0Var instanceof v2l0) {
                            fetVar2.e0(1632507618);
                            l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                            z6 = false;
                            fetVar2.r(false);
                        } else {
                            z6 = false;
                            if (g3l0Var instanceof w2l0) {
                                fetVar2.e0(1632702267);
                                w2l0 w2l0Var12 = (w2l0) g3l0Var;
                                l8x.i(w2l0Var12.b, 384, w2l0Var12.f38455a, fetVar2, jm40Var);
                                fetVar2.r(false);
                            } else {
                                if (g3l0Var instanceof d3l0) {
                                    fetVar2.e0(1632986661);
                                    d3l0 d3l0Var12 = (d3l0) g3l0Var;
                                    l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var12.f5408a, d3l0Var12.b);
                                    jm40Var2 = jm40Var;
                                    function23 = function17;
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (g3l0Var instanceof q2l0) {
                                        fetVar2.e0(1633358816);
                                        q2l0 q2l0Var12 = (q2l0) g3l0Var;
                                        l8x.a(jm40Var2, q2l0Var12.f28005a, q2l0Var12.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof r2l0) {
                                            fetVar2.e0(1633673497);
                                            l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                            function22 = function17;
                                            z9 = false;
                                            fetVar2.r(false);
                                            function19 = function18;
                                        } else {
                                            function22 = function17;
                                            if (g3l0Var instanceof b3l0) {
                                                fetVar2.e0(1633933897);
                                                Function1 function21118 = function18;
                                                l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function21118, fetVar2, 6 | ((i14 >> 3) & 896));
                                                function19 = function21118;
                                                z9 = false;
                                                fetVar2.r(false);
                                            } else {
                                                function19 = function18;
                                                if (g3l0Var instanceof x2l0) {
                                                    fetVar2.e0(1634194483);
                                                    x2l0 x2l0Var12 = (x2l0) g3l0Var;
                                                    function23 = function22;
                                                    l8x.j(jm40Var2, x2l0Var12.f40173a, x2l0Var12.b, x2l0Var12.c, x2l0Var12.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                    z6 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function23 = function22;
                                                    if (g3l0Var instanceof a3l0) {
                                                        fetVar2.e0(1634665528);
                                                        a3l0 a3l0Var12 = (a3l0) g3l0Var;
                                                        l8x.m(jm40Var2, a3l0Var12.f178a, a3l0Var12.b, a3l0Var12.c, a3l0Var12.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (g3l0Var instanceof y2l0) {
                                                            fetVar2.e0(1635210508);
                                                            y2l0 y2l0Var12 = (y2l0) g3l0Var;
                                                            function20 = function15;
                                                            l8x.k(jm40Var2, y2l0Var12.f41910a, y2l0Var12.b, y2l0Var12.c, y2l0Var12.d, y2l0Var12.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                            function23 = function23;
                                                            fetVar2 = fetVar2;
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function20 = function15;
                                                            if (g3l0Var instanceof e3l0) {
                                                                fetVar2.e0(1635875055);
                                                                e3l0 e3l0Var12 = (e3l0) g3l0Var;
                                                                l8x.N(jm40Var2, e3l0Var12.d, e3l0Var12.b, e3l0Var12.f7143a, e3l0Var12.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                function21 = function23;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function21 = function23;
                                                                if (g3l0Var instanceof z2l0) {
                                                                    fetVar2.e0(1636326663);
                                                                    z2l0 z2l0Var12 = (z2l0) g3l0Var;
                                                                    l8x.l(z2l0Var12.f43675a, z2l0Var12.b, z2l0Var12.c, jm40Var2, fetVar, 3072);
                                                                    jm40Var2 = jm40Var2;
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof c3l0) {
                                                                    fetVar2.e0(1636711032);
                                                                    c3l0 c3l0Var12 = (c3l0) g3l0Var;
                                                                    l8x.q(jm40Var2, c3l0Var12.f3682a, c3l0Var12.b, c3l0Var12.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                    function21 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof s2l0) {
                                                                    fetVar2.e0(1637227988);
                                                                    s2l0 s2l0Var12 = (s2l0) g3l0Var;
                                                                    l8x.g(s2l0Var12.b, mpe.f22175a, s2l0Var12.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                    jm40Var2 = jm40Var2;
                                                                } else if (g3l0Var instanceof u2l0) {
                                                                    fetVar2.e0(1637646643);
                                                                    u2l0 u2l0Var12 = (u2l0) g3l0Var;
                                                                    jm40Var2 = jm40Var2;
                                                                    l8x.f(jm40Var2, u2l0Var12.e, u2l0Var12.f34951a, u2l0Var12.b, u2l0Var12.c, u2l0Var12.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                    function23 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof t2l0) {
                                                                    fetVar2.e0(1638245966);
                                                                    t2l0 t2l0Var12 = (t2l0) g3l0Var;
                                                                    l8x.e(t2l0Var12.d, t2l0Var12.f33222a, t2l0Var12.b, t2l0Var12.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                    jm40Var2 = jm40Var2;
                                                                    function21 = function21;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function21;
                                                                    if (g3l0Var instanceof f3l0) {
                                                                        throw b1j.f(52665976, fetVar2, false);
                                                                    }
                                                                    fetVar2.e0(1638774981);
                                                                    f3l0 f3l0Var12 = (f3l0) g3l0Var;
                                                                    boolean z1112 = f3l0Var12.b;
                                                                    boolean z1113 = f3l0Var12.f8869a;
                                                                    int i11110 = (i14 & 896) ^ 384;
                                                                    if (i11110 <= 256) {
                                                                    }
                                                                    objP3 = fetVar2.P();
                                                                    if (z7) {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    } else {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    }
                                                                    Function0 function21119 = (Function0) objP3;
                                                                    if (i11110 <= 256) {
                                                                    }
                                                                    objP4 = fetVar2.P();
                                                                    if (z8) {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    } else {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    }
                                                                    l8x.Q(6, fetVar2, jm40Var2, function21119, (Function0) objP4, z1112, z1113);
                                                                    fetVar2 = fetVar2;
                                                                    jm40Var2 = jm40Var2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                }
                                                            }
                                                        }
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function23;
                                            }
                                        }
                                        function20 = function15;
                                        function21 = function22;
                                        z6 = z9;
                                    }
                                }
                                function19 = function18;
                                function20 = function15;
                                function21 = function23;
                            }
                            fetVar2.r(z6);
                        }
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.r(z6);
                    } else {
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.e0(-1355135128);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    zrmVar2 = zrmVar;
                    if (zrmVar2.f) {
                        fetVar2.e0(823957877);
                        mm40 mm40VarB12 = jr8.f16991a.b(jm40Var2, gqw0.h);
                        if (u1l0Var == null) {
                            f = 12.0f;
                        } else {
                            if (!(u1l0Var instanceof q1l0)) {
                                if (u1l0Var instanceof r1l0) {
                                    f = 60.0f;
                                } else if (u1l0Var instanceof s1l0) {
                                    f = 54.0f;
                                } else if (!(u1l0Var instanceof t1l0)) {
                                    t9f.b();
                                    return;
                                }
                            }
                            f2 = 46.0f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB12, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        }
                        f2 = f;
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB12, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(824225996);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    function9 = function21;
                    function11 = function14;
                    function10 = function19;
                    mm40Var2 = mm40Var9;
                    function12 = function20;
                }
                t9f.b();
                return;
            }
            fetVar2.X();
            mm40Var2 = mm40Var;
            function9 = function7;
            function10 = function8;
            function11 = function5;
            function12 = function1;
            function13 = function6;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
            }
        }
        i3 |= 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function6 = function2;
                if (fetVar2.i(function6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function7 = function3;
            } else {
                function7 = function3;
                if ((i & 196608) == 0) {
                    if (fetVar2.i(function7)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function8 = function4;
            } else {
                function8 = function4;
                if ((i & 1572864) == 0) {
                    if (fetVar2.i(function8)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                jm40Var = jm40.b;
                if (i15 != 0) {
                    mm40Var3 = jm40Var;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i16 != 0) {
                    function14 = null;
                } else {
                    function14 = function5;
                }
                if (i4 != 0) {
                    function15 = null;
                } else {
                    function15 = function1;
                }
                if (i6 != 0) {
                    function6 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                }
                if (i10 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                u1l0Var = zrmVar2.b;
                f2l0Var = zrmVar2.f44861a;
                g3l0Var = zrmVar2.c;
                n3l0Var = zrmVar2.e;
                function17 = function7;
                mm40VarD = o7k0.d(mm40Var3, 1.0f);
                if (n3l0Var != null) {
                    mm40 mm40Var10 = mm40Var3;
                    if (n3l0Var instanceof j3l0) {
                        yjj0VarC = ljcVar;
                    } else {
                        if (n3l0Var instanceof l3l0) {
                            yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                        } else {
                            function18 = function16;
                            if (n3l0Var instanceof k3l0) {
                                yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                            } else if (n3l0Var instanceof m3l0) {
                                yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                            }
                        }
                        mm40 mm40VarJ13 = lgb.J(mm40VarD, yjj0VarC);
                        tj30 tj30VarC13 = zq8.c(gqw0.f11754a, false);
                        int iHashCode115 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM115 = fetVar2.m();
                        mm40 mm40VarC114 = kbc.c0(fetVar2, mm40VarJ13);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        z2 = fetVar2.S;
                        pcyVar = e7z.u1;
                        if (z2) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        shd shdVar11119 = gqw0.x;
                        jpm0.o(fetVar2, tj30VarC13, shdVar11119);
                        shd shdVar111110 = gqw0.w;
                        jpm0.o(fetVar2, bh90VarM115, shdVar111110);
                        Integer numValueOf13 = Integer.valueOf(iHashCode115);
                        shd shdVar111111 = gqw0.y;
                        jpm0.o(fetVar2, numValueOf13, shdVar111111);
                        jpm0.n(fetVar2);
                        shd shdVar111112 = gqw0.v;
                        jpm0.o(fetVar2, mm40VarC114, shdVar111112);
                        mm40 mm40VarQ13 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                        if (function14 == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if ((i3 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objP = fetVar2.P();
                        cl5 cl5Var13 = ukd.f35823a;
                        if (z4) {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        } else {
                            objP = new unl(function15, (byte) 24);
                            fetVar2.o0(objP);
                        }
                        Function0 function211110 = (Function0) objP;
                        if ((i3 & 896) == 256) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        objP2 = fetVar2.P();
                        if (z5) {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new unl(function14, (byte) 25);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarZ13 = y860.Z(mm40VarQ13, null, z3, function211110, (Function0) objP2, 440);
                        zcl zclVar13 = qmk.f28987a;
                        i12 = i3;
                        mm40 mm40VarL13 = s5x0.L(mm40VarZ13, 4.0f, 0.0f, 2);
                        thg0 thg0VarA13 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                        int iHashCode116 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM116 = fetVar2.m();
                        mm40 mm40VarC115 = kbc.c0(fetVar2, mm40VarL13);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA13, shdVar11119);
                        jpm0.o(fetVar2, bh90VarM116, shdVar111110);
                        vqd.u(iHashCode116, fetVar2, shdVar111111, fetVar2);
                        jpm0.o(fetVar2, mm40VarC115, shdVar111112);
                        if (u1l0Var != null) {
                            fetVar2.e0(-1355915336);
                            g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                            i13 = 0;
                            fetVar2.r(false);
                        } else {
                            i13 = 0;
                            fetVar2.e0(-1355670808);
                            fetVar2.r(false);
                        }
                        h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                        if (g3l0Var != null) {
                            fetVar2.e0(-1355381578);
                            int i11111 = i12 >> 9;
                            i14 = (i11111 & 7168) | (i11111 & 896) | 6;
                            if (g3l0Var instanceof v2l0) {
                                fetVar2.e0(1632507618);
                                l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                z6 = false;
                                if (g3l0Var instanceof w2l0) {
                                    fetVar2.e0(1632702267);
                                    w2l0 w2l0Var13 = (w2l0) g3l0Var;
                                    l8x.i(w2l0Var13.b, 384, w2l0Var13.f38455a, fetVar2, jm40Var);
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof d3l0) {
                                        fetVar2.e0(1632986661);
                                        d3l0 d3l0Var13 = (d3l0) g3l0Var;
                                        l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var13.f5408a, d3l0Var13.b);
                                        jm40Var2 = jm40Var;
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (g3l0Var instanceof q2l0) {
                                            fetVar2.e0(1633358816);
                                            q2l0 q2l0Var13 = (q2l0) g3l0Var;
                                            l8x.a(jm40Var2, q2l0Var13.f28005a, q2l0Var13.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                            function23 = function17;
                                            z6 = false;
                                            fetVar2.r(false);
                                        } else {
                                            if (g3l0Var instanceof r2l0) {
                                                fetVar2.e0(1633673497);
                                                l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                                function22 = function17;
                                                z9 = false;
                                                fetVar2.r(false);
                                                function19 = function18;
                                            } else {
                                                function22 = function17;
                                                if (g3l0Var instanceof b3l0) {
                                                    fetVar2.e0(1633933897);
                                                    Function1 function211111 = function18;
                                                    l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function211111, fetVar2, 6 | ((i14 >> 3) & 896));
                                                    function19 = function211111;
                                                    z9 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function19 = function18;
                                                    if (g3l0Var instanceof x2l0) {
                                                        fetVar2.e0(1634194483);
                                                        x2l0 x2l0Var13 = (x2l0) g3l0Var;
                                                        function23 = function22;
                                                        l8x.j(jm40Var2, x2l0Var13.f40173a, x2l0Var13.b, x2l0Var13.c, x2l0Var13.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function23 = function22;
                                                        if (g3l0Var instanceof a3l0) {
                                                            fetVar2.e0(1634665528);
                                                            a3l0 a3l0Var13 = (a3l0) g3l0Var;
                                                            l8x.m(jm40Var2, a3l0Var13.f178a, a3l0Var13.b, a3l0Var13.c, a3l0Var13.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            if (g3l0Var instanceof y2l0) {
                                                                fetVar2.e0(1635210508);
                                                                y2l0 y2l0Var13 = (y2l0) g3l0Var;
                                                                function20 = function15;
                                                                l8x.k(jm40Var2, y2l0Var13.f41910a, y2l0Var13.b, y2l0Var13.c, y2l0Var13.d, y2l0Var13.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                                function23 = function23;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function20 = function15;
                                                                if (g3l0Var instanceof e3l0) {
                                                                    fetVar2.e0(1635875055);
                                                                    e3l0 e3l0Var13 = (e3l0) g3l0Var;
                                                                    l8x.N(jm40Var2, e3l0Var13.d, e3l0Var13.b, e3l0Var13.f7143a, e3l0Var13.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                    function21 = function23;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function23;
                                                                    if (g3l0Var instanceof z2l0) {
                                                                        fetVar2.e0(1636326663);
                                                                        z2l0 z2l0Var13 = (z2l0) g3l0Var;
                                                                        l8x.l(z2l0Var13.f43675a, z2l0Var13.b, z2l0Var13.c, jm40Var2, fetVar, 3072);
                                                                        jm40Var2 = jm40Var2;
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof c3l0) {
                                                                        fetVar2.e0(1636711032);
                                                                        c3l0 c3l0Var13 = (c3l0) g3l0Var;
                                                                        l8x.q(jm40Var2, c3l0Var13.f3682a, c3l0Var13.b, c3l0Var13.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                        function21 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof s2l0) {
                                                                        fetVar2.e0(1637227988);
                                                                        s2l0 s2l0Var13 = (s2l0) g3l0Var;
                                                                        l8x.g(s2l0Var13.b, mpe.f22175a, s2l0Var13.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                        fetVar2 = fetVar;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                        jm40Var2 = jm40Var2;
                                                                    } else if (g3l0Var instanceof u2l0) {
                                                                        fetVar2.e0(1637646643);
                                                                        u2l0 u2l0Var13 = (u2l0) g3l0Var;
                                                                        jm40Var2 = jm40Var2;
                                                                        l8x.f(jm40Var2, u2l0Var13.e, u2l0Var13.f34951a, u2l0Var13.b, u2l0Var13.c, u2l0Var13.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                        function23 = function21;
                                                                        fetVar2 = fetVar2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else if (g3l0Var instanceof t2l0) {
                                                                        fetVar2.e0(1638245966);
                                                                        t2l0 t2l0Var13 = (t2l0) g3l0Var;
                                                                        l8x.e(t2l0Var13.d, t2l0Var13.f33222a, t2l0Var13.b, t2l0Var13.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                        jm40Var2 = jm40Var2;
                                                                        function21 = function21;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    } else {
                                                                        function21 = function21;
                                                                        if (g3l0Var instanceof f3l0) {
                                                                            throw b1j.f(52665976, fetVar2, false);
                                                                        }
                                                                        fetVar2.e0(1638774981);
                                                                        f3l0 f3l0Var13 = (f3l0) g3l0Var;
                                                                        boolean z1114 = f3l0Var13.b;
                                                                        boolean z1115 = f3l0Var13.f8869a;
                                                                        int i11112 = (i14 & 896) ^ 384;
                                                                        if (i11112 <= 256) {
                                                                        }
                                                                        objP3 = fetVar2.P();
                                                                        if (z7) {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        } else {
                                                                            objP3 = new uck0(function21, (byte) 8);
                                                                            fetVar2.o0(objP3);
                                                                        }
                                                                        Function0 function211112 = (Function0) objP3;
                                                                        if (i11112 <= 256) {
                                                                        }
                                                                        objP4 = fetVar2.P();
                                                                        if (z8) {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        } else {
                                                                            objP4 = new uck0(function21, (byte) 11);
                                                                            fetVar2.o0(objP4);
                                                                        }
                                                                        l8x.Q(6, fetVar2, jm40Var2, function211112, (Function0) objP4, z1114, z1115);
                                                                        fetVar2 = fetVar2;
                                                                        jm40Var2 = jm40Var2;
                                                                        z6 = false;
                                                                        fetVar2.r(false);
                                                                    }
                                                                }
                                                            }
                                                            function21 = function23;
                                                        }
                                                    }
                                                    function20 = function15;
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function22;
                                            z6 = z9;
                                        }
                                    }
                                    function19 = function18;
                                    function20 = function15;
                                    function21 = function23;
                                }
                                fetVar2.r(z6);
                            }
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.r(z6);
                        } else {
                            function19 = function18;
                            jm40Var2 = jm40Var;
                            function20 = function15;
                            function21 = function17;
                            fetVar2.e0(-1355135128);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        zrmVar2 = zrmVar;
                        if (zrmVar2.f) {
                            fetVar2.e0(823957877);
                            mm40 mm40VarB13 = jr8.f16991a.b(jm40Var2, gqw0.h);
                            if (u1l0Var == null) {
                                f = 12.0f;
                            } else {
                                if (!(u1l0Var instanceof q1l0)) {
                                    if (u1l0Var instanceof r1l0) {
                                        f = 60.0f;
                                    } else if (u1l0Var instanceof s1l0) {
                                        f = 54.0f;
                                    } else if (!(u1l0Var instanceof t1l0)) {
                                        t9f.b();
                                        return;
                                    }
                                }
                                f2 = 46.0f;
                                mbc.o(agi0.f827a, s5x0.N(mm40VarB13, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                                fetVar2.r(false);
                            }
                            f2 = f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB13, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(824225996);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        function9 = function21;
                        function11 = function14;
                        function10 = function19;
                        mm40Var2 = mm40Var10;
                        function12 = function20;
                    }
                    function18 = function16;
                    mm40 mm40VarJ14 = lgb.J(mm40VarD, yjj0VarC);
                    tj30 tj30VarC14 = zq8.c(gqw0.f11754a, false);
                    int iHashCode117 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM117 = fetVar2.m();
                    mm40 mm40VarC116 = kbc.c0(fetVar2, mm40VarJ14);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    z2 = fetVar2.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar111113 = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC14, shdVar111113);
                    shd shdVar111114 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM117, shdVar111114);
                    Integer numValueOf14 = Integer.valueOf(iHashCode117);
                    shd shdVar111115 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf14, shdVar111115);
                    jpm0.n(fetVar2);
                    shd shdVar111116 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC116, shdVar111116);
                    mm40 mm40VarQ14 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                    if (function14 == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP = fetVar2.P();
                    cl5 cl5Var14 = ukd.f35823a;
                    if (z4) {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    } else {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    }
                    Function0 function211113 = (Function0) objP;
                    if ((i3 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z5) {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    } else {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarZ14 = y860.Z(mm40VarQ14, null, z3, function211113, (Function0) objP2, 440);
                    zcl zclVar14 = qmk.f28987a;
                    i12 = i3;
                    mm40 mm40VarL14 = s5x0.L(mm40VarZ14, 4.0f, 0.0f, 2);
                    thg0 thg0VarA14 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode118 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM118 = fetVar2.m();
                    mm40 mm40VarC117 = kbc.c0(fetVar2, mm40VarL14);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA14, shdVar111113);
                    jpm0.o(fetVar2, bh90VarM118, shdVar111114);
                    vqd.u(iHashCode118, fetVar2, shdVar111115, fetVar2);
                    jpm0.o(fetVar2, mm40VarC117, shdVar111116);
                    if (u1l0Var != null) {
                        fetVar2.e0(-1355915336);
                        g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                        i13 = 0;
                        fetVar2.r(false);
                    } else {
                        i13 = 0;
                        fetVar2.e0(-1355670808);
                        fetVar2.r(false);
                    }
                    h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                    if (g3l0Var != null) {
                        fetVar2.e0(-1355381578);
                        int i11113 = i12 >> 9;
                        i14 = (i11113 & 7168) | (i11113 & 896) | 6;
                        if (g3l0Var instanceof v2l0) {
                            fetVar2.e0(1632507618);
                            l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                            z6 = false;
                            fetVar2.r(false);
                        } else {
                            z6 = false;
                            if (g3l0Var instanceof w2l0) {
                                fetVar2.e0(1632702267);
                                w2l0 w2l0Var14 = (w2l0) g3l0Var;
                                l8x.i(w2l0Var14.b, 384, w2l0Var14.f38455a, fetVar2, jm40Var);
                                fetVar2.r(false);
                            } else {
                                if (g3l0Var instanceof d3l0) {
                                    fetVar2.e0(1632986661);
                                    d3l0 d3l0Var14 = (d3l0) g3l0Var;
                                    l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var14.f5408a, d3l0Var14.b);
                                    jm40Var2 = jm40Var;
                                    function23 = function17;
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (g3l0Var instanceof q2l0) {
                                        fetVar2.e0(1633358816);
                                        q2l0 q2l0Var14 = (q2l0) g3l0Var;
                                        l8x.a(jm40Var2, q2l0Var14.f28005a, q2l0Var14.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof r2l0) {
                                            fetVar2.e0(1633673497);
                                            l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                            function22 = function17;
                                            z9 = false;
                                            fetVar2.r(false);
                                            function19 = function18;
                                        } else {
                                            function22 = function17;
                                            if (g3l0Var instanceof b3l0) {
                                                fetVar2.e0(1633933897);
                                                Function1 function211114 = function18;
                                                l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function211114, fetVar2, 6 | ((i14 >> 3) & 896));
                                                function19 = function211114;
                                                z9 = false;
                                                fetVar2.r(false);
                                            } else {
                                                function19 = function18;
                                                if (g3l0Var instanceof x2l0) {
                                                    fetVar2.e0(1634194483);
                                                    x2l0 x2l0Var14 = (x2l0) g3l0Var;
                                                    function23 = function22;
                                                    l8x.j(jm40Var2, x2l0Var14.f40173a, x2l0Var14.b, x2l0Var14.c, x2l0Var14.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                    z6 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function23 = function22;
                                                    if (g3l0Var instanceof a3l0) {
                                                        fetVar2.e0(1634665528);
                                                        a3l0 a3l0Var14 = (a3l0) g3l0Var;
                                                        l8x.m(jm40Var2, a3l0Var14.f178a, a3l0Var14.b, a3l0Var14.c, a3l0Var14.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (g3l0Var instanceof y2l0) {
                                                            fetVar2.e0(1635210508);
                                                            y2l0 y2l0Var14 = (y2l0) g3l0Var;
                                                            function20 = function15;
                                                            l8x.k(jm40Var2, y2l0Var14.f41910a, y2l0Var14.b, y2l0Var14.c, y2l0Var14.d, y2l0Var14.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                            function23 = function23;
                                                            fetVar2 = fetVar2;
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function20 = function15;
                                                            if (g3l0Var instanceof e3l0) {
                                                                fetVar2.e0(1635875055);
                                                                e3l0 e3l0Var14 = (e3l0) g3l0Var;
                                                                l8x.N(jm40Var2, e3l0Var14.d, e3l0Var14.b, e3l0Var14.f7143a, e3l0Var14.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                function21 = function23;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function21 = function23;
                                                                if (g3l0Var instanceof z2l0) {
                                                                    fetVar2.e0(1636326663);
                                                                    z2l0 z2l0Var14 = (z2l0) g3l0Var;
                                                                    l8x.l(z2l0Var14.f43675a, z2l0Var14.b, z2l0Var14.c, jm40Var2, fetVar, 3072);
                                                                    jm40Var2 = jm40Var2;
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof c3l0) {
                                                                    fetVar2.e0(1636711032);
                                                                    c3l0 c3l0Var14 = (c3l0) g3l0Var;
                                                                    l8x.q(jm40Var2, c3l0Var14.f3682a, c3l0Var14.b, c3l0Var14.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                    function21 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof s2l0) {
                                                                    fetVar2.e0(1637227988);
                                                                    s2l0 s2l0Var14 = (s2l0) g3l0Var;
                                                                    l8x.g(s2l0Var14.b, mpe.f22175a, s2l0Var14.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                    jm40Var2 = jm40Var2;
                                                                } else if (g3l0Var instanceof u2l0) {
                                                                    fetVar2.e0(1637646643);
                                                                    u2l0 u2l0Var14 = (u2l0) g3l0Var;
                                                                    jm40Var2 = jm40Var2;
                                                                    l8x.f(jm40Var2, u2l0Var14.e, u2l0Var14.f34951a, u2l0Var14.b, u2l0Var14.c, u2l0Var14.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                    function23 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof t2l0) {
                                                                    fetVar2.e0(1638245966);
                                                                    t2l0 t2l0Var14 = (t2l0) g3l0Var;
                                                                    l8x.e(t2l0Var14.d, t2l0Var14.f33222a, t2l0Var14.b, t2l0Var14.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                    jm40Var2 = jm40Var2;
                                                                    function21 = function21;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function21;
                                                                    if (g3l0Var instanceof f3l0) {
                                                                        throw b1j.f(52665976, fetVar2, false);
                                                                    }
                                                                    fetVar2.e0(1638774981);
                                                                    f3l0 f3l0Var14 = (f3l0) g3l0Var;
                                                                    boolean z1116 = f3l0Var14.b;
                                                                    boolean z1117 = f3l0Var14.f8869a;
                                                                    int i11114 = (i14 & 896) ^ 384;
                                                                    if (i11114 <= 256) {
                                                                    }
                                                                    objP3 = fetVar2.P();
                                                                    if (z7) {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    } else {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    }
                                                                    Function0 function211115 = (Function0) objP3;
                                                                    if (i11114 <= 256) {
                                                                    }
                                                                    objP4 = fetVar2.P();
                                                                    if (z8) {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    } else {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    }
                                                                    l8x.Q(6, fetVar2, jm40Var2, function211115, (Function0) objP4, z1116, z1117);
                                                                    fetVar2 = fetVar2;
                                                                    jm40Var2 = jm40Var2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                }
                                                            }
                                                        }
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function23;
                                            }
                                        }
                                        function20 = function15;
                                        function21 = function22;
                                        z6 = z9;
                                    }
                                }
                                function19 = function18;
                                function20 = function15;
                                function21 = function23;
                            }
                            fetVar2.r(z6);
                        }
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.r(z6);
                    } else {
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.e0(-1355135128);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    zrmVar2 = zrmVar;
                    if (zrmVar2.f) {
                        fetVar2.e0(823957877);
                        mm40 mm40VarB14 = jr8.f16991a.b(jm40Var2, gqw0.h);
                        if (u1l0Var == null) {
                            f = 12.0f;
                        } else {
                            if (!(u1l0Var instanceof q1l0)) {
                                if (u1l0Var instanceof r1l0) {
                                    f = 60.0f;
                                } else if (u1l0Var instanceof s1l0) {
                                    f = 54.0f;
                                } else if (!(u1l0Var instanceof t1l0)) {
                                    t9f.b();
                                    return;
                                }
                            }
                            f2 = 46.0f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB14, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        }
                        f2 = f;
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB14, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(824225996);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    function9 = function21;
                    function11 = function14;
                    function10 = function19;
                    mm40Var2 = mm40Var10;
                    function12 = function20;
                }
                t9f.b();
                return;
            }
            fetVar2.X();
            mm40Var2 = mm40Var;
            function9 = function7;
            function10 = function8;
            function11 = function5;
            function12 = function1;
            function13 = function6;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
            }
        }
        i3 |= 24576;
        function6 = function2;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            function7 = function3;
        } else {
            function7 = function3;
            if ((i & 196608) == 0) {
                if (fetVar2.i(function7)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
            function8 = function4;
        } else {
            function8 = function4;
            if ((i & 1572864) == 0) {
                if (fetVar2.i(function8)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            jm40Var = jm40.b;
            if (i15 != 0) {
                mm40Var3 = jm40Var;
            } else {
                mm40Var3 = mm40Var;
            }
            if (i16 != 0) {
                function14 = null;
            } else {
                function14 = function5;
            }
            if (i4 != 0) {
                function15 = null;
            } else {
                function15 = function1;
            }
            if (i6 != 0) {
                function6 = null;
            }
            if (i8 != 0) {
                function7 = null;
            }
            if (i10 != 0) {
                function16 = null;
            } else {
                function16 = function8;
            }
            u1l0Var = zrmVar2.b;
            f2l0Var = zrmVar2.f44861a;
            g3l0Var = zrmVar2.c;
            n3l0Var = zrmVar2.e;
            function17 = function7;
            mm40VarD = o7k0.d(mm40Var3, 1.0f);
            if (n3l0Var != null) {
                mm40 mm40Var11 = mm40Var3;
                if (n3l0Var instanceof j3l0) {
                    yjj0VarC = ljcVar;
                } else {
                    if (n3l0Var instanceof l3l0) {
                        yjj0VarC = vgg0.a(((l3l0) n3l0Var).f19362a);
                    } else {
                        function18 = function16;
                        if (n3l0Var instanceof k3l0) {
                            yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                        } else if (n3l0Var instanceof m3l0) {
                            yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                        }
                    }
                    mm40 mm40VarJ15 = lgb.J(mm40VarD, yjj0VarC);
                    tj30 tj30VarC15 = zq8.c(gqw0.f11754a, false);
                    int iHashCode119 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM119 = fetVar2.m();
                    mm40 mm40VarC118 = kbc.c0(fetVar2, mm40VarJ15);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    z2 = fetVar2.S;
                    pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar111117 = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC15, shdVar111117);
                    shd shdVar111118 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM119, shdVar111118);
                    Integer numValueOf15 = Integer.valueOf(iHashCode119);
                    shd shdVar111119 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf15, shdVar111119);
                    jpm0.n(fetVar2);
                    shd shdVar1111110 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC118, shdVar1111110);
                    mm40 mm40VarQ15 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                    if (function14 == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objP = fetVar2.P();
                    cl5 cl5Var15 = ukd.f35823a;
                    if (z4) {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    } else {
                        objP = new unl(function15, (byte) 24);
                        fetVar2.o0(objP);
                    }
                    Function0 function211116 = (Function0) objP;
                    if ((i3 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z5) {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    } else {
                        objP2 = new unl(function14, (byte) 25);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarZ15 = y860.Z(mm40VarQ15, null, z3, function211116, (Function0) objP2, 440);
                    zcl zclVar15 = qmk.f28987a;
                    i12 = i3;
                    mm40 mm40VarL15 = s5x0.L(mm40VarZ15, 4.0f, 0.0f, 2);
                    thg0 thg0VarA15 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode1110 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM1110 = fetVar2.m();
                    mm40 mm40VarC119 = kbc.c0(fetVar2, mm40VarL15);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA15, shdVar111117);
                    jpm0.o(fetVar2, bh90VarM1110, shdVar111118);
                    vqd.u(iHashCode1110, fetVar2, shdVar111119, fetVar2);
                    jpm0.o(fetVar2, mm40VarC119, shdVar1111110);
                    if (u1l0Var != null) {
                        fetVar2.e0(-1355915336);
                        g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                        i13 = 0;
                        fetVar2.r(false);
                    } else {
                        i13 = 0;
                        fetVar2.e0(-1355670808);
                        fetVar2.r(false);
                    }
                    h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                    if (g3l0Var != null) {
                        fetVar2.e0(-1355381578);
                        int i11115 = i12 >> 9;
                        i14 = (i11115 & 7168) | (i11115 & 896) | 6;
                        if (g3l0Var instanceof v2l0) {
                            fetVar2.e0(1632507618);
                            l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                            z6 = false;
                            fetVar2.r(false);
                        } else {
                            z6 = false;
                            if (g3l0Var instanceof w2l0) {
                                fetVar2.e0(1632702267);
                                w2l0 w2l0Var15 = (w2l0) g3l0Var;
                                l8x.i(w2l0Var15.b, 384, w2l0Var15.f38455a, fetVar2, jm40Var);
                                fetVar2.r(false);
                            } else {
                                if (g3l0Var instanceof d3l0) {
                                    fetVar2.e0(1632986661);
                                    d3l0 d3l0Var15 = (d3l0) g3l0Var;
                                    l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var15.f5408a, d3l0Var15.b);
                                    jm40Var2 = jm40Var;
                                    function23 = function17;
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (g3l0Var instanceof q2l0) {
                                        fetVar2.e0(1633358816);
                                        q2l0 q2l0Var15 = (q2l0) g3l0Var;
                                        l8x.a(jm40Var2, q2l0Var15.f28005a, q2l0Var15.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                        function23 = function17;
                                        z6 = false;
                                        fetVar2.r(false);
                                    } else {
                                        if (g3l0Var instanceof r2l0) {
                                            fetVar2.e0(1633673497);
                                            l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                            function22 = function17;
                                            z9 = false;
                                            fetVar2.r(false);
                                            function19 = function18;
                                        } else {
                                            function22 = function17;
                                            if (g3l0Var instanceof b3l0) {
                                                fetVar2.e0(1633933897);
                                                Function1 function211117 = function18;
                                                l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function211117, fetVar2, 6 | ((i14 >> 3) & 896));
                                                function19 = function211117;
                                                z9 = false;
                                                fetVar2.r(false);
                                            } else {
                                                function19 = function18;
                                                if (g3l0Var instanceof x2l0) {
                                                    fetVar2.e0(1634194483);
                                                    x2l0 x2l0Var15 = (x2l0) g3l0Var;
                                                    function23 = function22;
                                                    l8x.j(jm40Var2, x2l0Var15.f40173a, x2l0Var15.b, x2l0Var15.c, x2l0Var15.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                    z6 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    function23 = function22;
                                                    if (g3l0Var instanceof a3l0) {
                                                        fetVar2.e0(1634665528);
                                                        a3l0 a3l0Var15 = (a3l0) g3l0Var;
                                                        l8x.m(jm40Var2, a3l0Var15.f178a, a3l0Var15.b, a3l0Var15.c, a3l0Var15.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        if (g3l0Var instanceof y2l0) {
                                                            fetVar2.e0(1635210508);
                                                            y2l0 y2l0Var15 = (y2l0) g3l0Var;
                                                            function20 = function15;
                                                            l8x.k(jm40Var2, y2l0Var15.f41910a, y2l0Var15.b, y2l0Var15.c, y2l0Var15.d, y2l0Var15.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                            function23 = function23;
                                                            fetVar2 = fetVar2;
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function20 = function15;
                                                            if (g3l0Var instanceof e3l0) {
                                                                fetVar2.e0(1635875055);
                                                                e3l0 e3l0Var15 = (e3l0) g3l0Var;
                                                                l8x.N(jm40Var2, e3l0Var15.d, e3l0Var15.b, e3l0Var15.f7143a, e3l0Var15.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                                function21 = function23;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function21 = function23;
                                                                if (g3l0Var instanceof z2l0) {
                                                                    fetVar2.e0(1636326663);
                                                                    z2l0 z2l0Var15 = (z2l0) g3l0Var;
                                                                    l8x.l(z2l0Var15.f43675a, z2l0Var15.b, z2l0Var15.c, jm40Var2, fetVar, 3072);
                                                                    jm40Var2 = jm40Var2;
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof c3l0) {
                                                                    fetVar2.e0(1636711032);
                                                                    c3l0 c3l0Var15 = (c3l0) g3l0Var;
                                                                    l8x.q(jm40Var2, c3l0Var15.f3682a, c3l0Var15.b, c3l0Var15.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                    function21 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof s2l0) {
                                                                    fetVar2.e0(1637227988);
                                                                    s2l0 s2l0Var15 = (s2l0) g3l0Var;
                                                                    l8x.g(s2l0Var15.b, mpe.f22175a, s2l0Var15.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                    fetVar2 = fetVar;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                    jm40Var2 = jm40Var2;
                                                                } else if (g3l0Var instanceof u2l0) {
                                                                    fetVar2.e0(1637646643);
                                                                    u2l0 u2l0Var15 = (u2l0) g3l0Var;
                                                                    jm40Var2 = jm40Var2;
                                                                    l8x.f(jm40Var2, u2l0Var15.e, u2l0Var15.f34951a, u2l0Var15.b, u2l0Var15.c, u2l0Var15.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                    function23 = function21;
                                                                    fetVar2 = fetVar2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else if (g3l0Var instanceof t2l0) {
                                                                    fetVar2.e0(1638245966);
                                                                    t2l0 t2l0Var15 = (t2l0) g3l0Var;
                                                                    l8x.e(t2l0Var15.d, t2l0Var15.f33222a, t2l0Var15.b, t2l0Var15.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                    jm40Var2 = jm40Var2;
                                                                    function21 = function21;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                } else {
                                                                    function21 = function21;
                                                                    if (g3l0Var instanceof f3l0) {
                                                                        throw b1j.f(52665976, fetVar2, false);
                                                                    }
                                                                    fetVar2.e0(1638774981);
                                                                    f3l0 f3l0Var15 = (f3l0) g3l0Var;
                                                                    boolean z1118 = f3l0Var15.b;
                                                                    boolean z1119 = f3l0Var15.f8869a;
                                                                    int i11116 = (i14 & 896) ^ 384;
                                                                    if (i11116 <= 256) {
                                                                    }
                                                                    objP3 = fetVar2.P();
                                                                    if (z7) {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    } else {
                                                                        objP3 = new uck0(function21, (byte) 8);
                                                                        fetVar2.o0(objP3);
                                                                    }
                                                                    Function0 function211118 = (Function0) objP3;
                                                                    if (i11116 <= 256) {
                                                                    }
                                                                    objP4 = fetVar2.P();
                                                                    if (z8) {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    } else {
                                                                        objP4 = new uck0(function21, (byte) 11);
                                                                        fetVar2.o0(objP4);
                                                                    }
                                                                    l8x.Q(6, fetVar2, jm40Var2, function211118, (Function0) objP4, z1118, z1119);
                                                                    fetVar2 = fetVar2;
                                                                    jm40Var2 = jm40Var2;
                                                                    z6 = false;
                                                                    fetVar2.r(false);
                                                                }
                                                            }
                                                        }
                                                        function21 = function23;
                                                    }
                                                }
                                                function20 = function15;
                                                function21 = function23;
                                            }
                                        }
                                        function20 = function15;
                                        function21 = function22;
                                        z6 = z9;
                                    }
                                }
                                function19 = function18;
                                function20 = function15;
                                function21 = function23;
                            }
                            fetVar2.r(z6);
                        }
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.r(z6);
                    } else {
                        function19 = function18;
                        jm40Var2 = jm40Var;
                        function20 = function15;
                        function21 = function17;
                        fetVar2.e0(-1355135128);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    zrmVar2 = zrmVar;
                    if (zrmVar2.f) {
                        fetVar2.e0(823957877);
                        mm40 mm40VarB15 = jr8.f16991a.b(jm40Var2, gqw0.h);
                        if (u1l0Var == null) {
                            f = 12.0f;
                        } else {
                            if (!(u1l0Var instanceof q1l0)) {
                                if (u1l0Var instanceof r1l0) {
                                    f = 60.0f;
                                } else if (u1l0Var instanceof s1l0) {
                                    f = 54.0f;
                                } else if (!(u1l0Var instanceof t1l0)) {
                                    t9f.b();
                                    return;
                                }
                            }
                            f2 = 46.0f;
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB15, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                            fetVar2.r(false);
                        }
                        f2 = f;
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB15, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(824225996);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    function9 = function21;
                    function11 = function14;
                    function10 = function19;
                    mm40Var2 = mm40Var11;
                    function12 = function20;
                }
                function18 = function16;
                mm40 mm40VarJ16 = lgb.J(mm40VarD, yjj0VarC);
                tj30 tj30VarC16 = zq8.c(gqw0.f11754a, false);
                int iHashCode1111 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM1111 = fetVar2.m();
                mm40 mm40VarC1110 = kbc.c0(fetVar2, mm40VarJ16);
                mkd.c0.getClass();
                fetVar2.i0();
                z2 = fetVar2.S;
                pcyVar = e7z.u1;
                if (z2) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shd shdVar1111111 = gqw0.x;
                jpm0.o(fetVar2, tj30VarC16, shdVar1111111);
                shd shdVar1111112 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM1111, shdVar1111112);
                Integer numValueOf16 = Integer.valueOf(iHashCode1111);
                shd shdVar1111113 = gqw0.y;
                jpm0.o(fetVar2, numValueOf16, shdVar1111113);
                jpm0.n(fetVar2);
                shd shdVar1111114 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC1110, shdVar1111114);
                mm40 mm40VarQ16 = i120.Q(o2e.e0(jm40Var, "SPORTS_CELL_TAG"), ibc.Y(zrmVar2.d, fetVar2), ljcVar);
                if (function14 == null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP = fetVar2.P();
                cl5 cl5Var16 = ukd.f35823a;
                if (z4) {
                    objP = new unl(function15, (byte) 24);
                    fetVar2.o0(objP);
                } else {
                    objP = new unl(function15, (byte) 24);
                    fetVar2.o0(objP);
                }
                Function0 function211119 = (Function0) objP;
                if ((i3 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP2 = fetVar2.P();
                if (z5) {
                    objP2 = new unl(function14, (byte) 25);
                    fetVar2.o0(objP2);
                } else {
                    objP2 = new unl(function14, (byte) 25);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarZ16 = y860.Z(mm40VarQ16, null, z3, function211119, (Function0) objP2, 440);
                zcl zclVar16 = qmk.f28987a;
                i12 = i3;
                mm40 mm40VarL16 = s5x0.L(mm40VarZ16, 4.0f, 0.0f, 2);
                thg0 thg0VarA16 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode1112 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM1112 = fetVar2.m();
                mm40 mm40VarC1111 = kbc.c0(fetVar2, mm40VarL16);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA16, shdVar1111111);
                jpm0.o(fetVar2, bh90VarM1112, shdVar1111112);
                vqd.u(iHashCode1112, fetVar2, shdVar1111113, fetVar2);
                jpm0.o(fetVar2, mm40VarC1111, shdVar1111114);
                if (u1l0Var != null) {
                    fetVar2.e0(-1355915336);
                    g8x.r(o2e.e0(jm40Var, "SPORT_CELL_LEFT"), u1l0Var, function6, fetVar2, ((i12 >> 6) & 896) | 6);
                    i13 = 0;
                    fetVar2.r(false);
                } else {
                    i13 = 0;
                    fetVar2.e0(-1355670808);
                    fetVar2.r(false);
                }
                h8x.n(f2l0Var, hne.i(1.0f, true, "SPORT_CELL_MIDDLE"), fetVar2, i13);
                if (g3l0Var != null) {
                    fetVar2.e0(-1355381578);
                    int i11117 = i12 >> 9;
                    i14 = (i11117 & 7168) | (i11117 & 896) | 6;
                    if (g3l0Var instanceof v2l0) {
                        fetVar2.e0(1632507618);
                        l8x.h(48, ((v2l0) g3l0Var).f36690a, fetVar2, jm40Var);
                        z6 = false;
                        fetVar2.r(false);
                    } else {
                        z6 = false;
                        if (g3l0Var instanceof w2l0) {
                            fetVar2.e0(1632702267);
                            w2l0 w2l0Var16 = (w2l0) g3l0Var;
                            l8x.i(w2l0Var16.b, 384, w2l0Var16.f38455a, fetVar2, jm40Var);
                            fetVar2.r(false);
                        } else {
                            if (g3l0Var instanceof d3l0) {
                                fetVar2.e0(1632986661);
                                d3l0 d3l0Var16 = (d3l0) g3l0Var;
                                l8x.y(6 | ((i14 << 6) & 57344), fetVar2, jm40Var, function17, d3l0Var16.f5408a, d3l0Var16.b);
                                jm40Var2 = jm40Var;
                                function23 = function17;
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                jm40Var2 = jm40Var;
                                if (g3l0Var instanceof q2l0) {
                                    fetVar2.e0(1633358816);
                                    q2l0 q2l0Var16 = (q2l0) g3l0Var;
                                    l8x.a(jm40Var2, q2l0Var16.f28005a, q2l0Var16.b, function17, fetVar2, 6 | ((i14 << 3) & 7168));
                                    function23 = function17;
                                    z6 = false;
                                    fetVar2.r(false);
                                } else {
                                    if (g3l0Var instanceof r2l0) {
                                        fetVar2.e0(1633673497);
                                        l8x.b(jm40Var2, ((r2l0) g3l0Var).f29741a, function17, fetVar2, i14 & 910, 0);
                                        function22 = function17;
                                        z9 = false;
                                        fetVar2.r(false);
                                        function19 = function18;
                                    } else {
                                        function22 = function17;
                                        if (g3l0Var instanceof b3l0) {
                                            fetVar2.e0(1633933897);
                                            Function1 function2111110 = function18;
                                            l8x.p(jm40Var2, ((b3l0) g3l0Var).f1913a, function2111110, fetVar2, 6 | ((i14 >> 3) & 896));
                                            function19 = function2111110;
                                            z9 = false;
                                            fetVar2.r(false);
                                        } else {
                                            function19 = function18;
                                            if (g3l0Var instanceof x2l0) {
                                                fetVar2.e0(1634194483);
                                                x2l0 x2l0Var16 = (x2l0) g3l0Var;
                                                function23 = function22;
                                                l8x.j(jm40Var2, x2l0Var16.f40173a, x2l0Var16.b, x2l0Var16.c, x2l0Var16.d, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                z6 = false;
                                                fetVar2.r(false);
                                            } else {
                                                function23 = function22;
                                                if (g3l0Var instanceof a3l0) {
                                                    fetVar2.e0(1634665528);
                                                    a3l0 a3l0Var16 = (a3l0) g3l0Var;
                                                    l8x.m(jm40Var2, a3l0Var16.f178a, a3l0Var16.b, a3l0Var16.c, a3l0Var16.d, function23, fetVar2, 6 | ((i14 << 12) & 3670016));
                                                    z6 = false;
                                                    fetVar2.r(false);
                                                } else {
                                                    if (g3l0Var instanceof y2l0) {
                                                        fetVar2.e0(1635210508);
                                                        y2l0 y2l0Var16 = (y2l0) g3l0Var;
                                                        function20 = function15;
                                                        l8x.k(jm40Var2, y2l0Var16.f41910a, y2l0Var16.b, y2l0Var16.c, y2l0Var16.d, y2l0Var16.e, function23, fetVar2, 6 | ((i14 << 18) & 234881024));
                                                        function23 = function23;
                                                        fetVar2 = fetVar2;
                                                        z6 = false;
                                                        fetVar2.r(false);
                                                    } else {
                                                        function20 = function15;
                                                        if (g3l0Var instanceof e3l0) {
                                                            fetVar2.e0(1635875055);
                                                            e3l0 e3l0Var16 = (e3l0) g3l0Var;
                                                            l8x.N(jm40Var2, e3l0Var16.d, e3l0Var16.b, e3l0Var16.f7143a, e3l0Var16.c, function23, fetVar2, 6 | ((i14 << 9) & 458752));
                                                            function21 = function23;
                                                            z6 = false;
                                                            fetVar2.r(false);
                                                        } else {
                                                            function21 = function23;
                                                            if (g3l0Var instanceof z2l0) {
                                                                fetVar2.e0(1636326663);
                                                                z2l0 z2l0Var16 = (z2l0) g3l0Var;
                                                                l8x.l(z2l0Var16.f43675a, z2l0Var16.b, z2l0Var16.c, jm40Var2, fetVar, 3072);
                                                                jm40Var2 = jm40Var2;
                                                                fetVar2 = fetVar;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else if (g3l0Var instanceof c3l0) {
                                                                fetVar2.e0(1636711032);
                                                                c3l0 c3l0Var16 = (c3l0) g3l0Var;
                                                                l8x.q(jm40Var2, c3l0Var16.f3682a, c3l0Var16.b, c3l0Var16.c, function19, function21, fetVar2, 6 | (458752 & (i14 << 6)) | ((i14 << 12) & 3670016));
                                                                function21 = function21;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else if (g3l0Var instanceof s2l0) {
                                                                fetVar2.e0(1637227988);
                                                                s2l0 s2l0Var16 = (s2l0) g3l0Var;
                                                                l8x.g(s2l0Var16.b, mpe.f22175a, s2l0Var16.f31507a, s5x0.L(jm40Var2, 8.0f, 0.0f, 2), fetVar, 0, 0);
                                                                fetVar2 = fetVar;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                                jm40Var2 = jm40Var2;
                                                            } else if (g3l0Var instanceof u2l0) {
                                                                fetVar2.e0(1637646643);
                                                                u2l0 u2l0Var16 = (u2l0) g3l0Var;
                                                                jm40Var2 = jm40Var2;
                                                                l8x.f(jm40Var2, u2l0Var16.e, u2l0Var16.f34951a, u2l0Var16.b, u2l0Var16.c, u2l0Var16.d, function21, fetVar2, 6 | ((i14 << 15) & 29360128));
                                                                function23 = function21;
                                                                fetVar2 = fetVar2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else if (g3l0Var instanceof t2l0) {
                                                                fetVar2.e0(1638245966);
                                                                t2l0 t2l0Var16 = (t2l0) g3l0Var;
                                                                l8x.e(t2l0Var16.d, t2l0Var16.f33222a, t2l0Var16.b, t2l0Var16.c, jm40Var2, function21, fetVar2, 196608 | ((i14 << 12) & 3670016));
                                                                jm40Var2 = jm40Var2;
                                                                function21 = function21;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            } else {
                                                                function21 = function21;
                                                                if (g3l0Var instanceof f3l0) {
                                                                    throw b1j.f(52665976, fetVar2, false);
                                                                }
                                                                fetVar2.e0(1638774981);
                                                                f3l0 f3l0Var16 = (f3l0) g3l0Var;
                                                                boolean z11110 = f3l0Var16.b;
                                                                boolean z11111 = f3l0Var16.f8869a;
                                                                int i11118 = (i14 & 896) ^ 384;
                                                                if (i11118 <= 256) {
                                                                }
                                                                objP3 = fetVar2.P();
                                                                if (z7) {
                                                                    objP3 = new uck0(function21, (byte) 8);
                                                                    fetVar2.o0(objP3);
                                                                } else {
                                                                    objP3 = new uck0(function21, (byte) 8);
                                                                    fetVar2.o0(objP3);
                                                                }
                                                                Function0 function2111111 = (Function0) objP3;
                                                                if (i11118 <= 256) {
                                                                }
                                                                objP4 = fetVar2.P();
                                                                if (z8) {
                                                                    objP4 = new uck0(function21, (byte) 11);
                                                                    fetVar2.o0(objP4);
                                                                } else {
                                                                    objP4 = new uck0(function21, (byte) 11);
                                                                    fetVar2.o0(objP4);
                                                                }
                                                                l8x.Q(6, fetVar2, jm40Var2, function2111111, (Function0) objP4, z11110, z11111);
                                                                fetVar2 = fetVar2;
                                                                jm40Var2 = jm40Var2;
                                                                z6 = false;
                                                                fetVar2.r(false);
                                                            }
                                                        }
                                                    }
                                                    function21 = function23;
                                                }
                                            }
                                            function20 = function15;
                                            function21 = function23;
                                        }
                                    }
                                    function20 = function15;
                                    function21 = function22;
                                    z6 = z9;
                                }
                            }
                            function19 = function18;
                            function20 = function15;
                            function21 = function23;
                        }
                        fetVar2.r(z6);
                    }
                    function19 = function18;
                    jm40Var2 = jm40Var;
                    function20 = function15;
                    function21 = function17;
                    fetVar2.r(z6);
                } else {
                    function19 = function18;
                    jm40Var2 = jm40Var;
                    function20 = function15;
                    function21 = function17;
                    fetVar2.e0(-1355135128);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                zrmVar2 = zrmVar;
                if (zrmVar2.f) {
                    fetVar2.e0(823957877);
                    mm40 mm40VarB16 = jr8.f16991a.b(jm40Var2, gqw0.h);
                    if (u1l0Var == null) {
                        f = 12.0f;
                    } else {
                        if (!(u1l0Var instanceof q1l0)) {
                            if (u1l0Var instanceof r1l0) {
                                f = 60.0f;
                            } else if (u1l0Var instanceof s1l0) {
                                f = 54.0f;
                            } else if (!(u1l0Var instanceof t1l0)) {
                                t9f.b();
                                return;
                            }
                        }
                        f2 = 46.0f;
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB16, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    }
                    f2 = f;
                    mbc.o(agi0.f827a, s5x0.N(mm40VarB16, f2, 0.0f, 0.0f, 0.0f, 14), false, fetVar2, 6, 4);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(824225996);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                function9 = function21;
                function11 = function14;
                function10 = function19;
                mm40Var2 = mm40Var11;
                function12 = function20;
            }
            t9f.b();
            return;
        }
        fetVar2.X();
        mm40Var2 = mm40Var;
        function9 = function7;
        function10 = function8;
        function11 = function5;
        function12 = function1;
        function13 = function6;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pol(mm40Var2, zrmVar2, function11, function12, function13, function9, function10, i, i2);
        }
    }

    public static final void s(mm40 mm40Var, boolean z, sxm sxmVar, fet fetVar, int i) {
        if (sxmVar instanceof nxm) {
            fetVar.e0(2043390888);
            vfc.p(mm40Var, z, (nxm) sxmVar, fetVar, i & 1022);
            fetVar.r(false);
            return;
        }
        if (sxmVar instanceof oxm) {
            fetVar.e0(2043623636);
            hic.n(mm40Var, (oxm) sxmVar, z, fetVar, ((i << 3) & 896) | (i & 14) | ((i >> 3) & 112));
            fetVar.r(false);
            return;
        }
        if (sxmVar instanceof pxm) {
            fetVar.e0(2043865684);
            vic.h(mm40Var, (pxm) sxmVar, z, fetVar, ((i << 3) & 896) | (i & 14) | ((i >> 3) & 112));
            fetVar.r(false);
            return;
        }
        if (sxmVar instanceof qxm) {
            fetVar.e0(2044107732);
            plc.l(mm40Var, (qxm) sxmVar, z, fetVar, ((i << 3) & 896) | (i & 14) | ((i >> 3) & 112));
            fetVar.r(false);
            return;
        }
        if (!(sxmVar instanceof rxm)) {
            throw b1j.f(-1042464713, fetVar, false);
        }
        fetVar.e0(2044349780);
        lmc.p(mm40Var, (rxm) sxmVar, z, fetVar, ((i << 3) & 896) | (i & 14) | ((i >> 3) & 112));
        fetVar.r(false);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:44:0x006e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void t(mm40 mm40Var, k4n k4nVar, boolean z, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Function1 function3;
        int i5;
        int i6;
        Function1 function4;
        int i7;
        boolean z3;
        boolean z4;
        Function1 function5;
        Function1 function6;
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        Function1 function7;
        Function1 function8;
        k4nVar.getClass();
        fetVar.g0(-725253077);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(k4nVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function3 = function1;
                    if (fetVar.i(function3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function2;
                        if (fetVar.i(function4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (fetVar.U(i3 & 1, z3)) {
                        if (i8 != 0) {
                            mm40Var = jm40.b;
                        }
                        if (i9 != 0) {
                            z2 = false;
                        }
                        if (i4 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (k4nVar instanceof d4n) {
                            fetVar.e0(-1183494800);
                            d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                            fetVar.r(false);
                        } else {
                            if (k4nVar instanceof j4n) {
                                throw b1j.f(-1183496507, fetVar, false);
                            }
                            fetVar.e0(-1183487027);
                            e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                            fetVar.r(false);
                        }
                        z4 = z2;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        fetVar.X();
                        z4 = z2;
                        function5 = function3;
                        function6 = function4;
                    }
                    mm40Var2 = mm40Var;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
                    }
                }
                i3 |= 24576;
                function4 = function2;
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    if (i8 != 0) {
                        mm40Var = jm40.b;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (k4nVar instanceof d4n) {
                        fetVar.e0(-1183494800);
                        d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                        fetVar.r(false);
                    } else {
                        if (k4nVar instanceof j4n) {
                            throw b1j.f(-1183496507, fetVar, false);
                        }
                        fetVar.e0(-1183487027);
                        e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                        fetVar.r(false);
                    }
                    z4 = z2;
                    function5 = function7;
                    function6 = function8;
                } else {
                    fetVar.X();
                    z4 = z2;
                    function5 = function3;
                    function6 = function4;
                }
                mm40Var2 = mm40Var;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
                }
            }
            i3 |= 3072;
            function3 = function1;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    if (i8 != 0) {
                        mm40Var = jm40.b;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (k4nVar instanceof d4n) {
                        fetVar.e0(-1183494800);
                        d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                        fetVar.r(false);
                    } else {
                        if (k4nVar instanceof j4n) {
                            throw b1j.f(-1183496507, fetVar, false);
                        }
                        fetVar.e0(-1183487027);
                        e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                        fetVar.r(false);
                    }
                    z4 = z2;
                    function5 = function7;
                    function6 = function8;
                } else {
                    fetVar.X();
                    z4 = z2;
                    function5 = function3;
                    function6 = function4;
                }
                mm40Var2 = mm40Var;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
                }
            }
            i3 |= 24576;
            function4 = function2;
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var = jm40.b;
                }
                if (i9 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (k4nVar instanceof d4n) {
                    fetVar.e0(-1183494800);
                    d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                    fetVar.r(false);
                } else {
                    if (k4nVar instanceof j4n) {
                        throw b1j.f(-1183496507, fetVar, false);
                    }
                    fetVar.e0(-1183487027);
                    e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                    fetVar.r(false);
                }
                z4 = z2;
                function5 = function7;
                function6 = function8;
            } else {
                fetVar.X();
                z4 = z2;
                function5 = function3;
                function6 = function4;
            }
            mm40Var2 = mm40Var;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function3 = function1;
                if (fetVar.i(function3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (fetVar.i(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    if (i8 != 0) {
                        mm40Var = jm40.b;
                    }
                    if (i9 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (k4nVar instanceof d4n) {
                        fetVar.e0(-1183494800);
                        d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                        fetVar.r(false);
                    } else {
                        if (k4nVar instanceof j4n) {
                            throw b1j.f(-1183496507, fetVar, false);
                        }
                        fetVar.e0(-1183487027);
                        e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                        fetVar.r(false);
                    }
                    z4 = z2;
                    function5 = function7;
                    function6 = function8;
                } else {
                    fetVar.X();
                    z4 = z2;
                    function5 = function3;
                    function6 = function4;
                }
                mm40Var2 = mm40Var;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
                }
            }
            i3 |= 24576;
            function4 = function2;
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var = jm40.b;
                }
                if (i9 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (k4nVar instanceof d4n) {
                    fetVar.e0(-1183494800);
                    d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                    fetVar.r(false);
                } else {
                    if (k4nVar instanceof j4n) {
                        throw b1j.f(-1183496507, fetVar, false);
                    }
                    fetVar.e0(-1183487027);
                    e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                    fetVar.r(false);
                }
                z4 = z2;
                function5 = function7;
                function6 = function8;
            } else {
                fetVar.X();
                z4 = z2;
                function5 = function3;
                function6 = function4;
            }
            mm40Var2 = mm40Var;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
            }
        }
        i3 |= 3072;
        function3 = function1;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function4 = function2;
                if (fetVar.i(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var = jm40.b;
                }
                if (i9 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (k4nVar instanceof d4n) {
                    fetVar.e0(-1183494800);
                    d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                    fetVar.r(false);
                } else {
                    if (k4nVar instanceof j4n) {
                        throw b1j.f(-1183496507, fetVar, false);
                    }
                    fetVar.e0(-1183487027);
                    e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                    fetVar.r(false);
                }
                z4 = z2;
                function5 = function7;
                function6 = function8;
            } else {
                fetVar.X();
                z4 = z2;
                function5 = function3;
                function6 = function4;
            }
            mm40Var2 = mm40Var;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
            }
        }
        i3 |= 24576;
        function4 = function2;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            if (i8 != 0) {
                mm40Var = jm40.b;
            }
            if (i9 != 0) {
                z2 = false;
            }
            if (i4 != 0) {
                function7 = null;
            } else {
                function7 = function3;
            }
            if (i6 != 0) {
                function8 = null;
            } else {
                function8 = function4;
            }
            if (k4nVar instanceof d4n) {
                fetVar.e0(-1183494800);
                d9x.B(mm40Var, (d4n) k4nVar, z2, function7, function8, fetVar, i3 & 65534);
                fetVar.r(false);
            } else {
                if (k4nVar instanceof j4n) {
                    throw b1j.f(-1183496507, fetVar, false);
                }
                fetVar.e0(-1183487027);
                e9x.E(mm40Var, (j4n) k4nVar, fetVar, i3 & 126);
                fetVar.r(false);
            }
            z4 = z2;
            function5 = function7;
            function6 = function8;
        } else {
            fetVar.X();
            z4 = z2;
            function5 = function3;
            function6 = function4;
        }
        mm40Var2 = mm40Var;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x3n(mm40Var2, k4nVar, z4, function5, function6, i, i2);
        }
    }

    public static final void u(jeh0 jeh0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1417803196);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jeh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = b6o.f2065a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) jeh0Var, (byte) 17);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new f4m((byte) 29);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, jeh0Var, xdrVar, null, function1, (Function2) objP3, fetVar, 196992 | ((i2 << 3) & 112), 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(jeh0Var, i, (byte) 20);
        }
    }

    public static final void v(w0p w0pVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(209636127);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(w0pVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), "FATAL_FURY_TABLE_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            fetVar.e0(-1805689581);
            Iterator<E> it = w0pVar.f38361a.iterator();
            while (it.hasNext()) {
                hic.q((u0p) it.next(), w0pVar.b, fetVar, 8);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(w0pVar, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(l7m0 l7m0Var, final Function1 function1, fet fetVar, int i) {
        long textPrimary;
        final byte b;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(833862473);
        int i2 = 32;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        final byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            u9q u9qVar = (u9q) l7m0Var.getValue();
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            fetVar.e0(1324299458);
            int i4 = 0;
            for (Object obj : u9qVar.f35296a) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                final njx njxVar = (njx) obj;
                wui0 wui0Var = wui0.c;
                String str = njxVar.b;
                boolean z = njxVar.c;
                if (z) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    textPrimary = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    textPrimary = s6t0.b().f33626a.getTextPrimary();
                }
                rqm rqmVar = new rqm((vui0) new tui0(str, new y3d(textPrimary)), (pui0) null, (pvi0) new nvi0(z), (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442);
                byte b3 = i4 != q3d.i(u9qVar.f35296a) ? (byte) 1 : b2;
                int i6 = i3 & 112;
                int i7 = (i6 == i2 ? (byte) 1 : b2) | (fetVar.g(njxVar) ? 1 : 0);
                Object objP = fetVar.P();
                Object obj2 = ukd.f35823a;
                Object obj3 = objP;
                if (i7 != 0 || objP == obj2) {
                    Object obj4 = new Function0() { // from class: a.y9q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            njx njxVar2 = njxVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new r9q(njxVar2));
                                    break;
                                default:
                                    function2.invoke(new r9q(njxVar2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(obj4);
                    obj3 = obj4;
                }
                Function0 function0 = (Function0) obj3;
                int i8 = (i6 == i2 ? (byte) 1 : b2) | (fetVar.g(njxVar) ? 1 : 0);
                Object objP2 = fetVar.P();
                if (i8 != 0 || objP2 == obj2) {
                    b = 1;
                    objP2 = new Function0() { // from class: a.y9q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b;
                            njx njxVar2 = njxVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new r9q(njxVar2));
                                    break;
                                default:
                                    function2.invoke(new r9q(njxVar2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                } else {
                    b = 1;
                }
                obc.q(null, rqmVar, b3, null, function0, null, (Function0) objP2, null, fetVar, 0, 169);
                b2 = b2;
                i4 = i5;
                u9qVar = u9qVar;
                i2 = 32;
            }
            fetVar.r(b2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 14);
        }
    }

    public static final void x(pls plsVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        plsVar.getClass();
        b610 b610Var = plsVar.f27200a;
        fetVar2.g0(856611473);
        int i2 = i | (fetVar2.g(plsVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 1.0f), 32.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA);
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
            b610 b610Var2 = plsVar.b;
            String str = b610Var.b;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.f1;
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), str, R.drawable.ic_glyph_circle_globe, jM130getWhite600d7_KjU, pgeVar, fetVar2, 196608, 0);
            v8q0.a(b610Var.f2032a, o2e.e0(s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), "GAME_LOG_HEADER_FIRST_TEAM"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            H(kkg.f18437a, fetVar, 48);
            fetVar.r(true);
            qxw.o(fetVar, o7k0.s(jm40Var, 28.0f));
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            H(kkg.b, fetVar, 48);
            v8q0.a(b610Var2.f2032a, o2e.e0(s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), "GAME_LOG_HEADER_SECOND_TEAM"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), b610Var2.b, R.drawable.ic_glyph_circle_globe, staticColors.m130getWhite600d7_KjU(), pgeVar, fetVar2, 196608, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cls(plsVar, i);
        }
    }

    public static final void y(mm40 mm40Var, w2d w2dVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        w2dVar.getClass();
        fetVar.g0(-96331395);
        int i2 = i | 6 | (fetVar.i(w2dVar) ? 32 : 16);
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                fetVar.o0(ugdVar2);
                objP = ugdVar2;
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                fetVar.o0(ugdVar);
                objP2 = ugdVar;
            }
            Function2 function3 = (Function2) objP2;
            if ((i2 & 112) != 32 && !fetVar.i(w2dVar)) {
                z = false;
            }
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new hpr(function2, function3, w2dVar, (byte) 12);
                fetVar.o0(objP3);
            }
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP3, fetVar, 6, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 6, i, (Object) mm40Var2, (Object) w2dVar, (Object) ugdVar, (Object) ugdVar2);
        }
    }

    public static final void z(mm40 mm40Var, osw oswVar, fet fetVar, int i) {
        oswVar.getClass();
        fetVar.g0(415717850);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(oswVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            kr00.a(u1c.M(1214146135, new msw(mm40Var, oswVar, b), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new msw(mm40Var, oswVar, i);
        }
    }
}
