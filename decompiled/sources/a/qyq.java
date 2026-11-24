package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.AnimatingPasswordTextView;
import org.xplatform.ui_core.viewcomponents.views.NumberKeyboardView;

/* JADX INFO: loaded from: classes3.dex */
public final class qyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29547a;
    public final NumberKeyboardView b;
    public final TextView c;
    public final AnimatingPasswordTextView d;

    public qyq(ConstraintLayout constraintLayout, NumberKeyboardView numberKeyboardView, TextView textView, AnimatingPasswordTextView animatingPasswordTextView) {
        this.f29547a = constraintLayout;
        this.b = numberKeyboardView;
        this.c = textView;
        this.d = animatingPasswordTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29547a;
    }
}
