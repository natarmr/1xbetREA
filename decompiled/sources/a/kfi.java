package a;

/* JADX INFO: loaded from: classes5.dex */
public final class kfi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yei f18197a;

    public kfi(yei yeiVar) {
        this.f18197a = yeiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        o3c o3cVar = (o3c) this.f18197a.b;
        int iIntValue = ((Integer) o3cVar.f24576a).intValue();
        String str = (String) o3cVar.b;
        cad cadVar = (cad) o3cVar.c;
        mne mneVarH = ((psc) cadVar.b).h();
        x1x.x(mneVarH);
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        return new guk(vzg0Var, iIntValue, str, mneVarH, new p4u(new z220(mneVarH2, new g090((gii0) o3cVar.d, (byte) 20), (ygm0) o3cVar.e, (knf0) o3cVar.f)), new dq00((yo4) o3cVar.g, ((d1p) o3cVar.h).W(), (String) o3cVar.i), (g2v) o3cVar.j);
    }
}
