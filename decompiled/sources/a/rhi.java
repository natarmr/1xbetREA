package a;

import org.xplatform.ufc.api.game.UfcGameParams;

/* JADX INFO: loaded from: classes6.dex */
public final class rhi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dci f30491a;

    public rhi(dci dciVar) {
        this.f30491a = dciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        shi shiVar = (shi) this.f30491a.c;
        String str = shiVar.f32213a;
        mne mneVarH = ((psc) shiVar.b.b).h();
        x1x.x(mneVarH);
        UfcGameParams ufcGameParams = shiVar.c;
        xhi xhiVar = shiVar.d;
        tzi tziVarB = xhiVar.b();
        iw20 iw20VarH = xhiVar.h();
        drm0 drm0VarK = xhiVar.k();
        sbu sbuVarJ = xhiVar.j();
        clc clcVar = shiVar.e;
        a7q a7qVarH = ((v7i) clcVar.b).h();
        rus rusVarE = ((v7i) clcVar.b).e();
        g3j g3jVarG = xhiVar.g();
        xpr xprVarC = xhiVar.c();
        e1u e1uVar = new e1u((d4t0) shiVar.v.get());
        b8u b8uVar = new b8u((d4t0) shiVar.v.get());
        reu reuVar = new reu((nov) shiVar.w.get());
        vpu vpuVarA = shiVar.h.a();
        x1x.x(vpuVarA);
        hqc hqcVarI = ((qv2) shiVar.i.b).i();
        j3c j3cVarV = shiVar.j.V();
        x1x.x(j3cVarV);
        wrh wrhVarD = ((v7i) clcVar.b).d();
        x1x.x(wrhVarD);
        e1u e1uVar2 = new e1u(wrhVarD, (byte) 1);
        ivn ivnVar = shiVar.k;
        return new c0t(vzg0Var, str, mneVarH, ufcGameParams, tziVarB, iw20VarH, drm0VarK, sbuVarJ, a7qVarH, rusVarE, g3jVarG, xprVarC, e1uVar, b8uVar, reuVar, vpuVarA, hqcVarI, j3cVarV, e1uVar2, ((v5i) ivnVar.f15453a).e(), ((v5i) ivnVar.f15453a).d(), ((v5i) ivnVar.f15453a).b(), ((v5i) ivnVar.f15453a).f(), shiVar.l, shiVar.m, new kys0((byte) 1), new uxs0((byte) 1), shiVar.n, shiVar.o, shiVar.p, shiVar.q, shiVar.r, shiVar.s);
    }
}
