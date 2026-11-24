package org.xplatform.cyber.section.impl.championships.universal.domain.model.calendar_tournament;

import a.qo7;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/cyber/section/impl/championships/universal/domain/model/calendar_tournament/CalendarTournamentMatchStatusModel;", "Landroid/os/Parcelable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CalendarTournamentMatchStatusModel implements Parcelable {
    public static final Parcelable.Creator<CalendarTournamentMatchStatusModel> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CalendarTournamentMatchStatusModel f46576a;
    public static final CalendarTournamentMatchStatusModel b;
    public static final CalendarTournamentMatchStatusModel c;
    public static final /* synthetic */ CalendarTournamentMatchStatusModel[] d;

    static {
        CalendarTournamentMatchStatusModel calendarTournamentMatchStatusModel = new CalendarTournamentMatchStatusModel("LINE", 0);
        f46576a = calendarTournamentMatchStatusModel;
        CalendarTournamentMatchStatusModel calendarTournamentMatchStatusModel2 = new CalendarTournamentMatchStatusModel("LIVE", 1);
        b = calendarTournamentMatchStatusModel2;
        CalendarTournamentMatchStatusModel calendarTournamentMatchStatusModel3 = new CalendarTournamentMatchStatusModel("FINISHED", 2);
        c = calendarTournamentMatchStatusModel3;
        d = new CalendarTournamentMatchStatusModel[]{calendarTournamentMatchStatusModel, calendarTournamentMatchStatusModel2, calendarTournamentMatchStatusModel3};
        CREATOR = new qo7((byte) 17);
    }

    public static CalendarTournamentMatchStatusModel valueOf(String str) {
        return (CalendarTournamentMatchStatusModel) Enum.valueOf(CalendarTournamentMatchStatusModel.class, str);
    }

    public static CalendarTournamentMatchStatusModel[] values() {
        return (CalendarTournamentMatchStatusModel[]) d.clone();
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
