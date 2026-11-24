package org.xplatform.betting.core.zip.model.zip;

import a.cs0;
import a.d860;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/PlayersDuelZip;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PlayersDuelZip implements Parcelable {
    public static final Parcelable.Creator<PlayersDuelZip> CREATOR = new d860((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46428a;
    public final List b;

    public PlayersDuelZip(List list, List list2) {
        this.f46428a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayersDuelZip)) {
            return false;
        }
        PlayersDuelZip playersDuelZip = (PlayersDuelZip) obj;
        return Intrinsics.d(this.f46428a, playersDuelZip.f46428a) && Intrinsics.d(this.b, playersDuelZip.b);
    }

    public final int hashCode() {
        List list = this.f46428a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("PlayersDuelZip(team1Ids=", ", team2Ids=", this.f46428a, Separators.RPAREN, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.f46428a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(((Number) it.next()).longValue());
            }
        }
        List list2 = this.b;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(((Number) it2.next()).longValue());
        }
    }
}
