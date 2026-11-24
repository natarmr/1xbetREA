package org.xplatform.registration.simple.impl.presentation.state.models.fields;

import a.brm0;
import a.f140;
import a.kng0;
import a.lbi0;
import a.ohs0;
import a.twn;
import a.ua80;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/SocialStateModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialStateModel implements Parcelable {
    public static final Parcelable.Creator<SocialStateModel> CREATOR = new lbi0((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46858a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public SocialStateModel(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        ohs0.z(str, str2, str3, str4, str5);
        brm0.B(str6, str7, str8);
        this.f46858a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialStateModel)) {
            return false;
        }
        SocialStateModel socialStateModel = (SocialStateModel) obj;
        return this.f46858a == socialStateModel.f46858a && Intrinsics.d(this.b, socialStateModel.b) && this.c == socialStateModel.c && Intrinsics.d(this.d, socialStateModel.d) && Intrinsics.d(this.e, socialStateModel.e) && Intrinsics.d(this.f, socialStateModel.f) && Intrinsics.d(this.g, socialStateModel.g) && Intrinsics.d(this.h, socialStateModel.h) && Intrinsics.d(this.i, socialStateModel.i) && Intrinsics.d(this.j, socialStateModel.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f46858a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f46858a, "SocialStateModel(id=", ", authCode=", this.b, ", socialNetId=");
        kng0.w(this.c, ", tokenSecret=", this.d, ", socialAppKey=", sbR);
        f140.v(sbR, this.e, ", name=", this.f, ", sureName=");
        f140.v(sbR, this.g, ", email=", this.h, ", phone=");
        return ua80.m(sbR, this.i, ", token=", this.j, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46858a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
}
