package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zvn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gwn f45066a;
    public final byte[] b;

    public zvn(gwn gwnVar, byte[] bArr) {
        if (gwnVar == null) {
            hny.u("encoding is null");
            throw null;
        }
        if (bArr == null) {
            hny.u("bytes is null");
            throw null;
        }
        this.f45066a = gwnVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvn)) {
            return false;
        }
        zvn zvnVar = (zvn) obj;
        if (this.f45066a.equals(zvnVar.f45066a)) {
            return Arrays.equals(this.b, zvnVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.f45066a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f45066a + ", bytes=[...]}";
    }
}
