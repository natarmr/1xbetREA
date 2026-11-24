package a;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class lju0 extends nju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20169a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ lju0(ViewPager2 viewPager2, byte b) {
        this.f20169a = b;
        this.b = viewPager2;
    }

    @Override // a.nju0
    public void a(int i) {
        switch (this.f20169a) {
            case 0:
                if (i == 0) {
                    this.b.h();
                }
                break;
        }
    }

    @Override // a.nju0
    public final void c(int i) {
        byte b = this.f20169a;
        ViewPager2 viewPager2 = this.b;
        switch (b) {
            case 0:
                if (viewPager2.d != i) {
                    viewPager2.d = i;
                    viewPager2.t.p();
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.j.requestFocus(2);
                }
                break;
        }
    }
}
