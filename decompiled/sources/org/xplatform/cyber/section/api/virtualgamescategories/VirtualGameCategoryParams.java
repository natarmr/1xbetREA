package org.xplatform.cyber.section.api.virtualgamescategories;

import a.equ0;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VirtualGameCategoryParams implements Parcelable {
    public static final Parcelable.Creator<VirtualGameCategoryParams> CREATOR = new equ0((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46574a;
    public final int b;
    public final String c;
    public final String d;

    public VirtualGameCategoryParams(int i, String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.f46574a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualGameCategoryParams)) {
            return false;
        }
        VirtualGameCategoryParams virtualGameCategoryParams = (VirtualGameCategoryParams) obj;
        return this.f46574a.equals(virtualGameCategoryParams.f46574a) && this.b == virtualGameCategoryParams.b && Intrinsics.d(this.c, virtualGameCategoryParams.c) && Intrinsics.d(this.d, virtualGameCategoryParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f46574a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualGameCategoryParams(sportIds=");
        sb.append(this.f46574a);
        sb.append(", categoryId=");
        sb.append(this.b);
        sb.append(", sportCategoryName=");
        return ua80.m(sb, this.c, ", sportCategoryNameEng=", this.d, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ArrayList arrayList = this.f46574a;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
