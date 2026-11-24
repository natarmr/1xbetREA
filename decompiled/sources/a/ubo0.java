package a;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ubo0 implements jju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f35392a;
    public int b;
    public int c;

    public ubo0(TabLayout tabLayout) {
        this.f35392a = new WeakReference(tabLayout);
    }

    @Override // a.jju0
    public final void a(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.f35392a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z = true;
            if (i3 == 2 && this.b != 1) {
                z = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.l(i, f, z, z, false);
        }
    }

    @Override // a.jju0
    public final void b(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.f35392a.get();
        if (tabLayout != null) {
            tabLayout.x1 = this.c;
        }
    }

    @Override // a.jju0
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.f35392a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.j(tabLayout.f(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
