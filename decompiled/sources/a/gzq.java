package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes5.dex */
public final class gzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12192a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final ImageView d;
    public final nq8 e;

    public gzq(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, nq8 nq8Var) {
        this.f12192a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = imageView;
        this.e = nq8Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12192a;
    }
}
