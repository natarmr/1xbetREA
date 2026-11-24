package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class wu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu(xu xuVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xuVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xu xuVar = this.k;
        switch (b) {
            case 0:
                wu wuVar = new wu(xuVar, yjeVar, (byte) 0);
                wuVar.j = obj;
                return wuVar;
            default:
                wu wuVar2 = new wu(xuVar, yjeVar, (byte) 1);
                wuVar2.j = obj;
                return wuVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wu) create((jv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wu) create((iv) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                jv jvVar = (jv) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gfk0 gfk0Var = xu.Q1;
                xu xuVar = this.k;
                xuVar.H0().h.setVisibility(jvVar.f17182a ? 0 : 8);
                xuVar.H0().d.setTitle(jvVar.b);
                xuVar.H0().b.setFirstButtonEnabled(jvVar.d);
                return Unit.f46060a;
            default:
                rek0 rek0Var = rek0.b;
                xu xuVar2 = this.k;
                phf0 phf0Var = xuVar2.P1;
                iv ivVar = (iv) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ivVar != null) {
                    if (ivVar instanceof cv) {
                        String str = ((cv) ivVar).f5009a;
                        gfk0 gfk0Var2 = xu.Q1;
                        try {
                            Context contextD = xuVar2.D();
                            Uri uri = Uri.parse(str);
                            uri.getClass();
                            if (contextD != null) {
                                contextD.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri));
                                break;
                            }
                        } catch (Throwable th) {
                            pv pvVarJ0 = xuVar2.J0();
                            pvVarJ0.h.b(th, new oc(2, pvVarJ0, pv.class, "onErrorHandlerCalled", "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 2));
                        }
                    } else if (ivVar instanceof dv) {
                        gfk0 gfk0Var3 = xu.Q1;
                        try {
                            v3c.U(xuVar2.D(), "com.google.android.apps.authenticator2");
                        } catch (Throwable th2) {
                            pv pvVarJ1 = xuVar2.J0();
                            pvVarJ1.h.b(th2, new oc(2, pvVarJ1, pv.class, "onErrorHandlerCalled", "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 2));
                        }
                        break;
                    } else if (ivVar instanceof ev) {
                        gfk0 gfk0Var4 = xu.Q1;
                        wdk0 wdk0Var = (wdk0) xuVar2.I0().f2055a.j;
                        x1x.y(wdk0Var);
                        wdk0.k(wdk0Var, new xdk0(rek0Var, ((ev) ivVar).f8445a, null, null, null, null, 124), xuVar2, null, xuVar2.H0().f20827a, false, null, 1012);
                    } else if (ivVar instanceof fv) {
                        s9m0 s9m0Var = hvs0.c2;
                        androidx.fragment.app.e eVarC = xuVar2.C();
                        eVarC.getClass();
                        String str2 = ((fv) ivVar).f10189a;
                        s9m0Var.getClass();
                        if (eVarC.J("TwoFactorAuthenticationQrCodeDialog") == null) {
                            hvs0 hvs0Var = new hvs0();
                            hvs0Var.b2.x(hvs0Var, hvs0.d2[1], str2);
                            sj3.D0(hvs0Var, eVarC);
                        }
                    } else if (ivVar instanceof zu) {
                        String str3 = ((zu) ivVar).f44986a;
                        gfk0 gfk0Var5 = xu.Q1;
                        iiy[] iiyVarArr = xu.R1;
                        xuVar2.F().t0(i120.V(new Pair(phf0Var.n(xuVar2, iiyVarArr[1]), str3)), phf0Var.n(xuVar2, iiyVarArr[1]));
                        xuVar2.J0().x();
                    } else if (ivVar instanceof hv) {
                        gfk0 gfk0Var6 = xu.Q1;
                        wdk0 wdk0Var2 = (wdk0) xuVar2.I0().f2055a.j;
                        x1x.y(wdk0Var2);
                        String strH = xuVar2.H(R.string.to_many_requests_try_later);
                        strH.getClass();
                        wdk0.k(wdk0Var2, new xdk0(rek0Var, strH, null, null, null, null, 124), xuVar2, null, xuVar2.H0().f20827a, false, null, 1012);
                    } else if (ivVar instanceof gv) {
                        gfk0 gfk0Var7 = xu.Q1;
                        ii iiVar = (ii) xuVar2.I0().f2055a.i;
                        x1x.y(iiVar);
                        String strH2 = xuVar2.H(R.string.error);
                        String strH3 = xuVar2.H(R.string.request_error);
                        String strH4 = xuVar2.H(R.string.ok_new);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, "ERROR_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                        androidx.fragment.app.e eVarC2 = xuVar2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (ivVar instanceof bv) {
                        j120.Y(xuVar2);
                    } else if (ivVar instanceof av) {
                        d7a d7aVar = ((av) ivVar).f1503a;
                        gfk0 gfk0Var8 = xu.Q1;
                        xuVar2.I0().getClass();
                        String strH5 = xuVar2.H(R.string.caution);
                        strH5.getClass();
                        gl5.q(xuVar2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH5);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
