package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class k2i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f17574a;
    public final SimpleDate b;
    public final SimpleDate c;
    public final String d;
    public final boolean e;

    public k2i0(SimpleDate simpleDate, SimpleDate simpleDate2, SimpleDate simpleDate3, String str, boolean z) {
        str.getClass();
        this.f17574a = simpleDate;
        this.b = simpleDate2;
        this.c = simpleDate3;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2i0)) {
            return false;
        }
        k2i0 k2i0Var = (k2i0) obj;
        return this.f17574a.equals(k2i0Var.f17574a) && this.b.equals(k2i0Var.b) && Intrinsics.d(this.c, k2i0Var.c) && Intrinsics.d(this.d, k2i0Var.d) && this.e == k2i0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f17574a.hashCode() * 31)) * 31;
        SimpleDate simpleDate = this.c;
        return Boolean.hashCode(this.e) + ua80.b((iHashCode + (simpleDate == null ? 0 : simpleDate.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectDateUiState(minDate=");
        sb.append(this.f17574a);
        sb.append(", maxDate=");
        sb.append(this.b);
        sb.append(", initialStart=");
        sb.append(this.c);
        sb.append(", requestKey=");
        sb.append(this.d);
        sb.append(", activeApplyButton=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
