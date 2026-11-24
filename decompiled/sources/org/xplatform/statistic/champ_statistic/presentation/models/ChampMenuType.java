package org.xplatform.statistic.champ_statistic.presentation.models;

import a.dfm0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;", "La/dfm0;", "Landroid/os/Parcelable;", "ChampTourNet", "ChampTourTable", "ChampCompletedGames", "ChampUpcomingGames", "Undefined", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampCompletedGames;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampTourNet;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampTourTable;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampUpcomingGames;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$Undefined;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ChampMenuType implements dfm0, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47018a;
    public final byte b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampCompletedGames;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ChampCompletedGames extends ChampMenuType {
        public static final ChampCompletedGames c = new ChampCompletedGames(R.drawable.ic_info_last_games, 33);
        public static final Parcelable.Creator<ChampCompletedGames> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChampCompletedGames);
        }

        public final int hashCode() {
            return -1147233850;
        }

        public final String toString() {
            return "ChampCompletedGames";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampTourNet;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ChampTourNet extends ChampMenuType {
        public static final ChampTourNet c = new ChampTourNet(R.drawable.ic_info_grid, 31);
        public static final Parcelable.Creator<ChampTourNet> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChampTourNet);
        }

        public final int hashCode() {
            return 831239061;
        }

        public final String toString() {
            return "ChampTourNet";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampTourTable;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ChampTourTable extends ChampMenuType {
        public static final ChampTourTable c = new ChampTourTable(R.drawable.ic_info_tabble, 32);
        public static final Parcelable.Creator<ChampTourTable> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChampTourTable);
        }

        public final int hashCode() {
            return -37771322;
        }

        public final String toString() {
            return "ChampTourTable";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$ChampUpcomingGames;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ChampUpcomingGames extends ChampMenuType {
        public static final ChampUpcomingGames c = new ChampUpcomingGames(R.drawable.ic_info_vs, 34);
        public static final Parcelable.Creator<ChampUpcomingGames> CREATOR = new d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChampUpcomingGames);
        }

        public final int hashCode() {
            return 239067765;
        }

        public final String toString() {
            return "ChampUpcomingGames";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType$Undefined;", "Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Undefined extends ChampMenuType {
        public static final Undefined c = new Undefined(0, 0);
        public static final Parcelable.Creator<Undefined> CREATOR = new e();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Undefined);
        }

        public final int hashCode() {
            return 972675073;
        }

        public final String toString() {
            return "Undefined";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChampMenuType(int i, int i2) {
        this.f47018a = i;
        this.b = i2;
    }

    @Override // a.dfm0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF47018a() {
        return this.f47018a;
    }
}
