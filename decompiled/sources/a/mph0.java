package a;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Window;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final class mph0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oph0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mph0(oph0 oph0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oph0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oph0 oph0Var = this.k;
        switch (b) {
            case 0:
                mph0 mph0Var = new mph0(oph0Var, yjeVar, (byte) 0);
                mph0Var.j = obj;
                return mph0Var;
            default:
                mph0 mph0Var2 = new mph0(oph0Var, yjeVar, (byte) 1);
                mph0Var2.j = obj;
                return mph0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mph0) create((puh0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mph0) create((tuh0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Window window;
        switch (this.i) {
            case 0:
                puh0 puh0Var = (puh0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (puh0Var != null) {
                    boolean z = puh0Var instanceof iuh0;
                    oph0 oph0Var = this.k;
                    if (z) {
                        gle0 gle0Var = oph0.Q1;
                        ii iiVarA = oph0Var.G0().a();
                        String strH = oph0Var.H(R.string.caution);
                        String strH2 = oph0Var.H(R.string.dialog_activate_email_for_password_change);
                        String strH3 = oph0Var.H(R.string.bind_email_alert_button);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, oph0Var.H(R.string.cancel), (String) null, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = oph0Var.C();
                        eVarC.getClass();
                        iiVarA.d(dialogFields, eVarC);
                    } else if (puh0Var instanceof luh0) {
                        gle0 gle0Var2 = oph0.Q1;
                        ii iiVarA2 = oph0Var.G0().a();
                        String strH4 = oph0Var.H(R.string.caution);
                        String strH5 = oph0Var.H(R.string.bind_phone_description);
                        String strH6 = oph0Var.H(R.string.bind);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, oph0Var.H(R.string.cancel), (String) null, "REQUEST_BIND_PHONE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = oph0Var.C();
                        eVarC2.getClass();
                        iiVarA2.d(dialogFields2, eVarC2);
                    } else if (puh0Var instanceof juh0) {
                        gle0 gle0Var3 = oph0.Q1;
                        ii iiVarA3 = oph0Var.G0().a();
                        String strH7 = oph0Var.H(R.string.caution);
                        String strH8 = oph0Var.H(R.string.activation_phone_description);
                        String strH9 = oph0Var.H(R.string.activate);
                        strH9.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, oph0Var.H(R.string.cancel), (String) null, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC3 = oph0Var.C();
                        eVarC3.getClass();
                        iiVarA3.d(dialogFields3, eVarC3);
                    } else if (puh0Var instanceof muh0) {
                        gle0 gle0Var4 = oph0.Q1;
                        wdk0.k(oph0Var.G0().b(), new xdk0(rek0.b, ((muh0) puh0Var).f22412a, null, null, null, null, 124), oph0Var, null, null, false, null, 1020);
                    } else if (puh0Var instanceof nuh0) {
                        String str = ((nuh0) puh0Var).f24147a;
                        gle0 gle0Var5 = oph0.Q1;
                        ii iiVarA4 = oph0Var.G0().a();
                        String strH10 = oph0Var.H(R.string.congratulations);
                        String strH11 = oph0Var.H(R.string.ok);
                        strH11.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) str, (CharSequence) strH11, oph0Var.H(R.string.promo_list), (String) null, "REQUEST_GIFT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1488);
                        androidx.fragment.app.e eVarC4 = oph0Var.C();
                        eVarC4.getClass();
                        iiVarA4.d(dialogFields4, eVarC4);
                    } else if (puh0Var instanceof kuh0) {
                        kuh0 kuh0Var = (kuh0) puh0Var;
                        SpannableString spannableString = kuh0Var.f18910a;
                        String str2 = kuh0Var.b;
                        gle0 gle0Var6 = oph0.Q1;
                        Bundle bundle = oph0Var.g;
                        if (bundle != null) {
                            bundle.putString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", str2);
                        } else {
                            oph0Var.s0(i120.V(new Pair("RESET_AUTHENTICATOR_SECRET_HASH_KEY", str2)));
                        }
                        ii iiVarA5 = oph0Var.G0().a();
                        String strH12 = oph0Var.H(R.string.attention);
                        String string = spannableString.toString();
                        String strH13 = oph0Var.H(R.string.copy_info);
                        strH13.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) string, (CharSequence) strH13, oph0Var.H(R.string.ok), (String) null, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC5 = oph0Var.C();
                        eVarC5.getClass();
                        iiVarA5.d(dialogFields5, eVarC5);
                    } else if (puh0Var instanceof ouh0) {
                        d7a d7aVar = ((ouh0) puh0Var).f25877a;
                        gle0 gle0Var7 = oph0.Q1;
                        oph0Var.G0().getClass();
                        String strH14 = oph0Var.H(R.string.security_settings);
                        strH14.getClass();
                        d7aVar.getClass();
                        i7a i7aVar = d7aVar.f5586a;
                        int iOrdinal = i7aVar.d.ordinal();
                        if (iOrdinal == 0) {
                            mi70 mi70Var = et90.j2;
                            androidx.fragment.app.e eVarF = oph0Var.F();
                            mi70Var.getClass();
                            mi70.c(i7aVar, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", eVarF);
                        } else if (iOrdinal == 2) {
                            svs0 svs0Var = a2v0.g2;
                            androidx.fragment.app.e eVarF2 = oph0Var.F();
                            c2v0 c2v0Var = new c2v0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", i7aVar, d7aVar.b, strH14, "");
                            svs0Var.getClass();
                            svs0.d(eVarF2, c2v0Var);
                        } else if (iOrdinal == 3) {
                            xi70 xi70Var = sdd0.i2;
                            String str3 = i7aVar.b;
                            androidx.fragment.app.e eVarF3 = oph0Var.F();
                            xi70Var.getClass();
                            xi70.g(eVarF3, str3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", i7aVar);
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                oph0 oph0Var2 = this.k;
                a8z a8zVar = oph0Var2.P1;
                tuh0 tuh0Var = (tuh0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (tuh0Var != null) {
                    int i = 0;
                    if (tuh0Var instanceof quh0) {
                        quh0 quh0Var = (quh0) tuh0Var;
                        boolean z2 = quh0Var.f29345a;
                        gle0 gle0Var8 = oph0.Q1;
                        oph0Var2.H0().g.setEnabled(true);
                        oph0Var2.H0().c.setVisibility(8);
                        oph0Var2.H0().e.setVisibility(0);
                        oph0Var2.H0().b.setVisibility(z2 ? 0 : 8);
                        kxq kxqVarB = oph0Var2.B();
                        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
                            int i2 = R.attr.uikitBackgroundContent;
                            etm0.j(R.attr.uikitBackgroundContent, oph0Var2);
                            Context contextO0 = oph0Var2.o0();
                            if (!z2) {
                                i2 = R.attr.uikitBackground;
                            }
                            ofm0.y(window, contextO0, R.attr.uikitBackgroundContent, i2, !qem0.r(oph0Var2.D()), !qem0.r(oph0Var2.D()));
                        }
                        ((xnh0) a8zVar.getValue()).A(quh0Var.b);
                        Bundle bundle2 = oph0Var2.g;
                        if (bundle2 != null) {
                            i = bundle2.getInt("KEY_SETTINGS_EVENT", 0);
                        } else {
                            fsh0 fsh0Var = fsh0.f10063a;
                        }
                        Bundle bundle3 = oph0Var2.g;
                        if (bundle3 != null) {
                            bundle3.remove("KEY_SETTINGS_EVENT");
                        }
                        zuh0 zuh0VarI0 = oph0Var2.I0();
                        fsh0 fsh0Var2 = (fsh0) fsh0.d.get(i);
                        fsh0Var2.getClass();
                        tuh0 tuh0Var2 = (tuh0) zuh0VarI0.H.getValue();
                        int iOrdinal2 = fsh0Var2.ordinal();
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                zuh0VarI0.A();
                            }
                        } else if (tuh0Var2 instanceof quh0) {
                            zuh0VarI0.z(Intrinsics.d(((quh0) tuh0Var2).c, Boolean.TRUE));
                        }
                    } else if (tuh0Var instanceof ruh0) {
                        gle0 gle0Var9 = oph0.Q1;
                        oph0Var2.H0().g.setEnabled(false);
                        oph0Var2.H0().e.setVisibility(8);
                        DSLottieEmptyContainer dSLottieEmptyContainer = oph0Var2.H0().c;
                        jkm jkmVar = ((ruh0) tuh0Var).f31128a;
                        int i3 = DSLottieEmptyContainer.d;
                        dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                        dSLottieEmptyContainer.setVisibility(0);
                    } else if (tuh0Var instanceof suh0) {
                        gle0 gle0Var10 = oph0.Q1;
                        oph0Var2.H0().g.setEnabled(false);
                        oph0Var2.H0().e.setVisibility(0);
                        oph0Var2.H0().g.setRefreshing(false);
                        ((xnh0) a8zVar.getValue()).A(((suh0) tuh0Var).f32820a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
