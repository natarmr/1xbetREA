package a;

import android.javax.sip.message.Response;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class lib implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20095a = 1;
    public final Object b;
    public final n0o0 c;
    public final n0o0 d;
    public final Object e;
    public final Object f;

    public lib(qxc0 qxc0Var, g2v g2vVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = g2vVar;
        this.c = bkb.H(Boolean.valueOf(qxc0Var.f29477a));
        this.d = bkb.H(Boolean.valueOf(qxc0Var.c));
        this.e = bkb.H(Boolean.valueOf(qxc0Var.b));
        pz40 pz40Var = s6t0.f31722a;
        this.f = new gd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.news_promo, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }

    public static mdm a(long j, g2v g2vVar) {
        return g2v.b(g2vVar, ozb.L(j, pb10.v), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        a4x a4xVarO0;
        rtu0 ptu0Var;
        byte b = this.f20095a;
        Object obj2 = this.f;
        mdm mdmVarB = null;
        mdm mdmVarB2 = null;
        mdm mdmVarB3 = null;
        Object obj3 = this.b;
        Object obj4 = this.e;
        n0o0 n0o0Var = this.c;
        n0o0 n0o0Var2 = this.d;
        switch (b) {
            case 0:
                g2v g2vVar = (g2v) obj3;
                kib kibVar = (kib) obj;
                fd50 fd50Var = (fd50) obj2;
                kibVar.getClass();
                ((fee) n0o0Var.getValue()).d(Boolean.valueOf(kibVar.f18328a));
                ((fee) n0o0Var2.getValue()).d(kibVar.c);
                ((fee) ((n0o0) obj4).getValue()).d(Boolean.valueOf(kibVar.b));
                int iOrdinal = ((vhb) ((fee) n0o0Var2.getValue()).c()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        mdmVarB = g2v.b(g2vVar, pb10.g, pdm.f26814a, ldm.f19857a, 0, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 984);
                    } else {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        mdmVarB = g2v.b(g2vVar, pb10.g, pdm.f26814a, ldm.f19857a, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.BUSY_EVERYWHERE);
                    }
                }
                if (((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
                    return new oib(fd50Var);
                }
                return mdmVarB != null ? new nib(fd50Var, mdmVarB) : new mib(fd50Var);
            case 1:
                egg eggVar = (egg) obj;
                g2v g2vVar2 = (g2v) obj3;
                eggVar.getClass();
                ((fee) n0o0Var.getValue()).d(eggVar);
                ((fee) n0o0Var2.getValue()).d(eggVar);
                boolean z = eggVar.f;
                vdg vdgVar = eggVar.d;
                if (z) {
                    egg eggVar2 = (egg) obj4;
                    v5l0 v5l0Var = eggVar2.g.g.y;
                    boolean z2 = eggVar2.h;
                    ArrayList arrayList = new ArrayList(5);
                    for (int i = 0; i < 5; i++) {
                        arrayList.add(new agg(twn.m(i, "RESULTS_SHIMMER"), pzw.I(v5l0Var), z2));
                    }
                    a4xVarO0 = dyb.o0(arrayList);
                } else {
                    a4xVarO0 = vdgVar != null ? dyb.o0((Iterable) ((fee) n0o0Var2.getValue()).b()) : lak0.c;
                }
                return new fgg((tfg) ((fee) n0o0Var.getValue()).b(), (vdgVar != null || z) ? a4xVarO0.isEmpty() ? new vfg(g2v.b(g2vVar2, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.currently_no_events, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)) : ufg.f35575a : new vfg(g2v.b(g2vVar2, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)), a4xVarO0, z);
            case 2:
                lf10 lf10Var = (lf10) obj;
                lf10Var.getClass();
                ((fee) n0o0Var.getValue()).d(lf10Var.f19931a);
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(lf10Var.g));
                n0o0 n0o0Var3 = (n0o0) obj4;
                ((fee) n0o0Var3.getValue()).d(lf10Var.d);
                return new mf10((imm) ((fee) n0o0Var.getValue()).e.getValue(), (se10) ((fee) n0o0Var3.getValue()).e.getValue(), ((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue());
            case 3:
                g2v g2vVar3 = (g2v) obj3;
                xwc0 xwc0Var = (xwc0) obj;
                hd50 hd50Var = (hd50) obj2;
                xwc0Var.getClass();
                ((fee) n0o0Var.getValue()).d(Boolean.valueOf(xwc0Var.f41604a));
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(xwc0Var.c));
                n0o0 n0o0Var4 = (n0o0) obj4;
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(xwc0Var.b));
                if (((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue()) {
                    mdmVarB3 = g2v.b(g2vVar3, pb10.g, null, null, 0, 0, R.string.page_not_found_error, 0, R.string.news_catalog, 0L, 0L, 862);
                } else if (!((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue()) {
                    mdmVarB3 = g2v.b(g2vVar3, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
                    return new axc0(hd50Var);
                }
                return mdmVarB3 != null ? new zwc0(hd50Var, mdmVarB3) : new ywc0(hd50Var);
            case 4:
                g2v g2vVar4 = (g2v) obj3;
                qxc0 qxc0Var = (qxc0) obj;
                gd50 gd50Var = (gd50) obj2;
                qxc0Var.getClass();
                ((fee) n0o0Var.getValue()).d(Boolean.valueOf(qxc0Var.f29477a));
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(qxc0Var.c));
                n0o0 n0o0Var5 = (n0o0) obj4;
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(qxc0Var.b));
                if (((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue()) {
                    mdmVarB2 = g2v.b(g2vVar4, pb10.g, null, null, 0, 0, R.string.page_not_found_error, 0, R.string.news_catalog, 0L, 0L, 862);
                } else if (!((Boolean) ((fee) n0o0Var5.getValue()).c()).booleanValue()) {
                    mdmVarB2 = g2v.b(g2vVar4, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
                    return new txc0(gd50Var);
                }
                return mdmVarB2 != null ? new sxc0(gd50Var, mdmVarB2) : new rxc0(gd50Var);
            case 5:
                txm0 txm0Var = (txm0) obj;
                txm0Var.getClass();
                ((fee) n0o0Var.getValue()).d(txm0Var.c);
                fee feeVar = (fee) n0o0Var2.getValue();
                List list = txm0Var.f34708a;
                feeVar.d(list);
                nxm0 nxm0Var = nxm0.f24290a;
                if (list == null) {
                    return new vxm0(nxm0Var, lak0.c);
                }
                List list2 = (List) ((fee) n0o0Var2.getValue()).b();
                return list2.isEmpty() ? new vxm0(new oxm0(g2v.b((g2v) obj3, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)), lak0.c) : new vxm0(nxm0Var, dyb.o0(list2));
            default:
                wtu0 wtu0Var = (wtu0) obj;
                wtu0Var.getClass();
                imm immVar = (imm) ((fee) n0o0Var.getValue()).b();
                VirtualSportRulesParams virtualSportRulesParams = ((wtu0) obj4).b;
                g2v g2vVar5 = (g2v) obj3;
                j0g0 j0g0Var = wtu0Var.d;
                if (j0g0Var == null && !wtu0Var.f39761a) {
                    ptu0Var = new ptu0(a(virtualSportRulesParams.f46567a, g2vVar5));
                } else if (j0g0Var == null) {
                    ptu0Var = qtu0.f29316a;
                } else if (j0g0Var.f15681a instanceof g0g0) {
                    ptu0Var = new ptu0(a(virtualSportRulesParams.f46567a, g2vVar5));
                } else {
                    ((fee) n0o0Var2.getValue()).d(wtu0Var);
                    stu0 stu0Var = (stu0) ((fee) n0o0Var2.getValue()).b();
                    a4x a4xVar = stu0Var != null ? stu0Var.d : null;
                    ptu0Var = (a4xVar == null || a4xVar.isEmpty()) ? new ptu0(a(virtualSportRulesParams.f46567a, g2vVar5)) : new otu0(stu0Var);
                }
                return new ytu0(immVar, ptu0Var);
        }
    }

    public lib(txm0 txm0Var, g2v g2vVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.e = txm0Var;
        this.b = g2vVar;
        this.f = ctf0Var;
        this.c = bkb.H(txm0Var.c);
        this.d = maz.b(new yw9(txm0Var.f34708a, new j1l0(this, (byte) 16), (byte) 20));
    }

    public lib(wtu0 wtu0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.e = wtu0Var;
        this.f = ctf0Var;
        this.b = g2vVar;
        this.c = maz.b(new yw9(null, new caz(this, (byte) 29), (byte) 20));
        this.d = maz.b(new yw9(wtu0Var, new npt0(this, (byte) 18), (byte) 20));
    }

    public lib(kib kibVar, g2v g2vVar) {
        this.b = g2vVar;
        this.c = bkb.H(Boolean.valueOf(kibVar.f18328a));
        this.d = bkb.H(kibVar.c);
        this.e = bkb.H(Boolean.valueOf(kibVar.b));
        pz40 pz40Var = s6t0.f31722a;
        this.f = new fd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(kibVar.f, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }

    public lib(egg eggVar, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.e = eggVar;
        this.f = ctf0Var;
        this.b = g2vVar;
        this.c = maz.b(new yw9(eggVar, new vlf((byte) 18), (byte) 20));
        this.d = maz.b(new yw9(eggVar, new hfg(this, (byte) 2), (byte) 20));
    }

    public lib(xwc0 xwc0Var, g2v g2vVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = g2vVar;
        this.c = bkb.H(Boolean.valueOf(xwc0Var.f41604a));
        this.d = bkb.H(Boolean.valueOf(xwc0Var.c));
        this.e = bkb.H(Boolean.valueOf(xwc0Var.b));
        pz40 pz40Var = s6t0.f31722a;
        this.f = new hd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.news_promo, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }

    public lib(lf10 lf10Var, ctf0 ctf0Var, DecimalFormat decimalFormat) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.f = decimalFormat;
        this.c = maz.b(new yw9(lf10Var.f19931a, new p610((byte) 7), (byte) 20));
        this.d = bkb.H(Boolean.valueOf(lf10Var.g));
        this.e = maz.b(new yw9(lf10Var.d, new u400(this, lf10Var, (byte) 16), (byte) 20));
    }
}
