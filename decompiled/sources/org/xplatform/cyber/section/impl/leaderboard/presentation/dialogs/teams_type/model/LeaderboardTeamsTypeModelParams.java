package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.teams_type.model;

import a.epe;
import a.imw;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardTeamsTypeModelParams implements Parcelable {
    public static final Parcelable.Creator<LeaderboardTeamsTypeModelParams> CREATOR = new imw(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epe f46580a;

    public LeaderboardTeamsTypeModelParams(epe epeVar) {
        epeVar.getClass();
        this.f46580a = epeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaderboardTeamsTypeModelParams) && this.f46580a == ((LeaderboardTeamsTypeModelParams) obj).f46580a;
    }

    public final int hashCode() {
        return this.f46580a.hashCode();
    }

    public final String toString() {
        return "LeaderboardTeamsTypeModelParams(selectedType=" + this.f46580a + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46580a.name());
    }
}
