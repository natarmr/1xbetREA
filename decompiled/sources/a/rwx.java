package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final class rwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f31236a;
    public final DsSeparator b;
    public final TextView c;

    public rwx(FrameLayout frameLayout, DsSeparator dsSeparator, TextView textView) {
        this.f31236a = frameLayout;
        this.b = dsSeparator;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31236a;
    }
}
