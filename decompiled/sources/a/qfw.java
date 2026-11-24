package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qfw extends d50 {
    public final int b;
    public final int c;
    public final pfw d;
    public final h70 e;

    public qfw(int i, int i2, pfw pfwVar, h70 h70Var) {
        this.b = i;
        this.c = i2;
        this.d = pfwVar;
        this.e = h70Var;
    }

    public final int d0() {
        pfw pfwVar = pfw.f;
        int i = this.c;
        pfw pfwVar2 = this.d;
        if (pfwVar2 == pfwVar) {
            return i;
        }
        if (pfwVar2 == pfw.c) {
            return i + 5;
        }
        if (pfwVar2 == pfw.d) {
            return i + 5;
        }
        if (pfwVar2 == pfw.e) {
            return i + 5;
        }
        jf4.n("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qfw)) {
            return false;
        }
        qfw qfwVar = (qfw) obj;
        return qfwVar.b == this.b && qfwVar.d0() == d0() && qfwVar.d == this.d && qfwVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.d);
        sb.append(", hashType: ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte tags, and ");
        return rz4.j(this.b, "-byte key)", sb);
    }
}
