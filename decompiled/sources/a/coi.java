package a;

/* JADX INFO: loaded from: classes6.dex */
public final class coi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eni f4702a;

    public coi(eni eniVar) {
        this.f4702a = eniVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        doi doiVar = (doi) this.f4702a.b;
        String str = doiVar.f;
        cad cadVar = new cad(doiVar.h, (byte) 17);
        knf0 knf0Var = doiVar.i;
        mne mneVarH = ((psc) doiVar.g.b).h();
        x1x.x(mneVarH);
        ivn ivnVar = new ivn(new nr(cadVar, knf0Var, mneVarH));
        i1w0 i1w0Var = doiVar.c;
        duj dujVar = doiVar.f6417a;
        m1e m1eVar = doiVar.b;
        mne mneVarH2 = ((psc) doiVar.g.b).h();
        x1x.x(mneVarH2);
        return new u3a0(m1eVar, mneVarH2, dujVar, doiVar.d, ivnVar, doiVar.e, vzg0Var, i1w0Var, str);
    }
}
