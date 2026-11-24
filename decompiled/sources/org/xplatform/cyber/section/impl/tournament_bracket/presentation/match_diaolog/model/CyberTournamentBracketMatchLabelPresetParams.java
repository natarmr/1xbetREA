package org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model;

import a.ahi0;
import a.b1j;
import a.h9g;
import a.m2x;
import a.xjh;
import a.yjh;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;", "Landroid/os/Parcelable;", "Companion", "a/xjh", "a/yjh", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberTournamentBracketMatchLabelPresetParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46614a;
    public final String b;
    public static final yjh Companion = new yjh();
    public static final Parcelable.Creator<CyberTournamentBracketMatchLabelPresetParams> CREATOR = new h9g((byte) 7);

    public /* synthetic */ CyberTournamentBracketMatchLabelPresetParams(int i, String str, String str2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, xjh.f40985a.getDescriptor());
            throw null;
        }
        this.f46614a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberTournamentBracketMatchLabelPresetParams)) {
            return false;
        }
        CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams = (CyberTournamentBracketMatchLabelPresetParams) obj;
        return Intrinsics.d(this.f46614a, cyberTournamentBracketMatchLabelPresetParams.f46614a) && Intrinsics.d(this.b, cyberTournamentBracketMatchLabelPresetParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46614a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CyberTournamentBracketMatchLabelPresetParams(label=", this.f46614a, ", valueText=", this.b, Separators.RPAREN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46614a);
        parcel.writeString(this.b);
    }

    public CyberTournamentBracketMatchLabelPresetParams(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f46614a = str;
        this.b = str2;
    }
}
