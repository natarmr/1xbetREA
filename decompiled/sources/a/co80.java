package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class co80 extends ir20 {
    public final Function2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co80(v9d v9dVar, y78 y78Var, Function2 function2) {
        super(y78Var, v9dVar);
        v9dVar.getClass();
        function2.getClass();
        this.f = function2;
    }

    @Override // a.ir20
    public final boolean a() {
        return false;
    }

    @Override // a.ir20
    public final int b(k810 k810Var) {
        return k810Var.c();
    }

    @Override // a.ir20
    public final hr20 c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        int i = k810Var.b;
        if (i != -1) {
            return hr20.e;
        }
        if (i != -1) {
            throw new byw("");
        }
        v9d v9dVar2 = this.f15236a;
        v9dVar2.getClass();
        if (i != -1) {
            throw new byw("");
        }
        s43 s43Var = new s43(v9dVar2, (byte) 10);
        k810 k810VarD = k810Var;
        int i2 = 1;
        while (((Boolean) s43Var.invoke(k810VarD)).booleanValue()) {
            k810VarD = k810VarD.d();
            if (k810VarD == null) {
                i2++;
                break;
            }
            i2++;
            if (i2 > 4) {
                break;
            }
        }
        if (i2 >= 2) {
            return hr20.f;
        }
        v9d v9dVarS = idx.s(v9dVar2, k810Var, true);
        if (!idx.X(v9dVarS, v9dVar2)) {
            return hr20.f;
        }
        k810 k810VarE = k810Var.e(idx.x(v9dVarS, k810Var.d) + 1);
        return (k810VarE == null || ((Boolean) this.f.invoke(k810VarE, v9dVarS)).booleanValue()) ? hr20.f : hr20.e;
    }

    @Override // a.ir20
    public final ar20 d() {
        return wb.v;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return true;
    }
}
