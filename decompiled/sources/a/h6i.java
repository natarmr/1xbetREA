package a;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class h6i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12530a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;

    public h6i(wsz wszVar, mne mneVar, gii0 gii0Var, btt0 btt0Var, ctf0 ctf0Var, i1w0 i1w0Var, Integer num, duj dujVar, ii iiVar, e400 e400Var, kuy kuyVar, ocl oclVar) {
        this.d = wszVar;
        this.e = gii0Var;
        this.f = btt0Var;
        this.g = e400Var;
        this.b = mneVar;
        this.h = kuyVar;
        this.f12530a = ctf0Var;
        this.i = i1w0Var;
        this.j = dujVar;
        this.k = num;
        this.l = oclVar;
        byte b = 26;
        this.c = mbl.b(new rii(this, 3, b));
        this.m = mbl.b(new rii(this, 2, b));
        this.n = mbl.b(new rii(this, 1, b));
        this.o = mbl.b(new rii(this, 4, b));
        this.p = n0k0.a(new rii(this, 0, b));
    }

    public rrc a() {
        return new rrc(new pzu((emg0) this.f12530a, (ljf0) this.e, (knf0) this.f, (rl70) this.g, (mne) this.b, (vby) this.h), (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r6 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.tot
            if (r0 == 0) goto L13
            r0 = r6
            a.tot r0 = (a.tot) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.tot r0 = new a.tot
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L6b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L4b
        L35:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.g
            a.lsn r6 = (a.lsn) r6
            r0.k = r4
            java.lang.Object r6 = r6.f20589a
            a.svu r6 = (a.svu) r6
            a.txy r2 = a.txy.SPORT_LINE
            java.io.Serializable r6 = r6.a(r4, r0)
            if (r6 != r1) goto L4b
            goto L6a
        L4b:
            java.util.List r6 = (java.util.List) r6
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L56
            a.iun r5 = a.iun.f15405a
            return r5
        L56:
            java.lang.Object r2 = r5.e
            a.lhf0 r2 = (a.lhf0) r2
            java.lang.Object r5 = r5.f
            a.ntu r5 = (a.ntu) r5
            java.lang.String r5 = r5.a()
            r0.k = r3
            java.lang.Object r6 = r2.y(r0, r5, r6)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h6i.b(a.zje):java.lang.Object");
    }

    public yox c() {
        r9u r9uVar = (r9u) this.d;
        r9uVar.getClass();
        yox yoxVar = new yox();
        yoxVar.f43005a = r9uVar;
        return yoxVar;
    }

    public sff0 d() {
        return (sff0) ((n0o0) this.c).getValue();
    }

    public tzi e() {
        ieu ieuVar = new ieu((Object) new pzu((emg0) this.f12530a, (ljf0) this.e, (knf0) this.f, (rl70) this.g, (mne) this.b, (vby) this.h), this.i, (byte) 8);
        bzt bztVar = (bzt) this.n;
        ntu ntuVar = (ntu) this.j;
        iqt iqtVar = (iqt) this.l;
        rqc rqcVar = (rqc) this.m;
        rou rouVar = (rou) this.k;
        g45 g45Var = (g45) ((wsf0) this.o).b;
        return new tzi(ieuVar, bztVar, ntuVar, iqtVar, rqcVar, rouVar, g45Var.t(), g45Var.y(), (x0u) this.p, (ocl) this.c, (byte) 5);
    }

    public dgu f() {
        abu abuVar = new abu((gii0) this.m, (byte) 16);
        auv auvVar = (auv) ((n5d0) this.c).get();
        knf0 knf0Var = (knf0) this.n;
        mne mneVarH = ((psc) ((cad) this.f).b).h();
        x1x.x(mneVarH);
        return new dgu(abuVar, auvVar, knf0Var, mneVarH);
    }

    public hpt g(List list) {
        gmq gmqVarJ0;
        gmq gmqVarC;
        list.getClass();
        ((rmu0) ((ocl) ((jw20) this.o).b).f25032a).f30761a.clear();
        long jF = ynq0.f(((viu) this.m).a());
        yje yjeVar = null;
        utb utbVarC = aoq.c(bkb.h0(8L, TimeUnit.SECONDS, new cin(this, yjeVar, (byte) 13)), new uot(null, this, jF));
        byte b = 4;
        byte b2 = 2;
        byte b3 = 3;
        dnq dnqVar = new dnq(new k2c(kpb.k0(utbVarC, 3L, new d21(this, yjeVar, b)), (byte) 2), new rl2(b3, yjeVar, b), (byte) 1);
        byte b4 = 12;
        if (d().d.b) {
            svu svuVar = ((h5k) this.h).f12484a;
            txy txyVar = txy.SPORT_LINE;
            gmqVarJ0 = bkb.j0(aoq.a(aoq.a(svuVar.e(2), new wn2((Object) list, (Object) this, yjeVar, (byte) 16)), new wmq(this, null)), "GetAllViewedGamesScenario", q3d.j(oqt0.class, bun.class), 52);
        } else {
            gmqVarJ0 = new eu4(iun.f15405a, b4);
        }
        dnq dnqVar2 = new dnq(new a1t(gmqVarJ0, b3), new rl2(b3, yjeVar, b3), (byte) 1);
        boolean z = d().b.f13233a.b;
        boolean z2 = d().b.f13233a.f8987a;
        byte b5 = 0;
        if (!z && !z2) {
            gmqVarC = new eu4(iun.f15405a, b4);
        } else if (d().b.N) {
            gmqVarC = bkb.j0(new vsg0(new fhq(this, yjeVar, (byte) 8)), "GetAllViewedGamesScenario", kotlin.collections.a.c(oqt0.class), 54);
        } else {
            svu svuVar2 = ((ont) this.b).f25564a;
            txy txyVar2 = txy.SPORT_LINE;
            gmqVarC = aoq.c(new nnt(svuVar2.e(1), (byte) 0), new sot(yjeVar, this, b5));
        }
        return new hpt(dub.f0(dnqVar, dnqVar2, new dnq(new a1t(gmqVarC, b), new rl2(b3, yjeVar, b2), (byte) 1), new ipt(b, yjeVar, b5)), (byte) 0);
    }

    public cyu h() {
        knf0 knf0Var = (knf0) this.h;
        gii0 gii0Var = (gii0) this.i;
        knf0Var.getClass();
        gii0Var.getClass();
        gxu gxuVar = new gxu();
        gxuVar.f12096a = knf0Var;
        gxuVar.b = gii0Var;
        gxuVar.c = new jfm0(gxuVar, (byte) 2);
        ugm0 ugm0Var = (ugm0) this.j;
        ugm0Var.getClass();
        knf0Var.getClass();
        cyu cyuVar = new cyu();
        cyuVar.f5196a = gxuVar;
        cyuVar.b = ugm0Var;
        cyuVar.c = knf0Var;
        return cyuVar;
    }

    public h6i(ort ortVar, dgu dguVar, ont ontVar, pru pruVar, lhf0 lhf0Var, ntu ntuVar, lsn lsnVar, h5k h5kVar, h5k h5kVar2, eot eotVar, v7i v7iVar, wsc wscVar, viu viuVar, j9u j9uVar, jw20 jw20Var, cpb cpbVar) {
        this.d = ortVar;
        this.f12530a = dguVar;
        this.b = ontVar;
        this.e = lhf0Var;
        this.f = ntuVar;
        this.g = lsnVar;
        this.h = h5kVar;
        this.i = h5kVar2;
        this.j = eotVar;
        this.k = v7iVar;
        this.l = wscVar;
        this.m = viuVar;
        this.n = j9uVar;
        this.o = jw20Var;
        this.p = cpbVar;
        this.c = maz.b(new hc0(pruVar, (byte) 25));
    }

    public h6i(v6k v6kVar, us00 us00Var, cad cadVar, q7d0 q7d0Var, gii0 gii0Var, j1q0 j1q0Var, asd asdVar, fsd fsdVar, vby vbyVar, vdf vdfVar, knf0 knf0Var, us3 us3Var, vff0 vff0Var, kwd kwdVar, nrd nrdVar, ony onyVar, wgu wguVar, o470 o470Var, eyg0 eyg0Var) {
        q7d0Var.getClass();
        gii0Var.getClass();
        j1q0Var.getClass();
        asdVar.getClass();
        fsdVar.getClass();
        vbyVar.getClass();
        vdfVar.getClass();
        knf0Var.getClass();
        us3Var.getClass();
        vff0Var.getClass();
        nrdVar.getClass();
        onyVar.getClass();
        wguVar.getClass();
        this.d = v6kVar;
        this.f12530a = q7d0Var;
        this.b = gii0Var;
        this.e = j1q0Var;
        this.f = asdVar;
        this.g = fsdVar;
        this.h = vbyVar;
        this.i = vdfVar;
        this.j = knf0Var;
        this.k = us3Var;
        this.l = vff0Var;
        this.m = nrdVar;
        this.n = onyVar;
        this.o = wguVar;
        this.p = o470Var;
        this.c = eyg0Var;
    }

    public h6i(htz htzVar, mne mneVar, gii0 gii0Var, btt0 btt0Var, ctf0 ctf0Var, i1w0 i1w0Var, Integer num, duj dujVar, ii iiVar, kwz kwzVar, njo njoVar, ocl oclVar) {
        this.d = num;
        this.e = htzVar;
        this.f = gii0Var;
        this.g = kwzVar;
        this.h = njoVar;
        this.i = btt0Var;
        this.f12530a = ctf0Var;
        this.j = i1w0Var;
        this.k = dujVar;
        this.b = mneVar;
        this.l = oclVar;
        byte b = 14;
        this.c = mbl.b(new r5i(this, 3, b));
        this.m = mbl.b(new r5i(this, 2, b));
        this.n = mbl.b(new r5i(this, 1, b));
        this.o = mbl.b(new r5i(this, 4, b));
        this.p = n0k0.a(new r5i(this, 0, b));
    }

    public h6i(wsf0 wsf0Var, bm5 bm5Var, Boolean bool, Boolean bool2, Boolean bool3, i1w0 i1w0Var, v88 v88Var, wxs0 wxs0Var, ih5 ih5Var, zg zgVar, g2v g2vVar, eqx eqxVar, mne mneVar, l7k l7kVar, ctf0 ctf0Var, cmt cmtVar) {
        this.d = bm5Var;
        this.f12530a = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = wsf0Var;
        this.h = v88Var;
        this.i = ih5Var;
        this.j = zgVar;
        this.k = eqxVar;
        this.b = mneVar;
        this.l = g2vVar;
        this.m = wxs0Var;
        this.n = i1w0Var;
        this.o = l7kVar;
        this.p = cmtVar;
        this.c = new pai(this, (byte) 12);
    }

    public h6i(cad cadVar, String str, Boolean bool, bca0 bca0Var, gii0 gii0Var, duj dujVar, m1e m1eVar, i1w0 i1w0Var, ctf0 ctf0Var, uyu uyuVar, wyu wyuVar, knf0 knf0Var, ocl oclVar, kuy kuyVar) {
        this.d = str;
        this.b = bool;
        this.f = uyuVar;
        this.g = gii0Var;
        this.h = knf0Var;
        this.i = bca0Var;
        this.j = cadVar;
        this.k = kuyVar;
        this.l = i1w0Var;
        this.e = m1eVar;
        this.m = dujVar;
        this.n = wyuVar;
        this.o = oclVar;
        this.f12530a = ctf0Var;
        byte b = 18;
        this.c = n0k0.a(new gji(this, 0, b));
        this.p = new gji(this, 1, b);
    }

    public h6i(wsz wszVar, mne mneVar, i1w0 i1w0Var, ocl oclVar, duj dujVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, kuy kuyVar, ii iiVar, rou rouVar, e400 e400Var, evz evzVar) {
        this.d = i1w0Var;
        this.f12530a = ctf0Var;
        this.e = dujVar;
        this.k = rouVar;
        this.f = wszVar;
        this.g = gii0Var;
        this.h = btt0Var;
        this.i = e400Var;
        this.b = mneVar;
        this.j = kuyVar;
        this.l = oclVar;
        byte b = 3;
        this.c = mbl.b(new psi(this, b, b));
        this.m = mbl.b(new psi(this, 2, b));
        this.n = mbl.b(new psi(this, 1, b));
        this.o = mbl.b(new psi(this, 4, b));
        this.p = n0k0.a(new psi(this, 0, b));
    }

    public h6i(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, r9u r9uVar, gii0 gii0Var, pru pruVar, duj dujVar, String str, ctf0 ctf0Var, m1e m1eVar, ocl oclVar, uyu uyuVar, Long l, knf0 knf0Var, wyu wyuVar) {
        this.d = str;
        this.b = l;
        this.f = i1w0Var;
        this.g = cadVar;
        this.f12530a = ctf0Var;
        this.e = m1eVar;
        this.h = pmi0Var;
        this.i = pruVar;
        this.j = uyuVar;
        this.k = wyuVar;
        this.l = dujVar;
        this.m = gii0Var;
        this.n = knf0Var;
        this.o = r9uVar;
        this.p = oclVar;
        this.c = new ugi(this, (byte) 5);
    }

    public h6i(cad cadVar, pmi0 pmi0Var, r9u r9uVar, ctf0 ctf0Var, pru pruVar, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, String str, m1e m1eVar, ocl oclVar, uyu uyuVar, Long l, knf0 knf0Var, wyu wyuVar) {
        this.d = str;
        this.b = l;
        this.f = cadVar;
        this.g = gii0Var;
        this.h = knf0Var;
        this.e = m1eVar;
        this.i = oclVar;
        this.j = dujVar;
        this.k = uyuVar;
        this.l = wyuVar;
        this.m = i1w0Var;
        this.n = pmi0Var;
        this.o = pruVar;
        this.f12530a = ctf0Var;
        this.p = r9uVar;
        this.c = new xvi(this, (byte) 10);
    }

    public h6i(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, r9u r9uVar, pru pruVar, gii0 gii0Var, duj dujVar, ctf0 ctf0Var, String str, m1e m1eVar, ocl oclVar, uyu uyuVar, Long l, knf0 knf0Var, wyu wyuVar) {
        this.d = str;
        this.b = l;
        this.f = cadVar;
        this.g = gii0Var;
        this.h = knf0Var;
        this.e = m1eVar;
        this.i = oclVar;
        this.j = dujVar;
        this.k = uyuVar;
        this.l = wyuVar;
        this.m = i1w0Var;
        this.n = pmi0Var;
        this.o = pruVar;
        this.f12530a = ctf0Var;
        this.p = r9uVar;
        this.c = new xvi(this, (byte) 28);
    }

    public h6i(zg zgVar, ii iiVar, au0 au0Var, cad cadVar, m1e m1eVar, cyh cyhVar, duj dujVar, ort ortVar, rou rouVar, pru pruVar, knf0 knf0Var, ctf0 ctf0Var, oeg0 oeg0Var, gii0 gii0Var, btt0 btt0Var, z4w0 z4w0Var) {
        this.d = gii0Var;
        this.b = knf0Var;
        this.f = cadVar;
        this.g = btt0Var;
        this.h = cyhVar;
        this.i = z4w0Var;
        this.j = ortVar;
        this.l = oeg0Var;
        this.m = dujVar;
        this.e = m1eVar;
        this.n = pruVar;
        this.f12530a = ctf0Var;
        this.k = rouVar;
        this.o = zgVar;
        this.p = au0Var;
        this.c = n0k0.a(new pai(this, (byte) 15));
    }

    public h6i(wsf0 wsf0Var, i1w0 i1w0Var, ntu ntuVar, n4u n4uVar, wgu wguVar, iqt iqtVar, jqt jqtVar, hru hruVar, m1e m1eVar, mne mneVar, duj dujVar, ctf0 ctf0Var, g2v g2vVar, j1q0 j1q0Var, vby vbyVar, grj grjVar, pru pruVar) {
        this.d = i1w0Var;
        this.f = g2vVar;
        this.e = m1eVar;
        this.b = mneVar;
        this.g = dujVar;
        this.h = j1q0Var;
        this.i = ntuVar;
        this.j = n4uVar;
        this.f12530a = ctf0Var;
        this.k = wguVar;
        this.l = hruVar;
        this.m = iqtVar;
        this.n = jqtVar;
        this.o = wsf0Var;
        this.p = pruVar;
        this.c = new pai(this, (byte) 11);
    }

    public h6i(cad cadVar, pmi0 pmi0Var, qzt qztVar, wyu wyuVar, i1w0 i1w0Var, ctf0 ctf0Var, gii0 gii0Var, duj dujVar, r9u r9uVar, String str, m1e m1eVar, ocl oclVar, uyu uyuVar, Long l, knf0 knf0Var) {
        this.d = gii0Var;
        this.b = cadVar;
        this.f = knf0Var;
        this.e = m1eVar;
        this.g = oclVar;
        this.h = str;
        this.i = l;
        this.j = dujVar;
        this.k = uyuVar;
        this.l = pmi0Var;
        this.m = qztVar;
        this.f12530a = ctf0Var;
        this.n = wyuVar;
        this.o = i1w0Var;
        this.p = r9uVar;
        this.c = new xvi(this, (byte) 11);
    }

    public h6i(wsf0 wsf0Var, ntu ntuVar, r9u r9uVar, rou rouVar, rqc rqcVar, iqt iqtVar, bzt bztVar, knf0 knf0Var, mne mneVar, emg0 emg0Var, ljf0 ljf0Var, rl70 rl70Var, x0u x0uVar, ocl oclVar, o0u o0uVar, vby vbyVar) {
        this.d = r9uVar;
        this.f12530a = emg0Var;
        this.e = ljf0Var;
        this.f = knf0Var;
        this.g = rl70Var;
        this.b = mneVar;
        this.h = vbyVar;
        this.i = o0uVar;
        this.n = bztVar;
        this.j = ntuVar;
        this.l = iqtVar;
        this.m = rqcVar;
        this.k = rouVar;
        this.o = wsf0Var;
        this.p = x0uVar;
        this.c = oclVar;
    }

    public h6i(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, gii0 gii0Var, ctf0 ctf0Var, r9u r9uVar, duj dujVar, String str, m1e m1eVar, uyu uyuVar, Long l, knf0 knf0Var, ocl oclVar, qzt qztVar, wyu wyuVar) {
        this.d = str;
        this.b = l;
        this.f = cadVar;
        this.g = gii0Var;
        this.h = knf0Var;
        this.e = m1eVar;
        this.i = oclVar;
        this.j = dujVar;
        this.k = uyuVar;
        this.l = wyuVar;
        this.m = i1w0Var;
        this.n = pmi0Var;
        this.o = qztVar;
        this.f12530a = ctf0Var;
        this.p = r9uVar;
        this.c = new xvi(this, (byte) 27);
    }

    public h6i(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, wyu wyuVar, r9u r9uVar, gii0 gii0Var, pru pruVar, ctf0 ctf0Var, String str, m1e m1eVar, uyu uyuVar, Long l, knf0 knf0Var, ugm0 ugm0Var, ocl oclVar) {
        this.d = str;
        this.b = l;
        this.f12530a = ctf0Var;
        this.f = cadVar;
        this.g = i1w0Var;
        this.h = knf0Var;
        this.i = gii0Var;
        this.j = ugm0Var;
        this.k = oclVar;
        this.e = m1eVar;
        this.l = pmi0Var;
        this.m = pruVar;
        this.n = uyuVar;
        this.o = wyuVar;
        this.p = r9uVar;
        this.c = new rti(this, (byte) 17);
    }

    public h6i(cad cadVar, pmi0 pmi0Var, r9u r9uVar, i1w0 i1w0Var, pru pruVar, gii0 gii0Var, ctf0 ctf0Var, String str, m1e m1eVar, uyu uyuVar, Long l, knf0 knf0Var, ocl oclVar, wyu wyuVar) {
        this.d = str;
        this.b = l;
        this.f12530a = ctf0Var;
        this.f = cadVar;
        this.g = i1w0Var;
        this.h = oclVar;
        this.e = m1eVar;
        this.i = pmi0Var;
        this.j = pruVar;
        this.k = uyuVar;
        this.l = wyuVar;
        this.m = gii0Var;
        this.n = knf0Var;
        this.o = r9uVar;
        byte b = 27;
        this.c = mbl.b(new f7i(this, 1, b));
        this.p = new f7i(this, 0, b);
    }

    public h6i(cad cadVar, pmi0 pmi0Var, lme0 lme0Var, String str, Long l, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, m1e m1eVar, wyu wyuVar, pru pruVar, knf0 knf0Var, uyu uyuVar, ocl oclVar, qzt qztVar, r9u r9uVar) {
        this.d = qztVar;
        this.f12530a = pmi0Var;
        this.b = gii0Var;
        this.f = knf0Var;
        this.g = cadVar;
        this.h = wyuVar;
        this.i = str;
        this.j = l;
        this.k = i1w0Var;
        this.l = dujVar;
        this.e = m1eVar;
        this.m = oclVar;
        this.n = uyuVar;
        this.o = pruVar;
        this.p = r9uVar;
        this.c = new kzi(this, (byte) 7);
    }

    public h6i(sxs0 sxs0Var, iqt iqtVar, oeg0 oeg0Var, uf3 uf3Var, mne mneVar, kt2 kt2Var, ls lsVar, gst0 gst0Var, pbt pbtVar, p4u p4uVar, xcc xccVar, lbu lbuVar, z4u z4uVar, gw60 gw60Var, ntu ntuVar, ix0 ix0Var) {
        this.d = uf3Var;
        this.f12530a = kt2Var;
        this.e = gw60Var;
        this.f = ix0Var;
        this.g = lsVar;
        this.b = mneVar;
        this.h = xccVar;
        this.i = p4uVar;
        this.j = oeg0Var;
        this.k = z4uVar;
        this.l = iqtVar;
        this.m = pbtVar;
        this.n = gst0Var;
        this.o = ntuVar;
        this.p = lbuVar;
        this.c = n0k0.a(new rki(this, (byte) 26));
    }

    public h6i(x860 x860Var, iw20 iw20Var, zas0 zas0Var, bbw0 bbw0Var, ani0 ani0Var, pv00 pv00Var, s9m0 s9m0Var, atz atzVar, r7v r7vVar, epi0 epi0Var, ctf0 ctf0Var, rou rouVar, mne mneVar, m1e m1eVar, sa10 sa10Var, wdk0 wdk0Var, bzt bztVar, ii iiVar, jau0 jau0Var) {
        this.d = x860Var;
        this.f12530a = ctf0Var;
        this.b = mneVar;
        this.e = m1eVar;
        this.f = zas0Var;
        this.g = bbw0Var;
        this.h = ani0Var;
        this.i = pv00Var;
        this.j = r7vVar;
        this.k = rouVar;
        this.l = epi0Var;
        this.m = jau0Var;
        this.n = bztVar;
        this.o = sa10Var;
        this.p = iw20Var;
        this.c = n0k0.a(new t5i(this, (byte) 10));
    }

    public h6i(cad cadVar, ugf0 ugf0Var, wsf0 wsf0Var, String str, String str2, ctf0 ctf0Var, m1e m1eVar, i1w0 i1w0Var, duj dujVar, btt0 btt0Var, gii0 gii0Var, ocl oclVar, b8u b8uVar, fme fmeVar, edo edoVar) {
        this.d = str;
        this.b = str2;
        this.f = cadVar;
        this.f12530a = ctf0Var;
        this.g = oclVar;
        this.h = fmeVar;
        this.i = b8uVar;
        this.j = edoVar;
        this.k = wsf0Var;
        this.l = gii0Var;
        this.m = btt0Var;
        this.n = ugf0Var;
        this.e = m1eVar;
        this.o = dujVar;
        this.p = i1w0Var;
        this.c = n0k0.a(new yxi(this, (byte) 4));
    }

    public h6i(gr70 gr70Var, cad cadVar, wyu wyuVar, uq70 uq70Var, i1w0 i1w0Var, ii iiVar, wdk0 wdk0Var, m1e m1eVar, gst0 gst0Var, j1q0 j1q0Var, yfu yfuVar, b3c0 b3c0Var, ieu ieuVar, ol olVar, js70 js70Var) {
        this.d = i1w0Var;
        this.f12530a = cadVar;
        this.b = uq70Var;
        this.e = m1eVar;
        this.f = gr70Var;
        this.g = b3c0Var;
        this.h = gst0Var;
        this.i = j1q0Var;
        this.j = ieuVar;
        this.k = yfuVar;
        this.l = wyuVar;
        this.m = js70Var;
        this.n = olVar;
        byte b = 3;
        this.c = n0k0.a(new omi(this, 1, b));
        this.o = n0k0.a(new omi(this, 2, b));
        this.p = new omi(this, 0, b);
    }
}
