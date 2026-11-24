package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e98 extends ir20 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e98(v9d v9dVar, y78 y78Var, byte b) {
        super(y78Var, v9dVar);
        this.f = b;
    }

    @Override // a.ir20
    public final boolean a() {
        switch (this.f) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // a.ir20
    public final int b(k810 k810Var) {
        switch (this.f) {
            case 0:
                Integer numB = k810Var.b();
                if (numB != null) {
                    return numB.intValue();
                }
                return -1;
            case 1:
                return k810Var.c();
            default:
                Integer numB2 = k810Var.b();
                if (numB2 != null) {
                    return numB2.intValue();
                }
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    @Override // a.ir20
    public final hr20 c(v9d v9dVar, k810 k810Var) {
        k810 k810VarE;
        byte b = this.f;
        v9d v9dVar2 = this.f15236a;
        v9dVar.getClass();
        switch (b) {
            case 0:
                if (k810Var.b == -1) {
                    return !idx.w(idx.r(v9dVar2, k810Var), v9dVar2) ? hr20.f : hr20.d;
                }
                throw new byw("");
            case 1:
                return k810Var.b != -1 ? hr20.e : hr20.f;
            default:
                int i = k810Var.b;
                if (i != -1) {
                    throw new byw("");
                }
                v9dVar2.getClass();
                if (i != -1) {
                    throw new byw("");
                }
                s43 s43Var = new s43(v9dVar2, (byte) 10);
                int i2 = 1;
                k810 k810VarD = k810Var;
                while (((Boolean) s43Var.invoke(k810VarD)).booleanValue()) {
                    k810VarD = k810VarD.d();
                    if (k810VarD == null) {
                        i2++;
                    } else {
                        i2++;
                        if (i2 > 4) {
                        }
                    }
                    k810VarE = e(k810Var, i2);
                    if (k810VarE == null) {
                        return hr20.f;
                    }
                    return !idx.w(idx.s(v9dVar2, k810VarE, false), v9dVar2) ? hr20.f : hr20.e;
                }
                k810VarE = e(k810Var, i2);
                if (k810VarE == null) {
                    return hr20.f;
                }
                if (!idx.w(idx.s(v9dVar2, k810VarE, false), v9dVar2)) {
                }
        }
    }

    @Override // a.ir20
    public final ar20 d() {
        switch (this.f) {
            case 0:
                return wb.q;
            case 1:
                return cy2.Y;
            default:
                return wb.p;
        }
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        switch (this.f) {
            case 0:
                return k810Var.b == -1;
            case 1:
                return k810Var.b == -1;
            default:
                return k810Var.b == -1;
        }
    }
}
