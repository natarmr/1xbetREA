package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.f45460a = 1;
        layoutParams.b = 0.0f;
        layoutParams.c = 1.0f;
        layoutParams.d = -1;
        layoutParams.e = -1.0f;
        layoutParams.f = -1;
        layoutParams.g = -1;
        layoutParams.h = 16777215;
        layoutParams.i = 16777215;
        layoutParams.f45460a = parcel.readInt();
        layoutParams.b = parcel.readFloat();
        layoutParams.c = parcel.readFloat();
        layoutParams.d = parcel.readInt();
        layoutParams.e = parcel.readFloat();
        layoutParams.f = parcel.readInt();
        layoutParams.g = parcel.readInt();
        layoutParams.h = parcel.readInt();
        layoutParams.i = parcel.readInt();
        layoutParams.j = parcel.readByte() != 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
        return layoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FlexboxLayout.LayoutParams[i];
    }
}
