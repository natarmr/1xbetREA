package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class es6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8314a;
    public final ImageView b;
    public final View c;

    public es6(ConstraintLayout constraintLayout, ImageView imageView, View view) {
        this.f8314a = constraintLayout;
        this.b = imageView;
        this.c = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8314a;
    }
}
