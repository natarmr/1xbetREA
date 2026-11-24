package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3770a;
    public final int b;
    public final int c;
    public final int d;
    public final yag e;
    public final boolean f;

    public c5g(int i, int i2, int i3, int i4, yag yagVar, boolean z) {
        yagVar.getClass();
        this.f3770a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = yagVar;
        this.f = z;
    }

    public static c5g a(c5g c5gVar, int i, int i2) {
        int i3 = c5gVar.f3770a;
        int i4 = c5gVar.d;
        yag yagVar = c5gVar.e;
        boolean z = c5gVar.f;
        c5gVar.getClass();
        yagVar.getClass();
        return new c5g(i3, i, i2, i4, yagVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5g)) {
            return false;
        }
        c5g c5gVar = (c5g) obj;
        return this.f3770a == c5gVar.f3770a && this.b == c5gVar.b && this.c == c5gVar.c && this.d == c5gVar.d && this.e == c5gVar.e && this.f == c5gVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f3770a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CyberCalendarDateFilterParamsModel(selectedYear=", this.f3770a, ", selectedMonthOfYear=", ", selectedDayOfMonth=", this.b);
        axq.r(this.c, this.d, ", selectedDayOfWeek=", ", segmentType=", sbT);
        sbT.append(this.e);
        sbT.append(", fromMonthPicker=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
