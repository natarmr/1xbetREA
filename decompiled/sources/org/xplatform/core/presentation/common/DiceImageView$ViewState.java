package org.xplatform.core.presentation.common;

import a.h9g;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/core/presentation/common/DiceImageView$ViewState", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DiceImageView$ViewState implements Parcelable {
    public static final Parcelable.Creator<DiceImageView$ViewState> CREATOR = new h9g((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f46463a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;

    public DiceImageView$ViewState(float f, float f2, float f3, int i, int i2) {
        this.f46463a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.f46463a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
