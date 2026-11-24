package org.xplatform.sportgame.classic.impl.presentation.legacy.models;

import a.dja;
import a.qo7;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CardIdentity implements Parcelable {
    public static final Parcelable.Creator<CardIdentity> CREATOR = new qo7(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dja f46994a;
    public final int b;

    public CardIdentity(dja djaVar, int i) {
        djaVar.getClass();
        this.f46994a = djaVar;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardIdentity)) {
            return false;
        }
        CardIdentity cardIdentity = (CardIdentity) obj;
        return this.f46994a == cardIdentity.f46994a && this.b == cardIdentity.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f46994a.hashCode() * 31);
    }

    public final String toString() {
        return "CardIdentity(type=" + this.f46994a + ", position=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46994a.name());
        parcel.writeInt(this.b);
    }
}
