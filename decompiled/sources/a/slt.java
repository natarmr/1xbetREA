package a;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class slt extends fxw {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public slt(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || slt.class != obj.getClass()) {
            return false;
        }
        slt sltVar = (slt) obj;
        return Objects.equals(this.b, sltVar.b) && this.c.equals(sltVar.c) && this.d.equals(sltVar.d) && Arrays.equals(this.e, sltVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ua80.b(ua80.b((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
