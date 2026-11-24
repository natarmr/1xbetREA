package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wkf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39305a;
    public final boolean b;
    public final String c;

    public wkf(String str, boolean z, String str2) {
        str2.getClass();
        this.f39305a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkf)) {
            return false;
        }
        wkf wkfVar = (wkf) obj;
        return this.f39305a.equals(wkfVar.f39305a) && this.b == wkfVar.b && Intrinsics.d(this.c, wkfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f39305a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(brm0.u("SecondTeam(icon=", this.f39305a, ", iconVisibility=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
