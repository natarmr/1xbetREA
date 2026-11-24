package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class vqg extends w46 {
    public final ivn A;
    public final c4m0 B;
    public bby C;
    public final ol60 D;
    public dqg E;
    public final List F;
    public da10 G;
    public final p7m0 H;
    public final p7m0 I;
    public final p7m0 J;
    public final p7m0 K;
    public final p7m0 L;
    public final n0o0 M;
    public final n0o0 N;
    public List O;
    public List P;
    public final CyberGameStatisticScreenParams b;
    public final duj c;
    public final hzg d;
    public final m1e e;
    public final String f;
    public final mne g;
    public final pzu h;
    public final ctf0 i;
    public final int j;
    public final nvu k;
    public final g2v l;
    public final j3c m;
    public final pru n;
    public final svu o;
    public final luu p;
    public final dwu q;
    public final oeg0 r;
    public final h3c s;
    public final r9u t;
    public final qgh u;
    public final ih5 v;
    public final zr1 w;
    public final hqc x;
    public final lbu y;
    public final hcp0 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.ArrayList] */
    public vqg(vzg0 vzg0Var, CyberGameStatisticScreenParams cyberGameStatisticScreenParams, duj dujVar, hzg hzgVar, m1e m1eVar, String str, mne mneVar, pzu pzuVar, ctf0 ctf0Var, int i, nvu nvuVar, g2v g2vVar, j3c j3cVar, pru pruVar, svu svuVar, luu luuVar, dwu dwuVar, oeg0 oeg0Var, h3c h3cVar, r9u r9uVar, qgh qghVar, ih5 ih5Var, zr1 zr1Var, hqc hqcVar, lbu lbuVar, hcp0 hcp0Var, ivn ivnVar) {
        ?? arrayList;
        m1eVar.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        r9uVar.getClass();
        this.b = cyberGameStatisticScreenParams;
        this.c = dujVar;
        this.d = hzgVar;
        this.e = m1eVar;
        this.f = str;
        this.g = mneVar;
        this.h = pzuVar;
        this.i = ctf0Var;
        this.j = i;
        this.k = nvuVar;
        this.l = g2vVar;
        this.m = j3cVar;
        this.n = pruVar;
        this.o = svuVar;
        this.p = luuVar;
        this.q = dwuVar;
        this.r = oeg0Var;
        this.s = h3cVar;
        this.t = r9uVar;
        this.u = qghVar;
        this.v = ih5Var;
        this.w = zr1Var;
        this.x = hqcVar;
        this.y = lbuVar;
        this.z = hcp0Var;
        this.A = ivnVar;
        this.D = new ol60(3);
        long j = cyberGameStatisticScreenParams.b;
        if (j == 46) {
            c0o c0oVar = rqf.c;
            arrayList = new ArrayList(r3d.q(c0oVar, 10));
            Iterator it = c0oVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((rqf) it.next()).f30928a);
            }
        } else if (j == 1) {
            c0o c0oVar2 = h6l.c;
            arrayList = new ArrayList(r3d.q(c0oVar2, 10));
            Iterator it2 = c0oVar2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((h6l) it2.next()).f12534a);
            }
        } else {
            arrayList = iun.f15405a;
        }
        this.F = arrayList;
        this.G = da10.DEFAULT_ERROR;
        this.H = q7m0.a(Integer.valueOf(this.b.c));
        this.I = q7m0.a(nch.f23293a);
        final byte b = 0;
        this.J = q7m0.a(new cqr("", R.color.static_transparent, false));
        o4i0 o4i0Var = new o4i0("", "");
        iun iunVar = iun.f15405a;
        this.K = q7m0.a(new wmm0(15L, 0L, 5L, 24L, 21L, 30L, o4i0Var, new hyx(1L, iunVar), 1L, iunVar));
        final byte b2 = 1;
        this.L = q7m0.a(new lpg(true, true));
        this.M = maz.b(new Function0(this) { // from class: a.lqg
            public final /* synthetic */ vqg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                vqg vqgVar = this.b;
                switch (b3) {
                    case 0:
                        return new fnq(vqgVar.q.a(vqgVar.F, dam0.b), new e9g(vqgVar, null, (byte) 7), (byte) 4);
                    default:
                        return vqgVar.x.a();
                }
            }
        });
        this.N = maz.b(new Function0(this) { // from class: a.lqg
            public final /* synthetic */ vqg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                vqg vqgVar = this.b;
                switch (b3) {
                    case 0:
                        return new fnq(vqgVar.q.a(vqgVar.F, dam0.b), new e9g(vqgVar, null, (byte) 7), (byte) 4);
                    default:
                        return vqgVar.x.a();
                }
            }
        });
        this.O = iunVar;
        this.P = iunVar;
        c4m0 c4m0Var = this.B;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.B = slb.U(new fnq(this.e.b(), new sqg(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), this.g.f22085a));
        }
        sac.V(jiu0.a(this), rqg.f30929a, null, this.g.f22085a, new sqg(this, yjeVar, b), 10);
        qjj.W(jiu0.a(this), null, null, new sqg(this, yjeVar, (byte) 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        if (a.slb.N(r0, r8) == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(a.zje r25) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vqg.A(a.zje):java.lang.Object");
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = wpg.f39543a;
        String str = this.f;
        str.getClass();
        wpg.f39543a.remove(str);
    }

    public final void w() {
        bby bbyVar = this.C;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.C = sac.V(jiu0.a(this), new mqg(this, (byte) 0), null, this.g.b, new fr9(this, null, (byte) 14), 10);
        }
    }

    public final void x(long j, String str) {
        CyberGameStatisticScreenParams cyberGameStatisticScreenParams;
        Object next;
        boolean zContains = this.n.a().c.p.contains(Long.valueOf(j));
        Iterator it = this.p.f20692a.a().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cyberGameStatisticScreenParams = this.b;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            lok0 lok0Var = (lok0) next;
            if (lok0Var.f20396a == cyberGameStatisticScreenParams.d && lok0Var.t.contains(1)) {
                break;
            }
        }
        lok0 lok0Var2 = (lok0) next;
        hzg hzgVar = this.d;
        if (zContains) {
            ((uzg) hzgVar).g();
            return;
        }
        if (lok0Var2 != null) {
            ((uzg) hzgVar).o(lok0Var2.f20396a, lok0Var2.b);
        } else {
            long j2 = cyberGameStatisticScreenParams.b;
            byte b = CyberGamesPage.Real.INSTANCE.f46556a;
            k1g k1gVar = k1g.OPEN_REGULAR;
            ((uzg) hzgVar).f(str, j2, j, b);
        }
    }

    public final void y(long j) {
        Object next;
        String str;
        Iterator it = this.P.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f2h) next).b != j);
        f2h f2hVar = (f2h) next;
        if (f2hVar == null || (str = f2hVar.c) == null) {
            return;
        }
        List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it2 = listJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((yxg) it2.next()).f43419a));
        }
        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = this.b;
        long j2 = cyberGameStatisticScreenParams.b;
        long j3 = cyberGameStatisticScreenParams.b;
        if (arrayList.contains(Long.valueOf(j2)) && j != 0) {
            this.v.p(r1g.CYBERSPORT_POSTMATCH_STATISTIC, j3);
            this.w.z(j3, "сyber_postmatch_statistics");
            ((uzg) this.d).n(cyberGameStatisticScreenParams.b, j, str, k1g.OPEN_REGULAR);
        } else if (arrayList.contains(Long.valueOf(j3)) && j == 0) {
            this.D.f(new pqg(R.string.snackbar_no_info_for_selected_team));
        }
    }

    public final void z() {
        mch mchVar = new mch(g2v.d(this.l, ozb.J(this.b.b, pb10.v), null, ikm.b, R.string.data_retrieval_error, R.string.try_again_text, null, 346), this.G.f5727a);
        p7m0 p7m0Var = this.I;
        p7m0Var.getClass();
        p7m0Var.o(null, mchVar);
        this.G = da10.DEFAULT_ERROR;
    }
}
