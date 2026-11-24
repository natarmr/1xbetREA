package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z62 implements b72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f43844a;

    public z62(Date date) {
        this.f43844a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z62) && Intrinsics.d(this.f43844a, ((z62) obj).f43844a);
    }

    public final int hashCode() {
        Date date = this.f43844a;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final String toString() {
        return "ShowCalendarChooser(date=" + this.f43844a + Separators.RPAREN;
    }
}
