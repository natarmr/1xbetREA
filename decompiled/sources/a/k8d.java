package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k8d extends fxw {
    public final String b;
    public final String c;
    public final String d;

    public k8d(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k8d.class != obj.getClass()) {
            return false;
        }
        k8d k8dVar = (k8d) obj;
        return this.c.equals(k8dVar.c) && this.b.equals(k8dVar.b) && Objects.equals(this.d, k8dVar.d);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iB + (str != null ? str.hashCode() : 0);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
