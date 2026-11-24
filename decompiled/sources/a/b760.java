package a;

import android.gov.nist.core.Separators;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class b760 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationInfoUiModel f2089a;
    public final rqm b;

    public b760(NotificationInfoUiModel notificationInfoUiModel, rqm rqmVar) {
        this.f2089a = notificationInfoUiModel;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b760)) {
            return false;
        }
        b760 b760Var = (b760) obj;
        return this.f2089a.equals(b760Var.f2089a) && this.b.equals(b760Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2089a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationCellUiModel(notificationInfo=" + this.f2089a + ", cell=" + this.b + Separators.RPAREN;
    }
}
