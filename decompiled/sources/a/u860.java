package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class u860 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f35221a;
    public final TextView b;
    public final TextView c;

    public u860(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f35221a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35221a;
    }
}
