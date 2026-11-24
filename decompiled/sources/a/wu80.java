package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wu80 implements xu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39778a;

    public wu80(String str) {
        str.getClass();
        this.f39778a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wu80) && Intrinsics.d(this.f39778a, ((wu80) obj).f39778a);
    }

    public final int hashCode() {
        return this.f39778a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowFavoriteLimitedError(description=", this.f39778a, Separators.RPAREN);
    }
}
