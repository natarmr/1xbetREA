package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class tlt implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34164a;
    public final MaterialButton b;
    public final ImageView c;
    public final MaterialButton d;
    public final MaterialButton e;
    public final TextView f;

    public tlt(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, MaterialButton materialButton2, MaterialButton materialButton3, TextView textView) {
        this.f34164a = constraintLayout;
        this.b = materialButton;
        this.c = imageView;
        this.d = materialButton2;
        this.e = materialButton3;
        this.f = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34164a;
    }
}
