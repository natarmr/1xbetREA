package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16704a;
    public final List b;
    public final List c;

    public jl9(int i, List list, List list2) {
        this.f16704a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl9)) {
            return false;
        }
        jl9 jl9Var = (jl9) obj;
        return this.f16704a == jl9Var.f16704a && this.b.equals(jl9Var.b) && this.c.equals(jl9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(Integer.hashCode(this.f16704a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonthPickerDatesUiModel(numberOfSelectedDate=");
        sb.append(this.f16704a);
        sb.append(", datesValues=");
        sb.append(this.b);
        sb.append(", dates=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
