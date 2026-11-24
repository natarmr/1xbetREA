package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ucu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f35450a;
    public final View b;
    public final TextView c;

    public ucu0(LinearLayout linearLayout, View view, TextView textView) {
        this.f35450a = linearLayout;
        this.b = view;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35450a;
    }
}
