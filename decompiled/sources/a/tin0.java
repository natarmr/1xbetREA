package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class tin0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34016a;
    public final Button b;
    public final Button c;
    public final ImageView d;

    public tin0(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView) {
        this.f34016a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34016a;
    }
}
