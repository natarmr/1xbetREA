package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.cyber.section.api.meta_heroes.presentation.MetaHeroesParams;
import org.xplatform.rules.impl.presentation.models.PaymentInfoParams;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class gji implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11397a;
    public final boolean b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gji(Object obj, int i, byte b) {
        this.f11397a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // a.o5d0
    public final Object get() {
        Object uw50Var;
        Object wu50Var;
        Object s690Var;
        Object umg0Var;
        Object t4e0Var;
        byte b = this.f11397a;
        Object obj = this.c;
        boolean z = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                mii0 mii0Var = (mii0) obj;
                g8i g8iVar = (g8i) mii0Var.b;
                if (!z) {
                    return new fji(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                jru jruVarF = mii0Var.F();
                m0u m0uVarT = ((g45) g8iVar.f0().b).t();
                m1e m1eVarQ1 = g8iVar.q1();
                x1x.x(m1eVarQ1);
                uyn uynVarV4 = g8iVar.v4();
                i1w0 i1w0Var = (i1w0) mii0Var.c;
                mne mneVarV1 = g8iVar.v1();
                duj dujVarD2 = g8iVar.d2();
                abu abuVar = new abu(g8iVar.f0(), new ort(g8iVar.Qa(), (byte) 3), (byte) 19);
                wsf0 wsf0VarF0 = g8iVar.f0();
                pbt pbtVarL2 = g8iVar.L2();
                x1x.x(pbtVarL2);
                return new f8y(jruVarF, m0uVarT, m1eVarQ1, uynVarV4, i1w0Var, mneVarV1, dujVarD2, abuVar, wsf0VarF0, new kyg0(pbtVarL2), g8iVar.c2(), new n4u(g8iVar.f5(), (byte) 18));
            case 1:
                gbi gbiVar = (gbi) obj;
                pru pruVar = (pru) gbiVar.l;
                pmi0 pmi0Var = (pmi0) gbiVar.k;
                if (z) {
                    if (z) {
                        return new izy();
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                String str = (String) gbiVar.f11016a;
                long jLongValue = ((Long) gbiVar.c).longValue();
                int iIntValue = ((Integer) gbiVar.d).intValue();
                n3q n3qVar = (n3q) gbiVar.e;
                ctf0 ctf0Var = (ctf0) gbiVar.f;
                mne mneVarH = ((psc) ((cad) gbiVar.g).b).h();
                x1x.x(mneVarH);
                i1w0 i1w0Var2 = (i1w0) gbiVar.h;
                ocl oclVar = (ocl) gbiVar.i;
                m1e m1eVar = (m1e) gbiVar.j;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                jwu jwuVar = new jwu(nfm0VarA, (byte) 2);
                f7u f7uVarS = ((daf) pmi0Var.f27236a).s();
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                return new u1z(str, jLongValue, iIntValue, n3qVar, ctf0Var, mneVarH, i1w0Var2, oclVar, m1eVar, jwuVar, f7uVarS, new weu(nfm0VarA2, (byte) 0), new qzt(pruVar, (byte) 0), ((daf) pmi0Var.f27236a).r(), (uyu) gbiVar.m, (wyu) gbiVar.n, new bzu(gbiVar.E(), (byte) 5), new xfu(gbiVar.E()), new vjp(pruVar), ((daf) ((roi0) gbiVar.q).f30839a).Z(), (r9u) gbiVar.r);
            case 2:
                xzp xzpVar = (xzp) obj;
                if (!z) {
                    return euw.m((jyz) xzpVar.f41764a, (c200) ((n5d0) xzpVar.f).get(), (btt0) xzpVar.c, (knf0) xzpVar.d, (us00) xzpVar.e);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                gii0 gii0Var = (gii0) xzpVar.b;
                gii0Var.getClass();
                return new c200(gii0Var);
            case 3:
                rrd rrdVar = (rrd) obj;
                if (z) {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    gii0 gii0Var2 = (gii0) rrdVar.c;
                    gii0Var2.getClass();
                    return new f400(gii0Var2);
                }
                wsz wszVar = (wsz) rrdVar.b;
                f400 f400Var = (f400) ((n5d0) rrdVar.h).get();
                btt0 btt0Var = (btt0) rrdVar.d;
                e400 e400Var = (e400) rrdVar.e;
                mne mneVarH2 = ((psc) ((cad) rrdVar.f).b).h();
                x1x.x(mneVarH2);
                return euw.q(wszVar, f400Var, btt0Var, e400Var, mneVarH2, (kuy) rrdVar.g);
            case 4:
                if (!z) {
                    return new bki(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                ehf0 ehf0Var = new ehf0(((cki) obj).h, (byte) 27);
                qud qudVar = new qud();
                maz.a(wez.b, new x3h((byte) 0));
                return new m4h(ehf0Var, qudVar);
            case 5:
                f6i f6iVar = (f6i) obj;
                d1p d1pVar = (d1p) f6iVar.o;
                if (z) {
                    if (z) {
                        return new y6j0((q7d0) f6iVar.g, (v1j0) f6iVar.h);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                jh70 jh70Var = (jh70) f6iVar.e;
                poq0 poq0Var = (poq0) f6iVar.b;
                i1w0 i1w0Var3 = (i1w0) f6iVar.f;
                dpi0 dpi0Var = new dpi0((y6j0) ((n5d0) f6iVar.d).get());
                phf0 phf0Var = new phf0(new peg0((y6j0) ((n5d0) f6iVar.d).get()), (pru) f6iVar.i, (e1u) f6iVar.j);
                iqt iqtVar = new iqt((gst0) f6iVar.k);
                mne mneVarH3 = ((psc) ((cad) f6iVar.l).b).h();
                x1x.x(mneVarH3);
                return new l020(jh70Var, poq0Var, i1w0Var3, dpi0Var, phf0Var, iqtVar, mneVarH3, (qho) f6iVar.m, (duj) f6iVar.n, d1pVar.H0(), new zg((kt2) f6iVar.p, (byte) 9), (s31) f6iVar.q, d1pVar.r0(), (ieu) f6iVar.r, new ivn((peg0) f6iVar.s), (dzt) f6iVar.t, (ctf0) f6iVar.c);
            case 6:
                if (!z) {
                    return new xki(this);
                }
                if (z) {
                    return new ya20();
                }
                c99.h(z ? 1 : 0);
                return null;
            case 7:
                nli nliVar = (nli) obj;
                tnc0 tnc0Var = nliVar.b;
                g8i g8iVar2 = nliVar.f23729a;
                if (!z) {
                    return new dki(this, b2);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                j910 j910Var = new j910(new b8u(nliVar.a()), g8iVar2.Oa(), (byte) 4);
                onv onvVar = new onv(nliVar.a());
                iw20 iw20Var = new iw20(nliVar.a());
                sqt sqtVar = new sqt();
                mne mneVarV2 = g8iVar2.v1();
                duj dujVarD3 = g8iVar2.d2();
                tpx tpxVar = new tpx(tnc0Var, (byte) 1);
                m1e m1eVarQ2 = g8iVar2.q1();
                x1x.x(m1eVarQ2);
                return new ns30(j910Var, onvVar, iw20Var, sqtVar, mneVarV2, dujVarD3, tpxVar, m1eVarQ2, new wsf0(tnc0Var), new ljf0(tnc0Var));
            case 8:
                sli sliVar = (sli) obj;
                if (z) {
                    if (z) {
                        return new vb40();
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                i1w0 i1w0Var4 = sliVar.f32399a;
                MetaHeroesParams metaHeroesParams = sliVar.b;
                mne mneVarH4 = ((psc) sliVar.c.b).h();
                x1x.x(mneVarH4);
                m1e m1eVar2 = sliVar.d;
                z220 z220VarA = sliVar.a();
                uzc uzcVar = sliVar.g;
                gst0 gst0Var = sliVar.h;
                cyu cyuVar = new cyu(new dgu(z220VarA, uzcVar, gst0Var, new rtu(sliVar.i, new x4v(gst0Var, (byte) 0))), sliVar.j, new n4u(sliVar.a(), (byte) 14));
                g2v g2vVar = sliVar.k;
                ctf0 ctf0Var2 = sliVar.l;
                hzg hzgVarA = sliVar.m.a();
                x1x.x(hzgVarA);
                return new bd40(i1w0Var4, metaHeroesParams, mneVarH4, m1eVar2, cyuVar, g2vVar, ctf0Var2, hzgVarA, sliVar.n, new p4u(sliVar.a()), sliVar.o);
            case 9:
                if (!z) {
                    return new sx40((rx40) ((n5d0) ((chf0) obj).b).get());
                }
                if (z) {
                    return new rx40();
                }
                c99.h(z ? 1 : 0);
                return null;
            case 10:
                gbi gbiVar2 = (gbi) obj;
                wv70 wv70Var = (wv70) gbiVar2.m;
                i1w0 i1w0Var5 = (i1w0) gbiVar2.i;
                cad cadVar = (cad) gbiVar2.b;
                duj dujVar = (duj) gbiVar2.j;
                x20 x20Var = (x20) gbiVar2.g;
                yo4 yo4Var = (yo4) gbiVar2.f;
                qu quVar = (qu) gbiVar2.c;
                pru pruVar2 = (pru) gbiVar2.l;
                iw20 iw20Var2 = (iw20) gbiVar2.f11016a;
                if (!z) {
                    ws5 ws5Var = (ws5) iw20Var2.f15470a;
                    mne mneVarH5 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH5);
                    uw50Var = new uw50(ws5Var, mneVarH5, quVar, (zrt) gbiVar2.d, (lyt) gbiVar2.e, yo4Var, x20Var, (m1e) gbiVar2.h, i1w0Var5, dujVar, (sa10) gbiVar2.k, pruVar2, wv70Var);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    ws5 ws5Var2 = (ws5) iw20Var2.f15470a;
                    nyt nytVar = (nyt) gbiVar2.n;
                    dst dstVar = (dst) gbiVar2.o;
                    bzt bztVar = (bzt) gbiVar2.p;
                    m1e m1eVar3 = (m1e) gbiVar2.h;
                    mne mneVarH6 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH6);
                    uw50Var = new sq50(ws5Var2, nytVar, dstVar, pruVar2, bztVar, quVar, yo4Var, x20Var, m1eVar3, dujVar, mneVarH6, (ctf0) gbiVar2.q, i1w0Var5, wv70Var);
                }
                return uw50Var;
            case 11:
                yli yliVar = (yli) obj;
                grj grjVar = yliVar.q;
                mne mneVar = yliVar.o;
                duj dujVar2 = yliVar.m;
                if (!z) {
                    wu50Var = new wu50(yliVar.f42843a.intValue(), yliVar.b.intValue(), yliVar.c.intValue(), yliVar.d.booleanValue(), yliVar.e, yliVar.f, yliVar.g, yliVar.h, yliVar.i, yliVar.j, yliVar.k, yliVar.l, dujVar2, yliVar.n, mneVar, yliVar.p, grjVar, yliVar.r, yliVar.s, yliVar.t);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    wu50Var = new qxc(yliVar.u, dujVar2, yliVar.n, mneVar, yliVar.p, yliVar.v, yliVar.w, yliVar.x, grjVar);
                }
                return wu50Var;
            case 12:
                if (!z) {
                    return new umi(this);
                }
                if (z) {
                    return new vmi(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 13:
                v9i v9iVar = (v9i) obj;
                pru pruVar3 = (pru) v9iVar.t;
                n4u n4uVar = (n4u) v9iVar.n;
                ntu ntuVar = (ntu) v9iVar.m;
                peg0 peg0Var = (peg0) v9iVar.k;
                duj dujVar3 = (duj) v9iVar.r;
                mne mneVar2 = (mne) v9iVar.j;
                pmi pmiVar = (pmi) v9iVar.h;
                ort ortVar = (ort) v9iVar.c;
                hru hruVar = (hru) v9iVar.g;
                if (!z) {
                    s690Var = new s690((hse0) v9iVar.f, hruVar, ortVar, pmiVar, (b8u) v9iVar.i, new jh70(), (i1w0) v9iVar.q, (sa10) v9iVar.s, v9iVar.b, mneVar2, dujVar3, ((m73) peg0Var.b).b(), (j1q0) v9iVar.l, ntuVar, n4uVar, v9iVar.e, (grj) v9iVar.o, (wgu) v9iVar.p, pruVar3);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    s690Var = new j790((hse0) v9iVar.f, hruVar, ortVar, pmiVar, (i1w0) v9iVar.q, (g2v) v9iVar.d, v9iVar.b, mneVar2, dujVar3, ((m73) peg0Var.b).b(), (j1q0) v9iVar.l, ntuVar, n4uVar, (wgu) v9iVar.p, pruVar3);
                }
                return s690Var;
            case 14:
                uii uiiVar = (uii) obj;
                if (!z) {
                    return new r990((r9u) uiiVar.f35730a);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                nh70 nh70Var = new nh70();
                mne mneVarH7 = ((psc) ((cad) uiiVar.b).b).h();
                x1x.x(mneVarH7);
                return new q990(nh70Var, mneVarH7, (knf0) uiiVar.c, (btt0) uiiVar.d);
            case 15:
                o3c o3cVar = (o3c) obj;
                cad cadVar2 = (cad) o3cVar.c;
                ntu ntuVar2 = (ntu) o3cVar.i;
                PaymentInfoParams paymentInfoParams = (PaymentInfoParams) o3cVar.f24576a;
                if (!z) {
                    bdu bduVar = new bdu(new sqt(new rl70()), ntuVar2);
                    m1e m1eVar4 = (m1e) o3cVar.b;
                    mne mneVarH8 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH8);
                    umg0Var = new umg0(paymentInfoParams, bduVar, m1eVar4, mneVarH8, (j1q0) o3cVar.d, (oeg0) o3cVar.e);
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    bdu bduVar2 = new bdu(new sqt(new rl70()), ntuVar2);
                    m1e m1eVar5 = (m1e) o3cVar.b;
                    mne mneVarH9 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH9);
                    umg0Var = new j890(paymentInfoParams, bduVar2, m1eVar5, mneVarH9, (j1q0) o3cVar.d, (oeg0) o3cVar.e, (ocl) o3cVar.f);
                }
                return umg0Var;
            case 16:
                ru ruVar = (ru) obj;
                if (!z) {
                    return new aoi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                nw20 nw20Var = new nw20((gii0) ruVar.f31100a, (byte) 11);
                knf0 knf0Var = (knf0) ruVar.b;
                kuy kuyVar = (kuy) ruVar.c;
                mne mneVarH10 = ((psc) ((cad) ruVar.d).b).h();
                x1x.x(mneVarH10);
                return new kz90(nw20Var, knf0Var, kuyVar, mneVarH10);
            case 17:
                boi boiVar = (boi) obj;
                cad cadVar3 = boiVar.f2934a;
                if (z) {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    mne mneVarH11 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH11);
                    return new zz90(mneVarH11, new dq00(boiVar.b, (byte) 15), new sbx0((byte) 9), boiVar.c);
                }
                xfu xfuVar = new xfu((zz90) boiVar.j.get());
                iwt iwtVar = new iwt((zz90) boiVar.j.get(), (byte) 1);
                iwt iwtVar2 = new iwt((zz90) boiVar.j.get(), (byte) 0);
                u1u u1uVar = new u1u((zz90) boiVar.j.get(), (byte) 0);
                u1u u1uVar2 = new u1u((zz90) boiVar.j.get(), (byte) 1);
                qyu qyuVar = new qyu((zz90) boiVar.j.get(), (byte) 0);
                qyu qyuVar2 = new qyu((zz90) boiVar.j.get(), (byte) 1);
                ocl oclVar2 = boiVar.d;
                String str2 = boiVar.e;
                duj dujVar4 = boiVar.f;
                i1w0 i1w0Var6 = boiVar.g;
                ctf0 ctf0Var3 = boiVar.h;
                m1e m1eVar6 = boiVar.i;
                mne mneVarH12 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH12);
                return new r0a0(xfuVar, iwtVar, iwtVar2, u1uVar, u1uVar2, qyuVar, qyuVar2, oclVar2, str2, dujVar4, i1w0Var6, ctf0Var3, m1eVar6, mneVarH12);
            case 18:
                h6i h6iVar = (h6i) obj;
                gii0 gii0Var3 = (gii0) h6iVar.g;
                cad cadVar4 = (cad) h6iVar.j;
                if (!z) {
                    return new foi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                String str3 = (String) h6iVar.d;
                nv20 nv20Var = new nv20(gii0Var3, (byte) 9);
                knf0 knf0Var2 = (knf0) h6iVar.h;
                bca0 bca0Var = (bca0) h6iVar.i;
                mne mneVarH13 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH13);
                n4u n4uVar2 = new n4u(new w5z(nv20Var, knf0Var2, bca0Var, mneVarH13, (kuy) h6iVar.k), (byte) 26);
                nv20 nv20Var2 = new nv20(gii0Var3, (byte) 9);
                knf0 knf0Var3 = (knf0) h6iVar.h;
                bca0 bca0Var2 = (bca0) h6iVar.i;
                mne mneVarH14 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH14);
                clc clcVar = new clc(new w5z(nv20Var2, knf0Var3, bca0Var2, mneVarH14, (kuy) h6iVar.k), (byte) 6);
                i1w0 i1w0Var7 = (i1w0) h6iVar.l;
                m1e m1eVar7 = (m1e) h6iVar.e;
                mne mneVarH15 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH15);
                return new iha0(str3, n4uVar2, clcVar, i1w0Var7, m1eVar7, mneVarH15, (ocl) h6iVar.o, (duj) h6iVar.m);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hoi hoiVar = (hoi) obj;
                if (!z) {
                    return new adn((f430) hoiVar.e.get(), new onv(hoiVar.f13395a, (byte) 23), hoiVar.b, hoiVar.c);
                }
                if (z) {
                    return new f430();
                }
                c99.h(z ? 1 : 0);
                return null;
            case 20:
                if (!z) {
                    return new noi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                hjd hjdVarA = ((ooi) obj).q.a();
                x1x.x(hjdVarA);
                return hjdVarA;
            case 21:
                if (!z) {
                    return new kpi(this);
                }
                if (z) {
                    return new lpi(this);
                }
                c99.h(z ? 1 : 0);
                return null;
            case 22:
                ru ruVar2 = (ru) obj;
                mne mneVar3 = (mne) ruVar2.f31100a;
                if (!z) {
                    return new r6d0(new bzu((m6d0) ((n5d0) ruVar2.i).get()), (euc) ruVar2.b, (pv00) ruVar2.e, (i1w0) ruVar2.f, new ljf0((m6d0) ((n5d0) ruVar2.i).get()), new f4u((m6d0) ((n5d0) ruVar2.i).get()), mneVar3, (s31) ruVar2.g, ((d1p) ruVar2.h).r0());
                }
                if (z) {
                    return new m6d0(new l6d0((euc) ruVar2.b, (azj0) ruVar2.c, mneVar3, ohs0.n(((ntu) ruVar2.d).a(), "/status.json")));
                }
                c99.h(z ? 1 : 0);
                return null;
            case 23:
                if (!z) {
                    return new xqi(this);
                }
                if (z) {
                    return new xvd0(new nw20(((yqi) obj).f, (byte) 17));
                }
                c99.h(z ? 1 : 0);
                return null;
            case 24:
                if (!z) {
                    return new zqi(this);
                }
                if (z) {
                    return new xvd0(new nw20(((ari) obj).i, (byte) 17));
                }
                c99.h(z ? 1 : 0);
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cr crVar = (cr) obj;
                pmi0 pmi0Var2 = (pmi0) crVar.m;
                ocl oclVar3 = (ocl) crVar.k;
                cad cadVar5 = (cad) crVar.d;
                RatingStatisticScreenParams ratingStatisticScreenParams = (RatingStatisticScreenParams) crVar.c;
                if (!z) {
                    mne mneVarH16 = ((psc) cadVar5.b).h();
                    x1x.x(mneVarH16);
                    t4e0Var = new t4e0(ratingStatisticScreenParams, mneVarH16, (m1e) crVar.e, (i1w0) crVar.f, new b8u(new uiu(crVar.e()), new sek()), (duj) crVar.j, oclVar3, new cmt(new sek(), new y4u(crVar.e())), new xsu(crVar.e()), new ddk(), new eyg0(crVar.e(), (byte) 3));
                } else {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    ctf0 ctf0Var4 = (ctf0) crVar.l;
                    mne mneVarH17 = ((psc) cadVar5.b).h();
                    x1x.x(mneVarH17);
                    qzt qztVar = new qzt((pru) crVar.b, (byte) 0);
                    fhj fhjVarR = ((daf) pmi0Var2.f27236a).r();
                    luu luuVarW = ((daf) ((ugf0) crVar.n).f35622a).w();
                    x1x.x(luuVarW);
                    t4e0Var = new x8e0(ratingStatisticScreenParams, ctf0Var4, mneVarH17, oclVar3, qztVar, fhjVarR, luuVarW, ((daf) pmi0Var2.f27236a).x(), (wyu) crVar.o, (i1w0) crVar.f, (m1e) crVar.e, new edu(new xsu(crVar.e()), new uiu(crVar.e()), (byte) 8), new clc(crVar.e(), (byte) 7), new y4u(crVar.e()), (r9u) crVar.r);
                }
                return t4e0Var;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                v8i v8iVar = (v8i) obj;
                kt2 kt2Var = (kt2) v8iVar.l;
                duj dujVar5 = (duj) v8iVar.p;
                iqt iqtVar2 = (iqt) v8iVar.o;
                pru pruVar4 = (pru) v8iVar.k;
                x2c0 x2c0Var = (x2c0) v8iVar.i;
                gii0 gii0Var4 = v8iVar.b;
                ehf0 ehf0Var2 = (ehf0) v8iVar.g;
                if (z) {
                    if (z) {
                        return new pw70((oeg0) v8iVar.m, new jdk0(), (ytt) v8iVar.n);
                    }
                    c99.h(z ? 1 : 0);
                    return null;
                }
                long jLongValue2 = ((Long) v8iVar.f).longValue();
                soc socVarW = ((i7i) ehf0Var2.b).w();
                btt0 btt0Var2 = (btt0) v8iVar.h;
                new efe0(new xzp(gii0Var4, x2c0Var), btt0Var2);
                new ife0(new xzp(gii0Var4, x2c0Var), btt0Var2);
                knf0 knf0Var4 = v8iVar.c;
                xzp xzpVar2 = new xzp(gii0Var4, x2c0Var);
                btt0 btt0Var3 = (btt0) v8iVar.h;
                knf0Var4.getClass();
                btt0Var3.getClass();
                kd30 kd30Var = new kd30();
                kd30Var.f18086a = xzpVar2;
                kd30Var.b = btt0Var3;
                nv20 nv20Var3 = new nv20(kd30Var);
                ntu ntuVar3 = (ntu) v8iVar.j;
                cyu cyuVar2 = new cyu();
                cyuVar2.f5196a = nv20Var3;
                cyuVar2.c = ntuVar3;
                cyuVar2.b = pruVar4;
                pw70 pw70Var = (pw70) ((n5d0) v8iVar.B).get();
                ctf0 ctf0Var5 = (ctf0) v8iVar.e;
                ali aliVarF = ((i7i) ehf0Var2.b).f();
                mne mneVarH18 = ((psc) v8iVar.f36984a.b).h();
                x1x.x(mneVarH18);
                eyg0 eyg0VarI = ((rrc) ((wsf0) v8iVar.r).b).I();
                m1e m1eVar8 = (m1e) v8iVar.s;
                kc60 kc60Var = new kc60(v8iVar.d);
                bzt bztVar2 = (bzt) v8iVar.t;
                dmt dmtVar = (dmt) v8iVar.u;
                oeg0 oeg0Var = (oeg0) v8iVar.m;
                ctf0 ctf0Var6 = (ctf0) v8iVar.e;
                ih5 ih5Var = new ih5(kt2Var, (byte) 2);
                l7k l7kVar = (l7k) v8iVar.v;
                gg5 gg5Var = (gg5) v8iVar.w;
                v88 v88Var = (v88) v8iVar.x;
                ih5 ih5Var2 = new ih5(kt2Var, (byte) 0);
                wsf0 wsf0Var = (wsf0) v8iVar.q;
                g45 g45Var = (g45) wsf0Var.b;
                return new wfe0(jLongValue2, socVarW, cyuVar2, pw70Var, ctf0Var5, aliVarF, iqtVar2, dujVar5, mneVarH18, eyg0VarI, m1eVar8, kc60Var, bztVar2, pruVar4, dmtVar, new kb0(dujVar5, oeg0Var, ctf0Var6, ih5Var, l7kVar, gg5Var, v88Var, ih5Var2, g45Var.y(), g45Var.Q(), g45Var.Y(), iqtVar2, g45Var.G(), wsf0Var.s(), ((i7i) ehf0Var2.b).e()), new u58(kt2Var, (byte) 3), (ix0) v8iVar.y, (oeg0) v8iVar.m, (s91) v8iVar.z, ((i7i) ehf0Var2.b).m(), (cmt) v8iVar.A);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                daf dafVar = (daf) obj;
                cad cadVar6 = (cad) dafVar.b;
                if (z) {
                    if (!z) {
                        c99.h(z ? 1 : 0);
                        return null;
                    }
                    gii0 gii0Var5 = (gii0) dafVar.c;
                    gii0Var5.getClass();
                    return new sle0(gii0Var5);
                }
                mne mneVarH19 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH19);
                sle0 sle0Var = (sle0) ((n5d0) dafVar.l).get();
                knf0 knf0Var5 = (knf0) dafVar.d;
                kuy kuyVar2 = (kuy) dafVar.e;
                sle0Var.getClass();
                knf0Var5.getClass();
                kuyVar2.getClass();
                n660 n660Var = new n660();
                n660Var.f22981a = mneVarH19;
                n660Var.b = sle0Var;
                n660Var.c = knf0Var5;
                n660Var.d = kuyVar2;
                f4u f4uVar = new f4u(n660Var, (byte) 29);
                ocl oclVar4 = (ocl) dafVar.f;
                ctf0 ctf0Var7 = (ctf0) dafVar.g;
                m1e m1eVar9 = (m1e) dafVar.h;
                String str4 = (String) dafVar.i;
                duj dujVar6 = (duj) dafVar.j;
                i1w0 i1w0Var8 = (i1w0) dafVar.k;
                mne mneVarH20 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH20);
                return new gme0(f4uVar, oclVar4, ctf0Var7, m1eVar9, str4, dujVar6, i1w0Var8, mneVarH20);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (!z) {
                    return new dsi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                nmb nmbVar = new nmb();
                q7m0.a(xun.f41520a);
                return nmbVar;
            default:
                if (!z) {
                    return new jsi(this);
                }
                if (!z) {
                    c99.h(z ? 1 : 0);
                    return null;
                }
                o8g0 o8g0Var = new o8g0();
                q7m0.a("");
                q7m0.a(iun.f15405a);
                return o8g0Var;
        }
    }
}
