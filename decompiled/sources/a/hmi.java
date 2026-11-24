package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hmi implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rki f13308a;

    public hmi(rki rkiVar) {
        this.f13308a = rkiVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        imi imiVar = (imi) this.f13308a.b;
        gxu gxuVarN = imiVar.f15027a.f32574a.n();
        sp4 sp4Var = imiVar.f15027a;
        rek0 rek0Var = new rek0((byte) 28);
        epc epcVarL = sp4Var.f32574a.l();
        kt2 kt2Var = imiVar.b;
        yo4 yo4Var = new yo4(kt2Var, (byte) 0);
        d1p d1pVar = imiVar.c;
        return new hl60(vzg0Var, gxuVarN, rek0Var, epcVarL, yo4Var, d1pVar.b(), d1pVar.w(), new ort(imiVar.d, (byte) 3), imiVar.e, new nyb(sp4Var.f32574a.x()), sp4Var, imiVar.f, imiVar.g, imiVar.h, imiVar.i.booleanValue(), imiVar.j, imiVar.k, imiVar.l, new myb(sp4Var.f32574a.x()), imiVar.m, d1pVar.j(), new vd1(kt2Var, (byte) 4), imiVar.n);
    }
}
