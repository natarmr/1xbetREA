package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class qt4 implements tt4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationTypeInfo f29282a;
    public final NotificationPeriodInfo b;

    public qt4(NotificationTypeInfo notificationTypeInfo, NotificationPeriodInfo notificationPeriodInfo) {
        notificationTypeInfo.getClass();
        notificationPeriodInfo.getClass();
        this.f29282a = notificationTypeInfo;
        this.b = notificationPeriodInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt4)) {
            return false;
        }
        qt4 qt4Var = (qt4) obj;
        return Intrinsics.d(this.f29282a, qt4Var.f29282a) && Intrinsics.d(this.b, qt4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29282a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowFiltersOptions(currentTypeFilter=" + this.f29282a + ", currentPeriodFilter=" + this.b + Separators.RPAREN;
    }
}
