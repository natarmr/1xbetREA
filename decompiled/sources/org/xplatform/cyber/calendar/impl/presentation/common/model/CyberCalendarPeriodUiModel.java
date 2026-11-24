package org.xplatform.cyber.calendar.impl.presentation.common.model;

import a.brm0;
import a.h9g;
import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberCalendarPeriodUiModel implements Parcelable {
    public static final Parcelable.Creator<CyberCalendarPeriodUiModel> CREATOR = new h9g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46479a;
    public final long b;

    public CyberCalendarPeriodUiModel(long j, long j2) {
        this.f46479a = j;
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
        if (!(obj instanceof CyberCalendarPeriodUiModel)) {
            return false;
        }
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) obj;
        return this.f46479a == cyberCalendarPeriodUiModel.f46479a && this.b == cyberCalendarPeriodUiModel.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f46479a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f46479a, "CyberCalendarPeriodUiModel(startPeriod=", ", endPeriod="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f46479a);
        parcel.writeLong(this.b);
    }
}
