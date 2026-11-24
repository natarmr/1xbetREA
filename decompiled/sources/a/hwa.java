package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hwa implements jwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13760a;

    public hwa(String str) {
        str.getClass();
        this.f13760a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwa) && Intrinsics.d(this.f13760a, ((hwa) obj).f13760a);
    }

    public final int hashCode() {
        return this.f13760a.hashCode();
    }

    public final String toString() {
        return kng0.l("Unavailable(value=", this.f13760a, Separators.RPAREN);
    }
}
