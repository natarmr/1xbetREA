package org.xplatform.statistic.champ_statistic.presentation.models;

import a.axq;
import a.qo7;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChampSubMenuItem implements Parcelable {
    public static final Parcelable.Creator<ChampSubMenuItem> CREATOR = new qo7(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChampMenuType f47019a;
    public final String b;
    public final String c;

    public ChampSubMenuItem(ChampMenuType champMenuType, String str, String str2) {
        champMenuType.getClass();
        str.getClass();
        str2.getClass();
        this.f47019a = champMenuType;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChampSubMenuItem)) {
            return false;
        }
        ChampSubMenuItem champSubMenuItem = (ChampSubMenuItem) obj;
        return Intrinsics.d(this.f47019a, champSubMenuItem.f47019a) && Intrinsics.d(this.b, champSubMenuItem.b) && Intrinsics.d(this.c, champSubMenuItem.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f47019a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampSubMenuItem(menuType=");
        sb.append(this.f47019a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f47019a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
