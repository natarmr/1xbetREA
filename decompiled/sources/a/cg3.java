package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class cg3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f4293a;
    public final AppCompatImageView b;

    public cg3(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f4293a = appCompatImageView;
        this.b = appCompatImageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4293a;
    }
}
