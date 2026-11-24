package a;

/* JADX INFO: loaded from: classes6.dex */
public final class gni implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eni f11588a;

    public gni(eni eniVar) {
        this.f11588a = eniVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        o3c o3cVar = (o3c) this.f11588a.b;
        int iIntValue = ((Integer) o3cVar.f24576a).intValue();
        long jLongValue = ((Long) o3cVar.b).longValue();
        xsu xsuVar = new xsu(new g090((gkr0) o3cVar.c, (sd80) o3cVar.d));
        tqt tqtVar = new tqt(new bst(), new tqt(), new art());
        g2v g2vVar = new g2v(o3cVar.x());
        rkt0 rkt0Var = new rkt0(o3cVar.x(), (byte) 2);
        mne mneVarH = ((psc) ((cad) o3cVar.e).b).h();
        x1x.x(mneVarH);
        return new cur0(vzg0Var, iIntValue, jLongValue, xsuVar, tqtVar, g2vVar, rkt0Var, mneVarH, new ctu(o3cVar.x()), (i1w0) o3cVar.i, (ctf0) o3cVar.j);
    }
}
