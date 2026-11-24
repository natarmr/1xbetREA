package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class lik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f20111a;
    public final TextView b;

    public lik(FrameLayout frameLayout, TextView textView) {
        this.f20111a = frameLayout;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20111a;
    }
}
