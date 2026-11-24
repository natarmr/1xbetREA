package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34911a;
    public final String b;
    public final String c;

    public u1q(boolean z, String str, String str2) {
        str.getClass();
        this.f34911a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1q)) {
            return false;
        }
        u1q u1qVar = (u1q) obj;
        return this.f34911a == u1qVar.f34911a && Intrinsics.d(this.b, u1qVar.b) && this.c.equals(u1qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f34911a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("Phone(isRequired=", ", phoneNumber=", this.b, this.f34911a, ", countryCode="), this.c, Separators.RPAREN);
    }
}
