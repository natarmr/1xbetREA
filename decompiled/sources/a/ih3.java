package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ih3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f14762a;
    public final AppCompatImageView b;

    public ih3(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f14762a = appCompatImageView;
        this.b = appCompatImageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14762a;
    }
}
