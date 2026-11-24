package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6751a;
    public final String b;

    public dvm0(long j, String str) {
        str.getClass();
        this.f6751a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvm0)) {
            return false;
        }
        dvm0 dvm0Var = (dvm0) obj;
        return this.f6751a == dvm0Var.f6751a && Intrinsics.d(this.b, dvm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f6751a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f6751a, "SubGameFilterModel(id=", ", fullName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
