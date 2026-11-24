package org.xplatform.cyber.section.api.discipline.presentation.model;

import a.h9g;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DisciplineDetailsParams implements Parcelable {
    public static final Parcelable.Creator<DisciplineDetailsParams> CREATOR = new h9g((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46554a;
    public final CyberGamesPage b;

    public DisciplineDetailsParams(long j, CyberGamesPage cyberGamesPage) {
        cyberGamesPage.getClass();
        this.f46554a = j;
        this.b = cyberGamesPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisciplineDetailsParams)) {
            return false;
        }
        DisciplineDetailsParams disciplineDetailsParams = (DisciplineDetailsParams) obj;
        return this.f46554a == disciplineDetailsParams.f46554a && Intrinsics.d(this.b, disciplineDetailsParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f46554a) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsParams(sportId=" + this.f46554a + ", cyberGamesPage=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46554a);
        parcel.writeParcelable(this.b, i);
    }
}
