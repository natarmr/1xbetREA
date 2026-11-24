package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f32619a;

    public sqa0(Date date) {
        date.getClass();
        this.f32619a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqa0) && Intrinsics.d(this.f32619a, ((sqa0) obj).f32619a);
    }

    public final int hashCode() {
        return this.f32619a.hashCode();
    }

    public final String toString() {
        return "SetEndTimeFilterPeriod(endTime=" + this.f32619a + Separators.RPAREN;
    }
}
