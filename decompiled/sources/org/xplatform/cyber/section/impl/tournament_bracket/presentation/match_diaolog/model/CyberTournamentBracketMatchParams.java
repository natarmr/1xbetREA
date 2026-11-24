package org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model;

import a.a8z;
import a.ahi0;
import a.axq;
import a.b1j;
import a.dkh;
import a.ekh;
import a.f140;
import a.gch;
import a.h9g;
import a.m2x;
import a.maz;
import a.rw2;
import a.twn;
import a.ua80;
import a.wez;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;", "Landroid/os/Parcelable;", "Companion", "a/dkh", "a/ekh", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberTournamentBracketMatchParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46615a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final CyberTournamentBracketMatchStatusModel g;
    public final CyberTournamentBracketMatchLabelPresetParams h;
    public final CyberTournamentBracketMatchLabelPresetParams i;
    public final long j;
    public final String k;
    public final int l;
    public final long m;
    public static final ekh Companion = new ekh();
    public static final Parcelable.Creator<CyberTournamentBracketMatchParams> CREATOR = new h9g((byte) 8);
    public static final a8z[] n = {null, null, null, null, null, null, maz.a(wez.f39042a, new gch(18)), null, null, null, null, null, null};

    public CyberTournamentBracketMatchParams(String str, String str2, String str3, String str4, int i, int i2, CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel, CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams, CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams2, long j, String str5, int i3, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        cyberTournamentBracketMatchStatusModel.getClass();
        cyberTournamentBracketMatchLabelPresetParams.getClass();
        cyberTournamentBracketMatchLabelPresetParams2.getClass();
        str5.getClass();
        this.f46615a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = cyberTournamentBracketMatchStatusModel;
        this.h = cyberTournamentBracketMatchLabelPresetParams;
        this.i = cyberTournamentBracketMatchLabelPresetParams2;
        this.j = j;
        this.k = str5;
        this.l = i3;
        this.m = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberTournamentBracketMatchParams)) {
            return false;
        }
        CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams = (CyberTournamentBracketMatchParams) obj;
        return Intrinsics.d(this.f46615a, cyberTournamentBracketMatchParams.f46615a) && Intrinsics.d(this.b, cyberTournamentBracketMatchParams.b) && Intrinsics.d(this.c, cyberTournamentBracketMatchParams.c) && Intrinsics.d(this.d, cyberTournamentBracketMatchParams.d) && this.e == cyberTournamentBracketMatchParams.e && this.f == cyberTournamentBracketMatchParams.f && this.g == cyberTournamentBracketMatchParams.g && Intrinsics.d(this.h, cyberTournamentBracketMatchParams.h) && Intrinsics.d(this.i, cyberTournamentBracketMatchParams.i) && this.j == cyberTournamentBracketMatchParams.j && Intrinsics.d(this.k, cyberTournamentBracketMatchParams.k) && this.l == cyberTournamentBracketMatchParams.l && this.m == cyberTournamentBracketMatchParams.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + twn.a(this.l, ua80.b(rw2.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f46615a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31)) * 31)) * 31, 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberTournamentBracketMatchParams(firstTeamIcon=", this.f46615a, ", firstTeamName=", this.b, ", secondTeamIcon=");
        f140.v(sbN, this.c, ", secondTeamName=", this.d, ", firstTeamScore=");
        axq.r(this.e, this.f, ", secondTeamScore=", ", gameStatus=", sbN);
        sbN.append(this.g);
        sbN.append(", stage=");
        sbN.append(this.h);
        sbN.append(", date=");
        sbN.append(this.i);
        sbN.append(", matchId=");
        sbN.append(this.j);
        axq.s(this.l, ", buttonText=", this.k, ", globalChampId=", sbN);
        return rw2.n(sbN, this.m, ", subSportId=", Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46615a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.g, i);
        this.h.writeToParcel(parcel, i);
        this.i.writeToParcel(parcel, i);
        parcel.writeLong(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeLong(this.m);
    }

    public /* synthetic */ CyberTournamentBracketMatchParams(int i, String str, String str2, String str3, String str4, int i2, int i3, CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel, CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams, CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams2, long j, String str5, int i4, long j2) {
        if (8191 != (i & 8191)) {
            m2x.I(i, 8191, dkh.f6229a.getDescriptor());
            throw null;
        }
        this.f46615a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = cyberTournamentBracketMatchStatusModel;
        this.h = cyberTournamentBracketMatchLabelPresetParams;
        this.i = cyberTournamentBracketMatchLabelPresetParams2;
        this.j = j;
        this.k = str5;
        this.l = i4;
        this.m = j2;
    }
}
