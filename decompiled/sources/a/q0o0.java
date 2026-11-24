package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class q0o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f27911a;
    public final TextView b;

    public q0o0(TextView textView, TextView textView2) {
        this.f27911a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27911a;
    }
}
