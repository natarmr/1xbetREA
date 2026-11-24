package org.xplatform.cyber.section.api.virtualgamescategories;

import a.hne;
import a.rdr0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VirtualCategoryDisciplinesParams implements Parcelable {
    public static final Parcelable.Creator<VirtualCategoryDisciplinesParams> CREATOR = new rdr0((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46573a;

    public VirtualCategoryDisciplinesParams(ArrayList arrayList) {
        this.f46573a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VirtualCategoryDisciplinesParams) && this.f46573a.equals(((VirtualCategoryDisciplinesParams) obj).f46573a);
    }

    public final int hashCode() {
        return this.f46573a.hashCode();
    }

    public final String toString() {
        return hne.o("VirtualCategoryDisciplinesParams(sportsId=", Separators.RPAREN, this.f46573a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ArrayList arrayList = this.f46573a;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
    }
}
