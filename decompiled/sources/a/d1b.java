package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5303a;
    public final String b;

    public d1b(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5303a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1b)) {
            return false;
        }
        d1b d1bVar = (d1b) obj;
        return Intrinsics.d(this.f5303a, d1bVar.f5303a) && Intrinsics.d(this.b, d1bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5303a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ImageUrl(url=", this.f5303a, ", fallbackUrl=", this.b, Separators.RPAREN);
    }
}
