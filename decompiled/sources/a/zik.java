package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class zik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f44443a;
    public final View b;
    public final TextView c;

    public zik(LinearLayout linearLayout, View view, TextView textView) {
        this.f44443a = linearLayout;
        this.b = view;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44443a;
    }
}
