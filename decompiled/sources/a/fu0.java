package a;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class fu0 implements rg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10140a;
    public final /* synthetic */ qog0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ yx5 f;

    public /* synthetic */ fu0(qog0 qog0Var, String str, yx5 yx5Var, String str2, String str3, byte b) {
        this.f10140a = b;
        this.b = qog0Var;
        this.c = str;
        this.f = yx5Var;
        this.d = str2;
        this.e = str3;
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        byte b = this.f10140a;
        qog0 qog0Var = this.b;
        String str = this.e;
        String str2 = this.d;
        String str3 = this.c;
        yx5 yx5Var = this.f;
        switch (b) {
            case 0:
                jdk0 jdk0Var = jdk0.f16332a;
                hu0 hu0Var = (hu0) yx5Var;
                if (n7x.p(arrayList)) {
                    try {
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str3));
                        String strGuessFileName = URLUtil.guessFileName(str3, str2, null);
                        request.setTitle(strGuessFileName);
                        String cookie = CookieManager.getInstance().getCookie(str3);
                        if (cookie != null) {
                            request.addRequestHeader("Cookie", cookie);
                        }
                        if (str != null) {
                            request.addRequestHeader("User-Agent", str);
                        }
                        request.setNotificationVisibility(1);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                        Context contextD = hu0Var.D();
                        Object systemService = contextD != null ? contextD.getSystemService("download") : null;
                        DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
                        if (downloadManager != null) {
                            downloadManager.enqueue(request);
                        }
                        wdk0 wdk0Var = hu0Var.W1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackBarManager");
                            throw null;
                        }
                        pek0 pek0Var = pek0.f26859a;
                        String strH = hu0Var.H(R.string.download_file_description);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, jdk0Var, null, 108), (hu0) yx5Var, null, null, false, null, 1020);
                    } catch (Throwable unused) {
                        wdk0 wdk0Var2 = hu0Var.W1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackBarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH2 = hu0Var.H(R.string.download_file_error_description);
                        strH2.getClass();
                        wdk0.k(wdk0Var2, new xdk0(rek0Var, strH2, null, null, jdk0Var, null, 108), (hu0) yx5Var, null, null, false, null, 1020);
                    }
                } else {
                    rek0 rek0Var2 = hu0.Y1;
                    hu0Var.getClass();
                    ccq0.V(hu0Var, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new eu0(hu0Var, (byte) 2));
                    ii iiVar = hu0Var.V1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH3 = hu0Var.H(R.string.confirmation);
                    String strH4 = hu0Var.H(R.string.permission_message_data_text);
                    n12 n12Var = n12.b;
                    String strH5 = hu0Var.H(R.string.permission_allow_button_text);
                    strH5.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, hu0Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12Var, false, 1488);
                    androidx.fragment.app.e eVarC = hu0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                }
                qog0Var.f29072a.remove(this);
                return;
            default:
                jdk0 jdk0Var2 = jdk0.f16332a;
                m71 m71Var = (m71) yx5Var;
                if (n7x.p(arrayList)) {
                    try {
                        DownloadManager.Request request2 = new DownloadManager.Request(Uri.parse(str3));
                        String strGuessFileName2 = URLUtil.guessFileName(str3, str2, null);
                        request2.setTitle(strGuessFileName2);
                        String cookie2 = CookieManager.getInstance().getCookie(str3);
                        if (cookie2 != null) {
                            request2.addRequestHeader("Cookie", cookie2);
                        }
                        if (str != null) {
                            request2.addRequestHeader("User-Agent", str);
                        }
                        request2.setNotificationVisibility(1);
                        request2.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName2);
                        Context contextD2 = m71Var.D();
                        Object systemService2 = contextD2 != null ? contextD2.getSystemService("download") : null;
                        DownloadManager downloadManager2 = systemService2 instanceof DownloadManager ? (DownloadManager) systemService2 : null;
                        if (downloadManager2 != null) {
                            downloadManager2.enqueue(request2);
                        }
                        wdk0 wdk0VarI0 = m71Var.I0();
                        pek0 pek0Var2 = pek0.f26859a;
                        String strH6 = m71Var.H(R.string.download_file_description);
                        strH6.getClass();
                        wdk0.k(wdk0VarI0, new xdk0(pek0Var2, strH6, null, null, jdk0Var2, null, 108), (m71) yx5Var, null, null, false, null, 1020);
                    } catch (Throwable unused2) {
                        wdk0 wdk0VarI1 = m71Var.I0();
                        rek0 rek0Var3 = rek0.b;
                        String strH7 = m71Var.H(R.string.download_file_error_description);
                        strH7.getClass();
                        wdk0.k(wdk0VarI1, new xdk0(rek0Var3, strH7, null, null, jdk0Var2, null, 108), (m71) yx5Var, null, null, false, null, 1020);
                    }
                    break;
                } else {
                    rek0 rek0Var4 = m71.e2;
                    m71Var.getClass();
                    ccq0.V(m71Var, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new k71(m71Var, (byte) 0));
                    ii iiVarH0 = m71Var.H0();
                    String strH8 = m71Var.H(R.string.confirmation);
                    String strH9 = m71Var.H(R.string.permission_message_data_text);
                    n12 n12Var2 = n12.b;
                    String strH10 = m71Var.H(R.string.permission_allow_button_text);
                    strH10.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, m71Var.H(R.string.cancel), (String) null, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12Var2, false, 1488);
                    androidx.fragment.app.e eVarC2 = m71Var.C();
                    eVarC2.getClass();
                    iiVarH0.d(dialogFields2, eVarC2);
                }
                qog0Var.f29072a.remove(this);
                return;
        }
    }
}
