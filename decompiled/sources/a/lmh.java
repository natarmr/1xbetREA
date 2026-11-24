package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.tournament_bracket.CyberTournamentBracketParams;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;

/* JADX INFO: loaded from: classes4.dex */
public final class lmh extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final CyberTournamentBracketParams o;
    public final mne p;
    public final hzg q;
    public final oeg0 r;
    public final a7q s;
    public final reu t;
    public final ctf0 u;
    public final m1e v;
    public bby w;
    public c4m0 x;
    public c4m0 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmh(CyberTournamentBracketParams cyberTournamentBracketParams, mne mneVar, hzg hzgVar, oeg0 oeg0Var, a7q a7qVar, reu reuVar, ctf0 ctf0Var, g2v g2vVar, m1e m1eVar) {
        super(new bmh((byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), new o20(ctf0Var, g2vVar, (byte) 5), (yzn0) null);
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = cyberTournamentBracketParams;
        this.p = mneVar;
        this.q = hzgVar;
        this.r = oeg0Var;
        this.s = a7qVar;
        this.t = reuVar;
        this.u = ctf0Var;
        this.v = m1eVar;
    }

    public final void M() {
        bby bbyVar = this.w;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.w = sac.V(jiu0.a(this), new hfg(this, (byte) 21), null, this.p.b, new ya(this, null, (byte) 20), 10);
    }

    public final void N() {
        CyberTournamentBracketParams cyberTournamentBracketParams = this.o;
        String str = cyberTournamentBracketParams.b;
        long j = cyberTournamentBracketParams.c;
        long j2 = cyberTournamentBracketParams.d;
        uzg uzgVar = (uzg) this.q;
        uzgVar.getClass();
        str.getClass();
        uzgVar.f36533a.c().d(new jzg(uzgVar, str, j, j2, (byte) 2));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        fmh fmhVar;
        List list;
        Object value3;
        fmh fmhVar2;
        List list2;
        sih sihVar = (sih) obj;
        sihVar.getClass();
        super.x(sihVar);
        yje yjeVar = null;
        if (sihVar instanceof pih) {
            e3c.n(this.y);
            fnq fnqVar = new fnq(i120.W(this.v.b()), new igb((Object) this, yjeVar, (byte) 25), (byte) 4);
            bvc bvcVarA = jiu0.a(this);
            mne mneVar = this.p;
            sje sjeVarS = d5c.S(bvcVarA, mneVar.f22085a);
            foe foeVar = foe.h;
            this.y = sac.T(fnqVar, sjeVarS, foeVar);
            c4m0 c4m0Var = this.x;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            this.x = sac.T(new fnq(this.s.a(40L, 46L), new e9g(this, yjeVar, (byte) 9), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foeVar);
            return;
        }
        if (sihVar instanceof oih) {
            bby bbyVar = this.w;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            c4m0 c4m0Var2 = this.x;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            e3c.n(this.y);
            return;
        }
        if (sihVar.equals(lih.f20105a)) {
            ((uzg) this.q).a();
            return;
        }
        if (sihVar.equals(nih.f23587a)) {
            M();
            return;
        }
        boolean z = sihVar instanceof mih;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        oeg0 oeg0Var = this.r;
        ctf0 ctf0Var = this.u;
        if (z) {
            mih mihVar = (mih) sihVar;
            String str = mihVar.f21846a;
            String str2 = mihVar.b;
            if (str2.length() == 0 || str.length() == 0) {
                return;
            }
            boolean z2 = Intrinsics.d(((fmh) D()).c.f28933a, str2) && Intrinsics.d(((fmh) D()).c.b, str);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                fmhVar2 = (fmh) value3;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, fmh.a(fmhVar2, null, null, new qlh(z2 ? null : str2, z2 ? null : str), null, 23)));
            j0g0 j0g0Var = ((fmh) D()).b;
            if (j0g0Var != null) {
                Object obj2 = j0g0Var.f15681a;
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                list2 = (List) obj2;
            } else {
                list2 = null;
            }
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            CyberTournamentBracketMatchParams cyberTournamentBracketMatchParamsU = zjb.u((rkh) CollectionsKt.firstOrNull(list2), str, ctf0Var);
            if (cyberTournamentBracketMatchParamsU == null || z2) {
                return;
            }
            i1w0 i1w0VarC = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new c1w0(new kkh(cyberTournamentBracketMatchParamsU), null)), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(sihVar instanceof rih)) {
                if (!(sihVar instanceof qih)) {
                    t9f.b();
                    return;
                }
                int i = ((qih) sihVar).f28792a;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, fmh.a((fmh) value, null, null, null, Integer.valueOf(i), 15)));
                return;
            }
            String str3 = ((rih) sihVar).f30543a;
            if (str3.length() == 0) {
                return;
            }
            boolean zD = Intrinsics.d(((fmh) D()).c.b, str3);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                fmhVar = (fmh) value2;
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, fmh.a(fmhVar, null, null, new qlh(null, zD ? null : str3), null, 23)));
            j0g0 j0g0Var2 = ((fmh) D()).b;
            if (j0g0Var2 != null) {
                Object obj3 = j0g0Var2.f15681a;
                if (obj3 instanceof g0g0) {
                    obj3 = null;
                }
                list = (List) obj3;
            } else {
                list = null;
            }
            if (list == null) {
                list = iun.f15405a;
            }
            CyberTournamentBracketMatchParams cyberTournamentBracketMatchParamsU2 = zjb.u((rkh) CollectionsKt.firstOrNull(list), str3, ctf0Var);
            if (cyberTournamentBracketMatchParamsU2 == null || zD) {
                return;
            }
            i1w0 i1w0VarC2 = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new c1w0(new kkh(cyberTournamentBracketMatchParamsU2), null)), i1w0VarC2, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
