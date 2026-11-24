package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class itk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15357a;
    public final List b;
    public final int c;
    public final int d;

    public itk(int i, int i2, List list, boolean z) {
        list.getClass();
        this.f15357a = z;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itk)) {
            return false;
        }
        itk itkVar = (itk) obj;
        return this.f15357a == itkVar.f15357a && Intrinsics.d(this.b, itkVar.b) && this.c == itkVar.c && this.d == itkVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, dw9.a(Boolean.hashCode(this.f15357a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisciplineHeaderCalendarModel(calendarEnabled=");
        sb.append(this.f15357a);
        sb.append(", calendarDisciplineList=");
        sb.append(this.b);
        sb.append(", calendarChampYear=");
        return w6x.o(this.c, this.d, ", calendarChampMonth=", Separators.RPAREN, sb);
    }
}
