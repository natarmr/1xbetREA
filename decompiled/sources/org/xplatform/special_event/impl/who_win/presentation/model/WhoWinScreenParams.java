package org.xplatform.special_event.impl.who_win.presentation.model;

import a.equ0;
import a.rw2;
import a.twn;
import a.vqd;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WhoWinScreenParams implements Parcelable {
    public static final Parcelable.Creator<WhoWinScreenParams> CREATOR = new equ0((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46980a;
    public final long b;
    public final int c;
    public final String d;

    public WhoWinScreenParams(String str, int i, int i2, long j) {
        str.getClass();
        this.f46980a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhoWinScreenParams)) {
            return false;
        }
        WhoWinScreenParams whoWinScreenParams = (WhoWinScreenParams) obj;
        return this.f46980a == whoWinScreenParams.f46980a && this.b == whoWinScreenParams.b && this.c == whoWinScreenParams.c && Intrinsics.d(this.d, whoWinScreenParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, rw2.b(Integer.hashCode(this.f46980a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f46980a, this.b, "WhoWinScreenParams(eventId=", ", sportId=");
        w6x.w(this.c, ", champId=", ", selectedGroup=", this.d, sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f46980a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
