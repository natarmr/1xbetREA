package org.xplatform.aggregator.api.model.tournaments;

import a.gqt0;
import a.rdr0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserActionButtonModel implements Parcelable {
    public static final Parcelable.Creator<UserActionButtonModel> CREATOR = new rdr0((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46270a;
    public final gqt0 b;

    public UserActionButtonModel(String str, gqt0 gqt0Var) {
        str.getClass();
        gqt0Var.getClass();
        this.f46270a = str;
        this.b = gqt0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserActionButtonModel)) {
            return false;
        }
        UserActionButtonModel userActionButtonModel = (UserActionButtonModel) obj;
        return Intrinsics.d(this.f46270a, userActionButtonModel.f46270a) && this.b == userActionButtonModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46270a.hashCode() * 31);
    }

    public final String toString() {
        return "UserActionButtonModel(title=" + this.f46270a + ", type=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46270a);
        parcel.writeString(this.b.name());
    }
}
