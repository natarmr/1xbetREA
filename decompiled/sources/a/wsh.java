package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class wsh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f39691a;
    public final TextView b;

    public wsh(TextView textView, TextView textView2) {
        this.f39691a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39691a;
    }
}
