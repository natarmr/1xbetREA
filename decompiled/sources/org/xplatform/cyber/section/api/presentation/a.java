package org.xplatform.cyber.section.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new CyberMainDisciplinesParams.Disciplines((CyberGamesPage) parcel.readParcelable(CyberMainDisciplinesParams.Disciplines.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CyberMainDisciplinesParams.Disciplines[i];
    }
}
