package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La/ez60;", "La/yx5;", "La/ia50;", "La/cg60;", "La/d9o0;", "<init>", "()V", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ez60 extends yx5 implements ia50, cg60, d9o0 {
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ez60.class, "binding", "getBinding()Lorg/xplatform/games_list/databinding/FragmentGamesBottomCategoryFgBinding;", 0)};
    public final boolean K1;
    public nmi L1;
    public fiu0 M1;
    public ii N1;
    public final kiu0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public aa50 R1;

    public ez60() {
        super(R.layout.fragment_games_bottom_category_fg);
        this.K1 = true;
        yy60 yy60Var = new yy60(this, (byte) 1);
        dz60 dz60Var = new dz60(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new ej50(dz60Var, (byte) 21));
        tre0 tre0Var = sre0.f32672a;
        this.O1 = agc.G(this, tre0Var.b(k370.class), new co60(a8zVarA, (byte) 14), new co60(a8zVarA, (byte) 15), yy60Var);
        yy60 yy60Var2 = new yy60(this, (byte) 2);
        a8z a8zVarA2 = maz.a(wezVar, new ej50(new dz60(this, (byte) 1), (byte) 22));
        this.P1 = agc.G(this, tre0Var.b(g670.class), new co60(a8zVarA2, (byte) 16), new co60(a8zVarA2, (byte) 17), yy60Var2);
        this.Q1 = ltt0.o(this, zy60.f45191a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        o2t.e(eVarC, this, null, new cz60(0, H0(), g670.class, "onGamesUMResultReceive", "onGamesUMResultReceive$games_list()V", 0, (byte) 0), null, 22);
        ccq0.V(this, "CHANGE_BALANCE_TO_PRIMARY_KEY", new yy60(this, (byte) 0));
        C().u0("CHANGE_TAB_REQUEST_KEY", this, new ex60(this, (byte) 1));
        C().k0(new vr3(this, (byte) 2), true);
        DsTabBar dsTabBar = G0().b;
        aa50 aa50Var = new aa50(zdx.A(n0()));
        int[] iArr = new int[2];
        vv5 vv5Var = new vv5(iArr, aa50Var, (byte) 1);
        bc0 bc0Var = new bc0(vv5Var, (byte) 9);
        dsTabBar.addOnLayoutChangeListener(vv5Var);
        dsTabBar.addOnAttachStateChangeListener(bc0Var);
        if (dsTabBar.isLaidOut()) {
            dsTabBar.getLocationInWindow(iArr);
            aa50Var.a(Float.valueOf(iArr[1]));
        }
        this.R1 = aa50Var;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.OneXGamesDependencies");
            return;
        }
        i1w0 i1w0VarE = a4n0.e(this);
        i1w0VarE.getClass();
        pmi pmiVar = new pmi(g8iVarC, i1w0VarE);
        this.L1 = (nmi) ((n5d0) pmiVar.d).get();
        this.M1 = new fiu0(Collections.singletonMap(k370.class, (omi) pmiVar.e));
        this.N1 = g8iVarC.j();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().D;
        yje yjeVar = null;
        bz60 bz60Var = new bz60(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(ol60Var, clzVarW, bz60Var, (yje) null), 3);
        g670 g670VarH0 = H0();
        m430 m430Var = new m430(g670VarH0.E, g670VarH0, (byte) 6);
        int i = 4;
        Class<ez60> cls = ez60.class;
        vf20 vf20Var = new vf20(2, this, cls, "handleTabBarState", "handleTabBarState(Lorg/xplatform/games_list/features/games/container/models/OneXGamesHolderUiModel;)V", i, (byte) 22);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(m430Var, clzVarW2, vf20Var, (yje) null), 3);
        ol60 ol60Var2 = H0().F;
        vf20 vf20Var2 = new vf20(2, this, cls, "handleNavigationEvent", "handleNavigationEvent(Lorg/xplatform/games_list/features/games/container/OneXGamesViewModel$NavEvent;)V", i, (byte) 23);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new az60(ol60Var2, clzVarW3, vf20Var2, (yje) null), 3);
        gmq gmqVarW = ((k370) this.O1.getValue()).w();
        bz60 bz60Var2 = new bz60(this, yjeVar, (byte) 1);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new az60((i89) gmqVarW, clzVarW4, bz60Var2, (yje) null), 3);
    }

    public final j0r G0() {
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        return (j0r) objN;
    }

    public final g670 H0() {
        return (g670) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        aa50 aa50Var = this.R1;
        if (aa50Var != null) {
            aa50Var.close();
        }
        this.R1 = null;
        super.Z();
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        o2t.a(eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        g670 g670VarH0 = H0();
        byte b = 0;
        yje yjeVar = null;
        sac.V(jiu0.a(g670VarH0), new m570(g670VarH0, (byte) 0), null, g670VarH0.m.b, new w570(g670VarH0, yjeVar, b), 10);
        g670 g670VarH1 = H0();
        c4m0 c4m0Var = g670VarH1.G;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            g670VarH1.G = sac.T(new fnq(i120.W(new h2c(g670VarH1.v.f2242a, (byte) 17)), new c670(g670VarH1, yjeVar, b), (byte) 4), d5c.S(jiu0.a(g670VarH1), g670VarH1.m.c), foe.h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        v3c.N(H0().G);
        this.j1 = true;
    }

    @Override // a.cg60
    public final boolean j() {
        Object objPrevious;
        List listP = C().c.p();
        listP.getClass();
        ListIterator listIterator = listP.listIterator(listP.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            Fragment fragment = (Fragment) objPrevious;
            if ((fragment instanceof y370) && ((y370) fragment).S()) {
                break;
            }
        }
        i0h0 i0h0Var = (Fragment) objPrevious;
        cg60 cg60Var = i0h0Var instanceof cg60 ? (cg60) i0h0Var : null;
        if (cg60Var != null ? cg60Var.j() : true) {
            i1w0 i1w0VarE = a4n0.e(this);
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarE);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarE, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0VarE.a((oe50) pawVar.next());
            }
        }
        return false;
    }

    @Override // a.d9o0
    public final void m(int i) {
        FrameLayout frameLayout = G0().f15694a;
        TypedValue typedValue = j5d.f15927a;
        frameLayout.setBackgroundColor(j5d.a(o0(), i, false));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.K1;
    }
}
