package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23776a;
    public final String b;
    public final String c;

    public nmk(String str, String str2, String str3) {
        str3.getClass();
        this.f23776a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmk)) {
            return false;
        }
        nmk nmkVar = (nmk) obj;
        return this.f23776a.equals(nmkVar.f23776a) && this.b.equals(nmkVar.b) && Intrinsics.d(this.c, nmkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f23776a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("DigestCredentials(responseDigest=", this.f23776a, ", cnonce=", this.b, ", nc="), this.c, Separators.RPAREN);
    }
}
