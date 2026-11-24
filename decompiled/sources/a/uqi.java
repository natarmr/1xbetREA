package a;

/* JADX INFO: loaded from: classes6.dex */
public final class uqi implements giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ppi f36120a;

    public uqi(ppi ppiVar) {
        this.f36120a = ppiVar;
    }

    @Override // a.giu0
    public final diu0 c(Object obj) {
        i1w0 i1w0Var = (i1w0) obj;
        g45 g45Var = (g45) this.f36120a.b;
        ljf0 ljf0Var = new ljf0(new iw20(new y3v((vwb0) g45Var.f10647a, (vby) g45Var.b)));
        vwb0 vwb0Var = (vwb0) g45Var.f10647a;
        vby vbyVar = (vby) g45Var.b;
        yfu yfuVar = new yfu(new iw20(new y3v(vwb0Var, vbyVar)));
        ih5 ih5Var = new ih5((kt2) g45Var.d, (byte) 5);
        au0 au0Var = (au0) g45Var.e;
        ctf0 ctf0Var = (ctf0) g45Var.f;
        mne mneVarH = ((psc) ((cad) g45Var.g).b).h();
        x1x.x(mneVarH);
        ocl oclVar = new ocl(new iw20(new y3v(vwb0Var, vbyVar)));
        yfu yfuVar2 = new yfu(new iw20(new y3v(vwb0Var, vbyVar)));
        pru pruVar = (pru) g45Var.c;
        return new sld0(i1w0Var, ljf0Var, yfuVar, ih5Var, au0Var, ctf0Var, mneVarH, new nr((Object) oclVar, (Object) yfuVar2, (Object) pruVar, (byte) 29), pruVar);
    }
}
