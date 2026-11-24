package a;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class yhb implements zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42630a = 0;
    public final /* synthetic */ View b;

    public yhb(bib bibVar, View view) {
        this.b = view;
    }

    @Override // a.zf60
    public final xiv0 l(View view, xiv0 xiv0Var) {
        byte b = this.f42630a;
        view.getClass();
        switch (b) {
            case 0:
                uiv0 uiv0Var = xiv0Var.f40966a;
                int i = uiv0Var.i(1).b;
                bj5 bj5Var = bib.X1;
                int i2 = uiv0Var.u(8) ? uiv0Var.i(8).d - uiv0Var.i(2).d : 0;
                View view2 = this.b;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null && (marginLayoutParams.topMargin != i || marginLayoutParams.bottomMargin != i2)) {
                    sj3.L0(view2, 0, i, 0, i2, 5);
                }
                return xiv0.b;
            default:
                int i3 = xiv0Var.f40966a.i(2).d;
                View view3 = this.b;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), i3);
                return xiv0Var;
        }
    }

    public yhb(View view) {
        this.b = view;
    }
}
