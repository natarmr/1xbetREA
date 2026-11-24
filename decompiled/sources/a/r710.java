package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r710 extends o710 {
    public static final q710 e = new q710(null);
    public static final r710 f = new r710(1, 0);

    public r710(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // a.o710
    public final boolean equals(Object obj) {
        if (!(obj instanceof r710)) {
            return false;
        }
        if (isEmpty() && ((r710) obj).isEmpty()) {
            return true;
        }
        r710 r710Var = (r710) obj;
        return this.f24763a == r710Var.f24763a && this.b == r710Var.b;
    }

    @Override // a.o710
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.f24763a) * 31);
    }

    @Override // a.o710
    public final boolean isEmpty() {
        return this.f24763a > this.b;
    }

    @Override // a.o710
    public final String toString() {
        return this.f24763a + ".." + this.b;
    }
}
