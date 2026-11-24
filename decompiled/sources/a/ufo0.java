package a;

import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ufo0;", "La/yx5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ufo0 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final kiu0 N1;
    public final yzn0 O1;
    public mii0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(ufo0.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedMenuBinding;", 0), new ez40(ufo0.class, "menuSectionStart", "getMenuSectionStart()Lorg/xplatform/main_menu/api/domain/models/MenuSectionType;", 0)};
    public static final s2m0 Q1 = new s2m0();

    public ufo0() {
        super(R.layout.fragment_tabbed_menu);
        byte b = 1;
        this.K1 = true;
        this.L1 = ltt0.o(this, rfo0.f30399a);
        qfo0 qfo0Var = new qfo0(this, (byte) 0);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, qfo0Var);
        mfo0 mfo0Var = new mfo0(new qfo0(this, b), b);
        a8z a8zVarA = maz.a(wezVar, new mfo0(new mfo0(this, (byte) 2), (byte) 3));
        this.N1 = agc.G(this, sre0.f32672a.b(fho0.class), new cdl0(a8zVarA, (byte) 26), new cdl0(a8zVarA, (byte) 27), mfo0Var);
        this.O1 = new yzn0("MENU_SECTION_TAB_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        o2t.d(F(), this, "", new ttn0(this, (byte) 8));
        G0().d.setOffscreenPageLimit(4);
        G0().d.setPageTransformer(null);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().C0;
        yje yjeVar = null;
        sfo0 sfo0Var = new sfo0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(p7m0Var, clzVarW, sfo0Var, (yje) null), 3);
        ol60 ol60Var = H0().D0;
        sfo0 sfo0Var2 = new sfo0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(ol60Var, clzVarW2, sfo0Var2, (yje) null, (byte) 0), 3);
    }

    public final o5r G0() {
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        return (o5r) objN;
    }

    public final fho0 H0() {
        return (fho0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F().u0("UPDATED_BALANCE_KEY", this, new b0l0(this, (byte) 14));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        mii0 mii0Var = this.P1;
        if (mii0Var != null) {
            ((ViewPager2) mii0Var.c).g((xp6) mii0Var.e);
        }
        G0().d.setAdapter(null);
        super.Z();
        o2t.a(F());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().B();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        DsTabs dsTabs = G0().c;
        ViewPager2 viewPager2 = G0().d;
        mii0 mii0Var = new mii0(dsTabs, viewPager2, new tfo0(1, H0(), fho0.class, "onSelectedTabPosition", "onSelectedTabPosition(I)V", 0, (byte) 0));
        dsTabs.v = new hfg(mii0Var, (byte) 29);
        dsTabs.k(viewPager2.getCurrentItem());
        this.P1 = mii0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        mii0 mii0Var = this.P1;
        if (mii0Var != null) {
            ((ViewPager2) mii0Var.c).g((xp6) mii0Var.e);
        }
        this.P1 = null;
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getW1() {
        return this.K1;
    }
}
