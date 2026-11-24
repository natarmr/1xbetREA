package a;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class ctg0 extends RuntimeException {
    public ctg0(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        twn.w(iDataPosition, str, " Parcel: pos=", " size=", sb);
        sb.append(iDataSize);
        super(sb.toString());
    }
}
