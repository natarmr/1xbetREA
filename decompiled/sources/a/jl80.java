package a;

/* JADX INFO: loaded from: classes.dex */
public final class jl80 extends n7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16703a;
    public final int b;
    public final int c;

    public jl80(int i, int i2, int i3) {
        this.f16703a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jl80)) {
            return false;
        }
        jl80 jl80Var = (jl80) obj;
        return this.f16703a == jl80Var.f16703a && this.b == jl80Var.b && this.c == jl80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.f16703a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.f16703a;
        axq.r(i, i, " items (\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb);
        sb.append(this.b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |)\n                    |");
        return ntm0.d(sb.toString());
    }
}
