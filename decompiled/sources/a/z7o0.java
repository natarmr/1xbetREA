package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class z7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43927a;
    public final LinearLayout b;
    public final TextView c;

    public z7o0(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView) {
        this.f43927a = constraintLayout;
        this.b = linearLayout;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43927a;
    }
}
