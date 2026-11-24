package a;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class mju0 implements ihe0 {
    @Override // a.ihe0
    public final void d(View view) {
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) hhe0Var).width == -1 && ((ViewGroup.MarginLayoutParams) hhe0Var).height == -1) {
            return;
        }
        jf4.n("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // a.ihe0
    public final void b(View view) {
    }
}
