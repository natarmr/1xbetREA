package org.xplatform.feed.notifictation.presentation.models;

import a.brm0;
import a.kng0;
import a.yoo;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GameSubscriptionSettingsScreenUiModel implements Parcelable {
    public static final Parcelable.Creator<GameSubscriptionSettingsScreenUiModel> CREATOR = new yoo((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46678a;
    public final boolean b;
    public final ArrayList c;

    public GameSubscriptionSettingsScreenUiModel(long j, boolean z, ArrayList arrayList) {
        this.f46678a = j;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean a() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = ((PeriodSubscriptionSettingsScreenUiModel) it.next()).b;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (!((SubscriptionEventSettingsUiModel) it2.next()).b) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameSubscriptionSettingsScreenUiModel)) {
            return false;
        }
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel = (GameSubscriptionSettingsScreenUiModel) obj;
        return this.f46678a == gameSubscriptionSettingsScreenUiModel.f46678a && this.b == gameSubscriptionSettingsScreenUiModel.b && this.c.equals(gameSubscriptionSettingsScreenUiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Long.hashCode(this.f46678a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f46678a, "GameSubscriptionSettingsScreenUiModel(gameConstId=", ", isLiveGame=", this.b);
        sbR.append(", periodsSettings=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46678a);
        parcel.writeInt(this.b ? 1 : 0);
        ArrayList arrayList = this.c;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PeriodSubscriptionSettingsScreenUiModel) it.next()).writeToParcel(parcel, i);
        }
    }
}
