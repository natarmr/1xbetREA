package com.yandex.authsdk;

import a.e2w0;
import a.jf4;
import a.ohq;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/authsdk/YandexAuthOptions;", "Landroid/os/Parcelable;", "CREATOR", "a/e2w0", "lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexAuthOptions implements Parcelable {
    public static final e2w0 CREATOR = new e2w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46055a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public YandexAuthOptions(Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            String packageName = context.getPackageName();
            packageName.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = packageManager.getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L));
                applicationInfo.getClass();
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                applicationInfo.getClass();
            }
            String string = applicationInfo.metaData.getString("com.yandex.auth.CLIENT_ID");
            if (string == null) {
                jf4.n("Application should provide client id in gradle.properties");
                throw null;
            }
            this.f46055a = string;
            this.b = true;
            String string2 = applicationInfo.metaData.getString("com.yandex.auth.OAUTH_HOST");
            string2.getClass();
            this.c = string2;
            this.d = false;
        } catch (PackageManager.NameNotFoundException e) {
            ohq.p(e);
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46055a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public YandexAuthOptions(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.b = z;
        this.f46055a = str;
        this.c = str2;
        this.d = z2;
    }

    public YandexAuthOptions(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.f46055a = string;
        this.b = parcel.readByte() != 0;
        String string2 = parcel.readString();
        string2.getClass();
        this.c = string2;
        this.d = parcel.readByte() != 0;
    }
}
