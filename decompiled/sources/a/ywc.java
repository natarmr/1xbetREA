package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ywc;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ywc extends yx5 {
    public fiu0 K1;
    public wdk0 L1;
    public final zz2 M1;
    public final phf0 N1;
    public final zz2 O1;
    public final cgx0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public gxc S1;
    public String U1;
    public final xp6 V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(ywc.class, "bundleBannerId", "getBundleBannerId()I", 0), new ez40(ywc.class, "bundleCategoryCode", "getBundleCategoryCode()Ljava/lang/String;", 0), new ez40(ywc.class, "bundlePosition", "getBundlePosition()I", 0), new ez40(ywc.class, "bundleShowNavBar", "getBundleShowNavBar()Z", 0), new j0d0(ywc.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentCmsNewsBinding;", 0)};
    public static final kl5 W1 = new kl5();

    public ywc() {
        super(R.layout.fragment_cms_news);
        this.M1 = new zz2("BANNER_ID");
        this.N1 = new phf0("CATEGORY_CODE");
        this.O1 = new zz2("cms_news_main_pager_position");
        this.P1 = new cgx0("SHOW_NAVBAR", true);
        vwc vwcVar = new vwc(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new svc(new svc(this, (byte) 1), (byte) 2));
        this.Q1 = agc.G(this, sre0.f32672a.b(qxc.class), new wpb(a8zVarA, (byte) 12), new wpb(a8zVarA, (byte) 13), vwcVar);
        this.R1 = ltt0.o(this, wwc.f39880a);
        this.U1 = "";
        this.V1 = new xp6(this, (byte) 2);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.U1 = ckb.N(o0());
        DsNavigationBarBasic dsNavigationBarBasic = G0().d;
        dsNavigationBarBasic.setTitle(H(R.string.last_news));
        dsNavigationBarBasic.b(new vwc(this, (byte) 0));
        this.S1 = new gxc(this.U1, qem0.r(n0()), new lya(this, (byte) 22));
        dzq dzqVarG0 = G0();
        ViewPager2 viewPager2 = dzqVarG0.f;
        viewPager2.setAdapter(this.S1);
        viewPager2.setOffscreenPageLimit(1);
        new hhk(dzqVarG0.c, viewPager2, new c99((byte) 14)).a();
        dzq dzqVarG1 = G0();
        dzqVarG1.b.setVisibility(8);
        ViewPager2 viewPager3 = dzqVarG1.f;
        viewPager3.setVisibility(0);
        viewPager3.c(this.V1);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(iu50.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            iu50 iu50Var = (iu50) (ze3Var instanceof iu50 ? ze3Var : null);
            if (iu50Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                cl5 cl5Var = mvc.b;
                String strN = this.N1.n(this, X1[1]);
                cl5Var.getClass();
                yli yliVarA = iu50.a(iu50Var, i1w0VarF, 0, 0, 0, cl5.r(strN), false, 94);
                this.K1 = yliVarA.a();
                this.L1 = yliVarA.y;
                return;
            }
        }
        jf4.n(b1j.i(iu50.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0VarA = q7m0.a(H0().h.a());
        yje yjeVar = null;
        xwc xwcVar = new xwc(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb(p7m0VarA, clzVarW, xwcVar, (yje) null), 3);
        ol60 ol60Var = H0().l;
        xwc xwcVar2 = new xwc(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new vxb(ol60Var, clzVarW2, xwcVar2, (yje) null), 3);
        i89 i89Var = new i89(H0().m, (byte) 5);
        xwc xwcVar3 = new xwc(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new vxb(i89Var, clzVarW3, xwcVar3, (yje) null), 3);
    }

    public final dzq G0() {
        Object objN = this.R1.n(X1[4], this);
        objN.getClass();
        return (dzq) objN;
    }

    public final qxc H0() {
        return (qxc) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().f.setAdapter(null);
        G0().f.g(this.V1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        s0(i120.V(new Pair("cms_news_main_pager_position", Integer.valueOf(G0().f.getCurrentItem())), new Pair("CATEGORY_CODE", this.N1.n(this, X1[1]))));
        qxc qxcVarH0 = H0();
        bby bbyVar = qxcVarH0.o;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        c4m0 c4m0Var = qxcVarH0.n;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        qxc qxcVarH0 = H0();
        c4m0 c4m0Var = qxcVarH0.n;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            qxcVarH0.n = sac.T(new fnq(qxcVarH0.d.b(), new mxc(qxcVarH0, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(qxcVarH0), qxcVarH0.e.f22085a), pxc.h);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getP1() {
        return this.P1.n(this, X1[3]).booleanValue();
    }
}
