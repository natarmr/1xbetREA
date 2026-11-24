package a;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class y1k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f41858a;
    public final LinearLayout b;

    public y1k(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f41858a = linearLayout;
        this.b = linearLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41858a;
    }
}
