package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes5.dex */
public final class o5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24701a;
    public final ProgressBar b;
    public final DsTabs c;
    public final ViewPager2 d;

    public o5r(ConstraintLayout constraintLayout, ProgressBar progressBar, DsTabs dsTabs, ViewPager2 viewPager2) {
        this.f24701a = constraintLayout;
        this.b = progressBar;
        this.c = dsTabs;
        this.d = viewPager2;
    }

    public static o5r a(View view) {
        int i = R.id.progress;
        ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
        if (progressBar != null) {
            i = R.id.tabLayout;
            DsTabs dsTabs = (DsTabs) yum0.f(view, R.id.tabLayout);
            if (dsTabs != null) {
                i = R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) yum0.f(view, R.id.viewPager);
                if (viewPager2 != null) {
                    return new o5r((ConstraintLayout) view, progressBar, dsTabs, viewPager2);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24701a;
    }
}
