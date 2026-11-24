package org.xplatform.makebet_promocodes.api.presentation.models;

import a.brm0;
import a.d860;
import a.f140;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PromoCodeInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<PromoCodeInfoUiModel> CREATOR = new d860(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46775a;
    public final double b;
    public final String c;
    public final String d;
    public final int e;

    public PromoCodeInfoUiModel(double d, int i, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f46775a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeInfoUiModel)) {
            return false;
        }
        PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
        return Intrinsics.d(this.f46775a, promoCodeInfoUiModel.f46775a) && Double.compare(this.b, promoCodeInfoUiModel.b) == 0 && Intrinsics.d(this.c, promoCodeInfoUiModel.c) && Intrinsics.d(this.d, promoCodeInfoUiModel.d) && this.e == promoCodeInfoUiModel.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(ua80.b(brm0.d(this.b, this.f46775a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeInfoUiModel(promoCode=");
        sb.append(this.f46775a);
        sb.append(", amount=");
        sb.append(this.b);
        f140.v(sb, ", minCoef=", this.c, ", currencySymbol=", this.d);
        return vqd.p(sb, ", payoutType=", this.e, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46775a);
        parcel.writeDouble(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
