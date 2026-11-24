package a;

/* JADX INFO: loaded from: classes.dex */
public final class dp00 {
    public static final dp00 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mva f6438a;
    public final mva b;
    public final mva c;
    public final boolean d;
    public final boolean e;

    static {
        bp00 bp00Var = bp00.c;
        f = new dp00(bp00Var, bp00Var, bp00Var);
    }

    public dp00(mva mvaVar, mva mvaVar2, mva mvaVar3) {
        this.f6438a = mvaVar;
        this.b = mvaVar2;
        this.c = mvaVar3;
        this.d = (mvaVar instanceof zo00) || (mvaVar3 instanceof zo00) || (mvaVar2 instanceof zo00);
        this.e = (mvaVar instanceof bp00) && (mvaVar3 instanceof bp00) && (mvaVar2 instanceof bp00);
    }

    public static dp00 a(dp00 dp00Var, int i) {
        int i2 = i & 1;
        mva mvaVar = bp00.c;
        mva mvaVar2 = i2 != 0 ? dp00Var.f6438a : mvaVar;
        mva mvaVar3 = (i & 2) != 0 ? dp00Var.b : mvaVar;
        if ((i & 4) != 0) {
            mvaVar = dp00Var.c;
        }
        return new dp00(mvaVar2, mvaVar3, mvaVar);
    }

    public final dp00 b(gp00 gp00Var) {
        gp00Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        if (iOrdinal == 0) {
            return a(this, 6);
        }
        if (iOrdinal == 1) {
            return a(this, 5);
        }
        if (iOrdinal == 2) {
            return a(this, 3);
        }
        t9f.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp00)) {
            return false;
        }
        dp00 dp00Var = (dp00) obj;
        return this.f6438a.equals(dp00Var.f6438a) && this.b.equals(dp00Var.b) && this.c.equals(dp00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6438a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f6438a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
