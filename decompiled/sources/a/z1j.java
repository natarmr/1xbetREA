package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z1j implements a2j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43623a;

    public z1j(String str) {
        str.getClass();
        this.f43623a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1j) && Intrinsics.d(this.f43623a, ((z1j) obj).f43623a);
    }

    public final int hashCode() {
        return this.f43623a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateFailed(message=", this.f43623a, Separators.RPAREN);
    }
}
