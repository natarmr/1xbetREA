package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class xwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f41631a;
    public final TextView b;

    public xwx(TextView textView, TextView textView2) {
        this.f41631a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41631a;
    }
}
