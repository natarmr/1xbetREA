package a;

import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
public final class wdi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uci f38975a;

    public wdi(uci uciVar) {
        this.f38975a = uciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        g45 g45Var = (g45) this.f38975a.b;
        CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) g45Var.f10647a;
        ul9 ul9Var = (ul9) g45Var.b;
        fhj fhjVar = new fhj(new z1u(ul9Var, (byte) 0), new uyn(ul9Var));
        b3u b3uVar = new b3u((sjl0) g45Var.c, (byte) 0);
        j3c j3cVarV = ((iip) g45Var.d).V();
        x1x.x(j3cVarV);
        ul9 ul9Var2 = (ul9) g45Var.b;
        y1u y1uVar = new y1u(ul9Var2, (byte) 0);
        z1u z1uVar = new z1u(ul9Var2, (byte) 1);
        g2v g2vVar = (g2v) g45Var.e;
        mne mneVarH = ((psc) ((cad) g45Var.f).b).h();
        x1x.x(mneVarH);
        return new h6g(vzg0Var, cyberCalendarParams, fhjVar, b3uVar, j3cVarV, y1uVar, z1uVar, g2vVar, mneVarH, (duj) g45Var.g, (ctf0) g45Var.h);
    }
}
