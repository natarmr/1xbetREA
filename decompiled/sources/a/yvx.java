package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class yvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43342a;
    public final TextView b;
    public final TextView c;

    public yvx(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f43342a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43342a;
    }
}
