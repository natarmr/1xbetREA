package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rxi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ msi f31266a;

    public rxi(msi msiVar) {
        this.f31266a = msiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        txi txiVar = (txi) this.f31266a.c;
        int iIntValue = txiVar.f34701a.intValue();
        m1e m1eVar = txiVar.b;
        zpu zpuVar = new zpu(txiVar.a(), new ani0(txiVar.g), (byte) 4);
        tsc tscVar = new tsc(txiVar.a());
        owp0 owp0Var = new owp0(txiVar.a(), (byte) 13);
        luu luuVarW = ((daf) txiVar.h.f35622a).w();
        x1x.x(luuVarW);
        mne mneVarH = ((psc) txiVar.c.b).h();
        x1x.x(mneVarH);
        return new edr0(vzg0Var, iIntValue, m1eVar, zpuVar, tscVar, owp0Var, luuVarW, mneVarH, txiVar.i, txiVar.j, txiVar.k, txiVar.l.W(), new bzt(txiVar.m), txiVar.n, new tsc(txiVar.a()));
    }
}
