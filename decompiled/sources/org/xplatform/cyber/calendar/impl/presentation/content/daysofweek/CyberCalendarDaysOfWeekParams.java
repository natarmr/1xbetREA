package org.xplatform.cyber.calendar.impl.presentation.content.daysofweek;

import a.okc;
import a.yag;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CyberCalendarDaysOfWeekParams implements Parcelable {
    public static final Parcelable.Creator<CyberCalendarDaysOfWeekParams> CREATOR = new okc((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yag f46486a;
    public final CyberCalendarPeriodUiModel b;

    public CyberCalendarDaysOfWeekParams(yag yagVar, CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel) {
        yagVar.getClass();
        cyberCalendarPeriodUiModel.getClass();
        this.f46486a = yagVar;
        this.b = cyberCalendarPeriodUiModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyberCalendarDaysOfWeekParams)) {
            return false;
        }
        CyberCalendarDaysOfWeekParams cyberCalendarDaysOfWeekParams = (CyberCalendarDaysOfWeekParams) obj;
        return this.f46486a == cyberCalendarDaysOfWeekParams.f46486a && Intrinsics.d(this.b, cyberCalendarDaysOfWeekParams.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46486a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberCalendarDaysOfWeekParams(segmentType=" + this.f46486a + ", period=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f46486a.name());
        this.b.writeToParcel(parcel, i);
    }
}
