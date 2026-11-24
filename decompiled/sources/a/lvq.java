package a;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class lvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20727a;
    public final int b;
    public final Notification c;

    public lvq(int i, Notification notification, int i2) {
        this.f20727a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lvq.class != obj.getClass()) {
            return false;
        }
        lvq lvqVar = (lvq) obj;
        if (this.f20727a == lvqVar.f20727a && this.b == lvqVar.b) {
            return this.c.equals(lvqVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f20727a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f20727a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
