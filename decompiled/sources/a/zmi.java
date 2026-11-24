package a;

/* JADX INFO: loaded from: classes5.dex */
public final class zmi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rki f44627a;

    public zmi(rki rkiVar) {
        this.f44627a = rkiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        ani aniVar = (ani) this.f44627a.b;
        v480 v480Var = aniVar.f1154a;
        mne mneVarH = ((psc) aniVar.b.b).h();
        x1x.x(mneVarH);
        ozi oziVar = aniVar.c;
        awu awuVar = (awu) oziVar.x.get();
        x1x.x(awuVar);
        return new v580(vzg0Var, v480Var, mneVarH, awuVar, oziVar.a());
    }
}
