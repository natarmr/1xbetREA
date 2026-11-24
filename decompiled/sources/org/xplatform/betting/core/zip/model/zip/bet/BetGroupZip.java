package org.xplatform.betting.core.zip.model.zip.bet;

import a.cs0;
import a.hne;
import a.ibw0;
import a.kng0;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;", "Landroid/os/Parcelable;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetGroupZip implements Parcelable {
    public static final Parcelable.Creator<BetGroupZip> CREATOR = new ibw0((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46429a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final List f;
    public final List g;
    public final boolean h;
    public final BetViewType i;

    public BetGroupZip(long j, long j2, String str, int i, int i2, ArrayList arrayList, List list) {
        this(j, j2, str, i, i2, arrayList, list, false, (j2 == 1316 || j2 == 1315) ? BetViewType.b : BetViewType.f46430a);
    }

    public static BetGroupZip a(BetGroupZip betGroupZip, ArrayList arrayList, boolean z, int i) {
        long j = betGroupZip.f46429a;
        long j2 = betGroupZip.b;
        String str = betGroupZip.c;
        int i2 = betGroupZip.d;
        int i3 = betGroupZip.e;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = betGroupZip.f;
        }
        List list2 = list;
        List list3 = betGroupZip.g;
        if ((i & 128) != 0) {
            z = betGroupZip.h;
        }
        BetViewType betViewType = betGroupZip.i;
        betGroupZip.getClass();
        str.getClass();
        list2.getClass();
        list3.getClass();
        betViewType.getClass();
        return new BetGroupZip(j, j2, str, i2, i3, list2, list3, z, betViewType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BetGroupZip.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        BetGroupZip betGroupZip = (BetGroupZip) obj;
        return this.b == betGroupZip.b && Intrinsics.d(this.f, betGroupZip.f);
    }

    public final int hashCode() {
        return (this.f.hashCode() * 31) + Long.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f46429a, "BetGroupZip(sportId=", ", groupId=");
        kng0.z(sbQ, this.b, ", groupName=", this.c);
        rw2.s(this.d, this.e, ", groupPosition=", ", columnCount=", sbQ);
        hne.v(", group=", ", childBets=", sbQ, this.f, this.g);
        sbQ.append(", isExpanded=");
        sbQ.append(this.h);
        sbQ.append(", type=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46429a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        Iterator itT = cs0.t(this.f, parcel);
        while (itT.hasNext()) {
            ((BetZip) itT.next()).writeToParcel(parcel, i);
        }
        Iterator itT2 = cs0.t(this.g, parcel);
        while (itT2.hasNext()) {
            ((ChildBets) itT2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        this.i.writeToParcel(parcel, i);
    }

    public BetGroupZip(long j, long j2, String str, int i, int i2, List list, List list2, boolean z, BetViewType betViewType) {
        str.getClass();
        list2.getClass();
        betViewType.getClass();
        this.f46429a = j;
        this.b = j2;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = list;
        this.g = list2;
        this.h = z;
        this.i = betViewType;
    }
}
