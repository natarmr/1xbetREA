package org.xplatform.cyber.game.core.presentation.action;

import a.brm0;
import a.cs0;
import a.dw9;
import a.hne;
import a.kng0;
import a.okc;
import a.rw2;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberActionDialogParams implements Parcelable {
    public static final Parcelable.Creator<CyberActionDialogParams> CREATOR = new okc((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46507a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final boolean f;
    public final long g;
    public final long h;
    public final String i;
    public final List j;
    public final List k;
    public final boolean l;
    public final String m;
    public final int n;
    public final long o;
    public final String p;

    public CyberActionDialogParams(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        str3.getClass();
        this.f46507a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = j4;
        this.f = z2;
        this.g = j5;
        this.h = j6;
        this.i = str;
        this.j = list;
        this.k = list2;
        this.l = z3;
        this.m = str2;
        this.n = i;
        this.o = j7;
        this.p = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberActionDialogParams)) {
            return false;
        }
        CyberActionDialogParams cyberActionDialogParams = (CyberActionDialogParams) obj;
        return this.f46507a == cyberActionDialogParams.f46507a && this.b == cyberActionDialogParams.b && this.c == cyberActionDialogParams.c && this.d == cyberActionDialogParams.d && this.e == cyberActionDialogParams.e && this.f == cyberActionDialogParams.f && this.g == cyberActionDialogParams.g && this.h == cyberActionDialogParams.h && Intrinsics.d(this.i, cyberActionDialogParams.i) && Intrinsics.d(this.j, cyberActionDialogParams.j) && Intrinsics.d(this.k, cyberActionDialogParams.k) && this.l == cyberActionDialogParams.l && Intrinsics.d(this.m, cyberActionDialogParams.m) && this.n == cyberActionDialogParams.n && this.o == cyberActionDialogParams.o && Intrinsics.d(this.p, cyberActionDialogParams.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + rw2.b(twn.a(this.n, ua80.b(brm0.e(dw9.a(dw9.a(ua80.b(rw2.b(rw2.b(brm0.e(rw2.b(rw2.b(brm0.e(rw2.b(Long.hashCode(this.f46507a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46507a, "CyberActionDialogParams(gameId=", ", constId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        kng0.A(sbQ, ", teamOneId=", this.d, ", teamTwoId=");
        hne.t(this.e, ", autoStreamVisible=", sbQ, this.f);
        kng0.A(sbQ, ", sportId=", this.g, ", subSportId=");
        kng0.z(sbQ, this.h, ", sportName=", this.i);
        hne.v(", statisticBlocksAvailableStats=", ", statisticBlocksDisableStats=", sbQ, this.j, this.k);
        hne.u(", statisticBlocksActive=", ", statId=", this.m, sbQ, this.l);
        rw2.x(sbQ, ", globalChampId=", this.n, ", champId=");
        kng0.z(sbQ, this.o, ", champName=", this.p);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46507a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        Iterator itT = cs0.t(this.j, parcel);
        while (itT.hasNext()) {
            parcel.writeInt(((Number) itT.next()).intValue());
        }
        Iterator itT2 = cs0.t(this.k, parcel);
        while (itT2.hasNext()) {
            parcel.writeInt(((Number) itT2.next()).intValue());
        }
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeLong(this.o);
        parcel.writeString(this.p);
    }
}
