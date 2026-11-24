package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class nth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f24100a;
    public final TextView b;

    public nth(TextView textView, TextView textView2) {
        this.f24100a = textView;
        this.b = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24100a;
    }
}
