package a;

/* JADX INFO: loaded from: classes.dex */
public final class ll80 extends n7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi80 f20235a;
    public final zi80 b;

    public ll80(zi80 zi80Var, zi80 zi80Var2) {
        zi80Var2.getClass();
        this.f20235a = zi80Var;
        this.b = zi80Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ll80)) {
            return false;
        }
        zi80 zi80Var = this.f20235a;
        int i = zi80Var.c;
        ll80 ll80Var = (ll80) obj;
        zi80 zi80Var2 = ll80Var.b;
        zi80 zi80Var3 = ll80Var.f20235a;
        if (i != zi80Var3.c || zi80Var.d != zi80Var3.d || zi80Var.f() != zi80Var3.f() || zi80Var.b != zi80Var3.b) {
            return false;
        }
        zi80 zi80Var4 = this.b;
        return zi80Var4.c == zi80Var2.c && zi80Var4.d == zi80Var2.d && zi80Var4.f() == zi80Var2.f() && zi80Var4.b == zi80Var2.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + this.f20235a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
        zi80 zi80Var = this.f20235a;
        sb.append(zi80Var.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(zi80Var.d);
        sb.append("\n                    |       size: ");
        sb.append(zi80Var.f());
        sb.append("\n                    |       dataCount: ");
        sb.append(zi80Var.b);
        sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
        zi80 zi80Var2 = this.b;
        sb.append(zi80Var2.c);
        sb.append("\n                    |       placeholdersAfter: ");
        sb.append(zi80Var2.d);
        sb.append("\n                    |       size: ");
        sb.append(zi80Var2.f());
        sb.append("\n                    |       dataCount: ");
        sb.append(zi80Var2.b);
        sb.append("\n                    |   )\n                    |");
        return ntm0.d(sb.toString());
    }
}
