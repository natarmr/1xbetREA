package org.xplatform.statistic.horse_menu.domain.model;

import a.axq;
import a.f140;
import a.imw;
import a.ohs0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HorseInfoModel implements Parcelable {
    public static final Parcelable.Creator<HorseInfoModel> CREATOR = new imw((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47035a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public HorseInfoModel(String str, String str2, String str3, String str4, String str5, long j) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f47035a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorseInfoModel)) {
            return false;
        }
        HorseInfoModel horseInfoModel = (HorseInfoModel) obj;
        return this.f47035a == horseInfoModel.f47035a && Intrinsics.d(this.b, horseInfoModel.b) && Intrinsics.d(this.c, horseInfoModel.c) && Intrinsics.d(this.d, horseInfoModel.d) && Intrinsics.d(this.e, horseInfoModel.e) && Intrinsics.d(this.f, horseInfoModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f47035a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f47035a, "HorseInfoModel(sportId=", ", id=", this.b);
        f140.v(sbO, ", title=", this.c, ", gender=", this.d);
        f140.v(sbO, ", trainerName=", this.e, ", damAndSire=", this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f47035a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
