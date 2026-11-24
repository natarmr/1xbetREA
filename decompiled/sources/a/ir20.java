package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ir20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9d f15236a;
    public final y78 b;
    public int c;
    public hr20 d;
    public k810 e;

    public ir20(y78 y78Var, v9d v9dVar) {
        v9dVar.getClass();
        this.f15236a = v9dVar;
        this.b = y78Var;
        this.c = -2;
    }

    public boolean a() {
        return false;
    }

    public int b(k810 k810Var) {
        return k810Var.c();
    }

    public hr20 c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        return k810Var.b == -1 ? new hr20(2, 1, 1) : hr20.e;
    }

    public ar20 d() {
        return wb.s;
    }

    public final k810 e(k810 k810Var, int i) {
        k810 k810Var2;
        int i2 = k810Var.c;
        k810 k810Var3 = this.e;
        if (k810Var3 != null && k810Var3.c > i2) {
            return k810Var3;
        }
        int i3 = i - 1;
        int i4 = 0;
        k810 k810VarD = k810Var;
        while (true) {
            k810Var2 = null;
            if (i4 >= i3) {
                while (k810VarD.a() == null) {
                    k810VarD = k810VarD.d();
                    if (k810VarD == null) {
                    }
                }
                break;
            }
            k810VarD = k810Var.d();
            if (k810VarD != null) {
                i4++;
            }
            k810VarD = null;
            break;
        }
        if (k810VarD != null && k810VarD.c > i2) {
            k810Var2 = k810VarD;
        }
        this.e = k810Var2;
        return k810VarD;
    }

    public boolean f(k810 k810Var) {
        return true;
    }
}
