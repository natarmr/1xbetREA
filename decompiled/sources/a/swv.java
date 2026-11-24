package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class swv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32943a;
    public final Button b;
    public final ImageView c;

    public swv(ConstraintLayout constraintLayout, Button button, ImageView imageView) {
        this.f32943a = constraintLayout;
        this.b = button;
        this.c = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32943a;
    }
}
