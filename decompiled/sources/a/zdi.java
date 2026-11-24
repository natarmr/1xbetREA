package a;

import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zdi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uci f44216a;

    public zdi(uci uciVar) {
        this.f44216a = uciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        ru ruVar = (ru) this.f44216a.b;
        m1e m1eVar = (m1e) ruVar.h;
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) ruVar.f31100a;
        boolean zBooleanValue = ((Boolean) ruVar.c).booleanValue();
        ul9 ul9Var = (ul9) ruVar.d;
        fhj fhjVar = new fhj(new z1u(ul9Var, (byte) 0), new uyn(ul9Var));
        b3u b3uVar = new b3u((sjl0) ruVar.e, (byte) 0);
        j3c j3cVarV = ((iip) ruVar.f).V();
        x1x.x(j3cVarV);
        y1u y1uVar = new y1u(ul9Var, (byte) 1);
        g2v g2vVar = (g2v) ruVar.g;
        mne mneVarH = ((psc) ((cad) ruVar.i).b).h();
        x1x.x(mneVarH);
        return new u8g(vzg0Var, m1eVar, cyberCalendarPeriodUiModel, zBooleanValue, fhjVar, b3uVar, j3cVarV, y1uVar, g2vVar, mneVarH, (duj) ruVar.b);
    }
}
