package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;
import org.xplatform.feed.navigation.OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;
import org.xplatform.market_statistic.navigation.MarketStatisticScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class g1g extends w46 {
    public final qoj0 A;
    public boolean B;
    public final CyberActionDialogParams b;
    public final xex c;
    public final mku d;
    public final duj e;
    public final eyg0 f;
    public final e1u g;
    public final lbu h;
    public final njt0 i;
    public final oeg0 j;
    public final z8u k;
    public final sbu l;
    public final b8u m;
    public final got n;
    public final cmt o;
    public final rrc p;
    public final b3c q;
    public final ivn r;
    public final xvf s;
    public final gr00 t;
    public final qgh u;
    public final mne v;
    public final ih5 w;
    public final je x;
    public final kys0 y;
    public final ol60 z;

    public g1g(CyberActionDialogParams cyberActionDialogParams, xex xexVar, mku mkuVar, duj dujVar, eyg0 eyg0Var, e1u e1uVar, lbu lbuVar, njt0 njt0Var, oeg0 oeg0Var, z8u z8uVar, sbu sbuVar, b8u b8uVar, got gotVar, cmt cmtVar, rrc rrcVar, b3c b3cVar, ivn ivnVar, xvf xvfVar, gr00 gr00Var, qgh qghVar, mne mneVar, ih5 ih5Var, je jeVar, kys0 kys0Var) {
        oeg0Var.getClass();
        this.b = cyberActionDialogParams;
        this.c = xexVar;
        this.d = mkuVar;
        this.e = dujVar;
        this.f = eyg0Var;
        this.g = e1uVar;
        this.h = lbuVar;
        this.i = njt0Var;
        this.j = oeg0Var;
        this.k = z8uVar;
        this.l = sbuVar;
        this.m = b8uVar;
        this.n = gotVar;
        this.o = cmtVar;
        this.p = rrcVar;
        this.q = b3cVar;
        this.r = ivnVar;
        this.s = xvfVar;
        this.t = gr00Var;
        this.u = qghVar;
        this.v = mneVar;
        this.w = ih5Var;
        this.x = jeVar;
        this.y = kys0Var;
        this.z = new ol60(3);
        this.A = roj0.b(1, 0, i99.b, 2);
    }

    public final void w() {
        qjj.W(jiu0.a(this), null, null, new s0g(this, null, (byte) 0), 3);
    }

    public final void x(String str, String str2) {
        CyberActionDialogParams cyberActionDialogParams = this.b;
        long j = cyberActionDialogParams.g;
        long j2 = cyberActionDialogParams.h;
        Long lValueOf = j == 40 ? Long.valueOf(j2) : null;
        kt2 kt2Var = this.w.f14765a;
        jo20 jo20Var = new jo20();
        if (str != null) {
            jo20Var.put("point", str);
        }
        jo20Var.put("sport_id", Long.valueOf(j));
        if (lValueOf != null) {
            jo20Var.put("sub_sport_id", lValueOf);
        }
        if (str2 != null) {
            jo20Var.put("action", str2);
        }
        kt2Var.a("bet_gameview_point_call", jo20Var.b());
        long j3 = cyberActionDialogParams.g;
        Long lValueOf2 = j3 == 40 ? Long.valueOf(j2) : null;
        s1p s1pVar = this.x.f16351a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j3));
        if (lValueOf2 != null) {
            yni0Var.add(new i1p(lValueOf2, (byte) 0));
        }
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 0));
        }
        if (str2 != null) {
            yni0Var.add(new j1p(str2, (byte) 1));
        }
        s1pVar.a(cui0.a(yni0Var), 3176L);
    }

    public final void y(sh shVar) {
        boolean zEquals = shVar.equals(kh.f18264a);
        byte b = 2;
        byte b2 = 0;
        mne mneVar = this.v;
        yje yjeVar = null;
        if (zEquals) {
            if (this.B) {
                x("market_show", null);
            } else {
                x("market_hide", null);
            }
            qjj.W(jiu0.a(this), mneVar.f22085a, null, new x0g(this, yjeVar, b2), 2);
            return;
        }
        boolean zEquals2 = shVar.equals(qh.f28711a);
        oeg0 oeg0Var = this.j;
        if (zEquals2) {
            x("statistics", null);
            w();
            oeg0Var.c().d(new r0g(this, b2));
            return;
        }
        byte b3 = 3;
        if (shVar.equals(ph.f26973a)) {
            x("setting_info_blocks", null);
            w();
            oeg0Var.c().d(new r0g(this, b3));
            return;
        }
        boolean zEquals3 = shVar.equals(nh.f23508a);
        CyberActionDialogParams cyberActionDialogParams = this.b;
        final xex xexVar = this.c;
        if (!zEquals3) {
            byte b4 = 1;
            if (shVar.equals(mh.f21766a)) {
                x("market_set", null);
                qjj.W(jiu0.a(this), null, null, new s0g(this, yjeVar, b4), 3);
                return;
            }
            if (shVar.equals(lh.f20030a)) {
                q0g q0gVar = (q0g) CollectionsKt.W(0, this.A.d());
                x((q0gVar == null || !q0gVar.l) ? "favor" : "delete_from_fav", null);
                oeg0Var.c().d(new r0g(this, b4));
                return;
            }
            if (shVar.equals(oh.f25240a)) {
                x("alerts", null);
                w();
                final long j = cyberActionDialogParams.f46507a;
                final long j2 = cyberActionDialogParams.h;
                final boolean z = cyberActionDialogParams.c;
                final long j3 = cyberActionDialogParams.b;
                ((oeg0) xexVar.f40764a).c().d(new Function1() { // from class: a.p0g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        k0w0 k0w0Var = (k0w0) obj;
                        k0w0Var.getClass();
                        Object obj2 = xexVar.b;
                        k0w0Var.h(new OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1(j, j3, 40L, j2, "", z));
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (!(shVar instanceof rh)) {
                t9f.b();
                return;
            }
            boolean z2 = ((rh) shVar).f30462a;
            if (this.g.f() == z2) {
                return;
            }
            x(null, z2 ? "on" : "off");
            sac.V(jiu0.a(this), new r0g(this, b), null, mneVar.f22085a, new x0g(this, z2, (yje) null), 10);
            return;
        }
        x("graphics", null);
        w();
        long j4 = cyberActionDialogParams.f46507a;
        boolean z3 = cyberActionDialogParams.c;
        xexVar.getClass();
        FragmentScreen marketStatisticScreenFactoryImpl$getScreen$1 = new MarketStatisticScreenFactoryImpl$getScreen$1(new MarketStatisticParams(z3, j4));
        i1w0 i1w0VarC = ((oeg0) xexVar.f40764a).c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        if (marketStatisticScreenFactoryImpl$getScreen$1 instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) marketStatisticScreenFactoryImpl$getScreen$1)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(marketStatisticScreenFactoryImpl$getScreen$1)));
        }
        ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}
