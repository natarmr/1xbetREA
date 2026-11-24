package org.xplatform.sportgame.bets_on_players.impl.presentation.model;

import a.brm0;
import a.kng0;
import a.qo7;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChooseSubGameParams implements Parcelable {
    public static final Parcelable.Creator<ChooseSubGameParams> CREATOR = new qo7((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46989a;
    public final long b;

    public ChooseSubGameParams(long j, long j2) {
        this.f46989a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseSubGameParams)) {
            return false;
        }
        ChooseSubGameParams chooseSubGameParams = (ChooseSubGameParams) obj;
        return this.f46989a == chooseSubGameParams.f46989a && this.b == chooseSubGameParams.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f46989a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f46989a, "ChooseSubGameParams(gameId=", ", sportId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46989a);
        parcel.writeLong(this.b);
    }
}
