package a;

import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;

/* JADX INFO: loaded from: classes3.dex */
public final class bei implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uci f2452a;

    public bei(uci uciVar) {
        this.f2452a = uciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        ru ruVar = (ru) this.f2452a.b;
        m1e m1eVar = (m1e) ruVar.h;
        CyberCalendarDaysOfWeekParams cyberCalendarDaysOfWeekParams = (CyberCalendarDaysOfWeekParams) ruVar.f31100a;
        boolean zBooleanValue = ((Boolean) ruVar.c).booleanValue();
        ul9 ul9Var = (ul9) ruVar.d;
        fhj fhjVar = new fhj(new z1u(ul9Var, (byte) 0), new uyn(ul9Var));
        b3u b3uVar = new b3u((sjl0) ruVar.e, (byte) 0);
        y1u y1uVar = new y1u(ul9Var, (byte) 0);
        y1u y1uVar2 = new y1u(ul9Var, (byte) 1);
        g2v g2vVar = (g2v) ruVar.f;
        mne mneVarH = ((psc) ((cad) ruVar.g).b).h();
        x1x.x(mneVarH);
        duj dujVar = (duj) ruVar.b;
        j3c j3cVarV = ((iip) ruVar.i).V();
        x1x.x(j3cVarV);
        return new w6g(vzg0Var, m1eVar, cyberCalendarDaysOfWeekParams, zBooleanValue, fhjVar, b3uVar, y1uVar, y1uVar2, g2vVar, mneVarH, dujVar, j3cVarV);
    }
}
