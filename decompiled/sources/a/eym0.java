package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.subgames.api.SubGamesParams;
import org.xplatform.ui_core.viewcomponents.tabs.TabLayoutChips;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eym0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eym0 extends yx5 {
    public final i9o0 K1;
    public zui L1;
    public j6m0 M1;
    public gym0 N1;
    public final boolean O1;
    public final khf0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(eym0.class, "screenParams", "getScreenParams()Lorg/xplatform/sportgame/subgames/api/SubGamesParams;", 0), new j0d0(eym0.class, "binding", "getBinding()Lorg/xplatform/sportgame/subgames/impl/databinding/FragmentSubGamesBinding;", 0)};
    public static final g9m0 S1 = new g9m0();
    public static final String V1 = eym0.class.getSimpleName();

    public eym0() {
        super(R.layout.fragment_sub_games);
        this.K1 = i9o0.f14396a;
        this.O1 = true;
        this.P1 = new khf0("SUB_GAME_SCREEN_PARAMS_KEY");
        aym0 aym0Var = new aym0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new fyk0(new fyk0(this, (byte) 14), (byte) 15));
        this.Q1 = agc.G(this, sre0.f32672a.b(dzm0.class), new cdl0(a8zVarA, (byte) 12), new cdl0(a8zVarA, (byte) 13), aym0Var);
        this.R1 = ltt0.o(this, bym0.f3427a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("KEY_SUB_GAME_FILTER_MODEL_REQUEST", this, new b0l0(this, (byte) 8));
        gym0 gym0Var = this.N1;
        if (gym0Var == null) {
            Intrinsics.h("subGamesFragmentDelegate");
            throw null;
        }
        l5r l5rVarG0 = G0();
        lph0 lph0Var = new lph0(0, H0(), dzm0.class, "filterClicked", "filterClicked()V", 0, (byte) 28);
        lph0 lph0Var2 = new lph0(0, H0(), dzm0.class, "onMarketsSettingsClicked", "onMarketsSettingsClicked()V", 0, (byte) 29);
        ms2 ms2Var = ((SubGamesParams) this.P1.n(this, U1[0])).e;
        nfj0 nfj0Var = new nfj0(2, H0(), dzm0.class, "onSubGameSelected", "onSubGameSelected(JI)V", 0, (byte) 11);
        ms2Var.getClass();
        gym0Var.f = ms2Var;
        uk5 uk5Var = l5rVarG0.c;
        ViewPager2 viewPager2 = (ViewPager2) uk5Var.f;
        try {
            Field declaredField = ViewPager2.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(viewPager2);
            obj.getClass();
            RecyclerView recyclerView = (RecyclerView) obj;
            Field declaredField2 = RecyclerView.class.getDeclaredField("x1");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(recyclerView);
            obj2.getClass();
            declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * 5));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        dyb.O((ImageView) uk5Var.g, new j1l0(lph0Var, (byte) 18));
        dyb.O((ImageView) uk5Var.d, new j1l0(lph0Var2, (byte) 19));
        Context context = l5rVarG0.f19473a.getContext();
        context.getClass();
        boolean z = context.getResources().getConfiguration().getLayoutDirection() == 1;
        View view = uk5Var.c;
        GradientDrawable.Orientation orientation = z ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT;
        TypedValue typedValue = j5d.f15927a;
        view.setBackground(new GradientDrawable(orientation, new int[]{j5d.a(context, R.attr.uikitBackground, false), j5d.a(context, R.attr.uikitStaticTransparent, false)}));
        a9g a9gVar = new a9g(gym0Var, nfj0Var, (byte) 2);
        gym0Var.g = a9gVar;
        viewPager2.c(a9gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kvm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kvm0 kvm0Var = (kvm0) (ze3Var instanceof kvm0 ? ze3Var : null);
            if (kvm0Var != null) {
                SubGamesParams subGamesParams = (SubGamesParams) this.P1.n(this, U1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof ocl0) {
                        aym0 aym0Var = new aym0(this, (byte) 1);
                        V1.getClass();
                        i1w0VarF.getClass();
                        cad cadVar = kvm0Var.f18963a;
                        pcl0 pcl0VarU = ((ocl0) fragment).u(aym0Var);
                        bn6 bn6Var = kvm0Var.b;
                        j6m0 j6m0Var = kvm0Var.c;
                        a530 a530Var = kvm0Var.d;
                        d1p d1pVar = kvm0Var.e;
                        ctf0 ctf0Var = kvm0Var.f;
                        mj8 mj8Var = kvm0Var.g;
                        evz evzVar = kvm0Var.h;
                        pcl0VarU.getClass();
                        d1pVar.getClass();
                        ctf0Var.getClass();
                        g45 g45Var = new g45();
                        g45Var.f10647a = subGamesParams;
                        g45Var.b = i1w0VarF;
                        g45Var.c = pcl0VarU;
                        g45Var.d = evzVar;
                        g45Var.e = cadVar;
                        g45Var.f = bn6Var;
                        g45Var.g = d1pVar;
                        g45Var.h = ctf0Var;
                        g45Var.i = n0k0.a(new rti(g45Var, (byte) 19));
                        this.L1 = (zui) ((n5d0) g45Var.i).get();
                        this.M1 = j6m0Var;
                        this.N1 = new gym0(a530Var, mj8Var);
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(kvm0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().n;
        yje yjeVar = null;
        dym0 dym0Var = new dym0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0(p7m0Var, clzVarW, dym0Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().m;
        dym0 dym0Var2 = new dym0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zol0((gmq) p7m0Var2, clzVarW2, dym0Var2, (yje) null, (char) 0), 3);
        p7m0 p7m0Var3 = H0().o;
        lkz lkzVar2 = lkz.f20223a;
        dym0 dym0Var3 = new dym0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zol0((gmq) p7m0Var3, clzVarW3, dym0Var3, (yje) null, (byte) 0), 3);
    }

    public final l5r G0() {
        Object objN = this.R1.n(U1[1], this);
        objN.getClass();
        return (l5r) objN;
    }

    public final dzm0 H0() {
        return (dzm0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        gym0 gym0Var = this.N1;
        if (gym0Var == null) {
            Intrinsics.h("subGamesFragmentDelegate");
            throw null;
        }
        uk5 uk5Var = G0().c;
        hhk hhkVar = gym0Var.d;
        if (hhkVar != null && hhkVar.f13068a) {
            yge0 yge0Var = (yge0) hhkVar.e;
            if (yge0Var != null) {
                yge0Var.y((l5g) hhkVar.h);
                hhkVar.h = null;
            }
            TabLayout tabLayout = (TabLayout) hhkVar.b;
            tabLayout.o1.remove((wbo0) hhkVar.g);
            ((ViewPager2) hhkVar.c).g((zbo0) hhkVar.f);
            hhkVar.g = null;
            hhkVar.f = null;
            hhkVar.e = null;
            hhkVar.f13068a = false;
        }
        a9g a9gVar = gym0Var.g;
        if (a9gVar != null) {
            ((ViewPager2) uk5Var.f).g(a9gVar);
        }
        gym0Var.d = null;
        gym0Var.c = null;
        ((TabLayoutChips) uk5Var.e).setOnScrollChangeListener(null);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
