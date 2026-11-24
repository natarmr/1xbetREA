package org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.models;

import a.axq;
import a.ibw0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AuthenticatorFilterDialogSettings implements Parcelable {
    public static final Parcelable.Creator<AuthenticatorFilterDialogSettings> CREATOR = new ibw0((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationTypeInfo f46353a;
    public final NotificationPeriodInfo b;
    public final String c;

    public AuthenticatorFilterDialogSettings(NotificationTypeInfo notificationTypeInfo, NotificationPeriodInfo notificationPeriodInfo, String str) {
        notificationTypeInfo.getClass();
        notificationPeriodInfo.getClass();
        str.getClass();
        this.f46353a = notificationTypeInfo;
        this.b = notificationPeriodInfo;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatorFilterDialogSettings)) {
            return false;
        }
        AuthenticatorFilterDialogSettings authenticatorFilterDialogSettings = (AuthenticatorFilterDialogSettings) obj;
        return Intrinsics.d(this.f46353a, authenticatorFilterDialogSettings.f46353a) && Intrinsics.d(this.b, authenticatorFilterDialogSettings.b) && Intrinsics.d(this.c, authenticatorFilterDialogSettings.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f46353a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthenticatorFilterDialogSettings(currentTypeFilter=");
        sb.append(this.f46353a);
        sb.append(", currentPeriodFilter=");
        sb.append(this.b);
        sb.append(", requestKey=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.f46353a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
    }
}
