package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gwa implements jwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12016a;

    public gwa(String str) {
        str.getClass();
        this.f12016a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwa) && Intrinsics.d(this.f12016a, ((gwa) obj).f12016a);
    }

    public final int hashCode() {
        return this.f12016a.hashCode();
    }

    public final String toString() {
        return kng0.l("Available(value=", this.f12016a, Separators.RPAREN);
    }
}
