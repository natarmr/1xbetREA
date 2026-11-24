package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zub0 implements ca60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0a f45002a;
    public final hy40 b;
    public cvb0 c;
    public final dvb0 d;
    public dfr e;
    public boolean f = false;

    public zub0(n0a n0aVar, hy40 hy40Var, dvb0 dvb0Var) {
        this.f45002a = n0aVar;
        this.b = hy40Var;
        this.d = dvb0Var;
        synchronized (this) {
            this.c = (cvb0) hy40Var.d();
        }
    }

    @Override // a.ca60
    public final void a(Object obj) {
        r0a r0aVar = (r0a) obj;
        r0a r0aVar2 = r0a.e;
        byte b = 0;
        cvb0 cvb0Var = cvb0.f5022a;
        if (r0aVar == r0aVar2 || r0aVar == r0a.c || r0aVar == r0a.b || r0aVar == r0a.f29622a) {
            b(cvb0Var);
            if (this.f) {
                this.f = false;
                dfr dfrVar = this.e;
                if (dfrVar != null) {
                    dfrVar.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((r0aVar == r0a.f || r0aVar == r0a.g || r0aVar == r0a.d) && !this.f) {
            n0a n0aVar = this.f45002a;
            b(cvb0Var);
            ArrayList arrayList = new ArrayList();
            tu9 tu9Var = new tu9();
            tu9Var.c = new msf0();
            wu9 wu9Var = new wu9(tu9Var);
            tu9Var.b = wu9Var;
            tu9Var.f34540a = hne.class;
            try {
                yub0 yub0Var = new yub0(tu9Var, n0aVar);
                arrayList.add(yub0Var);
                n0aVar.z(bnk.a(), yub0Var);
                tu9Var.f34540a = "waitForCaptureResult";
            } catch (Exception e) {
                wu9Var.b(e);
            }
            qbb qbbVarK0 = ro4.k0(new dfr(wu9Var), new xub0(this), bnk.a());
            xub0 xub0Var = new xub0(this);
            qbb qbbVarK1 = ro4.k0(qbbVarK0, new a1d((Object) xub0Var, (byte) 26), bnk.a());
            this.e = qbbVarK1;
            y3v y3vVar = new y3v(this, arrayList, n0aVar);
            qbbVarK1.a(new mfr(qbbVarK1, y3vVar, b), bnk.a());
            this.f = true;
        }
    }

    public final void b(cvb0 cvb0Var) {
        synchronized (this) {
            try {
                if (this.c.equals(cvb0Var)) {
                    return;
                }
                this.c = cvb0Var;
                l8x.U("StreamStateObserver", "Update Preview stream state to " + cvb0Var);
                this.b.i(cvb0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.ca60
    public final void onError(Throwable th) {
        dfr dfrVar = this.e;
        if (dfrVar != null) {
            dfrVar.cancel(false);
            this.e = null;
        }
        b(cvb0.f5022a);
    }
}
