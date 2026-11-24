package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes4.dex */
public final class d4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f5457a;
    public final TimeOfDay23 b;
    public final SimpleDate c;
    public final SimpleDateTime d;
    public final SimpleDateTime e;
    public final String f;

    public d4i0(SimpleDate simpleDate, TimeOfDay23 timeOfDay23, SimpleDate simpleDate2, SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, String str) {
        yg40 yg40Var = yg40.ONE;
        str.getClass();
        this.f5457a = simpleDate;
        this.b = timeOfDay23;
        this.c = simpleDate2;
        this.d = simpleDateTime;
        this.e = simpleDateTime2;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4i0)) {
            return false;
        }
        d4i0 d4i0Var = (d4i0) obj;
        yg40 yg40Var = yg40.ONE;
        return this.f5457a.equals(d4i0Var.f5457a) && this.b.equals(d4i0Var.b) && this.c.equals(d4i0Var.c) && this.d.equals(d4i0Var.d) && Intrinsics.d(this.e, d4i0Var.e) && Intrinsics.d(this.f, d4i0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.f5457a.hashCode() + (yg40.FIVE.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        SimpleDateTime simpleDateTime = this.e;
        return this.f.hashCode() + ((iHashCode + (simpleDateTime == null ? 0 : simpleDateTime.hashCode())) * 31);
    }

    public final String toString() {
        yg40 yg40Var = yg40.FIVE;
        StringBuilder sb = new StringBuilder("SelectTimeRangeUiState(minuteStep=");
        sb.append(yg40Var);
        sb.append(", minDate=");
        sb.append(this.f5457a);
        sb.append(", minTime=");
        sb.append(this.b);
        sb.append(", maxDate=");
        sb.append(this.c);
        sb.append(", initialStart=");
        sb.append(this.d);
        sb.append(", initialEnd=");
        sb.append(this.e);
        sb.append(", requestKey=");
        return axq.n(sb, this.f, Separators.RPAREN);
    }
}
