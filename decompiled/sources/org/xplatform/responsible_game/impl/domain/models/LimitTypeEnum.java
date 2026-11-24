package org.xplatform.responsible_game.impl.domain.models;

import a.art;
import a.imw;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;", "Landroid/os/Parcelable;", "", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LimitTypeEnum implements Parcelable {
    EMPTY(-1),
    BET_LIMIT_1_DAY(1),
    BET_LIMIT_7_DAY(2),
    BET_LIMIT_30_DAY(3),
    LOSE_LIMIT_1_DAY(10),
    LOSE_LIMIT_7_DAY(11),
    LOSE_LIMIT_30_DAY(12),
    DEPOSIT_LIMIT_1_DAY(20),
    DEPOSIT_LIMIT_7_DAY(21),
    DEPOSIT_LIMIT_30_DAY(22),
    SELF_EXCLUSION(30),
    SESSION_TIME_LIMIT(31),
    REALITY_CHECK(32),
    TIMEOUT(33);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46888a;
    public static final art b = new art();
    public static final Parcelable.Creator<LimitTypeEnum> CREATOR = new imw((byte) 16);

    LimitTypeEnum(int i) {
        this.f46888a = i;
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
