package a;

/* JADX INFO: loaded from: classes4.dex */
public final class uoi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eni f36016a;

    public uoi(eni eniVar) {
        this.f36016a = eniVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        voi voiVar = (voi) this.f36016a.b;
        i1w0 i1w0Var = voiVar.f37768a;
        rkt0 rkt0VarZ = ((yqc) voiVar.b.b).z();
        g2v g2vVar = voiVar.c;
        ctf0 ctf0Var = voiVar.d;
        lbu lbuVar = voiVar.e;
        yqc yqcVar = voiVar.f;
        nc0 nc0Var = (nc0) yqcVar.b;
        uii uiiVarD = nc0Var.d();
        j1q0 j1q0Var = voiVar.g;
        zri zriVar = new zri(uiiVarD, j1q0Var);
        yiu yiuVar = new yiu(j1q0Var, (byte) 0);
        pru pruVar = voiVar.h;
        n4u n4uVar = new n4u(nc0Var.d(), (byte) 0);
        e1u e1uVar = new e1u(nc0Var.d(), (byte) 5);
        ieu ieuVar = voiVar.i;
        rou rouVar = new rou(voiVar.j, (byte) 0);
        gst0 gst0Var = voiVar.k;
        pwi pwiVar = new pwi(lbuVar, zriVar, yiuVar, pruVar, n4uVar, e1uVar, ieuVar, rouVar, new x4v(gst0Var, (byte) 0), new wsc(gst0Var, (byte) 4), new t4v(gst0Var, (byte) 1));
        nc0 nc0Var2 = (nc0) yqcVar.b;
        oeg0 oeg0Var = (oeg0) nc0Var2.d;
        sue sueVar = (sue) nc0Var2.e;
        znt zntVarN = sueVar.n();
        x1x.x(zntVarN);
        std stdVar = new std();
        gbi gbiVarJ = sueVar.j();
        x1x.x(gbiVarJ);
        mne mneVarH = ((psc) ((cad) nc0Var2.f).b).h();
        x1x.x(mneVarH);
        return new j5b0(vzg0Var, i1w0Var, rkt0VarZ, g2vVar, ctf0Var, pwiVar, new iij(oeg0Var, zntVarN, stdVar, gbiVarJ, mneVarH, (ouu) nc0Var2.g), new std(), voiVar.l, voiVar.m, pruVar);
    }
}
