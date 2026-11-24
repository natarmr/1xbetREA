package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class uvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36370a;
    public final TextView b;

    public uvx(ConstraintLayout constraintLayout, TextView textView) {
        this.f36370a = constraintLayout;
        this.b = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36370a;
    }
}
