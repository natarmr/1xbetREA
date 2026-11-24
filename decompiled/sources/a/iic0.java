package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class iic0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f14823a;
    public final AppCompatImageView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;

    public iic0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.f14823a = constraintLayout;
        this.b = appCompatImageView;
        this.c = frameLayout;
        this.d = frameLayout2;
        this.e = frameLayout3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14823a;
    }
}
