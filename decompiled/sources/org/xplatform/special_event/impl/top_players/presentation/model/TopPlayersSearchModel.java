package org.xplatform.special_event.impl.top_players.presentation.model;

import a.l7n0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/top_players/presentation/model/TopPlayersSearchModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopPlayersSearchModel implements Parcelable {
    public static final Parcelable.Creator<TopPlayersSearchModel> CREATOR = new l7n0((byte) 24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46977a;
    public final String b;

    public TopPlayersSearchModel(String str, boolean z) {
        str.getClass();
        this.f46977a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopPlayersSearchModel)) {
            return false;
        }
        TopPlayersSearchModel topPlayersSearchModel = (TopPlayersSearchModel) obj;
        return this.f46977a == topPlayersSearchModel.f46977a && Intrinsics.d(this.b, topPlayersSearchModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f46977a) * 31);
    }

    public final String toString() {
        return ua80.k("TopPlayersSearchModel(isInFocus=", this.f46977a, ", text=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46977a ? 1 : 0);
        parcel.writeString(this.b);
    }
}
