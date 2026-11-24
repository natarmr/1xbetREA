package a;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class qw9 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qcq0 f29425a;
    public final String b;
    public final CameraManager c;
    public final sje d;
    public final x04 e;
    public final p7m0 f;
    public final xae0 g;
    public final qoj0 h;
    public final vae0 i;
    public final bq9 j;
    public final c4m0 k;

    public qw9(o5d0 o5d0Var, qcq0 qcq0Var, String str, bby bbyVar) {
        o5d0Var.getClass();
        str.getClass();
        this.f29425a = qcq0Var;
        this.b = str;
        this.c = (CameraManager) o5d0Var.get();
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), kotlin.coroutines.e.c(qcq0Var.h, new rne("CXCP-CameraStatusMonitor"))));
        this.d = sjeVarA;
        this.e = o2e.X(false);
        p7m0 p7m0VarA = q7m0.a(c3a.f3663a);
        this.f = p7m0VarA;
        this.g = vtb.N(p7m0VarA);
        yje yjeVar = null;
        qoj0 qoj0VarB = roj0.b(0, 0, null, 7);
        this.h = qoj0VarB;
        this.i = vtb.M(qoj0VarB);
        this.j = nkb.y(new d09((Object) this, yjeVar, (byte) 13));
        this.k = qjj.W(sjeVarA, null, null, new qv3(this, yjeVar, (byte) 24), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e.a()) {
            this.k.cancel(null);
            d5c.G(this.d, null);
        }
    }
}
