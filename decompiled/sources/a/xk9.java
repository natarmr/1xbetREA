package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class xk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateTime f41021a;
    public final SimpleDateTime b;

    public xk9(SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2) {
        simpleDateTime.getClass();
        simpleDateTime2.getClass();
        this.f41021a = simpleDateTime;
        this.b = simpleDateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk9)) {
            return false;
        }
        xk9 xk9Var = (xk9) obj;
        return Intrinsics.d(this.f41021a, xk9Var.f41021a) && Intrinsics.d(this.b, xk9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41021a.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarDateTimeRange(start=" + this.f41021a + ", end=" + this.b + Separators.RPAREN;
    }
}
