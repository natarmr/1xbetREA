package org.xplatform.favorites.impl.presentation.category;

import a.axq;
import a.brm0;
import a.kng0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;", "Landroid/os/Parcelable;", "Team", "Championship", "Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;", "Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class FavoriteCategoryUiState implements Parcelable {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;", "Landroid/os/Parcelable;", "Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Championship extends FavoriteCategoryUiState implements Parcelable {
        public static final Parcelable.Creator<Championship> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46636a;
        public final String b;

        public Championship(long j, String str) {
            str.getClass();
            this.f46636a = j;
            this.b = str;
        }

        @Override // org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF46637a() {
            return this.f46636a;
        }

        @Override // org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Championship)) {
                return false;
            }
            Championship championship = (Championship) obj;
            return this.f46636a == championship.f46636a && Intrinsics.d(this.b, championship.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.f46636a) * 31);
        }

        public final String toString() {
            StringBuilder sbO = axq.o(this.f46636a, "Championship(id=", ", title=", this.b);
            sbO.append(Separators.RPAREN);
            return sbO.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46636a);
            parcel.writeString(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;", "Landroid/os/Parcelable;", "Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Team extends FavoriteCategoryUiState implements Parcelable {
        public static final Parcelable.Creator<Team> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46637a;
        public final String b;
        public final long c;
        public final long d;

        public Team(long j, long j2, long j3, String str) {
            str.getClass();
            this.f46637a = j;
            this.b = str;
            this.c = j2;
            this.d = j3;
        }

        @Override // org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF46637a() {
            return this.f46637a;
        }

        @Override // org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Team)) {
                return false;
            }
            Team team = (Team) obj;
            return this.f46637a == team.f46637a && Intrinsics.d(this.b, team.b) && this.c == team.c && this.d == team.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + rw2.b(ua80.b(Long.hashCode(this.f46637a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbO = axq.o(this.f46637a, "Team(id=", ", title=", this.b);
            kng0.A(sbO, ", sportId=", this.c, ", subSportId=");
            return brm0.k(this.d, Separators.RPAREN, sbO);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46637a);
            parcel.writeString(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF46637a();

    /* JADX INFO: renamed from: b */
    public abstract String getB();
}
