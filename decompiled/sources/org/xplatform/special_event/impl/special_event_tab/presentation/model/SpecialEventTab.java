package org.xplatform.special_event.impl.special_event_tab.presentation.model;

import a.as2;
import a.bs2;
import a.ms2;
import a.ur2;
import a.xr2;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;", "Landroid/os/Parcelable;", "Schedule", "MyGames", "Statistic", "Tournament", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$MyGames;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Schedule;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Statistic;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Tournament;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class SpecialEventTab implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46973a;
    public final String b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$MyGames;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class MyGames extends SpecialEventTab {
        public static final MyGames c = new MyGames("MyGamesFragment", "my_matches");
        public static final Parcelable.Creator<MyGames> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Schedule;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Schedule extends SpecialEventTab {
        public static final Schedule c = new Schedule("ScheduleFragment", "schedule");
        public static final Parcelable.Creator<Schedule> CREATOR = new b();

        @Override // org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab
        public final ms2 a(int i) {
            return new xr2(i);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Statistic;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Statistic extends SpecialEventTab {
        public static final Statistic c = new Statistic("StatisticFragment", "statistic");
        public static final Parcelable.Creator<Statistic> CREATOR = new c();

        @Override // org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab
        public final ms2 a(int i) {
            return new as2(i);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Tournament;", "Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Tournament extends SpecialEventTab {
        public static final Tournament c = new Tournament("TournamentFragment", "tournament");
        public static final Parcelable.Creator<Tournament> CREATOR = new d();

        @Override // org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab
        public final ms2 a(int i) {
            return new bs2(i);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public SpecialEventTab(String str, String str2) {
        this.f46973a = str;
        this.b = str2;
    }

    public ms2 a(int i) {
        return new ur2(i);
    }
}
