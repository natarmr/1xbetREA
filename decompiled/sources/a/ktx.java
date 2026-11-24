package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ktx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f18886a;
    public final AppCompatTextView b;

    public ktx(FrameLayout frameLayout, AppCompatTextView appCompatTextView) {
        this.f18886a = frameLayout;
        this.b = appCompatTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18886a;
    }
}
