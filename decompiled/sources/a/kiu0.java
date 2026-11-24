package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class kiu0 implements a8z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f18354a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public diu0 e;

    public kiu0(sgy sgyVar, Function0 function0, Function0 function1, Function0 function2) {
        sgyVar.getClass();
        this.f18354a = sgyVar;
        this.b = function0;
        this.c = function1;
        this.d = function2;
    }

    @Override // a.a8z
    public final Object getValue() {
        diu0 diu0Var = this.e;
        if (diu0Var != null) {
            return diu0Var;
        }
        piu0 piu0Var = (piu0) this.b.invoke();
        miu0 miu0Var = (miu0) this.c.invoke();
        wbf wbfVar = (wbf) this.d.invoke();
        piu0Var.getClass();
        miu0Var.getClass();
        wbfVar.getClass();
        h0q0 h0q0Var = new h0q0(piu0Var, miu0Var, wbfVar);
        sgy sgyVar = this.f18354a;
        sgyVar.getClass();
        String strV = sgyVar.v();
        if (strV == null) {
            jf4.o("Local and anonymous classes can not be ViewModels");
            return null;
        }
        diu0 diu0VarT = h0q0Var.t(sgyVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV));
        this.e = diu0VarT;
        return diu0VarT;
    }
}
