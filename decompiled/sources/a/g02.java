package a;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g02 implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10439a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g02(Object obj, byte b) {
        this.f10439a = b;
        this.b = obj;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        byte b = this.f10439a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WebView webView = ((ax0) obj).f1599a;
                int i = h02.f12211a[kkzVar.ordinal()];
                if (i == 1) {
                    if (webView != null) {
                        webView.onResume();
                    }
                } else if (i == 2 && webView != null) {
                    webView.onPause();
                }
                break;
            case 1:
                ck60 ck60Var = (ck60) obj;
                if (kkzVar == kkz.ON_RESUME) {
                    ck60Var.invoke();
                }
                break;
            case 2:
                wjd wjdVar = (wjd) obj;
                wjdVar.getClass();
                wjdVar.b = kkzVar.a();
                wjdVar.a();
                break;
            case 3:
                h0h0 h0h0Var = (h0h0) obj;
                if (kkzVar == kkz.ON_START) {
                    h0h0Var.h = true;
                } else if (kkzVar == kkz.ON_STOP) {
                    h0h0Var.h = false;
                }
                break;
            default:
                x1 x1Var = (x1) obj;
                if (kkzVar == kkz.ON_DESTROY) {
                    x1Var.e();
                }
                break;
        }
    }
}
