package a;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zbo0 extends nju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f44126a;
    public byte c = 0;
    public byte b = 0;

    public zbo0(TabLayout tabLayout) {
        this.f44126a = new WeakReference(tabLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.nju0
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.f44126a.get();
        if (tabLayout != null) {
            tabLayout.x1 = this.c;
        }
    }

    @Override // a.nju0
    public final void b(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.f44126a.get();
        if (tabLayout != null) {
            byte b = this.c;
            boolean z = true;
            if (b == 2 && this.b != 1) {
                z = false;
            }
            if (b == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.l(i, f, z, z, false);
        }
    }

    @Override // a.nju0
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.f44126a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        byte b = this.c;
        tabLayout.j(tabLayout.f(i), b == 0 || (b == 2 && this.b == 0));
    }
}
