package a;

/* JADX INFO: loaded from: classes5.dex */
public final class pfi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26908a;
    public final swp0 b;

    public pfi0(jd jdVar) {
        Integer num = jdVar.f;
        int iIntValue = num != null ? num.intValue() : 0;
        ywp0 ywp0Var = jdVar.i;
        if (ywp0Var == null) {
            jf4.k(null);
            throw null;
        }
        swp0 swp0Var = new swp0(ywp0Var, false);
        this.f26908a = iIntValue;
        this.b = swp0Var;
    }
}
