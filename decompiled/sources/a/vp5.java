package a;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class vp5 extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x0x.s(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x0x.O(this);
    }
}
