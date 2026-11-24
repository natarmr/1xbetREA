package a;

/* JADX INFO: loaded from: classes6.dex */
public final class tzr0 extends w8b {
    public final String d;
    public final int e;

    public tzr0(String str, int i) {
        super(new h9b(str), null, null, 30);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzr0)) {
            return false;
        }
        tzr0 tzr0Var = (tzr0) obj;
        return this.d.equals(tzr0Var.d) && this.e == tzr0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.n(this.e, "TextData(data=", this.d, ", color=", ", textColor=0)");
    }
}
