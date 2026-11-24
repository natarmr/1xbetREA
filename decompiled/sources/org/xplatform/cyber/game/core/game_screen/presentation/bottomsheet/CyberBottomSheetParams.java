package org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet;

import a.axq;
import a.brm0;
import a.grs;
import a.hne;
import a.kng0;
import a.ms2;
import a.okc;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<CyberBottomSheetParams> CREATOR = new okc((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46506a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final ms2 g;
    public final grs h;
    public final String i;

    public CyberBottomSheetParams(long j, long j2, boolean z, long j3, long j4, long j5, ms2 ms2Var, grs grsVar, String str) {
        ms2Var.getClass();
        grsVar.getClass();
        str.getClass();
        this.f46506a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = ms2Var;
        this.h = grsVar;
        this.i = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberBottomSheetParams)) {
            return false;
        }
        CyberBottomSheetParams cyberBottomSheetParams = (CyberBottomSheetParams) obj;
        return this.f46506a == cyberBottomSheetParams.f46506a && this.b == cyberBottomSheetParams.b && this.c == cyberBottomSheetParams.c && this.d == cyberBottomSheetParams.d && this.e == cyberBottomSheetParams.e && this.f == cyberBottomSheetParams.f && Intrinsics.d(this.g, cyberBottomSheetParams.g) && this.h == cyberBottomSheetParams.h && Intrinsics.d(this.i, cyberBottomSheetParams.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + rw2.b(rw2.b(rw2.b(brm0.e(rw2.b(Long.hashCode(this.f46506a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46506a, "CyberBottomSheetParams(gameId=", ", subGameId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        kng0.A(sbQ, ", sportId=", this.d, ", subSportId=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", champId=", this.f, ", entryPointType=");
        sbQ.append(this.g);
        sbQ.append(", initialAction=");
        sbQ.append(this.h);
        sbQ.append(", componentKey=");
        return axq.n(sbQ, this.i, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46506a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeString(this.h.name());
        parcel.writeString(this.i);
    }
}
