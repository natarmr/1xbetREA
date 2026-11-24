package org.xplatform.limits_ne.api.domain;

import a.imw;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;", "Landroid/os/Parcelable;", "", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LimitNeGroupEnum implements Parcelable {
    BET_LIMITS(1),
    DEPOSIT_LIMITS(3),
    SESSION_TIME_LIMITS(4),
    SELF_EXCLUSION_LIMITS(999),
    UNIDENTIFIED(999);

    public static final Parcelable.Creator<LimitNeGroupEnum> CREATOR = new imw(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f46750a;

    /* JADX WARN: Multi-variable type inference failed */
    LimitNeGroupEnum(int i) {
        this.f46750a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
