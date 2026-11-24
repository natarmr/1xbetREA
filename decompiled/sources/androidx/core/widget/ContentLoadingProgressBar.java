package androidx.core.widget;

import a.uee;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45358a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final uee e;
    public final uee f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f45358a = -1L;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new uee(this, (byte) 0);
        this.f = new uee(this, (byte) 1);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
