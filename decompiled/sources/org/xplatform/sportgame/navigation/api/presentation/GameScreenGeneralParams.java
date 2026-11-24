package org.xplatform.sportgame.navigation.api.presentation;

import a.brm0;
import a.grs;
import a.hne;
import a.k1g;
import a.kng0;
import a.ors;
import a.rw2;
import a.twn;
import a.ua80;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GameScreenGeneralParams implements Parcelable {
    public static final Parcelable.Creator<GameScreenGeneralParams> CREATOR = new yoo((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47013a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;
    public final boolean g;
    public final GameBroadcastType h;
    public final grs i;
    public final String j;
    public final String k;
    public final ors l;
    public final int m;
    public final boolean n;
    public final k1g o;

    public GameScreenGeneralParams(long j, long j2, long j3, long j4, boolean z, long j5, boolean z2, GameBroadcastType gameBroadcastType, grs grsVar, String str, String str2, ors orsVar, int i, boolean z3, k1g k1gVar) {
        gameBroadcastType.getClass();
        grsVar.getClass();
        str.getClass();
        str2.getClass();
        orsVar.getClass();
        k1gVar.getClass();
        this.f47013a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = j5;
        this.g = z2;
        this.h = gameBroadcastType;
        this.i = grsVar;
        this.j = str;
        this.k = str2;
        this.l = orsVar;
        this.m = i;
        this.n = z3;
        this.o = k1gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameScreenGeneralParams)) {
            return false;
        }
        GameScreenGeneralParams gameScreenGeneralParams = (GameScreenGeneralParams) obj;
        return this.f47013a == gameScreenGeneralParams.f47013a && this.b == gameScreenGeneralParams.b && this.c == gameScreenGeneralParams.c && this.d == gameScreenGeneralParams.d && this.e == gameScreenGeneralParams.e && this.f == gameScreenGeneralParams.f && this.g == gameScreenGeneralParams.g && this.h == gameScreenGeneralParams.h && this.i == gameScreenGeneralParams.i && Intrinsics.d(this.j, gameScreenGeneralParams.j) && Intrinsics.d(this.k, gameScreenGeneralParams.k) && this.l == gameScreenGeneralParams.l && this.m == gameScreenGeneralParams.m && this.n == gameScreenGeneralParams.n && this.o == gameScreenGeneralParams.o;
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(twn.a(this.m, (this.l.hashCode() + ua80.b(ua80.b((this.i.hashCode() + ((this.h.hashCode() + brm0.e(rw2.b(brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f47013a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j), 31, this.k)) * 31, 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f47013a, "GameScreenGeneralParams(gameId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        hne.t(this.d, ", cyber=", sbQ, this.e);
        kng0.A(sbQ, ", champId=", this.f, ", live=");
        sbQ.append(this.g);
        sbQ.append(", gameBroadcastType=");
        sbQ.append(this.h);
        sbQ.append(", gameScreenInitialAction=");
        sbQ.append(this.i);
        sbQ.append(", gameScreenParent=");
        sbQ.append(this.j);
        sbQ.append(", champName=");
        sbQ.append(this.k);
        sbQ.append(", screenType=");
        sbQ.append(this.l);
        sbQ.append(", globalChampId=");
        brm0.w(this.m, ", cyberClassicGameScreen=", ", openScreenSubType=", sbQ, this.n);
        sbQ.append(this.o);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47013a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i.name());
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l.name());
        parcel.writeInt(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.o.name());
    }
}
