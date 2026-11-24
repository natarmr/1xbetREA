package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class gsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f11853a;
    public final TextView b;
    public final TextView c;

    public gsx(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f11853a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11853a;
    }
}
