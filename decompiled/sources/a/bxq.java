package a;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class bxq extends vbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f3385a;

    public bxq(Fragment fragment) {
        this.f3385a = fragment;
    }

    @Override // a.vbc
    public final View b0(int i) {
        Fragment fragment = this.f3385a;
        View view = fragment.l1;
        if (view != null) {
            return view.findViewById(i);
        }
        jf4.n(axq.k("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // a.vbc
    public final boolean c0() {
        return this.f3385a.l1 != null;
    }
}
