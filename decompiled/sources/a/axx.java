package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class axx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f1643a;
    public final AppCompatImageView b;
    public final TextView c;

    public axx(LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.f1643a = linearLayout;
        this.b = appCompatImageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1643a;
    }
}
