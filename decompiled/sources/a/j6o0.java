package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class j6o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f15999a;
    public final TextView b;

    public j6o0(TextView textView, TextView textView2) {
        this.f15999a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15999a;
    }
}
