package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jd3 extends dku0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16310a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd3(Object obj, byte b) {
        this.f16310a = b;
        this.b = obj;
    }

    @Override // a.cku0
    public final void onAnimationEnd() {
        byte b = this.f16310a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pd3 pd3Var = ((id3) obj).b;
                pd3Var.u.setAlpha(1.0f);
                pd3Var.x.d(null);
                pd3Var.x = null;
                break;
            case 1:
                pd3 pd3Var2 = (pd3) obj;
                pd3Var2.u.setAlpha(1.0f);
                pd3Var2.x.d(null);
                pd3Var2.x = null;
                break;
            default:
                pd3 pd3Var3 = (pd3) ((xex) obj).b;
                pd3Var3.u.setVisibility(8);
                PopupWindow popupWindow = pd3Var3.v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (pd3Var3.u.getParent() instanceof View) {
                    View view = (View) pd3Var3.u.getParent();
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    view.requestApplyInsets();
                }
                pd3Var3.u.e();
                pd3Var3.x.d(null);
                pd3Var3.x = null;
                ViewGroup viewGroup = pd3Var3.z;
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // a.dku0, a.cku0
    public void onAnimationStart() {
        byte b = this.f16310a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((id3) obj).b.u.setVisibility(0);
                break;
            case 1:
                pd3 pd3Var = (pd3) obj;
                pd3Var.u.setVisibility(0);
                if (pd3Var.u.getParent() instanceof View) {
                    View view = (View) pd3Var.u.getParent();
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
