package a;

/* JADX INFO: loaded from: classes4.dex */
public final class owi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xvi f25966a;

    public owi(xvi xviVar) {
        this.f25966a = xviVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        pwi pwiVar = (pwi) this.f25966a.b;
        String str = (String) pwiVar.h;
        afm0 afm0Var = new afm0((gii0) pwiVar.b, (byte) 5);
        mne mneVarH = ((psc) ((cad) pwiVar.f).b).h();
        x1x.x(mneVarH);
        xfu xfuVar = new xfu(new ywu(afm0Var, mneVarH, (knf0) pwiVar.c));
        m1e m1eVar = (m1e) pwiVar.g;
        ocl oclVar = (ocl) pwiVar.i;
        duj dujVar = (duj) pwiVar.d;
        mne mneVarH2 = ((psc) ((cad) pwiVar.f).b).h();
        x1x.x(mneVarH2);
        return new qnp0(vzg0Var, str, xfuVar, m1eVar, oclVar, dujVar, mneVarH2, (i1w0) pwiVar.f27712a, (ctf0) pwiVar.e, (pru) pwiVar.j);
    }
}
