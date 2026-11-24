package a;

import org.xplatform.sportgame.subgames.api.SubGamesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class zui implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rti f45010a;

    public zui(rti rtiVar) {
        this.f45010a = rtiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        g45 g45Var = (g45) this.f45010a.b;
        SubGamesParams subGamesParams = (SubGamesParams) g45Var.f10647a;
        i1w0 i1w0Var = (i1w0) g45Var.b;
        reu reuVarC = ((pcl0) g45Var.c).c();
        x1x.x(reuVarC);
        pcl0 pcl0Var = (pcl0) g45Var.c;
        rbu rbuVarA = pcl0Var.a();
        s1u s1uVarT = pcl0Var.t();
        x1x.x(s1uVarT);
        s1u s1uVarX = pcl0Var.x();
        x1x.x(s1uVarX);
        evz evzVar = (evz) g45Var.d;
        mne mneVarH = ((psc) ((cad) g45Var.e).b).h();
        x1x.x(mneVarH);
        return new dzm0(vzg0Var, subGamesParams, i1w0Var, reuVarC, rbuVarA, s1uVarT, s1uVarX, evzVar, mneVarH, new vmr((bn6) g45Var.f, ((d1p) g45Var.g).n0()), (ctf0) g45Var.h);
    }
}
