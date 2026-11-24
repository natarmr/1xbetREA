package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class fee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f9402a;
    public l7m0 b;
    public final n0o0 c;
    public final pz40 d;
    public final zbk e;
    public final pz40 f;
    public final zbk g;
    public static final /* synthetic */ iiy[] i = {new j0d0(fee.class, "value", "getValue()Ljava/lang/Object;", 0), new j0d0(fee.class, "uiValue", "getUiValue()Ljava/lang/Object;", 0)};
    public static final nwd h = new nwd();

    public fee(Function1 function1, Object obj) {
        this.f9402a = function1;
        this.c = maz.b(new xhd(obj, (byte) 1));
        pz40 pz40VarA = a();
        this.d = pz40VarA;
        zbk zbkVarB = jgk0.b(new jwd(this, (byte) 7));
        this.e = zbkVarB;
        this.f = pz40VarA;
        this.g = zbkVarB;
    }

    public final pz40 a() {
        return (pz40) this.c.getValue();
    }

    public final Object b() {
        iiy iiyVar = i[1];
        zbk zbkVar = this.g;
        zbkVar.getClass();
        return zbkVar.getValue();
    }

    public final Object c() {
        iiy iiyVar = i[0];
        pz40 pz40Var = this.f;
        pz40Var.getClass();
        return pz40Var.getValue();
    }

    public final void d(Object obj) {
        a().setValue(obj);
    }
}
