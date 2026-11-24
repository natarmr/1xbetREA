package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.javax.sip.ClientTransaction;
import android.javax.sip.SipProvider;
import android.javax.sip.address.AddressFactory;
import android.javax.sip.header.AuthorizationHeader;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.results.impl.presentation.alt_champs.ChampsResultsParams;
import org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2530a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bg0(r0x r0xVar, String str, Drawable drawable, List list, Function1 function1, Function1 function2) {
        this.f2530a = (byte) 9;
        this.b = r0xVar;
        this.c = str;
        this.d = drawable;
        this.f = list;
        this.e = function1;
        this.g = function2;
    }

    private final Object a(Object obj) {
        Object g0g0Var;
        z3f0 z3f0Var = (z3f0) this.b;
        wpq wpqVar = (wpq) this.c;
        pkk0 pkk0Var = (pkk0) this.d;
        vne vneVar = (vne) this.e;
        l7m0 l7m0Var = (l7m0) this.f;
        xcz xczVar = (xcz) this.g;
        t4f0 t4f0Var = (t4f0) obj;
        zie0 zie0Var = z3f0.Y1;
        t4f0Var.getClass();
        rek0 rek0Var = rek0.b;
        if (t4f0Var instanceof e4f0) {
            DateCalendarBottomSheetParams dateCalendarBottomSheetParams = ((e4f0) t4f0Var).f7179a;
            kud kudVar = vcj.m2;
            androidx.fragment.app.e eVarC = z3f0Var.C();
            eVarC.getClass();
            kudVar.getClass();
            kud.g(dateCalendarBottomSheetParams, eVarC, "REQUEST_BIRTHDAY_CALENDAR_KEY");
        } else if (t4f0Var instanceof f4f0) {
            String str = ((f4f0) t4f0Var).f8912a;
            Context contextO0 = z3f0Var.o0();
            str.getClass();
            try {
                e0g0 e0g0Var = j0g0.b;
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setFlags(268435456);
                intent.setData(Uri.parse(str));
                contextO0.startActivity(intent);
                g0g0Var = Unit.f46060a;
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (j0g0.a(g0g0Var) != null) {
                wdk0 wdk0VarG0 = z3f0Var.G0();
                String strH = z3f0Var.H(R.string.open_browser_error_message);
                strH.getClass();
                wdk0.k(wdk0VarG0, new xdk0(rek0Var, strH, null, null, null, null, 124), z3f0Var, null, null, false, null, 1020);
            }
        } else if (t4f0Var instanceof h4f0) {
            DateCalendarBottomSheetParams dateCalendarBottomSheetParams2 = ((h4f0) t4f0Var).f12431a;
            kud kudVar2 = vcj.m2;
            androidx.fragment.app.e eVarC2 = z3f0Var.C();
            eVarC2.getClass();
            kudVar2.getClass();
            kud.g(dateCalendarBottomSheetParams2, eVarC2, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY");
        } else if (t4f0Var instanceof i4f0) {
            DateCalendarBottomSheetParams dateCalendarBottomSheetParams3 = ((i4f0) t4f0Var).f14144a;
            kud kudVar3 = vcj.m2;
            androidx.fragment.app.e eVarC3 = z3f0Var.C();
            eVarC3.getClass();
            kudVar3.getClass();
            kud.g(dateCalendarBottomSheetParams3, eVarC3, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY");
        } else if (t4f0Var instanceof j4f0) {
            j4f0 j4f0Var = (j4f0) t4f0Var;
            if (!sj3.v0(z3f0Var.o0(), j4f0Var.f15882a, j4f0Var.b)) {
                wdk0 wdk0VarG1 = z3f0Var.G0();
                String strH2 = z3f0Var.H(R.string.registration_gdpr_pdf_error);
                strH2.getClass();
                wdk0.k(wdk0VarG1, new xdk0(rek0Var, strH2, null, null, null, null, 124), z3f0Var, null, null, false, null, 1020);
            }
            ndk0 ndk0Var = z3f0Var.X1;
            if (ndk0Var != null) {
                ndk0Var.dismiss();
            }
        } else {
            yje yjeVar = null;
            if (t4f0Var instanceof l4f0) {
                d7a d7aVar = ((l4f0) t4f0Var).f19402a;
                if (z3f0Var.P1 == null) {
                    Intrinsics.h("captchaDialogDelegate");
                    throw null;
                }
                String strH3 = z3f0Var.H(R.string.registration);
                strH3.getClass();
                gl5.q(z3f0Var, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH3);
            } else if (t4f0Var instanceof m4f0) {
                String strH4 = ((m4f0) t4f0Var).f21168a;
                wdk0 wdk0VarG2 = z3f0Var.G0();
                if (strH4.length() == 0) {
                    strH4 = z3f0Var.H(R.string.error_check_input);
                    strH4.getClass();
                }
                wdk0.k(wdk0VarG2, new xdk0(rek0Var, strH4, null, null, null, null, 124), z3f0Var, null, null, false, null, 1020);
                if (((Number) l7m0Var.getValue()).intValue() != -1) {
                    ((ypq) wpqVar).b(false);
                    if (pkk0Var != null) {
                        ((r3k) pkk0Var).a();
                    }
                    qjj.W(vneVar, null, null, new qua(xczVar, l7m0Var, (yje) null), 3);
                }
            } else if (t4f0Var instanceof o4f0) {
                boolean z = ((o4f0) t4f0Var).f24632a;
                ndk0 ndk0Var2 = z3f0Var.X1;
                if (ndk0Var2 != null) {
                    ndk0Var2.dismiss();
                }
                if (z) {
                    wdk0 wdk0VarG3 = z3f0Var.G0();
                    pek0 pek0Var = pek0.f26859a;
                    String strH5 = z3f0Var.H(R.string.show_loading_document_message);
                    strH5.getClass();
                    z3f0Var.X1 = wdk0.k(wdk0VarG3, new xdk0(pek0Var, strH5, null, null, rv00.B, null, 108), z3f0Var, null, null, false, null, 1020);
                }
            } else if (t4f0Var instanceof q4f0) {
                String strH6 = ((q4f0) t4f0Var).f28095a;
                wdk0 wdk0VarG4 = z3f0Var.G0();
                if (strH6.length() == 0) {
                    strH6 = z3f0Var.H(R.string.error_check_input);
                    strH6.getClass();
                }
                wdk0.k(wdk0VarG4, new xdk0(rek0Var, strH6, null, null, null, null, 124), z3f0Var, null, null, false, null, 1020);
            } else if (t4f0Var instanceof r4f0) {
                int i = ((r4f0) t4f0Var).f29831a;
                Object objN = z3f0Var.M1.n(z3f0.Z1[0], z3f0Var);
                objN.getClass();
                ComposeView composeView = ((aid) objN).f919a;
                tkz tkzVarQ = x0x.Q(z3f0Var.u1);
                rwj rwjVar = tvk.f34603a;
                vs10 vs10Var = ys10.f43147a;
                d21 d21Var = new d21((Object) z3f0Var, i, (Object) composeView, yjeVar, (byte) 14);
                z3f0Var = z3f0Var;
                qjj.W(tkzVarQ, vs10Var, null, d21Var, 2);
            } else if (t4f0Var.equals(s4f0.f31602a)) {
                ii iiVar = z3f0Var.S1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH7 = z3f0Var.H(R.string.error);
                String strH8 = z3f0Var.H(R.string.user_already_exist_error);
                String strH9 = z3f0Var.H(R.string.ok_new);
                strH9.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, "REQUEST_USER_EXIST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                androidx.fragment.app.e eVarC4 = z3f0Var.C();
                eVarC4.getClass();
                iiVar.d(dialogFields, eVarC4);
            } else if (t4f0Var.equals(p4f0.f26349a)) {
                ii iiVar2 = z3f0Var.S1;
                if (iiVar2 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH10 = z3f0Var.H(R.string.attention);
                String strH11 = z3f0Var.H(R.string.registration_politically_exposed_person_info);
                String strH12 = z3f0Var.H(R.string.ok_new);
                strH12.getClass();
                DialogFields dialogFields2 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                androidx.fragment.app.e eVarC5 = z3f0Var.C();
                eVarC5.getClass();
                iiVar2.d(dialogFields2, eVarC5);
            } else if (t4f0Var.equals(n4f0.f22895a)) {
                usd usdVar = ebj.i2;
                String string = z3f0Var.G().getString(R.string.data_retrieval_error);
                string.getClass();
                androidx.fragment.app.e eVarC6 = z3f0Var.C();
                eVarC6.getClass();
                usdVar.getClass();
                usd.e(eVarC6, string);
            } else if (t4f0Var.equals(k4f0.f17667a)) {
                if (z3f0Var.R1 == null) {
                    Intrinsics.h("authEntryPointsDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC7 = z3f0Var.C();
                eVarC7.getClass();
                pek0.n(eVarC7, true);
            } else if (t4f0Var.equals(g4f0.f10663a)) {
                ii iiVar3 = z3f0Var.S1;
                if (iiVar3 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH13 = z3f0Var.H(R.string.caution);
                String strH14 = z3f0Var.H(R.string.registration_interapt_question);
                String strH15 = z3f0Var.H(R.string.interrupt);
                strH15.getClass();
                DialogFields dialogFields3 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, z3f0Var.H(R.string.cancel), (String) null, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                androidx.fragment.app.e eVarC8 = z3f0Var.C();
                eVarC8.getClass();
                iiVar3.d(dialogFields3, eVarC8);
            } else {
                if (!t4f0Var.equals(d4f0.f5452a)) {
                    t9f.b();
                    return null;
                }
                j120.Y(z3f0Var);
            }
        }
        z3f0Var.H0().x(j2f0.f15778a);
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        pru pruVar = (pru) this.b;
        svu svuVar = (svu) this.c;
        g2v g2vVar = (g2v) this.d;
        kuu kuuVar = (kuu) this.e;
        hpk0 hpk0Var = (hpk0) this.f;
        vzg0 vzg0Var = (vzg0) this.g;
        IntRange intRange = tpk0.Z;
        ((vzg0) obj).getClass();
        sff0 sff0VarA = pruVar.a();
        boolean zL = svuVar.l();
        boolean zF = ((rrc) g2vVar.f10580a).F();
        lok0 lok0VarA = kuuVar.a(hpk0Var.f13447a);
        List list = lok0VarA.m;
        List list2 = lok0VarA.l;
        List list3 = lok0VarA.k;
        if (!list3.isEmpty() && !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                int i = intRange.f46068a;
                if (iIntValue <= intRange.b && i <= iIntValue) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!list2.isEmpty() && !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                int iIntValue2 = ((Number) it2.next()).intValue();
                int i2 = intRange.f46068a;
                if (iIntValue2 <= intRange.b && i2 <= iIntValue2) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                }
                int iIntValue3 = ((Number) it3.next()).intValue();
                int i3 = intRange.f46068a;
                if (iIntValue3 <= intRange.b && i3 <= iIntValue3) {
                    z3 = true;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(lok0VarA.j, list3), list2), list);
        if (!arrayListQ0.isEmpty()) {
            Iterator it4 = arrayListQ0.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z4 = false;
                    break;
                }
                if (((Number) it4.next()).intValue() == 10) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        int i4 = hpk0Var.f13447a;
        String str = hpk0Var.c;
        SpecialEventTabs specialEventTabs = (SpecialEventTabs) vzg0Var.a("SELECTED_TAB_POSITION_KEY");
        if (specialEventTabs == null) {
            specialEventTabs = SpecialEventTabs.SCHEDULE;
        }
        SpecialEventTabs specialEventTabs2 = specialEventTabs;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(SpecialEventTabs.SCHEDULE);
        if (z) {
            lc00VarB.add(SpecialEventTabs.MY_GAMES);
        }
        if (z2) {
            lc00VarB.add(SpecialEventTabs.STATISTIC);
        }
        if (z3) {
            lc00VarB.add(SpecialEventTabs.TOURNAMENT);
        }
        return new jpk0(i4, str, "", "", "", 0L, new lwk0(specialEventTabs2, kotlin.collections.a.a(lc00VarB), ufx.P(sff0VarA), lok0VarA.j, lok0VarA.k, lok0VarA.l, lok0VarA.m), new ipk0(lok0VarA.f, lok0VarA.g, zL, zF, lok0VarA, z4), lok0VarA.r, lok0VarA.c, false);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x066c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0676  */
    /* JADX WARN: Code duplicated, block: B:164:0x0679  */
    /* JADX WARN: Code duplicated, block: B:165:0x067d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0682  */
    /* JADX WARN: Code duplicated, block: B:170:0x0691 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0693  */
    /* JADX WARN: Code duplicated, block: B:172:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:173:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:192:0x0728  */
    /* JADX WARN: Code duplicated, block: B:194:0x072e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0731 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:197:0x0733  */
    /* JADX WARN: Code duplicated, block: B:198:0x0735  */
    /* JADX WARN: Code duplicated, block: B:199:0x0739  */
    /* JADX WARN: Code duplicated, block: B:200:0x073c  */
    /* JADX WARN: Code duplicated, block: B:201:0x073f  */
    /* JADX WARN: Code duplicated, block: B:204:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:205:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:216:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:233:0x0923  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        sgy sgyVar;
        Date date;
        int i;
        dja djaVar;
        dja djaVar2;
        boolean z2;
        t3z t3zVar;
        t3z t3zVarH;
        irs irsVar;
        boolean z3;
        boolean z4;
        int iOrdinal;
        fts ftsVar;
        int iOrdinal2;
        int i2;
        int iOrdinal3;
        Fragment fragmentM;
        m7h0 sendConfirmationSMSScreen;
        AuthorizationHeader authorizationHeaderCreateAuthorizationHeader;
        byte b = this.f2530a;
        int i3 = 2;
        int i4 = 0;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                byte b2 = 16;
                pq5 pq5Var = (pq5) obj7;
                mdm mdmVar = (mdm) obj6;
                g3b g3bVar = (g3b) obj5;
                Function1 function1 = (Function1) obj4;
                mm40 mm40Var = (mm40) obj3;
                b3b b3bVar = (b3b) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                Collection collection = pq5Var instanceof nq5 ? ((nq5) pq5Var).b : lak0.c;
                if (!collection.isEmpty() || (pq5Var instanceof oq5)) {
                    qb qbVar = new qb((Object) collection, (Object) pq5Var, (Object) function1, false, (byte) 14);
                    z = true;
                    sgyVar = null;
                    hcz.e(hczVar, "banners", null, new ugd(-871154450, true, qbVar), 2);
                } else {
                    z = true;
                    sgyVar = null;
                }
                if (mdmVar != null) {
                    hcz.e(hczVar, "empty", sgyVar, new ugd(432860325, z, new qb((Object) mm40Var, (Object) mdmVar, (Object) function1, false, (byte) 15)), 2);
                } else {
                    if (g3bVar.b != null) {
                        hcz.e(hczVar, "categories", sgyVar, new ugd(1531795063, z, new ri1(g3bVar, function1, b2)), 2);
                    }
                    hcz.e(hczVar, "partitions", sgyVar, new ugd(-39313298, z, new ri1(b3bVar, function1, (byte) 17)), 2);
                }
                return Unit.f46060a;
            case 1:
                vzg0 vzg0Var = (vzg0) obj3;
                qrc qrcVar = (qrc) obj2;
                vzg0 vzg0Var2 = (vzg0) obj;
                vzg0Var2.getClass();
                sff0 sff0VarA = ((pru) obj7).a();
                v8d v8dVarA = ((bzt) obj6).f3488a.a();
                boolean z5 = ((ChampsResultsParams) obj4).d;
                Date date2 = (Date) ((hru) obj5).b(z5).f40549a.getValue();
                vzg0Var.e("KEY_CURRENT_DATE", date2);
                if (date2 != null) {
                    date = date2;
                } else {
                    date2 = (Date) vzg0Var.a("KEY_CURRENT_DATE");
                    if (date2 != null) {
                        qrcVar.a(date2, z5);
                        date = date2;
                    } else {
                        date = null;
                    }
                }
                String str = (String) a8k0.H(vzg0Var2, "KEY_SEARCH_INPUT", "");
                mum0 mum0Var = sff0VarA.g;
                j8l0 j8l0Var = mum0Var.o;
                h8l0 h8l0Var = mum0Var.v;
                zvh0 zvh0Var = mum0Var.x;
                v5l0 v5l0Var = mum0Var.y;
                i8l0 i8l0Var = mum0Var.p;
                int i5 = v8dVarA.r;
                Boolean bool = Boolean.FALSE;
                boolean zBooleanValue = ((Boolean) a8k0.H(vzg0Var2, "KEY_EXPANDED_INITED_SPORT", bool)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) a8k0.H(vzg0Var2, "KEY_SELECTION_ENABLE", bool)).booleanValue();
                xun xunVar = xun.f41520a;
                return new g72(str, date, true, e72.f7313a, j8l0Var, zvh0Var, v5l0Var, i8l0Var, h8l0Var, false, false, false, i5, zBooleanValue, zBooleanValue2, (Set) a8k0.H(vzg0Var2, "KEY_SELECTED_IDS", xunVar), iun.f15405a, (Set) a8k0.H(vzg0Var2, "KEY_EXPANDED_IDS", xunVar));
            case 2:
                int i6 = 0;
                pu90[] pu90VarArr = (pu90[]) obj7;
                List list = (List) obj6;
                vj30 vj30Var = (vj30) obj5;
                kie0 kie0Var = (kie0) obj4;
                kie0 kie0Var2 = (kie0) obj3;
                ar8 ar8Var = (ar8) obj2;
                ou90 ou90Var = (ou90) obj;
                int length = pu90VarArr.length;
                while (i4 < length) {
                    pu90 pu90Var = pu90VarArr[i4];
                    pu90Var.getClass();
                    zq8.d(ou90Var, pu90Var, (pj30) list.get(i6), vj30Var.getLayoutDirection(), kie0Var.f18333a, kie0Var2.f18333a, ar8Var.f1333a);
                    i4++;
                    i6++;
                }
                return Unit.f46060a;
            case 3:
                h7w h7wVar = (h7w) obj7;
                g7z g7zVar = (g7z) obj6;
                w6k w6kVar = (w6k) obj3;
                k6z k6zVar = (k6z) obj2;
                fhl fhlVar = (fhl) obj;
                nr nrVarA0 = fhlVar.A0();
                nrVarA0.F((pi9) obj5);
                nrVarA0.G((k6z) obj4);
                try {
                    h7wVar.invoke(g7zVar);
                    return Unit.f46060a;
                } finally {
                    nr nrVarA1 = fhlVar.A0();
                    nrVarA1.F(w6kVar);
                    nrVarA1.G(k6zVar);
                }
            case 4:
                hrb hrbVar = (hrb) obj7;
                String str2 = (String) obj6;
                swp0 swp0Var = (swp0) obj5;
                List list2 = (List) obj4;
                List list3 = (List) obj3;
                String str3 = (String) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                mi70 mi70Var = hrbVar.u;
                uqb uqbVar = hrbVar.m;
                if (uqbVar != null) {
                    if (uqbVar instanceof sqb) {
                        i3 = 11;
                    } else if (!(uqbVar instanceof tqb)) {
                        i = 0;
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                wbi0 wbi0Var = new wbi0(str2, swp0Var, i, list2, list3, false, str3, new ChangePhoneNumberScreen(uqbVar));
                mi70Var.getClass();
                k0w0Var.h(new SendConfirmationSMSScreen(wbi0Var));
                return Unit.f46060a;
            case 5:
                a4x a4xVar = (a4x) obj7;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar.size(), new ctl((Object) new j2l((byte) 29), (Object) a4xVar, (byte) 7), new v2m(a4xVar, (byte) 0), new ugd(2039820996, true, new w2m(a4xVar, (Function1) obj4, (Function1) obj6, (Function1) obj5, (Function1) obj3, (Function1) obj2, (byte) 0)));
                return Unit.f46060a;
            case 6:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                List list4 = (List) ((l7m0) obj7).getValue();
                hczVar3.f(list4.size(), new d2p(new gwr((byte) 14), list4, (byte) 12), new far(list4, (byte) 4), new ugd(2039820996, true, new w2m(list4, (Function2) obj6, (Function1) obj4, (Function1) obj5, (Function1) obj3, (Function2) obj2)));
                return Unit.f46060a;
            case 7:
                vzg0 vzg0Var3 = (vzg0) obj7;
                frs frsVar = (frs) obj6;
                GameBroadcastType gameBroadcastType = frsVar.g;
                lbu lbuVar = (lbu) obj5;
                wyu wyuVar = (wyu) obj4;
                r9u r9uVar = (r9u) obj3;
                String str4 = (String) obj2;
                vzg0 vzg0Var4 = (vzg0) obj;
                vzg0Var4.getClass();
                irs irsVar2 = (irs) vzg0Var3.a("KEY_CURRENT_TAB");
                if (irsVar2 != null) {
                    djaVar = (dja) vzg0Var3.a("KEY_CURRENT_BROADCASTING_TYPE");
                    if (djaVar == null) {
                        iOrdinal = gameBroadcastType.ordinal();
                        if (iOrdinal != 0) {
                            djaVar2 = dja.BROADCASTING_VIDEO;
                        } else if (iOrdinal != 1) {
                            djaVar2 = dja.BROADCASTING_ZONE;
                        } else if (iOrdinal == 2) {
                            djaVar2 = null;
                        } else {
                            t9f.b();
                        }
                    } else {
                        djaVar2 = djaVar;
                    }
                    long j = frsVar.d;
                    z2 = frsVar.c;
                    long jLongValue = ((Number) a8k0.H(vzg0Var4, "KEY_GAME_ID", Long.valueOf(j))).longValue();
                    boolean zBooleanValue3 = ((Boolean) a8k0.H(vzg0Var4, "KEY_LIVE", Boolean.valueOf(z2))).booleanValue();
                    long jLongValue2 = ((Number) a8k0.H(vzg0Var4, "KEY_SUB_GAME_ID", Long.valueOf(frsVar.e))).longValue();
                    long j2 = frsVar.b;
                    boolean zJ = lbuVar.j();
                    long jLongValue3 = ((Number) a8k0.H(vzg0Var4, "KEY_CHAMP_ID", Long.valueOf(frsVar.f))).longValue();
                    boolean z6 = !h97.A(wyuVar, uaq0.f35345a);
                    boolean zBooleanValue4 = ((Boolean) a8k0.H(vzg0Var4, "KEY_SHOW_SUB_GAMES", Boolean.TRUE)).booleanValue();
                    iun iunVar = iun.f15405a;
                    Object obj8 = (Void) a8k0.H(vzg0Var4, "KEY_CURRENT_CARD_TYPE", null);
                    t3zVar = (t3z) vzg0Var3.a("KEY_GAME_TYPE");
                    if (t3zVar == null) {
                        t3z.f33292a.getClass();
                        t3zVarH = rqt.h(z2, false, false);
                    } else {
                        t3zVarH = t3zVar;
                    }
                    boolean zBooleanValue5 = ((Boolean) a8k0.H(vzg0Var4, "KEY_EXPANDED_CARD_SECTION", Boolean.FALSE)).booleanValue();
                    irsVar = irs.b;
                    if (irsVar2 == irsVar || djaVar2 != dja.BROADCASTING_VIDEO) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (irsVar2 == irsVar || djaVar2 != dja.BROADCASTING_ZONE) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    Object obj9 = (Void) a8k0.H(vzg0Var4, "KEY_CATEGORY_ID", null);
                    ygp ygpVar = ygp.t;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    return new z2s(jLongValue, "", null, zBooleanValue3, j2, jLongValue2, (Long) obj9, Long.valueOf(jLongValue3), t3zVarH, str4, zJ, "", "", "", false, false, false, false, false, false, false, false, null, z3, z4, false, false, z6, "", "", true, zBooleanValue4, false, false, null, null, null, (dja) obj8, irsVar2, djaVar2, null, null, null, null, iunVar, zBooleanValue5, j1q0Var.f15748a.d(ygpVar), iunVar);
                }
                int iOrdinal4 = gameBroadcastType.ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                    irsVar2 = irs.b;
                } else if (iOrdinal4 == 2) {
                    irsVar2 = irs.f15274a;
                } else {
                    t9f.b();
                }
                djaVar = (dja) vzg0Var3.a("KEY_CURRENT_BROADCASTING_TYPE");
                if (djaVar == null) {
                    iOrdinal = gameBroadcastType.ordinal();
                    if (iOrdinal != 0) {
                        djaVar2 = dja.BROADCASTING_VIDEO;
                    } else if (iOrdinal != 1) {
                        djaVar2 = dja.BROADCASTING_ZONE;
                    } else if (iOrdinal == 2) {
                        djaVar2 = null;
                    } else {
                        t9f.b();
                    }
                } else {
                    djaVar2 = djaVar;
                }
                long j3 = frsVar.d;
                z2 = frsVar.c;
                long jLongValue4 = ((Number) a8k0.H(vzg0Var4, "KEY_GAME_ID", Long.valueOf(j3))).longValue();
                boolean zBooleanValue6 = ((Boolean) a8k0.H(vzg0Var4, "KEY_LIVE", Boolean.valueOf(z2))).booleanValue();
                long jLongValue5 = ((Number) a8k0.H(vzg0Var4, "KEY_SUB_GAME_ID", Long.valueOf(frsVar.e))).longValue();
                long j4 = frsVar.b;
                boolean zJ2 = lbuVar.j();
                long jLongValue6 = ((Number) a8k0.H(vzg0Var4, "KEY_CHAMP_ID", Long.valueOf(frsVar.f))).longValue();
                boolean z7 = !h97.A(wyuVar, uaq0.f35345a);
                boolean zBooleanValue7 = ((Boolean) a8k0.H(vzg0Var4, "KEY_SHOW_SUB_GAMES", Boolean.TRUE)).booleanValue();
                iun iunVar2 = iun.f15405a;
                Object obj10 = (Void) a8k0.H(vzg0Var4, "KEY_CURRENT_CARD_TYPE", null);
                t3zVar = (t3z) vzg0Var3.a("KEY_GAME_TYPE");
                if (t3zVar == null) {
                    t3z.f33292a.getClass();
                    t3zVarH = rqt.h(z2, false, false);
                } else {
                    t3zVarH = t3zVar;
                }
                boolean zBooleanValue8 = ((Boolean) a8k0.H(vzg0Var4, "KEY_EXPANDED_CARD_SECTION", Boolean.FALSE)).booleanValue();
                irsVar = irs.b;
                if (irsVar2 == irsVar) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (irsVar2 == irsVar) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                Object obj11 = (Void) a8k0.H(vzg0Var4, "KEY_CATEGORY_ID", null);
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new z2s(jLongValue4, "", null, zBooleanValue6, j4, jLongValue5, (Long) obj11, Long.valueOf(jLongValue6), t3zVarH, str4, zJ2, "", "", "", false, false, false, false, false, false, false, false, null, z3, z4, false, false, z7, "", "", true, zBooleanValue7, false, false, null, null, null, (dja) obj10, irsVar2, djaVar2, null, null, null, null, iunVar2, zBooleanValue8, j1q0Var2.f15748a.d(ygpVar2), iunVar2);
                return null;
            case 8:
                gts gtsVar = (gts) obj6;
                bts btsVar = (bts) obj5;
                pq8 pq8Var = (pq8) obj4;
                sek sekVar = (sek) obj3;
                bek bekVar = (bek) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                androidx.fragment.app.e eVarC = androidx.fragment.app.e.H((View) obj7).C();
                eVarC.getClass();
                if (gtsVar != null) {
                    int iOrdinal5 = btsVar.ordinal();
                    if (iOrdinal5 == 0) {
                        ftsVar = gtsVar.f11896a;
                    } else {
                        if (iOrdinal5 != 1) {
                            t9f.b();
                            return null;
                        }
                        ftsVar = gtsVar.b;
                    }
                } else {
                    ftsVar = null;
                }
                if (ftsVar instanceof ets) {
                    GameBroadcastingParams gameBroadcastingParams = ((ets) ftsVar).f8390a;
                    Pair pair = new Pair(btsVar, gameBroadcastingParams);
                    boolean z8 = eVarC.J(btsVar.f3198a) != null;
                    Pair pair2 = pq8Var.f27402a;
                    if (!z8 || pair2 == null) {
                        int id = frameLayout.getId();
                        iOrdinal2 = btsVar.ordinal();
                        if (iOrdinal2 != 0) {
                            i2 = 1;
                            if (iOrdinal2 == 1) {
                                zss.d(eVarC, "video_fragment_tag");
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        i2 = 1;
                        zss.d(eVarC, "zone_fragment_tag");
                        zb5 zb5Var = new zb5(eVarC);
                        iOrdinal3 = btsVar.ordinal();
                        if (iOrdinal3 == 0) {
                            jxs[] jxsVarArr = jxs.f17324a;
                            fragmentM = sekVar.m(gameBroadcastingParams, new GameVideoUiConfig("16:9", R.dimen.corner_radius_12, -1, -1, GameVideoPlayerColorScheme.Static.f46687a));
                        } else {
                            if (iOrdinal3 != i2) {
                                t9f.b();
                                return null;
                            }
                            bekVar.getClass();
                            p0t.P1.getClass();
                            p0t p0tVar = new p0t();
                            p0tVar.O1.J(p0tVar, p0t.Q1[i2], gameBroadcastingParams);
                            fragmentM = p0tVar;
                        }
                        zb5Var.o(id, fragmentM, btsVar.f3198a);
                        zb5Var.i();
                        frameLayout.post(new wss(frameLayout, (byte) 0));
                        pq8Var.f27402a = pair;
                    } else {
                        bts btsVar2 = (bts) pair2.f46059a;
                        GameBroadcastingParams gameBroadcastingParams2 = (GameBroadcastingParams) pair2.b;
                        if (btsVar2 == btsVar) {
                            long j5 = gameBroadcastingParams2.f46691a;
                            boolean z9 = gameBroadcastingParams2.b;
                            boolean z10 = gameBroadcastingParams2.c;
                            long j6 = gameBroadcastingParams2.d;
                            int i7 = gameBroadcastingParams2.e;
                            String str5 = gameBroadcastingParams2.f;
                            long j7 = gameBroadcastingParams2.g;
                            str5.getClass();
                            GameBroadcastingParams gameBroadcastingParams3 = new GameBroadcastingParams(j5, z9, z10, j6, i7, str5, j7, null);
                            long j8 = gameBroadcastingParams.f46691a;
                            boolean z11 = gameBroadcastingParams.b;
                            boolean z12 = gameBroadcastingParams.c;
                            long j9 = gameBroadcastingParams.d;
                            int i8 = gameBroadcastingParams.e;
                            String str6 = gameBroadcastingParams.f;
                            long j10 = gameBroadcastingParams.g;
                            str6.getClass();
                            if (!gameBroadcastingParams3.equals(new GameBroadcastingParams(j8, z11, z12, j9, i8, str6, j10, null))) {
                                int id2 = frameLayout.getId();
                                iOrdinal2 = btsVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    i2 = 1;
                                    if (iOrdinal2 == 1) {
                                        zss.d(eVarC, "video_fragment_tag");
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                i2 = 1;
                                zss.d(eVarC, "zone_fragment_tag");
                                zb5 zb5Var2 = new zb5(eVarC);
                                iOrdinal3 = btsVar.ordinal();
                                if (iOrdinal3 == 0) {
                                    jxs[] jxsVarArr2 = jxs.f17324a;
                                    fragmentM = sekVar.m(gameBroadcastingParams, new GameVideoUiConfig("16:9", R.dimen.corner_radius_12, -1, -1, GameVideoPlayerColorScheme.Static.f46687a));
                                } else {
                                    if (iOrdinal3 != i2) {
                                        t9f.b();
                                        return null;
                                    }
                                    bekVar.getClass();
                                    p0t.P1.getClass();
                                    p0t p0tVar2 = new p0t();
                                    p0tVar2.O1.J(p0tVar2, p0t.Q1[i2], gameBroadcastingParams);
                                    fragmentM = p0tVar2;
                                }
                                zb5Var2.o(id2, fragmentM, btsVar.f3198a);
                                zb5Var2.i();
                                frameLayout.post(new wss(frameLayout, (byte) 0));
                                pq8Var.f27402a = pair;
                            }
                        } else {
                            int id3 = frameLayout.getId();
                            iOrdinal2 = btsVar.ordinal();
                            if (iOrdinal2 != 0) {
                                i2 = 1;
                                if (iOrdinal2 == 1) {
                                    zss.d(eVarC, "video_fragment_tag");
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            i2 = 1;
                            zss.d(eVarC, "zone_fragment_tag");
                            zb5 zb5Var3 = new zb5(eVarC);
                            iOrdinal3 = btsVar.ordinal();
                            if (iOrdinal3 == 0) {
                                jxs[] jxsVarArr3 = jxs.f17324a;
                                fragmentM = sekVar.m(gameBroadcastingParams, new GameVideoUiConfig("16:9", R.dimen.corner_radius_12, -1, -1, GameVideoPlayerColorScheme.Static.f46687a));
                            } else {
                                if (iOrdinal3 != i2) {
                                    t9f.b();
                                    return null;
                                }
                                bekVar.getClass();
                                p0t.P1.getClass();
                                p0t p0tVar3 = new p0t();
                                p0tVar3.O1.J(p0tVar3, p0t.Q1[i2], gameBroadcastingParams);
                                fragmentM = p0tVar3;
                            }
                            zb5Var3.o(id3, fragmentM, btsVar.f3198a);
                            zb5Var3.i();
                            frameLayout.post(new wss(frameLayout, (byte) 0));
                            pq8Var.f27402a = pair;
                        }
                    }
                } else {
                    zss.d(eVarC, "video_fragment_tag");
                    zss.d(eVarC, "zone_fragment_tag");
                    pq8Var.f27402a = null;
                }
                return Unit.f46060a;
            case 9:
                r0x r0xVar = (r0x) obj7;
                String str7 = (String) obj6;
                Drawable drawable = (Drawable) obj5;
                List list5 = (List) obj3;
                Function1 function2 = (Function1) obj4;
                Function1 function3 = (Function1) obj2;
                ((Context) obj).getClass();
                r0xVar.f29650a.setVisibility((str7.length() <= 0 && drawable == null) ? 8 : 0);
                String str8 = str7.length() > 0 ? str7 : "";
                ImageView imageView = r0xVar.f29650a;
                gbe0 gbe0VarA = o5k0.a(imageView.getContext());
                k1x k1xVar = new k1x(imageView.getContext());
                k1xVar.c = str8;
                t1x.h(k1xVar, imageView);
                k1xVar.i = r0x.b(str8);
                k1xVar.f = r0x.b(str8);
                t1x.g(k1xVar, drawable);
                t1x.d(k1xVar, drawable);
                q1x.b(k1xVar, list5);
                vi9 vi9Var = vi9.c;
                k1xVar.n = vi9Var;
                k1xVar.m = vi9Var;
                k1xVar.o = vi9Var;
                k1xVar.e = new gxu(function2, r0xVar, function3);
                t1x.b(k1xVar, true);
                return gbe0VarA.a(k1xVar.a());
            case 10:
                a4x a4xVar2 = (a4x) obj7;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(a4xVar2.size(), null, new ap30(a4xVar2, (byte) 21), new ugd(2039820996, true, new w2m(a4xVar2, (Function0) obj6, (l7m0) obj5, (Function1) obj4, (vne) obj3, (xcz) obj2)));
                return Unit.f46060a;
            case 11:
                Function1 function4 = (Function1) obj4;
                Function0 function0 = (Function0) obj7;
                Function0 function5 = (Function0) obj6;
                Function0 function6 = (Function0) obj5;
                Function0 function7 = (Function0) obj3;
                Function1 function8 = (Function1) obj2;
                Context context = (Context) obj;
                context.getClass();
                hie0 hie0Var = new hie0();
                FixedWebView fixedWebView = new FixedWebView(context);
                siq fixedWebView2 = fixedWebView.getFixedWebView();
                if (fixedWebView2 != null) {
                    WebSettings settings = fixedWebView2.getSettings();
                    settings.setDomStorageEnabled(true);
                    settings.setJavaScriptEnabled(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                    settings.setAllowFileAccess(true);
                    settings.setBuiltInZoomControls(true);
                    fixedWebView2.setInitialScale(1);
                    TypedValue typedValue = j5d.f15927a;
                    fixedWebView2.setBackgroundColor(j5d.a(context, R.attr.uikitBackground, false));
                    fixedWebView2.setLayerType(2, null);
                }
                siq fixedWebView3 = fixedWebView.getFixedWebView();
                if (fixedWebView3 != null) {
                    fixedWebView3.setFixedWebViewClient(new v790(hie0Var, function0, function5, function8, function6, function7));
                }
                function4.invoke(fixedWebView);
                return fixedWebView;
            case 12:
                iva ivaVar = (iva) obj7;
                pz40 pz40Var = (pz40) obj6;
                pz40 pz40Var2 = (pz40) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                glo0 glo0Var = (glo0) obj3;
                pz40 pz40Var4 = (pz40) obj2;
                TableViewImpl tableViewImpl = (TableViewImpl) obj;
                tableViewImpl.getClass();
                if (((iva) pz40Var.getValue()) != ivaVar) {
                    pz40Var.setValue(ivaVar);
                    gva gvaVar = (gva) pz40Var2.getValue();
                    if (gvaVar != null) {
                        gvaVar.q(ivaVar.c, ivaVar.b, ivaVar.f15436a, ivaVar.e);
                    }
                    tableViewImpl.b(false, true);
                    TableViewImpl tableViewImpl2 = (TableViewImpl) pz40Var3.getValue();
                    if (tableViewImpl2 != null) {
                        tableViewImpl2.b(false, true);
                    }
                    tableViewImpl.post(new kjn(glo0Var, tableViewImpl, ivaVar, pz40Var3, pz40Var4, (byte) 2));
                }
                return Unit.f46060a;
            case 13:
                k3t0 k3t0Var = (k3t0) obj7;
                ii iiVar = (ii) obj6;
                q5j q5jVar = (q5j) obj5;
                wdk0 wdk0Var = (wdk0) obj4;
                roq0 roq0Var = (roq0) obj3;
                Fragment fragment = (Fragment) obj2;
                wza0 wza0Var = (wza0) obj;
                wza0Var.getClass();
                e9b0 e9b0Var = new e9b0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                if (wza0Var instanceof rza0) {
                    wq5 wq5Var = ((rza0) wza0Var).f31350a;
                    if (wq5Var instanceof tq5) {
                        e9b0Var.invoke(new kya0(((tq5) wq5Var).f34365a));
                    } else if (wq5Var instanceof uq5) {
                        uq5 uq5Var = (uq5) wq5Var;
                        e9b0Var.invoke(new lya0(uq5Var.f36102a, uq5Var.b));
                    } else {
                        if (!(wq5Var instanceof vq5)) {
                            t9f.b();
                            return null;
                        }
                        e9b0Var.invoke(new oya0(((vq5) wq5Var).f37839a));
                    }
                } else if (wza0Var instanceof vza0) {
                    vza0 vza0Var = (vza0) wza0Var;
                    ua80.r(fragment, iiVar, new DialogFields((CharSequence) vza0Var.f38289a, (CharSequence) vza0Var.b, (CharSequence) vza0Var.c, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
                } else if (wza0Var.equals(sza0.f33063a)) {
                    kxq kxqVarB = fragment.B();
                    if (kxqVarB != null && tdc.U(kxqVarB.r())) {
                        androidx.fragment.app.e eVarC2 = fragment.C();
                        eVarC2.getClass();
                        q5jVar.a(eVarC2);
                    }
                } else if (wza0Var.equals(uza0.f36528a)) {
                    kxq kxqVarB2 = fragment.B();
                    if (kxqVarB2 != null && tdc.U(kxqVarB2.r())) {
                        androidx.fragment.app.e eVarC3 = fragment.C();
                        eVarC3.getClass();
                        uuz uuzVar = fk60.b;
                        roq0Var.d(eVarC3, 31, "");
                    }
                } else {
                    if (!(wza0Var instanceof tza0)) {
                        t9f.b();
                        return null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((tza0) wza0Var).f34796a, null, null, null, null, 124), fragment, null, null, false, null, 1020);
                }
                k3t0Var.x(jya0.f17350a);
                return Unit.f46060a;
            case 14:
                String str9 = (String) obj2;
                ((vzg0) obj).getClass();
                List listA = ((luu) obj7).f20692a.a();
                iun iunVar3 = iun.f15405a;
                return new zob0(false, false, ((yiu) obj6).a(), ((pru) obj5).a().J1, ((ntu) obj4).f24118a.f15748a.j(), str9, ((ryu) obj3).a(str9), null, "", null, qob0.f29066a, listA, iunVar3, iunVar3);
            case 15:
                return a(obj);
            case 16:
                uyf0 uyf0Var = (uyf0) obj7;
                nyf0 nyf0Var = (nyf0) obj6;
                String str10 = (String) obj5;
                String str11 = (String) obj4;
                String str12 = (String) obj3;
                we50 we50Var = (we50) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                swp0 swp0Var2 = uyf0Var.f36485a;
                if (swp0Var2.c) {
                    sendConfirmationSMSScreen = nyf0Var.y.z0(new ConfirmRestoreByAuthenticatorType.Confirmation(str10, str11, str12, swp0Var2, uyf0Var.b, uyf0Var.c, we50Var));
                } else {
                    mi70 mi70Var2 = nyf0Var.x;
                    aci0 aci0Var = new aci0(str10, swp0Var2, uyf0Var.b, uyf0Var.c, false, str11, str12, false, we50Var);
                    mi70Var2.getClass();
                    sendConfirmationSMSScreen = new SendConfirmationSMSScreen(aci0Var);
                }
                k0w0Var2.h(sendConfirmationSMSScreen);
                return Unit.f46060a;
            case 17:
                t6k0 t6k0Var = (t6k0) obj7;
                AtomicReference atomicReference = t6k0Var.f;
                String str13 = (String) obj6;
                String str14 = (String) obj5;
                String str15 = (String) obj4;
                String str16 = (String) obj3;
                SipProvider sipProvider = (SipProvider) obj2;
                Response response = (Response) obj;
                response.getClass();
                r6k0 r6k0Var = t6k0Var.f33421a;
                try {
                    mmk mmkVarA = wti.A(response);
                    if (mmkVarA == null) {
                        y6k0 y6k0Var = new y6k0(false);
                        mz40 mz40Var = (mz40) atomicReference.get();
                        if (mz40Var != null) {
                            mz40Var.g(y6k0Var);
                        }
                    } else {
                        String str17 = "sip:" + str14;
                        nmk nmkVarC = t6k0Var.d.c(str13, t6k0Var.b, "REGISTER", str17, mmkVarA);
                        long j11 = t6k0Var.i + 1;
                        t6k0Var.i = j11;
                        Request requestI = t6k0Var.e.i(str13, str14, str15, str16, j11, t6k0Var.m, t6k0Var.n, 300);
                        HeaderFactory headerFactoryD = r6k0Var.d();
                        AddressFactory addressFactoryC = r6k0Var.c();
                        if (response.getStatusCode() == 407) {
                            authorizationHeaderCreateAuthorizationHeader = headerFactoryD.createProxyAuthorizationHeader("Digest");
                            authorizationHeaderCreateAuthorizationHeader.getClass();
                        } else {
                            authorizationHeaderCreateAuthorizationHeader = headerFactoryD.createAuthorizationHeader("Digest");
                            authorizationHeaderCreateAuthorizationHeader.getClass();
                        }
                        authorizationHeaderCreateAuthorizationHeader.setUsername(n7x.M(str13));
                        authorizationHeaderCreateAuthorizationHeader.setRealm(mmkVarA.f22041a);
                        authorizationHeaderCreateAuthorizationHeader.setNonce(mmkVarA.b);
                        authorizationHeaderCreateAuthorizationHeader.setURI(addressFactoryC.createURI(str17));
                        authorizationHeaderCreateAuthorizationHeader.setResponse(nmkVarC.f23776a);
                        authorizationHeaderCreateAuthorizationHeader.setAlgorithm(mmkVarA.c);
                        authorizationHeaderCreateAuthorizationHeader.setCNonce(nmkVarC.b);
                        authorizationHeaderCreateAuthorizationHeader.setNonceCount(Integer.parseInt(nmkVarC.c, CharsKt.checkRadix(16)));
                        authorizationHeaderCreateAuthorizationHeader.setQop(mmkVarA.d);
                        String str18 = mmkVarA.e;
                        if (str18 != null) {
                            authorizationHeaderCreateAuthorizationHeader.setParameter("opaque", str18);
                        }
                        requestI.addHeader(authorizationHeaderCreateAuthorizationHeader);
                        ClientTransaction newClientTransaction = sipProvider.getNewClientTransaction(requestI);
                        newClientTransaction.getClass();
                        newClientTransaction.sendRequest();
                        t6k0Var.c.f17078a.a("registerWithAuthSent", "REGISTER with Digest Auth sent");
                    }
                } catch (Exception unused) {
                    t6k0Var.g.set(false);
                    y6k0 y6k0Var2 = new y6k0(false);
                    mz40 mz40Var2 = (mz40) atomicReference.get();
                    if (mz40Var2 != null) {
                        mz40Var2.g(y6k0Var2);
                    }
                }
                return Unit.f46060a;
            case 18:
                return b(obj);
            default:
                rdo0 rdo0Var = (rdo0) obj7;
                Fragment fragment2 = (Fragment) obj6;
                wdk0 wdk0Var2 = (wdk0) obj5;
                k3t0 k3t0Var2 = (k3t0) obj4;
                v2t0 v2t0Var = (v2t0) obj3;
                ujd ujdVar = (ujd) obj2;
                eer0 eer0Var = (eer0) obj;
                rek0 rek0Var = rek0.b;
                eer0Var.getClass();
                if (eer0Var instanceof ydr0) {
                    if (rdo0Var != null) {
                        rdo0Var.f30299a.a(((ydr0) eer0Var).f42453a);
                    }
                } else if (eer0Var instanceof der0) {
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, ((der0) eer0Var).f5963a.f5512a, null, null, null, null, 124), fragment2, null, null, false, null, 1020);
                } else if (eer0Var instanceof cer0) {
                    String strH = fragment2.H(R.string.get_balance_list_error);
                    strH.getClass();
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), fragment2, null, null, false, null, 1020);
                } else if (eer0Var instanceof ber0) {
                    if (!((ber0) eer0Var).f2465a.equals(dw60.f6783a)) {
                        t9f.b();
                        return null;
                    }
                    String strH2 = fragment2.H(R.string.get_balance_list_error);
                    strH2.getClass();
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, strH2, null, null, null, null, 124), fragment2, null, null, false, null, 1020);
                } else if (eer0Var instanceof zdr0) {
                    tk0 tk0Var = ((zdr0) eer0Var).f44221a;
                    v2t0Var.getClass();
                    fragment2.getClass();
                    if (tk0Var instanceof qk0) {
                        wdk0 wdk0Var3 = v2t0Var.f36704a;
                        String strH3 = fragment2.H(R.string.connection_error);
                        strH3.getClass();
                        wdk0.k(wdk0Var3, new xdk0(rek0Var, strH3, null, null, null, null, 124), fragment2, null, null, false, null, 1020);
                    } else if (tk0Var instanceof sk0) {
                        ii iiVar2 = v2t0Var.b;
                        String strH4 = fragment2.H(R.string.error);
                        String strH5 = fragment2.H(R.string.casino_favorites_limit_error);
                        String strH6 = fragment2.H(R.string.ok_new);
                        strH6.getClass();
                        ua80.r(fragment2, iiVar2, new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528));
                    } else {
                        if (!(tk0Var instanceof rk0)) {
                            t9f.b();
                            return null;
                        }
                        wdk0.k(v2t0Var.f36704a, new xdk0(rek0Var, ((rk0) tk0Var).f30622a, null, null, null, null, 124), fragment2, null, null, false, null, 1020);
                    }
                } else {
                    if (!(eer0Var instanceof aer0)) {
                        t9f.b();
                        return null;
                    }
                    ujdVar.b(fragment2, ((aer0) eer0Var).f743a);
                }
                k3t0Var2.x(hxq0.f13823a);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bg0(a4x a4xVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5) {
        this.f2530a = (byte) 5;
        this.b = a4xVar;
        this.e = function1;
        this.c = function2;
        this.d = function3;
        this.f = function4;
        this.g = function5;
    }

    public /* synthetic */ bg0(l7m0 l7m0Var, Function2 function2, Function1 function1, Function1 function3, Function1 function4, Function2 function5) {
        this.f2530a = (byte) 6;
        this.b = l7m0Var;
        this.c = function2;
        this.e = function1;
        this.d = function3;
        this.f = function4;
        this.g = function5;
    }

    public /* synthetic */ bg0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.f2530a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ bg0(Function1 function1, Function0 function0, Function0 function2, Function0 function3, Function0 function4, Function1 function5) {
        this.f2530a = (byte) 11;
        this.e = function1;
        this.b = function0;
        this.c = function2;
        this.d = function3;
        this.f = function4;
        this.g = function5;
    }
}
