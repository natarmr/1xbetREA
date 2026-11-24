package org.xplatform.game_broadcasting.api.presentation.models;

import a.axq;
import a.kng0;
import a.twn;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;", "Landroid/os/Parcelable;", "a/jxs", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GameVideoUiConfig implements Parcelable {
    public static final Parcelable.Creator<GameVideoUiConfig> CREATOR = new yoo((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46692a;
    public final int b;
    public final int c;
    public final int d;
    public final GameVideoPlayerColorScheme e;

    public GameVideoUiConfig(String str, int i, int i2, int i3, GameVideoPlayerColorScheme gameVideoPlayerColorScheme) {
        str.getClass();
        gameVideoPlayerColorScheme.getClass();
        this.f46692a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = gameVideoPlayerColorScheme;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameVideoUiConfig)) {
            return false;
        }
        GameVideoUiConfig gameVideoUiConfig = (GameVideoUiConfig) obj;
        return Intrinsics.d(this.f46692a, gameVideoUiConfig.f46692a) && this.b == gameVideoUiConfig.b && this.c == gameVideoUiConfig.c && this.d == gameVideoUiConfig.d && Intrinsics.d(this.e, gameVideoUiConfig.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f46692a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "GameVideoUiConfig(aspectRatio=", this.f46692a, ", cornerRadius=", ", hardcodedHeight=");
        axq.r(this.c, this.d, ", horizontalMargin=", ", colorScheme=", sbP);
        sbP.append(this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46692a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
    }
}
