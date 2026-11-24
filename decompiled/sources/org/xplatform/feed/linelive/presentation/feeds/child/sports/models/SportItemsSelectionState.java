package org.xplatform.feed.linelive.presentation.feeds.child.sports.models;

import a.lbi0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportItemsSelectionState implements Parcelable {
    public static final Parcelable.Creator<SportItemsSelectionState> CREATOR = new lbi0((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46668a;
    public final Set b;

    public SportItemsSelectionState(Set set, boolean z) {
        set.getClass();
        this.f46668a = z;
        this.b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportItemsSelectionState)) {
            return false;
        }
        SportItemsSelectionState sportItemsSelectionState = (SportItemsSelectionState) obj;
        return this.f46668a == sportItemsSelectionState.f46668a && Intrinsics.d(this.b, sportItemsSelectionState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f46668a) * 31);
    }

    public final String toString() {
        return "SportItemsSelectionState(enabled=" + this.f46668a + ", sportIds=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46668a ? 1 : 0);
        Set set = this.b;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
    }
}
