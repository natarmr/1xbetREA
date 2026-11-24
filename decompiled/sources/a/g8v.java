package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;
import org.xplatform.search.impl.presentation.aggregator_brands.models.AggregatorBrandsFragmentSettings;
import org.xplatform.search.impl.presentation.aggregator_games.models.AggregatorGamesFragmentSettings;
import org.xplatform.search.impl.presentation.sport.models.SportSearchFragmentSettings;
import org.xplatform.search.impl.presentation.xgames.models.XGamesSearchFragmentSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/g8v;", "La/yx5;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g8v extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final khf0 M1;
    public final phf0 N1;
    public daf O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(g8v.class, "binding", "getBinding()Lorg/xplatform/search/impl/databinding/FragmentGlobalSearchContainerBinding;", 0), new ez40(g8v.class, "settings", "getSettings()Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;", 0), new ez40(g8v.class, "componentKey", "getComponentKey()Ljava/lang/String;", 0)};
    public static final rqt P1 = new rqt();

    public g8v() {
        super(R.layout.fragment_global_search_container);
        this.K1 = ltt0.o(this, f8v.f9127a);
        this.L1 = xbc.a0(this, sre0.f32672a.b(u8v.class), null, new jcs(this, (byte) 27), 14);
        this.M1 = new khf0("SETTINGS_BUNDLE_KEY");
        this.N1 = new phf0("SETTINGS_BUNDLE_COMPONENT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("X_GAMES_UM_BUTTON_CLICK_RESULT_KEY", K(), new viq(this, (byte) 4));
        pkd.i(G0().b, null, new ugd(-307231584, true, new jar(this, (byte) 22)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h8v.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof h8v)) {
                ze3Var = null;
            }
            h8v h8vVar = (h8v) ze3Var;
            if (h8vVar != null) {
                ComponentCallbacks2 application2 = n0().getApplication();
                application2.getClass();
                i1w0 i1w0VarF = a4n0.f(this);
                GlobalSearchContainerSettings globalSearchContainerSettings = (GlobalSearchContainerSettings) this.M1.n(this, Q1[1]);
                String strH0 = H0();
                i1w0VarF.getClass();
                strH0.getClass();
                LinkedHashMap linkedHashMap = m8v.f21387a;
                Object obj = linkedHashMap.get(strH0);
                Object obj2 = obj;
                if (obj == null) {
                    af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                    if (af3Var2 != null) {
                        o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(l8v.class);
                        ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                        if (((l8v) (ze3Var2 instanceof l8v ? ze3Var2 : null)) != null) {
                            iii iiiVar = new iii();
                            iiiVar.f14828a = mbl.b(new p8i((byte) 5));
                            linkedHashMap.put(strH0, iiiVar);
                            obj2 = iiiVar;
                        }
                    }
                    jf4.n(b1j.i(l8v.class, "Cannot create dependency "));
                    return;
                }
                g2v g2vVar = new g2v((n8v) ((iii) obj2).f14828a.get());
                iw20 iw20Var = h8vVar.f12648a;
                ctf0 ctf0Var = h8vVar.b;
                s31 s31Var = h8vVar.c;
                cyu cyuVar = h8vVar.d;
                mne mneVar = h8vVar.e;
                wdk0 wdk0Var = h8vVar.f;
                ouu ouuVar = h8vVar.g;
                ctf0Var.getClass();
                wdk0Var.getClass();
                this.O1 = new daf(iw20Var, strH0, globalSearchContainerSettings, i1w0VarF, ctf0Var, s31Var, cyuVar, mneVar, wdk0Var, g2vVar, ouuVar);
                return;
            }
        }
        jf4.n(b1j.i(h8v.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) I0()).C();
        j0s j0sVar = new j0s(this, null, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fns((i89) gmqVarC, clzVarW, j0sVar, (yje) null), 3);
    }

    public final n0r G0() {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        return (n0r) objN;
    }

    public final String H0() {
        return this.N1.n(this, Q1[2]);
    }

    public final k3t0 I0() {
        return (k3t0) this.L1.getValue();
    }

    public final void J0(bfo0 bfo0Var) {
        int iOrdinal = bfo0Var.ordinal();
        Object obj = null;
        if (iOrdinal == 0) {
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            String name = apl0.class.getName();
            IntRange intRangeO = l1e0.o(0, eVarC.P());
            ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
            Iterator it = intRangeO.iterator();
            while (((kkx) it).c) {
                arrayList.add(eVarC.O(((bkx) it).nextInt()).i);
            }
            for (Object obj2 : arrayList) {
                if (Intrinsics.d((String) obj2, name)) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            zb5 zb5Var = new zb5(eVarC);
            zb5Var.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
            if (str == null) {
                gle0 gle0Var = apl0.P1;
                SportSearchFragmentSettings sportSearchFragmentSettings = new SportSearchFragmentSettings(H0(), (GlobalSearchContainerSettings) this.M1.n(this, Q1[1]));
                gle0Var.getClass();
                apl0 apl0Var = new apl0();
                apl0Var.N1.J(apl0Var, apl0.Q1[1], sportSearchFragmentSettings);
                zb5Var.o(R.id.container, apl0Var, name);
                zb5Var.c(name);
            } else {
                Fragment fragmentJ = eVarC.J(name);
                if (fragmentJ != null) {
                    zb5Var.o(R.id.container, fragmentJ, name);
                }
            }
            zb5Var.f();
            return;
        }
        if (iOrdinal == 1) {
            androidx.fragment.app.e eVarC2 = C();
            eVarC2.getClass();
            String name2 = tyv0.class.getName();
            IntRange intRangeO2 = l1e0.o(0, eVarC2.P());
            ArrayList arrayList2 = new ArrayList(r3d.q(intRangeO2, 10));
            Iterator it2 = intRangeO2.iterator();
            while (((kkx) it2).c) {
                arrayList2.add(eVarC2.O(((bkx) it2).nextInt()).i);
            }
            for (Object obj3 : arrayList2) {
                if (Intrinsics.d((String) obj3, name2)) {
                    obj = obj3;
                    break;
                }
            }
            String str2 = (String) obj;
            zb5 zb5Var2 = new zb5(eVarC2);
            zb5Var2.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
            if (str2 == null) {
                uxs0 uxs0Var = tyv0.O1;
                XGamesSearchFragmentSettings xGamesSearchFragmentSettings = new XGamesSearchFragmentSettings(H0(), "X_GAMES_UM_BUTTON_CLICK_RESULT_KEY");
                uxs0Var.getClass();
                tyv0 tyv0Var = new tyv0();
                tyv0Var.N1.J(tyv0Var, tyv0.P1[1], xGamesSearchFragmentSettings);
                zb5Var2.o(R.id.container, tyv0Var, name2);
                zb5Var2.c(name2);
            } else {
                Fragment fragmentJ2 = eVarC2.J(name2);
                if (fragmentJ2 != null) {
                    zb5Var2.o(R.id.container, fragmentJ2, name2);
                }
            }
            zb5Var2.f();
            return;
        }
        if (iOrdinal == 2) {
            androidx.fragment.app.e eVarC3 = C();
            eVarC3.getClass();
            String name3 = qy0.class.getName();
            IntRange intRangeO3 = l1e0.o(0, eVarC3.P());
            ArrayList arrayList3 = new ArrayList(r3d.q(intRangeO3, 10));
            Iterator it3 = intRangeO3.iterator();
            while (((kkx) it3).c) {
                arrayList3.add(eVarC3.O(((bkx) it3).nextInt()).i);
            }
            for (Object obj4 : arrayList3) {
                if (Intrinsics.d((String) obj4, name3)) {
                    obj = obj4;
                    break;
                }
            }
            String str3 = (String) obj;
            zb5 zb5Var3 = new zb5(eVarC3);
            zb5Var3.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
            if (str3 == null) {
                pek0 pek0Var = qy0.S1;
                AggregatorGamesFragmentSettings aggregatorGamesFragmentSettings = new AggregatorGamesFragmentSettings(H0());
                pek0Var.getClass();
                qy0 qy0Var = new qy0();
                qy0Var.R1.J(qy0Var, qy0.U1[1], aggregatorGamesFragmentSettings);
                zb5Var3.o(R.id.container, qy0Var, name3);
                zb5Var3.c(name3);
            } else {
                Fragment fragmentJ3 = eVarC3.J(name3);
                if (fragmentJ3 != null) {
                    zb5Var3.o(R.id.container, fragmentJ3, name3);
                }
            }
            zb5Var3.f();
            return;
        }
        if (iOrdinal != 4) {
            androidx.fragment.app.e eVarC4 = C();
            eVarC4.getClass();
            String name4 = Fragment.class.getName();
            IntRange intRangeO4 = l1e0.o(0, eVarC4.P());
            ArrayList arrayList4 = new ArrayList(r3d.q(intRangeO4, 10));
            Iterator it4 = intRangeO4.iterator();
            while (((kkx) it4).c) {
                arrayList4.add(eVarC4.O(((bkx) it4).nextInt()).i);
            }
            for (Object obj5 : arrayList4) {
                if (Intrinsics.d((String) obj5, name4)) {
                    obj = obj5;
                    break;
                }
            }
            String str4 = (String) obj;
            zb5 zb5Var4 = new zb5(eVarC4);
            zb5Var4.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
            if (str4 == null) {
                zb5Var4.o(R.id.container, new Fragment(), name4);
                zb5Var4.c(name4);
            } else {
                Fragment fragmentJ4 = eVarC4.J(name4);
                if (fragmentJ4 != null) {
                    zb5Var4.o(R.id.container, fragmentJ4, name4);
                }
            }
            zb5Var4.f();
            return;
        }
        androidx.fragment.app.e eVarC5 = C();
        eVarC5.getClass();
        String name5 = jd0.class.getName();
        IntRange intRangeO5 = l1e0.o(0, eVarC5.P());
        ArrayList arrayList5 = new ArrayList(r3d.q(intRangeO5, 10));
        Iterator it5 = intRangeO5.iterator();
        while (((kkx) it5).c) {
            arrayList5.add(eVarC5.O(((bkx) it5).nextInt()).i);
        }
        for (Object obj6 : arrayList5) {
            if (Intrinsics.d((String) obj6, name5)) {
                obj = obj6;
                break;
            }
        }
        String str5 = (String) obj;
        zb5 zb5Var5 = new zb5(eVarC5);
        zb5Var5.p(R.anim.nav_default_enter_anim, R.anim.nav_default_exit_anim, R.anim.nav_default_pop_enter_anim, R.anim.nav_default_pop_exit_anim);
        if (str5 == null) {
            gfk0 gfk0Var = jd0.P1;
            AggregatorBrandsFragmentSettings aggregatorBrandsFragmentSettings = new AggregatorBrandsFragmentSettings(H0());
            gfk0Var.getClass();
            jd0 jd0Var = new jd0();
            jd0Var.K1.J(jd0Var, jd0.Q1[0], aggregatorBrandsFragmentSettings);
            zb5Var5.o(R.id.container, jd0Var, name5);
            zb5Var5.c(name5);
        } else {
            Fragment fragmentJ5 = eVarC5.J(name5);
            if (fragmentJ5 != null) {
                zb5Var5.o(R.id.container, fragmentJ5, name5);
            }
        }
        zb5Var5.f();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        C().g("X_GAMES_UM_BUTTON_CLICK_RESULT_KEY");
        I0().x(new y7v());
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(G0().f22713a);
        super.e0();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        daf dafVar = this.O1;
        if (dafVar != null) {
            wdk0.l((wdk0) dafVar.l, this, getM1());
        } else {
            Intrinsics.h("component");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        hxm0.m(G0().f22713a);
        daf dafVar = this.O1;
        if (dafVar == null) {
            Intrinsics.h("component");
            throw null;
        }
        wdk0.a((wdk0) dafVar.l, this);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        hie0 hie0Var = new hie0();
        View viewQ0 = q0();
        u8u u8uVar = new u8u(hie0Var, this, (byte) 19);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, u8uVar);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        List listP = C().c.p();
        ArrayList arrayListU = twn.u(listP);
        for (Object obj : listP) {
            if (obj instanceof yx5) {
                arrayListU.add(obj);
            }
        }
        yx5 yx5Var = (yx5) CollectionsKt.firstOrNull(arrayListU);
        if (yx5Var != null) {
            return yx5Var.getM1();
        }
        return true;
    }
}
