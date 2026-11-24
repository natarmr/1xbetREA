package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rwb0 extends fxw {
    public final String b;
    public final byte[] c;

    public rwb0(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rwb0.class != obj.getClass()) {
            return false;
        }
        rwb0 rwb0Var = (rwb0) obj;
        return this.b.equals(rwb0Var.b) && Arrays.equals(this.c, rwb0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ua80.b(527, 31, this.b);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": owner=" + this.b;
    }
}
