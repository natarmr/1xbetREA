package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class xp4 implements zp4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c860 f41251a;
    public final NotificationPeriodInfo b;

    public xp4(c860 c860Var, NotificationPeriodInfo notificationPeriodInfo) {
        c860Var.getClass();
        notificationPeriodInfo.getClass();
        this.f41251a = c860Var;
        this.b = notificationPeriodInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp4)) {
            return false;
        }
        xp4 xp4Var = (xp4) obj;
        return this.f41251a == xp4Var.f41251a && Intrinsics.d(this.b, xp4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41251a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsSave(type=" + this.f41251a + ", period=" + this.b + Separators.RPAREN;
    }
}
