package a;

import android.content.Intent;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorJackpotBottomSheetParams;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xj80 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj80(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f40976a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence charSequence;
        boolean z;
        boolean z2;
        CharSequence charSequence2;
        byte b = this.f40976a;
        nb0 nb0Var = nb0.f23215a;
        byte b2 = 4;
        byte b3 = 1;
        byte b4 = 0;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ek80 ek80Var = (ek80) this.receiver;
                if (th instanceof CancellationException) {
                    ek80Var.getClass();
                } else {
                    List list = (List) ((p7m0) ((cyu) ek80Var.f7941a.b).c).getValue();
                    p7m0 p7m0Var = ek80Var.e;
                    rl80 rl80Var = new rl80(th, list);
                    p7m0Var.getClass();
                    p7m0Var.o(null, rl80Var);
                }
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((fk80) this.receiver).c(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((fk80) this.receiver).c(th3);
                return Unit.f46060a;
            case 3:
                qn80 qn80Var = (qn80) obj;
                qn80Var.getClass();
                ((tn80) this.receiver).x(qn80Var);
                return Unit.f46060a;
            case 4:
                qn80 qn80Var2 = (qn80) obj;
                qn80Var2.getClass();
                ((tn80) this.receiver).x(qn80Var2);
                return Unit.f46060a;
            case 5:
                qs80 qs80Var = (qs80) obj;
                qs80Var.getClass();
                as80 as80Var = (as80) this.receiver;
                fl70 fl70Var = as80.Y1;
                as80Var.getClass();
                if (qs80Var instanceof os80) {
                    String str = ((os80) qs80Var).f25771a;
                    wdk0 wdk0Var = as80Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), as80Var, null, null, false, null, 1020);
                } else if (qs80Var instanceof ms80) {
                    qcc.c0(as80Var);
                } else if (qs80Var instanceof ps80) {
                    String str2 = ((ps80) qs80Var).f27504a;
                    ii iiVar = as80Var.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = as80Var.H(R.string.error);
                    String strH2 = as80Var.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str2, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = as80Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (qs80Var instanceof js80) {
                    ob0 ob0Var = ((js80) qs80Var).f17039a;
                    if (ob0Var instanceof mb0) {
                        String str3 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = as80Var.Q1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC2 = as80Var.C();
                        eVarC2.getClass();
                        ynb.b(ynbVar, bm5Var, str3, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var instanceof lb0) {
                        kxq kxqVarB = as80Var.B();
                        if (kxqVarB != null) {
                            ii iiVar2 = as80Var.O1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = kxqVarB.getString(R.string.attention);
                            String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string3 = kxqVarB.getString(R.string.ok);
                            string3.getClass();
                            iiVar2.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else {
                        if (!ob0Var.equals(nb0Var)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = as80Var.B();
                        if (kxqVarB2 != null) {
                            ii iiVar3 = as80Var.O1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string4 = kxqVarB2.getString(R.string.attention);
                            String string5 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string6 = kxqVarB2.getString(R.string.ok);
                            string6.getClass();
                            iiVar3.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                } else if (qs80Var instanceof ks80) {
                    kxq kxqVarB3 = as80Var.B();
                    if (kxqVarB3 != null && tdc.U(kxqVarB3.r())) {
                        ks80 ks80Var = (ks80) qs80Var;
                        AggregatorJackpotBottomSheetParams aggregatorJackpotBottomSheetParams = new AggregatorJackpotBottomSheetParams(ks80Var.f18802a, ks80Var.b);
                        jdk0 jdk0Var = z31.n2;
                        androidx.fragment.app.e eVarC3 = as80Var.C();
                        eVarC3.getClass();
                        jdk0Var.getClass();
                        if (eVarC3.J("AGGREGATOR_JACKPOT_TAG") == null) {
                            z31 z31Var = new z31();
                            z31Var.k2.J(z31Var, z31.o2[0], aggregatorJackpotBottomSheetParams);
                            z31Var.H0(eVarC3, "AGGREGATOR_JACKPOT_TAG");
                        }
                    }
                } else if (qs80Var.equals(ls80.f20565a)) {
                    kxq kxqVarB4 = as80Var.B();
                    if (kxqVarB4 != null && tdc.U(kxqVarB4.r())) {
                        as80Var.H0().x(xq80.f41303a);
                    }
                } else {
                    if (!qs80Var.equals(ns80.f24041a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar4 = as80Var.O1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH3 = as80Var.H(R.string.error);
                    String strH4 = as80Var.H(R.string.game_not_available_now);
                    String strH5 = as80Var.H(R.string.ok);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC4 = as80Var.C();
                    eVarC4.getClass();
                    iiVar4.d(dialogFields2, eVarC4);
                }
                as80Var.H0().x(uq80.f36107a);
                return Unit.f46060a;
            case 6:
                lr80 lr80Var = (lr80) obj;
                lr80Var.getClass();
                ((jt80) this.receiver).x(lr80Var);
                return Unit.f46060a;
            case 7:
                xu80 xu80Var = (xu80) obj;
                xu80Var.getClass();
                ou80 ou80Var = (ou80) this.receiver;
                rl70 rl70Var = ou80.V1;
                ou80Var.getClass();
                if (xu80Var instanceof vu80) {
                    String str4 = ((vu80) xu80Var).f38036a;
                    wdk0 wdk0Var2 = ou80Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, str4, null, null, null, null, 124), ou80Var, null, null, false, null, 1020);
                } else if (xu80Var instanceof tu80) {
                    qcc.c0(ou80Var);
                } else if (xu80Var instanceof wu80) {
                    String str5 = ((wu80) xu80Var).f39778a;
                    ii iiVar5 = ou80Var.N1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH6 = ou80Var.H(R.string.error);
                    String strH7 = ou80Var.H(R.string.ok_new);
                    strH7.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) str5, (CharSequence) strH7, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC5 = ou80Var.C();
                    eVarC5.getClass();
                    iiVar5.d(dialogFields3, eVarC5);
                } else if (xu80Var instanceof su80) {
                    ob0 ob0Var2 = ((su80) xu80Var).f32809a;
                    if (ob0Var2 instanceof mb0) {
                        String str6 = ((mb0) ob0Var2).f21481a;
                        ynb ynbVar2 = ou80Var.P1;
                        if (ynbVar2 == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var2 = bm5.e;
                        androidx.fragment.app.e eVarC6 = ou80Var.C();
                        eVarC6.getClass();
                        ynb.b(ynbVar2, bm5Var2, str6, eVarC6, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var2 instanceof lb0) {
                        kxq kxqVarB5 = ou80Var.B();
                        if (kxqVarB5 != null) {
                            ii iiVar6 = ou80Var.N1;
                            if (iiVar6 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string7 = kxqVarB5.getString(R.string.attention);
                            String string8 = kxqVarB5.getString(R.string.casino_guard_notify_description);
                            String string9 = kxqVarB5.getString(R.string.ok);
                            string9.getClass();
                            iiVar6.d(new DialogFields((CharSequence) string7, (CharSequence) string8, (CharSequence) string9, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB5.r());
                        }
                    } else {
                        if (!ob0Var2.equals(nb0Var)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB6 = ou80Var.B();
                        if (kxqVarB6 != null) {
                            ii iiVar7 = ou80Var.N1;
                            if (iiVar7 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string10 = kxqVarB6.getString(R.string.attention);
                            String string11 = kxqVarB6.getString(R.string.selected_balance_unavailable_description);
                            String string12 = kxqVarB6.getString(R.string.ok);
                            string12.getClass();
                            iiVar7.d(new DialogFields((CharSequence) string10, (CharSequence) string11, (CharSequence) string12, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB6.r());
                        }
                    }
                } else {
                    if (!xu80Var.equals(uu80.f36288a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar8 = ou80Var.N1;
                    if (iiVar8 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH8 = ou80Var.H(R.string.error);
                    String strH9 = ou80Var.H(R.string.game_not_available_now);
                    String strH10 = ou80Var.H(R.string.ok);
                    strH10.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC7 = ou80Var.C();
                    eVarC7.getClass();
                    iiVar8.d(dialogFields4, eVarC7);
                }
                ou80Var.G0().x(pt80.f27551a);
                return Unit.f46060a;
            case 8:
                cu80 cu80Var = (cu80) obj;
                cu80Var.getClass();
                ((k3t0) this.receiver).x(cu80Var);
                return Unit.f46060a;
            case 9:
                zy80 zy80Var = (zy80) obj;
                zy80Var.getClass();
                uy80 uy80Var = (uy80) this.receiver;
                jh70 jh70Var = uy80.W1;
                if (zy80Var instanceof xy80) {
                    String str7 = ((xy80) zy80Var).f41695a;
                    wdk0 wdk0Var3 = uy80Var.L1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, new xdk0(rek0.b, str7, null, null, null, null, 124), uy80Var, null, null, false, null, 1020);
                } else {
                    uy80Var.getClass();
                    if (!zy80Var.equals(yy80.f43455a)) {
                        t9f.b();
                        return null;
                    }
                    if (uy80Var.M1 == null) {
                        Intrinsics.h("tipsDialogFeature");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC8 = uy80Var.C();
                    eVarC8.getClass();
                    uuz uuzVar = fk60.b;
                    ki60.q2.getClass();
                    if (eVarC8.J("OnboardingBottomSheetContainerFragment") == null) {
                        ki60 ki60Var = new ki60();
                        iiy[] iiyVarArr = ki60.r2;
                        ki60Var.n2.I(ki60Var, iiyVarArr[1], 26);
                        ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                        sj3.E0(ki60Var, eVarC8, "OnboardingBottomSheetContainerFragment");
                    }
                }
                uy80Var.G0().x(cy80.f5161a);
                return Unit.f46060a;
            case 10:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((duj) this.receiver).a(th4);
                return Unit.f46060a;
            case 11:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((duj) this.receiver).a(th5);
                return Unit.f46060a;
            case 12:
                w690 w690Var = (w690) obj;
                w690Var.getClass();
                l590 l590Var = (l590) this.receiver;
                nh70 nh70Var = l590.Y1;
                l590Var.getClass();
                if (w690Var instanceof v690) {
                    v690 v690Var = (v690) w690Var;
                    String str8 = v690Var.f36865a;
                    String[] strArr = v690Var.b;
                    l590Var.R1 = new File(str8);
                    Uri uriC = FileProvider.c(l590Var.o0(), new File(str8), ohs0.n(l590Var.n0().getPackageName(), ".provider"));
                    uriC.getClass();
                    Intent intentC = v3a.c(uriC);
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
                    strArr.getClass();
                    Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                    intent2.addCategory("android.intent.category.OPENABLE");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", strArr);
                    intent2.setType("application/pdf");
                    Intent[] intentArr = intentC.getAction() != null ? new Intent[]{intentC, intent2} : new Intent[]{intent2};
                    Intent intentCreateChooser = Intent.createChooser(intent, "File Chooser");
                    intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                    try {
                        l590Var.S1.a(intentCreateChooser);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                } else if (w690Var instanceof t690) {
                    boolean z3 = ((t690) w690Var).f33406a;
                    FixedWebView fixedWebView = l590Var.N1;
                    if (fixedWebView != null && fixedWebView.b()) {
                        WebView.setWebContentsDebuggingEnabled(z3);
                    }
                } else {
                    if (!(w690Var instanceof u690)) {
                        t9f.b();
                        return null;
                    }
                    l590Var.P1 = (u690) w690Var;
                    l590Var.H0();
                }
                return Unit.f46060a;
            case 13:
                c590 c590Var = (c590) obj;
                c590Var.getClass();
                ((k3t0) this.receiver).x(c590Var);
                return Unit.f46060a;
            case 14:
                ea90 ea90Var = (ea90) obj;
                ea90Var.getClass();
                r790 r790Var = (r790) this.receiver;
                xi70 xi70Var = r790.Z1;
                r790Var.getClass();
                if (ea90Var.equals(x990.f40500a)) {
                    ii iiVar9 = r790Var.G0().s;
                    DialogFields dialogFields5 = new DialogFields((CharSequence) r790Var.G0().o.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.payment_balance_error, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), r790Var.G0().o.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "BONUS_LISTENER", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC9 = r790Var.C();
                    eVarC9.getClass();
                    iiVar9.d(dialogFields5, eVarC9);
                } else if (ea90Var.equals(y990.f42234a)) {
                    ii iiVar10 = r790Var.G0().s;
                    DialogFields dialogFields6 = new DialogFields((CharSequence) r790Var.G0().o.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, "ERROR_DIALOG_LISTENER", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC10 = r790Var.C();
                    eVarC10.getClass();
                    iiVar10.d(dialogFields6, eVarC10);
                } else if (ea90Var.equals(z990.f44007a)) {
                    ii iiVar11 = r790Var.G0().s;
                    DialogFields dialogFields7 = new DialogFields((CharSequence) r790Var.G0().o.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.pass_verification_documents, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), r790Var.G0().o.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "NEED_VERIFICATION_LISTENER", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC11 = r790Var.C();
                    eVarC11.getClass();
                    iiVar11.d(dialogFields7, eVarC11);
                } else if (ea90Var.equals(ba90.f2248a)) {
                    ii iiVar12 = r790Var.G0().s;
                    pv00 pv00Var = r790Var.G0().t;
                    DialogFields dialogFields8 = new DialogFields((CharSequence) r790Var.G0().o.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.validate_user_error, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.logout, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    tx00.l2.getClass();
                    tx00 tx00VarG = evz.g(dialogFields8, false, false, false);
                    androidx.fragment.app.e eVarC12 = r790Var.C();
                    eVarC12.getClass();
                    iiVar12.c(tx00VarG, eVarC12);
                } else if (ea90Var.equals(ca90.f3998a)) {
                    ii iiVar13 = r790Var.G0().s;
                    DialogFields dialogFields9 = new DialogFields((CharSequence) r790Var.G0().o.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.documents_send_verification_result_by_email, Arrays.copyOf(new Object[0], 0)), (CharSequence) r790Var.G0().o.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, "VERIFICATION_LISTENER", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC13 = r790Var.C();
                    eVarC13.getClass();
                    iiVar13.d(dialogFields9, eVarC13);
                } else if (ea90Var instanceof v990) {
                    try {
                        r790Var.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(((v990) ea90Var).f37024a)));
                    } catch (Exception unused) {
                        r790Var.L0(r790Var.G0().o.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0)), da90.b);
                    }
                    break;
                } else if (ea90Var instanceof s990) {
                    PaymentWebView paymentWebView = r790Var.U1;
                    if (paymentWebView != null) {
                        String str9 = ((s990) ea90Var).f31843a;
                        siq siqVar = paymentWebView.f47221a;
                        if (siqVar != null) {
                            siqVar.evaluateJavascript(str9, null);
                        }
                    }
                } else if (ea90Var instanceof w990) {
                    PaymentWebView paymentWebView2 = r790Var.U1;
                    if (paymentWebView2 != null) {
                        w990 w990Var = (w990) ea90Var;
                        paymentWebView2.d(w990Var.f38769a, w990Var.b);
                    }
                } else if (ea90Var instanceof aa90) {
                    aa90 aa90Var = (aa90) ea90Var;
                    r790Var.L0(aa90Var.f515a, aa90Var.b);
                } else if (ea90Var instanceof u990) {
                    u990 u990Var = (u990) ea90Var;
                    String str10 = u990Var.f35273a;
                    String str11 = u990Var.b;
                    qog0 qog0Var = (qog0) r790Var.Q1.getValue();
                    if (qog0Var != null) {
                        qog0Var.f29072a.add(new q790(qog0Var, str10, r790Var, str11, (byte) 0));
                        qog0Var.a();
                    }
                } else {
                    if (!(ea90Var instanceof t990)) {
                        t9f.b();
                        return null;
                    }
                    t990 t990Var = (t990) ea90Var;
                    n6x.i0(r790Var.n0(), r790Var.G0().u, r790Var.G0().o.b.a(t990Var.f33551a, Arrays.copyOf(new Object[0], 0)), t990Var.b, t990Var.c);
                }
                r790Var.I0().x(a490.f213a);
                return Unit.f46060a;
            case 15:
                q490 q490Var = (q490) obj;
                q490Var.getClass();
                ((k3t0) this.receiver).x(q490Var);
                return Unit.f46060a;
            case 16:
                ValueCallback valueCallback = (ValueCallback) obj;
                valueCallback.getClass();
                r790 r790Var2 = (r790) this.receiver;
                xi70 xi70Var2 = r790.Z1;
                ValueCallback valueCallback2 = r790Var2.S1;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                r790Var2.S1 = valueCallback;
                qog0 qog0Var2 = (qog0) r790Var2.P1.getValue();
                if (qog0Var2 != null) {
                    qog0Var2.f29072a.add(new lz9(qog0Var2, r790Var2, b2));
                    qog0Var2.a();
                }
                return Unit.f46060a;
            case 17:
                PermissionRequest permissionRequest = (PermissionRequest) obj;
                permissionRequest.getClass();
                r790 r790Var3 = (r790) this.receiver;
                xi70 xi70Var3 = r790.Z1;
                if (jiq0.j0(r790Var3.o0(), "android.permission.CAMERA") != 0) {
                    qog0 qog0Var3 = (qog0) r790Var3.R1.getValue();
                    if (qog0Var3 != null) {
                        qog0Var3.f29072a.add(new p790(qog0Var3, permissionRequest, r790Var3, (byte) 0));
                        qog0Var3.a();
                    }
                } else {
                    permissionRequest.grant(permissionRequest.getResources());
                }
                return Unit.f46060a;
            case 18:
                Intent intent3 = (Intent) obj;
                intent3.getClass();
                r790 r790Var4 = (r790) this.receiver;
                xi70 xi70Var4 = r790.Z1;
                r790Var4.getClass();
                try {
                    r790Var4.w0(intent3);
                    break;
                } catch (Exception unused2) {
                    r790Var4.L0(r790Var4.G0().o.b.a(R.string.intent_app_not_installed, Arrays.copyOf(new Object[0], 0)), da90.b);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Intent intent4 = (Intent) obj;
                intent4.getClass();
                r790 r790Var5 = (r790) this.receiver;
                xi70 xi70Var5 = r790.Z1;
                r790Var5.getClass();
                try {
                    r790Var5.w0(intent4);
                    break;
                } catch (Exception unused3) {
                    r790Var5.L0(r790Var5.G0().o.b.a(R.string.intent_app_not_installed, Arrays.copyOf(new Object[0], 0)), da90.b);
                }
                r790Var5.I0().x(j490.f15873a);
                return Unit.f46060a;
            case 20:
                PaymentWebView paymentWebView3 = (PaymentWebView) obj;
                paymentWebView3.getClass();
                final r790 r790Var6 = (r790) this.receiver;
                xi70 xi70Var6 = r790.Z1;
                r790Var6.U1 = paymentWebView3;
                final byte b5 = 0;
                paymentWebView3.setOnWebViewErrorListener$impl(new Function1() { // from class: a.l790
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b6 = b5;
                        r790 r790Var7 = r790Var6;
                        switch (b6) {
                            case 0:
                                jb90 jb90Var = (jb90) obj2;
                                xi70 xi70Var7 = r790.Z1;
                                jb90Var.getClass();
                                new ojj(r790Var7.G0().w, (byte) 1).b(jb90Var);
                                break;
                            default:
                                String str12 = (String) obj2;
                                xi70 xi70Var8 = r790.Z1;
                                str12.getClass();
                                r790Var7.I0().x(new m490(str12));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                siq fixedWebView2 = paymentWebView3.getFixedWebView();
                if (fixedWebView2 != null) {
                    final byte b6 = 1;
                    fixedWebView2.addJavascriptInterface(new l3v0(new m790(r790Var6, b5), new Function1() { // from class: a.l790
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b7 = b6;
                            r790 r790Var7 = r790Var6;
                            switch (b7) {
                                case 0:
                                    jb90 jb90Var = (jb90) obj2;
                                    xi70 xi70Var7 = r790.Z1;
                                    jb90Var.getClass();
                                    new ojj(r790Var7.G0().w, (byte) 1).b(jb90Var);
                                    break;
                                default:
                                    String str12 = (String) obj2;
                                    xi70 xi70Var8 = r790.Z1;
                                    str12.getClass();
                                    r790Var7.I0().x(new m490(str12));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, r790Var6.G0().v), "paymentWebHandler");
                }
                return Unit.f46060a;
            case 21:
                b890 b890Var = (b890) obj;
                b890Var.getClass();
                x790 x790Var = (x790) this.receiver;
                fl70 fl70Var2 = x790.V1;
                x790Var.getClass();
                a8z a8zVar = x790Var.O1;
                if (!(b890Var instanceof y790)) {
                    if (b890Var.equals(z790.f43907a)) {
                        FixedWebView fixedWebView3 = x790Var.U1;
                        if (fixedWebView3 != null) {
                            fixedWebView3.g();
                        }
                    } else {
                        if (!(b890Var instanceof a890)) {
                            t9f.b();
                            return null;
                        }
                        try {
                            x790Var.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(((a890) b890Var).f416a)));
                        } catch (Exception unused4) {
                            wdk0 wdk0Var4 = x790Var.M1;
                            if (wdk0Var4 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            rek0 rek0Var = rek0.b;
                            String strH11 = x790Var.H(R.string.intent_app_not_installed);
                            strH11.getClass();
                            wdk0.k(wdk0Var4, new xdk0(rek0Var, strH11, null, null, null, null, 124), x790Var, null, null, false, null, 1020);
                        }
                        ((k3t0) a8zVar.getValue()).x(x390.f40207a);
                    }
                    break;
                } else {
                    WebView.setWebContentsDebuggingEnabled(((y790) b890Var).f42143a);
                }
                ((k3t0) a8zVar.getValue()).x(r390.f29776a);
                return Unit.f46060a;
            case 22:
                z390 z390Var = (z390) obj;
                z390Var.getClass();
                ((k3t0) this.receiver).x(z390Var);
                return Unit.f46060a;
            case 23:
                FixedWebView fixedWebView4 = (FixedWebView) obj;
                fixedWebView4.getClass();
                x790 x790Var2 = (x790) this.receiver;
                fl70 fl70Var3 = x790.V1;
                x790Var2.U1 = fixedWebView4;
                return Unit.f46060a;
            case 24:
                Intent intent5 = (Intent) obj;
                intent5.getClass();
                o890 o890Var = (o890) this.receiver;
                jh70 jh70Var2 = o890.f2;
                o890Var.R0(intent5);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Intent intent6 = (Intent) obj;
                intent6.getClass();
                o890 o890Var2 = (o890) this.receiver;
                jh70 jh70Var3 = o890.f2;
                o890Var2.R0(intent6);
                o890Var2.M0().A();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ValueCallback valueCallback3 = (ValueCallback) obj;
                valueCallback3.getClass();
                o890 o890Var3 = (o890) this.receiver;
                jh70 jh70Var4 = o890.f2;
                ValueCallback valueCallback4 = o890Var3.Z1;
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(null);
                }
                o890Var3.Z1 = valueCallback3;
                o890Var3.G0();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                PermissionRequest permissionRequest2 = (PermissionRequest) obj;
                permissionRequest2.getClass();
                o890 o890Var4 = (o890) this.receiver;
                jh70 jh70Var5 = o890.f2;
                o890Var4.a2 = permissionRequest2;
                if (jiq0.j0(o890Var4.o0(), "android.permission.CAMERA") != 0) {
                    o890Var4.H0(permissionRequest2);
                } else {
                    permissionRequest2.grant(permissionRequest2.getResources());
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                String str12 = (String) obj;
                str12.getClass();
                o890 o890Var5 = (o890) this.receiver;
                jh70 jh70Var6 = o890.f2;
                if (o890Var5.Z) {
                    charSequence = "/onpay/withdraw/cancel";
                    z = false;
                } else {
                    rek0 rek0Var2 = rek0.b;
                    qek0 qek0Var = qek0.f28589a;
                    pek0 pek0Var = pek0.f26859a;
                    if (StringsKt.O(str12, "/onpay/success", false)) {
                        p990 p990VarM0 = o890Var5.M0();
                        long jA = p990VarM0.j.a();
                        vd1 vd1Var = p990VarM0.k;
                        Map mapB = wp20.b(new Pair("id_user", Long.valueOf(jA)));
                        vd1Var.getClass();
                        mapB.getClass();
                        vd1Var.f37210a.a("dep_done", mapB);
                        charSequence2 = "/onpay/withdraw/cancel";
                        p990VarM0.o.f19563a.a(xun.f41520a, 3044L);
                        o890Var5.Q0(R.string.notification_payment_succeed, qek0Var);
                    } else {
                        charSequence2 = "/onpay/withdraw/cancel";
                        if (StringsKt.O(str12, "/onpay/fail", false)) {
                            p990 p990VarM1 = o890Var5.M0();
                            p990VarM1.k.f37210a.c("dep_error");
                            p990VarM1.o.f19563a.a(xun.f41520a, 3045L);
                            o890Var5.Q0(R.string.notification_payment_fail, rek0Var2);
                        } else {
                            z = false;
                            if (StringsKt.O(str12, "/onpay/pending", false)) {
                                o890Var5.Q0(R.string.notification_payment_pending, pek0Var);
                            } else if (StringsKt.O(str12, "/onpay/cancel", false)) {
                                o890Var5.Q0(R.string.notification_payment_cancel, pek0Var);
                            } else if (StringsKt.O(str12, "/onpay/withdraw/success", false)) {
                                o890Var5.Q0(R.string.notification_payment_withdraw_succeed, qek0Var);
                            } else if (StringsKt.O(str12, "/onpay/withdraw/fail", false)) {
                                o890Var5.Q0(R.string.notification_payment_withdraw_fail, rek0Var2);
                            } else if (StringsKt.O(str12, "/onpay/withdraw/pending", false)) {
                                o890Var5.Q0(R.string.notification_payment_withdraw_pending, pek0Var);
                            } else {
                                charSequence = charSequence2;
                                if (StringsKt.O(str12, charSequence, false)) {
                                    o890Var5.Q0(R.string.notification_payment_cancel, pek0Var);
                                }
                            }
                            charSequence = charSequence2;
                        }
                    }
                    charSequence = charSequence2;
                    z = false;
                }
                if (StringsKt.O(str12, "/onpay/cancel", z) || StringsKt.O(str12, "/onpay/success", z) || StringsKt.O(str12, "/onpay/fail", z) || StringsKt.O(str12, "/onpay/pending", z) || StringsKt.O(str12, "/onpay/withdraw/success", z) || StringsKt.O(str12, "/onpay/withdraw/fail", z) || StringsKt.O(str12, "/onpay/withdraw/pending", z) || StringsKt.O(str12, charSequence, z)) {
                    p990 p990VarM2 = o890Var5.M0();
                    sac.V(jiu0.a(p990VarM2), j990.f16127a, null, p990VarM2.p.b, new f990(p990VarM2, null, (byte) 1), 10);
                    o890Var5.M0().A();
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                ej90 ej90Var = (ej90) obj;
                ej90Var.getClass();
                kk90 kk90Var = (kk90) this.receiver;
                kk90Var.getClass();
                mne mneVar = kk90Var.m;
                int iOrdinal = ej90Var.ordinal();
                if (iOrdinal == 0) {
                    kk90Var.D();
                } else if (iOrdinal == 1) {
                    ywq0 ywq0Var = kk90Var.u;
                    ((vd1) ywq0Var.d).f37210a.c("acc_pers_responsible_gambling");
                    ((au0) ywq0Var.f).f1455a.a(xun.f41520a, 3269L);
                    i1w0 i1w0Var = kk90Var.p;
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    rz4.u(kk90Var.h, k0w0VarI);
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (iOrdinal == 3) {
                    kk90Var.C();
                } else if (iOrdinal == 4) {
                    kk90Var.E();
                } else if (iOrdinal == 5) {
                    sac.V(jiu0.a(kk90Var), fk90.f9680a, null, mneVar.f22085a, new ek90(kk90Var, yjeVar, b3), 10);
                } else if (iOrdinal == 6) {
                    sac.V(jiu0.a(kk90Var), bk90.f2737a, null, mneVar.f22085a, new ck90(kk90Var, yjeVar, b4), 10);
                }
                return Unit.f46060a;
        }
    }
}
