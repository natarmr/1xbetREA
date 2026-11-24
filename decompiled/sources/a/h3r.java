package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class h3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12399a;
    public final TextView b;

    public h3r(ConstraintLayout constraintLayout, TextView textView) {
        this.f12399a = constraintLayout;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12399a;
    }
}
