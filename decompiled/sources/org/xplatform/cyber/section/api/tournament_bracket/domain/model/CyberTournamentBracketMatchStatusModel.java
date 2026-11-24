package org.xplatform.cyber.section.api.tournament_bracket.domain.model;

import a.a8z;
import a.ahi0;
import a.gch;
import a.h9g;
import a.lkh;
import a.maz;
import a.wez;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;", "Landroid/os/Parcelable;", "", "Companion", "a/lkh", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberTournamentBracketMatchStatusModel implements Parcelable {
    public static final Parcelable.Creator<CyberTournamentBracketMatchStatusModel> CREATOR;
    public static final lkh Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f46572a;
    public static final CyberTournamentBracketMatchStatusModel b;
    public static final CyberTournamentBracketMatchStatusModel c;
    public static final CyberTournamentBracketMatchStatusModel d;
    public static final /* synthetic */ CyberTournamentBracketMatchStatusModel[] e;

    static {
        CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel = new CyberTournamentBracketMatchStatusModel("LINE", 0);
        b = cyberTournamentBracketMatchStatusModel;
        CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel2 = new CyberTournamentBracketMatchStatusModel("LIVE", 1);
        c = cyberTournamentBracketMatchStatusModel2;
        CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel3 = new CyberTournamentBracketMatchStatusModel("FINISHED", 2);
        d = cyberTournamentBracketMatchStatusModel3;
        e = new CyberTournamentBracketMatchStatusModel[]{cyberTournamentBracketMatchStatusModel, cyberTournamentBracketMatchStatusModel2, cyberTournamentBracketMatchStatusModel3};
        Companion = new lkh();
        CREATOR = new h9g((byte) 9);
        f46572a = maz.a(wez.f39042a, new gch((byte) 19));
    }

    public static CyberTournamentBracketMatchStatusModel valueOf(String str) {
        return (CyberTournamentBracketMatchStatusModel) Enum.valueOf(CyberTournamentBracketMatchStatusModel.class, str);
    }

    public static CyberTournamentBracketMatchStatusModel[] values() {
        return (CyberTournamentBracketMatchStatusModel[]) e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
