package com.google.android.gms.common.api;

import a.b1j;
import a.dq00;
import a.erw0;
import a.l8x;
import a.m0g0;
import a.q5x;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements m0g0, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45486a;
    public final String b;
    public final PendingIntent c;
    public final ConnectionResult d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status g = new Status(8, null, null, null);
    public static final Status h = new Status(15, null, null, null);
    public static final Status i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new erw0(1);

    public Status(int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f45486a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = connectionResult;
    }

    @Override // a.m0g0
    public final Status b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f45486a == status.f45486a && l8x.Z(this.b, status.b) && l8x.Z(this.c, status.c) && l8x.Z(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f45486a), this.b, this.c, this.d});
    }

    public final boolean m() {
        return this.f45486a <= 0;
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        String strH = this.b;
        if (strH == null) {
            int i2 = this.f45486a;
            switch (i2) {
                case -1:
                    strH = "SUCCESS_CACHE";
                    break;
                case 0:
                    strH = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strH = b1j.h(i2, "unknown status code: ", new StringBuilder(String.valueOf(i2).length() + 21));
                    break;
                case 2:
                    strH = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strH = "SERVICE_DISABLED";
                    break;
                case 4:
                    strH = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strH = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strH = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strH = "NETWORK_ERROR";
                    break;
                case 8:
                    strH = "INTERNAL_ERROR";
                    break;
                case 10:
                    strH = Payload.RESPONSE_DEVELOPER_ERROR;
                    break;
                case 13:
                    strH = "ERROR";
                    break;
                case 14:
                    strH = "INTERRUPTED";
                    break;
                case 15:
                    strH = Payload.RESPONSE_TIMEOUT;
                    break;
                case 16:
                    strH = "CANCELED";
                    break;
                case 17:
                    strH = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strH = "DEAD_CLIENT";
                    break;
                case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    strH = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strH = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strH = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strH = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        dq00Var.a(strH, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        dq00Var.a(this.c, CommonCode.MapKey.HAS_RESOLUTION);
        return dq00Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45486a);
        q5x.k0(parcel, 2, this.b);
        q5x.j0(parcel, 3, this.c, i2);
        q5x.j0(parcel, 4, this.d, i2);
        q5x.q0(parcel, iP0);
    }
}
