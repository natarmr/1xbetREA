package a;

import android.os.Build;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class lz9 implements rg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20894a;
    public final /* synthetic */ qog0 b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ lz9(qog0 qog0Var, Fragment fragment, byte b) {
        this.f20894a = b;
        this.b = qog0Var;
        this.c = fragment;
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        String[] strArrH;
        byte b = this.f20894a;
        qog0 qog0Var = this.b;
        Fragment fragment = this.c;
        switch (b) {
            case 0:
                kl5 kl5Var = qz9.t2;
                d4a d4aVarS0 = ((qz9) fragment).S0();
                if (n7x.p(arrayList)) {
                    p7m0 p7m0Var = d4aVarS0.h;
                    p7m0Var.getClass();
                    p7m0Var.o(null, flu0.f9756a);
                } else {
                    d4aVarS0.C(v0k0.f36585a);
                }
                qog0Var.getClass();
                qog0Var.f29072a.remove(this);
                return;
            case 1:
                kr70 kr70Var = (kr70) fragment;
                if (n7x.p(arrayList)) {
                    jh70 jh70Var = kr70.S1;
                    kr70Var.G0().x(cq70.f4779a);
                } else if (n7x.t(arrayList)) {
                    jh70 jh70Var2 = kr70.S1;
                    kr70Var.G0().x(new hq70("PERMISSION_DIALOG"));
                } else if (n7x.s(arrayList)) {
                    jh70 jh70Var3 = kr70.S1;
                    kr70Var.G0().x(new hq70("APP_SETTINGS_DIALOG"));
                }
                qog0Var.getClass();
                qog0Var.f29072a.remove(this);
                return;
            case 2:
                l590 l590Var = (l590) fragment;
                boolean z = Build.VERSION.SDK_INT < 30;
                if (n7x.p(arrayList)) {
                    nh70 nh70Var = l590.Y1;
                    l590Var.L0().x(a590.f260a);
                } else if (n7x.t(arrayList)) {
                    if (z) {
                        nh70 nh70Var2 = l590.Y1;
                        l590Var.N0(false);
                    } else {
                        nh70 nh70Var3 = l590.Y1;
                        l590Var.M0(false);
                    }
                } else if (n7x.s(arrayList)) {
                    if (z) {
                        nh70 nh70Var4 = l590.Y1;
                        l590Var.N0(true);
                    } else {
                        nh70 nh70Var5 = l590.Y1;
                        l590Var.M0(true);
                    }
                }
                qog0Var.getClass();
                qog0Var.f29072a.remove(this);
                return;
            case 3:
                w590 w590Var = (w590) fragment;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = i < 30;
                if (n7x.p(arrayList)) {
                    mi70 mi70Var = w590.W1;
                    s690 s690VarI0 = w590Var.I0();
                    String strH = s690VarI0.m.h();
                    ol60 ol60Var = s690VarI0.y;
                    if (i >= 26) {
                        d590.c.getClass();
                        strArrH = jh70.h();
                    } else {
                        d590.c.getClass();
                        strArrH = new String[]{"image/png", "image/jpeg", "video/mp4", "video/avi", "application/pdf"};
                    }
                    ol60Var.f(new d690(strH, strArrH));
                } else if (n7x.t(arrayList)) {
                    if (z2) {
                        mi70 mi70Var2 = w590.W1;
                        w590Var.K0();
                    } else {
                        mi70 mi70Var3 = w590.W1;
                        w590Var.J0();
                    }
                } else if (n7x.s(arrayList)) {
                    if (z2) {
                        mi70 mi70Var4 = w590.W1;
                        w590Var.K0();
                    } else {
                        mi70 mi70Var5 = w590.W1;
                        w590Var.J0();
                    }
                }
                qog0Var.getClass();
                qog0Var.f29072a.remove(this);
                return;
            case 4:
                r790 r790Var = (r790) fragment;
                if (n7x.p(arrayList)) {
                    xi70 xi70Var = r790.Z1;
                    r790Var.H0().c();
                } else if (n7x.t(arrayList)) {
                    xi70 xi70Var2 = r790.Z1;
                    r790Var.K0(false);
                } else if (n7x.s(arrayList)) {
                    xi70 xi70Var3 = r790.Z1;
                    r790Var.K0(true);
                }
                qog0Var.f29072a.remove(this);
                return;
            case 5:
                o890 o890Var = (o890) fragment;
                if (n7x.p(arrayList)) {
                    jh70 jh70Var4 = o890.f2;
                    o890Var.L0().c();
                } else if (n7x.t(arrayList)) {
                    jh70 jh70Var5 = o890.f2;
                    o890Var.P0(false);
                } else if (n7x.s(arrayList)) {
                    jh70 jh70Var6 = o890.f2;
                    o890Var.P0(true);
                }
                qog0Var.f29072a.remove(this);
                return;
            case 6:
                umj0 umj0Var = (umj0) fragment;
                if (n7x.p(arrayList)) {
                    lme0 lme0Var = umj0.S1;
                    umj0Var.G0().x(hmj0.f13310a);
                } else {
                    lme0 lme0Var2 = umj0.S1;
                    ii iiVar = umj0Var.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH2 = umj0Var.H(R.string.confirmation);
                    String strH3 = umj0Var.H(R.string.permission_message_data_text);
                    String strH4 = umj0Var.H(R.string.permission_allow_button_text);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, umj0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = umj0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                }
                qog0Var.getClass();
                qog0Var.f29072a.remove(this);
                return;
            case 7:
                whn0 whn0Var = (whn0) fragment;
                if (n7x.p(arrayList)) {
                    s2m0 s2m0Var = whn0.Y1;
                    whn0Var.I0().c();
                } else if (n7x.t(arrayList)) {
                    s2m0 s2m0Var2 = whn0.Y1;
                    whn0Var.L0(false);
                } else if (n7x.s(arrayList)) {
                    s2m0 s2m0Var3 = whn0.Y1;
                    whn0Var.L0(true);
                }
                qog0Var.f29072a.remove(this);
                return;
            default:
                mvr0 mvr0Var = (mvr0) fragment;
                if (n7x.p(arrayList)) {
                    g9m0 g9m0Var = mvr0.W1;
                    mvr0Var.G0().x(vur0.f38064a);
                } else {
                    ii iiVar2 = mvr0Var.N1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = mvr0Var.H(R.string.confirmation);
                    String strH6 = mvr0Var.H(R.string.permission_message_data_text);
                    String strH7 = mvr0Var.H(R.string.permission_allow_button_text);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, mvr0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = mvr0Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                qog0Var.getClass();
                qog0Var.f29072a.remove(this);
                return;
        }
    }
}
