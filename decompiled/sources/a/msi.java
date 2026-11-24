package a;

import java.io.File;
import java.util.List;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;
import org.xplatform.statistic.stage.api.domain.TypeStageId;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;

/* JADX INFO: loaded from: classes5.dex */
public final class msi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22321a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ msi(Object obj, int i, byte b) {
        this.f22321a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // a.o5d0
    public final Object get() {
        Object eoj0Var;
        Object wnm0Var;
        Object rtp0Var;
        Object k4s0Var;
        Object kfv0Var;
        byte b = this.f22321a;
        byte b2 = 19;
        byte b3 = 29;
        byte b4 = 0;
        Object obj = this.c;
        boolean z = this.b;
        yje yjeVar = null;
        switch (b) {
            case 0:
                nsi nsiVar = (nsi) obj;
                kt2 kt2Var = nsiVar.f;
                d1p d1pVar = nsiVar.g;
                if (!z) {
                    return new lsi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                gmg0 gmg0Var = nsiVar.f24051a;
                tlg0 tlg0Var = new tlg0(gmg0Var.f11542a, gmg0Var.b, gmg0Var.c, gmg0Var.d, gmg0Var.e);
                nv20 nv20Var = nsiVar.b;
                return new aog0(tlg0Var, nv20Var, ((h6i) nv20Var.f24171a).e(), nsiVar.c, nsiVar.e, new u58(kt2Var, (byte) 2), new ag3(kt2Var, (byte) 7), d1pVar.x(), d1pVar.k0(), new ih5(kt2Var, (byte) 2), d1pVar.C(), d1pVar.D0(), nsiVar.h, nsiVar.j, nsiVar.k, nsiVar.l, nsiVar.m);
            case 1:
                if (!z) {
                    return new cti(this);
                }
                if (z) {
                    return new prc(this, b2);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 2:
                v5i v5iVar = (v5i) obj;
                duj dujVar = (duj) v5iVar.c;
                vqc vqcVar = (vqc) v5iVar.k;
                cad cadVar = (cad) v5iVar.o;
                byte b5 = 25;
                byte b6 = 6;
                if (!z) {
                    ieu ieuVar = new ieu(v5iVar.l(), ((cih) vqcVar.b).a(), b5);
                    e1u e1uVar = new e1u(v5iVar.l(), b6);
                    epi0 epi0Var = new epi0((us00) v5iVar.l, b6);
                    mne mneVarH = ((psc) cadVar.b).h();
                    x1x.x(mneVarH);
                    ugf0 ugf0Var = new ugf0(new zn00(epi0Var, mneVarH));
                    bwl bwlVar = new bwl(v5iVar.l());
                    nek nekVar = new nek();
                    aqt aqtVar = (aqt) v5iVar.m;
                    m1e m1eVar = (m1e) v5iVar.n;
                    mne mneVarH2 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH2);
                    eoj0Var = new eoj0(ieuVar, e1uVar, ugf0Var, bwlVar, nekVar, aqtVar, m1eVar, mneVarH2, (String) v5iVar.p, (File) v5iVar.q, (i1w0) v5iVar.f, dujVar, (ctf0) v5iVar.b, (ocl) v5iVar.r);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    ieu ieuVar2 = new ieu(v5iVar.l(), ((cih) vqcVar.b).a(), b5);
                    e1u e1uVar2 = new e1u(v5iVar.l(), b6);
                    bwl bwlVar2 = new bwl(v5iVar.l());
                    nek nekVar2 = new nek();
                    m1e m1eVar2 = (m1e) v5iVar.n;
                    mne mneVarH3 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH3);
                    eoj0Var = new hoj0(ieuVar2, e1uVar2, bwlVar2, nekVar2, m1eVar2, mneVarH3, (sa10) v5iVar.s, (String) v5iVar.p, (File) v5iVar.q, (i1w0) v5iVar.f, dujVar, (aqt) v5iVar.m);
                }
                return eoj0Var;
            case 3:
                if (!z) {
                    return new mui(this);
                }
                if (z) {
                    return new nui(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 4:
                ru ruVar = (ru) obj;
                sys0 sys0Var = (sys0) ruVar.b;
                if (!z) {
                    wnm0Var = new wnm0((s77) ruVar.f31100a, sys0Var, new wti(new aau(ruVar.v()), (pru) ruVar.d, b3), new aau(ruVar.v()), new b4j((kt2) ruVar.f, (byte) 1), (ctf0) ruVar.e, (au0) ruVar.g);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    wnm0Var = new vyv(sys0Var, new jpc(ruVar.v()), new cnt(ruVar.v()), new mmt(ruVar.v()), new cnt(ruVar.v()), (i1w0) ruVar.h);
                }
                return wnm0Var;
            case 5:
                if (!z) {
                    return new jvi(this);
                }
                if (z) {
                    return new kvi(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 6:
                if (!z) {
                    return new pvi(this, b4);
                }
                if (z) {
                    return new qvi(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 7:
                mwi mwiVar = (mwi) obj;
                pmi0 pmi0Var = mwiVar.m;
                kki kkiVar = mwiVar.p;
                g2v g2vVar = mwiVar.h;
                Long l = mwiVar.b;
                TypeStageId typeStageId = mwiVar.f22504a;
                a0m0 a0m0Var = mwiVar.t;
                gii0 gii0Var = mwiVar.j;
                knf0 knf0Var = mwiVar.k;
                pru pruVar = mwiVar.l;
                cad cadVar2 = mwiVar.f;
                if (z) {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    ehf0 ehf0Var = new ehf0(gii0Var, (byte) 17);
                    mne mneVarH4 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH4);
                    knf0Var.getClass();
                    phf0 phf0Var = new phf0();
                    phf0Var.f26994a = knf0Var;
                    phf0Var.b = ehf0Var;
                    phf0Var.c = mneVarH4;
                    return new jgb(new ivn(phf0Var), mwiVar.w, new eyg0(new lef0(a0m0Var), b2), typeStageId, l.longValue(), mwiVar.e, mwiVar.v, new vjp(pruVar), pruVar, g2vVar, kkiVar, mwiVar.g, mwiVar.i);
                }
                long jLongValue = l.longValue();
                long jLongValue2 = mwiVar.c.longValue();
                long jLongValue3 = mwiVar.d.longValue();
                ctf0 ctf0Var = mwiVar.e;
                mne mneVarH5 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH5);
                i1w0 i1w0Var = mwiVar.g;
                m1e m1eVar3 = mwiVar.i;
                nw20 nw20Var = new nw20(gii0Var, (byte) 28);
                mne mneVarH6 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH6);
                yfu yfuVar = new yfu(new nvu(mneVarH6, nw20Var, knf0Var));
                qzt qztVar = new qzt(pruVar, (byte) 0);
                fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
                uyu uyuVar = mwiVar.n;
                cu cuVarQ = ((daf) pmi0Var.f27236a).q();
                wyu wyuVar = mwiVar.o;
                luu luuVarW = ((daf) mwiVar.q.f35622a).w();
                x1x.x(luuVarW);
                return new w3m0(typeStageId, jLongValue, jLongValue2, jLongValue3, ctf0Var, mneVarH5, i1w0Var, g2vVar, m1eVar3, yfuVar, qztVar, fhjVarR, uyuVar, cuVarQ, wyuVar, kkiVar, luuVarW, mwiVar.r, mwiVar.s, new ljf0(new lef0(a0m0Var)), mwiVar.u, mwiVar.v, new vjp(pruVar));
            case 8:
                kki kkiVar2 = (kki) obj;
                List list = (List) kkiVar2.e;
                if (!z) {
                    return new ujp0(list);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                ctf0 ctf0Var2 = (ctf0) kkiVar2.b;
                mne mneVarH7 = ((psc) ((cad) kkiVar2.c).b).h();
                x1x.x(mneVarH7);
                list.getClass();
                ctf0Var2.getClass();
                return new hjp0(null, new awj(list, (byte) 5), new h0j0(ctf0Var2, (byte) 16), cvm0.p(mneVarH7.c, mneVarH7.f22085a), null);
            case 9:
                v7i v7iVar = (v7i) obj;
                if (!z) {
                    return new qwi(this);
                }
                if (z) {
                    return new iqp0((aqp0) v7iVar.j, new ani0((gii0) v7iVar.k, (byte) 15), (knf0) v7iVar.l);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 10:
                hbi hbiVar = (hbi) obj;
                Integer num = (Integer) hbiVar.w;
                Integer num2 = (Integer) hbiVar.v;
                Long l2 = (Long) hbiVar.u;
                String str = (String) hbiVar.t;
                TypeParam typeParam = (TypeParam) hbiVar.s;
                yo4 yo4Var = (yo4) hbiVar.r;
                g9m0 g9m0Var = (g9m0) hbiVar.p;
                d1p d1pVar2 = (d1p) hbiVar.o;
                ugf0 ugf0Var2 = (ugf0) hbiVar.n;
                u58 u58Var = (u58) hbiVar.m;
                knf0 knf0Var2 = (knf0) hbiVar.l;
                gii0 gii0Var2 = (gii0) hbiVar.k;
                duj dujVar2 = (duj) hbiVar.j;
                uyu uyuVar2 = (uyu) hbiVar.g;
                ocl oclVar = (ocl) hbiVar.f12771a;
                cad cadVar3 = (cad) hbiVar.c;
                pmi0 pmi0Var2 = (pmi0) hbiVar.d;
                if (!z) {
                    i1w0 i1w0Var2 = (i1w0) hbiVar.b;
                    mne mneVarH8 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH8);
                    fhj fhjVarR2 = ((daf) pmi0Var2.f27236a).r();
                    wyu wyuVar2 = (wyu) hbiVar.e;
                    nfm0 nfm0VarA = ((daf) pmi0Var2.f27236a).A();
                    x1x.x(nfm0VarA);
                    weu weuVar = new weu(nfm0VarA, (byte) 0);
                    qzt qztVar2 = (qzt) hbiVar.f;
                    ctf0 ctf0Var3 = (ctf0) hbiVar.h;
                    m1e m1eVar4 = (m1e) hbiVar.i;
                    f7u f7uVarS = ((daf) pmi0Var2.f27236a).s();
                    nfm0 nfm0VarA2 = ((daf) pmi0Var2.f27236a).A();
                    x1x.x(nfm0VarA2);
                    jwu jwuVar = new jwu(nfm0VarA2, (byte) 2);
                    g090 g090Var = new g090(gii0Var2, (byte) 23);
                    mne mneVarH9 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH9);
                    lyu lyuVar = new lyu(new fmp0(mneVarH9, g090Var, knf0Var2));
                    juu juuVarU = ((daf) ugf0Var2.f35622a).u();
                    x1x.x(juuVarU);
                    rtp0Var = new rtp0(i1w0Var2, mneVarH8, fhjVarR2, oclVar, wyuVar2, weuVar, qztVar2, uyuVar2, ctf0Var3, m1eVar4, dujVar2, f7uVarS, jwuVar, lyuVar, u58Var, juuVarU, d1pVar2.W(), new cge0(b3), g9m0Var, (r9u) hbiVar.q, yo4Var, typeParam, str, l2.longValue(), num2.intValue(), num.intValue());
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    i1w0 i1w0Var3 = (i1w0) hbiVar.b;
                    mne mneVarH10 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH10);
                    fhj fhjVarR3 = ((daf) pmi0Var2.f27236a).r();
                    wyu wyuVar3 = (wyu) hbiVar.e;
                    m1e m1eVar5 = (m1e) hbiVar.i;
                    f7u f7uVarS2 = ((daf) pmi0Var2.f27236a).s();
                    g090 g090Var2 = new g090(gii0Var2, (byte) 23);
                    mne mneVarH11 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH11);
                    lyu lyuVar2 = new lyu(new fmp0(mneVarH11, g090Var2, knf0Var2));
                    juu juuVarU2 = ((daf) ugf0Var2.f35622a).u();
                    x1x.x(juuVarU2);
                    rtp0Var = new k5k0(i1w0Var3, mneVarH10, fhjVarR3, oclVar, wyuVar3, uyuVar2, m1eVar5, dujVar2, f7uVarS2, lyuVar2, u58Var, juuVarU2, d1pVar2.W(), (String) hbiVar.x, new cge0(b3), g9m0Var, (r9u) hbiVar.q, yo4Var, ((daf) pmi0Var2.f27236a).y(), (pru) hbiVar.y, typeParam, str, l2.longValue(), num2.intValue(), num.intValue());
                }
                return rtp0Var;
            case 11:
                if (!z) {
                    return new rxi(this);
                }
                if (z) {
                    return new sxi(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 12:
                if (!z) {
                    return new uxi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                hjd hjdVarA = ((vxi) obj).p.a();
                x1x.x(hjdVarA);
                return hjdVarA;
            case 13:
                ywq0 ywq0Var = (ywq0) obj;
                ctf0 ctf0Var4 = (ctf0) ywq0Var.d;
                iw20 iw20Var = (iw20) ywq0Var.f43384a;
                sd80 sd80Var = (sd80) ywq0Var.c;
                gkr0 gkr0Var = (gkr0) ywq0Var.b;
                if (!z) {
                    return new gmr0(((uii) iw20Var.f15470a).r(), new hru(new g090(gkr0Var, sd80Var)), ctf0Var4);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                mne mneVarH12 = ((psc) ((cad) ywq0Var.e).b).h();
                x1x.x(mneVarH12);
                vs10 vs10Var = mneVarH12.c;
                gkr0Var.getClass();
                sd80Var.getClass();
                pru pruVarR = ((uii) iw20Var.f15470a).r();
                ctf0Var4.getClass();
                byte b7 = 22;
                dmr0 dmr0Var = new dmr0(null, new qib(ctf0Var4, pruVarR), new h0j0(ctf0Var4, b7), cvm0.p(vs10Var, mneVarH12.f22085a), null);
                i3t0.L(dmr0Var, new fnq(new i89(gkr0Var.f11458a, b7), new rtq0(dmr0Var, yjeVar, (byte) 2), (byte) 4), vs10Var, null, 2);
                return dmr0Var;
            case 14:
                cr crVar = (cr) obj;
                Long l3 = (Long) crVar.n;
                bzt bztVar = (bzt) crVar.m;
                ytt yttVar = (ytt) crVar.l;
                r2v r2vVar = (r2v) crVar.k;
                zr1 zr1Var = (zr1) crVar.j;
                qu quVar = (qu) crVar.i;
                cad cadVar4 = (cad) crVar.e;
                wsf0 wsf0Var = (wsf0) crVar.d;
                ehf0 ehf0Var2 = (ehf0) crVar.c;
                if (!z) {
                    wdu wduVarA = ((i7i) ehf0Var2.b).a();
                    m0u m0uVarT = ((g45) wsf0Var.b).t();
                    mne mneVarH13 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH13);
                    k4s0Var = new k4s0(wduVarA, m0uVarT, mneVarH13, (s91) crVar.f, ((i7i) ehf0Var2.b).s(), (pru) crVar.b, (oeg0) crVar.g, (ctf0) crVar.h, quVar, zr1Var, r2vVar, yttVar, bztVar, l3.longValue());
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    wdu wduVarA2 = ((i7i) ehf0Var2.b).a();
                    m0u m0uVarT2 = ((g45) wsf0Var.b).t();
                    mne mneVarH14 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH14);
                    k4s0Var = new n6s0(wduVarA2, m0uVarT2, mneVarH14, (s91) crVar.f, ((i7i) ehf0Var2.b).s(), (oeg0) crVar.g, (ctf0) crVar.h, quVar, zr1Var, r2vVar, yttVar, bztVar, l3.longValue(), (String) crVar.o);
                }
                return k4s0Var;
            case 15:
                mai maiVar = (mai) obj;
                roi0 roi0Var = (roi0) maiVar.A;
                pru pruVar2 = (pru) maiVar.k;
                gt5 gt5Var = (gt5) maiVar.c;
                pyg pygVar = (pyg) maiVar.o;
                if (z) {
                    if (z) {
                        return new eat0();
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                UniversalChampParams universalChampParams = (UniversalChampParams) maiVar.l;
                mne mneVarH15 = ((psc) maiVar.f21458a.b).h();
                x1x.x(mneVarH15);
                ctf0 ctf0Var5 = maiVar.g;
                lbu lbuVar = (lbu) maiVar.m;
                j3c j3cVarV = ((iip) maiVar.n).V();
                x1x.x(j3cVarV);
                rtu rtuVar = (rtu) maiVar.d;
                cu cuVarL = pygVar.l();
                x1x.x(cuVarL);
                edu eduVar = new edu(cuVarL, ((cih) ((vqc) maiVar.p).b).a(), b4);
                v7i v7iVarK = ((gbi) ((lsn) maiVar.q).f20589a).k();
                cyu cyuVarK = pygVar.k();
                x1x.x(cyuVarK);
                a7q a7qVar = new a7q(cyuVarK);
                q8u q8uVarA = gt5Var.a();
                x1x.x(q8uVarA);
                gii0 gii0Var3 = maiVar.b;
                drm0 drm0Var = new drm0(gii0Var3, (byte) 5);
                knf0 knf0Var3 = (knf0) maiVar.r;
                pyu pyuVar = new pyu(new fuj0(drm0Var, knf0Var3));
                nw20 nw20Var2 = new nw20(gii0Var3, (byte) 27);
                ugf0 ugf0Var3 = new ugf0();
                vby vbyVar = (vby) maiVar.s;
                nc0 nc0Var = new nc0(pruVar2, j3cVarV, rtuVar, eduVar, v7iVarK, a7qVar, q8uVarA, pyuVar, new b8u(new z220(nw20Var2, ugf0Var3, knf0Var3, vbyVar)), new uyn(new epi0((eat0) maiVar.j.get())), (pmi) maiVar.t, new rpt(new khf0(new xex(gii0Var3, (byte) 14), new yk50((byte) 16), vbyVar)), new svu(new y3v(new laj((byte) 2), new do20(gii0Var3, (byte) 14), knf0Var3)), new pmi0(new epi0((eat0) maiVar.j.get())));
                luu luuVarW2 = ((daf) ((ugf0) maiVar.u).f35622a).w();
                x1x.x(luuVarW2);
                y78 y78Var = (y78) maiVar.v;
                svu svuVarA = ((xri) maiVar.w).a();
                x1x.x(svuVarA);
                r9u r9uVar = (r9u) maiVar.x;
                hzg hzgVarA = pygVar.a();
                x1x.x(hzgVarA);
                hjd hjdVarA2 = ((itr) maiVar.y).a();
                x1x.x(hjdVarA2);
                wiu wiuVar = (wiu) maiVar.z;
                i1w0 i1w0Var4 = maiVar.e;
                pv00 pv00VarT = ((daf) roi0Var.f30839a).t();
                gr00 gr00VarS = ((gr00) ((rrc) maiVar.B).b).s();
                zfm0 zfm0VarZ = ((daf) roi0Var.f30839a).Z();
                pyg0 pyg0VarY = gt5Var.y();
                x1x.x(pyg0VarY);
                qyg0 qyg0VarV = gt5Var.v();
                x1x.x(qyg0VarV);
                return new jdt0(pruVar2, universalChampParams, mneVarH15, ctf0Var5, lbuVar, nc0Var, luuVarW2, y78Var, svuVarA, r9uVar, hzgVarA, hjdVarA2, wiuVar, i1w0Var4, pv00VarT, gr00VarS, zfm0VarZ, pyg0VarY, qyg0VarV, (grj) maiVar.C, pygVar.i(), new pmi0(new epi0((eat0) maiVar.j.get())), (g2v) maiVar.D, (poq0) maiVar.E, maiVar.h, new ih5((kt2) maiVar.F, (byte) 1), (zr1) maiVar.f);
            case 16:
                cr crVar2 = (cr) obj;
                knf0 knf0Var4 = (knf0) crVar2.o;
                gii0 gii0Var4 = (gii0) crVar2.n;
                pmi pmiVar = (pmi) crVar2.m;
                roi0 roi0Var2 = (roi0) crVar2.i;
                if (z) {
                    if (z) {
                        return new eat0();
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                UniversalChampResultsParams universalChampResultsParams = (UniversalChampResultsParams) crVar2.c;
                mne mneVarH16 = ((psc) ((cad) crVar2.d).b).h();
                x1x.x(mneVarH16);
                g2v g2vVar2 = (g2v) crVar2.e;
                wiu wiuVar2 = (wiu) crVar2.f;
                ctf0 ctf0Var6 = (ctf0) crVar2.g;
                hzg hzgVarA2 = ((pyg) crVar2.h).a();
                x1x.x(hzgVarA2);
                return new wbt0(universalChampResultsParams, mneVarH16, g2vVar2, wiuVar2, ctf0Var6, hzgVarA2, ((daf) roi0Var2.f30839a).t(), (i1w0) crVar2.j, ((gr00) ((rrc) crVar2.k).b).s(), ((daf) roi0Var2.f30839a).Z(), (m1e) crVar2.l, new y3v(new uyn(new epi0((eat0) ((n5d0) crVar2.q).get())), pmiVar, new svu(new y3v(new laj((byte) 2), new do20(gii0Var4, (byte) 14), knf0Var4)), b4), new zpu(pmiVar, new svu(new y3v(new laj((byte) 2), new do20(gii0Var4, (byte) 14), knf0Var4))), new pmi0(new epi0((eat0) ((n5d0) crVar2.q).get())), ((xzp) ((epi0) crVar2.p).b).C(), (pru) crVar2.b);
            case 17:
                if (!z) {
                    return new ryi(this);
                }
                if (z) {
                    return new k1u0(new afm0(((syi) obj).i, (byte) 14));
                }
                c99.h(z ? 1 : 0);
                return null;
            case 18:
                szi sziVar = (szi) obj;
                lbu lbuVar2 = sziVar.c;
                cad cadVar5 = sziVar.f33072a;
                pfv0 pfv0Var = sziVar.b;
                byte b8 = 12;
                if (!z) {
                    mne mneVarH17 = ((psc) cadVar5.b).h();
                    x1x.x(mneVarH17);
                    kfv0Var = new kfv0(mneVarH17, new xsu(new ikt0(pfv0Var)), new owp0(new ikt0(pfv0Var), b8), lbuVar2, sziVar.d, sziVar.e);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    mne mneVarH18 = ((psc) cadVar5.b).h();
                    x1x.x(mneVarH18);
                    kfv0Var = new mgv0(mneVarH18, new owp0(new ikt0(pfv0Var), b8), lbuVar2, sziVar.d, sziVar.f, sziVar.e);
                }
                return kfv0Var;
            default:
                daf dafVar = (daf) obj;
                cad cadVar6 = (cad) dafVar.e;
                if (!z) {
                    g2v g2vVar3 = new g2v((klv0) ((n5d0) dafVar.l).get());
                    m1e m1eVar6 = (m1e) dafVar.f;
                    mne mneVarH19 = ((psc) cadVar6.b).h();
                    x1x.x(mneVarH19);
                    return new qnv0(g2vVar3, m1eVar6, mneVarH19, (i1w0) dafVar.g, (duj) dafVar.h, (String) dafVar.i, ((Long) dafVar.j).longValue(), (ocl) dafVar.k, (ctf0) dafVar.b, new rl70());
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                zlt0 zlt0Var = new zlt0((gii0) dafVar.c, (byte) 7);
                knf0 knf0Var5 = (knf0) dafVar.d;
                mne mneVarH20 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH20);
                return new klv0(zlt0Var, knf0Var5, mneVarH20);
        }
    }
}
