package a;

import a.m1r;
import a.rsu0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class z0s extends x2t0 {
    public final hzg h;
    public final ih5 i;
    public final zr1 j;

    public z0s(hzg hzgVar, ih5 ih5Var, zr1 zr1Var) {
        super(new s9r((byte) 22));
        this.h = hzgVar;
        this.i = ih5Var;
        this.j = zr1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x024c A[LOOP:1: B:107:0x0243->B:109:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // a.j3t0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object a(hdb hdbVar, zje zjeVar) {
        y0s y0sVar;
        Object value;
        long j;
        long j2;
        long j3;
        sff0 sff0Var;
        ypl0 ypl0Var;
        CyberGamesPage cyberGamesPage;
        int i;
        List list;
        boolean z;
        String str;
        m9s m9sVar;
        i1w0 i1w0VarC;
        CopyOnWriteArrayList copyOnWriteArrayListQ;
        FragmentScreen fragmentScreen;
        ListIterator listIteratorO;
        paw pawVar;
        hdb hdbVar2 = hdbVar;
        if (zjeVar instanceof y0s) {
            y0sVar = (y0s) zjeVar;
            int i2 = y0sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0sVar.l = i2 - Integer.MIN_VALUE;
            } else {
                y0sVar = new y0s(this, zjeVar);
            }
        } else {
            y0sVar = new y0s(this, zjeVar);
        }
        Object obj = y0sVar.j;
        wne wneVar = wne.f39444a;
        int i3 = y0sVar.l;
        Object obj2 = null;
        if (i3 == 0) {
            z1x.P(obj);
            y0sVar.i = hdbVar2;
            y0sVar.l = 1;
            if (x2t0.f(this, hdbVar2, y0sVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hdbVar2 = y0sVar.i;
            z1x.P(obj);
        }
        if (hdbVar2 != null) {
            boolean z2 = hdbVar2 instanceof edb;
            long j4 = 0;
            hzg hzgVar = this.h;
            if (z2) {
                for (Object obj3 : ((jdb) d()).h) {
                    lok0 lok0Var = (lok0) obj3;
                    if (lok0Var.f20396a == ((jdb) d()).e && lok0Var.t.contains(1)) {
                        obj2 = obj3;
                        break;
                    }
                }
                lok0 lok0Var2 = (lok0) obj2;
                if (lok0Var2 != null) {
                    ((uzg) hzgVar).o(lok0Var2.f20396a, lok0Var2.b);
                } else {
                    long j5 = Intrinsics.d(((jdb) d()).j, CyberGamesPage.Real.INSTANCE) ? ((jdb) d()).b : ((jdb) d()).f16320a;
                    if (((jdb) d()).c == 0) {
                        m9s m9sVar2 = ((jdb) d()).f;
                        if (m9sVar2 != null) {
                            j4 = m9sVar2.A;
                        }
                    } else {
                        j4 = ((jdb) d()).c;
                    }
                    long j6 = j4;
                    String str2 = ((jdb) d()).d;
                    byte b = ((jdb) d()).j.f46556a;
                    k1g k1gVar = k1g.OPEN_REGULAR;
                    ((uzg) hzgVar).f(str2, j5, j6, b);
                }
            } else if (hdbVar2 instanceof fdb) {
                boolean z3 = ((jdb) d()).k;
                long j7 = ((jdb) d()).f16320a;
                long j8 = ((jdb) d()).b;
                this.i.l(j7, j8, z3 ? r1g.CYBERSPORT_GAME_SCREEN_LIVE : r1g.CYBERSPORT_GAME_SCREEN_LINE, null, null);
                this.j.m(j7, j8, (z3 ? r1g.CYBERSPORT_GAME_SCREEN_LIVE : r1g.CYBERSPORT_GAME_SCREEN_LINE).f29679a, null, null);
                ((uzg) hzgVar).c(((jdb) d()).f16320a == 40 ? ((jdb) d()).b : ((jdb) d()).f16320a, ((jdb) d()).j, k1g.OPEN_REGULAR);
            } else if (hdbVar2 instanceof gdb) {
                long j9 = ((jdb) d()).f16320a;
                if (((jdb) d()).c == 0) {
                    m9s m9sVar3 = ((jdb) d()).f;
                    if (m9sVar3 != null) {
                        j4 = m9sVar3.A;
                    }
                } else {
                    j4 = ((jdb) d()).c;
                }
                m9s m9sVar4 = ((jdb) d()).f;
                snu0 snu0VarQ = aem0.q(j9, m9sVar4 != null && (m9sVar4.I instanceof qz7), j4);
                if (snu0VarQ instanceof qnu0) {
                    long j10 = ((jdb) d()).f16320a;
                    m9s m9sVar5 = ((jdb) d()).f;
                    String str3 = m9sVar5 != null ? m9sVar5.z : null;
                    String str4 = "";
                    String str5 = str3 == null ? "" : str3;
                    String str6 = ((jdb) d()).d;
                    switch (((qnu0) snu0VarQ).f29047a.ordinal()) {
                        case 0:
                            final VirtualSportRulesParams virtualSportRulesParams = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar = (uzg) hzgVar;
                            i1w0VarC = uzgVar.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar = uzgVar.b;
                            fragmentScreen = new FragmentScreen(vqcVar, virtualSportRulesParams) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 1:
                            str4 = "cyber_rules_tic_tac_toe";
                            final VirtualSportRulesParams virtualSportRulesParams2 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar2 = (uzg) hzgVar;
                            i1w0VarC = uzgVar2.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar2 = uzgVar2.b;
                            fragmentScreen = new FragmentScreen(vqcVar2, virtualSportRulesParams2) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams2;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 2:
                            str4 = "cyber_rules_card_basketball";
                            final VirtualSportRulesParams virtualSportRulesParams3 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar3 = (uzg) hzgVar;
                            i1w0VarC = uzgVar3.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar3 = uzgVar3.b;
                            fragmentScreen = new FragmentScreen(vqcVar3, virtualSportRulesParams3) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams3;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 3:
                            str4 = "cyber_rules_numbers";
                            final VirtualSportRulesParams virtualSportRulesParams4 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar4 = (uzg) hzgVar;
                            i1w0VarC = uzgVar4.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar4 = uzgVar4.b;
                            fragmentScreen = new FragmentScreen(vqcVar4, virtualSportRulesParams4) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams4;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 4:
                            str4 = "cyber_rules_big_pig";
                            final VirtualSportRulesParams virtualSportRulesParams5 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar5 = (uzg) hzgVar;
                            i1w0VarC = uzgVar5.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar5 = uzgVar5.b;
                            fragmentScreen = new FragmentScreen(vqcVar5, virtualSportRulesParams5) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams5;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 5:
                            str4 = "cyber_rules_rock_paper_scissors";
                            final VirtualSportRulesParams virtualSportRulesParams6 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar6 = (uzg) hzgVar;
                            i1w0VarC = uzgVar6.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar6 = uzgVar6.b;
                            fragmentScreen = new FragmentScreen(vqcVar6, virtualSportRulesParams6) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams6;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 6:
                            str4 = "cyber_rules_power_of_power_doomsday";
                            final VirtualSportRulesParams virtualSportRulesParams7 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar7 = (uzg) hzgVar;
                            i1w0VarC = uzgVar7.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar7 = uzgVar7.b;
                            fragmentScreen = new FragmentScreen(vqcVar7, virtualSportRulesParams7) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams7;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 7:
                            str4 = "cyber_rules_power_of_power";
                            final VirtualSportRulesParams virtualSportRulesParams8 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar8 = (uzg) hzgVar;
                            i1w0VarC = uzgVar8.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar8 = uzgVar8.b;
                            fragmentScreen = new FragmentScreen(vqcVar8, virtualSportRulesParams8) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams8;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 8:
                            str4 = "cyber_rules_crystal";
                            final VirtualSportRulesParams virtualSportRulesParams9 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar9 = (uzg) hzgVar;
                            i1w0VarC = uzgVar9.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar9 = uzgVar9.b;
                            fragmentScreen = new FragmentScreen(vqcVar9, virtualSportRulesParams9) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams9;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 9:
                            str4 = "cyber_rules_card_cricket";
                            final VirtualSportRulesParams virtualSportRulesParams10 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar10 = (uzg) hzgVar;
                            i1w0VarC = uzgVar10.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar10 = uzgVar10.b;
                            fragmentScreen = new FragmentScreen(vqcVar10, virtualSportRulesParams10) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams10;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 10:
                            str4 = "cyber_rules_roulette_us";
                            final VirtualSportRulesParams virtualSportRulesParams11 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar11 = (uzg) hzgVar;
                            i1w0VarC = uzgVar11.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar11 = uzgVar11.b;
                            fragmentScreen = new FragmentScreen(vqcVar11, virtualSportRulesParams11) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams11;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 11:
                            str4 = "cyber_rules_roulette_eu";
                            final VirtualSportRulesParams virtualSportRulesParams12 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar12 = (uzg) hzgVar;
                            i1w0VarC = uzgVar12.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar12 = uzgVar12.b;
                            fragmentScreen = new FragmentScreen(vqcVar12, virtualSportRulesParams12) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams12;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 12:
                            str4 = "cyber_rules_sette_e_mezzo_royal_sette_e_mezzo";
                            final VirtualSportRulesParams virtualSportRulesParams13 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar13 = (uzg) hzgVar;
                            i1w0VarC = uzgVar13.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar13 = uzgVar13.b;
                            fragmentScreen = new FragmentScreen(vqcVar13, virtualSportRulesParams13) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams13;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        case 13:
                            str4 = "cyber_rules_sette_e_mezzo_seven_and_a_half";
                            final VirtualSportRulesParams virtualSportRulesParams14 = new VirtualSportRulesParams(j10, str5, str6, str4);
                            uzg uzgVar14 = (uzg) hzgVar;
                            i1w0VarC = uzgVar14.f36533a.c();
                            copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            final vqc vqcVar14 = uzgVar14.b;
                            fragmentScreen = new FragmentScreen(vqcVar14, virtualSportRulesParams14) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ VirtualSportRulesParams f46611a;

                                {
                                    this.f46611a = virtualSportRulesParams14;
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                public final Fragment a(m1r m1rVar) {
                                    m1rVar.getClass();
                                    rsu0.O1.getClass();
                                    rsu0 rsu0Var = new rsu0();
                                    rsu0Var.N1.J(rsu0Var, rsu0.P1[0], this.f46611a);
                                    return rsu0Var;
                                }

                                @Override // a.m7h0
                                /* JADX INFO: renamed from: b */
                                public final String getF46460a() {
                                    return ufx.C(this);
                                }

                                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                                /* JADX INFO: renamed from: g */
                                public final /* bridge */ boolean getB() {
                                    return true;
                                }
                            };
                            if (fragmentScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                            }
                            listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                }
            } else if (hdbVar2 instanceof ddb) {
                ocj ocjVar = this.b;
                ocjVar.getClass();
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    ((jdb) value).getClass();
                    ddb ddbVar = (ddb) hdbVar2;
                    j = ddbVar.f5887a;
                    j2 = ddbVar.b;
                    j3 = ddbVar.c;
                    sff0Var = ddbVar.d;
                    ypl0Var = ddbVar.f;
                    cyberGamesPage = ddbVar.g;
                    i = ddbVar.h;
                    list = ddbVar.e;
                    z = ddbVar.i;
                    str = ddbVar.j;
                    m9sVar = ddbVar.k;
                    list.getClass();
                    cyberGamesPage.getClass();
                } while (!p7m0Var.m(value, new jdb(i, j, j2, j3, m9sVar, sff0Var, ypl0Var, str, list, cyberGamesPage, z)));
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }
}
