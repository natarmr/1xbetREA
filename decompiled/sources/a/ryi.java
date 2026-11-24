package a;

import org.xplatform.cyber.game.valorant.api.ValorantPostGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ryi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ msi f31316a;

    public ryi(msi msiVar) {
        this.f31316a = msiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        syi syiVar = (syi) this.f31316a.c;
        ValorantPostGameScreenParams valorantPostGameScreenParams = syiVar.f33024a;
        duj dujVar = syiVar.b;
        hzg hzgVarA = syiVar.c.a();
        x1x.x(hzgVarA);
        m1e m1eVar = syiVar.d;
        String str = syiVar.e;
        mne mneVarH = ((psc) syiVar.f.b).h();
        x1x.x(mneVarH);
        clc clcVar = syiVar.g;
        v7i v7iVar = (v7i) clcVar.b;
        reu reuVarI = v7iVar.i();
        uyn uynVarF = v7iVar.f();
        j3c j3cVarV = syiVar.h.V();
        x1x.x(j3cVarV);
        bzu bzuVar = new bzu((k1u0) syiVar.y.get());
        qah qahVarG = v7iVar.g();
        x1x.x(qahVarG);
        w5z w5zVar = new w5z(reuVarI, uynVarF, j3cVarV, bzuVar, new ezt(qahVarG));
        a7q a7qVarH = ((v7i) clcVar.b).h();
        nvu nvuVarB = ((daf) syiVar.j.f30839a).B();
        g2v g2vVar = syiVar.k;
        ctf0 ctf0Var = syiVar.l;
        svu svuVarA = syiVar.m.a();
        x1x.x(svuVarA);
        luu luuVarW = ((daf) syiVar.n.f35622a).w();
        x1x.x(luuVarW);
        dwu dwuVar = syiVar.o;
        oeg0 oeg0Var = syiVar.p;
        h3c h3cVar = (h3c) ((v7i) clcVar.b).e;
        r9u r9uVarC = ((xzp) syiVar.q.b).C();
        qgh qghVar = syiVar.r;
        ih5 ih5Var = new ih5(syiVar.s, (byte) 1);
        zr1 zr1Var = syiVar.t;
        a1d a1dVar = syiVar.u;
        return new tzt0(vzg0Var, valorantPostGameScreenParams, dujVar, hzgVarA, m1eVar, str, mneVarH, w5zVar, a7qVarH, nvuVarB, g2vVar, ctf0Var, svuVarA, luuVarW, dwuVar, oeg0Var, h3cVar, r9uVarC, qghVar, ih5Var, zr1Var, ((qv2) a1dVar.b).i(), syiVar.v, ((dbi) syiVar.w.f3330a).B(), ((qv2) a1dVar.b).g());
    }
}
