package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class kku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18458a;
    public final ImageView b;
    public final ImageView c;

    public kku0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.f18458a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18458a;
    }
}
