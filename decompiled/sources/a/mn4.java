package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22070a;
    public final boolean b;

    public mn4(int i, boolean z) {
        this.f22070a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn4)) {
            return false;
        }
        mn4 mn4Var = (mn4) obj;
        return this.f22070a == mn4Var.f22070a && this.b == mn4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f22070a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f22070a, "AuthReminderNotificationStatus(authReminderNotificationValue=", ", shown=", Separators.RPAREN, this.b);
    }
}
