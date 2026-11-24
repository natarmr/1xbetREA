package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class qjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f28844a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final FrameLayout e;
    public final TabLayout f;
    public final View g;
    public final ViewPager2 h;

    public qjk(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, FrameLayout frameLayout2, TabLayout tabLayout, View view, ViewPager2 viewPager2) {
        this.f28844a = frameLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
        this.e = frameLayout2;
        this.f = tabLayout;
        this.g = view;
        this.h = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28844a;
    }
}
