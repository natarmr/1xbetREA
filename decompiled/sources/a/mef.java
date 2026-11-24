package a;

/* JADX INFO: loaded from: classes.dex */
public final class mef implements wls0 {
    public final int b;

    public mef(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        jf4.o("durationMillis must be > 0.");
        throw null;
    }

    @Override // a.wls0
    public final hms0 a(cns0 cns0Var, u1x u1xVar) {
        if (u1xVar instanceof hhn0) {
            return ((hhn0) u1xVar).c == ibj.f14489a ? new g660(cns0Var, u1xVar) : new nef(cns0Var, u1xVar, this.b);
        }
        return new g660(cns0Var, u1xVar);
    }
}
