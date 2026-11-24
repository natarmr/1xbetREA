package a;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes3.dex */
public final class jyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f17372a;
    public final MaterialToolbar b;

    public jyq(LinearLayout linearLayout, MaterialToolbar materialToolbar) {
        this.f17372a = linearLayout;
        this.b = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17372a;
    }
}
