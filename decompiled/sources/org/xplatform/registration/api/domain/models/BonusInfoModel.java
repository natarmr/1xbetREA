package org.xplatform.registration.api.domain.models;

import a.qo7;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/api/domain/models/BonusInfoModel;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BonusInfoModel implements Parcelable {
    public static final Parcelable.Creator<BonusInfoModel> CREATOR = new qo7((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46848a;
    public final String b;
    public final String c;
    public final boolean d;

    public BonusInfoModel(int i, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f46848a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusInfoModel)) {
            return false;
        }
        BonusInfoModel bonusInfoModel = (BonusInfoModel) obj;
        return this.f46848a == bonusInfoModel.f46848a && Intrinsics.d(this.b, bonusInfoModel.b) && Intrinsics.d(this.c, bonusInfoModel.c) && this.d == bonusInfoModel.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Integer.hashCode(this.f46848a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return c.c(this.c, ", isDefaultBonus=", Separators.RPAREN, vqd.r(this.f46848a, "BonusInfoModel(id=", ", name=", this.b, ", description="), this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46848a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
