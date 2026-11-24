package com.huawei.hms.common.webserverpic;

import a.dw9;
import a.jf4;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f45806a;
    private final int b;
    private final int c;

    public WebServerPic(Uri uri, int i, int i2) {
        this.f45806a = uri;
        this.b = i;
        this.c = i2;
        if (uri == null) {
            jf4.o("url is not able to be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            jf4.o("width and height should be positive or 0");
            throw null;
        }
    }

    public final int getHeight() {
        return this.c;
    }

    public final Uri getUrl() {
        return this.f45806a;
    }

    public final int getWidth() {
        return this.b;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        int i = this.b;
        int i2 = this.c;
        String string = this.f45806a.toString();
        StringBuilder sbT = dw9.t("Image ", i, "x", Separators.SP, i2);
        sbT.append(string);
        return sbT.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebServerPic(Uri uri) {
        this(uri, 0, 0);
    }
}
