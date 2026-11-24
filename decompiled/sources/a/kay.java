package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class kay implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvu f17988a;
    public final hzs0 b;
    public final fay c;
    public final iys0 d;
    public final oqe0 e;

    public kay(nvu nvuVar, hzs0 hzs0Var, fay fayVar, iys0 iys0Var, oqe0 oqe0Var) {
        this.f17988a = nvuVar;
        this.b = hzs0Var;
        this.c = fayVar;
        this.d = iys0Var;
        this.e = oqe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hcp0 hcp0Var = (hcp0) this.f17988a.d;
        foc focVarN = this.d.n();
        return hcp0Var.m(this.b, fay.a(fay.a(this.c, null, false, null, focVarN != null ? focVarN.I() : null, 31), null, this.e.d(), null, null, 59));
    }
}
