package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbb f23941a;
    public final int b;
    public final String c;
    public final String d;

    public nq40(hbb hbbVar, int i, String str, String str2) {
        this.f23941a = hbbVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nq40)) {
            return false;
        }
        nq40 nq40Var = (nq40) obj;
        return this.f23941a == nq40Var.f23941a && this.b == nq40Var.b && this.c.equals(nq40Var.c) && this.d.equals(nq40Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.f23941a, Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.f23941a);
        sb.append(", keyId=");
        sb.append(this.b);
        sb.append(", keyType='");
        return ua80.m(sb, this.c, "', keyPrefix='", this.d, "')");
    }
}
