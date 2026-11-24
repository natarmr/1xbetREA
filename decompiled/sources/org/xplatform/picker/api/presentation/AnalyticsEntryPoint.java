package org.xplatform.picker.api.presentation;

import a.ibw0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;", "Landroid/os/Parcelable;", "", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AnalyticsEntryPoint implements Parcelable {
    public static final Parcelable.Creator<AnalyticsEntryPoint> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AnalyticsEntryPoint f46800a;
    public static final AnalyticsEntryPoint b;
    public static final /* synthetic */ AnalyticsEntryPoint[] c;

    static {
        AnalyticsEntryPoint analyticsEntryPoint = new AnalyticsEntryPoint("CALLBACK", 0);
        f46800a = analyticsEntryPoint;
        AnalyticsEntryPoint analyticsEntryPoint2 = new AnalyticsEntryPoint("UNDEFINED", 1);
        b = analyticsEntryPoint2;
        c = new AnalyticsEntryPoint[]{analyticsEntryPoint, analyticsEntryPoint2};
        CREATOR = new ibw0((byte) 12);
    }

    public static AnalyticsEntryPoint valueOf(String str) {
        return (AnalyticsEntryPoint) Enum.valueOf(AnalyticsEntryPoint.class, str);
    }

    public static AnalyticsEntryPoint[] values() {
        return (AnalyticsEntryPoint[]) c.clone();
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
