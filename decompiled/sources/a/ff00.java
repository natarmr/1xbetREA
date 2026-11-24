package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ff00 extends ir20 {
    public final char f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff00(v9d v9dVar, y78 y78Var, char c) {
        super(y78Var, v9dVar);
        v9dVar.getClass();
        this.f = c;
    }

    @Override // a.ir20
    public final boolean a() {
        return true;
    }

    @Override // a.ir20
    public final int b(k810 k810Var) {
        Integer numB = k810Var.b();
        if (numB != null) {
            return numB.intValue();
        }
        return -1;
    }

    @Override // a.ir20
    public final hr20 c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        int i = k810Var.b;
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
        k810 k810VarE = e(k810Var, i2);
        if (k810VarE == null) {
            return hr20.f;
        }
        v9d v9dVarS = idx.s(v9dVar2, k810VarE, false);
        char[] cArr = v9dVar2.b;
        if (cArr.length != 0) {
            return (!v9dVarS.f(v9dVar2) || v9dVarS.c(cArr.length - 1)) ? hr20.f : hr20.d;
        }
        jf4.o("List constraints should contain at least one item");
        return null;
    }

    @Override // a.ir20
    public final ar20 d() {
        char c = this.f;
        return (c == '-' || c == '*' || c == '+') ? wb.n : wb.o;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return k810Var.b == -1;
    }
}
