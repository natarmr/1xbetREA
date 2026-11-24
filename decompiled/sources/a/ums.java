package a;

import android.gov.nist.core.Separators;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ums implements ans {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationInfoUiModel f35931a;
    public final boolean b;

    public ums(NotificationInfoUiModel notificationInfoUiModel, boolean z) {
        this.f35931a = notificationInfoUiModel;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ums)) {
            return false;
        }
        ums umsVar = (ums) obj;
        return this.f35931a.equals(umsVar.f35931a) && this.b == umsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35931a.hashCode() * 31);
    }

    public final String toString() {
        return "OnNotificationClick(checkedItem=" + this.f35931a + ", isChecked=" + this.b + Separators.RPAREN;
    }
}
