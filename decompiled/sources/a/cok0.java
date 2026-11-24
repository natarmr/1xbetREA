package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cok0 implements dok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4705a;
    public final String b;

    public cok0(long j, String str) {
        str.getClass();
        this.f4705a = j;
        this.b = str;
    }

    @Override // a.dok0
    public final long a() {
        return this.f4705a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cok0)) {
            return false;
        }
        cok0 cok0Var = (cok0) obj;
        return this.f4705a == cok0Var.f4705a && Intrinsics.d(this.b, cok0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f4705a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4705a, "SportModel(filterId=", ", sportName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
