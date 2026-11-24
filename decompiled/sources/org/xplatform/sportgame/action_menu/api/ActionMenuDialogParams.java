package org.xplatform.sportgame.action_menu.api;

import a.brm0;
import a.ibw0;
import a.kng0;
import a.rw2;
import a.ua80;
import a.w6x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ActionMenuDialogParams implements Parcelable {
    public static final Parcelable.Creator<ActionMenuDialogParams> CREATOR = new ibw0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46984a;
    public final long b;
    public final String c;
    public final long d;
    public final boolean e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;

    public ActionMenuDialogParams(long j, long j2, String str, long j3, boolean z, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, boolean z8) {
        str.getClass();
        str2.getClass();
        this.f46984a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = z;
        this.f = j4;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = str2;
        this.n = z8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionMenuDialogParams)) {
            return false;
        }
        ActionMenuDialogParams actionMenuDialogParams = (ActionMenuDialogParams) obj;
        return this.f46984a == actionMenuDialogParams.f46984a && this.b == actionMenuDialogParams.b && Intrinsics.d(this.c, actionMenuDialogParams.c) && this.d == actionMenuDialogParams.d && this.e == actionMenuDialogParams.e && this.f == actionMenuDialogParams.f && this.g == actionMenuDialogParams.g && this.h == actionMenuDialogParams.h && this.i == actionMenuDialogParams.i && this.j == actionMenuDialogParams.j && this.k == actionMenuDialogParams.k && this.l == actionMenuDialogParams.l && Intrinsics.d(this.m, actionMenuDialogParams.m) && this.n == actionMenuDialogParams.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(rw2.b(brm0.e(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f46984a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46984a, "ActionMenuDialogParams(gameId=", ", subGameId=");
        kng0.z(sbQ, this.b, ", statGameId=", this.c);
        kng0.A(sbQ, ", constId=", this.d, ", live=");
        rw2.v(this.f, ", sportId=", sbQ, this.e);
        w6x.A(", statisticAvailable=", ", marketsGraphAvailable=", sbQ, this.g, this.h);
        w6x.A(", settingAvailable=", ", duelAvailable=", sbQ, this.i, this.j);
        w6x.A(", subscriptionAvailable=", ", expandAvailable=", sbQ, this.k, this.l);
        w6x.z(", componentKey=", this.m, ", betsOnPlayersAvailable=", sbQ, this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46984a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
