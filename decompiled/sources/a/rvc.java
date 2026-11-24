package a;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class rvc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tvc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvc(tvc tvcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tvcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tvc tvcVar = this.k;
        switch (b) {
            case 0:
                rvc rvcVar = new rvc(tvcVar, yjeVar, (byte) 0);
                rvcVar.j = obj;
                return rvcVar;
            default:
                rvc rvcVar2 = new rvc(tvcVar, yjeVar, (byte) 1);
                rvcVar2.j = obj;
                return rvcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rvc) create((fwc) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rvc) create((bwc) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                fwc fwcVar = (fwc) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (fwcVar != null) {
                    boolean z = fwcVar instanceof cwc;
                    tvc tvcVar = this.k;
                    if (z) {
                        gl5 gl5Var = tvc.R1;
                        q6r q6rVarG0 = tvcVar.G0();
                        q6rVarG0.f.setVisibility(!tvcVar.S() ? 0 : 8);
                        q6rVarG0.e.setVisibility(tvcVar.S() ? 0 : 8);
                    } else if (fwcVar instanceof dwc) {
                        dwc dwcVar = (dwc) fwcVar;
                        uvc uvcVar = dwcVar.f6791a;
                        String str = uvcVar.i;
                        String str2 = dwcVar.b;
                        gl5 gl5Var2 = tvc.R1;
                        q6r q6rVarG1 = tvcVar.G0();
                        String str3 = uvcVar.k;
                        if (str.length() > 0) {
                            q6rVarG1.d.setTitle(str);
                        }
                        if (str3.length() > 0) {
                            q6rVarG1.c.setVisibility(8);
                        }
                        q6r q6rVarG2 = tvcVar.G0();
                        q6rVarG2.f.setVisibility(tvcVar.S() ? 0 : 8);
                        q6rVarG2.e.setVisibility(tvcVar.S() ? 8 : 0);
                        List list = u0d.f34849a;
                        LoadableImageView loadableImageView = q6rVarG1.b;
                        FixedWebView fixedWebView = q6rVarG1.f;
                        u0d.j(loadableImageView, uvcVar.b, R.drawable.plug_news, 0, null, null, null, 508);
                        String strK = b1j.k("<html><head>", tvcVar.Q1, "</head>", str3, "</html>");
                        siq fixedWebView2 = fixedWebView.getFixedWebView();
                        if (fixedWebView2 != null) {
                            fixedWebView2.loadDataWithBaseURL(str2, strK, "text/html", "UTF-8", "");
                        }
                        fixedWebView.setVisibility(0);
                    } else if (fwcVar instanceof ewc) {
                        ra10 ra10Var = ((ewc) fwcVar).f8516a;
                        gl5 gl5Var3 = tvc.R1;
                        q6r q6rVarG3 = tvcVar.G0();
                        q6rVarG3.f.setVisibility(8);
                        q6rVarG3.e.setVisibility(8);
                        LottieView lottieView = q6rVarG3.c;
                        lottieView.v(ra10Var);
                        lottieView.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                bwc bwcVar = (bwc) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (bwcVar == null) {
                    t9f.b();
                    return null;
                }
                tvc tvcVar2 = this.k;
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(bwcVar.f3316a));
                gl5 gl5Var4 = tvc.R1;
                try {
                    tvcVar2.w0(intent);
                    break;
                } catch (Exception unused) {
                    wdk0 wdk0Var = tvcVar2.L1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH = tvcVar2.H(R.string.intent_app_not_installed);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), tvcVar2, null, null, false, null, 1020);
                }
                return Unit.f46060a;
        }
    }
}
