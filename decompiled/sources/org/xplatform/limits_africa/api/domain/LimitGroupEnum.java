package org.xplatform.limits_africa.api.domain;

import a.imw;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;", "Landroid/os/Parcelable;", "", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LimitGroupEnum implements Parcelable {
    public static final Parcelable.Creator<LimitGroupEnum> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LimitGroupEnum f46745a;
    public static final LimitGroupEnum b;
    public static final LimitGroupEnum c;
    public static final LimitGroupEnum d;
    public static final /* synthetic */ LimitGroupEnum[] e;

    static {
        LimitGroupEnum limitGroupEnum = new LimitGroupEnum("BET_LIMITS", 0);
        f46745a = limitGroupEnum;
        LimitGroupEnum limitGroupEnum2 = new LimitGroupEnum("DEPOSIT_LIMITS", 1);
        b = limitGroupEnum2;
        LimitGroupEnum limitGroupEnum3 = new LimitGroupEnum("TIME_LIMITS", 2);
        c = limitGroupEnum3;
        LimitGroupEnum limitGroupEnum4 = new LimitGroupEnum("UNIDENTIFIED", 3);
        d = limitGroupEnum4;
        e = new LimitGroupEnum[]{limitGroupEnum, limitGroupEnum2, limitGroupEnum3, limitGroupEnum4};
        CREATOR = new imw((byte) 13);
    }

    public static LimitGroupEnum valueOf(String str) {
        return (LimitGroupEnum) Enum.valueOf(LimitGroupEnum.class, str);
    }

    public static LimitGroupEnum[] values() {
        return (LimitGroupEnum[]) e.clone();
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
