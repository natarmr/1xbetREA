package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f30606a;

    public rjp(Date date) {
        date.getClass();
        this.f30606a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjp) && Intrinsics.d(this.f30606a, ((rjp) obj).f30606a);
    }

    public final int hashCode() {
        return this.f30606a.hashCode();
    }

    public final String toString() {
        return "SetEndTimeFilterPeriod(endTime=" + this.f30606a + Separators.RPAREN;
    }
}
