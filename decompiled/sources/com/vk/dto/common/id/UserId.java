package com.vk.dto.common.id;

import a.rdr0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/dto/common/id/UserId;", "Landroid/os/Parcelable;", "GsonSerializer", "id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserId implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46053a;
    public static final UserId b = new UserId(0);
    public static final Parcelable.Creator<UserId> CREATOR = new rdr0(26);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/vk/dto/common/id/UserId$GsonSerializer;", "", "Lcom/vk/dto/common/id/UserId;", "id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GsonSerializer {
    }

    public UserId(long j) {
        this.f46053a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserId) && this.f46053a == ((UserId) obj).f46053a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46053a);
    }

    public final String toString() {
        return String.valueOf(this.f46053a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46053a);
    }
}
