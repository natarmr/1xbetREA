package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class bxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g050 f3386a;
    public final uz40 b = new uz40(Boolean.FALSE);
    public n5a c;

    public bxq0(g050 g050Var) {
        this.f3386a = g050Var;
    }

    public final void a() {
        this.b.o1(Boolean.FALSE);
    }

    public final boolean b() {
        uz40 uz40Var = this.b;
        return ((Boolean) ((hgk0) uz40Var.c).getValue()).booleanValue() || ((Boolean) ((hgk0) uz40Var.d).getValue()).booleanValue();
    }

    public final Object c(c050 c050Var, bnn0 bnn0Var) {
        yje yjeVar = null;
        em4 em4Var = new em4(this, new hhb0(this, yjeVar, (byte) 25), c050Var, yjeVar, (byte) 4);
        g050 g050Var = this.f3386a;
        g050Var.getClass();
        Object objJ = d5c.J(bnn0Var, new lpp(c050Var, g050Var, em4Var, yjeVar, (byte) 4));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }
}
