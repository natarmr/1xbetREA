package org.xplatform.search.impl.presentation.xgames.models;

import a.b1j;
import a.equ0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class XGamesSearchFragmentSettings implements Parcelable {
    public static final Parcelable.Creator<XGamesSearchFragmentSettings> CREATOR = new equ0((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46920a;
    public final String b;

    public XGamesSearchFragmentSettings(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46920a = str;
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
        if (!(obj instanceof XGamesSearchFragmentSettings)) {
            return false;
        }
        XGamesSearchFragmentSettings xGamesSearchFragmentSettings = (XGamesSearchFragmentSettings) obj;
        return Intrinsics.d(this.f46920a, xGamesSearchFragmentSettings.f46920a) && Intrinsics.d(this.b, xGamesSearchFragmentSettings.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46920a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("XGamesSearchFragmentSettings(componentKey=", this.f46920a, ", umButtonClickResultKey=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46920a);
        parcel.writeString(this.b);
    }
}
