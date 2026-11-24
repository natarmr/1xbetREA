package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6850a;
    public final long b;

    public dxk0(String str, long j) {
        str.getClass();
        this.f6850a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxk0)) {
            return false;
        }
        dxk0 dxk0Var = (dxk0) obj;
        return Intrinsics.d(this.f6850a, dxk0Var.f6850a) && this.b == dxk0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f6850a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "SpecialEventsSearchModel(searchValue=", this.f6850a, ", filterId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
