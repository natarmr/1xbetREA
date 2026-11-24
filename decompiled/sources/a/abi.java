package a;

/* JADX INFO: loaded from: classes3.dex */
public final class abi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r5i f581a;

    public abi(r5i r5iVar) {
        this.f581a = r5iVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        bbi bbiVar = (bbi) this.f581a.c;
        long jLongValue = bbiVar.l.longValue();
        ctf0 ctf0Var = bbiVar.d;
        mne mneVarH = ((psc) bbiVar.b.b).h();
        x1x.x(mneVarH);
        return new at9(jLongValue, vzg0Var, ctf0Var, mneVarH, new a7q((or9) bbiVar.n.get()), new a1d((or9) bbiVar.n.get()), bbiVar.e, bbiVar.m, bbiVar.g, new ehf0(new ag3(bbiVar.h, (byte) 1), bbiVar.i, (byte) 14));
    }
}
