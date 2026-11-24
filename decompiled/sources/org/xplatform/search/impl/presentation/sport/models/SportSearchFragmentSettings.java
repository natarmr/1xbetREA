package org.xplatform.search.impl.presentation.sport.models;

import a.lbi0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportSearchFragmentSettings implements Parcelable {
    public static final Parcelable.Creator<SportSearchFragmentSettings> CREATOR = new lbi0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46919a;
    public final GlobalSearchContainerSettings b;

    public SportSearchFragmentSettings(String str, GlobalSearchContainerSettings globalSearchContainerSettings) {
        str.getClass();
        globalSearchContainerSettings.getClass();
        this.f46919a = str;
        this.b = globalSearchContainerSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportSearchFragmentSettings)) {
            return false;
        }
        SportSearchFragmentSettings sportSearchFragmentSettings = (SportSearchFragmentSettings) obj;
        return Intrinsics.d(this.f46919a, sportSearchFragmentSettings.f46919a) && Intrinsics.d(this.b, sportSearchFragmentSettings.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46919a.hashCode() * 31);
    }

    public final String toString() {
        return "SportSearchFragmentSettings(componentKey=" + this.f46919a + ", settings=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46919a);
        parcel.writeParcelable(this.b, i);
    }
}
