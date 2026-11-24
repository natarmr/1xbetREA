package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tkf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34091a;
    public final boolean b;
    public final String c;

    public tkf(String str, boolean z, String str2) {
        str2.getClass();
        this.f34091a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkf)) {
            return false;
        }
        tkf tkfVar = (tkf) obj;
        return this.f34091a.equals(tkfVar.f34091a) && this.b == tkfVar.b && Intrinsics.d(this.c, tkfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f34091a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(brm0.u("FirstTeam(icon=", this.f34091a, ", iconVisibility=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
