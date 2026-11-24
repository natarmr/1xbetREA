package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d25 extends t8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5340a;
    public final byte[] b;

    public d25(String str, byte[] bArr) {
        this.f5340a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t8f)) {
            return false;
        }
        t8f t8fVar = (t8f) obj;
        d25 d25Var = (d25) t8fVar;
        if (this.f5340a.equals(d25Var.f5340a)) {
            return Arrays.equals(this.b, t8fVar instanceof d25 ? ((d25) t8fVar).b : d25Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.f5340a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f5340a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
