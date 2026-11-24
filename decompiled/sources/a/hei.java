package a;

import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class hei implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dci f12925a;

    public hei(dci dciVar) {
        this.f12925a = dciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        iei ieiVar = (iei) this.f12925a.c;
        hzg hzgVarA = ieiVar.b.a();
        x1x.x(hzgVarA);
        mne mneVarH = ((psc) ieiVar.c.b).h();
        x1x.x(mneVarH);
        ctf0 ctf0Var = ieiVar.d;
        CyberChampsMainParams cyberChampsMainParams = ieiVar.e;
        nsu nsuVar = new nsu((cog) ieiVar.g.get(), (byte) 0);
        cqc cqcVar = new cqc((cog) ieiVar.g.get(), (byte) 2);
        x2u x2uVar = new x2u((cog) ieiVar.g.get(), (byte) 1);
        x2u x2uVar2 = new x2u((cog) ieiVar.g.get(), (byte) 2);
        dhg dhgVarP = ieiVar.b.p();
        x1x.x(dhgVarP);
        return new aig(hzgVarA, mneVarH, ctf0Var, cyberChampsMainParams, new gr00(nsuVar, cqcVar, x2uVar, x2uVar2, new ocl(dhgVarP)), new soi0((cog) ieiVar.g.get(), (byte) 1), new soi0((cog) ieiVar.g.get(), (byte) 0), new nsu((cog) ieiVar.g.get(), (byte) 1), new bqc((cog) ieiVar.g.get(), (byte) 2), vzg0Var);
    }
}
