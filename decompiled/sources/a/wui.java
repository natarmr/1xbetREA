package a;

import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wui implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rti f39792a;

    public wui(rti rtiVar) {
        this.f39792a = rtiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        ywq0 ywq0Var = (ywq0) this.f39792a.b;
        StatisticBlocksParams statisticBlocksParams = (StatisticBlocksParams) ywq0Var.f43384a;
        mne mneVarH = ((psc) ((cad) ywq0Var.b).b).h();
        x1x.x(mneVarH);
        ogh oghVar = (ogh) ywq0Var.c;
        ewu ewuVarB = oghVar.b();
        x1x.x(ewuVarB);
        zsi0 zsi0VarC = oghVar.c();
        x1x.x(zsi0VarC);
        return new tam0(vzg0Var, statisticBlocksParams, mneVarH, ewuVarB, zsi0VarC, (ctf0) ywq0Var.d, (oeg0) ywq0Var.e, (g2v) ywq0Var.f);
    }
}
