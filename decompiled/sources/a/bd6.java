package a;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class bd6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad6 f2385a;
    public final TextView b;
    public final TextView c;

    public bd6(ad6 ad6Var, TextView textView, TextView textView2) {
        this.f2385a = ad6Var;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f2385a;
    }
}
