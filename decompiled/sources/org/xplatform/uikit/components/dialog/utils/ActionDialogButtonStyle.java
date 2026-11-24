package org.xplatform.uikit.components.dialog.utils;

import a.dw9;
import a.hne;
import a.ibw0;
import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ActionDialogButtonStyle implements Parcelable {
    public static final Parcelable.Creator<ActionDialogButtonStyle> CREATOR = new ibw0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f47243a;
    public final Integer b;
    public final Integer c;

    public ActionDialogButtonStyle(Integer num, Integer num2, Integer num3) {
        this.f47243a = num;
        this.b = num2;
        this.c = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDialogButtonStyle)) {
            return false;
        }
        ActionDialogButtonStyle actionDialogButtonStyle = (ActionDialogButtonStyle) obj;
        return Intrinsics.d(this.f47243a, actionDialogButtonStyle.f47243a) && Intrinsics.d(this.b, actionDialogButtonStyle.b) && Intrinsics.d(this.c, actionDialogButtonStyle.c);
    }

    public final int hashCode() {
        Integer num = this.f47243a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("ActionDialogButtonStyle(firstButtonStyle=", this.f47243a, ", secondButtonStyle=", this.b, ", thirdButtonStyle="), this.c, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.f47243a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num);
        }
        Integer num2 = this.b;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num2);
        }
        Integer num3 = this.c;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kng0.y(parcel, 1, num3);
        }
    }
}
