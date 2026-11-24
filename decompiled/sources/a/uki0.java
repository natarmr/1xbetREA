package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.core.content.FileProvider;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uki0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uki0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f35828a = b;
    }

    private final Object Q(Object obj) {
        o1j0 o1j0Var = (o1j0) obj;
        o1j0Var.getClass();
        ofj0 ofj0Var = (ofj0) this.receiver;
        cge0 cge0Var = ofj0.X1;
        ofj0Var.getClass();
        yje yjeVar = null;
        if (o1j0Var instanceof n1j0) {
            j120.Y(ofj0Var);
            rqj0 rqj0Var = ofj0Var.K1;
            if (rqj0Var == null) {
                Intrinsics.h("shortCutManager");
                throw null;
            }
            rqj0Var.b(true);
            ofj0Var.H0().x(qyi0.f29536a);
        } else if (o1j0Var instanceof p0j0) {
            qjj.W(x0x.Q(ofj0Var.u1), null, null, new z8b0(ofj0Var, yjeVar, (byte) 19), 3);
        } else if (o1j0Var instanceof s0j0) {
            ii iiVarG0 = ofj0Var.G0();
            if (ofj0Var.N1 == null) {
                Intrinsics.h("logoutDialogFactory");
                throw null;
            }
            tx00 tx00VarA = ux00.a();
            androidx.fragment.app.e eVarC = ofj0Var.C();
            eVarC.getClass();
            iiVarG0.c(tx00VarA, eVarC);
            j120.g0(ofj0Var.o0(), i120.U());
        } else if (o1j0Var instanceof e1j0) {
            ii iiVarG1 = ofj0Var.G0();
            if (ofj0Var.N1 == null) {
                Intrinsics.h("logoutDialogFactory");
                throw null;
            }
            String strH = ofj0Var.H(R.string.exit_dialog_title);
            String strH2 = ofj0Var.H(R.string.exit_dialog_title);
            strH2.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) null, (CharSequence) strH2, ofj0Var.H(R.string.cancel), ofj0Var.H(R.string.exit_button_without_save), "REQUEST_SHOW_LOGOUT_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1474);
            tx00.l2.getClass();
            iiVarG1.c(evz.g(dialogFields, false, true, true), ofj0Var.n0().r());
        } else if (o1j0Var instanceof v0j0) {
            ofj0Var.H0().x(new fyi0());
        } else if (o1j0Var instanceof a1j0) {
            String strH3 = ofj0Var.H(R.string.authorization_error);
            strH3.getClass();
            String strH4 = ofj0Var.H(R.string.lose_message);
            strH4.getClass();
            ofj0Var.I0(strH3, strH4);
        } else if (o1j0Var instanceof g1j0) {
            String strH5 = ofj0Var.H(R.string.network_error);
            strH5.getClass();
            String strH6 = ofj0Var.H(R.string.check_connection);
            strH6.getClass();
            ofj0Var.I0(strH5, strH6);
        } else if (o1j0Var instanceof h1j0) {
            ii iiVarG2 = ofj0Var.G0();
            String strH7 = ofj0Var.H(R.string.caution);
            String strH8 = ofj0Var.H(R.string.payment_balance_error);
            String strH9 = ofj0Var.H(R.string.ok_new);
            strH9.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, ofj0Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
            androidx.fragment.app.e eVarC2 = ofj0Var.C();
            eVarC2.getClass();
            iiVarG2.d(dialogFields2, eVarC2);
        } else if (o1j0Var instanceof l1j0) {
            nh70 nh70Var = iz80.g2;
            androidx.fragment.app.e eVarC3 = ofj0Var.C();
            eVarC3.getClass();
            nh70Var.getClass();
            nh70.l(eVarC3);
        } else if (o1j0Var instanceof m1j0) {
            boolean z = ((m1j0) o1j0Var).f21011a;
            ii iiVarG3 = ofj0Var.G0();
            String strH10 = ofj0Var.H(R.string.caution);
            String strH11 = ofj0Var.H(z ? R.string.open_official_site_description : R.string.open_working_mirror_description);
            String strH12 = ofj0Var.H(R.string.open_app);
            strH12.getClass();
            DialogFields dialogFields3 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, ofj0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SITE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC4 = ofj0Var.C();
            eVarC4.getClass();
            iiVarG3.d(dialogFields3, eVarC4);
        } else if (o1j0Var instanceof x0j0) {
            String str = ((x0j0) o1j0Var).f40073a;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            ofj0Var.w0(Intent.createChooser(intent, null));
        } else if (o1j0Var instanceof r0j0) {
            Context contextD = ofj0Var.D();
            if (contextD != null) {
                contextD.startActivity(new Intent("android.settings.DATE_SETTINGS"));
            }
        } else if (o1j0Var instanceof o0j0) {
            qjj.W(x0x.Q(ofj0Var.u1), null, null, new a220((Object) ofj0Var, ((o0j0) o1j0Var).f24428a, yjeVar, (byte) 26), 3);
        } else if (o1j0Var instanceof i1j0) {
            String str2 = ((i1j0) o1j0Var).f14001a;
            ii iiVarG4 = ofj0Var.G0();
            String strH13 = ofj0Var.H(R.string.error);
            String strH14 = ofj0Var.H(R.string.ok_new);
            strH14.getClass();
            DialogFields dialogFields4 = new DialogFields((CharSequence) strH13, (CharSequence) str2, (CharSequence) strH14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
            androidx.fragment.app.e eVarC5 = ofj0Var.C();
            eVarC5.getClass();
            iiVarG4.d(dialogFields4, eVarC5);
        } else if (o1j0Var instanceof j1j0) {
            String str3 = ((j1j0) o1j0Var).f15738a;
            String strH15 = ofj0Var.H(R.string.authorization_error);
            strH15.getClass();
            ofj0Var.I0(strH15, str3);
        } else if (o1j0Var instanceof f1j0) {
            vvi0 vvi0Var = ((f1j0) o1j0Var).f8766a;
            qgd qgdVar = ofj0Var.V1;
            if (qgdVar == null) {
                Intrinsics.h("settingsNavigator");
                throw null;
            }
            kxq kxqVarN0 = ofj0Var.n0();
            String strH16 = ofj0Var.H(R.string.access_only_for_authorized);
            strH16.getClass();
            x6h0 x6h0Var = new x6h0(ofj0Var, vvi0Var, (byte) 20);
            Context contextO0 = ofj0Var.o0();
            m5d.f(contextO0, R.attr.uikitPrimary, false, m5d.e(m5d.g(contextO0, R.attr.uikitTheme, 6), contextO0));
            qgdVar.Y(kxqVarN0, strH16, x6h0Var);
        } else if (o1j0Var instanceof c1j0) {
            d7a d7aVar = ((c1j0) o1j0Var).f3574a;
            if (ofj0Var.M1 == null) {
                Intrinsics.h("captchaDialogDelegate");
                throw null;
            }
            String strH17 = ofj0Var.H(R.string.settings);
            strH17.getClass();
            gl5.q(ofj0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH17);
        } else if (o1j0Var instanceof q0j0) {
            String str4 = ((q0j0) o1j0Var).f27902a;
            wdk0 wdk0Var = ofj0Var.P1;
            if (wdk0Var == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            Spanned spannedFromHtml = Html.fromHtml(str4, 0);
            spannedFromHtml.getClass();
            String string = spannedFromHtml.toString();
            String strH18 = ofj0Var.H(R.string.data_copied_to_clipboard);
            strH18.getClass();
            j120.M(ofj0Var, wdk0Var, "", string, strH18, null, null, null, 112);
        } else if (o1j0Var instanceof u0j0) {
            vic.C(ofj0Var.o0(), ((u0j0) o1j0Var).f34857a);
        } else if (o1j0Var instanceof w0j0) {
            if (ofj0Var.W1 == null) {
                Intrinsics.h("quickBetDialogNavigator");
                throw null;
            }
            androidx.fragment.app.e eVarC6 = ofj0Var.C();
            eVarC6.getClass();
            xi70.i(eVarC6);
        } else if (o1j0Var instanceof y0j0) {
            ii iiVarG5 = ofj0Var.G0();
            String strH19 = ofj0Var.H(R.string.delete_account_warning_title);
            String strH20 = ofj0Var.H(R.string.delete_account_warning_message);
            String strH21 = ofj0Var.H(R.string.cancel);
            strH21.getClass();
            DialogFields dialogFields5 = new DialogFields((CharSequence) strH19, (CharSequence) strH20, (CharSequence) strH21, ofj0Var.H(R.string.remove), (String) null, "REQUEST_DELETE_ACCOUNT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
            androidx.fragment.app.e eVarC7 = ofj0Var.C();
            eVarC7.getClass();
            iiVarG5.d(dialogFields5, eVarC7);
        } else if (!o1j0Var.equals(b1j0.f1808a)) {
            if (o1j0Var instanceof z0j0) {
                String str5 = ((z0j0) o1j0Var).f43570a;
                ii iiVarG6 = ofj0Var.G0();
                String strH22 = ofj0Var.H(R.string.cut_app_info_title);
                Spanned spannedFromHtml2 = Html.fromHtml(str5, 0);
                spannedFromHtml2.getClass();
                SpannableString spannableString = new SpannableString(spannedFromHtml2);
                String strH23 = ofj0Var.H(R.string.copy_info);
                strH23.getClass();
                DialogFields dialogFields6 = new DialogFields((CharSequence) strH22, (CharSequence) spannableString, (CharSequence) strH23, ofj0Var.H(R.string.cancel), (String) null, "REQUEST_APP_INFO_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC8 = ofj0Var.C();
                eVarC8.getClass();
                iiVarG6.d(dialogFields6, eVarC8);
            } else if (o1j0Var instanceof k1j0) {
                String str6 = ((k1j0) o1j0Var).f17527a;
                wdk0 wdk0Var2 = ofj0Var.P1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var2, new xdk0(rek0.b, str6, null, null, null, null, 124), ofj0Var, null, null, false, null, 1020);
                ofj0Var = ofj0Var;
            } else if (o1j0Var.equals(t0j0.f33122a)) {
                if (ofj0Var.B() != null && ofj0Var.Q1 == null) {
                    Intrinsics.h("consentManager");
                    throw null;
                }
            } else {
                if (!o1j0Var.equals(d1j0.f5311a)) {
                    t9f.b();
                    return null;
                }
                if (ofj0Var.O1 == null) {
                    Intrinsics.h("confirmChooseLanguageDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC9 = ofj0Var.C();
                eVarC9.getClass();
                nwd.g(eVarC9);
            }
        }
        ofj0Var.H0().x(dyi0.f6896a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:358:0x0bb1  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        p7m0 p7m0Var;
        Object value;
        List listL0;
        boolean z;
        Uri uriC;
        Object value2;
        final byte b = 1;
        final byte b2 = 0;
        byte b3 = 6;
        yje yjeVar = null;
        switch (this.f35828a) {
            case 0:
                nki0 nki0Var = (nki0) obj;
                nki0Var.getClass();
                imi0 imi0Var = (imi0) this.receiver;
                imi0Var.getClass();
                ArrayList arrayList = imi0Var.i;
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!((qki0) it.next()).c) {
                        i2++;
                    }
                }
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    if (((qki0) it2.next()).f28887a == nki0Var) {
                        i = i3;
                        if (i2 >= 0) {
                            arrayList.set(i2, qki0.c((qki0) arrayList.get(i2), false));
                        }
                        arrayList.set(i, qki0.c((qki0) arrayList.get(i), true));
                        imi0Var.h = ((qki0) arrayList.get(i)).f28887a;
                        p7m0Var = imi0Var.m;
                        do {
                            value = p7m0Var.getValue();
                            zli0 zli0Var = (zli0) value;
                            listL0 = CollectionsKt.L0(arrayList);
                            int iOrdinal = nki0Var.ordinal();
                            z = iOrdinal != 23 || iOrdinal == 24 ? !q3d.j(nki0.UNKNOWN, nki0.UNLIMITED).contains(imi0Var.g) : imi0Var.g != imi0Var.h;
                            zli0Var.getClass();
                            listL0.getClass();
                        } while (!p7m0Var.m(value, new zli0(listL0, z)));
                        return Unit.f46060a;
                    }
                    i3++;
                }
                if (i2 >= 0) {
                    arrayList.set(i2, qki0.c((qki0) arrayList.get(i2), false));
                }
                arrayList.set(i, qki0.c((qki0) arrayList.get(i), true));
                imi0Var.h = ((qki0) arrayList.get(i)).f28887a;
                p7m0Var = imi0Var.m;
                do {
                    value = p7m0Var.getValue();
                    zli0 zli0Var2 = (zli0) value;
                    listL0 = CollectionsKt.L0(arrayList);
                    int iOrdinal2 = nki0Var.ordinal();
                    if (iOrdinal2 != 23) {
                    }
                    zli0Var2.getClass();
                    listL0.getClass();
                } while (!p7m0Var.m(value, new zli0(listL0, z)));
                return Unit.f46060a;
            case 1:
                hli0 hli0Var = (hli0) obj;
                hli0Var.getClass();
                ((k3t0) this.receiver).x(hli0Var);
                return Unit.f46060a;
            case 2:
                o1j0 o1j0Var = (o1j0) obj;
                o1j0Var.getClass();
                swi0 swi0Var = (swi0) this.receiver;
                gne0 gne0Var = swi0.X1;
                swi0Var.getClass();
                if (o1j0Var instanceof n1j0) {
                    j120.Y(swi0Var);
                    rqj0 rqj0Var = swi0Var.K1;
                    if (rqj0Var == null) {
                        Intrinsics.h("shortCutManager");
                        throw null;
                    }
                    rqj0Var.b(true);
                    swi0Var.H0().x(qyi0.f29536a);
                } else if (o1j0Var instanceof p0j0) {
                    qjj.W(x0x.Q(swi0Var.u1), null, null, new z8b0(swi0Var, yjeVar, (byte) 16), 3);
                } else if (o1j0Var instanceof s0j0) {
                    ii iiVarG0 = swi0Var.G0();
                    if (swi0Var.M1 == null) {
                        Intrinsics.h("logoutDialogFactory");
                        throw null;
                    }
                    tx00 tx00VarA = ux00.a();
                    androidx.fragment.app.e eVarC = swi0Var.C();
                    eVarC.getClass();
                    iiVarG0.c(tx00VarA, eVarC);
                    j120.g0(swi0Var.o0(), i120.U());
                } else if (o1j0Var instanceof e1j0) {
                    ii iiVarG1 = swi0Var.G0();
                    if (swi0Var.M1 == null) {
                        Intrinsics.h("logoutDialogFactory");
                        throw null;
                    }
                    String strH = swi0Var.H(R.string.exit_dialog_title);
                    String strH2 = swi0Var.H(R.string.exit_dialog_title);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) null, (CharSequence) strH2, swi0Var.H(R.string.cancel), swi0Var.H(R.string.exit_button_without_save), "REQUEST_SHOW_LOGOUT_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1474);
                    tx00.l2.getClass();
                    iiVarG1.c(evz.g(dialogFields, false, true, true), swi0Var.n0().r());
                } else if (o1j0Var instanceof v0j0) {
                    swi0Var.H0().x(new fyi0());
                } else if (o1j0Var instanceof a1j0) {
                    String strH3 = swi0Var.H(R.string.authorization_error);
                    strH3.getClass();
                    String strH4 = swi0Var.H(R.string.lose_message);
                    strH4.getClass();
                    swi0Var.I0(strH3, strH4);
                } else if (o1j0Var instanceof g1j0) {
                    String strH5 = swi0Var.H(R.string.network_error);
                    strH5.getClass();
                    String strH6 = swi0Var.H(R.string.check_connection);
                    strH6.getClass();
                    swi0Var.I0(strH5, strH6);
                } else if (o1j0Var instanceof h1j0) {
                    ii iiVarG2 = swi0Var.G0();
                    String strH7 = swi0Var.H(R.string.caution);
                    String strH8 = swi0Var.H(R.string.payment_balance_error);
                    String strH9 = swi0Var.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, swi0Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC2 = swi0Var.C();
                    eVarC2.getClass();
                    iiVarG2.d(dialogFields2, eVarC2);
                } else if (o1j0Var instanceof l1j0) {
                    nh70 nh70Var = iz80.g2;
                    androidx.fragment.app.e eVarC3 = swi0Var.C();
                    eVarC3.getClass();
                    nh70Var.getClass();
                    nh70.l(eVarC3);
                } else if (o1j0Var instanceof m1j0) {
                    boolean z2 = ((m1j0) o1j0Var).f21011a;
                    ii iiVarG3 = swi0Var.G0();
                    String strH10 = swi0Var.H(R.string.caution);
                    String strH11 = swi0Var.H(z2 ? R.string.open_official_site_description : R.string.open_working_mirror_description);
                    String strH12 = swi0Var.H(R.string.open_app);
                    strH12.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, swi0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SITE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC4 = swi0Var.C();
                    eVarC4.getClass();
                    iiVarG3.d(dialogFields3, eVarC4);
                } else if (o1j0Var instanceof x0j0) {
                    String str = ((x0j0) o1j0Var).f40073a;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    intent.setType("text/plain");
                    swi0Var.w0(Intent.createChooser(intent, null));
                } else if (o1j0Var instanceof r0j0) {
                    Context contextD = swi0Var.D();
                    if (contextD != null) {
                        contextD.startActivity(new Intent("android.settings.DATE_SETTINGS"));
                    }
                } else if (o1j0Var instanceof o0j0) {
                    qjj.W(x0x.Q(swi0Var.u1), null, null, new a220((Object) swi0Var, ((o0j0) o1j0Var).f24428a, yjeVar, (byte) 22), 3);
                } else if (o1j0Var instanceof i1j0) {
                    String str2 = ((i1j0) o1j0Var).f14001a;
                    ii iiVarG4 = swi0Var.G0();
                    String strH13 = swi0Var.H(R.string.error);
                    String strH14 = swi0Var.H(R.string.ok_new);
                    strH14.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH13, (CharSequence) str2, (CharSequence) strH14, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC5 = swi0Var.C();
                    eVarC5.getClass();
                    iiVarG4.d(dialogFields4, eVarC5);
                } else if (o1j0Var instanceof j1j0) {
                    String str3 = ((j1j0) o1j0Var).f15738a;
                    String strH15 = swi0Var.H(R.string.authorization_error);
                    strH15.getClass();
                    swi0Var.I0(strH15, str3);
                } else if (o1j0Var instanceof f1j0) {
                    vvi0 vvi0Var = ((f1j0) o1j0Var).f8766a;
                    qgd qgdVar = swi0Var.V1;
                    if (qgdVar == null) {
                        Intrinsics.h("settingsNavigator");
                        throw null;
                    }
                    kxq kxqVarN0 = swi0Var.n0();
                    String strH16 = swi0Var.H(R.string.access_only_for_authorized);
                    strH16.getClass();
                    x6h0 x6h0Var = new x6h0(swi0Var, vvi0Var, (byte) 13);
                    Context contextO0 = swi0Var.o0();
                    m5d.f(contextO0, R.attr.uikitPrimary, false, m5d.e(m5d.g(contextO0, R.attr.uikitTheme, 6), contextO0));
                    qgdVar.Y(kxqVarN0, strH16, x6h0Var);
                } else if (o1j0Var instanceof c1j0) {
                    d7a d7aVar = ((c1j0) o1j0Var).f3574a;
                    if (swi0Var.O1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH17 = swi0Var.H(R.string.settings);
                    strH17.getClass();
                    gl5.q(swi0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH17);
                } else if (o1j0Var instanceof q0j0) {
                    String str4 = ((q0j0) o1j0Var).f27902a;
                    wdk0 wdk0Var = swi0Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    Spanned spannedFromHtml = Html.fromHtml(str4, 0);
                    spannedFromHtml.getClass();
                    String string = spannedFromHtml.toString();
                    String strH18 = swi0Var.H(R.string.data_copied_to_clipboard);
                    strH18.getClass();
                    j120.M(swi0Var, wdk0Var, "", string, strH18, null, null, null, 112);
                } else if (o1j0Var instanceof u0j0) {
                    vic.C(swi0Var.o0(), ((u0j0) o1j0Var).f34857a);
                } else if (o1j0Var instanceof w0j0) {
                    if (swi0Var.W1 == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC6 = swi0Var.C();
                    eVarC6.getClass();
                    xi70.i(eVarC6);
                } else if (o1j0Var instanceof y0j0) {
                    ii iiVarG5 = swi0Var.G0();
                    String strH19 = swi0Var.H(R.string.delete_account_warning_title);
                    String strH20 = swi0Var.H(R.string.delete_account_warning_message);
                    String strH21 = swi0Var.H(R.string.cancel);
                    strH21.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH19, (CharSequence) strH20, (CharSequence) strH21, swi0Var.H(R.string.remove), (String) null, "REQUEST_DELETE_ACCOUNT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC7 = swi0Var.C();
                    eVarC7.getClass();
                    iiVarG5.d(dialogFields5, eVarC7);
                } else if (!o1j0Var.equals(b1j0.f1808a)) {
                    if (o1j0Var instanceof z0j0) {
                        String str5 = ((z0j0) o1j0Var).f43570a;
                        ii iiVarG6 = swi0Var.G0();
                        String strH22 = swi0Var.H(R.string.cut_app_info_title);
                        Spanned spannedFromHtml2 = Html.fromHtml(str5, 0);
                        spannedFromHtml2.getClass();
                        SpannableString spannableString = new SpannableString(spannedFromHtml2);
                        String strH23 = swi0Var.H(R.string.copy_info);
                        strH23.getClass();
                        DialogFields dialogFields6 = new DialogFields((CharSequence) strH22, (CharSequence) spannableString, (CharSequence) strH23, swi0Var.H(R.string.cancel), (String) null, "REQUEST_APP_INFO_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC8 = swi0Var.C();
                        eVarC8.getClass();
                        iiVarG6.d(dialogFields6, eVarC8);
                    } else if (o1j0Var instanceof k1j0) {
                        String str6 = ((k1j0) o1j0Var).f17527a;
                        wdk0 wdk0Var2 = swi0Var.P1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var2, new xdk0(rek0.b, str6, null, null, null, null, 124), swi0Var, null, null, false, null, 1020);
                    } else if (o1j0Var.equals(t0j0.f33122a)) {
                        if (swi0Var.B() != null && swi0Var.Q1 == null) {
                            Intrinsics.h("consentManager");
                            throw null;
                        }
                    } else {
                        if (!o1j0Var.equals(d1j0.f5311a)) {
                            t9f.b();
                            return null;
                        }
                        if (swi0Var.N1 == null) {
                            Intrinsics.h("confirmChooseLanguageDialogFactory");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC9 = swi0Var.C();
                        eVarC9.getClass();
                        nwd.g(eVarC9);
                    }
                }
                swi0Var.H0().x(dyi0.f6896a);
                return Unit.f46060a;
            case 3:
                czi0 czi0Var = (czi0) obj;
                czi0Var.getClass();
                ((k3t0) this.receiver).x(czi0Var);
                return Unit.f46060a;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((rjo) this.receiver).a(th);
                return Unit.f46060a;
            case 5:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((rjo) this.receiver).a(th2);
                return Unit.f46060a;
            case 6:
                b0j0 b0j0Var = (b0j0) obj;
                b0j0Var.getClass();
                ((k3t0) this.receiver).x(b0j0Var);
                return Unit.f46060a;
            case 7:
                o6j0 o6j0Var = (o6j0) obj;
                o6j0Var.getClass();
                ((k3t0) this.receiver).x(o6j0Var);
                return Unit.f46060a;
            case 8:
                scj0 scj0Var = (scj0) obj;
                scj0Var.getClass();
                qbj0 qbj0Var = (qbj0) this.receiver;
                lme0 lme0Var = qbj0.Z1;
                qbj0Var.getClass();
                if (scj0Var instanceof rcj0) {
                    j120.Y(qbj0Var);
                    rqj0 rqj0Var2 = qbj0Var.M1;
                    if (rqj0Var2 == null) {
                        Intrinsics.h("shortCutManager");
                        throw null;
                    }
                    rqj0Var2.b(true);
                    qbj0Var.H0().x(raj0.f30137a);
                } else if (scj0Var instanceof sbj0) {
                    qjj.W(x0x.Q(qbj0Var.u1), null, null, new z8b0(qbj0Var, yjeVar, (byte) 18), 3);
                } else if (scj0Var instanceof ccj0) {
                    String str7 = ((ccj0) scj0Var).f4114a;
                    ii iiVarG7 = qbj0Var.G0();
                    String strH24 = qbj0Var.H(R.string.cut_app_info_title);
                    Spanned spannedFromHtml3 = Html.fromHtml(str7, 0);
                    spannedFromHtml3.getClass();
                    SpannableString spannableString2 = new SpannableString(spannedFromHtml3);
                    String strH25 = qbj0Var.H(R.string.copy_info);
                    strH25.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH24, (CharSequence) spannableString2, (CharSequence) strH25, qbj0Var.H(R.string.cancel), (String) null, "REQUEST_APP_INFO_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC10 = qbj0Var.C();
                    eVarC10.getClass();
                    iiVarG7.d(dialogFields7, eVarC10);
                } else if (scj0Var instanceof ocj0) {
                    String str8 = ((ocj0) scj0Var).f25030a;
                    wdk0 wdk0Var3 = qbj0Var.R1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, new xdk0(rek0.b, str8, null, null, null, null, 124), qbj0Var, null, null, false, null, 1020);
                } else if (scj0Var instanceof vbj0) {
                    ii iiVarG8 = qbj0Var.G0();
                    if (qbj0Var.O1 == null) {
                        Intrinsics.h("logoutDialogFactory");
                        throw null;
                    }
                    tx00 tx00VarA2 = ux00.a();
                    androidx.fragment.app.e eVarC11 = qbj0Var.C();
                    eVarC11.getClass();
                    iiVarG8.c(tx00VarA2, eVarC11);
                    j120.g0(qbj0Var.o0(), i120.U());
                } else if (scj0Var instanceof icj0) {
                    ii iiVarG9 = qbj0Var.G0();
                    if (qbj0Var.O1 == null) {
                        Intrinsics.h("logoutDialogFactory");
                        throw null;
                    }
                    String strH26 = qbj0Var.H(R.string.exit_dialog_title);
                    String strH27 = qbj0Var.H(R.string.exit_dialog_title);
                    strH27.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH26, (CharSequence) null, (CharSequence) strH27, qbj0Var.H(R.string.cancel), qbj0Var.H(R.string.exit_button_without_save), "REQUEST_SHOW_LOGOUT_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1474);
                    tx00.l2.getClass();
                    iiVarG9.c(evz.g(dialogFields8, false, true, true), qbj0Var.n0().r());
                } else if (scj0Var instanceof ybj0) {
                    qbj0Var.H0().x(new maj0());
                } else if (scj0Var instanceof dcj0) {
                    String strH28 = qbj0Var.H(R.string.authorization_error);
                    strH28.getClass();
                    String strH29 = qbj0Var.H(R.string.lose_message);
                    strH29.getClass();
                    qbj0Var.I0(strH28, strH29);
                } else if (scj0Var instanceof kcj0) {
                    String strH30 = qbj0Var.H(R.string.network_error);
                    strH30.getClass();
                    String strH31 = qbj0Var.H(R.string.check_connection);
                    strH31.getClass();
                    qbj0Var.I0(strH30, strH31);
                } else if (scj0Var instanceof lcj0) {
                    ii iiVarG10 = qbj0Var.G0();
                    String strH32 = qbj0Var.H(R.string.caution);
                    String strH33 = qbj0Var.H(R.string.payment_balance_error);
                    String strH34 = qbj0Var.H(R.string.ok_new);
                    strH34.getClass();
                    DialogFields dialogFields9 = new DialogFields((CharSequence) strH32, (CharSequence) strH33, (CharSequence) strH34, qbj0Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC12 = qbj0Var.C();
                    eVarC12.getClass();
                    iiVarG10.d(dialogFields9, eVarC12);
                } else if (scj0Var instanceof pcj0) {
                    nh70 nh70Var2 = iz80.g2;
                    androidx.fragment.app.e eVarC13 = qbj0Var.C();
                    eVarC13.getClass();
                    nh70Var2.getClass();
                    nh70.l(eVarC13);
                } else if (scj0Var instanceof qcj0) {
                    boolean z3 = ((qcj0) scj0Var).f28486a;
                    ii iiVarG11 = qbj0Var.G0();
                    String strH35 = qbj0Var.H(R.string.caution);
                    String strH36 = qbj0Var.H(z3 ? R.string.open_official_site_description : R.string.open_working_mirror_description);
                    String strH37 = qbj0Var.H(R.string.open_app);
                    strH37.getClass();
                    DialogFields dialogFields10 = new DialogFields((CharSequence) strH35, (CharSequence) strH36, (CharSequence) strH37, qbj0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SITE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC14 = qbj0Var.C();
                    eVarC14.getClass();
                    iiVarG11.d(dialogFields10, eVarC14);
                } else if (scj0Var instanceof acj0) {
                    String str9 = ((acj0) scj0Var).f630a;
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.SEND");
                    intent2.putExtra("android.intent.extra.TEXT", str9);
                    intent2.setType("text/plain");
                    qbj0Var.w0(Intent.createChooser(intent2, null));
                } else if (scj0Var instanceof ubj0) {
                    qbj0Var.o0().startActivity(new Intent("android.settings.DATE_SETTINGS"));
                } else if (scj0Var instanceof rbj0) {
                    qjj.W(x0x.Q(qbj0Var.u1), null, null, new a220((Object) qbj0Var, ((rbj0) scj0Var).f30190a, yjeVar, (byte) 25), 3);
                } else if (scj0Var instanceof mcj0) {
                    String str10 = ((mcj0) scj0Var).f21555a;
                    ii iiVarG12 = qbj0Var.G0();
                    String strH38 = qbj0Var.H(R.string.error);
                    String strH39 = qbj0Var.H(R.string.ok_new);
                    strH39.getClass();
                    DialogFields dialogFields11 = new DialogFields((CharSequence) strH38, (CharSequence) str10, (CharSequence) strH39, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC15 = qbj0Var.C();
                    eVarC15.getClass();
                    iiVarG12.d(dialogFields11, eVarC15);
                } else if (scj0Var instanceof ncj0) {
                    String str11 = ((ncj0) scj0Var).f23298a;
                    String strH40 = qbj0Var.H(R.string.authorization_error);
                    strH40.getClass();
                    qbj0Var.I0(strH40, str11);
                } else if (scj0Var instanceof jcj0) {
                    vvi0 vvi0Var2 = ((jcj0) scj0Var).f16280a;
                    qgd qgdVar2 = qbj0Var.V1;
                    if (qgdVar2 == null) {
                        Intrinsics.h("settingsNavigator");
                        throw null;
                    }
                    kxq kxqVarN1 = qbj0Var.n0();
                    String strH41 = qbj0Var.H(R.string.access_only_for_authorized);
                    strH41.getClass();
                    x6h0 x6h0Var2 = new x6h0(qbj0Var, vvi0Var2, (byte) 19);
                    Context contextO1 = qbj0Var.o0();
                    m5d.f(contextO1, R.attr.uikitPrimary, false, m5d.e(m5d.g(contextO1, R.attr.uikitTheme, 6), contextO1));
                    qgdVar2.Y(kxqVarN1, strH41, x6h0Var2);
                } else if (scj0Var instanceof fcj0) {
                    d7a d7aVar2 = ((fcj0) scj0Var).f9315a;
                    if (qbj0Var.Q1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH42 = qbj0Var.H(R.string.settings);
                    strH42.getClass();
                    gl5.q(qbj0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar2, strH42);
                } else if (scj0Var instanceof tbj0) {
                    String str12 = ((tbj0) scj0Var).f33667a;
                    wdk0 wdk0Var4 = qbj0Var.R1;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    Spanned spannedFromHtml4 = Html.fromHtml(str12, 0);
                    spannedFromHtml4.getClass();
                    String string2 = spannedFromHtml4.toString();
                    String strH43 = qbj0Var.H(R.string.data_copied_to_clipboard);
                    strH43.getClass();
                    j120.M(qbj0Var, wdk0Var4, "", string2, strH43, null, null, null, 112);
                } else if (scj0Var instanceof xbj0) {
                    vic.C(qbj0Var.o0(), ((xbj0) scj0Var).f40603a);
                } else if (scj0Var instanceof zbj0) {
                    if (qbj0Var.X1 == null) {
                        Intrinsics.h("quickBetDialogNavigator");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC16 = qbj0Var.C();
                    eVarC16.getClass();
                    xi70.i(eVarC16);
                } else if (scj0Var instanceof bcj0) {
                    ii iiVarG13 = qbj0Var.G0();
                    String strH44 = qbj0Var.H(R.string.delete_account_warning_title);
                    String strH45 = qbj0Var.H(R.string.delete_account_warning_message);
                    String strH46 = qbj0Var.H(R.string.cancel);
                    strH46.getClass();
                    DialogFields dialogFields12 = new DialogFields((CharSequence) strH44, (CharSequence) strH45, (CharSequence) strH46, qbj0Var.H(R.string.remove), (String) null, "REQUEST_DELETE_ACCOUNT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC17 = qbj0Var.C();
                    eVarC17.getClass();
                    iiVarG13.d(dialogFields12, eVarC17);
                } else if (scj0Var.equals(ecj0.f7569a)) {
                    ynb ynbVar = qbj0Var.W1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.g;
                    androidx.fragment.app.e eVarC18 = qbj0Var.C();
                    eVarC18.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC18, false, "SELECT_BALANCE_REQUEST_KEY", 430);
                } else if (scj0Var instanceof gcj0) {
                    gcj0 gcj0Var = (gcj0) scj0Var;
                    ii iiVarG14 = qbj0Var.G0();
                    gl5 gl5Var = onb.i2;
                    String strH47 = qbj0Var.H(R.string.attention);
                    String str13 = gcj0Var.f11065a;
                    String strH48 = qbj0Var.H(R.string.ok_new);
                    strH48.getClass();
                    DialogFields dialogFields13 = new DialogFields((CharSequence) strH47, (CharSequence) str13, (CharSequence) strH48, qbj0Var.H(R.string.cancel), (String) null, "CHANGE_BALANCE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    ql5 ql5Var = gcj0Var.b;
                    gl5Var.getClass();
                    ql5Var.getClass();
                    onb onbVar = new onb();
                    onbVar.R0(dialogFields13);
                    String str14 = dialogFields13.f;
                    if (str14 == null) {
                        str14 = "";
                    }
                    iiy[] iiyVarArr = onb.j2;
                    onbVar.f2.x(onbVar, iiyVarArr[0], str14);
                    onbVar.g2.x(onbVar, iiyVarArr[1], "GET_BALANCE_REQUEST_KEY");
                    onbVar.h2.u(onbVar, iiyVarArr[2], ql5Var);
                    androidx.fragment.app.e eVarC19 = qbj0Var.C();
                    eVarC19.getClass();
                    iiVarG14.c(onbVar, eVarC19);
                } else if (scj0Var.equals(wbj0.f38882a)) {
                    if (qbj0Var.B() != null && qbj0Var.S1 == null) {
                        Intrinsics.h("consentManager");
                        throw null;
                    }
                } else {
                    if (!scj0Var.equals(hcj0.f12827a)) {
                        t9f.b();
                        return null;
                    }
                    if (qbj0Var.P1 == null) {
                        Intrinsics.h("confirmChooseLanguageDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC20 = qbj0Var.C();
                    eVarC20.getClass();
                    nwd.g(eVarC20);
                }
                qbj0Var.H0().x(kaj0.f17966a);
                return Unit.f46060a;
            case 9:
                lbj0 lbj0Var = (lbj0) obj;
                lbj0Var.getClass();
                ((k3t0) this.receiver).x(lbj0Var);
                return Unit.f46060a;
            case 10:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((rjo) this.receiver).a(th3);
                return Unit.f46060a;
            case 11:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((rjo) this.receiver).a(th4);
                return Unit.f46060a;
            case 12:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((rjo) this.receiver).a(th5);
                return Unit.f46060a;
            case 13:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((rjo) this.receiver).a(th6);
                return Unit.f46060a;
            case 14:
                return Q(obj);
            case 15:
                czi0 czi0Var2 = (czi0) obj;
                czi0Var2.getClass();
                ((k3t0) this.receiver).x(czi0Var2);
                return Unit.f46060a;
            case 16:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((rjo) this.receiver).a(th7);
                return Unit.f46060a;
            case 17:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((rjo) this.receiver).a(th8);
                return Unit.f46060a;
            case 18:
                ulj0 ulj0Var = (ulj0) obj;
                ulj0Var.getClass();
                rlj0 rlj0Var = (rlj0) this.receiver;
                eke0 eke0Var = rlj0.O1;
                rlj0Var.getClass();
                Bitmap bitmap = ulj0Var.f35875a;
                try {
                    File file = new File(rlj0Var.o0().getExternalFilesDir(Environment.DIRECTORY_PICTURES), "app_qr_image_" + System.currentTimeMillis() + ".png");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        uriC = FileProvider.c(rlj0Var.o0(), file, "org.xbet.client1.provider");
                    } catch (Throwable th9) {
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            bkb.E(fileOutputStream, th9);
                            throw th10;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    uriC = null;
                }
                if (uriC != null) {
                    Intent intent3 = new Intent();
                    intent3.setAction("android.intent.action.SEND");
                    intent3.putExtra("android.intent.extra.STREAM", uriC);
                    intent3.setType("image/png");
                    rlj0Var.w0(Intent.createChooser(intent3, null));
                }
                ((k3t0) rlj0Var.N1.getValue()).x(hlj0.f13264a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                olj0 olj0Var = (olj0) obj;
                olj0Var.getClass();
                ((k3t0) this.receiver).x(olj0Var);
                return Unit.f46060a;
            case 20:
                olj0 olj0Var2 = (olj0) obj;
                olj0Var2.getClass();
                ((k3t0) this.receiver).x(olj0Var2);
                return Unit.f46060a;
            case 21:
                olj0 olj0Var3 = (olj0) obj;
                olj0Var3.getClass();
                ((k3t0) this.receiver).x(olj0Var3);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                bmj0 bmj0Var = (bmj0) this.receiver;
                p7m0 p7m0Var2 = bmj0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    bmj0Var.f.getClass();
                } while (!p7m0Var2.m(value2, vlj0.a((vlj0) value2, 0, null, null, false, true, 47)));
                return Unit.f46060a;
            case 23:
                mmj0 mmj0Var = (mmj0) obj;
                mmj0Var.getClass();
                ((k3t0) this.receiver).x(mmj0Var);
                return Unit.f46060a;
            case 24:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((eoj0) this.receiver).y.b(th11, new ogj0(b3));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                final eoj0 eoj0Var = (eoj0) this.receiver;
                eoj0Var.y.b(th12, new Function2() { // from class: a.znj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b;
                        eoj0 eoj0Var2 = eoj0Var;
                        Throwable th13 = (Throwable) obj2;
                        String str15 = (String) obj3;
                        switch (b4) {
                            case 0:
                                th13.getClass();
                                str15.getClass();
                                eoj0Var2.G(new pnj0(eoj0Var2.z.b.a(R.string.coupon_image_share_error, Arrays.copyOf(new Object[0], 0)), th13 instanceof xto ? eoj0Var2.z.b.a(R.string.coupon_image_save_error_not_enough_memory, Arrays.copyOf(new Object[0], 0)) : eoj0Var2.z.b.a(R.string.coupon_image_share_error_reopen_screen, Arrays.copyOf(new Object[0], 0))));
                                break;
                            default:
                                th13.getClass();
                                str15.getClass();
                                eoj0Var2.G(new pnj0(eoj0Var2.z.b.a(R.string.coupon_image_save_error, Arrays.copyOf(new Object[0], 0)), th13 instanceof xto ? eoj0Var2.z.b.a(R.string.coupon_image_save_error_not_enough_memory, Arrays.copyOf(new Object[0], 0)) : eoj0Var2.z.b.a(R.string.coupon_image_save_error_reopen_screen, Arrays.copyOf(new Object[0], 0))));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                final eoj0 eoj0Var2 = (eoj0) this.receiver;
                eoj0Var2.y.b(th13, new Function2() { // from class: a.znj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b2;
                        eoj0 eoj0Var3 = eoj0Var2;
                        Throwable th14 = (Throwable) obj2;
                        String str15 = (String) obj3;
                        switch (b4) {
                            case 0:
                                th14.getClass();
                                str15.getClass();
                                eoj0Var3.G(new pnj0(eoj0Var3.z.b.a(R.string.coupon_image_share_error, Arrays.copyOf(new Object[0], 0)), th14 instanceof xto ? eoj0Var3.z.b.a(R.string.coupon_image_save_error_not_enough_memory, Arrays.copyOf(new Object[0], 0)) : eoj0Var3.z.b.a(R.string.coupon_image_share_error_reopen_screen, Arrays.copyOf(new Object[0], 0))));
                                break;
                            default:
                                th14.getClass();
                                str15.getClass();
                                eoj0Var3.G(new pnj0(eoj0Var3.z.b.a(R.string.coupon_image_save_error, Arrays.copyOf(new Object[0], 0)), th14 instanceof xto ? eoj0Var3.z.b.a(R.string.coupon_image_save_error_not_enough_memory, Arrays.copyOf(new Object[0], 0)) : eoj0Var3.z.b.a(R.string.coupon_image_save_error_reopen_screen, Arrays.copyOf(new Object[0], 0))));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((eoj0) this.receiver).y.b(th14, new ogj0(b3));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((duj) this.receiver).a(th15);
                return Unit.f46060a;
            default:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((duj) this.receiver).a(th16);
                return Unit.f46060a;
        }
    }
}
