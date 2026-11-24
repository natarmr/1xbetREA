package a;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItem;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;
import org.xplatform.security.impl.presentation.otp_authenticator.OtpScreens$AddTwoFactoryAuthenticationScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zga0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44335a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zga0(g9b0 g9b0Var, String str, cp cpVar) {
        this.f44335a = (byte) 14;
        this.c = g9b0Var;
        this.b = cpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [a.pf10] */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
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
        kuw kuwVar;
        byte b = this.f44335a;
        byte b2 = 8;
        byte b3 = 10;
        byte b4 = 4;
        byte b5 = 19;
        byte b6 = 24;
        byte b7 = 23;
        byte b8 = 3;
        byte b9 = 20;
        ?? r14 = 0;
        numValueOf = null;
        Integer numValueOf = null;
        byte b10 = 1;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((gha0) ((hha0) obj3)).f11288a;
                hczVar.f(a4xVar.size(), new zu90((byte) 6, new er90((byte) 23), a4xVar), new ubn(a4xVar, b5), new ugd(802480018, true, new ws1(a4xVar, (Function1) obj2, b9)));
                return Unit.f46060a;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                List list = ((uja0) obj3).b.f;
                hczVar2.f(list.size(), new zu90((byte) 7, new er90((byte) 24), list), new a580(list, b7), new ugd(802480018, true, new a100(list, (Function1) obj2, b9)));
                return Unit.f46060a;
            case 2:
                n660 n660Var = (n660) obj3;
                jpa0 jpa0Var = (jpa0) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    n660Var.b = ((Boolean) jpa0Var.f().invoke(motionEvent)).booleanValue() ? ipa0.b : ipa0.c;
                } else {
                    jpa0Var.f().invoke(motionEvent);
                }
                return Unit.f46060a;
            case 3:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new b1w0(new gv60((ata0) obj3, (l9s) obj2, r14, b4))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 4:
                Function1 function1 = (Function1) obj2;
                dra0 dra0Var = (dra0) obj3;
                h2l0 h2l0Var = (h2l0) obj;
                h2l0Var.getClass();
                int iOrdinal = h2l0Var.ordinal();
                if (iOrdinal == 0) {
                    function1.invoke(new zpa0(new npn(dra0Var.f6550a, dra0Var.c, Long.valueOf(dra0Var.f), false), !dra0Var.g));
                } else if (iOrdinal == 1) {
                    function1.invoke(new rqa0(dra0Var.f6550a));
                }
                return Unit.f46060a;
            case 5:
                Function1 function2 = (Function1) obj2;
                ara0 ara0Var = (ara0) obj3;
                h2l0 h2l0Var2 = (h2l0) obj;
                h2l0Var2.getClass();
                if (jta0.f17090a[h2l0Var2.ordinal()] == 3) {
                    function2.invoke(new aqa0(ara0Var.f1336a, ara0Var.c));
                }
                return Unit.f46060a;
            case 6:
                Function1 function3 = (Function1) obj2;
                cra0 cra0Var = (cra0) obj3;
                h2l0 h2l0Var3 = (h2l0) obj;
                h2l0Var3.getClass();
                int iOrdinal2 = h2l0Var3.ordinal();
                if (iOrdinal2 == 0) {
                    function3.invoke(new zpa0(new npn(cra0Var.f4836a, cra0Var.c, Long.valueOf(cra0Var.f), cra0Var.g), !cra0Var.h));
                } else if (iOrdinal2 == 1) {
                    function3.invoke(new rqa0(cra0Var.f4836a));
                }
                return Unit.f46060a;
            case 7:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(((rua0) obj3).s.b(rua0.H, new m8h0("", xun.f41520a, false), (Set) obj2, -1L, ""));
                return Unit.f46060a;
            case 8:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(((f1b0) obj3).z.q(new er1(false, ((eoc0) obj2).e)));
                return Unit.f46060a;
            case 9:
                vh0 vh0Var = (vh0) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(((f1b0) obj3).z.q(new fr1(new fs80(vh0Var.b, vh0Var.f37408a, iun.f15405a, null, 0L, true, 88), null, 2)));
                return Unit.f46060a;
            case 10:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar2 = ((v2b0) obj3).f36675a;
                byte b11 = 21;
                hczVar3.f(a4xVar2.size(), new zu90(b3, new jfa0(b11), a4xVar2), new a580(a4xVar2, (byte) 27), new ugd(2039820996, true, new a100(a4xVar2, (Function1) obj2, b11)));
                return Unit.f46060a;
            case 11:
                vh0 vh0Var2 = (vh0) obj2;
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(((v3b0) obj3).t.q(new fr1(new fs80(vh0Var2.b, vh0Var2.f37408a, iun.f15405a, null, 0L, false, 120), null, 2)));
                return Unit.f46060a;
            case 12:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((v3b0) obj3).H(new d3b0((w4t) obj2, (byte) 0));
                th.printStackTrace();
                return Unit.f46060a;
            case 13:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(((v3b0) obj3).t.q(new er1(false, ((foc0) obj2).e)));
                return Unit.f46060a;
            case 14:
                g9b0 g9b0Var = (g9b0) obj3;
                ((View) obj).getClass();
                byte b12 = ((jm60) ((cp) obj2).u()).f16751a;
                i1w0 i1w0Var = g9b0Var.y;
                gw60 gw60Var = g9b0Var.C;
                hs60 hs60Var = g9b0Var.B;
                if (b12 == 1) {
                    i8i.D("point", "lucky_wheel", hs60Var.f13566a, "games_promos_popular_call");
                    s1p s1pVar = gw60Var.f12011a;
                    beb0[] beb0VarArr = beb0.f2441a;
                    s1pVar.a(cui0.b(new j1p("lucky_wheel", (byte) 0)), 12012L);
                    g9b0Var.w(s470.LUCKY_WHEEL.a());
                    i1w0Var.d(new j8b0(g9b0Var, (byte) 2));
                } else if (b12 == 2) {
                    i8i.D("point", "jackpot", hs60Var.f13566a, "games_promos_popular_call");
                    s1p s1pVar2 = gw60Var.f12011a;
                    beb0[] beb0VarArr2 = beb0.f2441a;
                    s1pVar2.a(cui0.b(new j1p("jackpot", (byte) 0)), 12012L);
                    i1w0Var.d(new j8b0(g9b0Var, b8));
                }
                return Unit.f46060a;
            case 15:
                ccb0 ccb0Var = (ccb0) obj3;
                pv40 pv40Var = (pv40) obj2;
                kjb0 kjb0Var = (kjb0) obj;
                mi70 mi70Var = ccb0.X1;
                rek0 rek0Var = rek0.b;
                kjb0Var.getClass();
                if (kjb0Var instanceof bjb0) {
                    bjb0 bjb0Var = (bjb0) kjb0Var;
                    String str = bjb0Var.b;
                    String str2 = bjb0Var.f2698a;
                    Bundle bundle = ccb0Var.g;
                    if (bundle == null) {
                        bundle = new Bundle();
                        ccb0Var.s0(bundle);
                    }
                    bundle.putString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", str);
                    ii iiVarG0 = ccb0Var.G0();
                    String strH = ccb0Var.H(R.string.attention);
                    String strH2 = ccb0Var.H(R.string.copy_info);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str2, (CharSequence) strH2, ccb0Var.H(R.string.ok), (String) null, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = ccb0Var.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                } else if (kjb0Var instanceof yib0) {
                    if (!((yib0) kjb0Var).f42680a.equals(ckv.f4527a)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0VarH0 = ccb0Var.H0();
                    String strH3 = ccb0Var.H(R.string.access_denied_with_bonus_currency_message);
                    strH3.getClass();
                    wdk0.k(wdk0VarH0, new xdk0(rek0Var, strH3, null, null, null, null, 124), ccb0Var, null, null, false, null, 1020);
                } else if (kjb0Var.equals(cjb0.f4453a)) {
                    r12 r12Var = ccb0Var.O1;
                    if (r12Var == null) {
                        Intrinsics.h("alertsPipeReceiver");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = ccb0Var.C();
                    eVarC2.getClass();
                    ((s12) r12Var).a(new q12(AlertsPipeType.KzFirstDepositBottom.f46313a, eVarC2, ""));
                } else if (kjb0Var instanceof hjb0) {
                    qog0 qog0VarD = m7x.P(ccb0Var, "android.permission.POST_NOTIFICATIONS", new String[0]).d();
                    boolean zR = n7x.r(n4c.J(qog0VarD.b, tx3.g0(qog0VarD.c)));
                    qog0VarD.e = new g8b0(ccb0Var, (byte) 2);
                    qog0VarD.f29072a.add(new s6b0(qog0VarD, ccb0Var, zR, b10));
                    qog0VarD.a();
                } else if (kjb0Var.equals(ijb0.f14866a)) {
                    pv40Var.getClass();
                    pv40Var.e.g(new Pair(((hgk0) pv40Var.d).getValue(), slb0.f32391a));
                } else if (kjb0Var.equals(ajb0.f966a)) {
                    ii iiVarG1 = ccb0Var.G0();
                    String strH4 = ccb0Var.H(R.string.add_event_btn_text);
                    String strH5 = ccb0Var.H(R.string.edit_coupon_add_event_dialog_desc);
                    String strH6 = ccb0Var.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, ccb0Var.H(R.string.cancel), (String) null, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC3 = ccb0Var.C();
                    eVarC3.getClass();
                    iiVarG1.d(dialogFields2, eVarC3);
                } else if (kjb0Var instanceof jjb0) {
                    wdk0.k(ccb0Var.H0(), new xdk0(rek0Var, ((jjb0) kjb0Var).f16613a, null, null, null, null, 124), ccb0Var, null, null, false, null, 1020);
                } else if (kjb0Var.equals(djb0.f6177a)) {
                    r12 r12Var2 = ccb0Var.O1;
                    if (r12Var2 == null) {
                        Intrinsics.h("alertsPipeReceiver");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC4 = ccb0Var.C();
                    eVarC4.getClass();
                    ((s12) r12Var2).a(new q12(AlertsPipeType.IdentificationAlertKzAlert.f46312a, eVarC4, "KZ_IDENTIFICATION_ALERT_REQUEST_KEY"));
                    ccb0Var.I0().x(xxa0.f41648a);
                } else if (kjb0Var instanceof ejb0) {
                    String str3 = ((ejb0) kjb0Var).f7901a;
                    ii iiVarG2 = ccb0Var.G0();
                    String strH7 = ccb0Var.H(R.string.min_age_alert_title_attention);
                    String strH8 = ccb0Var.H(R.string.min_age_alert_accept);
                    strH8.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str3, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC5 = ccb0Var.C();
                    eVarC5.getClass();
                    iiVarG2.d(dialogFields3, eVarC5);
                } else if (kjb0Var.equals(fjb0.f9632a)) {
                    ii iiVarG3 = ccb0Var.G0();
                    String strH9 = ccb0Var.H(R.string.switch_on_notification_info_message);
                    String strH10 = ccb0Var.H(R.string.go_to);
                    strH10.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) null, (CharSequence) strH9, (CharSequence) strH10, (String) null, (String) null, "SWITCH_ON_NOTIFICATION_INFO_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1497);
                    androidx.fragment.app.e eVarC6 = ccb0Var.C();
                    eVarC6.getClass();
                    iiVarG3.d(dialogFields4, eVarC6);
                } else if (kjb0Var.equals(gjb0.f11390a)) {
                    int i = hvo0.k2;
                    androidx.fragment.app.e eVarC7 = ccb0Var.C();
                    eVarC7.getClass();
                    if (eVarC7.J("TaxInfoDialog") == null) {
                        new hvo0().H0(eVarC7, "TaxInfoDialog");
                    }
                } else {
                    if (!kjb0Var.equals(zib0.f44432a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVarG4 = ccb0Var.G0();
                    String strH11 = ccb0Var.H(R.string.alert_2fa_title);
                    String strH12 = ccb0Var.H(R.string.alert_2fa_text);
                    String strH13 = ccb0Var.H(R.string.go_to);
                    strH13.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, ccb0Var.H(R.string.close), (String) null, "KEY_2FA_ALERT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC8 = ccb0Var.C();
                    eVarC8.getClass();
                    iiVarG4.d(dialogFields5, eVarC8);
                }
                ccb0Var.I0().x(gxa0.f12070a);
                return Unit.f46060a;
            case 16:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                c8d c8dVar2 = (c8d) k0w0Var7.b(new b1w0(new gv60((tjb0) obj3, (rbb) obj2, r14, (byte) 5))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 17:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar3 = ((l0b0) obj3).f19192a;
                hczVar4.f(a4xVar3.size(), new zu90((byte) 16, new j3b0(b2), a4xVar3), new a580(a4xVar3, (byte) 28), new ugd(2039820996, true, new a100(a4xVar3, (Function1) obj2, b7)));
                return Unit.f46060a;
            case 18:
                k0w0 k0w0Var8 = (k0w0) obj;
                boolean z = ((m2c0) obj3).a0;
                svs0 svs0Var = ((pmb0) obj2).f0;
                if (z) {
                    svs0Var.getClass();
                    k0w0Var8.h(new TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1(true));
                } else {
                    svs0Var.getClass();
                    k0w0Var8.h(new OtpScreens$AddTwoFactoryAuthenticationScreen());
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                zrb0 zrb0Var = (zrb0) obj3;
                Function0 function0 = (Function0) obj2;
                ((View) obj).getClass();
                DsSearchField dsSearchField = zrb0Var.k;
                if (dsSearchField.getVisibility() == 0) {
                    dsSearchField.getEditText().clearFocus();
                    TextInputEditText editText = dsSearchField.getEditText();
                    editText.getClass();
                    editText.setText("");
                    dsSearchField.setVisibility(8);
                    dsSearchField.c();
                    zrb0Var.l.setVisibility(0);
                    zrb0Var.n.a();
                    zrb0Var.i.invoke();
                    Function1 function4 = zrb0Var.j;
                    if (function4 != null) {
                        function4.invoke(Boolean.FALSE);
                    }
                } else {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 20:
                rb5 rb5Var = (rb5) obj3;
                ckd ckdVar = (ckd) obj2;
                rb5Var.a(ckdVar);
                return new pr0((Object) rb5Var, (Object) ckdVar, (byte) 18);
            case 21:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                ((vsb0) obj3).b.U(qpg0Var, (usb0) obj2);
                return Unit.f46060a;
            case 22:
                dyb0 dyb0Var = (dyb0) obj2;
                ((View) obj).getClass();
                int iD = ((cyb0) obj3).d();
                if (iD != -1) {
                    vxb0 vxb0Var = (vxb0) dyb0Var.e.get(iD);
                    r14 = vxb0Var instanceof txb0 ? (txb0) vxb0Var : 0;
                    if (r14 != 0) {
                        dyb0Var.d.invoke(r14);
                    }
                }
                return Unit.f46060a;
            case 23:
                ((View) obj).getClass();
                ((e9b0) obj3).invoke(((ProfileEditUiModelItemClickable) ((cp) obj2).u()).f46791a);
                return Unit.f46060a;
            case 24:
                cp cpVar = (cp) obj2;
                Editable editable = (Editable) obj;
                editable.getClass();
                ((yn90) obj3).invoke(((ProfileEditUiModelItem) cpVar.u()).f46788a, editable.toString());
                vwx vwxVar = (vwx) cpVar.u;
                vwxVar.b.setErrorText("");
                vwxVar.b.f(false);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                k0w0 k0w0Var9 = (k0w0) obj;
                k0w0Var9.getClass();
                mi70 mi70Var2 = ((b2c0) obj3).w;
                xbi0 xbi0Var = new xbi0(((m2c0) obj2).Z, 25, false);
                mi70Var2.getClass();
                k0w0Var9.h(new SendConfirmationSMSScreen(xbi0Var));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Drawable drawable = (Drawable) obj;
                drawable.getClass();
                Boolean bool = (Boolean) ((Function2) obj3).invoke(drawable, (m4c0) obj2);
                bool.getClass();
                return bool;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                bg5 bg5Var = new bg5();
                gbn gbnVar = new gbn(new ksc0(b4), new o5c0(b8, (byte) 13), new ljc0(b3), x4c0.p);
                dp dpVar = bg5Var.d;
                dpVar.b(gbnVar);
                dpVar.b(m2x.A((String) obj3, (l8c0) obj2));
                ((l2k) cpVar2.u).b.setAdapter(bg5Var);
                cpVar2.t(new if6(cpVar2, bg5Var, cpVar2, bg5Var, (byte) 7));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                v2k v2kVar = (v2k) cpVar3.u;
                v2kVar.b.setOnItemClickListener(new p0z(obj3, (byte) 26));
                v2kVar.c.setButtonClickListener(new l910((b0c0) obj2, b6));
                cpVar3.t(new ctv(cpVar3, cpVar3, b5));
                return Unit.f46060a;
            default:
                org.xplatform.feature.promo_aggregator.impl.presentation.compose.b bVar = (org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                bVar.t.b(th2, new r7a0(bVar, (String) obj2, b9));
                zhi0 zhi0Var = th2 instanceof zhi0 ? (zhi0) th2 : null;
                if (zhi0Var != null && (kuwVar = zhi0Var.c) != null) {
                    numValueOf = Integer.valueOf(kuwVar.getErrorCode());
                }
                b4j b4jVar = bVar.v;
                String strValueOf = String.valueOf(numValueOf);
                b4jVar.getClass();
                i8i.D("error_code", strValueOf, b4jVar.f1961a, "promocode_activate_error");
                ix0 ix0Var = bVar.w;
                if (numValueOf != null) {
                    ix0Var.f15516a.a(cui0.b(new i1p(numValueOf)), 3093L);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zga0(Object obj, Object obj2, byte b) {
        this.f44335a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ zga0(Function1 function1, era0 era0Var, byte b) {
        this.f44335a = b;
        this.b = function1;
        this.c = era0Var;
    }
}
