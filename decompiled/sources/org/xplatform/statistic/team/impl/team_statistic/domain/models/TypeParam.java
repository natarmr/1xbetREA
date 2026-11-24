package org.xplatform.statistic.team.impl.team_statistic.domain.models;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;", "Landroid/os/Parcelable;", "Game", "Team", "Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;", "Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface TypeParam extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;", "Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Game implements TypeParam {
        public static final Parcelable.Creator<Game> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47088a;

        public Game(String str) {
            str.getClass();
            this.f47088a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Game) && Intrinsics.d(this.f47088a, ((Game) obj).f47088a);
        }

        public final int hashCode() {
            return this.f47088a.hashCode();
        }

        public final String toString() {
            return kng0.l("Game(id=", this.f47088a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47088a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;", "Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Team implements TypeParam {
        public static final Parcelable.Creator<Team> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47089a;

        public Team(String str) {
            str.getClass();
            this.f47089a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Team) && Intrinsics.d(this.f47089a, ((Team) obj).f47089a);
        }

        public final int hashCode() {
            return this.f47089a.hashCode();
        }

        public final String toString() {
            return kng0.l("Team(id=", this.f47089a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47089a);
        }
    }
}
