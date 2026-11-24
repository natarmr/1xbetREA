package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.navigation.CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$champsListScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$cyberChampScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$esportsGamesScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$hltvAwardsScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class uzg implements hzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oeg0 f36533a;
    public final vqc b;
    public final ih5 c;
    public final vqc d;
    public final yfm0 e;
    public final gr00 f;
    public final nv20 g;
    public final y3v h;
    public final grj i;
    public final y9g j;

    public uzg(oeg0 oeg0Var, vqc vqcVar, ih5 ih5Var, vqc vqcVar2, r9u r9uVar, gle0 gle0Var, yfm0 yfm0Var, gr00 gr00Var, nv20 nv20Var, y3v y3vVar, uzc0 uzc0Var, grj grjVar, y9g y9gVar) {
        oeg0Var.getClass();
        r9uVar.getClass();
        y9gVar.getClass();
        this.f36533a = oeg0Var;
        this.b = vqcVar;
        this.c = ih5Var;
        this.d = vqcVar2;
        this.e = yfm0Var;
        this.f = gr00Var;
        this.g = nv20Var;
        this.h = y3vVar;
        this.i = grjVar;
        this.j = y9gVar;
    }

    public final void a() {
        i1w0 i1w0VarC = this.f36533a.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void b(CyberCalendarParams cyberCalendarParams) {
        i1w0 i1w0VarC = this.f36533a.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        this.j.getClass();
        FragmentScreen cyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1 = new CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1(cyberCalendarParams);
        if (cyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1 instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(cyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1)));
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

    public final void c(long j, CyberGamesPage cyberGamesPage, k1g k1gVar) {
        cyberGamesPage.getClass();
        this.f36533a.c().d(new mz0((Object) this, j, (Object) cyberGamesPage, (byte) 13));
        this.d.k(pzb.C(new mz0(j, cyberGamesPage, k1gVar)));
    }

    public final void d(int i, List list, boolean z) {
        list.getClass();
        this.f36533a.c().d(new gc0((Object) this, (Object) list, z, i, (byte) 2));
    }

    public final void e(final int i, final long j, final long j2, final boolean z) {
        this.f36533a.c().d(new Function1() { // from class: a.tzg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$esportsGamesScreen$1(this.f34802a.b, new EsportsGamesScreenParams.SportGames(i, j, j2, z)));
                return Unit.f46060a;
            }
        });
    }

    public final void f(final String str, final long j, final long j2, final int i) {
        k1g k1gVar = k1g.OPEN_REGULAR;
        str.getClass();
        this.f36533a.c().d(new Function1() { // from class: a.qzg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$cyberChampScreen$1(new CyberChampParams(str, j2, j, i), this.f29575a.b));
                return Unit.f46060a;
            }
        });
        this.d.k(pzb.C(new Function1() { // from class: a.rzg
            {
                k1g k1gVar2 = k1g.OPEN_REGULAR;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                k1g k1gVar2 = k1g.OPEN_REGULAR;
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.c = j;
                j1g.b.getClass();
                n1gVar.d = std.e(i);
                long j3 = j2;
                n1gVar.e = new jq2(j3);
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1gVar2;
                n1gVar.b = j3;
                return Unit.f46060a;
            }
        }));
    }

    public final void g() {
        this.d.k(pzb.C(new vlf((byte) 23)));
        i1w0 i1w0VarC = this.f36533a.c();
        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
        k0w0VarI.h(new CyberGamesScreenFactoryImpl$hltvAwardsScreen$1(this.b));
        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void h(String str, int i, long j) {
        str.getClass();
        if (gql0.b().contains(Long.valueOf(j))) {
            this.f36533a.c().d(new zz0(this, str, j, i, (byte) 1));
        }
    }

    public final void i(String str) {
        str.getClass();
        this.d.k(pzb.C(new vlf((byte) 24)));
        this.f36533a.c().d(new szg(this, str, (byte) 0));
    }

    public final void j(int i, String str) {
        this.f36533a.c().d(new g18((Object) this, (Object) str, i, (byte) 1));
    }

    public final void k(final int i, final long j, final List list, final boolean z) {
        list.getClass();
        this.f36533a.c().d(new Function1() { // from class: a.mzg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$champsListScreen$1(this.f22654a.b, new CyberChampsMainParams(org.xplatform.cyber.section.api.domain.entity.d.d(i), j, z, list)));
                return Unit.f46060a;
            }
        });
    }

    public final void l(long j, long j2, String str) {
        str.getClass();
        this.f36533a.c().d(new jzg(this, str, j, j2, (byte) 1));
    }

    public final void m(String str) {
        str.getClass();
        this.f36533a.c().d(new szg(this, str, (byte) 1));
    }

    public final void n(long j, long j2, String str, k1g k1gVar) {
        str.getClass();
        this.f36533a.c().d(new jzg(this, j, j2, str));
        this.d.k(pzb.C(new qi4(j, (Serializable) k1gVar, (byte) 5)));
    }

    public final void o(long j, String str) {
        str.getClass();
        i1w0 i1w0VarC = this.f36533a.c();
        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
        k0w0VarI.h(this.h.h((int) j, str));
        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void p(long j, long j2, long j3, long j4, String str, boolean z) {
        str.getClass();
        this.f36533a.c().d(new rp7(this, j, str, j2, j3, z, j4));
    }

    public final void q(final int i, final long j, final long j2) {
        boolean zContains = gql0.b().contains(Long.valueOf(j2));
        oeg0 oeg0Var = this.f36533a;
        if (zContains) {
            oeg0Var.c().d(new Function1() { // from class: a.kzg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    k0w0 k0w0Var = (k0w0) obj;
                    k0w0Var.getClass();
                    k0w0Var.k(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(new CyberGameStatisticScreenParams(String.valueOf(j), 0, i, j2), this.f19151a.f));
                    return Unit.f46060a;
                }
            });
        } else {
            oeg0Var.c().d(new qp7((Object) this, j, j2, (byte) 1));
        }
    }
}
