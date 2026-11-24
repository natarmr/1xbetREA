package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y18 extends fxw {
    public final byte[] b;

    public y18(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y18.class != obj.getClass()) {
            return false;
        }
        y18 y18Var = (y18) obj;
        return this.f10332a.equals(y18Var.f10332a) && Arrays.equals(this.b, y18Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ua80.b(527, 31, this.f10332a);
    }
}
