package a;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class jg60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f16466a;
    public final n0o0 b = maz.b(new pu50(this, 12));

    public jg60(Runnable runnable) {
        this.f16466a = runnable;
    }

    public final void a(clz clzVar, eg60 eg60Var) {
        clzVar.getClass();
        eg60Var.getClass();
        glz glzVarX = clzVar.x();
        if (glzVarX.i == lkz.f20223a) {
            return;
        }
        dg60 dg60Var = new dg60(eg60Var, new fg60(clzVar, eg60Var));
        eg60Var.f7748a.add(dg60Var);
        dg60Var.j(false);
        ye50.a(c().c, dg60Var);
        lz2 lz2Var = new lz2(dg60Var, this, glzVarX);
        glzVarX.a(lz2Var);
        eg60Var.c.add(new gg60(glzVarX, lz2Var, (byte) 0));
    }

    public final void b(eg60 eg60Var) {
        eg60Var.getClass();
        dg60 dg60Var = new dg60(eg60Var, new fg60(null, eg60Var));
        eg60Var.f7748a.add(dg60Var);
        ye50.a(c().c, dg60Var);
    }

    public final hg60 c() {
        return (hg60) this.b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        c().c.c(new ag60(onBackInvokedDispatcher, 0), 1);
        c().c.c(new ag60(onBackInvokedDispatcher, 1000000), 0);
    }
}
