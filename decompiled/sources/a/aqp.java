package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class aqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fix f1307a;
    public final gst0 b;
    public final rou c;
    public final ieu d;
    public final uzc e;

    public aqp(fix fixVar, gst0 gst0Var, rou rouVar, ieu ieuVar, uzc uzcVar) {
        fixVar.getClass();
        gst0Var.getClass();
        this.f1307a = fixVar;
        this.b = gst0Var;
        this.c = rouVar;
        this.d = ieuVar;
        this.e = uzcVar;
    }

    public final Object a(long j, long j2, bnn0 bnn0Var) {
        Object objN = slb.N(new a1g(bkb.h0(30L, TimeUnit.SECONDS, new ypp(this, j, j2, null)), new zpp(this, null), (byte) 20), bnn0Var);
        return objN == wne.f39444a ? objN : Unit.f46060a;
    }
}
