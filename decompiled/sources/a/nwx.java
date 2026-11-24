package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class nwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24257a;
    public final AppCompatImageView b;
    public final MaterialTextView c;
    public final MaterialTextView d;

    public nwx(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f24257a = constraintLayout;
        this.b = appCompatImageView;
        this.c = materialTextView;
        this.d = materialTextView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24257a;
    }
}
