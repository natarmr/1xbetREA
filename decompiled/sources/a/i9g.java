package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14383a;
    public final String b;
    public final int c;
    public final String d;
    public final CyberCalendarPeriodUiModel e;
    public final l7g f;

    public i9g(long j, String str, int i, String str2, CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel, l7g l7gVar) {
        this.f14383a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = cyberCalendarPeriodUiModel;
        this.f = l7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9g)) {
            return false;
        }
        i9g i9gVar = (i9g) obj;
        return this.f14383a == i9gVar.f14383a && this.b.equals(i9gVar.b) && this.c == i9gVar.c && this.d.equals(i9gVar.d) && this.e.equals(i9gVar.e) && this.f.equals(i9gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(twn.a(this.c, ua80.b(Long.hashCode(this.f14383a) * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f14383a, "CyberCalendarPeriodEventUiModel(globalId=", ", image=", this.b);
        w6x.w(this.c, ", eventPlaceholderRes=", ", title=", this.d, sbO);
        sbO.append(", cyberCalendarPeriodUiModel=");
        sbO.append(this.e);
        sbO.append(", eventInfoUiModel=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
