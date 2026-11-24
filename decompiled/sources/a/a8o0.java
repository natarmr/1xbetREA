package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class a8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f437a;
    public final TextView b;

    public a8o0(TextView textView, TextView textView2) {
        this.f437a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f437a;
    }
}
