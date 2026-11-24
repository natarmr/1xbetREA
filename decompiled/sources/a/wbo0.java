package a;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class wbo0 implements qbo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38890a;
    public final ViewGroup b;

    public /* synthetic */ wbo0(ViewGroup viewGroup, byte b) {
        this.f38890a = b;
        this.b = viewGroup;
    }

    @Override // a.pbo0
    public final void a(tbo0 tbo0Var) {
        byte b = this.f38890a;
    }

    @Override // a.pbo0
    public final void b(tbo0 tbo0Var) {
        byte b = this.f38890a;
    }

    @Override // a.pbo0
    public final void c(tbo0 tbo0Var) {
        byte b = this.f38890a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ((ViewPager) viewGroup).setCurrentItem(tbo0Var.b);
                break;
            default:
                ((ViewPager2) viewGroup).e(tbo0Var.b, true);
                break;
        }
    }

    private final void d(tbo0 tbo0Var) {
    }

    private final void e(tbo0 tbo0Var) {
    }

    private final void f(tbo0 tbo0Var) {
    }

    private final void g(tbo0 tbo0Var) {
    }
}
