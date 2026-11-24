package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bxw implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3396a;
    public final String b;
    public final String c;

    public bxw(String str, String str2, byte[] bArr) {
        this.f3396a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // a.cd40
    public final void b(hbi hbiVar) {
        String str = this.b;
        if (str != null) {
            hbiVar.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bxw.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3396a, ((bxw) obj).f3396a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3396a);
    }

    public final String toString() {
        return rz4.j(this.f3396a.length, Separators.DOUBLE_QUOTE, b1j.n("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
