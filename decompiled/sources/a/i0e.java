package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13945a;
    public final String b;

    public i0e(String str, String str2) {
        str.getClass();
        this.f13945a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0e)) {
            return false;
        }
        i0e i0eVar = (i0e) obj;
        return Intrinsics.d(this.f13945a, i0eVar.f13945a) && this.b.equals(i0eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13945a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorWithExit(title=", this.f13945a, ", message=", this.b, Separators.RPAREN);
    }
}
