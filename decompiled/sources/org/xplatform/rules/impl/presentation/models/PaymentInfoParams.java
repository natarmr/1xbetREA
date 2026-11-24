package org.xplatform.rules.impl.presentation.models;

import a.d860;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PaymentInfoParams implements Parcelable {
    public static final Parcelable.Creator<PaymentInfoParams> CREATOR = new d860((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46908a;
    public final String b;
    public final int c;
    public final boolean d;

    public PaymentInfoParams(int i, int i2, String str, boolean z) {
        str.getClass();
        this.f46908a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46908a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
