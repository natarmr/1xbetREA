package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class v7z implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36954a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public v7z(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f36954a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36954a;
    }
}
