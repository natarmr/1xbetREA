package a;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xa3 extends fxw {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public xa3(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // a.cd40
    public final void b(hbi hbiVar) {
        hbiVar.c(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xa3.class != obj.getClass()) {
            return false;
        }
        xa3 xa3Var = (xa3) obj;
        return this.d == xa3Var.d && this.b.equals(xa3Var.b) && Objects.equals(this.c, xa3Var.c) && Arrays.equals(this.e, xa3Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
