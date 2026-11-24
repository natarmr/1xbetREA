package a;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class x5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40331a;
    public final AppCompatTextView b;
    public final ImageView c;
    public final AppCompatTextView d;
    public final AppCompatButton e;
    public final AppCompatTextView f;
    public final AppCompatTextView g;
    public final AppCompatButton h;

    public x5r(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ImageView imageView, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatButton appCompatButton2) {
        this.f40331a = constraintLayout;
        this.b = appCompatTextView;
        this.c = imageView;
        this.d = appCompatTextView2;
        this.e = appCompatButton;
        this.f = appCompatTextView3;
        this.g = appCompatTextView4;
        this.h = appCompatButton2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40331a;
    }
}
