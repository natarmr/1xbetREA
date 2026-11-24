package a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.StickyHeaderLayoutManager;
import org.xplatform.uikit.components.page_control.DsPageControl;

/* JADX INFO: loaded from: classes.dex */
public final class l5g extends ahe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19453a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l5g(Object obj, byte b) {
        this.f19453a = b;
        this.b = obj;
    }

    @Override // a.ahe0
    public void a() {
        yge0 adapter;
        byte b = this.f19453a;
        Object obj = this.b;
        switch (b) {
            case 1:
                DsPageControl dsPageControl = (DsPageControl) obj;
                ViewPager2 viewPager2 = dsPageControl.p2;
                dsPageControl.x2 = (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) ? 0 : adapter.d();
                dsPageControl.H0();
                break;
            case 2:
                ((uii) obj).L();
                break;
            case 3:
                ((lrd) obj).b(true);
                break;
            case 4:
                nj50 nj50Var = (nj50) obj;
                nj50Var.e = nj50Var.c.d();
                xzp xzpVar = nj50Var.d;
                ((oqd) xzpVar.f41764a).g();
                xzpVar.f();
                break;
            case 8:
                ((hhk) obj).g();
                break;
        }
    }

    @Override // a.ahe0
    public void b(int i, int i2) {
        byte b = this.f19453a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qud qudVar = n5g.S1;
                ((n5g) obj).G0().e.y0(0);
                break;
            case 2:
                ((uii) obj).L();
                break;
            case 3:
                a();
                break;
            case 4:
                nj50 nj50Var = (nj50) obj;
                xzp xzpVar = nj50Var.d;
                ((oqd) xzpVar.f41764a).j(i + xzpVar.m(nj50Var), i2, null);
                break;
            case 8:
                ((hhk) obj).g();
                break;
        }
    }

    @Override // a.ahe0
    public void c(int i, int i2, Object obj) {
        byte b = this.f19453a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                a();
                break;
            case 4:
                nj50 nj50Var = (nj50) obj2;
                xzp xzpVar = nj50Var.d;
                ((oqd) xzpVar.f41764a).j(i + xzpVar.m(nj50Var), i2, obj);
                break;
            case 8:
                ((hhk) obj2).g();
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // a.ahe0
    public void d(int i, int i2) {
        yge0 adapter;
        byte b = this.f19453a;
        int iD = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                DsPageControl dsPageControl = (DsPageControl) obj;
                ViewPager2 viewPager2 = dsPageControl.p2;
                if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null) {
                    iD = adapter.d();
                }
                dsPageControl.x2 = iD;
                dsPageControl.H0();
                break;
            case 2:
                ((uii) obj).L();
                break;
            case 3:
                a();
                break;
            case 4:
                nj50 nj50Var = (nj50) obj;
                nj50Var.e += i2;
                xzp xzpVar = nj50Var.d;
                ((oqd) xzpVar.f41764a).k(i + xzpVar.m(nj50Var), i2);
                if (nj50Var.e > 0 && nj50Var.c.c == 2) {
                    xzpVar.f();
                    break;
                }
                break;
            case 5:
                gl80 gl80Var = (gl80) obj;
                if (gl80Var.c == 3 && !gl80Var.d) {
                    gl80Var.x(1);
                }
                gl80Var.y(this);
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (i == 0 && i2 == 1 && recyclerView.computeVerticalScrollOffset() == 0) {
                    recyclerView.B0(0);
                    break;
                }
                break;
            case 7:
                StickyHeaderLayoutManager stickyHeaderLayoutManager = (StickyHeaderLayoutManager) obj;
                RecyclerView recyclerView2 = stickyHeaderLayoutManager.g1;
                tl60.a(recyclerView2, new zlw(recyclerView2, i, i2, stickyHeaderLayoutManager));
                break;
            case 8:
                ((hhk) obj).g();
                break;
        }
    }

    @Override // a.ahe0
    public void e(int i, int i2) {
        byte b = this.f19453a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((uii) obj).L();
                break;
            case 3:
                a();
                break;
            case 4:
                nj50 nj50Var = (nj50) obj;
                xzp xzpVar = nj50Var.d;
                int iM = xzpVar.m(nj50Var);
                ((oqd) xzpVar.f41764a).i(i + iM, i2 + iM);
                break;
            case 8:
                ((hhk) obj).g();
                break;
        }
    }

    @Override // a.ahe0
    public void f(int i, int i2) {
        yge0 adapter;
        byte b = this.f19453a;
        Object obj = this.b;
        switch (b) {
            case 1:
                DsPageControl dsPageControl = (DsPageControl) obj;
                ViewPager2 viewPager2 = dsPageControl.p2;
                dsPageControl.x2 = (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) ? 0 : adapter.d();
                dsPageControl.H0();
                break;
            case 2:
                ((uii) obj).L();
                break;
            case 3:
                a();
                break;
            case 4:
                nj50 nj50Var = (nj50) obj;
                nj50Var.e -= i2;
                xzp xzpVar = nj50Var.d;
                ((oqd) xzpVar.f41764a).l(i + xzpVar.m(nj50Var), i2);
                if (nj50Var.e < 1 && nj50Var.c.c == 2) {
                    xzpVar.f();
                    break;
                }
                break;
            case 8:
                ((hhk) obj).g();
                break;
        }
    }

    @Override // a.ahe0
    public void g() {
        switch (this.f19453a) {
            case 4:
                ((nj50) this.b).d.f();
                break;
        }
    }
}
