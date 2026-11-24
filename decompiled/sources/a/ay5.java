package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ay5 extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View.inflate(getContext(), getLayoutView(), this);
    }

    public abstract int getLayoutView();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public void a() {
    }
}
