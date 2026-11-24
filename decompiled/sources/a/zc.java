package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zc implements bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44143a;
    public final String b;

    public zc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f44143a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc)) {
            return false;
        }
        zc zcVar = (zc) obj;
        return Intrinsics.d(this.f44143a, zcVar.f44143a) && Intrinsics.d(this.b, zcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44143a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(authLabel=", this.f44143a, ", regLabel=", this.b, Separators.RPAREN);
    }
}
