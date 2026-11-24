package org.xplatform.feed.notifictation.data;

import a.brm0;
import a.imw;
import a.j760;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/feed/notifictation/data/NotificationInfoUiModel;", "Landroid/os/Parcelable;", "a/j760", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NotificationInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<NotificationInfoUiModel> CREATOR = new imw(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j760 f46676a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;

    public NotificationInfoUiModel(j760 j760Var, String str, boolean z, long j, long j2) {
        j760Var.getClass();
        str.getClass();
        this.f46676a = j760Var;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    public static NotificationInfoUiModel a(NotificationInfoUiModel notificationInfoUiModel, boolean z) {
        j760 j760Var = notificationInfoUiModel.f46676a;
        String str = notificationInfoUiModel.b;
        long j = notificationInfoUiModel.d;
        long j2 = notificationInfoUiModel.e;
        notificationInfoUiModel.getClass();
        j760Var.getClass();
        str.getClass();
        return new NotificationInfoUiModel(j760Var, str, z, j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationInfoUiModel)) {
            return false;
        }
        NotificationInfoUiModel notificationInfoUiModel = (NotificationInfoUiModel) obj;
        return this.f46676a == notificationInfoUiModel.f46676a && Intrinsics.d(this.b, notificationInfoUiModel.b) && this.c == notificationInfoUiModel.c && this.d == notificationInfoUiModel.d && this.e == notificationInfoUiModel.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + rw2.b(brm0.e(ua80.b(this.f46676a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationInfoUiModel(type=");
        sb.append(this.f46676a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isChecked=");
        rw2.v(this.d, ", periodId=", sb, this.c);
        return rw2.n(sb, this.e, ", eventId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46676a.name());
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public /* synthetic */ NotificationInfoUiModel(String str, boolean z) {
        this(j760.f16026a, str, z, 0L, 0L);
    }
}
