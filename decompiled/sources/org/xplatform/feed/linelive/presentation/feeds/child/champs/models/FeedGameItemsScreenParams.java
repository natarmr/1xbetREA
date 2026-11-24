package org.xplatform.feed.linelive.presentation.feeds.child.champs.models;

import a.brm0;
import a.cs0;
import a.j700;
import a.ohs0;
import a.ua80;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeedGameItemsScreenParams implements Parcelable {
    public static final Parcelable.Creator<FeedGameItemsScreenParams> CREATOR = new yoo((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46664a;
    public final j700 b;
    public final Set c;
    public final boolean d;
    public final String e;
    public final String f;

    public FeedGameItemsScreenParams(List list, j700 j700Var, Set set, boolean z, String str, String str2) {
        list.getClass();
        j700Var.getClass();
        set.getClass();
        str.getClass();
        str2.getClass();
        this.f46664a = list;
        this.b = j700Var;
        this.c = set;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedGameItemsScreenParams)) {
            return false;
        }
        FeedGameItemsScreenParams feedGameItemsScreenParams = (FeedGameItemsScreenParams) obj;
        return Intrinsics.d(this.f46664a, feedGameItemsScreenParams.f46664a) && this.b == feedGameItemsScreenParams.b && Intrinsics.d(this.c, feedGameItemsScreenParams.c) && this.d == feedGameItemsScreenParams.d && Intrinsics.d(this.e, feedGameItemsScreenParams.e) && Intrinsics.d(this.f, feedGameItemsScreenParams.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.e(ohs0.g(this.c, (this.b.hashCode() + (this.f46664a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedGameItemsScreenParams(champIds=");
        sb.append(this.f46664a);
        sb.append(", screenType=");
        sb.append(this.b);
        sb.append(", countries=");
        sb.append(this.c);
        sb.append(", top=");
        sb.append(this.d);
        sb.append(", componentKey=");
        return ua80.m(sb, this.e, ", title=", this.f, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46664a, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
        parcel.writeString(this.b.name());
        Set set = this.c;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
