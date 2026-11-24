package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tkn0 implements ghs0, w9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okn0 f34104a;

    public tkn0(okn0 okn0Var) {
        this.f34104a = okn0Var;
    }

    @Override // a.ghs0
    public final Object a(ehs0 ehs0Var, Function2 function2, bnn0 bnn0Var) {
        return e(ehs0Var, function2, bnn0Var);
    }

    @Override // a.jva0
    public final Object b(String str, Function1 function1, zje zjeVar) {
        bln0 bln0VarZ0 = this.f34104a.Z0(str);
        try {
            Object objInvoke = function1.invoke(bln0VarZ0);
            ay3.L(bln0VarZ0, null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(bln0VarZ0, th);
                throw th2;
            }
        }
    }

    @Override // a.ghs0
    public final Object c(bnn0 bnn0Var) {
        return Boolean.valueOf(this.f34104a.f25413a.P0());
    }

    @Override // a.w9e0
    public final qpg0 d() {
        return this.f34104a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ehs0 ehs0Var, Function2 function2, zje zjeVar) throws Throwable {
        skn0 skn0Var;
        tkn0 tkn0Var;
        w7r w7rVar;
        if (zjeVar instanceof skn0) {
            skn0Var = (skn0) zjeVar;
            int i = skn0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                skn0Var.m = i - Integer.MIN_VALUE;
            } else {
                skn0Var = new skn0(this, zjeVar);
            }
        } else {
            skn0Var = new skn0(this, zjeVar);
        }
        Object obj = skn0Var.k;
        Object obj2 = wne.f39444a;
        int i2 = skn0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            w7r w7rVar2 = this.f34104a.f25413a;
            w7rVar2.P0();
            int iOrdinal = ehs0Var.ordinal();
            if (iOrdinal == 0) {
                w7rVar2.d();
            } else if (iOrdinal == 1) {
                w7rVar2.c();
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                w7rVar2.a();
            }
            try {
                Object lva0Var = new lva0(this, (byte) 1);
                skn0Var.i = this;
                skn0Var.j = w7rVar2;
                skn0Var.m = 1;
                Object objInvoke = function2.invoke(lva0Var, skn0Var);
                if (objInvoke == obj2) {
                    return obj2;
                }
                tkn0Var = this;
                w7rVar = w7rVar2;
                obj = objInvoke;
            } catch (Throwable th) {
                th = th;
                tkn0Var = this;
                w7rVar = w7rVar2;
                w7rVar.k();
                if (!w7rVar.P0()) {
                    tkn0Var.getClass();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w7rVar = skn0Var.j;
            tkn0Var = skn0Var.i;
            try {
                z1x.P(obj);
            } catch (Throwable th2) {
                th = th2;
                w7rVar.k();
                if (!w7rVar.P0()) {
                    tkn0Var.getClass();
                }
                throw th;
            }
        }
        w7rVar.r();
        w7rVar.k();
        if (!w7rVar.P0()) {
            tkn0Var.getClass();
        }
        return obj;
    }
}
