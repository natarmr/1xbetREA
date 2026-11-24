package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40610a;
    public final long b;
    public final List c;

    public xbo(long j, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f40610a = list;
        this.b = j;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbo)) {
            return false;
        }
        xbo xboVar = (xbo) obj;
        return Intrinsics.d(this.f40610a, xboVar.f40610a) && this.b == xboVar.b && Intrinsics.d(this.c, xboVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f40610a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventFocusDisciplineMapModel(events=");
        sb.append(this.f40610a);
        sb.append(", selectedDisciplineId=");
        sb.append(this.b);
        return ohs0.s(sb, ", disciplineFilterOrder=", this.c, Separators.RPAREN);
    }
}
