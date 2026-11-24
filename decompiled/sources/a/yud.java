package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yud implements evd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43263a;
    public final String b;

    public yud(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f43263a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yud)) {
            return false;
        }
        yud yudVar = (yud) obj;
        return Intrinsics.d(this.f43263a, yudVar.f43263a) && Intrinsics.d(this.b, yudVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43263a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorWithExitDialog(title=", this.f43263a, ", message=", this.b, Separators.RPAREN);
    }
}
