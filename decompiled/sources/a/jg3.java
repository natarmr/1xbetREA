package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public final class jg3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f16460a;
    public final AppCompatImageView b;

    public jg3(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f16460a = appCompatImageView;
        this.b = appCompatImageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16460a;
    }
}
