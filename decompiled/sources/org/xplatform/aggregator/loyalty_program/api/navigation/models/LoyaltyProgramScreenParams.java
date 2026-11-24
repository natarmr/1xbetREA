package org.xplatform.aggregator.loyalty_program.api.navigation.models;

import a.imw;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyProgramScreenParams implements Parcelable {
    public static final Parcelable.Creator<LoyaltyProgramScreenParams> CREATOR = new imw((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46310a;

    public LoyaltyProgramScreenParams(boolean z) {
        this.f46310a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoyaltyProgramScreenParams) && this.f46310a == ((LoyaltyProgramScreenParams) obj).f46310a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46310a);
    }

    public final String toString() {
        return c.d("LoyaltyProgramScreenParams(fromAggregator=", Separators.RPAREN, this.f46310a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46310a ? 1 : 0);
    }
}
