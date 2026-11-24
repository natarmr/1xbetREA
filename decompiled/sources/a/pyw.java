package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pyw extends kyw {
    public final Executor p;
    public final Object q = new Object();
    public b1x r;
    public oyw s;

    public pyw(Executor executor) {
        this.p = executor;
    }

    @Override // a.kyw
    public final b1x a(e1x e1xVar) {
        return e1xVar.b();
    }

    @Override // a.kyw
    public final void c() {
        synchronized (this.q) {
            try {
                b1x b1xVar = this.r;
                if (b1xVar != null) {
                    b1xVar.close();
                    this.r = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.kyw
    public final void f(b1x b1xVar) {
        synchronized (this.q) {
            try {
                if (!this.o) {
                    b1xVar.close();
                    return;
                }
                if (this.s != null) {
                    if (b1xVar.K0().h() <= this.s.b.K0().h()) {
                        b1xVar.close();
                    } else {
                        b1x b1xVar2 = this.r;
                        if (b1xVar2 != null) {
                            b1xVar2.close();
                        }
                        this.r = b1xVar;
                    }
                    return;
                }
                oyw oywVar = new oyw(b1xVar, this);
                this.s = oywVar;
                m3x m3xVarB = b(oywVar);
                xsu xsuVar = new xsu(oywVar);
                m3xVarB.a(new mfr((Object) m3xVarB, (Object) xsuVar, (byte) 0), bnk.a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
