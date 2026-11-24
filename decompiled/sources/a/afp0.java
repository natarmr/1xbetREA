package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes5.dex */
public abstract class afp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f790a = new zfn(new ccp0((byte) 12), (byte) 0);

    public static final ujv0 a(float f, long j) {
        return fem0.i(ujv0.f, ((int) (j >> 32)) / f, ((int) (j & 4294967295L)) / f);
    }

    public static final w6n b(ujv0 ujv0Var, w6n w6nVar, w6n w6nVar2, w6n w6nVar3) {
        w6nVar.getClass();
        w6nVar2.getClass();
        w6nVar3.getClass();
        if (ujv0Var.a(840)) {
            return w6nVar;
        }
        return ujv0Var.a(Response.BUSY_EVERYWHERE) ? w6nVar2 : w6nVar3;
    }

    public static final w6n c(gdp0 gdp0Var, gdp0 gdp0Var2, fet fetVar) {
        boolean zG = fetVar.g(gdp0Var) | fetVar.g(gdp0Var2);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = ((gdp0Var instanceof cdp0) && (gdp0Var2 instanceof cdp0)) ? w6n.e : w6n.c;
            fetVar.o0(objP);
        }
        return (w6n) objP;
    }
}
