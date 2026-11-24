package a;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class kju0 extends ahe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18404a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kju0(Object obj, byte b) {
        this.f18404a = b;
        this.b = obj;
    }

    @Override // a.ahe0
    public final void a() {
        byte b = this.f18404a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.e = true;
                viewPager2.l.l = true;
                break;
            default:
                ((fht0) obj).p();
                break;
        }
    }

    @Override // a.ahe0
    public final void b(int i, int i2) {
        a();
    }

    @Override // a.ahe0
    public final void c(int i, int i2, Object obj) {
        a();
    }

    @Override // a.ahe0
    public final void d(int i, int i2) {
        a();
    }

    @Override // a.ahe0
    public final void e(int i, int i2) {
        a();
    }

    @Override // a.ahe0
    public final void f(int i, int i2) {
        a();
    }
}
