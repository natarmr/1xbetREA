package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes4.dex */
public final class qux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29362a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final TextView d;
    public final TextView e;

    public qux(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.f29362a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29362a;
    }
}
