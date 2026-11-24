package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mgh implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f21743a;
    public final int b;
    public final String c;

    /* JADX WARN: Type inference failed for: r3v1, types: [byte, int] */
    public mgh(String str, int i, long j) {
        str.getClass();
        this.f21743a = (int) j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgh)) {
            return false;
        }
        mgh mghVar = (mgh) obj;
        return ((long) this.f21743a) == ((long) mghVar.f21743a) && this.b == mghVar.b && Intrinsics.d(this.c, mghVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Long.hashCode(this.f21743a) * 31, 31);
    }

    public final String toString() {
        return rw2.o(brm0.q(this.b, this.f21743a, "CyberStatisticSettingsUiModel(id=", ", icon="), ", subtitle=", this.c, Separators.RPAREN);
    }
}
