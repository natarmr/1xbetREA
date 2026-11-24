package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
        layoutParams.e = 0.0f;
        layoutParams.f = 1.0f;
        layoutParams.g = -1;
        layoutParams.h = -1.0f;
        layoutParams.k = 16777215;
        layoutParams.l = 16777215;
        layoutParams.e = parcel.readFloat();
        layoutParams.f = parcel.readFloat();
        layoutParams.g = parcel.readInt();
        layoutParams.h = parcel.readFloat();
        layoutParams.i = parcel.readInt();
        layoutParams.j = parcel.readInt();
        layoutParams.k = parcel.readInt();
        layoutParams.l = parcel.readInt();
        layoutParams.m = parcel.readByte() != 0;
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
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}
