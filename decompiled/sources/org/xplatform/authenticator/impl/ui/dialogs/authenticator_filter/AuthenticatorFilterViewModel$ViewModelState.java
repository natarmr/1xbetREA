package org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter;

import a.c860;
import a.ibw0;
import a.q760;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AuthenticatorFilterViewModel$ViewModelState implements Parcelable {
    public static final Parcelable.Creator<AuthenticatorFilterViewModel$ViewModelState> CREATOR = new ibw0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c860 f46352a;
    public final NotificationPeriodInfo b;
    public final q760 c;

    public AuthenticatorFilterViewModel$ViewModelState(c860 c860Var, NotificationPeriodInfo notificationPeriodInfo, q760 q760Var) {
        c860Var.getClass();
        notificationPeriodInfo.getClass();
        q760Var.getClass();
        this.f46352a = c860Var;
        this.b = notificationPeriodInfo;
        this.c = q760Var;
    }

    public static AuthenticatorFilterViewModel$ViewModelState a(AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState, c860 c860Var, NotificationPeriodInfo notificationPeriodInfo, int i) {
        if ((i & 1) != 0) {
            c860Var = authenticatorFilterViewModel$ViewModelState.f46352a;
        }
        if ((i & 2) != 0) {
            notificationPeriodInfo = authenticatorFilterViewModel$ViewModelState.b;
        }
        q760 q760Var = authenticatorFilterViewModel$ViewModelState.c;
        authenticatorFilterViewModel$ViewModelState.getClass();
        c860Var.getClass();
        notificationPeriodInfo.getClass();
        q760Var.getClass();
        return new AuthenticatorFilterViewModel$ViewModelState(c860Var, notificationPeriodInfo, q760Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatorFilterViewModel$ViewModelState)) {
            return false;
        }
        AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState = (AuthenticatorFilterViewModel$ViewModelState) obj;
        return this.f46352a == authenticatorFilterViewModel$ViewModelState.f46352a && Intrinsics.d(this.b, authenticatorFilterViewModel$ViewModelState.b) && this.c == authenticatorFilterViewModel$ViewModelState.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f46352a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewModelState(currentNotificationType=" + this.f46352a + ", periodInfo=" + this.b + ", previousSelectedPeriod=" + this.c + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46352a.name());
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c.name());
    }
}
