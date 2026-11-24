package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class nku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f23698a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;

    public nku0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f23698a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23698a;
    }
}
