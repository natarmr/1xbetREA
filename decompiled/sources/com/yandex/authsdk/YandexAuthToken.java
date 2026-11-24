package com.yandex.authsdk;

import a.axq;
import a.equ0;
import a.rw2;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/authsdk/YandexAuthToken;", "Landroid/os/Parcelable;", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class YandexAuthToken implements Parcelable {
    public static final Parcelable.Creator<YandexAuthToken> CREATOR = new equ0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46056a;
    public final long b;
    public final String c;

    public YandexAuthToken(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46056a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YandexAuthToken)) {
            return false;
        }
        YandexAuthToken yandexAuthToken = (YandexAuthToken) obj;
        return Intrinsics.d(this.f46056a, yandexAuthToken.f46056a) && this.b == yandexAuthToken.b && Intrinsics.d(this.c, yandexAuthToken.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f46056a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YandexAuthToken{token='");
        sb.append(this.f46056a);
        sb.append("', expiresIn=");
        sb.append(this.b);
        sb.append(", clientId=");
        return axq.m(sb, this.c, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46056a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
    }
}
