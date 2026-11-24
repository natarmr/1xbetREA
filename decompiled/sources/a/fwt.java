package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class fwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aja f10276a;

    public fwt(aja ajaVar) {
        ajaVar.getClass();
        this.f10276a = ajaVar;
    }

    public ewt a() {
        return new ewt(new i89(this.f10276a.f964a.f30402a, (byte) 22), this, (byte) 0);
    }

    public Unit b(k3z k3zVar) {
        Object value;
        Object cgsVar;
        aja ajaVar = this.f10276a;
        ajaVar.getClass();
        rfs rfsVar = ajaVar.f964a;
        rfsVar.getClass();
        p7m0 p7m0Var = rfsVar.f30402a;
        do {
            value = p7m0Var.getValue();
            cgsVar = (egs) value;
            if (!(cgsVar instanceof bgs)) {
                cgsVar = new cgs(k3zVar);
            }
        } while (!p7m0Var.m(value, cgsVar));
        return Unit.f46060a;
    }

    public fwt(aja ajaVar, wsz wszVar) {
        ajaVar.getClass();
        this.f10276a = ajaVar;
    }
}
