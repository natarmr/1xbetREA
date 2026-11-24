package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dot0 extends fxw {
    public final String b;
    public final String c;

    public dot0(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dot0.class != obj.getClass()) {
            return false;
        }
        dot0 dot0Var = (dot0) obj;
        return this.f10332a.equals(dot0Var.f10332a) && Objects.equals(this.b, dot0Var.b) && this.c.equals(dot0Var.c);
    }

    public final int hashCode() {
        int iB = ua80.b(527, 31, this.f10332a);
        String str = this.b;
        return this.c.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": url=" + this.c;
    }
}
