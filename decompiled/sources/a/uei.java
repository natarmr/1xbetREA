package a;

import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
public final class uei implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uci f35529a;

    public uei(uci uciVar) {
        this.f35529a = uciVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        vei veiVar = (vei) this.f35529a.b;
        CyberBottomSheetParams cyberBottomSheetParams = veiVar.f37290a;
        boolean zBooleanValue = veiVar.b.booleanValue();
        xhi xhiVar = veiVar.c;
        b8u b8uVarE = xhiVar.e();
        b8u b8uVarE2 = xhiVar.e();
        q530 q530Var = (q530) xhiVar.T.get();
        x1x.x(q530Var);
        j910 j910Var = new j910(b8uVarE2, new pv00(q530Var), (byte) 8);
        dgu dguVar = new dgu(new x4u((fx7) xhiVar.c0.get()), ((gbi) xhiVar.N.f20589a).k(), new rpt(xhiVar.j), xhiVar.g);
        f7u f7uVar = new f7u((Object) new p4u((fx7) xhiVar.c0.get()), (Object) ((gbi) xhiVar.N.f20589a).k(), (Object) new rpt(xhiVar.j), (Object) xhiVar.g, (byte) 13);
        rtu rtuVar = veiVar.d;
        pru pruVar = veiVar.e;
        hjd hjdVarA = veiVar.f.a();
        x1x.x(hjdVarA);
        lbu lbuVar = veiVar.g;
        luu luuVarW = ((daf) veiVar.h.f35622a).w();
        x1x.x(luuVarW);
        j3c j3cVarX = veiVar.i.x();
        x1x.x(j3cVarX);
        y78 y78Var = veiVar.j;
        r9u r9uVar = veiVar.k;
        ctf0 ctf0Var = veiVar.l;
        mne mneVarH = ((psc) veiVar.m.b).h();
        x1x.x(mneVarH);
        return new dch(vzg0Var, cyberBottomSheetParams, zBooleanValue, b8uVarE, j910Var, dguVar, f7uVar, rtuVar, pruVar, hjdVarA, lbuVar, luuVarW, j3cVarX, y78Var, r9uVar, ctf0Var, mneVarH);
    }
}
