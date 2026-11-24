package org.xplatform.personal.impl.presentation.edit.models;

import a.d860;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ProfileEditUiModelTitle extends ProfileEditUiModel {
    public static final Parcelable.Creator<ProfileEditUiModelTitle> CREATOR = new d860((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46793a;

    public ProfileEditUiModelTitle(int i) {
        this.f46793a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileEditUiModelTitle) && this.f46793a == ((ProfileEditUiModelTitle) obj).f46793a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46793a);
    }

    public final String toString() {
        return ua80.e(this.f46793a, "ProfileEditUiModelTitle(textRes=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46793a);
    }
}
