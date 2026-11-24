package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class kth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f18865a;
    public final TextView b;

    public kth(TextView textView, TextView textView2) {
        this.f18865a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18865a;
    }
}
