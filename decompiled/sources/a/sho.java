package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32222a;
    public final boolean b;
    public final String c;

    public sho(String str, long j, boolean z) {
        str.getClass();
        this.f32222a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sho)) {
            return false;
        }
        sho shoVar = (sho) obj;
        return this.f32222a == shoVar.f32222a && this.b == shoVar.b && Intrinsics.d(this.c, shoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Long.hashCode(this.f32222a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(kng0.r(this.f32222a, "EventSubscriptionSettingsModel(id=", ", isEnabled=", this.b), ", name=", this.c, Separators.RPAREN);
    }
}
