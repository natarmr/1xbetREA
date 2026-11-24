package org.xplatform.cyber.section.api.discipline.presentation.model;

import a.h9g;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DisciplineListParams implements Parcelable {
    public static final Parcelable.Creator<DisciplineListParams> CREATOR = new h9g((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGamesPage f46555a;

    public DisciplineListParams(CyberGamesPage cyberGamesPage) {
        cyberGamesPage.getClass();
        this.f46555a = cyberGamesPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisciplineListParams) && Intrinsics.d(this.f46555a, ((DisciplineListParams) obj).f46555a);
    }

    public final int hashCode() {
        return this.f46555a.hashCode();
    }

    public final String toString() {
        return "DisciplineListParams(page=" + this.f46555a + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46555a, i);
    }
}
