package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.text.SpannableStringBuilder;
import android.view.Window;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.SocialStateModel;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class idx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile yk50 f14607a;
    public static volatile ok50 b;

    public static final vma A(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, ctf0 ctf0Var, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        ctf0Var.getClass();
        eel0 eel0Var = x1x.E(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f9413a;
        if (eel0Var instanceof ael0) {
            str = ((ael0) eel0Var).f735a;
        } else {
            if (!(eel0Var instanceof cel0)) {
                t9f.b();
                return null;
            }
            str = ((cel0) eel0Var).b;
        }
        c4i c4iVar = new c4i(zjb.y(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), eel0Var instanceof cel0 ? new y3d(y3d.g) : null, 32);
        b4i b4iVar = new b4i(thb.A(l2g0Var, ctf0Var), 2);
        x3i x3iVar = new x3i(gtj.f11884a);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new vma(c4iVar, b4iVar, x3iVar, s3iVar);
    }

    public static final wma B(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        eel0 eel0Var = x1x.E(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f9413a;
        if (eel0Var instanceof ael0) {
            str = ((ael0) eel0Var).f735a;
        } else {
            if (!(eel0Var instanceof cel0)) {
                t9f.b();
                return null;
            }
            str = ((cel0) eel0Var).b;
        }
        c4i c4iVar = new c4i(zjb.y(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), eel0Var instanceof cel0 ? new y3d(y3d.g) : null, 32);
        x3i x3iVar = new x3i(gtj.f11884a);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new wma(c4iVar, x3iVar, s3iVar, 2);
    }

    public static final xma C(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        eel0 eel0Var = x1x.E(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f9413a;
        if (eel0Var instanceof ael0) {
            str = ((ael0) eel0Var).f735a;
        } else {
            if (!(eel0Var instanceof cel0)) {
                t9f.b();
                return null;
            }
            str = ((cel0) eel0Var).b;
        }
        c4i c4iVar = new c4i(zjb.y(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), eel0Var instanceof cel0 ? new y3d(y3d.g) : null, 32);
        x3i x3iVar = new x3i(gtj.f11884a);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new xma(c4iVar, x3iVar, s3iVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public static final s4m D(String str, int i, long j) {
        d4d d4dVar = d4d.STATIC_WHITE60;
        w6n w6nVar = w6n.k;
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new s4m(new r2m(axq.g(), new u6n(d4dVar, w6nVar, new c280(str, R.drawable.ic_glyph_circle_globe)), null, null), new o2m(new m0x(i, null, 6), 0, StaticColors.INSTANCE.m121getTransparent0d7_KjU()), j);
    }

    public static final boolean E(y3h y3hVar) {
        y3hVar.getClass();
        ArrayList arrayListK = K(y3hVar.c);
        ArrayList arrayListK2 = K(y3hVar.g);
        return arrayListK.isEmpty() || arrayListK2.isEmpty() || CollectionsKt.q0(arrayListK, arrayListK2).size() != 10;
    }

    public static final boolean F(o310 o310Var) {
        return o310Var.q.isEmpty() || o310Var.l == zz00.e;
    }

    public static final boolean G(o310 o310Var) {
        List list = o310Var.f.i;
        List list2 = o310Var.g.i;
        if (list.size() != list2.size() || list.isEmpty() || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((a010) it.next()).b != 0) {
                if (list.isEmpty()) {
                    return true;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((a010) it2.next()).f4a != 0) {
                        if (list2.isEmpty() || list2.isEmpty()) {
                            return true;
                        }
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (((a010) it3.next()).b != 0) {
                                if (list2.isEmpty()) {
                                    return true;
                                }
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    if (((a010) it4.next()).f4a != 0) {
                                        return o310Var.l == zz00.e;
                                    }
                                }
                                return true;
                            }
                        }
                        return true;
                    }
                }
                return true;
            }
        }
        return true;
    }

    public static final boolean H(o310 o310Var) {
        List list = o310Var.p;
        List list2 = o310Var.o;
        d310 d310Var = d310.RADIANT;
        d310 d310Var2 = o310Var.f.g;
        List list3 = d310Var2 == d310Var ? list2 : list;
        if (d310Var2 == d310.DIRE) {
            list = list2;
        }
        return (list3.isEmpty() && list.isEmpty()) || o310Var.l == zz00.e;
    }

    public static final boolean I(o310 o310Var) {
        List list = o310Var.j;
        if (list.size() != 10 || o310Var.l == zz00.e) {
            return true;
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((r010) it.next()).c.length() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:19:0x0038->B:33:?, LOOP_END, SYNTHETIC] */
    public static final boolean J(o310 o310Var) {
        List list;
        Iterator it;
        o310Var.getClass();
        zz00 zz00Var = o310Var.l;
        List list2 = o310Var.h;
        if (list2 != null && list2.isEmpty()) {
            list = o310Var.i;
            if (list == null) {
            }
            it = list.iterator();
            while (it.hasNext()) {
                if (((r010) it.next()).f29606a == 0) {
                }
            }
            return true;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                list = o310Var.i;
                if (list == null && list.isEmpty()) {
                    return true;
                }
                it = list.iterator();
                while (it.hasNext()) {
                    if (((r010) it.next()).f29606a == 0) {
                    }
                }
                return true;
            }
            if (((r010) it2.next()).f29606a == 0) {
            }
        }
        return zz00Var == zz00.e;
    }

    public static final ArrayList K(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c4h c4hVar = (c4h) it.next();
            if (c4hVar.b.length() == 0) {
                c4hVar = new c4h("", "", "", "", 0.0f, 0.0f, 0.0f, 0, 0, iun.f15405a);
            }
            arrayList.add(c4hVar);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L(o2i0 o2i0Var, long j, Function1 function1) {
        qh60 qh60Var = new qh60(j);
        ph60 ph60Var = ph60.f26982a;
        zys0.e(3, ph60Var);
        m2i0 m2i0Var = new m2i0(o2i0Var, qh60Var, ph60Var, tv9.f, p2i0.e, (bnn0) function1, null);
        int i = o2i0.g;
        o2i0Var.h(m2i0Var, false);
    }

    public static final Object M(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static mm40 N(mm40 mm40Var, boolean z, d9d0 d9d0Var, boolean z2, Function0 function0) {
        return mm40Var.e(new w8d0(z, function0, z2, d9d0Var, v8d0.c));
    }

    public static final d9d0 O(fet fetVar) {
        Object[] objArr = new Object[0];
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new cbc0((byte) 20);
            fetVar.o0(objP);
        }
        return (d9d0) e9x.R(objArr, d9d0.b, (Function0) objP, fetVar, 384);
    }

    public static final pfk0 P(xcz xczVar, xdr xdrVar, fet fetVar, int i, int i2) {
        xczVar.getClass();
        sjj sjjVarA = wzk0.a(fetVar);
        nul0 nul0Var = qfk0.f28639a;
        jak0 jak0Var = ny9.n;
        if ((i2 & 16) != 0) {
            xdrVar = qfk0.b;
        }
        int i3 = (i & 14) | ((i >> 6) & 112);
        boolean z = true;
        boolean z2 = ((((i3 & 112) ^ 48) > 32 && fetVar.g(jak0Var)) || (i3 & 48) == 32) | ((((i3 & 14) ^ 6) > 4 && fetVar.g(xczVar)) || (i3 & 6) == 4);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (z2 || objP == obj) {
            objP = new tcz(xczVar, jak0Var);
            fetVar.o0(objP);
        }
        tcz tczVar = (tcz) objP;
        int i4 = (i & 112) | 8 | (i & 896) | ((i >> 3) & 7168);
        tczVar.getClass();
        xdrVar.getClass();
        boolean zG = fetVar.g(tczVar) | ((((i4 & 112) ^ 48) > 32 && fetVar.g(sjjVarA)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && fetVar.g(nul0Var)) || (i4 & 384) == 256);
        if ((((i4 & 7168) ^ 3072) <= 2048 || !fetVar.g(xdrVar)) && (i4 & 3072) != 2048) {
            z = false;
        }
        boolean z3 = zG | z;
        Object objP2 = fetVar.P();
        if (z3 || objP2 == obj) {
            objP2 = new pfk0(tczVar, sjjVarA, nul0Var, xdrVar);
            fetVar.o0(objP2);
        }
        return (pfk0) objP2;
    }

    public static final p1f0 Q(vzg0 vzg0Var) {
        String str = (String) vzg0Var.a("ADDRESS");
        String str2 = str == null ? "" : str;
        Boolean bool = (Boolean) vzg0Var.a("AGE_CONFIRMATION_CHECKBOX");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        BonusStateModel bonusStateModel = (BonusStateModel) vzg0Var.a("BONUS");
        CityStateModel cityStateModel = (CityStateModel) vzg0Var.a("CITY");
        Boolean bool2 = (Boolean) vzg0Var.a("COMMERCIAL_COMMUNICATION_CHECKBOX");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        CountryStateModel countryStateModel = (CountryStateModel) vzg0Var.a("COUNTRY");
        CurrencyStateModel currencyStateModel = (CurrencyStateModel) vzg0Var.a("CURRENCY");
        Long l = (Long) vzg0Var.a("DATE");
        DocumentStateModel documentStateModel = (DocumentStateModel) vzg0Var.a("DOCUMENT_TYPE");
        String str3 = (String) vzg0Var.a(CommonConstant.RETKEY.EMAIL);
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) vzg0Var.a("FIRST_NAME");
        String str6 = str5 == null ? "" : str5;
        String str7 = (String) vzg0Var.a("LAST_NAME");
        String str8 = str7 == null ? "" : str7;
        String str9 = (String) vzg0Var.a("MIDDLE_NAME");
        String str10 = str9 == null ? "" : str9;
        CitizenshipStateModel citizenshipStateModel = (CitizenshipStateModel) vzg0Var.a("CITIZENSHIP");
        String str11 = (String) vzg0Var.a("PASSPORT_NUMBER");
        String str12 = str11 == null ? "" : str11;
        String str13 = (String) vzg0Var.a("PASSWORD");
        String str14 = str13 == null ? "" : str13;
        PhoneStateModel phoneStateModel = (PhoneStateModel) vzg0Var.a("PHONE");
        Boolean bool3 = (Boolean) vzg0Var.a("POLITICALLY_EXPOSED_PERSON");
        String str15 = (String) vzg0Var.a("POST_CODE");
        String str16 = str15 == null ? "" : str15;
        String str17 = (String) vzg0Var.a("PROMO_CODE");
        RegionStateModel regionStateModel = (RegionStateModel) vzg0Var.a("REGION");
        String str18 = (String) vzg0Var.a("REPEAT_PASSWORD");
        String str19 = str18 == null ? "" : str18;
        Boolean bool4 = (Boolean) vzg0Var.a("RULES_CONFIRMATION");
        boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = (Boolean) vzg0Var.a("RULES_CONFIRMATION_ALL");
        boolean zBooleanValue4 = bool5 != null ? bool5.booleanValue() : false;
        String str20 = (String) vzg0Var.a("SECOND_LAST_NAME");
        String str21 = str20 == null ? "" : str20;
        Boolean bool6 = (Boolean) vzg0Var.a("EMAIL_BETS_CHECKBOX");
        boolean zBooleanValue5 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = (Boolean) vzg0Var.a("EMAIL_NEWS_CHECKBOX");
        boolean zBooleanValue6 = bool7 != null ? bool7.booleanValue() : false;
        Boolean bool8 = (Boolean) vzg0Var.a("SHARE_PERSONAL_DATA_CONFIRMATION");
        boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
        Integer num = (Integer) vzg0Var.a("SOCIAL_TYPE_SELECTED");
        SocialStateModel socialStateModel = (SocialStateModel) vzg0Var.a("SOCIAL");
        Boolean bool9 = (Boolean) vzg0Var.a("PASSWORD_REQUIREMENTS_EXPANDED");
        boolean zBooleanValue8 = bool9 != null ? bool9.booleanValue() : false;
        Integer num2 = (Integer) vzg0Var.a(CommonConstant.RETKEY.GENDER);
        Boolean bool10 = (Boolean) vzg0Var.a("HAS_BONUSES");
        boolean zBooleanValue9 = bool10 != null ? bool10.booleanValue() : false;
        Long l2 = (Long) vzg0Var.a("PASSPORT_DATE_ISSUE");
        Long l3 = (Long) vzg0Var.a("PASSPORT_DATE_EXPIRE");
        Boolean bool11 = (Boolean) vzg0Var.a("NOTIFY_NEWS_CALL_SETTINGS");
        boolean zBooleanValue10 = bool11 != null ? bool11.booleanValue() : true;
        Boolean bool12 = (Boolean) vzg0Var.a("SOCIAL_BLOCK_EXPAND");
        boolean zBooleanValue11 = bool12 != null ? bool12.booleanValue() : false;
        Boolean bool13 = (Boolean) vzg0Var.a("SEND_SMS_EVENTS");
        return new p1f0(str2, zBooleanValue, bonusStateModel, cityStateModel, zBooleanValue2, zBooleanValue10, countryStateModel, currencyStateModel, l, documentStateModel, str4, str6, str8, str10, citizenshipStateModel, str12, str14, phoneStateModel, bool3, str16, str17, regionStateModel, str19, zBooleanValue3, zBooleanValue4, str21, zBooleanValue5, zBooleanValue6, zBooleanValue7, num, socialStateModel, num2, zBooleanValue8, zBooleanValue9, l3, l2, zBooleanValue11, bool13 != null ? bool13.booleanValue() : false, (q7f0) vzg0Var.a("REGISTRATION_TYPE"));
    }

    public static final void R(DsCellMiddleTitle dsCellMiddleTitle, Context context, g140 g140Var) {
        context.getClass();
        Drawable drawable = context.getDrawable(g140Var.g);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.space_14);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Separators.SP);
        if (drawable != null) {
            spannableStringBuilder.setSpan(new abb(drawable), 0, 1, 17);
        }
        spannableStringBuilder.append((CharSequence) Separators.SP);
        spannableStringBuilder.append((CharSequence) g140Var.f);
        dsCellMiddleTitle.setSubtitle(spannableStringBuilder);
    }

    public static final gmq S(Function2 function2) {
        return ulb.D(new vsg0(new kyh(function2, null, (byte) 5)), -2);
    }

    public static final gy30 T(nw30 nw30Var) {
        if (nw30Var instanceof pv30) {
            return ((pv30) nw30Var).b;
        }
        boolean z = nw30Var instanceof ew30;
        ey30 ey30Var = ey30.f8608a;
        miz kizVar = liz.f20129a;
        if (z) {
            ew30 ew30Var = (ew30) nw30Var;
            ux30 ux30Var = new ux30(10, 0L, ew30Var.e, ew30Var.f);
            int i = ew30Var.d;
            m0x m0xVar = new m0x(i, null, 6);
            if (ew30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var, new rx30(m0xVar, 0L, kizVar, i, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof mw30) {
            mw30 mw30Var = (mw30) nw30Var;
            ux30 ux30Var2 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
            int i2 = mw30Var.d;
            m0x m0xVar2 = new m0x(i2, null, 6);
            if (mw30Var.f22484a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var2, new rx30(m0xVar2, 0L, kizVar, i2, 0L, null, 498), new by30(mw30Var.g), 0L, null, null, 248);
        }
        if (nw30Var instanceof fw30) {
            fw30 fw30Var = (fw30) nw30Var;
            ux30 ux30Var3 = new ux30(10, 0L, fw30Var.h, "");
            pz40 pz40Var = s6t0.f31722a;
            qc5 qc5Var = new qc5(null, new n0x(fw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
            n0x n0xVar = new n0x(fw30Var.e);
            if (fw30Var.f10240a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var3, new rx30(n0xVar, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var, 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof iw30) {
            iw30 iw30Var = (iw30) nw30Var;
            ux30 ux30Var4 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
            int i3 = iw30Var.d;
            m0x m0xVar3 = new m0x(i3, null, 6);
            if (iw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            rx30 rx30Var = new rx30(m0xVar3, 0L, kizVar, i3, 0L, null, 498);
            rpe rpeVar = new rpe(iw30Var.g);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            return new gy30(ux30Var4, rx30Var, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), 0L, null, null, 248);
        }
        if (nw30Var instanceof qv30) {
            qv30 qv30Var = (qv30) nw30Var;
            ux30 ux30Var5 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
            int i4 = qv30Var.d;
            m0x m0xVar4 = new m0x(i4, null, 6);
            if (qv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var5, new rx30(m0xVar4, 0L, kizVar, i4, 0L, null, 498), new zx30(new n0x(qv30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof jw30) {
            jw30 jw30Var = (jw30) nw30Var;
            ux30 ux30Var6 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
            int i5 = jw30Var.d;
            m0x m0xVar5 = new m0x(i5, null, 6);
            if (jw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var6, new rx30(m0xVar5, 0L, kizVar, i5, 0L, null, 498), new zx30(new n0x(jw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof dw30) {
            dw30 dw30Var = (dw30) nw30Var;
            ux30 ux30Var7 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
            int i6 = dw30Var.d;
            m0x m0xVar6 = new m0x(i6, null, 6);
            if (dw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var7, new rx30(m0xVar6, 0L, kizVar, i6, 0L, null, 498), new zx30(new n0x(dw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof uv30) {
            uv30 uv30Var = (uv30) nw30Var;
            ux30 ux30Var8 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
            int i7 = uv30Var.d;
            m0x m0xVar7 = new m0x(i7, null, 6);
            if (uv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var8, new rx30(m0xVar7, 0L, kizVar, i7, 0L, null, 498), new zx30(new m0x(uv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof ov30) {
            ov30 ov30Var = (ov30) nw30Var;
            ux30 ux30Var9 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
            pc5 pc5Var = new pc5(new y3d(ov30Var.f));
            long j = ov30Var.e;
            long j2 = ov30Var.h;
            int i8 = ov30Var.g;
            n0x n0xVar2 = new n0x(ov30Var.d);
            if (ov30Var.f25907a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var9, new rx30(n0xVar2, j, kizVar, i8, j2, pc5Var, Response.UNSUPPORTED_URI_SCHEME), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof rv30) {
            rv30 rv30Var = (rv30) nw30Var;
            List list = rv30Var.k;
            String str = rv30Var.h;
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            ux30 ux30Var10 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str, rv30Var.i);
            pc5 pc5Var2 = new pc5(new y3d(rv30Var.g));
            int i9 = rv30Var.e;
            long j3 = rv30Var.f;
            m0x m0xVar8 = new m0x(i9, null, 6);
            if (rv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var10, new rx30(m0xVar8, j3, kizVar, i9, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list, null, 216);
        }
        if (nw30Var instanceof sv30) {
            sv30 sv30Var = (sv30) nw30Var;
            long j4 = sv30Var.j;
            String str2 = sv30Var.g;
            pz40 pz40Var4 = s6t0.f31722a;
            StaticColors staticColors3 = StaticColors.INSTANCE;
            ux30 ux30Var11 = new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str2, sv30Var.h);
            int i10 = sv30Var.d;
            m0x m0xVar9 = new m0x(i10, null, 6);
            pc5 pc5Var3 = new pc5(new y3d(sv30Var.f));
            if (sv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var11, new rx30(m0xVar9, 0L, kizVar, i10, 0L, pc5Var3, 434), new zx30(new m0x(sv30Var.i, null, 6), 3), j4, null, null, 240);
        }
        if (nw30Var instanceof nv30) {
            nv30 nv30Var = (nv30) nw30Var;
            boolean z2 = nv30Var.g;
            String str3 = nv30Var.e;
            wx30 vx30Var = z2 ? new vx30(str3, nv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6)) : new ux30(10, 0L, str3, nv30Var.f);
            int i11 = nv30Var.d;
            m0x m0xVar10 = new m0x(i11, null, 6);
            if (nv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(vx30Var, new rx30(m0xVar10, 0L, kizVar, i11, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof tv30) {
            tv30 tv30Var = (tv30) nw30Var;
            long j5 = tv30Var.i;
            String str4 = tv30Var.f;
            pz40 pz40Var5 = s6t0.f31722a;
            StaticColors staticColors4 = StaticColors.INSTANCE;
            ux30 ux30Var12 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str4, tv30Var.g);
            int i12 = tv30Var.c;
            long j6 = tv30Var.d;
            pc5 pc5Var4 = new pc5(new y3d(tv30Var.e));
            m0x m0xVar11 = new m0x(tv30Var.c, null, 6);
            if (tv30Var.f34580a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var12, new rx30(m0xVar11, j6, kizVar, i12, 0L, pc5Var4, 432), new zx30(new m0x(tv30Var.h, null, 6), 3), j5, null, null, 240);
        }
        if (nw30Var instanceof lw30) {
            lw30 lw30Var = (lw30) nw30Var;
            ux30 ux30Var13 = new ux30(14, 0L, lw30Var.g, (String) null);
            n0x n0xVar3 = new n0x(lw30Var.f);
            if (lw30Var.f20744a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var13, new rx30(n0xVar3, 0L, kizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof vv30) {
            vv30 vv30Var = (vv30) nw30Var;
            boolean z3 = vv30Var.g;
            String str5 = vv30Var.e;
            wx30 vx30Var2 = z3 ? new vx30(str5, vv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6)) : new ux30(10, 0L, str5, vv30Var.f);
            int i13 = vv30Var.d;
            m0x m0xVar12 = new m0x(i13, null, 6);
            if (vv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(vx30Var2, new rx30(m0xVar12, 0L, kizVar, i13, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof wv30) {
            wv30 wv30Var = (wv30) nw30Var;
            ux30 ux30Var14 = new ux30(10, 0L, wv30Var.f, wv30Var.g);
            int i14 = wv30Var.e;
            n0x n0xVar4 = new n0x(wv30Var.d);
            if (wv30Var.f39822a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var14, new rx30(n0xVar4, 0L, kizVar, i14, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof xv30) {
            xv30 xv30Var = (xv30) nw30Var;
            List list2 = xv30Var.k;
            String str6 = xv30Var.h;
            pz40 pz40Var6 = s6t0.f31722a;
            StaticColors staticColors5 = StaticColors.INSTANCE;
            ux30 ux30Var15 = new ux30(staticColors5.m123getWhite0d7_KjU(), staticColors5.m131getWhite800d7_KjU(), str6, xv30Var.i);
            pc5 pc5Var5 = new pc5(new y3d(xv30Var.g));
            int i15 = xv30Var.e;
            long j7 = xv30Var.f;
            m0x m0xVar13 = new m0x(i15, null, 6);
            if (xv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var15, new rx30(m0xVar13, j7, kizVar, i15, 0L, pc5Var5, 432), new zx30(new m0x(xv30Var.j, xv30Var.l, 4), 3), 0L, list2, null, 216);
        }
        if (nw30Var instanceof yv30) {
            yv30 yv30Var = (yv30) nw30Var;
            long j8 = yv30Var.j;
            String str7 = yv30Var.g;
            pz40 pz40Var7 = s6t0.f31722a;
            StaticColors staticColors6 = StaticColors.INSTANCE;
            ux30 ux30Var16 = new ux30(staticColors6.m123getWhite0d7_KjU(), staticColors6.m131getWhite800d7_KjU(), str7, yv30Var.h);
            int i16 = yv30Var.d;
            long j9 = yv30Var.e;
            pc5 pc5Var6 = new pc5(new y3d(yv30Var.f));
            m0x m0xVar14 = new m0x(yv30Var.d, null, 6);
            if (yv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var16, new rx30(m0xVar14, j9, kizVar, i16, 0L, pc5Var6, 432), new zx30(new m0x(yv30Var.i, null, 6), 3), j8, null, null, 240);
        }
        if (nw30Var instanceof zv30) {
            zv30 zv30Var = (zv30) nw30Var;
            ux30 ux30Var17 = new ux30(10, 0L, zv30Var.e, zv30Var.f);
            int i17 = zv30Var.d;
            m0x m0xVar15 = new m0x(i17, null, 6);
            if (zv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var17, new rx30(m0xVar15, 0L, kizVar, i17, 0L, null, 498), new zx30(new m0x(zv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof aw30) {
            aw30 aw30Var = (aw30) nw30Var;
            ux30 ux30Var18 = new ux30(10, 0L, aw30Var.e, aw30Var.f);
            int i18 = aw30Var.d;
            m0x m0xVar16 = new m0x(i18, null, 6);
            if (aw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var18, new rx30(m0xVar16, 0L, kizVar, i18, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof bw30) {
            bw30 bw30Var = (bw30) nw30Var;
            ux30 ux30Var19 = new ux30(14, 0L, bw30Var.g, (String) null);
            n0x n0xVar5 = new n0x(bw30Var.f);
            if (bw30Var.f3307a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var19, new rx30(n0xVar5, 0L, kizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof cw30) {
            cw30 cw30Var = (cw30) nw30Var;
            ux30 ux30Var20 = new ux30(10, 0L, cw30Var.e, cw30Var.f);
            int i19 = cw30Var.d;
            m0x m0xVar17 = new m0x(i19, null, 6);
            if (cw30Var.f5062a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var20, new rx30(m0xVar17, 0L, kizVar, i19, 0L, null, 498), new by30(cw30Var.g), 0L, null, null, 248);
        }
        if (!(nw30Var instanceof gw30)) {
            ux30 ux30Var21 = new ux30(10, 0L, "", "");
            zcl zclVar = qmk.f28987a;
            m0x m0xVar18 = new m0x(0, null, 6);
            pz40 pz40Var8 = s6t0.f31722a;
            return new gy30(ux30Var21, new qx30(m0xVar18, s6t0.b().f33626a.getPrimary(), kizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
        }
        gw30 gw30Var = (gw30) nw30Var;
        ux30 ux30Var22 = new ux30(10, 0L, gw30Var.h, "");
        pz40 pz40Var9 = s6t0.f31722a;
        qc5 qc5Var2 = new qc5(null, new n0x(gw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
        n0x n0xVar6 = new n0x(gw30Var.e);
        if (gw30Var.f12006a) {
            kizVar = new kiz(new rf5(3, null));
        }
        return new gy30(ux30Var22, new rx30(n0xVar6, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var2, 434), new zx30(new n0x(gw30Var.i), 3), 0L, null, null, 248);
    }

    public static final aea0 U(dea0 dea0Var) {
        dea0Var.getClass();
        Long l = dea0Var.f5940a;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = dea0Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = dea0Var.c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = dea0Var.d;
        String str4 = str3 != null ? str3 : "";
        g9m0 g9m0Var = fks0.b;
        String str5 = dea0Var.e;
        g9m0Var.getClass();
        fks0 fks0VarE = g9m0.e(str5);
        Boolean bool = dea0Var.f;
        return new aea0(jLongValue, str, str2, str4, fks0VarE, bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
    public static final bmb0 V(String str) {
        str.getClass();
        for (bmb0 bmb0Var : bmb0.values()) {
            if (bmb0Var.f2829a.equals(str)) {
                if (bmb0Var == null) {
                    return bmb0.UNKNOWN;
                }
                return bmb0Var;
            }
        }
        bmb0Var = null;
        if (bmb0Var == null) {
            return bmb0.UNKNOWN;
        }
        return bmb0Var;
    }

    public static final dxh0 W(zvh0 zvh0Var) {
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final boolean X(v9d v9dVar, v9d v9dVar2) {
        v9dVar2.getClass();
        return v9dVar2.f(v9dVar) && !v9dVar.c(v9dVar.b.length);
    }

    public static final int Y(mcz mczVar) {
        List list = mczVar.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ncz) list.get(i2)).q;
        }
        return (i / list.size()) + mczVar.s;
    }

    public static final void a(ilq ilqVar, long j, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1353562852);
        byte b2 = 2;
        int i2 = i | (fetVar.g(ilqVar) ? 4 : 2) | (fetVar.f(j) ? 32 : 16);
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj = objP;
            if (objP == cl5Var) {
                w03 w03VarA = z03.a();
                w03VarA.j(1);
                fetVar.o0(w03VarA);
                obj = w03VarA;
            }
            w03 w03Var = (w03) obj;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new p7d0(ilqVar, b3));
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarB = d43.b(((Number) ((l7m0) objP2).getValue()).floatValue(), d7x.P(yt40.c, fetVar), null, null, fetVar, 0, 28);
            fet fetVar3 = fetVar;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP3 = fetVar3.P();
            if (z || objP3 == cl5Var) {
                objP3 = new v6d0(ilqVar, b2);
                fetVar3.o0(objP3);
            }
            AtomicInteger atomicInteger = pai0.f26656a;
            mm40 mm40VarN = o7k0.n(new bpc((Function1) objP3), 16.0f);
            boolean zG = (i3 == 4) | fetVar3.g(l7m0VarB) | ((i2 & 112) == 32) | fetVar3.i(w03Var);
            Object objP4 = fetVar3.P();
            if (zG || objP4 == cl5Var) {
                as0 as0Var = new as0((Object) ilqVar, (Object) l7m0VarB, j, (Object) w03Var, (byte) 10);
                fetVar3.o0(as0Var);
                objP4 = as0Var;
            }
            p8a.k(mm40VarN, (Function1) objP4, fetVar3, 0);
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ub4((byte) 7, i, j, ilqVar);
        }
    }

    public static final void b(mm40 mm40Var, bz6 bz6Var, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        float f;
        bz6 bz6Var2 = bz6Var;
        fet fetVar2 = fetVar;
        int i2 = bz6Var2.b;
        pge pgeVar = gqw0.A;
        fetVar2.g0(-849610954);
        int i3 = i | 6 | (fetVar2.g(bz6Var2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zx7 zx7Var = gqw0.e;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            boolean zBooleanValue = ((Boolean) fetVar2.k(kix.f18358a)).booleanValue();
            jr8 jr8Var = jr8.f16991a;
            if (zBooleanValue) {
                fetVar2.e0(1834946397);
                j0x.b(a8k0.F(i2, 0, fetVar2), null, jr8Var.a(jm40Var2), null, pgeVar, 0.0f, null, fetVar2, 24632, 104);
                fetVar2.r(false);
                jm40Var = jm40Var2;
                f = 1.0f;
            } else {
                fetVar2.e0(1835223785);
                k7x.b(bz6Var2.f3451a, null, jr8Var.a(jm40Var2), a8k0.F(i2, 0, fetVar2), a8k0.F(i2, 0, fetVar2), null, null, null, null, null, pgeVar, null, fetVar2, 36912, 6, 31712);
                fetVar2.r(false);
                jm40Var = jm40Var2;
                f = 1.0f;
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, f);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var3 = jm40Var;
            bz6Var2 = bz6Var;
            v8q0.a(bz6Var.c, s5x0.N(s5x0.L(mm40VarD2, 16.0f, 0.0f, 2), 0.0f, 64.0f, 0.0f, 86.0f, 5), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0.a(new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var3;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, bz6Var2, i, (byte) 29);
        }
    }

    public static final void c(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1367060512);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            cb00 cb00Var = (cb00) l7m0Var.getValue();
            boolean z = !pkd.c(fetVar);
            Activity activity = (Activity) fetVar.k(cr00.f4820a);
            Window window = activity != null ? activity.getWindow() : null;
            Context context = (Context) fetVar.k(dy2.b);
            boolean zI = fetVar.i(window) | fetVar.i(context) | fetVar.g(cb00Var) | fetVar.h(z);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                zb1 zb1Var = new zb1((Object) window, (Object) context, (Object) cb00Var, z, (byte) 5);
                fetVar.o0(zb1Var);
                objP = zb1Var;
            }
            v3c.z((Function0) objP, null, null, fetVar, 0, 6);
            if (cb00Var != null) {
                if (cb00Var instanceof za00) {
                    fetVar.e0(-514811620);
                    wb.w(function1, fetVar, (i2 >> 3) & 14);
                    fetVar.r(false);
                } else if (cb00Var instanceof xa00) {
                    fetVar.e0(-514809548);
                    xf0.n((xa00) cb00Var, function1, fetVar, i2 & 112);
                    fetVar.r(false);
                } else if (cb00Var instanceof bb00) {
                    fetVar.e0(-514806664);
                    wdx.l((bb00) cb00Var, function1, fetVar, i2 & 112);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-514813230, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x0181  */
    /* JADX WARN: Code duplicated, block: B:108:0x018a  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x0200  */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:116:0x0280  */
    /* JADX WARN: Code duplicated, block: B:119:0x028a  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0131  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    public static final void d(final mm40 mm40Var, final l7m0 l7m0Var, final udl0 udl0Var, final boolean z, xcz xczVar, final Function1 function1, final Function1 function2, final xdr xdrVar, final xdr xdrVar2, final xdr xdrVar3, final Function1 function3, fet fetVar, final int i, final int i2, final int i3) {
        xcz xczVarA;
        int i4;
        Function1 function4;
        Function1 function5;
        xdr xdrVar4;
        xdr xdrVar5;
        xdr xdrVar6;
        Function1 function6;
        int i5;
        boolean z2;
        final xcz xczVar2;
        yfe0 yfe0VarU;
        int iOrdinal;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        l7m0Var.getClass();
        udl0Var.getClass();
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        function3.getClass();
        fetVar.g0(-686401380);
        int i11 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l7m0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i11 |= fetVar.e(udl0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i11 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i3 & 16) == 0) {
            xczVarA = xczVar;
            int i12 = fetVar.g(xczVarA) ? 16384 : 8192;
            i4 = i11 | i12;
            if ((196608 & i) == 0) {
                function4 = function1;
                if (fetVar.i(function4)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            } else {
                function4 = function1;
            }
            if ((1572864 & i) == 0) {
                function5 = function2;
                if (fetVar.i(function5)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            } else {
                function5 = function2;
            }
            if ((12582912 & i) == 0) {
                xdrVar4 = xdrVar;
                if (fetVar.i(xdrVar4)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            } else {
                xdrVar4 = xdrVar;
            }
            if ((100663296 & i) == 0) {
                xdrVar5 = xdrVar2;
                if (fetVar.i(xdrVar5)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i4 |= i7;
            } else {
                xdrVar5 = xdrVar2;
            }
            if ((805306368 & i) == 0) {
                xdrVar6 = xdrVar3;
                if (fetVar.i(xdrVar6)) {
                    i6 = 536870912;
                } else {
                    i6 = 268435456;
                }
                i4 |= i6;
            } else {
                xdrVar6 = xdrVar3;
            }
            if ((i2 & 6) == 0) {
                function6 = function3;
                i5 = i2 | (fetVar.i(function6) ? 4 : 2);
            } else {
                function6 = function3;
                i5 = i2;
            }
            if ((306783379 & i4) == 306783378 || (i5 & 3) != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i4 & 1, z2)) {
                fetVar.Z();
                if ((i & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                } else if ((i3 & 16) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i4 &= -57345;
                }
                fetVar.s();
                iOrdinal = udl0Var.ordinal();
                if (iOrdinal != 0) {
                    fetVar.e0(1793260848);
                    if (z) {
                        fetVar.e0(-243475135);
                        int i13 = i4 & 126;
                        int i14 = i4 >> 6;
                        kcx.i(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | ((i5 << 24) & 234881024));
                        z3 = false;
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-242987877);
                        int i15 = i4 & 126;
                        int i16 = i4 >> 6;
                        ucx.m(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i15 | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | ((i5 << 24) & 234881024));
                        z3 = false;
                        fetVar.r(false);
                    }
                    fetVar.r(z3);
                } else if (iOrdinal != 1) {
                    fetVar.e0(1793293762);
                    int i17 = i4 & 126;
                    int i18 = i4 >> 6;
                    x9x.l(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i17 | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | ((i5 << 24) & 234881024));
                    fetVar.r(false);
                } else if (iOrdinal != 2) {
                    fetVar.e0(1793308419);
                    int i19 = i4 & 126;
                    int i20 = i4 >> 6;
                    bdx.j(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i19 | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | ((i5 << 24) & 234881024));
                    fetVar.r(false);
                } else {
                    if (iOrdinal == 3) {
                        throw b1j.f(1793260483, fetVar, false);
                    }
                    fetVar.e0(1793322942);
                    int i21 = i4 & 126;
                    int i22 = i4 >> 6;
                    vdx.i(mm40Var, l7m0Var, xczVarA, function4, function5, xdrVar4, xdrVar5, xdrVar6, function6, fetVar, i21 | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016) | (i22 & 29360128) | ((i5 << 24) & 234881024));
                    fetVar.r(false);
                }
            } else {
                fetVar.X();
            }
            xczVar2 = xczVarA;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.d030
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i | 1);
                        int iL2 = x8x.L(i2);
                        idx.d(mm40Var, l7m0Var, udl0Var, z, xczVar2, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, (fet) obj, iL, iL2, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        xczVarA = xczVar;
        i4 = i11 | i12;
        if ((196608 & i) == 0) {
            function4 = function1;
            if (fetVar.i(function4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        } else {
            function4 = function1;
        }
        if ((1572864 & i) == 0) {
            function5 = function2;
            if (fetVar.i(function5)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        } else {
            function5 = function2;
        }
        if ((12582912 & i) == 0) {
            xdrVar4 = xdrVar;
            if (fetVar.i(xdrVar4)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i4 |= i8;
        } else {
            xdrVar4 = xdrVar;
        }
        if ((100663296 & i) == 0) {
            xdrVar5 = xdrVar2;
            if (fetVar.i(xdrVar5)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i4 |= i7;
        } else {
            xdrVar5 = xdrVar2;
        }
        if ((805306368 & i) == 0) {
            xdrVar6 = xdrVar3;
            if (fetVar.i(xdrVar6)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i4 |= i6;
        } else {
            xdrVar6 = xdrVar3;
        }
        if ((i2 & 6) == 0) {
            function6 = function3;
            i5 = i2 | (fetVar.i(function6) ? 4 : 2);
        } else {
            function6 = function3;
            i5 = i2;
        }
        if ((306783379 & i4) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (fetVar.U(i4 & 1, z2)) {
            fetVar.Z();
            if ((i & 1) == 0) {
                if ((i3 & 16) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                i4 &= -57345;
            }
            fetVar.s();
            iOrdinal = udl0Var.ordinal();
            if (iOrdinal != 0) {
                fetVar.e0(1793260848);
                if (z) {
                    fetVar.e0(-243475135);
                    int i110 = i4 & 126;
                    int i111 = i4 >> 6;
                    kcx.i(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i110 | (i111 & 896) | (i111 & 7168) | (i111 & 57344) | (i111 & 458752) | (i111 & 3670016) | (i111 & 29360128) | ((i5 << 24) & 234881024));
                    z3 = false;
                    fetVar.r(false);
                } else {
                    fetVar.e0(-242987877);
                    int i112 = i4 & 126;
                    int i113 = i4 >> 6;
                    ucx.m(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i112 | (i113 & 896) | (i113 & 7168) | (i113 & 57344) | (i113 & 458752) | (i113 & 3670016) | (i113 & 29360128) | ((i5 << 24) & 234881024));
                    z3 = false;
                    fetVar.r(false);
                }
                fetVar.r(z3);
            } else if (iOrdinal != 1) {
                fetVar.e0(1793293762);
                int i114 = i4 & 126;
                int i115 = i4 >> 6;
                x9x.l(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i114 | (i115 & 896) | (i115 & 7168) | (i115 & 57344) | (i115 & 458752) | (i115 & 3670016) | (i115 & 29360128) | ((i5 << 24) & 234881024));
                fetVar.r(false);
            } else if (iOrdinal != 2) {
                fetVar.e0(1793308419);
                int i116 = i4 & 126;
                int i23 = i4 >> 6;
                bdx.j(mm40Var, l7m0Var, xczVarA, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, fetVar, i116 | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i23 & 458752) | (i23 & 3670016) | (i23 & 29360128) | ((i5 << 24) & 234881024));
                fetVar.r(false);
            } else {
                if (iOrdinal == 3) {
                    throw b1j.f(1793260483, fetVar, false);
                }
                fetVar.e0(1793322942);
                int i24 = i4 & 126;
                int i25 = i4 >> 6;
                vdx.i(mm40Var, l7m0Var, xczVarA, function4, function5, xdrVar4, xdrVar5, xdrVar6, function6, fetVar, i24 | (i25 & 896) | (i25 & 7168) | (i25 & 57344) | (i25 & 458752) | (i25 & 3670016) | (i25 & 29360128) | ((i5 << 24) & 234881024));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        xczVar2 = xczVarA;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.d030
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    idx.d(mm40Var, l7m0Var, udl0Var, z, xczVar2, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, (fet) obj, iL, iL2, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, q850 q850Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        q850Var.getClass();
        function1.getClass();
        fetVar.g0(-787252812);
        int i2 = i | 6 | (fetVar.g(q850Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            int iOrdinal = q850Var.b.ordinal();
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, (iOrdinal == 0 || iOrdinal == 3) ? 8.0f : 0.0f, 0.0f, 8.0f, 5);
            rqm rqmVar = q850Var.f28283a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new w250(function1, (byte) 10);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new w250(function1, (byte) 11);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarN, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 168);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, q850Var, function1, i, (byte) 26);
        }
    }

    public static final void f(c280 c280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2143876795);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(c280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.B, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5l0(c280Var, str, i, (byte) 5);
        }
    }

    public static final void g(int i, long j, long j2, fet fetVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        c280 c280Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2098959221);
        int i2 = (fetVar2.f(j2) ? 536870912 : 268435456) | i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var2) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536) | (fetVar2.f(j) ? 1048576 : 524288) | (fetVar2.h(z2) ? 8388608 : 4194304) | (fetVar2.g(str4) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            c280Var3 = c280Var;
            f(c280Var3, str, fetVar2, i2 & 126);
            f(c280Var2, str2, fetVar2, (i2 >> 6) & 126);
            fetVar2.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            n((i2 >> 12) & 1022, j, fetVar2, str3, z);
            fetVar2 = fetVar;
            n((i2 >> 21) & 1022, j2, fetVar2, str4, z2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            c280Var3 = c280Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5l0(c280Var3, str, c280Var2, str2, z, str3, j, z2, str4, j2, i, (byte) 3);
        }
    }

    public static final void h(mm40 mm40Var, b480 b480Var, fet fetVar, int i) {
        fetVar.g0(371623184);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(b480Var) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (b480Var instanceof z380) {
            fetVar.e0(647600054);
            vvw.c(mm40Var, (z380) b480Var, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!(b480Var instanceof a480)) {
                throw b1j.f(647598370, fetVar, false);
            }
            fetVar.e0(647604440);
            aem0.l(mm40Var, (a480) b480Var, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var, b480Var, i, (byte) 24);
        }
    }

    public static final void i(mm40 mm40Var, k090 k090Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        k090Var.getClass();
        function1.getClass();
        fetVar.g0(-1081242663);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(k090Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(-1178521831, new dr50((byte) 27, mm40Var, (p6t0) k090Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 16, i, (Object) mm40Var, (Object) k090Var, (Object) cqqVar, (Object) function1);
        }
    }

    public static final void j(mm40 mm40Var, a4x a4xVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        a4xVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-2015077927);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1343046138, a4xVar);
            while (itO.hasNext()) {
                bdx.t(new x7z(1.0f, true), (b8c0) itO.next(), function1, function2, fetVar, i3 & 8064);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9((Object) mm40Var, a4xVar, (Object) function1, (Object) function2, i, (byte) 3);
        }
    }

    public static final void k(final mm40 mm40Var, final float f, final float f2, final yjj0 yjj0Var, final long j, final hd9 hd9Var, final List list, final int i, final tcj tcjVar, fet fetVar, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        v9v0 v9v0Var;
        List list2;
        Integer num;
        tcj tcjVar2 = tcjVar;
        yjj0Var.getClass();
        hd9Var.getClass();
        list.getClass();
        fetVar.g0(1935412517);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(yjj0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.f(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.e(4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? fetVar.g(hd9Var) : fetVar.i(hd9Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= (i2 & 16777216) == 0 ? fetVar.g(list) : fetVar.i(list) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.e(i) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= (i2 & 1073741824) == 0 ? fetVar.g(tcjVar2) : fetVar.i(tcjVar2) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            Object obj = hd9Var.f12859a.get(i);
            obj.getClass();
            v9v0 v9v0Var2 = (v9v0) obj;
            Object[] objArr = {"date.yearIdx"};
            boolean zI = fetVar.i(v9v0Var2);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zI || objP == obj2) {
                objP = new njf0(v9v0Var2, (byte) 0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP, fetVar, 0);
            Unit unit = Unit.f46060a;
            int i6 = i3 & 29360128;
            int i7 = i3;
            boolean z2 = i6 == 8388608 || ((i7 & 16777216) != 0 && fetVar.i(list));
            int i8 = i7 & 234881024;
            boolean zI2 = z2 | (i8 == 67108864) | fetVar.i(v9v0Var2);
            int i9 = i7 & 1879048192;
            boolean zG = zI2 | (i9 == 536870912 || ((i7 & 1073741824) != 0 && fetVar.i(tcjVar2))) | fetVar.g(cgk0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj2) {
                i4 = i9;
                i5 = 8388608;
                z = false;
                objP2 = new pjf0(tcjVar2, list, i, v9v0Var2, cgk0Var, (yje) null);
                v9v0Var = v9v0Var2;
                tcjVar2 = tcjVar2;
                list2 = list;
                fetVar.o0(objP2);
            } else {
                i4 = i9;
                i5 = 8388608;
                z = false;
                v9v0Var = v9v0Var2;
                list2 = list;
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(((t9v0) list.get(i)).e);
            Integer numValueOf = Integer.valueOf(cgk0Var.l());
            boolean zI3 = (i8 == 67108864 ? true : z) | ((r26 == i5 || ((i7 & 16777216) != 0 && fetVar.i(list2))) ? true : z) | fetVar.i(v9v0Var) | fetVar.g(cgk0Var) | ((i4 == 536870912 || ((i7 & 1073741824) != 0 && fetVar.i(tcjVar2))) ? true : z);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == obj2) {
                num = numValueOf;
                Object pjf0Var = new pjf0(list2, i, v9v0Var, tcjVar2, cgk0Var, (yje) null);
                fetVar.o0(pjf0Var);
                objP3 = pjf0Var;
            } else {
                num = numValueOf;
            }
            m0x0.v(boolValueOf, num, (Function2) objP3, fetVar);
            boolean z3 = (i6 == i5 || ((i7 & 16777216) != 0 && fetVar.i(list2))) ? true : z;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj2) {
                objP4 = new kv80(list2, (byte) 7);
                fetVar.o0(objP4);
            }
            Function2 function2 = (Function2) objP4;
            boolean zG2 = fetVar.g(cgk0Var);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj2) {
                objP5 = new rqc0(cgk0Var, (byte) 2);
                fetVar.o0(objP5);
            }
            int i10 = i7 >> 3;
            bdx.C(mm40Var, f, f2, j, yjj0Var, list2, false, function2, (xdr) objP5, fetVar, (i7 & 14) | 12582912 | (i7 & 112) | (i7 & 896) | (i10 & 7168) | (57344 & (i7 << 3)) | (458752 & i7) | (i10 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ojf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    idx.k(mm40Var, f, f2, yjj0Var, j, hd9Var, list, i, tcjVar, (fet) obj3, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void l(List list, int i, v9v0 v9v0Var, tcj tcjVar) {
        int size = ((t9v0) list.get(i)).b.size();
        for (int i2 = 0; i2 < size; i2++) {
            boolean zH = up90.h(tcjVar, ((Number) ((u9v0) v9v0Var.f37054a.get(i2)).c).intValue());
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(i2);
            if (cav0Var.c != zH) {
                ((t9v0) list.get(i)).b.set(i2, cav0.a(cav0Var, zH));
            }
        }
    }

    public static final void m(final mm40 mm40Var, final String str, final long j, final long j2, final int i, final boolean z, final boolean z2, final Function0 function0, fet fetVar, final int i2) {
        long secondary40;
        long secondary41;
        fet fetVar2 = fetVar;
        str.getClass();
        function0.getClass();
        fetVar2.g0(1993810191);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.f(j) ? 256 : 128) | (fetVar2.f(j2) ? 2048 : 1024) | (fetVar2.e(i) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i3 |= fetVar2.h(z) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= fetVar2.h(z2) ? 1048576 : 524288;
        }
        int i4 = i3 | (fetVar2.i(function0) ? 8388608 : 4194304);
        if (fetVar2.U(i4 & 1, (4793491 & i4) != 4793490)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new rf5(2, new y3d(j));
                fetVar2.o0(objP);
            }
            rf5 rf5Var = (rf5) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 58.0f);
            int i5 = 3670016 & i4;
            boolean z3 = (i5 == 1048576) | ((i4 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new gbc(z2, j, (byte) 4);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP2);
            boolean z4 = (i5 == 1048576) | ((i4 & 29360128) == 8388608);
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new jw7(z2, function0, (byte) 14);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40VarK, null, null, false, null, (Function0) objP3, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 24.0f);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarN, zx7Var);
            pm80 pm80VarF = a8k0.F(i, (i4 >> 12) & 14, fetVar2);
            if (z2) {
                secondary40 = j2;
            } else {
                pz40 pz40Var = s6t0.f31722a;
                secondary40 = s6t0.b().f33626a.getSecondary40();
            }
            dww.c(pm80VarF, null, mm40VarB, secondary40, fetVar, 56, 0);
            if (z && z2) {
                fetVar.e0(300128912);
                thb.f(ffb0.Q(jr8Var.b(jm40Var, zx7Var), 10.0f, 4.0f), rf5Var, fetVar, 48, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(300352825);
                fetVar.r(false);
            }
            mm40 mm40VarB2 = jr8Var.b(o7k0.d(s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 8.0f, 2), 1.0f), gqw0.h);
            zx7 zx7Var2 = gqw0.e;
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            if (z2) {
                secondary41 = j2;
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                secondary41 = s6t0.b().f33626a.getSecondary40();
            }
            kc5.N(str, mm40VarB2, secondary41, null, null, 0L, idm0.t(8), idm0.t(12), null, null, 0L, zx7Var2, 2, false, 1, 0, false, null, y9q0Var, 0.0f, fetVar, ((i4 >> 3) & 14) | 14155776, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.sgg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    idx.m(mm40Var, str, j, j2, i, z, z2, function0, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(int i, long j, fet fetVar, String str, boolean z) {
        int i2;
        long j2;
        fetVar.g0(-625915509);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            if (z) {
                fetVar.e0(-1536949792);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1536906547);
                fetVar.r(false);
            }
            fetVar.r(true);
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j2, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, ((i2 >> 3) & 14) | (i2 & 896), 24960, 109552);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5l0(z, str, j, i, (byte) 3);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(1757786151);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var2, 1.0f), 56.0f);
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
            mm40 mm40VarE2 = o7k0.e(s5x0.N(mm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), 12.0f);
            zfn zfnVar = zaq0.b;
            jcb.H(mm40VarE2, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 0, 0);
            jcb.H(o7k0.e(s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 12.0f), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var2, i, (byte) 22);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(1969634947);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | 48;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 68.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            mm40 mm40VarL = s5x0.L(o7k0.p(mm40Var2, 64.0f, 40.0f), 12.0f, 0.0f, 2);
            zcl zclVar3 = qmk.m;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarL), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.p(mm40Var2, z ? 128.0f : 96.0f, 16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(z, mm40Var2, i, (byte) 16);
        }
    }

    public static final void q(mm40 mm40Var, dum dumVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1858800254);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dumVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 80.0f), 12.0f, 16.0f, 12.0f, 0.0f, 8);
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
            c280 c280Var = dumVar.e;
            String str = dumVar.f6702a;
            c280 c280Var2 = dumVar.f;
            String str2 = dumVar.g;
            boolean z = dumVar.b;
            String str3 = dumVar.c;
            g(0, dumVar.d, dumVar.j, fetVar, c280Var, c280Var2, str, str2, str3, dumVar.i, z, dumVar.h);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) dumVar, i, (byte) 7);
        }
    }

    public static final v9d r(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        return s(v9dVar, k810Var, false);
    }

    public static final v9d s(v9d v9dVar, k810 k810Var, boolean z) {
        boolean z2;
        v9dVar.getClass();
        if (k810Var.b != -1) {
            throw new byw("");
        }
        v9d v9dVarB = v9dVar.b(k810Var);
        char[] cArr = v9dVar.b;
        CharSequence charSequence = k810Var.d;
        Iterable iterableO = l1e0.o(v9dVarB.b.length, cArr.length);
        if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
            Iterator it = iterableO.iterator();
            while (true) {
                if (!((kkx) it).c) {
                    z2 = true;
                    break;
                }
                if (cArr[((bkx) it).nextInt()] != '>') {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = true;
            break;
        }
        while (true) {
            v9d v9dVarA = v9dVarB.a(k810Var.e(x(v9dVarB, charSequence) + 1), z && z2);
            if (v9dVarA == null) {
                return v9dVarB;
            }
            v9dVarB = v9dVarA;
        }
    }

    public static final i4 t(boolean z, boolean z2, boolean z3, ctf0 ctf0Var, String str, double d, boolean z4, boolean z5) {
        ctf0Var.getClass();
        str.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (z4) {
            lc00VarB.add(new tso0("OPTION_BET", ctf0Var.b.a(R.string.option_bet_label, Arrays.copyOf(new Object[0], 0)), dqo0.f6527a));
        }
        if (z5) {
            lc00VarB.add(new tso0("EACH_WAY", ctf0Var.b.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), opo0.f25653a));
        }
        tqo0 tqo0Var = tqo0.f34390a;
        if (z) {
            lc00VarB.add(new tso0("PROMO", ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), tqo0Var));
        }
        if (str.length() > 0) {
            lc00VarB.add(new tso0(str, str, bro0.f3088a));
        }
        if (d != 0.0d) {
            lc00VarB.add(new tso0(str, ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), cpo0.f4759a));
        }
        if (z2) {
            lc00VarB.add(new tso0("AUTO_SALE", ctf0Var.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), wro0.f39654a));
        }
        if (z3) {
            lc00VarB.add(new tso0("AUTO_SUB", ctf0Var.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)), tqo0Var));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final void u(fhl fhlVar, w03 w03Var, jge0 jge0Var, long j, float f, yx3 yx3Var) {
        w03Var.h();
        w03Var.f(0.0f, 0.0f);
        float fW0 = fhlVar.w0(10.0f);
        float f2 = yx3Var.b;
        w03Var.e((fW0 * f2) / 2.0f, fhlVar.w0(5.0f) * f2);
        w03Var.e(fhlVar.w0(10.0f) * f2, 0.0f);
        float fMin = Math.min(jge0Var.c - jge0Var.f16474a, jge0Var.d - jge0Var.b) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jge0Var.e() >> 32)) + fMin) - ((fhlVar.w0(10.0f) * f2) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)) - fhlVar.w0(2.5f);
        w03Var.k((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fW1 = yx3Var.f43402a - fhlVar.w0(2.5f);
        long jE0 = fhlVar.E0();
        nr nrVarA0 = fhlVar.A0();
        long jP = nrVarA0.p();
        nrVarA0.i().l();
        try {
            ((fvt0) nrVarA0.b).y(fW1, jE0);
            fhl.C0(fhlVar, w03Var, j, f, new vtm0(fhlVar.w0(2.5f), 0.0f, 0, 0, null, 30), 48);
        } finally {
            defpackage.c.g(nrVarA0, jP);
        }
    }

    public static final CharSequence v(v9d v9dVar, CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        int i = v9dVar.d;
        return length < i ? "" : charSequence.subSequence(i, charSequence.length());
    }

    public static final boolean w(v9d v9dVar, v9d v9dVar2) {
        v9dVar.getClass();
        v9dVar2.getClass();
        return v9dVar.f(v9dVar2) && !v9dVar.c(v9dVar2.b.length);
    }

    public static final int x(v9d v9dVar, CharSequence charSequence) {
        v9dVar.getClass();
        charSequence.getClass();
        return Math.min(v9dVar.d, charSequence.length());
    }

    public static final tma y(l2g0 l2g0Var, List list, wcb wcbVar, boolean z) {
        String str;
        list.getClass();
        wcbVar.getClass();
        eel0 eel0Var = x1x.E(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f9413a;
        if (eel0Var instanceof ael0) {
            str = ((ael0) eel0Var).f735a;
        } else {
            if (!(eel0Var instanceof cel0)) {
                t9f.b();
                return null;
            }
            str = ((cel0) eel0Var).b;
        }
        return new tma(new c4i(zjb.y(l2g0Var.g, l2g0Var.r, l2g0Var.t), z, new n0x(str), new m0x(R.drawable.sport_new, null, 6), eel0Var instanceof cel0 ? new y3d(y3d.g) : null, 32), new x3i(gtj.f11884a), 10);
    }

    public static final uma z(l2g0 l2g0Var, List list, wcb wcbVar, boolean z, boolean z2) {
        String str;
        u3i s3iVar;
        list.getClass();
        wcbVar.getClass();
        eel0 eel0Var = x1x.E(l2g0Var.c, l2g0Var.d, l2g0Var.w, list, wcbVar).f9413a;
        if (eel0Var instanceof ael0) {
            str = ((ael0) eel0Var).f735a;
        } else {
            if (!(eel0Var instanceof cel0)) {
                t9f.b();
                return null;
            }
            str = ((cel0) eel0Var).b;
        }
        c4i c4iVar = new c4i(zjb.y(l2g0Var.g, l2g0Var.r, l2g0Var.t), z2, new n0x(str), new m0x(R.drawable.sport_new, null, 6), eel0Var instanceof cel0 ? new y3d(y3d.g) : null, 32);
        x3i x3iVar = new x3i(gtj.f11884a);
        if (l2g0Var.y.isEmpty()) {
            s3iVar = t3i.f33268a;
        } else {
            s3iVar = new s3i(z ? r8.f30001a : r8.b);
        }
        return new uma(c4iVar, x3iVar, s3iVar, 2);
    }
}
