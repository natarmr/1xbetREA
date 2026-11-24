package org.xplatform.sportgame.markets.base.api.navigation;

import a.brm0;
import a.f140;
import a.kng0;
import a.ms2;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams;", "Landroid/os/Parcelable;", "DuelSubGame", "StandardSubGame", "InsightsSubGame", "Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;", "Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;", "Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class MarketsParams implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;", "Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DuelSubGame extends MarketsParams {
        public static final Parcelable.Creator<DuelSubGame> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47006a;
        public final long b;
        public final long c;
        public final boolean d;
        public final String e;
        public final ms2 f;

        public DuelSubGame(long j, long j2, long j3, ms2 ms2Var, String str, boolean z) {
            str.getClass();
            ms2Var.getClass();
            this.f47006a = j;
            this.b = j2;
            this.c = j3;
            this.d = z;
            this.e = str;
            this.f = ms2Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DuelSubGame)) {
                return false;
            }
            DuelSubGame duelSubGame = (DuelSubGame) obj;
            return this.f47006a == duelSubGame.f47006a && this.b == duelSubGame.b && this.c == duelSubGame.c && this.d == duelSubGame.d && Intrinsics.d(this.e, duelSubGame.e) && Intrinsics.d(this.f, duelSubGame.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ua80.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f47006a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbQ = kng0.q(this.f47006a, "DuelSubGame(sportId=", ", gameId=");
            sbQ.append(this.b);
            kng0.A(sbQ, ", subGameId=", this.c, ", live=");
            f140.s(", name=", this.e, ", entryPointType=", sbQ, this.d);
            sbQ.append(this.f);
            sbQ.append(Separators.RPAREN);
            return sbQ.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f47006a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeSerializable(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;", "Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class InsightsSubGame extends MarketsParams {
        public static final Parcelable.Creator<InsightsSubGame> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47007a;
        public final long b;
        public final long c;
        public final boolean d;
        public final String e;
        public final ms2 f;

        public InsightsSubGame(long j, long j2, long j3, ms2 ms2Var, String str, boolean z) {
            str.getClass();
            ms2Var.getClass();
            this.f47007a = j;
            this.b = j2;
            this.c = j3;
            this.d = z;
            this.e = str;
            this.f = ms2Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsightsSubGame)) {
                return false;
            }
            InsightsSubGame insightsSubGame = (InsightsSubGame) obj;
            return this.f47007a == insightsSubGame.f47007a && this.b == insightsSubGame.b && this.c == insightsSubGame.c && this.d == insightsSubGame.d && Intrinsics.d(this.e, insightsSubGame.e) && Intrinsics.d(this.f, insightsSubGame.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ua80.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f47007a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbQ = kng0.q(this.f47007a, "InsightsSubGame(sportId=", ", gameId=");
            sbQ.append(this.b);
            kng0.A(sbQ, ", subGameId=", this.c, ", live=");
            f140.s(", name=", this.e, ", entryPointType=", sbQ, this.d);
            sbQ.append(this.f);
            sbQ.append(Separators.RPAREN);
            return sbQ.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f47007a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeSerializable(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$StandardSubGame;", "Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class StandardSubGame extends MarketsParams {
        public static final Parcelable.Creator<StandardSubGame> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47008a;
        public final long b;
        public final long c;
        public final boolean d;
        public final String e;
        public final ms2 f;
        public final int g;

        public StandardSubGame(long j, long j2, long j3, boolean z, String str, ms2 ms2Var, int i) {
            str.getClass();
            ms2Var.getClass();
            this.f47008a = j;
            this.b = j2;
            this.c = j3;
            this.d = z;
            this.e = str;
            this.f = ms2Var;
            this.g = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardSubGame)) {
                return false;
            }
            StandardSubGame standardSubGame = (StandardSubGame) obj;
            return this.f47008a == standardSubGame.f47008a && this.b == standardSubGame.b && this.c == standardSubGame.c && this.d == standardSubGame.d && Intrinsics.d(this.e, standardSubGame.e) && Intrinsics.d(this.f, standardSubGame.f) && this.g == standardSubGame.g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + ((this.f.hashCode() + ua80.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f47008a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = kng0.q(this.f47008a, "StandardSubGame(sportId=", ", gameId=");
            sbQ.append(this.b);
            kng0.A(sbQ, ", subGameId=", this.c, ", live=");
            f140.s(", name=", this.e, ", entryPointType=", sbQ, this.d);
            sbQ.append(this.f);
            sbQ.append(", typeId=");
            sbQ.append(this.g);
            sbQ.append(Separators.RPAREN);
            return sbQ.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f47008a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeInt(this.g);
        }
    }
}
