package a;

import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.presentation.BetHistoryScreen;
import org.xplatform.client1.providers.PopularScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.coupon.impl.coupon.presentation.CouponScreen;
import org.xplatform.cyber.game.counterstrike.api.navigation.CyberGameCs2ScreenFactory$CyberGameCs2Screen;
import org.xplatform.cyber.game.dota.api.navigation.GameDotaScreenFactory$GameDotaScreen;
import org.xplatform.cyber.game.lol.api.navigation.CyberGameLolScreenFactory$CyberGameLolScreen;
import org.xplatform.cyber.game.mlbb.api.navigation.MlbbGameScreenFactory$MlbbGameScreen;
import org.xplatform.cyber.game.universal.api.navigation.CyberUniversalScreenFactory$CyberUniversalScreen;
import org.xplatform.cyber.game.valorant.api.navigation.game.ValorantGameScreenFactory$ValorantGameScreen;
import org.xplatform.favorites.impl.di.FavoritesScreen;
import org.xplatform.main_menu.impl.navigation.MainMenuFragmentScreen;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenFactory$SportGameAdvancedScreen;
import org.xplatform.sportgame.classic.api.navigation.SportGameClassicScreenFactory$SportGameClassicScreen;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenFactory$SportGameDashboardScreen;
import org.xplatform.sportgame.lite.api.SportGameLiteScreenFactory$SportGameLiteScreen;
import org.xplatform.ufc.api.navigation.UfcScreensFactory$UfcGameScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class p270 extends rs3 {
    public final /* synthetic */ byte f = 0;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public p270(kxq kxqVar, androidx.fragment.app.e eVar, i1w0 i1w0Var) {
        m1r m1rVarS = eVar.S();
        m1rVarS.getClass();
        eVar.getClass();
        i1w0Var.getClass();
        super(kxqVar, R.id.onexgames_tab_content, eVar, m1rVarS);
        this.g = i1w0Var;
    }

    @Override // a.rs3
    public void a(t7d t7dVar) {
        Class cls;
        switch (this.f) {
            case 1:
                sao0 sao0Var = (sao0) this.g;
                t7dVar.getClass();
                if (t7dVar instanceof dwq) {
                    m7h0 m7h0Var = ((dwq) t7dVar).f6811a;
                    if (m7h0Var instanceof tn) {
                        oeg0 oeg0Var = sao0Var.M1;
                        if (oeg0Var == null) {
                            Intrinsics.h("rootRouterHolder");
                            throw null;
                        }
                        i1w0 i1w0VarB = oeg0Var.b();
                        i1w0VarB.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        m7h0Var.getClass();
                        if (m7h0Var instanceof DialogScreen) {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) m7h0Var)));
                        } else {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(m7h0Var)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0VarB, copyOnWriteArrayList, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (!pawVar.hasNext()) {
                                return;
                            } else {
                                i1w0VarB.a((oe50) pawVar.next());
                            }
                        }
                    }
                }
                boolean z = t7dVar instanceof xkf0;
                if (z) {
                    m7h0 m7h0Var2 = ((xkf0) t7dVar).f41027a;
                    if (m7h0Var2 instanceof tn) {
                        oeg0 oeg0Var2 = sao0Var.M1;
                        if (oeg0Var2 == null) {
                            Intrinsics.h("rootRouterHolder");
                            throw null;
                        }
                        i1w0 i1w0VarB2 = oeg0Var2.b();
                        i1w0VarB2.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                        m7h0Var2.getClass();
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList2, new c8d(y7d.f42146a, new d1w0(m7h0Var2)), i1w0VarB2, copyOnWriteArrayList2, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorP;
                            if (!pawVar2.hasNext()) {
                                return;
                            } else {
                                i1w0VarB2.a((oe50) pawVar2.next());
                            }
                        }
                    }
                }
                if (!z) {
                    if (!(t7dVar instanceof nb5)) {
                        super.a(t7dVar);
                        return;
                    }
                    m6m0 m6m0Var = sao0.V1;
                    Fragment fragmentI = sao0Var.C().I(R.id.container);
                    if (fragmentI != null) {
                        sj3.T(fragmentI);
                    }
                    super.a(t7dVar);
                    return;
                }
                xkf0 xkf0Var = (xkf0) t7dVar;
                m7h0 m7h0Var3 = xkf0Var.f41027a;
                if (sao0Var.N1 == null) {
                    Intrinsics.h("rootScreenChecker");
                    throw null;
                }
                cb50 cb50VarH0 = sao0Var.H0();
                cb50VarH0.getClass();
                m7h0Var3.getClass();
                if (cb50VarH0 instanceof bb50) {
                    cls = PopularScreen.class;
                } else if (cb50VarH0 instanceof ya50) {
                    cls = FavoritesScreen.class;
                } else if (cb50VarH0 instanceof xa50) {
                    cls = CouponScreen.class;
                } else if (cb50VarH0 instanceof za50) {
                    cls = BetHistoryScreen.class;
                } else {
                    if (!(cb50VarH0 instanceof ab50)) {
                        t9f.b();
                        return;
                    }
                    cls = MainMenuFragmentScreen.class;
                }
                if (cls.isAssignableFrom(m7h0Var3.getClass())) {
                    super.a(xkf0Var);
                    return;
                }
                if (sao0Var.C().P() > 0) {
                    super.a(xkf0Var);
                    return;
                }
                i1w0 i1w0Var = sao0Var.G0().f7902a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
                if (m7h0Var3 instanceof DialogScreen) {
                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) m7h0Var3)));
                } else {
                    copyOnWriteArrayList3.add(new c8d(y7d.f42146a, new w0w0(m7h0Var3)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
                break;
            default:
                super.a(t7dVar);
                return;
        }
    }

    @Override // a.rs3
    public void c() {
        switch (this.f) {
            case 0:
                if (this.c.P() != 0) {
                    super.c();
                } else {
                    this.e.clear();
                    i1w0 i1w0Var = (i1w0) this.g;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                break;
            default:
                super.c();
                break;
        }
    }

    @Override // a.rs3
    public void d(m7h0 m7h0Var) {
        switch (this.f) {
            case 1:
                m7h0Var.getClass();
                if ((m7h0Var instanceof SportGameClassicScreenFactory$SportGameClassicScreen) || (m7h0Var instanceof SportGameAdvancedScreenFactory$SportGameAdvancedScreen) || (m7h0Var instanceof SportGameLiteScreenFactory$SportGameLiteScreen) || (m7h0Var instanceof SportGameDashboardScreenFactory$SportGameDashboardScreen) || (m7h0Var instanceof CyberGameCs2ScreenFactory$CyberGameCs2Screen) || (m7h0Var instanceof CyberGameLolScreenFactory$CyberGameLolScreen) || (m7h0Var instanceof ValorantGameScreenFactory$ValorantGameScreen) || (m7h0Var instanceof MlbbGameScreenFactory$MlbbGameScreen) || (m7h0Var instanceof CyberUniversalScreenFactory$CyberUniversalScreen) || (m7h0Var instanceof GameDotaScreenFactory$GameDotaScreen) || (m7h0Var instanceof UfcScreensFactory$UfcGameScreen)) {
                    i1w0 i1w0Var = ((sao0) this.g).G0().f7902a;
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    if (m7h0Var instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) m7h0Var)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(m7h0Var)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    super.d(m7h0Var);
                }
                break;
            default:
                super.d(m7h0Var);
                break;
        }
    }

    @Override // a.rs3
    public void h(xkf0 xkf0Var) {
        Fragment fragmentJ;
        boolean z;
        switch (this.f) {
            case 0:
                m7h0 m7h0Var = xkf0Var.f41027a;
                if (!(m7h0Var instanceof FragmentScreen)) {
                    super.h(xkf0Var);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = this.e;
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        androidx.fragment.app.e eVar = this.c;
                        if (!zHasNext) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (!Intrinsics.d(((Fragment) obj).B, m7h0Var.getF45455a())) {
                                    arrayList3.add(obj);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            boolean zContains = arrayList2.contains(m7h0Var.getF45455a());
                            m1r m1rVar = this.d;
                            if (!zContains || (fragmentJ = eVar.J(m7h0Var.getF45455a())) == null) {
                                fragmentJ = ((FragmentScreen) m7h0Var).a(m1rVar);
                            }
                            eVar.getClass();
                            zb5 zb5Var = new zb5(eVar);
                            List listP = eVar.c.p();
                            listP.getClass();
                            Fragment fragment = (Fragment) CollectionsKt.f0(listP);
                            if (fragment != null) {
                                i((FragmentScreen) m7h0Var, zb5Var, fragment, fragmentJ);
                            }
                            if (arrayList3 != null) {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    zb5Var.j((Fragment) it2.next());
                                }
                            }
                            if (eVar.I(fragmentJ.z) == null) {
                                z = true;
                                zb5Var.k(this.b, fragmentJ, m7h0Var.getF45455a(), 1);
                            } else {
                                zb5Var.b(new h6r(7, fragmentJ));
                                z = false;
                            }
                            zb5Var.f();
                            if (arrayList2.size() >= 2) {
                                arrayList2.remove(m7h0Var.getF45455a());
                                arrayList2.add(m7h0Var.getF45455a());
                            } else if (z) {
                                arrayList2.add(m7h0Var.getF45455a());
                            }
                            break;
                        } else {
                            Fragment fragmentJ2 = eVar.J((String) it.next());
                            if (fragmentJ2 != null) {
                                arrayList.add(fragmentJ2);
                            }
                        }
                    }
                }
                break;
            default:
                super.h(xkf0Var);
                break;
        }
    }

    @Override // a.rs3
    public final void i(FragmentScreen fragmentScreen, zb5 zb5Var, Fragment fragment, Fragment fragment2) {
        byte b = this.f;
        fragmentScreen.getClass();
        fragment2.getClass();
        switch (b) {
            case 0:
                zb5Var.p(R.anim.fade_in_medium, R.anim.fade_out_medium, 0, 0);
                return;
            default:
                if ((fragmentScreen instanceof CyberGameCs2ScreenFactory$CyberGameCs2Screen) || (fragmentScreen instanceof CyberGameLolScreenFactory$CyberGameLolScreen) || (fragmentScreen instanceof ValorantGameScreenFactory$ValorantGameScreen) || (fragmentScreen instanceof MlbbGameScreenFactory$MlbbGameScreen) || (fragmentScreen instanceof CyberUniversalScreenFactory$CyberUniversalScreen) || (fragmentScreen instanceof GameDotaScreenFactory$GameDotaScreen)) {
                    zb5Var.p(R.anim.fade_in, R.anim.fade_out, 0, 0);
                } else {
                    zb5Var.p(R.anim.fade_in_medium, R.anim.fade_out_medium, 0, 0);
                }
                kt2 kt2Var = ((sao0) this.g).L1;
                if (kt2Var != null) {
                    kt2Var.f(fragmentScreen.getClass().getSimpleName());
                    return;
                } else {
                    Intrinsics.h("analyticsTracker");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p270(sao0 sao0Var, kxq kxqVar, androidx.fragment.app.e eVar) {
        super(kxqVar, R.id.container, eVar, 8);
        this.g = sao0Var;
        eVar.getClass();
    }
}
