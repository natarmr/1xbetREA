package org.xplatform.betting.core.zip.model.zip.game;

import a.ua80;
import a.yoo;
import a.z6m0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/game/GameStatistic;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GameStatistic implements Parcelable {
    public static final Parcelable.Creator<GameStatistic> CREATOR = new yoo((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6m0 f46432a;
    public final String b;
    public final String c;
    public final String d;

    public GameStatistic(z6m0 z6m0Var, String str, String str2, String str3) {
        z6m0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f46432a = z6m0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameStatistic)) {
            return false;
        }
        GameStatistic gameStatistic = (GameStatistic) obj;
        return this.f46432a == gameStatistic.f46432a && Intrinsics.d(this.b, gameStatistic.b) && Intrinsics.d(this.c, gameStatistic.c) && Intrinsics.d(this.d, gameStatistic.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f46432a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameStatistic(type=");
        sb.append(this.f46432a);
        sb.append(", teamOneScore=");
        sb.append(this.b);
        sb.append(", teamTwoScore=");
        return ua80.m(sb, this.c, ", statName=", this.d, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46432a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
