package a;

import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wk3 implements xk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39289a;

    public wk3(String str) {
        str.getClass();
        this.f39289a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk3) && Intrinsics.d(this.f39289a, ((wk3) obj).f39289a);
    }

    public final int hashCode() {
        return ((this.f39289a.hashCode() + (Integer.hashCode(R.drawable.ic_notification_white) * 31)) * 31) - 791644951;
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_notification_white, "DownloadApkStart(iconId=", ", notificationChannelId=", this.f39289a, ", channelName=UPDATE_CHANNEL_prod)");
    }
}
