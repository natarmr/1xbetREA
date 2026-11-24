package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes5.dex */
public final class s6z implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f31726a;
    public final CircularProgressIndicator b;
    public final TextView c;
    public final TextView d;

    public s6z(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator, TextView textView, TextView textView2) {
        this.f31726a = frameLayout;
        this.b = circularProgressIndicator;
        this.c = textView;
        this.d = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31726a;
    }
}
