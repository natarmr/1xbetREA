package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final class yei implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42487a;
    public final Object b;

    public /* synthetic */ yei(Object obj, byte b) {
        this.f42487a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f42487a;
        byte b2 = 26;
        Object obj = this.b;
        switch (b) {
            case 0:
                zei zeiVar = (zei) obj;
                mne mneVarH = ((psc) zeiVar.f44253a.b).h();
                x1x.x(mneVarH);
                return new wjh(mneVarH, zeiVar.b, zeiVar.c, zeiVar.d, zeiVar.e, zeiVar.f);
            case 1:
                cr crVar = (cr) obj;
                ctf0 ctf0Var = (ctf0) crVar.c;
                qzt qztVar = (qzt) crVar.d;
                pmi0 pmi0Var = (pmi0) crVar.e;
                fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
                xr xrVar = new xr((gii0) crVar.f, (byte) 26);
                knf0 knf0Var = (knf0) crVar.g;
                cad cadVar = (cad) crVar.h;
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                knf0Var.getClass();
                phf0 phf0Var = new phf0();
                phf0Var.f26994a = xrVar;
                phf0Var.b = knf0Var;
                phf0Var.c = mneVarH2;
                cmt cmtVar = new cmt(phf0Var, (byte) 19);
                wyu wyuVar = (wyu) crVar.i;
                String str = (String) crVar.j;
                long jLongValue = ((Long) crVar.k).longValue();
                i1w0 i1w0Var = (i1w0) crVar.l;
                duj dujVar = (duj) crVar.m;
                m1e m1eVar = (m1e) crVar.n;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                zqu zquVar = new zqu(nfm0VarA, (byte) 1);
                ieu ieuVarY = ((daf) pmi0Var.f27236a).y();
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                do20 do20Var = new do20(nfm0VarA2);
                ocl oclVar = (ocl) crVar.o;
                cge0 cge0Var = new cge0((byte) 29);
                mne mneVarH3 = ((psc) cadVar.b).h();
                x1x.x(mneVarH3);
                return new dvh(ctf0Var, qztVar, fhjVarR, cmtVar, wyuVar, str, jLongValue, i1w0Var, dujVar, m1eVar, zquVar, ieuVarY, do20Var, oclVar, cge0Var, mneVarH3, (uyu) crVar.p, (pru) crVar.b, (r9u) crVar.r);
            case 2:
                return new afi(this);
            case 3:
                lhf0 lhf0Var = (lhf0) obj;
                ctf0 ctf0Var2 = (ctf0) lhf0Var.b;
                mne mneVarH4 = ((psc) ((cad) lhf0Var.c).b).h();
                x1x.x(mneVarH4);
                ctf0Var2.getClass();
                return new p5j(new owd(ctf0Var2, (byte) 1), cvm0.p(mneVarH4.c, mneVarH4.f22085a), new ep4(ctf0Var2, b2), null);
            case 4:
                o3c o3cVar = (o3c) obj;
                ctf0 ctf0Var3 = (ctf0) o3cVar.f24576a;
                h4u h4uVar = new h4u(new roi0((q7d0) o3cVar.b));
                duj dujVar2 = (duj) o3cVar.c;
                mne mneVarH5 = ((psc) ((cad) o3cVar.d).b).h();
                x1x.x(mneVarH5);
                return new u1j(ctf0Var3, h4uVar, dujVar2, mneVarH5, new crt(o3cVar.b()), new rpt(o3cVar.b()), (b4j) o3cVar.i, (je) o3cVar.j, new crt(o3cVar.b()));
            case 5:
                esg0 esg0Var = (esg0) obj;
                jru jruVar = new jru(new psc((odj) esg0Var.f8326a), (byte) 4);
                mne mneVarH6 = ((psc) ((cad) esg0Var.b).b).h();
                x1x.x(mneVarH6);
                return new v0w(jruVar, mneVarH6, ((Boolean) esg0Var.c).booleanValue(), ((Boolean) esg0Var.d).booleanValue(), (duj) esg0Var.e);
            case 6:
                esg0 esg0Var2 = (esg0) obj;
                i1w0 i1w0Var2 = (i1w0) esg0Var2.f8326a;
                ouu ouuVar = (ouu) esg0Var2.b;
                sue sueVar = (sue) esg0Var2.c;
                znt zntVarN = sueVar.n();
                x1x.x(zntVarN);
                gbi gbiVarJ = sueVar.j();
                x1x.x(gbiVarJ);
                return new xgj(i1w0Var2, ouuVar, zntVarN, gbiVarJ, (mne) esg0Var2.d, (ctf0) esg0Var2.e);
            case 7:
                return new cfi(this);
            case 8:
                return new gfi(this);
            case 9:
                return new hfi(this);
            case 10:
                return new ifi(this);
            case 11:
                return new jfi(this);
            case 12:
                return new kfi(this);
            case 13:
                return new lfi(this);
            case 14:
                return new sfi(this);
            case 15:
                return new vfi(this);
            case 16:
                esg0 esg0Var3 = (esg0) obj;
                mne mneVarH7 = ((psc) ((cad) esg0Var3.f8326a).b).h();
                x1x.x(mneVarH7);
                ctf0 ctf0Var4 = (ctf0) esg0Var3.b;
                wdn wdnVar = (wdn) esg0Var3.c;
                ioi ioiVar = (ioi) esg0Var3.d;
                ien ienVarB = ioiVar.b();
                x1x.x(ienVarB);
                g7u g7uVar = new g7u(ienVarB);
                ien ienVarB2 = ioiVar.b();
                x1x.x(ienVarB2);
                ibu ibuVar = new ibu(ienVarB2);
                ien ienVarB3 = ioiVar.b();
                x1x.x(ienVarB3);
                hbu hbuVar = new hbu(ienVarB3);
                ien ienVarB4 = ioiVar.b();
                x1x.x(ienVarB4);
                r7v r7vVar = new r7v(ienVarB4);
                ien ienVarB5 = ioiVar.b();
                x1x.x(ienVarB5);
                ibu ibuVar2 = new ibu(ienVarB5);
                x4u x4uVarP = ((pcl0) esg0Var3.e).P();
                x1x.x(x4uVarP);
                return new ccn(mneVarH7, ctf0Var4, wdnVar, g7uVar, ibuVar, hbuVar, r7vVar, ibuVar2, x4uVarP);
            case 17:
                dbi dbiVar = (dbi) obj;
                long jLongValue2 = ((Long) dbiVar.f5805a).longValue();
                i1w0 i1w0Var3 = (i1w0) dbiVar.b;
                ouu ouuVar2 = (ouu) dbiVar.c;
                m1e m1eVar2 = (m1e) dbiVar.d;
                pq pqVar = new pq(dbiVar.f());
                a8u a8uVar = new a8u(dbiVar.f());
                n4u n4uVar = new n4u((edo) dbiVar.h);
                j1q0 j1q0Var = (j1q0) dbiVar.i;
                xfu xfuVar = new xfu(j1q0Var);
                yiu yiuVar = new yiu(j1q0Var, (byte) 0);
                b8u b8uVar = (b8u) dbiVar.j;
                iw20 iw20Var = (iw20) dbiVar.k;
                rrd rrdVar = new rrd((Object) a8uVar, (Object) n4uVar, (Object) xfuVar, (Object) yiuVar, (Object) b8uVar, (Object) ((uii) iw20Var.f15470a).r(), (Object) new yyt(((cih) ((vqc) dbiVar.l).b).a()), (Object) new ocl(dbiVar.c()), (byte) 25);
                mne mneVarH8 = ((psc) ((cad) dbiVar.n).b).h();
                x1x.x(mneVarH8);
                kt2 kt2Var = (kt2) dbiVar.o;
                b4j b4jVar = new b4j(kt2Var, (byte) 1);
                d1p d1pVar = (d1p) dbiVar.p;
                x20 x20VarF = d1pVar.F();
                ag3 ag3Var = new ag3(kt2Var, (byte) 3);
                ik4 ik4VarH0 = d1pVar.h0();
                pru pruVarR = ((uii) iw20Var.f15470a).r();
                fht0 fht0Var = new fht0(dbiVar.c(), dbiVar.e(), new dqc(dbiVar.g()), new do20(dbiVar.g()));
                ctf0 ctf0Var5 = (ctf0) dbiVar.s;
                duj dujVar3 = (duj) dbiVar.t;
                cmt cmtVar2 = new cmt(dbiVar.c(), (byte) 14);
                drm0 drm0Var = (drm0) dbiVar.u;
                rxu rxuVarI = ((ali) drm0Var.f6568a).i();
                reu reuVarJ = ((ali) drm0Var.f6568a).j();
                reu reuVar = new reu(dbiVar.e(), (byte) 16);
                ocl oclVar2 = new ocl(dbiVar.c());
                fht0 fht0VarE = ((sue) dbiVar.v).e();
                gst0 gst0Var = (gst0) dbiVar.w;
                ort ortVar = new ort(gst0Var, (byte) 3);
                pq pqVar2 = new pq(dbiVar.f());
                a7q a7qVar = new a7q(dbiVar.c());
                oif0 oif0Var = new oif0(dbiVar.f(), dbiVar.e(), dbiVar.c(), (byte) 23);
                ocl oclVar3 = new ocl(dbiVar.c());
                pru pruVarR2 = ((uii) iw20Var.f15470a).r();
                vqc vqcVarC = dbiVar.c();
                es esVarF = dbiVar.f();
                bwl bwlVarE = dbiVar.e();
                j1q0Var.getClass();
                h0q0 h0q0Var = new h0q0();
                h0q0Var.f12247a = vqcVarC;
                h0q0Var.b = esVarF;
                h0q0Var.c = bwlVarE;
                h0q0Var.d = j1q0Var;
                zas0 zas0Var = new zas0(dbiVar.f(), (byte) 6);
                dpi0 dpi0Var = new dpi0(dbiVar.e());
                epi0 epi0Var = (epi0) dbiVar.x;
                qv2 qv2Var = new qv2(fht0VarE, ortVar, pqVar2, a7qVar, oif0Var, oclVar3, pruVarR2, h0q0Var, zas0Var, dpi0Var, ((xzp) epi0Var.b).C(), new psc((Object) dbiVar.g(), (byte) 29), new dqc(dbiVar.g()));
                p4a p4aVar = new p4a(dbiVar.f(), dbiVar.c());
                edu eduVar = new edu((Object) dbiVar.f(), (Object) dbiVar.c(), (byte) 23);
                p4a p4aVar2 = new p4a(dbiVar.f(), dbiVar.c());
                bzt bztVar = new bzt((fsd) dbiVar.y);
                r9u r9uVarC = ((xzp) epi0Var.b).C();
                xkn xknVar = (xkn) dbiVar.z;
                eyg0 eyg0Var = new eyg0(new rrc(xknVar), (byte) 11);
                c5k c5kVar = new c5k(dbiVar.f(), dbiVar.c());
                o2j0 o2j0Var = (o2j0) dbiVar.A;
                vyt vytVarA = o2j0Var.a();
                pmi0 pmi0VarD = o2j0Var.d();
                x1x.x(pmi0VarD);
                return new wnn(jLongValue2, i1w0Var3, ouuVar2, m1eVar2, pqVar, rrdVar, mneVarH8, b4jVar, x20VarF, ag3Var, ik4VarH0, pruVarR, fht0Var, ctf0Var5, dujVar3, cmtVar2, rxuVarI, reuVarJ, reuVar, oclVar2, qv2Var, p4aVar, eduVar, p4aVar2, bztVar, r9uVarC, eyg0Var, c5kVar, vytVarA, pmi0VarD, new bwl(dbiVar.e()), new ouu((Object) dbiVar.e(), (Object) new dqc(dbiVar.g()), (Object) new do20(dbiVar.g()), (byte) 21), new p4u(dbiVar.g()), new sd60(new ocl(dbiVar.c()), ((ali) drm0Var.f6568a).k(), ((g45) ((wsf0) dbiVar.B).b).q(), (x0u) dbiVar.C, new rou((b3c0) dbiVar.D, (byte) 0), new ugf0(dbiVar.g()), new pq(dbiVar.f()), new ljf0(dbiVar.c()), (byte) 12), new dqc(dbiVar.g()), new tzi(new ocl(dbiVar.c()), ((o3c) ((bzu) dbiVar.E).b).j(), (rpt) dbiVar.F, new pq(dbiVar.f()), new oif0(dbiVar.f(), dbiVar.e(), dbiVar.c(), (byte) 23), new x1u(gst0Var, (byte) 1), o2j0Var.a(), ((uii) iw20Var.f15470a).r(), new eyg0(new rrc(xknVar), (byte) 11), new c5k(dbiVar.f(), dbiVar.c()), (byte) 13), new dqc(dbiVar.g()), new n4u(dbiVar.f(), (byte) 16), new lsn(new bbw0((qp) dbiVar.G)), (mii0) dbiVar.H, d1pVar.Z());
            case 18:
                o9i o9iVar = (o9i) obj;
                long jLongValue3 = ((Long) o9iVar.o).longValue();
                boolean zBooleanValue = ((Boolean) o9iVar.r).booleanValue();
                long jLongValue4 = ((Long) o9iVar.i).longValue();
                i1w0 i1w0Var4 = (i1w0) o9iVar.v;
                mne mneVarH9 = ((psc) ((cad) o9iVar.d).b).h();
                x1x.x(mneVarH9);
                ctf0 ctf0Var6 = (ctf0) o9iVar.b;
                rtu rtuVar = (rtu) o9iVar.t;
                ieu ieuVar = (ieu) o9iVar.j;
                ap80 ap80Var = (ap80) o9iVar.u;
                knf0 knf0Var2 = (knf0) o9iVar.w;
                cu cuVar = new cu(ap80Var, knf0Var2, new vqc((gii0) o9iVar.p, (byte) 29));
                cih cihVar = (cih) ((vqc) o9iVar.e).b;
                u8u u8uVar = new u8u((Object) cuVar, (Object) cihVar.a(), (byte) 2);
                pru pruVar = (pru) o9iVar.k;
                yyt yytVar = new yyt(cihVar.a());
                wgu wguVar = new wgu((yox) o9iVar.h);
                v7i v7iVarK = ((gbi) ((lsn) o9iVar.f).f20589a).k();
                pq pqVar3 = new pq(o9iVar.a());
                a8u a8uVar2 = new a8u(o9iVar.a());
                pq pqVar4 = new pq(o9iVar.a());
                jw20 jw20Var = (jw20) o9iVar.g;
                nku nkuVarI = ((kki) jw20Var.b).i();
                x1x.x(nkuVarI);
                g45 g45Var = new g45();
                g45Var.f10647a = u8uVar;
                g45Var.b = pruVar;
                g45Var.c = yytVar;
                g45Var.d = wguVar;
                g45Var.e = v7iVarK;
                g45Var.f = pqVar3;
                g45Var.g = a8uVar2;
                g45Var.h = pqVar4;
                g45Var.i = nkuVarI;
                npx npxVar = new npx(o9iVar.a());
                kt2 kt2Var2 = (kt2) o9iVar.y;
                ag3 ag3Var2 = new ag3(kt2Var2, (byte) 3);
                duj dujVar4 = o9iVar.f24881a;
                d1p d1pVar2 = (d1p) o9iVar.z;
                ik4 ik4VarH1 = d1pVar2.h0();
                lbu lbuVar = (lbu) o9iVar.s;
                edu eduVarA = ((u9x0) ((pv00) o9iVar.A).f27640a).a();
                r9u r9uVarC2 = ((xzp) ((epi0) o9iVar.B).b).C();
                m1e m1eVar3 = (m1e) o9iVar.c;
                pq pqVar5 = new pq(o9iVar.a());
                eu90 eu90VarT = ((kki) jw20Var.b).t();
                x1x.x(eu90VarT);
                return new mpn(jLongValue3, zBooleanValue, jLongValue4, i1w0Var4, mneVarH9, ctf0Var6, rtuVar, ieuVar, g45Var, npxVar, ag3Var2, dujVar4, ik4VarH1, lbuVar, eduVarA, r9uVarC2, m1eVar3, pqVar5, eu90VarT, (ort) o9iVar.l, new bzt((fsd) o9iVar.m), d1pVar2.n0(), new bn6((gst0) o9iVar.n, kt2Var2, knf0Var2, (peg0) o9iVar.C, (byte) 1));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new yfi(this);
            case 20:
                g45 g45Var2 = (g45) obj;
                return new byn((cyn) g45Var2.f10647a, (nr) g45Var2.b, (zsr) g45Var2.c, (duj) g45Var2.d, (rqj0) g45Var2.e, (mne) g45Var2.f, ((w9i) ((pv00) g45Var2.g).f27640a).b(), (ctf0) g45Var2.h);
            case 21:
                v8i v8iVar = (v8i) obj;
                hjd hjdVarA = ((itr) v8iVar.f).a();
                x1x.x(hjdVarA);
                hzg hzgVarA = ((pyg) v8iVar.g).a();
                x1x.x(hzgVarA);
                pru pruVar2 = (pru) v8iVar.h;
                g2v g2vVar = (g2v) v8iVar.i;
                cad cadVar2 = v8iVar.f36984a;
                mne mneVarH10 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH10);
                gii0 gii0Var = v8iVar.b;
                bwl bwlVar = new bwl(gii0Var, (byte) 4);
                o8o o8oVar = new o8o((byte) 0);
                knf0 knf0Var3 = v8iVar.c;
                ali aliVar = new ali(bwlVar, o8oVar, knf0Var3, (kuy) v8iVar.j);
                gst0 gst0Var2 = v8iVar.d;
                uzc uzcVarA = ((cih) ((vqc) v8iVar.k).b).a();
                gst0Var2.getClass();
                phf0 phf0Var2 = new phf0();
                phf0Var2.f26994a = aliVar;
                phf0Var2.b = gst0Var2;
                phf0Var2.c = uzcVarA;
                v7i v7iVarK2 = ((gbi) ((lsn) v8iVar.l).f20589a).k();
                n2u n2uVar = (n2u) v8iVar.m;
                luu luuVarW = ((daf) ((ugf0) v8iVar.n).f35622a).w();
                x1x.x(luuVarW);
                pwi pwiVar = new pwi(mneVarH10, phf0Var2, v7iVarK2, n2uVar, luuVarW, new iqt(gst0Var2), (rou) v8iVar.e, (viu) v8iVar.o, (b3u) v8iVar.p, (m1e) v8iVar.q, pruVar2);
                mne mneVarH11 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH11);
                ctf0 ctf0Var7 = (ctf0) v8iVar.r;
                y78 y78Var = (y78) v8iVar.s;
                m1e m1eVar4 = (m1e) v8iVar.q;
                svu svuVarA = ((xri) v8iVar.t).a();
                x1x.x(svuVarA);
                b8u b8uVar2 = new b8u(new z220(new nw20(gii0Var, (byte) 27), new ugf0(), knf0Var3, (vby) v8iVar.u));
                ih5 ih5Var = (ih5) v8iVar.v;
                zr1 zr1Var = (zr1) v8iVar.w;
                pyg0 pyg0Var = (pyg0) v8iVar.x;
                qyg0 qyg0Var = (qyg0) v8iVar.y;
                lbu lbuVar2 = (lbu) v8iVar.z;
                gvu gvuVarT = ((iip) v8iVar.A).t();
                x1x.x(gvuVarT);
                return new k9o(hjdVarA, hzgVarA, pruVar2, g2vVar, pwiVar, mneVarH11, ctf0Var7, y78Var, m1eVar4, svuVarA, b8uVar2, ih5Var, zr1Var, pyg0Var, qyg0Var, lbuVar2, gvuVarT, ((xzp) ((epi0) v8iVar.B).b).C());
            case 22:
                v7i v7iVar = (v7i) obj;
                String str2 = (String) v7iVar.i;
                long jLongValue5 = ((Long) v7iVar.g).longValue();
                mne mneVarH12 = ((psc) ((cad) v7iVar.h).b).h();
                x1x.x(mneVarH12);
                ctf0 ctf0Var8 = (ctf0) v7iVar.c;
                i1w0 i1w0Var5 = (i1w0) v7iVar.e;
                x4u x4uVar = new x4u(new iqi(new hsj((gii0) v7iVar.f, (byte) 7), (knf0) v7iVar.k));
                ocl oclVar4 = (ocl) v7iVar.f36925a;
                m1e m1eVar5 = (m1e) v7iVar.d;
                uyu uyuVar = (uyu) v7iVar.j;
                pmi0 pmi0Var2 = (pmi0) v7iVar.m;
                nfm0 nfm0VarA3 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA3);
                jwu jwuVar = new jwu(nfm0VarA3, (byte) 2);
                f7u f7uVarS = ((daf) pmi0Var2.f27236a).s();
                nfm0 nfm0VarA4 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA4);
                return new cwo(str2, jLongValue5, mneVarH12, ctf0Var8, i1w0Var5, x4uVar, oclVar4, m1eVar5, uyuVar, jwuVar, f7uVarS, new weu(nfm0VarA4, (byte) 0), new qzt((pru) v7iVar.b, (byte) 0), ((daf) pmi0Var2.f27236a).r(), (wyu) v7iVar.n, (r9u) v7iVar.l);
            case 23:
                return new dgi(this);
            case 24:
                o3c o3cVar2 = (o3c) obj;
                zri zriVar = (zri) o3cVar2.f24576a;
                knf0 knf0Var4 = (knf0) o3cVar2.b;
                sek sekVar = new sek();
                mne mneVarH13 = ((psc) ((cad) o3cVar2.c).b).h();
                x1x.x(mneVarH13);
                kki kkiVar = new kki(zriVar, knf0Var4, sekVar, mneVarH13, (btt0) o3cVar2.d);
                fsd fsdVar = (fsd) o3cVar2.e;
                fsdVar.getClass();
                zn00 zn00Var = new zn00();
                zn00Var.f44650a = kkiVar;
                zn00Var.b = fsdVar.a();
                v88 v88Var = (v88) o3cVar2.f;
                wsf0 wsf0Var = (wsf0) o3cVar2.g;
                return new e0p(zn00Var, v88Var, ((g45) wsf0Var.b).Y(), new iqt((gst0) o3cVar2.h), ((g45) wsf0Var.b).G(), wsf0Var.s(), (i1w0) o3cVar2.i, (duj) o3cVar2.j);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new jgi(this);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new lgi(this);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ngi(this);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new pgi(this);
            default:
                qv2 qv2Var2 = (qv2) obj;
                duj dujVar5 = (duj) qv2Var2.b;
                cad cadVar3 = (cad) qv2Var2.c;
                mne mneVarH14 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH14);
                b8u b8uVar3 = new b8u(new yuu(mneVarH14, new hcp0((gii0) qv2Var2.d, (byte) 0), (knf0) qv2Var2.e));
                m1e m1eVar6 = (m1e) qv2Var2.f;
                i1w0 i1w0Var6 = (i1w0) qv2Var2.g;
                kki kkiVar2 = (kki) qv2Var2.h;
                ocl oclVar5 = (ocl) qv2Var2.i;
                String str3 = (String) qv2Var2.j;
                r9u r9uVar = (r9u) qv2Var2.k;
                mne mneVarH15 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH15);
                return new wgp(dujVar5, b8uVar3, m1eVar6, i1w0Var6, kkiVar2, oclVar5, str3, r9uVar, mneVarH15, (ctf0) qv2Var2.l, (vjp) qv2Var2.m);
        }
    }
}
