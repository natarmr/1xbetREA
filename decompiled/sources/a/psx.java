package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class psx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f27536a;
    public final AppCompatTextView b;

    public psx(FrameLayout frameLayout, AppCompatTextView appCompatTextView) {
        this.f27536a = frameLayout;
        this.b = appCompatTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27536a;
    }
}
