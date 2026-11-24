package a;

import a.kxc0;
import a.m1r;
import a.ufx;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.AppScreens$PromoWebAggregatorFragmentScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.favorites.impl.di.FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1;
import org.xplatform.info.impl.navigation.InfoScreenFactoryImpl$getInfoScreen$1;
import org.xplatform.onboarding_section.impl.navigation.OnboardingScreens$OnboardingCyberSectionsFragmentScreen;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoListScreen$1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoSettingsScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final class zrj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f44856a;
    public final ouu b;
    public final nv20 c;
    public final lp4 d;
    public final ctf0 e;
    public final lk5 f;
    public final zx10 g;
    public final vjp h;
    public final qv2 i;
    public final oeg0 j;
    public final vqc k;
    public final uzc0 l;
    public final r9u m;
    public final jh70 n;
    public final org.xplatform.toto_bet.core.navigation.a o;
    public final pru p;
    public final hzg q;
    public final fvt0 r;
    public final y3v s;

    public zrj(us00 us00Var, ouu ouuVar, nv20 nv20Var, rqt rqtVar, lp4 lp4Var, ctf0 ctf0Var, lk5 lk5Var, zx10 zx10Var, vjp vjpVar, qv2 qv2Var, oeg0 oeg0Var, eke0 eke0Var, gle0 gle0Var, vqc vqcVar, jw20 jw20Var, std stdVar, uzc0 uzc0Var, kj5 kj5Var, r9u r9uVar, jh70 jh70Var, mi70 mi70Var, org.xplatform.toto_bet.core.navigation.a aVar, xuz xuzVar, pru pruVar, s9m0 s9m0Var, s2m0 s2m0Var, g9m0 g9m0Var, xak xakVar, xr xrVar, hzg hzgVar, atz atzVar, yk5 yk5Var, fvt0 fvt0Var, y3v y3vVar) {
        lp4Var.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        r9uVar.getClass();
        this.f44856a = us00Var;
        this.b = ouuVar;
        this.c = nv20Var;
        this.d = lp4Var;
        this.e = ctf0Var;
        this.f = lk5Var;
        this.g = zx10Var;
        this.h = vjpVar;
        this.i = qv2Var;
        this.j = oeg0Var;
        this.k = vqcVar;
        this.l = uzc0Var;
        this.m = r9uVar;
        this.n = jh70Var;
        this.o = aVar;
        this.p = pruVar;
        this.q = hzgVar;
        this.r = fvt0Var;
        this.s = y3vVar;
    }

    public static /* synthetic */ void c(zrj zrjVar, cb50 cb50Var, FragmentScreen fragmentScreen, int i) {
        if ((i & 2) != 0) {
            fragmentScreen = null;
        }
        zrjVar.b(cb50Var, fragmentScreen, true);
    }

    public final void a(ab50 ab50Var, FragmentScreen fragmentScreen) {
        i1w0 i1w0VarB = this.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                n(ab50Var, new srj(fragmentScreen, (byte) 1), false);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void b(cb50 cb50Var, m7h0 m7h0Var, boolean z) {
        i1w0 i1w0VarB = this.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                n(cb50Var, new rrj(m7h0Var, b), z);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, zje zjeVar) {
        yrj yrjVar;
        Intent intent;
        if (zjeVar instanceof yrj) {
            yrjVar = (yrj) zjeVar;
            int i = yrjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yrjVar.l = i - Integer.MIN_VALUE;
            } else {
                yrjVar = new yrj(this, zjeVar);
            }
        } else {
            yrjVar = new yrj(this, zjeVar);
        }
        Object obj = yrjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = yrjVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent2.addFlags(268435456);
            uen uenVar = wen.b;
            long jW0 = ibc.w0(400L, bfn.MILLISECONDS);
            yrjVar.i = intent2;
            yrjVar.l = 1;
            if (qcc.P(jW0, yrjVar) == wneVar) {
                return wneVar;
            }
            intent = intent2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intent = yrjVar.i;
            z1x.P(obj);
        }
        this.f44856a.startActivity(intent);
        return Unit.f46060a;
    }

    public final void e() {
        if (this.p.a().c.c) {
            wv10 wv10Var = wv10.SPORT;
            c(this, new ab50(1), new OnboardingScreens$OnboardingCyberSectionsFragmentScreen(), 4);
        }
    }

    public final void f(FragmentScreen fragmentScreen) {
        i1w0 i1w0VarB = this.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                this.b.p(new ab50(5), new srj(fragmentScreen, b));
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void g(frj frjVar) {
        frjVar.getClass();
        switch (frjVar.ordinal()) {
            case 0:
                h(tcp.ONE_X_GAMES);
                break;
            case 1:
                h(tcp.CASINO);
                break;
            case 2:
                h(tcp.TEAM);
                break;
            case 3:
                h(tcp.CHAMPION);
                break;
            case 4:
            case 8:
                h(tcp.GAMES);
                break;
            case 5:
                h(tcp.OTHER);
                break;
            case 6:
                h(tcp.TRACKING);
                break;
            case 7:
                h(tcp.VIEWED);
                break;
            default:
                t9f.b();
                break;
        }
    }

    public final void h(tcp tcpVar) {
        oeg0 oeg0Var = this.j;
        i1w0 i1w0VarB = oeg0Var.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                oeg0Var.c().d(new ngh(this, tcpVar, (byte) 10));
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void i() {
        i1w0 i1w0VarB = this.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                n(new ab50(1), new qrj(this, (byte) 3), false);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public final void j(String str) {
        str.getClass();
        c(this, new bb50(false), new AppScreens$PromoWebAggregatorFragmentScreen(str), 4);
    }

    public final void k(String str) {
        str.getClass();
        wv10 wv10Var = wv10.SPORT;
        c(this, new ab50(4), new InfoScreenFactoryImpl$getInfoScreen$1(str), 4);
    }

    public final void l(String str) {
        str.getClass();
        bb50 bb50Var = new bb50(false);
        ((h6i) this.c.f24171a).c();
        c(this, bb50Var, new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str), 4);
    }

    public final void m() {
        i1w0 i1w0VarB = this.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
        ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarB, copyOnWriteArrayListQ).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarB.a((oe50) pawVar.next());
            }
        }
    }

    public final void n(cb50 cb50Var, Function1 function1, boolean z) {
        ouu ouuVar = this.b;
        if (ouuVar.t().f4046a.equals(cb50Var.f4046a)) {
            ouuVar.n(cb50Var, z);
            function1.invoke(ouuVar.M(cb50Var));
        } else {
            ouuVar.q(cb50Var, z);
            function1.invoke(ouuVar.s());
        }
    }

    public final void o(mnj mnjVar) {
        i1w0 i1w0Var;
        int i = mnjVar.d;
        int i2 = mnjVar.c;
        int i3 = mnjVar.e;
        boolean z = mnjVar.f22091a;
        boolean z2 = mnjVar.b;
        FragmentScreen promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 = new PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1(i, i2, i3, z, z2);
        oeg0 oeg0Var = this.j;
        if (z) {
            chg0 chg0Var = (chg0) oeg0Var.f25121a.get(ehg0.f7808a);
            if (chg0Var == null || (i1w0Var = chg0Var.f4359a) == null) {
                i1w0Var = p1w0.h;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            if (promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else if (z2) {
            i1w0 i1w0VarS = this.b.s();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0VarS, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarS.a((oe50) pawVar2.next());
                }
            }
        } else {
            i1w0 i1w0VarB = oeg0Var.b();
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarB);
            if (promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
            }
            ListIterator listIteratorO3 = b1j.o(i1w0VarB, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorO3;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0VarB.a((oe50) pawVar3.next());
                }
            }
        }
    }

    public final void p() {
        c(this, new bb50(false), null, 6);
    }

    public final void q() {
        PromoScreenFactoryImpl$getPromoListScreen$1 promoScreenFactoryImpl$getPromoListScreen$1 = new PromoScreenFactoryImpl$getPromoListScreen$1();
        wv10 wv10Var = wv10.SPORT;
        n(new ab50(4), new e3j(promoScreenFactoryImpl$getPromoListScreen$1, (byte) 8), false);
    }

    public final void r(long j, zuc0 zuc0Var, boolean z) {
        PromoScreenFactoryImpl$getPromoSettingsScreen$1 promoScreenFactoryImpl$getPromoSettingsScreen$1 = new PromoScreenFactoryImpl$getPromoSettingsScreen$1(zuc0Var, j);
        i1w0 i1w0VarC = this.j.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                wv10 wv10Var = wv10.SPORT;
                n(new ab50(4), new urj(promoScreenFactoryImpl$getPromoSettingsScreen$1, z, b), false);
                return;
            }
            i1w0VarC.a((oe50) pawVar.next());
        }
    }

    public final void s(final String str) {
        str.getClass();
        b(new bb50(false), new FragmentScreen(str) { // from class: org.xplatform.client1.features.appactivity.AppScreens$PromoWebFragmentScreen

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f46446a;

            {
                str.getClass();
                this.f46446a = str;
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                kxc0.Y1.getClass();
                String str2 = this.f46446a;
                str2.getClass();
                kxc0 kxc0Var = new kxc0();
                Bundle bundle = new Bundle();
                bundle.putString("URL", str2);
                kxc0Var.s0(bundle);
                return kxc0Var;
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                return ufx.C(this);
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        }, false);
    }

    public final void t() {
        c(this, new bb50(false), new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0.f2606a), 4);
    }

    public final void u(long j) {
        c(this, new bb50(false), new FavoritesScreenFactoryImpl$getGamesByTeamIdScreen$1(this.f, j, this.e.b.a(R.string.team_games_title, Arrays.copyOf(new Object[0], 0))), 4);
    }

    public final void v() {
        i1w0 i1w0VarB = this.j.b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                c(this, new ab50(0), ydx.S(), 4);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }
}
