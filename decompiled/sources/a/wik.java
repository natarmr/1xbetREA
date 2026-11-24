package a;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class wik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39217a;
    public final ImageView b;
    public final AppCompatImageView c;
    public final SwipeBackLayout d;

    public wik(ConstraintLayout constraintLayout, ImageView imageView, AppCompatImageView appCompatImageView, SwipeBackLayout swipeBackLayout) {
        this.f39217a = constraintLayout;
        this.b = imageView;
        this.c = appCompatImageView;
        this.d = swipeBackLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39217a;
    }
}
