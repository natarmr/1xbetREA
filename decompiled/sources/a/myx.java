package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class myx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f22625a;
    public final TextView b;

    public myx(TextView textView, TextView textView2) {
        this.f22625a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22625a;
    }
}
