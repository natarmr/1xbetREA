package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class nlr implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f23741a;
    public final LinearLayout b;
    public final FlexboxLayout c;
    public final TextView d;
    public final TextView e;

    public nlr(LinearLayout linearLayout, LinearLayout linearLayout2, FlexboxLayout flexboxLayout, TextView textView, TextView textView2) {
        this.f23741a = linearLayout;
        this.b = linearLayout2;
        this.c = flexboxLayout;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23741a;
    }
}
