package org.xplatform.authenticator.impl.util;

import a.c860;
import a.d860;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NotificationTypeInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationTypeInfo> CREATOR = new d860((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c860 f46355a;
    public final String b;

    public NotificationTypeInfo(c860 c860Var, String str) {
        c860Var.getClass();
        str.getClass();
        this.f46355a = c860Var;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationTypeInfo)) {
            return false;
        }
        NotificationTypeInfo notificationTypeInfo = (NotificationTypeInfo) obj;
        return this.f46355a == notificationTypeInfo.f46355a && Intrinsics.d(this.b, notificationTypeInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46355a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationTypeInfo(type=" + this.f46355a + ", title=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46355a.name());
        parcel.writeString(this.b);
    }

    public /* synthetic */ NotificationTypeInfo() {
        this(c860.ALL, "");
    }
}
