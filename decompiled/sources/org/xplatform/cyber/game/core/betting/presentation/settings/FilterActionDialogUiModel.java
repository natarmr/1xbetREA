package org.xplatform.cyber.game.core.betting.presentation.settings;

import a.f140;
import a.ki;
import a.rw2;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/core/betting/presentation/settings/FilterActionDialogUiModel;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FilterActionDialogUiModel implements Parcelable {
    public static final Parcelable.Creator<FilterActionDialogUiModel> CREATOR = new yoo(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46504a;
    public final long b;
    public final ki c;
    public final ki d;

    public FilterActionDialogUiModel(String str, long j, ki kiVar, ki kiVar2) {
        str.getClass();
        kiVar.getClass();
        kiVar2.getClass();
        this.f46504a = str;
        this.b = j;
        this.c = kiVar;
        this.d = kiVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterActionDialogUiModel)) {
            return false;
        }
        FilterActionDialogUiModel filterActionDialogUiModel = (FilterActionDialogUiModel) obj;
        return Intrinsics.d(this.f46504a, filterActionDialogUiModel.f46504a) && this.b == filterActionDialogUiModel.b && this.c == filterActionDialogUiModel.c && this.d == filterActionDialogUiModel.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f46504a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "FilterActionDialogUiModel(title=", this.f46504a, ", marketId=");
        sbO.append(", actionOne=");
        sbO.append(this.c);
        sbO.append(", actionTwo=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46504a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
    }
}
