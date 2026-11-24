package a;

/* JADX INFO: loaded from: classes.dex */
public final class rds0 {
    public static final rds0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4x f30305a;

    static {
        v3x v3xVar = b4x.b;
        b = new rds0(rcf0.e);
        vtt0.H(0);
    }

    public rds0(rcf0 rcf0Var) {
        this.f30305a = b4x.o(rcf0Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            b4x b4xVar = this.f30305a;
            if (i2 >= b4xVar.size()) {
                return false;
            }
            qds0 qds0Var = (qds0) b4xVar.get(i2);
            for (boolean z : qds0Var.e) {
                if (z) {
                    if (qds0Var.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rds0.class != obj.getClass()) {
            return false;
        }
        return this.f30305a.equals(((rds0) obj).f30305a);
    }

    public final int hashCode() {
        return this.f30305a.hashCode();
    }
}
