package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class utc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36248a;
    public final String b;

    public utc(String str, String str2) {
        str.getClass();
        this.f36248a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utc)) {
            return false;
        }
        utc utcVar = (utc) obj;
        return Intrinsics.d(this.f36248a, utcVar.f36248a) && this.b.equals(utcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36248a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CopyUiAction(text=", this.f36248a, ", message=", this.b, Separators.RPAREN);
    }
}
