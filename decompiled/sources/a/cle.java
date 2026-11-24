package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class cle implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4553a;
    public final /* synthetic */ View b;

    public /* synthetic */ cle(View view, byte b) {
        this.f4553a = b;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        byte b = this.f4553a;
        View view2 = this.b;
        switch (b) {
            case 0:
                ((CoordinatorLayout) view2).q(0);
                break;
            case 1:
                x6v x6vVar = (x6v) view2;
                x6vVar.postInvalidateOnAnimation();
                ViewGroup viewGroup = x6vVar.f40383a;
                if (viewGroup != null && (view = x6vVar.b) != null) {
                    viewGroup.endViewTransition(view);
                    x6vVar.f40383a.postInvalidateOnAnimation();
                    x6vVar.f40383a = null;
                    x6vVar.b = null;
                }
                break;
            default:
                TextView textView = (TextView) view2;
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (textView.getLineCount() <= 1) {
                    textView.setTextSize(14.0f);
                } else {
                    textView.setTextSize(12.0f);
                }
                break;
        }
        return true;
    }
}
