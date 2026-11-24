package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xpj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41272a;
    public final Function1 b;
    public final boolean c;
    public cfq d;
    public final qv2 e;
    public cfq f;
    public cfq g;

    public xpj0(boolean z, Function0 function0, Function0 function1, ypj0 ypj0Var, Function1 function2, boolean z2) {
        this.f41272a = z;
        this.b = function2;
        this.c = z2;
        if (z && ypj0Var == ypj0.c) {
            jf4.o("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && ypj0Var == ypj0.f43033a) {
            jf4.o("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.d = tpj0.f34337a;
        this.e = new qv2(ypj0Var, new vpj0(function0, (byte) 0), function1, new goi0(this, (byte) 4), function2);
        this.f = new jfk0();
        this.g = new jfk0();
    }

    public static Object a(xpj0 xpj0Var, ypj0 ypj0Var, cfq cfqVar, bnn0 bnn0Var) throws Throwable {
        Object objB = xpj0Var.e.b(ypj0Var, c050.f3507a, new wpj0(xpj0Var, ((agk0) xpj0Var.e.m).l(), cfqVar, null), bnn0Var);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public final Object b(bnn0 bnn0Var) throws Throwable {
        ypj0 ypj0Var = ypj0.b;
        if (!((Boolean) this.b.invoke(ypj0Var)).booleanValue()) {
            return Unit.f46060a;
        }
        Object objA = a(this, ypj0Var, this.f, bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final ypj0 c() {
        return (ypj0) ((hgk0) ((pz40) this.e.h)).getValue();
    }

    public final Object d(bnn0 bnn0Var) throws Throwable {
        if (this.c) {
            jf4.n("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        ypj0 ypj0Var = ypj0.f43033a;
        if (!((Boolean) this.b.invoke(ypj0Var)).booleanValue()) {
            return Unit.f46060a;
        }
        Object objA = a(this, ypj0Var, this.g, bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final boolean e() {
        return ((hgk0) ((pz40) this.e.h)).getValue() != ypj0.f43033a;
    }

    public final Object f(bnn0 bnn0Var) throws Throwable {
        if (this.f41272a) {
            jf4.n("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        ypj0 ypj0Var = ypj0.c;
        if (!((Boolean) this.b.invoke(ypj0Var)).booleanValue()) {
            return Unit.f46060a;
        }
        Object objA = a(this, ypj0Var, this.g, bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final Object g(bnn0 bnn0Var) throws Throwable {
        no20 no20VarJ = this.e.j();
        ypj0 ypj0Var = ypj0.c;
        if (!no20VarJ.f23849a.containsKey(ypj0Var)) {
            ypj0Var = ypj0.b;
        }
        if (!((Boolean) this.b.invoke(ypj0Var)).booleanValue()) {
            return Unit.f46060a;
        }
        Object objA = a(this, ypj0Var, this.f, bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }
}
