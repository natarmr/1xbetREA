package org.xplatform.banners.api.domain.models;

import a.b1j;
import a.cs0;
import a.d860;
import a.f140;
import a.rz4;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/banners/api/domain/models/PartnersTeamInfoBannerModel;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PartnersTeamInfoBannerModel implements Parcelable {
    public static final Parcelable.Creator<PartnersTeamInfoBannerModel> CREATOR = new d860((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46380a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public PartnersTeamInfoBannerModel(String str, String str2, String str3, String str4, ArrayList arrayList) {
        cs0.x(str, str2, str3, str4);
        this.f46380a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartnersTeamInfoBannerModel)) {
            return false;
        }
        PartnersTeamInfoBannerModel partnersTeamInfoBannerModel = (PartnersTeamInfoBannerModel) obj;
        return Intrinsics.d(this.f46380a, partnersTeamInfoBannerModel.f46380a) && Intrinsics.d(this.b, partnersTeamInfoBannerModel.b) && Intrinsics.d(this.c, partnersTeamInfoBannerModel.c) && Intrinsics.d(this.d, partnersTeamInfoBannerModel.d) && this.e.equals(partnersTeamInfoBannerModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f46380a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PartnersTeamInfoBannerModel(teamName=", this.f46380a, ", teamId=", this.b, ", teamImage=");
        f140.v(sbN, this.c, ", teamAdditionalInfo=", this.d, ", teamSubSportIds=");
        return rz4.n(sbN, this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46380a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        ArrayList arrayList = this.e;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
    }
}
