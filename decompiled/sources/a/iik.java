package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class iik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f14831a;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final ImageView d;
    public final ImageView e;
    public final Button f;
    public final LinearLayout g;

    public iik(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, Button button, LinearLayout linearLayout) {
        this.f14831a = nestedScrollView;
        this.b = constraintLayout;
        this.c = constraintLayout2;
        this.d = imageView;
        this.e = imageView2;
        this.f = button;
        this.g = linearLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14831a;
    }
}
