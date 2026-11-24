package a;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k5r0 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5r0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.h;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                ((m5r0) obj3).O((Throwable) obj);
                return Unit.f46060a;
            case 1:
                ((n7r0) obj3).A((List) obj);
                return Unit.f46060a;
            case 2:
                ((sdr0) obj3).A((List) obj);
                return Unit.f46060a;
            case 3:
                ((njr0) obj3).z((Throwable) obj);
                return Unit.f46060a;
            case 4:
                ((njr0) obj3).z((Throwable) obj);
                return Unit.f46060a;
            case 5:
                ((njr0) obj3).z((Throwable) obj);
                return Unit.f46060a;
            case 6:
                yrr0 yrr0Var = (yrr0) obj3;
                yrr0Var.t.b((Throwable) obj, new p6r0(yrr0Var, (byte) 11));
                return Unit.f46060a;
            case 7:
                ((psr0) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case 8:
                ((psr0) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case 9:
                ((psr0) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case 10:
                ((zvr0) obj3).O((Throwable) obj);
                return Unit.f46060a;
            case 11:
                ((ImageView) obj3).setImageBitmap((Bitmap) obj);
                return Unit.f46060a;
            case 12:
                ((Function1) obj3).invoke(obj);
                return Unit.f46060a;
            case 13:
                d7u0 d7u0Var = (d7u0) obj;
                y6u0 y6u0Var = (y6u0) obj3;
                bzs0 bzs0Var = y6u0.R1;
                if (d7u0Var instanceof a7u0) {
                    ((s6u0) y6u0Var.P1.getValue()).A(((a7u0) d7u0Var).f392a);
                    y6u0Var.G0().c.setVisibility(8);
                    y6u0Var.G0().e.setVisibility(0);
                    y6u0Var.G0().b.b.setVisibility(8);
                } else if (d7u0Var instanceof b7u0) {
                    y6u0Var.G0().c.setVisibility(0);
                    y6u0Var.G0().c.a(((b7u0) d7u0Var).f2126a);
                    y6u0Var.G0().e.setVisibility(8);
                    y6u0Var.G0().b.b.setVisibility(8);
                } else {
                    y6u0Var.getClass();
                    if (!Intrinsics.d(d7u0Var, c7u0.f3881a)) {
                        t9f.b();
                        return null;
                    }
                    y6u0Var.G0().c.setVisibility(8);
                    y6u0Var.G0().e.setVisibility(8);
                    y6u0Var.G0().b.b.setVisibility(0);
                }
                return Unit.f46060a;
            case 14:
                wau0 wau0Var = (wau0) obj;
                mau0 mau0Var = (mau0) obj3;
                bzs0 bzs0Var2 = mau0.Q1;
                mau0Var.getClass();
                if (Intrinsics.d(wau0Var, tau0.f33632a)) {
                    hau0 hau0VarG0 = mau0Var.G0();
                    ((ProgressBar) hau0VarG0.d.c).setVisibility(0);
                    hau0VarG0.i.setVisibility(8);
                    hau0VarG0.b.setVisibility(8);
                    hau0VarG0.c.setVisibility(8);
                } else if (wau0Var instanceof uau0) {
                    fbu0 fbu0Var = ((uau0) wau0Var).f35350a;
                    hau0 hau0VarG1 = mau0Var.G0();
                    MaterialToolbar materialToolbar = hau0VarG1.e;
                    TextView textView = hau0VarG1.h;
                    MaterialButton materialButton = hau0VarG1.b;
                    materialToolbar.setVisibility(fbu0Var.e ? 0 : 8);
                    materialButton.setVisibility(fbu0Var.f ? 0 : 8);
                    materialButton.setText(fbu0Var.g);
                    textView.setVisibility(fbu0Var.b ? 0 : 8);
                    hau0VarG1.g.setImageResource(fbu0Var.f9279a);
                    textView.setText(fbu0Var.c);
                    hau0VarG1.f.setText(fbu0Var.d);
                    hau0VarG1.i.setVisibility(0);
                    ((ProgressBar) hau0VarG1.d.c).setVisibility(8);
                    hau0VarG1.c.setVisibility(8);
                } else {
                    if (!(wau0Var instanceof vau0)) {
                        t9f.b();
                        return null;
                    }
                    ra10 ra10Var = ((vau0) wau0Var).f37108a;
                    hau0 hau0VarG2 = mau0Var.G0();
                    LottieView lottieView = hau0VarG2.c;
                    lottieView.v(ra10Var);
                    lottieView.setVisibility(0);
                    ((ProgressBar) hau0VarG2.d.b).setVisibility(8);
                    hau0VarG2.i.setVisibility(8);
                    hau0VarG2.b.setVisibility(8);
                }
                return Unit.f46060a;
            case 15:
                sau0 sau0Var = (sau0) obj;
                mau0 mau0Var2 = (mau0) obj3;
                bzs0 bzs0Var3 = mau0.Q1;
                mau0Var2.getClass();
                if (Intrinsics.d(sau0Var, qau0.f28415a)) {
                    try {
                        mau0Var2.w0(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "doc@1xbet.kz", null)));
                    } catch (Exception unused) {
                        wdk0 wdk0Var = mau0Var2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH = mau0Var2.H(R.string.intent_app_not_installed);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), mau0Var2, null, null, false, null, 1020);
                    }
                    break;
                } else if (Intrinsics.d(sau0Var, pau0.f26673a)) {
                    ccq0.V(mau0Var2, "KZ_FIRST_DEPOSIT_ALERT_REQUEST_KEY", new kau0(mau0Var2, (byte) 1));
                    ii iiVar = mau0Var2.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = mau0Var2.C();
                    eVarC.getClass();
                    String strH2 = mau0Var2.H(R.string.kz_identification_alert_freebet_dialog_title);
                    String strH3 = mau0Var2.H(R.string.kz_identification_freebet_alert_dialog_bonus_body_200);
                    String strH4 = mau0Var2.H(R.string.refill_account);
                    strH4.getClass();
                    iiVar.d(new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, mau0Var2.H(R.string.later), (String) null, "KZ_FIRST_DEPOSIT_ALERT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488), eVarC);
                } else {
                    if (!Intrinsics.d(sau0Var, rau0.f30154a)) {
                        t9f.b();
                        return null;
                    }
                    j120.g0(mau0Var2.o0(), i120.U());
                }
                return Unit.f46060a;
            case 16:
                ((uru0) obj3).A((List) obj);
                return Unit.f46060a;
            case 17:
                ((tio0) obj3).A((List) obj);
                return Unit.f46060a;
            case 18:
                l2v0 l2v0Var = (l2v0) obj;
                w1v0 w1v0Var = (w1v0) obj3;
                bzs0 bzs0Var4 = w1v0.j2;
                w1v0Var.getClass();
                if (l2v0Var != null) {
                    if (l2v0Var instanceof j2v0) {
                        w1v0Var.I0().b.setVisibility(8);
                        FixedWebView fixedWebView = w1v0Var.I0().d;
                        String str = ((j2v0) l2v0Var).f15802a;
                        siq siqVar = fixedWebView.f47221a;
                        if (siqVar != null) {
                            siqVar.evaluateJavascript(str, null);
                        }
                    } else if (l2v0Var instanceof k2v0) {
                        vcc.f0(i120.V(new Pair(w1v0Var.S0(), new iqt0((i7a) w1v0Var.e2.n(w1v0Var, w1v0.k2[3]), ((k2v0) l2v0Var).f17591a))), w1v0Var, w1v0Var.S0());
                        w1v0Var.y0();
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((FixedWebView) obj3).c((String) obj);
                return Unit.f46060a;
            case 20:
                ((FixedWebView) obj3).c((String) obj);
                return Unit.f46060a;
            case 21:
                y3v0 y3v0Var = (y3v0) obj;
                kys0 kys0Var = u3v0.P1;
                ((u3v0) obj3).getClass();
                if (y3v0Var != null) {
                    WebView.setWebContentsDebuggingEnabled(y3v0Var.f41972a);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 22:
                emv0 emv0Var = (emv0) obj3;
                emv0Var.t.b((Throwable) obj, new ggt0(emv0Var, (byte) 22));
                return Unit.f46060a;
            case 23:
                ((ayv0) obj3).A((List) obj);
                return Unit.f46060a;
            default:
                ((szv0) obj3).A((List) obj);
                return Unit.f46060a;
        }
    }
}
