package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class wk9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f39296a;
    public final SimpleDate b;

    public wk9(SimpleDate simpleDate, SimpleDate simpleDate2) {
        simpleDate.getClass();
        simpleDate2.getClass();
        this.f39296a = simpleDate;
        this.b = simpleDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk9)) {
            return false;
        }
        wk9 wk9Var = (wk9) obj;
        return Intrinsics.d(this.f39296a, wk9Var.f39296a) && Intrinsics.d(this.b, wk9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39296a.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarDateRange(start=" + this.f39296a + ", end=" + this.b + Separators.RPAREN;
    }
}
