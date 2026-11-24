package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class jku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f16687a;
    public final ImageView b;
    public final ImageView c;

    public jku0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.f16687a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16687a;
    }
}
