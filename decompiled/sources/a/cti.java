package a;

import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class cti implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ msi f4937a;

    public cti(msi msiVar) {
        this.f4937a = msiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        dti dtiVar = (dti) this.f4937a.c;
        SelectTimeFilterScreenParams selectTimeFilterScreenParams = dtiVar.f6657a;
        mne mneVarH = ((psc) dtiVar.b.b).h();
        x1x.x(mneVarH);
        sqt sqtVar = new sqt();
        ctf0 ctf0Var = dtiVar.c;
        ctf0Var.getClass();
        gwg0 gwg0Var = new gwg0(selectTimeFilterScreenParams, sqtVar);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 28);
        rwj rwjVar = mneVarH.f22085a;
        return new p3i0(vzg0Var, gwg0Var, iv80Var, cvm0.p(rwjVar, rwjVar));
    }
}
