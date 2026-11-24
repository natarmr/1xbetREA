package org.xplatform.mailing.api.presentation.models;

import a.b1j;
import a.l7n0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TelegramBonusCodeParams implements Parcelable {
    public static final Parcelable.Creator<TelegramBonusCodeParams> CREATOR = new l7n0((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46766a;
    public final String b;

    public TelegramBonusCodeParams(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46766a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelegramBonusCodeParams)) {
            return false;
        }
        TelegramBonusCodeParams telegramBonusCodeParams = (TelegramBonusCodeParams) obj;
        return Intrinsics.d(this.f46766a, telegramBonusCodeParams.f46766a) && Intrinsics.d(this.b, telegramBonusCodeParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46766a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TelegramBonusCodeParams(link=", this.f46766a, ", code=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46766a);
        parcel.writeString(this.b);
    }
}
