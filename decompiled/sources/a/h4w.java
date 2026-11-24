package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h4w implements s4w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12454a;
    public final String b;

    public h4w(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f12454a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4w)) {
            return false;
        }
        h4w h4wVar = (h4w) obj;
        return Intrinsics.d(this.f12454a, h4wVar.f12454a) && Intrinsics.d(this.b, h4wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12454a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CopyBetNumberAlt(betIdNumber=", this.f12454a, ", copy=", this.b, Separators.RPAREN);
    }
}
