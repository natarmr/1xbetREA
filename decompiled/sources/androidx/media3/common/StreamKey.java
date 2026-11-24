package androidx.media3.common;

import a.lbi0;
import a.vtt0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new lbi0(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45384a;
    public final int b;
    public final int c;

    static {
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(2);
    }

    public StreamKey(Parcel parcel) {
        this.f45384a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f45384a - streamKey2.f45384a;
        return (i == 0 && (i = this.b - streamKey2.b) == 0) ? this.c - streamKey2.c : i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f45384a == streamKey.f45384a && this.b == streamKey.b && this.c == streamKey.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f45384a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.f45384a + Separators.DOT + this.b + Separators.DOT + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45384a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
