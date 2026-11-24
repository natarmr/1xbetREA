package org.xplatform.betting.core.zip.model.zip.game;

import a.cs0;
import a.kng0;
import a.lbi0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/game/StatInfo;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StatInfo implements Parcelable {
    public static final Parcelable.Creator<StatInfo> CREATOR = new lbi0((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f46433a;
    public final List b;

    public StatInfo(Integer num, List list) {
        list.getClass();
        this.f46433a = num;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatInfo)) {
            return false;
        }
        StatInfo statInfo = (StatInfo) obj;
        return Intrinsics.d(this.f46433a, statInfo.f46433a) && Intrinsics.d(this.b, statInfo.b);
    }

    public final int hashCode() {
        Integer num = this.f46433a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return kng0.h(this.f46433a, "StatInfo(keyInfo=", ", valueInfo=", Separators.RPAREN, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.f46433a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num);
        }
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            ((GameStatistic) itT.next()).writeToParcel(parcel, i);
        }
    }
}
