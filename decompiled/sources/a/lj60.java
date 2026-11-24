package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class lj60 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f20136a;
    public final DsButton b;
    public final DsButton c;
    public final TabLayout d;
    public final ViewPager2 e;
    public final View f;

    public lj60(FrameLayout frameLayout, DsButton dsButton, DsButton dsButton2, TabLayout tabLayout, ViewPager2 viewPager2, View view) {
        this.f20136a = frameLayout;
        this.b = dsButton;
        this.c = dsButton2;
        this.d = tabLayout;
        this.e = viewPager2;
        this.f = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20136a;
    }
}
