package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class vmu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37689a;
    public final int b;
    public final int c;
    public final int d;

    public vmu0(int i, int i2, int i3, int i4) {
        this.f37689a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(gp00 gp00Var) {
        gp00Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        if (iOrdinal == 0) {
            jf4.o("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (iOrdinal == 1) {
            return this.f37689a;
        }
        if (iOrdinal == 2) {
            return this.b;
        }
        t9f.b();
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmu0)) {
            return false;
        }
        vmu0 vmu0Var = (vmu0) obj;
        return this.f37689a == vmu0Var.f37689a && this.b == vmu0Var.b && this.c == vmu0Var.c && this.d == vmu0Var.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.f37689a);
    }
}
