package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f32313a;

    public sjp(Date date) {
        date.getClass();
        this.f32313a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjp) && Intrinsics.d(this.f32313a, ((sjp) obj).f32313a);
    }

    public final int hashCode() {
        return this.f32313a.hashCode();
    }

    public final String toString() {
        return "SetStartTimeFilterPeriod(startTime=" + this.f32313a + Separators.RPAREN;
    }
}
