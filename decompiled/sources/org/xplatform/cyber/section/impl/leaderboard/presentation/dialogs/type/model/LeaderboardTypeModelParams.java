package org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.type.model;

import a.cs0;
import a.imw;
import a.xhz;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LeaderboardTypeModelParams implements Parcelable {
    public static final Parcelable.Creator<LeaderboardTypeModelParams> CREATOR = new imw(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46583a;
    public final xhz b;

    public LeaderboardTypeModelParams(List list, xhz xhzVar) {
        list.getClass();
        xhzVar.getClass();
        this.f46583a = list;
        this.b = xhzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardTypeModelParams)) {
            return false;
        }
        LeaderboardTypeModelParams leaderboardTypeModelParams = (LeaderboardTypeModelParams) obj;
        return Intrinsics.d(this.f46583a, leaderboardTypeModelParams.f46583a) && this.b == leaderboardTypeModelParams.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46583a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardTypeModelParams(types=" + this.f46583a + ", selectedType=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46583a, parcel);
        while (itT.hasNext()) {
            parcel.writeString(((xhz) itT.next()).name());
        }
        parcel.writeString(this.b.name());
    }
}
