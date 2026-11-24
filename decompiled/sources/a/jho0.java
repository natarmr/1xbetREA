package a;

import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jho0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jho0 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final kiu0 N1;
    public final yzn0 O1;
    public mii0 P1;
    public ViewPager2 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(jho0.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedMenuBinding;", 0), new ez40(jho0.class, "menuSectionStart", "getMenuSectionStart()Lorg/xplatform/main_menu/api/domain/models/MenuSectionType;", 0)};
    public static final y2m0 R1 = new y2m0((byte) 11);
    public static final String U1 = jho0.class.getSimpleName();

    public jho0() {
        super(R.layout.fragment_tabbed_menu);
        this.K1 = true;
        this.L1 = ltt0.o(this, hho0.f13075a);
        byte b = 5;
        gho0 gho0Var = new gho0(this, b);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, gho0Var);
        byte b2 = 6;
        mfo0 mfo0Var = new mfo0(new gho0(this, b2), (byte) 4);
        a8z a8zVarA = maz.a(wezVar, new mfo0(new mfo0(this, b), b2));
        this.N1 = agc.G(this, sre0.f32672a.b(rio0.class), new cdl0(a8zVarA, (byte) 28), new cdl0(a8zVarA, (byte) 29), mfo0Var);
        this.O1 = new yzn0("MENU_SECTION_TAB_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        o2t.d(F(), this, "", new ttn0(this, (byte) 9));
        G0().d.setOffscreenPageLimit(2);
        G0().d.setPageTransformer(null);
        this.Q1 = G0().d;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().L0;
        lkz lkzVar = lkz.f20223a;
        yje yjeVar = null;
        iho0 iho0Var = new iho0(this, yjeVar, (byte) 0);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(p7m0Var, clzVarW, iho0Var, (yje) null), 3);
        ol60 ol60Var = H0().M0;
        iho0 iho0Var2 = new iho0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(ol60Var, clzVarW2, iho0Var2, (yje) null, (byte) 0), 3);
    }

    public final o5r G0() {
        Object objN = this.L1.n(S1[0], this);
        objN.getClass();
        return (o5r) objN;
    }

    public final rio0 H0() {
        return (rio0) this.N1.getValue();
    }

    public final void I0(String str, Function0 function0) {
        F().u0(str, this, new b0l0(function0, (byte) 15));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        I0("UPDATED_BALANCE_KEY", new gho0(this, (byte) 0));
        I0("REG_CLICK_REQUEST_KEY", new gho0(this, (byte) 1));
        I0("LOGIN_CLICK_REQUEST_KEY", new gho0(this, (byte) 2));
        I0("PAYMENT_CLICK_REQUEST_KEY", new gho0(this, (byte) 3));
        I0("CHANGE_BALANCE_CLICK_REQUEST_KEY", new gho0(this, (byte) 4));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        ViewPager2 viewPager2 = this.Q1;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
        this.Q1 = null;
        o2t.a(F());
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        bby bbyVar = H0().Q0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        rio0 rio0VarH0 = H0();
        boolean z = rio0VarH0.z() == r040.OTHER;
        boolean z2 = rio0VarH0.z() == r040.TOP;
        boolean z3 = rio0VarH0.z() == r040.GAMES;
        if (rio0VarH0.S0 == null || z || z2 || z3) {
            rio0VarH0.B();
        }
        ((vwb0) ((rrd) rio0VarH0.s0.b).f).g("TEMPORARY_BALANCE_ID", 0L);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        DsTabs dsTabs = G0().c;
        ViewPager2 viewPager2 = this.Q1;
        if (viewPager2 == null) {
            return;
        }
        mii0 mii0Var = new mii0(dsTabs, viewPager2, new tfo0(1, H0(), rio0.class, "onSelectedTabPosition", "onSelectedTabPosition(I)V", 0, (byte) 6));
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
    public final boolean getK1() {
        return this.K1;
    }
}
