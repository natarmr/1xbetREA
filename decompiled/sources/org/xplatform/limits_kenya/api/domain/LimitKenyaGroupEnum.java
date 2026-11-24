package org.xplatform.limits_kenya.api.domain;

import a.imw;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/limits_kenya/api/domain/LimitKenyaGroupEnum;", "Landroid/os/Parcelable;", "", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LimitKenyaGroupEnum implements Parcelable {
    public static final Parcelable.Creator<LimitKenyaGroupEnum> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LimitKenyaGroupEnum f46749a;
    public static final LimitKenyaGroupEnum b;
    public static final LimitKenyaGroupEnum c;
    public static final LimitKenyaGroupEnum d;
    public static final /* synthetic */ LimitKenyaGroupEnum[] e;

    static {
        LimitKenyaGroupEnum limitKenyaGroupEnum = new LimitKenyaGroupEnum("BET_LIMITS", 0);
        f46749a = limitKenyaGroupEnum;
        LimitKenyaGroupEnum limitKenyaGroupEnum2 = new LimitKenyaGroupEnum("DEPOSIT_LIMITS", 1);
        b = limitKenyaGroupEnum2;
        LimitKenyaGroupEnum limitKenyaGroupEnum3 = new LimitKenyaGroupEnum("TIME_LIMITS", 2);
        c = limitKenyaGroupEnum3;
        LimitKenyaGroupEnum limitKenyaGroupEnum4 = new LimitKenyaGroupEnum("UNIDENTIFIED", 3);
        d = limitKenyaGroupEnum4;
        e = new LimitKenyaGroupEnum[]{limitKenyaGroupEnum, limitKenyaGroupEnum2, limitKenyaGroupEnum3, limitKenyaGroupEnum4};
        CREATOR = new imw((byte) 14);
    }

    public static LimitKenyaGroupEnum valueOf(String str) {
        return (LimitKenyaGroupEnum) Enum.valueOf(LimitKenyaGroupEnum.class, str);
    }

    public static LimitKenyaGroupEnum[] values() {
        return (LimitKenyaGroupEnum[]) e.clone();
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
