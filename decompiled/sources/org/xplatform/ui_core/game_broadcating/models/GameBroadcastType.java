package org.xplatform.ui_core.game_broadcating.models;

import a.yoo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;", "Landroid/os/Parcelable;", "", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GameBroadcastType implements Parcelable {
    public static final Parcelable.Creator<GameBroadcastType> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GameBroadcastType f47186a;
    public static final GameBroadcastType b;
    public static final GameBroadcastType c;
    public static final /* synthetic */ GameBroadcastType[] d;

    static {
        GameBroadcastType gameBroadcastType = new GameBroadcastType("VIDEO", 0);
        f47186a = gameBroadcastType;
        GameBroadcastType gameBroadcastType2 = new GameBroadcastType("ZONE", 1);
        b = gameBroadcastType2;
        GameBroadcastType gameBroadcastType3 = new GameBroadcastType("NONE", 2);
        c = gameBroadcastType3;
        d = new GameBroadcastType[]{gameBroadcastType, gameBroadcastType2, gameBroadcastType3};
        CREATOR = new yoo((byte) 13);
    }

    public static GameBroadcastType valueOf(String str) {
        return (GameBroadcastType) Enum.valueOf(GameBroadcastType.class, str);
    }

    public static GameBroadcastType[] values() {
        return (GameBroadcastType[]) d.clone();
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
