package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ktk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f18871a;
    public final long b;

    public ktk0(long j, Date date) {
        this.f18871a = date;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktk0)) {
            return false;
        }
        ktk0 ktk0Var = (ktk0) obj;
        return Intrinsics.d(this.f18871a, ktk0Var.f18871a) && this.b == ktk0Var.b;
    }

    public final int hashCode() {
        Date date = this.f18871a;
        return Long.hashCode(this.b) + ((date == null ? 0 : date.hashCode()) * 31);
    }

    public final String toString() {
        return "SpecialEventTabFilterModel(date=" + this.f18871a + ", filterId=" + this.b + Separators.RPAREN;
    }
}
