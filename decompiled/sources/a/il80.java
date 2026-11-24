package a;

/* JADX INFO: loaded from: classes.dex */
public final class il80 extends n7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14964a;
    public final int b;
    public final int c;
    public final int d;

    public il80(int i, int i2, int i3, int i4) {
        this.f14964a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof il80)) {
            return false;
        }
        il80 il80Var = (il80) obj;
        return this.f14964a == il80Var.f14964a && this.b == il80Var.b && this.c == il80Var.c && this.d == il80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.f14964a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i = this.b;
        sb.append(i);
        sb.append(" items (\n                    |   startIndex: ");
        axq.r(this.f14964a, i, "\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb);
        sb.append(this.c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.d);
        sb.append("\n                    |)\n                    |");
        return ntm0.d(sb.toString());
    }
}
