package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36645a;
    public final Boolean b;

    public v1q(Boolean bool, boolean z) {
        this.f36645a = z;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1q)) {
            return false;
        }
        v1q v1qVar = (v1q) obj;
        return this.f36645a == v1qVar.f36645a && Intrinsics.d(this.b, v1qVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f36645a) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "PoliticalExposedPerson(isRequired=" + this.f36645a + ", isPoliticalExposedPerson=" + this.b + Separators.RPAREN;
    }
}
