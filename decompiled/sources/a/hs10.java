package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class hs10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f13559a;
    public final ImageView b;
    public final TextView c;

    public hs10(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.f13559a = constraintLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13559a;
    }
}
