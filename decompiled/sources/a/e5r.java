package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class e5r extends q1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f7247a;
    public final /* synthetic */ FrameLayout b;

    public e5r(f5r f5rVar, Fragment fragment, FrameLayout frameLayout) {
        this.f7247a = fragment;
        this.b = frameLayout;
    }

    @Override // a.q1r
    public final void h(androidx.fragment.app.e eVar, Fragment fragment, View view) {
        if (fragment == this.f7247a) {
            eVar.B0(this);
            f5r.z(view, this.b);
        }
    }
}
