package org.xplatform.feed.linelive.presentation.feeds.child.champs.models;

import a.cs0;
import a.j700;
import a.ohs0;
import a.rw2;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeedsChampsItemsScreenParams implements Parcelable {
    public static final Parcelable.Creator<FeedsChampsItemsScreenParams> CREATOR = new yoo((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46665a;
    public final j700 b;
    public final Set c;
    public final String d;
    public final boolean e;

    public FeedsChampsItemsScreenParams(List list, j700 j700Var, Set set, String str, boolean z) {
        list.getClass();
        j700Var.getClass();
        set.getClass();
        str.getClass();
        this.f46665a = list;
        this.b = j700Var;
        this.c = set;
        this.d = str;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedsChampsItemsScreenParams)) {
            return false;
        }
        FeedsChampsItemsScreenParams feedsChampsItemsScreenParams = (FeedsChampsItemsScreenParams) obj;
        return Intrinsics.d(this.f46665a, feedsChampsItemsScreenParams.f46665a) && this.b == feedsChampsItemsScreenParams.b && Intrinsics.d(this.c, feedsChampsItemsScreenParams.c) && Intrinsics.d(this.d, feedsChampsItemsScreenParams.d) && this.e == feedsChampsItemsScreenParams.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ohs0.g(this.c, (this.b.hashCode() + (this.f46665a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedsChampsItemsScreenParams(champIds=");
        sb.append(this.f46665a);
        sb.append(", screenType=");
        sb.append(this.b);
        sb.append(", countries=");
        sb.append(this.c);
        sb.append(", componentKey=");
        sb.append(this.d);
        sb.append(", top=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator itT = cs0.t(this.f46665a, parcel);
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
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
