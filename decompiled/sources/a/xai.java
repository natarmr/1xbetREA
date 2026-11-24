package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xai implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pai f40556a;

    public xai(pai paiVar) {
        this.f40556a = paiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        qgd qgdVar = (qgd) this.f40556a.b;
        yag yagVar = (yag) qgdVar.b;
        boolean zBooleanValue = ((Boolean) qgdVar.c).booleanValue();
        ul9 ul9Var = (ul9) qgdVar.d;
        y1u y1uVar = new y1u(ul9Var, (byte) 0);
        z1u z1uVar = new z1u(ul9Var, (byte) 1);
        a7q a7qVar = new a7q(ul9Var);
        g2v g2vVar = (g2v) qgdVar.e;
        duj dujVar = (duj) qgdVar.f;
        mne mneVarH = ((psc) ((cad) qgdVar.g).b).h();
        x1x.x(mneVarH);
        return new g9g(vzg0Var, yagVar, zBooleanValue, y1uVar, z1uVar, a7qVar, g2vVar, dujVar, mneVarH);
    }
}
