package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class r7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f29987a;
    public final TextView b;

    public r7o0(TextView textView, TextView textView2) {
        this.f29987a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29987a;
    }
}
