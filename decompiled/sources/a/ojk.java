package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ojk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f25363a;
    public final LinearLayoutCompat b;
    public final LinearLayoutCompat c;
    public final View d;
    public final TextView e;

    public ojk(LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, View view, TextView textView) {
        this.f25363a = linearLayout;
        this.b = linearLayoutCompat;
        this.c = linearLayoutCompat2;
        this.d = view;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25363a;
    }
}
