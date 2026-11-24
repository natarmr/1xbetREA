package org.xplatform.betting.core.zip.model.zip.bet;

import a.qo7;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/bet/BetViewType;", "Landroid/os/Parcelable;", "", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetViewType implements Parcelable {
    public static final Parcelable.Creator<BetViewType> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BetViewType f46430a;
    public static final BetViewType b;
    public static final /* synthetic */ BetViewType[] c;

    static {
        BetViewType betViewType = new BetViewType("NORMAL", 0);
        f46430a = betViewType;
        BetViewType betViewType2 = new BetViewType("ACCURACY_COMPACT", 1);
        b = betViewType2;
        c = new BetViewType[]{betViewType, betViewType2};
        CREATOR = new qo7((byte) 0);
    }

    public static BetViewType valueOf(String str) {
        return (BetViewType) Enum.valueOf(BetViewType.class, str);
    }

    public static BetViewType[] values() {
        return (BetViewType[]) c.clone();
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
