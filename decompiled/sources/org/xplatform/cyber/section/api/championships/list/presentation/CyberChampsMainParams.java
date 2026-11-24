package org.xplatform.cyber.section.api.championships.list.presentation;

import a.brm0;
import a.cs0;
import a.esw0;
import a.h9g;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;", "Landroid/os/Parcelable;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberChampsMainParams implements Parcelable {
    public static final Parcelable.Creator<CyberChampsMainParams> CREATOR = new h9g((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGamesPage f46548a;
    public final long b;
    public final boolean c;
    public final List d;

    public CyberChampsMainParams(CyberGamesPage cyberGamesPage, long j, boolean z, List list) {
        cyberGamesPage.getClass();
        list.getClass();
        this.f46548a = cyberGamesPage;
        this.b = j;
        this.c = z;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberChampsMainParams)) {
            return false;
        }
        CyberChampsMainParams cyberChampsMainParams = (CyberChampsMainParams) obj;
        return Intrinsics.d(this.f46548a, cyberChampsMainParams.f46548a) && this.b == cyberChampsMainParams.b && this.c == cyberChampsMainParams.c && Intrinsics.d(this.d, cyberChampsMainParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(rw2.b(this.f46548a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsMainParams(cyberGamesPage=");
        sb.append(this.f46548a);
        sb.append(", sportId=");
        sb.append(this.b);
        esw0.l(sb, ", initLivePosition=", this.c, ", disciplineIds=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f46548a, i);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Iterator itT = cs0.t(this.d, parcel);
        while (itT.hasNext()) {
            parcel.writeLong(((Number) itT.next()).longValue());
        }
    }
}
