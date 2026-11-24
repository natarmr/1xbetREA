package org.xplatform.authenticator.impl.util;

import a.imw;
import a.q760;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NotificationPeriodInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationPeriodInfo> CREATOR = new imw((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q760 f46354a;
    public final String b;
    public final long c;
    public final long d;

    public NotificationPeriodInfo(q760 q760Var, String str, long j, long j2) {
        q760Var.getClass();
        str.getClass();
        this.f46354a = q760Var;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public static NotificationPeriodInfo a(NotificationPeriodInfo notificationPeriodInfo, q760 q760Var, String str, long j, int i) {
        if ((i & 1) != 0) {
            q760Var = notificationPeriodInfo.f46354a;
        }
        q760 q760Var2 = q760Var;
        if ((i & 2) != 0) {
            str = notificationPeriodInfo.b;
        }
        String str2 = str;
        long j2 = (i & 8) != 0 ? notificationPeriodInfo.d : 0L;
        notificationPeriodInfo.getClass();
        q760Var2.getClass();
        str2.getClass();
        return new NotificationPeriodInfo(q760Var2, str2, j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationPeriodInfo)) {
            return false;
        }
        NotificationPeriodInfo notificationPeriodInfo = (NotificationPeriodInfo) obj;
        return this.f46354a == notificationPeriodInfo.f46354a && Intrinsics.d(this.b, notificationPeriodInfo.b) && this.c == notificationPeriodInfo.c && this.d == notificationPeriodInfo.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(ua80.b(this.f46354a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationPeriodInfo(period=");
        sb.append(this.f46354a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", periodStartMillis=");
        sb.append(this.c);
        return rw2.n(sb, this.d, ", periodEndMillis=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46354a.name());
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }

    public /* synthetic */ NotificationPeriodInfo() {
        this(q760.ALL_TIME, "", 0L, 0L);
    }
}
