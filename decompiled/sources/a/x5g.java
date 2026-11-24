package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class x5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40314a;
    public final CyberCalendarPeriodUiModel b;
    public final y5g c;

    public x5g(List list, CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel, y5g y5gVar) {
        list.getClass();
        this.f40314a = list;
        this.b = cyberCalendarPeriodUiModel;
        this.c = y5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5g)) {
            return false;
        }
        x5g x5gVar = (x5g) obj;
        return Intrinsics.d(this.f40314a, x5gVar.f40314a) && this.b.equals(x5gVar.b) && this.c == x5gVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f40314a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CyberCalendarDayOfWeekViewParamsUiModel(periods=" + this.f40314a + ", currentMonthPeriod=" + this.b + ", dayOfWeekViewType=" + this.c + Separators.RPAREN;
    }
}
