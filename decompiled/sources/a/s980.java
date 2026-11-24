package a;

import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final class s980 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s980(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                s980 s980Var = new s980((gk70) obj2, yjeVar, (byte) 0);
                s980Var.j = obj;
                return s980Var;
            case 1:
                return new s980((yl80) this.j, (sd60) obj2, yjeVar, (byte) 1);
            case 2:
                s980 s980Var2 = new s980((fk80) obj2, yjeVar, (byte) 2);
                s980Var2.j = obj;
                return s980Var2;
            case 3:
                s980 s980Var3 = new s980((xz80) obj2, yjeVar, (byte) 3);
                s980Var3.j = obj;
                return s980Var3;
            case 4:
                s980 s980Var4 = new s980((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2, yjeVar, (byte) 4);
                s980Var4.j = obj;
                return s980Var4;
            case 5:
                return new s980((zhi0) this.j, (org.xplatform.security.impl.presentation.password.change.input_password.f) obj2, yjeVar, (byte) 5);
            case 6:
                return new s980((String) this.j, (org.xplatform.security.impl.presentation.password.change.input_password.f) obj2, yjeVar, (byte) 6);
            case 7:
                return new s980((g090) this.j, (ArrayList) obj2, yjeVar, (byte) 7);
            case 8:
                s980 s980Var5 = new s980((t190) obj2, yjeVar, (byte) 8);
                s980Var5.j = obj;
                return s980Var5;
            case 9:
                s980 s980Var6 = new s980((o890) obj2, yjeVar, (byte) 9);
                s980Var6.j = obj;
                return s980Var6;
            case 10:
                return new s980((p990) this.j, (v890) obj2, yjeVar, (byte) 10);
            case 11:
                return new s980((q990) this.j, (String) obj2, yjeVar, (byte) 11);
            case 12:
                return new s980((kk90) this.j, (oj90) obj2, yjeVar, (byte) 12);
            case 13:
                return new s980((jrs0) this.j, (tu9) obj2, yjeVar, (byte) 13);
            case 14:
                s980 s980Var7 = new s980((r0a0) obj2, yjeVar, (byte) 14);
                s980Var7.j = obj;
                return s980Var7;
            case 15:
                s980 s980Var8 = new s980((b3a0) obj2, yjeVar, (byte) 15);
                s980Var8.j = obj;
                return s980Var8;
            case 16:
                s980 s980Var9 = new s980((u3a0) obj2, yjeVar, (byte) 16);
                s980Var9.j = obj;
                return s980Var9;
            case 17:
                s980 s980Var10 = new s980((g7a0) obj2, yjeVar, (byte) 17);
                s980Var10.j = obj;
                return s980Var10;
            case 18:
                s980 s980Var11 = new s980((z7a0) obj2, yjeVar, (byte) 18);
                s980Var11.j = obj;
                return s980Var11;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new s980((View) this.j, (Function2) obj2, yjeVar, (byte) 19);
            case 20:
                s980 s980Var12 = new s980((mea0) obj2, yjeVar, (byte) 20);
                s980Var12.j = ((j0g0) obj).f15681a;
                return s980Var12;
            case 21:
                s980 s980Var13 = new s980((xja0) obj2, yjeVar, (byte) 21);
                s980Var13.j = obj;
                return s980Var13;
            case 22:
                s980 s980Var14 = new s980((rua0) obj2, yjeVar, (byte) 22);
                s980Var14.j = obj;
                return s980Var14;
            case 23:
                s980 s980Var15 = new s980((z5b0) obj2, yjeVar, (byte) 23);
                s980Var15.j = obj;
                return s980Var15;
            case 24:
                s980 s980Var16 = new s980((l7b0) obj2, yjeVar, (byte) 24);
                s980Var16.j = obj;
                return s980Var16;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                s980 s980Var17 = new s980((h8b0) obj2, yjeVar, (byte) 25);
                s980Var17.j = obj;
                return s980Var17;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new s980((sbb0) this.j, (s9b0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                s980 s980Var18 = new s980((nqs) obj2, yjeVar, (byte) 27);
                s980Var18.j = obj;
                return s980Var18;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                s980 s980Var19 = new s980((b2c0) obj2, yjeVar, (byte) 28);
                s980Var19.j = obj;
                return s980Var19;
            default:
                return new s980((a8c0) this.j, (Function1) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s980) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((s980) create((cm80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((s980) create((d090) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((s980) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((s980) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((s980) create((c990) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((s980) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((s980) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((s980) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((s980) create((aw20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((s980) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((s980) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((s980) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((s980) create((ghq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((s980) create((b6b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((s980) create((i7b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((s980) create((r8b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((s980) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((s980) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((s980) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        h0a h0aVarH;
        Object value;
        Object value2;
        j0g0 j0g0Var;
        Object value3;
        m1b0 m1b0Var;
        byte b = this.i;
        byte b2 = 27;
        boolean z = true;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((gk70) obj2).invoke(th);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                sd60 sd60Var = (sd60) obj2;
                sac.V((bvc) sd60Var.c, null, null, (lne) sd60Var.b, new wn2((Object) sd60Var, (Object) ((yl80) this.j).b, yjeVar, (byte) 21), 11);
                return Unit.f46060a;
            case 2:
                cm80 cm80Var = (cm80) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((fk80) obj2).g.n(cm80Var);
                return Unit.f46060a;
            case 3:
                xz80 xz80Var = (xz80) obj2;
                d090 d090Var = (d090) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (d090Var instanceof c090) {
                    String str = ((c090) d090Var).f3513a;
                    xi70 xi70Var = xz80.U1;
                    ii iiVar = xz80Var.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = xz80Var.H(R.string.error);
                    String strH2 = xz80Var.H(R.string.ok_new);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = xz80Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (d090Var instanceof yz80) {
                    d7a d7aVar = ((yz80) d090Var).f43504a;
                    xi70 xi70Var2 = xz80.U1;
                    if (xz80Var.N1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH3 = xz80Var.H(R.string.change_password_title);
                    strH3.getClass();
                    gl5.p(xz80Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH3);
                } else if (d090Var instanceof zz80) {
                    String str2 = ((zz80) d090Var).f45240a;
                    xi70 xi70Var3 = xz80.U1;
                    wdk0 wdk0Var = xz80Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str2, null, null, null, null, 124), xz80Var, null, null, false, null, 1020);
                } else if (Intrinsics.d(d090Var, a090.f16a)) {
                    j120.Y(xz80Var);
                } else {
                    if (!(d090Var instanceof b090)) {
                        t9f.b();
                        return null;
                    }
                    xi70 xi70Var4 = xz80.U1;
                    ii iiVar2 = xz80Var.O1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = xz80Var.H(R.string.error);
                    String strH5 = xz80Var.H(R.string.request_error);
                    String strH6 = xz80Var.H(R.string.ok_new);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC2 = xz80Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                return Unit.f46060a;
            case 4:
                Pair pair = (Pair) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                e7a e7aVar = (e7a) pair.f46059a;
                if (e7aVar instanceof d7a) {
                    ((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2).p.f(new yz80((d7a) e7aVar));
                }
                return Unit.f46060a;
            case 5:
                org.xplatform.security.impl.presentation.password.change.input_password.f fVar = (org.xplatform.security.impl.presentation.password.change.input_password.f) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                zhi0 zhi0Var = (zhi0) this.j;
                if (zhi0Var.c == i2o.TokenExpiredError) {
                    ol60 ol60Var = fVar.p;
                    String message = zhi0Var.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    ol60Var.f(new c090(message));
                } else {
                    String message2 = zhi0Var.getMessage();
                    if (message2 != null) {
                        sac.V(jiu0.a(fVar), new xj80(1, fVar.l, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, null, new s980(message2, fVar, yjeVar, (byte) 6), 14);
                    }
                    fVar.l.a(zhi0Var);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                String str3 = (String) this.j;
                if (str3.length() > 0) {
                    ((org.xplatform.security.impl.presentation.password.change.input_password.f) obj2).p.f(new zz80(str3));
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                d190 d190Var = (d190) ((g090) this.j).f10448a;
                ArrayList arrayList = (ArrayList) obj2;
                d190Var.getClass();
                q7d0 q7d0Var = d190Var.f5302a;
                vby vbyVar = d190Var.b;
                qaj qajVar = vbyVar.b;
                sgy sgyVarB = sre0.f32672a.b(gd.class);
                qajVar.getClass();
                jiy jiyVarD = qajVar.d(sgyVarB, iun.f15405a);
                if (jiyVarD != null) {
                    q7d0Var.g("ACCOUNT_FIELDS_KEY", vbyVar.d(new zw3(jiyVarD, (byte) 0), arrayList));
                    return Unit.f46060a;
                }
                v4i0.n(j2e.Q(sgyVarB));
                return null;
            case 8:
                String str4 = (String) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                str4.getClass();
                ((t190) obj2).u.f(new j190(str4));
                return Unit.f46060a;
            case 9:
                o890 o890Var = (o890) obj2;
                c990 c990Var = (c990) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (c990Var != null) {
                    if (c990Var instanceof x890) {
                        jh70 jh70Var = o890.f2;
                        ii iiVar3 = (ii) o890Var.J0().get();
                        String strH7 = o890Var.H(R.string.caution);
                        String strH8 = o890Var.H(R.string.payment_balance_error);
                        String strH9 = o890Var.H(R.string.ok_new);
                        strH9.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, o890Var.H(R.string.cancel), (String) null, "BONUS_LISTENER", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC3 = o890Var.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else if (c990Var instanceof b990) {
                        jh70 jh70Var2 = o890.f2;
                        ii iiVar4 = (ii) o890Var.J0().get();
                        z7z z7zVar = o890Var.O1;
                        if (z7zVar == null) {
                            Intrinsics.h("logoutDialogFactory");
                            throw null;
                        }
                        ux00 ux00Var = (ux00) z7zVar.get();
                        String strH10 = o890Var.H(R.string.error);
                        String strH11 = o890Var.H(R.string.validate_user_error);
                        String strH12 = o890Var.H(R.string.logout);
                        strH12.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        ux00Var.getClass();
                        tx00.l2.getClass();
                        tx00 tx00VarG = evz.g(dialogFields4, false, false, false);
                        androidx.fragment.app.e eVarC4 = o890Var.C();
                        eVarC4.getClass();
                        iiVar4.c(tx00VarG, eVarC4);
                    } else if (c990Var instanceof t890) {
                        String str5 = ((t890) c990Var).f33504a;
                        jh70 jh70Var3 = o890.f2;
                        PaymentWebView paymentWebView = o890Var.K0().g;
                        String strL = kng0.l("otp_payments_withdraw(", str5, ");");
                        siq siqVar = paymentWebView.f47221a;
                        if (siqVar != null) {
                            siqVar.evaluateJavascript(strL, null);
                        }
                    } else if (c990Var instanceof u890) {
                        u890 u890Var = (u890) c990Var;
                        String str6 = u890Var.f35223a;
                        Map map = u890Var.b;
                        jh70 jh70Var4 = o890.f2;
                        o890Var.K0().g.d(str6, map);
                        o890Var.N0();
                    } else if (c990Var instanceof w890) {
                        jh70 jh70Var5 = o890.f2;
                        ((ProgressBar) o890Var.K0().f.b).setVisibility(0);
                        w890 w890Var = (w890) c990Var;
                        o890Var.K0().g.d(w890Var.f38712a, w890Var.b);
                        o890Var.N0();
                    } else if (c990Var instanceof v890) {
                        String str7 = ((v890) c990Var).f36971a;
                        jh70 jh70Var6 = o890.f2;
                        try {
                            o890Var.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str7)));
                        } catch (Throwable unused) {
                            z7z z7zVar2 = o890Var.P1;
                            if (z7zVar2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            Object obj3 = z7zVar2.get();
                            obj3.getClass();
                            rek0 rek0Var = rek0.b;
                            String strH13 = o890Var.H(R.string.error_something_went_wrong);
                            strH13.getClass();
                            wdk0.k((wdk0) obj3, new xdk0(rek0Var, strH13, null, null, null, null, 124), o890Var, null, null, false, null, 1020);
                        }
                        break;
                    } else if (c990Var instanceof a990) {
                        jh70 jh70Var7 = o890.f2;
                        ii iiVar5 = (ii) o890Var.J0().get();
                        String strH14 = o890Var.H(R.string.error);
                        String strH15 = o890Var.H(R.string.something_went_wrong);
                        String strH16 = o890Var.H(R.string.ok_new);
                        strH16.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH14, (CharSequence) strH15, (CharSequence) strH16, (String) null, (String) null, "ERROR_DIALOG_LISTENER", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC5 = o890Var.C();
                        eVarC5.getClass();
                        iiVar5.d(dialogFields5, eVarC5);
                    } else if (c990Var instanceof y890) {
                        ra10 ra10Var = ((y890) c990Var).f42186a;
                        jh70 jh70Var8 = o890.f2;
                        LottieView lottieView = o890Var.K0().c;
                        lottieView.v(ra10Var);
                        lottieView.setVisibility(0);
                        siq fixedWebView = o890Var.K0().g.getFixedWebView();
                        if (fixedWebView != null) {
                            fixedWebView.setVisibility(8);
                        }
                    } else if (c990Var instanceof z890) {
                        ra10 ra10Var2 = ((z890) c990Var).f43956a;
                        jh70 jh70Var9 = o890.f2;
                        LottieView lottieView2 = o890Var.K0().c;
                        lottieView2.setVisibility(0);
                        lottieView2.x(ra10Var2, new i280((byte) 26));
                        siq fixedWebView2 = o890Var.K0().g.getFixedWebView();
                        if (fixedWebView2 != null) {
                            fixedWebView2.setVisibility(8);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((p990) this.j).y.f((v890) obj2);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                q990 q990Var = (q990) this.j;
                knf0 knf0Var = q990Var.b;
                knf0Var.getClass();
                String strA = q990Var.c.a();
                knf0Var.getClass();
                return xp20.f(new Pair("X-Referral", String.valueOf(1)), new Pair("X-Auth", strA), new Pair("X-Deeplink", (String) obj2), new Pair("X-Mobile-Project-Id", String.valueOf(1357)));
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                ((kk90) this.j).E.f((oj90) obj2);
                return Unit.f46060a;
            case 13:
                tu9 tu9Var = (tu9) obj2;
                jrs0 jrs0Var = (jrs0) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                try {
                    String[] cameraIdList = ((CameraManager) jrs0Var.j).getCameraIdList();
                    cameraIdList.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str8 : cameraIdList) {
                        try {
                            str8.getClass();
                            h0aVarH = xf0.H(str8, null, null);
                        } catch (IllegalArgumentException e) {
                            Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str8, e);
                            h0aVarH = null;
                        }
                        if (h0aVarH != null) {
                            arrayList2.add(h0aVarH);
                        }
                        break;
                    }
                    Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList2);
                    jrs0Var.m(null, arrayList2);
                    tu9Var.b(arrayList2);
                    break;
                } catch (Exception e2) {
                    Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e2);
                    jrs0Var.m(e2, null);
                    tu9Var.d(e2);
                }
                return Unit.f46060a;
            case 14:
                Throwable th2 = (Throwable) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                r0a0 r0a0Var = (r0a0) obj2;
                int i = r0a0.A;
                r0a0Var.w.b(th2, new cz90(r0a0Var, (byte) 2));
                return Unit.f46060a;
            case 15:
                List list = (List) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                b3a0 b3a0Var = (b3a0) obj2;
                if (list.isEmpty()) {
                    int i2 = b3a0.x;
                    b3a0Var.G(i2a0.f14037a);
                } else {
                    g7u g7uVar = b3a0Var.s;
                    g7uVar.getClass();
                    gen genVar = g7uVar.f10834a.f14642a;
                    qoj0 qoj0Var = genVar.b;
                    p7m0 p7m0Var = genVar.f11164a;
                    boolean zD = Intrinsics.d(p7m0Var.getValue(), list);
                    if (!zD) {
                        p7m0Var.o(null, list);
                    }
                    hen henVarK0 = ebc.k0(qoj0Var);
                    List list2 = henVarK0.f12930a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list2) {
                        tdn tdnVar = (tdn) obj4;
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((tdn) it.next()).f33777a == tdnVar.f33777a) {
                                    arrayList3.add(obj4);
                                }
                                break;
                            }
                        }
                    }
                    List list3 = henVarK0.b;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : list3) {
                        tdn tdnVar2 = (tdn) obj5;
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((tdn) it2.next()).f33777a == tdnVar2.f33777a) {
                                    arrayList4.add(obj5);
                                }
                                break;
                            }
                        }
                    }
                    qoj0Var.g(new hen(arrayList3, arrayList4));
                    if (!zD) {
                        b3a0Var.G(k2a0.f17562a);
                    }
                }
                return Unit.f46060a;
            case 16:
                Throwable th3 = (Throwable) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                u3a0 u3a0Var = (u3a0) obj2;
                int i3 = u3a0.u;
                u3a0Var.s.b(th3, new cz90(u3a0Var, (byte) 7));
                return Unit.f46060a;
            case 17:
                aw20 aw20Var = (aw20) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                int i4 = g7a0.w;
                p7m0 p7m0Var2 = ((g7a0) obj2).i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, y6a0.a((y6a0) value, null, null, null, aw20Var, null, 55)));
                return Unit.f46060a;
            case 18:
                Throwable th4 = (Throwable) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((z7a0) obj2).r.b(th4, new so90(b2));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                View view = (View) this.j;
                Object tag = view.getTag();
                my90 my90Var = tag instanceof my90 ? (my90) tag : null;
                if (my90Var != null) {
                    Function2 function2 = (Function2) obj2;
                    if (((ulo) my90Var).w(27)) {
                        function2.invoke(my90Var, view);
                    }
                    view.setTag(null);
                }
                return Unit.f46060a;
            case 20:
                Object obj6 = this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                mea0 mea0Var = (mea0) obj2;
                if (((zda0) mea0Var.D()).b == null || ((j0g0Var = ((zda0) mea0Var.D()).b) != null && (j0g0Var.f15681a instanceof g0g0))) {
                    p7m0 p7m0Var3 = mea0Var.i.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, new zda0(((zda0) value2).f44203a, new j0g0(obj6))));
                }
                return Unit.f46060a;
            case 21:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                int i5 = xja0.v;
                p7m0 p7m0Var4 = ((xja0) obj2).i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var4.m(value3, rja0.a((rja0) value3, null, false, 0, false, false, false, false, null, s9m0.l(uaq0Var), 255)));
                return Unit.f46060a;
            case 22:
                ghq0 ghq0Var = (ghq0) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                boolean z2 = ghq0Var.f11314a != ygq0.NOT;
                rua0 rua0Var = (rua0) obj2;
                List list4 = rua0.G;
                p7m0 p7m0Var5 = rua0Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var5.getValue();
                    value4.getClass();
                    q7x.F(rua0Var.f, Boolean.valueOf(z2), "KEY_TIME_ACTIVE_STATE");
                    ghq0 ghq0Var2 = ghq0Var;
                    if (p7m0Var5.m(value4, gua0.a((gua0) value4, null, null, null, null, null, false, false, ghq0Var2, z2, null, false, 106495))) {
                        return Unit.f46060a;
                    }
                    ghq0Var = ghq0Var2;
                }
                break;
            case 23:
                z5b0 z5b0Var = (z5b0) obj2;
                b6b0 b6b0Var = (b6b0) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                if (b6b0Var == null) {
                    t9f.b();
                    return null;
                }
                z7z z7zVar3 = z5b0Var.L1;
                if (z7zVar3 == null) {
                    Intrinsics.h("altDesignGameCardFragmentDelegate");
                    throw null;
                }
                ((ujd) z7zVar3.get()).b(z5b0Var, b6b0Var.f2044a);
                ((k3t0) z5b0Var.O1.getValue()).x(s5b0.f31648a);
                return Unit.f46060a;
            case 24:
                i7b0 i7b0Var = (i7b0) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                l7b0 l7b0Var = (l7b0) obj2;
                bby bbyVar = l7b0Var.v;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                rkt0 rkt0Var = l7b0Var.o;
                if (!(i7b0Var instanceof f7b0) && !(i7b0Var instanceof h7b0)) {
                    z = false;
                }
                rkt0Var.g(z);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r8b0 r8b0Var = (r8b0) this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                if (r8b0Var == null) {
                    t9f.b();
                    return null;
                }
                h8b0 h8b0Var = (h8b0) obj2;
                rl70 rl70Var = h8b0.R1;
                wdk0 wdk0Var2 = h8b0Var.M1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var2 = rek0.b;
                String strH17 = h8b0Var.H(R.string.get_balance_list_error);
                strH17.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var2, strH17, null, null, null, null, 124), h8b0Var, null, null, false, null, 1020);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                sbb0 sbb0Var = (sbb0) this.j;
                gg5 gg5Var = sbb0Var.T;
                s9b0 s9b0Var = (s9b0) obj2;
                s9b0Var.getClass();
                switch (s9b0Var.ordinal()) {
                    case 0:
                    case 1:
                        m1b0Var = m1b0.SPORT;
                        break;
                    case 2:
                        m1b0Var = m1b0.ESPORTS;
                        break;
                    case 3:
                        m1b0Var = m1b0.ONE_X_GAMES;
                        break;
                    case 4:
                        m1b0Var = m1b0.AGGREGATOR;
                        break;
                    case 5:
                    case 6:
                    case 7:
                        m1b0Var = m1b0.TOP;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                gg5Var.getClass();
                gg5Var.f11237a.a(cui0.b(new j1p(m1b0Var.f21000a, (byte) 0)), 3002L);
                if (s9b0Var == s9b0.CYBER) {
                    sbb0Var.e.k(pzb.C(new kma0(b2)));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                e7a e7aVar2 = (e7a) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                if (e7aVar2 instanceof d7a) {
                    ((ol60) ((nqs) obj2).g).f(e7aVar2);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                e7a e7aVar3 = (e7a) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                if (e7aVar3 instanceof d7a) {
                    j1c0 j1c0Var = new j1c0((d7a) e7aVar3);
                    List list5 = b2c0.C;
                    ((b2c0) obj2).G(j1c0Var);
                }
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                if (((a8c0) this.j).b.getTime() <= System.currentTimeMillis()) {
                    ((Function1) obj2).invoke("CASHBACK");
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s980(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
