package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ynr0 implements aor0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42954a;
    public final String b;
    public final String c;

    public ynr0(String str, String str2, String str3) {
        str.getClass();
        this.f42954a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynr0)) {
            return false;
        }
        ynr0 ynr0Var = (ynr0) obj;
        return Intrinsics.d(this.f42954a, ynr0Var.f42954a) && this.b.equals(ynr0Var.b) && this.c.equals(ynr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f42954a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("Toto1XHeaderBannerContent(tirageValue=", this.f42954a, ", betAcceptTimeLimit=", this.b, ", untilEndTimerValue="), this.c, Separators.RPAREN);
    }
}
