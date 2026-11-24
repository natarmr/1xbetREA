package org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params;

import a.cs0;
import a.ohs0;
import a.qo7;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BonusAccountScreenParams implements Parcelable {
    public static final Parcelable.Creator<BonusAccountScreenParams> CREATOR = new qo7((byte) 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47317a;
    public final List b;

    public BonusAccountScreenParams(String str, List list) {
        str.getClass();
        list.getClass();
        this.f47317a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusAccountScreenParams)) {
            return false;
        }
        BonusAccountScreenParams bonusAccountScreenParams = (BonusAccountScreenParams) obj;
        return Intrinsics.d(this.f47317a, bonusAccountScreenParams.f47317a) && Intrinsics.d(this.b, bonusAccountScreenParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f47317a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("BonusAccountScreenParams(requestKey=", this.f47317a, ", accounts=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f47317a);
        Iterator itT = cs0.t(this.b, parcel);
        while (itT.hasNext()) {
            parcel.writeParcelable((Parcelable) itT.next(), i);
        }
    }
}
