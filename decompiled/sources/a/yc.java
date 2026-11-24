package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yc implements ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42363a;
    public final String b;

    public yc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f42363a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj;
        return Intrinsics.d(this.f42363a, ycVar.f42363a) && Intrinsics.d(this.b, ycVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42363a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(authLabel=", this.f42363a, ", regLabel=", this.b, Separators.RPAREN);
    }
}
