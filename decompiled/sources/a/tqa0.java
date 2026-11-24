package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f34371a;

    public tqa0(Date date) {
        date.getClass();
        this.f34371a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqa0) && Intrinsics.d(this.f34371a, ((tqa0) obj).f34371a);
    }

    public final int hashCode() {
        return this.f34371a.hashCode();
    }

    public final String toString() {
        return "SetStartTimeFilterPeriod(startTime=" + this.f34371a + Separators.RPAREN;
    }
}
