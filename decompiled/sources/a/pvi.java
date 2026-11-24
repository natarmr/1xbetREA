package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pvi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27663a;
    public final /* synthetic */ n5d0 b;

    public /* synthetic */ pvi(n5d0 n5d0Var, byte b) {
        this.f27663a = b;
        this.b = n5d0Var;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        byte b = this.f27663a;
        n5d0 n5d0Var = this.b;
        switch (b) {
            case 0:
                rvi rviVar = (rvi) ((msi) n5d0Var).c;
                ywu ywuVar = new ywu(rviVar.f31168a, new zwu(new z220(new afm0(rviVar.b, (byte) 3), rviVar.c, rviVar.d, rviVar.e)), new wgu(rviVar.f));
                mne mneVar = rviVar.e;
                return new tpn0(vzg0Var, ywuVar, mneVar, new kvu(new z220(new afm0(rviVar.b, (byte) 3), rviVar.c, rviVar.d, mneVar)), rviVar.g, new m6m0((byte) 8), rviVar.h, rviVar.i, rviVar.j, rviVar.k, rviVar.f31168a);
            default:
                svi sviVar = (svi) ((rti) n5d0Var).b;
                ywu ywuVar2 = new ywu(sviVar.f32867a, new zwu(new z220(new afm0(sviVar.b, (byte) 3), sviVar.c, sviVar.d, sviVar.e)), sviVar.f);
                mne mneVar2 = sviVar.e;
                return new tpn0(vzg0Var, ywuVar2, mneVar2, new kvu(new z220(new afm0(sviVar.b, (byte) 3), sviVar.c, sviVar.d, mneVar2)), sviVar.g, new m6m0((byte) 8), sviVar.h, sviVar.i, sviVar.j, sviVar.k, sviVar.f32867a);
        }
    }
}
