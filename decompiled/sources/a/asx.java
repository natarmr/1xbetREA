package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class asx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1409a;
    public final TextView b;

    public asx(TextView textView, TextView textView2) {
        this.f1409a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1409a;
    }
}
