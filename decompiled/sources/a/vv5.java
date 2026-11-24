package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vv5 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38082a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vv5(Object obj, Object obj2, byte b) {
        this.f38082a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f38082a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ComposeView composeView = (ComposeView) obj2;
                qz40 qz40Var = (qz40) obj;
                iiy[] iiyVarArr = iw5.j2;
                if (view != null && composeView.getWidth() != view.getWidth()) {
                    composeView.getLayoutParams().width = view.getWidth();
                    composeView.requestLayout();
                    Integer numValueOf = Integer.valueOf(view.getWidth());
                    p7m0 p7m0Var = (p7m0) qz40Var;
                    p7m0Var.getClass();
                    p7m0Var.o(null, numValueOf);
                    break;
                }
                break;
            default:
                int[] iArr = (int[]) obj2;
                view.getLocationInWindow(iArr);
                ((aa50) obj).a(Float.valueOf(iArr[1]));
                break;
        }
    }
}
